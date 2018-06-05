

package com.google.javascript.jscomp;


public interface HotSwapCompilerPass extends com.google.javascript.jscomp.CompilerPass {
	void hotSwapScript(com.google.javascript.rhino.Node scriptRoot, com.google.javascript.rhino.Node originalRoot);
}

