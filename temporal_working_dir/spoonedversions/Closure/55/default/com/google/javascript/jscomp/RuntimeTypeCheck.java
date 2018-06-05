

package com.google.javascript.jscomp;


class RuntimeTypeCheck implements com.google.javascript.jscomp.CompilerPass {
	private static final java.util.Comparator<com.google.javascript.rhino.jstype.JSType> ALPHA = new java.util.Comparator<com.google.javascript.rhino.jstype.JSType>() {
		@java.lang.Override
		public int compare(com.google.javascript.rhino.jstype.JSType t1, com.google.javascript.rhino.jstype.JSType t2) {
			return getName(t1).compareTo(getName(t2));
		}

		private java.lang.String getName(com.google.javascript.rhino.jstype.JSType type) {
			if (type.isInstanceType()) {
				return ((com.google.javascript.rhino.jstype.ObjectType) (type)).getReferenceName();
			}else
				if (((((type.isNullType()) || (type.isBooleanValueType())) || (type.isNumberValueType())) || (type.isStringValueType())) || (type.isVoidType())) {
					return type.toString();
				}else {
					return "";
				}
			
		}
	};

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.lang.String logFunction;

	RuntimeTypeCheck(com.google.javascript.jscomp.AbstractCompiler compiler, @javax.annotation.Nullable
	java.lang.String logFunction) {
		this.compiler = compiler;
		this.logFunction = logFunction;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RuntimeTypeCheck.AddMarkers(compiler));
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RuntimeTypeCheck.AddChecks());
		addBoilerplateCode();
	}

	private static class AddMarkers extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private AddMarkers(com.google.javascript.jscomp.AbstractCompiler compiler) {
			this.compiler = compiler;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (com.google.javascript.jscomp.NodeUtil.isFunction(n)) {
				visitFunction(t, n);
			}
		}

		private void visitFunction(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.jstype.FunctionType funType = n.getJSType().toMaybeFunctionType();
			if ((funType != null) && (!(funType.isConstructor()))) {
				return ;
			}
			com.google.javascript.rhino.Node nodeToInsertAfter = findNodeToInsertAfter(n);
			nodeToInsertAfter = addMarker(funType, nodeToInsertAfter, null);
			java.util.TreeSet<com.google.javascript.rhino.jstype.ObjectType> stuff = com.google.common.collect.Sets.newTreeSet(com.google.javascript.jscomp.RuntimeTypeCheck.ALPHA);
			com.google.common.collect.Iterables.addAll(stuff, funType.getAllImplementedInterfaces());
			for (com.google.javascript.rhino.jstype.ObjectType interfaceType : stuff) {
				nodeToInsertAfter = addMarker(funType, nodeToInsertAfter, interfaceType);
			}
		}

		private com.google.javascript.rhino.Node addMarker(com.google.javascript.rhino.jstype.FunctionType funType, com.google.javascript.rhino.Node nodeToInsertAfter, @javax.annotation.Nullable
		com.google.javascript.rhino.jstype.ObjectType interfaceType) {
			if ((funType.getSource()) == null) {
				return nodeToInsertAfter;
			}
			java.lang.String className = com.google.javascript.jscomp.NodeUtil.getFunctionName(funType.getSource());
			if (className == null) {
				return nodeToInsertAfter;
			}
			com.google.javascript.rhino.Node classNode = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), className, (-1), (-1));
			com.google.javascript.rhino.Node marker = com.google.javascript.rhino.Node.newString((interfaceType == null ? "instance_of__" + className : "implements__" + (interfaceType.getReferenceName())));
			com.google.javascript.rhino.Node assign = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETELEM, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETPROP, classNode, com.google.javascript.rhino.Node.newString("prototype")), marker), new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.TRUE)));
			nodeToInsertAfter.getParent().addChildAfter(assign, nodeToInsertAfter);
			compiler.reportCodeChange();
			nodeToInsertAfter = assign;
			return nodeToInsertAfter;
		}

		private com.google.javascript.rhino.Node findNodeToInsertAfter(com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node nodeToInsertAfter = findEnclosingConstructorDeclaration(n);
			com.google.javascript.rhino.Node next = nodeToInsertAfter.getNext();
			while ((next != null) && (isClassDefiningCall(next))) {
				nodeToInsertAfter = next;
				next = nodeToInsertAfter.getNext();
			} 
			return nodeToInsertAfter;
		}

		private com.google.javascript.rhino.Node findEnclosingConstructorDeclaration(com.google.javascript.rhino.Node n) {
			while (((n.getParent().getType()) != (com.google.javascript.rhino.Token.SCRIPT)) && ((n.getParent().getType()) != (com.google.javascript.rhino.Token.BLOCK))) {
				n = n.getParent();
			} 
			return n;
		}

		private boolean isClassDefiningCall(com.google.javascript.rhino.Node next) {
			return (com.google.javascript.jscomp.NodeUtil.isExprCall(next)) && ((compiler.getCodingConvention().getClassesDefinedByCall(next.getFirstChild())) != null);
		}
	}

	private class AddChecks extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private AddChecks() {
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (com.google.javascript.jscomp.NodeUtil.isFunction(n)) {
				visitFunction(t, n);
			}else
				if ((n.getType()) == (com.google.javascript.rhino.Token.RETURN)) {
					visitReturn(t, n);
				}
			
		}

		private void visitFunction(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.jstype.FunctionType funType = com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(n.getJSType());
			com.google.javascript.rhino.Node block = n.getLastChild();
			com.google.javascript.rhino.Node paramName = com.google.javascript.jscomp.NodeUtil.getFunctionParameters(n).getFirstChild();
			com.google.javascript.rhino.Node insertionPoint = null;
			for (com.google.javascript.rhino.Node next = block.getFirstChild(); (next != null) && (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(next)); next = next.getNext()) {
				insertionPoint = next;
			}
			for (com.google.javascript.rhino.Node paramType : funType.getParameters()) {
				if (paramName == null) {
					return ;
				}
				com.google.javascript.rhino.Node checkNode = createCheckTypeCallNode(paramType.getJSType(), paramName.cloneTree());
				if (checkNode == null) {
					paramName = paramName.getNext();
					continue;
				}
				checkNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, checkNode);
				if (insertionPoint == null) {
					block.addChildToFront(checkNode);
				}else {
					block.addChildAfter(checkNode, insertionPoint);
				}
				compiler.reportCodeChange();
				paramName = paramName.getNext();
				insertionPoint = checkNode;
			}
		}

		private void visitReturn(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node function = t.getEnclosingFunction();
			com.google.javascript.rhino.jstype.FunctionType funType = function.getJSType().toMaybeFunctionType();
			com.google.javascript.rhino.Node retValue = n.getFirstChild();
			if (retValue == null) {
				return ;
			}
			com.google.javascript.rhino.Node checkNode = createCheckTypeCallNode(funType.getReturnType(), retValue.cloneTree());
			if (checkNode == null) {
				return ;
			}
			n.replaceChild(retValue, checkNode);
			compiler.reportCodeChange();
		}

		private com.google.javascript.rhino.Node createCheckTypeCallNode(com.google.javascript.rhino.jstype.JSType type, com.google.javascript.rhino.Node expr) {
			com.google.javascript.rhino.Node arrayNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ARRAYLIT);
			java.util.Collection<com.google.javascript.rhino.jstype.JSType> alternates;
			if (type.isUnionType()) {
				alternates = com.google.common.collect.Sets.newTreeSet(com.google.javascript.jscomp.RuntimeTypeCheck.ALPHA);
				com.google.common.collect.Iterables.addAll(alternates, type.toMaybeUnionType().getAlternates());
			}else {
				alternates = com.google.common.collect.ImmutableList.of(type);
			}
			for (com.google.javascript.rhino.jstype.JSType alternate : alternates) {
				com.google.javascript.rhino.Node checkerNode = createCheckerNode(alternate);
				if (checkerNode == null) {
					return null;
				}
				arrayNode.addChildToBack(checkerNode);
			}
			return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, jsCode("checkType"), expr, arrayNode);
		}

		private com.google.javascript.rhino.Node createCheckerNode(com.google.javascript.rhino.jstype.JSType type) {
			if (type.isNullType()) {
				return jsCode("nullChecker");
			}else
				if ((((type.isBooleanValueType()) || (type.isNumberValueType())) || (type.isStringValueType())) || (type.isVoidType())) {
					return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, jsCode("valueChecker"), com.google.javascript.rhino.Node.newString(type.toString()));
				}else
					if (type.isInstanceType()) {
						com.google.javascript.rhino.jstype.ObjectType objType = ((com.google.javascript.rhino.jstype.ObjectType) (type));
						java.lang.String refName = objType.getReferenceName();
						com.google.javascript.rhino.jstype.StaticSourceFile sourceFile = com.google.javascript.jscomp.NodeUtil.getSourceFile(objType.getConstructor().getSource());
						if ((sourceFile == null) || (sourceFile.isExtern())) {
							return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, jsCode("externClassChecker"), com.google.javascript.rhino.Node.newString(refName));
						}
						return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, jsCode((objType.getConstructor().isInterface() ? "interfaceChecker" : "classChecker")), com.google.javascript.rhino.Node.newString(refName));
					}else {
						return null;
					}
				
			
		}
	}

	private void addBoilerplateCode() {
		com.google.javascript.rhino.Node js = com.google.javascript.jscomp.RuntimeTypeCheck.getBoilerplateCode(compiler, logFunction);
		compiler.getNodeForCodeInsertion(null).addChildrenToFront(js.removeChildren());
		compiler.reportCodeChange();
	}

	private com.google.javascript.rhino.Node jsCode(java.lang.String prop) {
		return com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), ("jscomp.typecheck." + prop), (-1), (-1));
	}

	@com.google.common.annotations.VisibleForTesting
	static com.google.javascript.rhino.Node getBoilerplateCode(com.google.javascript.jscomp.AbstractCompiler compiler, @javax.annotation.Nullable
	java.lang.String logFunction) {
		java.lang.String boilerplateCode;
		try {
			boilerplateCode = com.google.common.io.CharStreams.toString(new java.io.InputStreamReader(com.google.javascript.jscomp.RuntimeTypeCheck.class.getResourceAsStream("js/runtime_type_check.js"), com.google.common.base.Charsets.UTF_8));
		} catch (java.io.IOException e) {
			throw new java.lang.RuntimeException(e);
		}
		boilerplateCode = boilerplateCode.replace("%%LOG%%", (logFunction == null ? "function(warning, expr) {}" : logFunction));
		return com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(compiler, boilerplateCode, "jscomp_runtimeTypeCheck_");
	}
}

