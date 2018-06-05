

package com.google.javascript.rhino;


public class IR {
	private IR() {
	}

	public static com.google.javascript.rhino.Node empty() {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY);
	}

	public static com.google.javascript.rhino.Node function(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node params, com.google.javascript.rhino.Node body) {
		com.google.common.base.Preconditions.checkState(name.isName());
		com.google.common.base.Preconditions.checkState(params.isParamList());
		com.google.common.base.Preconditions.checkState(body.isBlock());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FUNCTION, name, params, body);
	}

	public static com.google.javascript.rhino.Node paramList() {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.PARAM_LIST);
	}

	public static com.google.javascript.rhino.Node paramList(com.google.javascript.rhino.Node param) {
		com.google.common.base.Preconditions.checkState(param.isName());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.PARAM_LIST, param);
	}

	public static com.google.javascript.rhino.Node paramList(com.google.javascript.rhino.Node... params) {
		com.google.javascript.rhino.Node paramList = com.google.javascript.rhino.IR.paramList();
		for (com.google.javascript.rhino.Node param : params) {
			com.google.common.base.Preconditions.checkState(param.isName());
			paramList.addChildToBack(param);
		}
		return paramList;
	}

	public static com.google.javascript.rhino.Node paramList(java.util.List<com.google.javascript.rhino.Node> params) {
		com.google.javascript.rhino.Node paramList = com.google.javascript.rhino.IR.paramList();
		for (com.google.javascript.rhino.Node param : params) {
			com.google.common.base.Preconditions.checkState(param.isName());
			paramList.addChildToBack(param);
		}
		return paramList;
	}

	public static com.google.javascript.rhino.Node block() {
		com.google.javascript.rhino.Node block = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK);
		return block;
	}

	public static com.google.javascript.rhino.Node block(com.google.javascript.rhino.Node stmt) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeStatement(stmt));
		com.google.javascript.rhino.Node block = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK, stmt);
		return block;
	}

	public static com.google.javascript.rhino.Node block(com.google.javascript.rhino.Node... stmts) {
		com.google.javascript.rhino.Node block = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK);
		for (com.google.javascript.rhino.Node stmt : stmts) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeStatement(stmt));
			block.addChildToBack(stmt);
		}
		return block;
	}

	private static com.google.javascript.rhino.Node blockUnchecked(com.google.javascript.rhino.Node stmt) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK, stmt);
	}

	public static com.google.javascript.rhino.Node script(com.google.javascript.rhino.Node... stmts) {
		com.google.javascript.rhino.Node block = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SCRIPT);
		for (com.google.javascript.rhino.Node stmt : stmts) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeStatement(stmt));
			block.addChildToBack(stmt);
		}
		return block;
	}

	public static com.google.javascript.rhino.Node var(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node value) {
		com.google.common.base.Preconditions.checkState(((name.isName()) && (!(name.hasChildren()))));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(value));
		name.addChildToFront(value);
		return com.google.javascript.rhino.IR.var(name);
	}

	public static com.google.javascript.rhino.Node var(com.google.javascript.rhino.Node name) {
		com.google.common.base.Preconditions.checkState(name.isName());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, name);
	}

	public static com.google.javascript.rhino.Node returnNode() {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.RETURN);
	}

	public static com.google.javascript.rhino.Node returnNode(com.google.javascript.rhino.Node expr) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(expr));
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.RETURN, expr);
	}

	public static com.google.javascript.rhino.Node throwNode(com.google.javascript.rhino.Node expr) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(expr));
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.THROW, expr);
	}

	public static com.google.javascript.rhino.Node exprResult(com.google.javascript.rhino.Node expr) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(expr));
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, expr);
	}

	public static com.google.javascript.rhino.Node ifNode(com.google.javascript.rhino.Node cond, com.google.javascript.rhino.Node then) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(cond));
		com.google.common.base.Preconditions.checkState(then.isBlock());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.IF, cond, then);
	}

	public static com.google.javascript.rhino.Node ifNode(com.google.javascript.rhino.Node cond, com.google.javascript.rhino.Node then, com.google.javascript.rhino.Node elseNode) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(cond));
		com.google.common.base.Preconditions.checkState(then.isBlock());
		com.google.common.base.Preconditions.checkState(elseNode.isBlock());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.IF, cond, then, elseNode);
	}

	public static com.google.javascript.rhino.Node doNode(com.google.javascript.rhino.Node body, com.google.javascript.rhino.Node cond) {
		com.google.common.base.Preconditions.checkState(body.isBlock());
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(cond));
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.DO, body, cond);
	}

	public static com.google.javascript.rhino.Node forIn(com.google.javascript.rhino.Node target, com.google.javascript.rhino.Node cond, com.google.javascript.rhino.Node body) {
		com.google.common.base.Preconditions.checkState(((target.isVar()) || (com.google.javascript.rhino.IR.mayBeExpression(target))));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(cond));
		com.google.common.base.Preconditions.checkState(body.isBlock());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FOR, target, cond, body);
	}

	public static com.google.javascript.rhino.Node forNode(com.google.javascript.rhino.Node init, com.google.javascript.rhino.Node cond, com.google.javascript.rhino.Node incr, com.google.javascript.rhino.Node body) {
		com.google.common.base.Preconditions.checkState(((init.isVar()) || (com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(init))));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(cond));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(incr));
		com.google.common.base.Preconditions.checkState(body.isBlock());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FOR, init, cond, incr, body);
	}

	public static com.google.javascript.rhino.Node switchNode(com.google.javascript.rhino.Node cond, com.google.javascript.rhino.Node... cases) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(cond));
		com.google.javascript.rhino.Node switchNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SWITCH, cond);
		for (com.google.javascript.rhino.Node caseNode : cases) {
			com.google.common.base.Preconditions.checkState(((caseNode.isCase()) || (caseNode.isDefaultCase())));
			switchNode.addChildToBack(caseNode);
		}
		return switchNode;
	}

	public static com.google.javascript.rhino.Node caseNode(com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node body) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(expr));
		com.google.common.base.Preconditions.checkState(body.isBlock());
		body.putBooleanProp(com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP, true);
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CASE, expr, body);
	}

	public static com.google.javascript.rhino.Node defaultCase(com.google.javascript.rhino.Node body) {
		com.google.common.base.Preconditions.checkState(body.isBlock());
		body.putBooleanProp(com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP, true);
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.DEFAULT_CASE, body);
	}

	public static com.google.javascript.rhino.Node label(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node stmt) {
		com.google.common.base.Preconditions.checkState(name.isLabelName());
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeStatement(stmt));
		com.google.javascript.rhino.Node block = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.LABEL, name, stmt);
		return block;
	}

	public static com.google.javascript.rhino.Node labelName(java.lang.String name) {
		com.google.common.base.Preconditions.checkState((!(name.isEmpty())));
		return com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.LABEL_NAME, name);
	}

	public static com.google.javascript.rhino.Node tryFinally(com.google.javascript.rhino.Node tryBody, com.google.javascript.rhino.Node finallyBody) {
		com.google.common.base.Preconditions.checkState(tryBody.isBlock());
		com.google.common.base.Preconditions.checkState(finallyBody.isBlock());
		com.google.javascript.rhino.Node catchBody = com.google.javascript.rhino.IR.block().copyInformationFrom(tryBody);
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.TRY, tryBody, catchBody, finallyBody);
	}

	public static com.google.javascript.rhino.Node tryCatch(com.google.javascript.rhino.Node tryBody, com.google.javascript.rhino.Node catchNode) {
		com.google.common.base.Preconditions.checkState(tryBody.isBlock());
		com.google.common.base.Preconditions.checkState(catchNode.isCatch());
		com.google.javascript.rhino.Node catchBody = com.google.javascript.rhino.IR.blockUnchecked(catchNode).copyInformationFrom(catchNode);
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.TRY, tryBody, catchBody);
	}

	public static com.google.javascript.rhino.Node tryCatchFinally(com.google.javascript.rhino.Node tryBody, com.google.javascript.rhino.Node catchNode, com.google.javascript.rhino.Node finallyBody) {
		com.google.common.base.Preconditions.checkState(finallyBody.isBlock());
		com.google.javascript.rhino.Node tryNode = com.google.javascript.rhino.IR.tryCatch(tryBody, catchNode);
		tryNode.addChildToBack(finallyBody);
		return tryNode;
	}

	public static com.google.javascript.rhino.Node catchNode(com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node body) {
		com.google.common.base.Preconditions.checkState(expr.isName());
		com.google.common.base.Preconditions.checkState(body.isBlock());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CATCH, expr, body);
	}

	public static com.google.javascript.rhino.Node breakNode() {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BREAK);
	}

	public static com.google.javascript.rhino.Node breakNode(com.google.javascript.rhino.Node name) {
		com.google.common.base.Preconditions.checkState(name.isLabelName());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BREAK, name);
	}

	public static com.google.javascript.rhino.Node continueNode() {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CONTINUE);
	}

	public static com.google.javascript.rhino.Node continueNode(com.google.javascript.rhino.Node name) {
		com.google.common.base.Preconditions.checkState(name.isLabelName());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CONTINUE, name);
	}

	public static com.google.javascript.rhino.Node call(com.google.javascript.rhino.Node target, com.google.javascript.rhino.Node... args) {
		com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, target);
		for (com.google.javascript.rhino.Node arg : args) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(arg));
			call.addChildToBack(arg);
		}
		return call;
	}

	public static com.google.javascript.rhino.Node newNode(com.google.javascript.rhino.Node target, com.google.javascript.rhino.Node... args) {
		com.google.javascript.rhino.Node newcall = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NEW, target);
		for (com.google.javascript.rhino.Node arg : args) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(arg));
			newcall.addChildToBack(arg);
		}
		return newcall;
	}

	public static com.google.javascript.rhino.Node name(java.lang.String name) {
		return com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name);
	}

	public static com.google.javascript.rhino.Node getprop(com.google.javascript.rhino.Node target, com.google.javascript.rhino.Node prop) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(target));
		com.google.common.base.Preconditions.checkState(prop.isString());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETPROP, target, prop);
	}

	public static com.google.javascript.rhino.Node getelem(com.google.javascript.rhino.Node target, com.google.javascript.rhino.Node elem) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(target));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(elem));
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETELEM, target, elem);
	}

	public static com.google.javascript.rhino.Node assign(com.google.javascript.rhino.Node target, com.google.javascript.rhino.Node expr) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.isAssignmentTarget(target));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(expr));
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, target, expr);
	}

	public static com.google.javascript.rhino.Node hook(com.google.javascript.rhino.Node cond, com.google.javascript.rhino.Node trueval, com.google.javascript.rhino.Node falseval) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(cond));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(trueval));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(falseval));
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.HOOK, cond, trueval, falseval);
	}

	public static com.google.javascript.rhino.Node comma(com.google.javascript.rhino.Node expr1, com.google.javascript.rhino.Node expr2) {
		return com.google.javascript.rhino.IR.binaryOp(com.google.javascript.rhino.Token.COMMA, expr1, expr2);
	}

	public static com.google.javascript.rhino.Node and(com.google.javascript.rhino.Node expr1, com.google.javascript.rhino.Node expr2) {
		return com.google.javascript.rhino.IR.binaryOp(com.google.javascript.rhino.Token.AND, expr1, expr2);
	}

	public static com.google.javascript.rhino.Node or(com.google.javascript.rhino.Node expr1, com.google.javascript.rhino.Node expr2) {
		return com.google.javascript.rhino.IR.binaryOp(com.google.javascript.rhino.Token.OR, expr1, expr2);
	}

	public static com.google.javascript.rhino.Node not(com.google.javascript.rhino.Node expr1) {
		return com.google.javascript.rhino.IR.unaryOp(com.google.javascript.rhino.Token.NOT, expr1);
	}

	public static com.google.javascript.rhino.Node eq(com.google.javascript.rhino.Node expr1, com.google.javascript.rhino.Node expr2) {
		return com.google.javascript.rhino.IR.binaryOp(com.google.javascript.rhino.Token.EQ, expr1, expr2);
	}

	public static com.google.javascript.rhino.Node sheq(com.google.javascript.rhino.Node expr1, com.google.javascript.rhino.Node expr2) {
		return com.google.javascript.rhino.IR.binaryOp(com.google.javascript.rhino.Token.SHEQ, expr1, expr2);
	}

	public static com.google.javascript.rhino.Node voidNode(com.google.javascript.rhino.Node expr1) {
		return com.google.javascript.rhino.IR.unaryOp(com.google.javascript.rhino.Token.VOID, expr1);
	}

	public static com.google.javascript.rhino.Node neg(com.google.javascript.rhino.Node expr1) {
		return com.google.javascript.rhino.IR.unaryOp(com.google.javascript.rhino.Token.NEG, expr1);
	}

	public static com.google.javascript.rhino.Node pos(com.google.javascript.rhino.Node expr1) {
		return com.google.javascript.rhino.IR.unaryOp(com.google.javascript.rhino.Token.POS, expr1);
	}

	public static com.google.javascript.rhino.Node add(com.google.javascript.rhino.Node expr1, com.google.javascript.rhino.Node expr2) {
		return com.google.javascript.rhino.IR.binaryOp(com.google.javascript.rhino.Token.ADD, expr1, expr2);
	}

	public static com.google.javascript.rhino.Node sub(com.google.javascript.rhino.Node expr1, com.google.javascript.rhino.Node expr2) {
		return com.google.javascript.rhino.IR.binaryOp(com.google.javascript.rhino.Token.SUB, expr1, expr2);
	}

	public static com.google.javascript.rhino.Node objectlit(com.google.javascript.rhino.Node... propdefs) {
		com.google.javascript.rhino.Node objectlit = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.OBJECTLIT);
		for (com.google.javascript.rhino.Node propdef : propdefs) {
			com.google.common.base.Preconditions.checkState((((propdef.isStringKey()) || (propdef.isGetterDef())) || (propdef.isSetterDef())));
			com.google.common.base.Preconditions.checkState(propdef.hasOneChild());
			objectlit.addChildToBack(propdef);
		}
		return objectlit;
	}

	public static com.google.javascript.rhino.Node propdef(com.google.javascript.rhino.Node string, com.google.javascript.rhino.Node value) {
		com.google.common.base.Preconditions.checkState(string.isStringKey());
		com.google.common.base.Preconditions.checkState((!(string.hasChildren())));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(value));
		string.addChildToFront(value);
		return string;
	}

	public static com.google.javascript.rhino.Node arraylit(com.google.javascript.rhino.Node... exprs) {
		com.google.javascript.rhino.Node arraylit = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ARRAYLIT);
		for (com.google.javascript.rhino.Node expr : exprs) {
			com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(expr));
			arraylit.addChildToBack(expr);
		}
		return arraylit;
	}

	public static com.google.javascript.rhino.Node regexp(com.google.javascript.rhino.Node expr) {
		com.google.common.base.Preconditions.checkState(expr.isString());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REGEXP, expr);
	}

	public static com.google.javascript.rhino.Node regexp(com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node flags) {
		com.google.common.base.Preconditions.checkState(expr.isString());
		com.google.common.base.Preconditions.checkState(flags.isString());
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REGEXP, expr, flags);
	}

	public static com.google.javascript.rhino.Node string(java.lang.String s) {
		return com.google.javascript.rhino.Node.newString(s);
	}

	public static com.google.javascript.rhino.Node stringKey(java.lang.String s) {
		return com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.STRING_KEY, s);
	}

	public static com.google.javascript.rhino.Node number(double d) {
		return com.google.javascript.rhino.Node.newNumber(d);
	}

	public static com.google.javascript.rhino.Node thisNode() {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.THIS);
	}

	public static com.google.javascript.rhino.Node trueNode() {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.TRUE);
	}

	public static com.google.javascript.rhino.Node falseNode() {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FALSE);
	}

	public static com.google.javascript.rhino.Node nullNode() {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NULL);
	}

	private static com.google.javascript.rhino.Node binaryOp(int token, com.google.javascript.rhino.Node expr1, com.google.javascript.rhino.Node expr2) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(expr1));
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(expr2));
		return new com.google.javascript.rhino.Node(token, expr1, expr2);
	}

	private static com.google.javascript.rhino.Node unaryOp(int token, com.google.javascript.rhino.Node expr) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.rhino.IR.mayBeExpression(expr));
		return new com.google.javascript.rhino.Node(token, expr);
	}

	private static boolean mayBeExpressionOrEmpty(com.google.javascript.rhino.Node n) {
		return (n.isEmpty()) || (com.google.javascript.rhino.IR.mayBeExpression(n));
	}

	private static boolean isAssignmentTarget(com.google.javascript.rhino.Node n) {
		return ((n.isName()) || (n.isGetProp())) || (n.isGetElem());
	}

	private static boolean mayBeStatement(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.EMPTY :
			case com.google.javascript.rhino.Token.FUNCTION :
				return true;
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.BREAK :
			case com.google.javascript.rhino.Token.CONST :
			case com.google.javascript.rhino.Token.CONTINUE :
			case com.google.javascript.rhino.Token.DEBUGGER :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.EXPR_RESULT :
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.LABEL :
			case com.google.javascript.rhino.Token.RETURN :
			case com.google.javascript.rhino.Token.SWITCH :
			case com.google.javascript.rhino.Token.THROW :
			case com.google.javascript.rhino.Token.TRY :
			case com.google.javascript.rhino.Token.VAR :
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.WITH :
				return true;
			default :
				return false;
		}
	}

	private static boolean mayBeExpression(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FUNCTION :
				return true;
			case com.google.javascript.rhino.Token.ADD :
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.ARRAYLIT :
			case com.google.javascript.rhino.Token.ASSIGN :
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITNOT :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.CALL :
			case com.google.javascript.rhino.Token.COMMA :
			case com.google.javascript.rhino.Token.DEC :
			case com.google.javascript.rhino.Token.DELPROP :
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.GETELEM :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.HOOK :
			case com.google.javascript.rhino.Token.IN :
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.INSTANCEOF :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.NEG :
			case com.google.javascript.rhino.Token.NEW :
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.NUMBER :
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.OBJECTLIT :
			case com.google.javascript.rhino.Token.OR :
			case com.google.javascript.rhino.Token.POS :
			case com.google.javascript.rhino.Token.REGEXP :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
			case com.google.javascript.rhino.Token.STRING :
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.THIS :
			case com.google.javascript.rhino.Token.TYPEOF :
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.URSH :
			case com.google.javascript.rhino.Token.VOID :
				return true;
			default :
				return false;
		}
	}
}

