

package com.google.javascript.jscomp;


final class NameGenerator {
	static final char[] FIRST_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ$".toCharArray();

	static final char[] NONFIRST_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789$".toCharArray();

	private final java.util.Set<java.lang.String> reservedNames;

	private final java.lang.String prefix;

	private int nameCount;

	private final char[] firstChars;

	private final char[] nonFirstChars;

	NameGenerator(java.util.Set<java.lang.String> reservedNames, java.lang.String prefix, @javax.annotation.Nullable
	char[] reservedCharacters) {
		this.reservedNames = reservedNames;
		this.prefix = prefix;
		this.firstChars = com.google.javascript.jscomp.NameGenerator.reserveCharacters(com.google.javascript.jscomp.NameGenerator.FIRST_CHAR, reservedCharacters);
		this.nonFirstChars = com.google.javascript.jscomp.NameGenerator.reserveCharacters(com.google.javascript.jscomp.NameGenerator.NONFIRST_CHAR, reservedCharacters);
		checkPrefix(prefix);
	}

	static char[] reserveCharacters(char[] chars, char[] reservedCharacters) {
		if ((reservedCharacters == null) || ((reservedCharacters.length) == 0)) {
			return chars;
		}
		java.util.Set<java.lang.Character> charSet = com.google.common.collect.Sets.newLinkedHashSet(com.google.common.primitives.Chars.asList(chars));
		for (char reservedCharacter : reservedCharacters) {
			charSet.remove(reservedCharacter);
		}
		return com.google.common.primitives.Chars.toArray(charSet);
	}

	private void checkPrefix(java.lang.String prefix) {
		if ((prefix.length()) > 0) {
			if (!(contains(firstChars, prefix.charAt(0)))) {
				throw new java.lang.IllegalArgumentException(("prefix must start with one of: " + (java.util.Arrays.toString(firstChars))));
			}
			for (int pos = 1; pos < (prefix.length()); ++pos) {
				if (!(contains(nonFirstChars, prefix.charAt(pos)))) {
					throw new java.lang.IllegalArgumentException((("prefix has invalid characters, " + "must be one of: ") + (java.util.Arrays.toString(nonFirstChars))));
				}
			}
		}
	}

	private boolean contains(char[] arr, char c) {
		for (int i = 0; i < (arr.length); i++) {
			if ((arr[i]) == c) {
				return true;
			}
		}
		return false;
	}

	java.lang.String generateNextName() {
		while (true) {
			java.lang.String name = prefix;
			int i = nameCount;
			if (name.isEmpty()) {
				int pos = i % (firstChars.length);
				name += firstChars[pos];
				i /= firstChars.length;
			}
			while (i > 0) {
				i--;
				int pos = i % (nonFirstChars.length);
				name += nonFirstChars[pos];
				i /= nonFirstChars.length;
			} 
			(nameCount)++;
			if ((com.google.javascript.rhino.TokenStream.isKeyword(name)) || (reservedNames.contains(name))) {
				continue;
			}
			return name;
		} 
	}
}

