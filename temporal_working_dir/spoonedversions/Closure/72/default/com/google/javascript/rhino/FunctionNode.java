

package com.google.javascript.rhino;


public class FunctionNode extends com.google.javascript.rhino.ScriptOrFnNode {
	private static final long serialVersionUID = 1L;

	public FunctionNode(java.lang.String name) {
		super(com.google.javascript.rhino.Token.FUNCTION);
		functionName = name;
	}

	public FunctionNode(java.lang.String name, int lineno, int charno) {
		super(com.google.javascript.rhino.Token.FUNCTION, lineno, charno);
		functionName = name;
	}

	public java.lang.String getFunctionName() {
		return functionName;
	}

	public boolean requiresActivation() {
		return itsNeedsActivation;
	}

	public boolean getIgnoreDynamicScope() {
		return itsIgnoreDynamicScope;
	}

	public static final int FUNCTION_STATEMENT = 1;

	public static final int FUNCTION_EXPRESSION = 2;

	public static final int FUNCTION_EXPRESSION_STATEMENT = 3;

	public int getFunctionType() {
		return itsFunctionType;
	}

	java.lang.String functionName;

	boolean itsNeedsActivation;

	int itsFunctionType;

	boolean itsIgnoreDynamicScope;
}

