

package com.google.javascript.jscomp;


class NodeIterators {
	private NodeIterators() {
	}

	static class FunctionlessLocalScope implements java.util.Iterator<com.google.javascript.rhino.Node> {
		private final java.util.Stack<com.google.javascript.rhino.Node> ancestors = new java.util.Stack<com.google.javascript.rhino.Node>();

		FunctionlessLocalScope(com.google.javascript.rhino.Node... ancestors) {
			com.google.common.base.Preconditions.checkArgument(((ancestors.length) > 0));
			for (com.google.javascript.rhino.Node n : ancestors) {
				if (n.isFunction()) {
					break;
				}
				com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope.this.ancestors.add(0, n);
			}
		}

		@java.lang.Override
		public boolean hasNext() {
			return !(((ancestors.size()) == 1) && ((ancestors.peek().getNext()) == null));
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node next() {
			com.google.javascript.rhino.Node current = ancestors.pop();
			if ((current.getNext()) == null) {
				current = ancestors.peek();
				if (current.isFunction()) {
					return next();
				}
			}else {
				current = current.getNext();
				ancestors.push(current);
				if (current.isFunction()) {
					return next();
				}
				while (current.hasChildren()) {
					current = current.getFirstChild();
					ancestors.push(current);
					if (current.isFunction()) {
						return next();
					}
				} 
			}
			return current;
		}

		@java.lang.Override
		public void remove() {
			throw new java.lang.UnsupportedOperationException("Not implemented");
		}

		protected com.google.javascript.rhino.Node current() {
			return ancestors.peek();
		}

		protected com.google.javascript.rhino.Node currentParent() {
			return (ancestors.size()) >= 2 ? ancestors.get(((ancestors.size()) - 2)) : null;
		}

		java.util.List<com.google.javascript.rhino.Node> currentAncestors() {
			java.util.List<com.google.javascript.rhino.Node> list = com.google.common.collect.Lists.newArrayList(ancestors);
			java.util.Collections.reverse(list);
			return list;
		}
	}

	static class LocalVarMotion implements java.util.Iterator<com.google.javascript.rhino.Node> {
		private final boolean valueHasSideEffects;

		private final com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope iterator;

		private final java.lang.String varName;

		private com.google.javascript.rhino.Node lookAhead;

		static com.google.javascript.jscomp.NodeIterators.LocalVarMotion forVar(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node var, com.google.javascript.rhino.Node block) {
			com.google.common.base.Preconditions.checkArgument(var.isVar());
			com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isStatement(var));
			return new com.google.javascript.jscomp.NodeIterators.LocalVarMotion(name, new com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope(name, var, block));
		}

		static com.google.javascript.jscomp.NodeIterators.LocalVarMotion forAssign(com.google.javascript.rhino.Node name, com.google.javascript.rhino.Node assign, com.google.javascript.rhino.Node expr, com.google.javascript.rhino.Node block) {
			com.google.common.base.Preconditions.checkArgument(assign.isAssign());
			com.google.common.base.Preconditions.checkArgument(expr.isExprResult());
			return new com.google.javascript.jscomp.NodeIterators.LocalVarMotion(name, new com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope(assign, expr, block));
		}

		private LocalVarMotion(com.google.javascript.rhino.Node nameNode, com.google.javascript.jscomp.NodeIterators.FunctionlessLocalScope iterator) {
			com.google.common.base.Preconditions.checkArgument(nameNode.isName());
			com.google.javascript.rhino.Node valueNode = com.google.javascript.jscomp.NodeUtil.getAssignedValue(nameNode);
			this.varName = nameNode.getString();
			this.valueHasSideEffects = (valueNode != null) && (com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(valueNode));
			this.iterator = iterator;
			advanceLookAhead(true);
		}

		@java.lang.Override
		public boolean hasNext() {
			return (lookAhead) != null;
		}

		@java.lang.Override
		public com.google.javascript.rhino.Node next() {
			com.google.javascript.rhino.Node next = lookAhead;
			advanceLookAhead(false);
			return next;
		}

		@java.lang.Override
		public void remove() {
			throw new java.lang.UnsupportedOperationException("Not implemented");
		}

		private void advanceLookAhead(boolean atStart) {
			if (!atStart) {
				if ((lookAhead) == null) {
					return ;
				}
				com.google.javascript.rhino.Node curNode = iterator.current();
				if ((curNode.isName()) && (varName.equals(curNode.getString()))) {
					lookAhead = null;
					return ;
				}
			}
			if (!(iterator.hasNext())) {
				lookAhead = null;
				return ;
			}
			com.google.javascript.rhino.Node nextNode = iterator.next();
			com.google.javascript.rhino.Node nextParent = iterator.currentParent();
			int type = nextNode.getType();
			if (valueHasSideEffects) {
				boolean readsState = false;
				if (((nextNode.isName()) && (!(varName.equals(nextNode.getString())))) || ((nextNode.isGetProp()) || (nextNode.isGetElem()))) {
					if ((nextParent == null) || (!(com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(nextNode, nextParent)))) {
						readsState = true;
					}
				}else
					if ((nextNode.isCall()) || (nextNode.isNew())) {
						readsState = true;
					}
				
				if (readsState) {
					lookAhead = null;
					return ;
				}
			}
			if (((com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(nextNode)) && (type != (com.google.javascript.rhino.Token.NAME))) || ((type == (com.google.javascript.rhino.Token.NAME)) && (nextParent.isCatch()))) {
				lookAhead = null;
				return ;
			}
			lookAhead = nextNode;
		}
	}
}

