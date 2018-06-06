

package com.google.javascript.jscomp;


final class ForbiddenChange extends com.google.javascript.jscomp.CodeChangeHandler {
	@java.lang.Override
	public void reportChange() {
		throw new java.lang.IllegalStateException("Code changes forbidden");
	}

	@java.lang.Override
	public void reportChangedFun(com.google.javascript.rhino.Node n) {
		throw new java.lang.IllegalStateException("Code changes forbidden");
	}

	@java.lang.Override
	public void reportDeletedFun(com.google.javascript.rhino.Node n) {
		throw new java.lang.IllegalStateException("Code changes forbidden");
	}
}

