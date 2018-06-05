

package com.google.javascript.rhino;


public class Kit {
	static java.lang.RuntimeException codeBug() throws java.lang.RuntimeException {
		java.lang.RuntimeException ex = new java.lang.IllegalStateException("FAILED ASSERTION");
		ex.printStackTrace(java.lang.System.err);
		throw ex;
	}
}

