

package com.google.javascript.jscomp;


class ReplaceMessagesForChrome extends com.google.javascript.jscomp.JsMessageVisitor {
	ReplaceMessagesForChrome(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator, boolean checkDuplicatedMessages, com.google.javascript.jscomp.JsMessage.Style style) {
		super(compiler, checkDuplicatedMessages, style, idGenerator);
	}

	private static com.google.javascript.rhino.Node getChromeI18nGetMessageNode(java.lang.String messageId) {
		com.google.javascript.rhino.Node chromeI18n = com.google.javascript.rhino.IR.getprop(com.google.javascript.rhino.IR.name("chrome"), com.google.javascript.rhino.IR.string("i18n"));
		com.google.javascript.rhino.Node getMessage = com.google.javascript.rhino.IR.getprop(chromeI18n, com.google.javascript.rhino.IR.string("getMessage"));
		return com.google.javascript.rhino.IR.call(getMessage, com.google.javascript.rhino.IR.string(messageId));
	}

	@java.lang.Override
	protected void processJsMessage(com.google.javascript.jscomp.JsMessage message, com.google.javascript.jscomp.JsMessageDefinition definition) {
		try {
			com.google.javascript.rhino.Node msgNode = definition.getMessageNode();
			com.google.javascript.rhino.Node newValue = getNewValueNode(msgNode, message);
			newValue.copyInformationFromForTree(msgNode);
			definition.getMessageParentNode().replaceChild(msgNode, newValue);
			compiler.reportCodeChange();
		} catch (com.google.javascript.jscomp.JsMessageVisitor.MalformedException e) {
			compiler.report(com.google.javascript.jscomp.JSError.make(message.getSourceName(), e.getNode(), com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_TREE_MALFORMED, e.getMessage()));
		}
	}

	private com.google.javascript.rhino.Node getNewValueNode(com.google.javascript.rhino.Node origNode, com.google.javascript.jscomp.JsMessage message) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		com.google.javascript.rhino.Node newValueNode = com.google.javascript.jscomp.ReplaceMessagesForChrome.getChromeI18nGetMessageNode(message.getId());
		if (!(message.placeholders().isEmpty())) {
			com.google.javascript.rhino.Node placeholderValues = origNode.getLastChild();
			checkNode(placeholderValues, com.google.javascript.rhino.Token.OBJECTLIT);
			java.util.List<java.lang.String> placeholderNames = com.google.common.collect.Lists.newArrayList();
			for (java.lang.CharSequence cs : message.parts()) {
				if (cs instanceof com.google.javascript.jscomp.JsMessage.PlaceholderReference) {
					java.lang.String placeholderName = ((com.google.javascript.jscomp.JsMessage.PlaceholderReference) (cs)).getName();
					placeholderNames.add(placeholderName);
				}
			}
			java.util.Collections.sort(placeholderNames);
			com.google.javascript.rhino.Node placeholderValueArray = com.google.javascript.rhino.IR.arraylit();
			for (java.lang.String name : placeholderNames) {
				com.google.javascript.rhino.Node value = getPlaceholderValue(placeholderValues, name);
				if (value == null) {
					throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("No value was provided for placeholder " + name), origNode);
				}
				placeholderValueArray.addChildToBack(value);
			}
			newValueNode.addChildToBack(placeholderValueArray);
		}
		newValueNode.copyInformationFromForTree(origNode);
		return newValueNode;
	}

	private com.google.javascript.rhino.Node getPlaceholderValue(com.google.javascript.rhino.Node placeholderValues, java.lang.String placeholderName) {
		for (com.google.javascript.rhino.Node key : placeholderValues.children()) {
			if (key.getString().equals(placeholderName)) {
				return key.getFirstChild().cloneTree();
			}
		}
		return null;
	}
}

