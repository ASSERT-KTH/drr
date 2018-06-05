

package com.google.javascript.jscomp;


final class NameReferenceGraphReport {
	private com.google.javascript.jscomp.NameReferenceGraph graph = null;

	NameReferenceGraphReport(com.google.javascript.jscomp.NameReferenceGraph g) {
		com.google.javascript.jscomp.NameReferenceGraphReport.this.graph = g;
	}

	public java.lang.String getHtmlReport() {
		java.lang.StringBuilder builder = new java.lang.StringBuilder();
		java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference>> nodes = com.google.common.collect.Lists.newArrayList(graph.getDirectedGraphNodes());
		generateHtmlReportHeader(builder);
		builder.append("<h1>Name Reference Graph Dump</h1>\n");
		builder.append("OVERALL STATS\n");
		builder.append("<ul>\n");
		builder.append(("<li>Total names: " + (nodes.size())));
		builder.append("</ul>\n");
		builder.append("ALL NAMES\n");
		builder.append("<UL>\n");
		java.util.Collections.sort(nodes, new com.google.javascript.jscomp.NameReferenceGraphReport.DiGraphNodeComparator());
		for (com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> n : nodes) {
			generateDeclarationReport(builder, n);
			java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference>> outEdges = graph.getOutEdges(n.getValue());
			java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference>> inEdges = graph.getInEdges(n.getValue());
			if ((!(outEdges.isEmpty())) || (!(inEdges.isEmpty()))) {
				builder.append("<ul>");
				if ((outEdges.size()) > 0) {
					builder.append("<li>REFERS TO:<br>\n");
					builder.append("<ul>");
					for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> edge : outEdges) {
						generateEdgeReport(builder, edge.getDestination().getValue(), edge);
					}
					builder.append("</ul>\n");
				}
				if ((inEdges.size()) > 0) {
					builder.append("<li>REFERENCED BY:<br>\n");
					builder.append("<ul>");
					for (com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> edge : inEdges) {
						generateEdgeReport(builder, edge.getSource().getValue(), edge);
					}
					builder.append("</ul>");
				}
				builder.append("</ul>\n");
			}
		}
		builder.append("</ul>\n");
		generateHtmlReportFooter(builder);
		return builder.toString();
	}

	private java.lang.String getSourceFile(com.google.javascript.rhino.Node node) {
		java.lang.String filename = node.getSourceFileName();
		if (filename == null) {
			return "";
		}
		return filename;
	}

	private void generateDeclarationReport(java.lang.StringBuilder builder, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> declarationNode) {
		java.lang.String declName = declarationNode.getValue().getQualifiedName();
		com.google.javascript.rhino.jstype.JSType declType = declarationNode.getValue().getType();
		builder.append("<LI> ");
		builder.append((("<A NAME=\"" + declName) + "\">"));
		builder.append(declName);
		builder.append("\n");
		generateType(builder, declType);
		java.util.List<com.google.javascript.jscomp.DefinitionsRemover.Definition> defs = declarationNode.getValue().getDeclarations();
		if ((defs.size()) == 0) {
			builder.append("<br>No definitions found<br>");
		}else {
			builder.append("<ul>");
			for (com.google.javascript.jscomp.DefinitionsRemover.Definition def : defs) {
				com.google.javascript.rhino.Node fnDef = def.getRValue();
				java.lang.String sourceFileName = getSourceFile(fnDef);
				builder.append("<li> Defined: ");
				generateSourceReferenceLink(builder, sourceFileName, fnDef.getLineno(), fnDef.getCharno());
			}
			builder.append("</ul>");
		}
	}

	private void generateHtmlReportHeader(java.lang.StringBuilder builder) {
		builder.append(("<!DOCTYPE html>\n" + ((((("<html>" + "<head>") + "<meta http-equiv=\"Content-Type\" ") + "content=\"text/html;charset=utf-8\" >") + "<title>Name Reference Graph Dump</title>") + "<style type=\"text/css\">body, td, ")));
		builder.append("p {font-family: Arial; font-size: 83%} ");
		builder.append("ul {margin-top:2px; margin-left:0px; padding-left:1em;}");
		builder.append(("li {margin-top:3px; margin-left:24px;" + "padding-left:0px;padding-bottom: 4px}"));
		builder.append("</style></head><body>\n");
	}

	private void generateHtmlReportFooter(java.lang.StringBuilder builder) {
		builder.append("</body></html>");
	}

	private void generateEdgeReport(java.lang.StringBuilder builder, com.google.javascript.jscomp.NameReferenceGraph.Name referencedDecl, com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> edge) {
		java.lang.String srcDeclName = referencedDecl.getQualifiedName();
		builder.append((("<li><A HREF=\"#" + srcDeclName) + "\">"));
		builder.append(srcDeclName);
		builder.append("</a> ");
		com.google.javascript.rhino.Node def = edge.getValue().getSite();
		int lineNumber = def.getLineno();
		int columnNumber = def.getCharno();
		java.lang.String sourceFile = getSourceFile(def);
		generateSourceReferenceLink(builder, sourceFile, lineNumber, columnNumber);
		com.google.javascript.rhino.jstype.JSType defType = edge.getValue().getSite().getJSType();
		generateType(builder, defType);
	}

	private void generateSourceReferenceLink(java.lang.StringBuilder builder, java.lang.String sourceFile, int lineNumber, int columnNumber) {
		assert sourceFile != null;
		builder.append("(");
		builder.append(((((sourceFile + ":") + lineNumber) + ",") + columnNumber));
		builder.append(")");
	}

	private void generateType(java.lang.StringBuilder builder, com.google.javascript.rhino.jstype.JSType defType) {
		if (defType == null) {
			builder.append(" (type: null) ");
		}else
			if (defType.isUnknownType()) {
				builder.append(" (type: unknown) ");
			}else {
				builder.append(((" (type: " + (defType.toString())) + ") "));
			}
		
	}

	class DiGraphNodeComparator implements java.util.Comparator<com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference>> {
		public int compare(com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> node1, com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.jscomp.NameReferenceGraph.Name, com.google.javascript.jscomp.NameReferenceGraph.Reference> node2) {
			com.google.common.base.Preconditions.checkNotNull(node1.getValue());
			com.google.common.base.Preconditions.checkNotNull(node2.getValue());
			if (((node1.getValue().getQualifiedName()) == null) && ((node2.getValue().getQualifiedName()) == null)) {
				return 0;
			}
			if ((node1.getValue().getQualifiedName()) == null) {
				return -1;
			}
			if ((node2.getValue().getQualifiedName()) == null) {
				return 1;
			}
			return node1.getValue().getQualifiedName().compareTo(node2.getValue().getQualifiedName());
		}
	}
}

