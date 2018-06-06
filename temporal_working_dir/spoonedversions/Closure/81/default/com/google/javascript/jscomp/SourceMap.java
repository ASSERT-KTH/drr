

package com.google.javascript.jscomp;


public class SourceMap implements com.google.javascript.jscomp.sourcemap.SourceMapGenerator {
	public static enum Format {
LEGACY {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMap(new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1());
			}
		}, EXPERIMENTIAL {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMap(new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2());
			}
		};
		abstract com.google.javascript.jscomp.SourceMap getInstance();
	}

	public static enum DetailLevel implements com.google.common.base.Predicate<com.google.javascript.rhino.Node> {
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

	final com.google.javascript.jscomp.sourcemap.SourceMapGenerator generator;

	private SourceMap(com.google.javascript.jscomp.sourcemap.SourceMapGenerator generator) {
		this.generator = generator;
	}

	@java.lang.Override
	public void addMapping(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.sourcemap.Position startPosition, com.google.javascript.jscomp.sourcemap.Position endPosition) {
		generator.addMapping(node, startPosition, endPosition);
	}

	@java.lang.Override
	public void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException {
		generator.appendTo(out, name);
	}

	@java.lang.Override
	public void reset() {
		generator.reset();
	}

	@java.lang.Override
	public void setStartingPosition(int offsetLine, int offsetIndex) {
		generator.setStartingPosition(offsetLine, offsetIndex);
	}

	@java.lang.Override
	public void setWrapperPrefix(java.lang.String prefix) {
		generator.setWrapperPrefix(prefix);
	}

	public void validate(boolean validate) {
		generator.validate(validate);
	}
}

