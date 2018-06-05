

package org.apache.commons.lang.text;


public class VariableFormatter {
	public static class MapVariableResolver implements org.apache.commons.lang.text.VariableFormatter.VariableResolver {
		private java.util.Map map;

		public MapVariableResolver(java.util.Map map) {
			org.apache.commons.lang.text.VariableFormatter.MapVariableResolver.this.setMap(map);
		}

		public java.util.Map getMap() {
			return org.apache.commons.lang.text.VariableFormatter.MapVariableResolver.this.map;
		}

		public java.lang.Object resolveVariable(java.lang.String varName) {
			if ((org.apache.commons.lang.text.VariableFormatter.MapVariableResolver.this.getMap()) == null) {
				return null;
			}
			return org.apache.commons.lang.text.VariableFormatter.MapVariableResolver.this.getMap().get(varName);
		}

		public void setMap(java.util.Map map) {
			org.apache.commons.lang.text.VariableFormatter.MapVariableResolver.this.map = map;
		}
	}

	protected static class VariableParser {
		static final short ESCAPED_VAR_TOKEN = 3;

		static final short TEXT_TOKEN = 1;

		static final short VARIABLE_TOKEN = 2;

		protected static java.text.FieldPosition newEscapedVariableToken(int aStartIndex, int aLength) {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.newToken(org.apache.commons.lang.text.VariableFormatter.VariableParser.ESCAPED_VAR_TOKEN, aStartIndex, aLength);
		}

		protected static java.text.FieldPosition newTextToken(int aStartIndex, int aLength) {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.newToken(org.apache.commons.lang.text.VariableFormatter.VariableParser.TEXT_TOKEN, aStartIndex, aLength);
		}

		private static java.text.FieldPosition newToken(int type, int beginIndex, int length) {
			java.text.FieldPosition fp = new java.text.FieldPosition(type);
			fp.setBeginIndex(beginIndex);
			fp.setEndIndex((beginIndex + length));
			return fp;
		}

		protected static java.text.FieldPosition newVariableToken(int aStartIndex, int aLength) {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.newToken(org.apache.commons.lang.text.VariableFormatter.VariableParser.VARIABLE_TOKEN, aStartIndex, aLength);
		}

		private int endIndex;

		private org.apache.commons.lang.text.StrMatcher escVarMatcher;

		private int length;

		private int pos;

		private java.util.LinkedList tokenList;

		private org.apache.commons.lang.text.StrMatcher varEndMatcher;

		private org.apache.commons.lang.text.StrMatcher varStartMatcher;

		protected VariableParser(org.apache.commons.lang.text.StrMatcher startMatcher, org.apache.commons.lang.text.StrMatcher endMatcher, org.apache.commons.lang.text.StrMatcher escMatcher, int startPos, int length) {
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.setVarStartMatcher(startMatcher);
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.setVarEndMatcher(endMatcher);
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.setEscVarMatcher(escMatcher);
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.setPos(startPos);
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.setLength(length);
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.setEndIndex((startPos + length));
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.setTokenList(new java.util.LinkedList());
		}

		private void checkTextToken(int startPos) {
			if (startPos < (getPos())) {
				getTokenList().addLast(org.apache.commons.lang.text.VariableFormatter.VariableParser.newTextToken(startPos, ((getPos()) - startPos)));
			}
		}

		private int getEndIndex() {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.this.endIndex;
		}

		private org.apache.commons.lang.text.StrMatcher getEscVarMatcher() {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.this.escVarMatcher;
		}

		private int getLength() {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.this.length;
		}

		private int getPos() {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.this.pos;
		}

		private java.util.LinkedList getTokenList() {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.this.tokenList;
		}

		private org.apache.commons.lang.text.StrMatcher getVarEndMatcher() {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.this.varEndMatcher;
		}

		private org.apache.commons.lang.text.StrMatcher getVarStartMatcher() {
			return org.apache.commons.lang.text.VariableFormatter.VariableParser.this.varStartMatcher;
		}

		private boolean hasNext() {
			return (getPos()) < (getEndIndex());
		}

		protected java.text.FieldPosition nextToken(char[] data) {
			if (getTokenList().isEmpty()) {
				if (!(hasNext())) {
					return null;
				}
				int startPos = getPos();
				int tokenLen;
				while ((hasNext()) && (getTokenList().isEmpty())) {
					if ((tokenLen = getEscVarMatcher().isMatch(data, getPos(), 0, getLength())) > 0) {
						checkTextToken(startPos);
						getTokenList().addLast(org.apache.commons.lang.text.VariableFormatter.VariableParser.newEscapedVariableToken(getPos(), tokenLen));
						setPos(((getPos()) + tokenLen));
					}else
						if ((tokenLen = getVarStartMatcher().isMatch(data, getPos(), 0, getLength())) > 0) {
							checkTextToken(startPos);
							setPos(((getPos()) + tokenLen));
							int varStart = getPos();
							int endLen = 0;
							while ((hasNext()) && ((endLen = getVarEndMatcher().isMatch(data, getPos(), 0, getLength())) <= 0)) {
								setPos(((getPos()) + 1));
							} 
							if (endLen <= 0) {
								checkTextToken((varStart - tokenLen));
							}else {
								getTokenList().addLast(org.apache.commons.lang.text.VariableFormatter.VariableParser.newVariableToken(varStart, ((getPos()) - varStart)));
								setPos(((getPos()) + endLen));
							}
						}else {
							setPos(((getPos()) + 1));
						}
					
				} 
				if (getTokenList().isEmpty()) {
					checkTextToken(startPos);
				}
			}
			return ((java.text.FieldPosition) (getTokenList().removeFirst()));
		}

		private void setEndIndex(int endIndex) {
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.endIndex = endIndex;
		}

		private void setEscVarMatcher(org.apache.commons.lang.text.StrMatcher escVarMatcher) {
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.escVarMatcher = escVarMatcher;
		}

		private void setLength(int length) {
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.length = length;
		}

		private void setPos(int pos) {
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.pos = pos;
		}

		private void setTokenList(java.util.LinkedList tokenList) {
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.tokenList = tokenList;
		}

		private void setVarEndMatcher(org.apache.commons.lang.text.StrMatcher varEndMatcher) {
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.varEndMatcher = varEndMatcher;
		}

		private void setVarStartMatcher(org.apache.commons.lang.text.StrMatcher varStartMatcher) {
			org.apache.commons.lang.text.VariableFormatter.VariableParser.this.varStartMatcher = varStartMatcher;
		}
	}

	public static interface VariableResolver {
		java.lang.Object resolveVariable(java.lang.String varName);
	}

	public static final char DEFAULT_ESCAPE = '$';

	public static final java.lang.String DEFAULT_PREFIX = "${";

	public static final java.lang.String DEFAULT_SUFFIX = "}";

	public static java.lang.String replace(java.util.Map valueMap, java.lang.Object source) {
		return new org.apache.commons.lang.text.VariableFormatter(valueMap).replace(source);
	}

	public static java.lang.String replace(java.util.Map valueMap, java.lang.String prefix, java.lang.String suffix, java.lang.Object source) {
		return new org.apache.commons.lang.text.VariableFormatter(valueMap, prefix, suffix).replace(source);
	}

	public static java.lang.String replaceSystemProperties(java.lang.Object source) {
		return new org.apache.commons.lang.text.VariableFormatter(java.lang.System.getProperties()).replace(source);
	}

	private char escapeCharacter;

	private java.lang.String variablePrefix;

	private org.apache.commons.lang.text.VariableFormatter.VariableResolver variableResolver;

	private java.lang.String variableSuffix;

	public VariableFormatter() {
		this(((org.apache.commons.lang.text.VariableFormatter.VariableResolver) (null)), org.apache.commons.lang.text.VariableFormatter.DEFAULT_PREFIX, org.apache.commons.lang.text.VariableFormatter.DEFAULT_SUFFIX, org.apache.commons.lang.text.VariableFormatter.DEFAULT_ESCAPE);
	}

	public VariableFormatter(java.util.Map valueMap) {
		this(valueMap, org.apache.commons.lang.text.VariableFormatter.DEFAULT_PREFIX, org.apache.commons.lang.text.VariableFormatter.DEFAULT_SUFFIX, org.apache.commons.lang.text.VariableFormatter.DEFAULT_ESCAPE);
	}

	public VariableFormatter(java.util.Map valueMap, java.lang.String prefix, java.lang.String suffix) {
		this(valueMap, prefix, suffix, org.apache.commons.lang.text.VariableFormatter.DEFAULT_ESCAPE);
	}

	public VariableFormatter(java.util.Map valueMap, java.lang.String prefix, java.lang.String suffix, char escape) {
		this(new org.apache.commons.lang.text.VariableFormatter.MapVariableResolver(valueMap), prefix, suffix, escape);
	}

	public VariableFormatter(org.apache.commons.lang.text.VariableFormatter.VariableResolver variableResolver, java.lang.String prefix, java.lang.String suffix, char escape) {
		org.apache.commons.lang.text.VariableFormatter.this.setVariableResolver(variableResolver);
		org.apache.commons.lang.text.VariableFormatter.this.setVariablePrefix(prefix);
		org.apache.commons.lang.text.VariableFormatter.this.setVariableSuffix(suffix);
		org.apache.commons.lang.text.VariableFormatter.this.setEscapeCharacter(escape);
	}

	public java.lang.String replace(char[] data) {
		return replace(data, 0, (data == null ? 0 : data.length));
	}

	public java.lang.String replace(char[] data, int offset, int length) {
		java.lang.Object result = doReplace(data, offset, length, null, null);
		return result == null ? null : result.toString();
	}

	public java.lang.String replace(java.lang.Object source) {
		java.lang.Object result = replaceObject(source);
		return result == null ? null : result.toString();
	}

	public java.lang.Object replaceObject(java.lang.Object source) {
		return doReplace(source, null);
	}

	private java.lang.Object doReplace(java.lang.Object obj, java.util.List priorVariables) {
		if (obj == null) {
			return null;
		}
		char[] data = obj.toString().toCharArray();
		return doReplace(data, 0, data.length, obj, priorVariables);
	}

	private java.lang.Object doReplace(char[] data, int offset, int length, java.lang.Object ref, java.util.List priorVariables) {
		if (data == null) {
			return null;
		}
		java.lang.Object resultObj = ref;
		int tokenCnt = 0;
		org.apache.commons.lang.text.StrBuilder buf = new org.apache.commons.lang.text.StrBuilder(length);
		if (priorVariables == null) {
			priorVariables = new java.util.ArrayList();
			priorVariables.add(new java.lang.String(data, offset, length));
		}
		org.apache.commons.lang.text.VariableFormatter.VariableParser parser = createParser(data, offset, length);
		java.text.FieldPosition tok;
		while ((tok = parser.nextToken(data)) != null) {
			switch (tok.getField()) {
				case org.apache.commons.lang.text.VariableFormatter.VariableParser.TEXT_TOKEN :
					buf.append(data, tok.getBeginIndex(), getLength(tok));
					break;
				case org.apache.commons.lang.text.VariableFormatter.VariableParser.ESCAPED_VAR_TOKEN :
					buf.append(getVariablePrefix());
					tokenCnt++;
					break;
				case org.apache.commons.lang.text.VariableFormatter.VariableParser.VARIABLE_TOKEN :
					java.lang.String variable = new java.lang.String(data, tok.getBeginIndex(), getLength(tok));
					if (priorVariables.contains(variable)) {
						java.lang.String initialBase = priorVariables.remove(0).toString();
						priorVariables.add(variable);
						org.apache.commons.lang.text.StrBuilder priorVariableSb = new org.apache.commons.lang.text.StrBuilder();
						for (java.util.Iterator it = priorVariables.iterator(); it.hasNext();) {
							priorVariableSb.append(it.next());
							if (it.hasNext()) {
								priorVariableSb.append("->");
							}
						}
						throw new java.lang.IllegalStateException(((("Infinite loop in property interpolation of " + initialBase) + ": ") + (priorVariableSb.toString())));
					}
					priorVariables.add(variable);
					resultObj = resolveVariable(variable);
					if (resultObj != null) {
						resultObj = doReplace(resultObj, priorVariables);
						buf.append(resultObj);
					}else {
						buf.append(getVariablePrefix()).append(variable).append(getVariableSuffix());
					}
					priorVariables.remove(((priorVariables.size()) - 1));
					break;
			}
			tokenCnt++;
		} 
		if ((resultObj != null) && (tokenCnt == 1)) {
			return resultObj;
		}
		return buf.toString();
	}

	private int getLength(java.text.FieldPosition tok) {
		return (tok.getEndIndex()) - (tok.getBeginIndex());
	}

	protected org.apache.commons.lang.text.VariableFormatter.VariableParser createParser(char[] data, int offset, int length) {
		return new org.apache.commons.lang.text.VariableFormatter.VariableParser(org.apache.commons.lang.text.StrMatcher.stringMatcher(getVariablePrefix()), org.apache.commons.lang.text.StrMatcher.stringMatcher(getVariableSuffix()), org.apache.commons.lang.text.StrMatcher.stringMatcher(((java.lang.String.valueOf(getEscapeCharacter())) + (getVariablePrefix()))), offset, length);
	}

	protected java.lang.Object resolveVariable(java.lang.String name) {
		if ((org.apache.commons.lang.text.VariableFormatter.this.getVariableResolver()) == null) {
			return null;
		}
		return org.apache.commons.lang.text.VariableFormatter.this.getVariableResolver().resolveVariable(name);
	}

	public char getEscapeCharacter() {
		return org.apache.commons.lang.text.VariableFormatter.this.escapeCharacter;
	}

	public void setEscapeCharacter(char escapeCharacter) {
		org.apache.commons.lang.text.VariableFormatter.this.escapeCharacter = escapeCharacter;
	}

	public java.lang.String getVariablePrefix() {
		return org.apache.commons.lang.text.VariableFormatter.this.variablePrefix;
	}

	public void setVariablePrefix(java.lang.String variablePrefix) {
		if (variablePrefix == null) {
			throw new java.lang.IllegalArgumentException("Variable prefix must not be null!");
		}
		org.apache.commons.lang.text.VariableFormatter.this.variablePrefix = variablePrefix;
	}

	public java.lang.String getVariableSuffix() {
		return org.apache.commons.lang.text.VariableFormatter.this.variableSuffix;
	}

	public void setVariableSuffix(java.lang.String variableSuffix) {
		if (variableSuffix == null) {
			throw new java.lang.IllegalArgumentException("Variable suffix must not be null!");
		}
		org.apache.commons.lang.text.VariableFormatter.this.variableSuffix = variableSuffix;
	}

	public org.apache.commons.lang.text.VariableFormatter.VariableResolver getVariableResolver() {
		return org.apache.commons.lang.text.VariableFormatter.this.variableResolver;
	}

	public void setVariableResolver(org.apache.commons.lang.text.VariableFormatter.VariableResolver variableResolver) {
		org.apache.commons.lang.text.VariableFormatter.this.variableResolver = variableResolver;
	}
}

