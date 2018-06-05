

package com.google.javascript.jscomp;


abstract class CodeConsumer {
	boolean statementNeedsEnded = false;

	boolean statementStarted = false;

	boolean sawFunction = false;

	void startSourceMapping(com.google.javascript.rhino.Node node) {
	}

	void endSourceMapping(com.google.javascript.rhino.Node node) {
	}

	boolean continueProcessing() {
		return true;
	}

	abstract char getLastChar();

	void addIdentifier(java.lang.String identifier) {
		add(identifier);
	}

	abstract void append(java.lang.String str);

	void appendBlockStart() {
		append("{");
	}

	void appendBlockEnd() {
		append("}");
	}

	void startNewLine() {
	}

	void maybeLineBreak() {
		maybeCutLine();
	}

	void maybeCutLine() {
	}

	void endLine() {
	}

	void notePreferredLineBreak() {
	}

	void beginBlock() {
		if (statementNeedsEnded) {
			append(";");
			maybeLineBreak();
		}
		appendBlockStart();
		endLine();
		statementNeedsEnded = false;
	}

	void endBlock() {
		endBlock(false);
	}

	void endBlock(boolean shouldEndLine) {
		appendBlockEnd();
		if (shouldEndLine) {
			endLine();
		}
		statementNeedsEnded = false;
	}

	void listSeparator() {
		add(",");
		maybeLineBreak();
	}

	void endStatement() {
		endStatement(false);
	}

	void endStatement(boolean needSemiColon) {
		if (needSemiColon) {
			append(";");
			maybeLineBreak();
			statementNeedsEnded = false;
		}else
			if (statementStarted) {
				statementNeedsEnded = true;
			}
		
	}

	void maybeEndStatement() {
		if (statementNeedsEnded) {
			append(";");
			maybeLineBreak();
			endLine();
			statementNeedsEnded = false;
		}
		statementStarted = true;
	}

	void endFunction() {
		endFunction(false);
	}

	void endFunction(boolean statementContext) {
		sawFunction = true;
		if (statementContext) {
			endLine();
		}
	}

	void beginCaseBody() {
		append(":");
	}

	void endCaseBody() {
	}

	void add(java.lang.String newcode) {
		maybeEndStatement();
		if ((newcode.length()) == 0) {
			return ;
		}
		char c = newcode.charAt(0);
		if (((com.google.javascript.jscomp.CodeConsumer.isWordChar(c)) || (c == '\\')) && (com.google.javascript.jscomp.CodeConsumer.isWordChar(getLastChar()))) {
			append(" ");
		}
		append(newcode);
	}

	void appendOp(java.lang.String op, boolean binOp) {
		append(op);
	}

	void addOp(java.lang.String op, boolean binOp) {
		maybeEndStatement();
		char first = op.charAt(0);
		char prev = getLastChar();
		if (((first == '+') || (first == '-')) && (prev == first)) {
			append(" ");
		}else
			if ((java.lang.Character.isLetter(first)) && (com.google.javascript.jscomp.CodeConsumer.isWordChar(prev))) {
				append(" ");
			}else
				if ((prev == '-') && (first == '>')) {
					append(" ");
				}
			
		
		appendOp(op, binOp);
		if (binOp) {
			maybeCutLine();
		}
	}

	void addNumber(double x) {
		char prev = getLastChar();
		if ((x < 0) && (prev == '-')) {
			add(" ");
		}
		if (((long) (x)) == x) {
			long value = ((long) (x));
			long mantissa = value;
			int exp = 0;
			if ((java.lang.Math.abs(x)) >= 100) {
				while (((mantissa / 10) * (java.lang.Math.pow(10, (exp + 1)))) == value) {
					mantissa /= 10;
					exp++;
				} 
			}
			if (exp > 2) {
				add((((java.lang.Long.toString(mantissa)) + "E") + (java.lang.Integer.toString(exp))));
			}else {
				add(java.lang.Long.toString(value));
			}
		}else {
			add(java.lang.String.valueOf(x));
		}
	}

	static boolean isNegativeZero(double x) {
		return (x == 0.0) && ((java.lang.Math.copySign(1, x)) == (-1.0));
	}

	static boolean isWordChar(char ch) {
		return ((ch == '_') || (ch == '$')) || (java.lang.Character.isLetterOrDigit(ch));
	}

	boolean shouldPreserveExtraBlocks() {
		return false;
	}

	boolean breakAfterBlockFor(com.google.javascript.rhino.Node n, boolean statementContext) {
		return statementContext;
	}

	void endFile() {
	}
}

