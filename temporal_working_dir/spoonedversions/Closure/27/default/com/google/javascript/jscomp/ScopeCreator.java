

package com.google.javascript.jscomp;


interface ScopeCreator {
	com.google.javascript.jscomp.Scope createScope(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.Scope parent);
}

