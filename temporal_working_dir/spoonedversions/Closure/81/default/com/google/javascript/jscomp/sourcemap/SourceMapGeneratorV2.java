

package com.google.javascript.jscomp.sourcemap;


public class SourceMapGeneratorV2 implements com.google.javascript.jscomp.sourcemap.SourceMapGenerator {
	private boolean validate = false;

	private static final int UNMAPPED = -1;

	private static final java.lang.String BASE64_MAP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + ("abcdefghijklmnopqrstuvwzyz" + "0123456789+/");

	private java.util.List<com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping> mappings = com.google.common.collect.Lists.newArrayList();

	private java.util.LinkedHashMap<java.lang.String, java.lang.Integer> source_file_map = com.google.common.collect.Maps.newLinkedHashMap();

	private java.lang.String lastSourceFile = null;

	private int lastSourceFileIndex = -1;

	private com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping lastMapping;

	private com.google.javascript.jscomp.sourcemap.Position offsetPosition = new com.google.javascript.jscomp.sourcemap.Position(0, 0);

	private com.google.javascript.jscomp.sourcemap.Position prefixPosition = new com.google.javascript.jscomp.sourcemap.Position(0, 0);

	public void reset() {
		mappings.clear();
		lastMapping = null;
		source_file_map.clear();
		lastSourceFile = null;
		lastSourceFileIndex = -1;
		offsetPosition = new com.google.javascript.jscomp.sourcemap.Position(0, 0);
		prefixPosition = new com.google.javascript.jscomp.sourcemap.Position(0, 0);
	}

	@com.google.common.annotations.VisibleForTesting
	public void validate(boolean validate) {
		com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.this.validate = validate;
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
		prefixPosition = new com.google.javascript.jscomp.sourcemap.Position(prefixLine, prefixIndex);
	}

	public void setStartingPosition(int offsetLine, int offsetIndex) {
		com.google.common.base.Preconditions.checkState((offsetLine >= 0));
		com.google.common.base.Preconditions.checkState((offsetIndex >= 0));
		offsetPosition = new com.google.javascript.jscomp.sourcemap.Position(offsetLine, offsetIndex);
	}

	public void addMapping(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.sourcemap.Position startPosition, com.google.javascript.jscomp.sourcemap.Position endPosition) {
		java.lang.String sourceFile = ((java.lang.String) (node.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP)));
		if ((sourceFile == null) || ((node.getLineno()) < 0)) {
			return ;
		}
		if (sourceFile != (lastSourceFile)) {
			lastSourceFile = sourceFile;
			java.lang.Integer index = source_file_map.get(sourceFile);
			if (index != null) {
				lastSourceFileIndex = index;
			}else {
				lastSourceFileIndex = source_file_map.size();
				source_file_map.put(sourceFile, lastSourceFileIndex);
			}
		}
		com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping mapping = new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping();
		mapping.sourceFile = lastSourceFileIndex;
		mapping.originalPosition = new com.google.javascript.jscomp.sourcemap.Position(node.getLineno(), node.getCharno());
		java.lang.String originalName = ((java.lang.String) (node.getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP)));
		if (originalName != null) {
			mapping.originalName = originalName;
		}
		if (((offsetPosition.getLineNumber()) == 0) && ((offsetPosition.getCharacterIndex()) == 0)) {
			mapping.startPosition = startPosition;
			mapping.endPosition = endPosition;
		}else {
			int offsetLine = offsetPosition.getLineNumber();
			int startOffsetPosition = offsetPosition.getCharacterIndex();
			int endOffsetPosition = offsetPosition.getCharacterIndex();
			if ((startPosition.getLineNumber()) > 0) {
				startOffsetPosition = 0;
			}
			if ((endPosition.getLineNumber()) > 0) {
				endOffsetPosition = 0;
			}
			mapping.startPosition = new com.google.javascript.jscomp.sourcemap.Position(((startPosition.getLineNumber()) + offsetLine), ((startPosition.getCharacterIndex()) + startOffsetPosition));
			mapping.endPosition = new com.google.javascript.jscomp.sourcemap.Position(((endPosition.getLineNumber()) + offsetLine), ((endPosition.getCharacterIndex()) + endOffsetPosition));
		}
		if ((lastMapping) != null) {
			int lastLine = lastMapping.startPosition.getLineNumber();
			int lastColumn = lastMapping.startPosition.getCharacterIndex();
			int nextLine = mapping.startPosition.getLineNumber();
			int nextColumn = mapping.startPosition.getCharacterIndex();
			com.google.common.base.Preconditions.checkState(((nextLine > lastLine) || ((nextLine == lastLine) && (nextColumn >= lastColumn))), ("Incorrect source mappings order, previous : (%s,%s)\n" + "new : (%s,%s)\nnode : %s"), lastLine, lastColumn, nextLine, nextColumn, node);
		}
		lastMapping = mapping;
		mappings.add(mapping);
	}

	public void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException {
		int maxLine = prepMappings();
		out.append("{\n");
		appendFirstField(out, "version", "2");
		appendField(out, "file", com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.escapeString(name));
		appendField(out, "lineCount", java.lang.String.valueOf((maxLine + 1)));
		appendFieldStart(out, "lineMaps");
		out.append("[");
		new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapper(out).appendLineMappings();
		out.append("]");
		appendFieldEnd(out);
		appendFieldStart(out, "sources");
		out.append("[");
		addSourceNameMap(out);
		out.append("]");
		appendFieldEnd(out);
		appendFieldStart(out, "mappings");
		out.append("[");
		new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.MappingWriter().appendMappings(out);
		out.append("]");
		appendFieldEnd(out);
		out.append("\n}\n");
	}

	private void addSourceNameMap(java.lang.Appendable out) throws java.io.IOException {
		int i = 0;
		for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : source_file_map.entrySet()) {
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
		return com.google.javascript.jscomp.sourcemap.Util.escapeString(value);
	}

	private void appendFirstField(java.lang.Appendable out, java.lang.String name, java.lang.String value) throws java.io.IOException {
		out.append("\"");
		out.append(name);
		out.append("\"");
		out.append(":");
		out.append(value);
	}

	private void appendField(java.lang.Appendable out, java.lang.String name, java.lang.String value) throws java.io.IOException {
		out.append(",\n");
		out.append("\"");
		out.append(name);
		out.append("\"");
		out.append(":");
		out.append(value);
	}

	private void appendFieldStart(java.lang.Appendable out, java.lang.String name) throws java.io.IOException {
		appendField(out, name, "");
	}

	@java.lang.SuppressWarnings(value = "unused")
	private void appendFieldEnd(java.lang.Appendable out) throws java.io.IOException {
	}

	private int prepMappings() throws java.io.IOException {
		new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.MappingTraversal().traverse(new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.UsedMappingCheck());
		int id = 0;
		int maxLine = 0;
		for (com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m : mappings) {
			if (m.used) {
				m.id = id++;
				int endPositionLine = m.endPosition.getLineNumber();
				maxLine = java.lang.Math.max(maxLine, endPositionLine);
			}
		}
		return maxLine + (prefixPosition.getLineNumber());
	}

	static class Mapping {
		int id = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.UNMAPPED;

		int sourceFile;

		com.google.javascript.jscomp.sourcemap.Position originalPosition;

		com.google.javascript.jscomp.sourcemap.Position startPosition;

		com.google.javascript.jscomp.sourcemap.Position endPosition;

		java.lang.String originalName;

		boolean used = false;
	}

	private class MappingWriter {
		private int lastLine = 0;

		private java.lang.String lastLineString = java.lang.String.valueOf(0);

		private void appendMappingTo(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m, java.lang.Appendable out) throws java.io.IOException {
			out.append("[");
			out.append(java.lang.String.valueOf(m.sourceFile));
			out.append(",");
			int line = m.originalPosition.getLineNumber();
			if (line != (lastLine)) {
				lastLineString = java.lang.String.valueOf(line);
			}
			java.lang.String lineValue = lastLineString;
			out.append(lineValue);
			out.append(",");
			out.append(java.lang.String.valueOf(m.originalPosition.getCharacterIndex()));
			if ((m.originalName) != null) {
				out.append(",");
				out.append(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.escapeString(m.originalName));
			}
			out.append("],\n");
		}

		void appendMappings(java.lang.Appendable out) throws java.io.IOException {
			for (com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m : mappings) {
				if (m.used) {
					appendMappingTo(m, out);
				}
			}
		}
	}

	private class LineMapper implements com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.MappingVisitor {
		private final java.lang.Appendable out;

		private int lastId = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.UNMAPPED;

		LineMapper(java.lang.Appendable out) {
			this.out = out;
		}

		public void visit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m, int line, int col, int nextLine, int nextCol) throws java.io.IOException {
			int id = m != null ? m.id : com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.UNMAPPED;
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
			new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.MappingTraversal().traverse(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapper.this);
			closeLine(true);
		}

		private void openLine() throws java.io.IOException {
			out.append("\"");
			com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapper.this.lastId = 0;
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
			com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapEncoder.encodeEntry(sb, id, lastId, reps);
			if (validate) {
				com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.LineEntry entry = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.decodeLineEntry(sb.toString(), lastId);
				com.google.common.base.Preconditions.checkState((((entry.id) == id) && ((entry.reps) == reps)), "expected (%s,%s) but got (%s,%s)", id, reps, entry.id, entry.reps);
			}
			out.append(sb);
			lastId = id;
		}
	}

	@com.google.common.annotations.VisibleForTesting
	static class LineMapEncoder {
		static void encodeEntry(java.lang.Appendable out, int id, int lastId, int reps) throws java.io.IOException {
			com.google.common.base.Preconditions.checkState((reps > 0));
			int relativeIdLength = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapEncoder.getRelativeMappingIdLength(id, lastId);
			int relativeId = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapEncoder.getRelativeMappingId(id, relativeIdLength, lastId);
			java.lang.String relativeIdString = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapEncoder.valueToBase64(relativeId, relativeIdLength);
			if ((reps > 16) || (relativeIdLength > 4)) {
				java.lang.String repsString = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapEncoder.valueToBase64((reps - 1), 1);
				for (int i = 0; i < (repsString.length()); i++) {
					out.append('!');
				}
				java.lang.String sizeId = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapEncoder.valueToBase64(((relativeIdString.length()) - 1), 1);
				out.append(sizeId);
				out.append(repsString);
			}else {
				int prefix = ((reps - 1) << 2) + ((relativeIdString.length()) - 1);
				com.google.common.base.Preconditions.checkState(((prefix < 64) && (prefix >= 0)), "prefix (%s) reps(%s) map id size(%s)", prefix, reps, relativeIdString.length());
				out.append(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapEncoder.valueToBase64(prefix, 1));
			}
			out.append(relativeIdString);
		}

		static int getRelativeMappingId(int id, int idLength, int lastId) {
			int base = 1 << (idLength * 6);
			int relativeId = id - lastId;
			return relativeId < 0 ? relativeId + base : relativeId;
		}

		static int getRelativeMappingIdLength(int rawId, int lastId) {
			com.google.common.base.Preconditions.checkState(((rawId >= 0) || (rawId == (com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.UNMAPPED))));
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
				chars[(size++)] = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.BASE64_MAP.charAt(charValue);
			} while (value > 0 );
			java.lang.StringBuilder sb = new java.lang.StringBuilder(size);
			while (minimumSize > size) {
				sb.append(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.BASE64_MAP.charAt(0));
				minimumSize--;
			} 
			while (size > 0) {
				sb.append(chars[(--size)]);
			} 
			return sb.toString();
		}
	}

	@com.google.common.annotations.VisibleForTesting
	static class LineMapDecoder {
		private static com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.LineEntry decodeLineEntry(java.lang.String in, int lastId) {
			return com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.decodeLineEntry(new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.StringParser(in), lastId);
		}

		private static com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.LineEntry decodeLineEntry(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.StringParser reader, int lastId) {
			int repDigits = 0;
			for (char peek = reader.peek(); peek == '!'; peek = reader.peek()) {
				repDigits++;
				reader.next();
			}
			int idDigits = 0;
			int reps = 0;
			if (repDigits == 0) {
				char digit = reader.next();
				int value = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.addBase64Digit(digit, 0);
				reps = value >> 2;
				idDigits = value & 3;
			}else {
				char digit = reader.next();
				idDigits = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.addBase64Digit(digit, 0);
				int value = 0;
				for (int i = 0; i < repDigits; i++) {
					digit = reader.next();
					value = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.addBase64Digit(digit, value);
				}
				reps = value;
			}
			reps += 1;
			idDigits += 1;
			int value = 0;
			for (int i = 0; i < idDigits; i++) {
				char digit = reader.next();
				value = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.addBase64Digit(digit, value);
			}
			int mappingId = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.getIdFromRelativeId(value, idDigits, lastId);
			return new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.LineEntry(mappingId, reps);
		}

		static java.util.List<java.lang.Integer> decodeLine(java.lang.String lineSource) {
			return com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.decodeLine(new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.StringParser(lineSource));
		}

		private static java.util.List<java.lang.Integer> decodeLine(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.StringParser reader) {
			java.util.List<java.lang.Integer> result = com.google.common.collect.Lists.newArrayListWithCapacity(512);
			int lastId = 0;
			do {
				com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.LineEntry entry = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.LineMapDecoder.decodeLineEntry(reader, lastId);
				lastId = entry.id;
				for (int i = 0; i < (entry.reps); i++) {
					result.add(entry.id);
				}
			} while (reader.hasNext() );
			return result;
		}

		private static int addBase64Digit(char digit, int previousValue) {
			return (previousValue * 64) + (com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.BASE64_MAP.indexOf(digit));
		}

		static int getIdFromRelativeId(int rawId, int digits, int lastId) {
			int base = 1 << (digits * 6);
			return (rawId >= (base / 2) ? rawId - base : rawId) + lastId;
		}

		static class LineEntry {
			final int id;

			final int reps;

			public LineEntry(int id, int reps) {
				this.id = id;
				this.reps = reps;
			}
		}

		static class StringParser {
			final java.lang.String content;

			int current = 0;

			StringParser(java.lang.String content) {
				this.content = content;
			}

			char next() {
				return content.charAt(((current)++));
			}

			char peek() {
				return content.charAt(current);
			}

			boolean hasNext() {
				return (current) < ((content.length()) - 1);
			}
		}
	}

	private class UsedMappingCheck implements com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.MappingVisitor {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m, int line, int col, int nextLine, int nextCol) throws java.io.IOException {
			if (m != null) {
				m.used = true;
			}
		}
	}

	private interface MappingVisitor {
		void visit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m, int line, int col, int endLine, int endCol) throws java.io.IOException;
	}

	private class MappingTraversal {
		private int line;

		private int col;

		MappingTraversal() {
		}

		void traverse(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.MappingVisitor v) throws java.io.IOException {
			java.util.Deque<com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping> stack = new java.util.ArrayDeque<com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping>();
			for (com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m : mappings) {
				while ((!(stack.isEmpty())) && (!(isOverlapped(stack.peek(), m)))) {
					com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping previous = stack.pop();
					maybeVisit(v, previous);
				} 
				com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping parent = stack.peek();
				maybeVisitParent(v, parent, m);
				stack.push(m);
			}
			while (!(stack.isEmpty())) {
				com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m = stack.pop();
				maybeVisit(v, m);
			} 
		}

		private int getAdjustedLine(com.google.javascript.jscomp.sourcemap.Position p) {
			return (p.getLineNumber()) + (prefixPosition.getLineNumber());
		}

		private int getAdjustedCol(com.google.javascript.jscomp.sourcemap.Position p) {
			int rawLine = p.getLineNumber();
			int rawCol = p.getCharacterIndex();
			return rawLine != 0 ? rawCol : rawCol + (prefixPosition.getCharacterIndex());
		}

		private boolean isOverlapped(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m1, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m2) {
			int l1 = m1.endPosition.getLineNumber();
			int l2 = m2.startPosition.getLineNumber();
			int c1 = m1.endPosition.getCharacterIndex();
			int c2 = m2.startPosition.getCharacterIndex();
			return ((l1 == l2) && (c1 >= c2)) || (l1 > l2);
		}

		private void maybeVisit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.MappingVisitor v, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m) throws java.io.IOException {
			int nextLine = getAdjustedLine(m.endPosition);
			int nextCol = getAdjustedCol(m.endPosition);
			if (((line) < nextLine) || (((line) == nextLine) && ((col) < nextCol))) {
				visit(v, m, nextLine, nextCol);
			}
		}

		private void maybeVisitParent(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.MappingVisitor v, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping parent, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m) throws java.io.IOException {
			int nextLine = getAdjustedLine(m.startPosition);
			int nextCol = getAdjustedCol(m.startPosition);
			com.google.common.base.Preconditions.checkState((((line) < nextLine) || ((col) <= nextCol)));
			if (((line) < nextLine) || (((line) == nextLine) && ((col) < nextCol))) {
				visit(v, parent, nextLine, nextCol);
			}
		}

		private void visit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.MappingVisitor v, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV2.Mapping m, int nextLine, int nextCol) throws java.io.IOException {
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
}

