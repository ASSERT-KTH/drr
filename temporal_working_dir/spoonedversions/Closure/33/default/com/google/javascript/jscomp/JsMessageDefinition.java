

package com.google.javascript.jscomp;


class JsMessageDefinition {
	private final com.google.javascript.rhino.Node messageNode;

	private final com.google.javascript.rhino.Node messageParentNode;

	private final com.google.javascript.rhino.Node visitingNode;

	JsMessageDefinition(com.google.javascript.rhino.Node visitingNode, com.google.javascript.rhino.Node messageNode, com.google.javascript.rhino.Node messageParentNode) {
		this.messageNode = messageNode;
		this.visitingNode = visitingNode;
		this.messageParentNode = messageParentNode;
	}

	com.google.javascript.rhino.Node getMessageNode() {
		return messageNode;
	}

	com.google.javascript.rhino.Node getVisitingNode() {
		return visitingNode;
	}

	com.google.javascript.rhino.Node getMessageParentNode() {
		return messageParentNode;
	}
}

