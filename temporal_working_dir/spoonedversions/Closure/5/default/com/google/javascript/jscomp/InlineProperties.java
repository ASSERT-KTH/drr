

package com.google.javascript.jscomp;


public class InlineProperties implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	static class PropertyInfo {
		PropertyInfo(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.Node value) {
			this.type = type;
			this.value = value;
		}

		final com.google.javascript.rhino.jstype.JSType type;

		final com.google.javascript.rhino.Node value;
	}

	private static final com.google.javascript.jscomp.InlineProperties.PropertyInfo INVALIDATED = new com.google.javascript.jscomp.InlineProperties.PropertyInfo(null, null);

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.InlineProperties.PropertyInfo> props = com.google.common.collect.Maps.newHashMap();

	private java.util.Set<com.google.javascript.rhino.jstype.JSType> invalidatingTypes;

	InlineProperties(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		buildInvalidatingTypeSet();
	}

	private void buildInvalidatingTypeSet() {
		com.google.javascript.rhino.jstype.JSTypeRegistry registry = compiler.getTypeRegistry();
		invalidatingTypes = com.google.common.collect.Sets.newHashSet(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_OBJECT_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NO_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_FUNCTION_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_PROTOTYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_PROTOTYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_FUNCTION_TYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.TOP_LEVEL_PROTOTYPE), registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE));
		for (com.google.javascript.jscomp.TypeValidator.TypeMismatch mis : compiler.getTypeValidator().getMismatches()) {
			addInvalidatingType(mis.typeA);
			addInvalidatingType(mis.typeB);
		}
	}

	private void addInvalidatingType(com.google.javascript.rhino.jstype.JSType type) {
		type = type.restrictByNotNullOrUndefined();
		if (type.isUnionType()) {
			for (com.google.javascript.rhino.jstype.JSType alt : type.toMaybeUnionType().getAlternates()) {
				addInvalidatingType(alt);
			}
		}
		invalidatingTypes.add(type);
		com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
		if ((objType != null) && (objType.isInstanceType())) {
			invalidatingTypes.add(objType.getImplicitPrototype());
		}
	}

	private boolean isInvalidatingType(com.google.javascript.rhino.jstype.JSType type) {
		if (type.isUnionType()) {
			type = type.restrictByNotNullOrUndefined();
			if (type.isUnionType()) {
				for (com.google.javascript.rhino.jstype.JSType alt : type.toMaybeUnionType().getAlternates()) {
					if (isInvalidatingType(alt)) {
						return true;
					}
				}
				return false;
			}
		}
		com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
		return ((((((objType == null) || (invalidatingTypes.contains(objType))) || (!(objType.hasReferenceName()))) || (objType.isUnknownType())) || (objType.isEmptyType())) || (objType.isEnumType())) || ((objType.autoboxesTo()) != null);
	}

	private com.google.javascript.rhino.jstype.JSType getJSType(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.JSType jsType = n.getJSType();
		if (jsType == null) {
			return compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
		}else {
			return jsType;
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, new com.google.javascript.jscomp.InlineProperties.GatherCandidates(), externs, root);
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, new com.google.javascript.jscomp.InlineProperties.ReplaceCandidates(), externs, root);
	}

	class GatherCandidates extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			boolean invalidatingPropRef = false;
			java.lang.String propName = null;
			if (n.isGetProp()) {
				propName = n.getLastChild().getString();
				if (t.getInput().isExtern()) {
					invalidatingPropRef = true;
				}else
					if (parent.isAssign()) {
						invalidatingPropRef = !(maybeCandidateDefinition(t, n, parent));
					}else
						if (com.google.javascript.jscomp.NodeUtil.isLValue(n)) {
							invalidatingPropRef = true;
						}else
							if (parent.isDelProp()) {
								invalidatingPropRef = true;
							}else {
								invalidatingPropRef = false;
							}
						
					
				
			}else
				if (n.isStringKey()) {
					propName = n.getString();
					if (t.getInput().isExtern()) {
						invalidatingPropRef = true;
					}else {
						invalidatingPropRef = true;
					}
				}
			
			if (invalidatingPropRef) {
				com.google.common.base.Preconditions.checkNotNull(propName);
				invalidateProperty(propName);
			}
		}

		private boolean maybeCandidateDefinition(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.common.base.Preconditions.checkState(((n.isGetProp()) && (parent.isAssign())));
			boolean isCandidate = false;
			com.google.javascript.rhino.Node src = n.getFirstChild();
			java.lang.String propName = n.getLastChild().getString();
			com.google.javascript.rhino.Node value = parent.getLastChild();
			if (src.isThis()) {
				if (inContructor(t)) {
					isCandidate = maybeStoreCandidateValue(getJSType(src), propName, value);
				}
			}else
				if (((t.inGlobalScope()) && (src.isGetProp())) && (src.getLastChild().getString().equals("prototype"))) {
					com.google.javascript.rhino.jstype.JSType instanceType = maybeGetInstanceTypeFromPrototypeRef(src);
					if (instanceType != null) {
						isCandidate = maybeStoreCandidateValue(instanceType, propName, value);
					}
				}
			
			return isCandidate;
		}

		private com.google.javascript.rhino.jstype.JSType maybeGetInstanceTypeFromPrototypeRef(com.google.javascript.rhino.Node src) {
			com.google.javascript.rhino.jstype.JSType ownerType = getJSType(src.getFirstChild());
			if ((ownerType.isFunctionType()) && (ownerType.isConstructor())) {
				com.google.javascript.rhino.jstype.FunctionType functionType = ((com.google.javascript.rhino.jstype.FunctionType) (ownerType));
				return functionType.getInstanceType();
			}
			return null;
		}

		private void invalidateProperty(java.lang.String propName) {
			props.put(propName, com.google.javascript.jscomp.InlineProperties.INVALIDATED);
		}

		private boolean maybeStoreCandidateValue(com.google.javascript.rhino.jstype.JSType type, java.lang.String propName, com.google.javascript.rhino.Node value) {
			com.google.common.base.Preconditions.checkNotNull(value);
			if ((((!(props.containsKey(propName))) && (!(isInvalidatingType(type)))) && (com.google.javascript.jscomp.NodeUtil.isImmutableValue(value))) && (com.google.javascript.jscomp.NodeUtil.isExecutedExactlyOnce(value))) {
				props.put(propName, new com.google.javascript.jscomp.InlineProperties.PropertyInfo(type, value));
				return true;
			}
			return false;
		}

		private boolean inContructor(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.rhino.Node root = t.getScopeRoot();
			com.google.javascript.rhino.JSDocInfo info = com.google.javascript.jscomp.NodeUtil.getBestJSDocInfo(root);
			return (info != null) && (info.isConstructor());
		}
	}

	class ReplaceCandidates extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.isGetProp()) && (!(com.google.javascript.jscomp.NodeUtil.isLValue(n)))) {
				com.google.javascript.rhino.Node target = n.getFirstChild();
				java.lang.String propName = n.getLastChild().getString();
				com.google.javascript.jscomp.InlineProperties.PropertyInfo info = props.get(propName);
				if (((info != null) && (info != (com.google.javascript.jscomp.InlineProperties.INVALIDATED))) && (isMatchingType(target, info.type))) {
					com.google.javascript.rhino.Node replacement = info.value.cloneTree();
					if (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n.getFirstChild(), compiler)) {
						replacement = com.google.javascript.rhino.IR.comma(n.removeFirstChild(), replacement).srcref(n);
					}
					parent.replaceChild(n, replacement);
					compiler.reportCodeChange();
				}
			}
		}

		private boolean isMatchingType(com.google.javascript.rhino.Node n, com.google.javascript.rhino.jstype.JSType src) {
			src = src.restrictByNotNullOrUndefined();
			com.google.javascript.rhino.jstype.JSType dest = getJSType(n).restrictByNotNullOrUndefined();
			if ((!(isInvalidatingType(dest))) && (dest.isSubtype(src))) {
				return true;
			}
			return false;
		}
	}
}

