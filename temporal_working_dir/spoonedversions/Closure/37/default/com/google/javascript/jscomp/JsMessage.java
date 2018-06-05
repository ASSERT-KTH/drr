

package com.google.javascript.jscomp;


public class JsMessage {
	public enum Style {
LEGACY, RELAX, CLOSURE;
		static com.google.javascript.jscomp.JsMessage.Style getFromParams(boolean useClosure, boolean allowLegacyMessages) {
			if (useClosure) {
				return allowLegacyMessages ? com.google.javascript.jscomp.JsMessage.Style.RELAX : com.google.javascript.jscomp.JsMessage.Style.CLOSURE;
			}else {
				return com.google.javascript.jscomp.JsMessage.Style.LEGACY;
			}
		}
	}

	private static final java.lang.String MESSAGE_REPRESENTATION_FORMAT = "{$%s}";

	private final java.lang.String key;

	private final java.lang.String id;

	private final java.util.List<java.lang.CharSequence> parts;

	private final java.util.Set<java.lang.String> placeholders;

	private final java.lang.String desc;

	private final boolean hidden;

	private final java.lang.String meaning;

	private final java.lang.String sourceName;

	private final boolean isAnonymous;

	private final boolean isExternal;

	private JsMessage(java.lang.String sourceName, java.lang.String key, boolean isAnonymous, boolean isExternal, java.lang.String id, java.util.List<java.lang.CharSequence> parts, java.util.Set<java.lang.String> placeholders, java.lang.String desc, boolean hidden, java.lang.String meaning) {
		com.google.common.base.Preconditions.checkState((key != null));
		com.google.common.base.Preconditions.checkState((id != null));
		this.key = key;
		this.id = id;
		this.parts = java.util.Collections.unmodifiableList(parts);
		this.placeholders = java.util.Collections.unmodifiableSet(placeholders);
		this.desc = desc;
		this.hidden = hidden;
		this.meaning = meaning;
		this.sourceName = sourceName;
		this.isAnonymous = isAnonymous;
		this.isExternal = isExternal;
	}

	public java.lang.String getSourceName() {
		return sourceName;
	}

	public java.lang.String getKey() {
		return key;
	}

	public boolean isAnonymous() {
		return isAnonymous;
	}

	public boolean isExternal() {
		return isExternal;
	}

	public java.lang.String getId() {
		return id;
	}

	public java.lang.String getDesc() {
		return desc;
	}

	java.lang.String getMeaning() {
		return meaning;
	}

	public boolean isHidden() {
		return hidden;
	}

	public java.util.List<java.lang.CharSequence> parts() {
		return parts;
	}

	public java.util.Set<java.lang.String> placeholders() {
		return placeholders;
	}

	@java.lang.Override
	public java.lang.String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		for (java.lang.CharSequence p : parts) {
			sb.append(p.toString());
		}
		return sb.toString();
	}

	public boolean isEmpty() {
		for (java.lang.CharSequence part : parts) {
			if ((part.length()) > 0) {
				return false;
			}
		}
		return true;
	}

	@java.lang.Override
	public boolean equals(java.lang.Object o) {
		if (o == (com.google.javascript.jscomp.JsMessage.this))
			return true;
		
		if (!(o instanceof com.google.javascript.jscomp.JsMessage))
			return false;
		
		com.google.javascript.jscomp.JsMessage m = ((com.google.javascript.jscomp.JsMessage) (o));
		return ((((((((id.equals(m.id)) && (key.equals(m.key))) && ((isAnonymous) == (m.isAnonymous))) && (parts.equals(m.parts))) && ((meaning) == null ? (m.meaning) == null : meaning.equals(m.meaning))) && (placeholders.equals(m.placeholders))) && ((desc) == null ? (m.desc) == null : desc.equals(m.desc))) && ((sourceName) == null ? (m.sourceName) == null : sourceName.equals(m.sourceName))) && ((hidden) == (m.hidden));
	}

	@java.lang.Override
	public int hashCode() {
		int hash = key.hashCode();
		hash = (31 * hash) + (isAnonymous ? 1 : 0);
		hash = (31 * hash) + (id.hashCode());
		hash = (31 * hash) + (parts.hashCode());
		hash = (31 * hash) + ((desc) != null ? desc.hashCode() : 0);
		hash = (31 * hash) + (hidden ? 1 : 0);
		hash = (31 * hash) + ((sourceName) != null ? sourceName.hashCode() : 0);
		return hash;
	}

	public static class PlaceholderReference implements java.lang.CharSequence {
		private final java.lang.String name;

		PlaceholderReference(java.lang.String name) {
			this.name = name;
		}

		@java.lang.Override
		public int length() {
			return name.length();
		}

		@java.lang.Override
		public char charAt(int index) {
			return name.charAt(index);
		}

		@java.lang.Override
		public java.lang.CharSequence subSequence(int start, int end) {
			return name.subSequence(start, end);
		}

		public java.lang.String getName() {
			return name;
		}

		@java.lang.Override
		public java.lang.String toString() {
			return java.lang.String.format(com.google.javascript.jscomp.JsMessage.MESSAGE_REPRESENTATION_FORMAT, name);
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return (o == (com.google.javascript.jscomp.JsMessage.PlaceholderReference.this)) || ((o instanceof com.google.javascript.jscomp.JsMessage.PlaceholderReference) && (name.equals(((com.google.javascript.jscomp.JsMessage.PlaceholderReference) (o)).name)));
		}

		@java.lang.Override
		public int hashCode() {
			return 31 * (name.hashCode());
		}
	}

	public static class Builder {
		private static final java.util.regex.Pattern MSG_EXTERNAL_PATTERN = java.util.regex.Pattern.compile("MSG_EXTERNAL_(\\d+)");

		private static java.lang.String getExternalMessageId(java.lang.String identifier) {
			java.util.regex.Matcher m = com.google.javascript.jscomp.JsMessage.Builder.MSG_EXTERNAL_PATTERN.matcher(identifier);
			return m.matches() ? m.group(1) : null;
		}

		private java.lang.String key;

		private java.lang.String meaning;

		private java.lang.String desc;

		private boolean hidden;

		private java.util.List<java.lang.CharSequence> parts = com.google.common.collect.Lists.newLinkedList();

		private java.util.Set<java.lang.String> placeholders = com.google.common.collect.Sets.newHashSet();

		private java.lang.String sourceName;

		public Builder() {
			this(null);
		}

		public Builder(java.lang.String key) {
			com.google.javascript.jscomp.JsMessage.Builder.this.key = key;
		}

		public java.lang.String getKey() {
			return key;
		}

		public com.google.javascript.jscomp.JsMessage.Builder setKey(java.lang.String key) {
			com.google.javascript.jscomp.JsMessage.Builder.this.key = key;
			return com.google.javascript.jscomp.JsMessage.Builder.this;
		}

		public com.google.javascript.jscomp.JsMessage.Builder setSourceName(java.lang.String sourceName) {
			com.google.javascript.jscomp.JsMessage.Builder.this.sourceName = sourceName;
			return com.google.javascript.jscomp.JsMessage.Builder.this;
		}

		public com.google.javascript.jscomp.JsMessage.Builder appendPlaceholderReference(java.lang.String name) {
			com.google.common.base.Preconditions.checkNotNull(name, "Placeholder name could not be null");
			parts.add(new com.google.javascript.jscomp.JsMessage.PlaceholderReference(name));
			placeholders.add(name);
			return com.google.javascript.jscomp.JsMessage.Builder.this;
		}

		public com.google.javascript.jscomp.JsMessage.Builder appendStringPart(java.lang.String part) {
			com.google.common.base.Preconditions.checkNotNull(part, "String part of the message could not be null");
			parts.add(part);
			return com.google.javascript.jscomp.JsMessage.Builder.this;
		}

		public java.util.Set<java.lang.String> getPlaceholders() {
			return placeholders;
		}

		public com.google.javascript.jscomp.JsMessage.Builder setDesc(java.lang.String desc) {
			com.google.javascript.jscomp.JsMessage.Builder.this.desc = desc;
			return com.google.javascript.jscomp.JsMessage.Builder.this;
		}

		public com.google.javascript.jscomp.JsMessage.Builder setMeaning(java.lang.String meaning) {
			com.google.javascript.jscomp.JsMessage.Builder.this.meaning = meaning;
			return com.google.javascript.jscomp.JsMessage.Builder.this;
		}

		public com.google.javascript.jscomp.JsMessage.Builder setIsHidden(boolean hidden) {
			com.google.javascript.jscomp.JsMessage.Builder.this.hidden = hidden;
			return com.google.javascript.jscomp.JsMessage.Builder.this;
		}

		public boolean hasParts() {
			return !(parts.isEmpty());
		}

		public java.util.List<java.lang.CharSequence> getParts() {
			return parts;
		}

		public com.google.javascript.jscomp.JsMessage build() {
			return build(null);
		}

		public com.google.javascript.jscomp.JsMessage build(com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator) {
			boolean isAnonymous = false;
			boolean isExternal = false;
			java.lang.String id = null;
			if ((getKey()) == null) {
				key = (com.google.javascript.jscomp.JsMessageVisitor.MSG_PREFIX) + (com.google.javascript.jscomp.JsMessage.Builder.fingerprint(getParts()));
				isAnonymous = true;
			}
			if (!isAnonymous) {
				java.lang.String externalId = com.google.javascript.jscomp.JsMessage.Builder.getExternalMessageId(key);
				if (externalId != null) {
					isExternal = true;
					id = externalId;
				}
			}
			if (!isExternal) {
				java.lang.String defactoMeaning = (meaning) != null ? meaning : key;
				id = (idGenerator == null) ? defactoMeaning : idGenerator.generateId(defactoMeaning, parts);
			}
			return new com.google.javascript.jscomp.JsMessage(sourceName, key, isAnonymous, isExternal, id, parts, placeholders, desc, hidden, meaning);
		}

		private static java.lang.String fingerprint(java.util.List<java.lang.CharSequence> messageParts) {
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			for (java.lang.CharSequence part : messageParts) {
				if (part instanceof com.google.javascript.jscomp.JsMessage.PlaceholderReference) {
					sb.append(part.toString());
				}else {
					sb.append(part);
				}
			}
			long nonnegativeHash = (java.lang.Long.MAX_VALUE) & (com.google.javascript.jscomp.JsMessage.Hash.hash64(sb.toString()));
			return java.lang.Long.toString(nonnegativeHash, 36).toUpperCase();
		}
	}

	static final class Hash {
		private Hash() {
		}

		private static final long SEED64 = 3141592653589793238L;

		private static final long CONSTANT64 = -2266404186210603134L;

		static long hash64(@javax.annotation.Nullable
		java.lang.String value) {
			return com.google.javascript.jscomp.JsMessage.Hash.hash64(value, com.google.javascript.jscomp.JsMessage.Hash.SEED64);
		}

		private static long hash64(@javax.annotation.Nullable
		java.lang.String value, long seed) {
			if (value == null) {
				return com.google.javascript.jscomp.JsMessage.Hash.hash64(null, 0, 0, seed);
			}
			return com.google.javascript.jscomp.JsMessage.Hash.hash64(value.getBytes(), seed);
		}

		private static long hash64(byte[] value, long seed) {
			return com.google.javascript.jscomp.JsMessage.Hash.hash64(value, 0, (value == null ? 0 : value.length), seed);
		}

		@java.lang.SuppressWarnings(value = "fallthrough")
		private static long hash64(byte[] value, int offset, int length, long seed) {
			long a = com.google.javascript.jscomp.JsMessage.Hash.CONSTANT64;
			long b = a;
			long c = seed;
			int keylen;
			for (keylen = length; keylen >= 24; keylen -= 24 , offset += 24) {
				a += com.google.javascript.jscomp.JsMessage.Hash.word64At(value, offset);
				b += com.google.javascript.jscomp.JsMessage.Hash.word64At(value, (offset + 8));
				c += com.google.javascript.jscomp.JsMessage.Hash.word64At(value, (offset + 16));
				a -= b;
				a -= c;
				a ^= c >>> 43;
				b -= c;
				b -= a;
				b ^= a << 9;
				c -= a;
				c -= b;
				c ^= b >>> 8;
				a -= b;
				a -= c;
				a ^= c >>> 38;
				b -= c;
				b -= a;
				b ^= a << 23;
				c -= a;
				c -= b;
				c ^= b >>> 5;
				a -= b;
				a -= c;
				a ^= c >>> 35;
				b -= c;
				b -= a;
				b ^= a << 49;
				c -= a;
				c -= b;
				c ^= b >>> 11;
				a -= b;
				a -= c;
				a ^= c >>> 12;
				b -= c;
				b -= a;
				b ^= a << 18;
				c -= a;
				c -= b;
				c ^= b >>> 22;
			}
			c += length;
			switch (keylen) {
				case 23 :
					c += ((long) (value[(offset + 22)])) << 56;
				case 22 :
					c += ((value[(offset + 21)]) & 255L) << 48;
				case 21 :
					c += ((value[(offset + 20)]) & 255L) << 40;
				case 20 :
					c += ((value[(offset + 19)]) & 255L) << 32;
				case 19 :
					c += ((value[(offset + 18)]) & 255L) << 24;
				case 18 :
					c += ((value[(offset + 17)]) & 255L) << 16;
				case 17 :
					c += ((value[(offset + 16)]) & 255L) << 8;
				case 16 :
					b += com.google.javascript.jscomp.JsMessage.Hash.word64At(value, (offset + 8));
					a += com.google.javascript.jscomp.JsMessage.Hash.word64At(value, offset);
					break;
				case 15 :
					b += ((value[(offset + 14)]) & 255L) << 48;
				case 14 :
					b += ((value[(offset + 13)]) & 255L) << 40;
				case 13 :
					b += ((value[(offset + 12)]) & 255L) << 32;
				case 12 :
					b += ((value[(offset + 11)]) & 255L) << 24;
				case 11 :
					b += ((value[(offset + 10)]) & 255L) << 16;
				case 10 :
					b += ((value[(offset + 9)]) & 255L) << 8;
				case 9 :
					b += (value[(offset + 8)]) & 255L;
				case 8 :
					a += com.google.javascript.jscomp.JsMessage.Hash.word64At(value, offset);
					break;
				case 7 :
					a += ((value[(offset + 6)]) & 255L) << 48;
				case 6 :
					a += ((value[(offset + 5)]) & 255L) << 40;
				case 5 :
					a += ((value[(offset + 4)]) & 255L) << 32;
				case 4 :
					a += ((value[(offset + 3)]) & 255L) << 24;
				case 3 :
					a += ((value[(offset + 2)]) & 255L) << 16;
				case 2 :
					a += ((value[(offset + 1)]) & 255L) << 8;
				case 1 :
					a += (value[(offset + 0)]) & 255L;
			}
			return com.google.javascript.jscomp.JsMessage.Hash.mix64(a, b, c);
		}

		private static long word64At(byte[] bytes, int offset) {
			return ((((((((bytes[(offset + 0)]) & 255L) + (((bytes[(offset + 1)]) & 255L) << 8)) + (((bytes[(offset + 2)]) & 255L) << 16)) + (((bytes[(offset + 3)]) & 255L) << 24)) + (((bytes[(offset + 4)]) & 255L) << 32)) + (((bytes[(offset + 5)]) & 255L) << 40)) + (((bytes[(offset + 6)]) & 255L) << 48)) + (((bytes[(offset + 7)]) & 255L) << 56);
		}

		private static long mix64(long a, long b, long c) {
			a -= b;
			a -= c;
			a ^= c >>> 43;
			b -= c;
			b -= a;
			b ^= a << 9;
			c -= a;
			c -= b;
			c ^= b >>> 8;
			a -= b;
			a -= c;
			a ^= c >>> 38;
			b -= c;
			b -= a;
			b ^= a << 23;
			c -= a;
			c -= b;
			c ^= b >>> 5;
			a -= b;
			a -= c;
			a ^= c >>> 35;
			b -= c;
			b -= a;
			b ^= a << 49;
			c -= a;
			c -= b;
			c ^= b >>> 11;
			a -= b;
			a -= c;
			a ^= c >>> 12;
			b -= c;
			b -= a;
			b ^= a << 18;
			c -= a;
			c -= b;
			c ^= b >>> 22;
			return c;
		}
	}

	public interface IdGenerator {
		java.lang.String generateId(java.lang.String meaning, java.util.List<java.lang.CharSequence> messageParts);
	}
}

