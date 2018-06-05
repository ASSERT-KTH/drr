

package org.apache.commons.lang.text;


public class StrTokenizer implements java.lang.Cloneable , java.util.ListIterator {
	private static final org.apache.commons.lang.text.StrTokenizer CSV_TOKENIZER_PROTOTYPE;

	private static final org.apache.commons.lang.text.StrTokenizer TSV_TOKENIZER_PROTOTYPE;

	static {
		CSV_TOKENIZER_PROTOTYPE = new org.apache.commons.lang.text.StrTokenizer();
		org.apache.commons.lang.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(org.apache.commons.lang.text.StrMatcher.commaMatcher());
		org.apache.commons.lang.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(org.apache.commons.lang.text.StrMatcher.doubleQuoteMatcher());
		org.apache.commons.lang.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(org.apache.commons.lang.text.StrMatcher.noneMatcher());
		org.apache.commons.lang.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(org.apache.commons.lang.text.StrMatcher.trimMatcher());
		org.apache.commons.lang.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
		org.apache.commons.lang.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
		TSV_TOKENIZER_PROTOTYPE = new org.apache.commons.lang.text.StrTokenizer();
		org.apache.commons.lang.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(org.apache.commons.lang.text.StrMatcher.tabMatcher());
		org.apache.commons.lang.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(org.apache.commons.lang.text.StrMatcher.doubleQuoteMatcher());
		org.apache.commons.lang.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(org.apache.commons.lang.text.StrMatcher.noneMatcher());
		org.apache.commons.lang.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(org.apache.commons.lang.text.StrMatcher.trimMatcher());
		org.apache.commons.lang.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
		org.apache.commons.lang.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
	}

	private char[] chars;

	private java.lang.String[] tokens;

	private int tokenPos;

	private org.apache.commons.lang.text.StrMatcher delimMatcher = org.apache.commons.lang.text.StrMatcher.splitMatcher();

	private org.apache.commons.lang.text.StrMatcher quoteMatcher = org.apache.commons.lang.text.StrMatcher.noneMatcher();

	private org.apache.commons.lang.text.StrMatcher ignoredMatcher = org.apache.commons.lang.text.StrMatcher.noneMatcher();

	private org.apache.commons.lang.text.StrMatcher trimmerMatcher = org.apache.commons.lang.text.StrMatcher.noneMatcher();

	private boolean emptyAsNull = false;

	private boolean ignoreEmptyTokens = true;

	private static org.apache.commons.lang.text.StrTokenizer getCSVClone() {
		return ((org.apache.commons.lang.text.StrTokenizer) (org.apache.commons.lang.text.StrTokenizer.CSV_TOKENIZER_PROTOTYPE.clone()));
	}

	public static org.apache.commons.lang.text.StrTokenizer getCSVInstance() {
		return org.apache.commons.lang.text.StrTokenizer.getCSVClone();
	}

	public static org.apache.commons.lang.text.StrTokenizer getCSVInstance(java.lang.String input) {
		org.apache.commons.lang.text.StrTokenizer tok = org.apache.commons.lang.text.StrTokenizer.getCSVClone();
		tok.reset(input);
		return tok;
	}

	public static org.apache.commons.lang.text.StrTokenizer getCSVInstance(char[] input) {
		org.apache.commons.lang.text.StrTokenizer tok = org.apache.commons.lang.text.StrTokenizer.getCSVClone();
		tok.reset(input);
		return tok;
	}

	private static org.apache.commons.lang.text.StrTokenizer getTSVClone() {
		return ((org.apache.commons.lang.text.StrTokenizer) (org.apache.commons.lang.text.StrTokenizer.TSV_TOKENIZER_PROTOTYPE.clone()));
	}

	public static org.apache.commons.lang.text.StrTokenizer getTSVInstance() {
		return org.apache.commons.lang.text.StrTokenizer.getTSVClone();
	}

	public static org.apache.commons.lang.text.StrTokenizer getTSVInstance(java.lang.String input) {
		org.apache.commons.lang.text.StrTokenizer tok = org.apache.commons.lang.text.StrTokenizer.getTSVClone();
		tok.reset(input);
		return tok;
	}

	public static org.apache.commons.lang.text.StrTokenizer getTSVInstance(char[] input) {
		org.apache.commons.lang.text.StrTokenizer tok = org.apache.commons.lang.text.StrTokenizer.getTSVClone();
		tok.reset(input);
		return tok;
	}

	public StrTokenizer() {
		super();
		org.apache.commons.lang.text.StrTokenizer.this.chars = null;
	}

	public StrTokenizer(java.lang.String input) {
		super();
		if (input != null) {
			chars = input.toCharArray();
		}else {
			chars = null;
		}
	}

	public StrTokenizer(java.lang.String input, char delim) {
		this(input);
		setDelimiterChar(delim);
	}

	public StrTokenizer(java.lang.String input, java.lang.String delim) {
		this(input);
		setDelimiterString(delim);
	}

	public StrTokenizer(java.lang.String input, org.apache.commons.lang.text.StrMatcher delim) {
		this(input);
		setDelimiterMatcher(delim);
	}

	public StrTokenizer(java.lang.String input, char delim, char quote) {
		this(input, delim);
		setQuoteChar(quote);
	}

	public StrTokenizer(java.lang.String input, org.apache.commons.lang.text.StrMatcher delim, org.apache.commons.lang.text.StrMatcher quote) {
		this(input, delim);
		setQuoteMatcher(quote);
	}

	public StrTokenizer(char[] input) {
		super();
		org.apache.commons.lang.text.StrTokenizer.this.chars = input;
	}

	public StrTokenizer(char[] input, char delim) {
		this(input);
		setDelimiterChar(delim);
	}

	public StrTokenizer(char[] input, java.lang.String delim) {
		this(input);
		setDelimiterString(delim);
	}

	public StrTokenizer(char[] input, org.apache.commons.lang.text.StrMatcher delim) {
		this(input);
		setDelimiterMatcher(delim);
	}

	public StrTokenizer(char[] input, char delim, char quote) {
		this(input, delim);
		setQuoteChar(quote);
	}

	public StrTokenizer(char[] input, org.apache.commons.lang.text.StrMatcher delim, org.apache.commons.lang.text.StrMatcher quote) {
		this(input, delim);
		setQuoteMatcher(quote);
	}

	public int size() {
		checkTokenized();
		return tokens.length;
	}

	public java.lang.String nextToken() {
		if (hasNext()) {
			return tokens[((tokenPos)++)];
		}
		return null;
	}

	public java.lang.String previousToken() {
		if (hasPrevious()) {
			return tokens[(--(tokenPos))];
		}
		return null;
	}

	public java.lang.String[] getTokenArray() {
		checkTokenized();
		return ((java.lang.String[]) (tokens.clone()));
	}

	public java.util.List getTokenList() {
		checkTokenized();
		java.util.List list = new java.util.ArrayList(tokens.length);
		for (int i = 0; i < (tokens.length); i++) {
			list.add(tokens[i]);
		}
		return list;
	}

	public org.apache.commons.lang.text.StrTokenizer reset() {
		tokenPos = 0;
		tokens = null;
		return org.apache.commons.lang.text.StrTokenizer.this;
	}

	public org.apache.commons.lang.text.StrTokenizer reset(java.lang.String input) {
		reset();
		if (input != null) {
			org.apache.commons.lang.text.StrTokenizer.this.chars = input.toCharArray();
		}else {
			org.apache.commons.lang.text.StrTokenizer.this.chars = null;
		}
		return org.apache.commons.lang.text.StrTokenizer.this;
	}

	public org.apache.commons.lang.text.StrTokenizer reset(char[] input) {
		reset();
		org.apache.commons.lang.text.StrTokenizer.this.chars = input;
		return org.apache.commons.lang.text.StrTokenizer.this;
	}

	public boolean hasNext() {
		checkTokenized();
		return (tokenPos) < (tokens.length);
	}

	public java.lang.Object next() {
		if (hasNext()) {
			return tokens[((tokenPos)++)];
		}
		throw new java.util.NoSuchElementException();
	}

	public int nextIndex() {
		return tokenPos;
	}

	public boolean hasPrevious() {
		checkTokenized();
		return (tokenPos) > 0;
	}

	public java.lang.Object previous() {
		if (hasPrevious()) {
			return tokens[(--(tokenPos))];
		}
		throw new java.util.NoSuchElementException();
	}

	public int previousIndex() {
		return (tokenPos) - 1;
	}

	public void remove() {
		throw new java.lang.UnsupportedOperationException("remove() is unsupported");
	}

	public void set(java.lang.Object obj) {
		throw new java.lang.UnsupportedOperationException("set() is unsupported");
	}

	public void add(java.lang.Object obj) {
		throw new java.lang.UnsupportedOperationException("add() is unsupported");
	}

	private void checkTokenized() {
		if ((tokens) == null) {
			if ((chars) == null) {
				java.util.List split = tokenize(null, 0, 0);
				tokens = ((java.lang.String[]) (split.toArray(new java.lang.String[split.size()])));
			}else {
				java.util.List split = tokenize(chars, 0, chars.length);
				tokens = ((java.lang.String[]) (split.toArray(new java.lang.String[split.size()])));
			}
		}
	}

	protected java.util.List tokenize(char[] chars, int offset, int count) {
		if ((chars == null) || (count == 0)) {
			return java.util.Collections.EMPTY_LIST;
		}
		org.apache.commons.lang.text.StrBuilder buf = new org.apache.commons.lang.text.StrBuilder();
		java.util.List tokens = new java.util.ArrayList();
		int pos = offset;
		while ((pos >= 0) && (pos < count)) {
			pos = readNextToken(chars, pos, count, buf, tokens);
			if (pos >= count) {
				addToken(tokens, "");
			}
		} 
		return tokens;
	}

	private void addToken(java.util.List list, java.lang.String tok) {
		if ((tok == null) || ((tok.length()) == 0)) {
			if (isIgnoreEmptyTokens()) {
				return ;
			}
			if (isEmptyTokenAsNull()) {
				tok = null;
			}
		}
		list.add(tok);
	}

	private int readNextToken(char[] chars, int start, int len, org.apache.commons.lang.text.StrBuilder workArea, java.util.List tokens) {
		while (start < len) {
			int removeLen = java.lang.Math.max(getIgnoredMatcher().isMatch(chars, start, start, len), getTrimmerMatcher().isMatch(chars, start, start, len));
			if (((removeLen == 0) || ((getDelimiterMatcher().isMatch(chars, start, start, len)) > 0)) || ((getQuoteMatcher().isMatch(chars, start, start, len)) > 0)) {
				break;
			}
			start += removeLen;
		} 
		if (start >= len) {
			addToken(tokens, "");
			return -1;
		}
		int delimLen = getDelimiterMatcher().isMatch(chars, start, start, len);
		if (delimLen > 0) {
			addToken(tokens, "");
			return start + delimLen;
		}
		int quoteLen = getQuoteMatcher().isMatch(chars, start, start, len);
		if (quoteLen > 0) {
			return readWithQuotes(chars, (start + quoteLen), len, workArea, tokens, start, quoteLen);
		}
		return readWithQuotes(chars, start, len, workArea, tokens, 0, 0);
	}

	private int readWithQuotes(char[] chars, int start, int len, org.apache.commons.lang.text.StrBuilder workArea, java.util.List tokens, int quoteStart, int quoteLen) {
		workArea.clear();
		int pos = start;
		boolean quoting = quoteLen > 0;
		int trimStart = 0;
		while (pos < len) {
			if (quoting) {
				if (isQuote(chars, pos, len, quoteStart, quoteLen)) {
					if (isQuote(chars, (pos + quoteLen), len, quoteStart, quoteLen)) {
						workArea.append(chars, pos, quoteLen);
						pos += quoteLen * 2;
						trimStart = workArea.size();
						continue;
					}
					quoting = false;
					pos += quoteLen;
					continue;
				}
				workArea.append(chars[(pos++)]);
				trimStart = workArea.size();
			}else {
				int delimLen = getDelimiterMatcher().isMatch(chars, pos, start, len);
				if (delimLen > 0) {
					addToken(tokens, workArea.substring(0, trimStart));
					return pos + delimLen;
				}
				if (quoteLen > 0) {
					if (isQuote(chars, pos, len, quoteStart, quoteLen)) {
						quoting = true;
						pos += quoteLen;
						continue;
					}
				}
				int ignoredLen = getIgnoredMatcher().isMatch(chars, pos, start, len);
				if (ignoredLen > 0) {
					pos += ignoredLen;
					continue;
				}
				int trimmedLen = getTrimmerMatcher().isMatch(chars, pos, start, len);
				if (trimmedLen > 0) {
					workArea.append(chars, pos, trimmedLen);
					pos += trimmedLen;
					continue;
				}
				workArea.append(chars[(pos++)]);
				trimStart = workArea.size();
			}
		} 
		addToken(tokens, workArea.substring(0, trimStart));
		return -1;
	}

	private boolean isQuote(char[] chars, int pos, int len, int quoteStart, int quoteLen) {
		for (int i = 0; i < quoteLen; i++) {
			if (((pos + i) >= len) || ((chars[(pos + i)]) != (chars[(quoteStart + i)]))) {
				return false;
			}
		}
		return true;
	}

	public org.apache.commons.lang.text.StrMatcher getDelimiterMatcher() {
		return org.apache.commons.lang.text.StrTokenizer.this.delimMatcher;
	}

	public org.apache.commons.lang.text.StrTokenizer setDelimiterMatcher(org.apache.commons.lang.text.StrMatcher delim) {
		if (delim == null) {
			org.apache.commons.lang.text.StrTokenizer.this.delimMatcher = org.apache.commons.lang.text.StrMatcher.noneMatcher();
		}else {
			org.apache.commons.lang.text.StrTokenizer.this.delimMatcher = delim;
		}
		return org.apache.commons.lang.text.StrTokenizer.this;
	}

	public org.apache.commons.lang.text.StrTokenizer setDelimiterChar(char delim) {
		return setDelimiterMatcher(org.apache.commons.lang.text.StrMatcher.charMatcher(delim));
	}

	public org.apache.commons.lang.text.StrTokenizer setDelimiterString(java.lang.String delim) {
		return setDelimiterMatcher(org.apache.commons.lang.text.StrMatcher.stringMatcher(delim));
	}

	public org.apache.commons.lang.text.StrMatcher getQuoteMatcher() {
		return quoteMatcher;
	}

	public org.apache.commons.lang.text.StrTokenizer setQuoteMatcher(org.apache.commons.lang.text.StrMatcher quote) {
		if (quote != null) {
			org.apache.commons.lang.text.StrTokenizer.this.quoteMatcher = quote;
		}
		return org.apache.commons.lang.text.StrTokenizer.this;
	}

	public org.apache.commons.lang.text.StrTokenizer setQuoteChar(char quote) {
		return setQuoteMatcher(org.apache.commons.lang.text.StrMatcher.charMatcher(quote));
	}

	public org.apache.commons.lang.text.StrMatcher getIgnoredMatcher() {
		return ignoredMatcher;
	}

	public org.apache.commons.lang.text.StrTokenizer setIgnoredMatcher(org.apache.commons.lang.text.StrMatcher ignored) {
		if (ignored != null) {
			org.apache.commons.lang.text.StrTokenizer.this.ignoredMatcher = ignored;
		}
		return org.apache.commons.lang.text.StrTokenizer.this;
	}

	public org.apache.commons.lang.text.StrTokenizer setIgnoredChar(char ignored) {
		return setIgnoredMatcher(org.apache.commons.lang.text.StrMatcher.charMatcher(ignored));
	}

	public org.apache.commons.lang.text.StrMatcher getTrimmerMatcher() {
		return trimmerMatcher;
	}

	public org.apache.commons.lang.text.StrTokenizer setTrimmerMatcher(org.apache.commons.lang.text.StrMatcher trimmer) {
		if (trimmer != null) {
			org.apache.commons.lang.text.StrTokenizer.this.trimmerMatcher = trimmer;
		}
		return org.apache.commons.lang.text.StrTokenizer.this;
	}

	public boolean isEmptyTokenAsNull() {
		return org.apache.commons.lang.text.StrTokenizer.this.emptyAsNull;
	}

	public org.apache.commons.lang.text.StrTokenizer setEmptyTokenAsNull(boolean emptyAsNull) {
		org.apache.commons.lang.text.StrTokenizer.this.emptyAsNull = emptyAsNull;
		return org.apache.commons.lang.text.StrTokenizer.this;
	}

	public boolean isIgnoreEmptyTokens() {
		return ignoreEmptyTokens;
	}

	public org.apache.commons.lang.text.StrTokenizer setIgnoreEmptyTokens(boolean ignoreEmptyTokens) {
		org.apache.commons.lang.text.StrTokenizer.this.ignoreEmptyTokens = ignoreEmptyTokens;
		return org.apache.commons.lang.text.StrTokenizer.this;
	}

	public java.lang.String getContent() {
		if ((chars) == null) {
			return null;
		}
		return new java.lang.String(chars);
	}

	public java.lang.Object clone() {
		try {
			return cloneReset();
		} catch (java.lang.CloneNotSupportedException ex) {
			return null;
		}
	}

	java.lang.Object cloneReset() throws java.lang.CloneNotSupportedException {
		org.apache.commons.lang.text.StrTokenizer cloned = ((org.apache.commons.lang.text.StrTokenizer) (super.clone()));
		if ((cloned.chars) != null) {
			cloned.chars = ((char[]) (cloned.chars.clone()));
		}
		cloned.reset();
		return cloned;
	}

	public java.lang.String toString() {
		if ((tokens) == null) {
			return "StrTokenizer[not tokenized yet]";
		}
		return "StrTokenizer" + (getTokenList());
	}
}

