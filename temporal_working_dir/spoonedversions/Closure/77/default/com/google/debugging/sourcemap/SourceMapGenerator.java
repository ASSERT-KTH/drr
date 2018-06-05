

package com.google.debugging.sourcemap;


public interface SourceMapGenerator {
	public enum Format {
LEGACY {
			@java.lang.Override
			public com.google.debugging.sourcemap.SourceMapGenerator getInstance() {
				return new com.google.debugging.sourcemap.SourceMapGeneratorV1();
			}
		}, EXPERIMENTIAL {
			@java.lang.Override
			public com.google.debugging.sourcemap.SourceMapGenerator getInstance() {
				return new com.google.debugging.sourcemap.SourceMapGeneratorV2();
			}
		};
		public abstract com.google.debugging.sourcemap.SourceMapGenerator getInstance();
	}

	void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException;

	void reset();

	void addMapping(java.lang.String sourceName, @javax.annotation.Nullable
	java.lang.String symbolName, com.google.debugging.sourcemap.FilePosition sourceStartPosition, com.google.debugging.sourcemap.FilePosition outputStartPosition, com.google.debugging.sourcemap.FilePosition outputEndPosition);

	void setWrapperPrefix(java.lang.String prefix);

	void setStartingPosition(int offsetLine, int offsetIndex);

	void validate(boolean validate);

	void writeMetaMap(java.lang.Appendable out, java.lang.String name, java.util.List<com.google.debugging.sourcemap.SourceMapSection> appSections) throws java.io.IOException;
}

