

package com.google.javascript.jscomp;


class ReplaceIdGenerators implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType NON_GLOBAL_ID_GENERATOR_CALL = com.google.javascript.jscomp.DiagnosticType.error("JSC_NON_GLOBAL_ID_GENERATOR_CALL", "Id generator call must be in the global scope");

	static final com.google.javascript.jscomp.DiagnosticType CONDITIONAL_ID_GENERATOR_CALL = com.google.javascript.jscomp.DiagnosticType.error("JSC_CONDITIONAL_ID_GENERATOR_CALL", "Id generator call must be unconditional");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.NameGenerator> nameGenerators;

	private final java.util.Map<java.lang.String, java.util.List<com.google.javascript.jscomp.ReplaceIdGenerators.Replacement>> idGeneratorMaps;

	public ReplaceIdGenerators(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.Set<java.lang.String> idGenerators) {
		this.compiler = compiler;
		nameGenerators = com.google.common.collect.Maps.newHashMap();
		idGeneratorMaps = com.google.common.collect.Maps.newLinkedHashMap();
		for (java.lang.String idGenerator : idGenerators) {
			nameGenerators.put(idGenerator, new com.google.javascript.jscomp.NameGenerator(java.util.Collections.<java.lang.String>emptySet(), "", null));
			idGeneratorMaps.put(idGenerator, com.google.common.collect.Lists.<com.google.javascript.jscomp.ReplaceIdGenerators.Replacement>newArrayList());
		}
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ReplaceIdGenerators.Callback());
	}

	private class Callback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) != (com.google.javascript.rhino.Token.CALL)) {
				return ;
			}
			java.lang.String callName = n.getFirstChild().getQualifiedName();
			com.google.javascript.jscomp.NameGenerator nameGenerator = nameGenerators.get(callName);
			if (nameGenerator == null) {
				return ;
			}
			java.util.List<com.google.javascript.jscomp.ReplaceIdGenerators.Replacement> idGeneratorMap = idGeneratorMaps.get(callName);
			if (!(t.inGlobalScope())) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceIdGenerators.NON_GLOBAL_ID_GENERATOR_CALL));
				return ;
			}
			for (com.google.javascript.rhino.Node ancestor : n.getAncestors()) {
				if (com.google.javascript.jscomp.NodeUtil.isControlStructure(ancestor)) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceIdGenerators.CONDITIONAL_ID_GENERATOR_CALL));
					return ;
				}
			}
			java.lang.String nextName = nameGenerator.generateNextName();
			parent.replaceChild(n, com.google.javascript.rhino.Node.newString(nextName));
			idGeneratorMap.add(new com.google.javascript.jscomp.ReplaceIdGenerators.Replacement(nextName, t.getSourceName(), t.getLineNumber()));
			compiler.reportCodeChange();
		}
	}

	public java.lang.String getIdGeneratorMap() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		for (java.util.Map.Entry<java.lang.String, java.util.List<com.google.javascript.jscomp.ReplaceIdGenerators.Replacement>> entry : idGeneratorMaps.entrySet()) {
			sb.append("[");
			sb.append(entry.getKey());
			sb.append("]\n\n");
			for (com.google.javascript.jscomp.ReplaceIdGenerators.Replacement replacement : entry.getValue()) {
				sb.append(replacement.toString());
				sb.append("\n");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	private static class Replacement {
		private final java.lang.String name;

		private final java.lang.String sourceName;

		private final int lineNumber;

		private Replacement(java.lang.String name, java.lang.String sourceName, int lineNumber) {
			this.name = name;
			this.sourceName = sourceName;
			this.lineNumber = lineNumber;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return ((((name) + ":") + (sourceName)) + ":") + (lineNumber);
		}
	}
}

