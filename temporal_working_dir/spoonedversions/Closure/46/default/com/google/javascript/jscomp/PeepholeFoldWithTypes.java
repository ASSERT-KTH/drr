

package com.google.javascript.jscomp;


class PeepholeFoldWithTypes extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	@java.lang.Override
	com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree) {
		switch (subtree.getType()) {
			case com.google.javascript.rhino.Token.TYPEOF :
				return tryFoldTypeof(subtree);
			default :
				return subtree;
		}
	}

	private com.google.javascript.rhino.Node tryFoldTypeof(com.google.javascript.rhino.Node typeofNode) {
		com.google.common.base.Preconditions.checkArgument(typeofNode.isTypeOf());
		com.google.common.base.Preconditions.checkArgument(((typeofNode.getFirstChild()) != null));
		com.google.javascript.rhino.Node argumentNode = typeofNode.getFirstChild();
		if ((!(com.google.javascript.jscomp.NodeUtil.isLiteralValue(argumentNode, true))) && (!(mayHaveSideEffects(argumentNode)))) {
			com.google.javascript.rhino.jstype.JSType argumentType = argumentNode.getJSType();
			java.lang.String typeName = null;
			if (argumentType != null) {
				if ((argumentType.isObject()) || (argumentType.isNullType())) {
					typeName = "object";
				}else
					if (argumentType.isStringValueType()) {
						typeName = "string";
					}else
						if (argumentType.isNumberValueType()) {
							typeName = "number";
						}else
							if (argumentType.isBooleanValueType()) {
								typeName = "boolean";
							}else
								if (argumentType.isVoidType()) {
									typeName = "undefined";
								}else
									if (argumentType.isUnionType()) {
										typeName = null;
									}
								
							
						
					
				
				if (typeName != null) {
					com.google.javascript.rhino.Node newNode = com.google.javascript.rhino.Node.newString(typeName);
					typeofNode.getParent().replaceChild(typeofNode, newNode);
					reportCodeChange();
					return newNode;
				}
			}
		}
		return typeofNode;
	}
}

