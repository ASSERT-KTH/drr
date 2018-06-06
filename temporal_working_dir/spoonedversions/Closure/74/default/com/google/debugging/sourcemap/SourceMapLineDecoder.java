

package com.google.debugging.sourcemap;


class SourceMapLineDecoder {
	private static final java.lang.String BASE64_MAP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + ("abcdefghijklmnopqrstuvwzyz" + "0123456789+/");

	static java.util.List<java.lang.Integer> decodeLine(java.lang.String lineSource) {
		return com.google.debugging.sourcemap.SourceMapLineDecoder.decodeLine(new com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser(lineSource));
	}

	private SourceMapLineDecoder() {
	}

	private static com.google.debugging.sourcemap.SourceMapLineDecoder.LineEntry decodeLineEntry(java.lang.String in, int lastId) {
		return com.google.debugging.sourcemap.SourceMapLineDecoder.decodeLineEntry(new com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser(in), lastId);
	}

	private static com.google.debugging.sourcemap.SourceMapLineDecoder.LineEntry decodeLineEntry(com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser reader, int lastId) {
		int repDigits = 0;
		for (char peek = reader.peek(); peek == '!'; peek = reader.peek()) {
			repDigits++;
			reader.next();
		}
		int idDigits = 0;
		int reps = 0;
		if (repDigits == 0) {
			char digit = reader.next();
			int value = com.google.debugging.sourcemap.SourceMapLineDecoder.addBase64Digit(digit, 0);
			reps = value >> 2;
			idDigits = value & 3;
		}else {
			char digit = reader.next();
			idDigits = com.google.debugging.sourcemap.SourceMapLineDecoder.addBase64Digit(digit, 0);
			int value = 0;
			for (int i = 0; i < repDigits; i++) {
				digit = reader.next();
				value = com.google.debugging.sourcemap.SourceMapLineDecoder.addBase64Digit(digit, value);
			}
			reps = value;
		}
		reps += 1;
		idDigits += 1;
		int value = 0;
		for (int i = 0; i < idDigits; i++) {
			char digit = reader.next();
			value = com.google.debugging.sourcemap.SourceMapLineDecoder.addBase64Digit(digit, value);
		}
		int mappingId = com.google.debugging.sourcemap.SourceMapLineDecoder.getIdFromRelativeId(value, idDigits, lastId);
		return new com.google.debugging.sourcemap.SourceMapLineDecoder.LineEntry(mappingId, reps);
	}

	private static java.util.List<java.lang.Integer> decodeLine(com.google.debugging.sourcemap.SourceMapLineDecoder.StringParser reader) {
		java.util.List<java.lang.Integer> result = com.google.common.collect.Lists.newArrayListWithCapacity(512);
		int lastId = 0;
		do {
			com.google.debugging.sourcemap.SourceMapLineDecoder.LineEntry entry = com.google.debugging.sourcemap.SourceMapLineDecoder.decodeLineEntry(reader, lastId);
			lastId = entry.id;
			for (int i = 0; i < (entry.reps); i++) {
				result.add(entry.id);
			}
		} while (reader.hasNext() );
		return result;
	}

	private static int addBase64Digit(char digit, int previousValue) {
		return (previousValue * 64) + (com.google.debugging.sourcemap.SourceMapLineDecoder.BASE64_MAP.indexOf(digit));
	}

	private static int getIdFromRelativeId(int rawId, int digits, int lastId) {
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

