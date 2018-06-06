

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
			com.google.common.base.Preconditions.checkState(sourceFile.equals(n.getSourceFileName()));
		}
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.GETPROP :
				com.google.javascript.rhino.Node propNode = n.getLastChild();
				setOriginalName(n, propNode.getString());
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				java.lang.String functionName = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(n);
				if (functionName != null) {
					setOriginalName(n, functionName);
				}
				break;
			case com.google.javascript.rhino.Token.NAME :
				setOriginalName(n, n.getString());
				break;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				for (com.google.javascript.rhino.Node key = n.getFirstChild(); key != null; key = key.getNext()) {
					if (!(key.isQuotedString())) {
						setOriginalName(key, key.getString());
					}
				}
				break;
		}
	}

	void setOriginalName(com.google.javascript.rhino.Node n, java.lang.String name) {
		if ((!(name.isEmpty())) && ((n.getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP)) == null)) {
			n.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, name);
		}
	}
}

