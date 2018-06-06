

package com.google.debugging.sourcemap;


public class SourceMapGeneratorV2 implements com.google.debugging.sourcemap.SourceMapGenerator {
	private boolean validate = false;

	private static final int UNMAPPED = -1;

	private static final java.lang.String BASE64_MAP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + ("abcdefghijklmnopqrstuvwxyz" + "0123456789+/");

	private java.util.List<com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping> mappings = com.google.common.collect.Lists.newArrayList();

	private java.util.LinkedHashMap<java.lang.String, java.lang.Integer> sourceFileMap = com.google.common.collect.Maps.newLinkedHashMap();

	private java.lang.String lastSourceFile = null;

	private int lastSourceFileIndex = -1;

	private com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping lastMapping;

	private com.google.debugging.sourcemap.FilePosition offsetPosition = new com.google.debugging.sourcemap.FilePosition(0, 0);

	private com.google.debugging.sourcemap.FilePosition prefixPosition = new com.google.debugging.sourcemap.FilePosition(0, 0);

	public void reset() {
		mappings.clear();
		lastMapping = null;
		sourceFileMap.clear();
		lastSourceFile = null;
		lastSourceFileIndex = -1;
		offsetPosition = new com.google.debugging.sourcemap.FilePosition(0, 0);
		prefixPosition = new com.google.debugging.sourcemap.FilePosition(0, 0);
	}

	@com.google.common.annotations.VisibleForTesting
	public void validate(boolean validate) {
		com.google.debugging.sourcemap.SourceMapGeneratorV2.this.validate = validate;
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
		com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping mapping = new com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping();
		mapping.sourceFile = lastSourceFileIndex;
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

	public void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException {
		int maxLine = prepMappings();
		out.append("{\n");
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFirstField(out, "version", "2");
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendField(out, "file", com.google.debugging.sourcemap.SourceMapGeneratorV2.escapeString(name));
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendField(out, "lineCount", java.lang.String.valueOf((maxLine + 1)));
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldStart(out, "lineMaps");
		out.append("[");
		new com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapper(out).appendLineMappings();
		out.append("]");
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldEnd(out);
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldStart(out, "sources");
		out.append("[");
		addSourceNameMap(out);
		out.append("]");
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldEnd(out);
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldStart(out, "mappings");
		out.append("[");
		new com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingWriter().appendMappings(out);
		out.append("]");
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldEnd(out);
		out.append("\n}\n");
	}

	private void addSourceNameMap(java.lang.Appendable out) throws java.io.IOException {
		int i = 0;
		for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : sourceFileMap.entrySet()) {
			java.lang.String key = entry.getKey();
			if (i != 0) {
				out.append(",");
			}
			out.append("\"");
			out.append(key);
			out.append("\"");
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
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendField(out, name, "");
	}

	@java.lang.SuppressWarnings(value = "unused")
	private static void appendFieldEnd(java.lang.Appendable out) throws java.io.IOException {
	}

	private int prepMappings() throws java.io.IOException {
		new com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal().traverse(new com.google.debugging.sourcemap.SourceMapGeneratorV2.UsedMappingCheck());
		int id = 0;
		int maxLine = 0;
		for (com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m : mappings) {
			if (m.used) {
				m.id = id++;
				int endPositionLine = m.endPosition.getLine();
				maxLine = java.lang.Math.max(maxLine, endPositionLine);
			}
		}
		return maxLine + (prefixPosition.getLine());
	}

	static class Mapping {
		int id = com.google.debugging.sourcemap.SourceMapGeneratorV2.UNMAPPED;

		int sourceFile;

		com.google.debugging.sourcemap.FilePosition originalPosition;

		com.google.debugging.sourcemap.FilePosition startPosition;

		com.google.debugging.sourcemap.FilePosition endPosition;

		java.lang.String originalName;

		boolean used = false;
	}

	private class MappingWriter {
		private int lastLine = 0;

		private java.lang.String lastLineString = java.lang.String.valueOf(0);

		private void appendMappingTo(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m, java.lang.Appendable out) throws java.io.IOException {
			out.append("[");
			out.append(java.lang.String.valueOf(m.sourceFile));
			out.append(",");
			int line = m.originalPosition.getLine();
			if (line != (lastLine)) {
				lastLineString = java.lang.String.valueOf(line);
			}
			java.lang.String lineValue = lastLineString;
			out.append(lineValue);
			out.append(",");
			out.append(java.lang.String.valueOf(m.originalPosition.getColumn()));
			if ((m.originalName) != null) {
				out.append(",");
				out.append(com.google.debugging.sourcemap.SourceMapGeneratorV2.escapeString(m.originalName));
			}
			out.append("],\n");
		}

		void appendMappings(java.lang.Appendable out) throws java.io.IOException {
			for (com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m : mappings) {
				if (m.used) {
					appendMappingTo(m, out);
				}
			}
		}
	}

	private class LineMapper implements com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor {
		private final java.lang.Appendable out;

		private int lastId = com.google.debugging.sourcemap.SourceMapGeneratorV2.UNMAPPED;

		LineMapper(java.lang.Appendable out) {
			this.out = out;
		}

		public void visit(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m, int line, int col, int nextLine, int nextCol) throws java.io.IOException {
			int id = m != null ? m.id : com.google.debugging.sourcemap.SourceMapGeneratorV2.UNMAPPED;
			for (int i = line; i <= nextLine; i++) {
				if (i == nextLine) {
					closeEntry(id, (nextCol - col));
					break;
				}
				closeLine(false);
				openLine();
				col = 0;
			}
		}

		void appendLineMappings() throws java.io.IOException {
			openLine();
			new com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingTraversal().traverse(com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapper.this);
			closeLine(true);
		}

		private void openLine() throws java.io.IOException {
			out.append("\"");
			com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapper.this.lastId = 0;
		}

		private void closeLine(boolean finalEntry) throws java.io.IOException {
			if (finalEntry) {
				out.append("\"");
			}else {
				out.append("\",\n");
			}
		}

		private void closeEntry(int id, int reps) throws java.io.IOException {
			if (reps == 0) {
				return ;
			}
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.encodeEntry(sb, id, lastId, reps);
			if (validate) {
				com.google.debugging.sourcemap.SourceMapLineDecoder.LineEntry entry = com.google.debugging.sourcemap.SourceMapLineDecoder.decodeLineEntry(sb.toString(), lastId);
				com.google.common.base.Preconditions.checkState((((entry.id) == id) && ((entry.reps) == reps)), "expected (%s,%s) but got (%s,%s)", id, reps, entry.id, entry.reps);
			}
			out.append(sb);
			lastId = id;
		}
	}

	@com.google.common.annotations.VisibleForTesting
	public static class LineMapEncoder {
		public static void encodeEntry(java.lang.Appendable out, int id, int lastId, int reps) throws java.io.IOException {
			com.google.common.base.Preconditions.checkState((reps > 0));
			int relativeIdLength = com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.getRelativeMappingIdLength(id, lastId);
			int relativeId = com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.getRelativeMappingId(id, relativeIdLength, lastId);
			java.lang.String relativeIdString = com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.valueToBase64(relativeId, relativeIdLength);
			if ((reps > 16) || (relativeIdLength > 4)) {
				java.lang.String repsString = com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.valueToBase64((reps - 1), 1);
				for (int i = 0; i < (repsString.length()); i++) {
					out.append('!');
				}
				java.lang.String sizeId = com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.valueToBase64(((relativeIdString.length()) - 1), 1);
				out.append(sizeId);
				out.append(repsString);
			}else {
				int prefix = ((reps - 1) << 2) + ((relativeIdString.length()) - 1);
				com.google.common.base.Preconditions.checkState(((prefix < 64) && (prefix >= 0)), "prefix (%s) reps(%s) map id size(%s)", prefix, reps, relativeIdString.length());
				out.append(com.google.debugging.sourcemap.SourceMapGeneratorV2.LineMapEncoder.valueToBase64(prefix, 1));
			}
			out.append(relativeIdString);
		}

		public static int getRelativeMappingId(int id, int idLength, int lastId) {
			int base = 1 << (idLength * 6);
			int relativeId = id - lastId;
			return relativeId < 0 ? relativeId + base : relativeId;
		}

		public static int getRelativeMappingIdLength(int rawId, int lastId) {
			com.google.common.base.Preconditions.checkState(((rawId >= 0) || (rawId == (com.google.debugging.sourcemap.SourceMapGeneratorV2.UNMAPPED))));
			int relativeId = rawId - lastId;
			int id = (relativeId < 0 ? (java.lang.Math.abs(relativeId)) - 1 : relativeId) << 1;
			int digits = 1;
			int base = 64;
			while (id >= base) {
				digits++;
				base *= 64;
			} 
			return digits;
		}

		static java.lang.String valueToBase64(int value, int minimumSize) {
			int size = 0;
			char[] chars = new char[4];
			do {
				int charValue = value & 63;
				value = value >>> 6;
				chars[(size++)] = com.google.debugging.sourcemap.SourceMapGeneratorV2.BASE64_MAP.charAt(charValue);
			} while (value > 0 );
			java.lang.StringBuilder sb = new java.lang.StringBuilder(size);
			while (minimumSize > size) {
				sb.append(com.google.debugging.sourcemap.SourceMapGeneratorV2.BASE64_MAP.charAt(0));
				minimumSize--;
			} 
			while (size > 0) {
				sb.append(chars[(--size)]);
			} 
			return sb.toString();
		}
	}

	private class UsedMappingCheck implements com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor {
		@java.lang.Override
		public void visit(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m, int line, int col, int nextLine, int nextCol) throws java.io.IOException {
			if (m != null) {
				m.used = true;
			}
		}
	}

	private interface MappingVisitor {
		void visit(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m, int line, int col, int endLine, int endCol) throws java.io.IOException;
	}

	private class MappingTraversal {
		private int line;

		private int col;

		MappingTraversal() {
		}

		void traverse(com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor v) throws java.io.IOException {
			java.util.Deque<com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping> stack = new java.util.ArrayDeque<com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping>();
			for (com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m : mappings) {
				while ((!(stack.isEmpty())) && (!(isOverlapped(stack.peek(), m)))) {
					com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping previous = stack.pop();
					maybeVisit(v, previous);
				} 
				com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping parent = stack.peek();
				maybeVisitParent(v, parent, m);
				stack.push(m);
			}
			while (!(stack.isEmpty())) {
				com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m = stack.pop();
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

		private boolean isOverlapped(com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m1, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m2) {
			int l1 = m1.endPosition.getLine();
			int l2 = m2.startPosition.getLine();
			int c1 = m1.endPosition.getColumn();
			int c2 = m2.startPosition.getColumn();
			return ((l1 == l2) && (c1 >= c2)) || (l1 > l2);
		}

		private void maybeVisit(com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor v, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m) throws java.io.IOException {
			int nextLine = getAdjustedLine(m.endPosition);
			int nextCol = getAdjustedCol(m.endPosition);
			if (((line) < nextLine) || (((line) == nextLine) && ((col) < nextCol))) {
				visit(v, m, nextLine, nextCol);
			}
		}

		private void maybeVisitParent(com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor v, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping parent, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m) throws java.io.IOException {
			int nextLine = getAdjustedLine(m.startPosition);
			int nextCol = getAdjustedCol(m.startPosition);
			com.google.common.base.Preconditions.checkState((((line) < nextLine) || ((col) <= nextCol)));
			if (((line) < nextLine) || (((line) == nextLine) && ((col) < nextCol))) {
				visit(v, parent, nextLine, nextCol);
			}
		}

		private void visit(com.google.debugging.sourcemap.SourceMapGeneratorV2.MappingVisitor v, com.google.debugging.sourcemap.SourceMapGeneratorV2.Mapping m, int nextLine, int nextCol) throws java.io.IOException {
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
	public void writeMetaMap(java.lang.Appendable out, java.lang.String name, java.util.List<com.google.debugging.sourcemap.SourceMapSection> appSections) throws java.io.IOException {
		out.append("{\n");
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFirstField(out, "version", "2");
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendField(out, "file", com.google.debugging.sourcemap.SourceMapGeneratorV2.escapeString(name));
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldStart(out, "sections");
		out.append("[\n");
		boolean first = true;
		java.lang.Long offset = new java.lang.Long(0);
		for (com.google.debugging.sourcemap.SourceMapSection section : appSections) {
			if (first) {
				first = false;
			}else {
				out.append(",\n");
			}
			out.append("{\n");
			com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFirstField(out, "offset", offset.toString());
			com.google.debugging.sourcemap.SourceMapGeneratorV2.appendField(out, "file", com.google.debugging.sourcemap.SourceMapGeneratorV2.escapeString(section.getSectionUrl()));
			out.append("\n}");
			offset += section.getLength();
		}
		out.append("\n]");
		com.google.debugging.sourcemap.SourceMapGeneratorV2.appendFieldEnd(out);
		out.append("\n}\n");
	}
}

