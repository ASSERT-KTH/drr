

package com.google.javascript.rhino;


public class ScriptOrFnNode extends com.google.javascript.rhino.Node {
	private static final long serialVersionUID = 1L;

	public ScriptOrFnNode(int nodeType) {
		super(nodeType);
	}

	public ScriptOrFnNode(int nodeType, int lineno, int charno) {
		super(nodeType, lineno, charno);
	}

	public final java.lang.String getSourceName() {
		return sourceName;
	}

	public final void setSourceName(java.lang.String sourceName) {
		com.google.javascript.rhino.ScriptOrFnNode.this.sourceName = sourceName;
	}

	public final int getEncodedSourceStart() {
		return encodedSourceStart;
	}

	public final int getEncodedSourceEnd() {
		return encodedSourceEnd;
	}

	public final void setEncodedSourceBounds(int start, int end) {
		com.google.javascript.rhino.ScriptOrFnNode.this.encodedSourceStart = start;
		com.google.javascript.rhino.ScriptOrFnNode.this.encodedSourceEnd = end;
	}

	public final int getBaseLineno() {
		return baseLineno;
	}

	public final void setBaseLineno(int lineno) {
		if ((lineno < 0) || ((baseLineno) >= 0))
			com.google.javascript.rhino.Kit.codeBug();
		
		baseLineno = lineno;
	}

	public final int getEndLineno() {
		return endLineno;
	}

	public final void setEndLineno(int lineno) {
		if ((lineno < 0) || ((endLineno) >= 0))
			com.google.javascript.rhino.Kit.codeBug();
		
		endLineno = lineno;
	}

	public final int getFunctionCount() {
		if ((functions) == null) {
			return 0;
		}
		return functions.size();
	}

	public final com.google.javascript.rhino.FunctionNode getFunctionNode(int i) {
		return ((com.google.javascript.rhino.FunctionNode) (functions.get(i)));
	}

	public final int addFunction(com.google.javascript.rhino.FunctionNode fnNode) {
		if (fnNode == null)
			com.google.javascript.rhino.Kit.codeBug();
		
		if ((functions) == null) {
			functions = new com.google.javascript.rhino.ObjArray();
		}
		functions.add(fnNode);
		return (functions.size()) - 1;
	}

	public final int getRegexpCount() {
		if ((regexps) == null) {
			return 0;
		}
		return (regexps.size()) / 2;
	}

	public final java.lang.String getRegexpString(int index) {
		return ((java.lang.String) (regexps.get((index * 2))));
	}

	public final java.lang.String getRegexpFlags(int index) {
		return ((java.lang.String) (regexps.get(((index * 2) + 1))));
	}

	public final int addRegexp(java.lang.String string, java.lang.String flags) {
		if (string == null)
			com.google.javascript.rhino.Kit.codeBug();
		
		if ((regexps) == null) {
			regexps = new com.google.javascript.rhino.ObjArray();
		}
		regexps.add(string);
		regexps.add(flags);
		return ((regexps.size()) / 2) - 1;
	}

	public final boolean hasParamOrVar(java.lang.String name) {
		return itsVariableNames.has(name);
	}

	public final int getParamOrVarIndex(java.lang.String name) {
		return itsVariableNames.get(name, (-1));
	}

	public final java.lang.String getParamOrVarName(int index) {
		return ((java.lang.String) (itsVariables.get(index)));
	}

	public final int getParamCount() {
		return varStart;
	}

	public final int getParamAndVarCount() {
		return itsVariables.size();
	}

	public final java.lang.String[] getParamAndVarNames() {
		int N = itsVariables.size();
		if (N == 0) {
			return com.google.javascript.rhino.ScriptRuntime.emptyStrings;
		}
		java.lang.String[] array = new java.lang.String[N];
		itsVariables.toArray(array);
		return array;
	}

	public final boolean[] getParamAndVarConst() {
		int N = itsVariables.size();
		boolean[] array = new boolean[N];
		for (int i = 0; i < N; i++)
			if ((itsConst.get(i)) != null)
				array[i] = true;
			
		
		return array;
	}

	public final void addParam(java.lang.String name) {
		if ((varStart) != (itsVariables.size()))
			com.google.javascript.rhino.Kit.codeBug();
		
		int index = (varStart)++;
		itsVariables.add(name);
		itsConst.add(null);
		itsVariableNames.put(name, index);
	}

	public static final int NO_DUPLICATE = 1;

	public static final int DUPLICATE_VAR = 0;

	public static final int DUPLICATE_PARAMETER = -1;

	public static final int DUPLICATE_CONST = -2;

	public final int addVar(java.lang.String name) {
		int vIndex = itsVariableNames.get(name, (-1));
		if (vIndex != (-1)) {
			if (vIndex >= (varStart)) {
				java.lang.Object v = itsConst.get(vIndex);
				if (v != null)
					return com.google.javascript.rhino.ScriptOrFnNode.DUPLICATE_CONST;
				else
					return com.google.javascript.rhino.ScriptOrFnNode.DUPLICATE_VAR;
				
			}else
				return com.google.javascript.rhino.ScriptOrFnNode.DUPLICATE_PARAMETER;
			
		}
		int index = itsVariables.size();
		itsVariables.add(name);
		itsConst.add(null);
		itsVariableNames.put(name, index);
		return com.google.javascript.rhino.ScriptOrFnNode.NO_DUPLICATE;
	}

	public final boolean addConst(java.lang.String name) {
		int vIndex = itsVariableNames.get(name, (-1));
		if (vIndex != (-1)) {
			return false;
		}
		int index = itsVariables.size();
		itsVariables.add(name);
		itsConst.add(name);
		itsVariableNames.put(name, index);
		return true;
	}

	public final void removeParamOrVar(java.lang.String name) {
		int i = itsVariableNames.get(name, (-1));
		if (i != (-1)) {
			itsVariables.remove(i);
			itsVariableNames.remove(name);
			com.google.javascript.rhino.ObjToIntMap.Iterator iter = itsVariableNames.newIterator();
			for (iter.start(); !(iter.done()); iter.next()) {
				int v = iter.getValue();
				if (v > i) {
					iter.setValue((v - 1));
				}
			}
		}
	}

	public final java.lang.Object getCompilerData() {
		return compilerData;
	}

	public final void setCompilerData(java.lang.Object data) {
		if (data == null)
			throw new java.lang.IllegalArgumentException();
		
		if ((compilerData) != null)
			throw new java.lang.IllegalStateException();
		
		compilerData = data;
	}

	private int encodedSourceStart;

	private int encodedSourceEnd;

	private java.lang.String sourceName;

	private int baseLineno = -1;

	private int endLineno = -1;

	private com.google.javascript.rhino.ObjArray functions;

	private com.google.javascript.rhino.ObjArray regexps;

	private com.google.javascript.rhino.ObjArray itsVariables = new com.google.javascript.rhino.ObjArray();

	private com.google.javascript.rhino.ObjArray itsConst = new com.google.javascript.rhino.ObjArray();

	private com.google.javascript.rhino.ObjToIntMap itsVariableNames = new com.google.javascript.rhino.ObjToIntMap(11);

	private int varStart;

	private java.lang.Object compilerData;
}

