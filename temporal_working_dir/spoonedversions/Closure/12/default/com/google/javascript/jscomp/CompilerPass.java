

package com.google.javascript.jscomp;


public interface CompilerPass {
	void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root);
}

