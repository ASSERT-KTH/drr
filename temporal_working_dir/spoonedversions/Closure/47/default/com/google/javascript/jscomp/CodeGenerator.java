

package com.google.javascript.jscomp;


class CodeGenerator {
	private final java.util.Map<java.lang.String, java.lang.String> ESCAPED_JS_STRINGS = com.google.common.collect.Maps.newHashMap();

	private static final char[] HEX_CHARS = new char[]{ '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' , 'a' , 'b' , 'c' , 'd' , 'e' , 'f' };

	private final com.google.javascript.jscomp.CodeConsumer cc;

	private final java.nio.charset.CharsetEncoder outputCharsetEncoder;

	CodeGenerator(com.google.javascript.jscomp.CodeConsumer consumer, java.nio.charset.Charset outputCharset) {
		cc = consumer;
		if ((outputCharset == null) || (outputCharset == (com.google.common.base.Charsets.US_ASCII))) {
			this.outputCharsetEncoder = null;
		}else {
			this.outputCharsetEncoder = outputCharset.newEncoder();
		}
	}

	CodeGenerator(com.google.javascript.jscomp.CodeConsumer consumer) {
		this(consumer, null);
	}

	public void tagAsStrict() {
		add("'use strict';");
	}

	void add(java.lang.String str) {
		cc.add(str);
	}

	private void addIdentifier(java.lang.String identifier) {
		cc.addIdentifier(com.google.javascript.jscomp.CodeGenerator.identifierEscape(identifier));
	}

	void add(com.google.javascript.rhino.Node n) {
		add(n, com.google.javascript.jscomp.CodeGenerator.Context.OTHER);
	}

	void add(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CodeGenerator.Context context) {
		if (!(cc.continueProcessing())) {
			return ;
		}
		int type = n.getType();
		java.lang.String opstr = com.google.javascript.jscomp.NodeUtil.opToStr(type);
		int childCount = n.getChildCount();
		com.google.javascript.rhino.Node first = n.getFirstChild();
		com.google.javascript.rhino.Node last = n.getLastChild();
		if ((opstr != null) && (first != last)) {
			com.google.common.base.Preconditions.checkState((childCount == 2), "Bad binary operator \"%s\": expected 2 arguments but got %s", opstr, childCount);
			int p = com.google.javascript.jscomp.NodeUtil.precedence(type);
			addLeftExpr(first, p, context);
			cc.addOp(opstr, true);
			com.google.javascript.jscomp.CodeGenerator.Context rhsContext = getContextForNoInOperator(context);
			if (((last.getType()) == type) && (com.google.javascript.jscomp.NodeUtil.isAssociative(type))) {
				addExpr(last, p, rhsContext);
			}else
				if ((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) && (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(last))) {
					addExpr(last, p, rhsContext);
				}else {
					addExpr(last, (p + 1), rhsContext);
				}
			
			return ;
		}
		cc.startSourceMapping(n);
		switch (type) {
			case com.google.javascript.rhino.Token.TRY :
				{
					com.google.common.base.Preconditions.checkState(((first.getNext().isBlock()) && (!(first.getNext().hasMoreThanOneChild()))));
					com.google.common.base.Preconditions.checkState(((childCount >= 2) && (childCount <= 3)));
					add("try");
					add(first, com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK);
					com.google.javascript.rhino.Node catchblock = first.getNext().getFirstChild();
					if (catchblock != null) {
						add(catchblock);
					}
					if (childCount == 3) {
						add("finally");
						add(last, com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK);
					}
					break;
				}
			case com.google.javascript.rhino.Token.CATCH :
				com.google.common.base.Preconditions.checkState((childCount == 2));
				add("catch(");
				add(first);
				add(")");
				add(last, com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK);
				break;
			case com.google.javascript.rhino.Token.THROW :
				com.google.common.base.Preconditions.checkState((childCount == 1));
				add("throw");
				add(first);
				cc.endStatement(true);
				break;
			case com.google.javascript.rhino.Token.RETURN :
				add("return");
				if (childCount == 1) {
					add(first);
				}else {
					com.google.common.base.Preconditions.checkState((childCount == 0));
				}
				cc.endStatement();
				break;
			case com.google.javascript.rhino.Token.VAR :
				if (first != null) {
					add("var ");
					addList(first, false, getContextForNoInOperator(context));
				}
				break;
			case com.google.javascript.rhino.Token.LABEL_NAME :
				com.google.common.base.Preconditions.checkState((!(n.getString().isEmpty())));
				addIdentifier(n.getString());
				break;
			case com.google.javascript.rhino.Token.NAME :
				if ((first == null) || (first.isEmpty())) {
					addIdentifier(n.getString());
				}else {
					com.google.common.base.Preconditions.checkState((childCount == 1));
					addIdentifier(n.getString());
					cc.addOp("=", true);
					if (first.isComma()) {
						addExpr(first, com.google.javascript.jscomp.NodeUtil.precedence(com.google.javascript.rhino.Token.ASSIGN));
					}else {
						addExpr(first, 0, getContextForNoInOperator(context));
					}
				}
				break;
			case com.google.javascript.rhino.Token.ARRAYLIT :
				add("[");
				addArrayList(first);
				add("]");
				break;
			case com.google.javascript.rhino.Token.PARAM_LIST :
				add("(");
				addList(first);
				add(")");
				break;
			case com.google.javascript.rhino.Token.COMMA :
				com.google.common.base.Preconditions.checkState((childCount == 2));
				addList(first, false, context);
				break;
			case com.google.javascript.rhino.Token.NUMBER :
				com.google.common.base.Preconditions.checkState((childCount == 0));
				cc.addNumber(n.getDouble());
				break;
			case com.google.javascript.rhino.Token.TYPEOF :
			case com.google.javascript.rhino.Token.VOID :
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.BITNOT :
			case com.google.javascript.rhino.Token.POS :
				{
					com.google.common.base.Preconditions.checkState((childCount == 1));
					cc.addOp(com.google.javascript.jscomp.NodeUtil.opToStrNoFail(type), false);
					addExpr(first, com.google.javascript.jscomp.NodeUtil.precedence(type));
					break;
				}
			case com.google.javascript.rhino.Token.NEG :
				{
					com.google.common.base.Preconditions.checkState((childCount == 1));
					if (n.getFirstChild().isNumber()) {
						cc.addNumber((-(n.getFirstChild().getDouble())));
					}else {
						cc.addOp(com.google.javascript.jscomp.NodeUtil.opToStrNoFail(type), false);
						addExpr(first, com.google.javascript.jscomp.NodeUtil.precedence(type));
					}
					break;
				}
			case com.google.javascript.rhino.Token.HOOK :
				{
					com.google.common.base.Preconditions.checkState((childCount == 3));
					int p = com.google.javascript.jscomp.NodeUtil.precedence(type);
					addLeftExpr(first, (p + 1), context);
					cc.addOp("?", true);
					addExpr(first.getNext(), 1);
					cc.addOp(":", true);
					addExpr(last, 1);
					break;
				}
			case com.google.javascript.rhino.Token.REGEXP :
				if (((first.getType()) != (com.google.javascript.rhino.Token.STRING)) || ((last.getType()) != (com.google.javascript.rhino.Token.STRING))) {
					throw new java.lang.Error("Expected children to be strings");
				}
				java.lang.String regexp = com.google.javascript.jscomp.CodeGenerator.regexpEscape(first.getString(), outputCharsetEncoder);
				if (childCount == 2) {
					add((regexp + (last.getString())));
				}else {
					com.google.common.base.Preconditions.checkState((childCount == 1));
					add(regexp);
				}
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				if ((n.getClass()) != (com.google.javascript.rhino.Node.class)) {
					throw new java.lang.Error("Unexpected Node subclass.");
				}
				com.google.common.base.Preconditions.checkState((childCount == 3));
				boolean funcNeedsParens = context == (com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR);
				if (funcNeedsParens) {
					add("(");
				}
				add("function");
				add(first);
				add(first.getNext());
				add(last, com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK);
				cc.endFunction((context == (com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT)));
				if (funcNeedsParens) {
					add(")");
				}
				break;
			case com.google.javascript.rhino.Token.GETTER_DEF :
			case com.google.javascript.rhino.Token.SETTER_DEF :
				com.google.common.base.Preconditions.checkState(n.getParent().isObjectLit());
				com.google.common.base.Preconditions.checkState((childCount == 1));
				com.google.common.base.Preconditions.checkState(first.isFunction());
				com.google.common.base.Preconditions.checkState(first.getFirstChild().getString().isEmpty());
				if (type == (com.google.javascript.rhino.Token.GETTER_DEF)) {
					com.google.common.base.Preconditions.checkState((!(first.getChildAtIndex(1).hasChildren())));
					add("get ");
				}else {
					com.google.common.base.Preconditions.checkState(first.getChildAtIndex(1).hasOneChild());
					add("set ");
				}
				java.lang.String name = n.getString();
				com.google.javascript.rhino.Node fn = first;
				com.google.javascript.rhino.Node parameters = fn.getChildAtIndex(1);
				com.google.javascript.rhino.Node body = fn.getLastChild();
				if (((!(n.isQuotedString())) && (com.google.javascript.rhino.TokenStream.isJSIdentifier(name))) && (com.google.javascript.jscomp.NodeUtil.isLatin(name))) {
					add(name);
				}else {
					double d = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(name);
					if (!(java.lang.Double.isNaN(d))) {
						cc.addNumber(d);
					}else {
						addJsString(n.getString());
					}
				}
				add(parameters);
				add(body, com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK);
				break;
			case com.google.javascript.rhino.Token.SCRIPT :
			case com.google.javascript.rhino.Token.BLOCK :
				{
					if ((n.getClass()) != (com.google.javascript.rhino.Node.class)) {
						throw new java.lang.Error("Unexpected Node subclass.");
					}
					boolean preserveBlock = context == (com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK);
					if (preserveBlock) {
						cc.beginBlock();
					}
					boolean preferLineBreaks = (type == (com.google.javascript.rhino.Token.SCRIPT)) || ((((type == (com.google.javascript.rhino.Token.BLOCK)) && (!preserveBlock)) && ((n.getParent()) != null)) && (n.getParent().isScript()));
					for (com.google.javascript.rhino.Node c = first; c != null; c = c.getNext()) {
						add(c, com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT);
						if (c.isVar()) {
							cc.endStatement();
						}
						if (c.isFunction()) {
							cc.maybeLineBreak();
						}
						if (preferLineBreaks) {
							cc.notePreferredLineBreak();
						}
					}
					if (preserveBlock) {
						cc.endBlock(cc.breakAfterBlockFor(n, (context == (com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT))));
					}
					break;
				}
			case com.google.javascript.rhino.Token.FOR :
				if (childCount == 4) {
					add("for(");
					if (first.isVar()) {
						add(first, com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
					}else {
						addExpr(first, 0, com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE);
					}
					add(";");
					add(first.getNext());
					add(";");
					add(first.getNext().getNext());
					add(")");
					addNonEmptyStatement(last, getContextForNonEmptyExpression(context), false);
				}else {
					com.google.common.base.Preconditions.checkState((childCount == 3));
					add("for(");
					add(first);
					add("in");
					add(first.getNext());
					add(")");
					addNonEmptyStatement(last, getContextForNonEmptyExpression(context), false);
				}
				break;
			case com.google.javascript.rhino.Token.DO :
				com.google.common.base.Preconditions.checkState((childCount == 2));
				add("do");
				addNonEmptyStatement(first, com.google.javascript.jscomp.CodeGenerator.Context.OTHER, false);
				add("while(");
				add(last);
				add(")");
				cc.endStatement();
				break;
			case com.google.javascript.rhino.Token.WHILE :
				com.google.common.base.Preconditions.checkState((childCount == 2));
				add("while(");
				add(first);
				add(")");
				addNonEmptyStatement(last, getContextForNonEmptyExpression(context), false);
				break;
			case com.google.javascript.rhino.Token.EMPTY :
				com.google.common.base.Preconditions.checkState((childCount == 0));
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				{
					com.google.common.base.Preconditions.checkState((childCount == 2), "Bad GETPROP: expected 2 children, but got %s", childCount);
					com.google.common.base.Preconditions.checkState(last.isString(), "Bad GETPROP: RHS should be STRING");
					boolean needsParens = first.isNumber();
					if (needsParens) {
						add("(");
					}
					addLeftExpr(first, com.google.javascript.jscomp.NodeUtil.precedence(type), context);
					if (needsParens) {
						add(")");
					}
					add(".");
					addIdentifier(last.getString());
					break;
				}
			case com.google.javascript.rhino.Token.GETELEM :
				com.google.common.base.Preconditions.checkState((childCount == 2), "Bad GETELEM: expected 2 children but got %s", childCount);
				addLeftExpr(first, com.google.javascript.jscomp.NodeUtil.precedence(type), context);
				add("[");
				add(first.getNext());
				add("]");
				break;
			case com.google.javascript.rhino.Token.WITH :
				com.google.common.base.Preconditions.checkState((childCount == 2));
				add("with(");
				add(first);
				add(")");
				addNonEmptyStatement(last, getContextForNonEmptyExpression(context), false);
				break;
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
				{
					com.google.common.base.Preconditions.checkState((childCount == 1));
					java.lang.String o = type == (com.google.javascript.rhino.Token.INC) ? "++" : "--";
					int postProp = n.getIntProp(com.google.javascript.rhino.Node.INCRDECR_PROP);
					if (postProp != 0) {
						addLeftExpr(first, com.google.javascript.jscomp.NodeUtil.precedence(type), context);
						cc.addOp(o, false);
					}else {
						cc.addOp(o, false);
						add(first);
					}
					break;
				}
			case com.google.javascript.rhino.Token.CALL :
				if ((isIndirectEval(first)) || ((n.getBooleanProp(com.google.javascript.rhino.Node.FREE_CALL)) && (com.google.javascript.jscomp.NodeUtil.isGet(first)))) {
					add("(0,");
					addExpr(first, com.google.javascript.jscomp.NodeUtil.precedence(com.google.javascript.rhino.Token.COMMA));
					add(")");
				}else {
					addLeftExpr(first, com.google.javascript.jscomp.NodeUtil.precedence(type), context);
				}
				add("(");
				addList(first.getNext());
				add(")");
				break;
			case com.google.javascript.rhino.Token.IF :
				boolean hasElse = childCount == 3;
				boolean ambiguousElseClause = (context == (com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE)) && (!hasElse);
				if (ambiguousElseClause) {
					cc.beginBlock();
				}
				add("if(");
				add(first);
				add(")");
				if (hasElse) {
					addNonEmptyStatement(first.getNext(), com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE, false);
					add("else");
					addNonEmptyStatement(last, getContextForNonEmptyExpression(context), false);
				}else {
					addNonEmptyStatement(first.getNext(), com.google.javascript.jscomp.CodeGenerator.Context.OTHER, false);
					com.google.common.base.Preconditions.checkState((childCount == 2));
				}
				if (ambiguousElseClause) {
					cc.endBlock();
				}
				break;
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.THIS :
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.TRUE :
				com.google.common.base.Preconditions.checkState((childCount == 0));
				add(com.google.javascript.rhino.Node.tokenToName(type));
				break;
			case com.google.javascript.rhino.Token.CONTINUE :
				com.google.common.base.Preconditions.checkState((childCount <= 1));
				add("continue");
				if (childCount == 1) {
					if ((first.getType()) != (com.google.javascript.rhino.Token.LABEL_NAME)) {
						throw new java.lang.Error("Unexpected token type. Should be LABEL_NAME.");
					}
					add(" ");
					add(first);
				}
				cc.endStatement();
				break;
			case com.google.javascript.rhino.Token.DEBUGGER :
				com.google.common.base.Preconditions.checkState((childCount == 0));
				add("debugger");
				cc.endStatement();
				break;
			case com.google.javascript.rhino.Token.BREAK :
				com.google.common.base.Preconditions.checkState((childCount <= 1));
				add("break");
				if (childCount == 1) {
					if ((first.getType()) != (com.google.javascript.rhino.Token.LABEL_NAME)) {
						throw new java.lang.Error("Unexpected token type. Should be LABEL_NAME.");
					}
					add(" ");
					add(first);
				}
				cc.endStatement();
				break;
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				com.google.common.base.Preconditions.checkState((childCount == 1));
				add(first, com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR);
				cc.endStatement();
				break;
			case com.google.javascript.rhino.Token.NEW :
				add("new ");
				int precedence = com.google.javascript.jscomp.NodeUtil.precedence(type);
				if (com.google.javascript.jscomp.NodeUtil.containsType(first, com.google.javascript.rhino.Token.CALL, com.google.javascript.jscomp.NodeUtil.MATCH_NOT_FUNCTION)) {
					precedence = (com.google.javascript.jscomp.NodeUtil.precedence(first.getType())) + 1;
				}
				addExpr(first, precedence);
				com.google.javascript.rhino.Node next = first.getNext();
				if (next != null) {
					add("(");
					addList(next);
					add(")");
				}
				break;
			case com.google.javascript.rhino.Token.STRING :
				if (childCount != (((n.getParent()) != null) && (n.getParent().isObjectLit()) ? 1 : 0)) {
					throw new java.lang.IllegalStateException(("Unexpected String children: " + (n.getParent().toStringTree())));
				}
				addJsString(n.getString());
				break;
			case com.google.javascript.rhino.Token.DELPROP :
				com.google.common.base.Preconditions.checkState((childCount == 1));
				add("delete ");
				add(first);
				break;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				{
					boolean needsParens = context == (com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR);
					if (needsParens) {
						add("(");
					}
					add("{");
					for (com.google.javascript.rhino.Node c = first; c != null; c = c.getNext()) {
						if (c != first) {
							cc.listSeparator();
						}
						if ((c.isGetterDef()) || (c.isSetterDef())) {
							add(c);
						}else {
							com.google.common.base.Preconditions.checkState(c.isString());
							java.lang.String key = c.getString();
							if ((((!(c.isQuotedString())) && (!(com.google.javascript.rhino.TokenStream.isKeyword(key)))) && (com.google.javascript.rhino.TokenStream.isJSIdentifier(key))) && (com.google.javascript.jscomp.NodeUtil.isLatin(key))) {
								add(key);
							}else {
								double d = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(key);
								if (!(java.lang.Double.isNaN(d))) {
									cc.addNumber(d);
								}else {
									addExpr(c, 1);
								}
							}
							add(":");
							addExpr(c.getFirstChild(), 1);
						}
					}
					add("}");
					if (needsParens) {
						add(")");
					}
					break;
				}
			case com.google.javascript.rhino.Token.SWITCH :
				add("switch(");
				add(first);
				add(")");
				cc.beginBlock();
				addAllSiblings(first.getNext());
				cc.endBlock((context == (com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT)));
				break;
			case com.google.javascript.rhino.Token.CASE :
				com.google.common.base.Preconditions.checkState((childCount == 2));
				add("case ");
				add(first);
				addCaseBody(last);
				break;
			case com.google.javascript.rhino.Token.DEFAULT_CASE :
				com.google.common.base.Preconditions.checkState((childCount == 1));
				add("default");
				addCaseBody(first);
				break;
			case com.google.javascript.rhino.Token.LABEL :
				com.google.common.base.Preconditions.checkState((childCount == 2));
				if ((first.getType()) != (com.google.javascript.rhino.Token.LABEL_NAME)) {
					throw new java.lang.Error("Unexpected token type. Should be LABEL_NAME.");
				}
				add(first);
				add(":");
				addNonEmptyStatement(last, getContextForNonEmptyExpression(context), true);
				break;
			default :
				throw new java.lang.Error(((("Unknown type " + type) + "\n") + (n.toStringTree())));
		}
		cc.endSourceMapping(n);
	}

	static boolean isSimpleNumber(java.lang.String s) {
		int len = s.length();
		for (int index = 0; index < len; index++) {
			char c = s.charAt(index);
			if ((c < '0') || (c > '9')) {
				return false;
			}
		}
		return (len > 0) && ((s.charAt(0)) != '0');
	}

	static double getSimpleNumber(java.lang.String s) {
		if (com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(s)) {
			try {
				long l = java.lang.Long.parseLong(s);
				if (l < (com.google.javascript.jscomp.NodeUtil.MAX_POSITIVE_INTEGER_NUMBER)) {
					return l;
				}
			} catch (java.lang.NumberFormatException e) {
			}
		}
		return java.lang.Double.NaN;
	}

	private boolean isIndirectEval(com.google.javascript.rhino.Node n) {
		return ((n.isName()) && ("eval".equals(n.getString()))) && (!(n.getBooleanProp(com.google.javascript.rhino.Node.DIRECT_EVAL)));
	}

	private void addNonEmptyStatement(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CodeGenerator.Context context, boolean allowNonBlockChild) {
		com.google.javascript.rhino.Node nodeToProcess = n;
		if ((!allowNonBlockChild) && ((n.getType()) != (com.google.javascript.rhino.Token.BLOCK))) {
			throw new java.lang.Error("Missing BLOCK child.");
		}
		if (n.isBlock()) {
			int count = com.google.javascript.jscomp.CodeGenerator.getNonEmptyChildCount(n, 2);
			if (count == 0) {
				if (cc.shouldPreserveExtraBlocks()) {
					cc.beginBlock();
					cc.endBlock(cc.breakAfterBlockFor(n, (context == (com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT))));
				}else {
					cc.endStatement(true);
				}
				return ;
			}
			if (count == 1) {
				com.google.javascript.rhino.Node firstAndOnlyChild = com.google.javascript.jscomp.CodeGenerator.getFirstNonEmptyChild(n);
				boolean alwaysWrapInBlock = cc.shouldPreserveExtraBlocks();
				if (alwaysWrapInBlock || (isOneExactlyFunctionOrDo(firstAndOnlyChild))) {
					cc.beginBlock();
					add(firstAndOnlyChild, com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT);
					cc.maybeLineBreak();
					cc.endBlock(cc.breakAfterBlockFor(n, (context == (com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT))));
					return ;
				}else {
					nodeToProcess = firstAndOnlyChild;
				}
			}
			if (count > 1) {
				context = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
			}
		}
		if (nodeToProcess.isEmpty()) {
			cc.endStatement(true);
		}else {
			add(nodeToProcess, context);
			if (nodeToProcess.isVar()) {
				cc.endStatement();
			}
		}
	}

	private boolean isOneExactlyFunctionOrDo(com.google.javascript.rhino.Node n) {
		if (n.isLabel()) {
			com.google.javascript.rhino.Node labeledStatement = n.getLastChild();
			if ((labeledStatement.getType()) != (com.google.javascript.rhino.Token.BLOCK)) {
				return isOneExactlyFunctionOrDo(labeledStatement);
			}else {
				if ((com.google.javascript.jscomp.CodeGenerator.getNonEmptyChildCount(n, 2)) == 1) {
					return isOneExactlyFunctionOrDo(com.google.javascript.jscomp.CodeGenerator.getFirstNonEmptyChild(n));
				}else {
					return false;
				}
			}
		}else {
			return (n.isFunction()) || (n.isDo());
		}
	}

	void addLeftExpr(com.google.javascript.rhino.Node n, int minPrecedence, com.google.javascript.jscomp.CodeGenerator.Context context) {
		addExpr(n, minPrecedence, context);
	}

	void addExpr(com.google.javascript.rhino.Node n, int minPrecedence) {
		addExpr(n, minPrecedence, com.google.javascript.jscomp.CodeGenerator.Context.OTHER);
	}

	private void addExpr(com.google.javascript.rhino.Node n, int minPrecedence, com.google.javascript.jscomp.CodeGenerator.Context context) {
		if (((com.google.javascript.jscomp.NodeUtil.precedence(n.getType())) < minPrecedence) || ((context == (com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE)) && ((n.getType()) == (com.google.javascript.rhino.Token.IN)))) {
			add("(");
			add(n, clearContextForNoInOperator(context));
			add(")");
		}else {
			add(n, context);
		}
	}

	void addList(com.google.javascript.rhino.Node firstInList) {
		addList(firstInList, true, com.google.javascript.jscomp.CodeGenerator.Context.OTHER);
	}

	void addList(com.google.javascript.rhino.Node firstInList, boolean isArrayOrFunctionArgument) {
		addList(firstInList, isArrayOrFunctionArgument, com.google.javascript.jscomp.CodeGenerator.Context.OTHER);
	}

	void addList(com.google.javascript.rhino.Node firstInList, boolean isArrayOrFunctionArgument, com.google.javascript.jscomp.CodeGenerator.Context lhsContext) {
		for (com.google.javascript.rhino.Node n = firstInList; n != null; n = n.getNext()) {
			boolean isFirst = n == firstInList;
			if (isFirst) {
				addLeftExpr(n, (isArrayOrFunctionArgument ? 1 : 0), lhsContext);
			}else {
				cc.listSeparator();
				addExpr(n, (isArrayOrFunctionArgument ? 1 : 0));
			}
		}
	}

	void addArrayList(com.google.javascript.rhino.Node firstInList) {
		boolean lastWasEmpty = false;
		for (com.google.javascript.rhino.Node n = firstInList; n != null; n = n.getNext()) {
			if (n != firstInList) {
				cc.listSeparator();
			}
			addExpr(n, 1);
			lastWasEmpty = n.isEmpty();
		}
		if (lastWasEmpty) {
			cc.listSeparator();
		}
	}

	void addCaseBody(com.google.javascript.rhino.Node caseBody) {
		cc.beginCaseBody();
		add(caseBody);
		cc.endCaseBody();
	}

	void addAllSiblings(com.google.javascript.rhino.Node n) {
		for (com.google.javascript.rhino.Node c = n; c != null; c = c.getNext()) {
			add(c);
		}
	}

	void addJsString(java.lang.String s) {
		java.lang.String cached = ESCAPED_JS_STRINGS.get(s);
		if (cached == null) {
			cached = jsString(s);
			ESCAPED_JS_STRINGS.put(s, cached);
		}
		add(cached);
	}

	java.lang.String jsString(java.lang.String s) {
		int singleq = 0;
		int doubleq = 0;
		for (int i = 0; i < (s.length()); i++) {
			switch (s.charAt(i)) {
				case '"' :
					doubleq++;
					break;
				case '\'' :
					singleq++;
					break;
			}
		}
		java.lang.String doublequote;
		java.lang.String singlequote;
		char quote;
		if (singleq < doubleq) {
			quote = '\'';
			doublequote = "\"";
			singlequote = "\\\'";
		}else {
			quote = '\"';
			doublequote = "\\\"";
			singlequote = "\'";
		}
		return com.google.javascript.jscomp.CodeGenerator.strEscape(s, quote, doublequote, singlequote, "\\\\", outputCharsetEncoder);
	}

	static java.lang.String regexpEscape(java.lang.String s, java.nio.charset.CharsetEncoder outputCharsetEncoder) {
		return com.google.javascript.jscomp.CodeGenerator.strEscape(s, '/', "\"", "'", "\\", outputCharsetEncoder);
	}

	static java.lang.String escapeToDoubleQuotedJsString(java.lang.String s) {
		return com.google.javascript.jscomp.CodeGenerator.strEscape(s, '"', "\\\"", "\'", "\\\\", null);
	}

	static java.lang.String regexpEscape(java.lang.String s) {
		return com.google.javascript.jscomp.CodeGenerator.regexpEscape(s, null);
	}

	static java.lang.String strEscape(java.lang.String s, char quote, java.lang.String doublequoteEscape, java.lang.String singlequoteEscape, java.lang.String backslashEscape, java.nio.charset.CharsetEncoder outputCharsetEncoder) {
		java.lang.StringBuilder sb = new java.lang.StringBuilder(((s.length()) + 2));
		sb.append(quote);
		for (int i = 0; i < (s.length()); i++) {
			char c = s.charAt(i);
			switch (c) {
				case ' ' :
					sb.append("\\x00");
					break;
				case '\n' :
					sb.append("\\n");
					break;
				case '\r' :
					sb.append("\\r");
					break;
				case '\t' :
					sb.append("\\t");
					break;
				case '\\' :
					sb.append(backslashEscape);
					break;
				case '\"' :
					sb.append(doublequoteEscape);
					break;
				case '\'' :
					sb.append(singlequoteEscape);
					break;
				case '>' :
					if ((i >= 2) && ((((s.charAt((i - 1))) == '-') && ((s.charAt((i - 2))) == '-')) || (((s.charAt((i - 1))) == ']') && ((s.charAt((i - 2))) == ']')))) {
						sb.append("\\>");
					}else {
						sb.append(c);
					}
					break;
				case '<' :
					final java.lang.String END_SCRIPT = "/script";
					final java.lang.String START_COMMENT = "!--";
					if (s.regionMatches(true, (i + 1), END_SCRIPT, 0, END_SCRIPT.length())) {
						sb.append("<\\");
					}else
						if (s.regionMatches(false, (i + 1), START_COMMENT, 0, START_COMMENT.length())) {
							sb.append("<\\");
						}else {
							sb.append(c);
						}
					
					break;
				default :
					if (outputCharsetEncoder != null) {
						if (outputCharsetEncoder.canEncode(c)) {
							sb.append(c);
						}else {
							com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(sb, c);
						}
					}else {
						if ((c > 31) && (c < 127)) {
							sb.append(c);
						}else {
							com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(sb, c);
						}
					}
			}
		}
		sb.append(quote);
		return sb.toString();
	}

	static java.lang.String identifierEscape(java.lang.String s) {
		if (com.google.javascript.jscomp.NodeUtil.isLatin(s)) {
			return s;
		}
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		for (int i = 0; i < (s.length()); i++) {
			char c = s.charAt(i);
			if ((c > 31) && (c < 127)) {
				sb.append(c);
			}else {
				com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(sb, c);
			}
		}
		return sb.toString();
	}

	private static int getNonEmptyChildCount(com.google.javascript.rhino.Node n, int maxCount) {
		int i = 0;
		com.google.javascript.rhino.Node c = n.getFirstChild();
		for (; (c != null) && (i < maxCount); c = c.getNext()) {
			if (c.isBlock()) {
				i += com.google.javascript.jscomp.CodeGenerator.getNonEmptyChildCount(c, (maxCount - i));
			}else
				if ((c.getType()) != (com.google.javascript.rhino.Token.EMPTY)) {
					i++;
				}
			
		}
		return i;
	}

	private static com.google.javascript.rhino.Node getFirstNonEmptyChild(com.google.javascript.rhino.Node n) {
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			if (c.isBlock()) {
				com.google.javascript.rhino.Node result = com.google.javascript.jscomp.CodeGenerator.getFirstNonEmptyChild(c);
				if (result != null) {
					return result;
				}
			}else
				if ((c.getType()) != (com.google.javascript.rhino.Token.EMPTY)) {
					return c;
				}
			
		}
		return null;
	}

	enum Context {
STATEMENT, BEFORE_DANGLING_ELSE, START_OF_EXPR, PRESERVE_BLOCK, IN_FOR_INIT_CLAUSE, OTHER;	}

	private com.google.javascript.jscomp.CodeGenerator.Context getContextForNonEmptyExpression(com.google.javascript.jscomp.CodeGenerator.Context currentContext) {
		return currentContext == (com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE) ? com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE : com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
	}

	private com.google.javascript.jscomp.CodeGenerator.Context getContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator.Context context) {
		return context == (com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE) ? com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE : com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
	}

	private com.google.javascript.jscomp.CodeGenerator.Context clearContextForNoInOperator(com.google.javascript.jscomp.CodeGenerator.Context context) {
		return context == (com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE) ? com.google.javascript.jscomp.CodeGenerator.Context.OTHER : context;
	}

	private static void appendHexJavaScriptRepresentation(java.lang.StringBuilder sb, char c) {
		try {
			com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(c, sb);
		} catch (java.io.IOException ex) {
			throw new java.lang.RuntimeException(ex);
		}
	}

	private static void appendHexJavaScriptRepresentation(int codePoint, java.lang.Appendable out) throws java.io.IOException {
		if (java.lang.Character.isSupplementaryCodePoint(codePoint)) {
			char[] surrogates = java.lang.Character.toChars(codePoint);
			com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(surrogates[0], out);
			com.google.javascript.jscomp.CodeGenerator.appendHexJavaScriptRepresentation(surrogates[1], out);
			return ;
		}
		out.append("\\u").append(com.google.javascript.jscomp.CodeGenerator.HEX_CHARS[((codePoint >>> 12) & 15)]).append(com.google.javascript.jscomp.CodeGenerator.HEX_CHARS[((codePoint >>> 8) & 15)]).append(com.google.javascript.jscomp.CodeGenerator.HEX_CHARS[((codePoint >>> 4) & 15)]).append(com.google.javascript.jscomp.CodeGenerator.HEX_CHARS[(codePoint & 15)]);
	}
}

