

package com.google.javascript.rhino.jstype;


public class FunctionParamBuilder {
	private final com.google.javascript.rhino.jstype.JSTypeRegistry registry;

	private final com.google.javascript.rhino.Node root = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.LP);

	public FunctionParamBuilder(com.google.javascript.rhino.jstype.JSTypeRegistry registry) {
		this.registry = registry;
	}

	public boolean addRequiredParams(com.google.javascript.rhino.jstype.JSType... types) {
		if (hasOptionalOrVarArgs()) {
			return false;
		}
		for (com.google.javascript.rhino.jstype.JSType type : types) {
			newParameter(type);
		}
		return true;
	}

	public boolean addOptionalParams(com.google.javascript.rhino.jstype.JSType... types) {
		if (hasVarArgs()) {
			return false;
		}
		for (com.google.javascript.rhino.jstype.JSType type : types) {
			newParameter(registry.createOptionalType(type)).setOptionalArg(true);
		}
		return true;
	}

	public boolean addVarArgs(com.google.javascript.rhino.jstype.JSType type) {
		if (hasVarArgs()) {
			return false;
		}
		if (!(type.isEmptyType())) {
			type = registry.createOptionalType(type);
		}
		newParameter(type).setVarArgs(true);
		return true;
	}

	public com.google.javascript.rhino.Node newParameterFromNode(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node newParam = newParameter(n.getJSType());
		newParam.setVarArgs(n.isVarArgs());
		newParam.setOptionalArg(n.isOptionalArg());
		return newParam;
	}

	private com.google.javascript.rhino.Node newParameter(com.google.javascript.rhino.jstype.JSType type) {
		com.google.javascript.rhino.Node paramNode = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "");
		paramNode.setJSType(type);
		root.addChildToBack(paramNode);
		return paramNode;
	}

	public com.google.javascript.rhino.Node build() {
		return root;
	}

	private boolean hasOptionalOrVarArgs() {
		com.google.javascript.rhino.Node lastChild = root.getLastChild();
		return (lastChild != null) && ((lastChild.isOptionalArg()) || (lastChild.isVarArgs()));
	}

	public boolean hasVarArgs() {
		com.google.javascript.rhino.Node lastChild = root.getLastChild();
		return (lastChild != null) && (lastChild.isVarArgs());
	}
}

