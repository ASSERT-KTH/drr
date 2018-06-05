

package com.google.javascript.jscomp;


public class PeepholeCollectPropertyAssignments extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	@java.lang.Override
	com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree) {
		if (((subtree.getType()) != (com.google.javascript.rhino.Token.SCRIPT)) && ((subtree.getType()) != (com.google.javascript.rhino.Token.BLOCK))) {
			return subtree;
		}
		boolean codeChanged = false;
		for (com.google.javascript.rhino.Node child = subtree.getFirstChild(); child != null; child = child.getNext()) {
			if ((child.getType()) != (com.google.javascript.rhino.Token.VAR)) {
				continue;
			}
			if (!(isPropertyAssignmentToVar(child.getNext()))) {
				continue;
			}
			com.google.common.base.Preconditions.checkState(child.hasOneChild());
			com.google.javascript.rhino.Node var = child.getFirstChild();
			com.google.javascript.rhino.Node varValue = var.getFirstChild();
			if (varValue == null) {
				continue;
			}
			com.google.javascript.rhino.Node propertyCandidate;
			while ((propertyCandidate = child.getNext()) != null) {
				if (!(collectProperty(propertyCandidate, var))) {
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

	private boolean isPropertyAssignmentToVar(com.google.javascript.rhino.Node propertyCandidate) {
		if (propertyCandidate == null) {
			return false;
		}
		if (!(com.google.javascript.jscomp.NodeUtil.isExprAssign(propertyCandidate))) {
			return false;
		}
		com.google.javascript.rhino.Node expr = propertyCandidate.getFirstChild();
		com.google.javascript.rhino.Node lhs = expr.getFirstChild();
		if (((lhs.getType()) != (com.google.javascript.rhino.Token.GETELEM)) && ((lhs.getType()) != (com.google.javascript.rhino.Token.GETPROP))) {
			return false;
		}
		com.google.javascript.rhino.Node obj = lhs.getFirstChild();
		if ((obj.getType()) != (com.google.javascript.rhino.Token.NAME)) {
			return false;
		}
		return true;
	}

	private boolean collectProperty(com.google.javascript.rhino.Node propertyCandidate, com.google.javascript.rhino.Node var) {
		if (!(isPropertyAssignmentToVar(propertyCandidate))) {
			return false;
		}
		java.lang.String varName = var.getString();
		com.google.javascript.rhino.Node lhs = propertyCandidate.getFirstChild().getFirstChild();
		if (!(varName.equals(lhs.getFirstChild().getString()))) {
			return false;
		}
		com.google.javascript.rhino.Node rhs = lhs.getNext();
		if ((com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(rhs)) || (com.google.javascript.jscomp.NodeUtil.canBeSideEffected(rhs))) {
			return false;
		}
		if (com.google.javascript.jscomp.PeepholeCollectPropertyAssignments.mightContainForwardReference(rhs, varName)) {
			return false;
		}
		com.google.javascript.rhino.Node varValue = var.getFirstChild();
		switch (varValue.getType()) {
			case com.google.javascript.rhino.Token.ARRAYLIT :
				if (!(collectArrayProperty(varValue, propertyCandidate))) {
					return false;
				}
				break;
			case com.google.javascript.rhino.Token.OBJECTLIT :
				if (!(collectObjectProperty(varValue, propertyCandidate))) {
					return false;
				}
				break;
			default :
				return false;
		}
		return true;
	}

	private boolean collectArrayProperty(com.google.javascript.rhino.Node arrayLiteral, com.google.javascript.rhino.Node propertyCandidate) {
		com.google.javascript.rhino.Node assignment = propertyCandidate.getFirstChild();
		final int sizeOfArrayAtStart = arrayLiteral.getChildCount();
		int maxIndexAssigned = sizeOfArrayAtStart - 1;
		com.google.javascript.rhino.Node lhs = assignment.getFirstChild();
		com.google.javascript.rhino.Node rhs = lhs.getNext();
		if ((lhs.getType()) != (com.google.javascript.rhino.Token.GETELEM)) {
			return false;
		}
		com.google.javascript.rhino.Node obj = lhs.getFirstChild();
		com.google.javascript.rhino.Node property = obj.getNext();
		if ((property.getType()) != (com.google.javascript.rhino.Token.NUMBER)) {
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
				com.google.javascript.rhino.Node emptyNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY).copyInformationFrom(arrayLiteral);
				arrayLiteral.addChildToBack(emptyNode);
				++maxIndexAssigned;
			} 
			arrayLiteral.addChildToBack(rhs.detachFromParent());
		}else {
			com.google.javascript.rhino.Node currentValue = arrayLiteral.getChildAtIndex(index);
			if ((currentValue.getType()) != (com.google.javascript.rhino.Token.EMPTY)) {
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
		if (((lhs.getType()) == (com.google.javascript.rhino.Token.GETELEM)) && (((property.getType()) != (com.google.javascript.rhino.Token.STRING)) && ((property.getType()) != (com.google.javascript.rhino.Token.NUMBER)))) {
			return false;
		}
		java.lang.String propertyName;
		if ((property.getType()) == (com.google.javascript.rhino.Token.NUMBER)) {
			propertyName = com.google.javascript.jscomp.NodeUtil.getStringValue(property);
		}else {
			propertyName = property.getString();
		}
		com.google.javascript.rhino.Node newProperty = com.google.javascript.rhino.Node.newString(propertyName).copyInformationFrom(property);
		if ((lhs.getType()) == (com.google.javascript.rhino.Token.GETELEM)) {
			newProperty.setQuotedString();
		}
		com.google.javascript.rhino.Node newValue = rhs.detachFromParent();
		newProperty.addChildToBack(newValue);
		objectLiteral.addChildToBack(newProperty);
		propertyCandidate.detachFromParent();
		return true;
	}

	private static boolean mightContainForwardReference(com.google.javascript.rhino.Node node, java.lang.String varName) {
		if ((node.getType()) == (com.google.javascript.rhino.Token.NAME)) {
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

