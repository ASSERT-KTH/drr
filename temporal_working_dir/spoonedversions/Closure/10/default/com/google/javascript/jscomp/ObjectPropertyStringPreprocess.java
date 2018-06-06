

package com.google.javascript.jscomp;


public class ObjectPropertyStringPreprocess implements com.google.javascript.jscomp.CompilerPass {
	static final java.lang.String OBJECT_PROPERTY_STRING = "goog.testing.ObjectPropertyString";

	public static final java.lang.String EXTERN_OBJECT_PROPERTY_STRING = "JSCompiler_ObjectPropertyString";

	static final com.google.javascript.jscomp.DiagnosticType INVALID_NUM_ARGUMENTS_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_OBJECT_PROPERTY_STRING_NUM_ARGS", ("goog.testing.ObjectPropertyString instantiated with \"{0}\" " + "arguments, expected 2."));

	static final com.google.javascript.jscomp.DiagnosticType QUALIFIED_NAME_EXPECTED_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_OBJECT_PROPERTY_STRING_QUALIFIED_NAME_EXPECTED", ("goog.testing.ObjectPropertyString instantiated with invalid " + "argument, qualified name expected. Was \"{0}\"."));

	static final com.google.javascript.jscomp.DiagnosticType STRING_LITERAL_EXPECTED_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_OBJECT_PROPERTY_STRING_STRING_LITERAL_EXPECTED", ("goog.testing.ObjectPropertyString instantiated with invalid " + "argument, string literal expected. Was \"{0}\"."));

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	ObjectPropertyStringPreprocess(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		addExternDeclaration(externs, com.google.javascript.rhino.IR.var(com.google.javascript.rhino.IR.name(com.google.javascript.jscomp.ObjectPropertyStringPreprocess.EXTERN_OBJECT_PROPERTY_STRING)));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ObjectPropertyStringPreprocess.Callback());
	}

	private void addExternDeclaration(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node declarationStmt) {
		com.google.javascript.rhino.Node script = externs.getLastChild();
		if ((script == null) || (!(script.isScript()))) {
			script = com.google.javascript.rhino.IR.script();
			externs.addChildToBack(script);
		}
		script.addChildToBack(declarationStmt);
	}

	private class Callback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (com.google.javascript.jscomp.ObjectPropertyStringPreprocess.OBJECT_PROPERTY_STRING.equals(n.getQualifiedName())) {
				com.google.javascript.rhino.Node newName = com.google.javascript.rhino.IR.name(com.google.javascript.jscomp.ObjectPropertyStringPreprocess.EXTERN_OBJECT_PROPERTY_STRING);
				newName.copyInformationFrom(n);
				parent.replaceChild(n, newName);
				compiler.reportCodeChange();
				return ;
			}
			if (!(n.isNew())) {
				return ;
			}
			com.google.javascript.rhino.Node objectName = n.getFirstChild();
			if (!(com.google.javascript.jscomp.ObjectPropertyStringPreprocess.EXTERN_OBJECT_PROPERTY_STRING.equals(objectName.getQualifiedName()))) {
				return ;
			}
			if ((n.getChildCount()) != 3) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.ObjectPropertyStringPreprocess.INVALID_NUM_ARGUMENTS_ERROR, ("" + (n.getChildCount()))));
				return ;
			}
			com.google.javascript.rhino.Node firstArgument = objectName.getNext();
			if (!(firstArgument.isQualifiedName())) {
				compiler.report(t.makeError(firstArgument, com.google.javascript.jscomp.ObjectPropertyStringPreprocess.QUALIFIED_NAME_EXPECTED_ERROR, com.google.javascript.rhino.Token.name(firstArgument.getType())));
				return ;
			}
			com.google.javascript.rhino.Node secondArgument = firstArgument.getNext();
			if (!(secondArgument.isString())) {
				compiler.report(t.makeError(secondArgument, com.google.javascript.jscomp.ObjectPropertyStringPreprocess.STRING_LITERAL_EXPECTED_ERROR, com.google.javascript.rhino.Token.name(secondArgument.getType())));
				return ;
			}
			com.google.javascript.rhino.Node newFirstArgument = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), compiler.getCodingConvention().getGlobalObject()).srcrefTree(firstArgument);
			com.google.javascript.rhino.Node newSecondArgument = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), (((firstArgument.getQualifiedName()) + ".") + (firstArgument.getNext().getString()))).srcrefTree(secondArgument);
			n.replaceChild(firstArgument, newFirstArgument);
			n.replaceChild(secondArgument, newSecondArgument);
			compiler.reportCodeChange();
		}
	}
}

