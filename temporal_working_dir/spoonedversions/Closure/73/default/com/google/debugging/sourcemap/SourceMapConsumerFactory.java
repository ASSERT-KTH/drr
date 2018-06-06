

package com.google.debugging.sourcemap;


public class SourceMapConsumerFactory {
	private SourceMapConsumerFactory() {
	}

	public static com.google.debugging.sourcemap.SourceMapping parse(java.lang.String contents) throws com.google.debugging.sourcemap.SourceMapParseException {
		com.google.debugging.sourcemap.SourceMapConsumer consumer = null;
		com.google.debugging.sourcemap.SourceMapFormat format = com.google.debugging.sourcemap.SourceMapConsumerFactory.detectVersion(contents);
		consumer = com.google.debugging.sourcemap.SourceMapConsumerFactory.createForVerion(com.google.debugging.sourcemap.SourceMapConsumerFactory.detectVersion(contents));
		consumer.parse(contents);
		return consumer;
	}

	private static com.google.debugging.sourcemap.SourceMapFormat detectVersion(java.lang.String contents) throws com.google.debugging.sourcemap.SourceMapParseException {
		if (contents.startsWith("/** Begin line maps. **/")) {
			return com.google.debugging.sourcemap.SourceMapFormat.V1;
		}else
			if (contents.startsWith("{")) {
				return com.google.debugging.sourcemap.SourceMapFormat.V2;
			}else {
				throw new com.google.debugging.sourcemap.SourceMapParseException("unable to detect source map format");
			}
		
	}

	private static com.google.debugging.sourcemap.SourceMapConsumer createForVerion(com.google.debugging.sourcemap.SourceMapFormat format) throws com.google.debugging.sourcemap.SourceMapParseException {
		switch (format) {
			case V1 :
				return new com.google.debugging.sourcemap.SourceMapConsumerV1();
			case V2 :
				return new com.google.debugging.sourcemap.SourceMapConsumerV2();
			default :
				throw new com.google.debugging.sourcemap.SourceMapParseException("unsupported source map format");
		}
	}
}

