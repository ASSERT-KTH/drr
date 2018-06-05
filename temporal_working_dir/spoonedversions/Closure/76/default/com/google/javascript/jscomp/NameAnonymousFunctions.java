

package com.google.javascript.jscomp;


class NameAnonymousFunctions implements com.google.javascript.jscomp.CompilerPass {
	private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.NameAnonymousFunctions.class.getName());

	static final char DELIMITER = '$';

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private int namedCount = 0;

	private int bytesUsed = 0;

	NameAnonymousFunctions(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.AnonymousFunctionNamingCallback namingCallback = new com.google.javascript.jscomp.AnonymousFunctionNamingCallback(new com.google.javascript.jscomp.NameAnonymousFunctions.AnonymousFunctionNamer());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, namingCallback);
		com.google.javascript.jscomp.NameAnonymousFunctions.logger.info((((("Named " + (namedCount)) + " anon functions using ") + (bytesUsed)) + " bytes"));
	}

	private class AnonymousFunctionNamer implements com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer {
		private com.google.javascript.jscomp.NodeNameExtractor nameExtractor;

		AnonymousFunctionNamer() {
			com.google.javascript.jscomp.NameAnonymousFunctions.AnonymousFunctionNamer.this.nameExtractor = new com.google.javascript.jscomp.NodeNameExtractor(com.google.javascript.jscomp.NameAnonymousFunctions.DELIMITER);
		}

		private java.lang.String getLikelyNonConflictingName(java.lang.String name) {
			return ((com.google.javascript.jscomp.NameAnonymousFunctions.DELIMITER) + name) + (com.google.javascript.jscomp.NameAnonymousFunctions.DELIMITER);
		}

		@java.lang.Override
		public final java.lang.String getName(com.google.javascript.rhino.Node node) {
			return nameExtractor.getName(node);
		}

		@java.lang.Override
		public final void setFunctionName(java.lang.String name, com.google.javascript.rhino.Node fnNode) {
			com.google.javascript.rhino.Node fnNameNode = fnNode.getFirstChild();
			java.lang.String uniqueName = getLikelyNonConflictingName(name);
			fnNameNode.setString(uniqueName);
			compiler.reportCodeChange();
			(namedCount)++;
			bytesUsed += uniqueName.length();
		}

		public final java.lang.String getCombinedName(java.lang.String lhs, java.lang.String rhs) {
			return (lhs + (com.google.javascript.jscomp.NameAnonymousFunctions.DELIMITER)) + rhs;
		}
	}
}

