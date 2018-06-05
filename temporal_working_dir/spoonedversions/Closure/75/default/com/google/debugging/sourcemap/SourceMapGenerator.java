

package com.google.debugging.sourcemap;


public interface SourceMapGenerator {
	void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException;

	void reset();

	void addMapping(java.lang.String sourceName, @javax.annotation.Nullable
	java.lang.String symbolName, com.google.debugging.sourcemap.FilePosition sourceStartPosition, com.google.debugging.sourcemap.FilePosition outputStartPosition, com.google.debugging.sourcemap.FilePosition outputEndPosition);

	void setWrapperPrefix(java.lang.String prefix);

	void setStartingPosition(int offsetLine, int offsetIndex);

	void validate(boolean validate);

	void writeMetaMap(java.lang.Appendable out, java.lang.String name, java.util.List<com.google.debugging.sourcemap.SourceMapSection> appSections) throws java.io.IOException;
}

