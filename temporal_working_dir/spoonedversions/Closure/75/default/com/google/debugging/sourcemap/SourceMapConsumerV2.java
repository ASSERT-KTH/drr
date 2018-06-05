

package com.google.debugging.sourcemap;


public class SourceMapConsumerV2 implements com.google.debugging.sourcemap.SourceMapConsumer {
	private java.util.Map<java.lang.Integer, java.util.List<java.lang.Integer>> characterMap = null;

	private org.json.JSONArray lineMaps = null;

	private java.util.List<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> mappings;

	public SourceMapConsumerV2() {
	}

	public void parse(java.lang.String contents) throws com.google.debugging.sourcemap.SourceMapParseException {
		try {
			parseInternal(contents);
		} catch (org.json.JSONException ex) {
			throw new com.google.debugging.sourcemap.SourceMapParseException(("JSON parse exception: " + ex));
		}
	}

	private void parseInternal(java.lang.String contents) throws com.google.debugging.sourcemap.SourceMapParseException, org.json.JSONException {
		org.json.JSONObject sourceMapRoot = new org.json.JSONObject(contents);
		int version = sourceMapRoot.getInt("version");
		if (version != 2) {
			throw new com.google.debugging.sourcemap.SourceMapParseException(("Unknown version: " + version));
		}
		java.lang.String file = sourceMapRoot.getString("file");
		if (file.isEmpty()) {
			throw new com.google.debugging.sourcemap.SourceMapParseException("File entry is missing or empty");
		}
		int lineCount = sourceMapRoot.getInt("lineCount");
		lineMaps = sourceMapRoot.getJSONArray("lineMaps");
		if (lineCount != (lineMaps.length())) {
			throw new com.google.debugging.sourcemap.SourceMapParseException("lineMaps length does not match lineCount");
		}
		characterMap = com.google.common.collect.Maps.newHashMap();
		org.json.JSONArray sources = sourceMapRoot.getJSONArray("sources");
		org.json.JSONArray names = sourceMapRoot.has("names") ? sourceMapRoot.getJSONArray("names") : null;
		org.json.JSONArray jsonMappings = sourceMapRoot.getJSONArray("mappings");
		mappings = com.google.common.collect.Lists.newArrayListWithCapacity(lineCount);
		for (int i = 0; i < (jsonMappings.length()); i++) {
			org.json.JSONArray entry = jsonMappings.getJSONArray(i);
			java.lang.String name = entry.optString(3, "");
			if (names != null) {
				try {
					int nameIndex = entry.getInt(3);
					name = names.getString(nameIndex);
				} catch (org.json.JSONException e) {
				}
			}
			java.lang.String sourceFile = sources.getString(entry.getInt(0));
			int lineNumber = entry.getInt(1);
			int column = entry.getInt(2);
			com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.Builder builder = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.newBuilder().setOriginalFile(sourceFile).setLineNumber(lineNumber).setColumnPosition(column).setIdentifier(name);
			mappings.add(builder.build());
		}
	}

	@java.lang.Override
	public com.google.debugging.sourcemap.proto.Mapping.OriginalMapping getMappingForLine(int lineNumber, int columnIndex) {
		lineNumber--;
		columnIndex--;
		if (lineNumber >= (lineMaps.length())) {
			return null;
		}
		if (!(characterMap.containsKey(lineNumber))) {
			try {
				characterMap.put(lineNumber, com.google.debugging.sourcemap.SourceMapLineDecoder.decodeLine(lineMaps.getString(lineNumber)));
			} catch (org.json.JSONException jse) {
				throw new java.lang.IllegalStateException("JSON exception when retrieving line map", jse);
			}
		}
		java.util.List<java.lang.Integer> map = characterMap.get(lineNumber);
		if ((map == null) || ((map.size()) <= columnIndex)) {
			return null;
		}
		int index = map.get(columnIndex);
		com.google.common.base.Preconditions.checkState((index < (mappings.size())), "Invalid mapping reference");
		return mappings.get(index);
	}
}

