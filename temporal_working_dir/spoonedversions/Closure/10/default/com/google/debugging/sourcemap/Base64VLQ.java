

package com.google.debugging.sourcemap;


final class Base64VLQ {
	private Base64VLQ() {
	}

	private static final int VLQ_BASE_SHIFT = 5;

	private static final int VLQ_BASE = 1 << (com.google.debugging.sourcemap.Base64VLQ.VLQ_BASE_SHIFT);

	private static final int VLQ_BASE_MASK = (com.google.debugging.sourcemap.Base64VLQ.VLQ_BASE) - 1;

	private static final int VLQ_CONTINUATION_BIT = com.google.debugging.sourcemap.Base64VLQ.VLQ_BASE;

	private static int toVLQSigned(int value) {
		if (value < 0) {
			return ((-value) << 1) + 1;
		}else {
			return (value << 1) + 0;
		}
	}

	private static int fromVLQSigned(int value) {
		boolean negate = (value & 1) == 1;
		value = value >> 1;
		return negate ? -value : value;
	}

	public static void encode(java.lang.Appendable out, int value) throws java.io.IOException {
		value = com.google.debugging.sourcemap.Base64VLQ.toVLQSigned(value);
		do {
			int digit = value & (com.google.debugging.sourcemap.Base64VLQ.VLQ_BASE_MASK);
			value >>>= com.google.debugging.sourcemap.Base64VLQ.VLQ_BASE_SHIFT;
			if (value > 0) {
				digit |= com.google.debugging.sourcemap.Base64VLQ.VLQ_CONTINUATION_BIT;
			}
			out.append(com.google.debugging.sourcemap.Base64.toBase64(digit));
		} while (value > 0 );
	}

	interface CharIterator {
		boolean hasNext();

		char next();
	}

	public static int decode(com.google.debugging.sourcemap.Base64VLQ.CharIterator in) {
		int result = 0;
		boolean continuation;
		int shift = 0;
		do {
			char c = in.next();
			int digit = com.google.debugging.sourcemap.Base64.fromBase64(c);
			continuation = (digit & (com.google.debugging.sourcemap.Base64VLQ.VLQ_CONTINUATION_BIT)) != 0;
			digit &= com.google.debugging.sourcemap.Base64VLQ.VLQ_BASE_MASK;
			result = result + (digit << shift);
			shift = shift + (com.google.debugging.sourcemap.Base64VLQ.VLQ_BASE_SHIFT);
		} while (continuation );
		return com.google.debugging.sourcemap.Base64VLQ.fromVLQSigned(result);
	}
}

