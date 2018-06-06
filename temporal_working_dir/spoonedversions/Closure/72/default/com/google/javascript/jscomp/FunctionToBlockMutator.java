

package com.google.javascript.jscomp;


class FunctionToBlockMutator {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier;

	FunctionToBlockMutator(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier) {
		com.google.javascript.jscomp.FunctionToBlockMutator.this.compiler = compiler;
		com.google.javascript.jscomp.FunctionToBlockMutator.this.safeNameIdSupplier = safeNameIdSupplier;
	}

	com.google.javascript.rhino.Node mutate(java.lang.String fnName, com.google.javascript.rhino.Node fnNode, com.google.javascript.rhino.Node callNode, java.lang.String resultName, boolean needsDefaultResult, boolean isCallInLoop) {
		com.google.javascript.rhino.Node newFnNode = fnNode.cloneTree();
		makeLocalNamesUnique(newFnNode, isCallInLoop);
		java.util.Set<java.lang.String> namesToAlias = com.google.javascript.jscomp.FunctionArgumentInjector.findModifiedParameters(newFnNode);
		java.util.LinkedHashMap<java.lang.String, com.google.javascript.rhino.Node> args = com.google.javascript.jscomp.FunctionArgumentInjector.getFunctionCallParameterMap(newFnNode, callNode, com.google.javascript.jscomp.FunctionToBlockMutator.this.safeNameIdSupplier);
		boolean hasArgs = !(args.isEmpty());
		if (hasArgs) {
			com.google.javascript.jscomp.FunctionArgumentInjector.maybeAddTempsForCallArguments(newFnNode, args, namesToAlias, compiler.getCodingConvention());
		}
		com.google.javascript.rhino.Node newBlock = com.google.javascript.jscomp.NodeUtil.getFunctionBody(newFnNode);
		newBlock.detachFromParent();
		if (hasArgs) {
			com.google.javascript.rhino.Node inlineResult = aliasAndInlineArguments(newBlock, args, namesToAlias);
			com.google.common.base.Preconditions.checkState((newBlock == inlineResult));
		}
		if (isCallInLoop) {
			fixUnitializedVarDeclarations(newBlock);
		}
		java.lang.String labelName = getLabelNameForFunction(fnName);
		com.google.javascript.rhino.Node injectableBlock = com.google.javascript.jscomp.FunctionToBlockMutator.replaceReturns(newBlock, resultName, labelName, needsDefaultResult);
		com.google.common.base.Preconditions.checkState((injectableBlock != null));
		return injectableBlock;
	}

	private void fixUnitializedVarDeclarations(com.google.javascript.rhino.Node n) {
		if (com.google.javascript.jscomp.NodeUtil.isLoopStructure(n)) {
			return ;
		}
		if (com.google.javascript.jscomp.NodeUtil.isVar(n)) {
			com.google.javascript.rhino.Node name = n.getFirstChild();
			if (!(name.hasChildren())) {
				com.google.javascript.rhino.Node srcLocation = name;
				name.addChildToBack(com.google.javascript.jscomp.NodeUtil.newUndefinedNode(srcLocation));
			}
			return ;
		}
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			fixUnitializedVarDeclarations(c);
		}
	}

	private void makeLocalNamesUnique(com.google.javascript.rhino.Node fnNode, boolean isCallInLoop) {
		com.google.common.base.Supplier<java.lang.String> idSupplier = compiler.getUniqueNameIdSupplier();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, fnNode, new com.google.javascript.jscomp.MakeDeclaredNamesUnique(new com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer(idSupplier, "inline_", isCallInLoop)));
	}

	static class LabelNameSupplier implements com.google.common.base.Supplier<java.lang.String> {
		final com.google.common.base.Supplier<java.lang.String> idSupplier;

		LabelNameSupplier(com.google.common.base.Supplier<java.lang.String> idSupplier) {
			this.idSupplier = idSupplier;
		}

		@java.lang.Override
		public java.lang.String get() {
			return "JSCompiler_inline_label_" + (idSupplier.get());
		}
	}

	private java.lang.String getLabelNameForFunction(java.lang.String fnName) {
		java.lang.String name = (fnName == null) || (fnName.isEmpty()) ? "anon" : fnName;
		return (("JSCompiler_inline_label_" + name) + "_") + (safeNameIdSupplier.get());
	}

	private com.google.javascript.rhino.Node aliasAndInlineArguments(com.google.javascript.rhino.Node fnTemplateRoot, java.util.LinkedHashMap<java.lang.String, com.google.javascript.rhino.Node> argMap, java.util.Set<java.lang.String> namesToAlias) {
		if ((namesToAlias == null) || (namesToAlias.isEmpty())) {
			com.google.javascript.rhino.Node result = com.google.javascript.jscomp.FunctionArgumentInjector.inject(fnTemplateRoot, null, argMap);
			com.google.common.base.Preconditions.checkState((result == fnTemplateRoot));
			return result;
		}else {
			java.util.Map<java.lang.String, com.google.javascript.rhino.Node> newArgMap = com.google.common.collect.Maps.newHashMap(argMap);
			java.util.List<com.google.javascript.rhino.Node> newVars = com.google.common.collect.Lists.newLinkedList();
			for (java.util.Map.Entry<java.lang.String, com.google.javascript.rhino.Node> entry : argMap.entrySet()) {
				java.lang.String name = entry.getKey();
				if (namesToAlias.contains(name)) {
					com.google.javascript.rhino.Node newValue = entry.getValue().cloneTree();
					com.google.javascript.rhino.Node newNode = com.google.javascript.jscomp.NodeUtil.newVarNode(name, newValue).copyInformationFromForTree(newValue);
					newVars.add(0, newNode);
					newArgMap.remove(name);
				}
			}
			com.google.javascript.rhino.Node result = com.google.javascript.jscomp.FunctionArgumentInjector.inject(fnTemplateRoot, null, newArgMap);
			com.google.common.base.Preconditions.checkState((result == fnTemplateRoot));
			for (com.google.javascript.rhino.Node n : newVars) {
				fnTemplateRoot.addChildToFront(n);
			}
			return result;
		}
	}

	private static com.google.javascript.rhino.Node replaceReturns(com.google.javascript.rhino.Node block, java.lang.String resultName, java.lang.String labelName, boolean resultMustBeSet) {
		com.google.common.base.Preconditions.checkNotNull(block);
		com.google.common.base.Preconditions.checkNotNull(labelName);
		com.google.javascript.rhino.Node root = block;
		boolean hasReturnAtExit = false;
		int returnCount = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(block, com.google.javascript.rhino.Token.RETURN, new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement());
		if (returnCount > 0) {
			hasReturnAtExit = com.google.javascript.jscomp.FunctionToBlockMutator.hasReturnAtExit(block);
			if (hasReturnAtExit) {
				com.google.javascript.jscomp.FunctionToBlockMutator.convertLastReturnToStatement(block, resultName);
				returnCount--;
			}
			if (returnCount > 0) {
				com.google.javascript.jscomp.FunctionToBlockMutator.replaceReturnWithBreak(block, null, resultName, labelName);
				com.google.javascript.rhino.Node label = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.LABEL).copyInformationFrom(block);
				com.google.javascript.rhino.Node name = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.LABEL_NAME, labelName).copyInformationFrom(block);
				label.addChildToFront(name);
				label.addChildToBack(block);
				com.google.javascript.rhino.Node newRoot = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK).copyInformationFrom(block);
				newRoot.addChildrenToBack(label);
				root = newRoot;
			}
		}
		if ((resultMustBeSet && (!hasReturnAtExit)) && (resultName != null)) {
			com.google.javascript.jscomp.FunctionToBlockMutator.addDummyAssignment(block, resultName);
		}
		return root;
	}

	private static void addDummyAssignment(com.google.javascript.rhino.Node node, java.lang.String resultName) {
		com.google.common.base.Preconditions.checkArgument(((node.getType()) == (com.google.javascript.rhino.Token.BLOCK)));
		com.google.javascript.rhino.Node srcLocation = node;
		com.google.javascript.rhino.Node retVal = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(srcLocation);
		com.google.javascript.rhino.Node resultNode = com.google.javascript.jscomp.FunctionToBlockMutator.createAssignStatementNode(resultName, retVal);
		resultNode.copyInformationFromForTree(node);
		node.addChildrenToBack(resultNode);
	}

	private static void convertLastReturnToStatement(com.google.javascript.rhino.Node block, java.lang.String resultName) {
		com.google.javascript.rhino.Node ret = block.getLastChild();
		com.google.common.base.Preconditions.checkArgument(((ret.getType()) == (com.google.javascript.rhino.Token.RETURN)));
		com.google.javascript.rhino.Node resultNode = com.google.javascript.jscomp.FunctionToBlockMutator.getReplacementReturnStatement(ret, resultName);
		if (resultNode == null) {
			block.removeChild(ret);
		}else {
			resultNode.copyInformationFromForTree(ret);
			block.replaceChild(ret, resultNode);
		}
	}

	private static com.google.javascript.rhino.Node createAssignStatementNode(java.lang.String name, com.google.javascript.rhino.Node expression) {
		com.google.javascript.rhino.Node nameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name);
		com.google.javascript.rhino.Node assign = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, nameNode, expression);
		return com.google.javascript.jscomp.NodeUtil.newExpr(assign);
	}

	private static com.google.javascript.rhino.Node getReplacementReturnStatement(com.google.javascript.rhino.Node node, java.lang.String resultName) {
		com.google.javascript.rhino.Node resultNode = null;
		com.google.javascript.rhino.Node retVal = null;
		if (node.hasChildren()) {
			retVal = node.getFirstChild().cloneTree();
		}
		if (resultName == null) {
			if (retVal != null) {
				resultNode = com.google.javascript.jscomp.NodeUtil.newExpr(retVal);
			}
		}else {
			if (retVal == null) {
				com.google.javascript.rhino.Node srcLocation = node;
				retVal = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(srcLocation);
			}
			resultNode = com.google.javascript.jscomp.FunctionToBlockMutator.createAssignStatementNode(resultName, retVal);
		}
		return resultNode;
	}

	private static boolean hasReturnAtExit(com.google.javascript.rhino.Node block) {
		return (block.getLastChild().getType()) == (com.google.javascript.rhino.Token.RETURN);
	}

	private static com.google.javascript.rhino.Node replaceReturnWithBreak(com.google.javascript.rhino.Node current, com.google.javascript.rhino.Node parent, java.lang.String resultName, java.lang.String labelName) {
		if (((current.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) || ((current.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT))) {
			return current;
		}
		if ((current.getType()) == (com.google.javascript.rhino.Token.RETURN)) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent));
			com.google.javascript.rhino.Node resultNode = com.google.javascript.jscomp.FunctionToBlockMutator.getReplacementReturnStatement(current, resultName);
			com.google.javascript.rhino.Node name = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.LABEL_NAME, labelName);
			com.google.javascript.rhino.Node breakNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BREAK, name);
			breakNode.copyInformationFromForTree(current);
			parent.replaceChild(current, breakNode);
			if (resultNode != null) {
				resultNode.copyInformationFromForTree(current);
				parent.addChildBefore(resultNode, breakNode);
			}
			current = breakNode;
		}else {
			for (com.google.javascript.rhino.Node c = current.getFirstChild(); c != null; c = c.getNext()) {
				c = com.google.javascript.jscomp.FunctionToBlockMutator.replaceReturnWithBreak(c, current, resultName, labelName);
			}
		}
		return current;
	}
}

