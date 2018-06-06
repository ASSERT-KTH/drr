

package com.google.javascript.jscomp.parsing;


abstract class TypeSafeDispatcher<T> {
	abstract T processArrayLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral literalNode);

	abstract T processAssignment(com.google.javascript.jscomp.mozilla.rhino.ast.Assignment assignmentNode);

	abstract T processAstRoot(com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot rootNode);

	abstract T processBlock(com.google.javascript.jscomp.mozilla.rhino.ast.Block blockNode);

	abstract T processBreakStatement(com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement statementNode);

	abstract T processCatchClause(com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause clauseNode);

	abstract T processConditionalExpression(com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression exprNode);

	abstract T processContinueStatement(com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement statementNode);

	abstract T processDoLoop(com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop loopNode);

	abstract T processElementGet(com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet getNode);

	abstract T processEmptyExpression(com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression exprNode);

	abstract T processExpressionStatement(com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement statementNode);

	abstract T processForInLoop(com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop loopNode);

	abstract T processForLoop(com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop loopNode);

	abstract T processFunctionCall(com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall callNode);

	abstract T processFunctionNode(com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode functionNode);

	abstract T processIfStatement(com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement statementNode);

	abstract T processInfixExpression(com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression exprNode);

	abstract T processKeywordLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral literalNode);

	abstract T processLabel(com.google.javascript.jscomp.mozilla.rhino.ast.Label labelNode);

	abstract T processLabeledStatement(com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement statementNode);

	abstract T processName(com.google.javascript.jscomp.mozilla.rhino.ast.Name nameNode);

	abstract T processNewExpression(com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression exprNode);

	abstract T processNumberLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral literalNode);

	abstract T processObjectLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral literalNode);

	abstract T processObjectProperty(com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty propertyNode);

	abstract T processParenthesizedExpression(com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression exprNode);

	abstract T processPropertyGet(com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet getNode);

	abstract T processRegExpLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral literalNode);

	abstract T processReturnStatement(com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement statementNode);

	abstract T processScope(com.google.javascript.jscomp.mozilla.rhino.ast.Scope scopeNode);

	abstract T processStringLiteral(com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral literalNode);

	abstract T processSwitchCase(com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase caseNode);

	abstract T processSwitchStatement(com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement statementNode);

	abstract T processThrowStatement(com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement statementNode);

	abstract T processTryStatement(com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement statementNode);

	abstract T processUnaryExpression(com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression exprNode);

	abstract T processVariableDeclaration(com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration declarationNode);

	abstract T processVariableInitializer(com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer initializerNode);

	abstract T processWhileLoop(com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop loopNode);

	abstract T processWithStatement(com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement statementNode);

	abstract T processIllegalToken(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node);

	public T process(com.google.javascript.jscomp.mozilla.rhino.ast.AstNode node) {
		switch (node.getType()) {
			case com.google.javascript.jscomp.mozilla.rhino.Token.ADD :
			case com.google.javascript.jscomp.mozilla.rhino.Token.AND :
			case com.google.javascript.jscomp.mozilla.rhino.Token.BITAND :
			case com.google.javascript.jscomp.mozilla.rhino.Token.BITOR :
			case com.google.javascript.jscomp.mozilla.rhino.Token.BITXOR :
			case com.google.javascript.jscomp.mozilla.rhino.Token.COMMA :
			case com.google.javascript.jscomp.mozilla.rhino.Token.DIV :
			case com.google.javascript.jscomp.mozilla.rhino.Token.EQ :
			case com.google.javascript.jscomp.mozilla.rhino.Token.GE :
			case com.google.javascript.jscomp.mozilla.rhino.Token.GT :
			case com.google.javascript.jscomp.mozilla.rhino.Token.IN :
			case com.google.javascript.jscomp.mozilla.rhino.Token.INSTANCEOF :
			case com.google.javascript.jscomp.mozilla.rhino.Token.LE :
			case com.google.javascript.jscomp.mozilla.rhino.Token.LSH :
			case com.google.javascript.jscomp.mozilla.rhino.Token.LT :
			case com.google.javascript.jscomp.mozilla.rhino.Token.MOD :
			case com.google.javascript.jscomp.mozilla.rhino.Token.MUL :
			case com.google.javascript.jscomp.mozilla.rhino.Token.NE :
			case com.google.javascript.jscomp.mozilla.rhino.Token.OR :
			case com.google.javascript.jscomp.mozilla.rhino.Token.RSH :
			case com.google.javascript.jscomp.mozilla.rhino.Token.SHEQ :
			case com.google.javascript.jscomp.mozilla.rhino.Token.SHNE :
			case com.google.javascript.jscomp.mozilla.rhino.Token.SUB :
			case com.google.javascript.jscomp.mozilla.rhino.Token.URSH :
				return processInfixExpression(((com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.ARRAYLIT :
				return processArrayLiteral(((com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_ADD :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_BITAND :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_BITOR :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_BITXOR :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_DIV :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_LSH :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_MOD :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_MUL :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_RSH :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_SUB :
			case com.google.javascript.jscomp.mozilla.rhino.Token.ASSIGN_URSH :
				return processAssignment(((com.google.javascript.jscomp.mozilla.rhino.ast.Assignment) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.BITNOT :
			case com.google.javascript.jscomp.mozilla.rhino.Token.DEC :
			case com.google.javascript.jscomp.mozilla.rhino.Token.DELPROP :
			case com.google.javascript.jscomp.mozilla.rhino.Token.INC :
			case com.google.javascript.jscomp.mozilla.rhino.Token.NEG :
			case com.google.javascript.jscomp.mozilla.rhino.Token.NOT :
			case com.google.javascript.jscomp.mozilla.rhino.Token.POS :
			case com.google.javascript.jscomp.mozilla.rhino.Token.TYPEOF :
			case com.google.javascript.jscomp.mozilla.rhino.Token.VOID :
				return processUnaryExpression(((com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.BLOCK :
				if (node instanceof com.google.javascript.jscomp.mozilla.rhino.ast.Block) {
					return processBlock(((com.google.javascript.jscomp.mozilla.rhino.ast.Block) (node)));
				}else
					if (node instanceof com.google.javascript.jscomp.mozilla.rhino.ast.Scope) {
						return processScope(((com.google.javascript.jscomp.mozilla.rhino.ast.Scope) (node)));
					}else {
						throw new java.lang.IllegalStateException(((("Unexpected node type.  class: " + (node.getClass())) + " type: ") + (com.google.javascript.jscomp.mozilla.rhino.Token.typeToName(node.getType()))));
					}
				
			case com.google.javascript.jscomp.mozilla.rhino.Token.BREAK :
				return processBreakStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.CALL :
				return processFunctionCall(((com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.CASE :
			case com.google.javascript.jscomp.mozilla.rhino.Token.DEFAULT :
				return processSwitchCase(((com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.CATCH :
			case com.google.javascript.jscomp.mozilla.rhino.Token.FINALLY :
				return processCatchClause(((com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.COLON :
				return processObjectProperty(((com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.CONTINUE :
				return processContinueStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.DO :
				return processDoLoop(((com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.EMPTY :
				return processEmptyExpression(((com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.EXPR_RESULT :
			case com.google.javascript.jscomp.mozilla.rhino.Token.EXPR_VOID :
				if (node instanceof com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement) {
					return processExpressionStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement) (node)));
				}else
					if (node instanceof com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement) {
						return processLabeledStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement) (node)));
					}else {
						throw new java.lang.IllegalStateException(((("Unexpected node type.  class: " + (node.getClass())) + " type: ") + (com.google.javascript.jscomp.mozilla.rhino.Token.typeToName(node.getType()))));
					}
				
			case com.google.javascript.jscomp.mozilla.rhino.Token.DEBUGGER :
			case com.google.javascript.jscomp.mozilla.rhino.Token.FALSE :
			case com.google.javascript.jscomp.mozilla.rhino.Token.NULL :
			case com.google.javascript.jscomp.mozilla.rhino.Token.THIS :
			case com.google.javascript.jscomp.mozilla.rhino.Token.TRUE :
				return processKeywordLiteral(((com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.FOR :
				if (node instanceof com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop) {
					return processForInLoop(((com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop) (node)));
				}else
					if (node instanceof com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop) {
						return processForLoop(((com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop) (node)));
					}else {
						throw new java.lang.IllegalStateException(((("Unexpected node type.  class: " + (node.getClass())) + " type: ") + (com.google.javascript.jscomp.mozilla.rhino.Token.typeToName(node.getType()))));
					}
				
			case com.google.javascript.jscomp.mozilla.rhino.Token.FUNCTION :
				return processFunctionNode(((com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.GETELEM :
				return processElementGet(((com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.GETPROP :
				return processPropertyGet(((com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.HOOK :
				return processConditionalExpression(((com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.IF :
				return processIfStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.LABEL :
				return processLabel(((com.google.javascript.jscomp.mozilla.rhino.ast.Label) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.LP :
				return processParenthesizedExpression(((com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.NAME :
				return processName(((com.google.javascript.jscomp.mozilla.rhino.ast.Name) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.NEW :
				return processNewExpression(((com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.NUMBER :
				return processNumberLiteral(((com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.OBJECTLIT :
				return processObjectLiteral(((com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.REGEXP :
				return processRegExpLiteral(((com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.RETURN :
				return processReturnStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.SCRIPT :
				return processAstRoot(((com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.STRING :
				return processStringLiteral(((com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.SWITCH :
				return processSwitchStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.THROW :
				return processThrowStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.TRY :
				return processTryStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.CONST :
			case com.google.javascript.jscomp.mozilla.rhino.Token.VAR :
				if (node instanceof com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration) {
					return processVariableDeclaration(((com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration) (node)));
				}else
					if (node instanceof com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer) {
						return processVariableInitializer(((com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer) (node)));
					}else {
						throw new java.lang.IllegalStateException(((("Unexpected node type.  class: " + (node.getClass())) + " type: ") + (com.google.javascript.jscomp.mozilla.rhino.Token.typeToName(node.getType()))));
					}
				
			case com.google.javascript.jscomp.mozilla.rhino.Token.WHILE :
				return processWhileLoop(((com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop) (node)));
			case com.google.javascript.jscomp.mozilla.rhino.Token.WITH :
				return processWithStatement(((com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement) (node)));
		}
		return processIllegalToken(node);
	}
}

