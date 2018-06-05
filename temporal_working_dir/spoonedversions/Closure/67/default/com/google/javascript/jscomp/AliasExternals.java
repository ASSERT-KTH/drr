

package com.google.javascript.jscomp;


class AliasExternals implements com.google.javascript.jscomp.CompilerPass {
	private static final int DEFAULT_REQUIRED_USAGE = 4;

	private int requiredUsage = com.google.javascript.jscomp.AliasExternals.DEFAULT_REQUIRED_USAGE;

	private static final int MIN_PROP_SIZE = 4;

	static final java.lang.String PROTOTYPE_PROPERTY_NAME = com.google.javascript.jscomp.AliasExternals.getArrayNotationNameFor("prototype");

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.AliasExternals.Symbol> props = com.google.common.collect.Maps.newHashMap();

	private final java.util.List<com.google.javascript.rhino.Node> accessors = com.google.common.collect.Lists.newArrayList();

	private final java.util.List<com.google.javascript.rhino.Node> mutators = com.google.common.collect.Lists.newArrayList();

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node> replacementMap = new java.util.IdentityHashMap<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node>();

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.AliasExternals.Symbol> globals = com.google.common.collect.Maps.newHashMap();

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.JSModuleGraph moduleGraph;

	private com.google.javascript.rhino.Node defaultRoot;

	private java.util.Map<com.google.javascript.jscomp.JSModule, com.google.javascript.rhino.Node> moduleRoots;

	private final java.util.Set<java.lang.String> unaliasableGlobals = com.google.common.collect.Sets.newHashSet("arguments", "eval", "NodeFilter", "JSCompiler_renameProperty");

	private final java.util.Set<java.lang.String> aliasableGlobals = com.google.common.collect.Sets.newHashSet();

	AliasExternals(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.JSModuleGraph moduleGraph) {
		this(compiler, moduleGraph, null, null);
	}

	AliasExternals(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.JSModuleGraph moduleGraph, @javax.annotation.Nullable
	java.lang.String unaliasableGlobals, @javax.annotation.Nullable
	java.lang.String aliasableGlobals) {
		this.compiler = compiler;
		this.moduleGraph = moduleGraph;
		if ((!(com.google.javascript.jscomp.Strings.isEmpty(unaliasableGlobals))) && (!(com.google.javascript.jscomp.Strings.isEmpty(aliasableGlobals)))) {
			throw new java.lang.IllegalArgumentException(("Cannot pass in both unaliasable and aliasable globals; you must " + "choose one or the other."));
		}
		if (!(com.google.javascript.jscomp.Strings.isEmpty(unaliasableGlobals))) {
			com.google.javascript.jscomp.AliasExternals.this.unaliasableGlobals.addAll(java.util.Arrays.asList(unaliasableGlobals.split(",")));
		}
		if (!(com.google.javascript.jscomp.Strings.isEmpty(aliasableGlobals))) {
			com.google.javascript.jscomp.AliasExternals.this.aliasableGlobals.addAll(java.util.Arrays.asList(aliasableGlobals.split(",")));
		}
		if (moduleGraph != null) {
			moduleRoots = com.google.common.collect.Maps.newHashMap();
		}
	}

	public void setRequiredUsage(int usage) {
		com.google.javascript.jscomp.AliasExternals.this.requiredUsage = usage;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		defaultRoot = root.getFirstChild();
		com.google.common.base.Preconditions.checkState(((defaultRoot.getType()) == (com.google.javascript.rhino.Token.SCRIPT)));
		aliasProperties(externs, root);
		aliasGlobals(externs, root);
	}

	private void aliasProperties(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.AliasExternals.GetAliasableNames(aliasableGlobals));
		props.put("prototype", newSymbolForProperty("prototype"));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.AliasExternals.PropertyGatherer());
		for (com.google.javascript.jscomp.AliasExternals.Symbol prop : props.values()) {
			if ((prop.name.length()) >= (com.google.javascript.jscomp.AliasExternals.MIN_PROP_SIZE)) {
				if ((prop.accessorCount) >= (requiredUsage)) {
					prop.aliasAccessor = true;
				}
				if ((prop.mutatorCount) >= (requiredUsage)) {
					prop.aliasMutator = true;
				}
			}
		}
		for (com.google.javascript.rhino.Node propInfo : accessors) {
			replaceAccessor(propInfo);
		}
		for (com.google.javascript.rhino.Node propInfo : mutators) {
			replaceMutator(propInfo);
		}
		for (com.google.javascript.jscomp.AliasExternals.Symbol prop : props.values()) {
			if (prop.aliasAccessor) {
				addAccessorPropName(prop.name, getAddingRoot(prop.deepestModuleAccess));
			}
		}
		for (com.google.javascript.jscomp.AliasExternals.Symbol prop : props.values()) {
			if (prop.aliasMutator) {
				addMutatorFunction(prop.name, getAddingRoot(prop.deepestModuleMutate));
			}
		}
	}

	private void replaceAccessor(com.google.javascript.rhino.Node getPropNode) {
		com.google.javascript.rhino.Node propNameNode = getPropNode.getLastChild();
		java.lang.String propName = propNameNode.getString();
		if (props.get(propName).aliasAccessor) {
			com.google.javascript.rhino.Node propSrc = getPropNode.getFirstChild();
			getPropNode.removeChild(propSrc);
			com.google.javascript.rhino.Node newNameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, com.google.javascript.jscomp.AliasExternals.getArrayNotationNameFor(propName));
			com.google.javascript.rhino.Node elemNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETELEM, propSrc, newNameNode);
			replaceNode(getPropNode.getParent(), getPropNode, elemNode);
			compiler.reportCodeChange();
		}
	}

	private void replaceMutator(com.google.javascript.rhino.Node getPropNode) {
		com.google.javascript.rhino.Node propNameNode = getPropNode.getLastChild();
		com.google.javascript.rhino.Node parentNode = getPropNode.getParent();
		com.google.javascript.jscomp.AliasExternals.Symbol prop = props.get(propNameNode.getString());
		if (prop.aliasMutator) {
			com.google.javascript.rhino.Node propSrc = getPropNode.getFirstChild();
			com.google.javascript.rhino.Node propDest = parentNode.getLastChild();
			getPropNode.removeChild(propSrc);
			getPropNode.removeChild(propNameNode);
			parentNode.removeChild(propDest);
			com.google.javascript.rhino.Node callName = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, com.google.javascript.jscomp.AliasExternals.getMutatorFor(propNameNode.getString()));
			com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, callName, propSrc, propDest);
			replaceNode(parentNode.getParent(), parentNode, call);
			compiler.reportCodeChange();
		}
	}

	private void replaceNode(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node before, com.google.javascript.rhino.Node after) {
		if (replacementMap.containsKey(parent)) {
			parent = replacementMap.get(parent);
		}
		parent.replaceChild(before, after);
		replacementMap.put(before, after);
	}

	private void addAccessorPropName(java.lang.String propName, com.google.javascript.rhino.Node root) {
		com.google.javascript.rhino.Node propValue = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.STRING, propName);
		com.google.javascript.rhino.Node propNameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, com.google.javascript.jscomp.AliasExternals.getArrayNotationNameFor(propName));
		propNameNode.addChildToFront(propValue);
		com.google.javascript.rhino.Node var = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, propNameNode);
		root.addChildToFront(var);
		compiler.reportCodeChange();
	}

	private void addMutatorFunction(java.lang.String propName, com.google.javascript.rhino.Node root) {
		java.lang.String functionName = com.google.javascript.jscomp.AliasExternals.getMutatorFor(propName);
		java.lang.String localPropName = (com.google.javascript.jscomp.AliasExternals.getMutatorFor(propName)) + "$a";
		java.lang.String localValueName = (com.google.javascript.jscomp.AliasExternals.getMutatorFor(propName)) + "$b";
		com.google.javascript.rhino.Node hasPropNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, localPropName);
		com.google.javascript.rhino.Node propValueNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, localValueName);
		java.util.List<com.google.javascript.rhino.Node> args = com.google.common.collect.Lists.newArrayList(hasPropNode, propValueNode);
		com.google.javascript.rhino.Node propNameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, localPropName);
		com.google.javascript.rhino.Node propValue = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.STRING, propName);
		com.google.javascript.rhino.Node getProp = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETPROP, propNameNode, propValue);
		com.google.javascript.rhino.Node assignFrom = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, localValueName);
		com.google.javascript.rhino.Node assign = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, getProp, assignFrom);
		com.google.javascript.rhino.Node returnNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.RETURN, assign);
		com.google.javascript.rhino.Node functionBody = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK, returnNode);
		com.google.javascript.rhino.Node fnNode = com.google.javascript.jscomp.NodeUtil.newFunctionNode(functionName, args, functionBody, (-1), (-1));
		root.addChildToFront(fnNode);
		compiler.reportCodeChange();
	}

	private com.google.javascript.rhino.Node getAddingRoot(com.google.javascript.jscomp.JSModule m) {
		if (m != null) {
			com.google.javascript.rhino.Node root = moduleRoots.get(m);
			if (root != null) {
				return root;
			}
			root = compiler.getNodeForCodeInsertion(m);
			if (root != null) {
				moduleRoots.put(m, root);
				return root;
			}
		}
		return defaultRoot;
	}

	private class GetAliasableNames extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private final java.util.Set<java.lang.String> whitelist;

		public GetAliasableNames(final java.util.Set<java.lang.String> whitelist) {
			this.whitelist = whitelist;
		}

		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					if (((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) && ((whitelist.isEmpty()) || (whitelist.contains(dest.getString())))) {
						props.put(dest.getString(), newSymbolForProperty(dest.getString()));
					}
			}
		}
	}

	private final class PropertyGatherer extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
				com.google.javascript.rhino.Node propNameNode = n.getLastChild();
				if (canReplaceWithGetProp(propNameNode, n, parent)) {
					java.lang.String name = propNameNode.getString();
					props.get(name).recordAccessor(t);
					accessors.add(n);
				}
				if (canReplaceWithSetProp(propNameNode, n, parent)) {
					java.lang.String name = propNameNode.getString();
					props.get(name).recordMutator(t);
					mutators.add(n);
				}
			}
		}

		private boolean canReplaceWithGetProp(com.google.javascript.rhino.Node propNameNode, com.google.javascript.rhino.Node getPropNode, com.google.javascript.rhino.Node parent) {
			boolean isCallTarget = ((parent.getType()) == (com.google.javascript.rhino.Token.CALL)) && ((parent.getFirstChild()) == getPropNode);
			boolean isAssignTarget = (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && ((parent.getFirstChild()) == getPropNode);
			boolean isIncOrDec = ((parent.getType()) == (com.google.javascript.rhino.Token.INC)) || ((parent.getType()) == (com.google.javascript.rhino.Token.DEC));
			return (((((propNameNode.getType()) == (com.google.javascript.rhino.Token.STRING)) && (!isAssignTarget)) && ((!isCallTarget) || (!("eval".equals(propNameNode.getString()))))) && (!isIncOrDec)) && (props.containsKey(propNameNode.getString()));
		}

		private boolean canReplaceWithSetProp(com.google.javascript.rhino.Node propNameNode, com.google.javascript.rhino.Node getPropNode, com.google.javascript.rhino.Node parent) {
			boolean isAssignTarget = ((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == getPropNode);
			return (((propNameNode.getType()) == (com.google.javascript.rhino.Token.STRING)) && isAssignTarget) && (props.containsKey(propNameNode.getString()));
		}
	}

	private static java.lang.String getMutatorFor(java.lang.String prop) {
		return "SETPROP_" + prop;
	}

	private static java.lang.String getArrayNotationNameFor(java.lang.String prop) {
		return "$$PROP_" + prop;
	}

	private void aliasGlobals(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.AliasExternals.GetGlobals());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.AliasExternals.GlobalGatherer());
		for (com.google.javascript.jscomp.AliasExternals.Symbol global : globals.values()) {
			if ((global.mutatorCount) > 0) {
				continue;
			}
			int currentBytes = (global.name.length()) * (global.accessorCount);
			int aliasedBytes = (8 + (global.name.length())) + (2 * (global.accessorCount));
			if (aliasedBytes < currentBytes) {
				global.aliasAccessor = true;
			}
		}
		for (com.google.javascript.jscomp.AliasExternals.Symbol global : globals.values()) {
			for (com.google.javascript.rhino.Node globalUse : global.uses) {
				replaceGlobalUse(globalUse);
			}
			if (global.aliasAccessor) {
				addGlobalAliasNode(global, getAddingRoot(global.deepestModuleAccess));
			}
		}
	}

	private class GetGlobals extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback {
		private void getGlobalName(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node dest, com.google.javascript.rhino.Node parent) {
			if ((dest.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				com.google.javascript.rhino.JSDocInfo docInfo = (dest.getJSDocInfo()) == null ? parent.getJSDocInfo() : dest.getJSDocInfo();
				boolean aliasable = (!(unaliasableGlobals.contains(dest.getString()))) && ((docInfo == null) || (!(docInfo.isNoAlias())));
				if (aliasable) {
					java.lang.String name = dest.getString();
					com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
					if ((var != null) && (!(var.isLocal()))) {
						globals.put(name, newSymbolForGlobalVar(dest));
					}
				}
			}
		}

		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.FUNCTION :
					getGlobalName(t, n.getFirstChild(), n);
					break;
				case com.google.javascript.rhino.Token.VAR :
					for (com.google.javascript.rhino.Node varChild = n.getFirstChild(); varChild != null; varChild = varChild.getNext()) {
						getGlobalName(t, varChild, n);
					}
					break;
			}
		}
	}

	private final class GlobalGatherer extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				java.lang.String name = n.getString();
				com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
				if ((var != null) && (var.isLocal())) {
					return ;
				}
				com.google.javascript.jscomp.AliasExternals.Symbol global = globals.get(name);
				if (global != null) {
					if (((n.getParent().getType()) == (com.google.javascript.rhino.Token.VAR)) || ((n.getParent().getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
						globals.remove(name);
					}
					boolean isFirst = (parent.getFirstChild()) == n;
					if (((((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && isFirst) || (((parent.getType()) == (com.google.javascript.rhino.Token.NEW)) && isFirst)) || ((parent.getType()) == (com.google.javascript.rhino.Token.INC))) || ((parent.getType()) == (com.google.javascript.rhino.Token.DEC))) {
						global.recordMutator(t);
					}else {
						global.recordAccessor(t);
					}
					global.uses.add(n);
				}
			}
		}
	}

	private void replaceGlobalUse(com.google.javascript.rhino.Node globalUse) {
		java.lang.String globalName = globalUse.getString();
		if (globals.get(globalName).aliasAccessor) {
			globalUse.setString(("GLOBAL_" + globalName));
			globalUse.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, false);
			compiler.reportCodeChange();
		}
	}

	private void addGlobalAliasNode(com.google.javascript.jscomp.AliasExternals.Symbol global, com.google.javascript.rhino.Node root) {
		java.lang.String globalName = global.name;
		com.google.javascript.rhino.Node globalValue = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, global.name);
		globalValue.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, global.isConstant);
		com.google.javascript.rhino.Node globalNameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, ("GLOBAL_" + globalName));
		globalNameNode.addChildToFront(globalValue);
		com.google.javascript.rhino.Node var = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, globalNameNode);
		root.addChildToFront(var);
		compiler.reportCodeChange();
	}

	private com.google.javascript.jscomp.AliasExternals.Symbol newSymbolForGlobalVar(com.google.javascript.rhino.Node name) {
		return new com.google.javascript.jscomp.AliasExternals.Symbol(name.getString(), name.getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME));
	}

	private com.google.javascript.jscomp.AliasExternals.Symbol newSymbolForProperty(java.lang.String name) {
		return new com.google.javascript.jscomp.AliasExternals.Symbol(name, false);
	}

	private class Symbol {
		public final java.lang.String name;

		public int accessorCount = 0;

		public int mutatorCount = 0;

		public boolean aliasMutator = false;

		public boolean aliasAccessor = false;

		public final boolean isConstant;

		com.google.javascript.jscomp.JSModule deepestModuleAccess = null;

		com.google.javascript.jscomp.JSModule deepestModuleMutate = null;

		java.util.List<com.google.javascript.rhino.Node> uses = com.google.common.collect.Lists.newArrayList();

		private Symbol(java.lang.String name, boolean isConstant) {
			this.name = name;
			this.isConstant = isConstant;
		}

		void recordAccessor(com.google.javascript.jscomp.NodeTraversal t) {
			(accessorCount)++;
			if ((moduleGraph) != null) {
				deepestModuleAccess = ((deepestModuleAccess) == null) ? t.getModule() : moduleGraph.getDeepestCommonDependencyInclusive(t.getModule(), deepestModuleAccess);
			}
		}

		void recordMutator(com.google.javascript.jscomp.NodeTraversal t) {
			(mutatorCount)++;
			if ((moduleGraph) != null) {
				deepestModuleMutate = ((deepestModuleMutate) == null) ? t.getModule() : moduleGraph.getDeepestCommonDependencyInclusive(t.getModule(), deepestModuleMutate);
			}
		}
	}
}

