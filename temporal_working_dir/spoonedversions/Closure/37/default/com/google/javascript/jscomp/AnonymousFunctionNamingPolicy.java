

package com.google.javascript.jscomp;


public enum AnonymousFunctionNamingPolicy {
OFF(null), UNMAPPED(new char[]{ com.google.javascript.jscomp.NameAnonymousFunctions.DELIMITER }), MAPPED(new char[]{ com.google.javascript.jscomp.NameAnonymousFunctionsMapped.PREFIX });
	private final char[] reservedCharacters;

	AnonymousFunctionNamingPolicy(char[] reservedCharacters) {
		this.reservedCharacters = reservedCharacters;
	}

	public char[] getReservedCharacters() {
		return reservedCharacters;
	}
}

