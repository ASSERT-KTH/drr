

package com.google.javascript.jscomp;


public class GoogleJsMessageIdGenerator implements com.google.javascript.jscomp.JsMessage.IdGenerator {
	private final java.lang.String projectId;

	public GoogleJsMessageIdGenerator(java.lang.String projectId) {
		this.projectId = projectId;
	}

	@java.lang.Override
	public java.lang.String generateId(java.lang.String meaning, java.util.List<java.lang.CharSequence> messageParts) {
		com.google.common.base.Preconditions.checkState((meaning != null));
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		for (java.lang.CharSequence part : messageParts) {
			if (part instanceof com.google.javascript.jscomp.JsMessage.PlaceholderReference) {
				sb.append(com.google.common.base.CaseFormat.LOWER_CAMEL.to(com.google.common.base.CaseFormat.UPPER_UNDERSCORE, ((com.google.javascript.jscomp.JsMessage.PlaceholderReference) (part)).getName()));
			}else {
				sb.append(part);
			}
		}
		java.lang.String tcValue = sb.toString();
		java.lang.String projectScopedMeaning = ((projectId) != null ? (projectId) + ": " : "") + meaning;
		return java.lang.String.valueOf(com.google.javascript.jscomp.GoogleJsMessageIdGenerator.MessageId.GenerateId(tcValue, projectScopedMeaning));
	}

	private static final class FP {
		private FP() {
		}

		private static long fingerprint(byte[] str, int start, int limit) {
			int hi = com.google.javascript.jscomp.GoogleJsMessageIdGenerator.FP.hash32(str, start, limit, 0);
			int lo = com.google.javascript.jscomp.GoogleJsMessageIdGenerator.FP.hash32(str, start, limit, 102072);
			if ((hi == 0) && ((lo == 0) || (lo == 1))) {
				hi ^= 319790063;
				lo ^= -1801410264;
			}
			return (((long) (hi)) << 32) | (lo & 4294967295L);
		}

		private static long fingerprint(java.lang.String str) {
			byte[] tmp = str.getBytes(com.google.common.base.Charsets.UTF_8);
			return com.google.javascript.jscomp.GoogleJsMessageIdGenerator.FP.fingerprint(tmp, 0, tmp.length);
		}

		@java.lang.SuppressWarnings(value = "fallthrough")
		private static int hash32(byte[] str, int start, int limit, int c) {
			int a = -1640531527;
			int b = -1640531527;
			int i;
			for (i = start; (i + 12) <= limit; i += 12) {
				a += (((((str[(i + 0)]) & 255) << 0) | (((str[(i + 1)]) & 255) << 8)) | (((str[(i + 2)]) & 255) << 16)) | (((str[(i + 3)]) & 255) << 24);
				b += (((((str[(i + 4)]) & 255) << 0) | (((str[(i + 5)]) & 255) << 8)) | (((str[(i + 6)]) & 255) << 16)) | (((str[(i + 7)]) & 255) << 24);
				c += (((((str[(i + 8)]) & 255) << 0) | (((str[(i + 9)]) & 255) << 8)) | (((str[(i + 10)]) & 255) << 16)) | (((str[(i + 11)]) & 255) << 24);
				a -= b;
				a -= c;
				a ^= c >>> 13;
				b -= c;
				b -= a;
				b ^= a << 8;
				c -= a;
				c -= b;
				c ^= b >>> 13;
				a -= b;
				a -= c;
				a ^= c >>> 12;
				b -= c;
				b -= a;
				b ^= a << 16;
				c -= a;
				c -= b;
				c ^= b >>> 5;
				a -= b;
				a -= c;
				a ^= c >>> 3;
				b -= c;
				b -= a;
				b ^= a << 10;
				c -= a;
				c -= b;
				c ^= b >>> 15;
			}
			c += limit - start;
			switch (limit - i) {
				case 11 :
					c += ((str[(i + 10)]) & 255) << 24;
				case 10 :
					c += ((str[(i + 9)]) & 255) << 16;
				case 9 :
					c += ((str[(i + 8)]) & 255) << 8;
				case 8 :
					b += ((str[(i + 7)]) & 255) << 24;
				case 7 :
					b += ((str[(i + 6)]) & 255) << 16;
				case 6 :
					b += ((str[(i + 5)]) & 255) << 8;
				case 5 :
					b += (str[(i + 4)]) & 255;
				case 4 :
					a += ((str[(i + 3)]) & 255) << 24;
				case 3 :
					a += ((str[(i + 2)]) & 255) << 16;
				case 2 :
					a += ((str[(i + 1)]) & 255) << 8;
				case 1 :
					a += (str[(i + 0)]) & 255;
			}
			a -= b;
			a -= c;
			a ^= c >>> 13;
			b -= c;
			b -= a;
			b ^= a << 8;
			c -= a;
			c -= b;
			c ^= b >>> 13;
			a -= b;
			a -= c;
			a ^= c >>> 12;
			b -= c;
			b -= a;
			b ^= a << 16;
			c -= a;
			c -= b;
			c ^= b >>> 5;
			a -= b;
			a -= c;
			a ^= c >>> 3;
			b -= c;
			b -= a;
			b ^= a << 10;
			c -= a;
			c -= b;
			c ^= b >>> 15;
			return c;
		}
	}

	private static class MessageId {
		private static final long GenerateId(java.lang.String message, java.lang.String meaning) {
			long fp = com.google.javascript.jscomp.GoogleJsMessageIdGenerator.FP.fingerprint(message);
			if ((null != meaning) && ((meaning.length()) > 0)) {
				long fp2 = com.google.javascript.jscomp.GoogleJsMessageIdGenerator.FP.fingerprint(meaning);
				fp = (fp2 + (fp << 1)) + (fp < 0 ? 1 : 0);
			}
			return fp & 9223372036854775807L;
		}
	}
}

