

package com.google.javascript.jscomp;


class FunctionNames implements com.google.javascript.jscomp.CompilerPass , java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private final transient com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionNames.FunctionRecord> functionMap = com.google.common.collect.Maps.newLinkedHashMap();

	private final transient com.google.javascript.jscomp.FunctionNames.FunctionListExtractor functionListExtractor;

	FunctionNames(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.functionListExtractor = new com.google.javascript.jscomp.FunctionNames.FunctionListExtractor(functionMap);
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, functionListExtractor);
		com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer namer = new com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer(functionMap);
		com.google.javascript.jscomp.AnonymousFunctionNamingCallback namingCallback = new com.google.javascript.jscomp.AnonymousFunctionNamingCallback(namer);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, namingCallback);
	}

	public java.lang.Iterable<com.google.javascript.rhino.Node> getFunctionNodeList() {
		return functionMap.keySet();
	}

	public int getFunctionId(com.google.javascript.rhino.Node f) {
		com.google.javascript.jscomp.FunctionNames.FunctionRecord record = functionMap.get(f);
		if (record != null) {
			return record.id;
		}else {
			return -1;
		}
	}

	public java.lang.String getFunctionName(com.google.javascript.rhino.Node f) {
		com.google.javascript.jscomp.FunctionNames.FunctionRecord record = functionMap.get(f);
		if (record == null) {
			return null;
		}
		java.lang.String str = record.name;
		if (str.isEmpty()) {
			str = "<anonymous>";
		}
		com.google.javascript.rhino.Node parent = record.parent;
		if (parent != null) {
			str = ((getFunctionName(parent)) + "::") + str;
		}
		str = str.replaceAll("::this\\.", ".");
		str = str.replaceAll("\\.\\.", ".");
		str = str.replaceFirst("^(<anonymous>::)*", "");
		return str;
	}

	private static class FunctionRecord implements java.io.Serializable {
		private static final long serialVersionUID = 1L;

		public final int id;

		public final com.google.javascript.rhino.Node parent;

		public java.lang.String name;

		FunctionRecord(int id, com.google.javascript.rhino.Node parent, java.lang.String name) {
			this.id = id;
			this.parent = parent;
			com.google.javascript.jscomp.FunctionNames.FunctionRecord.this.name = name;
		}
	}

	private static class FunctionListExtractor extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionNames.FunctionRecord> functionMap;

		private int nextId = 0;

		FunctionListExtractor(java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionNames.FunctionRecord> functionMap) {
			this.functionMap = functionMap;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
				com.google.javascript.rhino.Node functionNameNode = n.getFirstChild();
				java.lang.String functionName = functionNameNode.getString();
				com.google.javascript.rhino.Node enclosingFunction = t.getEnclosingFunction();
				functionMap.put(n, new com.google.javascript.jscomp.FunctionNames.FunctionRecord(nextId, enclosingFunction, functionName));
				(nextId)++;
			}
		}
	}

	private static class FunctionExpressionNamer implements com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer {
		private static final char DELIMITER = '.';

		private static final com.google.javascript.jscomp.NodeNameExtractor extractor = new com.google.javascript.jscomp.NodeNameExtractor(com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.DELIMITER);

		private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionNames.FunctionRecord> functionMap;

		FunctionExpressionNamer(java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.FunctionNames.FunctionRecord> functionMap) {
			this.functionMap = functionMap;
		}

		@java.lang.Override
		public final java.lang.String getName(com.google.javascript.rhino.Node node) {
			return com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.extractor.getName(node);
		}

		@java.lang.Override
		public final void setFunctionName(java.lang.String name, com.google.javascript.rhino.Node fnNode) {
			com.google.javascript.jscomp.FunctionNames.FunctionRecord record = functionMap.get(fnNode);
			assert record != null;
			assert record.name.isEmpty();
			record.name = name;
		}

		@java.lang.Override
		public final java.lang.String getCombinedName(java.lang.String lhs, java.lang.String rhs) {
			return (lhs + (com.google.javascript.jscomp.FunctionNames.FunctionExpressionNamer.DELIMITER)) + rhs;
		}
	}
}

