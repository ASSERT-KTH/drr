

package com.google.javascript.jscomp;


public final class NodeUtil {
	static final long MAX_POSITIVE_INTEGER_NUMBER = ((long) (java.lang.Math.pow(2, 53)));

	static final java.lang.String JSC_PROPERTY_NAME_FN = "JSCompiler_renameProperty";

	private static final java.util.Set<java.lang.String> CONSTRUCTORS_WITHOUT_SIDE_EFFECTS = new java.util.HashSet<java.lang.String>(java.util.Arrays.asList("Array", "Date", "Error", "Object", "RegExp", "XMLHttpRequest"));

	private NodeUtil() {
	}

	static com.google.javascript.rhino.jstype.TernaryValue getImpureBooleanValue(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.ASSIGN :
			case com.google.javascript.rhino.Token.COMMA :
				return com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(n.getLastChild());
			case com.google.javascript.rhino.Token.NOT :
				com.google.javascript.rhino.jstype.TernaryValue value = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(n.getLastChild());
				return value.not();
			case com.google.javascript.rhino.Token.AND :
				{
					com.google.javascript.rhino.jstype.TernaryValue lhs = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(n.getFirstChild());
					com.google.javascript.rhino.jstype.TernaryValue rhs = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(n.getLastChild());
					return lhs.and(rhs);
				}
			case com.google.javascript.rhino.Token.OR :
				{
					com.google.javascript.rhino.jstype.TernaryValue lhs = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(n.getFirstChild());
					com.google.javascript.rhino.jstype.TernaryValue rhs = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(n.getLastChild());
					return lhs.or(rhs);
				}
			case com.google.javascript.rhino.Token.HOOK :
				{
					com.google.javascript.rhino.jstype.TernaryValue trueValue = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(n.getFirstChild().getNext());
					com.google.javascript.rhino.jstype.TernaryValue falseValue = com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(n.getLastChild());
					if (trueValue.equals(falseValue)) {
						return trueValue;
					}else {
						return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
					}
				}
			case com.google.javascript.rhino.Token.ARRAYLIT :
			case com.google.javascript.rhino.Token.OBJECTLIT :
				return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
			case com.google.javascript.rhino.Token.VOID :
				return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
			default :
				return com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(n);
		}
	}

	static com.google.javascript.rhino.jstype.TernaryValue getPureBooleanValue(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.STRING :
				return com.google.javascript.rhino.jstype.TernaryValue.forBoolean(((n.getString().length()) > 0));
			case com.google.javascript.rhino.Token.NUMBER :
				return com.google.javascript.rhino.jstype.TernaryValue.forBoolean(((n.getDouble()) != 0));
			case com.google.javascript.rhino.Token.NOT :
				return com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(n.getLastChild()).not();
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.FALSE :
				return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
			case com.google.javascript.rhino.Token.VOID :
				if (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n.getFirstChild()))) {
					return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
				}
				break;
			case com.google.javascript.rhino.Token.NAME :
				java.lang.String name = n.getString();
				if (("undefined".equals(name)) || ("NaN".equals(name))) {
					return com.google.javascript.rhino.jstype.TernaryValue.FALSE;
				}else
					if ("Infinity".equals(name)) {
						return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
					}
				
				break;
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.REGEXP :
				return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
			case com.google.javascript.rhino.Token.ARRAYLIT :
			case com.google.javascript.rhino.Token.OBJECTLIT :
				if (!(com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n))) {
					return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
				}
				break;
		}
		return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
	}

	static java.lang.String getStringValue(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.STRING :
				return n.getString();
			case com.google.javascript.rhino.Token.NAME :
				java.lang.String name = n.getString();
				if ((("undefined".equals(name)) || ("Infinity".equals(name))) || ("NaN".equals(name))) {
					return name;
				}
				break;
			case com.google.javascript.rhino.Token.NUMBER :
				return com.google.javascript.jscomp.NodeUtil.getStringValue(n.getDouble());
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.NULL :
				return com.google.javascript.rhino.Node.tokenToName(n.getType());
			case com.google.javascript.rhino.Token.VOID :
				return "undefined";
			case com.google.javascript.rhino.Token.NOT :
				com.google.javascript.rhino.jstype.TernaryValue child = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(n.getFirstChild());
				if (child != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
					return child.toBoolean(true) ? "false" : "true";
				}
				break;
			case com.google.javascript.rhino.Token.ARRAYLIT :
				return com.google.javascript.jscomp.NodeUtil.arrayToString(n);
			case com.google.javascript.rhino.Token.OBJECTLIT :
				return "[object Object]";
		}
		return null;
	}

	static java.lang.String getStringValue(double value) {
		long longValue = ((long) (value));
		if (longValue == value) {
			return java.lang.Long.toString(longValue);
		}else {
			return java.lang.Double.toString(value);
		}
	}

	static java.lang.String getArrayElementStringValue(com.google.javascript.rhino.Node n) {
		return (com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(n)) || ((n.getType()) == (com.google.javascript.rhino.Token.EMPTY)) ? "" : com.google.javascript.jscomp.NodeUtil.getStringValue(n);
	}

	static java.lang.String arrayToString(com.google.javascript.rhino.Node literal) {
		com.google.javascript.rhino.Node first = literal.getFirstChild();
		java.lang.StringBuilder result = new java.lang.StringBuilder();
		int nextSlot = 0;
		int nextSkipSlot = 0;
		for (com.google.javascript.rhino.Node n = first; n != null; n = n.getNext()) {
			java.lang.String childValue = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(n);
			if (childValue == null) {
				return null;
			}
			if (n != first) {
				result.append(',');
			}
			result.append(childValue);
			nextSlot++;
		}
		return result.toString();
	}

	static java.lang.Double getNumberValue(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.TRUE :
				return 1.0;
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.NULL :
				return 0.0;
			case com.google.javascript.rhino.Token.NUMBER :
				return n.getDouble();
			case com.google.javascript.rhino.Token.VOID :
				if (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n.getFirstChild())) {
					return null;
				}else {
					return java.lang.Double.NaN;
				}
			case com.google.javascript.rhino.Token.NAME :
				java.lang.String name = n.getString();
				if (name.equals("undefined")) {
					return java.lang.Double.NaN;
				}
				if (name.equals("NaN")) {
					return java.lang.Double.NaN;
				}
				if (name.equals("Infinity")) {
					return java.lang.Double.POSITIVE_INFINITY;
				}
				return null;
			case com.google.javascript.rhino.Token.NEG :
				if ((((n.getChildCount()) == 1) && ((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.NAME))) && (n.getFirstChild().getString().equals("Infinity"))) {
					return java.lang.Double.NEGATIVE_INFINITY;
				}
				return null;
			case com.google.javascript.rhino.Token.NOT :
				com.google.javascript.rhino.jstype.TernaryValue child = com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(n.getFirstChild());
				if (child != (com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN)) {
					return child.toBoolean(true) ? 0.0 : 1.0;
				}
				break;
			case com.google.javascript.rhino.Token.STRING :
				return com.google.javascript.jscomp.NodeUtil.getStringNumberValue(n.getString());
			case com.google.javascript.rhino.Token.ARRAYLIT :
			case com.google.javascript.rhino.Token.OBJECTLIT :
				java.lang.String value = com.google.javascript.jscomp.NodeUtil.getStringValue(n);
				return value != null ? com.google.javascript.jscomp.NodeUtil.getStringNumberValue(value) : null;
		}
		return null;
	}

	static java.lang.Double getStringNumberValue(java.lang.String rawJsString) {
		if (rawJsString.contains("")) {
			return null;
		}
		java.lang.String s = com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(rawJsString);
		if ((s.length()) == 0) {
			return 0.0;
		}
		if ((((s.length()) > 2) && ((s.charAt(0)) == '0')) && (((s.charAt(1)) == 'x') || ((s.charAt(1)) == 'X'))) {
			try {
				return java.lang.Double.valueOf(java.lang.Integer.parseInt(s.substring(2), 16));
			} catch (java.lang.NumberFormatException e) {
				return java.lang.Double.NaN;
			}
		}
		if (((((s.length()) > 3) && (((s.charAt(0)) == '-') || ((s.charAt(0)) == '+'))) && ((s.charAt(1)) == '0')) && (((s.charAt(2)) == 'x') || ((s.charAt(2)) == 'X'))) {
			return null;
		}
		if (((s.equals("infinity")) || (s.equals("-infinity"))) || (s.equals("+infinity"))) {
			return null;
		}
		try {
			return java.lang.Double.parseDouble(s);
		} catch (java.lang.NumberFormatException e) {
			return java.lang.Double.NaN;
		}
	}

	static java.lang.String trimJsWhiteSpace(java.lang.String s) {
		int start = 0;
		int end = s.length();
		while ((end > 0) && ((com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(s.charAt((end - 1)))) == (com.google.javascript.rhino.jstype.TernaryValue.TRUE))) {
			end--;
		} 
		while ((start < end) && ((com.google.javascript.jscomp.NodeUtil.isStrWhiteSpaceChar(s.charAt(start))) == (com.google.javascript.rhino.jstype.TernaryValue.TRUE))) {
			start++;
		} 
		return s.substring(start, end);
	}

	static com.google.javascript.rhino.jstype.TernaryValue isStrWhiteSpaceChar(int c) {
		switch (c) {
			case '' :
				return com.google.javascript.rhino.jstype.TernaryValue.UNKNOWN;
			case ' ' :
			case '\n' :
			case '\r' :
			case '\t' :
			case '\u00a0' :
			case '\f' :
			case '\u2028' :
			case '\u2029' :
			case '\ufeff' :
				return com.google.javascript.rhino.jstype.TernaryValue.TRUE;
			default :
				return (java.lang.Character.getType(c)) == (java.lang.Character.SPACE_SEPARATOR) ? com.google.javascript.rhino.jstype.TernaryValue.TRUE : com.google.javascript.rhino.jstype.TernaryValue.FALSE;
		}
	}

	static java.lang.String getFunctionName(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		java.lang.String name = n.getFirstChild().getString();
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				return parent.getString();
			case com.google.javascript.rhino.Token.ASSIGN :
				return parent.getFirstChild().getQualifiedName();
			default :
				return (name != null) && ((name.length()) != 0) ? name : null;
		}
	}

	public static java.lang.String getNearestFunctionName(com.google.javascript.rhino.Node n) {
		java.lang.String name = com.google.javascript.jscomp.NodeUtil.getFunctionName(n);
		if (name != null) {
			return name;
		}
		com.google.javascript.rhino.Node parent = n.getParent();
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.SET :
			case com.google.javascript.rhino.Token.GET :
			case com.google.javascript.rhino.Token.STRING :
				return parent.getString();
			case com.google.javascript.rhino.Token.NUMBER :
				return com.google.javascript.jscomp.NodeUtil.getStringValue(parent);
		}
		return null;
	}

	static boolean isImmutableValue(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.STRING :
			case com.google.javascript.rhino.Token.NUMBER :
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.FALSE :
				return true;
			case com.google.javascript.rhino.Token.NOT :
				return com.google.javascript.jscomp.NodeUtil.isImmutableValue(n.getFirstChild());
			case com.google.javascript.rhino.Token.VOID :
			case com.google.javascript.rhino.Token.NEG :
				return com.google.javascript.jscomp.NodeUtil.isImmutableValue(n.getFirstChild());
			case com.google.javascript.rhino.Token.NAME :
				java.lang.String name = n.getString();
				return (("undefined".equals(name)) || ("Infinity".equals(name))) || ("NaN".equals(name));
		}
		return false;
	}

	public static boolean isSymmetricOperation(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
			case com.google.javascript.rhino.Token.MUL :
				return true;
		}
		return false;
	}

	public static boolean isRelationalOperation(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.LE :
				return true;
		}
		return false;
	}

	public static int getInverseOperator(int type) {
		switch (type) {
			case com.google.javascript.rhino.Token.GT :
				return com.google.javascript.rhino.Token.LT;
			case com.google.javascript.rhino.Token.LT :
				return com.google.javascript.rhino.Token.GT;
			case com.google.javascript.rhino.Token.GE :
				return com.google.javascript.rhino.Token.LE;
			case com.google.javascript.rhino.Token.LE :
				return com.google.javascript.rhino.Token.GE;
		}
		return com.google.javascript.rhino.Token.ERROR;
	}

	static boolean isLiteralValue(com.google.javascript.rhino.Node n, boolean includeFunctions) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.ARRAYLIT :
				for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
					if (((child.getType()) != (com.google.javascript.rhino.Token.EMPTY)) && (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(child, includeFunctions)))) {
						return false;
					}
				}
				return true;
			case com.google.javascript.rhino.Token.REGEXP :
				for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
					if (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(child, includeFunctions))) {
						return false;
					}
				}
				return true;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
					if (!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(child.getFirstChild(), includeFunctions))) {
						return false;
					}
				}
				return true;
			case com.google.javascript.rhino.Token.FUNCTION :
				return includeFunctions && (!(com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)));
			default :
				return com.google.javascript.jscomp.NodeUtil.isImmutableValue(n);
		}
	}

	static boolean isValidDefineValue(com.google.javascript.rhino.Node val, java.util.Set<java.lang.String> defines) {
		switch (val.getType()) {
			case com.google.javascript.rhino.Token.STRING :
			case com.google.javascript.rhino.Token.NUMBER :
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.FALSE :
				return true;
			case com.google.javascript.rhino.Token.ADD :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.BITNOT :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.URSH :
				return (com.google.javascript.jscomp.NodeUtil.isValidDefineValue(val.getFirstChild(), defines)) && (com.google.javascript.jscomp.NodeUtil.isValidDefineValue(val.getLastChild(), defines));
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.NEG :
			case com.google.javascript.rhino.Token.POS :
				return com.google.javascript.jscomp.NodeUtil.isValidDefineValue(val.getFirstChild(), defines);
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.GETPROP :
				if (val.isQualifiedName()) {
					return defines.contains(val.getQualifiedName());
				}
		}
		return false;
	}

	static boolean isEmptyBlock(com.google.javascript.rhino.Node block) {
		if ((block.getType()) != (com.google.javascript.rhino.Token.BLOCK)) {
			return false;
		}
		for (com.google.javascript.rhino.Node n = block.getFirstChild(); n != null; n = n.getNext()) {
			if ((n.getType()) != (com.google.javascript.rhino.Token.EMPTY)) {
				return false;
			}
		}
		return true;
	}

	static boolean isSimpleOperator(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType(n.getType());
	}

	static boolean isSimpleOperatorType(int type) {
		switch (type) {
			case com.google.javascript.rhino.Token.ADD :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.BITNOT :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.COMMA :
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.GETELEM :
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.INSTANCEOF :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.TYPEOF :
			case com.google.javascript.rhino.Token.VOID :
			case com.google.javascript.rhino.Token.POS :
			case com.google.javascript.rhino.Token.NEG :
			case com.google.javascript.rhino.Token.URSH :
				return true;
			default :
				return false;
		}
	}

	public static com.google.javascript.rhino.Node newExpr(com.google.javascript.rhino.Node child) {
		com.google.javascript.rhino.Node expr = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, child).copyInformationFrom(child);
		return expr;
	}

	static boolean mayEffectMutableState(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(n, null);
	}

	static boolean mayEffectMutableState(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.AbstractCompiler compiler) {
		return com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(n, true, compiler);
	}

	static boolean mayHaveSideEffects(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(n, null);
	}

	static boolean mayHaveSideEffects(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.AbstractCompiler compiler) {
		return com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(n, false, compiler);
	}

	private static boolean checkForStateChangeHelper(com.google.javascript.rhino.Node n, boolean checkForNewObjects, com.google.javascript.jscomp.AbstractCompiler compiler) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.EXPR_RESULT :
			case com.google.javascript.rhino.Token.HOOK :
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.IN :
			case com.google.javascript.rhino.Token.LP :
			case com.google.javascript.rhino.Token.NUMBER :
			case com.google.javascript.rhino.Token.OR :
			case com.google.javascript.rhino.Token.THIS :
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.STRING :
			case com.google.javascript.rhino.Token.SWITCH :
			case com.google.javascript.rhino.Token.TRY :
			case com.google.javascript.rhino.Token.EMPTY :
				break;
			case com.google.javascript.rhino.Token.THROW :
				return true;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				if (checkForNewObjects) {
					return true;
				}
				for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
					if (com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(c.getFirstChild(), checkForNewObjects, compiler)) {
						return true;
					}
				}
				return false;
			case com.google.javascript.rhino.Token.ARRAYLIT :
			case com.google.javascript.rhino.Token.REGEXP :
				if (checkForNewObjects) {
					return true;
				}
				break;
			case com.google.javascript.rhino.Token.VAR :
			case com.google.javascript.rhino.Token.NAME :
				if ((n.getFirstChild()) != null) {
					return true;
				}
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				return checkForNewObjects || (!(com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n)));
			case com.google.javascript.rhino.Token.NEW :
				if (checkForNewObjects) {
					return true;
				}
				if (!(com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(n))) {
					break;
				}
				return true;
			case com.google.javascript.rhino.Token.CALL :
				if (!(com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(n, compiler))) {
					break;
				}
				return true;
			default :
				if (com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType(n.getType())) {
					break;
				}
				if (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) {
					com.google.javascript.rhino.Node assignTarget = n.getFirstChild();
					if (com.google.javascript.jscomp.NodeUtil.isName(assignTarget)) {
						return true;
					}
					if ((com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(n.getFirstChild(), checkForNewObjects, compiler)) || (com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(n.getLastChild(), checkForNewObjects, compiler))) {
						return true;
					}
					if (com.google.javascript.jscomp.NodeUtil.isGet(assignTarget)) {
						com.google.javascript.rhino.Node current = assignTarget.getFirstChild();
						if (com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(current)) {
							return false;
						}
						while (com.google.javascript.jscomp.NodeUtil.isGet(current)) {
							current = current.getFirstChild();
						} 
						return !(com.google.javascript.jscomp.NodeUtil.isLiteralValue(current, true));
					}else {
						return !(com.google.javascript.jscomp.NodeUtil.isLiteralValue(assignTarget, true));
					}
				}
				return true;
		}
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			if (com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(c, checkForNewObjects, compiler)) {
				return true;
			}
		}
		return false;
	}

	static boolean constructorCallHasSideEffects(com.google.javascript.rhino.Node callNode) {
		return com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(callNode, null);
	}

	static boolean constructorCallHasSideEffects(com.google.javascript.rhino.Node callNode, com.google.javascript.jscomp.AbstractCompiler compiler) {
		if ((callNode.getType()) != (com.google.javascript.rhino.Token.NEW)) {
			throw new java.lang.IllegalStateException(("Expected NEW node, got " + (com.google.javascript.rhino.Token.name(callNode.getType()))));
		}
		if (callNode.isNoSideEffectsCall()) {
			return false;
		}
		com.google.javascript.rhino.Node nameNode = callNode.getFirstChild();
		if (((nameNode.getType()) == (com.google.javascript.rhino.Token.NAME)) && (com.google.javascript.jscomp.NodeUtil.CONSTRUCTORS_WITHOUT_SIDE_EFFECTS.contains(nameNode.getString()))) {
			return false;
		}
		return true;
	}

	private static final java.util.Set<java.lang.String> BUILTIN_FUNCTIONS_WITHOUT_SIDEEFFECTS = com.google.common.collect.ImmutableSet.of("Object", "Array", "String", "Number", "Boolean", "RegExp", "Error");

	private static final java.util.Set<java.lang.String> OBJECT_METHODS_WITHOUT_SIDEEFFECTS = com.google.common.collect.ImmutableSet.of("toString", "valueOf");

	private static final java.util.Set<java.lang.String> REGEXP_METHODS = com.google.common.collect.ImmutableSet.of("test", "exec");

	private static final java.util.Set<java.lang.String> STRING_REGEXP_METHODS = com.google.common.collect.ImmutableSet.of("match", "replace", "search", "split");

	static boolean functionCallHasSideEffects(com.google.javascript.rhino.Node callNode) {
		return com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(callNode, null);
	}

	static boolean functionCallHasSideEffects(com.google.javascript.rhino.Node callNode, @javax.annotation.Nullable
	com.google.javascript.jscomp.AbstractCompiler compiler) {
		if ((callNode.getType()) != (com.google.javascript.rhino.Token.CALL)) {
			throw new java.lang.IllegalStateException(("Expected CALL node, got " + (com.google.javascript.rhino.Token.name(callNode.getType()))));
		}
		if (callNode.isNoSideEffectsCall()) {
			return false;
		}
		com.google.javascript.rhino.Node nameNode = callNode.getFirstChild();
		if ((nameNode.getType()) == (com.google.javascript.rhino.Token.NAME)) {
			java.lang.String name = nameNode.getString();
			if (com.google.javascript.jscomp.NodeUtil.BUILTIN_FUNCTIONS_WITHOUT_SIDEEFFECTS.contains(name)) {
				return false;
			}
		}else
			if ((nameNode.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
				if ((callNode.hasOneChild()) && (com.google.javascript.jscomp.NodeUtil.OBJECT_METHODS_WITHOUT_SIDEEFFECTS.contains(nameNode.getLastChild().getString()))) {
					return false;
				}
				if ((callNode.isOnlyModifiesThisCall()) && (com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(nameNode.getFirstChild()))) {
					return false;
				}
				if ((nameNode.getFirstChild().getType()) == (com.google.javascript.rhino.Token.NAME)) {
					if ("Math.floor".equals(nameNode.getQualifiedName())) {
						return false;
					}
				}
				if ((compiler != null) && (!(compiler.hasRegExpGlobalReferences()))) {
					if (((nameNode.getFirstChild().getType()) == (com.google.javascript.rhino.Token.REGEXP)) && (com.google.javascript.jscomp.NodeUtil.REGEXP_METHODS.contains(nameNode.getLastChild().getString()))) {
						return false;
					}else
						if (((nameNode.getFirstChild().getType()) == (com.google.javascript.rhino.Token.STRING)) && (com.google.javascript.jscomp.NodeUtil.STRING_REGEXP_METHODS.contains(nameNode.getLastChild().getString()))) {
							com.google.javascript.rhino.Node param = nameNode.getNext();
							if ((param != null) && (((param.getType()) == (com.google.javascript.rhino.Token.STRING)) || ((param.getType()) == (com.google.javascript.rhino.Token.REGEXP))))
								return false;
							
						}
					
				}
			}
		
		return true;
	}

	static boolean callHasLocalResult(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		return ((n.getSideEffectFlags()) & (com.google.javascript.rhino.Node.FLAG_LOCAL_RESULTS)) > 0;
	}

	static boolean newHasLocalResult(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.NEW)));
		return n.isOnlyModifiesThisCall();
	}

	static boolean nodeTypeMayHaveSideEffects(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(n, null);
	}

	static boolean nodeTypeMayHaveSideEffects(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.AbstractCompiler compiler) {
		if (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(n)) {
			return true;
		}
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.DELPROP :
			case com.google.javascript.rhino.Token.DEC :
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.THROW :
				return true;
			case com.google.javascript.rhino.Token.CALL :
				return com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(n, compiler);
			case com.google.javascript.rhino.Token.NEW :
				return com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(n, compiler);
			case com.google.javascript.rhino.Token.NAME :
				return n.hasChildren();
			default :
				return false;
		}
	}

	static boolean canBeSideEffected(com.google.javascript.rhino.Node n) {
		java.util.Set<java.lang.String> emptySet = java.util.Collections.emptySet();
		return com.google.javascript.jscomp.NodeUtil.canBeSideEffected(n, emptySet);
	}

	static boolean canBeSideEffected(com.google.javascript.rhino.Node n, java.util.Set<java.lang.String> knownConstants) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.CALL :
			case com.google.javascript.rhino.Token.NEW :
				return true;
			case com.google.javascript.rhino.Token.NAME :
				return (!(com.google.javascript.jscomp.NodeUtil.isConstantName(n))) && (!(knownConstants.contains(n.getString())));
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.GETELEM :
				return true;
			case com.google.javascript.rhino.Token.FUNCTION :
				com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n));
				return false;
		}
		for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
			if (com.google.javascript.jscomp.NodeUtil.canBeSideEffected(c, knownConstants)) {
				return true;
			}
		}
		return false;
	}

	static int precedence(int type) {
		switch (type) {
			case com.google.javascript.rhino.Token.COMMA :
				return 0;
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
			case com.google.javascript.rhino.Token.ASSIGN :
				return 1;
			case com.google.javascript.rhino.Token.HOOK :
				return 2;
			case com.google.javascript.rhino.Token.OR :
				return 3;
			case com.google.javascript.rhino.Token.AND :
				return 4;
			case com.google.javascript.rhino.Token.BITOR :
				return 5;
			case com.google.javascript.rhino.Token.BITXOR :
				return 6;
			case com.google.javascript.rhino.Token.BITAND :
				return 7;
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
				return 8;
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.INSTANCEOF :
			case com.google.javascript.rhino.Token.IN :
				return 9;
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.URSH :
				return 10;
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.ADD :
				return 11;
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.DIV :
				return 12;
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
			case com.google.javascript.rhino.Token.NEW :
			case com.google.javascript.rhino.Token.DELPROP :
			case com.google.javascript.rhino.Token.TYPEOF :
			case com.google.javascript.rhino.Token.VOID :
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.BITNOT :
			case com.google.javascript.rhino.Token.POS :
			case com.google.javascript.rhino.Token.NEG :
				return 13;
			case com.google.javascript.rhino.Token.CALL :
			case com.google.javascript.rhino.Token.GETELEM :
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.ARRAYLIT :
			case com.google.javascript.rhino.Token.EMPTY :
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.FUNCTION :
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.NUMBER :
			case com.google.javascript.rhino.Token.OBJECTLIT :
			case com.google.javascript.rhino.Token.REGEXP :
			case com.google.javascript.rhino.Token.STRING :
			case com.google.javascript.rhino.Token.THIS :
			case com.google.javascript.rhino.Token.TRUE :
				return 15;
			default :
				throw new java.lang.Error((((("Unknown precedence for " + (com.google.javascript.rhino.Node.tokenToName(type))) + " (type ") + type) + ")"));
		}
	}

	static boolean valueCheck(com.google.javascript.rhino.Node n, com.google.common.base.Predicate<com.google.javascript.rhino.Node> p) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.ASSIGN :
			case com.google.javascript.rhino.Token.COMMA :
				return com.google.javascript.jscomp.NodeUtil.valueCheck(n.getLastChild(), p);
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				return (com.google.javascript.jscomp.NodeUtil.valueCheck(n.getFirstChild(), p)) && (com.google.javascript.jscomp.NodeUtil.valueCheck(n.getLastChild(), p));
			case com.google.javascript.rhino.Token.HOOK :
				return (com.google.javascript.jscomp.NodeUtil.valueCheck(n.getFirstChild().getNext(), p)) && (com.google.javascript.jscomp.NodeUtil.valueCheck(n.getLastChild(), p));
			default :
				return p.apply(n);
		}
	}

	static class NumbericResultPredicate implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			return com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(n);
		}
	}

	static final com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate NUMBERIC_RESULT_PREDICATE = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();

	static boolean isNumericResult(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.valueCheck(n, com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE);
	}

	static boolean isNumericResultHelper(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.ADD :
				return (!(com.google.javascript.jscomp.NodeUtil.mayBeString(n.getFirstChild()))) && (!(com.google.javascript.jscomp.NodeUtil.mayBeString(n.getLastChild())));
			case com.google.javascript.rhino.Token.BITNOT :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.BITAND :
			case com.google.javascript.rhino.Token.LSH :
			case com.google.javascript.rhino.Token.RSH :
			case com.google.javascript.rhino.Token.URSH :
			case com.google.javascript.rhino.Token.SUB :
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.MOD :
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
			case com.google.javascript.rhino.Token.POS :
			case com.google.javascript.rhino.Token.NEG :
			case com.google.javascript.rhino.Token.NUMBER :
				return true;
			case com.google.javascript.rhino.Token.NAME :
				java.lang.String name = n.getString();
				if (name.equals("NaN")) {
					return true;
				}
				if (name.equals("Infinity")) {
					return true;
				}
				return false;
			default :
				return false;
		}
	}

	static class BooleanResultPredicate implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			return com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(n);
		}
	}

	static final com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate BOOLEAN_RESULT_PREDICATE = new com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate();

	static boolean isBooleanResult(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.valueCheck(n, com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE);
	}

	static boolean isBooleanResultHelper(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.TRUE :
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.EQ :
			case com.google.javascript.rhino.Token.NE :
			case com.google.javascript.rhino.Token.SHEQ :
			case com.google.javascript.rhino.Token.SHNE :
			case com.google.javascript.rhino.Token.LT :
			case com.google.javascript.rhino.Token.GT :
			case com.google.javascript.rhino.Token.LE :
			case com.google.javascript.rhino.Token.GE :
			case com.google.javascript.rhino.Token.IN :
			case com.google.javascript.rhino.Token.INSTANCEOF :
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.DELPROP :
				return true;
			default :
				return false;
		}
	}

	static boolean isUndefined(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.VOID :
				return true;
			case com.google.javascript.rhino.Token.NAME :
				return n.getString().equals("undefined");
		}
		return false;
	}

	static boolean isNull(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.NULL);
	}

	static boolean isNullOrUndefined(com.google.javascript.rhino.Node n) {
		return (com.google.javascript.jscomp.NodeUtil.isNull(n)) || (com.google.javascript.jscomp.NodeUtil.isUndefined(n));
	}

	static class MayBeStringResultPredicate implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			return com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(n);
		}
	}

	static final com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate MAY_BE_STRING_PREDICATE = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();

	static boolean mayBeString(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.mayBeString(n, true);
	}

	static boolean mayBeString(com.google.javascript.rhino.Node n, boolean recurse) {
		if (recurse) {
			return com.google.javascript.jscomp.NodeUtil.valueCheck(n, com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE);
		}else {
			return com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(n);
		}
	}

	static boolean mayBeStringHelper(com.google.javascript.rhino.Node n) {
		return (((!(com.google.javascript.jscomp.NodeUtil.isNumericResult(n))) && (!(com.google.javascript.jscomp.NodeUtil.isBooleanResult(n)))) && (!(com.google.javascript.jscomp.NodeUtil.isUndefined(n)))) && (!(com.google.javascript.jscomp.NodeUtil.isNull(n)));
	}

	static boolean isAssociative(int type) {
		switch (type) {
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.BITAND :
				return true;
			default :
				return false;
		}
	}

	static boolean isCommutative(int type) {
		switch (type) {
			case com.google.javascript.rhino.Token.MUL :
			case com.google.javascript.rhino.Token.BITOR :
			case com.google.javascript.rhino.Token.BITXOR :
			case com.google.javascript.rhino.Token.BITAND :
				return true;
			default :
				return false;
		}
	}

	static boolean isAssignmentOp(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
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
				return true;
		}
		return false;
	}

	static int getOpFromAssignmentOp(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
				return com.google.javascript.rhino.Token.BITOR;
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
				return com.google.javascript.rhino.Token.BITXOR;
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
				return com.google.javascript.rhino.Token.BITAND;
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
				return com.google.javascript.rhino.Token.LSH;
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
				return com.google.javascript.rhino.Token.RSH;
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
				return com.google.javascript.rhino.Token.URSH;
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
				return com.google.javascript.rhino.Token.ADD;
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
				return com.google.javascript.rhino.Token.SUB;
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
				return com.google.javascript.rhino.Token.MUL;
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
				return com.google.javascript.rhino.Token.DIV;
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
				return com.google.javascript.rhino.Token.MOD;
		}
		throw new java.lang.IllegalArgumentException("Not an assiment op");
	}

	static boolean isExpressionNode(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT);
	}

	static boolean containsFunction(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.containsType(n, com.google.javascript.rhino.Token.FUNCTION);
	}

	static boolean referencesThis(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node start = com.google.javascript.jscomp.NodeUtil.isFunction(n) ? n.getLastChild() : n;
		return com.google.javascript.jscomp.NodeUtil.containsType(start, com.google.javascript.rhino.Token.THIS, com.google.javascript.jscomp.NodeUtil.MATCH_NOT_FUNCTION);
	}

	static boolean isGet(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.GETPROP)) || ((n.getType()) == (com.google.javascript.rhino.Token.GETELEM));
	}

	static boolean isGetProp(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.GETPROP);
	}

	static boolean isName(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.NAME);
	}

	static boolean isNew(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.NEW);
	}

	static boolean isVar(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.VAR);
	}

	static boolean isVarDeclaration(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) && ((n.getParent().getType()) == (com.google.javascript.rhino.Token.VAR));
	}

	static com.google.javascript.rhino.Node getAssignedValue(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isName(n));
		com.google.javascript.rhino.Node parent = n.getParent();
		if (com.google.javascript.jscomp.NodeUtil.isVar(parent)) {
			return n.getFirstChild();
		}else
			if ((com.google.javascript.jscomp.NodeUtil.isAssign(parent)) && ((parent.getFirstChild()) == n)) {
				return n.getNext();
			}else {
				return null;
			}
		
	}

	static boolean isString(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.STRING);
	}

	static boolean isExprAssign(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) && ((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.ASSIGN));
	}

	static boolean isAssign(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.ASSIGN);
	}

	static boolean isExprCall(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) && ((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.CALL));
	}

	static boolean isForIn(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.FOR)) && ((n.getChildCount()) == 3);
	}

	static boolean isLoopStructure(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.WHILE :
				return true;
			default :
				return false;
		}
	}

	static com.google.javascript.rhino.Node getLoopCodeBlock(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.WHILE :
				return n.getLastChild();
			case com.google.javascript.rhino.Token.DO :
				return n.getFirstChild();
			default :
				return null;
		}
	}

	static boolean isWithinLoop(com.google.javascript.rhino.Node n) {
		for (com.google.javascript.rhino.Node parent : n.getAncestors()) {
			if (com.google.javascript.jscomp.NodeUtil.isLoopStructure(parent)) {
				return true;
			}
			if (com.google.javascript.jscomp.NodeUtil.isFunction(parent)) {
				break;
			}
		}
		return false;
	}

	static boolean isControlStructure(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.DO :
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.WITH :
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.LABEL :
			case com.google.javascript.rhino.Token.TRY :
			case com.google.javascript.rhino.Token.CATCH :
			case com.google.javascript.rhino.Token.SWITCH :
			case com.google.javascript.rhino.Token.CASE :
			case com.google.javascript.rhino.Token.DEFAULT :
				return true;
			default :
				return false;
		}
	}

	static boolean isControlStructureCodeBlock(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node n) {
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.WHILE :
			case com.google.javascript.rhino.Token.LABEL :
			case com.google.javascript.rhino.Token.WITH :
				return (parent.getLastChild()) == n;
			case com.google.javascript.rhino.Token.DO :
				return (parent.getFirstChild()) == n;
			case com.google.javascript.rhino.Token.IF :
				return (parent.getFirstChild()) != n;
			case com.google.javascript.rhino.Token.TRY :
				return ((parent.getFirstChild()) == n) || ((parent.getLastChild()) == n);
			case com.google.javascript.rhino.Token.CATCH :
				return (parent.getLastChild()) == n;
			case com.google.javascript.rhino.Token.SWITCH :
			case com.google.javascript.rhino.Token.CASE :
				return (parent.getFirstChild()) != n;
			case com.google.javascript.rhino.Token.DEFAULT :
				return true;
			default :
				com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isControlStructure(parent));
				return false;
		}
	}

	static com.google.javascript.rhino.Node getConditionExpression(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.WHILE :
				return n.getFirstChild();
			case com.google.javascript.rhino.Token.DO :
				return n.getLastChild();
			case com.google.javascript.rhino.Token.FOR :
				switch (n.getChildCount()) {
					case 3 :
						return null;
					case 4 :
						return n.getFirstChild().getNext();
				}
				throw new java.lang.IllegalArgumentException(("malformed 'for' statement " + n));
			case com.google.javascript.rhino.Token.CASE :
				return null;
		}
		throw new java.lang.IllegalArgumentException((n + " does not have a condition."));
	}

	static boolean isStatementBlock(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.SCRIPT)) || ((n.getType()) == (com.google.javascript.rhino.Token.BLOCK));
	}

	static boolean isStatement(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.isStatementParent(n.getParent());
	}

	static boolean isStatementParent(com.google.javascript.rhino.Node parent) {
		com.google.common.base.Preconditions.checkState((parent != null));
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.SCRIPT :
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.LABEL :
				return true;
			default :
				return false;
		}
	}

	static boolean isSwitchCase(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.CASE)) || ((n.getType()) == (com.google.javascript.rhino.Token.DEFAULT));
	}

	static boolean isReferenceName(com.google.javascript.rhino.Node n) {
		return (com.google.javascript.jscomp.NodeUtil.isName(n)) && (!(n.getString().isEmpty()));
	}

	static boolean isLabelName(com.google.javascript.rhino.Node n) {
		return (n != null) && ((n.getType()) == (com.google.javascript.rhino.Token.LABEL_NAME));
	}

	static boolean isTryFinallyNode(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node child) {
		return (((parent.getType()) == (com.google.javascript.rhino.Token.TRY)) && ((parent.getChildCount()) == 3)) && (child == (parent.getLastChild()));
	}

	static boolean isTryCatchNodeContainer(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		return ((parent.getType()) == (com.google.javascript.rhino.Token.TRY)) && ((parent.getFirstChild().getNext()) == n);
	}

	static void removeChild(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node node) {
		if (com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(parent, node)) {
			if (com.google.javascript.jscomp.NodeUtil.hasCatchHandler(com.google.javascript.jscomp.NodeUtil.getCatchBlock(parent))) {
				parent.removeChild(node);
			}else {
				node.detachChildren();
			}
		}else
			if ((node.getType()) == (com.google.javascript.rhino.Token.CATCH)) {
				com.google.javascript.rhino.Node tryNode = node.getParent().getParent();
				com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.hasFinally(tryNode));
				node.detachFromParent();
			}else
				if (com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(node)) {
					com.google.javascript.rhino.Node tryNode = node.getParent();
					com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.hasFinally(tryNode));
					node.detachChildren();
				}else
					if ((node.getType()) == (com.google.javascript.rhino.Token.BLOCK)) {
						node.detachChildren();
					}else
						if ((com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent)) || (com.google.javascript.jscomp.NodeUtil.isSwitchCase(node))) {
							parent.removeChild(node);
						}else
							if ((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) {
								if (parent.hasMoreThanOneChild()) {
									parent.removeChild(node);
								}else {
									parent.removeChild(node);
									com.google.javascript.jscomp.NodeUtil.removeChild(parent.getParent(), parent);
								}
							}else
								if (((parent.getType()) == (com.google.javascript.rhino.Token.LABEL)) && (node == (parent.getLastChild()))) {
									parent.removeChild(node);
									com.google.javascript.jscomp.NodeUtil.removeChild(parent.getParent(), parent);
								}else
									if (((parent.getType()) == (com.google.javascript.rhino.Token.FOR)) && ((parent.getChildCount()) == 4)) {
										parent.replaceChild(node, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY));
									}else {
										throw new java.lang.IllegalStateException(((("Invalid attempt to remove node: " + (node.toString())) + " of ") + (parent.toString())));
									}
								
							
						
					
				
			
		
	}

	static void maybeAddFinally(com.google.javascript.rhino.Node tryNode) {
		com.google.common.base.Preconditions.checkState(((tryNode.getType()) == (com.google.javascript.rhino.Token.TRY)));
		if (!(com.google.javascript.jscomp.NodeUtil.hasFinally(tryNode))) {
			tryNode.addChildrenToBack(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK).copyInformationFrom(tryNode));
		}
	}

	static boolean tryMergeBlock(com.google.javascript.rhino.Node block) {
		com.google.common.base.Preconditions.checkState(((block.getType()) == (com.google.javascript.rhino.Token.BLOCK)));
		com.google.javascript.rhino.Node parent = block.getParent();
		if (com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent)) {
			com.google.javascript.rhino.Node previous = block;
			while (block.hasChildren()) {
				com.google.javascript.rhino.Node child = block.removeFirstChild();
				parent.addChildAfter(child, previous);
				previous = child;
			} 
			parent.removeChild(block);
			return true;
		}else {
			return false;
		}
	}

	static boolean isCall(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.CALL);
	}

	static boolean isCallOrNew(com.google.javascript.rhino.Node node) {
		return (com.google.javascript.jscomp.NodeUtil.isCall(node)) || (com.google.javascript.jscomp.NodeUtil.isNew(node));
	}

	static boolean isFunction(com.google.javascript.rhino.Node n) {
		return (n.getType()) == (com.google.javascript.rhino.Token.FUNCTION);
	}

	static com.google.javascript.rhino.Node getFunctionBody(com.google.javascript.rhino.Node fn) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunction(fn));
		return fn.getLastChild();
	}

	static boolean isThis(com.google.javascript.rhino.Node node) {
		return (node.getType()) == (com.google.javascript.rhino.Token.THIS);
	}

	static boolean isArrayLiteral(com.google.javascript.rhino.Node node) {
		return (node.getType()) == (com.google.javascript.rhino.Token.ARRAYLIT);
	}

	static boolean containsCall(com.google.javascript.rhino.Node n) {
		return com.google.javascript.jscomp.NodeUtil.containsType(n, com.google.javascript.rhino.Token.CALL);
	}

	static boolean isFunctionDeclaration(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) && (com.google.javascript.jscomp.NodeUtil.isStatement(n));
	}

	static boolean isHoistedFunctionDeclaration(com.google.javascript.rhino.Node n) {
		return (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) && (((n.getParent().getType()) == (com.google.javascript.rhino.Token.SCRIPT)) || ((n.getParent().getParent().getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
	}

	static boolean isFunctionExpression(com.google.javascript.rhino.Node n) {
		return ((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) && (!(com.google.javascript.jscomp.NodeUtil.isStatement(n)));
	}

	static boolean isEmptyFunctionExpression(com.google.javascript.rhino.Node node) {
		return (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node)) && (com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node.getLastChild()));
	}

	static boolean isVarArgsFunction(com.google.javascript.rhino.Node function) {
		com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isFunction(function));
		return com.google.javascript.jscomp.NodeUtil.isNameReferenced(function.getLastChild(), "arguments", com.google.javascript.jscomp.NodeUtil.MATCH_NOT_FUNCTION);
	}

	static boolean isObjectCallMethod(com.google.javascript.rhino.Node callNode, java.lang.String methodName) {
		if ((callNode.getType()) == (com.google.javascript.rhino.Token.CALL)) {
			com.google.javascript.rhino.Node functionIndentifyingExpression = callNode.getFirstChild();
			if (com.google.javascript.jscomp.NodeUtil.isGet(functionIndentifyingExpression)) {
				com.google.javascript.rhino.Node last = functionIndentifyingExpression.getLastChild();
				if ((last != null) && ((last.getType()) == (com.google.javascript.rhino.Token.STRING))) {
					java.lang.String propName = last.getString();
					return propName.equals(methodName);
				}
			}
		}
		return false;
	}

	static boolean isFunctionObjectCall(com.google.javascript.rhino.Node callNode) {
		return com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(callNode, "call");
	}

	static boolean isFunctionObjectApply(com.google.javascript.rhino.Node callNode) {
		return com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(callNode, "apply");
	}

	static boolean isFunctionObjectCallOrApply(com.google.javascript.rhino.Node callNode) {
		return (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(callNode)) || (com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(callNode));
	}

	static boolean isSimpleFunctionObjectCall(com.google.javascript.rhino.Node callNode) {
		if (com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(callNode)) {
			if ((callNode.getFirstChild().getFirstChild().getType()) == (com.google.javascript.rhino.Token.NAME)) {
				return true;
			}
		}
		return false;
	}

	static boolean isVarOrSimpleAssignLhs(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		return (((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == n)) || ((parent.getType()) == (com.google.javascript.rhino.Token.VAR));
	}

	static boolean isLValue(com.google.javascript.rhino.Node node) {
		int nType = node.getType();
		com.google.common.base.Preconditions.checkArgument((((nType == (com.google.javascript.rhino.Token.NAME)) || (nType == (com.google.javascript.rhino.Token.GETPROP))) || (nType == (com.google.javascript.rhino.Token.GETELEM))));
		com.google.javascript.rhino.Node parent = node.getParent();
		return ((((((((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) && ((parent.getFirstChild()) == node)) || ((com.google.javascript.jscomp.NodeUtil.isForIn(parent)) && ((parent.getFirstChild()) == node))) || (com.google.javascript.jscomp.NodeUtil.isVar(parent))) || (((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) && ((parent.getFirstChild()) == node))) || ((parent.getType()) == (com.google.javascript.rhino.Token.DEC))) || ((parent.getType()) == (com.google.javascript.rhino.Token.INC))) || ((parent.getType()) == (com.google.javascript.rhino.Token.LP))) || ((parent.getType()) == (com.google.javascript.rhino.Token.CATCH));
	}

	static boolean isObjectLitKey(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.STRING :
				return (parent.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT);
			case com.google.javascript.rhino.Token.GET :
			case com.google.javascript.rhino.Token.SET :
				return true;
		}
		return false;
	}

	static java.lang.String getObjectLitKeyName(com.google.javascript.rhino.Node key) {
		switch (key.getType()) {
			case com.google.javascript.rhino.Token.STRING :
			case com.google.javascript.rhino.Token.GET :
			case com.google.javascript.rhino.Token.SET :
				return key.getString();
		}
		throw new java.lang.IllegalStateException(("Unexpected node type: " + key));
	}

	static com.google.javascript.rhino.jstype.JSType getObjectLitKeyTypeFromValueType(com.google.javascript.rhino.Node key, com.google.javascript.rhino.jstype.JSType valueType) {
		if (valueType != null) {
			switch (key.getType()) {
				case com.google.javascript.rhino.Token.GET :
					if (valueType.isFunctionType()) {
						com.google.javascript.rhino.jstype.FunctionType fntype = valueType.toMaybeFunctionType();
						valueType = fntype.getReturnType();
					}else {
						return null;
					}
					break;
				case com.google.javascript.rhino.Token.SET :
					if (valueType.isFunctionType()) {
						com.google.javascript.rhino.jstype.FunctionType fntype = valueType.toMaybeFunctionType();
						com.google.javascript.rhino.Node param = fntype.getParametersNode().getFirstChild();
						valueType = param.getJSType();
					}else {
						return null;
					}
					break;
			}
		}
		return valueType;
	}

	static boolean isGetOrSetKey(com.google.javascript.rhino.Node node) {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.GET :
			case com.google.javascript.rhino.Token.SET :
				return true;
		}
		return false;
	}

	static java.lang.String opToStr(int operator) {
		switch (operator) {
			case com.google.javascript.rhino.Token.BITOR :
				return "|";
			case com.google.javascript.rhino.Token.OR :
				return "||";
			case com.google.javascript.rhino.Token.BITXOR :
				return "^";
			case com.google.javascript.rhino.Token.AND :
				return "&&";
			case com.google.javascript.rhino.Token.BITAND :
				return "&";
			case com.google.javascript.rhino.Token.SHEQ :
				return "===";
			case com.google.javascript.rhino.Token.EQ :
				return "==";
			case com.google.javascript.rhino.Token.NOT :
				return "!";
			case com.google.javascript.rhino.Token.NE :
				return "!=";
			case com.google.javascript.rhino.Token.SHNE :
				return "!==";
			case com.google.javascript.rhino.Token.LSH :
				return "<<";
			case com.google.javascript.rhino.Token.IN :
				return "in";
			case com.google.javascript.rhino.Token.LE :
				return "<=";
			case com.google.javascript.rhino.Token.LT :
				return "<";
			case com.google.javascript.rhino.Token.URSH :
				return ">>>";
			case com.google.javascript.rhino.Token.RSH :
				return ">>";
			case com.google.javascript.rhino.Token.GE :
				return ">=";
			case com.google.javascript.rhino.Token.GT :
				return ">";
			case com.google.javascript.rhino.Token.MUL :
				return "*";
			case com.google.javascript.rhino.Token.DIV :
				return "/";
			case com.google.javascript.rhino.Token.MOD :
				return "%";
			case com.google.javascript.rhino.Token.BITNOT :
				return "~";
			case com.google.javascript.rhino.Token.ADD :
				return "+";
			case com.google.javascript.rhino.Token.SUB :
				return "-";
			case com.google.javascript.rhino.Token.POS :
				return "+";
			case com.google.javascript.rhino.Token.NEG :
				return "-";
			case com.google.javascript.rhino.Token.ASSIGN :
				return "=";
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
				return "|=";
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
				return "^=";
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
				return "&=";
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
				return "<<=";
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
				return ">>=";
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
				return ">>>=";
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
				return "+=";
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
				return "-=";
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
				return "*=";
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
				return "/=";
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
				return "%=";
			case com.google.javascript.rhino.Token.VOID :
				return "void";
			case com.google.javascript.rhino.Token.TYPEOF :
				return "typeof";
			case com.google.javascript.rhino.Token.INSTANCEOF :
				return "instanceof";
			default :
				return null;
		}
	}

	static java.lang.String opToStrNoFail(int operator) {
		java.lang.String res = com.google.javascript.jscomp.NodeUtil.opToStr(operator);
		if (res == null) {
			throw new java.lang.Error(((("Unknown op " + operator) + ": ") + (com.google.javascript.rhino.Token.name(operator))));
		}
		return res;
	}

	static boolean containsType(com.google.javascript.rhino.Node node, int type, com.google.common.base.Predicate<com.google.javascript.rhino.Node> traverseChildrenPred) {
		return com.google.javascript.jscomp.NodeUtil.has(node, new com.google.javascript.jscomp.NodeUtil.MatchNodeType(type), traverseChildrenPred);
	}

	static boolean containsType(com.google.javascript.rhino.Node node, int type) {
		return com.google.javascript.jscomp.NodeUtil.containsType(node, type, com.google.common.base.Predicates.<com.google.javascript.rhino.Node>alwaysTrue());
	}

	static void redeclareVarsInsideBranch(com.google.javascript.rhino.Node branch) {
		java.util.Collection<com.google.javascript.rhino.Node> vars = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(branch);
		if (vars.isEmpty()) {
			return ;
		}
		com.google.javascript.rhino.Node parent = com.google.javascript.jscomp.NodeUtil.getAddingRoot(branch);
		for (com.google.javascript.rhino.Node nameNode : vars) {
			com.google.javascript.rhino.Node var = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, nameNode.getString()).copyInformationFrom(nameNode)).copyInformationFrom(nameNode);
			com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(nameNode, var.getFirstChild());
			parent.addChildToFront(var);
		}
	}

	static void copyNameAnnotations(com.google.javascript.rhino.Node source, com.google.javascript.rhino.Node destination) {
		if (source.getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME)) {
			destination.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
		}
	}

	private static com.google.javascript.rhino.Node getAddingRoot(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node addingRoot = null;
		com.google.javascript.rhino.Node ancestor = n;
		while (null != (ancestor = ancestor.getParent())) {
			int type = ancestor.getType();
			if (type == (com.google.javascript.rhino.Token.SCRIPT)) {
				addingRoot = ancestor;
				break;
			}else
				if (type == (com.google.javascript.rhino.Token.FUNCTION)) {
					addingRoot = ancestor.getLastChild();
					break;
				}
			
		} 
		com.google.common.base.Preconditions.checkState((((addingRoot.getType()) == (com.google.javascript.rhino.Token.BLOCK)) || ((addingRoot.getType()) == (com.google.javascript.rhino.Token.SCRIPT))));
		com.google.common.base.Preconditions.checkState((((addingRoot.getFirstChild()) == null) || ((addingRoot.getFirstChild().getType()) != (com.google.javascript.rhino.Token.SCRIPT))));
		return addingRoot;
	}

	public static com.google.javascript.rhino.Node newFunctionNode(java.lang.String name, java.util.List<com.google.javascript.rhino.Node> params, com.google.javascript.rhino.Node body, int lineno, int charno) {
		com.google.javascript.rhino.Node parameterParen = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.LP, lineno, charno);
		for (com.google.javascript.rhino.Node param : params) {
			parameterParen.addChildToBack(param);
		}
		com.google.javascript.rhino.Node function = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FUNCTION, lineno, charno);
		function.addChildrenToBack(com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name, lineno, charno));
		function.addChildToBack(parameterParen);
		function.addChildToBack(body);
		return function;
	}

	public static com.google.javascript.rhino.Node newQualifiedNameNode(com.google.javascript.jscomp.CodingConvention convention, java.lang.String name, int lineno, int charno) {
		int endPos = name.indexOf('.');
		if (endPos == (-1)) {
			return com.google.javascript.jscomp.NodeUtil.newName(convention, name, lineno, charno);
		}
		com.google.javascript.rhino.Node node = com.google.javascript.jscomp.NodeUtil.newName(convention, name.substring(0, endPos), lineno, charno);
		int startPos;
		do {
			startPos = endPos + 1;
			endPos = name.indexOf('.', startPos);
			java.lang.String part = endPos == (-1) ? name.substring(startPos) : name.substring(startPos, endPos);
			com.google.javascript.rhino.Node propNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.STRING, part, lineno, charno);
			if (convention.isConstantKey(part)) {
				propNode.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
			}
			node = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETPROP, node, propNode, lineno, charno);
		} while (endPos != (-1) );
		return node;
	}

	static com.google.javascript.rhino.Node newQualifiedNameNode(com.google.javascript.jscomp.CodingConvention convention, java.lang.String name, com.google.javascript.rhino.Node basisNode, java.lang.String originalName) {
		com.google.javascript.rhino.Node node = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(convention, name, (-1), (-1));
		com.google.javascript.jscomp.NodeUtil.setDebugInformation(node, basisNode, originalName);
		return node;
	}

	public static com.google.javascript.rhino.Node getRootOfQualifiedName(com.google.javascript.rhino.Node qName) {
		for (com.google.javascript.rhino.Node current = qName; true; current = current.getFirstChild()) {
			int type = current.getType();
			if ((type == (com.google.javascript.rhino.Token.NAME)) || (type == (com.google.javascript.rhino.Token.THIS))) {
				return current;
			}
			com.google.common.base.Preconditions.checkState((type == (com.google.javascript.rhino.Token.GETPROP)));
		}
	}

	static void setDebugInformation(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node basisNode, java.lang.String originalName) {
		node.copyInformationFromForTree(basisNode);
		node.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, originalName);
	}

	private static com.google.javascript.rhino.Node newName(com.google.javascript.jscomp.CodingConvention convention, java.lang.String name, int lineno, int charno) {
		com.google.javascript.rhino.Node nameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name, lineno, charno);
		if (convention.isConstant(name)) {
			nameNode.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
		}
		return nameNode;
	}

	static com.google.javascript.rhino.Node newName(com.google.javascript.jscomp.CodingConvention convention, java.lang.String name, com.google.javascript.rhino.Node basisNode) {
		com.google.javascript.rhino.Node nameNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name);
		if (convention.isConstantKey(name)) {
			nameNode.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
		}
		nameNode.copyInformationFrom(basisNode);
		return nameNode;
	}

	static com.google.javascript.rhino.Node newName(com.google.javascript.jscomp.CodingConvention convention, java.lang.String name, com.google.javascript.rhino.Node basisNode, java.lang.String originalName) {
		com.google.javascript.rhino.Node nameNode = com.google.javascript.jscomp.NodeUtil.newName(convention, name, basisNode);
		nameNode.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, originalName);
		return nameNode;
	}

	static boolean isLatin(java.lang.String s) {
		char LARGEST_BASIC_LATIN = 127;
		int len = s.length();
		for (int index = 0; index < len; index++) {
			char c = s.charAt(index);
			if (c > LARGEST_BASIC_LATIN) {
				return false;
			}
		}
		return true;
	}

	public static boolean isValidSimpleName(java.lang.String name) {
		return ((com.google.javascript.rhino.TokenStream.isJSIdentifier(name)) && (!(com.google.javascript.rhino.TokenStream.isKeyword(name)))) && (com.google.javascript.jscomp.NodeUtil.isLatin(name));
	}

	public static boolean isValidQualifiedName(java.lang.String name) {
		if ((name.endsWith(".")) || (name.startsWith("."))) {
			return false;
		}
		java.lang.String[] parts = name.split("\\.");
		for (java.lang.String part : parts) {
			if (!(com.google.javascript.jscomp.NodeUtil.isValidSimpleName(part))) {
				return false;
			}
		}
		return true;
	}

	static boolean isValidPropertyName(java.lang.String name) {
		return com.google.javascript.jscomp.NodeUtil.isValidSimpleName(name);
	}

	private static class VarCollector implements com.google.javascript.jscomp.NodeUtil.Visitor {
		final java.util.Map<java.lang.String, com.google.javascript.rhino.Node> vars = com.google.common.collect.Maps.newLinkedHashMap();

		@java.lang.Override
		public void visit(com.google.javascript.rhino.Node n) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) {
				com.google.javascript.rhino.Node parent = n.getParent();
				if ((parent != null) && ((parent.getType()) == (com.google.javascript.rhino.Token.VAR))) {
					java.lang.String name = n.getString();
					if (!(vars.containsKey(name))) {
						vars.put(name, n);
					}
				}
			}
		}
	}

	public static java.util.Collection<com.google.javascript.rhino.Node> getVarsDeclaredInBranch(com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeUtil.VarCollector collector = new com.google.javascript.jscomp.NodeUtil.VarCollector();
		com.google.javascript.jscomp.NodeUtil.visitPreOrder(root, collector, com.google.javascript.jscomp.NodeUtil.MATCH_NOT_FUNCTION);
		return collector.vars.values();
	}

	static boolean isPrototypePropertyDeclaration(com.google.javascript.rhino.Node n) {
		if (!(com.google.javascript.jscomp.NodeUtil.isExprAssign(n))) {
			return false;
		}
		return com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(n.getFirstChild().getFirstChild());
	}

	static boolean isPrototypeProperty(com.google.javascript.rhino.Node n) {
		java.lang.String lhsString = n.getQualifiedName();
		if (lhsString == null) {
			return false;
		}
		int prototypeIdx = lhsString.indexOf(".prototype.");
		return prototypeIdx != (-1);
	}

	static com.google.javascript.rhino.Node getPrototypeClassName(com.google.javascript.rhino.Node qName) {
		com.google.javascript.rhino.Node cur = qName;
		while (com.google.javascript.jscomp.NodeUtil.isGetProp(cur)) {
			if (cur.getLastChild().getString().equals("prototype")) {
				return cur.getFirstChild();
			}else {
				cur = cur.getFirstChild();
			}
		} 
		return null;
	}

	static java.lang.String getPrototypePropertyName(com.google.javascript.rhino.Node qName) {
		java.lang.String qNameStr = qName.getQualifiedName();
		int prototypeIdx = qNameStr.lastIndexOf(".prototype.");
		int memberIndex = (prototypeIdx + (".prototype".length())) + 1;
		return qNameStr.substring(memberIndex);
	}

	static com.google.javascript.rhino.Node newUndefinedNode(com.google.javascript.rhino.Node srcReferenceNode) {
		com.google.javascript.rhino.Node node = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VOID, com.google.javascript.rhino.Node.newNumber(0));
		if (srcReferenceNode != null) {
			node.copyInformationFromForTree(srcReferenceNode);
		}
		return node;
	}

	static com.google.javascript.rhino.Node newVarNode(java.lang.String name, com.google.javascript.rhino.Node value) {
		com.google.javascript.rhino.Node nodeName = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name);
		if (value != null) {
			com.google.common.base.Preconditions.checkState(((value.getNext()) == null));
			nodeName.addChildToBack(value);
			nodeName.copyInformationFrom(value);
		}
		com.google.javascript.rhino.Node var = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, nodeName).copyInformationFrom(nodeName);
		return var;
	}

	private static class MatchNameNode implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
		final java.lang.String name;

		MatchNameNode(java.lang.String name) {
			this.name = name;
		}

		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			return ((n.getType()) == (com.google.javascript.rhino.Token.NAME)) && (n.getString().equals(name));
		}
	}

	static class MatchNodeType implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
		final int type;

		MatchNodeType(int type) {
			this.type = type;
		}

		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			return (n.getType()) == (type);
		}
	}

	static class MatchDeclaration implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			return (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) || ((n.getType()) == (com.google.javascript.rhino.Token.VAR));
		}
	}

	static class MatchNotFunction implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			return !(com.google.javascript.jscomp.NodeUtil.isFunction(n));
		}
	}

	static final com.google.common.base.Predicate<com.google.javascript.rhino.Node> MATCH_NOT_FUNCTION = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();

	static class MatchShallowStatement implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node parent = n.getParent();
			return ((n.getType()) == (com.google.javascript.rhino.Token.BLOCK)) || ((!(com.google.javascript.jscomp.NodeUtil.isFunction(n))) && (((parent == null) || (com.google.javascript.jscomp.NodeUtil.isControlStructure(parent))) || (com.google.javascript.jscomp.NodeUtil.isStatementBlock(parent))));
		}
	}

	static int getNodeTypeReferenceCount(com.google.javascript.rhino.Node node, int type, com.google.common.base.Predicate<com.google.javascript.rhino.Node> traverseChildrenPred) {
		return com.google.javascript.jscomp.NodeUtil.getCount(node, new com.google.javascript.jscomp.NodeUtil.MatchNodeType(type), traverseChildrenPred);
	}

	static boolean isNameReferenced(com.google.javascript.rhino.Node node, java.lang.String name, com.google.common.base.Predicate<com.google.javascript.rhino.Node> traverseChildrenPred) {
		return com.google.javascript.jscomp.NodeUtil.has(node, new com.google.javascript.jscomp.NodeUtil.MatchNameNode(name), traverseChildrenPred);
	}

	static boolean isNameReferenced(com.google.javascript.rhino.Node node, java.lang.String name) {
		return com.google.javascript.jscomp.NodeUtil.isNameReferenced(node, name, com.google.common.base.Predicates.<com.google.javascript.rhino.Node>alwaysTrue());
	}

	static int getNameReferenceCount(com.google.javascript.rhino.Node node, java.lang.String name) {
		return com.google.javascript.jscomp.NodeUtil.getCount(node, new com.google.javascript.jscomp.NodeUtil.MatchNameNode(name), com.google.common.base.Predicates.<com.google.javascript.rhino.Node>alwaysTrue());
	}

	static boolean has(com.google.javascript.rhino.Node node, com.google.common.base.Predicate<com.google.javascript.rhino.Node> pred, com.google.common.base.Predicate<com.google.javascript.rhino.Node> traverseChildrenPred) {
		if (pred.apply(node)) {
			return true;
		}
		if (!(traverseChildrenPred.apply(node))) {
			return false;
		}
		for (com.google.javascript.rhino.Node c = node.getFirstChild(); c != null; c = c.getNext()) {
			if (com.google.javascript.jscomp.NodeUtil.has(c, pred, traverseChildrenPred)) {
				return true;
			}
		}
		return false;
	}

	static int getCount(com.google.javascript.rhino.Node n, com.google.common.base.Predicate<com.google.javascript.rhino.Node> pred, com.google.common.base.Predicate<com.google.javascript.rhino.Node> traverseChildrenPred) {
		int total = 0;
		if (pred.apply(n)) {
			total++;
		}
		if (traverseChildrenPred.apply(n)) {
			for (com.google.javascript.rhino.Node c = n.getFirstChild(); c != null; c = c.getNext()) {
				total += com.google.javascript.jscomp.NodeUtil.getCount(c, pred, traverseChildrenPred);
			}
		}
		return total;
	}

	static interface Visitor {
		void visit(com.google.javascript.rhino.Node node);
	}

	static void visitPreOrder(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.NodeUtil.Visitor vistor, com.google.common.base.Predicate<com.google.javascript.rhino.Node> traverseChildrenPred) {
		vistor.visit(node);
		if (traverseChildrenPred.apply(node)) {
			for (com.google.javascript.rhino.Node c = node.getFirstChild(); c != null; c = c.getNext()) {
				com.google.javascript.jscomp.NodeUtil.visitPreOrder(c, vistor, traverseChildrenPred);
			}
		}
	}

	static void visitPostOrder(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.NodeUtil.Visitor vistor, com.google.common.base.Predicate<com.google.javascript.rhino.Node> traverseChildrenPred) {
		if (traverseChildrenPred.apply(node)) {
			for (com.google.javascript.rhino.Node c = node.getFirstChild(); c != null; c = c.getNext()) {
				com.google.javascript.jscomp.NodeUtil.visitPostOrder(c, vistor, traverseChildrenPred);
			}
		}
		vistor.visit(node);
	}

	static boolean hasFinally(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.TRY)));
		return (n.getChildCount()) == 3;
	}

	static com.google.javascript.rhino.Node getCatchBlock(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.TRY)));
		return n.getFirstChild().getNext();
	}

	static boolean hasCatchHandler(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.BLOCK)));
		return (n.hasChildren()) && ((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.CATCH));
	}

	public static com.google.javascript.rhino.Node getFunctionParameters(com.google.javascript.rhino.Node fnNode) {
		com.google.common.base.Preconditions.checkArgument(((fnNode.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
		return fnNode.getFirstChild().getNext();
	}

	static boolean isConstantName(com.google.javascript.rhino.Node node) {
		return node.getBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME);
	}

	static boolean isConstantByConvention(com.google.javascript.jscomp.CodingConvention convention, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
		java.lang.String name = node.getString();
		if (((parent.getType()) == (com.google.javascript.rhino.Token.GETPROP)) && (node == (parent.getLastChild()))) {
			return convention.isConstantKey(name);
		}else
			if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node, parent)) {
				return convention.isConstantKey(name);
			}else {
				return convention.isConstant(name);
			}
		
	}

	static com.google.javascript.rhino.JSDocInfo getInfoForNameNode(com.google.javascript.rhino.Node nameNode) {
		com.google.javascript.rhino.JSDocInfo info = null;
		com.google.javascript.rhino.Node parent = null;
		if (nameNode != null) {
			info = nameNode.getJSDocInfo();
			parent = nameNode.getParent();
		}
		if (((info == null) && (parent != null)) && ((((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) && (parent.hasOneChild())) || ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION)))) {
			info = parent.getJSDocInfo();
		}
		return info;
	}

	public static com.google.javascript.rhino.JSDocInfo getFunctionJSDocInfo(com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
		com.google.javascript.rhino.JSDocInfo fnInfo = n.getJSDocInfo();
		if ((fnInfo == null) && (com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n))) {
			com.google.javascript.rhino.Node parent = n.getParent();
			if ((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) {
				fnInfo = parent.getJSDocInfo();
			}else
				if ((parent.getType()) == (com.google.javascript.rhino.Token.NAME)) {
					fnInfo = parent.getParent().getJSDocInfo();
				}
			
		}
		return fnInfo;
	}

	public static java.lang.String getSourceName(com.google.javascript.rhino.Node n) {
		java.lang.String sourceName = null;
		while ((sourceName == null) && (n != null)) {
			sourceName = n.getSourceFileName();
			n = n.getParent();
		} 
		return sourceName;
	}

	public static com.google.javascript.rhino.jstype.StaticSourceFile getSourceFile(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.jstype.StaticSourceFile sourceName = null;
		while ((sourceName == null) && (n != null)) {
			sourceName = n.getStaticSourceFile();
			n = n.getParent();
		} 
		return sourceName;
	}

	public static com.google.javascript.rhino.InputId getInputId(com.google.javascript.rhino.Node n) {
		while ((n != null) && ((n.getType()) != (com.google.javascript.rhino.Token.SCRIPT))) {
			n = n.getParent();
		} 
		return (n != null) && ((n.getType()) == (com.google.javascript.rhino.Token.SCRIPT)) ? n.getInputId() : null;
	}

	static com.google.javascript.rhino.Node newCallNode(com.google.javascript.rhino.Node callTarget, com.google.javascript.rhino.Node... parameters) {
		boolean isFreeCall = !(com.google.javascript.jscomp.NodeUtil.isGet(callTarget));
		com.google.javascript.rhino.Node call = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, callTarget);
		call.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, isFreeCall);
		for (com.google.javascript.rhino.Node parameter : parameters) {
			call.addChildToBack(parameter);
		}
		return call;
	}

	static boolean evaluatesToLocalValue(com.google.javascript.rhino.Node value) {
		return com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value, com.google.common.base.Predicates.<com.google.javascript.rhino.Node>alwaysFalse());
	}

	static boolean evaluatesToLocalValue(com.google.javascript.rhino.Node value, com.google.common.base.Predicate<com.google.javascript.rhino.Node> locals) {
		switch (value.getType()) {
			case com.google.javascript.rhino.Token.ASSIGN :
				return (com.google.javascript.jscomp.NodeUtil.isImmutableValue(value.getLastChild())) || ((locals.apply(value)) && (com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value.getLastChild(), locals)));
			case com.google.javascript.rhino.Token.COMMA :
				return com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value.getLastChild(), locals);
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
				return (com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value.getFirstChild(), locals)) && (com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value.getLastChild(), locals));
			case com.google.javascript.rhino.Token.HOOK :
				return (com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value.getFirstChild().getNext(), locals)) && (com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value.getLastChild(), locals));
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
				if (value.getBooleanProp(com.google.javascript.rhino.Node.INCRDECR_PROP)) {
					return com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(value.getFirstChild(), locals);
				}else {
					return true;
				}
			case com.google.javascript.rhino.Token.THIS :
				return locals.apply(value);
			case com.google.javascript.rhino.Token.NAME :
				return (com.google.javascript.jscomp.NodeUtil.isImmutableValue(value)) || (locals.apply(value));
			case com.google.javascript.rhino.Token.GETELEM :
			case com.google.javascript.rhino.Token.GETPROP :
				return locals.apply(value);
			case com.google.javascript.rhino.Token.CALL :
				return ((com.google.javascript.jscomp.NodeUtil.callHasLocalResult(value)) || (com.google.javascript.jscomp.NodeUtil.isToStringMethodCall(value))) || (locals.apply(value));
			case com.google.javascript.rhino.Token.NEW :
				return (com.google.javascript.jscomp.NodeUtil.newHasLocalResult(value)) || (locals.apply(value));
			case com.google.javascript.rhino.Token.FUNCTION :
			case com.google.javascript.rhino.Token.REGEXP :
			case com.google.javascript.rhino.Token.ARRAYLIT :
			case com.google.javascript.rhino.Token.OBJECTLIT :
				return true;
			case com.google.javascript.rhino.Token.DELPROP :
			case com.google.javascript.rhino.Token.IN :
				return true;
			default :
				if (((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(value)) || (com.google.javascript.jscomp.NodeUtil.isSimpleOperator(value))) || (com.google.javascript.jscomp.NodeUtil.isImmutableValue(value))) {
					return true;
				}
				throw new java.lang.IllegalStateException(((("Unexpected expression node" + value) + "\n parent:") + (value.getParent())));
		}
	}

	private static com.google.javascript.rhino.Node getNthSibling(com.google.javascript.rhino.Node first, int index) {
		com.google.javascript.rhino.Node sibling = first;
		while ((index != 0) && (sibling != null)) {
			sibling = sibling.getNext();
			index--;
		} 
		return sibling;
	}

	static com.google.javascript.rhino.Node getArgumentForFunction(com.google.javascript.rhino.Node function, int index) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isFunction(function));
		return com.google.javascript.jscomp.NodeUtil.getNthSibling(function.getFirstChild().getNext().getFirstChild(), index);
	}

	static com.google.javascript.rhino.Node getArgumentForCallOrNew(com.google.javascript.rhino.Node call, int index) {
		com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.NodeUtil.isCallOrNew(call));
		return com.google.javascript.jscomp.NodeUtil.getNthSibling(call.getFirstChild().getNext(), index);
	}

	private static boolean isToStringMethodCall(com.google.javascript.rhino.Node call) {
		com.google.javascript.rhino.Node getNode = call.getFirstChild();
		if (com.google.javascript.jscomp.NodeUtil.isGet(getNode)) {
			com.google.javascript.rhino.Node propNode = getNode.getLastChild();
			return (com.google.javascript.jscomp.NodeUtil.isString(propNode)) && ("toString".equals(propNode.getString()));
		}
		return false;
	}

	static com.google.javascript.rhino.JSDocInfo getBestJSDocInfo(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
		if (info == null) {
			com.google.javascript.rhino.Node parent = n.getParent();
			if (parent == null) {
				return null;
			}
			int parentType = parent.getType();
			if (parentType == (com.google.javascript.rhino.Token.NAME)) {
				info = parent.getJSDocInfo();
				if ((info == null) && (parent.getParent().hasOneChild())) {
					info = parent.getParent().getJSDocInfo();
				}
			}else
				if (parentType == (com.google.javascript.rhino.Token.ASSIGN)) {
					info = parent.getJSDocInfo();
				}else
					if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(parent, parent.getParent())) {
						info = parent.getJSDocInfo();
					}
				
			
		}
		return info;
	}

	static com.google.javascript.rhino.Node getBestLValue(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node parent = n.getParent();
		int parentType = parent.getType();
		boolean isFunctionDeclaration = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n);
		if (isFunctionDeclaration) {
			return n.getFirstChild();
		}else
			if (parentType == (com.google.javascript.rhino.Token.NAME)) {
				return parent;
			}else
				if (parentType == (com.google.javascript.rhino.Token.ASSIGN)) {
					return parent.getFirstChild();
				}else
					if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(parent, parent.getParent())) {
						return parent;
					}
				
			
		
		return null;
	}

	static com.google.javascript.rhino.Node getBestLValueOwner(@javax.annotation.Nullable
	com.google.javascript.rhino.Node lValue) {
		if ((lValue == null) || ((lValue.getParent()) == null)) {
			return null;
		}
		if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(lValue, lValue.getParent())) {
			return com.google.javascript.jscomp.NodeUtil.getBestLValue(lValue.getParent());
		}else
			if (com.google.javascript.jscomp.NodeUtil.isGet(lValue)) {
				return lValue.getFirstChild();
			}
		
		return null;
	}

	static java.lang.String getBestLValueName(@javax.annotation.Nullable
	com.google.javascript.rhino.Node lValue) {
		if ((lValue == null) || ((lValue.getParent()) == null)) {
			return null;
		}
		if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(lValue, lValue.getParent())) {
			com.google.javascript.rhino.Node owner = com.google.javascript.jscomp.NodeUtil.getBestLValue(lValue.getParent());
			if (owner != null) {
				java.lang.String ownerName = com.google.javascript.jscomp.NodeUtil.getBestLValueName(owner);
				if (ownerName != null) {
					return (ownerName + ".") + (com.google.javascript.jscomp.NodeUtil.getObjectLitKeyName(lValue));
				}
			}
			return null;
		}
		return lValue.getQualifiedName();
	}
}

