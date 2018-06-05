

package com.google.javascript.jscomp;


class PeepholeOptimizationsPass implements com.google.javascript.jscomp.CompilerPass {
	private com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.AbstractPeepholeOptimization[] peepholeOptimizations;

	private com.google.javascript.jscomp.PeepholeOptimizationsPass.StateStack traversalState = new com.google.javascript.jscomp.PeepholeOptimizationsPass.StateStack();

	private boolean retraverseOnChange = true;

	private static class ScopeState {
		boolean changed;

		boolean traverseChildScopes;

		ScopeState() {
			reset();
		}

		void reset() {
			changed = false;
			traverseChildScopes = true;
		}
	}

	private static class StateStack {
		private java.util.ArrayList<com.google.javascript.jscomp.PeepholeOptimizationsPass.ScopeState> states = com.google.common.collect.Lists.newArrayList();

		private int currentDepth = 0;

		StateStack() {
			states.add(new com.google.javascript.jscomp.PeepholeOptimizationsPass.ScopeState());
		}

		com.google.javascript.jscomp.PeepholeOptimizationsPass.ScopeState peek() {
			return states.get(currentDepth);
		}

		void push() {
			(currentDepth)++;
			if ((states.size()) <= (currentDepth)) {
				states.add(new com.google.javascript.jscomp.PeepholeOptimizationsPass.ScopeState());
			}else {
				states.get(currentDepth).reset();
			}
		}

		void pop() {
			(currentDepth)--;
		}
	}

	private class PeepholeChangeHandler extends com.google.javascript.jscomp.CodeChangeHandler {
		@java.lang.Override
		public void reportChange() {
			traversalState.peek().changed = true;
		}
	}

	PeepholeOptimizationsPass(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.AbstractPeepholeOptimization... optimizations) {
		com.google.javascript.jscomp.PeepholeOptimizationsPass.this.compiler = compiler;
		this.peepholeOptimizations = optimizations;
	}

	com.google.javascript.jscomp.PeepholeOptimizationsPass setRetraverseOnChange(boolean retraverse) {
		com.google.javascript.jscomp.PeepholeOptimizationsPass.this.retraverseOnChange = retraverse;
		return com.google.javascript.jscomp.PeepholeOptimizationsPass.this;
	}

	public com.google.javascript.jscomp.AbstractCompiler getCompiler() {
		return compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.PeepholeOptimizationsPass.PeepholeChangeHandler handler = new com.google.javascript.jscomp.PeepholeOptimizationsPass.PeepholeChangeHandler();
		compiler.addChangeHandler(handler);
		beginTraversal();
		traverse(root);
		endTraversal();
		compiler.removeChangeHandler(handler);
	}

	private void traverse(com.google.javascript.rhino.Node node) {
		if (!(shouldVisit(node))) {
			return ;
		}
		int visits = 0;
		do {
			com.google.javascript.rhino.Node c = node.getFirstChild();
			while (c != null) {
				com.google.javascript.rhino.Node next = c.getNext();
				traverse(c);
				c = next;
			} 
			visit(node);
			visits++;
			com.google.common.base.Preconditions.checkState((visits < 10000), "too many interations");
		} while (shouldRetraverse(node) );
		exitNode(node);
	}

	private boolean shouldRetraverse(com.google.javascript.rhino.Node node) {
		if (((retraverseOnChange) && ((node.getParent()) != null)) && ((node.isFunction()) || (node.isScript()))) {
			com.google.javascript.jscomp.PeepholeOptimizationsPass.ScopeState state = traversalState.peek();
			if (state.changed) {
				state.changed = false;
				state.traverseChildScopes = false;
				return true;
			}
		}
		return false;
	}

	private boolean shouldVisit(com.google.javascript.rhino.Node node) {
		if ((node.isFunction()) || (node.isScript())) {
			com.google.javascript.jscomp.PeepholeOptimizationsPass.ScopeState previous = traversalState.peek();
			if (!(previous.traverseChildScopes)) {
				return false;
			}
			traversalState.push();
		}
		return true;
	}

	private void exitNode(com.google.javascript.rhino.Node node) {
		if ((node.isFunction()) || (node.isScript())) {
			traversalState.pop();
		}
	}

	public void visit(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node currentVersionOfNode = n;
		boolean somethingChanged = false;
		do {
			somethingChanged = false;
			for (com.google.javascript.jscomp.AbstractPeepholeOptimization optimization : peepholeOptimizations) {
				com.google.javascript.rhino.Node newVersionOfNode = optimization.optimizeSubtree(currentVersionOfNode);
				if (newVersionOfNode != currentVersionOfNode) {
					somethingChanged = true;
					currentVersionOfNode = newVersionOfNode;
				}
				if (currentVersionOfNode == null) {
					return ;
				}
			}
		} while (somethingChanged );
	}

	private void beginTraversal() {
		for (com.google.javascript.jscomp.AbstractPeepholeOptimization optimization : peepholeOptimizations) {
			optimization.beginTraversal(compiler);
		}
	}

	private void endTraversal() {
		for (com.google.javascript.jscomp.AbstractPeepholeOptimization optimization : peepholeOptimizations) {
			optimization.endTraversal(compiler);
		}
	}
}

