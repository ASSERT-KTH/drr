

package com.google.javascript.jscomp.jsonml;


public class Writer {
	public com.google.javascript.jscomp.jsonml.JsonML processAst(com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkNotNull(root);
		com.google.common.base.Preconditions.checkArgument(((root.getType()) == (com.google.javascript.rhino.Token.BLOCK)));
		com.google.javascript.jscomp.jsonml.JsonML rootElement = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.BlockStmt);
		com.google.javascript.rhino.Node child = root.getFirstChild();
		while (child != null) {
			processNode(child, rootElement);
			child = child.getNext();
		} 
		return rootElement.getChild(0);
	}

	private void processNode(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.RETURN :
				processReturn(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.BITOR :
				processBinaryExpr(node, currentParent, "|");
				break;
			case com.google.javascript.rhino.Token.BITXOR :
				processBinaryExpr(node, currentParent, "^");
				break;
			case com.google.javascript.rhino.Token.BITAND :
				processBinaryExpr(node, currentParent, "&");
				break;
			case com.google.javascript.rhino.Token.EQ :
				processBinaryExpr(node, currentParent, "==");
				break;
			case com.google.javascript.rhino.Token.NE :
				processBinaryExpr(node, currentParent, "!=");
				break;
			case com.google.javascript.rhino.Token.LT :
				processBinaryExpr(node, currentParent, "<");
				break;
			case com.google.javascript.rhino.Token.LE :
				processBinaryExpr(node, currentParent, "<=");
				break;
			case com.google.javascript.rhino.Token.GT :
				processBinaryExpr(node, currentParent, ">");
				break;
			case com.google.javascript.rhino.Token.GE :
				processBinaryExpr(node, currentParent, ">=");
				break;
			case com.google.javascript.rhino.Token.LSH :
				processBinaryExpr(node, currentParent, "<<");
				break;
			case com.google.javascript.rhino.Token.RSH :
				processBinaryExpr(node, currentParent, ">>");
				break;
			case com.google.javascript.rhino.Token.URSH :
				processBinaryExpr(node, currentParent, ">>>");
				break;
			case com.google.javascript.rhino.Token.ADD :
				processBinaryExpr(node, currentParent, "+");
				break;
			case com.google.javascript.rhino.Token.SUB :
				processBinaryExpr(node, currentParent, "-");
				break;
			case com.google.javascript.rhino.Token.MUL :
				processBinaryExpr(node, currentParent, "*");
				break;
			case com.google.javascript.rhino.Token.DIV :
				processBinaryExpr(node, currentParent, "/");
				break;
			case com.google.javascript.rhino.Token.MOD :
				processBinaryExpr(node, currentParent, "%");
				break;
			case com.google.javascript.rhino.Token.NOT :
				processUnaryExpr(node, currentParent, "!");
				break;
			case com.google.javascript.rhino.Token.BITNOT :
				processUnaryExpr(node, currentParent, "~");
				break;
			case com.google.javascript.rhino.Token.POS :
				processUnaryExpr(node, currentParent, "+");
				break;
			case com.google.javascript.rhino.Token.NEG :
				processUnaryExpr(node, currentParent, "-");
				break;
			case com.google.javascript.rhino.Token.NEW :
				processNew(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.NewExpr);
				break;
			case com.google.javascript.rhino.Token.DELPROP :
				processOneArgExpr(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.DeleteExpr);
				break;
			case com.google.javascript.rhino.Token.TYPEOF :
				processOneArgExpr(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.TypeofExpr);
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				processMemberExpr(node, currentParent, ".");
				break;
			case com.google.javascript.rhino.Token.GETELEM :
				processMemberExpr(node, currentParent, "[]");
				break;
			case com.google.javascript.rhino.Token.CALL :
				processCall(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.NAME :
				processName(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.NUMBER :
			case com.google.javascript.rhino.Token.STRING :
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.TRUE :
				processLiteral(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.THIS :
				processThis(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.SHEQ :
				processBinaryExpr(node, currentParent, "===");
				break;
			case com.google.javascript.rhino.Token.SHNE :
				processBinaryExpr(node, currentParent, "!==");
				break;
			case com.google.javascript.rhino.Token.REGEXP :
				processRegExp(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.THROW :
				processThrow(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.IN :
				processBinaryExpr(node, currentParent, "in");
				break;
			case com.google.javascript.rhino.Token.INSTANCEOF :
				processBinaryExpr(node, currentParent, "instanceof");
				break;
			case com.google.javascript.rhino.Token.ARRAYLIT :
				processArrayLiteral(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				processObjectLiteral(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.TRY :
				processTry(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.COMMA :
				processBinaryExpr(node, currentParent, ",");
				break;
			case com.google.javascript.rhino.Token.ASSIGN :
				processAssignExpr(node, currentParent, "=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_BITOR :
				processAssignExpr(node, currentParent, "|=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_BITXOR :
				processAssignExpr(node, currentParent, "^=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_BITAND :
				processAssignExpr(node, currentParent, "&=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_LSH :
				processAssignExpr(node, currentParent, "<<=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_RSH :
				processAssignExpr(node, currentParent, ">>=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_URSH :
				processAssignExpr(node, currentParent, ">>>=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_ADD :
				processAssignExpr(node, currentParent, "+=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_SUB :
				processAssignExpr(node, currentParent, "-=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_MUL :
				processAssignExpr(node, currentParent, "*=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
				processAssignExpr(node, currentParent, "/=");
				break;
			case com.google.javascript.rhino.Token.ASSIGN_MOD :
				processAssignExpr(node, currentParent, "%=");
				break;
			case com.google.javascript.rhino.Token.HOOK :
				processHook(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.OR :
				processLogicalExpr(node, currentParent, "||");
				break;
			case com.google.javascript.rhino.Token.AND :
				processLogicalExpr(node, currentParent, "&&");
				break;
			case com.google.javascript.rhino.Token.INC :
				processIncrDecrExpr(node, currentParent, "++");
				break;
			case com.google.javascript.rhino.Token.DEC :
				processIncrDecrExpr(node, currentParent, "--");
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				processFunction(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.IF :
				processIf(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.SWITCH :
				processSwitch(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.CASE :
				processCase(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.Case);
				break;
			case com.google.javascript.rhino.Token.DEFAULT :
				processCase(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.DefaultCase);
				break;
			case com.google.javascript.rhino.Token.WHILE :
				processLoop(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.WhileStmt);
				break;
			case com.google.javascript.rhino.Token.DO :
				processLoop(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.DoWhileStmt);
				break;
			case com.google.javascript.rhino.Token.FOR :
				processForLoop(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.BREAK :
				processJmp(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.BreakStmt);
				break;
			case com.google.javascript.rhino.Token.CONTINUE :
				processJmp(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.ContinueStmt);
				break;
			case com.google.javascript.rhino.Token.VAR :
				processVar(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.WITH :
				processWith(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.CATCH :
				processCatch(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.VOID :
				processUnaryExpr(node, currentParent, "void");
				break;
			case com.google.javascript.rhino.Token.EMPTY :
				processEmpty(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.BLOCK :
				processBlock(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.LABEL :
				processLabel(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				processExprResult(node, currentParent);
				break;
			case com.google.javascript.rhino.Token.SCRIPT :
				processScript(node, currentParent);
				break;
		}
	}

	private void processAssignExpr(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, java.lang.String op) {
		processTwoArgExpr(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.AssignExpr, op);
	}

	private void processArrayLiteral(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.ArrayExpr);
		currentParent.appendChild(element);
		java.util.Iterator<com.google.javascript.rhino.Node> it = node.children().iterator();
		int[] skipIndexes = ((int[]) (node.getProp(com.google.javascript.rhino.Node.SKIP_INDEXES_PROP)));
		int i = 0;
		int j = 0;
		int nextToSkip = 0;
		while (it.hasNext()) {
			while ((skipIndexes != null) && (j < (skipIndexes.length))) {
				if (i == (skipIndexes[j])) {
					element.appendChild(new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.Empty));
					++i;
					++j;
				}else {
					break;
				}
			} 
			processNode(it.next(), element);
			++i;
		} 
	}

	private void processBinaryExpr(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, java.lang.String op) {
		processTwoArgExpr(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.BinaryExpr, op);
	}

	private void processBlock(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.BlockStmt);
		if (currentParent != null) {
			currentParent.appendChild(element);
		}
		processDirectives(node, element);
		for (com.google.javascript.rhino.Node child : node.children()) {
			processNode(child, element);
		}
	}

	private void processCall(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		java.util.Iterator<com.google.javascript.rhino.Node> it = node.children().iterator();
		com.google.javascript.rhino.Node child = it.next();
		com.google.javascript.jscomp.jsonml.JsonML element;
		switch (child.getType()) {
			case com.google.javascript.rhino.Token.GETPROP :
			case com.google.javascript.rhino.Token.GETELEM :
				element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.InvokeExpr);
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.OP, ((child.getType()) == (com.google.javascript.rhino.Token.GETPROP) ? "." : "[]"));
				currentParent.appendChild(element);
				com.google.javascript.rhino.Node grandchild = child.getFirstChild();
				processNode(grandchild, element);
				processNode(grandchild.getNext(), element);
				break;
			case com.google.javascript.rhino.Token.NAME :
				if (child.getString().equals("eval")) {
					element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.EvalExpr);
				}else {
					element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.IdExpr);
					element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.NAME, child.getString());
					element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.CallExpr, element);
				}
				currentParent.appendChild(element);
				break;
			default :
				element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.CallExpr);
				currentParent.appendChild(element);
				processNode(child, element);
				break;
		}
		while (it.hasNext()) {
			processNode(it.next(), element);
		} 
	}

	private void processCase(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, com.google.javascript.jscomp.jsonml.TagType type) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(type);
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		if (type == (com.google.javascript.jscomp.jsonml.TagType.Case)) {
			processNode(child, element);
			child = child.getNext();
		}
		com.google.common.base.Preconditions.checkNotNull(child);
		com.google.common.base.Preconditions.checkState(((child.getType()) == (com.google.javascript.rhino.Token.BLOCK)));
		child = child.getFirstChild();
		while (child != null) {
			processNode(child, element);
			child = child.getNext();
		} 
	}

	private void processCatch(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.CatchClause);
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		com.google.javascript.jscomp.jsonml.JsonML patt = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.IdPatt);
		patt.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.NAME, child.getString());
		element.appendChild(patt);
		child = child.getNext();
		processNode(child, element);
	}

	private void processEmpty(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		currentParent.appendChild(new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.EmptyStmt));
	}

	private void processExprResult(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		processNode(node.getFirstChild(), currentParent);
	}

	private void processForLoop(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		if (com.google.javascript.jscomp.jsonml.NodeUtil.isForIn(node)) {
			processLoop(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.ForInStmt);
		}else {
			processLoop(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.ForStmt);
		}
	}

	private void processFunction(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element;
		if (com.google.javascript.jscomp.jsonml.NodeUtil.isFunctionDeclaration(node)) {
			element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.FunctionDecl);
		}else {
			element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.FunctionExpr);
		}
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		java.lang.String name = child.getString();
		if (!(name.equals(""))) {
			com.google.javascript.jscomp.jsonml.JsonML nameElement = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.IdPatt);
			nameElement.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.NAME, name);
			element.appendChild(nameElement);
		}else {
			element.appendChild(new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.Empty));
		}
		child = child.getNext();
		com.google.javascript.jscomp.jsonml.JsonML params = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.ParamDecl);
		element.appendChild(params);
		java.util.Iterator<com.google.javascript.rhino.Node> it = child.children().iterator();
		while (it.hasNext()) {
			com.google.javascript.jscomp.jsonml.JsonML param = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.IdPatt);
			com.google.javascript.rhino.Node nameNode = it.next();
			param.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.NAME, nameNode.getString());
			params.appendChild(param);
		} 
		child = child.getNext();
		processDirectives(child, element);
		it = child.children().iterator();
		while (it.hasNext()) {
			processNode(it.next(), element);
		} 
	}

	private void processHook(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.ConditionalExpr);
		currentParent.appendChild(element);
		processChildren(node, element);
	}

	private void processIf(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.IfStmt);
		currentParent.appendChild(element);
		java.util.Iterator<com.google.javascript.rhino.Node> it = node.children().iterator();
		while (it.hasNext()) {
			processNode(it.next(), element);
		} 
		int childCount = node.getChildCount();
		com.google.common.base.Preconditions.checkState((childCount >= 2));
		if (childCount < 3) {
			element.appendChild(new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.EmptyStmt));
		}
	}

	private void processIncrDecrExpr(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, java.lang.String op) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.CountExpr);
		currentParent.appendChild(element);
		if (op.equals("++")) {
			element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.OP, "++");
		}else {
			element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.OP, "--");
		}
		if ((node.getIntProp(com.google.javascript.rhino.Node.INCRDECR_PROP)) == 1) {
			element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.IS_PREFIX, false);
		}else {
			element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.IS_PREFIX, true);
		}
		processNode(node.getFirstChild(), element);
	}

	private void processJmp(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, com.google.javascript.jscomp.jsonml.TagType type) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(type);
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		if (child != null) {
			element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.LABEL, child.getString());
		}
	}

	private void processLabel(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.LabelledStmt);
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.LABEL, child.getString());
		child = child.getNext();
		processNode(child, element);
	}

	private void processLiteral(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.LiteralExpr);
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.NUMBER :
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.TYPE, "number");
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.VALUE, node.getDouble());
				break;
			case com.google.javascript.rhino.Token.STRING :
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.TYPE, "string");
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.VALUE, node.getString());
				break;
			case com.google.javascript.rhino.Token.NULL :
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.TYPE, "null");
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.VALUE, null);
				break;
			case com.google.javascript.rhino.Token.TRUE :
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.TYPE, "boolean");
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.VALUE, true);
				break;
			case com.google.javascript.rhino.Token.FALSE :
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.TYPE, "boolean");
				element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.VALUE, false);
				break;
			default :
				throw new java.lang.IllegalArgumentException("Illegal type of node.");
		}
		currentParent.appendChild(element);
	}

	private void processLogicalExpr(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, java.lang.String op) {
		if (op.equals("||")) {
			processTwoArgExpr(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.LogicalOrExpr);
		}else
			if (op.endsWith("&&")) {
				processTwoArgExpr(node, currentParent, com.google.javascript.jscomp.jsonml.TagType.LogicalAndExpr);
			}else {
				throw new java.lang.IllegalArgumentException("Unsupported value of op argument.");
			}
		
	}

	private void processLoop(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, com.google.javascript.jscomp.jsonml.TagType type) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(type);
		currentParent.appendChild(element);
		processChildren(node, element);
	}

	private void processMemberExpr(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, java.lang.String op) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.MemberExpr);
		element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.OP, op);
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		processNode(child, element);
		processNode(child.getNext(), element);
	}

	private void processName(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.common.base.Preconditions.checkState((!(node.hasChildren())));
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.IdExpr);
		element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.NAME, node.getString());
		currentParent.appendChild(element);
	}

	private void processNew(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, com.google.javascript.jscomp.jsonml.TagType type) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(type);
		currentParent.appendChild(element);
		processChildren(node, element);
	}

	private void processObjectLiteral(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.ObjectExpr);
		currentParent.appendChild(element);
		for (com.google.javascript.rhino.Node key : node.children()) {
			com.google.javascript.rhino.Node value = key.getFirstChild();
			com.google.javascript.jscomp.jsonml.JsonML item;
			java.lang.Object name;
			switch (key.getType()) {
				case com.google.javascript.rhino.Token.STRING :
					item = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.DataProp);
					name = key.getString();
					break;
				case com.google.javascript.rhino.Token.NUMBER :
					item = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.DataProp);
					name = key.getDouble();
					break;
				case com.google.javascript.rhino.Token.GET :
					item = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.GetterProp);
					name = key.getString();
					break;
				case com.google.javascript.rhino.Token.SET :
					item = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.SetterProp);
					name = key.getString();
					break;
				default :
					throw new java.lang.IllegalArgumentException("Illegal type of node.");
			}
			item.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.NAME, name);
			processNode(value, item);
			element.appendChild(item);
		}
	}

	private void processRegExp(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.RegExpExpr);
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.BODY, child.getString());
		java.lang.String flags = "";
		child = child.getNext();
		if (child != null) {
			flags = child.getString();
		}
		element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.FLAGS, flags);
	}

	private void processSwitch(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.SwitchStmt);
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		processNode(child, element);
		for (com.google.javascript.rhino.Node c = child.getNext(); c != null; c = c.getNext()) {
			processNode(c, element);
		}
	}

	private void processThis(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		currentParent.appendChild(new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.ThisExpr));
	}

	private void processThrow(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.ThrowStmt);
		currentParent.appendChild(element);
		processNode(node.getFirstChild(), element);
	}

	private void processTry(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.TryStmt);
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		processNode(child, element);
		child = child.getNext();
		if (child.hasChildren()) {
			processNode(child.getFirstChild(), element);
		}else {
			element.appendChild(new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.Empty));
		}
		child = child.getNext();
		if (child != null) {
			processNode(child, element);
		}
	}

	private void processTwoArgExpr(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, com.google.javascript.jscomp.jsonml.TagType type) {
		processTwoArgExpr(node, currentParent, type, null);
	}

	private void processTwoArgExpr(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, com.google.javascript.jscomp.jsonml.TagType type, java.lang.String op) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(type);
		if (op != null) {
			element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.OP, op);
		}
		currentParent.appendChild(element);
		com.google.common.base.Preconditions.checkState(((node.getChildCount()) == 2));
		com.google.javascript.rhino.Node child = node.getFirstChild();
		processNode(child, element);
		processNode(child.getNext(), element);
	}

	private void processUnaryExpr(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, java.lang.String op) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.UnaryExpr);
		element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.OP, op);
		currentParent.appendChild(element);
		processNode(node.getFirstChild(), element);
	}

	private void processVar(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.VarDecl);
		currentParent.appendChild(element);
		java.util.Iterator<com.google.javascript.rhino.Node> it = node.children().iterator();
		while (it.hasNext()) {
			com.google.javascript.rhino.Node child = it.next();
			com.google.javascript.jscomp.jsonml.JsonML id = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.IdPatt);
			id.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.NAME, child.getString());
			if (child.hasChildren()) {
				com.google.javascript.jscomp.jsonml.JsonML patt = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.InitPatt);
				element.appendChild(patt);
				patt.appendChild(id);
				processNode(child.getFirstChild(), patt);
			}else {
				element.appendChild(id);
			}
		} 
	}

	private void processReturn(com.google.javascript.rhino.Node currentNode, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.ReturnStmt);
		currentParent.appendChild(element);
		if (currentNode.hasChildren()) {
			processNode(currentNode.getFirstChild(), element);
		}
	}

	private void processScript(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.Program);
		currentParent.appendChild(element);
		processDirectives(node, element);
		processChildren(node, element);
	}

	private void processWith(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.WithStmt);
		currentParent.appendChild(element);
		com.google.javascript.rhino.Node child = node.getFirstChild();
		processNode(child, element);
		child = child.getNext();
		processNode(child, element);
	}

	private void processChildren(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent) {
		for (com.google.javascript.rhino.Node child : node.children()) {
			processNode(child, currentParent);
		}
	}

	private void processDirectives(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currectParent) {
		java.util.Set<java.lang.String> directives = node.getDirectives();
		if (directives == null) {
			return ;
		}
		for (java.lang.String directive : directives) {
			com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(com.google.javascript.jscomp.jsonml.TagType.PrologueDecl);
			element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.DIRECTIVE, directive);
			element.setAttribute(com.google.javascript.jscomp.jsonml.TagAttr.VALUE, directive);
			currectParent.appendChild(element);
		}
	}

	private void processOneArgExpr(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.jsonml.JsonML currentParent, com.google.javascript.jscomp.jsonml.TagType type) {
		com.google.javascript.jscomp.jsonml.JsonML element = new com.google.javascript.jscomp.jsonml.JsonML(type);
		currentParent.appendChild(element);
		processNode(node.getFirstChild(), element);
	}
}

