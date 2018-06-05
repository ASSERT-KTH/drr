

package com.google.javascript.jscomp;


class TypedCodeGenerator extends com.google.javascript.jscomp.CodeGenerator {
	TypedCodeGenerator(com.google.javascript.jscomp.CodeConsumer consumer, java.nio.charset.Charset outputCharset) {
		super(consumer, outputCharset);
	}

	@java.lang.Override
	void add(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CodeGenerator.Context context) {
		com.google.javascript.rhino.Node parent = n.getParent();
		if ((parent != null) && (((parent.getType()) == (com.google.javascript.rhino.Token.BLOCK)) || ((parent.getType()) == (com.google.javascript.rhino.Token.SCRIPT)))) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
				add(getFunctionAnnotation(n));
			}else
				if (((n.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) && ((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.ASSIGN))) {
					com.google.javascript.rhino.Node rhs = n.getFirstChild().getLastChild();
					add(getTypeAnnotation(rhs));
				}else
					if ((((n.getType()) == (com.google.javascript.rhino.Token.VAR)) && ((n.getFirstChild().getFirstChild()) != null)) && ((n.getFirstChild().getFirstChild().getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
						add(getFunctionAnnotation(n.getFirstChild().getFirstChild()));
					}
				
			
		}
		super.add(n, context);
	}

	private java.lang.String getTypeAnnotation(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.jstype.JSType type = node.getJSType();
		if (type instanceof com.google.javascript.rhino.jstype.FunctionType) {
			return getFunctionAnnotation(node);
		}else
			if (((((type != null) && (!(type.isUnknownType()))) && (!(type.isEmptyType()))) && (!(type.isVoidType()))) && (!(type.isFunctionPrototypeType()))) {
				return ("/** @type {" + (node.getJSType())) + "} */\n";
			}else {
				return "";
			}
		
	}

	private java.lang.String getFunctionAnnotation(com.google.javascript.rhino.Node fnNode) {
		com.google.common.base.Preconditions.checkState(((fnNode.getType()) == (com.google.javascript.rhino.Token.FUNCTION)));
		java.lang.StringBuilder sb = new java.lang.StringBuilder("/**\n");
		com.google.javascript.rhino.jstype.JSType type = fnNode.getJSType();
		if ((type == null) || (type.isUnknownType())) {
			return "";
		}
		com.google.javascript.rhino.jstype.FunctionType funType = ((com.google.javascript.rhino.jstype.FunctionType) (fnNode.getJSType()));
		if (fnNode != null) {
			com.google.javascript.rhino.Node paramNode = com.google.javascript.jscomp.NodeUtil.getFnParameters(fnNode).getFirstChild();
			for (com.google.javascript.rhino.Node n : funType.getParameters()) {
				if (paramNode == null) {
					break;
				}
				sb.append(((" * @param {" + (getParameterNodeJSDocType(n))) + "} "));
				sb.append(paramNode.getString());
				sb.append("\n");
				paramNode = paramNode.getNext();
			}
		}
		com.google.javascript.rhino.jstype.JSType retType = funType.getReturnType();
		if (((retType != null) && (!(retType.isUnknownType()))) && (!(retType.isEmptyType()))) {
			sb.append(((" * @return {" + retType) + "}\n"));
		}
		if ((funType.isConstructor()) || (funType.isInterface())) {
			com.google.javascript.rhino.jstype.FunctionType superConstructor = funType.getSuperClassConstructor();
			if (superConstructor != null) {
				com.google.javascript.rhino.jstype.ObjectType superInstance = funType.getSuperClassConstructor().getInstanceType();
				if (!(superInstance.toString().equals("Object"))) {
					sb.append(((" * @extends {" + superInstance) + "}\n"));
				}
			}
			java.util.Set<java.lang.String> interfaces = com.google.common.collect.Sets.newTreeSet();
			for (com.google.javascript.rhino.jstype.ObjectType interfaze : funType.getImplementedInterfaces()) {
				interfaces.add(interfaze.toString());
			}
			for (java.lang.String interfaze : interfaces) {
				sb.append(((" * @implements {" + interfaze) + "}\n"));
			}
			if (funType.isConstructor()) {
				sb.append(" * @constructor\n");
			}else
				if (funType.isInterface()) {
					sb.append(" * @interface\n");
				}
			
		}
		if ((fnNode != null) && (fnNode.getBooleanProp(com.google.javascript.rhino.Node.IS_DISPATCHER))) {
			sb.append(" * @javadispatch\n");
		}
		sb.append(" */\n");
		return sb.toString();
	}

	private java.lang.String getParameterNodeJSDocType(com.google.javascript.rhino.Node parameterNode) {
		com.google.javascript.rhino.jstype.JSType parameterType = parameterNode.getJSType();
		java.lang.String typeString;
		if (parameterType.isUnknownType()) {
			typeString = "*";
		}else {
			if (parameterNode.isOptionalArg()) {
				typeString = (parameterType.restrictByNotNullOrUndefined()) + "=";
			}else
				if (parameterNode.isVarArgs()) {
					typeString = "..." + (parameterType.restrictByNotNullOrUndefined());
				}else {
					typeString = parameterType.toString();
				}
			
		}
		return typeString;
	}
}

