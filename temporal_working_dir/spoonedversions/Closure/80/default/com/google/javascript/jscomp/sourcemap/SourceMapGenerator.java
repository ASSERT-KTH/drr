

package com.google.javascript.jscomp.sourcemap;


public interface SourceMapGenerator {
	public enum Format {
LEGACY {
			@java.lang.Override
			public com.google.javascript.jscomp.sourcemap.SourceMapGenerator getInstance() {
				return new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1();
			}
		}, EXPERIMENTIAL {
			@java.lang.Override
			public com.google.javascript.jscomp.sourcemap.SourceMapGenerator getInstance() {
				return new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2();
			}
		};
		public abstract com.google.javascript.jscomp.sourcemap.SourceMapGenerator getInstance();
	}

	void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException;

	void reset();

	void addMapping(java.lang.String sourceName, @javax.annotation.Nullable
	java.lang.String symbolName, com.google.javascript.jscomp.sourcemap.FilePosition sourceStartPosition, com.google.javascript.jscomp.sourcemap.FilePosition outputStartPosition, com.google.javascript.jscomp.sourcemap.FilePosition outputEndPosition);

	void setWrapperPrefix(java.lang.String prefix);

	void setStartingPosition(int offsetLine, int offsetIndex);

	void validate(boolean validate);

	void writeMetaMap(java.lang.Appendable out, java.lang.String name, java.util.List<com.google.javascript.jscomp.sourcemap.SourceMapSection> appSections) throws java.io.IOException;
}

