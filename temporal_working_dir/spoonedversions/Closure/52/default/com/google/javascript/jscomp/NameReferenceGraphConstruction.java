

package com.google.javascript.jscomp;


class NameReferenceGraphConstruction implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.NameReferenceGraph graph;

	private final com.google.common.collect.Multimap<java.lang.String, com.google.javascript.jscomp.NameReferenceGraphConstruction.NameUse> unknownNameUse = com.google.common.collect.HashMultimap.create();

	private static final boolean CONSERVATIVE = false;

	private final java.util.ArrayList<com.google.javascript.jscomp.NameReferenceGraph.Name> currentFunctionStack = new java.util.ArrayList<com.google.javascript.jscomp.NameReferenceGraph.Name>();

	NameReferenceGraphConstruction(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.graph = new com.google.javascript.jscomp.NameReferenceGraph(compiler);
	}

	com.google.javascript.jscomp.NameReferenceGraph getNameReferenceGraph() {
		return com.google.javascript.jscomp.NameReferenceGraphConstruction.this.graph;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ScopeCreator scopeCreator = compiler.getTypedScopeCreator();
		if (scopeCreator == null) {
			scopeCreator = new com.google.javascript.jscomp.MemoizedScopeCreator(new com.google.javascript.jscomp.TypedScopeCreator(compiler));
		}
		com.google.javascript.jscomp.NodeTraversal externsTraversal = new com.google.javascript.jscomp.NodeTraversal(compiler, new com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal(true), scopeCreator);
		com.google.javascript.jscomp.NodeTraversal codeTraversal = new com.google.javascript.jscomp.NodeTraversal(compiler, new com.google.javascript.jscomp.NameReferenceGraphConstruction.Traversal(false), scopeCreator);
		com.google.javascript.jscomp.Scope topScope = compiler.getTopScope();
		if (topScope != null) {
			externsTraversal.traverseWithScope(externs, topScope);
			codeTraversal.traverseWithScope(root, topScope);
		}else {
			externsTraversal.traverse(externs);
			codeTraversal.traverse(root);
		}
		connectUnknowns();
	}

	private class Traversal implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		final boolean isExtern;

		private Traversal(boolean isExtern) {
			this.isExtern = isExtern;
			pushContainingFunction(graph.MAIN);
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			com.google.javascript.rhino.Node root = t.getScopeRoot();
			com.google.javascript.rhino.Node parent = root.getParent();
			if (!(t.inGlobalScope())) {
				java.lang.String name = com.google.javascript.jscomp.NodeUtil.getFunctionName(root);
				if (name == null) {
					pushContainingFunction(graph.UNKNOWN);
					return ;
				}
				com.google.javascript.rhino.jstype.JSType type = getType(root);
				com.google.javascript.rhino.Node gParent = parent.getParent();
				com.google.javascript.rhino.Node ggParent = gParent.getParent();
				if ((com.google.javascript.jscomp.NodeUtil.isAssign(parent)) && (com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(parent.getFirstChild()))) {
					pushContainingFunction(recordPrototypePropDefinition(t, parent.getFirstChild(), type, parent, gParent, ggParent));
				}else {
					pushContainingFunction(recordStaticNameDefinition(t, name, type, root, parent, gParent, root.getLastChild()));
				}
			}
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
			if (!(t.inGlobalScope())) {
				popContainingFunction();
			}
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return true;
		}

		@java.lang.SuppressWarnings(value = "fallthrough")
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.NAME :
				case com.google.javascript.rhino.Token.GETPROP :
					if ((com.google.javascript.jscomp.NodeUtil.isGetProp(parent)) || ((parent.getType()) == (com.google.javascript.rhino.Token.REF_SPECIAL))) {
						return ;
					}else
						if (com.google.javascript.jscomp.NodeUtil.isFunction(parent)) {
							return ;
						}else
							if (com.google.javascript.jscomp.NodeUtil.isAssign(parent)) {
								return ;
							}
						
					
					if (isLocalNameReference(t, n)) {
						return ;
					}
					if (isPrototypeNameReference(n)) {
						recordPrototypePropUse(t, n, parent);
					}else
						if (isStaticNameReference(n, t.getScope())) {
							recordStaticNameUse(t, n, parent);
						}else {
							recordUnknownUse(t, n, parent);
						}
					
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					com.google.javascript.rhino.Node rhs = n.getLastChild();
					if (com.google.javascript.jscomp.NodeUtil.isFunction(rhs)) {
						return ;
					}
					if (((com.google.javascript.jscomp.NodeUtil.isName(lhs)) || (com.google.javascript.jscomp.NodeUtil.isGetProp(lhs))) || (com.google.javascript.jscomp.NodeUtil.isGetProp(rhs))) {
						if (com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(lhs)) {
							com.google.javascript.jscomp.NameReferenceGraph.Name name = recordPrototypePropDefinition(t, lhs, getType(rhs), n, parent, parent.getParent());
							name.setAliased(true);
						}
					}
					maybeAliasNamesOnAssign(lhs, rhs);
					break;
				case com.google.javascript.rhino.Token.VAR :
					com.google.javascript.rhino.Node varName = n.getFirstChild();
					com.google.javascript.rhino.Node assignedValue = varName.getFirstChild();
					if (assignedValue == null) {
						return ;
					}
					maybeAliasNamesOnAssign(varName, assignedValue);
					break;
				case com.google.javascript.rhino.Token.CALL :
					com.google.javascript.rhino.Node param = n.getFirstChild();
					while ((param = param.getNext()) != null) {
						if ((com.google.javascript.jscomp.NodeUtil.isName(param)) || (com.google.javascript.jscomp.NodeUtil.isGetProp(param))) {
							safeAlias(param);
						}
					} 
					maybeRecordExport(n);
					break;
			}
		}

		private boolean containsName(com.google.javascript.rhino.Node n) {
			return ((com.google.javascript.jscomp.NodeUtil.containsType(n, com.google.javascript.rhino.Token.NAME)) || (com.google.javascript.jscomp.NodeUtil.containsType(n, com.google.javascript.rhino.Token.GETELEM))) || (com.google.javascript.jscomp.NodeUtil.containsType(n, com.google.javascript.rhino.Token.GETPROP));
		}

		private void safeAlias(com.google.javascript.rhino.Node n) {
			if ((com.google.javascript.jscomp.NodeUtil.isName(n)) || (com.google.javascript.jscomp.NodeUtil.isGetProp(n))) {
				java.lang.String name = n.getQualifiedName();
				if (name != null) {
					defineAndAlias(name);
					return ;
				}
			}
			if (com.google.javascript.jscomp.NodeUtil.isGetProp(n)) {
				defineAndAlias(n.getLastChild().getString());
			}else
				if (com.google.javascript.jscomp.NodeUtil.isAssign(n)) {
					safeAlias(n.getFirstChild());
				}else
					if (n.hasChildren()) {
						com.google.javascript.rhino.Node cur = n.getFirstChild();
						do {
							safeAlias(cur);
						} while ((cur = cur.getNext()) != null );
					}else {
					}
				
			
		}

		private void maybeAliasNamesOnAssign(com.google.javascript.rhino.Node lhs, com.google.javascript.rhino.Node rhs) {
			if (((((com.google.javascript.jscomp.NodeUtil.isName(lhs)) || (com.google.javascript.jscomp.NodeUtil.isGetProp(lhs))) && (containsName(rhs))) && (!(com.google.javascript.jscomp.NodeUtil.isFunction(rhs)))) && (!(com.google.javascript.jscomp.NodeUtil.isNew(rhs)))) {
				safeAlias(lhs);
				safeAlias(rhs);
			}
		}

		private void defineAndAlias(java.lang.String name) {
			graph.defineNameIfNotExists(name, isExtern).setAliased(true);
		}

		private void maybeRecordExport(com.google.javascript.rhino.Node call) {
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isCall(call));
			com.google.javascript.rhino.Node getProp = call.getFirstChild();
			if (!(com.google.javascript.jscomp.NodeUtil.isGetProp(getProp))) {
				return ;
			}
			java.lang.String propQName = getProp.getQualifiedName();
			if (propQName == null) {
				return ;
			}
			if ((propQName.endsWith(".call")) || (propQName.endsWith(".apply"))) {
				graph.defineNameIfNotExists(getProp.getFirstChild().getQualifiedName(), isExtern).markExposedToCallOrApply();
			}
			if (!("goog.exportSymbol".equals(propQName))) {
				return ;
			}
			com.google.javascript.rhino.Node symbol = getProp.getNext();
			if (!(com.google.javascript.jscomp.NodeUtil.isString(symbol))) {
				return ;
			}
			com.google.javascript.rhino.Node obj = symbol.getNext();
			java.lang.String qName = obj.getQualifiedName();
			if ((qName == null) || ((obj.getNext()) != null)) {
				return ;
			}
			graph.defineNameIfNotExists(qName, false).markExported();
		}

		private boolean isLocalNameReference(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			if (com.google.javascript.jscomp.NodeUtil.isName(n)) {
				com.google.javascript.jscomp.Scope.Var v = t.getScope().getVar(n.getString());
				return (v != null) && (v.isLocal());
			}
			return false;
		}

		private boolean isStaticNameReference(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope scope) {
			com.google.common.base.Preconditions.checkArgument(((com.google.javascript.jscomp.NodeUtil.isName(n)) || (com.google.javascript.jscomp.NodeUtil.isGetProp(n))));
			if (com.google.javascript.jscomp.NodeUtil.isName(n)) {
				return true;
			}
			java.lang.String qName = n.getQualifiedName();
			if (qName == null) {
				return false;
			}
			return scope.isDeclared(qName, true);
		}

		private boolean isPrototypeNameReference(com.google.javascript.rhino.Node n) {
			if (!(com.google.javascript.jscomp.NodeUtil.isGetProp(n))) {
				return false;
			}
			com.google.javascript.rhino.jstype.JSType type = getType(n.getFirstChild());
			if ((type.isUnknownType()) || (type.isUnionType())) {
				return false;
			}
			return (type.isInstanceType()) || ((type.autoboxesTo()) != null);
		}

		private com.google.javascript.jscomp.NameReferenceGraph.Name recordStaticNameDefinition(com.google.javascript.jscomp.NodeTraversal t, java.lang.String name, com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gParent, com.google.javascript.rhino.Node rValue) {
			if ((getNamedContainingFunction()) != (graph.MAIN)) {
			}
			if (type.isConstructor()) {
				return recordClassConstructorOrInterface(name, type.toMaybeFunctionType(), n, parent, parent.getParent(), rValue);
			}else {
				com.google.javascript.jscomp.NameReferenceGraph.Name symbol = graph.defineNameIfNotExists(name, isExtern);
				symbol.setType(type);
				if (com.google.javascript.jscomp.NodeUtil.isAssign(n)) {
					symbol.addAssignmentDeclaration(n);
				}else {
					symbol.addFunctionDeclaration(n);
				}
				return symbol;
			}
		}

		private com.google.javascript.jscomp.NameReferenceGraph.Name recordPrototypePropDefinition(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node qName, com.google.javascript.rhino.jstype.JSType type, @javax.annotation.Nullable
		com.google.javascript.rhino.Node assign, @javax.annotation.Nullable
		com.google.javascript.rhino.Node parent, @javax.annotation.Nullable
		com.google.javascript.rhino.Node gParent) {
			com.google.javascript.rhino.jstype.JSType constructor = getType(com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(qName));
			com.google.javascript.rhino.jstype.FunctionType classType = null;
			java.lang.String className = null;
			if ((constructor != null) && (constructor.isConstructor())) {
				classType = constructor.toMaybeFunctionType();
				className = classType.getReferenceName();
			}else {
				classType = compiler.getTypeRegistry().getNativeFunctionType(com.google.javascript.rhino.jstype.JSTypeNative.U2U_CONSTRUCTOR_TYPE);
				className = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(qName).getQualifiedName();
			}
			recordClassConstructorOrInterface(className, classType, null, null, null, null);
			java.lang.String qNameStr = (className + ".prototype.") + (com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(qName));
			com.google.javascript.jscomp.NameReferenceGraph.Name prototypeProp = graph.defineNameIfNotExists(qNameStr, isExtern);
			com.google.common.base.Preconditions.checkNotNull(prototypeProp, (qNameStr + " should be in the name graph as a node."));
			if (assign != null) {
				prototypeProp.addAssignmentDeclaration(assign);
			}
			prototypeProp.setType(type);
			return prototypeProp;
		}

		private com.google.javascript.jscomp.NameReferenceGraph.Reference recordStaticNameUse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (isExtern) {
				return null;
			}else {
				com.google.javascript.jscomp.NameReferenceGraph.Reference reference = new com.google.javascript.jscomp.NameReferenceGraph.Reference(n, parent);
				com.google.javascript.jscomp.NameReferenceGraph.Name name = graph.defineNameIfNotExists(n.getQualifiedName(), isExtern);
				name.setType(getType(n));
				graph.connect(getNamedContainingFunction(), reference, name);
				return reference;
			}
		}

		private void recordPrototypePropUse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isGetProp(n));
			com.google.javascript.rhino.Node instance = n.getFirstChild();
			com.google.javascript.rhino.jstype.JSType instanceType = getType(instance);
			com.google.javascript.rhino.jstype.JSType boxedType = instanceType.autoboxesTo();
			instanceType = (boxedType != null) ? boxedType : instanceType;
			com.google.javascript.rhino.jstype.ObjectType objType = instanceType.toObjectType();
			com.google.common.base.Preconditions.checkState((objType != null));
			if (!(isExtern)) {
				com.google.javascript.jscomp.NameReferenceGraph.Reference ref = new com.google.javascript.jscomp.NameReferenceGraph.Reference(n, parent);
				com.google.javascript.rhino.jstype.FunctionType constructor = objType.getConstructor();
				if (constructor != null) {
					java.lang.String propName = n.getLastChild().getString();
					if (!(constructor.getPrototype().hasOwnProperty(propName))) {
						recordSuperClassPrototypePropUse(constructor, propName, ref);
					}
					recordSubclassPrototypePropUse(constructor, propName, ref);
				}else {
					recordUnknownUse(t, n, parent);
				}
			}
		}

		private void recordSuperClassPrototypePropUse(com.google.javascript.rhino.jstype.FunctionType classType, java.lang.String prop, com.google.javascript.jscomp.NameReferenceGraph.Reference ref) {
			com.google.javascript.rhino.jstype.FunctionType superClass = classType.getSuperClassConstructor();
			while (superClass != null) {
				if (superClass.getPrototype().hasOwnProperty(prop)) {
					graph.connect(getNamedContainingFunction(), ref, graph.defineNameIfNotExists((((superClass.getReferenceName()) + ".prototype.") + prop), false));
					return ;
				}else {
					superClass = superClass.getSuperClassConstructor();
				}
			} 
		}

		private void recordSubclassPrototypePropUse(com.google.javascript.rhino.jstype.FunctionType classType, java.lang.String prop, com.google.javascript.jscomp.NameReferenceGraph.Reference ref) {
			if (classType.getPrototype().hasOwnProperty(prop)) {
				graph.connect(getNamedContainingFunction(), ref, graph.defineNameIfNotExists((((classType.getReferenceName()) + ".prototype.") + prop), false));
			}
			if ((classType.getSubTypes()) != null) {
				for (com.google.javascript.rhino.jstype.FunctionType subclass : classType.getSubTypes()) {
					recordSubclassPrototypePropUse(subclass, prop, ref);
				}
			}
		}

		private void recordUnknownUse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (isExtern) {
				return ;
			}else {
				com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isGetProp(n));
				com.google.javascript.jscomp.NameReferenceGraph.Reference ref = new com.google.javascript.jscomp.NameReferenceGraph.Reference(n, parent);
				ref.setUnknown(true);
				unknownNameUse.put(n.getLastChild().getString(), new com.google.javascript.jscomp.NameReferenceGraphConstruction.NameUse(getNamedContainingFunction(), ref));
			}
		}

		private com.google.javascript.jscomp.NameReferenceGraph.Name recordClassConstructorOrInterface(java.lang.String name, com.google.javascript.rhino.jstype.FunctionType type, @javax.annotation.Nullable
		com.google.javascript.rhino.Node n, @javax.annotation.Nullable
		com.google.javascript.rhino.Node parent, @javax.annotation.Nullable
		com.google.javascript.rhino.Node gParent, @javax.annotation.Nullable
		com.google.javascript.rhino.Node rhs) {
			com.google.common.base.Preconditions.checkArgument(((type.isConstructor()) || (type.isInterface())));
			com.google.javascript.jscomp.NameReferenceGraph.Name symbol = graph.defineNameIfNotExists(name, isExtern);
			if (rhs != null) {
				symbol.setType(getType(rhs));
				if (com.google.javascript.jscomp.NodeUtil.isAssign(n)) {
					symbol.addAssignmentDeclaration(n);
				}else {
					symbol.addFunctionDeclaration(n);
				}
			}
			com.google.javascript.rhino.jstype.ObjectType prototype = type.getPrototype();
			for (java.lang.String prop : prototype.getOwnPropertyNames()) {
				graph.defineNameIfNotExists(((name + ".prototype.") + prop), isExtern);
			}
			return symbol;
		}
	}

	private void connectUnknowns() {
		for (com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> node : graph.getNodes()) {
			com.google.javascript.jscomp.NameReferenceGraph.Name name = node.getValue();
			java.lang.String propName = name.getPropertyName();
			if (propName == null) {
				continue;
			}
			java.util.Collection<com.google.javascript.jscomp.NameReferenceGraphConstruction.NameUse> uses = unknownNameUse.get(propName);
			if (uses != null) {
				for (com.google.javascript.jscomp.NameReferenceGraphConstruction.NameUse use : uses) {
					graph.connect(use.name, use.reference, name);
				}
			}
		}
	}

	private com.google.javascript.rhino.jstype.JSType getType(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.JSType type = n.getJSType();
		if (type == null) {
			if (com.google.javascript.jscomp.NameReferenceGraphConstruction.CONSERVATIVE) {
				throw new java.lang.RuntimeException("Type system failed us :(");
			}else {
				return compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			}
		}
		return type.restrictByNotNullOrUndefined();
	}

	private void pushContainingFunction(com.google.javascript.jscomp.NameReferenceGraph.Name functionNode) {
		currentFunctionStack.add(functionNode);
	}

	private void popContainingFunction() {
		currentFunctionStack.remove(((currentFunctionStack.size()) - 1));
	}

	private com.google.javascript.jscomp.NameReferenceGraph.Name getNamedContainingFunction() {
		com.google.javascript.jscomp.NameReferenceGraph.Name containingFn = null;
		int pos;
		for (pos = (currentFunctionStack.size()) - 1; pos >= 0; pos = pos - 1) {
			com.google.javascript.jscomp.NameReferenceGraph.Name cf = currentFunctionStack.get(pos);
			if (cf != (graph.UNKNOWN)) {
				containingFn = cf;
				break;
			}
		}
		com.google.common.base.Preconditions.checkNotNull(containingFn);
		return containingFn;
	}

	private static class NameUse {
		private final com.google.javascript.jscomp.NameReferenceGraph.Name name;

		private final com.google.javascript.jscomp.NameReferenceGraph.Reference reference;

		private NameUse(com.google.javascript.jscomp.NameReferenceGraph.Name name, com.google.javascript.jscomp.NameReferenceGraph.Reference reference) {
			this.name = name;
			this.reference = reference;
		}
	}
}

