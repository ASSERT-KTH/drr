

package com.google.javascript.jscomp;


class CreateSyntheticBlocks implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType UNMATCHED_START_MARKER = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNMATCHED_START_MARKER", "Unmatched {0}");

	static final com.google.javascript.jscomp.DiagnosticType UNMATCHED_END_MARKER = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNMATCHED_END_MARKER", "Unmatched {1} - {0} not in the same block");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_MARKER_USAGE = com.google.javascript.jscomp.DiagnosticType.warning("JSC_INVALID_MARKER_USAGE", ("Marker {0} can only be used in a simple " + "call expression"));

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.lang.String startMarkerName;

	private final java.lang.String endMarkerName;

	private final java.util.Deque<com.google.javascript.rhino.Node> markerStack = new java.util.ArrayDeque<com.google.javascript.rhino.Node>();

	private final java.util.List<com.google.javascript.jscomp.CreateSyntheticBlocks.Marker> validMarkers = com.google.common.collect.Lists.newArrayList();

	private class Marker {
		final com.google.javascript.rhino.Node startMarker;

		final com.google.javascript.rhino.Node endMarker;

		public Marker(com.google.javascript.rhino.Node startMarker, com.google.javascript.rhino.Node endMarker) {
			this.startMarker = startMarker;
			this.endMarker = endMarker;
		}
	}

	public CreateSyntheticBlocks(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String startMarkerName, java.lang.String endMarkerName) {
		this.compiler = compiler;
		this.startMarkerName = startMarkerName;
		this.endMarkerName = endMarkerName;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.CreateSyntheticBlocks.Callback());
		for (com.google.javascript.rhino.Node node : markerStack) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.NodeUtil.getSourceName(node), node, com.google.javascript.jscomp.CreateSyntheticBlocks.UNMATCHED_START_MARKER, startMarkerName));
		}
		for (com.google.javascript.jscomp.CreateSyntheticBlocks.Marker marker : validMarkers) {
			addBlocks(marker);
		}
	}

	private void addBlocks(com.google.javascript.jscomp.CreateSyntheticBlocks.Marker marker) {
		com.google.javascript.rhino.Node originalParent = marker.endMarker.getParent();
		com.google.javascript.rhino.Node outerBlock = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK);
		outerBlock.setIsSyntheticBlock(true);
		originalParent.addChildBefore(outerBlock, marker.startMarker);
		com.google.javascript.rhino.Node innerBlock = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK);
		innerBlock.setIsSyntheticBlock(true);
		moveSiblingExclusive(originalParent, innerBlock, marker.startMarker, marker.endMarker);
		outerBlock.addChildToBack(originalParent.removeChildAfter(outerBlock));
		outerBlock.addChildToBack(innerBlock);
		outerBlock.addChildToBack(originalParent.removeChildAfter(outerBlock));
		compiler.reportCodeChange();
	}

	private void moveSiblingExclusive(com.google.javascript.rhino.Node src, com.google.javascript.rhino.Node dest, @javax.annotation.Nullable
	com.google.javascript.rhino.Node start, @javax.annotation.Nullable
	com.google.javascript.rhino.Node end) {
		while ((childAfter(src, start)) != end) {
			com.google.javascript.rhino.Node child = removeChildAfter(src, start);
			dest.addChildToBack(child);
		} 
	}

	private com.google.javascript.rhino.Node childAfter(com.google.javascript.rhino.Node parent, @javax.annotation.Nullable
	com.google.javascript.rhino.Node siblingBefore) {
		if (siblingBefore == null) {
			return parent.getFirstChild();
		}else {
			return siblingBefore.getNext();
		}
	}

	private com.google.javascript.rhino.Node removeChildAfter(com.google.javascript.rhino.Node parent, @javax.annotation.Nullable
	com.google.javascript.rhino.Node siblingBefore) {
		if (siblingBefore == null) {
			return parent.removeFirstChild();
		}else {
			return parent.removeChildAfter(siblingBefore);
		}
	}

	private class Callback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (((n.getType()) != (com.google.javascript.rhino.Token.CALL)) || ((n.getFirstChild().getType()) != (com.google.javascript.rhino.Token.NAME))) {
				return ;
			}
			com.google.javascript.rhino.Node callTarget = n.getFirstChild();
			java.lang.String callName = callTarget.getString();
			if (startMarkerName.equals(callName)) {
				if ((parent.getType()) != (com.google.javascript.rhino.Token.EXPR_RESULT)) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.CreateSyntheticBlocks.INVALID_MARKER_USAGE, startMarkerName));
					return ;
				}
				markerStack.push(parent);
				return ;
			}
			if (!(endMarkerName.equals(callName))) {
				return ;
			}
			com.google.javascript.rhino.Node endMarkerNode = parent;
			if ((endMarkerNode.getType()) != (com.google.javascript.rhino.Token.EXPR_RESULT)) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.CreateSyntheticBlocks.INVALID_MARKER_USAGE, endMarkerName));
				return ;
			}
			if (markerStack.isEmpty()) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.CreateSyntheticBlocks.UNMATCHED_END_MARKER, startMarkerName, endMarkerName));
				return ;
			}
			com.google.javascript.rhino.Node startMarkerNode = markerStack.pop();
			if ((endMarkerNode.getParent()) != (startMarkerNode.getParent())) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.CreateSyntheticBlocks.UNMATCHED_END_MARKER, startMarkerName, endMarkerName));
				return ;
			}
			validMarkers.add(new com.google.javascript.jscomp.CreateSyntheticBlocks.Marker(startMarkerNode, endMarkerNode));
		}
	}
}

