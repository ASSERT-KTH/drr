

package com.google.debugging.sourcemap;


public class SourceMapConsumerFactory {
	private SourceMapConsumerFactory() {
	}

	public static com.google.debugging.sourcemap.SourceMapping parse(java.lang.String contents) throws com.google.debugging.sourcemap.SourceMapParseException {
		if (contents.startsWith("/** Begin line maps. **/")) {
			com.google.debugging.sourcemap.SourceMapConsumerV1 consumer = new com.google.debugging.sourcemap.SourceMapConsumerV1();
			consumer.parse(contents);
			return consumer;
		}else
			if (contents.startsWith("{")) {
				try {
					org.json.JSONObject sourceMapRoot = new org.json.JSONObject(contents);
					int version = sourceMapRoot.getInt("version");
					switch (version) {
						case 2 :
							{
								com.google.debugging.sourcemap.SourceMapConsumerV2 consumer = new com.google.debugging.sourcemap.SourceMapConsumerV2();
								consumer.parse(sourceMapRoot);
								return consumer;
							}
						case 3 :
							{
								com.google.debugging.sourcemap.SourceMapConsumerV3 consumer = new com.google.debugging.sourcemap.SourceMapConsumerV3();
								consumer.parse(sourceMapRoot);
								return consumer;
							}
						default :
							throw new com.google.debugging.sourcemap.SourceMapParseException(("Unknown source map version:" + version));
					}
				} catch (org.json.JSONException ex) {
					throw new com.google.debugging.sourcemap.SourceMapParseException(("JSON parse exception: " + ex));
				}
			}
		
		throw new com.google.debugging.sourcemap.SourceMapParseException("unable to detect source map format");
	}
}

