

package com.google.javascript.jscomp;


class InstrumentFunctions implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.FunctionNames functionNames;

	private final java.lang.String templateFilename;

	private final java.lang.String appNameStr;

	private final java.lang.String initCodeSource;

	private final java.lang.String definedFunctionName;

	private final java.lang.String reportFunctionName;

	private final java.lang.String reportFunctionExitName;

	private final java.lang.String appNameSetter;

	private final java.util.List<java.lang.String> declarationsToRemove;

	InstrumentFunctions(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.FunctionNames functionNames, java.lang.String templateFilename, java.lang.String appNameStr, java.lang.Readable readable) {
		this.compiler = compiler;
		this.functionNames = functionNames;
		this.templateFilename = templateFilename;
		this.appNameStr = appNameStr;
		com.google.javascript.jscomp.Instrumentation.Builder builder = com.google.javascript.jscomp.Instrumentation.newBuilder();
		try {
			com.google.protobuf.TextFormat.merge(readable, builder);
		} catch (java.io.IOException e) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.RhinoErrorReporter.PARSE_ERROR, ("Error reading instrumentation template protobuf at " + templateFilename)));
			this.initCodeSource = "";
			this.definedFunctionName = "";
			this.reportFunctionName = "";
			this.reportFunctionExitName = "";
			this.appNameSetter = "";
			this.declarationsToRemove = com.google.common.collect.Lists.newArrayList();
			return ;
		}
		com.google.javascript.jscomp.Instrumentation template = builder.build();
		java.lang.StringBuilder initCodeSourceBuilder = new java.lang.StringBuilder();
		for (java.lang.String line : template.getInitList()) {
			initCodeSourceBuilder.append(line).append("\n");
		}
		this.initCodeSource = initCodeSourceBuilder.toString();
		this.definedFunctionName = template.getReportDefined();
		this.reportFunctionName = template.getReportCall();
		this.reportFunctionExitName = template.getReportExit();
		this.appNameSetter = template.getAppNameSetter();
		this.declarationsToRemove = com.google.common.collect.ImmutableList.copyOf(template.getDeclarationToRemoveList());
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.rhino.Node initCode = null;
		if (!(initCodeSource.isEmpty())) {
			com.google.javascript.rhino.Node initCodeRoot = compiler.parseSyntheticCode(((templateFilename) + ":init"), initCodeSource);
			if ((initCodeRoot != null) && ((initCodeRoot.getFirstChild()) != null)) {
				initCode = initCodeRoot.removeChildren();
			}else {
				return ;
			}
		}
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.InstrumentFunctions.RemoveCallback(declarationsToRemove));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.InstrumentFunctions.InstrumentCallback());
		if (!(appNameSetter.isEmpty())) {
			com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, appNameSetter), com.google.javascript.rhino.Node.newString(appNameStr));
			call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
			com.google.javascript.rhino.Node expr = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, call);
			com.google.javascript.rhino.Node addingRoot = compiler.getNodeForCodeInsertion(null);
			addingRoot.addChildrenToFront(expr);
			compiler.reportCodeChange();
		}
		if (initCode != null) {
			com.google.javascript.rhino.Node addingRoot = compiler.getNodeForCodeInsertion(null);
			addingRoot.addChildrenToFront(initCode);
			compiler.reportCodeChange();
		}
	}

	private static class RemoveCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private final java.util.List<java.lang.String> removable;

		RemoveCallback(java.util.List<java.lang.String> removable) {
			this.removable = removable;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (com.google.javascript.jscomp.NodeUtil.isVarDeclaration(n)) {
				if (removable.contains(n.getString())) {
					parent.removeChild(n);
					if (!(parent.hasChildren())) {
						parent.getParent().removeChild(parent);
					}
				}
			}
		}
	}

	private class InstrumentReturns implements com.google.javascript.jscomp.NodeTraversal.Callback {
		private final int functionId;

		InstrumentReturns(int functionId) {
			this.functionId = functionId;
		}

		void process(com.google.javascript.rhino.Node body) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, body, com.google.javascript.jscomp.InstrumentFunctions.InstrumentReturns.this);
			if (!(allPathsReturn(body))) {
				com.google.javascript.rhino.Node call = newReportFunctionExitNode();
				com.google.javascript.rhino.Node expr = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, call);
				body.addChildToBack(expr);
				compiler.reportCodeChange();
			}
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			return (n.getType()) != (com.google.javascript.rhino.Token.FUNCTION);
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) != (com.google.javascript.rhino.Token.RETURN)) {
				return ;
			}
			com.google.javascript.rhino.Node call = newReportFunctionExitNode();
			com.google.javascript.rhino.Node returnRhs = n.removeFirstChild();
			if (returnRhs != null) {
				call.addChildToBack(returnRhs);
			}
			n.addChildToFront(call);
			compiler.reportCodeChange();
		}

		private com.google.javascript.rhino.Node newReportFunctionExitNode() {
			com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, reportFunctionExitName), com.google.javascript.rhino.Node.newNumber(functionId));
			call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
			return call;
		}

		private boolean allPathsReturn(com.google.javascript.rhino.Node block) {
			com.google.javascript.jscomp.ControlFlowAnalysis cfa = new com.google.javascript.jscomp.ControlFlowAnalysis(compiler, false, false);
			cfa.process(null, block);
			com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg = cfa.getCfg();
			com.google.javascript.rhino.Node returnPathsParent = cfg.getImplicitReturn().getValue();
			for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> pred : cfg.getDirectedPredNodes(returnPathsParent)) {
				com.google.javascript.rhino.Node n = pred.getValue();
				if ((n.getType()) != (com.google.javascript.rhino.Token.RETURN)) {
					return false;
				}
			}
			return true;
		}
	}

	private class InstrumentCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) != (com.google.javascript.rhino.Token.FUNCTION)) {
				return ;
			}
			int id = functionNames.getFunctionId(n);
			if (id < 0) {
				return ;
			}
			if (!(reportFunctionName.isEmpty())) {
				com.google.javascript.rhino.Node body = n.getFirstChild().getNext().getNext();
				com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, reportFunctionName), com.google.javascript.rhino.Node.newNumber(id));
				call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
				com.google.javascript.rhino.Node expr = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, call);
				body.addChildToFront(expr);
				compiler.reportCodeChange();
			}
			if (!(reportFunctionExitName.isEmpty())) {
				com.google.javascript.rhino.Node body = n.getFirstChild().getNext().getNext();
				new com.google.javascript.jscomp.InstrumentFunctions.InstrumentReturns(id).process(body);
			}
			if (!(definedFunctionName.isEmpty())) {
				com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, definedFunctionName), com.google.javascript.rhino.Node.newNumber(id));
				call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
				com.google.javascript.rhino.Node expr = com.google.javascript.jscomp.NodeUtil.newExpr(call);
				com.google.javascript.rhino.Node addingRoot = null;
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
					com.google.javascript.jscomp.JSModule module = t.getModule();
					addingRoot = compiler.getNodeForCodeInsertion(module);
					addingRoot.addChildToFront(expr);
				}else {
					com.google.javascript.rhino.Node beforeChild = n;
					for (com.google.javascript.rhino.Node ancestor : n.getAncestors()) {
						int type = ancestor.getType();
						if ((type == (com.google.javascript.rhino.Token.BLOCK)) || (type == (com.google.javascript.rhino.Token.SCRIPT))) {
							addingRoot = ancestor;
							break;
						}
						beforeChild = ancestor;
					}
					addingRoot.addChildBefore(expr, beforeChild);
				}
				compiler.reportCodeChange();
			}
		}
	}
}

