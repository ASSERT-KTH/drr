

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

	private int lastOffset;

	private int lastLine;

	private java.lang.String code = null;

	public SourceFile(java.lang.String fileName) {
		if ((fileName == null) || (fileName.isEmpty())) {
			throw new java.lang.IllegalArgumentException("a source must have a name");
		}
		this.fileName = fileName;
		com.google.javascript.jscomp.SourceFile.this.lastOffset = 0;
		com.google.javascript.jscomp.SourceFile.this.lastLine = 1;
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

	public java.lang.String getLine(int lineNumber) {
		java.lang.String js = "";
		try {
			js = getCode();
		} catch (java.io.IOException e) {
			return null;
		}
		int pos = 0;
		int startLine = 1;
		if (lineNumber >= (lastLine)) {
			pos = lastOffset;
			startLine = lastLine;
		}
		for (int n = startLine; n < lineNumber; n++) {
			int nextpos = js.indexOf('\n', pos);
			if (nextpos == (-1)) {
				return null;
			}
			pos = nextpos + 1;
		}
		lastOffset = pos;
		lastLine = lineNumber;
		return (js.indexOf('\n', pos)) == (-1) ? null : js.substring(pos, js.indexOf('\n', pos));
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
		return com.google.javascript.jscomp.SourceFile.fromFile(new java.io.File(fileName), c);
	}

	public static com.google.javascript.jscomp.SourceFile fromFile(java.lang.String fileName) {
		return com.google.javascript.jscomp.SourceFile.fromFile(new java.io.File(fileName));
	}

	public static com.google.javascript.jscomp.SourceFile fromFile(java.io.File file, java.nio.charset.Charset c) {
		return new com.google.javascript.jscomp.SourceFile.OnDisk(file, c);
	}

	public static com.google.javascript.jscomp.SourceFile fromFile(java.io.File file) {
		return new com.google.javascript.jscomp.SourceFile.OnDisk(file);
	}

	public static com.google.javascript.jscomp.SourceFile fromCode(java.lang.String fileName, java.lang.String code) {
		return new com.google.javascript.jscomp.SourceFile.Preloaded(fileName, code);
	}

	public static com.google.javascript.jscomp.SourceFile fromCode(java.lang.String fileName, java.lang.String originalPath, java.lang.String code) {
		return new com.google.javascript.jscomp.SourceFile.Preloaded(fileName, originalPath, code);
	}

	public static com.google.javascript.jscomp.SourceFile fromInputStream(java.lang.String fileName, java.io.InputStream s) throws java.io.IOException {
		return com.google.javascript.jscomp.SourceFile.fromCode(fileName, com.google.common.io.CharStreams.toString(new java.io.InputStreamReader(s, com.google.common.base.Charsets.UTF_8)));
	}

	public static com.google.javascript.jscomp.SourceFile fromInputStream(java.lang.String fileName, java.lang.String originalPath, java.io.InputStream s) throws java.io.IOException {
		return com.google.javascript.jscomp.SourceFile.fromCode(fileName, originalPath, com.google.common.io.CharStreams.toString(new java.io.InputStreamReader(s, com.google.common.base.Charsets.UTF_8)));
	}

	public static com.google.javascript.jscomp.SourceFile fromReader(java.lang.String fileName, java.io.Reader r) throws java.io.IOException {
		return com.google.javascript.jscomp.SourceFile.fromCode(fileName, com.google.common.io.CharStreams.toString(r));
	}

	public static com.google.javascript.jscomp.SourceFile fromGenerator(java.lang.String fileName, com.google.javascript.jscomp.SourceFile.Generator generator) {
		return new com.google.javascript.jscomp.SourceFile.Generated(fileName, generator);
	}

	static class Preloaded extends com.google.javascript.jscomp.SourceFile {
		private static final long serialVersionUID = 1L;

		Preloaded(java.lang.String fileName, java.lang.String code) {
			this(fileName, fileName, code);
		}

		Preloaded(java.lang.String fileName, java.lang.String originalPath, java.lang.String code) {
			super(fileName);
			super.setOriginalPath(originalPath);
			super.setCode(code);
		}
	}

	static class Generated extends com.google.javascript.jscomp.SourceFile {
		private static final long serialVersionUID = 1L;

		private final com.google.javascript.jscomp.SourceFile.Generator generator;

		Generated(java.lang.String fileName, com.google.javascript.jscomp.SourceFile.Generator generator) {
			super(fileName);
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

		protected java.lang.String inputCharset = com.google.common.base.Charsets.UTF_8.name();

		OnDisk(java.io.File file, java.nio.charset.Charset c) {
			this(file);
			if (c != null) {
				com.google.javascript.jscomp.SourceFile.OnDisk.this.setCharset(c);
			}
		}

		OnDisk(java.io.File file) {
			super(file.getPath());
			this.file = file;
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

