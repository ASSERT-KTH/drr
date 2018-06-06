

package com.google.javascript.jscomp;


public class PeepholeCollectPropertyAssignments extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	@java.lang.Override
	com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree) {
		if ((!(subtree.isScript())) && (!(subtree.isBlock()))) {
			return subtree;
		}
		boolean codeChanged = false;
		for (com.google.javascript.rhino.Node child = subtree.getFirstChild(); child != null; child = child.getNext()) {
			if ((!(child.isVar())) && (!(com.google.javascript.jscomp.NodeUtil.isExprAssign(child)))) {
				continue;
			}
			if (!(isPropertyAssignmentToName(child.getNext()))) {
				continue;
			}
			com.google.common.base.Preconditions.checkState(child.hasOneChild());
			com.google.javascript.rhino.Node name = getName(child);
			if (!(name.isName())) {
				continue;
			}
			com.google.javascript.rhino.Node value = getValue(child);
			if ((value == null) || (!(isInterestingValue(value)))) {
				continue;
			}
			com.google.javascript.rhino.Node propertyCandidate;
			while ((propertyCandidate = child.getNext()) != null) {
				if (!(collectProperty(propertyCandidate, name.getString(), value))) {
					break;
				}
				codeChanged = true;
			} 
		}
		if (codeChanged) {
			reportCodeChange();
		}
		return subtree;
	}

	private com.google.javascript.rhino.Node getName(com.google.javascript.rhino.Node n) {
		if (n.isVar()) {
			return n.getFirstChild();
		}else
			if (com.google.javascript.jscomp.NodeUtil.isExprAssign(n)) {
				return n.getFirstChild().getFirstChild();
			}
		
		throw new java.lang.IllegalStateException();
	}

	private com.google.javascript.rhino.Node getValue(com.google.javascript.rhino.Node n) {
		if (n.isVar()) {
			return n.getFirstChild().getFirstChild();
		}else
			if (com.google.javascript.jscomp.NodeUtil.isExprAssign(n)) {
				return n.getFirstChild().getLastChild();
			}
		
		throw new java.lang.IllegalStateException();
	}

	boolean isInterestingValue(com.google.javascript.rhino.Node n) {
		return (n.isObjectLit()) || (n.isArrayLit());
	}

	private boolean isPropertyAssignmentToName(com.google.javascript.rhino.Node propertyCandidate) {
		if (propertyCandidate == null) {
			return false;
		}
		if (!(com.google.javascript.jscomp.NodeUtil.isExprAssign(propertyCandidate))) {
			return false;
		}
		com.google.javascript.rhino.Node expr = propertyCandidate.getFirstChild();
		com.google.javascript.rhino.Node lhs = expr.getFirstChild();
		if (!(com.google.javascript.jscomp.NodeUtil.isGet(lhs))) {
			return false;
		}
		com.google.javascript.rhino.Node obj = lhs.getFirstChild();
		if (!(obj.isName())) {
			return false;
		}
		return true;
	}

	private boolean collectProperty(com.google.javascript.rhino.Node propertyCandidate, java.lang.String name, com.google.javascript.rhino.Node value) {
		if (!(isPropertyAssignmentToName(propertyCandidate))) {
			return false;
		}
		com.google.javascript.rhino.Node lhs = propertyCandidate.getFirstChild().getFirstChild();
		if (!(name.equals(lhs.getFirstChild().getString()))) {
			return false;
		}
		com.google.javascript.rhino.Node rhs = lhs.getNext();
		if ((mayHaveSideEffects(rhs)) || (com.google.javascript.jscomp.NodeUtil.canBeSideEffected(rhs))) {
			return false;
		}
		if ((!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(rhs, true))) && (com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.mightContainForwardReference(rhs, name))) {
			return false;
		}
		switch (value.getType()) {
			case com.google.javascript.rhino.Token.ARRAYLIT :
				if (!(collectArrayProperty(value, propertyCandidate))) {
					return false;
				}
				break;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				if (!(collectObjectProperty(value, propertyCandidate))) {
					return false;
				}
				break;
			default :
				throw new java.lang.IllegalStateException();
		}
		return true;
	}

	private boolean collectArrayProperty(com.google.javascript.rhino.Node arrayLiteral, com.google.javascript.rhino.Node propertyCandidate) {
		com.google.javascript.rhino.Node assignment = propertyCandidate.getFirstChild();
		final int sizeOfArrayAtStart = arrayLiteral.getChildCount();
		int maxIndexAssigned = sizeOfArrayAtStart - 1;
		com.google.javascript.rhino.Node lhs = assignment.getFirstChild();
		com.google.javascript.rhino.Node rhs = lhs.getNext();
		if (!(lhs.isGetElem())) {
			return false;
		}
		com.google.javascript.rhino.Node obj = lhs.getFirstChild();
		com.google.javascript.rhino.Node property = obj.getNext();
		if (!(property.isNumber())) {
			return false;
		}
		double dindex = property.getDouble();
		if (((!(dindex >= 0)) || (java.lang.Double.isInfinite(dindex))) || (dindex > 2147483647L)) {
			return false;
		}
		int index = ((int) (dindex));
		if (dindex != index) {
			return false;
		}
		if ((maxIndexAssigned + 4) < index) {
			return false;
		}
		if (index > maxIndexAssigned) {
			while (maxIndexAssigned < (index - 1)) {
				com.google.javascript.rhino.Node emptyNode = com.google.javascript.rhino.IR.empty().srcref(arrayLiteral);
				arrayLiteral.addChildToBack(emptyNode);
				++maxIndexAssigned;
			} 
			arrayLiteral.addChildToBack(rhs.detachFromParent());
		}else {
			com.google.javascript.rhino.Node currentValue = arrayLiteral.getChildAtIndex(index);
			if (!(currentValue.isEmpty())) {
				return false;
			}
			arrayLiteral.replaceChild(currentValue, rhs.detachFromParent());
		}
		propertyCandidate.detachFromParent();
		return true;
	}

	private boolean collectObjectProperty(com.google.javascript.rhino.Node objectLiteral, com.google.javascript.rhino.Node propertyCandidate) {
		com.google.javascript.rhino.Node assignment = propertyCandidate.getFirstChild();
		com.google.javascript.rhino.Node lhs = assignment.getFirstChild();
		com.google.javascript.rhino.Node rhs = lhs.getNext();
		com.google.javascript.rhino.Node obj = lhs.getFirstChild();
		com.google.javascript.rhino.Node property = obj.getNext();
		if ((lhs.isGetElem()) && ((!(property.isString())) && (!(property.isNumber())))) {
			return false;
		}
		java.lang.String propertyName;
		if (property.isNumber()) {
			propertyName = com.google.javascript.jscomp.NodeUtil.getStringValue(property);
		}else {
			propertyName = property.getString();
		}
		com.google.javascript.rhino.Node newProperty = com.google.javascript.rhino.IR.stringKey(propertyName).copyInformationFrom(property);
		if (lhs.isGetElem()) {
			newProperty.setQuotedString();
		}
		com.google.javascript.rhino.Node newValue = rhs.detachFromParent();
		newProperty.addChildToBack(newValue);
		objectLiteral.addChildToBack(newProperty);
		propertyCandidate.detachFromParent();
		return true;
	}

	private static boolean mightContainForwardReference(com.google.javascript.rhino.Node node, java.lang.String varName) {
		if (node.isName()) {
			return varName.equals(node.getString());
		}
		for (com.google.javascript.rhino.Node child = node.getFirstChild(); child != null; child = child.getNext()) {
			if (com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.mightContainForwardReference(child, varName)) {
				return true;
			}
		}
		return false;
	}
}

