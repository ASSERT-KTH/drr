

package com.google.debugging.sourcemap;


public final class Base64 {
	private Base64() {
	}

	private static final java.lang.String BASE64_MAP = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + ("abcdefghijklmnopqrstuvwxyz" + "0123456789+/");

	private static final int[] BASE64_DECODE_MAP = new int[256];

	static {
		java.util.Arrays.fill(com.google.debugging.sourcemap.Base64.BASE64_DECODE_MAP, (-1));
		for (int i = 0; i < (com.google.debugging.sourcemap.Base64.BASE64_MAP.length()); i++) {
			com.google.debugging.sourcemap.Base64.BASE64_DECODE_MAP[com.google.debugging.sourcemap.Base64.BASE64_MAP.charAt(i)] = i;
		}
	}

	public static char toBase64(int value) {
		assert (value <= 63) && (value >= 0) : "value out of range:" + value;
		return com.google.debugging.sourcemap.Base64.BASE64_MAP.charAt(value);
	}

	public static int fromBase64(char c) {
		int result = com.google.debugging.sourcemap.Base64.BASE64_DECODE_MAP[c];
		assert result != (-1) : "invalid char";
		return com.google.debugging.sourcemap.Base64.BASE64_DECODE_MAP[c];
	}

	public static java.lang.String base64EncodeInt(int value) {
		char[] c = new char[6];
		for (int i = 0; i < 5; i++) {
			c[i] = com.google.debugging.sourcemap.Base64.toBase64(((value >> (26 - (i * 6))) & 63));
		}
		c[5] = com.google.debugging.sourcemap.Base64.toBase64(((value << 4) & 63));
		return new java.lang.String(c);
	}
}

