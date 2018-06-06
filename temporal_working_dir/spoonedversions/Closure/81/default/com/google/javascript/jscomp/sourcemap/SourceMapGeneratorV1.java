

package com.google.javascript.jscomp.sourcemap;


public class SourceMapGeneratorV1 implements com.google.javascript.jscomp.sourcemap.SourceMapGenerator {
	private static final int UNMAPPED = -1;

	static class Mapping {
		int id = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.UNMAPPED;

		java.lang.String sourceFile;

		com.google.javascript.jscomp.sourcemap.Position originalPosition;

		com.google.javascript.jscomp.sourcemap.Position startPosition;

		com.google.javascript.jscomp.sourcemap.Position endPosition;

		java.lang.String originalName;

		boolean used = false;
	}

	private class MappingWriter {
		private java.lang.String lastSourceFile = null;

		private java.lang.String lastSourceFileEscaped = null;

		private int lastLine = 0;

		private java.lang.String lastLineString = java.lang.String.valueOf(0);

		private void appendMappingTo(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m, java.lang.Appendable out) throws java.io.IOException {
			out.append("[");
			java.lang.String sourceFile = m.sourceFile;
			java.lang.String escapedSourceFile;
			if ((lastSourceFile) != sourceFile) {
				lastSourceFile = sourceFile;
				lastSourceFileEscaped = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.escapeString(sourceFile);
			}
			escapedSourceFile = lastSourceFileEscaped;
			out.append(escapedSourceFile);
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
				out.append(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.escapeString(m.originalName));
			}
			out.append("]\n");
		}

		void appendMappings(java.lang.Appendable out) throws java.io.IOException {
			for (com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m : mappings) {
				if (m.used) {
					appendMappingTo(m, out);
				}
			}
		}
	}

	private java.util.List<com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping> mappings = com.google.common.collect.Lists.newArrayList();

	private com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping lastMapping;

	private com.google.javascript.jscomp.sourcemap.Position offsetPosition = new com.google.javascript.jscomp.sourcemap.Position(0, 0);

	private com.google.javascript.jscomp.sourcemap.Position prefixPosition = new com.google.javascript.jscomp.sourcemap.Position(0, 0);

	private static java.lang.String escapeString(java.lang.String value) {
		return com.google.javascript.jscomp.sourcemap.Util.escapeString(value);
	}

	public void addMapping(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.sourcemap.Position startPosition, com.google.javascript.jscomp.sourcemap.Position endPosition) {
		java.lang.String sourceFile = ((java.lang.String) (node.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP)));
		if ((sourceFile == null) || ((node.getLineno()) < 0)) {
			return ;
		}
		com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping mapping = new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping();
		mapping.sourceFile = sourceFile;
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

	public void reset() {
		mappings = com.google.common.collect.Lists.newArrayList();
		lastMapping = null;
		offsetPosition = new com.google.javascript.jscomp.sourcemap.Position(0, 0);
		prefixPosition = new com.google.javascript.jscomp.sourcemap.Position(0, 0);
	}

	public void appendTo(java.lang.Appendable out, java.lang.String name) throws java.io.IOException {
		int maxLine = prepMappings();
		out.append("/** Begin line maps. **/{ \"file\" : ");
		out.append(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.escapeString(name));
		out.append(", \"count\": ");
		out.append(java.lang.String.valueOf((maxLine + 1)));
		out.append(" }\n");
		new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.LineMapper(out).appendLineMappings();
		out.append("/** Begin file information. **/\n");
		for (int i = 0; i <= maxLine; ++i) {
			out.append("[]\n");
		}
		out.append("/** Begin mapping definitions. **/\n");
		new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.MappingWriter().appendMappings(out);
	}

	private int prepMappings() throws java.io.IOException {
		new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.MappingTraversal().traverse(new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.UsedMappingCheck());
		int id = 0;
		int maxLine = 0;
		for (com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m : mappings) {
			if (m.used) {
				m.id = id++;
				int endPositionLine = m.endPosition.getLineNumber();
				maxLine = java.lang.Math.max(maxLine, endPositionLine);
			}
		}
		return maxLine + (prefixPosition.getLineNumber());
	}

	private class LineMapper implements com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.MappingVisitor {
		private final java.lang.Appendable out;

		private boolean firstChar = true;

		private static final java.lang.String UNMAPPED_STRING = "-1";

		private int lastId = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.UNMAPPED;

		private java.lang.String lastIdString = com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.LineMapper.UNMAPPED_STRING;

		LineMapper(java.lang.Appendable out) {
			this.out = out;
		}

		public void visit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m, int line, int col, int nextLine, int nextCol) throws java.io.IOException {
			int id = m != null ? m.id : com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.UNMAPPED;
			if ((lastId) != id) {
				lastIdString = (id == (com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.UNMAPPED)) ? com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.LineMapper.UNMAPPED_STRING : java.lang.String.valueOf(id);
				lastId = id;
			}
			java.lang.String idString = lastIdString;
			for (int i = line; i <= nextLine; i++) {
				if (i == nextLine) {
					for (int j = col; j < nextCol; j++) {
						addCharEntry(idString);
					}
					break;
				}
				closeLine();
				openLine();
				col = 0;
			}
		}

		void appendLineMappings() throws java.io.IOException {
			openLine();
			new com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.MappingTraversal().traverse(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.LineMapper.this);
			closeLine();
		}

		private void openLine() throws java.io.IOException {
			if ((out) != null) {
				out.append("[");
				com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.LineMapper.this.firstChar = true;
			}
		}

		private void closeLine() throws java.io.IOException {
			if ((out) != null) {
				out.append("]\n");
			}
		}

		private void addCharEntry(java.lang.String id) throws java.io.IOException {
			if ((out) != null) {
				if (firstChar) {
					firstChar = false;
				}else {
					out.append(",");
				}
				out.append(id);
			}
		}
	}

	private class UsedMappingCheck implements com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.MappingVisitor {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m, int line, int col, int nextLine, int nextCol) throws java.io.IOException {
			if (m != null) {
				m.used = true;
			}
		}
	}

	private interface MappingVisitor {
		void visit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m, int line, int col, int endLine, int endCol) throws java.io.IOException;
	}

	private class MappingTraversal {
		private int line;

		private int col;

		MappingTraversal() {
		}

		void traverse(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.MappingVisitor v) throws java.io.IOException {
			java.util.Deque<com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping> stack = new java.util.ArrayDeque<com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping>();
			for (com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m : mappings) {
				while ((!(stack.isEmpty())) && (!(isOverlapped(stack.peek(), m)))) {
					com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping previous = stack.pop();
					maybeVisit(v, previous);
				} 
				com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping parent = stack.peek();
				maybeVisitParent(v, parent, m);
				stack.push(m);
			}
			while (!(stack.isEmpty())) {
				com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m = stack.pop();
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

		private boolean isOverlapped(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m1, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m2) {
			int l1 = m1.endPosition.getLineNumber();
			int l2 = m2.startPosition.getLineNumber();
			int c1 = m1.endPosition.getCharacterIndex();
			int c2 = m2.startPosition.getCharacterIndex();
			return ((l1 == l2) && (c1 >= c2)) || (l1 > l2);
		}

		private void maybeVisit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.MappingVisitor v, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m) throws java.io.IOException {
			int nextLine = getAdjustedLine(m.endPosition);
			int nextCol = getAdjustedCol(m.endPosition);
			if (((line) < nextLine) || (((line) == nextLine) && ((col) < nextCol))) {
				visit(v, m, nextLine, nextCol);
			}
		}

		private void maybeVisitParent(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.MappingVisitor v, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping parent, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m) throws java.io.IOException {
			int nextLine = getAdjustedLine(m.startPosition);
			int nextCol = getAdjustedCol(m.startPosition);
			com.google.common.base.Preconditions.checkState((((line) < nextLine) || ((col) <= nextCol)));
			if (((line) < nextLine) || (((line) == nextLine) && ((col) < nextCol))) {
				visit(v, parent, nextLine, nextCol);
			}
		}

		private void visit(com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.MappingVisitor v, com.google.javascript.jscomp.sourcemap.SourceMapGeneratorV1.Mapping m, int nextLine, int nextCol) throws java.io.IOException {
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
	public void validate(boolean validate) {
	}
}

