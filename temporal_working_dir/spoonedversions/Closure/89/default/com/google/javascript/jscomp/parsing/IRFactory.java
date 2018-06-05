

package com.google.javascript.jscomp.parsing;


public class IRFactory {
	private final java.lang.String sourceString;

	private final java.lang.String sourceName;

	private final com.google.javascript.jscomp.parsing.Config config;

	private final com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter;

	private final com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher transformDispatcher;

	private final java.util.Set<java.lang.String> ALLOWED_DIRECTIVES = com.google.common.collect.Sets.newHashSet("use strict");

	com.google.javascript.rhino.Node rootNodeJsDocHolder = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SCRIPT);

	com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder = rootNodeJsDocHolder.getJsDocBuilderForNode();

	com.google.javascript.rhino.JSDocInfo fileOverviewInfo = null;

	private com.google.javascript.rhino.Node templateNode;

	private IRFactory(java.lang.String sourceString, java.lang.String sourceName, com.google.javascript.jscomp.parsing.Config config, com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter) {
		this.sourceString = sourceString;
		this.sourceName = sourceName;
		this.config = config;
		this.errorReporter = errorReporter;
		this.transformDispatcher = new com.google.javascript.jscomp.parsing.IRFactory.TransformDispatcher();
		com.google.javascript.jscomp.parsing.IRFactory.this.templateNode = createTemplateNode();
	}

	private com.google.javascript.rhino.Node createTemplateNode() {
		com.google.javascript.rhino.Node templateNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SCRIPT);
		templateNode.putProp(com.google.javascript.rhino.Node.SOURCENAME_PROP, sourceName);
		return templateNode;
	}

	public static com.google.javascript.rhino.Node transformTree(com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot node, java.lang.String sourceString, com.google.javascript.jscomp.parsing.Config config, com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter) {
		com.google.javascript.jscomp.parsing.IRFactory irFactory = new com.google.javascript.jscomp.parsing.IRFactory(sourceString, node.getSourceName(), config, errorReporter);
		com.google.javascript.rhino.Node irNode = irFactory.transform(node);
		if ((node.getComments()) != null) {
			for (com.google.javascript.jscomp.mozilla.rhino.ast.Comment comment : node.getComments()) {
				if (((comment.getCommentType()) == (com.google.javascript.jscomp.mozilla.rhino.Token.CommentType.JSDOC)) && (!(comment.isParsed()))) {
					irFactory.handlePossibleFileOverviewJsDoc(comment);
				}
			}
		}
		irFactory.setFileOverviewJsDoc(irNode);
		return irNode;
	}

	private void setFileOverviewJsDoc(com.google.javascript.rhino.Node irNode) {
		irNode.setJSDocInfo(rootNodeJsDocHolder.getJSDocInfo());
		if ((fileOverviewInfo) != null) {
			if (((irNode.getJSDocInfo()) != null) && ((irNode.getJSDocInfo().getLicense()) != null)) {
				fileOverviewInfo.setLicense(irNode.getJSDocInfo().getLicense());
			}
			irNode.setJSDocInfo(fileOverviewInfo);
		}
	}

	private com.google.javascript.rhino.Node transformBlock(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node) {
		com.google.javascript.rhino.Node irNode = transform(node);
		if ((irNode.getType()) != (com.google.javascript.rhino.Token.BLOCK)) {
			if ((irNode.getType()) == (com.google.javascript.rhino.Token.EMPTY)) {
				irNode.setType(com.google.javascript.rhino.Token.BLOCK);
				irNode.setWasEmptyNode(true);
			}else {
				com.google.javascript.rhino.Node newBlock = newNode(com.google.javascript.rhino.Token.BLOCK, irNode);
				newBlock.setLineno(irNode.getLineno());
				newBlock.setCharno(irNode.getCharno());
				irNode = newBlock;
			}
		}
		return irNode;
	}

	private boolean handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.parsing.JsDocInfoParser jsDocParser) {
		if ((jsDocParser.getFileOverviewJSDocInfo()) != (fileOverviewInfo)) {
			fileOverviewInfo = jsDocParser.getFileOverviewJSDocInfo();
			return true;
		}
		return false;
	}

	private void handlePossibleFileOverviewJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.Comment comment) {
		com.google.javascript.jscomp.parsing.JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
		comment.setParsed(true);
		handlePossibleFileOverviewJsDoc(jsDocParser);
	}

	private com.google.javascript.rhino.JSDocInfo handleJsDoc(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node) {
		com.google.javascript.jscomp.mozilla.rhino.ast.Comment comment = node.getJsDocNode();
		if (comment != null) {
			com.google.javascript.jscomp.parsing.JsDocInfoParser jsDocParser = createJsDocInfoParser(comment);
			comment.setParsed(true);
			if (!(handlePossibleFileOverviewJsDoc(jsDocParser))) {
				return jsDocParser.retrieveAndResetParsedJSDocInfo();
			}
		}
		return null;
	}

	private com.google.javascript.rhino.Node transform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node) {
		com.google.javascript.rhino.JSDocInfo jsDocInfo = handleJsDoc(node);
		com.google.javascript.rhino.Node irNode = justTransform(node);
		if (jsDocInfo != null) {
			irNode.setJSDocInfo(jsDocInfo);
		}
		if (((irNode.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) && ((irNode.getFirstChild().getLineno()) != (-1))) {
			irNode.setLineno(irNode.getFirstChild().getLineno());
			irNode.setCharno(irNode.getFirstChild().getCharno());
		}else {
			if ((irNode.getLineno()) == (-1)) {
				int lineno = node.getLineno();
				irNode.setLineno(lineno);
				int charno = position2charno(node.getAbsolutePosition());
				irNode.setCharno(charno);
			}
		}
		return irNode;
	}

	private com.google.javascript.jscomp.parsing.JsDocInfoParser createJsDocInfoParser(com.google.javascript.jscomp.mozilla.rhino.ast.Comment node) {
		java.lang.String comment = node.getValue();
		int lineno = node.getLineno();
		int position = node.getAbsolutePosition();
		int numOpeningChars = 3;
		com.google.javascript.jscomp.parsing.JsDocInfoParser jsdocParser = new com.google.javascript.jscomp.parsing.JsDocInfoParser(new com.google.javascript.jscomp.parsing.JsDocTokenStream(comment.substring(numOpeningChars), lineno, ((position2charno(position)) + numOpeningChars)), sourceName, config, errorReporter);
		jsdocParser.setFileLevelJsDocBuilder(fileLevelJsDocBuilder);
		jsdocParser.setFileOverviewJSDocInfo(fileOverviewInfo);
		jsdocParser.parse();
		return jsdocParser;
	}

	private int position2charno(int position) {
		int lineIndex = sourceString.lastIndexOf('\n', position);
		if (lineIndex == (-1)) {
			return position;
		}else {
			return (position - lineIndex) - 1;
		}
	}

	private com.google.javascript.rhino.Node justTransform(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node) {
		return transformDispatcher.process(node);
	}

	private class TransformDispatcher extends com.google.javascript.jscomp.parsing.TypeSafeDispatcher<com.google.javascript.rhino.Node> {
		private com.google.javascript.rhino.Node processGeneric(com.google.javascript.jscomp.mozilla.rhino.Node n) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(n.getType()));
			for (com.google.javascript.jscomp.mozilla.rhino.Node child : n) {
				node.addChildToBack(transform(((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode) (child))));
			}
			return node;
		}

		private com.google.javascript.rhino.Node transformAsString(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode n) {
			com.google.javascript.rhino.Node ret = transform(n);
			if ((ret.getType()) == (com.google.javascript.rhino.Token.STRING)) {
				ret.putBooleanProp(com.google.javascript.rhino.Node.QUOTED_PROP, true);
			}else
				if ((ret.getType()) == (com.google.javascript.rhino.Token.NAME)) {
					ret.setType(com.google.javascript.rhino.Token.STRING);
				}
			
			return ret;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processArrayLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral literalNode) {
			if (literalNode.isDestructuring()) {
				reportDestructuringAssign(literalNode);
			}
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.ARRAYLIT);
			int skipCount = 0;
			for (com.google.javascript.jscomp.mozilla.rhino.ast.AstNode child : literalNode.getElements()) {
				com.google.javascript.rhino.Node c = transform(child);
				if ((c.getType()) == (com.google.javascript.rhino.Token.EMPTY)) {
					skipCount++;
				}
				node.addChildToBack(c);
			}
			if (skipCount > 0) {
				int[] skipIndexes = new int[skipCount];
				int i = 0;
				int j = 0;
				for (com.google.javascript.rhino.Node child : node.children()) {
					if ((child.getType()) == (com.google.javascript.rhino.Token.EMPTY)) {
						node.removeChild(child);
						skipIndexes[j] = i;
						j++;
					}
					i++;
				}
				node.putProp(com.google.javascript.rhino.Node.SKIP_INDEXES_PROP, skipIndexes);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processAssignment(com.google.javascript.jscomp.mozilla.rhino.ast.Assignment assignmentNode) {
			return processInfixExpression(assignmentNode);
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processAstRoot(com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot rootNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.SCRIPT);
			for (com.google.javascript.jscomp.mozilla.rhino.Node child : rootNode) {
				node.addChildToBack(transform(((com.google.javascript.jscomp.mozilla.rhino.ast.AstNode) (child))));
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
			return (((nType == (com.google.javascript.rhino.Token.EXPR_RESULT)) || (nType == (com.google.javascript.rhino.Token.EXPR_VOID))) && ((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.STRING))) && (ALLOWED_DIRECTIVES.contains(n.getFirstChild().getString()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processBlock(com.google.javascript.jscomp.mozilla.rhino.ast.Block blockNode) {
			return processGeneric(blockNode);
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processBreakStatement(com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.BREAK);
			if ((statementNode.getBreakLabel()) != null) {
				com.google.javascript.rhino.Node labelName = transform(statementNode.getBreakLabel());
				labelName.setType(com.google.javascript.rhino.Token.LABEL_NAME);
				node.addChildToBack(labelName);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processCatchClause(com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause clauseNode) {
			com.google.javascript.jscomp.mozilla.rhino.ast.AstNode catchVar = clauseNode.getVarName();
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.CATCH, transform(catchVar));
			if ((clauseNode.getCatchCondition()) != null) {
				errorReporter.error("Catch clauses are not supported", sourceName, clauseNode.getCatchCondition().getLineno(), "", 0);
			}
			node.addChildToBack(transformBlock(clauseNode.getBody()));
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processConditionalExpression(com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression exprNode) {
			return newNode(com.google.javascript.rhino.Token.HOOK, transform(exprNode.getTestExpression()), transform(exprNode.getTrueExpression()), transform(exprNode.getFalseExpression()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processContinueStatement(com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.CONTINUE);
			if ((statementNode.getLabel()) != null) {
				com.google.javascript.rhino.Node labelName = transform(statementNode.getLabel());
				labelName.setType(com.google.javascript.rhino.Token.LABEL_NAME);
				node.addChildToBack(labelName);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processDoLoop(com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop loopNode) {
			return newNode(com.google.javascript.rhino.Token.DO, transformBlock(loopNode.getBody()), transform(loopNode.getCondition()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processElementGet(com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet getNode) {
			return newNode(com.google.javascript.rhino.Token.GETELEM, transform(getNode.getTarget()), transform(getNode.getElement()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processEmptyExpression(com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression exprNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.EMPTY);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processExpressionStatement(com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(statementNode.getType()));
			node.addChildToBack(transform(statementNode.getExpression()));
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processForInLoop(com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop loopNode) {
			return newNode(com.google.javascript.rhino.Token.FOR, transform(loopNode.getIterator()), transform(loopNode.getIteratedObject()), transformBlock(loopNode.getBody()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processForLoop(com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop loopNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.FOR, transform(loopNode.getInitializer()), transform(loopNode.getCondition()), transform(loopNode.getIncrement()));
			node.addChildToBack(transformBlock(loopNode.getBody()));
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processFunctionCall(com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall callNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(callNode.getType()), transform(callNode.getTarget()));
			for (com.google.javascript.jscomp.mozilla.rhino.ast.AstNode child : callNode.getArguments()) {
				node.addChildToBack(transform(child));
			}
			int leftParamPos = (callNode.getAbsolutePosition()) + (callNode.getLp());
			node.setLineno(callNode.getLineno());
			node.setCharno(position2charno(leftParamPos));
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processFunctionNode(com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode functionNode) {
			com.google.javascript.jscomp.mozilla.rhino.ast.Name name = functionNode.getFunctionName();
			java.lang.Boolean isUnnamedFunction = false;
			if (name == null) {
				name = new com.google.javascript.jscomp.mozilla.rhino.ast.Name();
				name.setIdentifier("");
				isUnnamedFunction = true;
			}
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.FUNCTION);
			com.google.javascript.rhino.Node newName = transform(name);
			if (isUnnamedFunction) {
				newName.setLineno(functionNode.getLineno());
				int lpColumn = (functionNode.getAbsolutePosition()) + (functionNode.getLp());
				newName.setCharno(position2charno(lpColumn));
			}
			node.addChildToBack(newName);
			com.google.javascript.rhino.Node lp = newNode(com.google.javascript.rhino.Token.LP);
			com.google.javascript.jscomp.mozilla.rhino.ast.Name fnName = functionNode.getFunctionName();
			if (fnName != null) {
				lp.setLineno(fnName.getLineno());
			}else {
				lp.setLineno(functionNode.getLineno());
			}
			int lparenCharno = (functionNode.getLp()) + (functionNode.getAbsolutePosition());
			lp.setCharno(position2charno(lparenCharno));
			for (com.google.javascript.jscomp.mozilla.rhino.ast.AstNode param : functionNode.getParams()) {
				lp.addChildToBack(transform(param));
			}
			node.addChildToBack(lp);
			com.google.javascript.rhino.Node bodyNode = transform(functionNode.getBody());
			parseDirectives(bodyNode);
			node.addChildToBack(bodyNode);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processIfStatement(com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.IF);
			node.addChildToBack(transform(statementNode.getCondition()));
			node.addChildToBack(transformBlock(statementNode.getThenPart()));
			if ((statementNode.getElsePart()) != null) {
				node.addChildToBack(transformBlock(statementNode.getElsePart()));
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processInfixExpression(com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression exprNode) {
			com.google.javascript.rhino.Node n = newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(exprNode.getType()), transform(exprNode.getLeft()), transform(exprNode.getRight()));
			n.setLineno(exprNode.getLineno());
			n.setCharno(position2charno(((exprNode.getAbsolutePosition()) + (exprNode.getOperatorPosition()))));
			return n;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processKeywordLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral literalNode) {
			return newNode(com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(literalNode.getType()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processLabel(com.google.javascript.jscomp.mozilla.rhino.ast.Label labelNode) {
			return newStringNode(com.google.javascript.rhino.Token.LABEL_NAME, labelNode.getName());
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processLabeledStatement(com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.LABEL);
			com.google.javascript.rhino.Node prev = null;
			com.google.javascript.rhino.Node cur = node;
			for (com.google.javascript.jscomp.mozilla.rhino.ast.Label label : statementNode.getLabels()) {
				if (prev != null) {
					prev.addChildToBack(cur);
				}
				cur.addChildToBack(transform(label));
				cur.setLineno(label.getLineno());
				int clauseAbsolutePosition = position2charno(label.getAbsolutePosition());
				cur.setCharno(clauseAbsolutePosition);
				prev = cur;
				cur = newNode(com.google.javascript.rhino.Token.LABEL);
			}
			prev.addChildToBack(transform(statementNode.getStatement()));
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processName(com.google.javascript.jscomp.mozilla.rhino.ast.Name nameNode) {
			return newStringNode(com.google.javascript.rhino.Token.NAME, nameNode.getIdentifier());
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processNewExpression(com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression exprNode) {
			return processFunctionCall(exprNode);
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processNumberLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral literalNode) {
			return newNumberNode(literalNode.getNumber());
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processObjectLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral literalNode) {
			if (literalNode.isDestructuring()) {
				reportDestructuringAssign(literalNode);
			}
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.OBJECTLIT);
			for (com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty el : literalNode.getElements()) {
				if (el.isGetter()) {
					reportGetter(el);
				}else
					if (el.isSetter()) {
						reportSetter(el);
					}else {
						com.google.javascript.rhino.Node key = transformAsString(el.getLeft());
						key.addChildToFront(transform(el.getRight()));
						node.addChildToBack(key);
					}
				
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processObjectProperty(com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty propertyNode) {
			return processInfixExpression(propertyNode);
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processParenthesizedExpression(com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression exprNode) {
			com.google.javascript.rhino.Node node = transform(exprNode.getExpression());
			node.putProp(com.google.javascript.rhino.Node.PARENTHESIZED_PROP, java.lang.Boolean.TRUE);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processPropertyGet(com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet getNode) {
			return newNode(com.google.javascript.rhino.Token.GETPROP, transform(getNode.getTarget()), transformAsString(getNode.getProperty()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processRegExpLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral literalNode) {
			com.google.javascript.rhino.Node literalStringNode = newStringNode(literalNode.getValue());
			literalStringNode.setLineno(literalNode.getLineno());
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.REGEXP, literalStringNode);
			java.lang.String flags = literalNode.getFlags();
			if ((flags != null) && (!(flags.isEmpty()))) {
				com.google.javascript.rhino.Node flagsNode = newStringNode(flags);
				flagsNode.setLineno(literalNode.getLineno());
				node.addChildToBack(flagsNode);
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processReturnStatement(com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.RETURN);
			if ((statementNode.getReturnValue()) != null) {
				node.addChildToBack(transform(statementNode.getReturnValue()));
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processScope(com.google.javascript.jscomp.mozilla.rhino.ast.Scope scopeNode) {
			return processGeneric(scopeNode);
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processStringLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral literalNode) {
			com.google.javascript.rhino.Node n = newStringNode(literalNode.getValue());
			return n;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processSwitchCase(com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase caseNode) {
			com.google.javascript.rhino.Node node;
			if (caseNode.isDefault()) {
				node = newNode(com.google.javascript.rhino.Token.DEFAULT);
			}else {
				com.google.javascript.jscomp.mozilla.rhino.ast.AstNode expr = caseNode.getExpression();
				node = newNode(com.google.javascript.rhino.Token.CASE, transform(expr));
			}
			com.google.javascript.rhino.Node block = newNode(com.google.javascript.rhino.Token.BLOCK);
			block.putBooleanProp(com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP, true);
			block.setLineno(caseNode.getLineno());
			block.setCharno(position2charno(caseNode.getAbsolutePosition()));
			if ((caseNode.getStatements()) != null) {
				for (com.google.javascript.jscomp.mozilla.rhino.ast.AstNode child : caseNode.getStatements()) {
					block.addChildToBack(transform(child));
				}
			}
			node.addChildToBack(block);
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processSwitchStatement(com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.SWITCH, transform(statementNode.getExpression()));
			for (com.google.javascript.jscomp.mozilla.rhino.ast.AstNode child : statementNode.getCases()) {
				node.addChildToBack(transform(child));
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processThrowStatement(com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement statementNode) {
			return newNode(com.google.javascript.rhino.Token.THROW, transform(statementNode.getExpression()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processTryStatement(com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement statementNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.TRY, transformBlock(statementNode.getTryBlock()));
			com.google.javascript.rhino.Node block = newNode(com.google.javascript.rhino.Token.BLOCK);
			boolean lineSet = false;
			for (com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause cc : statementNode.getCatchClauses()) {
				if (lineSet == false) {
					block.setLineno(cc.getLineno());
					lineSet = true;
				}
				block.addChildToBack(transform(cc));
			}
			node.addChildToBack(block);
			com.google.javascript.jscomp.mozilla.rhino.ast.AstNode finallyBlock = statementNode.getFinallyBlock();
			if (finallyBlock != null) {
				node.addChildToBack(transformBlock(finallyBlock));
			}
			if ((lineSet == false) && (finallyBlock != null)) {
				block.setLineno(finallyBlock.getLineno());
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processUnaryExpression(com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression exprNode) {
			int type = com.google.javascript.jscomp.parsing.IRFactory.transformTokenType(exprNode.getType());
			com.google.javascript.rhino.Node operand = transform(exprNode.getOperand());
			if ((type == (com.google.javascript.rhino.Token.NEG)) && ((operand.getType()) == (com.google.javascript.rhino.Token.NUMBER))) {
				operand.setDouble((-(operand.getDouble())));
				return operand;
			}else {
				com.google.javascript.rhino.Node node = newNode(type, operand);
				if (exprNode.isPostfix()) {
					node.putBooleanProp(com.google.javascript.rhino.Node.INCRDECR_PROP, true);
				}
				return node;
			}
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processVariableDeclaration(com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration declarationNode) {
			com.google.javascript.rhino.Node node = newNode(com.google.javascript.rhino.Token.VAR);
			for (com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer child : declarationNode.getVariables()) {
				node.addChildToBack(transform(child));
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processVariableInitializer(com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer initializerNode) {
			com.google.javascript.rhino.Node node = transform(initializerNode.getTarget());
			if ((initializerNode.getInitializer()) != null) {
				node.addChildToBack(transform(initializerNode.getInitializer()));
				node.setLineno(node.getLineno());
			}
			return node;
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processWhileLoop(com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop loopNode) {
			return newNode(com.google.javascript.rhino.Token.WHILE, transform(loopNode.getCondition()), transformBlock(loopNode.getBody()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processWithStatement(com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement statementNode) {
			return newNode(com.google.javascript.rhino.Token.WITH, transform(statementNode.getExpression()), transformBlock(statementNode.getStatement()));
		}

		@java.lang.Override
		com.google.javascript.rhino.Node processIllegalToken(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node) {
			errorReporter.error(("Unsupported syntax: " + (com.google.javascript.jscomp.mozilla.rhino.Token.typeToName(node.getType()))), sourceName, node.getLineno(), "", 0);
			return newNode(com.google.javascript.rhino.Token.EMPTY);
		}

		void reportDestructuringAssign(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node) {
			errorReporter.error("destructuring assignment forbidden", sourceName, node.getLineno(), "", 0);
		}

		void reportGetter(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node) {
			errorReporter.error("getters are not supported in Internet Explorer", sourceName, node.getLineno(), "", 0);
		}

		void reportSetter(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node) {
			errorReporter.error("setters are not supported in Internet Explorer", sourceName, node.getLineno(), "", 0);
		}
	}

	private static int transformTokenType(int token) {
		switch (token) {
			case com.google.javascript.jscomp.mozilla.rhino.Token.ERROR :
				return com.google.javascript.rhino.Token.ERROR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.EOF :
				return com.google.javascript.rhino.Token.EOF;
			case com.google.javascript.jscomp.mozilla.rhino.Token.EOL :
				return com.google.javascript.rhino.Token.EOL;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ENTERWITH :
				return com.google.javascript.rhino.Token.ENTERWITH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LEAVEWITH :
				return com.google.javascript.rhino.Token.LEAVEWITH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.RETURN :
				return com.google.javascript.rhino.Token.RETURN;
			case com.google.javascript.jscomp.mozilla.rhino.Token.GOTO :
				return com.google.javascript.rhino.Token.GOTO;
			case com.google.javascript.jscomp.mozilla.rhino.Token.IFEQ :
				return com.google.javascript.rhino.Token.IFEQ;
			case com.google.javascript.jscomp.mozilla.rhino.Token.IFNE :
				return com.google.javascript.rhino.Token.IFNE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SETNAME :
				return com.google.javascript.rhino.Token.SETNAME;
			case com.google.javascript.jscomp.mozilla.rhino.Token.BITOR :
				return com.google.javascript.rhino.Token.BITOR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.BITXOR :
				return com.google.javascript.rhino.Token.BITXOR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.BITAND :
				return com.google.javascript.rhino.Token.BITAND;
			case com.google.javascript.jscomp.mozilla.rhino.Token.EQ :
				return com.google.javascript.rhino.Token.EQ;
			case com.google.javascript.jscomp.mozilla.rhino.Token.NE :
				return com.google.javascript.rhino.Token.NE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LT :
				return com.google.javascript.rhino.Token.LT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LE :
				return com.google.javascript.rhino.Token.LE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.GT :
				return com.google.javascript.rhino.Token.GT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.GE :
				return com.google.javascript.rhino.Token.GE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LSH :
				return com.google.javascript.rhino.Token.LSH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.RSH :
				return com.google.javascript.rhino.Token.RSH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.URSH :
				return com.google.javascript.rhino.Token.URSH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ADD :
				return com.google.javascript.rhino.Token.ADD;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SUB :
				return com.google.javascript.rhino.Token.SUB;
			case com.google.javascript.jscomp.mozilla.rhino.Token.MUL :
				return com.google.javascript.rhino.Token.MUL;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DIV :
				return com.google.javascript.rhino.Token.DIV;
			case com.google.javascript.jscomp.mozilla.rhino.Token.MOD :
				return com.google.javascript.rhino.Token.MOD;
			case com.google.javascript.jscomp.mozilla.rhino.Token.NOT :
				return com.google.javascript.rhino.Token.NOT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.BITNOT :
				return com.google.javascript.rhino.Token.BITNOT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.POS :
				return com.google.javascript.rhino.Token.POS;
			case com.google.javascript.jscomp.mozilla.rhino.Token.NEG :
				return com.google.javascript.rhino.Token.NEG;
			case com.google.javascript.jscomp.mozilla.rhino.Token.NEW :
				return com.google.javascript.rhino.Token.NEW;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DELPROP :
				return com.google.javascript.rhino.Token.DELPROP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.TYPEOF :
				return com.google.javascript.rhino.Token.TYPEOF;
			case com.google.javascript.jscomp.mozilla.rhino.Token.GETPROP :
				return com.google.javascript.rhino.Token.GETPROP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SETPROP :
				return com.google.javascript.rhino.Token.SETPROP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.GETELEM :
				return com.google.javascript.rhino.Token.GETELEM;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SETELEM :
				return com.google.javascript.rhino.Token.SETELEM;
			case com.google.javascript.jscomp.mozilla.rhino.Token.CALL :
				return com.google.javascript.rhino.Token.CALL;
			case com.google.javascript.jscomp.mozilla.rhino.Token.NAME :
				return com.google.javascript.rhino.Token.NAME;
			case com.google.javascript.jscomp.mozilla.rhino.Token.NUMBER :
				return com.google.javascript.rhino.Token.NUMBER;
			case com.google.javascript.jscomp.mozilla.rhino.Token.STRING :
				return com.google.javascript.rhino.Token.STRING;
			case com.google.javascript.jscomp.mozilla.rhino.Token.NULL :
				return com.google.javascript.rhino.Token.NULL;
			case com.google.javascript.jscomp.mozilla.rhino.Token.THIS :
				return com.google.javascript.rhino.Token.THIS;
			case com.google.javascript.jscomp.mozilla.rhino.Token.FALSE :
				return com.google.javascript.rhino.Token.FALSE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.TRUE :
				return com.google.javascript.rhino.Token.TRUE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SHEQ :
				return com.google.javascript.rhino.Token.SHEQ;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SHNE :
				return com.google.javascript.rhino.Token.SHNE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.REGEXP :
				return com.google.javascript.rhino.Token.REGEXP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.BINDNAME :
				return com.google.javascript.rhino.Token.BINDNAME;
			case com.google.javascript.jscomp.mozilla.rhino.Token.THROW :
				return com.google.javascript.rhino.Token.THROW;
			case com.google.javascript.jscomp.mozilla.rhino.Token.RETHROW :
				return com.google.javascript.rhino.Token.RETHROW;
			case com.google.javascript.jscomp.mozilla.rhino.Token.IN :
				return com.google.javascript.rhino.Token.IN;
			case com.google.javascript.jscomp.mozilla.rhino.Token.INSTANCEOF :
				return com.google.javascript.rhino.Token.INSTANCEOF;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LOCAL_LOAD :
				return com.google.javascript.rhino.Token.LOCAL_LOAD;
			case com.google.javascript.jscomp.mozilla.rhino.Token.GETVAR :
				return com.google.javascript.rhino.Token.GETVAR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SETVAR :
				return com.google.javascript.rhino.Token.SETVAR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.CATCH_SCOPE :
				return com.google.javascript.rhino.Token.CATCH_SCOPE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ENUM_INIT_KEYS :
				return com.google.javascript.rhino.Token.ENUM_INIT_KEYS;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ENUM_INIT_VALUES :
				return com.google.javascript.rhino.Token.ENUM_INIT_VALUES;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ENUM_NEXT :
				return com.google.javascript.rhino.Token.ENUM_NEXT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ENUM_ID :
				return com.google.javascript.rhino.Token.ENUM_ID;
			case com.google.javascript.jscomp.mozilla.rhino.Token.THISFN :
				return com.google.javascript.rhino.Token.THISFN;
			case com.google.javascript.jscomp.mozilla.rhino.Token.RETURN_RESULT :
				return com.google.javascript.rhino.Token.RETURN_RESULT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ARRAYLIT :
				return com.google.javascript.rhino.Token.ARRAYLIT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.OBJECTLIT :
				return com.google.javascript.rhino.Token.OBJECTLIT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.GET_REF :
				return com.google.javascript.rhino.Token.GET_REF;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SET_REF :
				return com.google.javascript.rhino.Token.SET_REF;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DEL_REF :
				return com.google.javascript.rhino.Token.DEL_REF;
			case com.google.javascript.jscomp.mozilla.rhino.Token.REF_CALL :
				return com.google.javascript.rhino.Token.REF_CALL;
			case com.google.javascript.jscomp.mozilla.rhino.Token.REF_SPECIAL :
				return com.google.javascript.rhino.Token.REF_SPECIAL;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DEFAULTNAMESPACE :
				return com.google.javascript.rhino.Token.DEFAULTNAMESPACE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ESCXMLTEXT :
				return com.google.javascript.rhino.Token.ESCXMLTEXT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ESCXMLATTR :
				return com.google.javascript.rhino.Token.ESCXMLATTR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.REF_MEMBER :
				return com.google.javascript.rhino.Token.REF_MEMBER;
			case com.google.javascript.jscomp.mozilla.rhino.Token.REF_NS_MEMBER :
				return com.google.javascript.rhino.Token.REF_NS_MEMBER;
			case com.google.javascript.jscomp.mozilla.rhino.Token.REF_NAME :
				return com.google.javascript.rhino.Token.REF_NAME;
			case com.google.javascript.jscomp.mozilla.rhino.Token.REF_NS_NAME :
				return com.google.javascript.rhino.Token.REF_NS_NAME;
			case com.google.javascript.jscomp.mozilla.rhino.Token.TRY :
				return com.google.javascript.rhino.Token.TRY;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SEMI :
				return com.google.javascript.rhino.Token.SEMI;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LB :
				return com.google.javascript.rhino.Token.LB;
			case com.google.javascript.jscomp.mozilla.rhino.Token.RB :
				return com.google.javascript.rhino.Token.RB;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LC :
				return com.google.javascript.rhino.Token.LC;
			case com.google.javascript.jscomp.mozilla.rhino.Token.RC :
				return com.google.javascript.rhino.Token.RC;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LP :
				return com.google.javascript.rhino.Token.LP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.RP :
				return com.google.javascript.rhino.Token.RP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.COMMA :
				return com.google.javascript.rhino.Token.COMMA;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN :
				return com.google.javascript.rhino.Token.ASSIGN;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_BITOR :
				return com.google.javascript.rhino.Token.ASSIGN_BITOR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_BITXOR :
				return com.google.javascript.rhino.Token.ASSIGN_BITXOR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_BITAND :
				return com.google.javascript.rhino.Token.ASSIGN_BITAND;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_LSH :
				return com.google.javascript.rhino.Token.ASSIGN_LSH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_RSH :
				return com.google.javascript.rhino.Token.ASSIGN_RSH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_URSH :
				return com.google.javascript.rhino.Token.ASSIGN_URSH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_ADD :
				return com.google.javascript.rhino.Token.ASSIGN_ADD;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_SUB :
				return com.google.javascript.rhino.Token.ASSIGN_SUB;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_MUL :
				return com.google.javascript.rhino.Token.ASSIGN_MUL;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_DIV :
				return com.google.javascript.rhino.Token.ASSIGN_DIV;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_MOD :
				return com.google.javascript.rhino.Token.ASSIGN_MOD;
			case com.google.javascript.jscomp.mozilla.rhino.Token.HOOK :
				return com.google.javascript.rhino.Token.HOOK;
			case com.google.javascript.jscomp.mozilla.rhino.Token.COLON :
				return com.google.javascript.rhino.Token.COLON;
			case com.google.javascript.jscomp.mozilla.rhino.Token.OR :
				return com.google.javascript.rhino.Token.OR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.AND :
				return com.google.javascript.rhino.Token.AND;
			case com.google.javascript.jscomp.mozilla.rhino.Token.INC :
				return com.google.javascript.rhino.Token.INC;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DEC :
				return com.google.javascript.rhino.Token.DEC;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DOT :
				return com.google.javascript.rhino.Token.DOT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.FUNCTION :
				return com.google.javascript.rhino.Token.FUNCTION;
			case com.google.javascript.jscomp.mozilla.rhino.Token.EXPORT :
				return com.google.javascript.rhino.Token.EXPORT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.IMPORT :
				return com.google.javascript.rhino.Token.IMPORT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.IF :
				return com.google.javascript.rhino.Token.IF;
			case com.google.javascript.jscomp.mozilla.rhino.Token.ELSE :
				return com.google.javascript.rhino.Token.ELSE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SWITCH :
				return com.google.javascript.rhino.Token.SWITCH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.CASE :
				return com.google.javascript.rhino.Token.CASE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DEFAULT :
				return com.google.javascript.rhino.Token.DEFAULT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.WHILE :
				return com.google.javascript.rhino.Token.WHILE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DO :
				return com.google.javascript.rhino.Token.DO;
			case com.google.javascript.jscomp.mozilla.rhino.Token.FOR :
				return com.google.javascript.rhino.Token.FOR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.BREAK :
				return com.google.javascript.rhino.Token.BREAK;
			case com.google.javascript.jscomp.mozilla.rhino.Token.CONTINUE :
				return com.google.javascript.rhino.Token.CONTINUE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.VAR :
				return com.google.javascript.rhino.Token.VAR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.WITH :
				return com.google.javascript.rhino.Token.WITH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.CATCH :
				return com.google.javascript.rhino.Token.CATCH;
			case com.google.javascript.jscomp.mozilla.rhino.Token.FINALLY :
				return com.google.javascript.rhino.Token.FINALLY;
			case com.google.javascript.jscomp.mozilla.rhino.Token.VOID :
				return com.google.javascript.rhino.Token.VOID;
			case com.google.javascript.jscomp.mozilla.rhino.Token.RESERVED :
				return com.google.javascript.rhino.Token.RESERVED;
			case com.google.javascript.jscomp.mozilla.rhino.Token.EMPTY :
				return com.google.javascript.rhino.Token.EMPTY;
			case com.google.javascript.jscomp.mozilla.rhino.Token.BLOCK :
				return com.google.javascript.rhino.Token.BLOCK;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LABEL :
				return com.google.javascript.rhino.Token.LABEL;
			case com.google.javascript.jscomp.mozilla.rhino.Token.TARGET :
				return com.google.javascript.rhino.Token.TARGET;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LOOP :
				return com.google.javascript.rhino.Token.LOOP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.EXPR_VOID :
			case com.google.javascript.jscomp.mozilla.rhino.Token.EXPR_RESULT :
				return com.google.javascript.rhino.Token.EXPR_RESULT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.JSR :
				return com.google.javascript.rhino.Token.JSR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SCRIPT :
				return com.google.javascript.rhino.Token.SCRIPT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.TYPEOFNAME :
				return com.google.javascript.rhino.Token.TYPEOFNAME;
			case com.google.javascript.jscomp.mozilla.rhino.Token.USE_STACK :
				return com.google.javascript.rhino.Token.USE_STACK;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SETPROP_OP :
				return com.google.javascript.rhino.Token.SETPROP_OP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SETELEM_OP :
				return com.google.javascript.rhino.Token.SETELEM_OP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.LOCAL_BLOCK :
				return com.google.javascript.rhino.Token.LOCAL_BLOCK;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SET_REF_OP :
				return com.google.javascript.rhino.Token.SET_REF_OP;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DOTDOT :
				return com.google.javascript.rhino.Token.DOTDOT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.COLONCOLON :
				return com.google.javascript.rhino.Token.COLONCOLON;
			case com.google.javascript.jscomp.mozilla.rhino.Token.XML :
				return com.google.javascript.rhino.Token.XML;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DOTQUERY :
				return com.google.javascript.rhino.Token.DOTQUERY;
			case com.google.javascript.jscomp.mozilla.rhino.Token.XMLATTR :
				return com.google.javascript.rhino.Token.XMLATTR;
			case com.google.javascript.jscomp.mozilla.rhino.Token.XMLEND :
				return com.google.javascript.rhino.Token.XMLEND;
			case com.google.javascript.jscomp.mozilla.rhino.Token.TO_OBJECT :
				return com.google.javascript.rhino.Token.TO_OBJECT;
			case com.google.javascript.jscomp.mozilla.rhino.Token.TO_DOUBLE :
				return com.google.javascript.rhino.Token.TO_DOUBLE;
			case com.google.javascript.jscomp.mozilla.rhino.Token.GET :
				return com.google.javascript.rhino.Token.GET;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SET :
				return com.google.javascript.rhino.Token.SET;
			case com.google.javascript.jscomp.mozilla.rhino.Token.CONST :
				return com.google.javascript.rhino.Token.CONST;
			case com.google.javascript.jscomp.mozilla.rhino.Token.SETCONST :
				return com.google.javascript.rhino.Token.SETCONST;
			case com.google.javascript.jscomp.mozilla.rhino.Token.DEBUGGER :
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
		return com.google.javascript.rhino.Node.newString(value).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newStringNode(int type, java.lang.String value) {
		return com.google.javascript.rhino.Node.newString(type, value).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newNumberNode(java.lang.Double value) {
		return com.google.javascript.rhino.Node.newNumber(value).clonePropsFrom(templateNode);
	}
}

