

package com.google.javascript.jscomp.jsonml;


public class JsonMLAst implements com.google.javascript.jscomp.SourceAst {
	private static final long serialVersionUID = 1L;

	private static final java.lang.String DEFAULT_SOURCE_NAME = "[[jsonmlsource]]";

	private com.google.javascript.jscomp.jsonml.JsonML jsonml;

	private com.google.javascript.rhino.Node root;

	private final com.google.javascript.jscomp.SourceFile sourceFile;

	public JsonMLAst(com.google.javascript.jscomp.jsonml.JsonML jsonml) {
		com.google.javascript.jscomp.jsonml.JsonMLAst.this.jsonml = jsonml;
		this.sourceFile = new com.google.javascript.jscomp.SourceFile(getSourceName());
	}

	@java.lang.Override
	public void clearAst() {
		root = null;
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getAstRoot(com.google.javascript.jscomp.AbstractCompiler compiler) {
		if ((root) == null) {
			createAst(compiler);
		}
		return root;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.SourceFile getSourceFile() {
		return null;
	}

	@java.lang.Override
	public void setSourceFile(com.google.javascript.jscomp.SourceFile file) {
		throw new java.lang.UnsupportedOperationException("JsonMLAst cannot be associated with a SourceFile instance.");
	}

	public java.lang.String getSourceName() {
		java.lang.Object obj = jsonml.getAttribute(com.google.javascript.jscomp.jsonml.TagAttr.SOURCE);
		if (obj instanceof java.lang.String) {
			return ((java.lang.String) (obj));
		}else {
			return com.google.javascript.jscomp.jsonml.JsonMLAst.DEFAULT_SOURCE_NAME;
		}
	}

	private void createAst(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.jsonml.Reader translator = new com.google.javascript.jscomp.jsonml.Reader();
		translator.setRootElement(jsonml);
		try {
			root = translator.parse(compiler);
			root.setStaticSourceFile(sourceFile);
			new com.google.javascript.jscomp.AstValidator().validateScript(root);
		} catch (com.google.javascript.jscomp.jsonml.JsonMLException e) {
		}
	}

	public com.google.javascript.jscomp.jsonml.JsonML convertToJsonML() {
		if ((root) != null) {
			com.google.javascript.jscomp.jsonml.Writer converter = new com.google.javascript.jscomp.jsonml.Writer();
			return converter.processAst(root);
		}
		return null;
	}

	public com.google.javascript.jscomp.jsonml.JsonML getElementPreOrder(int n) {
		com.google.common.base.Preconditions.checkState(((jsonml) != null));
		if (n == 0) {
			return jsonml;
		}
		java.util.Deque<com.google.javascript.jscomp.jsonml.JsonMLAst.WalkHelper> stack = new java.util.ArrayDeque<com.google.javascript.jscomp.jsonml.JsonMLAst.WalkHelper>();
		stack.push(new com.google.javascript.jscomp.jsonml.JsonMLAst.WalkHelper(jsonml, 0));
		int i = 0;
		while ((i <= n) && (!(stack.isEmpty()))) {
			com.google.javascript.jscomp.jsonml.JsonMLAst.WalkHelper current = stack.pop();
			com.google.javascript.jscomp.jsonml.JsonML element = current.element;
			java.lang.Integer childno = current.childno;
			if (childno < (element.childrenSize())) {
				stack.push(new com.google.javascript.jscomp.jsonml.JsonMLAst.WalkHelper(element, (childno + 1)));
				i++;
				element = element.getChild(childno);
				if (i == n) {
					return element;
				}
				stack.push(new com.google.javascript.jscomp.jsonml.JsonMLAst.WalkHelper(element, 0));
			}
		} 
		return null;
	}

	private static class WalkHelper {
		final com.google.javascript.jscomp.jsonml.JsonML element;

		final int childno;

		WalkHelper(com.google.javascript.jscomp.jsonml.JsonML element, int childno) {
			this.element = element;
			this.childno = childno;
		}
	}
}

