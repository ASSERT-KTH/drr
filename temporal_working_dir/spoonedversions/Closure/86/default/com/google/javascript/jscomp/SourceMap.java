

package com.google.javascript.jscomp;


public interface SourceMap {
	enum Format {
LEGACY {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMapLegacy();
			}
		}, EXPERIMENTIAL {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMap2();
			}
		};
		abstract com.google.javascript.jscomp.SourceMap getInstance();
	}

	public enum DetailLevel implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
ALL {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node node) {
				return true;
			}
		}, SYMBOLS {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node node) {
				return ((((((com.google.javascript.jscomp.NodeUtil.isCall(node)) || (com.google.javascript.jscomp.NodeUtil.isNew(node))) || (com.google.javascript.jscomp.NodeUtil.isFunction(node))) || (com.google.javascript.jscomp.NodeUtil.isName(node))) || (com.google.javascript.jscomp.NodeUtil.isGet(node))) || (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node, node.getParent()))) || ((com.google.javascript.jscomp.NodeUtil.isString(node)) && (com.google.javascript.jscomp.NodeUtil.isGet(node.getParent())));
			}
		};	}

	void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException;

	void reset();

	void addMapping(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.Position startPosition, com.google.javascript.jscomp.Position endPosition);

	void setWrapperPrefix(java.lang.String prefix);

	void setStartingPosition(int offsetLine, int offsetIndex);
}

