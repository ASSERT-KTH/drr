

package com.google.javascript.jscomp;


class AnonymousFunctionNamingCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
	private final com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer namer;

	interface FunctionNamer {
		java.lang.String getName(com.google.javascript.rhino.Node node);

		void setFunctionName(java.lang.String name, com.google.javascript.rhino.Node fnNode);

		java.lang.String getCombinedName(java.lang.String lhs, java.lang.String rhs);
	}

	AnonymousFunctionNamingCallback(com.google.javascript.jscomp.AnonymousFunctionNamingCallback.FunctionNamer namer) {
		this.namer = namer;
	}

	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.FUNCTION :
				com.google.javascript.rhino.Node functionNameNode = n.getFirstChild();
				java.lang.String functionName = functionNameNode.getString();
				if ((functionName.length()) == 0) {
					if ((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) {
						com.google.javascript.rhino.Node lhs = parent.getFirstChild();
						java.lang.String name = namer.getName(lhs);
						namer.setFunctionName(name, n);
					}else
						if ((parent.getType()) == (com.google.javascript.rhino.Token.NAME)) {
							java.lang.String name = namer.getName(parent);
							namer.setFunctionName(name, n);
						}
					
				}
				break;
			case com.google.javascript.rhino.Token.ASSIGN :
				com.google.javascript.rhino.Node lhs = n.getFirstChild();
				com.google.javascript.rhino.Node rhs = lhs.getNext();
				if ((rhs.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)) {
					nameObjectLiteralMethods(rhs, namer.getName(lhs));
				}
		}
	}

	private void nameObjectLiteralMethods(com.google.javascript.rhino.Node objectLiteral, java.lang.String context) {
		for (com.google.javascript.rhino.Node keyNode = objectLiteral.getFirstChild(); keyNode != null; keyNode = keyNode.getNext()) {
			com.google.javascript.rhino.Node valueNode = keyNode.getFirstChild();
			if ((keyNode.getType()) == (com.google.javascript.rhino.Token.STRING)) {
				java.lang.String name = namer.getCombinedName(context, namer.getName(keyNode));
				int type = valueNode.getType();
				if (type == (com.google.javascript.rhino.Token.FUNCTION)) {
					com.google.javascript.rhino.Node functionNameNode = valueNode.getFirstChild();
					java.lang.String functionName = functionNameNode.getString();
					if (functionName.isEmpty()) {
						namer.setFunctionName(name, valueNode);
					}
				}else
					if (type == (com.google.javascript.rhino.Token.OBJECTLIT)) {
						nameObjectLiteralMethods(valueNode, name);
					}
				
			}
		}
	}
}

