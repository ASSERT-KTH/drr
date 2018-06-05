

package com.google.javascript.jscomp;


public abstract class PassFactory {
	private final java.lang.String name;

	private final boolean isOneTimePass;

	private boolean isCreated = false;

	protected PassFactory(java.lang.String name, boolean isOneTimePass) {
		this.name = name;
		this.isOneTimePass = isOneTimePass;
	}

	java.lang.String getName() {
		return name;
	}

	boolean isOneTimePass() {
		return isOneTimePass;
	}

	com.google.javascript.jscomp.PassFactory makeOneTimePass() {
		if (isOneTimePass()) {
			return com.google.javascript.jscomp.PassFactory.this;
		}
		final com.google.javascript.jscomp.PassFactory self = com.google.javascript.jscomp.PassFactory.this;
		return new com.google.javascript.jscomp.PassFactory(name, true) {
			@java.lang.Override
			protected com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler) {
				return self.createInternal(compiler);
			}
		};
	}

	final com.google.javascript.jscomp.CompilerPass create(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.common.base.Preconditions.checkState(((!(isCreated)) || (!(isOneTimePass))), ("One-time passes cannot be run multiple times: " + (name)));
		isCreated = true;
		return createInternal(compiler);
	}

	protected abstract com.google.javascript.jscomp.CompilerPass createInternal(com.google.javascript.jscomp.AbstractCompiler compiler);
}

