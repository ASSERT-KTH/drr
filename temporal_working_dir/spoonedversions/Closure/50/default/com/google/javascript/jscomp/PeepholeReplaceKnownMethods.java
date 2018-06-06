

package com.google.javascript.jscomp;


class PeepholeReplaceKnownMethods extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	private static final java.util.Locale ROOT_LOCALE = new java.util.Locale("");

	@java.lang.Override
	com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree) {
		if (com.google.javascript.jscomp.NodeUtil.isCall(subtree)) {
			return tryFoldKnownMethods(subtree);
		}
		return subtree;
	}

	private com.google.javascript.rhino.Node tryFoldKnownMethods(com.google.javascript.rhino.Node subtree) {
		subtree = tryFoldArrayJoin(subtree);
		if ((subtree.getType()) == (com.google.javascript.rhino.Token.CALL)) {
			com.google.javascript.rhino.Node callTarget = subtree.getFirstChild();
			if (callTarget == null) {
				return subtree;
			}
			if (com.google.javascript.jscomp.NodeUtil.isGet(callTarget)) {
				subtree = tryFoldKnownStringMethods(subtree);
			}else {
				subtree = tryFoldKnownNumericMethods(subtree);
			}
		}
		return subtree;
	}

	private com.google.javascript.rhino.Node tryFoldKnownStringMethods(com.google.javascript.rhino.Node subtree) {
		com.google.common.base.Preconditions.checkArgument(((subtree.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.javascript.rhino.Node callTarget = subtree.getFirstChild();
		if (callTarget == null) {
			return subtree;
		}
		if (!(com.google.javascript.jscomp.NodeUtil.isGet(callTarget))) {
			return subtree;
		}
		com.google.javascript.rhino.Node stringNode = callTarget.getFirstChild();
		com.google.javascript.rhino.Node functionName = stringNode.getNext();
		if (((stringNode.getType()) != (com.google.javascript.rhino.Token.STRING)) || ((functionName.getType()) != (com.google.javascript.rhino.Token.STRING))) {
			return subtree;
		}
		java.lang.String functionNameString = functionName.getString();
		com.google.javascript.rhino.Node firstArg = callTarget.getNext();
		if (firstArg == null) {
			if (functionNameString.equals("toLowerCase")) {
				subtree = tryFoldStringToLowerCase(subtree, stringNode);
			}else
				if (functionNameString.equals("toUpperCase")) {
					subtree = tryFoldStringToUpperCase(subtree, stringNode);
				}
			
			return subtree;
		}else
			if (com.google.javascript.jscomp.NodeUtil.isImmutableValue(firstArg)) {
				if ((functionNameString.equals("indexOf")) || (functionNameString.equals("lastIndexOf"))) {
					subtree = tryFoldStringIndexOf(subtree, functionNameString, stringNode, firstArg);
				}else
					if (functionNameString.equals("substr")) {
						subtree = tryFoldStringSubstr(subtree, stringNode, firstArg);
					}else
						if (functionNameString.equals("substring")) {
							subtree = tryFoldStringSubstring(subtree, stringNode, firstArg);
						}else
							if (functionNameString.equals("charAt")) {
								subtree = tryFoldStringCharAt(subtree, stringNode, firstArg);
							}else
								if (functionNameString.equals("charCodeAt")) {
									subtree = tryFoldStringCharCodeAt(subtree, stringNode, firstArg);
								}
							
						
					
				
			}
		
		return subtree;
	}

	private com.google.javascript.rhino.Node tryFoldKnownNumericMethods(com.google.javascript.rhino.Node subtree) {
		com.google.common.base.Preconditions.checkArgument(((subtree.getType()) == (com.google.javascript.rhino.Token.CALL)));
		if (isASTNormalized()) {
			com.google.javascript.rhino.Node callTarget = subtree.getFirstChild();
			if (!(com.google.javascript.jscomp.NodeUtil.isName(callTarget))) {
				return subtree;
			}
			java.lang.String functionNameString = callTarget.getString();
			com.google.javascript.rhino.Node firstArgument = callTarget.getNext();
			if ((firstArgument != null) && (((firstArgument.getType()) == (com.google.javascript.rhino.Token.STRING)) || ((firstArgument.getType()) == (com.google.javascript.rhino.Token.NUMBER)))) {
				if ((functionNameString.equals("parseInt")) || (functionNameString.equals("parseFloat"))) {
					subtree = tryFoldParseNumber(subtree, functionNameString, firstArgument);
				}
			}
		}
		return subtree;
	}

	private com.google.javascript.rhino.Node tryFoldStringToLowerCase(com.google.javascript.rhino.Node subtree, com.google.javascript.rhino.Node stringNode) {
		java.lang.String lowered = stringNode.getString().toLowerCase(com.google.javascript.jscomp.PeepholeReplaceKnownMethods.ROOT_LOCALE);
		com.google.javascript.rhino.Node replacement = com.google.javascript.rhino.Node.newString(lowered);
		subtree.getParent().replaceChild(subtree, replacement);
		reportCodeChange();
		return replacement;
	}

	private com.google.javascript.rhino.Node tryFoldStringToUpperCase(com.google.javascript.rhino.Node subtree, com.google.javascript.rhino.Node stringNode) {
		java.lang.String uppered = stringNode.getString().toUpperCase(com.google.javascript.jscomp.PeepholeReplaceKnownMethods.ROOT_LOCALE);
		com.google.javascript.rhino.Node replacement = com.google.javascript.rhino.Node.newString(uppered);
		subtree.getParent().replaceChild(subtree, replacement);
		reportCodeChange();
		return replacement;
	}

	private java.lang.String normalizeNumericString(java.lang.String input) {
		if ((input == null) || ((input.length()) == 0)) {
			return input;
		}
		int startIndex = 0;
		int endIndex = (input.length()) - 1;
		while ((startIndex < (input.length())) && ((input.charAt(startIndex)) == '0')) {
			startIndex++;
		} 
		while ((endIndex >= 0) && ((input.charAt(endIndex)) == '0')) {
			endIndex--;
		} 
		if (startIndex >= endIndex) {
			return input;
		}
		return input.substring(startIndex, (endIndex + 1));
	}

	private com.google.javascript.rhino.Node tryFoldParseNumber(com.google.javascript.rhino.Node n, java.lang.String functionName, com.google.javascript.rhino.Node firstArg) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		boolean isParseInt = functionName.equals("parseInt");
		com.google.javascript.rhino.Node secondArg = firstArg.getNext();
		int radix = 0;
		if (secondArg != null) {
			if (!isParseInt) {
				return n;
			}
			if (((secondArg.getNext()) != null) || ((secondArg.getType()) != (com.google.javascript.rhino.Token.NUMBER))) {
				return n;
			}else {
				double tmpRadix = secondArg.getDouble();
				if (tmpRadix != ((int) (tmpRadix)))
					return n;
				
				radix = ((int) (tmpRadix));
				if (((radix < 0) || (radix == 1)) || (radix > 36)) {
					return n;
				}
			}
		}
		java.lang.String stringVal = null;
		java.lang.Double checkVal;
		if ((firstArg.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
			checkVal = com.google.javascript.jscomp.NodeUtil.getNumberValue(firstArg);
			if ((!((radix == 0) || (radix == 10))) && isParseInt) {
				stringVal = java.lang.String.valueOf(checkVal.intValue());
			}else {
				com.google.javascript.rhino.Node numericNode;
				if (isParseInt) {
					numericNode = com.google.javascript.rhino.Node.newNumber(checkVal.intValue());
				}else {
					numericNode = com.google.javascript.rhino.Node.newNumber(checkVal);
				}
				n.getParent().replaceChild(n, numericNode);
				reportCodeChange();
				return numericNode;
			}
		}else {
			stringVal = com.google.javascript.jscomp.NodeUtil.getStringValue(firstArg);
			if (stringVal == null) {
				return n;
			}
			checkVal = com.google.javascript.jscomp.NodeUtil.getStringNumberValue(stringVal);
			if (checkVal == null) {
				return n;
			}
			stringVal = com.google.javascript.jscomp.NodeUtil.trimJsWhiteSpace(stringVal);
		}
		com.google.javascript.rhino.Node newNode;
		if (isParseInt) {
			if ((radix == 0) || (radix == 16)) {
				if (((stringVal.length()) > 1) && (stringVal.substring(0, 2).equalsIgnoreCase("0x"))) {
					radix = 16;
					stringVal = stringVal.substring(2);
				}else
					if (radix == 0) {
						if ((!(isEcmaScript5OrGreater())) && (stringVal.substring(0, 1).equals("0"))) {
							return n;
						}
						radix = 10;
					}
				
			}
			int newVal = 0;
			try {
				newVal = java.lang.Integer.parseInt(stringVal, radix);
			} catch (java.lang.NumberFormatException e) {
				return n;
			}
			newNode = com.google.javascript.rhino.Node.newNumber(newVal);
		}else {
			java.lang.String normalizedNewVal = "0";
			try {
				double newVal = java.lang.Double.parseDouble(stringVal);
				newNode = com.google.javascript.rhino.Node.newNumber(newVal);
				normalizedNewVal = normalizeNumericString(java.lang.String.valueOf(newVal));
			} catch (java.lang.NumberFormatException e) {
				return n;
			}
			if (!(normalizeNumericString(stringVal).equals(normalizedNewVal))) {
				return n;
			}
		}
		n.getParent().replaceChild(n, newNode);
		reportCodeChange();
		return newNode;
	}

	private com.google.javascript.rhino.Node tryFoldStringIndexOf(com.google.javascript.rhino.Node n, java.lang.String functionName, com.google.javascript.rhino.Node lstringNode, com.google.javascript.rhino.Node firstArg) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.common.base.Preconditions.checkArgument(((lstringNode.getType()) == (com.google.javascript.rhino.Token.STRING)));
		java.lang.String lstring = com.google.javascript.jscomp.NodeUtil.getStringValue(lstringNode);
		boolean isIndexOf = functionName.equals("indexOf");
		com.google.javascript.rhino.Node secondArg = firstArg.getNext();
		java.lang.String searchValue = com.google.javascript.jscomp.NodeUtil.getStringValue(firstArg);
		if (searchValue == null) {
			return n;
		}
		int fromIndex = isIndexOf ? 0 : lstring.length();
		if (secondArg != null) {
			if (((secondArg.getNext()) != null) || ((secondArg.getType()) != (com.google.javascript.rhino.Token.NUMBER))) {
				return n;
			}else {
				fromIndex = ((int) (secondArg.getDouble()));
			}
		}
		int indexVal = isIndexOf ? lstring.indexOf(searchValue, fromIndex) : lstring.lastIndexOf(searchValue, fromIndex);
		com.google.javascript.rhino.Node newNode = com.google.javascript.rhino.Node.newNumber(indexVal);
		n.getParent().replaceChild(n, newNode);
		reportCodeChange();
		return newNode;
	}

	private com.google.javascript.rhino.Node tryFoldArrayJoin(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node callTarget = n.getFirstChild();
		if ((callTarget == null) || (!(com.google.javascript.jscomp.NodeUtil.isGetProp(callTarget)))) {
			return n;
		}
		com.google.javascript.rhino.Node right = callTarget.getNext();
		if (right != null) {
			if (!(com.google.javascript.jscomp.NodeUtil.isImmutableValue(right))) {
				return n;
			}
		}
		com.google.javascript.rhino.Node arrayNode = callTarget.getFirstChild();
		com.google.javascript.rhino.Node functionName = arrayNode.getNext();
		if (((arrayNode.getType()) != (com.google.javascript.rhino.Token.ARRAYLIT)) || (!(functionName.getString().equals("join")))) {
			return n;
		}
		java.lang.String joinString = right == null ? "," : com.google.javascript.jscomp.NodeUtil.getStringValue(right);
		java.util.List<com.google.javascript.rhino.Node> arrayFoldedChildren = com.google.common.collect.Lists.newLinkedList();
		java.lang.StringBuilder sb = null;
		int foldedSize = 0;
		com.google.javascript.rhino.Node prev = null;
		com.google.javascript.rhino.Node elem = arrayNode.getFirstChild();
		while (elem != null) {
			if ((com.google.javascript.jscomp.NodeUtil.isImmutableValue(elem)) || ((elem.getType()) == (com.google.javascript.rhino.Token.EMPTY))) {
				if (sb == null) {
					sb = new java.lang.StringBuilder();
				}else {
					sb.append(joinString);
				}
				sb.append(com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(elem));
			}else {
				if (sb != null) {
					com.google.common.base.Preconditions.checkNotNull(prev);
					foldedSize += (sb.length()) + 2;
					arrayFoldedChildren.add(com.google.javascript.rhino.Node.newString(sb.toString()).copyInformationFrom(prev));
					sb = null;
				}
				foldedSize += com.google.javascript.jscomp.InlineCostEstimator.getCost(elem);
				arrayFoldedChildren.add(elem);
			}
			prev = elem;
			elem = elem.getNext();
		} 
		if (sb != null) {
			com.google.common.base.Preconditions.checkNotNull(prev);
			foldedSize += (sb.length()) + 2;
			arrayFoldedChildren.add(com.google.javascript.rhino.Node.newString(sb.toString()).copyInformationFrom(prev));
		}
		foldedSize += (arrayFoldedChildren.size()) - 1;
		int originalSize = com.google.javascript.jscomp.InlineCostEstimator.getCost(n);
		switch (arrayFoldedChildren.size()) {
			case 0 :
				com.google.javascript.rhino.Node emptyStringNode = com.google.javascript.rhino.Node.newString("");
				n.getParent().replaceChild(n, emptyStringNode);
				reportCodeChange();
				return emptyStringNode;
			case 1 :
				com.google.javascript.rhino.Node foldedStringNode = arrayFoldedChildren.remove(0);
				if (foldedSize > originalSize) {
					return n;
				}
				arrayNode.detachChildren();
				if ((foldedStringNode.getType()) != (com.google.javascript.rhino.Token.STRING)) {
					com.google.javascript.rhino.Node replacement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ADD, com.google.javascript.rhino.Node.newString("").copyInformationFrom(n), foldedStringNode);
					foldedStringNode = replacement;
				}
				n.getParent().replaceChild(n, foldedStringNode);
				reportCodeChange();
				return foldedStringNode;
			default :
				if ((arrayFoldedChildren.size()) == (arrayNode.getChildCount())) {
					return n;
				}
				int kJoinOverhead = "[].join()".length();
				foldedSize += kJoinOverhead;
				foldedSize += (right != null) ? com.google.javascript.jscomp.InlineCostEstimator.getCost(right) : 0;
				if (foldedSize > originalSize) {
					return n;
				}
				arrayNode.detachChildren();
				for (com.google.javascript.rhino.Node node : arrayFoldedChildren) {
					arrayNode.addChildToBack(node);
				}
				reportCodeChange();
				break;
		}
		return n;
	}

	private com.google.javascript.rhino.Node tryFoldStringSubstr(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node stringNode, com.google.javascript.rhino.Node arg1) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.common.base.Preconditions.checkArgument(((stringNode.getType()) == (com.google.javascript.rhino.Token.STRING)));
		int start;
		int length;
		java.lang.String stringAsString = stringNode.getString();
		if ((arg1 != null) && ((arg1.getType()) == (com.google.javascript.rhino.Token.NUMBER))) {
			start = ((int) (arg1.getDouble()));
		}else {
			return n;
		}
		com.google.javascript.rhino.Node arg2 = arg1.getNext();
		if (arg2 != null) {
			if ((arg2.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
				length = ((int) (arg2.getDouble()));
			}else {
				return n;
			}
			if ((arg2.getNext()) != null) {
				return n;
			}
		}else {
			length = (stringAsString.length()) - start;
		}
		if ((((start + length) > (stringAsString.length())) || (length < 0)) || (start < 0)) {
			return n;
		}
		java.lang.String result = stringAsString.substring(start, (start + length));
		com.google.javascript.rhino.Node resultNode = com.google.javascript.rhino.Node.newString(result);
		com.google.javascript.rhino.Node parent = n.getParent();
		parent.replaceChild(n, resultNode);
		reportCodeChange();
		return resultNode;
	}

	private com.google.javascript.rhino.Node tryFoldStringSubstring(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node stringNode, com.google.javascript.rhino.Node arg1) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.common.base.Preconditions.checkArgument(((stringNode.getType()) == (com.google.javascript.rhino.Token.STRING)));
		int start;
		int end;
		java.lang.String stringAsString = stringNode.getString();
		if ((arg1 != null) && ((arg1.getType()) == (com.google.javascript.rhino.Token.NUMBER))) {
			start = ((int) (arg1.getDouble()));
		}else {
			return n;
		}
		com.google.javascript.rhino.Node arg2 = arg1.getNext();
		if (arg2 != null) {
			if ((arg2.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
				end = ((int) (arg2.getDouble()));
			}else {
				return n;
			}
			if ((arg2.getNext()) != null) {
				return n;
			}
		}else {
			end = stringAsString.length();
		}
		if ((((end > (stringAsString.length())) || (start > (stringAsString.length()))) || (end < 0)) || (start < 0)) {
			return n;
		}
		java.lang.String result = stringAsString.substring(start, end);
		com.google.javascript.rhino.Node resultNode = com.google.javascript.rhino.Node.newString(result);
		com.google.javascript.rhino.Node parent = n.getParent();
		parent.replaceChild(n, resultNode);
		reportCodeChange();
		return resultNode;
	}

	private com.google.javascript.rhino.Node tryFoldStringCharAt(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node stringNode, com.google.javascript.rhino.Node arg1) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.common.base.Preconditions.checkArgument(((stringNode.getType()) == (com.google.javascript.rhino.Token.STRING)));
		int index;
		java.lang.String stringAsString = stringNode.getString();
		if (((arg1 != null) && ((arg1.getType()) == (com.google.javascript.rhino.Token.NUMBER))) && ((arg1.getNext()) == null)) {
			index = ((int) (arg1.getDouble()));
		}else {
			return n;
		}
		if ((index < 0) || ((stringAsString.length()) <= index)) {
			return n;
		}
		com.google.javascript.rhino.Node resultNode = com.google.javascript.rhino.Node.newString(stringAsString.substring(index, (index + 1)));
		com.google.javascript.rhino.Node parent = n.getParent();
		parent.replaceChild(n, resultNode);
		reportCodeChange();
		return resultNode;
	}

	private com.google.javascript.rhino.Node tryFoldStringCharCodeAt(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node stringNode, com.google.javascript.rhino.Node arg1) {
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.CALL)));
		com.google.common.base.Preconditions.checkArgument(((stringNode.getType()) == (com.google.javascript.rhino.Token.STRING)));
		int index;
		java.lang.String stringAsString = stringNode.getString();
		if (((arg1 != null) && ((arg1.getType()) == (com.google.javascript.rhino.Token.NUMBER))) && ((arg1.getNext()) == null)) {
			index = ((int) (arg1.getDouble()));
		}else {
			return n;
		}
		if ((index < 0) || ((stringAsString.length()) <= index)) {
			return n;
		}
		com.google.javascript.rhino.Node resultNode = com.google.javascript.rhino.Node.newNumber(stringAsString.charAt(index));
		com.google.javascript.rhino.Node parent = n.getParent();
		parent.replaceChild(n, resultNode);
		reportCodeChange();
		return resultNode;
	}
}

