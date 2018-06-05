

package com.google.javascript.jscomp;


public abstract class PassFactory {
	private final java.lang.String name;

	private final boolean isOneTimePass;

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

	abstract com.google.javascript.jscomp.CompilerPass create(com.google.javascript.jscomp.AbstractCompiler compiler);

	com.google.javascript.jscomp.HotSwapCompilerPass getHotSwapPass(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return null;
	}
}

