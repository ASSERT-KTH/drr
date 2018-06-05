

package com.google.javascript.jscomp;


class AnalyzePrototypeProperties implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType PROPERTY = com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType.PROPERTY;

	private final com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType VAR = com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType.VAR;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean canModifyExterns;

	private final boolean anchorUnusedVars;

	private final com.google.javascript.jscomp.JSModuleGraph moduleGraph;

	private final com.google.javascript.jscomp.JSModule firstModule;

	private static final java.util.Set<java.lang.String> IMPLICITLY_USED_PROPERTIES = com.google.common.collect.ImmutableSet.of("length", "toString", "valueOf");

	private final com.google.javascript.jscomp.graph.LinkedDirectedGraph<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo, com.google.javascript.jscomp.JSModule> symbolGraph = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();

	private final com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo globalNode = new com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo("[global]");

	private final com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo externNode = new com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo("[extern]");

	private final com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo anonymousNode = new com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo("[anonymous]");

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> propertyNameInfo = com.google.common.collect.Maps.newHashMap();

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> varNameInfo = com.google.common.collect.Maps.newHashMap();

	AnalyzePrototypeProperties(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.JSModuleGraph moduleGraph, boolean canModifyExterns, boolean anchorUnusedVars) {
		this.compiler = compiler;
		this.moduleGraph = moduleGraph;
		this.canModifyExterns = canModifyExterns;
		this.anchorUnusedVars = anchorUnusedVars;
		if (moduleGraph != null) {
			firstModule = moduleGraph.getRootModule();
		}else {
			firstModule = null;
		}
		globalNode.markReference(null);
		externNode.markReference(null);
		symbolGraph.createNode(globalNode);
		symbolGraph.createNode(externNode);
		for (java.lang.String property : com.google.javascript.jscomp.AnalyzePrototypeProperties.IMPLICITLY_USED_PROPERTIES) {
			com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo = getNameInfoForName(property, PROPERTY);
			if (moduleGraph == null) {
				symbolGraph.connect(externNode, null, nameInfo);
			}else {
				for (com.google.javascript.jscomp.JSModule module : moduleGraph.getAllModules()) {
					symbolGraph.connect(externNode, module, nameInfo);
				}
			}
		}
	}

	public void process(com.google.javascript.rhino.Node externRoot, com.google.javascript.rhino.Node root) {
		if (!(canModifyExterns)) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externRoot, new com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessExternProperties());
		}
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.AnalyzePrototypeProperties.ProcessProperties());
		com.google.javascript.jscomp.graph.FixedPointGraphTraversal<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo, com.google.javascript.jscomp.JSModule> t = com.google.javascript.jscomp.graph.FixedPointGraphTraversal.newTraversal(new com.google.javascript.jscomp.AnalyzePrototypeProperties.PropagateReferences());
		t.computeFixedPoint(symbolGraph, com.google.common.collect.Sets.newHashSet(externNode, globalNode));
	}

	public java.util.Collection<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> getAllNameInfo() {
		java.util.List<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> result = com.google.common.collect.Lists.newArrayList(propertyNameInfo.values());
		result.addAll(varNameInfo.values());
		return result;
	}

	private com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo getNameInfoForName(java.lang.String name, com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType type) {
		java.util.Map<java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo> map = type == (PROPERTY) ? propertyNameInfo : varNameInfo;
		if (map.containsKey(name)) {
			return map.get(name);
		}else {
			com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo nameInfo = new com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo(name);
			map.put(name, nameInfo);
			symbolGraph.createNode(nameInfo);
			return nameInfo;
		}
	}

	private class ProcessProperties implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		private java.util.Stack<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameContext> symbolStack = new java.util.Stack<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameContext>();

		private ProcessProperties() {
			symbolStack.push(new com.google.javascript.jscomp.AnalyzePrototypeProperties.NameContext(globalNode));
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			symbolStack.peek().scope = t.getScope();
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		}

		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (isPrototypePropertyAssign(n)) {
				symbolStack.push(new com.google.javascript.jscomp.AnalyzePrototypeProperties.NameContext(getNameInfoForName(n.getFirstChild().getLastChild().getString(), PROPERTY)));
			}else
				if (isGlobalFunctionDeclaration(t, n)) {
					java.lang.String name = (parent.getType()) == (com.google.javascript.rhino.Token.NAME) ? parent.getString() : n.getFirstChild().getString();
					symbolStack.push(new com.google.javascript.jscomp.AnalyzePrototypeProperties.NameContext(getNameInfoForName(name, VAR)));
				}else
					if (com.google.javascript.jscomp.NodeUtil.isFunction(n)) {
						symbolStack.push(new com.google.javascript.jscomp.AnalyzePrototypeProperties.NameContext(anonymousNode));
					}
				
			
			return true;
		}

		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
				java.lang.String propName = n.getFirstChild().getNext().getString();
				if (propName.equals("prototype")) {
					processPrototypeParent(t, parent);
				}else
					if (compiler.getCodingConvention().isExported(propName)) {
						addGlobalUseOfSymbol(propName, t.getModule(), PROPERTY);
					}else {
						addSymbolUse(propName, t.getModule(), PROPERTY);
					}
				
			}else
				if (((n.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)) && (!((((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild().getType()) == (com.google.javascript.rhino.Token.GETPROP))) && (parent.getFirstChild().getLastChild().getString().equals("prototype"))))) {
					for (com.google.javascript.rhino.Node propNameNode = n.getFirstChild(); propNameNode != null; propNameNode = propNameNode.getNext()) {
						if (!(propNameNode.isQuotedString())) {
							addSymbolUse(propNameNode.getString(), t.getModule(), PROPERTY);
						}
					}
				}else
					if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
						java.lang.String name = n.getString();
						com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
						if (var != null) {
							if (var.isGlobal()) {
								if (((var.getInitialValue()) != null) && ((var.getInitialValue().getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
									if (t.inGlobalScope()) {
										if (!(processGlobalFunctionDeclaration(t, n, parent, parent.getParent()))) {
											addGlobalUseOfSymbol(name, t.getModule(), VAR);
										}
									}else {
										addSymbolUse(name, t.getModule(), VAR);
									}
								}
							}else
								if ((var.getScope()) != (t.getScope())) {
									for (int i = (symbolStack.size()) - 1; i >= 0; i--) {
										com.google.javascript.jscomp.AnalyzePrototypeProperties.NameContext context = symbolStack.get(i);
										context.name.readClosureVariables = true;
										if ((context.scope) == (var.getScope())) {
											break;
										}
									}
								}
							
						}
					}
				
			
			if (((isPrototypePropertyAssign(n)) || (isGlobalFunctionDeclaration(t, n))) || (com.google.javascript.jscomp.NodeUtil.isFunction(n))) {
				symbolStack.pop();
			}
		}

		private void addSymbolUse(java.lang.String name, com.google.javascript.jscomp.JSModule module, com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType type) {
			com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo info = getNameInfoForName(name, type);
			com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo def = null;
			for (int i = (symbolStack.size()) - 1; i >= 0; i--) {
				def = symbolStack.get(i).name;
				if (def != (anonymousNode)) {
					break;
				}
			}
			if (!(def.equals(info))) {
				symbolGraph.connect(def, module, info);
			}
		}

		private boolean isGlobalFunctionDeclaration(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			return (t.inGlobalScope()) && ((com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) || (((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) && ((n.getParent().getType()) == (com.google.javascript.rhino.Token.NAME))));
		}

		private boolean isPrototypePropertyAssign(com.google.javascript.rhino.Node assign) {
			com.google.javascript.rhino.Node n = assign.getFirstChild();
			if (((n != null) && (com.google.javascript.jscomp.NodeUtil.isLhs(n, assign))) && ((n.getType()) == (com.google.javascript.rhino.Token.GETPROP))) {
				boolean isChainedProperty = (n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.GETPROP);
				if (isChainedProperty) {
					com.google.javascript.rhino.Node child = n.getFirstChild().getFirstChild().getNext();
					if (((child.getType()) == (com.google.javascript.rhino.Token.STRING)) && (child.getString().equals("prototype"))) {
						return true;
					}
				}
			}
			return false;
		}

		private boolean processGlobalFunctionDeclaration(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node nameNode, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gramps) {
			com.google.javascript.rhino.Node firstChild = nameNode.getFirstChild();
			if ((isGlobalFunctionDeclaration(t, parent)) || ((firstChild != null) && (isGlobalFunctionDeclaration(t, firstChild)))) {
				java.lang.String name = nameNode.getString();
				getNameInfoForName(name, VAR).getDeclarations().add(new com.google.javascript.jscomp.AnalyzePrototypeProperties.GlobalFunction(nameNode, parent, gramps, t.getModule()));
				if ((compiler.getCodingConvention().isExported(name)) || (anchorUnusedVars)) {
					addGlobalUseOfSymbol(name, t.getModule(), VAR);
				}
				return true;
			}
			return false;
		}

		private void processPrototypeParent(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					com.google.javascript.rhino.Node parent = n.getParent();
					com.google.javascript.rhino.Node grandParent = parent.getParent();
					if ((((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) && (com.google.javascript.jscomp.NodeUtil.isExprAssign(grandParent))) && (com.google.javascript.jscomp.NodeUtil.isLhs(n, parent))) {
						java.lang.String name = dest.getString();
						com.google.javascript.jscomp.AnalyzePrototypeProperties.Property prop = new com.google.javascript.jscomp.AnalyzePrototypeProperties.AssignmentProperty(grandParent, t.getModule());
						getNameInfoForName(name, PROPERTY).getDeclarations().add(prop);
					}
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					com.google.javascript.rhino.Node map = n.getFirstChild().getNext();
					if ((map.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)) {
						for (com.google.javascript.rhino.Node key = map.getFirstChild(); key != null; key = key.getNext()) {
							java.lang.String name = key.getString();
							com.google.javascript.jscomp.AnalyzePrototypeProperties.Property prop = new com.google.javascript.jscomp.AnalyzePrototypeProperties.LiteralProperty(key, key.getFirstChild(), map, n, t.getModule());
							getNameInfoForName(name, PROPERTY).getDeclarations().add(prop);
						}
					}
					break;
			}
		}

		private void addGlobalUseOfSymbol(java.lang.String name, com.google.javascript.jscomp.JSModule module, com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType type) {
			symbolGraph.connect(globalNode, module, getNameInfoForName(name, type));
		}
	}

	private class ProcessExternProperties extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
				symbolGraph.connect(externNode, firstModule, getNameInfoForName(n.getLastChild().getString(), PROPERTY));
			}
		}
	}

	private class PropagateReferences implements com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback<com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo, com.google.javascript.jscomp.JSModule> {
		public boolean traverseEdge(com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo start, com.google.javascript.jscomp.JSModule edge, com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo dest) {
			if (start.isReferenced()) {
				com.google.javascript.jscomp.JSModule startModule = start.getDeepestCommonModuleRef();
				if ((startModule != null) && (moduleGraph.dependsOn(startModule, edge))) {
					return dest.markReference(startModule);
				}else {
					return dest.markReference(edge);
				}
			}
			return false;
		}
	}

	interface Symbol {
		void remove();

		com.google.javascript.jscomp.JSModule getModule();
	}

	private enum SymbolType {
PROPERTY, VAR;	}

	class GlobalFunction implements com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol {
		private final com.google.javascript.rhino.Node nameNode;

		private final com.google.javascript.jscomp.JSModule module;

		GlobalFunction(com.google.javascript.rhino.Node nameNode, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gramps, com.google.javascript.jscomp.JSModule module) {
			com.google.common.base.Preconditions.checkState((((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) || (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(parent))));
			this.nameNode = nameNode;
			this.module = module;
		}

		@java.lang.Override
		public void remove() {
			com.google.javascript.rhino.Node parent = nameNode.getParent();
			if (((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) || (parent.hasOneChild())) {
				com.google.javascript.jscomp.NodeUtil.removeChild(parent.getParent(), parent);
			}else {
				com.google.common.base.Preconditions.checkState(((parent.getType()) == (com.google.javascript.rhino.Token.VAR)));
				parent.removeChild(nameNode);
			}
		}

		@java.lang.Override
		public com.google.javascript.jscomp.JSModule getModule() {
			return module;
		}

		public com.google.javascript.rhino.Node getFunctionNode() {
			com.google.javascript.rhino.Node parent = nameNode.getParent();
			if (com.google.javascript.jscomp.NodeUtil.isFunction(parent)) {
				return parent;
			}else {
				return nameNode.getChildAtIndex(1);
			}
		}
	}

	interface Property extends com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol {
		com.google.javascript.rhino.Node getPrototype();

		com.google.javascript.rhino.Node getValue();
	}

	static class AssignmentProperty implements com.google.javascript.jscomp.AnalyzePrototypeProperties.Property {
		private final com.google.javascript.rhino.Node exprNode;

		private final com.google.javascript.jscomp.JSModule module;

		AssignmentProperty(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.JSModule module) {
			this.exprNode = node;
			this.module = module;
		}

		@java.lang.Override
		public void remove() {
			com.google.javascript.jscomp.NodeUtil.removeChild(exprNode.getParent(), exprNode);
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getPrototype() {
			return getAssignNode().getFirstChild().getFirstChild();
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getValue() {
			return getAssignNode().getLastChild();
		}

		private com.google.javascript.rhino.Node getAssignNode() {
			return exprNode.getFirstChild();
		}

		@java.lang.Override
		public com.google.javascript.jscomp.JSModule getModule() {
			return module;
		}
	}

	static class LiteralProperty implements com.google.javascript.jscomp.AnalyzePrototypeProperties.Property {
		private final com.google.javascript.rhino.Node key;

		private final com.google.javascript.rhino.Node value;

		private final com.google.javascript.rhino.Node map;

		private final com.google.javascript.rhino.Node assign;

		private final com.google.javascript.jscomp.JSModule module;

		LiteralProperty(com.google.javascript.rhino.Node key, com.google.javascript.rhino.Node value, com.google.javascript.rhino.Node map, com.google.javascript.rhino.Node assign, com.google.javascript.jscomp.JSModule module) {
			this.key = key;
			this.value = value;
			this.map = map;
			this.assign = assign;
			this.module = module;
		}

		@java.lang.Override
		public void remove() {
			map.removeChild(key);
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getPrototype() {
			return assign.getFirstChild();
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node getValue() {
			return value;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.JSModule getModule() {
			return module;
		}
	}

	private class NameContext {
		final com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo name;

		com.google.javascript.jscomp.Scope scope;

		NameContext(com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo name) {
			this.name = name;
		}
	}

	class NameInfo {
		final java.lang.String name;

		private boolean referenced = false;

		private final java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> declarations = new java.util.ArrayDeque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol>();

		private com.google.javascript.jscomp.JSModule deepestCommonModuleRef = null;

		private boolean readClosureVariables = false;

		NameInfo(java.lang.String name) {
			this.name = name;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return name;
		}

		boolean isReferenced() {
			return referenced;
		}

		boolean readsClosureVariables() {
			return readClosureVariables;
		}

		boolean markReference(com.google.javascript.jscomp.JSModule module) {
			boolean hasChanged = false;
			if (!(referenced)) {
				referenced = true;
				hasChanged = true;
			}
			if ((moduleGraph) != null) {
				com.google.javascript.jscomp.JSModule originalDeepestCommon = deepestCommonModuleRef;
				if ((deepestCommonModuleRef) == null) {
					deepestCommonModuleRef = module;
				}else {
					deepestCommonModuleRef = moduleGraph.getDeepestCommonDependencyInclusive(deepestCommonModuleRef, module);
				}
				if (originalDeepestCommon != (deepestCommonModuleRef)) {
					hasChanged = true;
				}
			}
			return hasChanged;
		}

		com.google.javascript.jscomp.JSModule getDeepestCommonModuleRef() {
			return deepestCommonModuleRef;
		}

		java.util.Deque<com.google.javascript.jscomp.AnalyzePrototypeProperties.Symbol> getDeclarations() {
			return declarations;
		}
	}
}

