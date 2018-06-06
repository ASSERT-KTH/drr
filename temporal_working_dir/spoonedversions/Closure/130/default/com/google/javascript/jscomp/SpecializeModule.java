

package com.google.javascript.jscomp;


class SpecializeModule implements com.google.javascript.jscomp.CompilerPass {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node> specializedInputRootsByOriginal;

	private java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation> functionInfoBySpecializedFunctionNode;

	private com.google.javascript.jscomp.SpecializeModule.SpecializationState specializationState;

	private final com.google.javascript.jscomp.PassFactory[] specializationPassFactories;

	public SpecializeModule(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.PassFactory... specializationPassFactories) {
		com.google.javascript.jscomp.SpecializeModule.this.compiler = compiler;
		this.specializationPassFactories = specializationPassFactories;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.JSModuleGraph moduleGraph = compiler.getModuleGraph();
		if (moduleGraph == null) {
			return ;
		}
		com.google.javascript.jscomp.JSModule module = moduleGraph.getRootModule();
		com.google.javascript.rhino.Node fakeModuleRoot = copyModuleInputs(module);
		com.google.javascript.jscomp.SimpleDefinitionFinder defFinder = new com.google.javascript.jscomp.SimpleDefinitionFinder(compiler);
		defFinder.process(externs, fakeModuleRoot);
		com.google.javascript.jscomp.SimpleFunctionAliasAnalysis initialModuleFunctionAliasAnalysis = new com.google.javascript.jscomp.SimpleFunctionAliasAnalysis();
		initialModuleFunctionAliasAnalysis.analyze(defFinder);
		specializationState = new com.google.javascript.jscomp.SpecializeModule.SpecializationState(initialModuleFunctionAliasAnalysis);
		do {
			specializationState.resetHasChanged();
			for (com.google.javascript.jscomp.SpecializationAwareCompilerPass pass : createSpecializingPasses()) {
				pass.enableSpecialization(specializationState);
				pass.process(externs, fakeModuleRoot);
			}
		} while (specializationState.hasChanged() );
		addDummyVarDeclarationsToInitialModule(module);
		replaceOriginalModuleInputsWithSpecialized();
		addOriginalFunctionVersionsToDependentModules(module);
	}

	private java.util.Collection<com.google.javascript.jscomp.SpecializationAwareCompilerPass> createSpecializingPasses() {
		java.util.Collection<com.google.javascript.jscomp.SpecializationAwareCompilerPass> passes = com.google.common.collect.Lists.newLinkedList();
		for (com.google.javascript.jscomp.PassFactory passFactory : specializationPassFactories) {
			com.google.javascript.jscomp.CompilerPass pass = passFactory.create(compiler);
			com.google.common.base.Preconditions.checkState((pass instanceof com.google.javascript.jscomp.SpecializationAwareCompilerPass));
			passes.add(((com.google.javascript.jscomp.SpecializationAwareCompilerPass) (pass)));
		}
		return passes;
	}

	private com.google.javascript.rhino.Node copyModuleInputs(com.google.javascript.jscomp.JSModule module) {
		specializedInputRootsByOriginal = com.google.common.collect.Maps.newLinkedHashMap();
		functionInfoBySpecializedFunctionNode = com.google.common.collect.Maps.newLinkedHashMap();
		com.google.javascript.rhino.Node syntheticModuleJsRoot = com.google.javascript.rhino.IR.block();
		syntheticModuleJsRoot.setIsSyntheticBlock(true);
		for (com.google.javascript.jscomp.CompilerInput input : module.getInputs()) {
			com.google.javascript.rhino.Node originalInputRoot = input.getAstRoot(compiler);
			com.google.javascript.rhino.Node copiedInputRoot = originalInputRoot.cloneTree();
			copiedInputRoot.copyInformationFromForTree(originalInputRoot);
			specializedInputRootsByOriginal.put(originalInputRoot, copiedInputRoot);
			matchTopLevelFunctions(originalInputRoot, copiedInputRoot);
			syntheticModuleJsRoot.addChildToBack(copiedInputRoot);
		}
		com.google.javascript.rhino.Node syntheticExternsAndJsRoot = com.google.javascript.rhino.IR.block();
		syntheticExternsAndJsRoot.addChildToBack(syntheticModuleJsRoot);
		return syntheticModuleJsRoot;
	}

	private void matchTopLevelFunctions(com.google.javascript.rhino.Node original, com.google.javascript.rhino.Node toBeSpecialized) {
		new com.google.javascript.jscomp.SpecializeModule.NodeMatcher() {
			@java.lang.Override
			public void reportMatch(com.google.javascript.rhino.Node original, com.google.javascript.rhino.Node specialized) {
				if (original.isFunction()) {
					com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation functionInfo = new com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation(original);
					functionInfoBySpecializedFunctionNode.put(specialized, functionInfo);
				}
			}

			@java.lang.Override
			public boolean shouldTraverse(com.google.javascript.rhino.Node n1, com.google.javascript.rhino.Node n2) {
				return !(n1.isFunction());
			}
		}.match(original, toBeSpecialized);
	}

	private void replaceOriginalModuleInputsWithSpecialized() {
		for (com.google.javascript.rhino.Node original : specializedInputRootsByOriginal.keySet()) {
			com.google.javascript.rhino.Node specialized = specializedInputRootsByOriginal.get(original);
			original.removeChildren();
			while ((specialized.getFirstChild()) != null) {
				original.addChildToBack(specialized.removeFirstChild());
			} 
		}
	}

	private void addDummyVarDeclarationsToInitialModule(com.google.javascript.jscomp.JSModule module) {
		for (com.google.javascript.rhino.Node modifiedFunction : functionInfoBySpecializedFunctionNode.keySet()) {
			if (specializationState.getRemovedFunctions().contains(modifiedFunction)) {
				com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation originalInfo = functionInfoBySpecializedFunctionNode.get(modifiedFunction);
				if (((originalInfo.name) != null) && (originalInfo.originalWasDeclaration())) {
					com.google.javascript.rhino.Node block = specializationState.removedFunctionToBlock.get(modifiedFunction);
					if (block != null) {
						block.addChildrenToBack(originalInfo.generateDummyDeclaration());
					}
				}
			}
		}
	}

	private void addOriginalFunctionVersionsToDependentModules(com.google.javascript.jscomp.JSModule module) {
		for (com.google.javascript.jscomp.JSModule directDependent : getDirectDependents(module)) {
			com.google.javascript.jscomp.CompilerInput firstInput = directDependent.getInputs().get(0);
			com.google.javascript.rhino.Node firstInputRootNode = firstInput.getAstRoot(compiler);
			java.util.List<com.google.javascript.rhino.Node> possiblyModifiedFunctions = com.google.common.collect.Lists.newArrayList(functionInfoBySpecializedFunctionNode.keySet());
			java.util.Collections.reverse(possiblyModifiedFunctions);
			for (com.google.javascript.rhino.Node modifiedFunction : possiblyModifiedFunctions) {
				boolean declarationWasSpecialized = specializationState.getSpecializedFunctions().contains(modifiedFunction);
				boolean declarationWasRemoved = specializationState.getRemovedFunctions().contains(modifiedFunction);
				if (declarationWasSpecialized || declarationWasRemoved) {
					com.google.javascript.jscomp.SpecializeModule.OriginalFunctionInformation originalInfo = functionInfoBySpecializedFunctionNode.get(modifiedFunction);
					if ((originalInfo.name) != null) {
						com.google.javascript.rhino.Node newDefinition = originalInfo.generateFixupDefinition();
						firstInputRootNode.addChildrenToFront(newDefinition);
					}
				}
			}
		}
	}

	public java.util.Collection<com.google.javascript.jscomp.JSModule> getDirectDependents(com.google.javascript.jscomp.JSModule module) {
		java.util.Set<com.google.javascript.jscomp.JSModule> directDependents = com.google.common.collect.Sets.newHashSet();
		for (com.google.javascript.jscomp.JSModule possibleDependent : compiler.getModuleGraph().getAllModules()) {
			if (possibleDependent.getDependencies().contains(module)) {
				directDependents.add(possibleDependent);
			}
		}
		return directDependents;
	}

	private abstract static class NodeMatcher {
		public void match(com.google.javascript.rhino.Node ast1, com.google.javascript.rhino.Node ast2) {
			reportMatch(ast1, ast2);
			if (shouldTraverse(ast1, ast2)) {
				com.google.javascript.rhino.Node childOf1 = ast1.getFirstChild();
				com.google.javascript.rhino.Node childOf2 = ast2.getFirstChild();
				while (childOf1 != null) {
					match(childOf1, childOf2);
					childOf1 = childOf1.getNext();
					childOf2 = childOf2.getNext();
				} 
			}
		}

		public abstract void reportMatch(com.google.javascript.rhino.Node n1, com.google.javascript.rhino.Node n2);

		public boolean shouldTraverse(com.google.javascript.rhino.Node node1, com.google.javascript.rhino.Node n2) {
			return true;
		}
	}

	private class OriginalFunctionInformation {
		private java.lang.String name;

		private boolean isAssignFunction;

		private boolean assignHasVar;

		private com.google.javascript.rhino.Node originalFunctionCopy;

		public OriginalFunctionInformation(com.google.javascript.rhino.Node originalFunction) {
			name = com.google.javascript.jscomp.NodeUtil.getFunctionName(originalFunction);
			originalFunctionCopy = originalFunction.cloneTree();
			originalFunctionCopy.copyInformationFromForTree(originalFunction);
			com.google.javascript.rhino.Node originalParent = originalFunction.getParent();
			isAssignFunction = (originalParent.isAssign()) || (originalParent.isName());
			assignHasVar = (isAssignFunction) && (originalParent.getParent().isVar());
		}

		private com.google.javascript.rhino.Node copiedOriginalFunction() {
			com.google.javascript.rhino.Node copy = originalFunctionCopy.cloneTree();
			copy.copyInformationFromForTree(originalFunctionCopy);
			return copy;
		}

		private boolean originalWasDeclaration() {
			return (!(isAssignFunction)) || (assignHasVar);
		}

		private com.google.javascript.rhino.Node generateFixupDefinition() {
			com.google.javascript.rhino.Node functionCopy = copiedOriginalFunction();
			com.google.javascript.rhino.Node nameNode;
			if (isAssignFunction) {
				nameNode = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), name, functionCopy, name);
			}else {
				nameNode = functionCopy.getFirstChild();
				functionCopy.replaceChild(nameNode, com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), "", nameNode));
			}
			com.google.javascript.rhino.Node assignment = com.google.javascript.rhino.IR.assign(nameNode, functionCopy);
			assignment.copyInformationFrom(functionCopy);
			return com.google.javascript.jscomp.NodeUtil.newExpr(assignment);
		}

		private com.google.javascript.rhino.Node generateDummyDeclaration() {
			com.google.javascript.rhino.Node declaration = com.google.javascript.jscomp.NodeUtil.newVarNode(name, null);
			declaration.copyInformationFromForTree(originalFunctionCopy);
			return declaration;
		}
	}

	public static class SpecializationState {
		private java.util.Set<com.google.javascript.rhino.Node> specializedFunctions;

		private java.util.Set<com.google.javascript.rhino.Node> removedFunctions;

		private java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node> removedFunctionToBlock;

		private com.google.javascript.jscomp.SimpleFunctionAliasAnalysis initialModuleAliasAnalysis;

		private boolean hasChanged = false;

		public SpecializationState(com.google.javascript.jscomp.SimpleFunctionAliasAnalysis initialModuleAliasAnalysis) {
			com.google.javascript.jscomp.SpecializeModule.SpecializationState.this.initialModuleAliasAnalysis = initialModuleAliasAnalysis;
			specializedFunctions = com.google.common.collect.Sets.newLinkedHashSet();
			removedFunctions = com.google.common.collect.Sets.newLinkedHashSet();
			removedFunctionToBlock = com.google.common.collect.Maps.newLinkedHashMap();
		}

		private boolean hasChanged() {
			return hasChanged;
		}

		private void resetHasChanged() {
			hasChanged = false;
		}

		public java.util.Set<com.google.javascript.rhino.Node> getSpecializedFunctions() {
			return specializedFunctions;
		}

		public void reportSpecializedFunction(com.google.javascript.rhino.Node functionNode) {
			if (specializedFunctions.add(functionNode)) {
				hasChanged = true;
			}
		}

		public void reportSpecializedFunctionContainingNode(com.google.javascript.rhino.Node node) {
			com.google.javascript.rhino.Node containingFunction = containingFunction(node);
			if (containingFunction != null) {
				reportSpecializedFunction(containingFunction);
			}
		}

		public java.util.Set<com.google.javascript.rhino.Node> getRemovedFunctions() {
			return removedFunctions;
		}

		public void reportRemovedFunction(com.google.javascript.rhino.Node functionNode, com.google.javascript.rhino.Node declaringBlock) {
			if (removedFunctions.add(functionNode)) {
				hasChanged = true;
				removedFunctionToBlock.put(functionNode, declaringBlock);
			}
		}

		public boolean canFixupFunction(com.google.javascript.rhino.Node functionNode) {
			com.google.common.base.Preconditions.checkArgument(functionNode.isFunction());
			if ((!(nodeIsInGlobalScope(functionNode))) || (initialModuleAliasAnalysis.isAliased(functionNode))) {
				return false;
			}
			if (com.google.javascript.jscomp.NodeUtil.isStatement(functionNode)) {
				return true;
			}
			com.google.javascript.rhino.Node parent = functionNode.getParent();
			com.google.javascript.rhino.Node gramps = parent.getParent();
			if ((parent.isName()) && (gramps.isVar())) {
				return true;
			}
			if ((com.google.javascript.jscomp.NodeUtil.isExprAssign(gramps)) && ((parent.getChildAtIndex(1)) == functionNode)) {
				return true;
			}
			return false;
		}

		public boolean canFixupSpecializedFunctionContainingNode(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node containingFunction = containingFunction(n);
			if (containingFunction != null) {
				return canFixupFunction(containingFunction);
			}else {
				return true;
			}
		}

		private boolean nodeIsInGlobalScope(com.google.javascript.rhino.Node node) {
			return (containingFunction(node)) == null;
		}

		private com.google.javascript.rhino.Node containingFunction(com.google.javascript.rhino.Node node) {
			for (com.google.javascript.rhino.Node ancestor : node.getAncestors()) {
				if (ancestor.isFunction()) {
					return ancestor;
				}
			}
			return null;
		}
	}
}

