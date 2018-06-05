

package com.google.javascript.jscomp.jsonml;


public class Reader {
	static final com.google.javascript.jscomp.DiagnosticType JSONML_SYNTAX = com.google.javascript.jscomp.DiagnosticType.error("JSONML_SYNTAX", "Syntax error: {0}");

	private com.google.javascript.jscomp.jsonml.JsonML rootElement;

	private java.lang.String sourceName;

	private com.google.javascript.jscomp.jsonml.Reader.ErrorReporter errorReporter;

	private final java.util.Set<java.lang.String> ALLOWED_DIRECTIVES = com.google.common.collect.Sets.newHashSet("use strict");

	private int nodeIndex;

	private class ErrorReporter {
		private com.google.javascript.jscomp.AbstractCompiler compiler;

		ErrorReporter(com.google.javascript.jscomp.AbstractCompiler compiler) {
			com.google.javascript.jscomp.jsonml.Reader.ErrorReporter.this.compiler = compiler;
		}

		private void report(com.google.javascript.jscomp.jsonml.JsonML element, java.lang.String... arguments) throws com.google.javascript.jscomp.jsonml.JsonMLException {
			report(com.google.javascript.jscomp.jsonml.Reader.JSONML_SYNTAX, element, arguments);
		}

		private void report(com.google.javascript.jscomp.DiagnosticType type, com.google.javascript.jscomp.jsonml.JsonML element, java.lang.String... arguments) throws com.google.javascript.jscomp.jsonml.JsonMLException {
			int lineno = nodeIndex;
			int charno = -1;
			report(com.google.javascript.jscomp.JSError.make(sourceName, lineno, charno, type, arguments));
		}

		private void report(com.google.javascript.jscomp.JSError error) throws com.google.javascript.jscomp.jsonml.JsonMLException {
			report(error, true);
		}

		private void report(com.google.javascript.jscomp.JSError error, boolean terminal) throws com.google.javascript.jscomp.jsonml.JsonMLException {
			compiler.report(error);
			if (terminal) {
				throw new com.google.javascript.jscomp.jsonml.JsonMLException();
			}
		}
	}

	private boolean insertExprResultState = true;

	public void setRootElement(com.google.javascript.jscomp.jsonml.JsonML rootElement) {
		com.google.javascript.jscomp.jsonml.Reader.this.rootElement = rootElement;
	}

	public com.google.javascript.rhino.Node parse(com.google.javascript.jscomp.AbstractCompiler compiler) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		if (compiler == null) {
			return null;
		}
		errorReporter = com.google.javascript.jscomp.jsonml.Reader.this.new ErrorReporter(compiler);
		com.google.javascript.rhino.Node root = com.google.javascript.rhino.IR.block();
		nodeIndex = -1;
		com.google.common.base.Preconditions.checkState(((rootElement.getType()) == (com.google.javascript.jscomp.jsonml.TagType.Program)));
		transformElement(rootElement, root);
		return root.removeFirstChild();
	}

	private <T> T getOptionalAttribute(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.jscomp.jsonml.TagAttr attr, java.lang.Class<T> type) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		return getAttribute(element, attr, type, true);
	}

	private <T> T getAttribute(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.jscomp.jsonml.TagAttr attr, java.lang.Class<T> type) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		return getAttribute(element, attr, type, false);
	}

	private <T> T getAttribute(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.jscomp.jsonml.TagAttr attr, java.lang.Class<T> type, boolean optional) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.Object value = element.getAttribute(attr);
		if (value == null) {
			if ((type == null) || optional) {
				return null;
			}
			throw new com.google.javascript.jscomp.jsonml.JsonMLException((((("Missing " + (attr.name())) + " attribute for ") + (element.getType().name())) + " element."));
		}
		if (type.equals(java.lang.Double.class)) {
			if (value instanceof java.lang.Number) {
				return type.cast(((java.lang.Number) (value)).doubleValue());
			}
			if (value instanceof java.lang.String) {
				return type.cast(java.lang.Double.valueOf(((java.lang.String) (value))));
			}
			throw new com.google.javascript.jscomp.jsonml.JsonMLException((((((("Wrong type of " + (attr.name())) + " attribute. ") + "Received: ") + (value.getClass())) + ". Expected: ") + (type.getName())));
		}
		if (type.isInstance(value)) {
			return type.cast(value);
		}
		throw new com.google.javascript.jscomp.jsonml.JsonMLException((((((("Wrong type of " + (attr.name())) + "attribute. ") + "Received: ") + (value.getClass())) + ". Expected: ") + (type.getName())));
	}

	private java.lang.Object getObjectAttribute(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.jscomp.jsonml.TagAttr attr) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		return getAttribute(element, attr, java.lang.Object.class);
	}

	private java.lang.String getStringAttribute(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.jscomp.jsonml.TagAttr attr) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		return getAttribute(element, attr, java.lang.String.class);
	}

	private void validate(com.google.javascript.jscomp.jsonml.JsonML element) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.String errorMessage = com.google.javascript.jscomp.jsonml.Validator.validate(element);
		if (errorMessage != null) {
			errorReporter.report(element, errorMessage);
		}
	}

	private void transformElement(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		(nodeIndex)++;
		validate(element);
		if ((insertExprResultState) && (com.google.javascript.jscomp.jsonml.JsonMLUtil.isExpression(element))) {
			transformExpr(element, parent);
			return ;
		}
		switch (element.getType()) {
			case ArrayExpr :
				transformArrayExpr(element, parent);
				break;
			case AssignExpr :
				transformAssignExpr(element, parent);
				break;
			case BinaryExpr :
				transformBinaryExpr(element, parent);
				break;
			case BlockStmt :
				transformBlock(element, parent);
				break;
			case BreakStmt :
				transformBreakStmt(element, parent);
				break;
			case CallExpr :
				transformCallExpr(element, parent);
				break;
			case Case :
				transformCase(element, parent);
				break;
			case CatchClause :
				transformCatchClause(element, parent);
				break;
			case ConditionalExpr :
				transformConditionalExpr(element, parent);
				break;
			case ContinueStmt :
				transformContinueStmt(element, parent);
				break;
			case CountExpr :
				transformCountExpr(element, parent);
				break;
			case DataProp :
				transformDataProp(element, parent);
				break;
			case GetterProp :
				transformGetterProp(element, parent);
				break;
			case SetterProp :
				transformSetterProp(element, parent);
				break;
			case DefaultCase :
				transformDefaultCase(element, parent);
				break;
			case DeleteExpr :
				transformDeleteExpr(element, parent);
				break;
			case DoWhileStmt :
				transformDoWhileStmt(element, parent);
				break;
			case Empty :
				transformEmpty(element, parent);
				break;
			case EmptyStmt :
				transformEmptyStmt(element, parent);
				break;
			case EvalExpr :
				transformEvalExpr(element, parent);
				break;
			case ForInStmt :
				transformForInStmt(element, parent);
				break;
			case ForStmt :
				transformForStmt(element, parent);
				break;
			case FunctionDecl :
				transformFunctionDecl(element, parent);
				break;
			case FunctionExpr :
				transformFunctionExpr(element, parent);
				break;
			case IdExpr :
				transformIdExpr(element, parent);
				break;
			case IdPatt :
				transformIdPatt(element, parent);
				break;
			case IfStmt :
				transformIfStmt(element, parent);
				break;
			case InitPatt :
				transformInitPatt(element, parent);
				break;
			case InvokeExpr :
				transformInvokeExpr(element, parent);
				break;
			case LabelledStmt :
				transformLabelledStmt(element, parent);
				break;
			case LiteralExpr :
				transformLiteralExpr(element, parent);
				break;
			case LogicalAndExpr :
				transformLogicalAndExpr(element, parent);
				break;
			case LogicalOrExpr :
				transformLogicalOrExpr(element, parent);
				break;
			case MemberExpr :
				transformMemberExpr(element, parent);
				break;
			case NewExpr :
				transformNewExpr(element, parent);
				break;
			case ObjectExpr :
				transformObjectExpr(element, parent);
				break;
			case ParamDecl :
				transformParamDecl(element, parent);
				break;
			case Program :
				transformProgram(element, parent);
				break;
			case PrologueDecl :
				transformPrologueDecl(element, parent);
				break;
			case RegExpExpr :
				transformRegExpExpr(element, parent);
				break;
			case ReturnStmt :
				transformReturnStmt(element, parent);
				break;
			case SwitchStmt :
				transformSwitchStmt(element, parent);
				break;
			case ThisExpr :
				transformThisExpr(element, parent);
				break;
			case ThrowStmt :
				transformThrowStmt(element, parent);
				break;
			case TryStmt :
				transformTryStmt(element, parent);
				break;
			case TypeofExpr :
				transformTypeofExpr(element, parent);
				break;
			case UnaryExpr :
				transformUnaryExpr(element, parent);
				break;
			case VarDecl :
				transformVarDecl(element, parent);
				break;
			case WhileStmt :
				transformWhileStmt(element, parent);
				break;
			case WithStmt :
				transformWithStmt(element, parent);
				break;
		}
	}

	private void transformAllChildren(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent, boolean newState) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformElements(element.getChildren(), parent, newState);
	}

	private void transformAllChildren(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformElements(element.getChildren(), parent);
	}

	private void transformAllChildrenFromIndex(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent, int fromIndex, boolean newState) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformElements(element.getChildren().subList(fromIndex, element.childrenSize()), parent, newState);
	}

	private void transformElements(java.util.List<com.google.javascript.jscomp.jsonml.JsonML> elements, com.google.javascript.rhino.Node parent, boolean newState) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		boolean oldState = insertExprResultState;
		insertExprResultState = newState;
		transformElements(elements, parent);
		insertExprResultState = oldState;
	}

	private void transformElements(java.util.List<com.google.javascript.jscomp.jsonml.JsonML> elements, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		for (com.google.javascript.jscomp.jsonml.JsonML element : elements) {
			transformElement(element, parent);
		}
	}

	private boolean transformExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		boolean result = false;
		if (insertExprResultState) {
			com.google.javascript.rhino.Node node = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT);
			parent.addChildToBack(node);
			insertExprResultState = false;
			(nodeIndex)--;
			transformElement(element, node);
			insertExprResultState = true;
			result = true;
		}
		return result;
	}

	private void transformForLoop(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent, int childno) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkState(((insertExprResultState) == true));
		insertExprResultState = false;
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.FOR, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child;
		for (int i = 0; i < childno; ++i) {
			child = element.getChild(i);
			if (((child.getType()) == (com.google.javascript.jscomp.jsonml.TagType.EmptyStmt)) || ((child.getType()) == (com.google.javascript.jscomp.jsonml.TagType.Empty))) {
				(nodeIndex)++;
				node.addChildToBack(com.google.javascript.rhino.IR.empty());
			}else {
				transformElement(child, node);
			}
		}
		transformPotentiallyUnwrappedBlock(element.getChild(childno), node);
		insertExprResultState = true;
	}

	private void transformJumpStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent, int type) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(type, element);
		parent.addChildToBack(node);
		java.lang.String label = getOptionalAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.LABEL, java.lang.String.class);
		if (label != null) {
			node.addChildToBack(com.google.javascript.rhino.IR.labelName(label));
		}
	}

	private void transformLogicalExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent, int type) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformTwoArgumentExpr(element, parent, type);
	}

	private void transformTwoArgumentExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent, int type) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(type, element);
		parent.addChildToBack(node);
		transformAllChildren(element, node);
	}

	private void transformPotentiallyUnwrappedBlock(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		if (((element.getType()) == (com.google.javascript.jscomp.jsonml.TagType.EmptyStmt)) || ((element.getType()) == (com.google.javascript.jscomp.jsonml.TagType.Empty))) {
			(nodeIndex)++;
			com.google.javascript.rhino.Node block = com.google.javascript.rhino.IR.block();
			parent.addChildToBack(block);
			block.putBooleanProp(com.google.javascript.rhino.Node.EMPTY_BLOCK, true);
		}else
			if ((element.getType()) != (com.google.javascript.jscomp.jsonml.TagType.BlockStmt)) {
				com.google.javascript.rhino.Node block = com.google.javascript.rhino.IR.block();
				parent.addChildToBack(block);
				boolean state = insertExprResultState;
				insertExprResultState = true;
				transformElement(element, block);
				insertExprResultState = state;
			}else {
				(nodeIndex)++;
				transformBlock(element, parent);
			}
		
	}

	private void transformArrayExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.ARRAYLIT, element);
		parent.addChildToBack(node);
		for (com.google.javascript.jscomp.jsonml.JsonML child : element.getChildren()) {
			transformElement(child, node);
		}
	}

	private void transformAssignExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.String op = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
		int type = com.google.javascript.jscomp.jsonml.Reader.Operator.getNodeTypeForAssignOp(op);
		transformTwoArgumentExpr(element, parent, type);
	}

	private void transformBinaryExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.String op = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
		int type = com.google.javascript.jscomp.jsonml.Reader.Operator.getNodeTypeForBinaryOp(op);
		transformTwoArgumentExpr(element, parent, type);
	}

	private void transformBlock(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformBlock(element, parent, 0, element.childrenSize());
	}

	private void transformBlock(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent, int start) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformBlock(element, parent, start, element.childrenSize());
	}

	private void transformBlock(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent, int start, int end) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.BLOCK, element);
		parent.addChildToBack(node);
		transformElements(element.getChildren(start, end), node, true);
	}

	private void transformBreakStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformJumpStmt(element, parent, com.google.javascript.rhino.Token.BREAK);
	}

	private void transformCallExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.CALL, element);
		parent.addChildToBack(node);
		transformAllChildren(element, node);
		com.google.javascript.rhino.Node first = node.getFirstChild();
		if (((first.getType()) != (com.google.javascript.rhino.Token.GETPROP)) && ((first.getType()) != (com.google.javascript.rhino.Token.GETELEM))) {
			node.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
		}
	}

	private void transformCase(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.CASE, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		transformElement(child, node);
		com.google.javascript.rhino.Node block = com.google.javascript.rhino.IR.block();
		block.setIsSyntheticBlock(true);
		node.addChildToBack(block);
		transformAllChildrenFromIndex(element, block, 1, true);
	}

	private void transformCatchClause(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.CATCH, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		transformElement(child, node);
		child = element.getChild(1);
		transformElement(child, node);
	}

	private void transformConditionalExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.HOOK, element);
		parent.addChildToBack(node);
		transformAllChildren(element, node);
	}

	private void transformContinueStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformJumpStmt(element, parent, com.google.javascript.rhino.Token.CONTINUE);
	}

	private void transformCountExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.String op = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
		int type = com.google.javascript.jscomp.jsonml.Reader.Operator.getNodeTypeForCountOp(op);
		java.lang.Boolean isPrefix = getAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.IS_PREFIX, java.lang.Boolean.class);
		com.google.javascript.rhino.Node node = createNode(type, element);
		node.putIntProp(com.google.javascript.rhino.Node.INCRDECR_PROP, (isPrefix ? 0 : 1));
		parent.addChildToBack(node);
		transformElement(element.getChild(0), node);
	}

	private void transformDataProp(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.Object name = getObjectAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.NAME);
		com.google.javascript.rhino.Node node = null;
		if (name instanceof java.lang.Number) {
			node = com.google.javascript.rhino.IR.number(((java.lang.Number) (name)).doubleValue());
		}else
			if (name instanceof java.lang.String) {
				node = com.google.javascript.rhino.IR.string(((java.lang.String) (name)));
			}else {
				throw new java.lang.IllegalStateException("The name of the property has invalid type.");
			}
		
		setPosition(node);
		parent.addChildToBack(node);
		transformElement(element.getChild(0), node);
	}

	private void transformGetterProp(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformProp(com.google.javascript.rhino.Token.GETTER_DEF, element, parent);
	}

	private void transformSetterProp(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformProp(com.google.javascript.rhino.Token.SETTER_DEF, element, parent);
	}

	private void transformProp(int tokenType, com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.Object name = getObjectAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.NAME);
		com.google.javascript.rhino.Node node = null;
		if (name instanceof java.lang.Number) {
			throw new java.lang.IllegalStateException("Not yet supported.");
		}else
			if (name instanceof java.lang.String) {
				node = com.google.javascript.rhino.Node.newString(tokenType, ((java.lang.String) (name)));
			}else {
				throw new java.lang.IllegalStateException("The name of the property has invalid type.");
			}
		
		setPosition(node);
		parent.addChildToBack(node);
		transformElement(element.getChild(0), node);
	}

	private void transformDefaultCase(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.DEFAULT_CASE, element);
		parent.addChildToBack(node);
		com.google.javascript.rhino.Node block = com.google.javascript.rhino.IR.block();
		block.setIsSyntheticBlock(true);
		node.addChildToBack(block);
		transformAllChildren(element, block, true);
	}

	private void transformDeleteExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.DELPROP, element);
		parent.addChildToBack(node);
		transformElement(element.getChild(0), node);
	}

	private void transformDoWhileStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkState(((insertExprResultState) == true));
		insertExprResultState = false;
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.DO, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		transformPotentiallyUnwrappedBlock(child, node);
		child = element.getChild(1);
		transformElement(child, node);
		insertExprResultState = true;
	}

	private void transformEmpty(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) {
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.ARRAYLIT :
				parent.addChildToBack(com.google.javascript.rhino.IR.empty());
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				parent.addChildToBack(com.google.javascript.rhino.IR.name(""));
				break;
			default :
				throw new java.lang.IllegalArgumentException("Unexpected Empty element.");
		}
	}

	private void transformEmptyStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) {
		com.google.common.base.Preconditions.checkState((((parent.getType()) == (com.google.javascript.rhino.Token.BLOCK)) || ((parent.getType()) == (com.google.javascript.rhino.Token.SCRIPT))));
		parent.addChildToBack(com.google.javascript.rhino.IR.empty());
	}

	private void transformEvalExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.CALL, element);
		node.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
		parent.addChildToBack(node);
		com.google.javascript.rhino.Node child = com.google.javascript.rhino.IR.name("eval");
		child.putBooleanProp(com.google.javascript.rhino.Node.DIRECT_EVAL, true);
		node.addChildToBack(child);
		transformAllChildren(element, node);
	}

	private void transformForInStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformForLoop(element, parent, 2);
	}

	private void transformForStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformForLoop(element, parent, 3);
	}

	private void transformFunction(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent, boolean needsName) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.FUNCTION, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		java.lang.String name = "";
		transformElement(element.getChild(0), node);
		transformElement(element.getChild(1), node);
		transformBlock(element, node, 2);
	}

	private void transformFunctionDecl(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformFunction(element, parent, true);
	}

	private void transformFunctionExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformFunction(element, parent, false);
	}

	private void transformIdExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.String name = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.NAME);
		com.google.javascript.rhino.Node node = com.google.javascript.rhino.IR.name(name);
		setPosition(node);
		parent.addChildToBack(node);
	}

	private void transformInitPatt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		(nodeIndex)++;
		com.google.javascript.rhino.Node node = com.google.javascript.rhino.IR.name(getAttribute(child, com.google.javascript.jscomp.jsonml.TagAttr.NAME, java.lang.String.class));
		setPosition(node);
		parent.addChildToBack(node);
		child = element.getChild(1);
		transformElement(child, node);
	}

	private void transformIdPatt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = com.google.javascript.rhino.IR.name(getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.NAME));
		setPosition(node);
		parent.addChildToBack(node);
	}

	private void transformIfStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkState(((insertExprResultState) == true));
		insertExprResultState = false;
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.IF, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		transformElement(child, node);
		child = element.getChild(1);
		transformPotentiallyUnwrappedBlock(child, node);
		child = element.getChild(2);
		if (((child.getType()) != (com.google.javascript.jscomp.jsonml.TagType.EmptyStmt)) && ((child.getType()) != (com.google.javascript.jscomp.jsonml.TagType.Empty))) {
			transformPotentiallyUnwrappedBlock(child, node);
		}else {
			(nodeIndex)++;
		}
		insertExprResultState = true;
	}

	private void transformInvokeExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.CALL, element);
		parent.addChildToBack(node);
		transformMemberExpr(element, node);
		transformElements(element.getChildren(2, element.childrenSize()), node);
	}

	private void transformLabelledStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.String label = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.LABEL);
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.LABEL, element);
		node.addChildToBack(com.google.javascript.rhino.IR.labelName(label));
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		if ((child.getType()) == (com.google.javascript.jscomp.jsonml.TagType.EmptyStmt)) {
			(nodeIndex)++;
			node.addChildToBack(com.google.javascript.rhino.IR.empty());
		}else {
			transformElement(element.getChild(0), node);
		}
	}

	private void transformLiteralExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = null;
		com.google.javascript.jscomp.jsonml.Reader.Type type = com.google.javascript.jscomp.jsonml.Reader.Type.get(getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.TYPE));
		switch (type) {
			case BOOLEAN :
				{
					java.lang.Boolean value = getAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.VALUE, java.lang.Boolean.class);
					if (value) {
						node = com.google.javascript.rhino.IR.trueNode();
					}else {
						node = com.google.javascript.rhino.IR.falseNode();
					}
					break;
				}
			case NULL :
				{
					getAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.VALUE, null);
					node = com.google.javascript.rhino.IR.nullNode();
					break;
				}
			case NUMBER :
				{
					java.lang.Double value = getAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.VALUE, java.lang.Double.class);
					node = com.google.javascript.rhino.IR.number(value);
					break;
				}
			case STRING :
				{
					java.lang.String value = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.VALUE);
					node = com.google.javascript.rhino.IR.string(value);
					break;
				}
			default :
				throw new com.google.javascript.jscomp.jsonml.JsonMLException("Unrecognized type attribute.");
		}
		setPosition(node);
		parent.addChildToBack(node);
	}

	private void transformLogicalAndExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformLogicalExpr(element, parent, com.google.javascript.rhino.Token.AND);
	}

	private void transformLogicalOrExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		transformLogicalExpr(element, parent, com.google.javascript.rhino.Token.OR);
	}

	private void transformMemberExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.String op = getAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.OP, java.lang.String.class);
		int type;
		if (op.equals(".")) {
			type = com.google.javascript.rhino.Token.GETPROP;
		}else
			if (op.equals("[]")) {
				type = com.google.javascript.rhino.Token.GETELEM;
			}else {
				throw new com.google.javascript.jscomp.jsonml.JsonMLException(("Invalid OP argument: " + op));
			}
		
		com.google.javascript.rhino.Node node = createNode(type, element);
		parent.addChildToBack(node);
		transformElement(element.getChild(0), node);
		transformElement(element.getChild(1), node);
	}

	private void transformNewExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.NEW, element);
		parent.addChildToBack(node);
		transformAllChildren(element, node);
	}

	private void transformObjectExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.OBJECTLIT, element);
		parent.addChildToBack(node);
		transformAllChildren(element, node);
	}

	private void transformParamDecl(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.PARAM_LIST, element);
		parent.addChildToBack(node);
		transformAllChildren(element, node);
	}

	private void transformProgram(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkNotNull(parent);
		insertExprResultState = true;
		com.google.javascript.rhino.Node script = com.google.javascript.rhino.IR.script();
		script.setIsSyntheticBlock(true);
		parent.addChildToBack(script);
		for (com.google.javascript.jscomp.jsonml.JsonML child : element.getChildren()) {
			transformElement(child, script);
		}
	}

	private void transformPrologueDecl(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.String directive = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.DIRECTIVE);
		if (ALLOWED_DIRECTIVES.contains(directive)) {
			java.util.Set<java.lang.String> directives = parent.getDirectives();
			if (directives == null) {
				directives = com.google.common.collect.Sets.newHashSet();
			}
			directives.add(directive);
			parent.setDirectives(directives);
		}else {
			com.google.javascript.rhino.Node node = com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.string(directive));
			parent.addChildToBack(node);
		}
	}

	private void transformRegExpExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.REGEXP, element);
		parent.addChildToBack(node);
		java.lang.String body = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.BODY);
		node.addChildToBack(com.google.javascript.rhino.IR.string(body));
		java.lang.String flags = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.FLAGS);
		if (!(flags.equals(""))) {
			node.addChildToBack(com.google.javascript.rhino.IR.string(flags));
		}
	}

	private void transformReturnStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkState(((insertExprResultState) == true));
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.RETURN, element);
		parent.addChildToBack(node);
		if (element.hasChildren()) {
			insertExprResultState = false;
			transformElement(element.getChild(0), node);
			insertExprResultState = true;
		}
	}

	private void transformSwitchStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkState(((insertExprResultState) == true));
		insertExprResultState = false;
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.SWITCH, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		transformElement(child, node);
		for (int i = 1; i < (element.childrenSize()); ++i) {
			child = element.getChild(i);
			transformElement(child, node);
		}
		insertExprResultState = true;
	}

	private void transformThisExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		parent.addChildToBack(createNode(com.google.javascript.rhino.Token.THIS, element));
	}

	private void transformThrowStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkState(((insertExprResultState) == true));
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.THROW, element);
		parent.addChildToBack(node);
		insertExprResultState = false;
		transformElement(element.getChild(0), node);
		insertExprResultState = true;
	}

	private void transformTryStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkState(((insertExprResultState) == true));
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.TRY, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		transformElement(child, node);
		com.google.javascript.rhino.Node block = com.google.javascript.rhino.IR.block();
		node.addChildToBack(block);
		child = element.getChild(1);
		if ((child.getType()) == (com.google.javascript.jscomp.jsonml.TagType.CatchClause)) {
			transformElement(child, block);
		}else {
			(nodeIndex)++;
		}
		if ((element.childrenSize()) == 3) {
			child = element.getChild(2);
			transformElement(child, node);
		}
	}

	private void transformTypeofExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.TYPEOF, element);
		parent.addChildToBack(node);
		transformElement(element.getChild(0), node);
	}

	private void transformUnaryExpr(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		java.lang.String op = getStringAttribute(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
		int type = com.google.javascript.jscomp.jsonml.Reader.Operator.getNodeTypeForUnaryOp(op);
		com.google.javascript.rhino.Node node = createNode(type, element);
		parent.addChildToBack(node);
		transformAllChildren(element, node);
	}

	private void transformVarDecl(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.VAR, element);
		parent.addChildToBack(node);
		transformAllChildren(element, node, false);
	}

	private void transformWhileStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkState(((insertExprResultState) == true));
		insertExprResultState = false;
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.WHILE, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		transformElement(child, node);
		child = element.getChild(1);
		transformPotentiallyUnwrappedBlock(child, node);
		insertExprResultState = true;
	}

	private void transformWithStmt(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.rhino.Node parent) throws com.google.javascript.jscomp.jsonml.JsonMLException {
		com.google.common.base.Preconditions.checkState(((insertExprResultState) == true));
		insertExprResultState = false;
		com.google.javascript.rhino.Node node = createNode(com.google.javascript.rhino.Token.WITH, element);
		parent.addChildToBack(node);
		com.google.javascript.jscomp.jsonml.JsonML child = element.getChild(0);
		transformElement(child, node);
		child = element.getChild(1);
		transformPotentiallyUnwrappedBlock(child, node);
		insertExprResultState = true;
	}

	private com.google.javascript.rhino.Node createNode(int type, com.google.javascript.jscomp.jsonml.JsonML element) {
		return new com.google.javascript.rhino.Node(type, nodeIndex, (-1));
	}

	private void setPosition(com.google.javascript.rhino.Node node) {
		node.setLineno(nodeIndex);
	}

	private enum Operator {
ASSIGN("="), ASSIGN_BITOR("|="), ASSIGN_BITXOR("^="), ASSIGN_BITAND("&="), ASSIGN_LSH("<<="), ASSIGN_RSH(">>="), ASSIGN_URSH(">>>="), ASSIGN_ADD("+="), ASSIGN_SUB("-="), ASSIGN_MUL("*="), ASSIGN_DIV("/="), ASSIGN_MOD("%="), BITOR("|"), BITXOR("^"), BITAND("&"), EQ("=="), NE("!="), LT("<"), LE("<="), GT(">"), GE(">="), LSH("<<"), RSH(">>"), URSH(">>>"), ADD("+"), SUB("-"), MUL("*"), DIV("/"), MOD("%"), SHEQ("==="), SHNE("!=="), COMMA(","), INSTANCEOF("instanceof"), IN("in"), DEC("--"), INC("++"), NOT("!"), BITNOT("~"), POS("+_unary"), NEG("-_unary"), VOID("void");
		private final java.lang.String name;

		private static java.util.Map<java.lang.String, com.google.javascript.jscomp.jsonml.Reader.Operator> lookup = com.google.common.collect.Maps.newHashMap();

		static {
			for (com.google.javascript.jscomp.jsonml.Reader.Operator op : com.google.javascript.jscomp.jsonml.Reader.Operator.values()) {
				com.google.javascript.jscomp.jsonml.Reader.Operator.lookup.put(op.getName(), op);
			}
		}

		private java.lang.String getName() {
			return com.google.javascript.jscomp.jsonml.Reader.Operator.this.name;
		}

		private Operator(java.lang.String name) {
			this.name = name;
		}

		private static com.google.javascript.jscomp.jsonml.Reader.Operator get(java.lang.String name) {
			return com.google.javascript.jscomp.jsonml.Reader.Operator.lookup.get(name);
		}

		private static int getNodeTypeForAssignOp(java.lang.String name) {
			com.google.javascript.jscomp.jsonml.Reader.Operator op = com.google.javascript.jscomp.jsonml.Reader.Operator.get(name);
			if (op == null) {
				return com.google.javascript.rhino.Token.ERROR;
			}
			int type;
			switch (op) {
				case ASSIGN :
					type = com.google.javascript.rhino.Token.ASSIGN;
					break;
				case ASSIGN_BITOR :
					type = com.google.javascript.rhino.Token.ASSIGN_BITOR;
					break;
				case ASSIGN_BITXOR :
					type = com.google.javascript.rhino.Token.ASSIGN_BITXOR;
					break;
				case ASSIGN_BITAND :
					type = com.google.javascript.rhino.Token.ASSIGN_BITAND;
					break;
				case ASSIGN_LSH :
					type = com.google.javascript.rhino.Token.ASSIGN_LSH;
					break;
				case ASSIGN_RSH :
					type = com.google.javascript.rhino.Token.ASSIGN_RSH;
					break;
				case ASSIGN_URSH :
					type = com.google.javascript.rhino.Token.ASSIGN_URSH;
					break;
				case ASSIGN_ADD :
					type = com.google.javascript.rhino.Token.ASSIGN_ADD;
					break;
				case ASSIGN_SUB :
					type = com.google.javascript.rhino.Token.ASSIGN_SUB;
					break;
				case ASSIGN_MUL :
					type = com.google.javascript.rhino.Token.ASSIGN_MUL;
					break;
				case ASSIGN_DIV :
					type = com.google.javascript.rhino.Token.ASSIGN_DIV;
					break;
				case ASSIGN_MOD :
					type = com.google.javascript.rhino.Token.ASSIGN_MOD;
					break;
				default :
					throw new java.lang.IllegalArgumentException(("" + "Invalid type of assign expression."));
			}
			return type;
		}

		private static int getNodeTypeForBinaryOp(java.lang.String name) {
			com.google.javascript.jscomp.jsonml.Reader.Operator op = com.google.javascript.jscomp.jsonml.Reader.Operator.get(name);
			int type;
			switch (op) {
				case BITOR :
					type = com.google.javascript.rhino.Token.BITOR;
					break;
				case BITXOR :
					type = com.google.javascript.rhino.Token.BITXOR;
					break;
				case BITAND :
					type = com.google.javascript.rhino.Token.BITAND;
					break;
				case EQ :
					type = com.google.javascript.rhino.Token.EQ;
					break;
				case NE :
					type = com.google.javascript.rhino.Token.NE;
					break;
				case LT :
					type = com.google.javascript.rhino.Token.LT;
					break;
				case LE :
					type = com.google.javascript.rhino.Token.LE;
					break;
				case GT :
					type = com.google.javascript.rhino.Token.GT;
					break;
				case GE :
					type = com.google.javascript.rhino.Token.GE;
					break;
				case LSH :
					type = com.google.javascript.rhino.Token.LSH;
					break;
				case RSH :
					type = com.google.javascript.rhino.Token.RSH;
					break;
				case URSH :
					type = com.google.javascript.rhino.Token.URSH;
					break;
				case ADD :
					type = com.google.javascript.rhino.Token.ADD;
					break;
				case SUB :
					type = com.google.javascript.rhino.Token.SUB;
					break;
				case MUL :
					type = com.google.javascript.rhino.Token.MUL;
					break;
				case DIV :
					type = com.google.javascript.rhino.Token.DIV;
					break;
				case MOD :
					type = com.google.javascript.rhino.Token.MOD;
					break;
				case SHEQ :
					type = com.google.javascript.rhino.Token.SHEQ;
					break;
				case SHNE :
					type = com.google.javascript.rhino.Token.SHNE;
					break;
				case COMMA :
					type = com.google.javascript.rhino.Token.COMMA;
					break;
				case INSTANCEOF :
					type = com.google.javascript.rhino.Token.INSTANCEOF;
					break;
				case IN :
					type = com.google.javascript.rhino.Token.IN;
					break;
				default :
					throw new java.lang.IllegalArgumentException(("" + "Invalid type of binary expression."));
			}
			return type;
		}

		private static int getNodeTypeForCountOp(java.lang.String name) {
			com.google.javascript.jscomp.jsonml.Reader.Operator op = com.google.javascript.jscomp.jsonml.Reader.Operator.get(name);
			if (op == null) {
				return com.google.javascript.rhino.Token.ERROR;
			}
			int type;
			switch (op) {
				case DEC :
					type = com.google.javascript.rhino.Token.DEC;
					break;
				case INC :
					type = com.google.javascript.rhino.Token.INC;
					break;
				default :
					throw new java.lang.IllegalArgumentException(("" + "Invalid type of count expression."));
			}
			return type;
		}

		private static int getNodeTypeForUnaryOp(java.lang.String name) {
			java.lang.String realName = new java.lang.String(name);
			if ((name.equals("+")) || (name.equals("-"))) {
				realName += "_unary";
			}
			com.google.javascript.jscomp.jsonml.Reader.Operator op = com.google.javascript.jscomp.jsonml.Reader.Operator.get(realName);
			int type;
			switch (op) {
				case NOT :
					type = com.google.javascript.rhino.Token.NOT;
					break;
				case BITNOT :
					type = com.google.javascript.rhino.Token.BITNOT;
					break;
				case POS :
					type = com.google.javascript.rhino.Token.POS;
					break;
				case NEG :
					type = com.google.javascript.rhino.Token.NEG;
					break;
				case VOID :
					type = com.google.javascript.rhino.Token.VOID;
					break;
				default :
					throw new java.lang.IllegalArgumentException(("" + "Invalid type of unary expression."));
			}
			return type;
		}
	}

	private enum Type {
BOOLEAN("boolean"), NULL("null"), NUMBER("number"), STRING("string");
		private final java.lang.String name;

		private static java.util.Map<java.lang.String, com.google.javascript.jscomp.jsonml.Reader.Type> lookup = new java.util.HashMap<java.lang.String, com.google.javascript.jscomp.jsonml.Reader.Type>();

		static {
			for (com.google.javascript.jscomp.jsonml.Reader.Type type : com.google.javascript.jscomp.jsonml.Reader.Type.values()) {
				com.google.javascript.jscomp.jsonml.Reader.Type.lookup.put(type.getName(), type);
			}
		}

		private java.lang.String getName() {
			return com.google.javascript.jscomp.jsonml.Reader.Type.this.name;
		}

		private Type(java.lang.String name) {
			this.name = name;
		}

		private static com.google.javascript.jscomp.jsonml.Reader.Type get(java.lang.String name) {
			return com.google.javascript.jscomp.jsonml.Reader.Type.lookup.get(name);
		}
	}
}

