

package com.google.javascript.jscomp;


class ReplaceMessages extends com.google.javascript.jscomp.JsMessageVisitor {
	private final com.google.javascript.jscomp.MessageBundle bundle;

	private final boolean strictReplacement;

	static final com.google.javascript.jscomp.DiagnosticType BUNDLE_DOES_NOT_HAVE_THE_MESSAGE = com.google.javascript.jscomp.DiagnosticType.error("JSC_BUNDLE_DOES_NOT_HAVE_THE_MESSAGE", "Message with id = {0} could not be found in replacement bundle");

	ReplaceMessages(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.MessageBundle bundle, boolean checkDuplicatedMessages, com.google.javascript.jscomp.JsMessage.Style style, boolean strictReplacement) {
		super(compiler, checkDuplicatedMessages, style, bundle.idGenerator());
		this.bundle = bundle;
		this.strictReplacement = strictReplacement;
	}

	@java.lang.Override
	protected void processJsMessage(com.google.javascript.jscomp.JsMessage message, com.google.javascript.jscomp.JsMessageDefinition definition) {
		com.google.javascript.jscomp.JsMessage replacement = bundle.getMessage(message.getId());
		if (replacement == null) {
			if (strictReplacement) {
				compiler.report(com.google.javascript.jscomp.JSError.make(message.getSourceName(), definition.getMessageNode(), com.google.javascript.jscomp.ReplaceMessages.BUNDLE_DOES_NOT_HAVE_THE_MESSAGE, message.getId()));
				return ;
			}else {
				replacement = message;
			}
		}
		com.google.javascript.rhino.Node newValue;
		com.google.javascript.rhino.Node msgNode = definition.getMessageNode();
		try {
			newValue = getNewValueNode(replacement, msgNode);
		} catch (com.google.javascript.jscomp.JsMessageVisitor.MalformedException e) {
			compiler.report(com.google.javascript.jscomp.JSError.make(message.getSourceName(), e.getNode(), com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_TREE_MALFORMED, e.getMessage()));
			newValue = msgNode;
		}
		if (newValue != msgNode) {
			newValue.copyInformationFromForTree(msgNode);
			definition.getMessageParentNode().replaceChild(msgNode, newValue);
			compiler.reportCodeChange();
		}
	}

	private com.google.javascript.rhino.Node getNewValueNode(com.google.javascript.jscomp.JsMessage message, com.google.javascript.rhino.Node origValueNode) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		switch (origValueNode.getType()) {
			case com.google.javascript.rhino.Token.FUNCTION :
				updateFunctionNode(message, origValueNode);
				return origValueNode;
			case com.google.javascript.rhino.Token.STRING :
				java.lang.String newString = message.toString();
				if (!(origValueNode.getString().equals(newString))) {
					origValueNode.setString(newString);
					compiler.reportCodeChange();
				}
				return origValueNode;
			case com.google.javascript.rhino.Token.ADD :
				return com.google.javascript.rhino.IR.string(message.toString());
			case com.google.javascript.rhino.Token.CALL :
				return replaceCallNode(message, origValueNode);
			default :
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Expected FUNCTION, STRING, or ADD node; found: " + (origValueNode.getType())), origValueNode);
		}
	}

	private void updateFunctionNode(com.google.javascript.jscomp.JsMessage message, com.google.javascript.rhino.Node functionNode) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		checkNode(functionNode, com.google.javascript.rhino.Token.FUNCTION);
		com.google.javascript.rhino.Node nameNode = functionNode.getFirstChild();
		checkNode(nameNode, com.google.javascript.rhino.Token.NAME);
		com.google.javascript.rhino.Node argListNode = nameNode.getNext();
		checkNode(argListNode, com.google.javascript.rhino.Token.PARAM_LIST);
		com.google.javascript.rhino.Node oldBlockNode = argListNode.getNext();
		checkNode(oldBlockNode, com.google.javascript.rhino.Token.BLOCK);
		java.util.Iterator<java.lang.CharSequence> iterator = message.parts().iterator();
		com.google.javascript.rhino.Node valueNode = iterator.hasNext() ? constructAddOrStringNode(iterator, argListNode) : com.google.javascript.rhino.IR.string("");
		com.google.javascript.rhino.Node newBlockNode = com.google.javascript.rhino.IR.block(com.google.javascript.rhino.IR.returnNode(valueNode));
		if ((newBlockNode.checkTreeEquals(oldBlockNode)) != null) {
			newBlockNode.copyInformationFromForTree(oldBlockNode);
			functionNode.replaceChild(oldBlockNode, newBlockNode);
			compiler.reportCodeChange();
		}
	}

	private com.google.javascript.rhino.Node constructAddOrStringNode(java.util.Iterator<java.lang.CharSequence> partsIterator, com.google.javascript.rhino.Node argListNode) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		java.lang.CharSequence part = partsIterator.next();
		com.google.javascript.rhino.Node partNode = null;
		if (part instanceof com.google.javascript.jscomp.JsMessage.PlaceholderReference) {
			com.google.javascript.jscomp.JsMessage.PlaceholderReference phRef = ((com.google.javascript.jscomp.JsMessage.PlaceholderReference) (part));
			for (com.google.javascript.rhino.Node node : argListNode.children()) {
				if (node.isName()) {
					java.lang.String arg = node.getString();
					if (arg.equalsIgnoreCase(phRef.getName())) {
						partNode = com.google.javascript.rhino.IR.name(arg);
					}
				}
			}
			if (partNode == null) {
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Unrecognized message placeholder referenced: " + (phRef.getName())), argListNode);
			}
		}else {
			partNode = com.google.javascript.rhino.IR.string(part.toString());
		}
		if (partsIterator.hasNext()) {
			return com.google.javascript.rhino.IR.add(partNode, constructAddOrStringNode(partsIterator, argListNode));
		}else {
			return partNode;
		}
	}

	private com.google.javascript.rhino.Node replaceCallNode(com.google.javascript.jscomp.JsMessage message, com.google.javascript.rhino.Node callNode) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		checkNode(callNode, com.google.javascript.rhino.Token.CALL);
		com.google.javascript.rhino.Node getPropNode = callNode.getFirstChild();
		checkNode(getPropNode, com.google.javascript.rhino.Token.GETPROP);
		com.google.javascript.rhino.Node stringExprNode = getPropNode.getNext();
		checkStringExprNode(stringExprNode);
		com.google.javascript.rhino.Node objLitNode = stringExprNode.getNext();
		return constructStringExprNode(message.parts().iterator(), objLitNode);
	}

	private com.google.javascript.rhino.Node constructStringExprNode(java.util.Iterator<java.lang.CharSequence> parts, com.google.javascript.rhino.Node objLitNode) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		java.lang.CharSequence part = parts.next();
		com.google.javascript.rhino.Node partNode = null;
		if (part instanceof com.google.javascript.jscomp.JsMessage.PlaceholderReference) {
			com.google.javascript.jscomp.JsMessage.PlaceholderReference phRef = ((com.google.javascript.jscomp.JsMessage.PlaceholderReference) (part));
			if (objLitNode == null) {
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Empty placeholder value map " + "for a translated message with placeholders."), objLitNode);
			}
			for (com.google.javascript.rhino.Node key = objLitNode.getFirstChild(); key != null; key = key.getNext()) {
				if (key.getString().equals(phRef.getName())) {
					com.google.javascript.rhino.Node valueNode = key.getFirstChild();
					partNode = valueNode.cloneTree();
				}
			}
			if (partNode == null) {
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Unrecognized message placeholder referenced: " + (phRef.getName())), objLitNode);
			}
		}else {
			partNode = com.google.javascript.rhino.IR.string(part.toString());
		}
		if (parts.hasNext()) {
			return com.google.javascript.rhino.IR.add(partNode, constructStringExprNode(parts, objLitNode));
		}else {
			return partNode;
		}
	}

	private void checkNode(@javax.annotation.Nullable
	com.google.javascript.rhino.Node node, int type) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		if (node == null) {
			throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException((("Expected node type " + type) + "; found: null"), node);
		}
		if ((node.getType()) != type) {
			throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(((("Expected node type " + type) + "; found: ") + (node.getType())), node);
		}
	}

	private void checkStringExprNode(@javax.annotation.Nullable
	com.google.javascript.rhino.Node node) {
		if (node == null) {
			throw new java.lang.IllegalArgumentException("Expected a string; found: null");
		}
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.STRING :
				break;
			case com.google.javascript.rhino.Token.ADD :
				com.google.javascript.rhino.Node c = node.getFirstChild();
				checkStringExprNode(c);
				checkStringExprNode(c.getNext());
				break;
			default :
				throw new java.lang.IllegalArgumentException(("Expected a string; found: " + (node.getType())));
		}
	}
}

