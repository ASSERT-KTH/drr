

package com.google.javascript.jscomp;


class NodeNameExtractor {
	private final char delimiter;

	private int nextUniqueInt = 0;

	NodeNameExtractor(char delimiter) {
		this.delimiter = delimiter;
	}

	java.lang.String getName(com.google.javascript.rhino.Node node) {
		switch (node.getType()) {
			case com.google.javascript.rhino.Token.FUNCTION :
				com.google.javascript.rhino.Node functionNameNode = node.getFirstChild();
				return functionNameNode.getString();
			case com.google.javascript.rhino.Token.GETPROP :
				com.google.javascript.rhino.Node lhsOfDot = node.getFirstChild();
				com.google.javascript.rhino.Node rhsOfDot = lhsOfDot.getNext();
				java.lang.String lhsOfDotName = getName(lhsOfDot);
				java.lang.String rhsOfDotName = getName(rhsOfDot);
				if ("prototype".equals(rhsOfDotName)) {
					return lhsOfDotName + (delimiter);
				}else {
					return (lhsOfDotName + (delimiter)) + rhsOfDotName;
				}
			case com.google.javascript.rhino.Token.GETELEM :
				com.google.javascript.rhino.Node outsideBrackets = node.getFirstChild();
				com.google.javascript.rhino.Node insideBrackets = outsideBrackets.getNext();
				java.lang.String nameOutsideBrackets = getName(outsideBrackets);
				java.lang.String nameInsideBrackets = getName(insideBrackets);
				if ("prototype".equals(nameInsideBrackets)) {
					return nameOutsideBrackets + (delimiter);
				}else {
					return (nameOutsideBrackets + (delimiter)) + nameInsideBrackets;
				}
			case com.google.javascript.rhino.Token.NAME :
				return node.getString();
			case com.google.javascript.rhino.Token.STRING :
			case com.google.javascript.rhino.Token.STRING_KEY :
				return com.google.javascript.rhino.TokenStream.isJSIdentifier(node.getString()) ? node.getString() : "__" + ((nextUniqueInt)++);
			case com.google.javascript.rhino.Token.NUMBER :
				return com.google.javascript.jscomp.NodeUtil.getStringValue(node);
			case com.google.javascript.rhino.Token.THIS :
				return "this";
			case com.google.javascript.rhino.Token.CALL :
				return getName(node.getFirstChild());
			default :
				java.lang.StringBuilder sb = new java.lang.StringBuilder();
				for (com.google.javascript.rhino.Node child = node.getFirstChild(); child != null; child = child.getNext()) {
					if ((sb.length()) > 0) {
						sb.append(delimiter);
					}
					sb.append(getName(child));
				}
				return sb.toString();
		}
	}
}

