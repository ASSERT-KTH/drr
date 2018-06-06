

package com.google.javascript.jscomp;


public class VariableMap {
	private final java.util.Map<java.lang.String, java.lang.String> map;

	private java.util.Map<java.lang.String, java.lang.String> reverseMap = null;

	private static final char SEPARATOR = ':';

	VariableMap(java.util.Map<java.lang.String, java.lang.String> map) {
		this.map = java.util.Collections.unmodifiableMap(map);
	}

	public java.lang.String lookupNewName(java.lang.String sourceName) {
		return map.get(sourceName);
	}

	public java.lang.String lookupSourceName(java.lang.String newName) {
		if ((reverseMap) == null) {
			initReverseMap();
		}
		return reverseMap.get(newName);
	}

	private synchronized void initReverseMap() {
		if ((reverseMap) == null) {
			java.util.Map<java.lang.String, java.lang.String> rm = new java.util.HashMap<java.lang.String, java.lang.String>();
			for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
				rm.put(entry.getValue(), entry.getKey());
			}
			reverseMap = java.util.Collections.unmodifiableMap(rm);
		}
	}

	public java.util.Map<java.lang.String, java.lang.String> getOriginalNameToNewNameMap() {
		return map;
	}

	public java.util.Map<java.lang.String, java.lang.String> getNewNameToOriginalNameMap() {
		if ((reverseMap) == null) {
			initReverseMap();
		}
		return reverseMap;
	}

	public void save(java.lang.String filename) throws java.io.IOException {
		com.google.common.io.Files.write(toBytes(), new java.io.File(filename));
	}

	public static com.google.javascript.jscomp.VariableMap load(java.lang.String filename) throws java.io.IOException {
		try {
			return com.google.javascript.jscomp.VariableMap.fromBytes(com.google.common.io.Files.toByteArray(new java.io.File(filename)));
		} catch (java.text.ParseException e) {
			throw new java.io.IOException(e);
		}
	}

	public byte[] toBytes() {
		java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
		java.io.Writer writer = new java.io.OutputStreamWriter(baos, com.google.common.base.Charsets.UTF_8);
		try {
			for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
				writer.write(com.google.javascript.jscomp.VariableMap.escape(entry.getKey()));
				writer.write(com.google.javascript.jscomp.VariableMap.SEPARATOR);
				writer.write(com.google.javascript.jscomp.VariableMap.escape(entry.getValue()));
				writer.write('\n');
			}
			writer.close();
		} catch (java.io.IOException e) {
			throw new java.lang.RuntimeException(e);
		}
		return baos.toByteArray();
	}

	public static com.google.javascript.jscomp.VariableMap fromBytes(byte[] bytes) throws java.text.ParseException {
		java.lang.Iterable<java.lang.String> lines;
		try {
			lines = com.google.common.io.CharStreams.readLines(com.google.common.io.CharStreams.newReaderSupplier(com.google.common.io.ByteStreams.newInputStreamSupplier(bytes), com.google.common.base.Charsets.UTF_8));
		} catch (java.io.IOException e) {
			throw new java.lang.RuntimeException(e);
		}
		java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String line : lines) {
			int pos = com.google.javascript.jscomp.VariableMap.findIndexOfChar(line, com.google.javascript.jscomp.VariableMap.SEPARATOR);
			if ((pos <= 0) || (pos == ((line.length()) - 1))) {
				throw new java.text.ParseException(("Bad line: " + line), 0);
			}
			map.put(com.google.javascript.jscomp.VariableMap.unescape(line.substring(0, pos)), com.google.javascript.jscomp.VariableMap.unescape(line.substring((pos + 1))));
		}
		return new com.google.javascript.jscomp.VariableMap(map);
	}

	private static java.lang.String escape(java.lang.String value) {
		return value.replace("\\", "\\\\").replace(":", "\\:").replace("\n", "\\n");
	}

	private static int findIndexOfChar(java.lang.String value, char stopChar) {
		int len = value.length();
		for (int i = 0; i < len; i++) {
			char c = value.charAt(i);
			if ((c == '\\') && ((++i) < len)) {
				c = value.charAt(i);
			}else
				if (c == stopChar) {
					return i;
				}
			
		}
		return -1;
	}

	private static java.lang.String unescape(java.lang.CharSequence value) {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		int len = value.length();
		for (int i = 0; i < len; i++) {
			char c = value.charAt(i);
			if ((c == '\\') && ((++i) < len)) {
				c = value.charAt(i);
			}
			sb.append(c);
		}
		return sb.toString();
	}

	public static com.google.javascript.jscomp.VariableMap fromMap(java.util.Map<java.lang.String, java.lang.String> map) {
		return new com.google.javascript.jscomp.VariableMap(com.google.common.collect.Maps.newHashMap(map));
	}

	@com.google.common.annotations.VisibleForTesting
	java.util.Map<java.lang.String, java.lang.String> toMap() {
		return map;
	}
}

