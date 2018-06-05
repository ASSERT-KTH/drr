

package com.google.javascript.jscomp;


public class SourceMap {
	public static enum Format {
LEGACY {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMap(new com.google.debugging.sourcemap.SourceMapGeneratorV1());
			}
		}, EXPERIMENTIAL {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMap(new com.google.debugging.sourcemap.SourceMapGeneratorV2());
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

	final com.google.debugging.sourcemap.SourceMapGenerator generator;

	private SourceMap(com.google.debugging.sourcemap.SourceMapGenerator generator) {
		this.generator = generator;
	}

	public void addMapping(com.google.javascript.rhino.Node node, com.google.debugging.sourcemap.FilePosition outputStartPosition, com.google.debugging.sourcemap.FilePosition outputEndPosition) {
		java.lang.String sourceFile = ((java.lang.String) (node.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP)));
		if ((sourceFile == null) || ((node.getLineno()) < 0)) {
			return ;
		}
		java.lang.String originalName = ((java.lang.String) (node.getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP)));
		generator.addMapping(sourceFile, originalName, new com.google.debugging.sourcemap.FilePosition(node.getLineno(), node.getCharno()), outputStartPosition, outputEndPosition);
	}

	public void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException {
		generator.appendTo(out, name);
	}

	public void reset() {
		generator.reset();
	}

	public void setStartingPosition(int offsetLine, int offsetIndex) {
		generator.setStartingPosition(offsetLine, offsetIndex);
	}

	public void setWrapperPrefix(java.lang.String prefix) {
		generator.setWrapperPrefix(prefix);
	}

	public void validate(boolean validate) {
		generator.validate(validate);
	}
}

