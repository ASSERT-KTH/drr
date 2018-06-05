

package com.google.javascript.jscomp.jsonml;


public class Validator {
	public static final java.lang.String MISSING_ARGUMENT = "" + "No %s attribute specified for %s.";

	public static final java.lang.String NOT_ENOUGH_CHILDREN_FMT = "" + "Not enough children for %s. Expected: %d. Found: %d.";

	public static final java.lang.String TOO_MANY_CHILDREN_FMT = "" + "Too many children for %s. Expected: %d. Found: %d.";

	public static final java.lang.String WRONG_CHILD_TYPE_FMT = "" + "Wrong type of child number %d for %s. Expected: %s. Found: %s.";

	public static com.google.javascript.jscomp.jsonml.TagType[] exprTypes = new com.google.javascript.jscomp.jsonml.TagType[]{ com.google.javascript.jscomp.jsonml.TagType.ArrayExpr , com.google.javascript.jscomp.jsonml.TagType.AssignExpr , com.google.javascript.jscomp.jsonml.TagType.BinaryExpr , com.google.javascript.jscomp.jsonml.TagType.CallExpr , com.google.javascript.jscomp.jsonml.TagType.ConditionalExpr , com.google.javascript.jscomp.jsonml.TagType.CountExpr , com.google.javascript.jscomp.jsonml.TagType.DeleteExpr , com.google.javascript.jscomp.jsonml.TagType.EvalExpr , com.google.javascript.jscomp.jsonml.TagType.IdExpr , com.google.javascript.jscomp.jsonml.TagType.InvokeExpr , com.google.javascript.jscomp.jsonml.TagType.LiteralExpr , com.google.javascript.jscomp.jsonml.TagType.LogicalAndExpr , com.google.javascript.jscomp.jsonml.TagType.LogicalOrExpr , com.google.javascript.jscomp.jsonml.TagType.MemberExpr , com.google.javascript.jscomp.jsonml.TagType.NewExpr , com.google.javascript.jscomp.jsonml.TagType.ObjectExpr , com.google.javascript.jscomp.jsonml.TagType.RegExpExpr , com.google.javascript.jscomp.jsonml.TagType.ThisExpr , com.google.javascript.jscomp.jsonml.TagType.TypeofExpr , com.google.javascript.jscomp.jsonml.TagType.UnaryExpr , com.google.javascript.jscomp.jsonml.TagType.FunctionExpr };

	private final java.lang.StringBuilder b;

	private boolean error;

	private Validator() {
		b = new java.lang.StringBuilder();
		error = false;
	}

	public static java.lang.String validate(com.google.javascript.jscomp.jsonml.JsonML element) {
		return new com.google.javascript.jscomp.jsonml.Validator().doValidate(element);
	}

	private java.lang.String doValidate(com.google.javascript.jscomp.jsonml.JsonML element) {
		java.lang.String message;
		switch (element.getType()) {
			case AssignExpr :
				validateAssignExpr(element);
				break;
			case BinaryExpr :
				validateBinaryExpr(element);
				break;
			case BreakStmt :
			case ContinueStmt :
				validateJmpStmt(element);
				break;
			case Case :
				validateCase(element);
				break;
			case CatchClause :
				validateCatchClause(element);
				break;
			case ConditionalExpr :
				validateConditionalExpr(element);
				break;
			case CountExpr :
				validateCountExpr(element);
				break;
			case DataProp :
				validateProp(element);
				break;
			case GetterProp :
				validateProp(element);
				break;
			case SetterProp :
				validateProp(element);
				break;
			case DeleteExpr :
				validateDeleteExpr(element);
				break;
			case DoWhileStmt :
				validateDoWhileStmt(element);
				break;
			case EmptyStmt :
				validateEmptyStmt(element);
				break;
			case ForInStmt :
				validateForInStmt(element);
				break;
			case ForStmt :
				validateForStmt(element);
				break;
			case FunctionDecl :
				validateFunctionDecl(element);
				break;
			case FunctionExpr :
				validateFunctionExpr(element);
				break;
			case IdExpr :
				validateIdExpr(element);
				break;
			case IdPatt :
				validateIdPatt(element);
				break;
			case IfStmt :
				validateIfStmt(element);
				break;
			case InvokeExpr :
				validateInvokeExpr(element);
				break;
			case LabelledStmt :
				validateLabelledStmt(element);
				break;
			case LiteralExpr :
				validateLiteralExpr(element);
				break;
			case LogicalAndExpr :
			case LogicalOrExpr :
				validateLogicalExpr(element);
				break;
			case MemberExpr :
				validateMemberExpr(element);
				break;
			case NewExpr :
				validateNewExpr(element);
				break;
			case ObjectExpr :
				validateObjectExpr(element);
				break;
			case ParamDecl :
				validateParamDecl(element);
				break;
			case RegExpExpr :
				validateRegExpExpr(element);
				break;
			case ReturnStmt :
				validateReturnStmt(element);
				break;
			case SwitchStmt :
				validateSwitchStmt(element);
				break;
			case ThisExpr :
				validateThisExpr(element);
				break;
			case ThrowStmt :
				validateThrowStmt(element);
				break;
			case TryStmt :
				validateTryStmt(element);
				break;
			case TypeofExpr :
				validateTypeofExpr(element);
				break;
			case UnaryExpr :
				validateUnaryExpr(element);
				break;
			case VarDecl :
				validateVarDecl(element);
				break;
			case WhileStmt :
				validateWhileStmt(element);
				break;
			case WithStmt :
				validateWithStmt(element);
				break;
		}
		return (b.length()) != 0 ? b.toString() : null;
	}

	private void validateAssignExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 2);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
	}

	private void validateBinaryExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 2);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
	}

	private void validateCase(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateMinChildrenSize(element, 1);
		if (!(error)) {
			validateIsChildExpression(element, 0);
		}
	}

	private void validateCatchClause(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 2);
		if (!(error)) {
			validateChildType(element, com.google.javascript.jscomp.jsonml.TagType.IdPatt, 0);
			validateChildType(element, com.google.javascript.jscomp.jsonml.TagType.BlockStmt, 1);
		}
	}

	private void validateConditionalExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 3);
	}

	private void validateCountExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 1);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.IS_PREFIX);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
	}

	private void validateProp(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 1);
		if (!(error)) {
			validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.NAME);
		}
	}

	private void validateDeleteExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 1);
	}

	private void validateDoWhileStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 2);
	}

	private void validateEmptyStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 0);
	}

	private void validateForInStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 3);
	}

	private void validateForStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 4);
	}

	private void validateFunctionDecl(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateFunction(element, true);
	}

	private void validateFunctionExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateFunction(element, false);
	}

	private void validateIdExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 0);
		if (!(error)) {
			validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.NAME);
		}
	}

	private void validateIdPatt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 0);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.NAME);
	}

	private void validateIfStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 3);
		if (!(error)) {
		}
	}

	private void validateInvokeExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateMinChildrenSize(element, 2);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
	}

	private void validateJmpStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 0);
	}

	private void validateLabelledStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 1);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.LABEL);
	}

	private void validateLiteralExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 0);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.TYPE);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.VALUE);
	}

	private void validateLogicalExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 2);
	}

	private void validateMemberExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 2);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
	}

	private void validateNewExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateMinChildrenSize(element, 1);
	}

	private void validateObjectExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		com.google.javascript.jscomp.jsonml.TagType[] expected = new com.google.javascript.jscomp.jsonml.TagType[]{ com.google.javascript.jscomp.jsonml.TagType.DataProp , com.google.javascript.jscomp.jsonml.TagType.GetterProp , com.google.javascript.jscomp.jsonml.TagType.SetterProp };
		for (int i = 0; i < (element.childrenSize()); ++i) {
			validateChildType(element, expected, i);
		}
	}

	private void validateParamDecl(com.google.javascript.jscomp.jsonml.JsonML element) {
		for (int i = 0; i < (element.childrenSize()); ++i) {
			validateChildType(element, com.google.javascript.jscomp.jsonml.TagType.IdPatt, i);
		}
	}

	private void validateRegExpExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 0);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.BODY);
		validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.FLAGS);
	}

	private void validateReturnStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateMaxChildrenSize(element, 1);
	}

	private void validateSwitchStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateMinChildrenSize(element, 1);
		boolean defaultStmt = false;
		for (int i = 1; i < (element.childrenSize()); ++i) {
			if (!defaultStmt) {
				validateChildType(element, new com.google.javascript.jscomp.jsonml.TagType[]{ com.google.javascript.jscomp.jsonml.TagType.Case , com.google.javascript.jscomp.jsonml.TagType.DefaultCase }, i);
			}else {
				validateChildType(element, com.google.javascript.jscomp.jsonml.TagType.Case, i);
			}
			if (error) {
				break;
			}
			if ((element.getChild(i).getType()) == (com.google.javascript.jscomp.jsonml.TagType.DefaultCase)) {
				defaultStmt = true;
			}
		}
	}

	private void validateThisExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 0);
	}

	private void validateThrowStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 1);
	}

	private void validateTryStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 2, 3);
		if (error) {
			return ;
		}
		validateChildType(element, com.google.javascript.jscomp.jsonml.TagType.BlockStmt, 0);
		com.google.javascript.jscomp.jsonml.TagType[] types = new com.google.javascript.jscomp.jsonml.TagType[]{ com.google.javascript.jscomp.jsonml.TagType.CatchClause , com.google.javascript.jscomp.jsonml.TagType.Empty };
		validateChildType(element, types, 1);
		if ((element.childrenSize()) > 2) {
			validateChildType(element, com.google.javascript.jscomp.jsonml.TagType.BlockStmt, 2);
		}
	}

	private void validateFunction(com.google.javascript.jscomp.jsonml.JsonML element, boolean needsName) {
		validateMinChildrenSize(element, 2);
		if (error) {
			return ;
		}
		if (needsName) {
			validateChildType(element, new com.google.javascript.jscomp.jsonml.TagType[]{ com.google.javascript.jscomp.jsonml.TagType.IdPatt }, 0);
		}else {
			validateChildType(element, new com.google.javascript.jscomp.jsonml.TagType[]{ com.google.javascript.jscomp.jsonml.TagType.IdPatt , com.google.javascript.jscomp.jsonml.TagType.Empty }, 0);
		}
		validateChildType(element, com.google.javascript.jscomp.jsonml.TagType.ParamDecl, 1);
	}

	private void validateTypeofExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 1);
	}

	private void validateUnaryExpr(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 1);
		if (!(error)) {
			validateArgument(element, com.google.javascript.jscomp.jsonml.TagAttr.OP);
		}
	}

	private void validateVarDecl(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateMinChildrenSize(element, 1);
		com.google.javascript.jscomp.jsonml.TagType[] types = new com.google.javascript.jscomp.jsonml.TagType[]{ com.google.javascript.jscomp.jsonml.TagType.InitPatt , com.google.javascript.jscomp.jsonml.TagType.IdPatt };
		for (int i = 0; i < (element.childrenSize()); ++i) {
			validateChildType(element, types, i);
		}
	}

	private void validateWhileStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 2);
	}

	private void validateWithStmt(com.google.javascript.jscomp.jsonml.JsonML element) {
		validateChildrenSize(element, 2);
	}

	private void validateArgument(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.jscomp.jsonml.TagAttr attr) {
		java.lang.Object value = element.getAttribute(attr);
		if (value == null) {
			java.lang.String type;
			if (((type = ((java.lang.String) (element.getAttribute(com.google.javascript.jscomp.jsonml.TagAttr.TYPE)))) != null) && (type.equals("null"))) {
				return ;
			}
			error = true;
			appendLine(java.lang.String.format(com.google.javascript.jscomp.jsonml.Validator.MISSING_ARGUMENT, attr, element.getType()));
		}
	}

	private void validateChildrenSize(com.google.javascript.jscomp.jsonml.JsonML element, int expected) {
		validateChildrenSize(element, expected, expected);
	}

	private void validateChildrenSize(com.google.javascript.jscomp.jsonml.JsonML element, int min, int max) {
		validateMinChildrenSize(element, min);
		if (!(error)) {
			validateMaxChildrenSize(element, max);
		}
	}

	private void validateMinChildrenSize(com.google.javascript.jscomp.jsonml.JsonML element, int min) {
		int size = element.childrenSize();
		if (size < min) {
			appendLine(java.lang.String.format(com.google.javascript.jscomp.jsonml.Validator.NOT_ENOUGH_CHILDREN_FMT, element.getType(), min, size));
			error = true;
		}
	}

	private void validateMaxChildrenSize(com.google.javascript.jscomp.jsonml.JsonML element, int max) {
		int size = element.childrenSize();
		if (size > max) {
			appendLine(java.lang.String.format(com.google.javascript.jscomp.jsonml.Validator.TOO_MANY_CHILDREN_FMT, element.getType().toString(), max, size));
			error = true;
		}
	}

	private void validateIsChildExpression(com.google.javascript.jscomp.jsonml.JsonML element, int index) {
		validateChildType(element, com.google.javascript.jscomp.jsonml.Validator.exprTypes, index);
	}

	private void validateChildType(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.jscomp.jsonml.TagType expected, int index) {
		com.google.javascript.jscomp.jsonml.TagType[] types = new com.google.javascript.jscomp.jsonml.TagType[]{ expected };
		validateChildType(element, types, index);
	}

	private void validateChildType(com.google.javascript.jscomp.jsonml.JsonML element, com.google.javascript.jscomp.jsonml.TagType[] expected, int index) {
		com.google.javascript.jscomp.jsonml.TagType type = element.getChild(index).getType();
		if (!(java.util.Arrays.asList(expected).contains(type))) {
			appendLine(java.lang.String.format(com.google.javascript.jscomp.jsonml.Validator.WRONG_CHILD_TYPE_FMT, index, element.getType(), com.google.javascript.jscomp.jsonml.Validator.printList(expected), type));
			error = true;
		}
	}

	private void appendLine(java.lang.String line) {
		b.append(java.lang.String.format("%s", line));
	}

	public static java.lang.String printList(java.lang.Object[] list) {
		java.lang.StringBuilder builder = new java.lang.StringBuilder("");
		if ((list.length) == 1) {
			builder.append(list[0].toString());
		}else
			if ((list.length) > 1) {
				builder.append('[');
				for (int i = 0; i < (list.length); ++i) {
					builder.append(list[i].toString());
					if (i < ((list.length) - 1)) {
						builder.append(", ");
					}
				}
				builder.append("]");
			}
		
		return builder.toString();
	}
}

