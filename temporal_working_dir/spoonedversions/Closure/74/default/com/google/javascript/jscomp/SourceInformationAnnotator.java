

package com.google.javascript.jscomp;


class SourceInformationAnnotator extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
	private final java.lang.String sourceFile;

	private final boolean doSanityChecks;

	public SourceInformationAnnotator(java.lang.String sourceFile, boolean doSanityChecks) {
		this.sourceFile = sourceFile;
		this.doSanityChecks = doSanityChecks;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if ((doSanityChecks) && ((sourceFile) != null)) {
			com.google.common.base.Preconditions.checkState(sourceFile.equals(n.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP)));
		}
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.GETPROP :
				com.google.javascript.rhino.Node propNode = n.getFirstChild().getNext();
				if ((propNode.getType()) == (com.google.javascript.rhino.Token.STRING)) {
					n.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, propNode.getString());
				}
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				java.lang.String functionName = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(n);
				if (functionName != null) {
					n.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, functionName);
				}
				break;
			case com.google.javascript.rhino.Token.NAME :
				n.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, n.getString());
				break;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				for (com.google.javascript.rhino.Node key = n.getFirstChild(); key != null; key = key.getNext()) {
					if (!(key.isQuotedString())) {
						key.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, key.getString());
					}
				}
				break;
		}
	}
}

