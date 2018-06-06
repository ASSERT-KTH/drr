

package com.google.javascript.jscomp;


class NameAnonymousFunctionsMapped implements com.google.javascript.jscomp.CompilerPass {
	private static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.javascript.jscomp.NameAnonymousFunctionsMapped.class.getName());

	static final char PREFIX = '$';

	static final java.lang.String PREFIX_STRING = "$";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.NameGenerator nameGenerator;

	private final com.google.javascript.jscomp.VariableMap previousMap;

	private final java.util.Map<java.lang.String, java.lang.String> renameMap;

	private int namedCount = 0;

	private int bytesUsed = 0;

	NameAnonymousFunctionsMapped(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.VariableMap previousMap) {
		this.compiler = compiler;
		java.util.Set<java.lang.String> reserved = previousMap != null ? previousMap.getNewNameToOriginalNameMap().keySet() : java.util.Collections.<java.lang.String>emptySet();
		this.nameGenerator = new com.google.javascript.jscomp.NameGenerator(reserved, com.google.javascript.jscomp.NameAnonymousFunctionsMapped.PREFIX_STRING, null);
		this.previousMap = previousMap;
		this.renameMap = com.google.common.collect.Maps.newHashMap();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.AnonymousFunctionNamingCallback namingCallback = new com.google.javascript.jscomp.AnonymousFunctionNamingCallback(new com.google.javascript.jscomp.NameAnonymousFunctionsMapped.MappedFunctionNamer());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, namingCallback);
		com.google.javascript.jscomp.NameAnonymousFunctionsMapped.logger.fine((((("Named " + (namedCount)) + " anon functions using ") + (bytesUsed)) + " bytes"));
		if ((namedCount) > 0) {
			compiler.reportCodeChange();
		}
	}

	private class MappedFunctionNamer implements com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer {
		static final char DELIMITER = '.';

		@java.lang.Override
		public final java.lang.String getName(com.google.javascript.rhino.Node node) {
			switch (node.getType()) {
				case com.google.javascript.rhino.Token.NAME :
				case com.google.javascript.rhino.Token.STRING :
				case com.google.javascript.rhino.Token.STRING_KEY :
					return node.getString();
				default :
					return new com.google.javascript.jscomp.CodePrinter.Builder(node).build();
			}
		}

		@java.lang.Override
		public final void setFunctionName(java.lang.String name, com.google.javascript.rhino.Node fnNode) {
			com.google.javascript.rhino.Node fnNameNode = fnNode.getFirstChild();
			java.lang.String newName = getAlternateName(name);
			fnNameNode.setString(newName);
			(namedCount)++;
			bytesUsed += newName.length();
		}

		java.lang.String getAlternateName(java.lang.String name) {
			java.lang.String newName = renameMap.get(name);
			if (newName == null) {
				if ((previousMap) != null) {
					newName = previousMap.lookupNewName(name);
				}
				if (newName == null) {
					newName = nameGenerator.generateNextName();
				}
				renameMap.put(name, newName);
			}
			return newName;
		}

		@java.lang.Override
		public final java.lang.String getCombinedName(java.lang.String lhs, java.lang.String rhs) {
			return (lhs + (com.google.javascript.jscomp.NameAnonymousFunctionsMapped.MappedFunctionNamer.DELIMITER)) + rhs;
		}
	}

	com.google.javascript.jscomp.VariableMap getFunctionMap() {
		return new com.google.javascript.jscomp.VariableMap(com.google.common.collect.ImmutableMap.copyOf(renameMap));
	}
}

