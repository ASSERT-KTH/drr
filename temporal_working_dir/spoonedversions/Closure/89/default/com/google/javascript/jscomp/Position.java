

package com.google.javascript.jscomp;


class Position {
	private final int lineNumber;

	private final int characterIndex;

	public Position(int lineNumber, int characterIndex) {
		this.lineNumber = lineNumber;
		this.characterIndex = characterIndex;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public int getCharacterIndex() {
		return characterIndex;
	}
}

