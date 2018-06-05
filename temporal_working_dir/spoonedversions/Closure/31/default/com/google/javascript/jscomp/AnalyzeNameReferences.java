

package com.google.javascript.jscomp;


class AnalyzeNameReferences implements com.google.javascript.jscomp.CompilerPass {
	private com.google.javascript.jscomp.NameReferenceGraph graph;

	private final com.google.javascript.jscomp.JSModuleGraph moduleGraph;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	AnalyzeNameReferences(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		this.moduleGraph = compiler.getModuleGraph();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NameReferenceGraphConstruction gc = new com.google.javascript.jscomp.NameReferenceGraphConstruction(compiler);
		gc.process(externs, root);
		graph = gc.getNameReferenceGraph();
		com.google.javascript.jscomp.graph.FixedPointGraphTraversal<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> t = com.google.javascript.jscomp.graph.FixedPointGraphTraversal.newTraversal(new com.google.javascript.jscomp.AnalyzeNameReferences.PropagateReferences());
		getInfo(graph.MAIN).markReference(null);
		t.computeFixedPoint(graph, com.google.common.collect.Sets.newHashSet(graph.MAIN));
	}

	public com.google.javascript.jscomp.NameReferenceGraph getGraph() {
		return graph;
	}

	private class PropagateReferences implements com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> {
		@java.lang.Override
		public boolean traverseEdge(com.google.javascript.jscomp.NameReferenceGraph.Name start, com.google.javascript.jscomp.NameReferenceGraph.Reference edge, com.google.javascript.jscomp.NameReferenceGraph.Name dest) {
			com.google.javascript.jscomp.AnalyzeNameReferences.NameInfo startInfo = getInfo(start);
			com.google.javascript.jscomp.AnalyzeNameReferences.NameInfo destInfo = getInfo(dest);
			if (startInfo.isReferenced()) {
				com.google.javascript.jscomp.JSModule startModule = startInfo.getDeepestCommonModuleRef();
				if ((startModule != null) && (moduleGraph.dependsOn(startModule, edge.getModule()))) {
					return destInfo.markReference(startModule);
				}else {
					return destInfo.markReference(edge.getModule());
				}
			}
			return false;
		}
	}

	private com.google.javascript.jscomp.AnalyzeNameReferences.NameInfo getInfo(com.google.javascript.jscomp.NameReferenceGraph.Name symbol) {
		com.google.javascript.jscomp.graph.GraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> name = graph.getNode(symbol);
		com.google.javascript.jscomp.AnalyzeNameReferences.NameInfo info = name.getAnnotation();
		if (info == null) {
			info = new com.google.javascript.jscomp.AnalyzeNameReferences.NameInfo();
			name.setAnnotation(info);
		}
		return info;
	}

	final class NameInfo implements com.google.javascript.jscomp.graph.Annotation {
		private boolean referenced = false;

		private com.google.javascript.jscomp.JSModule deepestCommonModuleRef = null;

		boolean isReferenced() {
			return referenced;
		}

		com.google.javascript.jscomp.JSModule getDeepestCommonModuleRef() {
			return deepestCommonModuleRef;
		}

		boolean markReference(com.google.javascript.jscomp.JSModule module) {
			boolean hasChanged = false;
			if (!(referenced)) {
				referenced = true;
				hasChanged = true;
			}
			if ((moduleGraph) != null) {
				com.google.javascript.jscomp.JSModule originalDeepestCommon = deepestCommonModuleRef;
				if ((deepestCommonModuleRef) == null) {
					deepestCommonModuleRef = module;
				}else {
					deepestCommonModuleRef = moduleGraph.getDeepestCommonDependencyInclusive(deepestCommonModuleRef, module);
				}
				if (originalDeepestCommon != (deepestCommonModuleRef)) {
					hasChanged = true;
				}
			}
			return hasChanged;
		}
	}
}

