

package com.google.javascript.jscomp;


class ReplaceIdGenerators implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType NON_GLOBAL_ID_GENERATOR_CALL = com.google.javascript.jscomp.DiagnosticType.error("JSC_NON_GLOBAL_ID_GENERATOR_CALL", "Id generator call must be in the global scope");

	static final com.google.javascript.jscomp.DiagnosticType CONDITIONAL_ID_GENERATOR_CALL = com.google.javascript.jscomp.DiagnosticType.error("JSC_CONDITIONAL_ID_GENERATOR_CALL", "Id generator call must be unconditional");

	static final com.google.javascript.jscomp.DiagnosticType CONFLICTING_GENERATOR_TYPE = com.google.javascript.jscomp.DiagnosticType.error("JSC_CONFLICTING_ID_GENERATOR_TYPE", "Id generator can only be consistent or inconsistent");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.NameGenerator> nameGenerators;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.NameGenerator> consistNameGenerators;

	private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> consistNameMap;

	private final java.util.Map<java.lang.String, java.util.List<com.google.javascript.jscomp.ReplaceIdGenerators.Replacement>> idGeneratorMaps;

	public ReplaceIdGenerators(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.Set<java.lang.String> idGens) {
		this.compiler = compiler;
		nameGenerators = com.google.common.collect.Maps.newLinkedHashMap();
		consistNameGenerators = com.google.common.collect.Maps.newLinkedHashMap();
		idGeneratorMaps = com.google.common.collect.Maps.newLinkedHashMap();
		consistNameMap = com.google.common.collect.Maps.newLinkedHashMap();
		if (idGens != null) {
			for (java.lang.String gen : idGens) {
				nameGenerators.put(gen, new com.google.javascript.jscomp.NameGenerator(java.util.Collections.<java.lang.String>emptySet(), "", null));
				idGeneratorMaps.put(gen, com.google.common.collect.Lists.<com.google.javascript.jscomp.ReplaceIdGenerators.Replacement>newLinkedList());
			}
		}
	}

	private class GatherGenerators extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.JSDocInfo doc = n.getJSDocInfo();
			if (doc == null) {
				return ;
			}
			if ((!(doc.isConsistentIdGenerator())) && (!(doc.isIdGenerator()))) {
				return ;
			}
			if ((doc.isConsistentIdGenerator()) && (doc.isIdGenerator())) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceIdGenerators.CONFLICTING_GENERATOR_TYPE));
			}
			java.lang.String name = null;
			if (n.isAssign()) {
				name = n.getFirstChild().getQualifiedName();
			}else
				if (n.isVar()) {
					name = n.getFirstChild().getString();
				}else
					if (n.isFunction()) {
						name = n.getFirstChild().getString();
						if (name.isEmpty()) {
							return ;
						}
					}
				
			
			if (doc.isConsistentIdGenerator()) {
				consistNameGenerators.put(name, new com.google.javascript.jscomp.NameGenerator(java.util.Collections.<java.lang.String>emptySet(), "", null));
				consistNameMap.put(name, com.google.common.collect.Maps.<java.lang.String, java.lang.String>newLinkedHashMap());
			}else {
				nameGenerators.put(name, new com.google.javascript.jscomp.NameGenerator(java.util.Collections.<java.lang.String>emptySet(), "", null));
			}
			idGeneratorMaps.put(name, com.google.common.collect.Lists.<com.google.javascript.jscomp.ReplaceIdGenerators.Replacement>newArrayList());
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ReplaceIdGenerators.GatherGenerators());
		if ((!(nameGenerators.isEmpty())) || (!(com.google.javascript.jscomp.ReplaceIdGenerators.this.consistNameGenerators.isEmpty()))) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ReplaceIdGenerators.ReplaceGenerators());
		}
	}

	private class ReplaceGenerators extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(n.isCall())) {
				return ;
			}
			java.lang.String callName = n.getFirstChild().getQualifiedName();
			boolean consistent = false;
			com.google.javascript.jscomp.NameGenerator nameGenerator = nameGenerators.get(callName);
			if (nameGenerator == null) {
				nameGenerator = consistNameGenerators.get(callName);
				consistent = true;
			}
			if (nameGenerator == null) {
				return ;
			}
			if ((!(t.inGlobalScope())) && (!consistent)) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceIdGenerators.NON_GLOBAL_ID_GENERATOR_CALL));
				return ;
			}
			if (!consistent) {
				for (com.google.javascript.rhino.Node ancestor : n.getAncestors()) {
					if (com.google.javascript.jscomp.NodeUtil.isControlStructure(ancestor)) {
						compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceIdGenerators.CONDITIONAL_ID_GENERATOR_CALL));
						return ;
					}
				}
			}
			com.google.javascript.rhino.Node id = n.getFirstChild().getNext();
			if (!(id.isString())) {
				return ;
			}
			java.util.List<com.google.javascript.jscomp.ReplaceIdGenerators.Replacement> idGeneratorMap = idGeneratorMaps.get(callName);
			java.lang.String rename = null;
			if (consistent) {
				java.util.Map<java.lang.String, java.lang.String> entry = consistNameMap.get(callName);
				rename = entry.get(id.getString());
				if (rename == null) {
					rename = nameGenerator.generateNextName();
					entry.put(id.getString(), rename);
				}
			}else {
				rename = nameGenerator.generateNextName();
			}
			parent.replaceChild(n, com.google.javascript.rhino.IR.string(rename));
			idGeneratorMap.add(new com.google.javascript.jscomp.ReplaceIdGenerators.Replacement(rename, t.getSourceName(), t.getLineNumber()));
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

