

package com.google.javascript.jscomp;


class AngularPass extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	final com.google.javascript.jscomp.AbstractCompiler compiler;

	private java.util.List<com.google.javascript.jscomp.AngularPass.NodeContext> injectables = new java.util.ArrayList<com.google.javascript.jscomp.AngularPass.NodeContext>();

	public AngularPass(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	public static final java.lang.String INJECT_PROPERTY_NAME = "$inject";

	static final com.google.javascript.jscomp.DiagnosticType INJECT_IN_NON_GLOBAL_OR_BLOCK_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INJECT_IN_NON_GLOBAL_OR_BLOCK_ERROR", ("@ngInject only applies to functions defined in blocks or " + "global scope."));

	static final com.google.javascript.jscomp.DiagnosticType INJECT_NON_FUNCTION_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INJECT_NON_FUNCTION_ERROR", ("@ngInject can only be used when defining a function or " + "assigning a function expression."));

	static final com.google.javascript.jscomp.DiagnosticType FUNCTION_NAME_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_FUNCTION_NAME_ERROR", "Unable to determine target function name for @ngInject.");

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.AngularPass.this);
		com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
		boolean codeChanged = false;
		for (com.google.javascript.jscomp.AngularPass.NodeContext entry : injectables) {
			java.lang.String name = entry.getName();
			com.google.javascript.rhino.Node fn = entry.getFunctionNode();
			java.util.List<com.google.javascript.rhino.Node> dependencies = createDependenciesList(fn);
			if ((dependencies.size()) == 0) {
				continue;
			}
			com.google.javascript.rhino.Node dependenciesArray = com.google.javascript.rhino.IR.arraylit(dependencies.toArray(new com.google.javascript.rhino.Node[dependencies.size()]));
			com.google.javascript.rhino.Node statement = com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.IR.getelem(com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(convention, name), com.google.javascript.rhino.IR.string(com.google.javascript.jscomp.AngularPass.INJECT_PROPERTY_NAME)), dependenciesArray));
			com.google.javascript.rhino.Node target = entry.getTarget();
			target.getParent().addChildAfter(statement, target);
			codeChanged = true;
		}
		if (codeChanged) {
			compiler.reportCodeChange();
		}
	}

	private java.util.List<com.google.javascript.rhino.Node> createDependenciesList(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(n.isFunction());
		com.google.javascript.rhino.Node params = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(n);
		if (params != null) {
			return createStringsFromParamList(params);
		}
		return com.google.common.collect.Lists.newArrayList();
	}

	private java.util.List<com.google.javascript.rhino.Node> createStringsFromParamList(com.google.javascript.rhino.Node params) {
		com.google.javascript.rhino.Node param = params.getFirstChild();
		java.util.ArrayList<com.google.javascript.rhino.Node> names = com.google.common.collect.Lists.newArrayList();
		while ((param != null) && (param.isName())) {
			names.add(com.google.javascript.rhino.IR.string(param.getString()).srcref(param));
			param = param.getNext();
		} 
		return names;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.JSDocInfo docInfo = n.getJSDocInfo();
		if ((docInfo != null) && (docInfo.isNgInject())) {
			addNode(n, t);
		}
	}

	private void addNode(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.rhino.Node target = null;
		com.google.javascript.rhino.Node fn = null;
		java.lang.String name = null;
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.ASSIGN :
				name = n.getFirstChild().getQualifiedName();
				fn = n;
				while (fn.isAssign()) {
					fn = fn.getLastChild();
				} 
				target = n.getParent();
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				name = com.google.javascript.jscomp.NodeUtil.getFunctionName(n);
				fn = n;
				target = n;
				break;
			case com.google.javascript.rhino.Token.VAR :
				name = n.getFirstChild().getString();
				fn = getDeclarationRValue(n);
				target = n;
				break;
		}
		if ((!(target.getParent().isScript())) && (!(target.getParent().isBlock()))) {
			compiler.report(t.makeError(n, com.google.javascript.jscomp.AngularPass.INJECT_IN_NON_GLOBAL_OR_BLOCK_ERROR));
			return ;
		}
		if ((fn == null) || (!(fn.isFunction()))) {
			compiler.report(t.makeError(n, com.google.javascript.jscomp.AngularPass.INJECT_NON_FUNCTION_ERROR));
			return ;
		}
		com.google.common.base.Preconditions.checkNotNull(name);
		injectables.add(new com.google.javascript.jscomp.AngularPass.NodeContext(name, n, fn, target));
	}

	private com.google.javascript.rhino.Node getDeclarationRValue(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkNotNull(n);
		com.google.common.base.Preconditions.checkArgument(n.isVar());
		n = n.getFirstChild().getFirstChild();
		if (n == null) {
			return null;
		}
		while (n.isAssign()) {
			n = n.getLastChild();
		} 
		return n;
	}

	class NodeContext {
		private java.lang.String name;

		private com.google.javascript.rhino.Node node;

		private com.google.javascript.rhino.Node functionNode;

		private com.google.javascript.rhino.Node target;

		public NodeContext(java.lang.String name, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node functionNode, com.google.javascript.rhino.Node target) {
			com.google.javascript.jscomp.AngularPass.NodeContext.this.name = name;
			com.google.javascript.jscomp.AngularPass.NodeContext.this.node = node;
			com.google.javascript.jscomp.AngularPass.NodeContext.this.functionNode = functionNode;
			com.google.javascript.jscomp.AngularPass.NodeContext.this.target = target;
		}

		public java.lang.String getName() {
			return name;
		}

		public com.google.javascript.rhino.Node getNode() {
			return node;
		}

		public com.google.javascript.rhino.Node getFunctionNode() {
			return functionNode;
		}

		public com.google.javascript.rhino.Node getTarget() {
			return target;
		}
	}
}

