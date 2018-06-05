

package com.google.javascript.rhino;


final class IRFactory {
	IRFactory(com.google.javascript.rhino.Parser parser) {
		com.google.javascript.rhino.IRFactory.this.parser = parser;
	}

	com.google.javascript.rhino.ScriptOrFnNode createScript() {
		return new com.google.javascript.rhino.ScriptOrFnNode(com.google.javascript.rhino.Token.SCRIPT);
	}

	void initScript(com.google.javascript.rhino.ScriptOrFnNode scriptNode, com.google.javascript.rhino.Node body) {
		com.google.javascript.rhino.Node children = body.removeChildren();
		if (children != null) {
			scriptNode.addChildrenToBack(children);
		}
	}

	com.google.javascript.rhino.Node createLeaf(int nodeType) {
		return new com.google.javascript.rhino.Node(nodeType);
	}

	com.google.javascript.rhino.Node createLeaf(int nodeType, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(nodeType, lineno, charno);
	}

	com.google.javascript.rhino.Node createSwitch(int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SWITCH, lineno, charno);
	}

	void addSwitchCase(com.google.javascript.rhino.Node switchNode, com.google.javascript.rhino.Node caseExpression, com.google.javascript.rhino.Node statements, int lineno, int charno) {
		if ((switchNode.getType()) != (com.google.javascript.rhino.Token.SWITCH))
			throw com.google.javascript.rhino.Kit.codeBug();
		
		com.google.javascript.rhino.Node caseNode;
		if (caseExpression != null) {
			caseNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CASE, caseExpression, lineno, charno);
		}else {
			caseNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.DEFAULT, lineno, charno);
		}
		caseNode.addChildToBack(statements);
		switchNode.addChildToBack(caseNode);
	}

	void closeSwitch(com.google.javascript.rhino.Node switchBlock) {
	}

	com.google.javascript.rhino.Node createVariables(int token, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(token, lineno, charno);
	}

	com.google.javascript.rhino.Node createExprStatement(com.google.javascript.rhino.Node expr, int lineno, int charno) {
		int type;
		if (parser.insideFunction()) {
			type = com.google.javascript.rhino.Token.EXPR_VOID;
		}else {
			type = com.google.javascript.rhino.Token.EXPR_RESULT;
		}
		return new com.google.javascript.rhino.Node(type, expr, lineno, charno);
	}

	com.google.javascript.rhino.Node createExprStatementNoReturn(com.google.javascript.rhino.Node expr, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_VOID, expr, lineno, charno);
	}

	com.google.javascript.rhino.Node createDefaultNamespace(com.google.javascript.rhino.Node expr, int lineno, int charno) {
		setRequiresActivation();
		com.google.javascript.rhino.Node n = createUnary(com.google.javascript.rhino.Token.DEFAULTNAMESPACE, expr, lineno, charno);
		com.google.javascript.rhino.Node result = createExprStatement(n, lineno, charno);
		return result;
	}

	public com.google.javascript.rhino.Node createErrorName() {
		return com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "error");
	}

	com.google.javascript.rhino.Node createName(java.lang.String name, int lineno, int charno) {
		checkActivationName(name, com.google.javascript.rhino.Token.NAME);
		return com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name, lineno, charno);
	}

	public com.google.javascript.rhino.Node createTaggedName(java.lang.String name, com.google.javascript.rhino.JSDocInfo info, int lineno, int charno) {
		com.google.javascript.rhino.Node n = createName(name, lineno, charno);
		if (info != null) {
			n.setJSDocInfo(info);
		}
		return n;
	}

	com.google.javascript.rhino.Node createString(java.lang.String string) {
		return com.google.javascript.rhino.Node.newString(string);
	}

	com.google.javascript.rhino.Node createString(java.lang.String string, int lineno, int charno) {
		return com.google.javascript.rhino.Node.newString(string, lineno, charno);
	}

	com.google.javascript.rhino.Node createNumber(double number) {
		return com.google.javascript.rhino.Node.newNumber(number);
	}

	com.google.javascript.rhino.Node createNumber(double number, int lineno, int charno) {
		return com.google.javascript.rhino.Node.newNumber(number, lineno, charno);
	}

	com.google.javascript.rhino.Node createCatch(java.lang.String varName, int nameLineno, int nameCharno, com.google.javascript.rhino.Node catchCond, com.google.javascript.rhino.Node stmts, int catchLineno, int catchCharno) {
		if (catchCond == null) {
			catchCond = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY, nameLineno, nameCharno);
		}
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CATCH, createName(varName, nameLineno, nameCharno), catchCond, stmts, catchLineno, catchCharno);
	}

	com.google.javascript.rhino.Node createThrow(com.google.javascript.rhino.Node expr, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.THROW, expr, lineno, charno);
	}

	com.google.javascript.rhino.Node createReturn(com.google.javascript.rhino.Node expr, int lineno, int charno) {
		return expr == null ? new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.RETURN, lineno, charno) : new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.RETURN, expr, lineno, charno);
	}

	com.google.javascript.rhino.Node createLabel(java.lang.String name, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.LABEL, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, name, lineno, charno), lineno, charno);
	}

	com.google.javascript.rhino.Node createBreak(java.lang.String label, int lineno, int charno) {
		com.google.javascript.rhino.Node result = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BREAK, lineno, charno);
		if (label == null) {
			return result;
		}else {
			com.google.javascript.rhino.Node name = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, label, lineno, charno);
			result.addChildToBack(name);
			return result;
		}
	}

	com.google.javascript.rhino.Node createContinue(java.lang.String label, int lineno, int charno) {
		com.google.javascript.rhino.Node result = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CONTINUE, lineno, charno);
		if (label == null) {
			return result;
		}else {
			com.google.javascript.rhino.Node name = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, label, lineno, charno);
			result.addChildToBack(name);
			return result;
		}
	}

	com.google.javascript.rhino.Node createDebugger(int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.DEBUGGER, lineno, charno);
	}

	com.google.javascript.rhino.Node createBlock(int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK, lineno, charno);
	}

	com.google.javascript.rhino.FunctionNode createFunction(java.lang.String name, int lineno, int charno) {
		com.google.javascript.rhino.FunctionNode fnNode = new com.google.javascript.rhino.FunctionNode(name, lineno, charno);
		fnNode.addChildToBack(createName(name, lineno, charno));
		return fnNode;
	}

	com.google.javascript.rhino.Node initFunction(com.google.javascript.rhino.FunctionNode fnNode, int functionIndex, com.google.javascript.rhino.Node args, com.google.javascript.rhino.JSDocInfo info, com.google.javascript.rhino.Node statements, int functionType) {
		fnNode.itsFunctionType = functionType;
		fnNode.addChildToBack(args);
		fnNode.addChildToBack(statements);
		if ((parser.getSourceName()) != null) {
			fnNode.putProp(com.google.javascript.rhino.Node.SOURCENAME_PROP, parser.getSourceName());
		}
		if (info != null) {
			fnNode.setJSDocInfo(info);
		}
		int functionCount = fnNode.getFunctionCount();
		if (functionCount != 0) {
			fnNode.itsNeedsActivation = true;
			for (int i = 0; i != functionCount; ++i) {
				com.google.javascript.rhino.FunctionNode fn = fnNode.getFunctionNode(i);
				if ((fn.getFunctionType()) == (com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION_STATEMENT)) {
					java.lang.String name = fn.getFunctionName();
					if ((name != null) && ((name.length()) != 0)) {
						fnNode.removeParamOrVar(name);
					}
				}
			}
		}
		fnNode.putIntProp(com.google.javascript.rhino.Node.FUNCTION_PROP, functionIndex);
		return fnNode;
	}

	void addChildToBack(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node child) {
		parent.addChildToBack(child);
	}

	com.google.javascript.rhino.Node createWhile(com.google.javascript.rhino.Node cond, com.google.javascript.rhino.Node body, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.WHILE, cond, body, lineno, charno);
	}

	com.google.javascript.rhino.Node createDoWhile(com.google.javascript.rhino.Node body, com.google.javascript.rhino.Node cond, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.DO, body, cond, lineno, charno);
	}

	com.google.javascript.rhino.Node createFor(com.google.javascript.rhino.Node init, com.google.javascript.rhino.Node test, com.google.javascript.rhino.Node incr, com.google.javascript.rhino.Node body, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FOR, init, test, incr, body, lineno, charno);
	}

	com.google.javascript.rhino.Node createForIn(com.google.javascript.rhino.Node lhs, com.google.javascript.rhino.Node obj, com.google.javascript.rhino.Node body, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FOR, lhs, obj, body, lineno, charno);
	}

	com.google.javascript.rhino.Node createTryCatchFinally(com.google.javascript.rhino.Node tryBlock, com.google.javascript.rhino.Node catchBlocks, com.google.javascript.rhino.Node finallyBlock, int lineno, int charno) {
		if (finallyBlock == null) {
			return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.TRY, tryBlock, catchBlocks, lineno, charno);
		}
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.TRY, tryBlock, catchBlocks, finallyBlock, lineno, charno);
	}

	com.google.javascript.rhino.Node createWith(com.google.javascript.rhino.Node obj, com.google.javascript.rhino.Node body, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.WITH, obj, body, lineno, charno);
	}

	public com.google.javascript.rhino.Node createDotQuery(com.google.javascript.rhino.Node obj, com.google.javascript.rhino.Node body, int lineno, int charno) {
		setRequiresActivation();
		com.google.javascript.rhino.Node result = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.DOTQUERY, obj, body, lineno, charno);
		return result;
	}

	com.google.javascript.rhino.Node createArrayLiteral(com.google.javascript.rhino.ObjArray elems, int skipCount, int lineno, int charno) {
		int length = elems.size();
		int[] skipIndexes = null;
		if (skipCount != 0) {
			skipIndexes = new int[skipCount];
		}
		com.google.javascript.rhino.Node array = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ARRAYLIT, lineno, charno);
		for (int i = 0, j = 0; i != length; ++i) {
			com.google.javascript.rhino.Node elem = ((com.google.javascript.rhino.Node) (elems.get(i)));
			if (elem != null) {
				array.addChildToBack(elem);
			}else {
				skipIndexes[j] = i;
				++j;
			}
		}
		if (skipCount != 0) {
			array.putProp(com.google.javascript.rhino.Node.SKIP_INDEXES_PROP, skipIndexes);
		}
		return array;
	}

	com.google.javascript.rhino.Node createObjectLiteral(com.google.javascript.rhino.ObjArray obj, int lineno, int charno) {
		com.google.javascript.rhino.Node object = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.OBJECTLIT, lineno, charno);
		for (int i = 0; i < (obj.size()); i += 2) {
			com.google.javascript.rhino.Node n = ((com.google.javascript.rhino.Node) (obj.get(i)));
			object.addChildToBack(n);
			n = ((com.google.javascript.rhino.Node) (obj.get((i + 1))));
			object.addChildToBack(n);
		}
		return object;
	}

	com.google.javascript.rhino.Node createRegExp(java.lang.String string, java.lang.String flags, int lineno, int charno) {
		return (flags.length()) == 0 ? new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REGEXP, com.google.javascript.rhino.Node.newString(string, lineno, charno), lineno, charno) : new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REGEXP, com.google.javascript.rhino.Node.newString(string, lineno, charno), com.google.javascript.rhino.Node.newString(flags, lineno, charno), lineno, charno);
	}

	com.google.javascript.rhino.Node createIf(com.google.javascript.rhino.Node cond, com.google.javascript.rhino.Node ifTrue, com.google.javascript.rhino.Node ifFalse, int lineno, int charno) {
		if (ifFalse == null)
			return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.IF, cond, ifTrue, lineno, charno);
		
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.IF, cond, ifTrue, ifFalse, lineno, charno);
	}

	com.google.javascript.rhino.Node createCondExpr(com.google.javascript.rhino.Node cond, com.google.javascript.rhino.Node ifTrue, com.google.javascript.rhino.Node ifFalse, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.HOOK, cond, ifTrue, ifFalse, lineno, charno);
	}

	com.google.javascript.rhino.Node createUnary(int nodeType, com.google.javascript.rhino.Node child, int lineno, int charno) {
		return new com.google.javascript.rhino.Node(nodeType, child, lineno, charno);
	}

	com.google.javascript.rhino.Node createCallOrNew(int nodeType, com.google.javascript.rhino.Node child, int lineno, int charno) {
		int type = com.google.javascript.rhino.Node.NON_SPECIALCALL;
		if ((child.getType()) == (com.google.javascript.rhino.Token.NAME)) {
			java.lang.String name = child.getString();
			if (name.equals("eval")) {
				type = com.google.javascript.rhino.Node.SPECIALCALL_EVAL;
			}else
				if (name.equals("With")) {
					type = com.google.javascript.rhino.Node.SPECIALCALL_WITH;
				}
			
		}else
			if ((child.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
				java.lang.String name = child.getLastChild().getString();
				if (name.equals("eval")) {
					type = com.google.javascript.rhino.Node.SPECIALCALL_EVAL;
				}
			}
		
		com.google.javascript.rhino.Node node = new com.google.javascript.rhino.Node(nodeType, child, lineno, charno);
		if (type != (com.google.javascript.rhino.Node.NON_SPECIALCALL)) {
			setRequiresActivation();
			node.putIntProp(com.google.javascript.rhino.Node.SPECIALCALL_PROP, type);
		}
		return node;
	}

	com.google.javascript.rhino.Node createIncDec(int nodeType, boolean post, com.google.javascript.rhino.Node child, int lineno, int charno) {
		child = makeReference(child);
		if (child == null) {
			java.lang.String msg;
			if (nodeType == (com.google.javascript.rhino.Token.DEC)) {
				msg = "msg.bad.decr";
			}else {
				msg = "msg.bad.incr";
			}
			parser.reportError(msg);
			return null;
		}
		int childType = child.getType();
		switch (childType) {
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.GETELEM :
			case com.google.javascript.rhino.Token.GET_REF :
			case com.google.javascript.rhino.Token.CALL :
				{
					com.google.javascript.rhino.Node n = new com.google.javascript.rhino.Node(nodeType, child, lineno, charno);
					n.putIntProp(com.google.javascript.rhino.Node.INCRDECR_PROP, (post ? 1 : 0));
					return n;
				}
		}
		throw com.google.javascript.rhino.Kit.codeBug();
	}

	com.google.javascript.rhino.Node createPropertyGet(com.google.javascript.rhino.Node target, java.lang.String namespace, java.lang.String name, int memberTypeFlags, int dotLineno, int dotCharno, int nameLineno, int nameCharno) {
		if ((namespace == null) && (memberTypeFlags == 0)) {
			if (target == null) {
				return createName(name, nameLineno, nameCharno);
			}
			checkActivationName(name, com.google.javascript.rhino.Token.GETPROP);
			if (com.google.javascript.rhino.ScriptRuntime.isSpecialProperty(name)) {
				com.google.javascript.rhino.Node ref = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REF_SPECIAL, target);
				ref.putProp(com.google.javascript.rhino.Node.NAME_PROP, name);
				return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GET_REF, ref, dotLineno, dotCharno);
			}
			return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETPROP, target, createString(name, nameLineno, nameCharno), dotLineno, dotCharno);
		}
		com.google.javascript.rhino.Node elem = createString(name);
		memberTypeFlags |= com.google.javascript.rhino.Node.PROPERTY_FLAG;
		return createMemberRefGet(target, namespace, elem, memberTypeFlags, dotLineno, dotCharno);
	}

	com.google.javascript.rhino.Node createElementGet(com.google.javascript.rhino.Node target, java.lang.String namespace, com.google.javascript.rhino.Node elem, int memberTypeFlags, int lineno, int charno) {
		if ((namespace == null) && (memberTypeFlags == 0)) {
			if (target == null)
				throw com.google.javascript.rhino.Kit.codeBug();
			
			return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GETELEM, target, elem, lineno, charno);
		}
		return createMemberRefGet(target, namespace, elem, memberTypeFlags, lineno, charno);
	}

	private com.google.javascript.rhino.Node createMemberRefGet(com.google.javascript.rhino.Node target, java.lang.String namespace, com.google.javascript.rhino.Node elem, int memberTypeFlags, int lineno, int charno) {
		com.google.javascript.rhino.Node nsNode = null;
		if (namespace != null) {
			if (namespace.equals("*")) {
				nsNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.NULL, lineno, charno);
			}else {
				nsNode = createName(namespace, lineno, charno);
			}
		}
		com.google.javascript.rhino.Node ref;
		if (target == null) {
			if (namespace == null) {
				ref = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REF_NAME, elem, lineno, charno);
			}else {
				ref = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REF_NS_NAME, nsNode, elem, lineno, charno);
			}
		}else {
			if (namespace == null) {
				ref = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REF_MEMBER, target, elem, lineno, charno);
			}else {
				ref = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.REF_NS_MEMBER, target, nsNode, elem, lineno, charno);
			}
		}
		if (memberTypeFlags != 0) {
			ref.putIntProp(com.google.javascript.rhino.Node.MEMBER_TYPE_PROP, memberTypeFlags);
		}
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.GET_REF, ref, lineno, charno);
	}

	com.google.javascript.rhino.Node createBinary(int nodeType, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right, int lineno, int charno) {
		com.google.javascript.rhino.Node temp;
		switch (nodeType) {
			case com.google.javascript.rhino.Token.DOT :
				nodeType = com.google.javascript.rhino.Token.GETPROP;
				com.google.javascript.rhino.Node idNode = right;
				idNode.setType(com.google.javascript.rhino.Token.STRING);
				break;
			case com.google.javascript.rhino.Token.LB :
				nodeType = com.google.javascript.rhino.Token.GETELEM;
				break;
		}
		return new com.google.javascript.rhino.Node(nodeType, left, right, lineno, charno);
	}

	com.google.javascript.rhino.Node createAssignment(int nodeOp, com.google.javascript.rhino.Node left, com.google.javascript.rhino.Node right, int lineno, int charno) throws com.google.javascript.rhino.JavaScriptException {
		int nodeType = left.getType();
		switch (nodeType) {
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.GETELEM :
				break;
			default :
				parser.reportError("msg.bad.assign.left");
		}
		return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, left, right, lineno, charno);
	}

	private com.google.javascript.rhino.Node makeReference(com.google.javascript.rhino.Node node) {
		int type = node.getType();
		switch (type) {
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.GETELEM :
			case com.google.javascript.rhino.Token.GET_REF :
			case com.google.javascript.rhino.Token.CALL :
				return node;
		}
		return null;
	}

	private void checkActivationName(java.lang.String name, int token) {
		if (parser.insideFunction()) {
			boolean activation = false;
			if (("arguments".equals(name)) || (((parser.compilerEnv.activationNames) != null) && (parser.compilerEnv.activationNames.containsKey(name)))) {
				activation = true;
			}else
				if ("length".equals(name)) {
					if ((token == (com.google.javascript.rhino.Token.GETPROP)) && ((parser.compilerEnv.getLanguageVersion()) == (com.google.javascript.rhino.Context.VERSION_1_2))) {
						activation = true;
					}
				}
			
			if (activation) {
				setRequiresActivation();
			}
		}
	}

	private void setRequiresActivation() {
		if (parser.insideFunction()) {
			((com.google.javascript.rhino.FunctionNode) (parser.currentScriptOrFn)).itsNeedsActivation = true;
		}
	}

	private com.google.javascript.rhino.Parser parser;
}

