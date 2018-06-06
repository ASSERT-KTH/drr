

package com.google.javascript.jscomp.sourcemap;


public interface SourceMapGenerator {
	enum Format {
LEGACY {
			@java.lang.Override
			com.google.javascript.jscomp.sourcemap.SourceMapGenerator getInstance() {
				return new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1();
			}
		}, EXPERIMENTIAL {
			@java.lang.Override
			com.google.javascript.jscomp.sourcemap.SourceMapGenerator getInstance() {
				return new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2();
			}
		};
		abstract com.google.javascript.jscomp.sourcemap.SourceMapGenerator getInstance();
	}

	void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException;

	void reset();

	void addMapping(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.sourcemap.Position startPosition, com.google.javascript.jscomp.sourcemap.Position endPosition);

	void setWrapperPrefix(java.lang.String prefix);

	void setStartingPosition(int offsetLine, int offsetIndex);

	void validate(boolean validate);
}

