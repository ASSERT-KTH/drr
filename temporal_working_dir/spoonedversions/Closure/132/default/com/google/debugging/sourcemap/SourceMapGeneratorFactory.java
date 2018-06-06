

package com.google.debugging.sourcemap;


public class SourceMapGeneratorFactory {
	public static com.google.debugging.sourcemap.SourceMapGenerator getInstance() {
		return com.google.debugging.sourcemap.SourceMapGeneratorFactory.getInstance(com.google.debugging.sourcemap.SourceMapFormat.DEFAULT);
	}

	public static com.google.debugging.sourcemap.SourceMapGenerator getInstance(com.google.debugging.sourcemap.SourceMapFormat format) {
		switch (format) {
			case V1 :
				return new com.google.debugging.sourcemap.SourceMapGeneratorV1();
			case V2 :
				return new com.google.debugging.sourcemap.SourceMapGeneratorV2();
			case DEFAULT :
			case V3 :
				return new com.google.debugging.sourcemap.SourceMapGeneratorV3();
			default :
				throw new java.lang.IllegalStateException("unsupported source map format");
		}
	}
}

