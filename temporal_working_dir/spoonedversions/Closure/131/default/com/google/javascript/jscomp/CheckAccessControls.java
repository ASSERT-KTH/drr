

package com.google.javascript.jscomp;


class CheckAccessControls implements com.google.javascript.jscomp.HotSwapCompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	static final com.google.javascript.jscomp.DiagnosticType DEPRECATED_NAME = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_DEPRECATED_VAR", "Variable {0} has been deprecated.");

	static final com.google.javascript.jscomp.DiagnosticType DEPRECATED_NAME_REASON = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_DEPRECATED_VAR_REASON", "Variable {0} has been deprecated: {1}");

	static final com.google.javascript.jscomp.DiagnosticType DEPRECATED_PROP = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_DEPRECATED_PROP", "Property {0} of type {1} has been deprecated.");

	static final com.google.javascript.jscomp.DiagnosticType DEPRECATED_PROP_REASON = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_DEPRECATED_PROP_REASON", "Property {0} of type {1} has been deprecated: {2}");

	static final com.google.javascript.jscomp.DiagnosticType DEPRECATED_CLASS = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_DEPRECATED_CLASS", "Class {0} has been deprecated.");

	static final com.google.javascript.jscomp.DiagnosticType DEPRECATED_CLASS_REASON = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_DEPRECATED_CLASS_REASON", "Class {0} has been deprecated: {1}");

	static final com.google.javascript.jscomp.DiagnosticType BAD_PRIVATE_GLOBAL_ACCESS = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_BAD_PRIVATE_GLOBAL_ACCESS", "Access to private variable {0} not allowed outside file {1}.");

	static final com.google.javascript.jscomp.DiagnosticType BAD_PRIVATE_PROPERTY_ACCESS = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_BAD_PRIVATE_PROPERTY_ACCESS", "Access to private property {0} of {1} not allowed here.");

	static final com.google.javascript.jscomp.DiagnosticType BAD_PROTECTED_PROPERTY_ACCESS = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_BAD_PROTECTED_PROPERTY_ACCESS", "Access to protected property {0} of {1} not allowed here.");

	static final com.google.javascript.jscomp.DiagnosticType PRIVATE_OVERRIDE = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_PRIVATE_OVERRIDE", "Overriding private property of {0}.");

	static final com.google.javascript.jscomp.DiagnosticType EXTEND_FINAL_CLASS = com.google.javascript.jscomp.DiagnosticType.error("JSC_EXTEND_FINAL_CLASS", "{0} is not allowed to extend final class {1}.");

	static final com.google.javascript.jscomp.DiagnosticType VISIBILITY_MISMATCH = com.google.javascript.jscomp.DiagnosticType.disabled("JSC_VISIBILITY_MISMATCH", "Overriding {0} property of {1} with {2} property.");

	static final com.google.javascript.jscomp.DiagnosticType CONST_PROPERTY_REASSIGNED_VALUE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_CONSTANT_PROPERTY_REASSIGNED_VALUE", "constant property {0} assigned a value more than once");

	static final com.google.javascript.jscomp.DiagnosticType CONST_PROPERTY_DELETED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_CONSTANT_PROPERTY_DELETED", "constant property {0} cannot be deleted");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.TypeValidator validator;

	private int deprecatedDepth = 0;

	private int methodDepth = 0;

	private com.google.javascript.rhino.jstype.JSType currentClass = null;

	private final com.google.common.collect.Multimap<java.lang.String, java.lang.String> initializedConstantProperties;

	CheckAccessControls(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.validator = compiler.getTypeValidator();
		this.initializedConstantProperties = com.google.common.collect.HashMultimap.create();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CheckAccessControls.this);
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot, com.google.javascript.rhino.Node originalRoot) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, scriptRoot, com.google.javascript.jscomp.CheckAccessControls.this);
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		if (!(t.inGlobalScope())) {
			com.google.javascript.rhino.Node n = t.getScopeRoot();
			com.google.javascript.rhino.Node parent = n.getParent();
			if (com.google.javascript.jscomp.CheckAccessControls.isDeprecatedFunction(n)) {
				(deprecatedDepth)++;
			}
			if ((methodDepth) == 0) {
				currentClass = getClassOfMethod(n, parent);
			}
			(methodDepth)++;
		}
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		if (!(t.inGlobalScope())) {
			com.google.javascript.rhino.Node n = t.getScopeRoot();
			if (com.google.javascript.jscomp.CheckAccessControls.isDeprecatedFunction(n)) {
				(deprecatedDepth)--;
			}
			(methodDepth)--;
			if ((methodDepth) == 0) {
				currentClass = null;
			}
		}
	}

	private com.google.javascript.rhino.jstype.JSType getClassOfMethod(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (parent.isAssign()) {
			com.google.javascript.rhino.Node lValue = parent.getFirstChild();
			if (com.google.javascript.jscomp.NodeUtil.isGet(lValue)) {
				com.google.javascript.rhino.jstype.JSType lValueType = lValue.getJSType();
				if ((lValueType != null) && (lValueType.isNominalConstructor())) {
					return lValueType.toMaybeFunctionType().getInstanceType();
				}else {
					return normalizeClassType(lValue.getFirstChild().getJSType());
				}
			}else {
				return normalizeClassType(lValue.getJSType());
			}
		}else
			if ((com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) || (parent.isName())) {
				return normalizeClassType(n.getJSType());
			}
		
		return null;
	}

	private com.google.javascript.rhino.jstype.JSType normalizeClassType(com.google.javascript.rhino.jstype.JSType type) {
		if ((type == null) || (type.isUnknownType())) {
			return type;
		}else
			if (type.isNominalConstructor()) {
				return type.toMaybeFunctionType().getInstanceType();
			}else
				if (type.isFunctionPrototypeType()) {
					com.google.javascript.rhino.jstype.FunctionType owner = ((com.google.javascript.rhino.jstype.ObjectType) (type)).getOwnerFunction();
					if (owner.isConstructor()) {
						return owner.getInstanceType();
					}
				}
			
		
		return type;
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				checkNameDeprecation(t, n, parent);
				checkNameVisibility(t, n, parent);
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				checkPropertyDeprecation(t, n, parent);
				checkPropertyVisibility(t, n, parent);
				checkConstantProperty(t, n);
				break;
			case com.google.javascript.rhino.Token.NEW :
				checkConstructorDeprecation(t, n, parent);
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				checkFinalClassOverrides(t, n, parent);
				break;
		}
	}

	private void checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.jstype.JSType type = n.getJSType();
		if (type != null) {
			java.lang.String deprecationInfo = com.google.javascript.jscomp.CheckAccessControls.getTypeDeprecationInfo(type);
			if ((deprecationInfo != null) && (shouldEmitDeprecationWarning(t, n, parent))) {
				if (!(deprecationInfo.isEmpty())) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_CLASS_REASON, type.toString(), deprecationInfo));
				}else {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_CLASS, type.toString()));
				}
			}
		}
	}

	private void checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (((parent.isFunction()) || (parent.isVar())) || (parent.isNew())) {
			return ;
		}
		com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(n.getString());
		com.google.javascript.rhino.JSDocInfo docInfo = var == null ? null : var.getJSDocInfo();
		if (((docInfo != null) && (docInfo.isDeprecated())) && (shouldEmitDeprecationWarning(t, n, parent))) {
			if ((docInfo.getDeprecationReason()) != null) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_NAME_REASON, n.getString(), docInfo.getDeprecationReason()));
			}else {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_NAME, n.getString()));
			}
		}
	}

	private void checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (parent.isNew()) {
			return ;
		}
		com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(com.google.javascript.jscomp.CheckAccessControls.dereference(n.getFirstChild().getJSType()));
		java.lang.String propertyName = n.getLastChild().getString();
		if (objectType != null) {
			java.lang.String deprecationInfo = com.google.javascript.jscomp.CheckAccessControls.getPropertyDeprecationInfo(objectType, propertyName);
			if ((deprecationInfo != null) && (shouldEmitDeprecationWarning(t, n, parent))) {
				if (!(deprecationInfo.isEmpty())) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_PROP_REASON, propertyName, validator.getReadableJSTypeName(n.getFirstChild(), true), deprecationInfo));
				}else {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.CheckAccessControls.DEPRECATED_PROP, propertyName, validator.getReadableJSTypeName(n.getFirstChild(), true)));
				}
			}
		}
	}

	private void checkNameVisibility(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node parent) {
		com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name.getString());
		if (var != null) {
			com.google.javascript.rhino.JSDocInfo docInfo = var.getJSDocInfo();
			if (docInfo != null) {
				com.google.javascript.rhino.JSDocInfo.Visibility visibility = docInfo.getVisibility();
				if (visibility == (com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE)) {
					com.google.javascript.rhino.jstype.StaticSourceFile varSrc = var.getSourceFile();
					com.google.javascript.rhino.jstype.StaticSourceFile refSrc = name.getStaticSourceFile();
					if (((varSrc != null) && (refSrc != null)) && (!(varSrc.getName().equals(refSrc.getName())))) {
						if ((docInfo.isConstructor()) && (com.google.javascript.jscomp.CheckAccessControls.isValidPrivateConstructorAccess(parent))) {
							return ;
						}
						compiler.report(t.makeError(name, com.google.javascript.jscomp.CheckAccessControls.BAD_PRIVATE_GLOBAL_ACCESS, name.getString(), varSrc.getName()));
					}
				}
			}
		}
	}

	private void checkFinalClassOverrides(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node fn, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.jstype.JSType type = fn.getJSType().toMaybeFunctionType();
		if ((type != null) && (type.isConstructor())) {
			com.google.javascript.rhino.jstype.JSType finalParentClass = getFinalParentClass(getClassOfMethod(fn, parent));
			if (finalParentClass != null) {
				compiler.report(t.makeError(fn, com.google.javascript.jscomp.CheckAccessControls.EXTEND_FINAL_CLASS, type.getDisplayName(), finalParentClass.getDisplayName()));
			}
		}
	}

	private void checkConstantProperty(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node getprop) {
		com.google.javascript.rhino.Node parent = getprop.getParent();
		boolean isDelete = parent.isDelProp();
		if ((((!((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && ((parent.getFirstChild()) == getprop))) && (!(parent.isInc()))) && (!(parent.isDec()))) && (!isDelete)) {
			return ;
		}
		com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(com.google.javascript.jscomp.CheckAccessControls.dereference(getprop.getFirstChild().getJSType()));
		java.lang.String propertyName = getprop.getLastChild().getString();
		boolean isConstant = com.google.javascript.jscomp.CheckAccessControls.isPropertyDeclaredConstant(objectType, propertyName);
		if (isConstant) {
			if (isDelete) {
				compiler.report(t.makeError(getprop, com.google.javascript.jscomp.CheckAccessControls.CONST_PROPERTY_DELETED, propertyName));
				return ;
			}
			com.google.javascript.rhino.jstype.ObjectType oType = objectType;
			while (oType != null) {
				if (oType.hasReferenceName()) {
					if (initializedConstantProperties.containsEntry(oType.getReferenceName(), propertyName)) {
						compiler.report(t.makeError(getprop, com.google.javascript.jscomp.CheckAccessControls.CONST_PROPERTY_REASSIGNED_VALUE, propertyName));
						break;
					}
				}
				oType = oType.getImplicitPrototype();
			} 
			com.google.common.base.Preconditions.checkState(objectType.hasReferenceName());
			initializedConstantProperties.put(objectType.getReferenceName(), propertyName);
			if (objectType.isInstanceType()) {
				com.google.javascript.rhino.jstype.ObjectType prototype = objectType.getImplicitPrototype();
				if (prototype != null) {
					if ((prototype.hasProperty(propertyName)) && (prototype.hasReferenceName())) {
						initializedConstantProperties.put(prototype.getReferenceName(), propertyName);
					}
				}
			}
		}
	}

	private void checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node getprop, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.jstype.ObjectType objectType = com.google.javascript.rhino.jstype.ObjectType.cast(com.google.javascript.jscomp.CheckAccessControls.dereference(getprop.getFirstChild().getJSType()));
		java.lang.String propertyName = getprop.getLastChild().getString();
		if (objectType != null) {
			boolean isOverride = (((parent.getJSDocInfo()) != null) && (parent.isAssign())) && ((parent.getFirstChild()) == getprop);
			if (isOverride) {
				objectType = objectType.getImplicitPrototype();
			}
			com.google.javascript.rhino.JSDocInfo docInfo = null;
			for (; objectType != null; objectType = objectType.getImplicitPrototype()) {
				docInfo = objectType.getOwnPropertyJSDocInfo(propertyName);
				if ((docInfo != null) && ((docInfo.getVisibility()) != (com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED))) {
					break;
				}
			}
			if (objectType == null) {
				return ;
			}
			java.lang.String referenceSource = getprop.getSourceFileName();
			java.lang.String definingSource = docInfo.getSourceName();
			boolean sameInput = (referenceSource != null) && (referenceSource.equals(definingSource));
			com.google.javascript.rhino.JSDocInfo.Visibility visibility = docInfo.getVisibility();
			com.google.javascript.rhino.jstype.JSType ownerType = normalizeClassType(objectType);
			if (isOverride) {
				com.google.javascript.rhino.JSDocInfo overridingInfo = parent.getJSDocInfo();
				com.google.javascript.rhino.JSDocInfo.Visibility overridingVisibility = overridingInfo == null ? com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED : overridingInfo.getVisibility();
				if ((visibility == (com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE)) && (!sameInput)) {
					compiler.report(t.makeError(getprop, com.google.javascript.jscomp.CheckAccessControls.PRIVATE_OVERRIDE, objectType.toString()));
				}else
					if ((overridingVisibility != (com.google.javascript.rhino.JSDocInfo.Visibility.INHERITED)) && (overridingVisibility != visibility)) {
						compiler.report(t.makeError(getprop, com.google.javascript.jscomp.CheckAccessControls.VISIBILITY_MISMATCH, visibility.name(), objectType.toString(), overridingVisibility.name()));
					}
				
			}else {
				if (sameInput) {
					return ;
				}else
					if ((visibility == (com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE)) && (((currentClass) == null) || (!(ownerType.isEquivalentTo(currentClass))))) {
						if ((docInfo.isConstructor()) && (com.google.javascript.jscomp.CheckAccessControls.isValidPrivateConstructorAccess(parent))) {
							return ;
						}
						compiler.report(t.makeError(getprop, com.google.javascript.jscomp.CheckAccessControls.BAD_PRIVATE_PROPERTY_ACCESS, propertyName, validator.getReadableJSTypeName(getprop.getFirstChild(), true)));
					}else
						if (visibility == (com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED)) {
							if (((currentClass) == null) || (!(currentClass.isSubtype(ownerType)))) {
								compiler.report(t.makeError(getprop, com.google.javascript.jscomp.CheckAccessControls.BAD_PROTECTED_PROPERTY_ACCESS, propertyName, validator.getReadableJSTypeName(getprop.getFirstChild(), true)));
							}
						}
					
				
			}
		}
	}

	private static boolean isValidPrivateConstructorAccess(com.google.javascript.rhino.Node parent) {
		return !(parent.isNew());
	}

	private boolean shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (t.inGlobalScope()) {
			if (!(((parent.isCall()) && ((parent.getFirstChild()) == n)) || (n.isNew()))) {
				return false;
			}
		}
		if (((n.isGetProp()) && (n == (parent.getFirstChild()))) && (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent))) {
			return false;
		}
		return !(canAccessDeprecatedTypes(t));
	}

	private boolean canAccessDeprecatedTypes(com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.rhino.Node scopeRoot = t.getScopeRoot();
		com.google.javascript.rhino.Node scopeRootParent = scopeRoot.getParent();
		return (((deprecatedDepth) > 0) || ((com.google.javascript.jscomp.CheckAccessControls.getTypeDeprecationInfo(t.getScope().getTypeOfThis())) != null)) || (((scopeRootParent != null) && (scopeRootParent.isAssign())) && ((com.google.javascript.jscomp.CheckAccessControls.getTypeDeprecationInfo(getClassOfMethod(scopeRoot, scopeRootParent))) != null));
	}

	private static boolean isDeprecatedFunction(com.google.javascript.rhino.Node n) {
		if (n.isFunction()) {
			com.google.javascript.rhino.jstype.JSType type = n.getJSType();
			if (type != null) {
				return (com.google.javascript.jscomp.CheckAccessControls.getTypeDeprecationInfo(type)) != null;
			}
		}
		return false;
	}

	private static java.lang.String getTypeDeprecationInfo(com.google.javascript.rhino.jstype.JSType type) {
		if (type == null) {
			return null;
		}
		com.google.javascript.rhino.JSDocInfo info = type.getJSDocInfo();
		if ((info != null) && (info.isDeprecated())) {
			if ((info.getDeprecationReason()) != null) {
				return info.getDeprecationReason();
			}
			return "";
		}
		com.google.javascript.rhino.jstype.ObjectType objType = com.google.javascript.rhino.jstype.ObjectType.cast(type);
		if (objType != null) {
			com.google.javascript.rhino.jstype.ObjectType implicitProto = objType.getImplicitPrototype();
			if (implicitProto != null) {
				return com.google.javascript.jscomp.CheckAccessControls.getTypeDeprecationInfo(implicitProto);
			}
		}
		return null;
	}

	private static boolean isPropertyDeclaredConstant(com.google.javascript.rhino.jstype.ObjectType objectType, java.lang.String prop) {
		for (; (objectType != null) && (objectType.hasReferenceName()); objectType = objectType.getImplicitPrototype()) {
			com.google.javascript.rhino.JSDocInfo docInfo = objectType.getOwnPropertyJSDocInfo(prop);
			if ((docInfo != null) && (docInfo.isConstant())) {
				return true;
			}
		}
		return false;
	}

	private static java.lang.String getPropertyDeprecationInfo(com.google.javascript.rhino.jstype.ObjectType type, java.lang.String prop) {
		com.google.javascript.rhino.JSDocInfo info = type.getOwnPropertyJSDocInfo(prop);
		if ((info != null) && (info.isDeprecated())) {
			if ((info.getDeprecationReason()) != null) {
				return info.getDeprecationReason();
			}
			return "";
		}
		com.google.javascript.rhino.jstype.ObjectType implicitProto = type.getImplicitPrototype();
		if (implicitProto != null) {
			return com.google.javascript.jscomp.CheckAccessControls.getPropertyDeprecationInfo(implicitProto, prop);
		}
		return null;
	}

	private static com.google.javascript.rhino.jstype.JSType dereference(com.google.javascript.rhino.jstype.JSType type) {
		return type == null ? null : type.dereference();
	}

	private com.google.javascript.rhino.jstype.JSType getFinalParentClass(com.google.javascript.rhino.jstype.JSType type) {
		if (type != null) {
			com.google.javascript.rhino.jstype.ObjectType iproto = com.google.javascript.rhino.jstype.ObjectType.cast(type).getImplicitPrototype();
			while ((iproto != null) && ((iproto.getConstructor()) == null)) {
				iproto = iproto.getImplicitPrototype();
			} 
			if (iproto != null) {
				com.google.javascript.rhino.Node source = iproto.getConstructor().getSource();
				com.google.javascript.rhino.JSDocInfo jsDoc = source != null ? com.google.javascript.jscomp.NodeUtil.getBestJSDocInfo(source) : null;
				if ((jsDoc != null) && (jsDoc.isConstant())) {
					return iproto;
				}
			}
		}
		return null;
	}
}

