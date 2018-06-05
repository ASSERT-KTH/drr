

package com.google.debugging.sourcemap;


public interface SourceMapping {
	com.google.debugging.sourcemap.proto.Mapping.OriginalMapping getMappingForLine(int lineNumber, int columnIndex);
}

