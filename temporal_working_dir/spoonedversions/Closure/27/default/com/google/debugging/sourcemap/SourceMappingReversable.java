

package com.google.debugging.sourcemap;


public interface SourceMappingReversable extends com.google.debugging.sourcemap.SourceMapping {
	public java.util.Collection<java.lang.String> getOriginalSources();

	public java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> getReverseMapping(java.lang.String originalFile, int line, int column);
}

