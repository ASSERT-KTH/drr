

package com.google.debugging.sourcemap;


public class SourceMapGeneratorV3 implements com.google.debugging.sourcemap.SourceMapGenerator {
	private static final int UNMAPPED = -1;

	private java.util.List<com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping> mappings = com.google.common.collect.Lists.newArrayList();

	private java.util.LinkedHashMap<java.lang.String, java.lang.Integer> sourceFileMap = com.google.common.collect.Maps.newLinkedHashMap();

	private java.util.LinkedHashMap<java.lang.String, java.lang.Integer> originalNameMap = com.google.common.collect.Maps.newLinkedHashMap();

	private java.lang.String lastSourceFile = null;

	private int lastSourceFileIndex = -1;

	private com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping lastMapping;

	private com.google.debugging.sourcemap.FilePosition offsetPosition = new com.google.debugging.sourcemap.FilePosition(0, 0);

	private com.google.debugging.sourcemap.FilePosition prefixPosition = new com.google.debugging.sourcemap.FilePosition(0, 0);

	public void reset() {
		mappings.clear();
		lastMapping = null;
		sourceFileMap.clear();
		originalNameMap.clear();
		lastSourceFile = null;
		lastSourceFileIndex = -1;
		offsetPosition = new com.google.debugging.sourcemap.FilePosition(0, 0);
		prefixPosition = new com.google.debugging.sourcemap.FilePosition(0, 0);
	}

	public void validate(boolean validate) {
	}

	public void setWrapperPrefix(java.lang.String prefix) {
		int prefixLine = 0;
		int prefixIndex = 0;
		for (int i = 0; i < (prefix.length()); ++i) {
			if ((prefix.charAt(i)) == '\n') {
				prefixLine++;
				prefixIndex = 0;
			}else {
				prefixIndex++;
			}
		}
		prefixPosition = new com.google.debugging.sourcemap.FilePosition(prefixLine, prefixIndex);
	}

	public void setStartingPosition(int offsetLine, int offsetIndex) {
		com.google.common.base.Preconditions.checkState((offsetLine >= 0));
		com.google.common.base.Preconditions.checkState((offsetIndex >= 0));
		offsetPosition = new com.google.debugging.sourcemap.FilePosition(offsetLine, offsetIndex);
	}

	public void addMapping(java.lang.String sourceName, @javax.annotation.Nullable
	java.lang.String symbolName, com.google.debugging.sourcemap.FilePosition sourceStartPosition, com.google.debugging.sourcemap.FilePosition startPosition, com.google.debugging.sourcemap.FilePosition endPosition) {
		if ((sourceName == null) || ((sourceStartPosition.getLine()) < 0)) {
			return ;
		}
		com.google.debugging.sourcemap.FilePosition adjustedStart = startPosition;
		com.google.debugging.sourcemap.FilePosition adjustedEnd = endPosition;
		if (((offsetPosition.getLine()) != 0) || ((offsetPosition.getColumn()) != 0)) {
			int offsetLine = offsetPosition.getLine();
			int startOffsetPosition = offsetPosition.getColumn();
			int endOffsetPosition = offsetPosition.getColumn();
			if ((startPosition.getLine()) > 0) {
				startOffsetPosition = 0;
			}
			if ((endPosition.getLine()) > 0) {
				endOffsetPosition = 0;
			}
			adjustedStart = new com.google.debugging.sourcemap.FilePosition(((startPosition.getLine()) + offsetLine), ((startPosition.getColumn()) + startOffsetPosition));
			adjustedEnd = new com.google.debugging.sourcemap.FilePosition(((endPosition.getLine()) + offsetLine), ((endPosition.getColumn()) + endOffsetPosition));
		}
		com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping mapping = new com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping();
		mapping.sourceFile = sourceName;
		mapping.originalPosition = sourceStartPosition;
		mapping.originalName = symbolName;
		mapping.startPosition = adjustedStart;
		mapping.endPosition = adjustedEnd;
		if ((lastMapping) != null) {
			int lastLine = lastMapping.startPosition.getLine();
			int lastColumn = lastMapping.startPosition.getColumn();
			int nextLine = mapping.startPosition.getLine();
			int nextColumn = mapping.startPosition.getColumn();
			com.google.common.base.Preconditions.checkState(((nextLine > lastLine) || ((nextLine == lastLine) && (nextColumn >= lastColumn))), ("Incorrect source mappings order, previous : (%s,%s)\n" + "new : (%s,%s)\nnode : %s"), lastLine, lastColumn, nextLine, nextColumn);
		}
		lastMapping = mapping;
		mappings.add(mapping);
	}

	class ConsumerEntryVisitor implements com.google.debugging.sourcemap.SourceMapConsumerV3.EntryVisitor {
		@java.lang.Override
		public void visit(java.lang.String sourceName, java.lang.String symbolName, com.google.debugging.sourcemap.FilePosition sourceStartPosition, com.google.debugging.sourcemap.FilePosition startPosition, com.google.debugging.sourcemap.FilePosition endPosition) {
			addMapping(sourceName, symbolName, sourceStartPosition, startPosition, endPosition);
		}
	}

	public void mergeMapSection(int line, int column, java.lang.String mapSectionContents) throws com.google.debugging.sourcemap.SourceMapParseException {
		setStartingPosition(line, column);
		com.google.debugging.sourcemap.SourceMapConsumerV3 section = new com.google.debugging.sourcemap.SourceMapConsumerV3();
		section.parse(mapSectionContents);
		section.visitMappings(new com.google.debugging.sourcemap.SourceMapGeneratorV3.ConsumerEntryVisitor());
	}

	public void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException {
		int maxLine = prepMappings();
		out.append("{\n");
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFirstField(out, "version", "3");
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendField(out, "file", com.google.debugging.sourcemap.SourceMapGeneratorV3.escapeString(name));
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendField(out, "lineCount", java.lang.String.valueOf((maxLine + 1)));
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldStart(out, "mappings");
		new com.google.debugging.sourcemap.SourceMapGeneratorV3.LineMapper(out).appendLineMappings();
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldEnd(out);
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldStart(out, "sources");
		out.append("[");
		addSourceNameMap(out);
		out.append("]");
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldEnd(out);
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldStart(out, "names");
		out.append("[");
		addSymbolNameMap(out);
		out.append("]");
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldEnd(out);
		out.append("\n}\n");
	}

	private void addSourceNameMap(java.lang.Appendable out) throws java.io.IOException {
		addNameMap(out, sourceFileMap);
	}

	private void addSymbolNameMap(java.lang.Appendable out) throws java.io.IOException {
		addNameMap(out, originalNameMap);
	}

	private void addNameMap(java.lang.Appendable out, java.util.Map<java.lang.String, java.lang.Integer> map) throws java.io.IOException {
		int i = 0;
		for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
			java.lang.String key = entry.getKey();
			if (i != 0) {
				out.append(",");
			}
			out.append(com.google.debugging.sourcemap.SourceMapGeneratorV3.escapeString(key));
			i++;
		}
	}

	private static java.lang.String escapeString(java.lang.String value) {
		return com.google.debugging.sourcemap.Util.escapeString(value);
	}

	private static void appendFirstField(java.lang.Appendable out, java.lang.String name, java.lang.String value) throws java.io.IOException {
		out.append("\"");
		out.append(name);
		out.append("\"");
		out.append(":");
		out.append(value);
	}

	private static void appendField(java.lang.Appendable out, java.lang.String name, java.lang.String value) throws java.io.IOException {
		out.append(",\n");
		out.append("\"");
		out.append(name);
		out.append("\"");
		out.append(":");
		out.append(value);
	}

	private static void appendFieldStart(java.lang.Appendable out, java.lang.String name) throws java.io.IOException {
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendField(out, name, "");
	}

	@java.lang.SuppressWarnings(value = "unused")
	private static void appendFieldEnd(java.lang.Appendable out) throws java.io.IOException {
	}

	private int prepMappings() throws java.io.IOException {
		new com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal().traverse(new com.google.debugging.sourcemap.SourceMapGeneratorV3.UsedMappingCheck());
		int id = 0;
		int maxLine = 0;
		int sourceId = 0;
		int nameId = 0;
		for (com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m : mappings) {
			if (m.used) {
				m.id = id++;
				int endPositionLine = m.endPosition.getLine();
				maxLine = java.lang.Math.max(maxLine, endPositionLine);
			}
		}
		return maxLine + (prefixPosition.getLine());
	}

	static class Mapping {
		int id = com.google.debugging.sourcemap.SourceMapGeneratorV3.UNMAPPED;

		java.lang.String sourceFile;

		com.google.debugging.sourcemap.FilePosition originalPosition;

		com.google.debugging.sourcemap.FilePosition startPosition;

		com.google.debugging.sourcemap.FilePosition endPosition;

		java.lang.String originalName;

		boolean used = false;
	}

	private class UsedMappingCheck implements com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor {
		@java.lang.Override
		public void visit(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m, int line, int col, int nextLine, int nextCol) throws java.io.IOException {
			if (m != null) {
				m.used = true;
			}
		}
	}

	private interface MappingVisitor {
		void visit(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m, int line, int col, int endLine, int endCol) throws java.io.IOException;
	}

	private class MappingTraversal {
		private int line;

		private int col;

		MappingTraversal() {
		}

		void traverse(com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor v) throws java.io.IOException {
			java.util.Deque<com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping> stack = new java.util.ArrayDeque<com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping>();
			for (com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m : mappings) {
				while ((!(stack.isEmpty())) && (!(isOverlapped(stack.peek(), m)))) {
					com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping previous = stack.pop();
					maybeVisit(v, previous);
				} 
				com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping parent = stack.peek();
				maybeVisitParent(v, parent, m);
				stack.push(m);
			}
			while (!(stack.isEmpty())) {
				com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m = stack.pop();
				maybeVisit(v, m);
			} 
		}

		private int getAdjustedLine(com.google.debugging.sourcemap.FilePosition p) {
			return (p.getLine()) + (prefixPosition.getLine());
		}

		private int getAdjustedCol(com.google.debugging.sourcemap.FilePosition p) {
			int rawLine = p.getLine();
			int rawCol = p.getColumn();
			return rawLine != 0 ? rawCol : rawCol + (prefixPosition.getColumn());
		}

		private boolean isOverlapped(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m1, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m2) {
			int l1 = m1.endPosition.getLine();
			int l2 = m2.startPosition.getLine();
			int c1 = m1.endPosition.getColumn();
			int c2 = m2.startPosition.getColumn();
			return ((l1 == l2) && (c1 >= c2)) || (l1 > l2);
		}

		private void maybeVisit(com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor v, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m) throws java.io.IOException {
			int nextLine = getAdjustedLine(m.endPosition);
			int nextCol = getAdjustedCol(m.endPosition);
			if (((line) < nextLine) || (((line) == nextLine) && ((col) < nextCol))) {
				visit(v, m, nextLine, nextCol);
			}
		}

		private void maybeVisitParent(com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor v, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping parent, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m) throws java.io.IOException {
			int nextLine = getAdjustedLine(m.startPosition);
			int nextCol = getAdjustedCol(m.startPosition);
			com.google.common.base.Preconditions.checkState((((line) < nextLine) || ((col) <= nextCol)));
			if (((line) < nextLine) || (((line) == nextLine) && ((col) < nextCol))) {
				visit(v, parent, nextLine, nextCol);
			}
		}

		private void visit(com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor v, com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m, int nextLine, int nextCol) throws java.io.IOException {
			com.google.common.base.Preconditions.checkState(((line) <= nextLine));
			com.google.common.base.Preconditions.checkState((((line) < nextLine) || ((col) < nextCol)));
			if (((line) == nextLine) && ((col) == nextCol)) {
				com.google.common.base.Preconditions.checkState(false);
				return ;
			}
			v.visit(m, line, col, nextLine, nextCol);
			line = nextLine;
			col = nextCol;
		}
	}

	@java.lang.Override
	public void appendIndexMapTo(java.lang.Appendable out, java.lang.String name, java.util.List<com.google.debugging.sourcemap.SourceMapSection> sections) throws java.io.IOException {
		out.append("{\n");
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFirstField(out, "version", "3");
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendField(out, "file", com.google.debugging.sourcemap.SourceMapGeneratorV3.escapeString(name));
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldStart(out, "sections");
		out.append("[\n");
		boolean first = true;
		java.lang.Long offset = new java.lang.Long(0);
		for (com.google.debugging.sourcemap.SourceMapSection section : sections) {
			if (first) {
				first = false;
			}else {
				out.append(",\n");
			}
			out.append("{\n");
			com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFirstField(out, "offset", offset.toString());
			com.google.debugging.sourcemap.SourceMapGeneratorV3.appendField(out, "url", com.google.debugging.sourcemap.SourceMapGeneratorV3.escapeString(section.getSectionUrl()));
			out.append("\n}");
			offset += section.getLength();
		}
		out.append("\n]");
		com.google.debugging.sourcemap.SourceMapGeneratorV3.appendFieldEnd(out);
		out.append("\n}\n");
	}

	private int getSourceId(java.lang.String sourceName) {
		if (sourceName != (lastSourceFile)) {
			lastSourceFile = sourceName;
			java.lang.Integer index = sourceFileMap.get(sourceName);
			if (index != null) {
				lastSourceFileIndex = index;
			}else {
				lastSourceFileIndex = sourceFileMap.size();
				sourceFileMap.put(sourceName, lastSourceFileIndex);
			}
		}
		return lastSourceFileIndex;
	}

	private int getNameId(java.lang.String symbolName) {
		int originalNameIndex;
		java.lang.Integer index = originalNameMap.get(symbolName);
		if (index != null) {
			originalNameIndex = index;
		}else {
			originalNameIndex = originalNameMap.size();
			originalNameMap.put(symbolName, originalNameIndex);
		}
		return originalNameIndex;
	}

	private class LineMapper implements com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingVisitor {
		private final java.lang.Appendable out;

		private int previousLine = -1;

		private int previousColumn = 0;

		private int previousSourceFileId;

		private int previousSourceLine;

		private int previousSourceColumn;

		private int previousNameId;

		LineMapper(java.lang.Appendable out) {
			this.out = out;
		}

		public void visit(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m, int line, int col, int nextLine, int nextCol) throws java.io.IOException {
			int id = m != null ? m.id : com.google.debugging.sourcemap.SourceMapGeneratorV3.UNMAPPED;
			if ((previousLine) != line) {
				previousColumn = 0;
			}
			if ((line != nextLine) || (col != nextCol)) {
				if ((previousLine) == line) {
					out.append(',');
				}
				writeEntry(m, col);
				previousLine = line;
				previousColumn = col;
			}
			for (int i = line; i <= nextLine; i++) {
				if (i == nextLine) {
					break;
				}
				closeLine(false);
				openLine(false);
			}
		}

		void writeEntry(com.google.debugging.sourcemap.SourceMapGeneratorV3.Mapping m, int column) throws java.io.IOException {
			com.google.debugging.sourcemap.Base64VLQ.encode(out, (column - (previousColumn)));
			previousColumn = column;
			if (m != null) {
				int sourceId = getSourceId(m.sourceFile);
				com.google.debugging.sourcemap.Base64VLQ.encode(out, (sourceId - (previousSourceFileId)));
				previousSourceFileId = sourceId;
				int srcline = m.originalPosition.getLine();
				int srcColumn = m.originalPosition.getColumn();
				com.google.debugging.sourcemap.Base64VLQ.encode(out, (srcline - (previousSourceLine)));
				previousSourceLine = srcline;
				com.google.debugging.sourcemap.Base64VLQ.encode(out, (srcColumn - (previousSourceColumn)));
				previousSourceColumn = srcColumn;
				if ((m.originalName) != null) {
					int nameId = getNameId(m.originalName);
					com.google.debugging.sourcemap.Base64VLQ.encode(out, (nameId - (previousNameId)));
					previousNameId = nameId;
				}
			}
		}

		void appendLineMappings() throws java.io.IOException {
			openLine(true);
			new com.google.debugging.sourcemap.SourceMapGeneratorV3.MappingTraversal().traverse(com.google.debugging.sourcemap.SourceMapGeneratorV3.LineMapper.this);
			closeLine(true);
		}

		private void openLine(boolean firstEntry) throws java.io.IOException {
			if (firstEntry) {
				out.append('\"');
			}
		}

		private void closeLine(boolean finalEntry) throws java.io.IOException {
			out.append(';');
			if (finalEntry) {
				out.append('\"');
			}
		}
	}
}

