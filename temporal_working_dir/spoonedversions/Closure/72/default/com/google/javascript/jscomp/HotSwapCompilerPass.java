

package com.google.javascript.jscomp;


public interface HotSwapCompilerPass {
	void hotSwapScript(com.google.javascript.rhino.Node root, com.google.javascript.jscomp.Scope globalScope);
}

