

package com.google.javascript.jscomp.parsing;


abstract class TypeSafeDispatcher<T> {
	abstract T processArrayLiteral(com.google.javascript.rhino.head.ast.ArrayLiteral literalNode);

	abstract T processAssignment(com.google.javascript.rhino.head.ast.Assignment assignmentNode);

	abstract T processAstRoot(com.google.javascript.rhino.head.ast.AstRoot rootNode);

	abstract T processBlock(com.google.javascript.rhino.head.ast.Block blockNode);

	abstract T processBreakStatement(com.google.javascript.rhino.head.ast.BreakStatement statementNode);

	abstract T processCatchClause(com.google.javascript.rhino.head.ast.CatchClause clauseNode);

	abstract T processConditionalExpression(com.google.javascript.rhino.head.ast.ConditionalExpression exprNode);

	abstract T processContinueStatement(com.google.javascript.rhino.head.ast.ContinueStatement statementNode);

	abstract T processDoLoop(com.google.javascript.rhino.head.ast.DoLoop loopNode);

	abstract T processElementGet(com.google.javascript.rhino.head.ast.ElementGet getNode);

	abstract T processEmptyExpression(com.google.javascript.rhino.head.ast.EmptyExpression exprNode);

	abstract T processExpressionStatement(com.google.javascript.rhino.head.ast.ExpressionStatement statementNode);

	abstract T processForInLoop(com.google.javascript.rhino.head.ast.ForInLoop loopNode);

	abstract T processForLoop(com.google.javascript.rhino.head.ast.ForLoop loopNode);

	abstract T processFunctionCall(com.google.javascript.rhino.head.ast.FunctionCall callNode);

	abstract T processFunctionNode(com.google.javascript.rhino.head.ast.FunctionNode functionNode);

	abstract T processIfStatement(com.google.javascript.rhino.head.ast.IfStatement statementNode);

	abstract T processInfixExpression(com.google.javascript.rhino.head.ast.InfixExpression exprNode);

	abstract T processKeywordLiteral(com.google.javascript.rhino.head.ast.KeywordLiteral literalNode);

	abstract T processLabel(com.google.javascript.rhino.head.ast.Label labelNode);

	abstract T processLabeledStatement(com.google.javascript.rhino.head.ast.LabeledStatement statementNode);

	abstract T processName(com.google.javascript.rhino.head.ast.Name nameNode);

	abstract T processNewExpression(com.google.javascript.rhino.head.ast.NewExpression exprNode);

	abstract T processNumberLiteral(com.google.javascript.rhino.head.ast.NumberLiteral literalNode);

	abstract T processObjectLiteral(com.google.javascript.rhino.head.ast.ObjectLiteral literalNode);

	abstract T processObjectProperty(com.google.javascript.rhino.head.ast.ObjectProperty propertyNode);

	abstract T processParenthesizedExpression(com.google.javascript.rhino.head.ast.ParenthesizedExpression exprNode);

	abstract T processPropertyGet(com.google.javascript.rhino.head.ast.PropertyGet getNode);

	abstract T processRegExpLiteral(com.google.javascript.rhino.head.ast.RegExpLiteral literalNode);

	abstract T processReturnStatement(com.google.javascript.rhino.head.ast.ReturnStatement statementNode);

	abstract T processScope(com.google.javascript.rhino.head.ast.Scope scopeNode);

	abstract T processStringLiteral(com.google.javascript.rhino.head.ast.StringLiteral literalNode);

	abstract T processSwitchCase(com.google.javascript.rhino.head.ast.SwitchCase caseNode);

	abstract T processSwitchStatement(com.google.javascript.rhino.head.ast.SwitchStatement statementNode);

	abstract T processThrowStatement(com.google.javascript.rhino.head.ast.ThrowStatement statementNode);

	abstract T processTryStatement(com.google.javascript.rhino.head.ast.TryStatement statementNode);

	abstract T processUnaryExpression(com.google.javascript.rhino.head.ast.UnaryExpression exprNode);

	abstract T processVariableDeclaration(com.google.javascript.rhino.head.ast.VariableDeclaration declarationNode);

	abstract T processVariableInitializer(com.google.javascript.rhino.head.ast.VariableInitializer initializerNode);

	abstract T processWhileLoop(com.google.javascript.rhino.head.ast.WhileLoop loopNode);

	abstract T processWithStatement(com.google.javascript.rhino.head.ast.WithStatement statementNode);

	abstract T processIllegalToken(com.google.javascript.rhino.head.ast.AstNode node);

	public T process(com.google.javascript.rhino.head.ast.AstNode node) {
		switch (node.getType()) {
			case com.google.javascript.rhino.head.Token.ADD :
			case com.google.javascript.rhino.head.Token.AND :
			case com.google.javascript.rhino.head.Token.BITAND :
			case com.google.javascript.rhino.head.Token.BITOR :
			case com.google.javascript.rhino.head.Token.BITXOR :
			case com.google.javascript.rhino.head.Token.COMMA :
			case com.google.javascript.rhino.head.Token.DIV :
			case com.google.javascript.rhino.head.Token.EQ :
			case com.google.javascript.rhino.head.Token.GE :
			case com.google.javascript.rhino.head.Token.GT :
			case com.google.javascript.rhino.head.Token.IN :
			case com.google.javascript.rhino.head.Token.INSTANCEOF :
			case com.google.javascript.rhino.head.Token.LE :
			case com.google.javascript.rhino.head.Token.LSH :
			case com.google.javascript.rhino.head.Token.LT :
			case com.google.javascript.rhino.head.Token.MOD :
			case com.google.javascript.rhino.head.Token.MUL :
			case com.google.javascript.rhino.head.Token.NE :
			case com.google.javascript.rhino.head.Token.OR :
			case com.google.javascript.rhino.head.Token.RSH :
			case com.google.javascript.rhino.head.Token.SHEQ :
			case com.google.javascript.rhino.head.Token.SHNE :
			case com.google.javascript.rhino.head.Token.SUB :
			case com.google.javascript.rhino.head.Token.URSH :
				return processInfixExpression(((com.google.javascript.rhino.head.ast.InfixExpression) (node)));
			case com.google.javascript.rhino.head.Token.ARRAYLIT :
				return processArrayLiteral(((com.google.javascript.rhino.head.ast.ArrayLiteral) (node)));
			case com.google.javascript.rhino.head.Token.ASSIGN :
			case com.google.javascript.rhino.head.Token.ASSIGN_ADD :
			case com.google.javascript.rhino.head.Token.ASSIGN_BITAND :
			case com.google.javascript.rhino.head.Token.ASSIGN_BITOR :
			case com.google.javascript.rhino.head.Token.ASSIGN_BITXOR :
			case com.google.javascript.rhino.head.Token.ASSIGN_DIV :
			case com.google.javascript.rhino.head.Token.ASSIGN_LSH :
			case com.google.javascript.rhino.head.Token.ASSIGN_MOD :
			case com.google.javascript.rhino.head.Token.ASSIGN_MUL :
			case com.google.javascript.rhino.head.Token.ASSIGN_RSH :
			case com.google.javascript.rhino.head.Token.ASSIGN_SUB :
			case com.google.javascript.rhino.head.Token.ASSIGN_URSH :
				return processAssignment(((com.google.javascript.rhino.head.ast.Assignment) (node)));
			case com.google.javascript.rhino.head.Token.BITNOT :
			case com.google.javascript.rhino.head.Token.DEC :
			case com.google.javascript.rhino.head.Token.DELPROP :
			case com.google.javascript.rhino.head.Token.INC :
			case com.google.javascript.rhino.head.Token.NEG :
			case com.google.javascript.rhino.head.Token.NOT :
			case com.google.javascript.rhino.head.Token.POS :
			case com.google.javascript.rhino.head.Token.TYPEOF :
			case com.google.javascript.rhino.head.Token.VOID :
				return processUnaryExpression(((com.google.javascript.rhino.head.ast.UnaryExpression) (node)));
			case com.google.javascript.rhino.head.Token.BLOCK :
				if (node instanceof com.google.javascript.rhino.head.ast.Block) {
					return processBlock(((com.google.javascript.rhino.head.ast.Block) (node)));
				}else
					if (node instanceof com.google.javascript.rhino.head.ast.Scope) {
						return processScope(((com.google.javascript.rhino.head.ast.Scope) (node)));
					}else {
						throw new java.lang.IllegalStateException(((("Unexpected node type.  class: " + (node.getClass())) + " type: ") + (com.google.javascript.rhino.head.Token.typeToName(node.getType()))));
					}
				
			case com.google.javascript.rhino.head.Token.BREAK :
				return processBreakStatement(((com.google.javascript.rhino.head.ast.BreakStatement) (node)));
			case com.google.javascript.rhino.head.Token.CALL :
				return processFunctionCall(((com.google.javascript.rhino.head.ast.FunctionCall) (node)));
			case com.google.javascript.rhino.head.Token.CASE :
			case com.google.javascript.rhino.head.Token.DEFAULT :
				return processSwitchCase(((com.google.javascript.rhino.head.ast.SwitchCase) (node)));
			case com.google.javascript.rhino.head.Token.CATCH :
				return processCatchClause(((com.google.javascript.rhino.head.ast.CatchClause) (node)));
			case com.google.javascript.rhino.head.Token.COLON :
				return processObjectProperty(((com.google.javascript.rhino.head.ast.ObjectProperty) (node)));
			case com.google.javascript.rhino.head.Token.CONTINUE :
				return processContinueStatement(((com.google.javascript.rhino.head.ast.ContinueStatement) (node)));
			case com.google.javascript.rhino.head.Token.DO :
				return processDoLoop(((com.google.javascript.rhino.head.ast.DoLoop) (node)));
			case com.google.javascript.rhino.head.Token.EMPTY :
				return processEmptyExpression(((com.google.javascript.rhino.head.ast.EmptyExpression) (node)));
			case com.google.javascript.rhino.head.Token.EXPR_RESULT :
			case com.google.javascript.rhino.head.Token.EXPR_VOID :
				if (node instanceof com.google.javascript.rhino.head.ast.ExpressionStatement) {
					return processExpressionStatement(((com.google.javascript.rhino.head.ast.ExpressionStatement) (node)));
				}else
					if (node instanceof com.google.javascript.rhino.head.ast.LabeledStatement) {
						return processLabeledStatement(((com.google.javascript.rhino.head.ast.LabeledStatement) (node)));
					}else {
						throw new java.lang.IllegalStateException(((("Unexpected node type.  class: " + (node.getClass())) + " type: ") + (com.google.javascript.rhino.head.Token.typeToName(node.getType()))));
					}
				
			case com.google.javascript.rhino.head.Token.DEBUGGER :
			case com.google.javascript.rhino.head.Token.FALSE :
			case com.google.javascript.rhino.head.Token.NULL :
			case com.google.javascript.rhino.head.Token.THIS :
			case com.google.javascript.rhino.head.Token.TRUE :
				return processKeywordLiteral(((com.google.javascript.rhino.head.ast.KeywordLiteral) (node)));
			case com.google.javascript.rhino.head.Token.FOR :
				if (node instanceof com.google.javascript.rhino.head.ast.ForInLoop) {
					return processForInLoop(((com.google.javascript.rhino.head.ast.ForInLoop) (node)));
				}else
					if (node instanceof com.google.javascript.rhino.head.ast.ForLoop) {
						return processForLoop(((com.google.javascript.rhino.head.ast.ForLoop) (node)));
					}else {
						throw new java.lang.IllegalStateException(((("Unexpected node type.  class: " + (node.getClass())) + " type: ") + (com.google.javascript.rhino.head.Token.typeToName(node.getType()))));
					}
				
			case com.google.javascript.rhino.head.Token.FUNCTION :
				return processFunctionNode(((com.google.javascript.rhino.head.ast.FunctionNode) (node)));
			case com.google.javascript.rhino.head.Token.GETELEM :
				return processElementGet(((com.google.javascript.rhino.head.ast.ElementGet) (node)));
			case com.google.javascript.rhino.head.Token.GETPROP :
				return processPropertyGet(((com.google.javascript.rhino.head.ast.PropertyGet) (node)));
			case com.google.javascript.rhino.head.Token.HOOK :
				return processConditionalExpression(((com.google.javascript.rhino.head.ast.ConditionalExpression) (node)));
			case com.google.javascript.rhino.head.Token.IF :
				return processIfStatement(((com.google.javascript.rhino.head.ast.IfStatement) (node)));
			case com.google.javascript.rhino.head.Token.LABEL :
				return processLabel(((com.google.javascript.rhino.head.ast.Label) (node)));
			case com.google.javascript.rhino.head.Token.LP :
				return processParenthesizedExpression(((com.google.javascript.rhino.head.ast.ParenthesizedExpression) (node)));
			case com.google.javascript.rhino.head.Token.NAME :
				return processName(((com.google.javascript.rhino.head.ast.Name) (node)));
			case com.google.javascript.rhino.head.Token.NEW :
				return processNewExpression(((com.google.javascript.rhino.head.ast.NewExpression) (node)));
			case com.google.javascript.rhino.head.Token.NUMBER :
				return processNumberLiteral(((com.google.javascript.rhino.head.ast.NumberLiteral) (node)));
			case com.google.javascript.rhino.head.Token.OBJECTLIT :
				return processObjectLiteral(((com.google.javascript.rhino.head.ast.ObjectLiteral) (node)));
			case com.google.javascript.rhino.head.Token.REGEXP :
				return processRegExpLiteral(((com.google.javascript.rhino.head.ast.RegExpLiteral) (node)));
			case com.google.javascript.rhino.head.Token.RETURN :
				return processReturnStatement(((com.google.javascript.rhino.head.ast.ReturnStatement) (node)));
			case com.google.javascript.rhino.head.Token.SCRIPT :
				return processAstRoot(((com.google.javascript.rhino.head.ast.AstRoot) (node)));
			case com.google.javascript.rhino.head.Token.STRING :
				return processStringLiteral(((com.google.javascript.rhino.head.ast.StringLiteral) (node)));
			case com.google.javascript.rhino.head.Token.SWITCH :
				return processSwitchStatement(((com.google.javascript.rhino.head.ast.SwitchStatement) (node)));
			case com.google.javascript.rhino.head.Token.THROW :
				return processThrowStatement(((com.google.javascript.rhino.head.ast.ThrowStatement) (node)));
			case com.google.javascript.rhino.head.Token.TRY :
				return processTryStatement(((com.google.javascript.rhino.head.ast.TryStatement) (node)));
			case com.google.javascript.rhino.head.Token.CONST :
			case com.google.javascript.rhino.head.Token.VAR :
				if (node instanceof com.google.javascript.rhino.head.ast.VariableDeclaration) {
					return processVariableDeclaration(((com.google.javascript.rhino.head.ast.VariableDeclaration) (node)));
				}else
					if (node instanceof com.google.javascript.rhino.head.ast.VariableInitializer) {
						return processVariableInitializer(((com.google.javascript.rhino.head.ast.VariableInitializer) (node)));
					}else {
						throw new java.lang.IllegalStateException(((("Unexpected node type.  class: " + (node.getClass())) + " type: ") + (com.google.javascript.rhino.head.Token.typeToName(node.getType()))));
					}
				
			case com.google.javascript.rhino.head.Token.WHILE :
				return processWhileLoop(((com.google.javascript.rhino.head.ast.WhileLoop) (node)));
			case com.google.javascript.rhino.head.Token.WITH :
				return processWithStatement(((com.google.javascript.rhino.head.ast.WithStatement) (node)));
		}
		return processIllegalToken(node);
	}
}

