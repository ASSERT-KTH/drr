

package com.google.javascript.jscomp;


class CodeChangeHandler {
	private boolean hasChanged = false;

	public void reportChange() {
		hasChanged = true;
	}

	public void reportChangedFun(com.google.javascript.rhino.Node n) {
		hasChanged = true;
	}

	public void reportDeletedFun(com.google.javascript.rhino.Node n) {
		hasChanged = true;
	}

	void reset() {
		hasChanged = false;
	}

	boolean hasCodeChanged() {
		return hasChanged;
	}
}

