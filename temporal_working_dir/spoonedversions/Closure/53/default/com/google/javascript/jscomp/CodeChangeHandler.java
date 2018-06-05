

package com.google.javascript.jscomp;


interface CodeChangeHandler {
	void reportChange();

	static final class RecentChange implements com.google.javascript.jscomp.CodeChangeHandler {
		private boolean hasChanged = false;

		@java.lang.Override
		public void reportChange() {
			hasChanged = true;
		}

		boolean hasCodeChanged() {
			return hasChanged;
		}

		void reset() {
			hasChanged = false;
		}
	}

	static final class ForbiddenChange implements com.google.javascript.jscomp.CodeChangeHandler {
		@java.lang.Override
		public void reportChange() {
			throw new java.lang.IllegalStateException("Code changes forbidden");
		}
	}
}

