

package com.google.javascript.jscomp.regex;


public abstract class RegExpTree {
	public abstract com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags);

	public abstract boolean isCaseSensitive();

	public abstract boolean containsAnchor();

	public final boolean hasCapturingGroup() {
		return (numCapturingGroups()) != 0;
	}

	public abstract int numCapturingGroups();

	public abstract java.util.List<? extends com.google.javascript.jscomp.regex.RegExpTree> children();

	protected abstract void appendSourceCode(java.lang.StringBuilder sb);

	protected abstract void appendDebugInfo(java.lang.StringBuilder sb);

	@java.lang.Override
	public final java.lang.String toString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append('/');
		appendSourceCode(sb);
		if ((sb.length()) == 1) {
			sb.append("(?:)");
		}
		sb.append('/');
		return sb.toString();
	}

	public final java.lang.String toDebugString() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		appendDebugString(sb);
		return sb.toString();
	}

	private void appendDebugString(java.lang.StringBuilder sb) {
		sb.append('(').append(getClass().getSimpleName());
		int len = sb.length();
		sb.append(' ');
		appendDebugInfo(sb);
		if ((sb.length()) == (len + 1)) {
			sb.setLength(len);
		}
		for (com.google.javascript.jscomp.regex.RegExpTree child : children()) {
			sb.append(' ');
			child.appendDebugString(sb);
		}
		sb.append(')');
	}

	@java.lang.Override
	public abstract boolean equals(java.lang.Object o);

	@java.lang.Override
	public abstract int hashCode();

	public static com.google.javascript.jscomp.regex.RegExpTree parseRegExp(final java.lang.String pattern, final java.lang.String flags) {
		class Parser {
			int pos;

			int numCapturingGroups = 0;

			final int limit = pattern.length();

			com.google.javascript.jscomp.regex.RegExpTree parseTopLevel() {
				Parser.this.pos = 0;
				com.google.javascript.jscomp.regex.RegExpTree out = parse();
				if ((pos) < (limit)) {
					throw new java.lang.IllegalArgumentException(pattern.substring(pos));
				}
				return out;
			}

			com.google.javascript.jscomp.regex.RegExpTree parse() {
				com.google.common.collect.ImmutableList.Builder<com.google.javascript.jscomp.regex.RegExpTree> alternatives = null;
				com.google.javascript.jscomp.regex.RegExpTree preceder = null;
				topLoop : while ((pos) < (limit)) {
					char ch = pattern.charAt(pos);
					com.google.javascript.jscomp.regex.RegExpTree atom;
					switch (ch) {
						case '[' :
							atom = parseCharset();
							break;
						case '(' :
							atom = parseParenthetical();
							break;
						case ')' :
							break topLoop;
						case '\\' :
							atom = parseEscape();
							break;
						case '^' :
						case '$' :
							atom = new com.google.javascript.jscomp.regex.RegExpTree.Anchor(ch);
							++(pos);
							break;
						case '.' :
							atom = com.google.javascript.jscomp.regex.RegExpTree.DOT_CHARSET;
							++(pos);
							break;
						case '|' :
							atom = com.google.javascript.jscomp.regex.RegExpTree.Empty.INSTANCE;
							break;
						default :
							int start = pos;
							int end = (pos) + 1;
							charsLoop : while (end < (limit)) {
								switch (pattern.charAt(end)) {
									case '[' :
									case '(' :
									case ')' :
									case '\\' :
									case '^' :
									case '$' :
									case '|' :
									case '.' :
									case '*' :
									case '+' :
									case '?' :
									case '{' :
										break charsLoop;
									default :
										if (((end + 1) >= (limit)) || (!(isRepetitionStart(pattern.charAt((end + 1)))))) {
											++end;
										}else {
											break charsLoop;
										}
								}
							} 
							atom = new com.google.javascript.jscomp.regex.RegExpTree.Text(pattern.substring(start, end));
							pos = end;
							break;
					}
					if (((pos) < (limit)) && (isRepetitionStart(pattern.charAt(pos)))) {
						atom = parseRepetition(atom);
					}
					if (preceder == null) {
						preceder = atom;
					}else {
						preceder = new com.google.javascript.jscomp.regex.RegExpTree.Concatenation(preceder, atom);
					}
					if (((pos) < (limit)) && ((pattern.charAt(pos)) == '|')) {
						if (alternatives == null) {
							alternatives = com.google.common.collect.ImmutableList.builder();
						}
						alternatives.add(preceder);
						preceder = null;
						++(pos);
					}
				} 
				if (preceder == null) {
					preceder = com.google.javascript.jscomp.regex.RegExpTree.Empty.INSTANCE;
				}
				if (alternatives != null) {
					alternatives.add(preceder);
					return new com.google.javascript.jscomp.regex.RegExpTree.Alternation(alternatives.build());
				}else {
					return preceder;
				}
			}

			private com.google.javascript.jscomp.regex.RegExpTree parseParenthetical() {
				com.google.common.base.Preconditions.checkState(((pattern.charAt(pos)) == '('));
				int start = pos;
				++(pos);
				boolean capturing = true;
				int type = 0;
				if (((pos) < (limit)) && ((pattern.charAt(pos)) == '?')) {
					if (((pos) + 1) < (limit)) {
						capturing = false;
						char ch = pattern.charAt(((pos) + 1));
						switch (ch) {
							case ':' :
								pos += 2;
								break;
							case '!' :
							case '=' :
								pos += 2;
								type = ch;
								break;
							default :
								throw new java.lang.IllegalArgumentException(("Malformed parenthetical: " + (pattern.substring(start))));
						}
					}
				}
				com.google.javascript.jscomp.regex.RegExpTree body = parse();
				if (((pos) < (limit)) && ((pattern.charAt(pos)) == ')')) {
					++(pos);
				}else {
					throw new java.lang.IllegalArgumentException(("Unclosed parenthetical group: " + (pattern.substring(start))));
				}
				if (capturing) {
					++(numCapturingGroups);
					return new com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup(body);
				}else
					if (type != 0) {
						return new com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion(body, (type == '='));
					}else {
						return body;
					}
				
			}

			private com.google.javascript.jscomp.regex.RegExpTree parseCharset() {
				com.google.common.base.Preconditions.checkState(((pattern.charAt(pos)) == '['));
				++(pos);
				boolean isCaseInsensitive = (flags.indexOf('i')) >= 0;
				boolean inverse = ((pos) < (limit)) && ((pattern.charAt(pos)) == '^');
				if (inverse) {
					++(pos);
				}
				com.google.javascript.jscomp.regex.CharRanges ranges = com.google.javascript.jscomp.regex.CharRanges.EMPTY;
				com.google.javascript.jscomp.regex.CharRanges ieExplicits = com.google.javascript.jscomp.regex.CharRanges.EMPTY;
				while (((pos) < (limit)) && ((pattern.charAt(pos)) != ']')) {
					char ch = pattern.charAt(pos);
					char start;
					if (ch == '\\') {
						++(pos);
						char possibleGroupName = pattern.charAt(pos);
						com.google.javascript.jscomp.regex.CharRanges group = com.google.javascript.jscomp.regex.RegExpTree.NAMED_CHAR_GROUPS.get(possibleGroupName);
						if (group != null) {
							++(pos);
							ranges = ranges.union(group);
							continue;
						}
						start = parseEscapeChar();
					}else {
						start = ch;
						++(pos);
					}
					char end = start;
					if (((((pos) + 1) < (limit)) && ((pattern.charAt(pos)) == '-')) && ((pattern.charAt(((pos) + 1))) != ']')) {
						++(pos);
						ch = pattern.charAt(pos);
						if (ch == '\\') {
							++(pos);
							end = parseEscapeChar();
						}else {
							end = ch;
							++(pos);
						}
					}
					com.google.javascript.jscomp.regex.CharRanges range = com.google.javascript.jscomp.regex.CharRanges.inclusive(start, end);
					ranges = ranges.union(range);
					if ((com.google.javascript.jscomp.regex.RegExpTree.IE_SPEC_ERRORS.contains(start)) && (com.google.javascript.jscomp.regex.RegExpTree.IE_SPEC_ERRORS.contains(end))) {
						ieExplicits = ieExplicits.union(range.intersection(com.google.javascript.jscomp.regex.RegExpTree.IE_SPEC_ERRORS));
					}
					if (isCaseInsensitive) {
						ranges = com.google.javascript.jscomp.regex.CaseCanonicalize.expandToAllMatched(ranges);
					}
				} 
				++(pos);
				if (inverse) {
					ranges = com.google.javascript.jscomp.regex.CharRanges.ALL_CODE_UNITS.difference(ranges);
				}
				return new com.google.javascript.jscomp.regex.RegExpTree.Charset(ranges, ieExplicits);
			}

			private char parseEscapeChar() {
				char ch = pattern.charAt(((pos)++));
				switch (ch) {
					case 'b' :
						return '\b';
					case 'f' :
						return '\f';
					case 'n' :
						return '\n';
					case 'r' :
						return '\r';
					case 't' :
						return '\t';
					case 'u' :
						return parseHex(4);
					case 'v' :
						return '';
					case 'x' :
						return parseHex(2);
					default :
						if (('0' <= ch) && (ch <= '7')) {
							char codeUnit = ((char) (ch - '0'));
							int octLimit = java.lang.Math.min(limit, (((pos) + (ch <= '3' ? 2 : 1)) + (ch == '0' ? 1 : 0)));
							while ((pos) < octLimit) {
								ch = pattern.charAt(pos);
								if (('0' <= ch) && (ch <= '7')) {
									codeUnit = ((char) ((codeUnit << 3) + (ch - '0')));
									++(pos);
								}else {
									break;
								}
							} 
							return codeUnit;
						}
						return ch;
				}
			}

			private com.google.javascript.jscomp.regex.RegExpTree parseEscape() {
				com.google.common.base.Preconditions.checkState(((pattern.charAt(pos)) == '\\'));
				++(pos);
				char ch = pattern.charAt(pos);
				if ((ch == 'b') || (ch == 'B')) {
					++(pos);
					return new com.google.javascript.jscomp.regex.RegExpTree.WordBoundary(ch);
				}else
					if (('1' <= ch) && (ch <= '9')) {
						++(pos);
						int possibleGroupIndex = ch - '0';
						if ((numCapturingGroups) >= possibleGroupIndex) {
							if ((pos) < (limit)) {
								char next = pattern.charAt(pos);
								if (('0' <= next) && (next <= '9')) {
									int twoDigitGroupIndex = (possibleGroupIndex * 10) + (next - '0');
									if ((numCapturingGroups) >= twoDigitGroupIndex) {
										++(pos);
										possibleGroupIndex = twoDigitGroupIndex;
									}
								}
							}
							return new com.google.javascript.jscomp.regex.RegExpTree.BackReference(possibleGroupIndex);
						}else {
							return new com.google.javascript.jscomp.regex.RegExpTree.Text(java.lang.Character.toString((possibleGroupIndex <= 7 ? ((char) (possibleGroupIndex)) : ch)));
						}
					}else {
						com.google.javascript.jscomp.regex.CharRanges charGroup = com.google.javascript.jscomp.regex.RegExpTree.NAMED_CHAR_GROUPS.get(ch);
						if (charGroup != null) {
							++(pos);
							return new com.google.javascript.jscomp.regex.RegExpTree.Charset(charGroup, com.google.javascript.jscomp.regex.CharRanges.EMPTY);
						}
						return new com.google.javascript.jscomp.regex.RegExpTree.Text(("" + (parseEscapeChar())));
					}
				
			}

			private char parseHex(int n) {
				if (((pos) + n) > (limit)) {
					throw new java.lang.IllegalArgumentException(("Abbreviated hex escape " + (pattern.substring(pos))));
				}
				int result = 0;
				while ((--n) >= 0) {
					char ch = pattern.charAt(pos);
					int digit;
					if (('0' <= ch) && (ch <= '9')) {
						digit = ch - '0';
					}else
						if (('a' <= ch) && (ch <= 'f')) {
							digit = ch + (10 - 'a');
						}else
							if (('A' <= ch) && (ch <= 'F')) {
								digit = ch + (10 - 'A');
							}else {
								throw new java.lang.IllegalArgumentException(pattern.substring(pos));
							}
						
					
					++(pos);
					result = (result << 4) | digit;
				} 
				return ((char) (result));
			}

			private boolean isRepetitionStart(char ch) {
				switch (ch) {
					case '?' :
					case '*' :
					case '+' :
					case '{' :
						return true;
					default :
						return false;
				}
			}

			private com.google.javascript.jscomp.regex.RegExpTree parseRepetition(com.google.javascript.jscomp.regex.RegExpTree body) {
				if ((pos) == (limit)) {
					return body;
				}
				int min;
				int max;
				switch (pattern.charAt(pos)) {
					case '+' :
						++(pos);
						min = 1;
						max = java.lang.Integer.MAX_VALUE;
						break;
					case '*' :
						++(pos);
						min = 0;
						max = java.lang.Integer.MAX_VALUE;
						break;
					case '?' :
						++(pos);
						min = 0;
						max = 1;
						break;
					case '{' :
						++(pos);
						int start = pos;
						int end = pattern.indexOf('}', start);
						if (end < 0) {
							pos = start - 1;
							return body;
						}
						java.lang.String counts = pattern.substring(start, end);
						pos = end + 1;
						int comma = counts.indexOf(',');
						try {
							min = java.lang.Integer.parseInt((comma >= 0 ? counts.substring(0, comma) : counts));
							max = (comma >= 0) ? (comma + 1) != (counts.length()) ? java.lang.Integer.parseInt(counts.substring((comma + 1))) : java.lang.Integer.MAX_VALUE : min;
						} catch (java.lang.NumberFormatException ex) {
							min = max = -1;
						}
						if ((min < 0) || (min > max)) {
							pos = start - 1;
							return body;
						}
						break;
					default :
						return body;
				}
				boolean greedy = true;
				if (((pos) < (limit)) && ((pattern.charAt(pos)) == '?')) {
					greedy = false;
					++(pos);
				}
				return new com.google.javascript.jscomp.regex.RegExpTree.Repetition(body, min, max, greedy);
			}
		}
		return new Parser().parseTopLevel();
	}

	public static boolean matchesWholeInput(com.google.javascript.jscomp.regex.RegExpTree t, java.lang.String flags) {
		if ((flags.indexOf('m')) >= 0) {
			return false;
		}
		if (!(t instanceof com.google.javascript.jscomp.regex.RegExpTree.Concatenation)) {
			return false;
		}
		com.google.javascript.jscomp.regex.RegExpTree.Concatenation c = ((com.google.javascript.jscomp.regex.RegExpTree.Concatenation) (t));
		if (c.elements.isEmpty()) {
			return false;
		}
		com.google.javascript.jscomp.regex.RegExpTree first = c.elements.get(0);
		com.google.javascript.jscomp.regex.RegExpTree last = c.elements.get(((c.elements.size()) - 1));
		if (!((first instanceof com.google.javascript.jscomp.regex.RegExpTree.Anchor) && (last instanceof com.google.javascript.jscomp.regex.RegExpTree.Anchor))) {
			return false;
		}
		return ((((com.google.javascript.jscomp.regex.RegExpTree.Anchor) (first)).type) == '^') && ((((com.google.javascript.jscomp.regex.RegExpTree.Anchor) (last)).type) == '$');
	}

	abstract static class RegExpTreeAtom extends com.google.javascript.jscomp.regex.RegExpTree {
		@java.lang.Override
		public boolean isCaseSensitive() {
			return false;
		}

		@java.lang.Override
		public boolean containsAnchor() {
			return false;
		}

		@java.lang.Override
		public final int numCapturingGroups() {
			return 0;
		}

		@java.lang.Override
		public final java.util.List<? extends com.google.javascript.jscomp.regex.RegExpTree> children() {
			return com.google.common.collect.ImmutableList.of();
		}
	}

	static final class Empty extends com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom {
		static final com.google.javascript.jscomp.regex.RegExpTree.Empty INSTANCE = new com.google.javascript.jscomp.regex.RegExpTree.Empty();

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			return com.google.javascript.jscomp.regex.RegExpTree.Empty.this;
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return o instanceof com.google.javascript.jscomp.regex.RegExpTree.Empty;
		}

		@java.lang.Override
		public int hashCode() {
			return 2128634177;
		}
	}

	static final class Anchor extends com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom {
		final char type;

		Anchor(char type) {
			this.type = type;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			return com.google.javascript.jscomp.regex.RegExpTree.Anchor.this;
		}

		@java.lang.Override
		public boolean containsAnchor() {
			return true;
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			sb.append(type);
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
			sb.append(type);
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return (o instanceof com.google.javascript.jscomp.regex.RegExpTree.Anchor) && ((type) == (((com.google.javascript.jscomp.regex.RegExpTree.Anchor) (o)).type));
		}

		@java.lang.Override
		public int hashCode() {
			return (type) ^ -397207553;
		}
	}

	static final class WordBoundary extends com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom {
		final char type;

		WordBoundary(char type) {
			this.type = type;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			return com.google.javascript.jscomp.regex.RegExpTree.WordBoundary.this;
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			sb.append('\\').append(type);
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
			sb.append(type);
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return (o instanceof com.google.javascript.jscomp.regex.RegExpTree.WordBoundary) && ((type) == (((com.google.javascript.jscomp.regex.RegExpTree.WordBoundary) (o)).type));
		}

		@java.lang.Override
		public int hashCode() {
			return 1450420777 ^ (type);
		}
	}

	static final class BackReference extends com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom {
		final int groupIndex;

		BackReference(int groupIndex) {
			com.google.common.base.Preconditions.checkArgument(((groupIndex >= 0) && (groupIndex <= 99)));
			this.groupIndex = groupIndex;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			return com.google.javascript.jscomp.regex.RegExpTree.BackReference.this;
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			sb.append('\\').append(groupIndex);
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
			sb.append(groupIndex);
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return (o instanceof com.google.javascript.jscomp.regex.RegExpTree.BackReference) && ((groupIndex) == (((com.google.javascript.jscomp.regex.RegExpTree.BackReference) (o)).groupIndex));
		}

		@java.lang.Override
		public int hashCode() {
			return -16308637 ^ (groupIndex);
		}
	}

	static final class Text extends com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom {
		final java.lang.String text;

		Text(java.lang.String text) {
			this.text = text;
		}

		private static void escapeRegularCharOnto(char ch, int next, java.lang.StringBuilder sb) {
			switch (ch) {
				case '$' :
				case '^' :
				case '*' :
				case '(' :
				case ')' :
				case '+' :
				case '[' :
				case '|' :
				case '.' :
				case '/' :
				case '?' :
					sb.append('\\').append(ch);
					break;
				case '{' :
					if (('0' <= next) && (next <= '9')) {
						sb.append('\\');
					}
					sb.append(ch);
					break;
				default :
					com.google.javascript.jscomp.regex.RegExpTree.escapeCharOnto(ch, sb);
			}
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			int n = text.length();
			if (n == 0) {
				return com.google.javascript.jscomp.regex.RegExpTree.Empty.INSTANCE;
			}
			if ((flags.indexOf('i')) >= 0) {
				java.lang.String canonicalized = com.google.javascript.jscomp.regex.CaseCanonicalize.caseCanonicalize(text);
				if ((text) != canonicalized) {
					return new com.google.javascript.jscomp.regex.RegExpTree.Text(canonicalized);
				}
			}
			return com.google.javascript.jscomp.regex.RegExpTree.Text.this;
		}

		@java.lang.Override
		public boolean isCaseSensitive() {
			for (int i = 0, n = text.length(); i < n; ++i) {
				if (com.google.javascript.jscomp.regex.CaseCanonicalize.CASE_SENSITIVE.contains(text.charAt(i))) {
					return true;
				}
			}
			return false;
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			for (int i = 0, n = text.length(); i < n; ++i) {
				com.google.javascript.jscomp.regex.RegExpTree.Text.escapeRegularCharOnto(text.charAt(i), ((i + 1) < n ? text.charAt((i + 1)) : -1), sb);
			}
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
			sb.append('`').append(text).append('`');
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return (o instanceof com.google.javascript.jscomp.regex.RegExpTree.Text) && (text.equals(((com.google.javascript.jscomp.regex.RegExpTree.Text) (o)).text));
		}

		@java.lang.Override
		public int hashCode() {
			return (text.hashCode()) ^ 102228752;
		}
	}

	static final class Repetition extends com.google.javascript.jscomp.regex.RegExpTree {
		final com.google.javascript.jscomp.regex.RegExpTree body;

		final int min;

		final int max;

		final boolean greedy;

		Repetition(com.google.javascript.jscomp.regex.RegExpTree body, int min, int max, boolean greedy) {
			this.body = body;
			this.min = min;
			this.max = max;
			this.greedy = greedy;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			com.google.javascript.jscomp.regex.RegExpTree body = com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.body.simplify(flags);
			if (((max) == 0) && (!(body.hasCapturingGroup()))) {
				return com.google.javascript.jscomp.regex.RegExpTree.Empty.INSTANCE;
			}
			if ((body instanceof com.google.javascript.jscomp.regex.RegExpTree.Empty) || (com.google.javascript.jscomp.regex.RegExpTree.NEVER_MATCHES.equals(body))) {
				return body;
			}
			int min = com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.min;
			int max = com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.max;
			if (body instanceof com.google.javascript.jscomp.regex.RegExpTree.Repetition) {
				com.google.javascript.jscomp.regex.RegExpTree.Repetition rbody = ((com.google.javascript.jscomp.regex.RegExpTree.Repetition) (body));
				if ((rbody.greedy) == (greedy)) {
					long lmin = ((long) (min)) * (rbody.min);
					long lmax = ((long) (max)) * (rbody.max);
					if (lmin < (java.lang.Integer.MAX_VALUE)) {
						body = rbody.body;
						min = ((int) (lmin));
						max = (lmax >= (java.lang.Integer.MAX_VALUE)) ? java.lang.Integer.MAX_VALUE : ((int) (lmax));
					}
				}
			}
			if ((min == 1) && (max == 1)) {
				return body;
			}
			boolean greedy = (com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.greedy) || (min == max);
			return (((body.equals(com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.body)) && (min == (com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.min))) && (max == (com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.max))) && (greedy == (com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.greedy)) ? com.google.javascript.jscomp.regex.RegExpTree.Repetition.this : new com.google.javascript.jscomp.regex.RegExpTree.Repetition(body, min, max, greedy).simplify(flags);
		}

		@java.lang.Override
		public boolean isCaseSensitive() {
			return body.isCaseSensitive();
		}

		@java.lang.Override
		public boolean containsAnchor() {
			return body.containsAnchor();
		}

		@java.lang.Override
		public int numCapturingGroups() {
			return body.numCapturingGroups();
		}

		@java.lang.Override
		public java.util.List<? extends com.google.javascript.jscomp.regex.RegExpTree> children() {
			return com.google.common.collect.ImmutableList.of(body);
		}

		private void appendBodySourceCode(java.lang.StringBuilder sb) {
			if (((((body) instanceof com.google.javascript.jscomp.regex.RegExpTree.Alternation) || ((body) instanceof com.google.javascript.jscomp.regex.RegExpTree.Concatenation)) || ((body) instanceof com.google.javascript.jscomp.regex.RegExpTree.Repetition)) || (((body) instanceof com.google.javascript.jscomp.regex.RegExpTree.Text) && ((((com.google.javascript.jscomp.regex.RegExpTree.Text) (body)).text.length()) > 1))) {
				sb.append("(?:");
				body.appendSourceCode(sb);
				sb.append(')');
			}else {
				body.appendSourceCode(sb);
			}
		}

		private static int suffixLen(int min, int max) {
			if (max == (java.lang.Integer.MAX_VALUE)) {
				switch (min) {
					case 0 :
						return 1;
					case 1 :
						return 1;
					default :
						return 3 + (com.google.javascript.jscomp.regex.RegExpTree.Repetition.numDecimalDigits(min));
				}
			}
			if ((min == 0) && (max == 1)) {
				return 1;
			}
			if (min == max) {
				if (min == 1) {
					return 0;
				}
				return 2 + (com.google.javascript.jscomp.regex.RegExpTree.Repetition.numDecimalDigits(min));
			}
			return (3 + (com.google.javascript.jscomp.regex.RegExpTree.Repetition.numDecimalDigits(min))) + (com.google.javascript.jscomp.regex.RegExpTree.Repetition.numDecimalDigits(max));
		}

		private static int numDecimalDigits(int n) {
			if (n < 0) {
				throw new java.lang.AssertionError();
			}
			int nDigits = 1;
			while (n >= 10) {
				++nDigits;
				n /= 10;
			} 
			return nDigits;
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			int bodyStart = sb.length();
			appendBodySourceCode(sb);
			int bodyEnd = sb.length();
			int bodyLen = bodyEnd - bodyStart;
			int min = com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.min;
			int max = com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.max;
			if (((min >= 2) && (max == (java.lang.Integer.MAX_VALUE))) || ((max - min) <= 1)) {
				int expanded = (min == max) || (max == (java.lang.Integer.MAX_VALUE)) ? min - 1 : min;
				int expandedMin = min - expanded;
				int expandedMax = max == (java.lang.Integer.MAX_VALUE) ? max : max - expanded;
				int suffixLen = com.google.javascript.jscomp.regex.RegExpTree.Repetition.suffixLen(min, max);
				int expandedSuffixLen = com.google.javascript.jscomp.regex.RegExpTree.Repetition.suffixLen(expandedMin, expandedMax);
				if ((((bodyLen * expanded) + expandedSuffixLen) < suffixLen) && (!(body.hasCapturingGroup()))) {
					while ((--expanded) >= 0) {
						sb.append(sb, bodyStart, bodyEnd);
					} 
					min = expandedMin;
					max = expandedMax;
				}
			}
			if (max == (java.lang.Integer.MAX_VALUE)) {
				switch (min) {
					case 0 :
						sb.append('*');
						break;
					case 1 :
						sb.append('+');
						break;
					default :
						sb.append('{').append(min).append(",}");
				}
			}else
				if ((min == 0) && (max == 1)) {
					sb.append('?');
				}else
					if (min == max) {
						if (min != 1) {
							sb.append('{').append(min).append('}');
						}
					}else {
						sb.append('{').append(min).append(',').append(max).append('}');
					}
				
			
			if (!(greedy)) {
				sb.append('?');
			}
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
			sb.append(" min=").append(min).append(", max=").append(max);
			if (!(greedy)) {
				sb.append("  not_greedy");
			}
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			if (!(o instanceof com.google.javascript.jscomp.regex.RegExpTree.Repetition)) {
				return false;
			}
			com.google.javascript.jscomp.regex.RegExpTree.Repetition that = ((com.google.javascript.jscomp.regex.RegExpTree.Repetition) (o));
			return (((com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.body.equals(that.body)) && ((com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.min) == (that.min))) && ((com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.max) == (that.max))) && ((com.google.javascript.jscomp.regex.RegExpTree.Repetition.this.greedy) == (that.greedy));
		}

		@java.lang.Override
		public int hashCode() {
			return (min) + (31 * ((max) + (31 * ((greedy ? 1 : 0) + (31 * (body.hashCode()))))));
		}
	}

	static final class Alternation extends com.google.javascript.jscomp.regex.RegExpTree {
		final com.google.common.collect.ImmutableList<com.google.javascript.jscomp.regex.RegExpTree> alternatives;

		Alternation(java.util.List<? extends com.google.javascript.jscomp.regex.RegExpTree> alternatives) {
			this.alternatives = com.google.common.collect.ImmutableList.copyOf(alternatives);
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			java.util.List<com.google.javascript.jscomp.regex.RegExpTree> alternatives = com.google.common.collect.Lists.newArrayList();
			for (com.google.javascript.jscomp.regex.RegExpTree alternative : com.google.javascript.jscomp.regex.RegExpTree.Alternation.this.alternatives) {
				alternative = alternative.simplify(flags);
				if (alternative instanceof com.google.javascript.jscomp.regex.RegExpTree.Alternation) {
					alternatives.addAll(((com.google.javascript.jscomp.regex.RegExpTree.Alternation) (alternative)).alternatives);
				}else {
					alternatives.add(alternative);
				}
			}
			com.google.javascript.jscomp.regex.RegExpTree last = null;
			for (java.util.Iterator<com.google.javascript.jscomp.regex.RegExpTree> it = alternatives.iterator(); it.hasNext();) {
				com.google.javascript.jscomp.regex.RegExpTree alternative = it.next();
				if (alternative.equals(com.google.javascript.jscomp.regex.RegExpTree.NEVER_MATCHES)) {
					continue;
				}
				if ((alternative.equals(last)) && (!(alternative.hasCapturingGroup()))) {
					it.remove();
				}else {
					last = alternative;
				}
			}
			for (int i = 0, n = alternatives.size(); i < n; ++i) {
				com.google.javascript.jscomp.regex.RegExpTree alternative = alternatives.get(i);
				if (((alternative instanceof com.google.javascript.jscomp.regex.RegExpTree.Text) && ((((com.google.javascript.jscomp.regex.RegExpTree.Text) (alternative)).text.length()) == 1)) || (alternative instanceof com.google.javascript.jscomp.regex.RegExpTree.Charset)) {
					int end = i;
					int nCharsets = 0;
					while (end < n) {
						com.google.javascript.jscomp.regex.RegExpTree follower = alternatives.get(end);
						if (follower instanceof com.google.javascript.jscomp.regex.RegExpTree.Charset) {
							++nCharsets;
						}else
							if (!((follower instanceof com.google.javascript.jscomp.regex.RegExpTree.Text) && ((((com.google.javascript.jscomp.regex.RegExpTree.Text) (follower)).text.length()) == 1))) {
								break;
							}
						
						++end;
					} 
					if (((end - i) >= 3) || ((nCharsets != 0) && ((end - i) >= 2))) {
						int[] members = new int[(end - i) - nCharsets];
						int memberIdx = 0;
						com.google.javascript.jscomp.regex.CharRanges chars = com.google.javascript.jscomp.regex.CharRanges.EMPTY;
						com.google.javascript.jscomp.regex.CharRanges ieExplicits = com.google.javascript.jscomp.regex.CharRanges.EMPTY;
						java.util.List<com.google.javascript.jscomp.regex.RegExpTree> charAlternatives = alternatives.subList(i, end);
						for (com.google.javascript.jscomp.regex.RegExpTree charAlternative : charAlternatives) {
							if (charAlternative instanceof com.google.javascript.jscomp.regex.RegExpTree.Text) {
								char ch = ((com.google.javascript.jscomp.regex.RegExpTree.Text) (charAlternative)).text.charAt(0);
								members[(memberIdx++)] = ch;
								if (com.google.javascript.jscomp.regex.RegExpTree.IE_SPEC_ERRORS.contains(ch)) {
									ieExplicits = ieExplicits.union(com.google.javascript.jscomp.regex.CharRanges.inclusive(ch, ch));
								}
							}else
								if (charAlternative instanceof com.google.javascript.jscomp.regex.RegExpTree.Charset) {
									com.google.javascript.jscomp.regex.RegExpTree.Charset cs = ((com.google.javascript.jscomp.regex.RegExpTree.Charset) (charAlternative));
									chars = chars.union(cs.ranges);
									ieExplicits = ieExplicits.union(cs.ieExplicits);
								}
							
						}
						chars = chars.union(com.google.javascript.jscomp.regex.CharRanges.withMembers(members));
						charAlternatives.clear();
						charAlternatives.add(new com.google.javascript.jscomp.regex.RegExpTree.Charset(chars, ieExplicits).simplify(flags));
						n = alternatives.size();
					}
				}
			}
			switch (alternatives.size()) {
				case 0 :
					return com.google.javascript.jscomp.regex.RegExpTree.Empty.INSTANCE;
				case 1 :
					return alternatives.get(0);
				case 2 :
					if ((alternatives.get(1)) instanceof com.google.javascript.jscomp.regex.RegExpTree.Empty) {
						return new com.google.javascript.jscomp.regex.RegExpTree.Repetition(alternatives.get(0), 0, 1, true);
					}else
						if ((alternatives.get(0)) instanceof com.google.javascript.jscomp.regex.RegExpTree.Empty) {
							return new com.google.javascript.jscomp.regex.RegExpTree.Repetition(alternatives.get(1), 0, 1, false);
						}
					
					break;
			}
			return alternatives.equals(com.google.javascript.jscomp.regex.RegExpTree.Alternation.this.alternatives) ? com.google.javascript.jscomp.regex.RegExpTree.Alternation.this : new com.google.javascript.jscomp.regex.RegExpTree.Alternation(alternatives);
		}

		@java.lang.Override
		public boolean isCaseSensitive() {
			for (com.google.javascript.jscomp.regex.RegExpTree alternative : alternatives) {
				if (alternative.isCaseSensitive()) {
					return true;
				}
			}
			return false;
		}

		@java.lang.Override
		public boolean containsAnchor() {
			for (com.google.javascript.jscomp.regex.RegExpTree alternative : alternatives) {
				if (alternative.containsAnchor()) {
					return true;
				}
			}
			return false;
		}

		@java.lang.Override
		public int numCapturingGroups() {
			int n = 0;
			for (com.google.javascript.jscomp.regex.RegExpTree alternative : alternatives) {
				n += alternative.numCapturingGroups();
			}
			return n;
		}

		@java.lang.Override
		public java.util.List<? extends com.google.javascript.jscomp.regex.RegExpTree> children() {
			return alternatives;
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			for (int i = 0, n = alternatives.size(); i < n; ++i) {
				if (i != 0) {
					sb.append('|');
				}
				alternatives.get(i).appendSourceCode(sb);
			}
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return ((com.google.javascript.jscomp.regex.RegExpTree.Alternation.this) == o) || ((o instanceof com.google.javascript.jscomp.regex.RegExpTree.Alternation) && (alternatives.equals(((com.google.javascript.jscomp.regex.RegExpTree.Alternation) (o)).alternatives)));
		}

		@java.lang.Override
		public int hashCode() {
			return 1370848465 ^ (alternatives.hashCode());
		}
	}

	private static final com.google.javascript.jscomp.regex.RegExpTree NEVER_MATCHES = new com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion(com.google.javascript.jscomp.regex.RegExpTree.Empty.INSTANCE, false);

	static final class LookaheadAssertion extends com.google.javascript.jscomp.regex.RegExpTree {
		final com.google.javascript.jscomp.regex.RegExpTree body;

		final boolean positive;

		LookaheadAssertion(com.google.javascript.jscomp.regex.RegExpTree body, boolean positive) {
			this.body = body;
			this.positive = positive;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			com.google.javascript.jscomp.regex.RegExpTree simpleBody = body.simplify(flags);
			if (simpleBody instanceof com.google.javascript.jscomp.regex.RegExpTree.Empty) {
				if (positive) {
					return simpleBody;
				}
			}
			return new com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion(simpleBody, positive);
		}

		@java.lang.Override
		public boolean isCaseSensitive() {
			return body.isCaseSensitive();
		}

		@java.lang.Override
		public boolean containsAnchor() {
			return body.containsAnchor();
		}

		@java.lang.Override
		public int numCapturingGroups() {
			return body.numCapturingGroups();
		}

		@java.lang.Override
		public java.util.List<? extends com.google.javascript.jscomp.regex.RegExpTree> children() {
			return com.google.common.collect.ImmutableList.of(body);
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			sb.append((positive ? "(?=" : "(?!"));
			body.appendSourceCode(sb);
			sb.append(')');
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
			sb.append((positive ? "positive" : "negative"));
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			if (!(o instanceof com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion)) {
				return false;
			}
			com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion that = ((com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion) (o));
			return ((com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.this.positive) == (that.positive)) && (com.google.javascript.jscomp.regex.RegExpTree.LookaheadAssertion.this.body.equals(that.body));
		}

		@java.lang.Override
		public int hashCode() {
			return 119778217 ^ (body.hashCode());
		}
	}

	static final class CapturingGroup extends com.google.javascript.jscomp.regex.RegExpTree {
		final com.google.javascript.jscomp.regex.RegExpTree body;

		CapturingGroup(com.google.javascript.jscomp.regex.RegExpTree body) {
			this.body = body;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			return new com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup(body.simplify(flags));
		}

		@java.lang.Override
		public boolean isCaseSensitive() {
			return body.isCaseSensitive();
		}

		@java.lang.Override
		public boolean containsAnchor() {
			return body.containsAnchor();
		}

		@java.lang.Override
		public int numCapturingGroups() {
			return 1;
		}

		@java.lang.Override
		public java.util.List<? extends com.google.javascript.jscomp.regex.RegExpTree> children() {
			return com.google.common.collect.ImmutableList.of(body);
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			sb.append('(');
			body.appendSourceCode(sb);
			sb.append(')');
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return (o instanceof com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup) && (body.equals(((com.google.javascript.jscomp.regex.RegExpTree.CapturingGroup) (o)).body));
		}

		@java.lang.Override
		public int hashCode() {
			return 1433933624 ^ (body.hashCode());
		}
	}

	private static final com.google.javascript.jscomp.regex.CharRanges DIGITS = com.google.javascript.jscomp.regex.CharRanges.inclusive('0', '9');

	private static final com.google.javascript.jscomp.regex.CharRanges UCASE_LETTERS = com.google.javascript.jscomp.regex.CharRanges.inclusive('A', 'Z');

	private static final com.google.javascript.jscomp.regex.CharRanges LCASE_LETTERS = com.google.javascript.jscomp.regex.CharRanges.inclusive('a', 'z');

	private static final com.google.javascript.jscomp.regex.CharRanges LETTERS = com.google.javascript.jscomp.regex.RegExpTree.UCASE_LETTERS.union(com.google.javascript.jscomp.regex.RegExpTree.LCASE_LETTERS);

	private static final com.google.javascript.jscomp.regex.CharRanges WORD_CHARS = com.google.javascript.jscomp.regex.RegExpTree.DIGITS.union(com.google.javascript.jscomp.regex.RegExpTree.LETTERS).union(com.google.javascript.jscomp.regex.CharRanges.withMembers('_'));

	private static final com.google.javascript.jscomp.regex.CharRanges INVERSE_WORD_CHARS = com.google.javascript.jscomp.regex.CharRanges.ALL_CODE_UNITS.difference(com.google.javascript.jscomp.regex.RegExpTree.WORD_CHARS);

	private static final com.google.javascript.jscomp.regex.CharRanges SPACE_CHARS = com.google.javascript.jscomp.regex.CharRanges.withMembers('\t', '\n', '', '\f', '\r', ' ', '\u00a0', '\u1680', '\u180e', '\u2000', '\u2001', '\u2002', '\u2003', '\u2004', '\u2005', '\u2006', '\u2007', '\u2008', '\u2009', '\u200a', '\u2028', '\u2029', '\u202f', '\u205f', '\u3000', '\ufeff');

	private static final com.google.javascript.jscomp.regex.CharRanges IE_SPACE_CHARS = com.google.javascript.jscomp.regex.CharRanges.withMembers('\t', '\n', '', '\f', '\r', ' ');

	private static final com.google.javascript.jscomp.regex.CharRanges IE_SPEC_ERRORS = com.google.javascript.jscomp.regex.RegExpTree.SPACE_CHARS.difference(com.google.javascript.jscomp.regex.RegExpTree.IE_SPACE_CHARS);

	private static final com.google.common.collect.ImmutableMap<java.lang.Character, com.google.javascript.jscomp.regex.CharRanges> NAMED_CHAR_GROUPS = com.google.common.collect.ImmutableMap.<java.lang.Character, com.google.javascript.jscomp.regex.CharRanges>builder().put('d', com.google.javascript.jscomp.regex.RegExpTree.DIGITS).put('D', com.google.javascript.jscomp.regex.CharRanges.ALL_CODE_UNITS.difference(com.google.javascript.jscomp.regex.RegExpTree.DIGITS)).put('s', com.google.javascript.jscomp.regex.RegExpTree.SPACE_CHARS).put('S', com.google.javascript.jscomp.regex.CharRanges.ALL_CODE_UNITS.difference(com.google.javascript.jscomp.regex.RegExpTree.SPACE_CHARS)).put('w', com.google.javascript.jscomp.regex.RegExpTree.WORD_CHARS).put('W', com.google.javascript.jscomp.regex.RegExpTree.INVERSE_WORD_CHARS).build();

	private static final com.google.javascript.jscomp.regex.RegExpTree.Charset DOT_CHARSET = new com.google.javascript.jscomp.regex.RegExpTree.Charset(com.google.javascript.jscomp.regex.CharRanges.ALL_CODE_UNITS.difference(com.google.javascript.jscomp.regex.CharRanges.withMembers('\n', '\r', '\u2028', '\u2029')), com.google.javascript.jscomp.regex.CharRanges.EMPTY);

	static final class Charset extends com.google.javascript.jscomp.regex.RegExpTree.RegExpTreeAtom {
		final com.google.javascript.jscomp.regex.CharRanges ranges;

		final com.google.javascript.jscomp.regex.CharRanges ieExplicits;

		Charset(com.google.javascript.jscomp.regex.CharRanges ranges, com.google.javascript.jscomp.regex.CharRanges ieExplicits) {
			this.ranges = ranges;
			this.ieExplicits = ieExplicits;
		}

		private static int complexityWordFolded(com.google.javascript.jscomp.regex.CharRanges ranges) {
			return java.lang.Math.min(com.google.javascript.jscomp.regex.RegExpTree.Charset.complexityWordFoldedHelper(ranges), (1 + (com.google.javascript.jscomp.regex.RegExpTree.Charset.complexityWordFoldedHelper(com.google.javascript.jscomp.regex.CharRanges.ALL_CODE_UNITS.difference(ranges)))));
		}

		private static int complexityWordFoldedHelper(com.google.javascript.jscomp.regex.CharRanges ranges) {
			int complexity = com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.complexity(ranges);
			if (ranges.containsAll(com.google.javascript.jscomp.regex.RegExpTree.WORD_CHARS)) {
				complexity = java.lang.Math.min(complexity, (1 + (com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.complexity(ranges.difference(com.google.javascript.jscomp.regex.RegExpTree.WORD_CHARS)))));
			}
			if (ranges.containsAll(com.google.javascript.jscomp.regex.RegExpTree.INVERSE_WORD_CHARS)) {
				complexity = java.lang.Math.min(complexity, (1 + (com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.complexity(ranges.difference(com.google.javascript.jscomp.regex.RegExpTree.INVERSE_WORD_CHARS)))));
			}
			return complexity;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(java.lang.String flags) {
			if (ranges.isEmpty()) {
				return com.google.javascript.jscomp.regex.RegExpTree.NEVER_MATCHES;
			}
			com.google.javascript.jscomp.regex.CharRanges best = ranges;
			if ((flags.indexOf('i')) >= 0) {
				java.util.Set<com.google.javascript.jscomp.regex.CharRanges> options = com.google.common.collect.Sets.newLinkedHashSet();
				options.add(com.google.javascript.jscomp.regex.CaseCanonicalize.expandToAllMatched(ranges));
				options.add(com.google.javascript.jscomp.regex.CaseCanonicalize.reduceToMinimum(ranges));
				com.google.javascript.jscomp.regex.CharRanges lcaseLetters = ranges.intersection(com.google.javascript.jscomp.regex.RegExpTree.LCASE_LETTERS);
				com.google.javascript.jscomp.regex.CharRanges ucaseLetters = ranges.intersection(com.google.javascript.jscomp.regex.RegExpTree.UCASE_LETTERS);
				com.google.javascript.jscomp.regex.CharRanges lcaseLettersToUpper = lcaseLetters.shift((-32));
				com.google.javascript.jscomp.regex.CharRanges ucaseLettersToLower = ucaseLetters.shift(32);
				options.add(ranges.union(ucaseLettersToLower));
				options.add(ranges.union(lcaseLettersToUpper));
				options.add(ranges.union(lcaseLettersToUpper).union(ucaseLettersToLower));
				options.add(ranges.union(ucaseLettersToLower).difference(ucaseLetters));
				options.add(ranges.union(lcaseLettersToUpper).difference(lcaseLetters));
				int bestComplexity = com.google.javascript.jscomp.regex.RegExpTree.Charset.complexityWordFolded(ranges);
				for (com.google.javascript.jscomp.regex.CharRanges option : options) {
					int complexity = com.google.javascript.jscomp.regex.RegExpTree.Charset.complexityWordFolded(option);
					if (complexity < bestComplexity) {
						bestComplexity = complexity;
						best = option;
					}
				}
			}
			if (((best.getNumRanges()) == 1) && (((best.end(0)) - (best.start(0))) == 1)) {
				return new com.google.javascript.jscomp.regex.RegExpTree.Text(java.lang.Character.toString(((char) (best.start(0)))));
			}
			if (!(best.equals(ranges))) {
				return new com.google.javascript.jscomp.regex.RegExpTree.Charset(best, ieExplicits);
			}
			return com.google.javascript.jscomp.regex.RegExpTree.Charset.this;
		}

		@java.lang.Override
		public boolean isCaseSensitive() {
			com.google.javascript.jscomp.regex.CharRanges withoutNamedGroups = decompose().ranges;
			return !(withoutNamedGroups.equals(com.google.javascript.jscomp.regex.CaseCanonicalize.expandToAllMatched(withoutNamedGroups)));
		}

		private com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset decompose(com.google.javascript.jscomp.regex.CharRanges ranges, boolean inverted) {
			java.lang.StringBuilder namedGroups = new java.lang.StringBuilder();
			com.google.javascript.jscomp.regex.CharRanges rangesInterIeExplicits = ranges.intersection(ieExplicits);
			while (true) {
				char groupName = 0;
				com.google.javascript.jscomp.regex.CharRanges simplest = null;
				int minComplexity = com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.complexity(ranges);
				for (java.util.Map.Entry<java.lang.Character, com.google.javascript.jscomp.regex.CharRanges> namedGroup : com.google.javascript.jscomp.regex.RegExpTree.NAMED_CHAR_GROUPS.entrySet()) {
					com.google.javascript.jscomp.regex.CharRanges group = namedGroup.getValue();
					if (ranges.containsAll(group)) {
						com.google.javascript.jscomp.regex.CharRanges withoutGroup = ranges.difference(group).union(rangesInterIeExplicits);
						int complexity = com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.complexity(withoutGroup);
						if (complexity < minComplexity) {
							simplest = withoutGroup;
							groupName = namedGroup.getKey().charValue();
							minComplexity = complexity;
						}
					}
				}
				if (simplest != null) {
					namedGroups.append('\\').append(groupName);
					ranges = simplest;
				}else {
					break;
				}
			} 
			return new com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset(inverted, ranges, namedGroups.toString());
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			if (com.google.javascript.jscomp.regex.RegExpTree.DOT_CHARSET.ranges.equals(ranges)) {
				sb.append('.');
				return ;
			}
			decompose().appendSourceCode(sb);
		}

		com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset decompose() {
			com.google.javascript.jscomp.regex.CharRanges negRanges = com.google.javascript.jscomp.regex.CharRanges.ALL_CODE_UNITS.difference(ranges);
			if (!(ieExplicits.isEmpty())) {
				if (negRanges.intersection(ieExplicits).isEmpty()) {
					return decompose(ranges, false);
				}else
					if (ranges.intersection(ieExplicits).isEmpty()) {
						return decompose(negRanges, true);
					}
				
			}
			com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset positive = decompose(ranges, false);
			com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset negative = decompose(negRanges, true);
			return (positive.complexity()) <= (negative.complexity()) ? positive : negative;
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
			sb.append(ranges);
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return (o instanceof com.google.javascript.jscomp.regex.RegExpTree.Charset) && (ranges.equals(((com.google.javascript.jscomp.regex.RegExpTree.Charset) (o)).ranges));
		}

		@java.lang.Override
		public int hashCode() {
			return (ranges.hashCode()) ^ -555867578;
		}
	}

	static final class DecomposedCharset {
		boolean inverted;

		final com.google.javascript.jscomp.regex.CharRanges ranges;

		final java.lang.String namedGroups;

		DecomposedCharset(boolean inverted, com.google.javascript.jscomp.regex.CharRanges ranges, java.lang.String namedGroups) {
			com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.this.inverted = inverted;
			this.ranges = ranges;
			this.namedGroups = namedGroups;
		}

		int complexity() {
			return ((inverted ? 1 : 0) + (namedGroups.length())) + (com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.complexity(ranges));
		}

		void appendSourceCode(java.lang.StringBuilder sb) {
			if (ranges.isEmpty()) {
				if ((!(inverted)) && ((namedGroups.length()) == 2)) {
					sb.append(namedGroups);
					return ;
				}else
					if ((ranges.isEmpty()) && ((namedGroups.length()) == 0)) {
						sb.append((inverted ? "[\\S\\s]" : "(?!)"));
						return ;
					}
				
			}
			sb.append('[');
			if (inverted) {
				sb.append('^');
			}
			sb.append(namedGroups);
			boolean rangesStartCharset = (!(inverted)) && ((namedGroups.length()) == 0);
			boolean emitDashAtEnd = false;
			for (int i = 0, n = ranges.getNumRanges(); i < n; ++i) {
				char start = ((char) (ranges.start(i)));
				char end = ((char) ((ranges.end(i)) - 1));
				switch (end - start) {
					case 0 :
						if (start == '-') {
							emitDashAtEnd = true;
						}else {
							com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.escapeRangeCharOnto(start, rangesStartCharset, (i == 0), ((i + 1) == n), sb);
						}
						break;
					case 1 :
						com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.escapeRangeCharOnto(start, rangesStartCharset, (i == 0), false, sb);
						com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.escapeRangeCharOnto(end, rangesStartCharset, false, ((i + 1) == n), sb);
						break;
					default :
						com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.escapeRangeCharOnto(start, rangesStartCharset, (i == 0), false, sb);
						sb.append('-');
						com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.escapeRangeCharOnto(end, rangesStartCharset, false, true, sb);
						break;
				}
			}
			if (emitDashAtEnd) {
				sb.append('-');
			}
			sb.append(']');
		}

		static void escapeRangeCharOnto(char ch, boolean startIsFlush, boolean atStart, boolean atEnd, java.lang.StringBuilder sb) {
			switch (ch) {
				case '\b' :
					sb.append("\\b");
					break;
				case '^' :
					sb.append((atStart && startIsFlush ? "\\^" : "^"));
					break;
				case '-' :
					sb.append((atStart || atEnd ? "-" : "\\-"));
					break;
				case '\\' :
				case ']' :
					sb.append('\\').append(ch);
					break;
				default :
					com.google.javascript.jscomp.regex.RegExpTree.escapeCharOnto(ch, sb);
			}
		}

		static int complexity(com.google.javascript.jscomp.regex.CharRanges ranges) {
			int complexity = 0;
			for (int i = 0, n = ranges.getNumRanges(); i < n; ++i) {
				int start = ranges.start(i);
				int end = (ranges.end(i)) - 1;
				if ((start < 32) || (start >= 127)) {
					complexity += (start >= 256) ? 6 : 4;
				}else {
					++complexity;
				}
				switch (end - start) {
					case 0 :
						continue;
					case 1 :
						break;
					default :
						complexity += 1;
				}
				if ((end < 32) || (end >= 127)) {
					complexity += (end >= 256) ? 6 : 4;
				}else {
					++complexity;
				}
			}
			return complexity;
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			if (!(o instanceof com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset)) {
				return false;
			}
			com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset that = ((com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset) (o));
			return com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.this.inverted = ((that.inverted) && (com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.this.ranges.equals(that.ranges))) && (com.google.javascript.jscomp.regex.RegExpTree.DecomposedCharset.this.namedGroups.equals(that.namedGroups));
		}

		@java.lang.Override
		public int hashCode() {
			return (ranges.hashCode()) + (31 * ((namedGroups.hashCode()) + (inverted ? 1 : 0)));
		}
	}

	static final class Concatenation extends com.google.javascript.jscomp.regex.RegExpTree {
		final com.google.common.collect.ImmutableList<com.google.javascript.jscomp.regex.RegExpTree> elements;

		Concatenation(com.google.javascript.jscomp.regex.RegExpTree a, com.google.javascript.jscomp.regex.RegExpTree b) {
			elements = com.google.common.collect.ImmutableList.of(a, b);
		}

		Concatenation(java.util.List<? extends com.google.javascript.jscomp.regex.RegExpTree> elements) {
			this.elements = com.google.common.collect.ImmutableList.copyOf(elements);
		}

		@java.lang.Override
		public com.google.javascript.jscomp.regex.RegExpTree simplify(final java.lang.String flags) {
			class Simplifier {
				final java.util.List<com.google.javascript.jscomp.regex.RegExpTree> simplified = com.google.common.collect.Lists.newArrayList();

				void simplify(com.google.javascript.jscomp.regex.RegExpTree t) {
					if (t instanceof com.google.javascript.jscomp.regex.RegExpTree.Concatenation) {
						for (com.google.javascript.jscomp.regex.RegExpTree child : ((com.google.javascript.jscomp.regex.RegExpTree.Concatenation) (t)).elements) {
							simplify(child);
						}
					}else
						if (t instanceof com.google.javascript.jscomp.regex.RegExpTree.Empty) {
						}else {
							int lastIndex = (simplified.size()) - 1;
							if (lastIndex >= 0) {
								com.google.javascript.jscomp.regex.RegExpTree pairwise = simplifyPairwise(simplified.get(lastIndex), t);
								if (pairwise != null) {
									simplified.set(lastIndex, pairwise);
									return ;
								}
							}
							simplified.add(t);
						}
					
				}

				com.google.javascript.jscomp.regex.RegExpTree simplifyPairwise(com.google.javascript.jscomp.regex.RegExpTree before, com.google.javascript.jscomp.regex.RegExpTree after) {
					if ((before instanceof com.google.javascript.jscomp.regex.RegExpTree.Text) && (after instanceof com.google.javascript.jscomp.regex.RegExpTree.Text)) {
						return new com.google.javascript.jscomp.regex.RegExpTree.Text(((((com.google.javascript.jscomp.regex.RegExpTree.Text) (before)).text) + (((com.google.javascript.jscomp.regex.RegExpTree.Text) (after)).text))).simplify(flags);
					}
					int beforeMin = 1;
					int beforeMax = 1;
					com.google.javascript.jscomp.regex.RegExpTree beforeBody = before;
					boolean beforeGreedy = false;
					if (before instanceof com.google.javascript.jscomp.regex.RegExpTree.Repetition) {
						com.google.javascript.jscomp.regex.RegExpTree.Repetition r = ((com.google.javascript.jscomp.regex.RegExpTree.Repetition) (before));
						beforeMin = r.min;
						beforeMax = r.max;
						beforeBody = r.body;
						beforeGreedy = r.greedy;
					}
					int afterMin = 1;
					int afterMax = 1;
					com.google.javascript.jscomp.regex.RegExpTree afterBody = after;
					boolean afterGreedy = false;
					if (after instanceof com.google.javascript.jscomp.regex.RegExpTree.Repetition) {
						com.google.javascript.jscomp.regex.RegExpTree.Repetition r = ((com.google.javascript.jscomp.regex.RegExpTree.Repetition) (after));
						afterMin = r.min;
						afterMax = r.max;
						afterBody = r.body;
						afterGreedy = r.greedy;
					}
					if ((beforeBody.equals(afterBody)) && (!(beforeBody.hasCapturingGroup()))) {
						long lmin = ((long) (beforeMin)) + afterMin;
						long lmax = ((long) (beforeMax)) + afterMax;
						if (lmin < (java.lang.Integer.MAX_VALUE)) {
							int min = ((int) (lmin));
							int max = lmax >= (java.lang.Integer.MAX_VALUE) ? java.lang.Integer.MAX_VALUE : ((int) (lmax));
							return new com.google.javascript.jscomp.regex.RegExpTree.Repetition(beforeBody, min, max, ((beforeGreedy || afterGreedy) || (min == max)));
						}
					}
					return null;
				}
			}
			Simplifier s = new Simplifier();
			for (com.google.javascript.jscomp.regex.RegExpTree element : elements) {
				s.simplify(element.simplify(flags));
			}
			switch (s.simplified.size()) {
				case 0 :
					return com.google.javascript.jscomp.regex.RegExpTree.Empty.INSTANCE;
				case 1 :
					return s.simplified.get(0);
				default :
					return new com.google.javascript.jscomp.regex.RegExpTree.Concatenation(s.simplified);
			}
		}

		@java.lang.Override
		public boolean isCaseSensitive() {
			for (com.google.javascript.jscomp.regex.RegExpTree element : elements) {
				if (element.isCaseSensitive()) {
					return true;
				}
			}
			return false;
		}

		@java.lang.Override
		public boolean containsAnchor() {
			for (com.google.javascript.jscomp.regex.RegExpTree element : elements) {
				if (element.containsAnchor()) {
					return true;
				}
			}
			return false;
		}

		@java.lang.Override
		public int numCapturingGroups() {
			int n = 0;
			for (com.google.javascript.jscomp.regex.RegExpTree element : elements) {
				n += element.numCapturingGroups();
			}
			return n;
		}

		@java.lang.Override
		public java.util.List<? extends com.google.javascript.jscomp.regex.RegExpTree> children() {
			return elements;
		}

		@java.lang.Override
		protected void appendSourceCode(java.lang.StringBuilder sb) {
			boolean digitsMightBleed = false;
			for (com.google.javascript.jscomp.regex.RegExpTree element : elements) {
				boolean parenthesize = false;
				if ((element instanceof com.google.javascript.jscomp.regex.RegExpTree.Alternation) || (element instanceof com.google.javascript.jscomp.regex.RegExpTree.Concatenation)) {
					parenthesize = true;
				}
				if (parenthesize) {
					sb.append("(?:");
					element.appendSourceCode(sb);
					sb.append(')');
				}else {
					int start = sb.length();
					element.appendSourceCode(sb);
					if (digitsMightBleed && ((sb.length()) > start)) {
						char firstChar = sb.charAt(start);
						if (('0' <= firstChar) && (firstChar <= '9')) {
							if ((sb.charAt((start - 1))) == '{') {
								sb.insert((start - 1), '\\');
							}else {
								sb.insert(start, "(?:").append(')');
							}
						}
					}
				}
				digitsMightBleed = ((element instanceof com.google.javascript.jscomp.regex.RegExpTree.BackReference) && ((((com.google.javascript.jscomp.regex.RegExpTree.BackReference) (element)).groupIndex) < 10)) || ((element instanceof com.google.javascript.jscomp.regex.RegExpTree.Text) && (((com.google.javascript.jscomp.regex.RegExpTree.Text) (element)).text.endsWith("{")));
			}
		}

		@java.lang.Override
		protected void appendDebugInfo(java.lang.StringBuilder sb) {
		}

		@java.lang.Override
		public boolean equals(java.lang.Object o) {
			return (o instanceof com.google.javascript.jscomp.regex.RegExpTree.Concatenation) && (elements.equals(((com.google.javascript.jscomp.regex.RegExpTree.Concatenation) (o)).elements));
		}

		@java.lang.Override
		public int hashCode() {
			return 546930238 ^ (elements.hashCode());
		}
	}

	static void escapeCharOnto(char ch, java.lang.StringBuilder sb) {
		switch (ch) {
			case ' ' :
				sb.append("\\0");
				break;
			case '\f' :
				sb.append("\\f");
				break;
			case '\t' :
				sb.append("\\t");
				break;
			case '\n' :
				sb.append("\\n");
				break;
			case '\r' :
				sb.append("\\r");
				break;
			case '\\' :
				sb.append("\\\\");
				break;
			default :
				if ((ch < 32) || (ch >= 127)) {
					if (ch >= 256) {
						sb.append("\\u");
						sb.append("0123456789abcdef".charAt(((ch >> 12) & 15)));
						sb.append("0123456789abcdef".charAt(((ch >> 8) & 15)));
						sb.append("0123456789abcdef".charAt(((ch >> 4) & 15)));
						sb.append("0123456789abcdef".charAt((ch & 15)));
					}else {
						sb.append("\\x");
						sb.append("0123456789abcdef".charAt(((ch >> 4) & 15)));
						sb.append("0123456789abcdef".charAt((ch & 15)));
					}
				}else {
					sb.append(ch);
				}
		}
	}
}

