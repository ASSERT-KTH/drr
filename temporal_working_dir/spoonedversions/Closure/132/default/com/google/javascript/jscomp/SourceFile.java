

package com.google.javascript.jscomp;


public class SourceFile implements com.google.javascript.rhino.jstype.StaticSourceFile , java.io.Serializable {
	private static final long serialVersionUID = 1L;

	public interface Generator {
		public java.lang.String getCode();
	}

	private static final int SOURCE_EXCERPT_REGION_LENGTH = 5;

	private final java.lang.String fileName;

	private boolean isExternFile = false;

	private java.lang.String originalPath = null;

	private int[] lineOffsets = null;

	private java.lang.String code = null;

	public SourceFile(java.lang.String fileName) {
		if ((fileName == null) || (fileName.isEmpty())) {
			throw new java.lang.IllegalArgumentException("a source must have a name");
		}
		this.fileName = fileName;
	}

	@java.lang.Override
	public int getLineOffset(int lineno) {
		findLineOffsets();
		if ((lineno < 1) || (lineno > (lineOffsets.length))) {
			throw new java.lang.IllegalArgumentException(((("Expected line number between 1 and " + (lineOffsets.length)) + "\nActual: ") + lineno));
		}
		return lineOffsets[(lineno - 1)];
	}

	int getNumLines() {
		findLineOffsets();
		return lineOffsets.length;
	}

	private void findLineOffsets() {
		if ((lineOffsets) != null) {
			return ;
		}
		try {
			java.lang.String[] sourceLines = getCode().split("\n");
			lineOffsets = new int[sourceLines.length];
			for (int ii = 1; ii < (sourceLines.length); ++ii) {
				lineOffsets[ii] = ((lineOffsets[(ii - 1)]) + (sourceLines[(ii - 1)].length())) + 1;
			}
		} catch (java.io.IOException e) {
			lineOffsets = new int[1];
			lineOffsets[0] = 0;
		}
	}

	public java.lang.String getCode() throws java.io.IOException {
		return code;
	}

	public java.io.Reader getCodeReader() throws java.io.IOException {
		return new java.io.StringReader(getCode());
	}

	@com.google.common.annotations.VisibleForTesting
	java.lang.String getCodeNoCache() {
		return code;
	}

	private void setCode(java.lang.String sourceCode) {
		code = sourceCode;
	}

	public java.lang.String getOriginalPath() {
		return (originalPath) != null ? originalPath : fileName;
	}

	public void setOriginalPath(java.lang.String originalPath) {
		com.google.javascript.jscomp.SourceFile.this.originalPath = originalPath;
	}

	public void clearCachedSource() {
	}

	boolean hasSourceInMemory() {
		return (code) != null;
	}

	@java.lang.Override
	public java.lang.String getName() {
		return fileName;
	}

	@java.lang.Override
	public boolean isExtern() {
		return isExternFile;
	}

	void setIsExtern(boolean newVal) {
		isExternFile = newVal;
	}

	@java.lang.Override
	public int getLineOfOffset(int offset) {
		findLineOffsets();
		int search = java.util.Arrays.binarySearch(lineOffsets, offset);
		if (search >= 0) {
			return search + 1;
		}else {
			int insertionPoint = (-1) * (search + 1);
			return (java.lang.Math.min((insertionPoint - 1), ((lineOffsets.length) - 1))) + 1;
		}
	}

	@java.lang.Override
	public int getColumnOfOffset(int offset) {
		int line = getLineOfOffset(offset);
		return offset - (lineOffsets[(line - 1)]);
	}

	public java.lang.String getLine(int lineNumber) {
		findLineOffsets();
		if (lineNumber > (lineOffsets.length)) {
			return null;
		}
		if (lineNumber < 1) {
			lineNumber = 1;
		}
		int pos = lineOffsets[(lineNumber - 1)];
		java.lang.String js = "";
		try {
			js = getCode();
		} catch (java.io.IOException e) {
			return null;
		}
		if ((js.indexOf('\n', pos)) == (-1)) {
			if (pos >= (js.length())) {
				return null;
			}else {
				return js.substring(pos, js.length());
			}
		}else {
			return js.substring(pos, js.indexOf('\n', pos));
		}
	}

	public com.google.javascript.jscomp.Region getRegion(int lineNumber) {
		java.lang.String js = "";
		try {
			js = getCode();
		} catch (java.io.IOException e) {
			return null;
		}
		int pos = 0;
		int startLine = java.lang.Math.max(1, ((lineNumber - (((com.google.javascript.jscomp.SourceFile.SOURCE_EXCERPT_REGION_LENGTH) + 1) / 2)) + 1));
		for (int n = 1; n < startLine; n++) {
			int nextpos = js.indexOf('\n', pos);
			if (nextpos == (-1)) {
				break;
			}
			pos = nextpos + 1;
		}
		int end = pos;
		int endLine = startLine;
		for (int n = 0; n < (com.google.javascript.jscomp.SourceFile.SOURCE_EXCERPT_REGION_LENGTH); n++ , endLine++) {
			end = js.indexOf('\n', end);
			if (end == (-1)) {
				break;
			}
			end++;
		}
		if (lineNumber >= endLine) {
			return null;
		}
		if (end == (-1)) {
			int last = (js.length()) - 1;
			if ((js.charAt(last)) == '\n') {
				return new com.google.javascript.jscomp.SimpleRegion(startLine, endLine, js.substring(pos, last));
			}else {
				return new com.google.javascript.jscomp.SimpleRegion(startLine, endLine, js.substring(pos));
			}
		}else {
			return new com.google.javascript.jscomp.SimpleRegion(startLine, endLine, js.substring(pos, end));
		}
	}

	@java.lang.Override
	public java.lang.String toString() {
		return fileName;
	}

	public static com.google.javascript.jscomp.SourceFile fromFile(java.lang.String fileName, java.nio.charset.Charset c) {
		return com.google.javascript.jscomp.SourceFile.builder().withCharset(c).buildFromFile(fileName);
	}

	public static com.google.javascript.jscomp.SourceFile fromFile(java.lang.String fileName) {
		return com.google.javascript.jscomp.SourceFile.builder().buildFromFile(fileName);
	}

	public static com.google.javascript.jscomp.SourceFile fromFile(java.io.File file, java.nio.charset.Charset c) {
		return com.google.javascript.jscomp.SourceFile.builder().withCharset(c).buildFromFile(file);
	}

	public static com.google.javascript.jscomp.SourceFile fromFile(java.io.File file) {
		return com.google.javascript.jscomp.SourceFile.builder().buildFromFile(file);
	}

	public static com.google.javascript.jscomp.SourceFile fromCode(java.lang.String fileName, java.lang.String code) {
		return com.google.javascript.jscomp.SourceFile.builder().buildFromCode(fileName, code);
	}

	public static com.google.javascript.jscomp.SourceFile fromCode(java.lang.String fileName, java.lang.String originalPath, java.lang.String code) {
		return com.google.javascript.jscomp.SourceFile.builder().withOriginalPath(originalPath).buildFromCode(fileName, code);
	}

	public static com.google.javascript.jscomp.SourceFile fromInputStream(java.lang.String fileName, java.io.InputStream s) throws java.io.IOException {
		return com.google.javascript.jscomp.SourceFile.builder().buildFromInputStream(fileName, s);
	}

	public static com.google.javascript.jscomp.SourceFile fromInputStream(java.lang.String fileName, java.lang.String originalPath, java.io.InputStream s) throws java.io.IOException {
		return com.google.javascript.jscomp.SourceFile.builder().withOriginalPath(originalPath).buildFromInputStream(fileName, s);
	}

	public static com.google.javascript.jscomp.SourceFile fromReader(java.lang.String fileName, java.io.Reader r) throws java.io.IOException {
		return com.google.javascript.jscomp.SourceFile.builder().buildFromReader(fileName, r);
	}

	public static com.google.javascript.jscomp.SourceFile fromGenerator(java.lang.String fileName, com.google.javascript.jscomp.SourceFile.Generator generator) {
		return com.google.javascript.jscomp.SourceFile.builder().buildFromGenerator(fileName, generator);
	}

	public static com.google.javascript.jscomp.SourceFile.Builder builder() {
		return new com.google.javascript.jscomp.SourceFile.Builder();
	}

	public static class Builder {
		private java.nio.charset.Charset charset = com.google.common.base.Charsets.UTF_8;

		private java.lang.String originalPath = null;

		public Builder() {
		}

		public com.google.javascript.jscomp.SourceFile.Builder withCharset(java.nio.charset.Charset charset) {
			com.google.javascript.jscomp.SourceFile.Builder.this.charset = charset;
			return com.google.javascript.jscomp.SourceFile.Builder.this;
		}

		public com.google.javascript.jscomp.SourceFile.Builder withOriginalPath(java.lang.String originalPath) {
			com.google.javascript.jscomp.SourceFile.Builder.this.originalPath = originalPath;
			return com.google.javascript.jscomp.SourceFile.Builder.this;
		}

		public com.google.javascript.jscomp.SourceFile buildFromFile(java.lang.String fileName) {
			return buildFromFile(new java.io.File(fileName));
		}

		public com.google.javascript.jscomp.SourceFile buildFromFile(java.io.File file) {
			return new com.google.javascript.jscomp.SourceFile.OnDisk(file, originalPath, charset);
		}

		public com.google.javascript.jscomp.SourceFile buildFromCode(java.lang.String fileName, java.lang.String code) {
			return new com.google.javascript.jscomp.SourceFile.Preloaded(fileName, originalPath, code);
		}

		public com.google.javascript.jscomp.SourceFile buildFromInputStream(java.lang.String fileName, java.io.InputStream s) throws java.io.IOException {
			return buildFromCode(fileName, com.google.common.io.CharStreams.toString(new java.io.InputStreamReader(s, charset)));
		}

		public com.google.javascript.jscomp.SourceFile buildFromReader(java.lang.String fileName, java.io.Reader r) throws java.io.IOException {
			return buildFromCode(fileName, com.google.common.io.CharStreams.toString(r));
		}

		public com.google.javascript.jscomp.SourceFile buildFromGenerator(java.lang.String fileName, com.google.javascript.jscomp.SourceFile.Generator generator) {
			return new com.google.javascript.jscomp.SourceFile.Generated(fileName, originalPath, generator);
		}
	}

	static class Preloaded extends com.google.javascript.jscomp.SourceFile {
		private static final long serialVersionUID = 1L;

		Preloaded(java.lang.String fileName, java.lang.String originalPath, java.lang.String code) {
			super(fileName);
			super.setOriginalPath(originalPath);
			super.setCode(code);
		}
	}

	static class Generated extends com.google.javascript.jscomp.SourceFile {
		private static final long serialVersionUID = 1L;

		private final com.google.javascript.jscomp.SourceFile.Generator generator;

		Generated(java.lang.String fileName, java.lang.String originalPath, com.google.javascript.jscomp.SourceFile.Generator generator) {
			super(fileName);
			super.setOriginalPath(originalPath);
			this.generator = generator;
		}

		@java.lang.Override
		public synchronized java.lang.String getCode() throws java.io.IOException {
			java.lang.String cachedCode = super.getCode();
			if (cachedCode == null) {
				cachedCode = generator.getCode();
				super.setCode(cachedCode);
			}
			return cachedCode;
		}

		@java.lang.Override
		public void clearCachedSource() {
			super.setCode(null);
		}
	}

	static class OnDisk extends com.google.javascript.jscomp.SourceFile {
		private static final long serialVersionUID = 1L;

		private final java.io.File file;

		private java.lang.String inputCharset = com.google.common.base.Charsets.UTF_8.name();

		OnDisk(java.io.File file, java.lang.String originalPath, java.nio.charset.Charset c) {
			super(file.getPath());
			this.file = file;
			super.setOriginalPath(originalPath);
			if (c != null) {
				com.google.javascript.jscomp.SourceFile.OnDisk.this.setCharset(c);
			}
		}

		@java.lang.Override
		public synchronized java.lang.String getCode() throws java.io.IOException {
			java.lang.String cachedCode = super.getCode();
			if (cachedCode == null) {
				cachedCode = com.google.common.io.Files.toString(file, com.google.javascript.jscomp.SourceFile.OnDisk.this.getCharset());
				super.setCode(cachedCode);
			}
			return cachedCode;
		}

		@java.lang.Override
		public java.io.Reader getCodeReader() throws java.io.IOException {
			if (hasSourceInMemory()) {
				return super.getCodeReader();
			}else {
				return new java.io.FileReader(file);
			}
		}

		@java.lang.Override
		public void clearCachedSource() {
			super.setCode(null);
		}

		public void setCharset(java.nio.charset.Charset c) {
			inputCharset = c.name();
		}

		public java.nio.charset.Charset getCharset() {
			return java.nio.charset.Charset.forName(inputCharset);
		}
	}
}

