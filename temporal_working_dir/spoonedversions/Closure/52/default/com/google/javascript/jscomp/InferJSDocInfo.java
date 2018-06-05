

package com.google.javascript.jscomp;


class InferJSDocInfo extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.HotSwapCompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	@java.lang.SuppressWarnings(value = "unused")
	private boolean inExterns;

	InferJSDocInfo(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if (externs != null) {
			inExterns = true;
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, com.google.javascript.jscomp.InferJSDocInfo.this);
		}
		if (root != null) {
			inExterns = false;
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.InferJSDocInfo.this);
		}
	}

	@java.lang.Override
	public void hotSwapScript(com.google.javascript.rhino.Node root, com.google.javascript.rhino.Node originalRoot) {
		com.google.common.base.Preconditions.checkNotNull(root);
		com.google.common.base.Preconditions.checkState(((root.getType()) == (com.google.javascript.rhino.Token.SCRIPT)));
		inExterns = false;
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.InferJSDocInfo.this);
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.JSDocInfo docInfo;
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				if (parent == null) {
					return ;
				}
				if ((((parent.getType()) != (com.google.javascript.rhino.Token.VAR)) && (!(com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(parent)))) && (!(((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && (n == (parent.getFirstChild()))))) {
					return ;
				}
				docInfo = n.getJSDocInfo();
				if ((docInfo == null) && (!(((parent.getType()) == (com.google.javascript.rhino.Token.VAR)) && (!(parent.hasOneChild()))))) {
					docInfo = parent.getJSDocInfo();
				}
				com.google.javascript.rhino.jstype.JSType varType = n.getJSType();
				if ((varType == null) && ((parent.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
					varType = parent.getJSType();
				}
				if ((varType == null) || (docInfo == null)) {
					return ;
				}
				com.google.javascript.rhino.jstype.ObjectType objType = dereferenceToObject(varType);
				if ((objType == null) || ((objType.getJSDocInfo()) != null)) {
					return ;
				}
				attachJSDocInfoToNominalTypeOrShape(objType, docInfo, n.getString());
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				if ((com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent)) || (((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == n))) {
					docInfo = n.getJSDocInfo();
					if (docInfo == null) {
						docInfo = parent.getJSDocInfo();
					}
					if (docInfo != null) {
						com.google.javascript.rhino.jstype.ObjectType lhsType = dereferenceToObject(n.getFirstChild().getJSType());
						if (lhsType != null) {
							java.lang.String propName = n.getLastChild().getString();
							if (lhsType.hasOwnProperty(propName)) {
								lhsType.setPropertyJSDocInfo(propName, docInfo);
							}
							com.google.javascript.rhino.jstype.ObjectType propType = dereferenceToObject(lhsType.getPropertyType(propName));
							if (propType != null) {
								attachJSDocInfoToNominalTypeOrShape(propType, docInfo, n.getQualifiedName());
							}
						}
					}
				}
				break;
		}
	}

	private com.google.javascript.rhino.jstype.ObjectType dereferenceToObject(com.google.javascript.rhino.jstype.JSType type) {
		return com.google.javascript.rhino.jstype.ObjectType.cast((type == null ? null : type.dereference()));
	}

	private void attachJSDocInfoToNominalTypeOrShape(com.google.javascript.rhino.jstype.ObjectType objType, com.google.javascript.rhino.JSDocInfo docInfo, @javax.annotation.Nullable
	java.lang.String qName) {
		if (((objType.isConstructor()) || (objType.isEnumType())) || (objType.isInterface())) {
			if ((objType.hasReferenceName()) && (objType.getReferenceName().equals(qName))) {
				objType.setJSDocInfo(docInfo);
				if ((objType.isConstructor()) || (objType.isInterface())) {
					objType.toMaybeFunctionType(objType).getInstanceType().setJSDocInfo(docInfo);
				}else
					if (objType instanceof com.google.javascript.rhino.jstype.EnumType) {
						((com.google.javascript.rhino.jstype.EnumType) (objType)).getElementsType().setJSDocInfo(docInfo);
					}
				
			}
		}else
			if ((!(objType.isNativeObjectType())) && (objType.isFunctionType())) {
				objType.setJSDocInfo(docInfo);
			}
		
	}
}

