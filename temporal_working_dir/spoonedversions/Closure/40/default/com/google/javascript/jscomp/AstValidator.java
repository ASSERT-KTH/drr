

package com.google.javascript.jscomp;


public class AstValidator implements com.google.javascript.jscomp.CompilerPass {
	public interface ViolationHandler {
		void handleViolation(java.lang.String message, com.google.javascript.rhino.Node n);
	}

	private final com.google.javascript.jscomp.AstValidator.ViolationHandler violationHandler;

	public AstValidator(com.google.javascript.jscomp.AstValidator.ViolationHandler handler) {
		this.violationHandler = handler;
	}

	public AstValidator() {
		this.violationHandler = new com.google.javascript.jscomp.AstValidator.ViolationHandler() {
			@java.lang.Override
			public void handleViolation(java.lang.String message, com.google.javascript.rhino.Node n) {
				throw new java.lang.IllegalStateException(((message + " Reference node ") + (n.toString())));
			}
		};
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if (externs != null) {
			validateCodeRoot(externs);
		}
		if (root != null) {
			validateCodeRoot(root);
		}
	}

	public void validateRoot(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.BLOCK, n);
		validateIsSynthetic(n);
		validateChildCount(n, 2);
		validateCodeRoot(n.getFirstChild());
		validateCodeRoot(n.getLastChild());
	}

	public void validateCodeRoot(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.BLOCK, n);
		validateIsSynthetic(n);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateScript(c);
		}
	}

	public void validateScript(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.SCRIPT, n);
		validateIsSynthetic(n);
		validateHasSourceName(n);
		validateHasInputId(n);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateStatement(c);
		}
	}

	public void validateStatement(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.LABEL :
				validateLabel(n);
				return ;
			case com.google.javascript.rhino.Token.BLOCK :
				validateBlock(n);
				return ;
			case com.google.javascript.rhino.Token.FUNCTION :
				validateFunctionStatement(n);
				return ;
			case com.google.javascript.rhino.Token.WITH :
				validateWith(n);
				return ;
			case com.google.javascript.rhino.Token.FOR :
				validateFor(n);
				return ;
			case com.google.javascript.rhino.Token.WHILE :
				validateWhile(n);
				return ;
			case com.google.javascript.rhino.Token.DO :
				validateDo(n);
				return ;
			case com.google.javascript.rhino.Token.SWITCH :
				validateSwitch(n);
				return ;
			case com.google.javascript.rhino.Token.IF :
				validateIf(n);
				return ;
			case com.google.javascript.rhino.Token.VAR :
				validateVar(n);
				return ;
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				validateExprStmt(n);
				return ;
			case com.google.javascript.rhino.Token.RETURN :
				validateReturn(n);
				return ;
			case com.google.javascript.rhino.Token.THROW :
				validateThrow(n);
				return ;
			case com.google.javascript.rhino.Token.TRY :
				validateTry(n);
				return ;
			case com.google.javascript.rhino.Token.BREAK :
				validateBreak(n);
				return ;
			case com.google.javascript.rhino.Token.CONTINUE :
				validateContinue(n);
				return ;
			case com.google.javascript.rhino.Token.EMPTY :
				validateChildless(n);
				return ;
			case com.google.javascript.rhino.Token.DEBUGGER :
				validateChildless(n);
				return ;
			default :
				violation((("Expected statement but was " + (com.google.javascript.rhino.Token.name(n.getType()))) + "."), n);
		}
	}

	public void validateExpression(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.THIS :
			case com.google.javascript.rhino.Token.TRUE :
				validateChildless(n);
				return ;
			case com.google.javascript.rhino.Token.DELPROP :
			case com.google.javascript.rhino.Token.POS :
			case com.google.javascript.rhino.Token.NEG :
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
			case com.google.javascript.rhino.Token.TYPEOF :
			case com.google.javascript.rhino.Token.VOID :
			case com.google.javascript.rhino.Token.BITNOT :
				validateUnaryOp(n);
				return ;
			case com.google.javascript.rhino.Token.COMMA :
			case com.google.javascript.rhino.Token.OR :
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.INSTANCEOF :
			case com.google.javascript.rhino.Token.IN :
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.URSH :
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.ADD :
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.DIV :
				validateBinaryOp(n);
				return ;
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
				validateAssignmentExpression(n);
				return ;
			case com.google.javascript.rhino.Token.HOOK :
				validateTrinaryOp(n);
				return ;
			case com.google.javascript.rhino.Token.STRING :
				validateString(n);
				return ;
			case com.google.javascript.rhino.Token.NUMBER :
				validateNumber(n);
				return ;
			case com.google.javascript.rhino.Token.NAME :
				validateName(n);
				return ;
			case com.google.javascript.rhino.Token.GETELEM :
				validateBinaryOp(n);
				return ;
			case com.google.javascript.rhino.Token.GETPROP :
				validateGetProp(n);
				return ;
			case com.google.javascript.rhino.Token.ARRAYLIT :
				validateArrayLit(n);
				return ;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				validateObjectLit(n);
				return ;
			case com.google.javascript.rhino.Token.REGEXP :
				validateRegExpLit(n);
				return ;
			case com.google.javascript.rhino.Token.CALL :
				validateCall(n);
				return ;
			case com.google.javascript.rhino.Token.NEW :
				validateNew(n);
				return ;
			case com.google.javascript.rhino.Token.FUNCTION :
				validateFunctionExpression(n);
				return ;
			default :
				violation(("Expected expression but was " + (com.google.javascript.rhino.Token.name(n.getType()))), n);
		}
	}

	private void validateBlock(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.BLOCK, n);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateStatement(c);
		}
	}

	private void validateSyntheticBlock(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.BLOCK, n);
		validateIsSynthetic(n);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateStatement(c);
		}
	}

	private void validateIsSynthetic(com.google.javascript.rhino.Node n) {
		if (!(n.getBooleanProp(com.google.javascript.rhino.Node.SYNTHETIC_BLOCK_PROP))) {
			violation("Missing 'synthetic block' annotation.", n);
		}
	}

	private void validateHasSourceName(com.google.javascript.rhino.Node n) {
		java.lang.String sourceName = n.getSourceFileName();
		if ((sourceName == null) || (sourceName.isEmpty())) {
			violation("Missing 'source name' annotation.", n);
		}
	}

	private void validateHasInputId(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.InputId inputId = n.getInputId();
		if (inputId == null) {
			violation("Missing 'input id' annotation.", n);
		}
	}

	private void validateLabel(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.LABEL, n);
		validateChildCount(n, 2);
		validateLabelName(n.getFirstChild());
		validateStatement(n.getLastChild());
	}

	private void validateLabelName(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.LABEL_NAME, n);
		validateNonEmptyString(n);
		validateChildCount(n, 0);
	}

	private void validateNonEmptyString(com.google.javascript.rhino.Node n) {
		validateNonNullString(n);
		if (n.getString().isEmpty()) {
			violation("Expected non-empty string.", n);
		}
	}

	private void validateNonNullString(com.google.javascript.rhino.Node n) {
		if ((n.getString()) == null) {
			violation("Expected non-null string.", n);
		}
	}

	private void validateName(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.NAME, n);
		validateNonEmptyString(n);
		validateChildCount(n, 0);
	}

	private void validateOptionalName(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.NAME, n);
		validateNonNullString(n);
		validateChildCount(n, 0);
	}

	private void validateFunctionStatement(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.FUNCTION, n);
		validateChildCount(n, 3);
		validateName(n.getFirstChild());
		validateParameters(n.getChildAtIndex(1));
		validateBlock(n.getLastChild());
	}

	private void validateFunctionExpression(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.FUNCTION, n);
		validateChildCount(n, 3);
		validateOptionalName(n.getFirstChild());
		validateParameters(n.getChildAtIndex(1));
		validateBlock(n.getLastChild());
	}

	private void validateParameters(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.PARAM_LIST, n);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateName(c);
		}
	}

	private void validateCall(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.CALL, n);
		validateMinimumChildCount(n, 1);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateExpression(c);
		}
	}

	private void validateNew(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.NEW, n);
		validateMinimumChildCount(n, 1);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateExpression(c);
		}
	}

	private void validateVar(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.VAR, n);
		com.google.javascript.jscomp.AstValidator.this.validateMinimumChildCount(n, 1);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateNodeType(com.google.javascript.rhino.Token.NAME, c);
			validateNonEmptyString(c);
			validateMaximumChildCount(c, 1);
			if (c.hasChildren()) {
				validateExpression(c.getFirstChild());
			}
		}
	}

	private void validateFor(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.FOR, n);
		validateMinimumChildCount(n, 3);
		validateMaximumChildCount(n, 4);
		if (com.google.javascript.jscomp.NodeUtil.isForIn(n)) {
			validateChildCount(n, 3);
			validateVarOrAssignmentTarget(n.getFirstChild());
			validateExpression(n.getChildAtIndex(1));
		}else {
			validateChildCount(n, 4);
			validateVarOrOptionalExpression(n.getFirstChild());
			validateOptionalExpression(n.getChildAtIndex(1));
			validateOptionalExpression(n.getChildAtIndex(2));
		}
		validateBlock(n.getLastChild());
	}

	private void validateVarOrOptionalExpression(com.google.javascript.rhino.Node n) {
		if (n.isVar()) {
			validateVar(n);
		}else {
			validateOptionalExpression(n);
		}
	}

	private void validateVarOrAssignmentTarget(com.google.javascript.rhino.Node n) {
		if (n.isVar()) {
			com.google.javascript.jscomp.AstValidator.this.validateChildCount(n, 1);
			validateVar(n);
		}else {
			validateAssignmentTarget(n);
		}
	}

	private void validateWith(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.WITH, n);
		validateChildCount(n, 2);
		validateExpression(n.getFirstChild());
		validateBlock(n.getLastChild());
	}

	private void validateWhile(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.WHILE, n);
		validateChildCount(n, 2);
		validateExpression(n.getFirstChild());
		validateBlock(n.getLastChild());
	}

	private void validateDo(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.DO, n);
		validateChildCount(n, 2);
		validateBlock(n.getFirstChild());
		validateExpression(n.getLastChild());
	}

	private void validateIf(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.IF, n);
		validateMinimumChildCount(n, 2);
		validateMaximumChildCount(n, 3);
		validateExpression(n.getFirstChild());
		validateBlock(n.getChildAtIndex(1));
		if ((n.getChildCount()) == 3) {
			validateBlock(n.getLastChild());
		}
	}

	private void validateExprStmt(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.EXPR_RESULT, n);
		validateChildCount(n, 1);
		validateExpression(n.getFirstChild());
	}

	private void validateReturn(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.RETURN, n);
		validateMaximumChildCount(n, 1);
		if (n.hasChildren()) {
			validateExpression(n.getFirstChild());
		}
	}

	private void validateThrow(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.THROW, n);
		validateChildCount(n, 1);
		validateExpression(n.getFirstChild());
	}

	private void validateBreak(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.BREAK, n);
		validateMaximumChildCount(n, 1);
		if (n.hasChildren()) {
			validateLabelName(n.getFirstChild());
		}
	}

	private void validateContinue(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.CONTINUE, n);
		validateMaximumChildCount(n, 1);
		if (n.hasChildren()) {
			validateLabelName(n.getFirstChild());
		}
	}

	private void validateTry(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.TRY, n);
		validateMinimumChildCount(n, 2);
		validateMaximumChildCount(n, 3);
		validateBlock(n.getFirstChild());
		boolean seenCatchOrFinally = false;
		com.google.javascript.rhino.Node catches = n.getChildAtIndex(1);
		validateNodeType(com.google.javascript.rhino.Token.BLOCK, catches);
		validateMaximumChildCount(catches, 1);
		if (catches.hasChildren()) {
			validateCatch(catches.getFirstChild());
			seenCatchOrFinally = true;
		}
		if ((n.getChildCount()) == 3) {
			validateBlock(n.getLastChild());
			seenCatchOrFinally = true;
		}
		if (!seenCatchOrFinally) {
			violation("Missing catch or finally for try statement.", n);
		}
	}

	private void validateCatch(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.CATCH, n);
		validateChildCount(n, 2);
		validateName(n.getFirstChild());
		validateBlock(n.getLastChild());
	}

	private void validateSwitch(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.SWITCH, n);
		validateMinimumChildCount(n, 1);
		validateExpression(n.getFirstChild());
		int defaults = 0;
		for (com.google.javascript.rhino.Node c = n.getFirstChild().getNext(); c != null; c = c.getNext()) {
			validateSwitchMember(n.getLastChild());
			if (c.isDefaultCase()) {
				defaults++;
			}
		}
		if (defaults > 1) {
			violation(("Expected at most 1 'default' in switch but was " + defaults), n);
		}
	}

	private void validateSwitchMember(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.CASE :
				validateCase(n);
				return ;
			case com.google.javascript.rhino.Token.DEFAULT_CASE :
				validateDefault(n);
				return ;
			default :
				violation(("Expected switch member but was " + (com.google.javascript.rhino.Token.name(n.getType()))), n);
		}
	}

	private void validateDefault(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.DEFAULT_CASE, n);
		validateChildCount(n, 1);
		validateSyntheticBlock(n.getLastChild());
	}

	private void validateCase(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.CASE, n);
		validateChildCount(n, 2);
		validateExpression(n.getFirstChild());
		validateSyntheticBlock(n.getLastChild());
	}

	private void validateOptionalExpression(com.google.javascript.rhino.Node n) {
		if (n.isEmpty()) {
			validateChildless(n);
		}else {
			validateExpression(n);
		}
	}

	private void validateChildless(com.google.javascript.rhino.Node n) {
		validateChildCount(n, 0);
	}

	private void validateAssignmentExpression(com.google.javascript.rhino.Node n) {
		validateChildCount(n, 2);
		validateAssignmentTarget(n.getFirstChild());
		validateExpression(n.getLastChild());
	}

	private void validateAssignmentTarget(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.GETELEM :
			case com.google.javascript.rhino.Token.GETPROP :
				validateExpression(n);
				return ;
			default :
				violation(("Expected assignment target expression but was " + (com.google.javascript.rhino.Token.name(n.getType()))), n);
		}
	}

	private void validateGetProp(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.GETPROP, n);
		validateChildCount(n, 2);
		validateExpression(n.getFirstChild());
		com.google.javascript.rhino.Node prop = n.getLastChild();
		validateNodeType(com.google.javascript.rhino.Token.STRING, prop);
		validateNonEmptyString(prop);
	}

	private void validateRegExpLit(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.REGEXP, n);
		validateMinimumChildCount(n, 1);
		validateMaximumChildCount(n, 2);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateString(c);
		}
	}

	private void validateString(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.STRING, n);
		validateChildCount(n, 0);
		try {
			n.getString();
		} catch (java.lang.UnsupportedOperationException e) {
			violation("Invalid STRING node.", n);
		}
	}

	private void validateNumber(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.NUMBER, n);
		validateChildCount(n, 0);
		try {
			n.getDouble();
		} catch (java.lang.UnsupportedOperationException e) {
			violation("Invalid NUMBER node.", n);
		}
	}

	private void validateArrayLit(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.ARRAYLIT, n);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateOptionalExpression(c);
		}
	}

	private void validateObjectLit(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.OBJECTLIT, n);
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			validateObjectLitKey(c);
		}
	}

	private void validateObjectLitKey(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.GETTER_DEF :
				validateObjectLitGetKey(n);
				return ;
			case com.google.javascript.rhino.Token.SETTER_DEF :
				validateObjectLitSetKey(n);
				return ;
			case com.google.javascript.rhino.Token.STRING :
				validateObjectLitStringKey(n);
				return ;
			default :
				violation(("Expected object literal key expression but was " + (com.google.javascript.rhino.Token.name(n.getType()))), n);
		}
	}

	private void validateObjectLitGetKey(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.GETTER_DEF, n);
		validateChildCount(n, 1);
		validateObjectLiteralKeyName(n);
		com.google.javascript.rhino.Node function = n.getFirstChild();
		validateFunctionExpression(function);
		if (!(function.getFirstChild().getString().isEmpty())) {
			violation("Expected unnamed function expression.", n);
		}
		com.google.javascript.rhino.Node functionParams = function.getChildAtIndex(1);
		if (functionParams.hasChildren()) {
			violation("get methods must not have parameters.", n);
		}
	}

	private void validateObjectLitSetKey(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.SETTER_DEF, n);
		validateChildCount(n, 1);
		validateObjectLiteralKeyName(n);
		com.google.javascript.rhino.Node function = n.getFirstChild();
		validateFunctionExpression(function);
		if (!(function.getFirstChild().getString().isEmpty())) {
			violation("Expected unnamed function expression.", n);
		}
		com.google.javascript.rhino.Node functionParams = function.getChildAtIndex(1);
		if (!(functionParams.hasOneChild())) {
			violation("set methods must have exactly one parameter.", n);
		}
	}

	private void validateObjectLitStringKey(com.google.javascript.rhino.Node n) {
		validateNodeType(com.google.javascript.rhino.Token.STRING, n);
		validateChildCount(n, 1);
		validateObjectLiteralKeyName(n);
		validateExpression(n.getFirstChild());
	}

	private void validateObjectLiteralKeyName(com.google.javascript.rhino.Node n) {
		if (n.isQuotedString()) {
			try {
				n.getString();
			} catch (java.lang.UnsupportedOperationException e) {
				violation(("getString failed for" + (com.google.javascript.rhino.Token.name(n.getType()))), n);
			}
		}else {
			validateNonEmptyString(n);
		}
	}

	private void validateUnaryOp(com.google.javascript.rhino.Node n) {
		validateChildCount(n, 1);
		validateExpression(n.getFirstChild());
	}

	private void validateBinaryOp(com.google.javascript.rhino.Node n) {
		validateChildCount(n, 2);
		validateExpression(n.getFirstChild());
		validateExpression(n.getLastChild());
	}

	private void validateTrinaryOp(com.google.javascript.rhino.Node n) {
		validateChildCount(n, 3);
		com.google.javascript.rhino.Node first = n.getFirstChild();
		validateExpression(first);
		validateExpression(first.getNext());
		validateExpression(n.getLastChild());
	}

	private void violation(java.lang.String message, com.google.javascript.rhino.Node n) {
		violationHandler.handleViolation(message, n);
	}

	private void validateNodeType(int type, com.google.javascript.rhino.Node n) {
		if ((n.getType()) != type) {
			violation(((("Expected " + (com.google.javascript.rhino.Token.name(type))) + " but was ") + (com.google.javascript.rhino.Token.name(n.getType()))), n);
		}
	}

	private void validateChildCount(com.google.javascript.rhino.Node n, int i) {
		boolean valid = false;
		if (i == 0) {
			valid = !(n.hasChildren());
		}else
			if (i == 1) {
				valid = n.hasOneChild();
			}else {
				valid = (n.getChildCount()) == i;
			}
		
		if (!valid) {
			violation(((("Expected " + i) + " children, but was ") + (n.getChildCount())), n);
		}
	}

	private void validateMinimumChildCount(com.google.javascript.rhino.Node n, int i) {
		boolean valid = false;
		if (i == 1) {
			valid = n.hasChildren();
		}else
			if (i == 2) {
				valid = n.hasMoreThanOneChild();
			}else {
				valid = (n.getChildCount()) >= i;
			}
		
		if (!valid) {
			violation(((("Expected at least " + i) + " children, but was ") + (n.getChildCount())), n);
		}
	}

	private void validateMaximumChildCount(com.google.javascript.rhino.Node n, int i) {
		boolean valid = false;
		if (i == 1) {
			valid = !(n.hasMoreThanOneChild());
		}else {
			valid = (n.getChildCount()) <= i;
		}
		if (!valid) {
			violation(((("Expected no more than " + i) + " children, but was ") + (n.getChildCount())), n);
		}
	}
}

