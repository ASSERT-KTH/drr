

package com.google.javascript.jscomp;


class ExpressionDecomposer {
	enum DecompositionType {
UNDECOMPOSABLE, MOVABLE, DECOMPOSABLE;	}

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier;

	private final java.util.Set<java.lang.String> knownConstants;

	public ExpressionDecomposer(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.common.base.Supplier<java.lang.String> safeNameIdSupplier, java.util.Set<java.lang.String> constNames) {
		com.google.common.base.Preconditions.checkNotNull(compiler);
		com.google.common.base.Preconditions.checkNotNull(safeNameIdSupplier);
		com.google.common.base.Preconditions.checkNotNull(constNames);
		this.compiler = compiler;
		this.safeNameIdSupplier = safeNameIdSupplier;
		this.knownConstants = constNames;
	}

	private static final int MAX_INTERATIONS = 100;

	void maybeExposeExpression(com.google.javascript.rhino.Node expression) {
		int i = 0;
		while ((com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType.DECOMPOSABLE) == (canExposeExpression(expression))) {
			exposeExpression(expression);
			i++;
			if (i > (com.google.javascript.jscomp.ExpressionDecomposer.MAX_INTERATIONS)) {
				throw new java.lang.IllegalStateException(("DecomposeExpression depth exceeded on :\n" + (expression.toStringTree())));
			}
		} 
	}

	void exposeExpression(com.google.javascript.rhino.Node expression) {
		com.google.javascript.rhino.Node expressionRoot = com.google.javascript.jscomp.ExpressionDecomposer.findExpressionRoot(expression);
		com.google.common.base.Preconditions.checkState((expressionRoot != null));
		exposeExpression(expressionRoot, expression);
		compiler.reportCodeChange();
	}

	void moveExpression(com.google.javascript.rhino.Node expression) {
		java.lang.String resultName = getResultValueName();
		com.google.javascript.rhino.Node injectionPoint = com.google.javascript.jscomp.ExpressionDecomposer.findInjectionPoint(expression);
		com.google.common.base.Preconditions.checkNotNull(injectionPoint);
		com.google.javascript.rhino.Node injectionPointParent = injectionPoint.getParent();
		com.google.common.base.Preconditions.checkNotNull(injectionPointParent);
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isStatementBlock(injectionPointParent));
		com.google.javascript.rhino.Node expressionParent = expression.getParent();
		expressionParent.replaceChild(expression, com.google.javascript.rhino.IR.name(resultName));
		com.google.javascript.rhino.Node newExpressionRoot = com.google.javascript.jscomp.NodeUtil.newVarNode(resultName, expression);
		injectionPointParent.addChildBefore(newExpressionRoot, injectionPoint);
		compiler.reportCodeChange();
	}

	private void exposeExpression(com.google.javascript.rhino.Node expressionRoot, com.google.javascript.rhino.Node subExpression) {
		com.google.javascript.rhino.Node nonconditionalExpr = com.google.javascript.jscomp.ExpressionDecomposer.findNonconditionalParent(subExpression, expressionRoot);
		boolean hasFollowingSideEffects = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(nonconditionalExpr);
		com.google.javascript.rhino.Node exprInjectionPoint = com.google.javascript.jscomp.ExpressionDecomposer.findInjectionPoint(nonconditionalExpr);
		com.google.javascript.jscomp.ExpressionDecomposer.DecompositionState state = new com.google.javascript.jscomp.ExpressionDecomposer.DecompositionState();
		state.sideEffects = hasFollowingSideEffects;
		state.extractBeforeStatement = exprInjectionPoint;
		for (com.google.javascript.rhino.Node grandchild = null, child = nonconditionalExpr, parent = child.getParent(); parent != expressionRoot; grandchild = child , child = parent , parent = child.getParent()) {
			int parentType = parent.getType();
			com.google.common.base.Preconditions.checkState(((!(com.google.javascript.jscomp.ExpressionDecomposer.isConditionalOp(parent))) || (child == (parent.getFirstChild()))));
			if (parentType == (com.google.javascript.rhino.Token.ASSIGN)) {
				if (isSafeAssign(parent, state.sideEffects)) {
				}else {
					com.google.javascript.rhino.Node left = parent.getFirstChild();
					int type = left.getType();
					if (left != child) {
						com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isGet(left));
						if (type == (com.google.javascript.rhino.Token.GETELEM)) {
							decomposeSubExpressions(left.getLastChild(), null, state);
						}
						decomposeSubExpressions(left.getFirstChild(), null, state);
					}
				}
			}else
				if ((parentType == (com.google.javascript.rhino.Token.CALL)) && (com.google.javascript.jscomp.NodeUtil.isGet(parent.getFirstChild()))) {
					com.google.javascript.rhino.Node functionExpression = parent.getFirstChild();
					decomposeSubExpressions(functionExpression.getNext(), child, state);
					if ((isExpressionTreeUnsafe(functionExpression, state.sideEffects)) && ((functionExpression.getFirstChild()) != grandchild)) {
						com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.ExpressionDecomposer.allowObjectCallDecomposing(), "Object method calls can not be decomposed.");
						state.sideEffects = true;
						com.google.javascript.rhino.Node replacement = rewriteCallExpression(parent, state);
						parent = replacement;
					}
				}else
					if (parentType == (com.google.javascript.rhino.Token.OBJECTLIT)) {
						decomposeObjectLiteralKeys(parent.getFirstChild(), child, state);
					}else {
						decomposeSubExpressions(parent.getFirstChild(), child, state);
					}
				
			
		}
		if (nonconditionalExpr == subExpression) {
		}else {
			com.google.javascript.rhino.Node parent = nonconditionalExpr.getParent();
			boolean needResult = !(parent.isExprResult());
			com.google.javascript.rhino.Node extractedConditional = extractConditional(nonconditionalExpr, exprInjectionPoint, needResult);
		}
	}

	private static boolean allowObjectCallDecomposing() {
		return false;
	}

	private boolean maybeExternMethod(com.google.javascript.rhino.Node node) {
		return true;
	}

	private static com.google.javascript.rhino.Node findNonconditionalParent(com.google.javascript.rhino.Node subExpression, com.google.javascript.rhino.Node expressionRoot) {
		com.google.javascript.rhino.Node result = subExpression;
		for (com.google.javascript.rhino.Node child = subExpression, parent = child.getParent(); parent != expressionRoot; child = parent , parent = child.getParent()) {
			if (com.google.javascript.jscomp.ExpressionDecomposer.isConditionalOp(parent)) {
				if (child != (parent.getFirstChild())) {
					result = parent;
				}
			}
		}
		return result;
	}

	private static class DecompositionState {
		boolean sideEffects;

		com.google.javascript.rhino.Node extractBeforeStatement;
	}

	private void decomposeObjectLiteralKeys(com.google.javascript.rhino.Node key, com.google.javascript.rhino.Node stopNode, com.google.javascript.jscomp.ExpressionDecomposer.DecompositionState state) {
		if ((key == null) || (key == stopNode)) {
			return ;
		}
		decomposeObjectLiteralKeys(key.getNext(), stopNode, state);
		decomposeSubExpressions(key.getFirstChild(), stopNode, state);
	}

	private void decomposeSubExpressions(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node stopNode, com.google.javascript.jscomp.ExpressionDecomposer.DecompositionState state) {
		if ((n == null) || (n == stopNode)) {
			return ;
		}
		com.google.common.base.Preconditions.checkState((!(com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, n.getParent()))));
		decomposeSubExpressions(n.getNext(), stopNode, state);
		if (isExpressionTreeUnsafe(n, state.sideEffects)) {
			state.sideEffects = true;
			state.extractBeforeStatement = extractExpression(n, state.extractBeforeStatement);
		}
	}

	private com.google.javascript.rhino.Node extractConditional(com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node injectionPoint, boolean needResult) {
		com.google.javascript.rhino.Node parent = expr.getParent();
		java.lang.String tempName = getTempValueName();
		com.google.javascript.rhino.Node first = expr.getFirstChild();
		com.google.javascript.rhino.Node second = first.getNext();
		com.google.javascript.rhino.Node last = expr.getLastChild();
		expr.detachChildren();
		com.google.javascript.rhino.Node cond = null;
		com.google.javascript.rhino.Node trueExpr = com.google.javascript.rhino.IR.block().srcref(expr);
		com.google.javascript.rhino.Node falseExpr = com.google.javascript.rhino.IR.block().srcref(expr);
		switch (expr.getType()) {
			case com.google.javascript.rhino.Token.HOOK :
				cond = first;
				trueExpr.addChildToFront(com.google.javascript.jscomp.NodeUtil.newExpr(com.google.javascript.jscomp.ExpressionDecomposer.buildResultExpression(second, needResult, tempName)));
				falseExpr.addChildToFront(com.google.javascript.jscomp.NodeUtil.newExpr(com.google.javascript.jscomp.ExpressionDecomposer.buildResultExpression(last, needResult, tempName)));
				break;
			case com.google.javascript.rhino.Token.AND :
				cond = com.google.javascript.jscomp.ExpressionDecomposer.buildResultExpression(first, needResult, tempName);
				trueExpr.addChildToFront(com.google.javascript.jscomp.NodeUtil.newExpr(com.google.javascript.jscomp.ExpressionDecomposer.buildResultExpression(last, needResult, tempName)));
				break;
			case com.google.javascript.rhino.Token.OR :
				cond = com.google.javascript.jscomp.ExpressionDecomposer.buildResultExpression(first, needResult, tempName);
				falseExpr.addChildToFront(com.google.javascript.jscomp.NodeUtil.newExpr(com.google.javascript.jscomp.ExpressionDecomposer.buildResultExpression(last, needResult, tempName)));
				break;
			default :
				throw new java.lang.IllegalStateException("Unexpected.");
		}
		com.google.javascript.rhino.Node ifNode;
		if (falseExpr.hasChildren()) {
			ifNode = com.google.javascript.rhino.IR.ifNode(cond, trueExpr, falseExpr);
		}else {
			ifNode = com.google.javascript.rhino.IR.ifNode(cond, trueExpr);
		}
		ifNode.copyInformationFrom(expr);
		if (needResult) {
			com.google.javascript.rhino.Node tempVarNode = com.google.javascript.jscomp.NodeUtil.newVarNode(tempName, null).copyInformationFromForTree(expr);
			com.google.javascript.rhino.Node injectionPointParent = injectionPoint.getParent();
			injectionPointParent.addChildBefore(tempVarNode, injectionPoint);
			injectionPointParent.addChildAfter(ifNode, tempVarNode);
			com.google.javascript.rhino.Node replacementValueNode = com.google.javascript.rhino.IR.name(tempName);
			parent.replaceChild(expr, replacementValueNode);
		}else {
			com.google.common.base.Preconditions.checkArgument(parent.isExprResult());
			com.google.javascript.rhino.Node gramps = parent.getParent();
			gramps.replaceChild(parent, ifNode);
		}
		return ifNode;
	}

	private static com.google.javascript.rhino.Node buildResultExpression(com.google.javascript.rhino.Node expr, boolean needResult, java.lang.String tempName) {
		if (needResult) {
			return com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.IR.name(tempName), expr).srcrefTree(expr);
		}else {
			return expr;
		}
	}

	private boolean isConstantName(com.google.javascript.rhino.Node n, java.util.Set<java.lang.String> knownConstants) {
		return (n.isName()) && ((com.google.javascript.jscomp.NodeUtil.isConstantName(n)) || (knownConstants.contains(n.getString())));
	}

	private com.google.javascript.rhino.Node extractExpression(com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node injectionPoint) {
		com.google.javascript.rhino.Node parent = expr.getParent();
		boolean isLhsOfAssignOp = ((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && (!(parent.isAssign()))) && ((parent.getFirstChild()) == expr);
		com.google.javascript.rhino.Node firstExtractedNode = null;
		if (isLhsOfAssignOp && (com.google.javascript.jscomp.NodeUtil.isGet(expr))) {
			for (com.google.javascript.rhino.Node n : expr.children()) {
				if ((!(n.isString())) && (!(isConstantName(n, knownConstants)))) {
					com.google.javascript.rhino.Node extractedNode = extractExpression(n, injectionPoint);
					if (firstExtractedNode == null) {
						firstExtractedNode = extractedNode;
					}
				}
			}
		}
		java.lang.String tempName = getTempConstantValueName();
		com.google.javascript.rhino.Node replacementValueNode = com.google.javascript.rhino.IR.name(tempName).srcref(expr);
		com.google.javascript.rhino.Node tempNameValue;
		if (isLhsOfAssignOp) {
			com.google.common.base.Preconditions.checkState(((expr.isName()) || (com.google.javascript.jscomp.NodeUtil.isGet(expr))));
			com.google.javascript.rhino.Node opNode = new com.google.javascript.rhino.Node(com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(parent)).copyInformationFrom(parent);
			com.google.javascript.rhino.Node rightOperand = parent.getLastChild();
			parent.setType(com.google.javascript.rhino.Token.ASSIGN);
			parent.replaceChild(rightOperand, opNode);
			opNode.addChildToFront(replacementValueNode);
			opNode.addChildToBack(rightOperand);
			tempNameValue = expr.cloneTree();
		}else {
			parent.replaceChild(expr, replacementValueNode);
			tempNameValue = expr;
		}
		com.google.javascript.rhino.Node tempVarNode = com.google.javascript.jscomp.NodeUtil.newVarNode(tempName, tempNameValue);
		com.google.javascript.rhino.Node injectionPointParent = injectionPoint.getParent();
		injectionPointParent.addChildBefore(tempVarNode, injectionPoint);
		if (firstExtractedNode == null) {
			firstExtractedNode = tempVarNode;
		}
		return firstExtractedNode;
	}

	private com.google.javascript.rhino.Node rewriteCallExpression(com.google.javascript.rhino.Node call, com.google.javascript.jscomp.ExpressionDecomposer.DecompositionState state) {
		com.google.common.base.Preconditions.checkArgument(call.isCall());
		com.google.javascript.rhino.Node first = call.getFirstChild();
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isGet(first));
		com.google.javascript.rhino.Node getVarNode = extractExpression(first, state.extractBeforeStatement);
		state.extractBeforeStatement = getVarNode;
		com.google.javascript.rhino.Node getExprNode = getVarNode.getFirstChild().getFirstChild();
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isGet(getExprNode));
		com.google.javascript.rhino.Node thisVarNode = extractExpression(getExprNode.getFirstChild(), state.extractBeforeStatement);
		state.extractBeforeStatement = thisVarNode;
		com.google.javascript.rhino.Node thisNameNode = thisVarNode.getFirstChild();
		com.google.javascript.rhino.Node functionNameNode = getVarNode.getFirstChild();
		com.google.javascript.rhino.Node newCall = com.google.javascript.rhino.IR.call(com.google.javascript.rhino.IR.getprop(functionNameNode.cloneNode(), com.google.javascript.rhino.IR.string("call")), thisNameNode.cloneNode()).srcref(call);
		call.removeFirstChild();
		if (call.hasChildren()) {
			newCall.addChildrenToBack(call.removeChildren());
		}
		com.google.javascript.rhino.Node callParent = call.getParent();
		callParent.replaceChild(call, newCall);
		return newCall;
	}

	private java.lang.String tempNamePrefix = "JSCompiler_temp";

	private java.lang.String resultNamePrefix = "JSCompiler_inline_result";

	@com.google.common.annotations.VisibleForTesting
	public void setTempNamePrefix(java.lang.String prefix) {
		com.google.javascript.jscomp.ExpressionDecomposer.this.tempNamePrefix = prefix;
	}

	private java.lang.String getTempValueName() {
		return ((tempNamePrefix) + (com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR)) + (safeNameIdSupplier.get());
	}

	@com.google.common.annotations.VisibleForTesting
	public void setResultNamePrefix(java.lang.String prefix) {
		com.google.javascript.jscomp.ExpressionDecomposer.this.resultNamePrefix = prefix;
	}

	private java.lang.String getResultValueName() {
		return ((resultNamePrefix) + (com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR)) + (safeNameIdSupplier.get());
	}

	private java.lang.String getTempConstantValueName() {
		java.lang.String name = (((tempNamePrefix) + "_const") + (com.google.javascript.jscomp.MakeDeclaredNamesUnique.ContextualRenamer.UNIQUE_ID_SEPARATOR)) + (safeNameIdSupplier.get());
		com.google.javascript.jscomp.ExpressionDecomposer.this.knownConstants.add(name);
		return name;
	}

	static com.google.javascript.rhino.Node findInjectionPoint(com.google.javascript.rhino.Node subExpression) {
		com.google.javascript.rhino.Node expressionRoot = com.google.javascript.jscomp.ExpressionDecomposer.findExpressionRoot(subExpression);
		com.google.common.base.Preconditions.checkNotNull(expressionRoot);
		com.google.javascript.rhino.Node injectionPoint = expressionRoot;
		com.google.javascript.rhino.Node parent = injectionPoint.getParent();
		while (parent.isLabel()) {
			injectionPoint = parent;
			parent = injectionPoint.getParent();
		} 
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isStatementBlock(injectionPoint.getParent()));
		return injectionPoint;
	}

	private static boolean isConditionalOp(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.HOOK :
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				return true;
			default :
				return false;
		}
	}

	static com.google.javascript.rhino.Node findExpressionRoot(com.google.javascript.rhino.Node subExpression) {
		com.google.javascript.rhino.Node child = subExpression;
		for (com.google.javascript.rhino.Node parent : child.getAncestors()) {
			int parentType = parent.getType();
			switch (parentType) {
				case com.google.javascript.rhino.Token.EXPR_RESULT :
				case com.google.javascript.rhino.Token.IF :
				case com.google.javascript.rhino.Token.SWITCH :
				case com.google.javascript.rhino.Token.RETURN :
				case com.google.javascript.rhino.Token.VAR :
					com.google.common.base.Preconditions.checkState((child == (parent.getFirstChild())));
					return parent;
				case com.google.javascript.rhino.Token.SCRIPT :
				case com.google.javascript.rhino.Token.BLOCK :
				case com.google.javascript.rhino.Token.LABEL :
				case com.google.javascript.rhino.Token.CASE :
				case com.google.javascript.rhino.Token.DEFAULT_CASE :
					return null;
			}
			child = parent;
		}
		throw new java.lang.IllegalStateException("Unexpected AST structure.");
	}

	com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType canExposeExpression(com.google.javascript.rhino.Node subExpression) {
		com.google.javascript.rhino.Node expressionRoot = com.google.javascript.jscomp.ExpressionDecomposer.findExpressionRoot(subExpression);
		if (expressionRoot != null) {
			return isSubexpressionMovable(expressionRoot, subExpression);
		}
		return com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType.UNDECOMPOSABLE;
	}

	private com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType isSubexpressionMovable(com.google.javascript.rhino.Node expressionRoot, com.google.javascript.rhino.Node subExpression) {
		boolean requiresDecomposition = false;
		boolean seenSideEffects = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(subExpression);
		com.google.javascript.rhino.Node child = subExpression;
		for (com.google.javascript.rhino.Node parent : child.getAncestors()) {
			if (parent == expressionRoot) {
				return requiresDecomposition ? com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType.DECOMPOSABLE : com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType.MOVABLE;
			}
			int parentType = parent.getType();
			if (com.google.javascript.jscomp.ExpressionDecomposer.isConditionalOp(parent)) {
				if (child != (parent.getFirstChild())) {
					requiresDecomposition = true;
				}
			}else {
				if (isSafeAssign(parent, seenSideEffects)) {
				}else {
					for (com.google.javascript.rhino.Node n : parent.children()) {
						if (n == child) {
							break;
						}
						if (isExpressionTreeUnsafe(n, seenSideEffects)) {
							seenSideEffects = true;
							requiresDecomposition = true;
						}
					}
					com.google.javascript.rhino.Node first = parent.getFirstChild();
					if ((requiresDecomposition && (parent.isCall())) && (com.google.javascript.jscomp.NodeUtil.isGet(first))) {
						if (maybeExternMethod(first)) {
							return com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType.UNDECOMPOSABLE;
						}else {
							return com.google.javascript.jscomp.ExpressionDecomposer.DecompositionType.DECOMPOSABLE;
						}
					}
				}
			}
			child = parent;
		}
		throw new java.lang.IllegalStateException("Unexpected.");
	}

	private boolean isSafeAssign(com.google.javascript.rhino.Node n, boolean seenSideEffects) {
		if (n.isAssign()) {
			com.google.javascript.rhino.Node lhs = n.getFirstChild();
			switch (lhs.getType()) {
				case com.google.javascript.rhino.Token.NAME :
					return true;
				case com.google.javascript.rhino.Token.GETPROP :
					return !(isExpressionTreeUnsafe(lhs.getFirstChild(), seenSideEffects));
				case com.google.javascript.rhino.Token.GETELEM :
					return (!(isExpressionTreeUnsafe(lhs.getFirstChild(), seenSideEffects))) && (!(isExpressionTreeUnsafe(lhs.getLastChild(), seenSideEffects)));
			}
		}
		return false;
	}

	private boolean isExpressionTreeUnsafe(com.google.javascript.rhino.Node n, boolean followingSideEffectsExist) {
		if (followingSideEffectsExist) {
			return com.google.javascript.jscomp.NodeUtil.canBeSideEffected(n, com.google.javascript.jscomp.ExpressionDecomposer.this.knownConstants);
		}else {
			return com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n);
		}
	}
}

