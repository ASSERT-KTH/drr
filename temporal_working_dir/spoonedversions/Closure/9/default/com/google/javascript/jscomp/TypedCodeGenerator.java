

package com.google.javascript.jscomp;


class TypedCodeGenerator extends com.google.javascript.jscomp.CodeGenerator {
	TypedCodeGenerator(com.google.javascript.jscomp.CodeConsumer consumer, java.nio.charset.Charset outputCharset) {
		super(consumer, outputCharset);
	}

	@java.lang.Override
	void add(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CodeGenerator.Context context) {
		com.google.javascript.rhino.Node parent = n.getParent();
		if ((parent != null) && ((parent.isBlock()) || (parent.isScript()))) {
			if (n.isFunction()) {
				add(getFunctionAnnotation(n));
			}else
				if ((n.isExprResult()) && (n.getFirstChild().isAssign())) {
					com.google.javascript.rhino.Node rhs = n.getFirstChild().getLastChild();
					add(getTypeAnnotation(rhs));
				}else
					if ((n.isVar()) && ((n.getFirstChild().getFirstChild()) != null)) {
						add(getTypeAnnotation(n.getFirstChild().getFirstChild()));
					}
				
			
		}
		super.add(n, context);
	}

	private java.lang.String getTypeAnnotation(com.google.javascript.rhino.Node node) {
		com.google.javascript.rhino.JSDocInfo jsdoc = com.google.javascript.jscomp.NodeUtil.getBestJSDocInfo(node);
		if ((jsdoc == null) && (!(node.isFunction()))) {
			return "";
		}
		com.google.javascript.rhino.jstype.JSType type = node.getJSType();
		if (type == null) {
			return "";
		}else
			if (type.isFunctionType()) {
				return getFunctionAnnotation(node);
			}else
				if (type.isEnumType()) {
					return ("/** @enum {" + (type.toMaybeEnumType().getElementsType().toAnnotationString())) + "} */\n";
				}else
					if ((((!(type.isUnknownType())) && (!(type.isEmptyType()))) && (!(type.isVoidType()))) && (!(type.isFunctionPrototypeType()))) {
						return ("/** @type {" + (node.getJSType().toAnnotationString())) + "} */\n";
					}else {
						return "";
					}
				
			
		
	}

	private java.lang.String getFunctionAnnotation(com.google.javascript.rhino.Node fnNode) {
		com.google.common.base.Preconditions.checkState(fnNode.isFunction());
		java.lang.StringBuilder sb = new java.lang.StringBuilder("/**\n");
		com.google.javascript.rhino.jstype.JSType type = fnNode.getJSType();
		if ((type == null) || (type.isUnknownType())) {
			return "";
		}
		com.google.javascript.rhino.jstype.FunctionType funType = type.toMaybeFunctionType();
		if (fnNode != null) {
			com.google.javascript.rhino.Node paramNode = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(fnNode).getFirstChild();
			for (com.google.javascript.rhino.Node n : funType.getParameters()) {
				if (paramNode == null) {
					break;
				}
				sb.append(" * ");
				appendAnnotation(sb, "param", getParameterNodeJSDocType(n));
				sb.append(" ").append(paramNode.getString()).append("\n");
				paramNode = paramNode.getNext();
			}
		}
		com.google.javascript.rhino.jstype.JSType retType = funType.getReturnType();
		if (((retType != null) && (!(retType.isUnknownType()))) && (!(retType.isEmptyType()))) {
			sb.append(" * ");
			appendAnnotation(sb, "return", retType.toAnnotationString());
			sb.append("\n");
		}
		if ((funType.isConstructor()) || (funType.isInterface())) {
			com.google.javascript.rhino.jstype.FunctionType superConstructor = funType.getSuperClassConstructor();
			if (superConstructor != null) {
				com.google.javascript.rhino.jstype.ObjectType superInstance = funType.getSuperClassConstructor().getInstanceType();
				if (!(superInstance.toString().equals("Object"))) {
					sb.append(" * ");
					appendAnnotation(sb, "extends", superInstance.toAnnotationString());
					sb.append("\n");
				}
			}
			if (funType.isInterface()) {
				for (com.google.javascript.rhino.jstype.ObjectType interfaceType : funType.getExtendedInterfaces()) {
					sb.append(" * ");
					appendAnnotation(sb, "extends", interfaceType.toAnnotationString());
					sb.append("\n");
				}
			}
			java.util.Set<java.lang.String> interfaces = com.google.common.collect.Sets.newTreeSet();
			for (com.google.javascript.rhino.jstype.ObjectType interfaze : funType.getImplementedInterfaces()) {
				interfaces.add(interfaze.toAnnotationString());
			}
			for (java.lang.String interfaze : interfaces) {
				sb.append(" * ");
				appendAnnotation(sb, "implements", interfaze);
				sb.append("\n");
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

	private void appendAnnotation(java.lang.StringBuilder sb, java.lang.String name, java.lang.String type) {
		sb.append("@").append(name).append(" {").append(type).append("}");
	}

	private java.lang.String getParameterNodeJSDocType(com.google.javascript.rhino.Node parameterNode) {
		com.google.javascript.rhino.jstype.JSType parameterType = parameterNode.getJSType();
		java.lang.String typeString;
		if (parameterType.isUnknownType()) {
			typeString = "*";
		}else {
			if (parameterNode.isOptionalArg()) {
				typeString = (parameterType.restrictByNotNullOrUndefined().toAnnotationString()) + "=";
			}else
				if (parameterNode.isVarArgs()) {
					typeString = "..." + (parameterType.restrictByNotNullOrUndefined().toAnnotationString());
				}else {
					typeString = parameterType.toAnnotationString();
				}
			
		}
		return typeString;
	}
}

