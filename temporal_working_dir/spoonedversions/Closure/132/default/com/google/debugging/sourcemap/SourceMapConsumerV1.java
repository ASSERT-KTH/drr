

package com.google.debugging.sourcemap;


public class SourceMapConsumerV1 implements com.google.debugging.sourcemap.SourceMapConsumer {
	private static final java.lang.String LINEMAP_HEADER = "/** Begin line maps. **/";

	private static final java.lang.String FILEINFO_HEADER = "/** Begin file information. **/";

	private static final java.lang.String DEFINITION_HEADER = "/** Begin mapping definitions. **/";

	private static class ParseState {
		final java.lang.String contents;

		int currentPosition = 0;

		ParseState(java.lang.String contents) {
			this.contents = contents;
		}

		java.lang.String readLineOrNull() {
			if ((currentPosition) >= (contents.length())) {
				return null;
			}
			int index = contents.indexOf('\n', currentPosition);
			if (index < 0) {
				index = contents.length();
			}
			java.lang.String line = contents.substring(currentPosition, index);
			currentPosition = index + 1;
			return line;
		}

		java.lang.String readLine() throws com.google.debugging.sourcemap.SourceMapParseException {
			java.lang.String line = readLineOrNull();
			if (line == null) {
				fail("EOF");
			}
			return line;
		}

		void expectLine(java.lang.String expect) throws com.google.debugging.sourcemap.SourceMapParseException {
			java.lang.String line = readLine();
			if (!(expect.equals(line))) {
				fail(((("Expected " + expect) + " got ") + line));
			}
		}

		void fail(java.lang.String message) throws com.google.debugging.sourcemap.SourceMapParseException {
			throw new com.google.debugging.sourcemap.SourceMapParseException(message);
		}
	}

	private com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment>> characterMap;

	private com.google.common.collect.ImmutableList<com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile> mappings;

	@java.lang.Override
	public void parse(java.lang.String contents) throws com.google.debugging.sourcemap.SourceMapParseException {
		com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState parser = new com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState(contents);
		try {
			parseInternal(parser);
		} catch (org.json.JSONException ex) {
			parser.fail(("JSON parse exception: " + ex));
		}
	}

	private int parseCharacterMap(com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState parser, int lineCount, com.google.common.collect.ImmutableList.Builder<com.google.common.collect.ImmutableList<com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment>> characterMapBuilder) throws com.google.debugging.sourcemap.SourceMapParseException, org.json.JSONException {
		int maxID = -1;
		for (int i = 0; i < lineCount; ++i) {
			java.lang.String currentLine = parser.readLine();
			if (currentLine.isEmpty()) {
				continue;
			}
			com.google.common.collect.ImmutableList.Builder<com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment> fragmentList = com.google.common.collect.ImmutableList.builder();
			com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment myLineFragment = null;
			org.json.JSONArray charArray = new org.json.JSONArray(currentLine);
			int lastID = -1;
			int startID = java.lang.Integer.MIN_VALUE;
			java.util.List<java.lang.Byte> currentOffsets = com.google.common.collect.Lists.newArrayList();
			for (int j = 0; j < (charArray.length()); ++j) {
				int mappingID = lastID;
				if (!(charArray.isNull(j))) {
					mappingID = charArray.optInt(j);
					if (mappingID > maxID) {
						maxID = mappingID;
					}
				}
				if (startID == (java.lang.Integer.MIN_VALUE)) {
					startID = mappingID;
				}else {
					if (((mappingID - lastID) > (java.lang.Byte.MAX_VALUE)) || ((mappingID - lastID) < (java.lang.Byte.MIN_VALUE))) {
						myLineFragment = new com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment(startID, com.google.common.primitives.Bytes.toArray(currentOffsets));
						currentOffsets.clear();
						fragmentList.add(myLineFragment);
						startID = mappingID;
					}else {
						currentOffsets.add(((byte) (mappingID - lastID)));
					}
				}
				lastID = mappingID;
			}
			if (startID != (java.lang.Integer.MIN_VALUE)) {
				myLineFragment = new com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment(startID, com.google.common.primitives.Bytes.toArray(currentOffsets));
				fragmentList.add(myLineFragment);
			}
			characterMapBuilder.add(fragmentList.build());
		}
		return maxID;
	}

	private class FileName {
		private final java.lang.String dir;

		private final java.lang.String name;

		FileName(java.lang.String directory, java.lang.String name) {
			this.dir = directory;
			this.name = name;
		}
	}

	private com.google.debugging.sourcemap.SourceMapConsumerV1.FileName splitFileName(com.google.common.collect.Interner<java.lang.String> interner, java.lang.String input) {
		int hashIndex = input.lastIndexOf('/');
		java.lang.String dir = interner.intern(input.substring(0, (hashIndex + 1)));
		java.lang.String fileName = interner.intern(input.substring((hashIndex + 1)));
		return new com.google.debugging.sourcemap.SourceMapConsumerV1.FileName(dir, fileName);
	}

	private void parseFileMappings(com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState parser, int maxID) throws com.google.debugging.sourcemap.SourceMapParseException, org.json.JSONException {
		com.google.common.collect.Interner<java.lang.String> interner = com.google.common.collect.Interners.newStrongInterner();
		com.google.common.collect.ImmutableList.Builder<com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile> mappingsBuilder = com.google.common.collect.ImmutableList.builder();
		java.util.ArrayList<java.lang.Byte> lineOffsets = com.google.common.collect.Lists.newArrayList();
		java.util.ArrayList<java.lang.Short> columns = com.google.common.collect.Lists.newArrayList();
		java.util.ArrayList<java.lang.String> identifiers = com.google.common.collect.Lists.newArrayList();
		java.lang.String currentFile = null;
		int lastLine = -1;
		int startLine = -1;
		int startMapId = -1;
		for (int mappingId = 0; mappingId <= maxID; ++mappingId) {
			java.lang.String currentLine = parser.readLine();
			org.json.JSONArray mapArray = new org.json.JSONArray(currentLine);
			if ((mapArray.length()) < 3) {
				parser.fail("Invalid mapping array");
			}
			java.lang.String myFile = mapArray.getString(0);
			int line = mapArray.getInt(1);
			if (((!(myFile.equals(currentFile))) || ((line - lastLine) > (java.lang.Byte.MAX_VALUE))) || ((line - lastLine) < (java.lang.Byte.MIN_VALUE))) {
				if (currentFile != null) {
					com.google.debugging.sourcemap.SourceMapConsumerV1.FileName dirFile = splitFileName(interner, currentFile);
					com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder builder = com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.newBuilder().setDir(dirFile.dir).setFileName(dirFile.name).setStartLine(startLine).setStartMapId(startMapId).setLineOffsets(lineOffsets).setColumns(columns).setIdentifiers(identifiers);
					mappingsBuilder.add(builder.build());
				}
				currentFile = myFile;
				startLine = line;
				lastLine = line;
				startMapId = mappingId;
				columns.clear();
				lineOffsets.clear();
				identifiers.clear();
			}
			lineOffsets.add(((byte) (line - lastLine)));
			columns.add(((short) (mapArray.getInt(2))));
			identifiers.add(interner.intern(mapArray.optString(3, "")));
			lastLine = line;
		}
		if (currentFile != null) {
			com.google.debugging.sourcemap.SourceMapConsumerV1.FileName dirFile = splitFileName(interner, currentFile);
			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder builder = com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.newBuilder().setDir(dirFile.dir).setFileName(dirFile.name).setStartLine(startLine).setStartMapId(startMapId).setLineOffsets(lineOffsets).setColumns(columns).setIdentifiers(identifiers);
			mappingsBuilder.add(builder.build());
		}
		mappings = mappingsBuilder.build();
	}

	private void parseInternal(com.google.debugging.sourcemap.SourceMapConsumerV1.ParseState parser) throws com.google.debugging.sourcemap.SourceMapParseException, org.json.JSONException {
		java.lang.String headerCount = parser.readLine();
		com.google.common.base.Preconditions.checkArgument(headerCount.startsWith(com.google.debugging.sourcemap.SourceMapConsumerV1.LINEMAP_HEADER), "Expected %s", com.google.debugging.sourcemap.SourceMapConsumerV1.LINEMAP_HEADER);
		org.json.JSONObject countObject = new org.json.JSONObject(headerCount.substring(com.google.debugging.sourcemap.SourceMapConsumerV1.LINEMAP_HEADER.length()));
		if (!(countObject.has("count"))) {
			parser.fail("Missing 'count'");
		}
		int lineCount = countObject.getInt("count");
		if (lineCount <= 0) {
			parser.fail("Count must be >= 1");
		}
		com.google.common.collect.ImmutableList.Builder<com.google.common.collect.ImmutableList<com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment>> characterMapBuilder = com.google.common.collect.ImmutableList.builder();
		int maxId = parseCharacterMap(parser, lineCount, characterMapBuilder);
		characterMap = characterMapBuilder.build();
		parser.expectLine(com.google.debugging.sourcemap.SourceMapConsumerV1.FILEINFO_HEADER);
		for (int i = 0; i < lineCount; i++) {
			parser.readLine();
		}
		parser.expectLine(com.google.debugging.sourcemap.SourceMapConsumerV1.DEFINITION_HEADER);
		parseFileMappings(parser, maxId);
	}

	@java.lang.Override
	public com.google.debugging.sourcemap.proto.Mapping.OriginalMapping getMappingForLine(int lineNumber, int columnIndex) {
		com.google.common.base.Preconditions.checkNotNull(characterMap, "parse() must be called first");
		if (((lineNumber < 1) || (lineNumber > (characterMap.size()))) || (columnIndex < 1)) {
			return null;
		}
		java.util.List<com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment> lineFragments = characterMap.get((lineNumber - 1));
		if ((lineFragments == null) || (lineFragments.isEmpty())) {
			return null;
		}
		int columnOffset = 0;
		com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment lastFragment = lineFragments.get(((lineFragments.size()) - 1));
		int mapId = lastFragment.valueAtColumn(lastFragment.length());
		for (com.google.debugging.sourcemap.SourceMapConsumerV1.LineFragment lineFragment : lineFragments) {
			int columnPosition = columnIndex - columnOffset;
			if (columnPosition <= (lineFragment.length())) {
				mapId = lineFragment.valueAtColumn(columnPosition);
				break;
			}
			columnOffset += lineFragment.length();
		}
		if (mapId < 0) {
			return null;
		}
		return getMappingFromId(mapId);
	}

	private com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile binarySearch(int mapId) {
		int lower = 0;
		int upper = (mappings.size()) - 1;
		while (lower <= upper) {
			int middle = lower + ((upper - lower) / 2);
			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile middleCompare = mappings.get(middle);
			if (mapId < (middleCompare.getStartMapId())) {
				upper = middle - 1;
			}else
				if (mapId < ((middleCompare.getStartMapId()) + (middleCompare.getLength()))) {
					return middleCompare;
				}else {
					lower = middle + 1;
				}
			
		} 
		return null;
	}

	private com.google.debugging.sourcemap.proto.Mapping.OriginalMapping getMappingFromId(int mapID) {
		com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile match = binarySearch(mapID);
		if (match == null) {
			return null;
		}
		int pos = mapID - (match.getStartMapId());
		return match.getOriginalMapping(pos);
	}

	private static final class LineFragment {
		private final int startIndex;

		private final byte[] offsets;

		LineFragment(int startIndex, byte[] offsets) {
			this.startIndex = startIndex;
			this.offsets = offsets;
		}

		int length() {
			return (offsets.length) + 1;
		}

		int valueAtColumn(int column) {
			com.google.common.base.Preconditions.checkArgument((column > 0));
			int pos = startIndex;
			for (int i = 0; i < (column - 1); i++) {
				pos += offsets[i];
			}
			return pos;
		}
	}

	private static final class SourceFile {
		final java.lang.String dir;

		final java.lang.String fileName;

		final int startMapId;

		final int startLine;

		final byte[] lineOffsets;

		final short[] columns;

		final java.lang.String[] identifiers;

		private SourceFile(java.lang.String dir, java.lang.String fileName, int startLine, int startMapId, byte[] lineOffsets, short[] columns, java.lang.String[] identifiers) {
			this.fileName = com.google.common.base.Preconditions.checkNotNull(fileName);
			this.dir = com.google.common.base.Preconditions.checkNotNull(dir);
			this.startLine = startLine;
			this.startMapId = startMapId;
			this.lineOffsets = com.google.common.base.Preconditions.checkNotNull(lineOffsets);
			this.columns = com.google.common.base.Preconditions.checkNotNull(columns);
			this.identifiers = com.google.common.base.Preconditions.checkNotNull(identifiers);
			com.google.common.base.Preconditions.checkArgument((((lineOffsets.length) == (columns.length)) && ((columns.length) == (identifiers.length))));
		}

		private SourceFile(int startMapId) {
			this.startMapId = startMapId;
			this.fileName = null;
			this.dir = null;
			this.startLine = 0;
			this.lineOffsets = null;
			this.columns = null;
			this.identifiers = null;
		}

		int getLength() {
			return lineOffsets.length;
		}

		int getStartMapId() {
			return startMapId;
		}

		com.google.debugging.sourcemap.proto.Mapping.OriginalMapping getOriginalMapping(int offset) {
			int lineNumber = com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.this.startLine;
			for (int i = 0; i <= offset; i++) {
				lineNumber += lineOffsets[i];
			}
			com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.Builder builder = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.newBuilder().setOriginalFile(((dir) + (fileName))).setLineNumber(lineNumber).setColumnPosition(columns[offset]).setIdentifier(identifiers[offset]);
			return builder.build();
		}

		static final class Builder {
			java.lang.String dir;

			java.lang.String fileName;

			int startMapId;

			int startLine;

			byte[] lineOffsets;

			short[] columns;

			java.lang.String[] identifiers;

			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder setDir(java.lang.String dir) {
				com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this.dir = dir;
				return com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this;
			}

			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder setFileName(java.lang.String fileName) {
				com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this.fileName = fileName;
				return com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this;
			}

			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder setStartMapId(int startMapId) {
				com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this.startMapId = startMapId;
				return com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this;
			}

			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder setStartLine(int startLine) {
				com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this.startLine = startLine;
				return com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this;
			}

			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder setLineOffsets(java.util.List<java.lang.Byte> lineOffsets) {
				com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this.lineOffsets = com.google.common.primitives.Bytes.toArray(lineOffsets);
				return com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this;
			}

			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder setColumns(java.util.List<java.lang.Short> columns) {
				com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this.columns = com.google.common.primitives.Shorts.toArray(columns);
				return com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this;
			}

			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder setIdentifiers(java.util.List<java.lang.String> identifiers) {
				com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this.identifiers = identifiers.toArray(new java.lang.String[0]);
				return com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder.this;
			}

			com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile build() {
				return new com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile(dir, fileName, startLine, startMapId, lineOffsets, columns, identifiers);
			}
		}

		static com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder newBuilder() {
			return new com.google.debugging.sourcemap.SourceMapConsumerV1.SourceFile.Builder();
		}
	}
}

