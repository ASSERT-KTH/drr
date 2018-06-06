

package com.google.javascript.rhino;


public class Context {
	public static final int VERSION_UNKNOWN = -1;

	public static final int VERSION_DEFAULT = 0;

	public static final int VERSION_1_0 = 100;

	public static final int VERSION_1_1 = 110;

	public static final int VERSION_1_2 = 120;

	public static final int VERSION_1_3 = 130;

	public static final int VERSION_1_4 = 140;

	public static final int VERSION_1_5 = 150;

	public static final int VERSION_1_6 = 160;

	public static final int FEATURE_NON_ECMA_GET_YEAR = 1;

	public static final int FEATURE_MEMBER_EXPR_AS_FUNCTION_NAME = 2;

	public static final int FEATURE_RESERVED_KEYWORD_AS_IDENTIFIER = 3;

	public static final int FEATURE_TO_STRING_AS_SOURCE = 4;

	public static final int FEATURE_PARENT_PROTO_PROPRTIES = 5;

	public static final int FEATURE_E4X = 6;

	public static final int FEATURE_DYNAMIC_SCOPE = 7;

	public static final int FEATURE_STRICT_VARS = 8;

	public static final int FEATURE_STRICT_EVAL = 9;

	public static final int FEATURE_LOCATION_INFORMATION_IN_ERROR = 10;

	public static final int FEATURE_STRICT_MODE = 11;

	public static final int FEATURE_WARNING_AS_ERROR = 12;

	public static final java.lang.String languageVersionProperty = "language version";

	public static final java.lang.String errorReporterProperty = "error reporter";

	public static final java.lang.Object[] emptyArgs = com.google.javascript.rhino.ScriptRuntime.emptyArgs;

	public Context() {
		setLanguageVersion(com.google.javascript.rhino.Context.VERSION_DEFAULT);
	}

	public static com.google.javascript.rhino.Context enter() {
		return com.google.javascript.rhino.Context.enter(null);
	}

	public static com.google.javascript.rhino.Context enter(com.google.javascript.rhino.Context cx) {
		com.google.javascript.rhino.Context old = com.google.javascript.rhino.Context.getCurrentContext();
		if (cx == null) {
			if (old != null) {
				cx = old;
			}else {
				cx = new com.google.javascript.rhino.Context();
				com.google.javascript.rhino.Context.setThreadContext(cx);
			}
		}else {
			if ((cx.enterCount) != 0) {
				if (cx != old) {
					throw new java.lang.RuntimeException("Cannot enter Context active on another thread");
				}
			}else {
				if (old != null) {
					cx = old;
				}else {
					com.google.javascript.rhino.Context.setThreadContext(cx);
				}
			}
		}
		++(cx.enterCount);
		return cx;
	}

	public static void exit() {
		boolean released = false;
		com.google.javascript.rhino.Context cx = com.google.javascript.rhino.Context.getCurrentContext();
		if (cx == null) {
			throw new java.lang.RuntimeException("Calling Context.exit without previous Context.enter");
		}
		if ((cx.enterCount) < 1)
			com.google.javascript.rhino.Kit.codeBug();
		
		--(cx.enterCount);
		if ((cx.enterCount) == 0) {
			released = true;
			com.google.javascript.rhino.Context.setThreadContext(null);
		}
	}

	public static com.google.javascript.rhino.Context getCurrentContext() {
		return com.google.javascript.rhino.Context.threadContexts.get();
	}

	private static void setThreadContext(com.google.javascript.rhino.Context cx) {
		com.google.javascript.rhino.Context.threadContexts.set(cx);
	}

	private static java.lang.ThreadLocal<com.google.javascript.rhino.Context> threadContexts = new java.lang.ThreadLocal<com.google.javascript.rhino.Context>();

	public final boolean isSealed() {
		return sealed;
	}

	public final void seal(java.lang.Object sealKey) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		sealed = true;
		com.google.javascript.rhino.Context.this.sealKey = sealKey;
	}

	public final void unseal(java.lang.Object sealKey) {
		if (sealKey == null)
			throw new java.lang.IllegalArgumentException();
		
		if ((com.google.javascript.rhino.Context.this.sealKey) != sealKey)
			throw new java.lang.IllegalArgumentException();
		
		if (!(sealed))
			throw new java.lang.IllegalStateException();
		
		sealed = false;
		com.google.javascript.rhino.Context.this.sealKey = null;
	}

	static void onSealedMutation() {
		throw new java.lang.IllegalStateException();
	}

	public final int getLanguageVersion() {
		return version;
	}

	public void setLanguageVersion(int version) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		com.google.javascript.rhino.Context.checkLanguageVersion(version);
		java.lang.Object listeners = propertyListeners;
		if ((listeners != null) && (version != (com.google.javascript.rhino.Context.this.version))) {
			firePropertyChangeImpl(listeners, com.google.javascript.rhino.Context.languageVersionProperty, new java.lang.Integer(com.google.javascript.rhino.Context.this.version), new java.lang.Integer(version));
		}
		com.google.javascript.rhino.Context.this.version = version;
	}

	public static boolean isValidLanguageVersion(int version) {
		switch (version) {
			case com.google.javascript.rhino.Context.VERSION_DEFAULT :
			case com.google.javascript.rhino.Context.VERSION_1_0 :
			case com.google.javascript.rhino.Context.VERSION_1_1 :
			case com.google.javascript.rhino.Context.VERSION_1_2 :
			case com.google.javascript.rhino.Context.VERSION_1_3 :
			case com.google.javascript.rhino.Context.VERSION_1_4 :
			case com.google.javascript.rhino.Context.VERSION_1_5 :
			case com.google.javascript.rhino.Context.VERSION_1_6 :
				return true;
		}
		return false;
	}

	public static void checkLanguageVersion(int version) {
		if (com.google.javascript.rhino.Context.isValidLanguageVersion(version)) {
			return ;
		}
		throw new java.lang.IllegalArgumentException(("Bad language version: " + version));
	}

	public final java.lang.String getImplementationVersion() {
		if ((com.google.javascript.rhino.Context.implementationVersion) == null) {
			com.google.javascript.rhino.Context.implementationVersion = com.google.javascript.rhino.ScriptRuntime.getMessage0("implementation.version");
		}
		return com.google.javascript.rhino.Context.implementationVersion;
	}

	public final com.google.javascript.rhino.ErrorReporter getErrorReporter() {
		return errorReporter;
	}

	public final com.google.javascript.rhino.ErrorReporter setErrorReporter(com.google.javascript.rhino.ErrorReporter reporter) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		if (reporter == null)
			throw new java.lang.IllegalArgumentException();
		
		com.google.javascript.rhino.ErrorReporter old = getErrorReporter();
		if (reporter == old) {
			return old;
		}
		java.lang.Object listeners = propertyListeners;
		if (listeners != null) {
			firePropertyChangeImpl(listeners, com.google.javascript.rhino.Context.errorReporterProperty, old, reporter);
		}
		com.google.javascript.rhino.Context.this.errorReporter = reporter;
		return old;
	}

	public final java.util.Locale getLocale() {
		if ((locale) == null)
			locale = java.util.Locale.getDefault();
		
		return locale;
	}

	public final java.util.Locale setLocale(java.util.Locale loc) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		java.util.Locale result = locale;
		locale = loc;
		return result;
	}

	public final void addPropertyChangeListener(java.beans.PropertyChangeListener l) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		propertyListeners = com.google.javascript.rhino.Kit.addListener(propertyListeners, l);
	}

	public final void removePropertyChangeListener(java.beans.PropertyChangeListener l) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		propertyListeners = com.google.javascript.rhino.Kit.removeListener(propertyListeners, l);
	}

	final void firePropertyChange(java.lang.String property, java.lang.Object oldValue, java.lang.Object newValue) {
		java.lang.Object listeners = propertyListeners;
		if (listeners != null) {
			firePropertyChangeImpl(listeners, property, oldValue, newValue);
		}
	}

	private void firePropertyChangeImpl(java.lang.Object listeners, java.lang.String property, java.lang.Object oldValue, java.lang.Object newValue) {
		for (int i = 0; ; ++i) {
			java.lang.Object l = com.google.javascript.rhino.Kit.getListener(listeners, i);
			if (l == null)
				break;
			
			if (l instanceof java.beans.PropertyChangeListener) {
				java.beans.PropertyChangeListener pcl = ((java.beans.PropertyChangeListener) (l));
				pcl.propertyChange(new java.beans.PropertyChangeEvent(com.google.javascript.rhino.Context.this, property, oldValue, newValue));
			}
		}
	}

	public static void reportWarning(java.lang.String message, java.lang.String sourceName, int lineno, java.lang.String lineSource, int lineOffset) {
		com.google.javascript.rhino.Context cx = com.google.javascript.rhino.Context.getContext();
		cx.getErrorReporter().warning(message, sourceName, lineno, lineSource, lineOffset);
	}

	public static void reportWarning(java.lang.String message) {
		int[] linep = new int[]{ 0 };
		java.lang.String filename = com.google.javascript.rhino.Context.getSourcePositionFromStack(linep);
		com.google.javascript.rhino.Context.reportWarning(message, filename, linep[0], null, 0);
	}

	public static void reportError(java.lang.String message, java.lang.String sourceName, int lineno, java.lang.String lineSource, int lineOffset) {
		com.google.javascript.rhino.Context cx = com.google.javascript.rhino.Context.getCurrentContext();
		if (cx != null) {
			cx.getErrorReporter().error(message, sourceName, lineno, lineSource, lineOffset);
		}else {
			throw new com.google.javascript.rhino.EvaluatorException(message, sourceName, lineno, lineSource, lineOffset);
		}
	}

	public static void reportError(java.lang.String message) {
		int[] linep = new int[]{ 0 };
		java.lang.String filename = com.google.javascript.rhino.Context.getSourcePositionFromStack(linep);
		com.google.javascript.rhino.Context.reportError(message, filename, linep[0], null, 0);
	}

	public static com.google.javascript.rhino.EvaluatorException reportRuntimeError(java.lang.String message, java.lang.String sourceName, int lineno, java.lang.String lineSource, int lineOffset) {
		com.google.javascript.rhino.Context cx = com.google.javascript.rhino.Context.getCurrentContext();
		if (cx != null) {
			return cx.getErrorReporter().runtimeError(message, sourceName, lineno, lineSource, lineOffset);
		}else {
			throw new com.google.javascript.rhino.EvaluatorException(message, sourceName, lineno, lineSource, lineOffset);
		}
	}

	static com.google.javascript.rhino.EvaluatorException reportRuntimeError0(java.lang.String messageId) {
		java.lang.String msg = com.google.javascript.rhino.ScriptRuntime.getMessage0(messageId);
		return com.google.javascript.rhino.Context.reportRuntimeError(msg);
	}

	static com.google.javascript.rhino.EvaluatorException reportRuntimeError1(java.lang.String messageId, java.lang.Object arg1) {
		java.lang.String msg = com.google.javascript.rhino.ScriptRuntime.getMessage1(messageId, arg1);
		return com.google.javascript.rhino.Context.reportRuntimeError(msg);
	}

	static com.google.javascript.rhino.EvaluatorException reportRuntimeError2(java.lang.String messageId, java.lang.Object arg1, java.lang.Object arg2) {
		java.lang.String msg = com.google.javascript.rhino.ScriptRuntime.getMessage2(messageId, arg1, arg2);
		return com.google.javascript.rhino.Context.reportRuntimeError(msg);
	}

	static com.google.javascript.rhino.EvaluatorException reportRuntimeError3(java.lang.String messageId, java.lang.Object arg1, java.lang.Object arg2, java.lang.Object arg3) {
		java.lang.String msg = com.google.javascript.rhino.ScriptRuntime.getMessage3(messageId, arg1, arg2, arg3);
		return com.google.javascript.rhino.Context.reportRuntimeError(msg);
	}

	static com.google.javascript.rhino.EvaluatorException reportRuntimeError4(java.lang.String messageId, java.lang.Object arg1, java.lang.Object arg2, java.lang.Object arg3, java.lang.Object arg4) {
		java.lang.String msg = com.google.javascript.rhino.ScriptRuntime.getMessage4(messageId, arg1, arg2, arg3, arg4);
		return com.google.javascript.rhino.Context.reportRuntimeError(msg);
	}

	public static com.google.javascript.rhino.EvaluatorException reportRuntimeError(java.lang.String message) {
		int[] linep = new int[]{ 0 };
		java.lang.String filename = com.google.javascript.rhino.Context.getSourcePositionFromStack(linep);
		return com.google.javascript.rhino.Context.reportRuntimeError(message, filename, linep[0], null, 0);
	}

	public final boolean isGeneratingDebug() {
		return generatingDebug;
	}

	public final boolean isGeneratingSource() {
		return generatingSource;
	}

	public final void setGeneratingSource(boolean generatingSource) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		com.google.javascript.rhino.Context.this.generatingSource = generatingSource;
	}

	public final int getOptimizationLevel() {
		return optimizationLevel;
	}

	public static boolean isValidOptimizationLevel(int optimizationLevel) {
		return ((-1) <= optimizationLevel) && (optimizationLevel <= 9);
	}

	public static void checkOptimizationLevel(int optimizationLevel) {
		if (com.google.javascript.rhino.Context.isValidOptimizationLevel(optimizationLevel)) {
			return ;
		}
		throw new java.lang.IllegalArgumentException(("Optimization level outside [-1..9]: " + optimizationLevel));
	}

	public final java.lang.Object getThreadLocal(java.lang.Object key) {
		if ((hashtable) == null)
			return null;
		
		return hashtable.get(key);
	}

	public final void putThreadLocal(java.lang.Object key, java.lang.Object value) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		if ((hashtable) == null)
			hashtable = new java.util.Hashtable<java.lang.Object, java.lang.Object>();
		
		hashtable.put(key, value);
	}

	public final void removeThreadLocal(java.lang.Object key) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		if ((hashtable) == null)
			return ;
		
		hashtable.remove(key);
	}

	@java.lang.Deprecated
	public final boolean hasCompileFunctionsWithDynamicScope() {
		return compileFunctionsWithDynamicScopeFlag;
	}

	@java.lang.Deprecated
	public final void setCompileFunctionsWithDynamicScope(boolean flag) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		compileFunctionsWithDynamicScopeFlag = flag;
	}

	public final java.lang.Object getDebuggerContextData() {
		return debuggerData;
	}

	protected boolean hasFeature(int featureIndex) {
		int version;
		switch (featureIndex) {
			case com.google.javascript.rhino.Context.FEATURE_NON_ECMA_GET_YEAR :
				version = getLanguageVersion();
				return ((version == (com.google.javascript.rhino.Context.VERSION_1_0)) || (version == (com.google.javascript.rhino.Context.VERSION_1_1))) || (version == (com.google.javascript.rhino.Context.VERSION_1_2));
			case com.google.javascript.rhino.Context.FEATURE_MEMBER_EXPR_AS_FUNCTION_NAME :
				return false;
			case com.google.javascript.rhino.Context.FEATURE_RESERVED_KEYWORD_AS_IDENTIFIER :
				return false;
			case com.google.javascript.rhino.Context.FEATURE_TO_STRING_AS_SOURCE :
				version = getLanguageVersion();
				return version == (com.google.javascript.rhino.Context.VERSION_1_2);
			case com.google.javascript.rhino.Context.FEATURE_PARENT_PROTO_PROPRTIES :
				return true;
			case com.google.javascript.rhino.Context.FEATURE_E4X :
				version = getLanguageVersion();
				return (version == (com.google.javascript.rhino.Context.VERSION_DEFAULT)) || (version >= (com.google.javascript.rhino.Context.VERSION_1_6));
			case com.google.javascript.rhino.Context.FEATURE_DYNAMIC_SCOPE :
				return false;
			case com.google.javascript.rhino.Context.FEATURE_STRICT_VARS :
				return false;
			case com.google.javascript.rhino.Context.FEATURE_STRICT_EVAL :
				return false;
			case com.google.javascript.rhino.Context.FEATURE_STRICT_MODE :
				return false;
			case com.google.javascript.rhino.Context.FEATURE_WARNING_AS_ERROR :
				return false;
		}
		throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(featureIndex));
	}

	public final int getInstructionObserverThreshold() {
		return instructionThreshold;
	}

	public final void setInstructionObserverThreshold(int threshold) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		if (threshold < 0)
			throw new java.lang.IllegalArgumentException();
		
		instructionThreshold = threshold;
	}

	static com.google.javascript.rhino.Context getContext() {
		com.google.javascript.rhino.Context cx = com.google.javascript.rhino.Context.getCurrentContext();
		if (cx == null) {
			throw new java.lang.RuntimeException("No Context associated with current Thread");
		}
		return cx;
	}

	final boolean isVersionECMA1() {
		return ((version) == (com.google.javascript.rhino.Context.VERSION_DEFAULT)) || ((version) >= (com.google.javascript.rhino.Context.VERSION_1_3));
	}

	static java.lang.String getSourcePositionFromStack(int[] linep) {
		com.google.javascript.rhino.Context cx = com.google.javascript.rhino.Context.getCurrentContext();
		if (cx == null)
			return null;
		
		java.io.CharArrayWriter writer = new java.io.CharArrayWriter();
		java.lang.RuntimeException re = new java.lang.RuntimeException();
		re.printStackTrace(new java.io.PrintWriter(writer));
		java.lang.String s = writer.toString();
		int open = -1;
		int close = -1;
		int colon = -1;
		for (int i = 0; i < (s.length()); i++) {
			char c = s.charAt(i);
			if (c == ':')
				colon = i;
			else
				if (c == '(')
					open = i;
				else
					if (c == ')')
						close = i;
					else
						if ((((((c == '\n') && (open != (-1))) && (close != (-1))) && (colon != (-1))) && (open < colon)) && (colon < close)) {
							java.lang.String fileStr = s.substring((open + 1), colon);
							if (!(fileStr.endsWith(".java"))) {
								java.lang.String lineStr = s.substring((colon + 1), close);
								try {
									linep[0] = java.lang.Integer.parseInt(lineStr);
									if ((linep[0]) < 0) {
										linep[0] = 0;
									}
									return fileStr;
								} catch (java.lang.NumberFormatException e) {
								}
							}
							open = close = colon = -1;
						}
					
				
			
		}
		return null;
	}

	public final boolean isGeneratingDebugChanged() {
		return generatingDebugChanged;
	}

	public void addActivationName(java.lang.String name) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		if ((activationNames) == null)
			activationNames = new java.util.Hashtable<java.lang.Object, java.lang.Object>(5);
		
		activationNames.put(name, name);
	}

	public final boolean isActivationNeeded(java.lang.String name) {
		return ((activationNames) != null) && (activationNames.containsKey(name));
	}

	public void removeActivationName(java.lang.String name) {
		if (sealed)
			com.google.javascript.rhino.Context.onSealedMutation();
		
		if ((activationNames) != null)
			activationNames.remove(name);
		
	}

	private static java.lang.String implementationVersion;

	private boolean sealed;

	private java.lang.Object sealKey;

	com.google.javascript.rhino.ObjToIntMap iterating;

	java.lang.Object interpreterSecurityDomain;

	int version;

	private com.google.javascript.rhino.ErrorReporter errorReporter;

	private java.util.Locale locale;

	private boolean generatingDebug;

	private boolean generatingDebugChanged;

	private boolean generatingSource = true;

	boolean compileFunctionsWithDynamicScopeFlag;

	boolean useDynamicScope;

	private java.lang.Object debuggerData;

	private int enterCount;

	private int optimizationLevel;

	private java.lang.Object propertyListeners;

	private java.util.Hashtable<java.lang.Object, java.lang.Object> hashtable;

	java.util.Hashtable<java.lang.Object, java.lang.Object> activationNames;

	java.lang.Object lastInterpreterFrame;

	com.google.javascript.rhino.ObjArray previousInterpreterInvocations;

	int instructionCount;

	int instructionThreshold;

	int scratchIndex;

	long scratchUint32;
}

