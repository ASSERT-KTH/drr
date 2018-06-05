

package com.google.javascript.jscomp;


class FunctionRewriter implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private static final int SAVINGS_THRESHOLD = 16;

	FunctionRewriter(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		java.util.List<com.google.javascript.jscomp.FunctionRewriter.Reducer> reducers = com.google.common.collect.ImmutableList.of(new com.google.javascript.jscomp.FunctionRewriter.ReturnConstantReducer(), new com.google.javascript.jscomp.FunctionRewriter.GetterReducer(), new com.google.javascript.jscomp.FunctionRewriter.SetterReducer(), new com.google.javascript.jscomp.FunctionRewriter.EmptyFunctionReducer(), new com.google.javascript.jscomp.FunctionRewriter.IdentityReducer());
		com.google.common.collect.Multimap<com.google.javascript.jscomp.FunctionRewriter.Reducer, com.google.javascript.jscomp.FunctionRewriter.Reduction> reductionMap = com.google.common.collect.HashMultimap.create();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.FunctionRewriter.ReductionGatherer(reducers, reductionMap));
		for (com.google.javascript.jscomp.FunctionRewriter.Reducer reducer : reducers) {
			java.util.Collection<com.google.javascript.jscomp.FunctionRewriter.Reduction> reductions = reductionMap.get(reducer);
			if (reductions.isEmpty()) {
				continue;
			}
			com.google.javascript.rhino.Node helperCode = parseHelperCode(reducer);
			if (helperCode == null) {
				continue;
			}
			int helperCodeCost = com.google.javascript.jscomp.InlineCostEstimator.getCost(helperCode);
			int savings = 0;
			for (com.google.javascript.jscomp.FunctionRewriter.Reduction reduction : reductions) {
				savings += reduction.estimateSavings();
			}
			if (savings > (helperCodeCost + (com.google.javascript.jscomp.FunctionRewriter.SAVINGS_THRESHOLD))) {
				for (com.google.javascript.jscomp.FunctionRewriter.Reduction reduction : reductions) {
					reduction.apply();
				}
				com.google.javascript.rhino.Node addingRoot = compiler.getNodeForCodeInsertion(null);
				addingRoot.addChildrenToFront(helperCode);
				compiler.reportCodeChange();
			}
		}
	}

	public com.google.javascript.rhino.Node parseHelperCode(com.google.javascript.jscomp.FunctionRewriter.Reducer reducer) {
		com.google.javascript.rhino.Node root = compiler.parseSyntheticCode(((reducer.getClass().toString()) + ":helper"), reducer.getHelperSource());
		return root != null ? root.removeFirstChild() : null;
	}

	private static boolean isReduceableFunctionExpression(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n);
	}

	private class Reduction {
		private final com.google.javascript.rhino.Node parent;

		private final com.google.javascript.rhino.Node oldChild;

		private final com.google.javascript.rhino.Node newChild;

		Reduction(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node oldChild, com.google.javascript.rhino.Node newChild) {
			this.parent = parent;
			this.oldChild = oldChild;
			this.newChild = newChild;
		}

		void apply() {
			parent.replaceChild(oldChild, newChild);
			compiler.reportCodeChange();
		}

		int estimateSavings() {
			return (com.google.javascript.jscomp.InlineCostEstimator.getCost(oldChild)) - (com.google.javascript.jscomp.InlineCostEstimator.getCost(newChild));
		}
	}

	private class ReductionGatherer implements com.google.javascript.jscomp.NodeTraversal.Callback {
		private final java.util.List<com.google.javascript.jscomp.FunctionRewriter.Reducer> reducers;

		private final com.google.common.collect.Multimap<com.google.javascript.jscomp.FunctionRewriter.Reducer, com.google.javascript.jscomp.FunctionRewriter.Reduction> reductions;

		ReductionGatherer(java.util.List<com.google.javascript.jscomp.FunctionRewriter.Reducer> reducers, com.google.common.collect.Multimap<com.google.javascript.jscomp.FunctionRewriter.Reducer, com.google.javascript.jscomp.FunctionRewriter.Reduction> reductions) {
			this.reducers = reducers;
			this.reductions = reductions;
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal raversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			for (com.google.javascript.jscomp.FunctionRewriter.Reducer reducer : reducers) {
				com.google.javascript.rhino.Node replacement = reducer.reduce(node);
				if (replacement != node) {
					reductions.put(reducer, new com.google.javascript.jscomp.FunctionRewriter.Reduction(parent, node, replacement));
					return false;
				}
			}
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		}
	}

	abstract static class Reducer {
		abstract java.lang.String getHelperSource();

		abstract com.google.javascript.rhino.Node reduce(com.google.javascript.rhino.Node node);

		protected final com.google.javascript.rhino.Node buildCallNode(java.lang.String methodName, com.google.javascript.rhino.Node argumentNode, int lineno, int charno) {
			com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, lineno, charno);
			call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
			call.addChildToBack(com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, methodName));
			if (argumentNode != null) {
				call.addChildToBack(argumentNode.cloneTree());
			}
			return call;
		}
	}

	private static class EmptyFunctionReducer extends com.google.javascript.jscomp.FunctionRewriter.Reducer {
		static final java.lang.String FACTORY_METHOD_NAME = "JSCompiler_emptyFn";

		static final java.lang.String HELPER_SOURCE = ((("function " + (com.google.javascript.jscomp.FunctionRewriter.EmptyFunctionReducer.FACTORY_METHOD_NAME)) + "() {") + "  return function() {}") + "}";

		@java.lang.Override
		public java.lang.String getHelperSource() {
			return com.google.javascript.jscomp.FunctionRewriter.EmptyFunctionReducer.HELPER_SOURCE;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node reduce(com.google.javascript.rhino.Node node) {
			if (com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node)) {
				return buildCallNode(com.google.javascript.jscomp.FunctionRewriter.EmptyFunctionReducer.FACTORY_METHOD_NAME, null, node.getLineno(), node.getCharno());
			}else {
				return node;
			}
		}
	}

	abstract static class SingleReturnStatementReducer extends com.google.javascript.jscomp.FunctionRewriter.Reducer {
		protected final com.google.javascript.rhino.Node maybeGetSingleReturnRValue(com.google.javascript.rhino.Node functionNode) {
			com.google.javascript.rhino.Node body = functionNode.getLastChild();
			if (!(body.hasOneChild())) {
				return null;
			}
			com.google.javascript.rhino.Node statement = body.getFirstChild();
			if ((statement.getType()) == (com.google.javascript.rhino.Token.RETURN)) {
				return statement.getFirstChild();
			}
			return null;
		}
	}

	private static class IdentityReducer extends com.google.javascript.jscomp.FunctionRewriter.SingleReturnStatementReducer {
		static final java.lang.String FACTORY_METHOD_NAME = "JSCompiler_identityFn";

		static final java.lang.String HELPER_SOURCE = (((((((("function " + (com.google.javascript.jscomp.FunctionRewriter.IdentityReducer.FACTORY_METHOD_NAME)) + "() {") + "  return function(") + (com.google.javascript.jscomp.FunctionRewriter.IdentityReducer.FACTORY_METHOD_NAME)) + "_value) {") + "return ") + (com.google.javascript.jscomp.FunctionRewriter.IdentityReducer.FACTORY_METHOD_NAME)) + "_value}") + "}";

		@java.lang.Override
		public java.lang.String getHelperSource() {
			return com.google.javascript.jscomp.FunctionRewriter.IdentityReducer.HELPER_SOURCE;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node reduce(com.google.javascript.rhino.Node node) {
			if (!(com.google.javascript.jscomp.FunctionRewriter.isReduceableFunctionExpression(node))) {
				return node;
			}
			if (isIdentityFunction(node)) {
				return buildCallNode(com.google.javascript.jscomp.FunctionRewriter.IdentityReducer.FACTORY_METHOD_NAME, null, node.getLineno(), node.getCharno());
			}else {
				return node;
			}
		}

		private boolean isIdentityFunction(com.google.javascript.rhino.Node functionNode) {
			com.google.javascript.rhino.Node argList = functionNode.getFirstChild().getNext();
			com.google.javascript.rhino.Node paramNode = argList.getFirstChild();
			if (paramNode == null) {
				return false;
			}
			com.google.javascript.rhino.Node value = maybeGetSingleReturnRValue(functionNode);
			if (((value != null) && (com.google.javascript.jscomp.NodeUtil.isName(value))) && (value.getString().equals(paramNode.getString()))) {
				return true;
			}
			return false;
		}
	}

	private static class ReturnConstantReducer extends com.google.javascript.jscomp.FunctionRewriter.SingleReturnStatementReducer {
		static final java.lang.String FACTORY_METHOD_NAME = "JSCompiler_returnArg";

		static final java.lang.String HELPER_SOURCE = ((((((("function " + (com.google.javascript.jscomp.FunctionRewriter.ReturnConstantReducer.FACTORY_METHOD_NAME)) + "(") + (com.google.javascript.jscomp.FunctionRewriter.ReturnConstantReducer.FACTORY_METHOD_NAME)) + "_value) {") + "  return function() {return ") + (com.google.javascript.jscomp.FunctionRewriter.ReturnConstantReducer.FACTORY_METHOD_NAME)) + "_value}") + "}";

		@java.lang.Override
		public java.lang.String getHelperSource() {
			return com.google.javascript.jscomp.FunctionRewriter.ReturnConstantReducer.HELPER_SOURCE;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node reduce(com.google.javascript.rhino.Node node) {
			if (!(com.google.javascript.jscomp.FunctionRewriter.isReduceableFunctionExpression(node))) {
				return node;
			}
			com.google.javascript.rhino.Node valueNode = getValueNode(node);
			if (valueNode != null) {
				return buildCallNode(com.google.javascript.jscomp.FunctionRewriter.ReturnConstantReducer.FACTORY_METHOD_NAME, valueNode, node.getLineno(), node.getCharno());
			}else {
				return node;
			}
		}

		private com.google.javascript.rhino.Node getValueNode(com.google.javascript.rhino.Node functionNode) {
			com.google.javascript.rhino.Node value = maybeGetSingleReturnRValue(functionNode);
			if ((value != null) && (com.google.javascript.jscomp.NodeUtil.isImmutableValue(value))) {
				return value;
			}
			return null;
		}
	}

	private static class GetterReducer extends com.google.javascript.jscomp.FunctionRewriter.SingleReturnStatementReducer {
		static final java.lang.String FACTORY_METHOD_NAME = "JSCompiler_get";

		static final java.lang.String HELPER_SOURCE = ((((((("function " + (com.google.javascript.jscomp.FunctionRewriter.GetterReducer.FACTORY_METHOD_NAME)) + "(") + (com.google.javascript.jscomp.FunctionRewriter.GetterReducer.FACTORY_METHOD_NAME)) + "_name) {") + "  return function() {return this[") + (com.google.javascript.jscomp.FunctionRewriter.GetterReducer.FACTORY_METHOD_NAME)) + "_name]}") + "}";

		@java.lang.Override
		public java.lang.String getHelperSource() {
			return com.google.javascript.jscomp.FunctionRewriter.GetterReducer.HELPER_SOURCE;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node reduce(com.google.javascript.rhino.Node node) {
			if (!(com.google.javascript.jscomp.FunctionRewriter.isReduceableFunctionExpression(node))) {
				return node;
			}
			com.google.javascript.rhino.Node propName = getGetPropertyName(node);
			if (propName != null) {
				if ((propName.getType()) != (com.google.javascript.rhino.Token.STRING)) {
					throw new java.lang.IllegalStateException(("Expected STRING, got " + (com.google.javascript.rhino.Token.name(propName.getType()))));
				}
				return buildCallNode(com.google.javascript.jscomp.FunctionRewriter.GetterReducer.FACTORY_METHOD_NAME, propName, node.getLineno(), node.getCharno());
			}else {
				return node;
			}
		}

		private com.google.javascript.rhino.Node getGetPropertyName(com.google.javascript.rhino.Node functionNode) {
			com.google.javascript.rhino.Node value = maybeGetSingleReturnRValue(functionNode);
			if (((value != null) && (com.google.javascript.jscomp.NodeUtil.isGetProp(value))) && (com.google.javascript.jscomp.NodeUtil.isThis(value.getFirstChild()))) {
				return value.getLastChild();
			}
			return null;
		}
	}

	private static class SetterReducer extends com.google.javascript.jscomp.FunctionRewriter.Reducer {
		static final java.lang.String FACTORY_METHOD_NAME = "JSCompiler_set";

		static final java.lang.String HELPER_SOURCE = (((((((((((("function " + (com.google.javascript.jscomp.FunctionRewriter.SetterReducer.FACTORY_METHOD_NAME)) + "(") + (com.google.javascript.jscomp.FunctionRewriter.SetterReducer.FACTORY_METHOD_NAME)) + "_name) {") + "  return function(") + (com.google.javascript.jscomp.FunctionRewriter.SetterReducer.FACTORY_METHOD_NAME)) + "_value) {") + "this[") + (com.google.javascript.jscomp.FunctionRewriter.SetterReducer.FACTORY_METHOD_NAME)) + "_name] = ") + (com.google.javascript.jscomp.FunctionRewriter.SetterReducer.FACTORY_METHOD_NAME)) + "_value}") + "}";

		@java.lang.Override
		public java.lang.String getHelperSource() {
			return com.google.javascript.jscomp.FunctionRewriter.SetterReducer.HELPER_SOURCE;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node reduce(com.google.javascript.rhino.Node node) {
			if (!(com.google.javascript.jscomp.FunctionRewriter.isReduceableFunctionExpression(node))) {
				return node;
			}
			com.google.javascript.rhino.Node propName = getSetPropertyName(node);
			if (propName != null) {
				if ((propName.getType()) != (com.google.javascript.rhino.Token.STRING)) {
					throw new java.lang.IllegalStateException(("Expected STRING, got " + (com.google.javascript.rhino.Token.name(propName.getType()))));
				}
				return buildCallNode(com.google.javascript.jscomp.FunctionRewriter.SetterReducer.FACTORY_METHOD_NAME, propName, node.getLineno(), node.getCharno());
			}else {
				return node;
			}
		}

		private com.google.javascript.rhino.Node getSetPropertyName(com.google.javascript.rhino.Node functionNode) {
			com.google.javascript.rhino.Node body = functionNode.getLastChild();
			if (!(body.hasOneChild())) {
				return null;
			}
			com.google.javascript.rhino.Node argList = functionNode.getFirstChild().getNext();
			com.google.javascript.rhino.Node paramNode = argList.getFirstChild();
			if (paramNode == null) {
				return null;
			}
			com.google.javascript.rhino.Node statement = body.getFirstChild();
			if (!(com.google.javascript.jscomp.NodeUtil.isExprAssign(statement))) {
				return null;
			}
			com.google.javascript.rhino.Node assign = statement.getFirstChild();
			com.google.javascript.rhino.Node lhs = assign.getFirstChild();
			if ((com.google.javascript.jscomp.NodeUtil.isGetProp(lhs)) && (com.google.javascript.jscomp.NodeUtil.isThis(lhs.getFirstChild()))) {
				com.google.javascript.rhino.Node rhs = assign.getLastChild();
				if ((com.google.javascript.jscomp.NodeUtil.isName(rhs)) && (rhs.getString().equals(paramNode.getString()))) {
					com.google.javascript.rhino.Node propertyName = lhs.getLastChild();
					return propertyName;
				}
			}
			return null;
		}
	}
}

