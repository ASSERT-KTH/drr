

package com.google.javascript.jscomp;


class PeepholeSimplifyRegExp extends com.google.javascript.jscomp.AbstractPeepholeOptimization {
	@java.lang.Override
	com.google.javascript.rhino.Node optimizeSubtree(com.google.javascript.rhino.Node subtree) {
		if (subtree.isRegExp()) {
			java.lang.String pattern = subtree.getFirstChild().getString();
			java.lang.String flags = (subtree.getChildCount()) == 2 ? subtree.getLastChild().getString() : "";
			com.google.javascript.jscomp.regex.RegExpTree regexTree;
			try {
				regexTree = com.google.javascript.jscomp.regex.RegExpTree.parseRegExp(pattern, flags);
			} catch (java.lang.IllegalArgumentException ex) {
				return subtree;
			}
			regexTree = regexTree.simplify(flags);
			java.lang.String literal = regexTree.toString();
			java.lang.String newPattern = literal.substring(1, ((literal.length()) - 1));
			java.lang.String newFlags = (((flags.contains("g")) && ((!(com.google.javascript.jscomp.regex.RegExpTree.matchesWholeInput(regexTree, flags))) || (regexTree.hasCapturingGroup())) ? "g" : "") + ((flags.contains("i")) && (regexTree.isCaseSensitive()) ? "i" : "")) + ((flags.contains("m")) && (regexTree.containsAnchor()) ? "m" : "");
			if (!((newPattern.equals(pattern)) && (newFlags.equals(flags)))) {
				subtree.getFirstChild().setString(newPattern);
				if (!("".equals(newFlags))) {
					subtree.getLastChild().setString(newFlags);
				}else
					if ((subtree.getChildCount()) == 2) {
						subtree.getLastChild().detachFromParent();
					}
				
				reportCodeChange();
			}
		}
		return subtree;
	}
}

