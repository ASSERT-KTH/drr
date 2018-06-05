

package com.google.javascript.jscomp;


abstract class JsMessageVisitor extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	private static final java.lang.String MSG_FUNCTION_NAME = "goog.getMsg";

	private static final java.lang.String MSG_FALLBACK_FUNCTION_NAME = "goog.getMsgWithFallback";

	static final com.google.javascript.jscomp.DiagnosticType MESSAGE_HAS_NO_DESCRIPTION = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MSG_HAS_NO_DESCRIPTION", "Message {0} has no description. Add @desc JsDoc tag.");

	static final com.google.javascript.jscomp.DiagnosticType MESSAGE_HAS_NO_TEXT = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MSG_HAS_NO_TEXT", ("Message value of {0} is just an empty string. " + "Empty messages are forbidden."));

	static final com.google.javascript.jscomp.DiagnosticType MESSAGE_TREE_MALFORMED = com.google.javascript.jscomp.DiagnosticType.error("JSC_MSG_TREE_MALFORMED", "Message parse tree malformed. {0}");

	static final com.google.javascript.jscomp.DiagnosticType MESSAGE_HAS_NO_VALUE = com.google.javascript.jscomp.DiagnosticType.error("JSC_MSG_HAS_NO_VALUE", "message node {0} has no value");

	static final com.google.javascript.jscomp.DiagnosticType MESSAGE_DUPLICATE_KEY = com.google.javascript.jscomp.DiagnosticType.error("JSC_MSG_KEY_DUPLICATED", ("duplicate message variable name found for {0}, " + "initial definition {1}:{2}"));

	static final com.google.javascript.jscomp.DiagnosticType MESSAGE_NODE_IS_ORPHANED = com.google.javascript.jscomp.DiagnosticType.warning("JSC_MSG_ORPHANED_NODE", ((com.google.javascript.jscomp.JsMessageVisitor.MSG_FUNCTION_NAME) + "() function could be used only with MSG_* property or variable"));

	static final com.google.javascript.jscomp.DiagnosticType MESSAGE_NOT_INITIALIZED_USING_NEW_SYNTAX = com.google.javascript.jscomp.DiagnosticType.error("JSC_MSG_NOT_INITIALIZED_USING_NEW_SYNTAX", ("message not initialized using " + (com.google.javascript.jscomp.JsMessageVisitor.MSG_FUNCTION_NAME)));

	static final com.google.javascript.jscomp.DiagnosticType BAD_FALLBACK_SYNTAX = com.google.javascript.jscomp.DiagnosticType.error("JSC_MSG_BAD_FALLBACK_SYNTAX", java.lang.String.format(("Bad syntax. " + "Expected syntax: goog.getMsgWithFallback(MSG_1, MSG_2)"), com.google.javascript.jscomp.JsMessageVisitor.MSG_FALLBACK_FUNCTION_NAME));

	static final com.google.javascript.jscomp.DiagnosticType FALLBACK_ARG_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_MSG_FALLBACK_ARG_ERROR", "Could not find message entry for fallback argument {0}");

	private static final java.lang.String PH_JS_PREFIX = "{$";

	private static final java.lang.String PH_JS_SUFFIX = "}";

	static final java.lang.String MSG_PREFIX = "MSG_";

	private static final java.util.regex.Pattern MSG_UNNAMED_PATTERN = java.util.regex.Pattern.compile("MSG_UNNAMED_\\d+");

	private static final java.util.regex.Pattern CAMELCASE_PATTERN = java.util.regex.Pattern.compile("[a-z][a-zA-Z\\d]*[_\\d]*");

	static final java.lang.String HIDDEN_DESC_PREFIX = "@hidden";

	private static final java.lang.String DESC_SUFFIX = "_HELP";

	private final boolean needToCheckDuplications;

	private final com.google.javascript.jscomp.JsMessage.Style style;

	private final com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator;

	final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.JsMessageVisitor.MessageLocation> messageNames = com.google.common.collect.Maps.newHashMap();

	private final java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.JsMessage> unnamedMessages = com.google.common.collect.Maps.newHashMap();

	private final java.util.Map<com.google.javascript.rhino.Node, java.lang.String> googMsgNodes = com.google.common.collect.Maps.newHashMap();

	private final com.google.javascript.jscomp.CheckLevel checkLevel;

	JsMessageVisitor(com.google.javascript.jscomp.AbstractCompiler compiler, boolean needToCheckDuplications, com.google.javascript.jscomp.JsMessage.Style style, com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator) {
		this.compiler = compiler;
		this.needToCheckDuplications = needToCheckDuplications;
		this.style = style;
		this.idGenerator = idGenerator;
		checkLevel = (style == (com.google.javascript.jscomp.JsMessage.Style.CLOSURE)) ? com.google.javascript.jscomp.CheckLevel.ERROR : com.google.javascript.jscomp.CheckLevel.WARNING;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.JsMessageVisitor.this);
		for (java.util.Map.Entry<com.google.javascript.rhino.Node, java.lang.String> msgNode : googMsgNodes.entrySet()) {
			compiler.report(com.google.javascript.jscomp.JSError.make(msgNode.getValue(), msgNode.getKey(), checkLevel, com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_NODE_IS_ORPHANED));
		}
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal traversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		java.lang.String messageKey;
		boolean isVar;
		com.google.javascript.rhino.Node msgNode;
		com.google.javascript.rhino.Node msgNodeParent;
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				if ((parent != null) && (parent.isVar())) {
					messageKey = node.getString();
					isVar = true;
				}else {
					return ;
				}
				msgNode = node.getFirstChild();
				msgNodeParent = node;
				break;
			case com.google.javascript.rhino.Token.ASSIGN :
				isVar = false;
				com.google.javascript.rhino.Node getProp = node.getFirstChild();
				if (!(getProp.isGetProp())) {
					return ;
				}
				com.google.javascript.rhino.Node propNode = getProp.getLastChild();
				messageKey = propNode.getString();
				msgNode = node.getLastChild();
				msgNodeParent = node;
				break;
			case com.google.javascript.rhino.Token.CALL :
				java.lang.String fnName = node.getFirstChild().getQualifiedName();
				if (com.google.javascript.jscomp.JsMessageVisitor.MSG_FUNCTION_NAME.equals(fnName)) {
					googMsgNodes.put(node, traversal.getSourceName());
				}else
					if (com.google.javascript.jscomp.JsMessageVisitor.MSG_FALLBACK_FUNCTION_NAME.equals(fnName)) {
						visitFallbackFunctionCall(traversal, node);
					}
				
				return ;
			default :
				return ;
		}
		boolean isNewStyleMessage = (msgNode != null) && (msgNode.isCall());
		if (!(isMessageName(messageKey, isNewStyleMessage))) {
			return ;
		}
		if (msgNode == null) {
			compiler.report(traversal.makeError(node, com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_HAS_NO_VALUE, messageKey));
			return ;
		}
		if (isNewStyleMessage) {
			googMsgNodes.remove(msgNode);
		}else
			if ((style) != (com.google.javascript.jscomp.JsMessage.Style.LEGACY)) {
				compiler.report(traversal.makeError(node, checkLevel, com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_NOT_INITIALIZED_USING_NEW_SYNTAX));
			}
		
		boolean isUnnamedMsg = com.google.javascript.jscomp.JsMessageVisitor.isUnnamedMessageName(messageKey);
		com.google.javascript.jscomp.JsMessage.Builder builder = new com.google.javascript.jscomp.JsMessage.Builder((isUnnamedMsg ? null : messageKey));
		builder.setSourceName(traversal.getSourceName());
		try {
			if (isVar) {
				extractMessageFromVariable(builder, node, parent, parent.getParent());
			}else {
				extractMessageFromProperty(builder, node.getFirstChild(), node);
			}
		} catch (com.google.javascript.jscomp.JsMessageVisitor.MalformedException ex) {
			compiler.report(traversal.makeError(ex.getNode(), com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_TREE_MALFORMED, ex.getMessage()));
			return ;
		}
		com.google.javascript.jscomp.JsMessage extractedMessage = builder.build(idGenerator);
		if (((needToCheckDuplications) && (!isUnnamedMsg)) && (!(extractedMessage.isExternal()))) {
			checkIfMessageDuplicated(messageKey, msgNode);
		}
		trackMessage(traversal, extractedMessage, messageKey, msgNode, isUnnamedMsg);
		if (extractedMessage.isEmpty()) {
			compiler.report(traversal.makeError(node, com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_HAS_NO_TEXT, messageKey));
		}
		java.lang.String desc = extractedMessage.getDesc();
		if ((isNewStyleMessage && ((desc == null) || (desc.trim().isEmpty()))) && (!(extractedMessage.isExternal()))) {
			compiler.report(traversal.makeError(node, com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_HAS_NO_DESCRIPTION, messageKey));
		}
		com.google.javascript.jscomp.JsMessageDefinition msgDefinition = new com.google.javascript.jscomp.JsMessageDefinition(node, msgNode, msgNodeParent);
		processJsMessage(extractedMessage, msgDefinition);
	}

	private void trackMessage(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.jscomp.JsMessage message, java.lang.String msgName, com.google.javascript.rhino.Node msgNode, boolean isUnnamedMessage) {
		if (!isUnnamedMessage) {
			com.google.javascript.jscomp.JsMessageVisitor.MessageLocation location = new com.google.javascript.jscomp.JsMessageVisitor.MessageLocation(message, msgNode);
			messageNames.put(msgName, location);
		}else
			if (msgNode.isName()) {
				com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(msgName);
				if (var != null) {
					unnamedMessages.put(var, message);
				}
			}
		
	}

	private com.google.javascript.jscomp.JsMessage getTrackedMessage(com.google.javascript.jscomp.NodeTraversal t, java.lang.String msgName) {
		boolean isUnnamedMessage = com.google.javascript.jscomp.JsMessageVisitor.isUnnamedMessageName(msgName);
		if (!isUnnamedMessage) {
			com.google.javascript.jscomp.JsMessageVisitor.MessageLocation location = messageNames.get(msgName);
			return location == null ? null : location.message;
		}else {
			com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(msgName);
			if (var != null) {
				return unnamedMessages.get(var);
			}
		}
		return null;
	}

	private void checkIfMessageDuplicated(java.lang.String msgName, com.google.javascript.rhino.Node msgNode) {
		if (messageNames.containsKey(msgName)) {
			com.google.javascript.jscomp.JsMessageVisitor.MessageLocation location = messageNames.get(msgName);
			compiler.report(com.google.javascript.jscomp.JSError.make(msgNode, com.google.javascript.jscomp.JsMessageVisitor.MESSAGE_DUPLICATE_KEY, msgName, location.messageNode.getSourceFileName(), java.lang.Integer.toString(location.messageNode.getLineno())));
		}
	}

	private void extractMessageFromVariable(com.google.javascript.jscomp.JsMessage.Builder builder, com.google.javascript.rhino.Node nameNode, com.google.javascript.rhino.Node parentNode, @javax.annotation.Nullable
	com.google.javascript.rhino.Node grandParentNode) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		com.google.javascript.rhino.Node valueNode = nameNode.getFirstChild();
		switch (valueNode.getType()) {
			case com.google.javascript.rhino.Token.STRING :
			case com.google.javascript.rhino.Token.ADD :
				maybeInitMetaDataFromJsDocOrHelpVar(builder, parentNode, grandParentNode);
				builder.appendStringPart(com.google.javascript.jscomp.JsMessageVisitor.extractStringFromStringExprNode(valueNode));
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				maybeInitMetaDataFromJsDocOrHelpVar(builder, parentNode, grandParentNode);
				extractFromFunctionNode(builder, valueNode);
				break;
			case com.google.javascript.rhino.Token.CALL :
				maybeInitMetaDataFromJsDoc(builder, parentNode);
				extractFromCallNode(builder, valueNode);
				break;
			default :
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Cannot parse value of message " + (builder.getKey())), valueNode);
		}
	}

	private void extractMessageFromProperty(com.google.javascript.jscomp.JsMessage.Builder builder, com.google.javascript.rhino.Node getPropNode, com.google.javascript.rhino.Node assignNode) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		com.google.javascript.rhino.Node callNode = getPropNode.getNext();
		maybeInitMetaDataFromJsDoc(builder, assignNode);
		extractFromCallNode(builder, callNode);
	}

	private void maybeInitMetaDataFromJsDocOrHelpVar(com.google.javascript.jscomp.JsMessage.Builder builder, com.google.javascript.rhino.Node varNode, @javax.annotation.Nullable
	com.google.javascript.rhino.Node parentOfVarNode) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		if (maybeInitMetaDataFromJsDoc(builder, varNode)) {
			return ;
		}
		if ((parentOfVarNode != null) && (maybeInitMetaDataFromHelpVar(builder, parentOfVarNode.getChildBefore(varNode)))) {
			return ;
		}
		maybeInitMetaDataFromHelpVar(builder, varNode.getNext());
	}

	private boolean maybeInitMetaDataFromHelpVar(com.google.javascript.jscomp.JsMessage.Builder builder, @javax.annotation.Nullable
	com.google.javascript.rhino.Node sibling) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		if ((sibling != null) && (sibling.isVar())) {
			com.google.javascript.rhino.Node nameNode = sibling.getFirstChild();
			java.lang.String name = nameNode.getString();
			if (name.equals(((builder.getKey()) + (com.google.javascript.jscomp.JsMessageVisitor.DESC_SUFFIX)))) {
				com.google.javascript.rhino.Node valueNode = nameNode.getFirstChild();
				java.lang.String desc = com.google.javascript.jscomp.JsMessageVisitor.extractStringFromStringExprNode(valueNode);
				if (desc.startsWith(com.google.javascript.jscomp.JsMessageVisitor.HIDDEN_DESC_PREFIX)) {
					builder.setDesc(desc.substring(com.google.javascript.jscomp.JsMessageVisitor.HIDDEN_DESC_PREFIX.length()).trim());
					builder.setIsHidden(true);
				}else {
					builder.setDesc(desc);
				}
				return true;
			}
		}
		return false;
	}

	private boolean maybeInitMetaDataFromJsDoc(com.google.javascript.jscomp.JsMessage.Builder builder, com.google.javascript.rhino.Node node) {
		boolean messageHasDesc = false;
		com.google.javascript.rhino.JSDocInfo info = node.getJSDocInfo();
		if (info != null) {
			java.lang.String desc = info.getDescription();
			if (desc != null) {
				builder.setDesc(desc);
				messageHasDesc = true;
			}
			if (info.isHidden()) {
				builder.setIsHidden(true);
			}
			if ((info.getMeaning()) != null) {
				builder.setMeaning(info.getMeaning());
			}
		}
		return messageHasDesc;
	}

	private static java.lang.String extractStringFromStringExprNode(com.google.javascript.rhino.Node node) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.STRING :
				return node.getString();
			case com.google.javascript.rhino.Token.ADD :
				java.lang.StringBuilder sb = new java.lang.StringBuilder();
				for (com.google.javascript.rhino.Node child : node.children()) {
					sb.append(com.google.javascript.jscomp.JsMessageVisitor.extractStringFromStringExprNode(child));
				}
				return sb.toString();
			default :
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("STRING or ADD node expected; found: " + (com.google.javascript.jscomp.JsMessageVisitor.getReadableTokenName(node))), node);
		}
	}

	private void extractFromFunctionNode(com.google.javascript.jscomp.JsMessage.Builder builder, com.google.javascript.rhino.Node node) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		java.util.Set<java.lang.String> phNames = com.google.common.collect.Sets.newHashSet();
		for (com.google.javascript.rhino.Node fnChild : node.children()) {
			switch (fnChild.getType()) {
				case com.google.javascript.rhino.Token.NAME :
					break;
				case com.google.javascript.rhino.Token.PARAM_LIST :
					for (com.google.javascript.rhino.Node argumentNode : fnChild.children()) {
						if (argumentNode.isName()) {
							java.lang.String phName = argumentNode.getString();
							if (phNames.contains(phName)) {
								throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Duplicate placeholder name: " + phName), argumentNode);
							}else {
								phNames.add(phName);
							}
						}
					}
					break;
				case com.google.javascript.rhino.Token.BLOCK :
					com.google.javascript.rhino.Node returnNode = fnChild.getFirstChild();
					if (!(returnNode.isReturn())) {
						throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("RETURN node expected; found: " + (com.google.javascript.jscomp.JsMessageVisitor.getReadableTokenName(returnNode))), returnNode);
					}
					for (com.google.javascript.rhino.Node child : returnNode.children()) {
						extractFromReturnDescendant(builder, child);
					}
					for (java.lang.String phName : builder.getPlaceholders()) {
						if (!(phNames.contains(phName))) {
							throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Unrecognized message placeholder referenced: " + phName), returnNode);
						}
					}
					break;
				default :
					throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("NAME, LP, or BLOCK node expected; found: " + (com.google.javascript.jscomp.JsMessageVisitor.getReadableTokenName(node))), fnChild);
			}
		}
	}

	private void extractFromReturnDescendant(com.google.javascript.jscomp.JsMessage.Builder builder, com.google.javascript.rhino.Node node) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.STRING :
				builder.appendStringPart(node.getString());
				break;
			case com.google.javascript.rhino.Token.NAME :
				builder.appendPlaceholderReference(node.getString());
				break;
			case com.google.javascript.rhino.Token.ADD :
				for (com.google.javascript.rhino.Node child : node.children()) {
					extractFromReturnDescendant(builder, child);
				}
				break;
			default :
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("STRING, NAME, or ADD node expected; found: " + (com.google.javascript.jscomp.JsMessageVisitor.getReadableTokenName(node))), node);
		}
	}

	private void extractFromCallNode(com.google.javascript.jscomp.JsMessage.Builder builder, com.google.javascript.rhino.Node node) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		if (!(node.isCall())) {
			throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException((("Message must be initialized using " + (com.google.javascript.jscomp.JsMessageVisitor.MSG_FUNCTION_NAME)) + " function."), node);
		}
		com.google.javascript.rhino.Node fnNameNode = node.getFirstChild();
		if (!(com.google.javascript.jscomp.JsMessageVisitor.MSG_FUNCTION_NAME.equals(fnNameNode.getQualifiedName()))) {
			throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(((("Message initialized using unrecognized function. " + "Please use ") + (com.google.javascript.jscomp.JsMessageVisitor.MSG_FUNCTION_NAME)) + "() instead."), fnNameNode);
		}
		com.google.javascript.rhino.Node stringLiteralNode = fnNameNode.getNext();
		if (stringLiteralNode == null) {
			throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException("Message string literal expected", stringLiteralNode);
		}
		parseMessageTextNode(builder, stringLiteralNode);
		com.google.javascript.rhino.Node objLitNode = stringLiteralNode.getNext();
		java.util.Set<java.lang.String> phNames = com.google.common.collect.Sets.newHashSet();
		if (objLitNode != null) {
			if (!(objLitNode.isObjectLit())) {
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException("OBJLIT node expected", objLitNode);
			}
			for (com.google.javascript.rhino.Node aNode = objLitNode.getFirstChild(); aNode != null; aNode = aNode.getNext()) {
				if (!(aNode.isStringKey())) {
					throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException("STRING_KEY node expected as OBJLIT key", aNode);
				}
				java.lang.String phName = aNode.getString();
				if (!(com.google.javascript.jscomp.JsMessageVisitor.isLowerCamelCaseWithNumericSuffixes(phName))) {
					throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Placeholder name not in lowerCamelCase: " + phName), aNode);
				}
				if (phNames.contains(phName)) {
					throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Duplicate placeholder name: " + phName), aNode);
				}
				phNames.add(phName);
			}
		}
		java.util.Set<java.lang.String> usedPlaceholders = builder.getPlaceholders();
		for (java.lang.String phName : usedPlaceholders) {
			if (!(phNames.contains(phName))) {
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Unrecognized message placeholder referenced: " + phName), objLitNode);
			}
		}
		for (java.lang.String phName : phNames) {
			if (!(usedPlaceholders.contains(phName))) {
				throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Unused message placeholder: " + phName), objLitNode);
			}
		}
	}

	private void parseMessageTextNode(com.google.javascript.jscomp.JsMessage.Builder builder, com.google.javascript.rhino.Node node) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		java.lang.String value = com.google.javascript.jscomp.JsMessageVisitor.extractStringFromStringExprNode(node);
		while (true) {
			int phBegin = value.indexOf(com.google.javascript.jscomp.JsMessageVisitor.PH_JS_PREFIX);
			if (phBegin < 0) {
				builder.appendStringPart(value);
				return ;
			}else {
				if (phBegin > 0) {
					builder.appendStringPart(value.substring(0, phBegin));
				}
				int phEnd = value.indexOf(com.google.javascript.jscomp.JsMessageVisitor.PH_JS_SUFFIX, phBegin);
				if (phEnd < 0) {
					throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(("Placeholder incorrectly formatted in: " + (builder.getKey())), node);
				}
				java.lang.String phName = value.substring((phBegin + (com.google.javascript.jscomp.JsMessageVisitor.PH_JS_PREFIX.length())), phEnd);
				builder.appendPlaceholderReference(phName);
				int nextPos = phEnd + (com.google.javascript.jscomp.JsMessageVisitor.PH_JS_SUFFIX.length());
				if (nextPos < (value.length())) {
					value = value.substring(nextPos);
				}else {
					return ;
				}
			}
		} 
	}

	private void visitFallbackFunctionCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node call) {
		if ((((call.getChildCount()) != 3) || (!(call.getChildAtIndex(1).isName()))) || (!(call.getChildAtIndex(2).isName()))) {
			compiler.report(t.makeError(call, com.google.javascript.jscomp.JsMessageVisitor.BAD_FALLBACK_SYNTAX));
			return ;
		}
		com.google.javascript.rhino.Node firstArg = call.getChildAtIndex(1);
		com.google.javascript.jscomp.JsMessage firstMessage = getTrackedMessage(t, firstArg.getString());
		if (firstMessage == null) {
			compiler.report(t.makeError(firstArg, com.google.javascript.jscomp.JsMessageVisitor.FALLBACK_ARG_ERROR, firstArg.getString()));
			return ;
		}
		com.google.javascript.rhino.Node secondArg = firstArg.getNext();
		com.google.javascript.jscomp.JsMessage secondMessage = getTrackedMessage(t, call.getChildAtIndex(2).getString());
		if (secondMessage == null) {
			compiler.report(t.makeError(secondArg, com.google.javascript.jscomp.JsMessageVisitor.FALLBACK_ARG_ERROR, secondArg.getString()));
			return ;
		}
		processMessageFallback(call, firstMessage, secondMessage);
	}

	abstract void processJsMessage(com.google.javascript.jscomp.JsMessage message, com.google.javascript.jscomp.JsMessageDefinition definition);

	void processMessageFallback(com.google.javascript.rhino.Node callNode, com.google.javascript.jscomp.JsMessage message1, com.google.javascript.jscomp.JsMessage message2) {
	}

	boolean isMessageName(java.lang.String identifier, boolean isNewStyleMessage) {
		return (identifier.startsWith(com.google.javascript.jscomp.JsMessageVisitor.MSG_PREFIX)) && ((((style) == (com.google.javascript.jscomp.JsMessage.Style.CLOSURE)) || isNewStyleMessage) || (!(identifier.endsWith(com.google.javascript.jscomp.JsMessageVisitor.DESC_SUFFIX))));
	}

	private static boolean isUnnamedMessageName(java.lang.String identifier) {
		return com.google.javascript.jscomp.JsMessageVisitor.MSG_UNNAMED_PATTERN.matcher(identifier).matches();
	}

	static boolean isLowerCamelCaseWithNumericSuffixes(java.lang.String input) {
		return com.google.javascript.jscomp.JsMessageVisitor.CAMELCASE_PATTERN.matcher(input).matches();
	}

	private static java.lang.String getReadableTokenName(com.google.javascript.rhino.Node node) {
		return com.google.javascript.rhino.Token.name(node.getType());
	}

	static java.lang.String toLowerCamelCaseWithNumericSuffixes(java.lang.String input) {
		int suffixStart = input.length();
		while (suffixStart > 0) {
			char ch = ' ';
			int numberStart = suffixStart;
			while (numberStart > 0) {
				ch = input.charAt((numberStart - 1));
				if (java.lang.Character.isDigit(ch)) {
					numberStart--;
				}else {
					break;
				}
			} 
			if (((numberStart > 0) && (numberStart < suffixStart)) && (ch == '_')) {
				suffixStart = numberStart - 1;
			}else {
				break;
			}
		} 
		if (suffixStart == (input.length())) {
			return com.google.common.base.CaseFormat.UPPER_UNDERSCORE.to(com.google.common.base.CaseFormat.LOWER_CAMEL, input);
		}else {
			return (com.google.common.base.CaseFormat.UPPER_UNDERSCORE.to(com.google.common.base.CaseFormat.LOWER_CAMEL, input.substring(0, suffixStart))) + (input.substring(suffixStart));
		}
	}

	protected void checkNode(@javax.annotation.Nullable
	com.google.javascript.rhino.Node node, int type) throws com.google.javascript.jscomp.JsMessageVisitor.MalformedException {
		if (node == null) {
			throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException((("Expected node type " + type) + "; found: null"), node);
		}
		if ((node.getType()) != type) {
			throw new com.google.javascript.jscomp.JsMessageVisitor.MalformedException(((("Expected node type " + type) + "; found: ") + (node.getType())), node);
		}
	}

	static class MalformedException extends java.lang.Exception {
		private static final long serialVersionUID = 1L;

		private final com.google.javascript.rhino.Node node;

		MalformedException(java.lang.String message, com.google.javascript.rhino.Node node) {
			super(message);
			this.node = node;
		}

		com.google.javascript.rhino.Node getNode() {
			return node;
		}
	}

	private static class MessageLocation {
		private final com.google.javascript.jscomp.JsMessage message;

		private final com.google.javascript.rhino.Node messageNode;

		private MessageLocation(com.google.javascript.jscomp.JsMessage message, com.google.javascript.rhino.Node messageNode) {
			this.message = message;
			this.messageNode = messageNode;
		}
	}
}

