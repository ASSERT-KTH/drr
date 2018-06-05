

package com.google.javascript.jscomp;


public class SourceMap {
	public static enum Format {
V1 {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMap(com.google.debugging.sourcemap.SourceMapGeneratorFactory.getInstance(com.google.debugging.sourcemap.SourceMapFormat.V1));
			}
		}, DEFAULT {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMap(com.google.debugging.sourcemap.SourceMapGeneratorFactory.getInstance(com.google.debugging.sourcemap.SourceMapFormat.DEFAULT));
			}
		}, V2 {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMap(com.google.debugging.sourcemap.SourceMapGeneratorFactory.getInstance(com.google.debugging.sourcemap.SourceMapFormat.V2));
			}
		}, V3 {
			@java.lang.Override
			com.google.javascript.jscomp.SourceMap getInstance() {
				return new com.google.javascript.jscomp.SourceMap(com.google.debugging.sourcemap.SourceMapGeneratorFactory.getInstance(com.google.debugging.sourcemap.SourceMapFormat.V3));
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

	public static class LocationMapping {
		final java.lang.String prefix;

		final java.lang.String replacement;

		public LocationMapping(java.lang.String prefix, java.lang.String replacement) {
			this.prefix = prefix;
			this.replacement = replacement;
		}
	}

	private final com.google.debugging.sourcemap.SourceMapGenerator generator;

	private java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> prefixMappings = java.util.Collections.emptyList();

	private final java.util.Map<java.lang.String, java.lang.String> sourceLocationFixupCache = com.google.common.collect.Maps.newHashMap();

	private SourceMap(com.google.debugging.sourcemap.SourceMapGenerator generator) {
		this.generator = generator;
	}

	public void addMapping(com.google.javascript.rhino.Node node, com.google.debugging.sourcemap.FilePosition outputStartPosition, com.google.debugging.sourcemap.FilePosition outputEndPosition) {
		java.lang.String sourceFile = node.getSourceFileName();
		if ((sourceFile == null) || ((node.getLineno()) < 0)) {
			return ;
		}
		sourceFile = fixupSourceLocation(sourceFile);
		java.lang.String originalName = ((java.lang.String) (node.getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP)));
		generator.addMapping(sourceFile, originalName, new com.google.debugging.sourcemap.FilePosition(node.getLineno(), node.getCharno()), outputStartPosition, outputEndPosition);
	}

	private java.lang.String fixupSourceLocation(java.lang.String sourceFile) {
		if (prefixMappings.isEmpty()) {
			return sourceFile;
		}
		java.lang.String fixed = sourceLocationFixupCache.get(sourceFile);
		if (fixed != null) {
			return fixed;
		}
		for (com.google.javascript.jscomp.SourceMap.LocationMapping mapping : prefixMappings) {
			if (sourceFile.startsWith(mapping.prefix)) {
				fixed = (mapping.replacement) + (sourceFile.substring(mapping.prefix.length()));
				break;
			}
		}
		if (fixed == null) {
			fixed = sourceFile;
		}
		sourceLocationFixupCache.put(sourceFile, fixed);
		return fixed;
	}

	public void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException {
		generator.appendTo(out, name);
	}

	public void reset() {
		generator.reset();
		sourceLocationFixupCache.clear();
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

	public void setPrefixMappings(java.util.List<com.google.javascript.jscomp.SourceMap.LocationMapping> sourceMapLocationMappings) {
		com.google.javascript.jscomp.SourceMap.this.prefixMappings = sourceMapLocationMappings;
	}
}

