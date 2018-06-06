

package com.google.javascript.jscomp;


public interface MessageFormatter {
	java.lang.String formatError(com.google.javascript.jscomp.JSError error);

	java.lang.String formatWarning(com.google.javascript.jscomp.JSError warning);
}

