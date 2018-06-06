

package com.google.debugging.sourcemap;


public class SourceMapConsumerV3 implements com.google.debugging.sourcemap.SourceMapConsumer , com.google.debugging.sourcemap.SourceMappingReversable {
	static final int UNMAPPED = -1;

	private java.lang.String[] sources;

	private java.lang.String[] names;

	private int lineCount;

	private java.util.ArrayList<java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry>> lines = null;

	public SourceMapConsumerV3() {
	}

	static class DefaultSourceMapSupplier implements com.google.debugging.sourcemap.SourceMapSupplier {
		@java.lang.Override
		public java.lang.String getSourceMap(java.lang.String url) {
			return null;
		}
	}

	@java.lang.Override
	public void parse(java.lang.String contents) throws com.google.debugging.sourcemap.SourceMapParseException {
		parse(contents, null);
	}

	public void parse(java.lang.String contents, com.google.debugging.sourcemap.SourceMapSupplier sectionSupplier) throws com.google.debugging.sourcemap.SourceMapParseException {
		try {
			org.json.JSONObject sourceMapRoot = new org.json.JSONObject(contents);
			parse(sourceMapRoot, sectionSupplier);
		} catch (org.json.JSONException ex) {
			throw new com.google.debugging.sourcemap.SourceMapParseException(("JSON parse exception: " + ex));
		}
	}

	public void parse(org.json.JSONObject sourceMapRoot) throws com.google.debugging.sourcemap.SourceMapParseException {
		parse(sourceMapRoot, null);
	}

	public void parse(org.json.JSONObject sourceMapRoot, com.google.debugging.sourcemap.SourceMapSupplier sectionSupplier) throws com.google.debugging.sourcemap.SourceMapParseException {
		try {
			int version = sourceMapRoot.getInt("version");
			if (version != 3) {
				throw new com.google.debugging.sourcemap.SourceMapParseException(("Unknown version: " + version));
			}
			java.lang.String file = sourceMapRoot.getString("file");
			if (file.isEmpty()) {
				throw new com.google.debugging.sourcemap.SourceMapParseException("File entry is missing or empty");
			}
			if (sourceMapRoot.has("sections")) {
				parseMetaMap(sourceMapRoot, sectionSupplier);
				return ;
			}
			lineCount = sourceMapRoot.getInt("lineCount");
			java.lang.String lineMap = sourceMapRoot.getString("mappings");
			sources = getJavaStringArray(sourceMapRoot.getJSONArray("sources"));
			names = getJavaStringArray(sourceMapRoot.getJSONArray("names"));
			lines = com.google.common.collect.Lists.newArrayListWithCapacity(lineCount);
			new com.google.debugging.sourcemap.SourceMapConsumerV3.MappingBuilder(lineMap).build();
		} catch (org.json.JSONException ex) {
			throw new com.google.debugging.sourcemap.SourceMapParseException(("JSON parse exception: " + ex));
		}
	}

	private void parseMetaMap(org.json.JSONObject sourceMapRoot, com.google.debugging.sourcemap.SourceMapSupplier sectionSupplier) throws com.google.debugging.sourcemap.SourceMapParseException {
		if (sectionSupplier == null) {
			sectionSupplier = new com.google.debugging.sourcemap.SourceMapConsumerV3.DefaultSourceMapSupplier();
		}
		try {
			int version = sourceMapRoot.getInt("version");
			if (version != 3) {
				throw new com.google.debugging.sourcemap.SourceMapParseException(("Unknown version: " + version));
			}
			java.lang.String file = sourceMapRoot.getString("file");
			if (file.isEmpty()) {
				throw new com.google.debugging.sourcemap.SourceMapParseException("File entry is missing or empty");
			}
			if ((((sourceMapRoot.has("lineCount")) || (sourceMapRoot.has("mappings"))) || (sourceMapRoot.has("sources"))) || (sourceMapRoot.has("names"))) {
				throw new com.google.debugging.sourcemap.SourceMapParseException("Invalid map format");
			}
			com.google.debugging.sourcemap.SourceMapGeneratorV3 generator = new com.google.debugging.sourcemap.SourceMapGeneratorV3();
			org.json.JSONArray sections = sourceMapRoot.getJSONArray("sections");
			for (int i = 0, count = sections.length(); i < count; i++) {
				org.json.JSONObject section = sections.getJSONObject(i);
				java.lang.String url = section.getString("url");
				org.json.JSONObject offset = section.getJSONObject("offset");
				int line = offset.getInt("line");
				int column = offset.getInt("column");
				java.lang.String mapSectionContents = sectionSupplier.getSourceMap(url);
				if (mapSectionContents == null) {
					throw new com.google.debugging.sourcemap.SourceMapParseException(("Unable to retrieve: " + url));
				}
				generator.mergeMapSection(line, column, mapSectionContents);
			}
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			try {
				generator.appendTo(sb, file);
			} catch (java.io.IOException e) {
				throw new java.lang.RuntimeException(e);
			}
			parse(sb.toString());
		} catch (java.io.IOException ex) {
			throw new com.google.debugging.sourcemap.SourceMapParseException(("IO exception: " + ex));
		} catch (org.json.JSONException ex) {
			throw new com.google.debugging.sourcemap.SourceMapParseException(("JSON parse exception: " + ex));
		}
	}

	@java.lang.Override
	public com.google.debugging.sourcemap.proto.Mapping.OriginalMapping getMappingForLine(int lineNumber, int column) {
		lineNumber--;
		column--;
		if ((lineNumber < 0) || (lineNumber >= (lines.size()))) {
			return null;
		}
		com.google.common.base.Preconditions.checkState((lineNumber >= 0));
		com.google.common.base.Preconditions.checkState((column >= 0));
		if ((lines.get(lineNumber)) == null) {
			return getPreviousMapping(lineNumber);
		}
		java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry> entries = lines.get(lineNumber);
		com.google.common.base.Preconditions.checkState(((entries.size()) > 0));
		if ((entries.get(0).getGeneratedColumn()) > column) {
			return getPreviousMapping(lineNumber);
		}
		int index = search(entries, column, 0, ((entries.size()) - 1));
		com.google.common.base.Preconditions.checkState((index >= 0), ("unexpected:" + index));
		return getOriginalMappingForEntry(entries.get(index));
	}

	@java.lang.Override
	public java.util.Collection<java.lang.String> getOriginalSources() {
		return java.util.Arrays.asList(sources);
	}

	@java.lang.Override
	public java.util.Collection<com.google.debugging.sourcemap.proto.Mapping.OriginalMapping> getReverseMapping(java.lang.String originalFile, int line, int column) {
		int sourceFileId = java.util.Arrays.binarySearch(sources, originalFile);
		if (sourceFileId < 0) {
			return java.util.Collections.emptyList();
		}
		for (java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry> entries : lines) {
			if (entries != null) {
				for (com.google.debugging.sourcemap.SourceMapConsumerV3.Entry entry : entries) {
					if ((entry.getSourceFileId()) == sourceFileId) {
						if ((entry.getSourceLine()) == line) {
							com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.Builder builder = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.newBuilder().setOriginalFile(sources[entry.getSourceFileId()]).setLineNumber(entry.getSourceLine()).setColumnPosition(entry.getSourceColumn());
							com.google.debugging.sourcemap.proto.Mapping.OriginalMapping mapping = builder.build();
							return java.util.Collections.singletonList(mapping);
						}
					}
				}
			}
		}
		return java.util.Collections.emptyList();
	}

	private java.lang.String[] getJavaStringArray(org.json.JSONArray array) throws org.json.JSONException {
		int len = array.length();
		java.lang.String[] result = new java.lang.String[len];
		for (int i = 0; i < len; i++) {
			result[i] = array.getString(i);
		}
		return result;
	}

	private class MappingBuilder {
		private static final int MAX_ENTRY_VALUES = 5;

		private final com.google.debugging.sourcemap.SourceMapConsumerV3.StringCharIterator content;

		private int line = 0;

		private int previousCol = 0;

		private int previousSrcId = 0;

		private int previousSrcLine = 0;

		private int previousSrcColumn = 0;

		private int previousNameId = 0;

		MappingBuilder(java.lang.String lineMap) {
			this.content = new com.google.debugging.sourcemap.SourceMapConsumerV3.StringCharIterator(lineMap);
		}

		void build() {
			int[] temp = new int[com.google.debugging.sourcemap.SourceMapConsumerV3.MappingBuilder.MAX_ENTRY_VALUES];
			java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry> entries = new java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry>();
			while (content.hasNext()) {
				if (tryConsumeToken(';')) {
					java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry> result;
					if ((entries.size()) > 0) {
						result = entries;
						entries = new java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry>();
					}else {
						result = null;
					}
					lines.add(result);
					entries.clear();
					(line)++;
					previousCol = 0;
				}else {
					int entryValues = 0;
					while (!(entryComplete())) {
						temp[entryValues] = nextValue();
						entryValues++;
					} 
					com.google.debugging.sourcemap.SourceMapConsumerV3.Entry entry = decodeEntry(temp, entryValues);
					validateEntry(entry);
					entries.add(entry);
					tryConsumeToken(',');
				}
			} 
		}

		private void validateEntry(com.google.debugging.sourcemap.SourceMapConsumerV3.Entry entry) {
			com.google.common.base.Preconditions.checkState(((line) < (lineCount)));
			com.google.common.base.Preconditions.checkState((((entry.getSourceFileId()) == (com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED)) || ((entry.getSourceFileId()) < (sources.length))));
			com.google.common.base.Preconditions.checkState((((entry.getNameId()) == (com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED)) || ((entry.getNameId()) < (names.length))));
		}

		private com.google.debugging.sourcemap.SourceMapConsumerV3.Entry decodeEntry(int[] vals, int entryValues) {
			com.google.debugging.sourcemap.SourceMapConsumerV3.Entry entry;
			switch (entryValues) {
				case 1 :
					entry = new com.google.debugging.sourcemap.SourceMapConsumerV3.UnmappedEntry(((vals[0]) + (previousCol)));
					previousCol = entry.getGeneratedColumn();
					return entry;
				case 4 :
					entry = new com.google.debugging.sourcemap.SourceMapConsumerV3.UnnamedEntry(((vals[0]) + (previousCol)), ((vals[1]) + (previousSrcId)), ((vals[2]) + (previousSrcLine)), ((vals[3]) + (previousSrcColumn)));
					previousCol = entry.getGeneratedColumn();
					previousSrcId = entry.getSourceFileId();
					previousSrcLine = entry.getSourceLine();
					previousSrcColumn = entry.getSourceColumn();
					return entry;
				case 5 :
					entry = new com.google.debugging.sourcemap.SourceMapConsumerV3.NamedEntry(((vals[0]) + (previousCol)), ((vals[1]) + (previousSrcId)), ((vals[2]) + (previousSrcLine)), ((vals[3]) + (previousSrcColumn)), ((vals[4]) + (previousNameId)));
					previousCol = entry.getGeneratedColumn();
					previousSrcId = entry.getSourceFileId();
					previousSrcLine = entry.getSourceLine();
					previousSrcColumn = entry.getSourceColumn();
					previousNameId = entry.getNameId();
					return entry;
				default :
					throw new java.lang.IllegalStateException(("Unexpected number of values for entry:" + entryValues));
			}
		}

		private boolean tryConsumeToken(char token) {
			if ((content.hasNext()) && ((content.peek()) == token)) {
				content.next();
				return true;
			}
			return false;
		}

		private boolean entryComplete() {
			if (!(content.hasNext())) {
				return true;
			}
			char c = content.peek();
			return (c == ';') || (c == ',');
		}

		private int nextValue() {
			return com.google.debugging.sourcemap.Base64VLQ.decode(content);
		}
	}

	private int search(java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry> entries, int target, int start, int end) {
		while (true) {
			int mid = ((end - start) / 2) + start;
			int compare = compareEntry(entries, mid, target);
			if (compare == 0) {
				return mid;
			}else
				if (compare < 0) {
					start = mid + 1;
					if (start > end) {
						return end;
					}
				}else {
					end = mid - 1;
					if (end < start) {
						return end;
					}
				}
			
		} 
	}

	private int compareEntry(java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry> entries, int entry, int target) {
		return (entries.get(entry).getGeneratedColumn()) - target;
	}

	private com.google.debugging.sourcemap.proto.Mapping.OriginalMapping getPreviousMapping(int lineNumber) {
		do {
			if (lineNumber == 0) {
				return null;
			}
			lineNumber--;
		} while ((lines.get(lineNumber)) == null );
		java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry> entries = lines.get(lineNumber);
		return getOriginalMappingForEntry(entries.get(((entries.size()) - 1)));
	}

	private com.google.debugging.sourcemap.proto.Mapping.OriginalMapping getOriginalMappingForEntry(com.google.debugging.sourcemap.SourceMapConsumerV3.Entry entry) {
		if ((entry.getSourceFileId()) == (com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED)) {
			return null;
		}else {
			com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.Builder x = com.google.debugging.sourcemap.proto.Mapping.OriginalMapping.newBuilder().setOriginalFile(sources[entry.getSourceFileId()]).setLineNumber(entry.getSourceLine()).setColumnPosition(entry.getSourceColumn());
			if ((entry.getNameId()) != (com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED)) {
				x.setIdentifier(names[entry.getNameId()]);
			}
			return x.build();
		}
	}

	private static class StringCharIterator implements com.google.debugging.sourcemap.Base64VLQ.CharIterator {
		final java.lang.String content;

		final int length;

		int current = 0;

		StringCharIterator(java.lang.String content) {
			this.content = content;
			this.length = content.length();
		}

		@java.lang.Override
		public char next() {
			return content.charAt(((current)++));
		}

		char peek() {
			return content.charAt(current);
		}

		@java.lang.Override
		public boolean hasNext() {
			return (current) < (length);
		}
	}

	private interface Entry {
		int getGeneratedColumn();

		int getSourceFileId();

		int getSourceLine();

		int getSourceColumn();

		int getNameId();
	}

	private static class UnmappedEntry implements com.google.debugging.sourcemap.SourceMapConsumerV3.Entry {
		private final int column;

		UnmappedEntry(int column) {
			this.column = column;
		}

		@java.lang.Override
		public int getGeneratedColumn() {
			return column;
		}

		@java.lang.Override
		public int getSourceFileId() {
			return com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED;
		}

		@java.lang.Override
		public int getSourceLine() {
			return com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED;
		}

		@java.lang.Override
		public int getSourceColumn() {
			return com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED;
		}

		@java.lang.Override
		public int getNameId() {
			return com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED;
		}
	}

	private static class UnnamedEntry extends com.google.debugging.sourcemap.SourceMapConsumerV3.UnmappedEntry {
		private final int srcFile;

		private final int srcLine;

		private final int srcColumn;

		UnnamedEntry(int column, int srcFile, int srcLine, int srcColumn) {
			super(column);
			this.srcFile = srcFile;
			this.srcLine = srcLine;
			this.srcColumn = srcColumn;
		}

		@java.lang.Override
		public int getSourceFileId() {
			return srcFile;
		}

		@java.lang.Override
		public int getSourceLine() {
			return srcLine;
		}

		@java.lang.Override
		public int getSourceColumn() {
			return srcColumn;
		}

		@java.lang.Override
		public int getNameId() {
			return com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED;
		}
	}

	private static class NamedEntry extends com.google.debugging.sourcemap.SourceMapConsumerV3.UnnamedEntry {
		private final int name;

		NamedEntry(int column, int srcFile, int srcLine, int srcColumn, int name) {
			super(column, srcFile, srcLine, srcColumn);
			this.name = name;
		}

		@java.lang.Override
		public int getNameId() {
			return name;
		}
	}

	static interface EntryVisitor {
		void visit(java.lang.String sourceName, java.lang.String symbolName, com.google.debugging.sourcemap.FilePosition sourceStartPosition, com.google.debugging.sourcemap.FilePosition startPosition, com.google.debugging.sourcemap.FilePosition endPosition);
	}

	public void visitMappings(com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor visitor) {
		boolean pending = false;
		java.lang.String sourceName = null;
		java.lang.String symbolName = null;
		com.google.debugging.sourcemap.FilePosition sourceStartPosition = null;
		com.google.debugging.sourcemap.FilePosition startPosition = null;
		final int lineCount = lines.size();
		for (int i = 0; i < lineCount; i++) {
			java.util.ArrayList<com.google.debugging.sourcemap.SourceMapConsumerV3.Entry> line = lines.get(i);
			if (line != null) {
				final int entryCount = line.size();
				for (int j = 0; j < entryCount; j++) {
					com.google.debugging.sourcemap.SourceMapConsumerV3.Entry entry = line.get(j);
					if (pending) {
						com.google.debugging.sourcemap.FilePosition endPosition = new com.google.debugging.sourcemap.FilePosition(i, entry.getGeneratedColumn());
						visitor.visit(sourceName, symbolName, sourceStartPosition, startPosition, endPosition);
						pending = false;
					}
					if ((entry.getSourceFileId()) != (com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED)) {
						pending = true;
						sourceName = sources[entry.getSourceFileId()];
						symbolName = ((entry.getNameId()) != (com.google.debugging.sourcemap.SourceMapConsumerV3.UNMAPPED)) ? names[entry.getNameId()] : null;
						sourceStartPosition = new com.google.debugging.sourcemap.FilePosition(entry.getSourceLine(), entry.getSourceColumn());
						startPosition = new com.google.debugging.sourcemap.FilePosition(i, entry.getGeneratedColumn());
					}
				}
			}
		}
	}
}

