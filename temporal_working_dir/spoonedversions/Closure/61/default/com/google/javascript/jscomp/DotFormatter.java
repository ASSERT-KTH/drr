

package com.google.javascript.jscomp;


public class DotFormatter {
	private static final java.lang.String INDENT = "  ";

	private static final java.lang.String ARROW = " -> ";

	private static final java.lang.String LINE = " -- ";

	private java.util.HashMap<com.google.javascript.rhino.Node, java.lang.Integer> assignments = new java.util.HashMap<com.google.javascript.rhino.Node, java.lang.Integer>();

	private int keyCount = 0;

	private java.lang.Appendable builder;

	private final com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg;

	private final boolean printAnnotations;

	private DotFormatter() {
		com.google.javascript.jscomp.DotFormatter.this.builder = new java.lang.StringBuilder();
		this.cfg = null;
		this.printAnnotations = false;
	}

	private DotFormatter(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> cfg, java.lang.Appendable builder, boolean printAnnotations) throws java.io.IOException {
		this.cfg = cfg;
		com.google.javascript.jscomp.DotFormatter.this.builder = builder;
		this.printAnnotations = printAnnotations;
		formatPreamble();
		traverseNodes(n);
		formatConclusion();
	}

	public static java.lang.String toDot(com.google.javascript.rhino.Node n) throws java.io.IOException {
		return com.google.javascript.jscomp.DotFormatter.toDot(n, null);
	}

	static java.lang.String toDot(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> inCFG, boolean printAnnotations) throws java.io.IOException {
		java.lang.StringBuilder builder = new java.lang.StringBuilder();
		new com.google.javascript.jscomp.DotFormatter(n, inCFG, builder, printAnnotations);
		return builder.toString();
	}

	static java.lang.String toDot(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> inCFG) throws java.io.IOException {
		java.lang.StringBuilder builder = new java.lang.StringBuilder();
		new com.google.javascript.jscomp.DotFormatter(n, inCFG, builder, false);
		return builder.toString();
	}

	static void appendDot(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> inCFG, java.lang.Appendable builder) throws java.io.IOException {
		new com.google.javascript.jscomp.DotFormatter(n, inCFG, builder, false);
	}

	static com.google.javascript.jscomp.DotFormatter newInstanceForTesting() {
		return new com.google.javascript.jscomp.DotFormatter();
	}

	private void traverseNodes(com.google.javascript.rhino.Node parent) throws java.io.IOException {
		int keyParent = key(parent);
		for (com.google.javascript.rhino.Node child = parent.getFirstChild(); child != null; child = child.getNext()) {
			int keyChild = key(child);
			builder.append(com.google.javascript.jscomp.DotFormatter.INDENT);
			builder.append(formatNodeName(keyParent));
			builder.append(com.google.javascript.jscomp.DotFormatter.ARROW);
			builder.append(formatNodeName(keyChild));
			builder.append(" [weight=1];\n");
			traverseNodes(child);
		}
		if (((cfg) != null) && (cfg.hasNode(parent))) {
			java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch>> outEdges = cfg.getOutEdges(parent);
			java.lang.String[] edgeList = new java.lang.String[outEdges.size()];
			for (int i = 0; i < (edgeList.length); i++) {
				com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> edge = outEdges.get(i);
				com.google.javascript.jscomp.graph.DiGraph.DiGraphNode<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ControlFlowGraph.Branch> succ = edge.getDestination();
				java.lang.String toNode = null;
				if (succ == (cfg.getImplicitReturn())) {
					toNode = "RETURN";
				}else {
					int keySucc = key(succ.getValue());
					toNode = formatNodeName(keySucc);
				}
				edgeList[i] = (((((((formatNodeName(keyParent)) + (com.google.javascript.jscomp.DotFormatter.ARROW)) + toNode) + " [label=\"") + (edge.getValue().toString())) + "\", ") + "fontcolor=\"red\", ") + "weight=0.01, color=\"red\"];\n";
			}
			java.util.Arrays.sort(edgeList);
			for (int i = 0; i < (edgeList.length); i++) {
				builder.append(com.google.javascript.jscomp.DotFormatter.INDENT);
				builder.append(edgeList[i]);
			}
		}
	}

	int key(com.google.javascript.rhino.Node n) throws java.io.IOException {
		java.lang.Integer key = assignments.get(n);
		if (key == null) {
			key = (keyCount)++;
			assignments.put(n, key);
			builder.append(com.google.javascript.jscomp.DotFormatter.INDENT);
			builder.append(formatNodeName(key));
			builder.append(" [label=\"");
			builder.append(name(n));
			com.google.javascript.rhino.jstype.JSType type = n.getJSType();
			if (type != null) {
				builder.append(" : ");
				builder.append(type.toString());
			}
			if (((printAnnotations) && ((cfg) != null)) && (cfg.hasNode(n))) {
				java.lang.Object annotation = cfg.getNode(n).getAnnotation();
				if (annotation != null) {
					builder.append("\\n");
					builder.append(annotation.toString());
				}
			}
			builder.append("\"");
			if ((n.getJSDocInfo()) != null) {
				builder.append(" color=\"green\"");
			}
			builder.append("];\n");
		}
		return key;
	}

	private java.lang.String name(com.google.javascript.rhino.Node n) {
		int type = n.getType();
		switch (type) {
			case com.google.javascript.rhino.Token.VOID :
				return "VOID";
			default :
				return com.google.javascript.rhino.Token.name(type);
		}
	}

	private java.lang.String formatNodeName(java.lang.Integer key) {
		return "node" + key;
	}

	private void formatPreamble() throws java.io.IOException {
		builder.append("digraph AST {\n");
		builder.append(com.google.javascript.jscomp.DotFormatter.INDENT);
		builder.append("node [color=lightblue2, style=filled];\n");
	}

	private void formatConclusion() throws java.io.IOException {
		builder.append("}\n");
	}

	public static java.lang.String toDot(com.google.javascript.jscomp.graph.GraphvizGraph graph) {
		java.lang.StringBuilder builder = new java.lang.StringBuilder();
		builder.append((graph.isDirected() ? "digraph" : "graph"));
		builder.append(com.google.javascript.jscomp.DotFormatter.INDENT);
		builder.append(graph.getName());
		builder.append(" {\n");
		builder.append(com.google.javascript.jscomp.DotFormatter.INDENT);
		builder.append("node [color=lightblue2, style=filled];\n");
		final java.lang.String edgeSymbol = graph.isDirected() ? com.google.javascript.jscomp.DotFormatter.ARROW : com.google.javascript.jscomp.DotFormatter.LINE;
		java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode> nodes = graph.getGraphvizNodes();
		java.lang.String[] nodeNames = new java.lang.String[nodes.size()];
		for (int i = 0; i < (nodeNames.length); i++) {
			com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizNode gNode = nodes.get(i);
			nodeNames[i] = (((((gNode.getId()) + " [label=\"") + (gNode.getLabel())) + "\" color=\"") + (gNode.getColor())) + "\"]";
		}
		java.util.Arrays.sort(nodeNames);
		for (java.lang.String nodeName : nodeNames) {
			builder.append(com.google.javascript.jscomp.DotFormatter.INDENT);
			builder.append(nodeName);
			builder.append(";\n");
		}
		java.util.List<com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge> edges = graph.getGraphvizEdges();
		java.lang.String[] edgeNames = new java.lang.String[edges.size()];
		for (int i = 0; i < (edgeNames.length); i++) {
			com.google.javascript.jscomp.graph.GraphvizGraph.GraphvizEdge edge = edges.get(i);
			edgeNames[i] = ((edge.getNode1Id()) + edgeSymbol) + (edge.getNode2Id());
		}
		java.util.Arrays.sort(edgeNames);
		for (java.lang.String edgeName : edgeNames) {
			builder.append(com.google.javascript.jscomp.DotFormatter.INDENT);
			builder.append(edgeName);
			builder.append(";\n");
		}
		builder.append("}\n");
		return builder.toString();
	}
}

