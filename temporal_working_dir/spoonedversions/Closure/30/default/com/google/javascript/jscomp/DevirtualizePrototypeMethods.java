

package com.google.javascript.jscomp;


class DevirtualizePrototypeMethods implements com.google.javascript.jscomp.OptimizeCalls.CallGraphCompilerPass , com.google.javascript.jscomp.SpecializationAwareCompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private com.google.javascript.jscomp.SpecializeModule.SpecializationState specializationState;

	DevirtualizePrototypeMethods(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void enableSpecialization(com.google.javascript.jscomp.SpecializeModule.SpecializationState state) {
		com.google.javascript.jscomp.DevirtualizePrototypeMethods.this.specializationState = state;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.SimpleDefinitionFinder defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
		defFinder.process(externs, root);
		process(externs, root, defFinder);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root, com.google.javascript.jscomp.SimpleDefinitionFinder definitions) {
		for (com.google.javascript.jscomp.DefinitionSite defSite : definitions.getDefinitionSites()) {
			rewriteDefinitionIfEligible(defSite, definitions);
		}
	}

	private static boolean isCall(com.google.javascript.jscomp.UseSite site) {
		com.google.javascript.rhino.Node node = site.node;
		com.google.javascript.rhino.Node parent = node.getParent();
		return ((parent.getFirstChild()) == node) && (parent.isCall());
	}

	private static boolean isPrototypeMethodDefinition(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.Node parent = node.getParent();
		if (parent == null) {
			return false;
		}
		com.google.javascript.rhino.Node gramp = parent.getParent();
		if (((gramp == null) || ((parent.getFirstChild()) != node)) || (!(com.google.javascript.jscomp.NodeUtil.isExprAssign(gramp)))) {
			return false;
		}
		com.google.javascript.rhino.Node functionNode = parent.getLastChild();
		if ((functionNode == null) || (!(functionNode.isFunction()))) {
			return false;
		}
		if (!(node.isGetProp())) {
			return false;
		}
		com.google.javascript.rhino.Node nameNode = node.getFirstChild();
		return (nameNode.isGetProp()) && (nameNode.getLastChild().getString().equals("prototype"));
	}

	private java.lang.String getRewrittenMethodName(java.lang.String orginalMethodName) {
		return "JSCompiler_StaticMethods_" + orginalMethodName;
	}

	private void rewriteDefinitionIfEligible(com.google.javascript.jscomp.DefinitionSite defSite, com.google.javascript.jscomp.SimpleDefinitionFinder defFinder) {
		if (((defSite.inExterns) || (!(defSite.inGlobalScope))) || (!(isEligibleDefinition(defFinder, defSite)))) {
			return ;
		}
		com.google.javascript.rhino.Node node = defSite.node;
		if (!(com.google.javascript.jscomp.DevirtualizePrototypeMethods.isPrototypeMethodDefinition(node))) {
			return ;
		}
		for (com.google.javascript.rhino.Node ancestor = node.getParent(); ancestor != null; ancestor = ancestor.getParent()) {
			if (com.google.javascript.jscomp.NodeUtil.isControlStructure(ancestor)) {
				return ;
			}
		}
		java.lang.String newMethodName = getRewrittenMethodName(node.getLastChild().getString());
		rewriteDefinition(node, newMethodName);
		rewriteCallSites(defFinder, defSite.definition, newMethodName);
	}

	private boolean isEligibleDefinition(com.google.javascript.jscomp.SimpleDefinitionFinder defFinder, com.google.javascript.jscomp.DefinitionSite definitionSite) {
		com.google.javascript.jscomp.DefinitionsRemover.Definition definition = definitionSite.definition;
		com.google.javascript.jscomp.JSModule definitionModule = definitionSite.module;
		com.google.javascript.rhino.Node rValue = definition.getRValue();
		if (((rValue == null) || (!(rValue.isFunction()))) || (com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(rValue))) {
			return false;
		}
		com.google.javascript.rhino.Node lValue = definition.getLValue();
		if ((lValue == null) || (!(lValue.isGetProp()))) {
			return false;
		}
		com.google.javascript.jscomp.CodingConvention codingConvention = compiler.getCodingConvention();
		if (codingConvention.isExported(lValue.getLastChild().getString())) {
			return false;
		}
		java.util.Collection<com.google.javascript.jscomp.UseSite> useSites = defFinder.getUseSites(definition);
		if (useSites.isEmpty()) {
			return false;
		}
		com.google.javascript.jscomp.JSModuleGraph moduleGraph = compiler.getModuleGraph();
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			if (!(com.google.javascript.jscomp.DevirtualizePrototypeMethods.isCall(site))) {
				return false;
			}
			com.google.javascript.rhino.Node nameNode = site.node;
			if (((specializationState) != null) && (!(specializationState.canFixupSpecializedFunctionContainingNode(nameNode)))) {
				return false;
			}
			java.util.Collection<com.google.javascript.jscomp.DefinitionsRemover.Definition> singleSiteDefinitions = defFinder.getDefinitionsReferencedAt(nameNode);
			if ((singleSiteDefinitions.size()) > 1) {
				return false;
			}
			com.google.common.base.Preconditions.checkState((!(singleSiteDefinitions.isEmpty())));
			com.google.common.base.Preconditions.checkState(singleSiteDefinitions.contains(definition));
			com.google.javascript.jscomp.JSModule callModule = site.module;
			if ((definitionModule != callModule) && ((callModule == null) || (!(moduleGraph.dependsOn(callModule, definitionModule))))) {
				return false;
			}
		}
		return true;
	}

	private void rewriteCallSites(com.google.javascript.jscomp.SimpleDefinitionFinder defFinder, com.google.javascript.jscomp.DefinitionsRemover.Definition definition, java.lang.String newMethodName) {
		java.util.Collection<com.google.javascript.jscomp.UseSite> useSites = defFinder.getUseSites(definition);
		for (com.google.javascript.jscomp.UseSite site : useSites) {
			com.google.javascript.rhino.Node node = site.node;
			com.google.javascript.rhino.Node parent = node.getParent();
			com.google.javascript.rhino.Node objectNode = node.getFirstChild();
			node.removeChild(objectNode);
			parent.replaceChild(node, objectNode);
			parent.addChildToFront(com.google.javascript.rhino.IR.name(newMethodName).srcref(node));
			com.google.common.base.Preconditions.checkState(parent.isCall());
			parent.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
			compiler.reportCodeChange();
			if ((specializationState) != null) {
				specializationState.reportSpecializedFunctionContainingNode(parent);
			}
		}
	}

	private void rewriteDefinition(com.google.javascript.rhino.Node node, java.lang.String newMethodName) {
		com.google.javascript.rhino.Node parent = node.getParent();
		com.google.javascript.rhino.Node functionNode = parent.getLastChild();
		com.google.javascript.rhino.Node expr = parent.getParent();
		com.google.javascript.rhino.Node block = expr.getParent();
		com.google.javascript.rhino.Node newNameNode = com.google.javascript.rhino.IR.name(newMethodName).copyInformationFrom(parent.getFirstChild());
		if ((specializationState) != null) {
			specializationState.reportRemovedFunction(functionNode, block);
		}
		parent.removeChild(functionNode);
		newNameNode.addChildToFront(functionNode);
		block.replaceChild(expr, com.google.javascript.rhino.IR.var(newNameNode));
		java.lang.String self = newMethodName + "$self";
		com.google.javascript.rhino.Node argList = functionNode.getFirstChild().getNext();
		argList.addChildToFront(com.google.javascript.rhino.IR.name(self).copyInformationFrom(functionNode));
		com.google.javascript.rhino.Node body = functionNode.getLastChild();
		replaceReferencesToThis(body, self);
		fixFunctionType(functionNode);
		compiler.reportCodeChange();
	}

	private void fixFunctionType(com.google.javascript.rhino.Node functionNode) {
		com.google.javascript.rhino.jstype.FunctionType type = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(functionNode.getJSType());
		if (type != null) {
			com.google.javascript.rhino.jstype.JSTypeRegistry typeRegistry = compiler.getTypeRegistry();
			java.util.List<com.google.javascript.rhino.jstype.JSType> parameterTypes = com.google.common.collect.Lists.newArrayList();
			parameterTypes.add(type.getTypeOfThis());
			for (com.google.javascript.rhino.Node param : type.getParameters()) {
				parameterTypes.add(param.getJSType());
			}
			com.google.javascript.rhino.jstype.ObjectType thisType = typeRegistry.getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE);
			com.google.javascript.rhino.jstype.JSType returnType = type.getReturnType();
			com.google.javascript.rhino.jstype.JSType newType = typeRegistry.createFunctionType(thisType, returnType, parameterTypes);
			functionNode.setJSType(newType);
		}
	}

	private void replaceReferencesToThis(com.google.javascript.rhino.Node node, java.lang.String name) {
		if (node.isFunction()) {
			return ;
		}
		for (com.google.javascript.rhino.Node child : node.children()) {
			if (child.isThis()) {
				com.google.javascript.rhino.Node newName = com.google.javascript.rhino.IR.name(name);
				newName.setJSType(child.getJSType());
				node.replaceChild(child, newName);
			}else {
				replaceReferencesToThis(child, name);
			}
		}
	}
}

