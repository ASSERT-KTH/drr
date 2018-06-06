

package com.google.javascript.jscomp.parsing;


class IRFactory {
	static final java.lang.String GETTER_ERROR_MESSAGE = "getters are not supported in older versions of JS. " + ("If you are targeting newer versions of JS, " + "set the appropriate language_in option.");

	static final java.lang.String SETTER_ERROR_MESSAGE = "setters are not supported in older versions of JS. " + ("If you are targeting newer versions of JS, " + "set the appropriate language_in option.");

	static final java.lang.String SUSPICIOUS_COMMENT_WARNING = "Non-JSDoc comment has annotations. " + "Did you mean to start it with '/**'?";

	static final java.lang.String MISPLACED_TYPE_ANNOTATION = "Type annotations are not allowed here. Are you missing parentheses?";

	private final java.lang.String sourceString;

	private final com.google.javascript.rhino.jstype.StaticSourceFile sourceFile;

	private final java.lang.String sourceName;

	private final com.google.javascript.jscomp.parsing.Config config;

	private final com.google.javascript.rhino.head.ErrorReporter errorReporter;

	private final com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher transformDispatcher;

	private static final com.google.common.collect.ImmutableSet<java.lang.String> ALLOWED_DIRECTIVES = com.google.common.collect.ImmutableSet.of("use strict");

	private static final com.google.common.collect.ImmutableSet<java.lang.String> ES5_RESERVED_KEYWORDS = com.google.common.collect.ImmutableSet.of("class", "const", "enum", "export", "extends", "import", "super");

	private static final com.google.common.collect.ImmutableSet<java.lang.String> ES5_STRICT_RESERVED_KEYWORDS = com.google.common.collect.ImmutableSet.of("class", "const", "enum", "export", "extends", "import", "super", "implements", "interface", "let", "package", "private", "protected", "public", "static", "yield");

	private final java.util.Set<java.lang.String> reservedKeywords;

	private final java.util.Set<com.google.javascript.rhino.head.ast.Comment> parsedComments = com.google.common.collect.Sets.newHashSet();

	com.google.javascript.rhino.Node rootNodeJsDocHolder = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SCRIPT);

	com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder = rootNodeJsDocHolder.getJsDocBuilderForNode();

	com.google.javascript.rhino.JSDocInfo fileOverviewInfo = null;

	private com.google.javascript.rhino.Node templateNode;

	private IRFactory(java.lang.String sourceString, com.google.javascript.rhino.jstype.StaticSourceFile sourceFile, com.google.javascript.jscomp.parsing.Config config, com.google.javascript.rhino.head.ErrorReporter errorReporter) {
		this.sourceString = sourceString;
		this.sourceFile = sourceFile;
		this.sourceName = (sourceFile == null) ? null : sourceFile.getName();
		this.config = config;
		this.errorReporter = errorReporter;
		this.transformDispatcher = new com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher();
		com.google.javascript.jscomp.parsing.IRFactory.this.templateNode = createTemplateNode();
		switch (config.languageMode) {
			case ECMASCRIPT3 :
				reservedKeywords = null;
				break;
			case ECMASCRIPT5 :
				reservedKeywords = com.google.javascript.jscomp.parsing.IRFactory.ES5_RESERVED_KEYWORDS;
				break;
			case ECMASCRIPT5_STRICT :
				reservedKeywords = com.google.javascript.jscomp.parsing.IRFactory.ES5_STRICT_RESERVED_KEYWORDS;
				break;
			default :
				throw new java.lang.IllegalStateException("unknown language mode");
		}
	}

	private com.google.javascript.rhino.Node createTemplateNode() {
		com.google.javascript.rhino.Node templateNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SCRIPT);
		templateNode.setStaticSourceFile(sourceFile);
		return templateNode;
	}

	public static com.google.javascript.rhino.Node transformTree(com.google.javascript.rhino.head.ast.AstRoot node, com.google.javascript.rhino.jstype.StaticSourceFile sourceFile, java.lang.String sourceString, com.google.javascript.jscomp.parsing.Config config, com.google.javascript.rhino.head.ErrorReporter errorReporter) {
		com.google.javascript.jscomp.parsing.IRFactory irFactory = new com.google.javascript.jscomp.parsing.IRFactory(sourceString, sourceFile, config, errorReporter);
		com.google.javascript.rhino.Node irNode = irFactory.transform(node);
		if ((node.getComments()) != null) {
			for (com.google.javascript.rhino.head.ast.Comment comment : node.getComments()) {
				if (((comment.getCommentType()) == (com.google.javascript.rhino.head.Token.CommentType.JSDOC)) && (!(irFactory.parsedComments.contains(comment)))) {
					irFactory.handlePossibleFileOverviewJsDoc(comment, irNode);
				}else
					if ((comment.getCommentType()) == (com.google.javascript.rhino.head.Token.CommentType.BLOCK_COMMENT)) {
						irFactory.handleBlockComment(comment);
					}
				
			}
		}
		irFactory.setFileOverviewJsDoc(irNode);
		return irNode;
	}

	private void setFileOverviewJsDoc(com.google.javascript.rhino.Node irNode) {
		com.google.javascript.rhino.JSDocInfo rootNodeJsDoc = rootNodeJsDocHolder.getJSDocInfo();
		if (rootNodeJsDoc != null) {
			irNode.setJSDocInfo(rootNodeJsDoc);
			rootNodeJsDoc.setAssociatedNode(irNode);
		}
		if ((fileOverviewInfo) != null) {
			if (((irNode.getJSDocInfo()) != null) && ((irNode.getJSDocInfo().getLicense()) != null)) {
				fileOverviewInfo.setLicense(irNode.getJSDocInfo().getLicense());
			}
			irNode.setJSDocInfo(fileOverviewInfo);
			fileOverviewInfo.setAssociatedNode(irNode);
		}
	}

	private com.google.javascript.rhino.Node transformBlock(com.google.javascript.rhino.head.ast.AstNode node) {
		com.google.javascript.rhino.Node irNode = transform(node);
		if (!(irNode.isBlock())) {
			if (irNode.isEmpty()) {
				irNode.setType(com.google.javascript.rhino.Token.BLOCK);
				irNode.setWasEmptyNode(true);
			}else {
				com.google.javascript.rhino.Node newBlock = newNode(com.google.javascript.rhino.Token.BLOCK, irNode);
				newBlock.setLineno(irNode.getLineno());
				newBlock.setCharno(irNode.getCharno());
				maybeSetLengthFrom(newBlock, node);
				irNode = newBlock;
			}
		}
		return irNode;
	}

	private void handleBlockComment(com.google.javascript.rhino.head.ast.Comment comment) {
		java.lang.String value = comment.getValue();
		if (((value.indexOf("/* @")) != (-1)) || ((value.indexOf("\n * @")) != (-1))) {
			errorReporter.warning(com.google.javascript.jscomp.parsing.IRFactory.SUSPICIOUS_COMMENT_WARNING, sourceName, comment.getLineno(), "", 0);
		}
	}

	private boolean handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.parsing.JsDocInfoParser jsDocParser) {
		if ((jsDocParser.getFileOverviewJSDocInfo()) != (fileOverviewInfo)) {
			fileOverviewInfo = jsDocParser.getFileOverviewJSDocInfo();
			return true;
		}
		return false;
	}

	private void handlePossibleFileOverviewJsDoc(com.google.javascript.rhino.head.ast.Comment comment, com.google.javascript.rhino.Node irNode) {
		com.google.javascript.jscomp.parsing.JsDocInfoParser jsDocParser = createJsDocInfoParser(comment, irNode);
		parsedComments.add(comment);
		handlePossibleFileOverviewJsDoc(jsDocParser);
	}

	private com.google.javascript.rhino.JSDocInfo handleJsDoc(com.google.javascript.rhino.head.ast.AstNode node, com.google.javascript.rhino.Node irNode) {
		com.google.javascript.rhino.head.ast.Comment comment = node.getJsDocNode();
		if (comment != null) {
			com.google.javascript.jscomp.parsing.JsDocInfoParser jsDocParser = createJsDocInfoParser(comment, irNode);
			parsedComments.add(comment);
			if (!(handlePossibleFileOverviewJsDoc(jsDocParser))) {
				com.google.javascript.rhino.JSDocInfo info = jsDocParser.retrieveAndResetParsedJSDocInfo();
				if (info != null) {
					validateTypeAnnotations(info, node, irNode);
				}
				return info;
			}
		}
		return null;
	}

	private void validateTypeAnnotations(com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.head.ast.AstNode node, com.google.javascript.rhino.Node irNode) {
		if ((info.getType()) != null) {
			boolean valid = false;
			switch (node.getType()) {
				case com.google.javascript.rhino.head.Token.LP :
					valid = node instanceof com.google.javascript.rhino.head.ast.ParenthesizedExpression;
					break;
				case com.google.javascript.rhino.head.Token.VAR :
					valid = true;
					break;
				case com.google.javascript.rhino.head.Token.FUNCTION :
					com.google.javascript.rhino.head.ast.FunctionNode fnNode = ((com.google.javascript.rhino.head.ast.FunctionNode) (node));
					valid = (fnNode.getFunctionType()) == (com.google.javascript.rhino.head.ast.FunctionNode.FUNCTION_STATEMENT);
					break;
				case com.google.javascript.rhino.head.Token.NAME :
					valid = (((node.getParent()) instanceof com.google.javascript.rhino.head.ast.ObjectProperty) || ((node.getParent()) instanceof com.google.javascript.rhino.head.ast.CatchClause)) || ((node.getParent()) instanceof com.google.javascript.rhino.head.ast.FunctionNode);
					break;
				case com.google.javascript.rhino.head.Token.GET :
				case com.google.javascript.rhino.head.Token.SET :
				case com.google.javascript.rhino.head.Token.NUMBER :
				case com.google.javascript.rhino.head.Token.STRING :
					valid = (node.getParent()) instanceof com.google.javascript.rhino.head.ast.ObjectProperty;
					break;
				case com.google.javascript.rhino.head.Token.ASSIGN :
					if (node instanceof com.google.javascript.rhino.head.ast.Assignment) {
						valid = (isExprStmt(node.getParent())) && (isPropAccess(((com.google.javascript.rhino.head.ast.Assignment) (node)).getLeft()));
					}
					break;
				case com.google.javascript.rhino.head.Token.GETPROP :
				case com.google.javascript.rhino.head.Token.GETELEM :
					valid = isExprStmt(node.getParent());
					break;
			}
			if (!valid) {
				errorReporter.warning(com.google.javascript.jscomp.parsing.IRFactory.MISPLACED_TYPE_ANNOTATION, sourceName, node.getLineno(), "", 0);
			}
		}
	}

	private boolean isPropAccess(com.google.javascript.rhino.head.ast.AstNode node) {
		return ((node.getType()) == (com.google.javascript.rhino.head.Token.GETPROP)) || ((node.getType()) == (com.google.javascript.rhino.head.Token.GETELEM));
	}

	private boolean isExprStmt(com.google.javascript.rhino.head.ast.AstNode node) {
		return ((node.getType()) == (com.google.javascript.rhino.head.Token.EXPR_RESULT)) || ((node.getType()) == (com.google.javascript.rhino.head.Token.EXPR_VOID));
	}

	private com.google.javascript.rhino.Node transform(com.google.javascript.rhino.head.ast.AstNode node) {
		com.google.javascript.rhino.Node irNode = justTransform(node);
		com.google.javascript.rhino.JSDocInfo jsDocInfo = handleJsDoc(node, irNode);
		if (jsDocInfo != null) {
			irNode.setJSDocInfo(jsDocInfo);
		}
		setSourceInfo(irNode, node);
		return irNode;
	}

	private com.google.javascript.rhino.Node transformNameAsString(com.google.javascript.rhino.head.ast.Name node) {
		com.google.javascript.rhino.Node irNode = transformDispatcher.processName(node, true);
		com.google.javascript.rhino.JSDocInfo jsDocInfo = handleJsDoc(node, irNode);
		if (jsDocInfo != null) {
			irNode.setJSDocInfo(jsDocInfo);
		}
		setSourceInfo(irNode, node);
		return irNode;
	}

	private com.google.javascript.rhino.Node transformNumberAsString(com.google.javascript.rhino.head.ast.NumberLiteral literalNode) {
		com.google.javascript.rhino.Node irNode = newStringNode(com.google.javascript.jscomp.parsing.IRFactory.getStringValue(literalNode.getNumber()));
		com.google.javascript.rhino.JSDocInfo jsDocInfo = handleJsDoc(literalNode, irNode);
		if (jsDocInfo != null) {
			irNode.setJSDocInfo(jsDocInfo);
		}
		setSourceInfo(irNode, literalNode);
		return irNode;
	}

	private static java.lang.String getStringValue(double value) {
		long longValue = ((long) (value));
		if (longValue == value) {
			return java.lang.Long.toString(longValue);
		}else {
			return java.lang.Double.toString(value);
		}
	}

	private void setSourceInfo(com.google.javascript.rhino.Node irNode, com.google.javascript.rhino.head.ast.AstNode node) {
		if ((irNode.getLineno()) == (-1)) {
			int lineno = node.getLineno();
			irNode.setLineno(lineno);
			int charno = position2charno(node.getAbsolutePosition());
			irNode.setCharno(charno);
			maybeSetLengthFrom(irNode, node);
		}
	}

	private com.google.javascript.jscomp.parsing.JsDocInfoParser createJsDocInfoParser(com.google.javascript.rhino.head.ast.Comment node, com.google.javascript.rhino.Node irNode) {
		java.lang.String comment = node.getValue();
		int lineno = node.getLineno();
		int position = node.getAbsolutePosition();
		int numOpeningChars = 3;
		com.google.javascript.jscomp.parsing.JsDocInfoParser jsdocParser = new com.google.javascript.jscomp.parsing.JsDocInfoParser(new com.google.javascript.jscomp.parsing.JsDocTokenStream(comment.substring(numOpeningChars), lineno, ((position2charno(position)) + numOpeningChars)), node, irNode, config, errorReporter);
		jsdocParser.setFileLevelJsDocBuilder(fileLevelJsDocBuilder);
		jsdocParser.setFileOverviewJSDocInfo(fileOverviewInfo);
		jsdocParser.parse();
		return jsdocParser;
	}

	private void maybeSetLengthFrom(com.google.javascript.rhino.Node node, com.google.javascript.rhino.head.ast.AstNode source) {
		if (config.isIdeMode) {
			node.setLength(source.getLength());
		}
	}

	private int position2charno(int position) {
		int lineIndex = sourceString.lastIndexOf('\n', position);
		if (lineIndex == (-1)) {
			return position;
		}else {
			return (position - lineIndex) - 1;
		}
	}

	private com.google.javascript.rhino.Node justTransform(com.google.javascript.rhino.head.ast.AstNode node) {
		return transformDispatcher.process(node);
	}

	private class TransformDispatcher extends com.google.javascript.jscomp.parsing.TypeSafeDispatcher<com.google.javascript.rhino.Node> {
		private com.google.javascript.rhino.Node processGeneric(com.google.javascript.rhino.head.Node n) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(n.getType()));
			for (com.google.javascript.rhino.head.Node child : n) {
				node.addChildToBack(transform(((com.google.javascript.rhino.head.ast.AstNode) (child))));
			}
			return node;
		}

		private com.google.javascript.rhino.Node transformAsString(com.google.javascript.rhino.head.ast.AstNode n) {
			com.google.javascript.rhino.Node ret;
			if (n instanceof com.google.javascript.rhino.head.ast.Name) {
				ret = transformNameAsString(((com.google.javascript.rhino.head.ast.Name) (n)));
			}else
				if (n instanceof com.google.javascript.rhino.head.ast.NumberLiteral) {
					ret = transformNumberAsString(((com.google.javascript.rhino.head.ast.NumberLiteral) (n)));
					ret.putBooleanProp(com.google.javascript.rhino.Node.QUOTED_PROP, true);
				}else {
					ret = transform(n);
					ret.putBooleanProp(com.google.javascript.rhino.Node.QUOTED_PROP, true);
				}
			
			com.google.common.base.Preconditions.checkState(ret.isString());
			return ret;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processArrayLiteral(com.google.javascript.rhino.head.ast.ArrayLiteral literalNode) {
			if (literalNode.isDestructuring()) {
				reportDestructuringAssign(literalNode);
			}
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.ARRAYLIT);
			for (com.google.javascript.rhino.head.ast.AstNode child : literalNode.getElements()) {
				com.google.javascript.rhino.Node c = transform(child);
				node.addChildToBack(c);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processAssignment(com.google.javascript.rhino.head.ast.Assignment assignmentNode) {
			com.google.javascript.rhino.Node assign = processInfixExpression(assignmentNode);
			com.google.javascript.rhino.Node target = assign.getFirstChild();
			if (!(validAssignmentTarget(target))) {
				errorReporter.error("invalid assignment target", sourceName, target.getLineno(), "", 0);
			}
			return assign;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processAstRoot(com.google.javascript.rhino.head.ast.AstRoot rootNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.SCRIPT);
			for (com.google.javascript.rhino.head.Node child : rootNode) {
				node.addChildToBack(transform(((com.google.javascript.rhino.head.ast.AstNode) (child))));
			}
			parseDirectives(node);
			return node;
		}

		private void parseDirectives(com.google.javascript.rhino.Node node) {
			java.util.Set<java.lang.String> directives = null;
			while (isDirective(node.getFirstChild())) {
				java.lang.String directive = node.removeFirstChild().getFirstChild().getString();
				if (directives == null) {
					directives = com.google.common.collect.Sets.newHashSet(directive);
				}else {
					directives.add(directive);
				}
			} 
			if (directives != null) {
				node.setDirectives(directives);
			}
		}

		private boolean isDirective(com.google.javascript.rhino.Node n) {
			if (n == null)
				return false;
			
			int nType = n.getType();
			return ((nType == (com.google.javascript.rhino.Token.EXPR_RESULT)) && (n.getFirstChild().isString())) && (com.google.javascript.jscomp.parsing.IRFactory.ALLOWED_DIRECTIVES.contains(n.getFirstChild().getString()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processBlock(com.google.javascript.rhino.head.ast.Block blockNode) {
			return processGeneric(blockNode);
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processBreakStatement(com.google.javascript.rhino.head.ast.BreakStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.BREAK);
			if ((statementNode.getBreakLabel()) != null) {
				com.google.javascript.rhino.Node labelName = transform(statementNode.getBreakLabel());
				labelName.setType(com.google.javascript.rhino.Token.LABEL_NAME);
				node.addChildToBack(labelName);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processCatchClause(com.google.javascript.rhino.head.ast.CatchClause clauseNode) {
			com.google.javascript.rhino.head.ast.AstNode catchVar = clauseNode.getVarName();
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.CATCH, transform(catchVar));
			if ((clauseNode.getCatchCondition()) != null) {
				errorReporter.error("Catch clauses are not supported", sourceName, clauseNode.getCatchCondition().getLineno(), "", 0);
			}
			node.addChildToBack(transformBlock(clauseNode.getBody()));
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processConditionalExpression(com.google.javascript.rhino.head.ast.ConditionalExpression exprNode) {
			return newNode(com.google.javascript.rhino.Token.HOOK, transform(exprNode.getTestExpression()), transform(exprNode.getTrueExpression()), transform(exprNode.getFalseExpression()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processContinueStatement(com.google.javascript.rhino.head.ast.ContinueStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.CONTINUE);
			if ((statementNode.getLabel()) != null) {
				com.google.javascript.rhino.Node labelName = transform(statementNode.getLabel());
				labelName.setType(com.google.javascript.rhino.Token.LABEL_NAME);
				node.addChildToBack(labelName);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processDoLoop(com.google.javascript.rhino.head.ast.DoLoop loopNode) {
			return newNode(com.google.javascript.rhino.Token.DO, transformBlock(loopNode.getBody()), transform(loopNode.getCondition()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processElementGet(com.google.javascript.rhino.head.ast.ElementGet getNode) {
			return newNode(com.google.javascript.rhino.Token.GETELEM, transform(getNode.getTarget()), transform(getNode.getElement()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processEmptyExpression(com.google.javascript.rhino.head.ast.EmptyExpression exprNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.EMPTY);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processEmptyStatement(com.google.javascript.rhino.head.ast.EmptyStatement exprNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.EMPTY);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processExpressionStatement(com.google.javascript.rhino.head.ast.ExpressionStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(statementNode.getType()));
			node.addChildToBack(transform(statementNode.getExpression()));
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processForInLoop(com.google.javascript.rhino.head.ast.ForInLoop loopNode) {
			if (loopNode.isForEach()) {
				errorReporter.error("unsupported language extension: for each", sourceName, loopNode.getLineno(), "", 0);
				return newNode(com.google.javascript.rhino.Token.EXPR_RESULT, com.google.javascript.rhino.Node.newNumber(0));
			}
			return newNode(com.google.javascript.rhino.Token.FOR, transform(loopNode.getIterator()), transform(loopNode.getIteratedObject()), transformBlock(loopNode.getBody()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processForLoop(com.google.javascript.rhino.head.ast.ForLoop loopNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.FOR, transform(loopNode.getInitializer()), transform(loopNode.getCondition()), transform(loopNode.getIncrement()));
			node.addChildToBack(transformBlock(loopNode.getBody()));
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processFunctionCall(com.google.javascript.rhino.head.ast.FunctionCall callNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(callNode.getType()), transform(callNode.getTarget()));
			for (com.google.javascript.rhino.head.ast.AstNode child : callNode.getArguments()) {
				node.addChildToBack(transform(child));
			}
			node.setLineno(node.getFirstChild().getLineno());
			node.setCharno(node.getFirstChild().getCharno());
			maybeSetLengthFrom(node, callNode);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processFunctionNode(com.google.javascript.rhino.head.ast.FunctionNode functionNode) {
			com.google.javascript.rhino.head.ast.Name name = functionNode.getFunctionName();
			java.lang.Boolean isUnnamedFunction = false;
			if (name == null) {
				int functionType = functionNode.getFunctionType();
				if (functionType != (com.google.javascript.rhino.head.ast.FunctionNode.FUNCTION_EXPRESSION)) {
					errorReporter.error("unnamed function statement", sourceName, functionNode.getLineno(), "", 0);
					return newNode(com.google.javascript.rhino.Token.EXPR_RESULT, com.google.javascript.rhino.Node.newNumber(0));
				}
				name = new com.google.javascript.rhino.head.ast.Name();
				name.setIdentifier("");
				isUnnamedFunction = true;
			}
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.FUNCTION);
			com.google.javascript.rhino.Node newName = transform(name);
			if (isUnnamedFunction) {
				newName.setLineno(functionNode.getLineno());
				int lpColumn = (functionNode.getAbsolutePosition()) + (functionNode.getLp());
				newName.setCharno(position2charno(lpColumn));
				maybeSetLengthFrom(newName, name);
			}
			node.addChildToBack(newName);
			com.google.javascript.rhino.Node lp = newNode(com.google.javascript.rhino.Token.PARAM_LIST);
			com.google.javascript.rhino.head.ast.Name fnName = functionNode.getFunctionName();
			if (fnName != null) {
				lp.setLineno(fnName.getLineno());
			}else {
				lp.setLineno(functionNode.getLineno());
			}
			int lparenCharno = (functionNode.getLp()) + (functionNode.getAbsolutePosition());
			lp.setCharno(position2charno(lparenCharno));
			for (com.google.javascript.rhino.head.ast.AstNode param : functionNode.getParams()) {
				com.google.javascript.rhino.Node paramNode = transform(param);
				if (paramNode.isName()) {
					lp.addChildToBack(paramNode);
				}else {
					com.google.common.base.Preconditions.checkState((((config.isIdeMode) || (paramNode.isObjectLit())) || (paramNode.isArrayLit())));
				}
			}
			node.addChildToBack(lp);
			com.google.javascript.rhino.Node bodyNode = transform(functionNode.getBody());
			if (!(bodyNode.isBlock())) {
				com.google.common.base.Preconditions.checkState(config.isIdeMode);
				bodyNode = com.google.javascript.rhino.IR.block();
			}
			parseDirectives(bodyNode);
			node.addChildToBack(bodyNode);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processIfStatement(com.google.javascript.rhino.head.ast.IfStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.IF);
			node.addChildToBack(transform(statementNode.getCondition()));
			node.addChildToBack(transformBlock(statementNode.getThenPart()));
			if ((statementNode.getElsePart()) != null) {
				node.addChildToBack(transformBlock(statementNode.getElsePart()));
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processInfixExpression(com.google.javascript.rhino.head.ast.InfixExpression exprNode) {
			com.google.javascript.rhino.Node n = newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(exprNode.getType()), transform(exprNode.getLeft()), transform(exprNode.getRight()));
			n.setLineno(exprNode.getLineno());
			n.setCharno(position2charno(exprNode.getAbsolutePosition()));
			maybeSetLengthFrom(n, exprNode);
			return n;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processKeywordLiteral(com.google.javascript.rhino.head.ast.KeywordLiteral literalNode) {
			return newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(literalNode.getType()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processLabel(com.google.javascript.rhino.head.ast.Label labelNode) {
			return newStringNode(com.google.javascript.rhino.Token.LABEL_NAME, labelNode.getName());
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processLabeledStatement(com.google.javascript.rhino.head.ast.LabeledStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.LABEL);
			com.google.javascript.rhino.Node prev = null;
			com.google.javascript.rhino.Node cur = node;
			for (com.google.javascript.rhino.head.ast.Label label : statementNode.getLabels()) {
				if (prev != null) {
					prev.addChildToBack(cur);
				}
				cur.addChildToBack(transform(label));
				cur.setLineno(label.getLineno());
				maybeSetLengthFrom(cur, label);
				int clauseAbsolutePosition = position2charno(label.getAbsolutePosition());
				cur.setCharno(clauseAbsolutePosition);
				prev = cur;
				cur = newNode(com.google.javascript.rhino.Token.LABEL);
			}
			prev.addChildToBack(transform(statementNode.getStatement()));
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processName(com.google.javascript.rhino.head.ast.Name nameNode) {
			return processName(nameNode, false);
		}

		com.google.javascript.rhino.Node processName(com.google.javascript.rhino.head.ast.Name nameNode, boolean asString) {
			if (asString) {
				return newStringNode(com.google.javascript.rhino.Token.STRING, nameNode.getIdentifier());
			}else {
				if (isReservedKeyword(nameNode.getIdentifier())) {
					errorReporter.error("identifier is a reserved word", sourceName, nameNode.getLineno(), "", 0);
				}
				return newStringNode(com.google.javascript.rhino.Token.NAME, nameNode.getIdentifier());
			}
		}

		private boolean isReservedKeyword(java.lang.String identifier) {
			return ((reservedKeywords) != null) && (reservedKeywords.contains(identifier));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processNewExpression(com.google.javascript.rhino.head.ast.NewExpression exprNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(exprNode.getType()), transform(exprNode.getTarget()));
			for (com.google.javascript.rhino.head.ast.AstNode child : exprNode.getArguments()) {
				node.addChildToBack(transform(child));
			}
			node.setLineno(exprNode.getLineno());
			node.setCharno(position2charno(exprNode.getAbsolutePosition()));
			maybeSetLengthFrom(node, exprNode);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processNumberLiteral(com.google.javascript.rhino.head.ast.NumberLiteral literalNode) {
			return newNumberNode(literalNode.getNumber());
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processObjectLiteral(com.google.javascript.rhino.head.ast.ObjectLiteral literalNode) {
			if (literalNode.isDestructuring()) {
				reportDestructuringAssign(literalNode);
			}
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.OBJECTLIT);
			for (com.google.javascript.rhino.head.ast.ObjectProperty el : literalNode.getElements()) {
				if ((config.languageMode) == (com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3)) {
					if (el.isGetter()) {
						reportGetter(el);
						continue;
					}else
						if (el.isSetter()) {
							reportSetter(el);
							continue;
						}
					
				}
				com.google.javascript.rhino.Node key = transformAsString(el.getLeft());
				key.setType(com.google.javascript.rhino.Token.STRING_KEY);
				com.google.javascript.rhino.Node value = transform(el.getRight());
				if (el.isGetter()) {
					key.setType(com.google.javascript.rhino.Token.GETTER_DEF);
					com.google.common.base.Preconditions.checkState(value.isFunction());
					if (getFnParamNode(value).hasChildren()) {
						reportGetterParam(el.getLeft());
					}
				}else
					if (el.isSetter()) {
						key.setType(com.google.javascript.rhino.Token.SETTER_DEF);
						com.google.common.base.Preconditions.checkState(value.isFunction());
						if (!(getFnParamNode(value).hasOneChild())) {
							reportSetterParam(el.getLeft());
						}
					}
				
				key.addChildToFront(value);
				node.addChildToBack(key);
			}
			return node;
		}

		com.google.javascript.rhino.Node getFnParamNode(com.google.javascript.rhino.Node fnNode) {
			com.google.common.base.Preconditions.checkArgument(fnNode.isFunction());
			return fnNode.getFirstChild().getNext();
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processObjectProperty(com.google.javascript.rhino.head.ast.ObjectProperty propertyNode) {
			return processInfixExpression(propertyNode);
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processParenthesizedExpression(com.google.javascript.rhino.head.ast.ParenthesizedExpression exprNode) {
			com.google.javascript.rhino.Node node = transform(exprNode.getExpression());
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processPropertyGet(com.google.javascript.rhino.head.ast.PropertyGet getNode) {
			com.google.javascript.rhino.Node leftChild = transform(getNode.getTarget());
			com.google.javascript.rhino.Node newNode = newNode(com.google.javascript.rhino.Token.GETPROP, leftChild, transformAsString(getNode.getProperty()));
			newNode.setLineno(leftChild.getLineno());
			newNode.setCharno(leftChild.getCharno());
			maybeSetLengthFrom(newNode, getNode);
			return newNode;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processRegExpLiteral(com.google.javascript.rhino.head.ast.RegExpLiteral literalNode) {
			com.google.javascript.rhino.Node literalStringNode = newStringNode(literalNode.getValue());
			literalStringNode.setLineno(literalNode.getLineno());
			maybeSetLengthFrom(literalStringNode, literalNode);
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.REGEXP, literalStringNode);
			java.lang.String flags = literalNode.getFlags();
			if ((flags != null) && (!(flags.isEmpty()))) {
				com.google.javascript.rhino.Node flagsNode = newStringNode(flags);
				flagsNode.setLineno(literalNode.getLineno());
				maybeSetLengthFrom(flagsNode, literalNode);
				node.addChildToBack(flagsNode);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processReturnStatement(com.google.javascript.rhino.head.ast.ReturnStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.RETURN);
			if ((statementNode.getReturnValue()) != null) {
				node.addChildToBack(transform(statementNode.getReturnValue()));
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processScope(com.google.javascript.rhino.head.ast.Scope scopeNode) {
			return processGeneric(scopeNode);
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processStringLiteral(com.google.javascript.rhino.head.ast.StringLiteral literalNode) {
			java.lang.String value = literalNode.getValue();
			com.google.javascript.rhino.Node n = newStringNode(value);
			if ((value.indexOf('')) != (-1)) {
				int start = literalNode.getAbsolutePosition();
				int end = start + (literalNode.getLength());
				if ((start < (sourceString.length())) && ((sourceString.substring(start, java.lang.Math.min(sourceString.length(), end)).indexOf("\\v")) != (-1))) {
					n.putBooleanProp(com.google.javascript.rhino.Node.SLASH_V, true);
				}
			}
			return n;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processSwitchCase(com.google.javascript.rhino.head.ast.SwitchCase caseNode) {
			com.google.javascript.rhino.Node node;
			if (caseNode.isDefault()) {
				node = newNode(com.google.javascript.rhino.Token.DEFAULT_CASE);
			}else {
				com.google.javascript.rhino.head.ast.AstNode expr = caseNode.getExpression();
				node = newNode(com.google.javascript.rhino.Token.CASE, transform(expr));
			}
			com.google.javascript.rhino.Node block = newNode(com.google.javascript.rhino.Token.BLOCK);
			block.putBooleanProp(com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP, true);
			block.setLineno(caseNode.getLineno());
			block.setCharno(position2charno(caseNode.getAbsolutePosition()));
			maybeSetLengthFrom(block, caseNode);
			if ((caseNode.getStatements()) != null) {
				for (com.google.javascript.rhino.head.ast.AstNode child : caseNode.getStatements()) {
					block.addChildToBack(transform(child));
				}
			}
			node.addChildToBack(block);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processSwitchStatement(com.google.javascript.rhino.head.ast.SwitchStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.SWITCH, transform(statementNode.getExpression()));
			for (com.google.javascript.rhino.head.ast.AstNode child : statementNode.getCases()) {
				node.addChildToBack(transform(child));
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processThrowStatement(com.google.javascript.rhino.head.ast.ThrowStatement statementNode) {
			return newNode(com.google.javascript.rhino.Token.THROW, transform(statementNode.getExpression()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processTryStatement(com.google.javascript.rhino.head.ast.TryStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.TRY, transformBlock(statementNode.getTryBlock()));
			com.google.javascript.rhino.Node block = newNode(com.google.javascript.rhino.Token.BLOCK);
			boolean lineSet = false;
			for (com.google.javascript.rhino.head.ast.CatchClause cc : statementNode.getCatchClauses()) {
				if (lineSet == false) {
					block.setLineno(cc.getLineno());
					maybeSetLengthFrom(block, cc);
					lineSet = true;
				}
				block.addChildToBack(transform(cc));
			}
			node.addChildToBack(block);
			com.google.javascript.rhino.head.ast.AstNode finallyBlock = statementNode.getFinallyBlock();
			if (finallyBlock != null) {
				node.addChildToBack(transformBlock(finallyBlock));
			}
			if ((lineSet == false) && (finallyBlock != null)) {
				block.setLineno(finallyBlock.getLineno());
				maybeSetLengthFrom(block, finallyBlock);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processUnaryExpression(com.google.javascript.rhino.head.ast.UnaryExpression exprNode) {
			int type = com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(exprNode.getType());
			com.google.javascript.rhino.Node operand = transform(exprNode.getOperand());
			if ((type == (com.google.javascript.rhino.Token.NEG)) && (operand.isNumber())) {
				operand.setDouble((-(operand.getDouble())));
				return operand;
			}else {
				if ((type == (com.google.javascript.rhino.Token.DELPROP)) && (!(((operand.isGetProp()) || (operand.isGetElem())) || (operand.isName())))) {
					java.lang.String msg = "Invalid delete operand. Only properties can be deleted.";
					errorReporter.error(msg, sourceName, operand.getLineno(), "", 0);
				}else
					if ((type == (com.google.javascript.rhino.Token.INC)) || (type == (com.google.javascript.rhino.Token.DEC))) {
						if (!(validAssignmentTarget(operand))) {
							java.lang.String msg = type == (com.google.javascript.rhino.Token.INC) ? "invalid increment target" : "invalid decrement target";
							errorReporter.error(msg, sourceName, operand.getLineno(), "", 0);
						}
					}
				
				com.google.javascript.rhino.Node node = newNode(type, operand);
				if (exprNode.isPostfix()) {
					node.putBooleanProp(com.google.javascript.rhino.Node.INCRDECR_PROP, true);
				}
				return node;
			}
		}

		private boolean validAssignmentTarget(com.google.javascript.rhino.Node target) {
			switch (target.getType()) {
				case com.google.javascript.rhino.Token.NAME :
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					return true;
			}
			return false;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processVariableDeclaration(com.google.javascript.rhino.head.ast.VariableDeclaration declarationNode) {
			if ((!(config.acceptConstKeyword)) && ((declarationNode.getType()) == (com.google.javascript.rhino.head.Token.CONST))) {
				processIllegalToken(declarationNode);
			}
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.VAR);
			for (com.google.javascript.rhino.head.ast.VariableInitializer child : declarationNode.getVariables()) {
				node.addChildToBack(transform(child));
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processVariableInitializer(com.google.javascript.rhino.head.ast.VariableInitializer initializerNode) {
			com.google.javascript.rhino.Node node = transform(initializerNode.getTarget());
			if ((initializerNode.getInitializer()) != null) {
				com.google.javascript.rhino.Node initalizer = transform(initializerNode.getInitializer());
				node.addChildToBack(initalizer);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processWhileLoop(com.google.javascript.rhino.head.ast.WhileLoop loopNode) {
			return newNode(com.google.javascript.rhino.Token.WHILE, transform(loopNode.getCondition()), transformBlock(loopNode.getBody()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processWithStatement(com.google.javascript.rhino.head.ast.WithStatement statementNode) {
			return newNode(com.google.javascript.rhino.Token.WITH, transform(statementNode.getExpression()), transformBlock(statementNode.getStatement()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processIllegalToken(com.google.javascript.rhino.head.ast.AstNode node) {
			errorReporter.error(("Unsupported syntax: " + (com.google.javascript.rhino.head.Token.typeToName(node.getType()))), sourceName, node.getLineno(), "", 0);
			return newNode(com.google.javascript.rhino.Token.EMPTY);
		}

		void reportDestructuringAssign(com.google.javascript.rhino.head.ast.AstNode node) {
			errorReporter.error("destructuring assignment forbidden", sourceName, node.getLineno(), "", 0);
		}

		void reportGetter(com.google.javascript.rhino.head.ast.AstNode node) {
			errorReporter.error(com.google.javascript.jscomp.parsing.IRFactory.GETTER_ERROR_MESSAGE, sourceName, node.getLineno(), "", 0);
		}

		void reportSetter(com.google.javascript.rhino.head.ast.AstNode node) {
			errorReporter.error(com.google.javascript.jscomp.parsing.IRFactory.SETTER_ERROR_MESSAGE, sourceName, node.getLineno(), "", 0);
		}

		void reportGetterParam(com.google.javascript.rhino.head.ast.AstNode node) {
			errorReporter.error("getters may not have parameters", sourceName, node.getLineno(), "", 0);
		}

		void reportSetterParam(com.google.javascript.rhino.head.ast.AstNode node) {
			errorReporter.error("setters must have exactly one parameter", sourceName, node.getLineno(), "", 0);
		}
	}

	private static int transformTokenType(int token) {
		switch (token) {
			case com.google.javascript.rhino.head.Token.RETURN :
				return com.google.javascript.rhino.Token.RETURN;
			case com.google.javascript.rhino.head.Token.BITOR :
				return com.google.javascript.rhino.Token.BITOR;
			case com.google.javascript.rhino.head.Token.BITXOR :
				return com.google.javascript.rhino.Token.BITXOR;
			case com.google.javascript.rhino.head.Token.BITAND :
				return com.google.javascript.rhino.Token.BITAND;
			case com.google.javascript.rhino.head.Token.EQ :
				return com.google.javascript.rhino.Token.EQ;
			case com.google.javascript.rhino.head.Token.NE :
				return com.google.javascript.rhino.Token.NE;
			case com.google.javascript.rhino.head.Token.LT :
				return com.google.javascript.rhino.Token.LT;
			case com.google.javascript.rhino.head.Token.LE :
				return com.google.javascript.rhino.Token.LE;
			case com.google.javascript.rhino.head.Token.GT :
				return com.google.javascript.rhino.Token.GT;
			case com.google.javascript.rhino.head.Token.GE :
				return com.google.javascript.rhino.Token.GE;
			case com.google.javascript.rhino.head.Token.LSH :
				return com.google.javascript.rhino.Token.LSH;
			case com.google.javascript.rhino.head.Token.RSH :
				return com.google.javascript.rhino.Token.RSH;
			case com.google.javascript.rhino.head.Token.URSH :
				return com.google.javascript.rhino.Token.URSH;
			case com.google.javascript.rhino.head.Token.ADD :
				return com.google.javascript.rhino.Token.ADD;
			case com.google.javascript.rhino.head.Token.SUB :
				return com.google.javascript.rhino.Token.SUB;
			case com.google.javascript.rhino.head.Token.MUL :
				return com.google.javascript.rhino.Token.MUL;
			case com.google.javascript.rhino.head.Token.DIV :
				return com.google.javascript.rhino.Token.DIV;
			case com.google.javascript.rhino.head.Token.MOD :
				return com.google.javascript.rhino.Token.MOD;
			case com.google.javascript.rhino.head.Token.NOT :
				return com.google.javascript.rhino.Token.NOT;
			case com.google.javascript.rhino.head.Token.BITNOT :
				return com.google.javascript.rhino.Token.BITNOT;
			case com.google.javascript.rhino.head.Token.POS :
				return com.google.javascript.rhino.Token.POS;
			case com.google.javascript.rhino.head.Token.NEG :
				return com.google.javascript.rhino.Token.NEG;
			case com.google.javascript.rhino.head.Token.NEW :
				return com.google.javascript.rhino.Token.NEW;
			case com.google.javascript.rhino.head.Token.DELPROP :
				return com.google.javascript.rhino.Token.DELPROP;
			case com.google.javascript.rhino.head.Token.TYPEOF :
				return com.google.javascript.rhino.Token.TYPEOF;
			case com.google.javascript.rhino.head.Token.GETPROP :
				return com.google.javascript.rhino.Token.GETPROP;
			case com.google.javascript.rhino.head.Token.GETELEM :
				return com.google.javascript.rhino.Token.GETELEM;
			case com.google.javascript.rhino.head.Token.CALL :
				return com.google.javascript.rhino.Token.CALL;
			case com.google.javascript.rhino.head.Token.NAME :
				return com.google.javascript.rhino.Token.NAME;
			case com.google.javascript.rhino.head.Token.NUMBER :
				return com.google.javascript.rhino.Token.NUMBER;
			case com.google.javascript.rhino.head.Token.STRING :
				return com.google.javascript.rhino.Token.STRING;
			case com.google.javascript.rhino.head.Token.NULL :
				return com.google.javascript.rhino.Token.NULL;
			case com.google.javascript.rhino.head.Token.THIS :
				return com.google.javascript.rhino.Token.THIS;
			case com.google.javascript.rhino.head.Token.FALSE :
				return com.google.javascript.rhino.Token.FALSE;
			case com.google.javascript.rhino.head.Token.TRUE :
				return com.google.javascript.rhino.Token.TRUE;
			case com.google.javascript.rhino.head.Token.SHEQ :
				return com.google.javascript.rhino.Token.SHEQ;
			case com.google.javascript.rhino.head.Token.SHNE :
				return com.google.javascript.rhino.Token.SHNE;
			case com.google.javascript.rhino.head.Token.REGEXP :
				return com.google.javascript.rhino.Token.REGEXP;
			case com.google.javascript.rhino.head.Token.THROW :
				return com.google.javascript.rhino.Token.THROW;
			case com.google.javascript.rhino.head.Token.IN :
				return com.google.javascript.rhino.Token.IN;
			case com.google.javascript.rhino.head.Token.INSTANCEOF :
				return com.google.javascript.rhino.Token.INSTANCEOF;
			case com.google.javascript.rhino.head.Token.ARRAYLIT :
				return com.google.javascript.rhino.Token.ARRAYLIT;
			case com.google.javascript.rhino.head.Token.OBJECTLIT :
				return com.google.javascript.rhino.Token.OBJECTLIT;
			case com.google.javascript.rhino.head.Token.TRY :
				return com.google.javascript.rhino.Token.TRY;
			case com.google.javascript.rhino.head.Token.LP :
				return com.google.javascript.rhino.Token.PARAM_LIST;
			case com.google.javascript.rhino.head.Token.COMMA :
				return com.google.javascript.rhino.Token.COMMA;
			case com.google.javascript.rhino.head.Token.ASSIGN :
				return com.google.javascript.rhino.Token.ASSIGN;
			case com.google.javascript.rhino.head.Token.ASSIGN_BITOR :
				return com.google.javascript.rhino.Token.ASSIGN_BITOR;
			case com.google.javascript.rhino.head.Token.ASSIGN_BITXOR :
				return com.google.javascript.rhino.Token.ASSIGN_BITXOR;
			case com.google.javascript.rhino.head.Token.ASSIGN_BITAND :
				return com.google.javascript.rhino.Token.ASSIGN_BITAND;
			case com.google.javascript.rhino.head.Token.ASSIGN_LSH :
				return com.google.javascript.rhino.Token.ASSIGN_LSH;
			case com.google.javascript.rhino.head.Token.ASSIGN_RSH :
				return com.google.javascript.rhino.Token.ASSIGN_RSH;
			case com.google.javascript.rhino.head.Token.ASSIGN_URSH :
				return com.google.javascript.rhino.Token.ASSIGN_URSH;
			case com.google.javascript.rhino.head.Token.ASSIGN_ADD :
				return com.google.javascript.rhino.Token.ASSIGN_ADD;
			case com.google.javascript.rhino.head.Token.ASSIGN_SUB :
				return com.google.javascript.rhino.Token.ASSIGN_SUB;
			case com.google.javascript.rhino.head.Token.ASSIGN_MUL :
				return com.google.javascript.rhino.Token.ASSIGN_MUL;
			case com.google.javascript.rhino.head.Token.ASSIGN_DIV :
				return com.google.javascript.rhino.Token.ASSIGN_DIV;
			case com.google.javascript.rhino.head.Token.ASSIGN_MOD :
				return com.google.javascript.rhino.Token.ASSIGN_MOD;
			case com.google.javascript.rhino.head.Token.HOOK :
				return com.google.javascript.rhino.Token.HOOK;
			case com.google.javascript.rhino.head.Token.OR :
				return com.google.javascript.rhino.Token.OR;
			case com.google.javascript.rhino.head.Token.AND :
				return com.google.javascript.rhino.Token.AND;
			case com.google.javascript.rhino.head.Token.INC :
				return com.google.javascript.rhino.Token.INC;
			case com.google.javascript.rhino.head.Token.DEC :
				return com.google.javascript.rhino.Token.DEC;
			case com.google.javascript.rhino.head.Token.FUNCTION :
				return com.google.javascript.rhino.Token.FUNCTION;
			case com.google.javascript.rhino.head.Token.IF :
				return com.google.javascript.rhino.Token.IF;
			case com.google.javascript.rhino.head.Token.SWITCH :
				return com.google.javascript.rhino.Token.SWITCH;
			case com.google.javascript.rhino.head.Token.CASE :
				return com.google.javascript.rhino.Token.CASE;
			case com.google.javascript.rhino.head.Token.DEFAULT :
				return com.google.javascript.rhino.Token.DEFAULT_CASE;
			case com.google.javascript.rhino.head.Token.WHILE :
				return com.google.javascript.rhino.Token.WHILE;
			case com.google.javascript.rhino.head.Token.DO :
				return com.google.javascript.rhino.Token.DO;
			case com.google.javascript.rhino.head.Token.FOR :
				return com.google.javascript.rhino.Token.FOR;
			case com.google.javascript.rhino.head.Token.BREAK :
				return com.google.javascript.rhino.Token.BREAK;
			case com.google.javascript.rhino.head.Token.CONTINUE :
				return com.google.javascript.rhino.Token.CONTINUE;
			case com.google.javascript.rhino.head.Token.VAR :
				return com.google.javascript.rhino.Token.VAR;
			case com.google.javascript.rhino.head.Token.WITH :
				return com.google.javascript.rhino.Token.WITH;
			case com.google.javascript.rhino.head.Token.CATCH :
				return com.google.javascript.rhino.Token.CATCH;
			case com.google.javascript.rhino.head.Token.VOID :
				return com.google.javascript.rhino.Token.VOID;
			case com.google.javascript.rhino.head.Token.EMPTY :
				return com.google.javascript.rhino.Token.EMPTY;
			case com.google.javascript.rhino.head.Token.BLOCK :
				return com.google.javascript.rhino.Token.BLOCK;
			case com.google.javascript.rhino.head.Token.LABEL :
				return com.google.javascript.rhino.Token.LABEL;
			case com.google.javascript.rhino.head.Token.EXPR_VOID :
			case com.google.javascript.rhino.head.Token.EXPR_RESULT :
				return com.google.javascript.rhino.Token.EXPR_RESULT;
			case com.google.javascript.rhino.head.Token.SCRIPT :
				return com.google.javascript.rhino.Token.SCRIPT;
			case com.google.javascript.rhino.head.Token.GET :
				return com.google.javascript.rhino.Token.GETTER_DEF;
			case com.google.javascript.rhino.head.Token.SET :
				return com.google.javascript.rhino.Token.SETTER_DEF;
			case com.google.javascript.rhino.head.Token.CONST :
				return com.google.javascript.rhino.Token.CONST;
			case com.google.javascript.rhino.head.Token.DEBUGGER :
				return com.google.javascript.rhino.Token.DEBUGGER;
		}
		throw new java.lang.IllegalStateException(java.lang.String.valueOf(token));
	}

	private com.google.javascript.rhino.Node newNode(int type) {
		return new com.google.javascript.rhino.Node(type).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newNode(int type, com.google.javascript.rhino.Node child1) {
		return new com.google.javascript.rhino.Node(type, child1).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newNode(int type, com.google.javascript.rhino.Node child1, com.google.javascript.rhino.Node child2) {
		return new com.google.javascript.rhino.Node(type, child1, child2).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newNode(int type, com.google.javascript.rhino.Node child1, com.google.javascript.rhino.Node child2, com.google.javascript.rhino.Node child3) {
		return new com.google.javascript.rhino.Node(type, child1, child2, child3).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newStringNode(java.lang.String value) {
		return com.google.javascript.rhino.IR.string(value).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newStringNode(int type, java.lang.String value) {
		return com.google.javascript.rhino.Node.newString(type, value).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newNumberNode(java.lang.Double value) {
		return com.google.javascript.rhino.IR.number(value).clonePropsFrom(templateNode);
	}
}

