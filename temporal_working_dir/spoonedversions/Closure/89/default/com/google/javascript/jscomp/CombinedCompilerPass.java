

package com.google.javascript.jscomp;


final class CombinedCompilerPass implements com.google.javascript.jscomp.CompilerPass , com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
	private final com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper[] callbacks;

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	CombinedCompilerPass(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.NodeTraversal.Callback... callbacks) {
		this(compiler, com.google.common.collect.Lists.<com.google.javascript.jscomp.NodeTraversal.Callback>newArrayList(callbacks));
	}

	CombinedCompilerPass(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.List<com.google.javascript.jscomp.NodeTraversal.Callback> callbacks) {
		this.compiler = compiler;
		this.callbacks = new com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper[callbacks.size()];
		for (int i = 0; i < (callbacks.size()); i++) {
			com.google.javascript.jscomp.CombinedCompilerPass.this.callbacks[i] = new com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper(callbacks.get(i));
		}
	}

	static void traverse(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.rhino.Node root, java.util.List<com.google.javascript.jscomp.NodeTraversal.Callback> callbacks) {
		if ((callbacks.size()) == 1) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, callbacks.get(0));
		}else {
			new com.google.javascript.jscomp.CombinedCompilerPass(compiler, callbacks).process(null, root);
		}
	}

	private static class CallbackWrapper {
		private final com.google.javascript.jscomp.NodeTraversal.Callback callback;

		private final com.google.javascript.jscomp.NodeTraversal.ScopedCallback scopedCallback;

		private com.google.javascript.rhino.Node waiting = null;

		private CallbackWrapper(com.google.javascript.jscomp.NodeTraversal.Callback callback) {
			this.callback = callback;
			if (callback instanceof com.google.javascript.jscomp.NodeTraversal.ScopedCallback) {
				scopedCallback = ((com.google.javascript.jscomp.NodeTraversal.ScopedCallback) (callback));
			}else {
				scopedCallback = null;
			}
		}

		void visitOrMaybeActivate(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (isActive()) {
				callback.visit(t, n, parent);
			}else
				if ((waiting) == n) {
					waiting = null;
				}
			
		}

		void shouldTraverseIfActive(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((isActive()) && (!(callback.shouldTraverse(t, n, parent)))) {
				waiting = n;
			}
		}

		void enterScopeIfActive(com.google.javascript.jscomp.NodeTraversal t) {
			if ((isActive()) && ((scopedCallback) != null)) {
				scopedCallback.enterScope(t);
			}
		}

		void exitScopeIfActive(com.google.javascript.jscomp.NodeTraversal t) {
			if ((isActive()) && ((scopedCallback) != null)) {
				scopedCallback.exitScope(t);
			}
		}

		boolean isActive() {
			return (waiting) == null;
		}
	}

	@java.lang.Override
	public final void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, com.google.javascript.jscomp.CombinedCompilerPass.this);
	}

	@java.lang.Override
	public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		for (com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper callback : callbacks) {
			callback.shouldTraverseIfActive(t, n, parent);
		}
		return true;
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		for (com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper callback : callbacks) {
			callback.visitOrMaybeActivate(t, n, parent);
		}
	}

	@java.lang.Override
	public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
		for (com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper callback : callbacks) {
			callback.enterScopeIfActive(t);
		}
	}

	@java.lang.Override
	public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
		for (com.google.javascript.jscomp.CombinedCompilerPass.CallbackWrapper callback : callbacks) {
			callback.exitScopeIfActive(t);
		}
	}
}

