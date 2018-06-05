

package com.google.javascript.rhino;


public class Parser {
	static final int CLEAR_TI_MASK = 65535;

	static final int TI_AFTER_EOL = 1 << 16;

	static final int TI_CHECK_LABEL = 1 << 17;

	com.google.javascript.rhino.CompilerEnvirons compilerEnv;

	private com.google.javascript.rhino.ErrorReporter errorReporter;

	private java.lang.String sourceURI;

	boolean calledByCompileFunction;

	private com.google.javascript.rhino.TokenStream ts;

	private int currentFlaggedToken;

	private int syntaxErrorCount;

	private com.google.javascript.rhino.IRFactory nf;

	private int nestingOfFunction;

	private com.google.javascript.rhino.Decompiler decompiler;

	com.google.javascript.rhino.ScriptOrFnNode currentScriptOrFn;

	private int nestingOfWith;

	private java.util.Hashtable<java.lang.String, com.google.javascript.rhino.Node> labelSet;

	private com.google.javascript.rhino.ObjArray loopSet;

	private com.google.javascript.rhino.ObjArray loopAndSwitchSet;

	private boolean hasReturnValue;

	private int functionEndFlags;

	private static class ParserException extends java.lang.RuntimeException {
		static final long serialVersionUID = 5882582646773765630L;
	}

	public static com.google.javascript.rhino.ScriptOrFnNode parse(java.lang.String sourceString, java.lang.String sourceURI) {
		return com.google.javascript.rhino.Parser.parse(sourceString, sourceURI, false);
	}

	public static com.google.javascript.rhino.ScriptOrFnNode parseWithJSDoc(java.lang.String sourceString, java.lang.String sourceURI) {
		return com.google.javascript.rhino.Parser.parse(sourceString, sourceURI, true);
	}

	private static com.google.javascript.rhino.ScriptOrFnNode parse(java.lang.String sourceString, java.lang.String sourceURI, boolean parseJSDoc) {
		com.google.javascript.rhino.Context cx = com.google.javascript.rhino.Context.enter();
		com.google.javascript.rhino.SimpleErrorReporter errorReporter = new com.google.javascript.rhino.SimpleErrorReporter();
		cx.setErrorReporter(errorReporter);
		com.google.javascript.rhino.CompilerEnvirons compilerEnv = new com.google.javascript.rhino.CompilerEnvirons();
		compilerEnv.initFromContext(cx);
		if (parseJSDoc) {
			compilerEnv.setParseJSDoc(true);
		}
		com.google.javascript.rhino.Parser p = new com.google.javascript.rhino.Parser(compilerEnv, errorReporter);
		com.google.javascript.rhino.ScriptOrFnNode root = null;
		try {
			root = p.parse(sourceString, sourceURI, 1);
		} catch (com.google.javascript.rhino.EvaluatorException e) {
			errorReporter.error(e.details(), e.sourceName(), e.lineNumber(), e.lineSource(), e.lineNumber());
		} finally {
			com.google.javascript.rhino.Context.exit();
		}
		java.util.List<java.lang.String> errors = errorReporter.errors();
		if (errors != null) {
			java.lang.StringBuilder message = new java.lang.StringBuilder();
			for (java.lang.String error : errors) {
				if ((message.length()) > 0) {
					message.append('\n');
				}
				message.append(error);
			}
			throw new com.google.javascript.rhino.RhinoException(message.toString());
		}
		return root;
	}

	public Parser(com.google.javascript.rhino.CompilerEnvirons compilerEnv, com.google.javascript.rhino.ErrorReporter errorReporter) {
		com.google.javascript.rhino.Parser.this.compilerEnv = compilerEnv;
		com.google.javascript.rhino.Parser.this.errorReporter = errorReporter;
	}

	com.google.javascript.rhino.Decompiler createDecompiler(com.google.javascript.rhino.CompilerEnvirons compilerEnv) {
		return new com.google.javascript.rhino.Decompiler();
	}

	void addStrictWarning(java.lang.String messageId, java.lang.String messageArg) {
		if (compilerEnv.isStrictMode())
			addWarning(messageId, messageArg);
		
	}

	void addWarning(java.lang.String messageId) {
		reportWarning(com.google.javascript.rhino.ScriptRuntime.getMessage0(messageId), ts.getLineno(), ts.getOffset(), ts.getLine());
	}

	void addWarning(java.lang.String messageId, java.lang.String messageArg) {
		reportWarning(com.google.javascript.rhino.ScriptRuntime.getMessage1(messageId, messageArg), ts.getLineno(), ts.getOffset(), ts.getLine());
	}

	void addWarning(java.lang.String messageId, int lineno, int charno) {
		reportWarning(com.google.javascript.rhino.ScriptRuntime.getMessage0(messageId), lineno, charno, null);
	}

	void addWarning(java.lang.String messageId, java.lang.String messageArg, int lineno, int charno) {
		reportWarning(com.google.javascript.rhino.ScriptRuntime.getMessage1(messageId, messageArg), lineno, charno, null);
	}

	private void reportWarning(java.lang.String message, int lineno, int charno, java.lang.String code) {
		if (compilerEnv.reportWarningAsError()) {
			++(syntaxErrorCount);
			errorReporter.error(message, sourceURI, lineno, code, charno);
		}else
			errorReporter.warning(message, sourceURI, lineno, code, charno);
		
	}

	void addError(java.lang.String messageId) {
		++(syntaxErrorCount);
		java.lang.String message = com.google.javascript.rhino.ScriptRuntime.getMessage0(messageId);
		errorReporter.error(message, sourceURI, ts.getLineno(), ts.getLine(), ts.getOffset());
	}

	void addError(java.lang.String messageId, java.lang.String messageArg) {
		++(syntaxErrorCount);
		java.lang.String message = com.google.javascript.rhino.ScriptRuntime.getMessage1(messageId, messageArg);
		errorReporter.error(message, sourceURI, ts.getLineno(), ts.getLine(), ts.getOffset());
	}

	java.lang.RuntimeException reportError(java.lang.String messageId) {
		addError(messageId);
		throw new com.google.javascript.rhino.Parser.ParserException();
	}

	private int peekToken() throws java.io.IOException {
		int tt = currentFlaggedToken;
		if (tt == (com.google.javascript.rhino.Token.EOF)) {
			tt = ts.getToken();
			if (tt == (com.google.javascript.rhino.Token.EOL)) {
				do {
					tt = ts.getToken();
				} while (tt == (com.google.javascript.rhino.Token.EOL) );
				tt |= com.google.javascript.rhino.Parser.TI_AFTER_EOL;
			}
			currentFlaggedToken = tt;
		}
		return tt & (com.google.javascript.rhino.Parser.CLEAR_TI_MASK);
	}

	private int peekFlaggedToken() throws java.io.IOException {
		peekToken();
		return currentFlaggedToken;
	}

	private void consumeToken() {
		currentFlaggedToken = com.google.javascript.rhino.Token.EOF;
	}

	private int nextToken() throws java.io.IOException {
		int tt = peekToken();
		consumeToken();
		return tt;
	}

	private int nextFlaggedToken() throws java.io.IOException {
		peekToken();
		int ttFlagged = currentFlaggedToken;
		consumeToken();
		return ttFlagged;
	}

	private boolean matchToken(int toMatch) throws java.io.IOException {
		int tt = peekToken();
		if (tt != toMatch) {
			return false;
		}
		consumeToken();
		return true;
	}

	private int peekTokenOrEOL() throws java.io.IOException {
		int tt = peekToken();
		if (((currentFlaggedToken) & (com.google.javascript.rhino.Parser.TI_AFTER_EOL)) != 0) {
			tt = com.google.javascript.rhino.Token.EOL;
		}
		return tt;
	}

	private void setCheckForLabel() {
		if (((currentFlaggedToken) & (com.google.javascript.rhino.Parser.CLEAR_TI_MASK)) != (com.google.javascript.rhino.Token.NAME))
			throw com.google.javascript.rhino.Kit.codeBug();
		
		currentFlaggedToken |= com.google.javascript.rhino.Parser.TI_CHECK_LABEL;
	}

	private void mustMatchToken(int toMatch, java.lang.String messageId) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		if (!(matchToken(toMatch))) {
			reportError(messageId);
		}
	}

	private void mustHaveXML() {
		if (!(compilerEnv.isXmlAvailable())) {
			reportError("msg.XML.not.available");
		}
	}

	boolean insideFunction() {
		return (nestingOfFunction) != 0;
	}

	private com.google.javascript.rhino.Node enterSwitch(com.google.javascript.rhino.Node switchSelector, int lineno, int charno) {
		com.google.javascript.rhino.Node switchNode = nf.createSwitch(lineno, charno);
		switchNode.addChildToBack(switchSelector);
		if ((loopAndSwitchSet) == null) {
			loopAndSwitchSet = new com.google.javascript.rhino.ObjArray();
		}
		loopAndSwitchSet.push(switchNode);
		return switchNode;
	}

	private void exitSwitch() {
		loopAndSwitchSet.pop();
	}

	public com.google.javascript.rhino.TokenStream initForUnitTest(java.io.Reader sourceReader, java.lang.String sourceURI, int lineno, boolean parseJSDoc) {
		com.google.javascript.rhino.Parser.this.sourceURI = sourceURI;
		com.google.javascript.rhino.Parser.this.ts = new com.google.javascript.rhino.TokenStream(com.google.javascript.rhino.Parser.this, sourceReader, null, lineno);
		return ts;
	}

	public com.google.javascript.rhino.ScriptOrFnNode parse(java.lang.String sourceString, java.lang.String sourceURI, int lineno) {
		com.google.javascript.rhino.Parser.this.sourceURI = sourceURI;
		com.google.javascript.rhino.Parser.this.ts = new com.google.javascript.rhino.TokenStream(com.google.javascript.rhino.Parser.this, null, sourceString, lineno);
		try {
			return parse();
		} catch (java.io.IOException ex) {
			throw new java.lang.IllegalStateException();
		}
	}

	public com.google.javascript.rhino.ScriptOrFnNode parse(java.io.Reader sourceReader, java.lang.String sourceURI, int lineno) throws java.io.IOException {
		com.google.javascript.rhino.Parser.this.sourceURI = sourceURI;
		com.google.javascript.rhino.Parser.this.ts = new com.google.javascript.rhino.TokenStream(com.google.javascript.rhino.Parser.this, sourceReader, null, lineno);
		return parse();
	}

	private com.google.javascript.rhino.ScriptOrFnNode parse() throws java.io.IOException {
		com.google.javascript.rhino.Parser.this.decompiler = createDecompiler(compilerEnv);
		com.google.javascript.rhino.Parser.this.nf = new com.google.javascript.rhino.IRFactory(com.google.javascript.rhino.Parser.this);
		currentScriptOrFn = nf.createScript();
		int sourceStartOffset = decompiler.getCurrentOffset();
		decompiler.addToken(com.google.javascript.rhino.Token.SCRIPT);
		com.google.javascript.rhino.Parser.this.currentFlaggedToken = com.google.javascript.rhino.Token.EOF;
		com.google.javascript.rhino.Parser.this.syntaxErrorCount = 0;
		ts.setFileLevelJsDocBuilder(currentScriptOrFn.getJsDocBuilderForNode());
		int baseLineno = ts.getLineno();
		int baseCharno = ts.getCharno();
		com.google.javascript.rhino.Node pn = nf.createLeaf(com.google.javascript.rhino.Token.BLOCK, baseLineno, baseCharno);
		try {
			for (; ;) {
				int tt = peekToken();
				if (tt <= (com.google.javascript.rhino.Token.EOF)) {
					break;
				}
				com.google.javascript.rhino.Node n;
				if (tt == (com.google.javascript.rhino.Token.FUNCTION)) {
					consumeToken();
					try {
						n = function((calledByCompileFunction ? com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION : com.google.javascript.rhino.FunctionNode.FUNCTION_STATEMENT));
					} catch (com.google.javascript.rhino.Parser.ParserException e) {
						break;
					}
				}else {
					n = statement();
				}
				nf.addChildToBack(pn, n);
			}
		} catch (java.lang.StackOverflowError ex) {
			java.lang.String msg = com.google.javascript.rhino.ScriptRuntime.getMessage0("msg.too.deep.parser.recursion");
			throw com.google.javascript.rhino.Context.reportRuntimeError(msg, sourceURI, ts.getLineno(), null, 0);
		}
		if ((com.google.javascript.rhino.Parser.this.syntaxErrorCount) != 0) {
			java.lang.String msg = java.lang.String.valueOf(com.google.javascript.rhino.Parser.this.syntaxErrorCount);
			msg = com.google.javascript.rhino.ScriptRuntime.getMessage1("msg.got.syntax.errors", msg);
			throw errorReporter.runtimeError(msg, sourceURI, baseLineno, null, 0);
		}
		currentScriptOrFn.setSourceName(sourceURI);
		currentScriptOrFn.setBaseLineno(baseLineno);
		currentScriptOrFn.setEndLineno(ts.getLineno());
		if ((currentScriptOrFn.getJSDocInfo()) == null) {
			currentScriptOrFn.setJSDocInfo(ts.getFileOverviewJSDocInfo());
		}
		int sourceEndOffset = decompiler.getCurrentOffset();
		currentScriptOrFn.setEncodedSourceBounds(sourceStartOffset, sourceEndOffset);
		nf.initScript(currentScriptOrFn, pn);
		currentScriptOrFn.setIsSyntheticBlock(true);
		com.google.javascript.rhino.Parser.this.decompiler = null;
		return currentScriptOrFn;
	}

	private com.google.javascript.rhino.Node parseFunctionBody() throws java.io.IOException {
		++(nestingOfFunction);
		com.google.javascript.rhino.Node pn = nf.createBlock(ts.getLineno(), ts.getCharno());
		try {
			bodyLoop : for (; ;) {
				com.google.javascript.rhino.Node n;
				int tt = peekToken();
				switch (tt) {
					case com.google.javascript.rhino.Token.ERROR :
					case com.google.javascript.rhino.Token.EOF :
					case com.google.javascript.rhino.Token.RC :
						break bodyLoop;
					case com.google.javascript.rhino.Token.FUNCTION :
						consumeToken();
						n = function(com.google.javascript.rhino.FunctionNode.FUNCTION_STATEMENT);
						break;
					default :
						n = statement();
						break;
				}
				nf.addChildToBack(pn, n);
			}
		} catch (com.google.javascript.rhino.Parser.ParserException e) {
		} finally {
			--(nestingOfFunction);
		}
		return pn;
	}

	private com.google.javascript.rhino.Node function(int functionType) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		int syntheticType = functionType;
		int baseLineno = ts.getLineno();
		int baseCharno = ts.getCharno();
		int functionSourceStart = decompiler.markFunctionStart(functionType);
		java.lang.String name;
		com.google.javascript.rhino.Node memberExprNode = null;
		int nameLineno;
		int nameCharno;
		if (matchToken(com.google.javascript.rhino.Token.NAME)) {
			name = ts.getString();
			nameLineno = ts.getLineno();
			nameCharno = ts.getCharno();
			decompiler.addName(name);
			if (!(matchToken(com.google.javascript.rhino.Token.LP))) {
				if (compilerEnv.isAllowMemberExprAsFunctionName()) {
					com.google.javascript.rhino.Node memberExprHead = nf.createName(name, nameLineno, nameCharno);
					name = "";
					memberExprNode = memberExprTail(false, memberExprHead);
				}
				mustMatchToken(com.google.javascript.rhino.Token.LP, "msg.no.paren.parms");
			}
		}else {
			name = "";
			nameLineno = ts.getLineno();
			nameCharno = ts.getCharno();
			if (!(matchToken(com.google.javascript.rhino.Token.LP))) {
				if (compilerEnv.isAllowMemberExprAsFunctionName()) {
					memberExprNode = memberExpr(false);
				}
				mustMatchToken(com.google.javascript.rhino.Token.LP, "msg.no.paren.parms");
			}
		}
		if (memberExprNode != null) {
			syntheticType = com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION;
		}
		boolean nested = insideFunction();
		com.google.javascript.rhino.FunctionNode fnNode = nf.createFunction(name, nameLineno, nameCharno);
		if (nested || ((nestingOfWith) > 0)) {
			fnNode.itsIgnoreDynamicScope = true;
		}
		int functionIndex = currentScriptOrFn.addFunction(fnNode);
		int functionSourceEnd;
		com.google.javascript.rhino.ScriptOrFnNode savedScriptOrFn = currentScriptOrFn;
		currentScriptOrFn = fnNode;
		int savedNestingOfWith = nestingOfWith;
		nestingOfWith = 0;
		java.util.Hashtable<java.lang.String, com.google.javascript.rhino.Node> savedLabelSet = labelSet;
		labelSet = null;
		com.google.javascript.rhino.ObjArray savedLoopSet = loopSet;
		loopSet = null;
		com.google.javascript.rhino.ObjArray savedLoopAndSwitchSet = loopAndSwitchSet;
		loopAndSwitchSet = null;
		boolean savedHasReturnValue = hasReturnValue;
		int savedFunctionEndFlags = functionEndFlags;
		com.google.javascript.rhino.Node args;
		com.google.javascript.rhino.Node body;
		com.google.javascript.rhino.JSDocInfo info = ts.getAndResetJSDocInfo();
		try {
			decompiler.addToken(com.google.javascript.rhino.Token.LP);
			args = nf.createLeaf(com.google.javascript.rhino.Token.LP, ts.getLineno(), ts.getCharno());
			if (!(matchToken(com.google.javascript.rhino.Token.RP))) {
				boolean first = true;
				do {
					if (!first)
						decompiler.addToken(com.google.javascript.rhino.Token.COMMA);
					
					first = false;
					mustMatchToken(com.google.javascript.rhino.Token.NAME, "msg.no.parm");
					java.lang.String s = ts.getString();
					nf.addChildToBack(args, nf.createName(s, ts.getLineno(), ts.getCharno()));
					decompiler.addName(s);
				} while (matchToken(com.google.javascript.rhino.Token.COMMA) );
				mustMatchToken(com.google.javascript.rhino.Token.RP, "msg.no.paren.after.parms");
			}
			decompiler.addToken(com.google.javascript.rhino.Token.RP);
			mustMatchToken(com.google.javascript.rhino.Token.LC, "msg.no.brace.body");
			decompiler.addEOL(com.google.javascript.rhino.Token.LC);
			body = parseFunctionBody();
			mustMatchToken(com.google.javascript.rhino.Token.RC, "msg.no.brace.after.body");
			decompiler.addToken(com.google.javascript.rhino.Token.RC);
			functionSourceEnd = decompiler.markFunctionEnd(functionSourceStart);
			if (functionType != (com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION)) {
				if ((compilerEnv.getLanguageVersion()) >= (com.google.javascript.rhino.Context.VERSION_1_2)) {
					int tt = peekTokenOrEOL();
					if (tt == (com.google.javascript.rhino.Token.FUNCTION)) {
						reportError("msg.no.semi.stmt");
					}
				}
				decompiler.addToken(com.google.javascript.rhino.Token.EOL);
			}
		} finally {
			hasReturnValue = savedHasReturnValue;
			functionEndFlags = savedFunctionEndFlags;
			loopAndSwitchSet = savedLoopAndSwitchSet;
			loopSet = savedLoopSet;
			labelSet = savedLabelSet;
			nestingOfWith = savedNestingOfWith;
			currentScriptOrFn = savedScriptOrFn;
		}
		fnNode.setEncodedSourceBounds(functionSourceStart, functionSourceEnd);
		fnNode.setSourceName(sourceURI);
		fnNode.setBaseLineno(baseLineno);
		fnNode.setEndLineno(ts.getLineno());
		com.google.javascript.rhino.Node pn = nf.initFunction(fnNode, functionIndex, args, info, body, syntheticType);
		if (memberExprNode != null) {
			pn = nf.createAssignment(com.google.javascript.rhino.Token.ASSIGN, memberExprNode, pn, baseLineno, baseCharno);
			if (functionType != (com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION)) {
				pn = nf.createExprStatementNoReturn(pn, baseLineno, baseCharno);
			}
		}
		return pn;
	}

	private com.google.javascript.rhino.Node statements() throws java.io.IOException {
		com.google.javascript.rhino.Node pn = nf.createBlock(ts.getLineno(), ts.getCharno());
		int tt;
		while (((tt = peekToken()) > (com.google.javascript.rhino.Token.EOF)) && (tt != (com.google.javascript.rhino.Token.RC))) {
			nf.addChildToBack(pn, statement());
		} 
		return pn;
	}

	private com.google.javascript.rhino.Node condition() throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		mustMatchToken(com.google.javascript.rhino.Token.LP, "msg.no.paren.cond");
		decompiler.addToken(com.google.javascript.rhino.Token.LP);
		com.google.javascript.rhino.Node pn = expr(false);
		mustMatchToken(com.google.javascript.rhino.Token.RP, "msg.no.paren.after.cond");
		decompiler.addToken(com.google.javascript.rhino.Token.RP);
		if (((pn.getProp(com.google.javascript.rhino.Node.PARENTHESIZED_PROP)) == null) && ((((pn.getType()) == (com.google.javascript.rhino.Token.SETNAME)) || ((pn.getType()) == (com.google.javascript.rhino.Token.SETPROP))) || ((pn.getType()) == (com.google.javascript.rhino.Token.SETELEM)))) {
			addStrictWarning("msg.equal.as.assign", "");
		}
		return pn;
	}

	private java.lang.String matchLabel() throws com.google.javascript.rhino.JavaScriptException, java.io.IOException {
		int lineno = ts.getLineno();
		java.lang.String label = null;
		int tt = peekTokenOrEOL();
		if (tt == (com.google.javascript.rhino.Token.NAME)) {
			consumeToken();
			label = ts.getString();
			decompiler.addName(label);
			com.google.javascript.rhino.Node n = null;
			if ((labelSet) != null) {
				n = labelSet.get(label);
			}
			if (n == null) {
				reportError("msg.undef.label");
			}
		}
		return label;
	}

	private com.google.javascript.rhino.Node statement() throws java.io.IOException {
		try {
			com.google.javascript.rhino.Node pn = statementHelper(null);
			if (pn != null) {
				if ((compilerEnv.isStrictMode()) && (!(pn.hasSideEffects())))
					addStrictWarning("msg.no.side.effects", "");
				
				return pn;
			}
		} catch (com.google.javascript.rhino.Parser.ParserException e) {
		}
		int lineno = ts.getLineno();
		int charno = ts.getCharno();
		guessingStatementEnd : for (; ;) {
			int tt = peekTokenOrEOL();
			consumeToken();
			switch (tt) {
				case com.google.javascript.rhino.Token.ERROR :
				case com.google.javascript.rhino.Token.EOF :
				case com.google.javascript.rhino.Token.EOL :
				case com.google.javascript.rhino.Token.SEMI :
					break guessingStatementEnd;
			}
		}
		return nf.createExprStatement(nf.createErrorName(), lineno, charno);
	}

	private com.google.javascript.rhino.Node statementHelper(com.google.javascript.rhino.Node statementLabel) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = null;
		int tt;
		tt = peekToken();
		switch (tt) {
			case com.google.javascript.rhino.Token.IF :
				{
					consumeToken();
					decompiler.addToken(com.google.javascript.rhino.Token.IF);
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					com.google.javascript.rhino.Node cond = condition();
					decompiler.addEOL(com.google.javascript.rhino.Token.LC);
					com.google.javascript.rhino.Node ifTrue = statement();
					com.google.javascript.rhino.Node ifFalse = null;
					if (matchToken(com.google.javascript.rhino.Token.ELSE)) {
						decompiler.addToken(com.google.javascript.rhino.Token.RC);
						decompiler.addToken(com.google.javascript.rhino.Token.ELSE);
						decompiler.addEOL(com.google.javascript.rhino.Token.LC);
						ifFalse = statement();
					}
					decompiler.addEOL(com.google.javascript.rhino.Token.RC);
					pn = nf.createIf(cond, ifTrue, ifFalse, lineno, charno);
					return pn;
				}
			case com.google.javascript.rhino.Token.SWITCH :
				{
					consumeToken();
					decompiler.addToken(com.google.javascript.rhino.Token.SWITCH);
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					mustMatchToken(com.google.javascript.rhino.Token.LP, "msg.no.paren.switch");
					decompiler.addToken(com.google.javascript.rhino.Token.LP);
					pn = enterSwitch(expr(false), lineno, charno);
					try {
						mustMatchToken(com.google.javascript.rhino.Token.RP, "msg.no.paren.after.switch");
						decompiler.addToken(com.google.javascript.rhino.Token.RP);
						mustMatchToken(com.google.javascript.rhino.Token.LC, "msg.no.brace.switch");
						decompiler.addEOL(com.google.javascript.rhino.Token.LC);
						boolean hasDefault = false;
						switchLoop : for (; ;) {
							tt = nextToken();
							lineno = ts.getLineno();
							charno = ts.getCharno();
							com.google.javascript.rhino.Node caseExpression;
							switch (tt) {
								case com.google.javascript.rhino.Token.RC :
									break switchLoop;
								case com.google.javascript.rhino.Token.CASE :
									decompiler.addToken(com.google.javascript.rhino.Token.CASE);
									caseExpression = expr(false);
									mustMatchToken(com.google.javascript.rhino.Token.COLON, "msg.no.colon.case");
									decompiler.addEOL(com.google.javascript.rhino.Token.COLON);
									break;
								case com.google.javascript.rhino.Token.DEFAULT :
									if (hasDefault) {
										reportError("msg.double.switch.default");
									}
									decompiler.addToken(com.google.javascript.rhino.Token.DEFAULT);
									hasDefault = true;
									caseExpression = null;
									mustMatchToken(com.google.javascript.rhino.Token.COLON, "msg.no.colon.case");
									decompiler.addEOL(com.google.javascript.rhino.Token.COLON);
									break;
								default :
									reportError("msg.bad.switch");
									break switchLoop;
							}
							com.google.javascript.rhino.Node block = nf.createLeaf(com.google.javascript.rhino.Token.BLOCK, lineno, charno);
							block.setIsSyntheticBlock(true);
							while (((((tt = peekToken()) != (com.google.javascript.rhino.Token.RC)) && (tt != (com.google.javascript.rhino.Token.CASE))) && (tt != (com.google.javascript.rhino.Token.DEFAULT))) && (tt != (com.google.javascript.rhino.Token.EOF))) {
								nf.addChildToBack(block, statement());
							} 
							nf.addSwitchCase(pn, caseExpression, block, lineno, charno);
						}
						decompiler.addEOL(com.google.javascript.rhino.Token.RC);
						nf.closeSwitch(pn);
					} finally {
						exitSwitch();
					}
					return pn;
				}
			case com.google.javascript.rhino.Token.WHILE :
				{
					consumeToken();
					decompiler.addToken(com.google.javascript.rhino.Token.WHILE);
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					com.google.javascript.rhino.Node cond = condition();
					decompiler.addEOL(com.google.javascript.rhino.Token.LC);
					com.google.javascript.rhino.Node body = statement();
					decompiler.addEOL(com.google.javascript.rhino.Token.RC);
					pn = nf.createWhile(cond, body, lineno, charno);
					return pn;
				}
			case com.google.javascript.rhino.Token.DO :
				{
					consumeToken();
					decompiler.addToken(com.google.javascript.rhino.Token.DO);
					decompiler.addEOL(com.google.javascript.rhino.Token.LC);
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					com.google.javascript.rhino.Node body = statement();
					decompiler.addToken(com.google.javascript.rhino.Token.RC);
					mustMatchToken(com.google.javascript.rhino.Token.WHILE, "msg.no.while.do");
					decompiler.addToken(com.google.javascript.rhino.Token.WHILE);
					com.google.javascript.rhino.Node cond = condition();
					pn = nf.createDoWhile(body, cond, lineno, charno);
					matchToken(com.google.javascript.rhino.Token.SEMI);
					decompiler.addEOL(com.google.javascript.rhino.Token.SEMI);
					return pn;
				}
			case com.google.javascript.rhino.Token.FOR :
				{
					consumeToken();
					boolean isForEach = false;
					decompiler.addToken(com.google.javascript.rhino.Token.FOR);
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					com.google.javascript.rhino.Node init;
					com.google.javascript.rhino.Node cond;
					com.google.javascript.rhino.Node incr = null;
					com.google.javascript.rhino.Node body;
					if (matchToken(com.google.javascript.rhino.Token.NAME)) {
						decompiler.addName(ts.getString());
						if (ts.getString().equals("each")) {
							isForEach = true;
						}else {
							reportError("msg.no.paren.for");
						}
					}
					mustMatchToken(com.google.javascript.rhino.Token.LP, "msg.no.paren.for");
					decompiler.addToken(com.google.javascript.rhino.Token.LP);
					tt = peekToken();
					if (tt == (com.google.javascript.rhino.Token.SEMI)) {
						init = nf.createLeaf(com.google.javascript.rhino.Token.EMPTY, ts.getLineno(), ts.getCharno());
					}else {
						if (tt == (com.google.javascript.rhino.Token.VAR)) {
							consumeToken();
							init = variables(com.google.javascript.rhino.Token.FOR);
						}else {
							init = expr(true);
						}
					}
					if (matchToken(com.google.javascript.rhino.Token.IN)) {
						decompiler.addToken(com.google.javascript.rhino.Token.IN);
						cond = expr(false);
					}else {
						mustMatchToken(com.google.javascript.rhino.Token.SEMI, "msg.no.semi.for");
						decompiler.addToken(com.google.javascript.rhino.Token.SEMI);
						if ((peekToken()) == (com.google.javascript.rhino.Token.SEMI)) {
							cond = nf.createLeaf(com.google.javascript.rhino.Token.EMPTY, ts.getLineno(), ts.getCharno());
						}else {
							cond = expr(false);
						}
						mustMatchToken(com.google.javascript.rhino.Token.SEMI, "msg.no.semi.for.cond");
						decompiler.addToken(com.google.javascript.rhino.Token.SEMI);
						if ((peekToken()) == (com.google.javascript.rhino.Token.RP)) {
							incr = nf.createLeaf(com.google.javascript.rhino.Token.EMPTY, ts.getLineno(), ts.getCharno());
						}else {
							incr = expr(false);
						}
					}
					mustMatchToken(com.google.javascript.rhino.Token.RP, "msg.no.paren.for.ctrl");
					decompiler.addToken(com.google.javascript.rhino.Token.RP);
					decompiler.addEOL(com.google.javascript.rhino.Token.LC);
					body = statement();
					decompiler.addEOL(com.google.javascript.rhino.Token.RC);
					if (incr == null) {
						pn = nf.createForIn(init, cond, body, lineno, charno);
					}else {
						pn = nf.createFor(init, cond, incr, body, lineno, charno);
					}
					return pn;
				}
			case com.google.javascript.rhino.Token.TRY :
				{
					consumeToken();
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					com.google.javascript.rhino.Node tryblock;
					com.google.javascript.rhino.Node catchblocks = null;
					com.google.javascript.rhino.Node finallyblock = null;
					com.google.javascript.rhino.JSDocInfo info = ts.getAndResetJSDocInfo();
					decompiler.addToken(com.google.javascript.rhino.Token.TRY);
					decompiler.addEOL(com.google.javascript.rhino.Token.LC);
					tryblock = statement();
					decompiler.addEOL(com.google.javascript.rhino.Token.RC);
					catchblocks = nf.createLeaf(com.google.javascript.rhino.Token.BLOCK, ts.getLineno(), ts.getCharno());
					boolean sawDefaultCatch = false;
					int peek = peekToken();
					if (peek == (com.google.javascript.rhino.Token.CATCH)) {
						while (matchToken(com.google.javascript.rhino.Token.CATCH)) {
							int catchLineno = ts.getLineno();
							int catchCharno = ts.getCharno();
							if (sawDefaultCatch) {
								reportError("msg.catch.unreachable");
							}
							decompiler.addToken(com.google.javascript.rhino.Token.CATCH);
							mustMatchToken(com.google.javascript.rhino.Token.LP, "msg.no.paren.catch");
							decompiler.addToken(com.google.javascript.rhino.Token.LP);
							mustMatchToken(com.google.javascript.rhino.Token.NAME, "msg.bad.catchcond");
							java.lang.String varName = ts.getString();
							int nameLineno = ts.getLineno();
							int nameCharno = ts.getCharno();
							decompiler.addName(varName);
							com.google.javascript.rhino.Node catchCond = null;
							if (matchToken(com.google.javascript.rhino.Token.IF)) {
								decompiler.addToken(com.google.javascript.rhino.Token.IF);
								catchCond = expr(false);
							}else {
								sawDefaultCatch = true;
							}
							mustMatchToken(com.google.javascript.rhino.Token.RP, "msg.bad.catchcond");
							decompiler.addToken(com.google.javascript.rhino.Token.RP);
							mustMatchToken(com.google.javascript.rhino.Token.LC, "msg.no.brace.catchblock");
							decompiler.addEOL(com.google.javascript.rhino.Token.LC);
							nf.addChildToBack(catchblocks, nf.createCatch(varName, nameLineno, nameCharno, catchCond, statements(), catchLineno, catchCharno));
							mustMatchToken(com.google.javascript.rhino.Token.RC, "msg.no.brace.after.body");
							decompiler.addEOL(com.google.javascript.rhino.Token.RC);
						} 
					}else
						if (peek != (com.google.javascript.rhino.Token.FINALLY)) {
							mustMatchToken(com.google.javascript.rhino.Token.FINALLY, "msg.try.no.catchfinally");
						}
					
					if (matchToken(com.google.javascript.rhino.Token.FINALLY)) {
						decompiler.addToken(com.google.javascript.rhino.Token.FINALLY);
						decompiler.addEOL(com.google.javascript.rhino.Token.LC);
						finallyblock = statement();
						decompiler.addEOL(com.google.javascript.rhino.Token.RC);
					}
					pn = nf.createTryCatchFinally(tryblock, catchblocks, finallyblock, lineno, charno);
					if (info != null) {
						pn.setJSDocInfo(info);
					}
					return pn;
				}
			case com.google.javascript.rhino.Token.THROW :
				{
					consumeToken();
					if ((peekTokenOrEOL()) == (com.google.javascript.rhino.Token.EOL)) {
						reportError("msg.bad.throw.eol");
					}
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addToken(com.google.javascript.rhino.Token.THROW);
					pn = nf.createThrow(expr(false), lineno, charno);
					break;
				}
			case com.google.javascript.rhino.Token.BREAK :
				{
					consumeToken();
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addToken(com.google.javascript.rhino.Token.BREAK);
					java.lang.String label = matchLabel();
					if (label != null) {
						decompiler.addToken(com.google.javascript.rhino.Token.NAME);
						decompiler.addName(label);
					}
					pn = nf.createBreak(label, lineno, charno);
					break;
				}
			case com.google.javascript.rhino.Token.CONTINUE :
				{
					consumeToken();
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addToken(com.google.javascript.rhino.Token.CONTINUE);
					java.lang.String label = matchLabel();
					if (label != null) {
						decompiler.addToken(com.google.javascript.rhino.Token.NAME);
						decompiler.addName(label);
					}
					pn = nf.createContinue(label, lineno, charno);
					break;
				}
			case com.google.javascript.rhino.Token.DEBUGGER :
				{
					consumeToken();
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addToken(com.google.javascript.rhino.Token.DEBUGGER);
					pn = nf.createDebugger(lineno, charno);
					break;
				}
			case com.google.javascript.rhino.Token.WITH :
				{
					consumeToken();
					decompiler.addToken(com.google.javascript.rhino.Token.WITH);
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					mustMatchToken(com.google.javascript.rhino.Token.LP, "msg.no.paren.with");
					decompiler.addToken(com.google.javascript.rhino.Token.LP);
					com.google.javascript.rhino.Node obj = expr(false);
					mustMatchToken(com.google.javascript.rhino.Token.RP, "msg.no.paren.after.with");
					decompiler.addToken(com.google.javascript.rhino.Token.RP);
					decompiler.addEOL(com.google.javascript.rhino.Token.LC);
					++(nestingOfWith);
					com.google.javascript.rhino.Node body;
					try {
						body = statement();
					} finally {
						--(nestingOfWith);
					}
					decompiler.addEOL(com.google.javascript.rhino.Token.RC);
					pn = nf.createWith(obj, body, lineno, charno);
					return pn;
				}
			case com.google.javascript.rhino.Token.CONST :
			case com.google.javascript.rhino.Token.VAR :
				{
					consumeToken();
					pn = variables(tt);
					break;
				}
			case com.google.javascript.rhino.Token.RETURN :
				{
					if (!(insideFunction())) {
						reportError("msg.bad.return");
					}
					consumeToken();
					decompiler.addToken(com.google.javascript.rhino.Token.RETURN);
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					com.google.javascript.rhino.Node retExpr;
					tt = peekTokenOrEOL();
					switch (tt) {
						case com.google.javascript.rhino.Token.SEMI :
						case com.google.javascript.rhino.Token.RC :
						case com.google.javascript.rhino.Token.EOF :
						case com.google.javascript.rhino.Token.EOL :
						case com.google.javascript.rhino.Token.ERROR :
							retExpr = null;
							break;
						default :
							retExpr = expr(false);
							hasReturnValue = true;
					}
					pn = nf.createReturn(retExpr, lineno, charno);
					break;
				}
			case com.google.javascript.rhino.Token.LC :
				consumeToken();
				if (statementLabel != null) {
					decompiler.addToken(com.google.javascript.rhino.Token.LC);
				}
				pn = statements();
				mustMatchToken(com.google.javascript.rhino.Token.RC, "msg.no.brace.block");
				if (statementLabel != null) {
					decompiler.addEOL(com.google.javascript.rhino.Token.RC);
				}
				return pn;
			case com.google.javascript.rhino.Token.ERROR :
			case com.google.javascript.rhino.Token.SEMI :
				consumeToken();
				pn = nf.createLeaf(com.google.javascript.rhino.Token.EMPTY, ts.getLineno(), ts.getCharno());
				return pn;
			case com.google.javascript.rhino.Token.FUNCTION :
				{
					consumeToken();
					pn = function(com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION_STATEMENT);
					return pn;
				}
			case com.google.javascript.rhino.Token.DEFAULT :
				{
					consumeToken();
					mustHaveXML();
					decompiler.addToken(com.google.javascript.rhino.Token.DEFAULT);
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					if (!((matchToken(com.google.javascript.rhino.Token.NAME)) && (ts.getString().equals("xml")))) {
						reportError("msg.bad.namespace");
					}
					decompiler.addName(" xml");
					if (!((matchToken(com.google.javascript.rhino.Token.NAME)) && (ts.getString().equals("namespace")))) {
						reportError("msg.bad.namespace");
					}
					decompiler.addName(" namespace");
					if (!(matchToken(com.google.javascript.rhino.Token.ASSIGN))) {
						reportError("msg.bad.namespace");
					}
					decompiler.addToken(com.google.javascript.rhino.Token.ASSIGN);
					com.google.javascript.rhino.Node expr = expr(false);
					pn = nf.createDefaultNamespace(expr, lineno, charno);
					break;
				}
			case com.google.javascript.rhino.Token.NAME :
				{
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					java.lang.String name = ts.getString();
					setCheckForLabel();
					pn = expr(false);
					if ((pn.getType()) != (com.google.javascript.rhino.Token.LABEL)) {
						pn = nf.createExprStatement(pn, lineno, charno);
					}else {
						if ((peekToken()) != (com.google.javascript.rhino.Token.COLON))
							com.google.javascript.rhino.Kit.codeBug();
						
						consumeToken();
						decompiler.addName(name);
						decompiler.addEOL(com.google.javascript.rhino.Token.COLON);
						if ((labelSet) == null) {
							labelSet = new java.util.Hashtable<java.lang.String, com.google.javascript.rhino.Node>();
						}else
							if (labelSet.containsKey(name)) {
								reportError("msg.dup.label");
							}
						
						labelSet.put(name, pn);
						pn = nf.createLabel(name, lineno, charno);
						try {
							nf.addChildToBack(pn, statementHelper(pn));
						} finally {
							labelSet.remove(name);
						}
						return pn;
					}
					break;
				}
			default :
				{
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					pn = expr(false);
					pn = nf.createExprStatement(pn, lineno, charno);
					break;
				}
		}
		int ttFlagged = peekFlaggedToken();
		switch (ttFlagged & (com.google.javascript.rhino.Parser.CLEAR_TI_MASK)) {
			case com.google.javascript.rhino.Token.SEMI :
				consumeToken();
				break;
			case com.google.javascript.rhino.Token.ERROR :
			case com.google.javascript.rhino.Token.EOF :
			case com.google.javascript.rhino.Token.RC :
				break;
			default :
				if ((ttFlagged & (com.google.javascript.rhino.Parser.TI_AFTER_EOL)) == 0) {
					reportError("msg.no.semi.stmt");
				}
				break;
		}
		decompiler.addEOL(com.google.javascript.rhino.Token.SEMI);
		return pn;
	}

	private com.google.javascript.rhino.Node variables(int context) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn;
		boolean first = true;
		com.google.javascript.rhino.JSDocInfo varInfo = null;
		if (context == (com.google.javascript.rhino.Token.CONST)) {
			pn = nf.createVariables(com.google.javascript.rhino.Token.CONST, ts.getLineno(), ts.getCharno());
			decompiler.addToken(com.google.javascript.rhino.Token.CONST);
		}else {
			pn = nf.createVariables(com.google.javascript.rhino.Token.VAR, ts.getLineno(), ts.getCharno());
			varInfo = ts.getAndResetJSDocInfo();
			if (varInfo != null) {
				pn.setJSDocInfo(varInfo);
			}
			decompiler.addToken(com.google.javascript.rhino.Token.VAR);
		}
		for (; ;) {
			com.google.javascript.rhino.Node name;
			com.google.javascript.rhino.Node init;
			mustMatchToken(com.google.javascript.rhino.Token.NAME, "msg.bad.var");
			java.lang.String s = ts.getString();
			int lineno = ts.getLineno();
			int charno = ts.getCharno();
			com.google.javascript.rhino.JSDocInfo info = ts.getAndResetJSDocInfo();
			if (!first)
				decompiler.addToken(com.google.javascript.rhino.Token.COMMA);
			
			first = false;
			decompiler.addName(s);
			if (context == (com.google.javascript.rhino.Token.CONST)) {
				if (!(currentScriptOrFn.addConst(s))) {
					if ((currentScriptOrFn.addVar(s)) != (com.google.javascript.rhino.ScriptOrFnNode.DUPLICATE_CONST))
						addError("msg.var.redecl", s);
					else
						addError("msg.const.redecl", s);
					
				}
			}else {
				int dupState = currentScriptOrFn.addVar(s);
				if (dupState == (com.google.javascript.rhino.ScriptOrFnNode.DUPLICATE_CONST))
					addError("msg.const.redecl", s);
				else
					if (dupState == (com.google.javascript.rhino.ScriptOrFnNode.DUPLICATE_PARAMETER))
						addStrictWarning("msg.var.hides.arg", s);
					else
						if (dupState == (com.google.javascript.rhino.ScriptOrFnNode.DUPLICATE_VAR))
							addStrictWarning("msg.var.redecl", s);
						
					
				
			}
			name = nf.createTaggedName(s, info, lineno, charno);
			if (matchToken(com.google.javascript.rhino.Token.ASSIGN)) {
				decompiler.addToken(com.google.javascript.rhino.Token.ASSIGN);
				init = assignExpr((context == (com.google.javascript.rhino.Token.FOR)));
				nf.addChildToBack(name, init);
			}
			nf.addChildToBack(pn, name);
			if (!(matchToken(com.google.javascript.rhino.Token.COMMA)))
				break;
			
		}
		return pn;
	}

	private com.google.javascript.rhino.Node expr(boolean inForInit) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = assignExpr(inForInit);
		int lineno = ts.getLineno();
		int charno = ts.getCharno();
		while (matchToken(com.google.javascript.rhino.Token.COMMA)) {
			decompiler.addToken(com.google.javascript.rhino.Token.COMMA);
			if ((compilerEnv.isStrictMode()) && (!(pn.hasSideEffects())))
				addStrictWarning("msg.no.side.effects", "");
			
			pn = nf.createBinary(com.google.javascript.rhino.Token.COMMA, pn, assignExpr(inForInit), lineno, charno);
		} 
		return pn;
	}

	private com.google.javascript.rhino.Node assignExpr(boolean inForInit) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = condExpr(inForInit);
		int tt = peekToken();
		int lineno = ts.getLineno();
		int charno = ts.getCharno();
		if (((com.google.javascript.rhino.Token.FIRST_ASSIGN) <= tt) && (tt <= (com.google.javascript.rhino.Token.LAST_ASSIGN))) {
			consumeToken();
			com.google.javascript.rhino.JSDocInfo info = ts.getAndResetJSDocInfo();
			decompiler.addToken(tt);
			com.google.javascript.rhino.Node right = assignExpr(inForInit);
			pn = nf.createBinary(tt, pn, right, lineno, charno);
			if (info != null) {
				pn.setJSDocInfo(info);
			}
		}else
			if ((tt == (com.google.javascript.rhino.Token.SEMI)) && ((pn.getType()) == (com.google.javascript.rhino.Token.GETPROP))) {
				if (ts.isPopulated()) {
					pn.setJSDocInfo(ts.getAndResetJSDocInfo());
				}
			}
		
		return pn;
	}

	private com.google.javascript.rhino.Node condExpr(boolean inForInit) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = orExpr(inForInit);
		if (matchToken(com.google.javascript.rhino.Token.HOOK)) {
			int lineno = ts.getLineno();
			int charno = ts.getCharno();
			decompiler.addToken(com.google.javascript.rhino.Token.HOOK);
			com.google.javascript.rhino.Node ifTrue = assignExpr(false);
			mustMatchToken(com.google.javascript.rhino.Token.COLON, "msg.no.colon.cond");
			decompiler.addToken(com.google.javascript.rhino.Token.COLON);
			com.google.javascript.rhino.Node ifFalse = assignExpr(inForInit);
			return nf.createCondExpr(pn, ifTrue, ifFalse, lineno, charno);
		}
		return pn;
	}

	private com.google.javascript.rhino.Node orExpr(boolean inForInit) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = andExpr(inForInit);
		if (matchToken(com.google.javascript.rhino.Token.OR)) {
			int lineno = ts.getLineno();
			int charno = ts.getCharno();
			decompiler.addToken(com.google.javascript.rhino.Token.OR);
			pn = nf.createBinary(com.google.javascript.rhino.Token.OR, pn, orExpr(inForInit), lineno, charno);
		}
		return pn;
	}

	private com.google.javascript.rhino.Node andExpr(boolean inForInit) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = bitOrExpr(inForInit);
		if (matchToken(com.google.javascript.rhino.Token.AND)) {
			int lineno = ts.getLineno();
			int charno = ts.getCharno();
			decompiler.addToken(com.google.javascript.rhino.Token.AND);
			pn = nf.createBinary(com.google.javascript.rhino.Token.AND, pn, andExpr(inForInit), lineno, charno);
		}
		return pn;
	}

	private com.google.javascript.rhino.Node bitOrExpr(boolean inForInit) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = bitXorExpr(inForInit);
		while (matchToken(com.google.javascript.rhino.Token.BITOR)) {
			int lineno = ts.getLineno();
			int charno = ts.getCharno();
			decompiler.addToken(com.google.javascript.rhino.Token.BITOR);
			pn = nf.createBinary(com.google.javascript.rhino.Token.BITOR, pn, bitXorExpr(inForInit), lineno, charno);
		} 
		return pn;
	}

	private com.google.javascript.rhino.Node bitXorExpr(boolean inForInit) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = bitAndExpr(inForInit);
		while (matchToken(com.google.javascript.rhino.Token.BITXOR)) {
			int lineno = ts.getLineno();
			int charno = ts.getCharno();
			decompiler.addToken(com.google.javascript.rhino.Token.BITXOR);
			pn = nf.createBinary(com.google.javascript.rhino.Token.BITXOR, pn, bitAndExpr(inForInit), lineno, charno);
		} 
		return pn;
	}

	private com.google.javascript.rhino.Node bitAndExpr(boolean inForInit) throws com.google.javascript.rhino.JavaScriptException, java.io.IOException {
		com.google.javascript.rhino.Node pn = eqExpr(inForInit);
		while (matchToken(com.google.javascript.rhino.Token.BITAND)) {
			int lineno = ts.getLineno();
			int charno = ts.getCharno();
			decompiler.addToken(com.google.javascript.rhino.Token.BITAND);
			pn = nf.createBinary(com.google.javascript.rhino.Token.BITAND, pn, eqExpr(inForInit), lineno, charno);
		} 
		return pn;
	}

	private com.google.javascript.rhino.Node eqExpr(boolean inForInit) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = relExpr(inForInit);
		int lineno;
		int charno;
		for (; ;) {
			int tt = peekToken();
			lineno = ts.getLineno();
			charno = ts.getCharno();
			switch (tt) {
				case com.google.javascript.rhino.Token.EQ :
				case com.google.javascript.rhino.Token.NE :
				case com.google.javascript.rhino.Token.SHEQ :
				case com.google.javascript.rhino.Token.SHNE :
					consumeToken();
					int decompilerToken = tt;
					int parseToken = tt;
					if ((compilerEnv.getLanguageVersion()) == (com.google.javascript.rhino.Context.VERSION_1_2)) {
						switch (tt) {
							case com.google.javascript.rhino.Token.EQ :
								parseToken = com.google.javascript.rhino.Token.SHEQ;
								break;
							case com.google.javascript.rhino.Token.NE :
								parseToken = com.google.javascript.rhino.Token.SHNE;
								break;
							case com.google.javascript.rhino.Token.SHEQ :
								decompilerToken = com.google.javascript.rhino.Token.EQ;
								break;
							case com.google.javascript.rhino.Token.SHNE :
								decompilerToken = com.google.javascript.rhino.Token.NE;
								break;
						}
					}
					decompiler.addToken(decompilerToken);
					pn = nf.createBinary(parseToken, pn, relExpr(inForInit), lineno, charno);
					continue;
			}
			break;
		}
		return pn;
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	private com.google.javascript.rhino.Node relExpr(boolean inForInit) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = shiftExpr();
		int lineno;
		int charno;
		for (; ;) {
			int tt = peekToken();
			lineno = ts.getLineno();
			charno = ts.getCharno();
			switch (tt) {
				case com.google.javascript.rhino.Token.IN :
					if (inForInit)
						break;
					
				case com.google.javascript.rhino.Token.INSTANCEOF :
				case com.google.javascript.rhino.Token.LE :
				case com.google.javascript.rhino.Token.LT :
				case com.google.javascript.rhino.Token.GE :
				case com.google.javascript.rhino.Token.GT :
					consumeToken();
					decompiler.addToken(tt);
					pn = nf.createBinary(tt, pn, shiftExpr(), lineno, charno);
					continue;
			}
			break;
		}
		return pn;
	}

	private com.google.javascript.rhino.Node shiftExpr() throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = addExpr();
		int lineno;
		int charno;
		for (; ;) {
			int tt = peekToken();
			lineno = ts.getLineno();
			charno = ts.getCharno();
			switch (tt) {
				case com.google.javascript.rhino.Token.LSH :
				case com.google.javascript.rhino.Token.URSH :
				case com.google.javascript.rhino.Token.RSH :
					consumeToken();
					decompiler.addToken(tt);
					pn = nf.createBinary(tt, pn, addExpr(), lineno, charno);
					continue;
			}
			break;
		}
		return pn;
	}

	private com.google.javascript.rhino.Node addExpr() throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = mulExpr();
		int lineno;
		int charno;
		for (; ;) {
			int tt = peekToken();
			lineno = ts.getLineno();
			charno = ts.getCharno();
			if ((tt == (com.google.javascript.rhino.Token.ADD)) || (tt == (com.google.javascript.rhino.Token.SUB))) {
				consumeToken();
				decompiler.addToken(tt);
				pn = nf.createBinary(tt, pn, mulExpr(), lineno, charno);
				continue;
			}
			break;
		}
		return pn;
	}

	private com.google.javascript.rhino.Node mulExpr() throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn = unaryExpr();
		int lineno;
		int charno;
		for (; ;) {
			int tt = peekToken();
			lineno = ts.getLineno();
			charno = ts.getCharno();
			switch (tt) {
				case com.google.javascript.rhino.Token.MUL :
				case com.google.javascript.rhino.Token.DIV :
				case com.google.javascript.rhino.Token.MOD :
					consumeToken();
					decompiler.addToken(tt);
					pn = nf.createBinary(tt, pn, unaryExpr(), lineno, charno);
					continue;
			}
			break;
		}
		return pn;
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	private com.google.javascript.rhino.Node unaryExpr() throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		int tt;
		tt = peekToken();
		int lineno = ts.getLineno();
		int charno = ts.getCharno();
		switch (tt) {
			case com.google.javascript.rhino.Token.VOID :
			case com.google.javascript.rhino.Token.NOT :
			case com.google.javascript.rhino.Token.BITNOT :
			case com.google.javascript.rhino.Token.TYPEOF :
				consumeToken();
				decompiler.addToken(tt);
				return nf.createUnary(tt, unaryExpr(), lineno, charno);
			case com.google.javascript.rhino.Token.ADD :
				consumeToken();
				decompiler.addToken(com.google.javascript.rhino.Token.POS);
				return nf.createUnary(com.google.javascript.rhino.Token.POS, unaryExpr(), lineno, charno);
			case com.google.javascript.rhino.Token.SUB :
				consumeToken();
				decompiler.addToken(com.google.javascript.rhino.Token.NEG);
				return nf.createUnary(com.google.javascript.rhino.Token.NEG, unaryExpr(), lineno, charno);
			case com.google.javascript.rhino.Token.INC :
			case com.google.javascript.rhino.Token.DEC :
				consumeToken();
				decompiler.addToken(tt);
				return nf.createIncDec(tt, false, memberExpr(true), lineno, charno);
			case com.google.javascript.rhino.Token.DELPROP :
				consumeToken();
				decompiler.addToken(com.google.javascript.rhino.Token.DELPROP);
				return nf.createUnary(com.google.javascript.rhino.Token.DELPROP, unaryExpr(), lineno, charno);
			case com.google.javascript.rhino.Token.ERROR :
				consumeToken();
				break;
			case com.google.javascript.rhino.Token.LT :
				if (compilerEnv.isXmlAvailable()) {
					consumeToken();
					com.google.javascript.rhino.Node pn = xmlInitializer();
					return memberExprTail(true, pn);
				}
			default :
				com.google.javascript.rhino.Node pn = memberExpr(true);
				tt = peekTokenOrEOL();
				if ((tt == (com.google.javascript.rhino.Token.INC)) || (tt == (com.google.javascript.rhino.Token.DEC))) {
					consumeToken();
					decompiler.addToken(tt);
					return nf.createIncDec(tt, true, pn, lineno, charno);
				}
				return pn;
		}
		return nf.createErrorName();
	}

	private com.google.javascript.rhino.Node xmlInitializer() throws java.io.IOException {
		int tt = ts.getFirstXMLToken();
		int lineno = ts.getLineno();
		int charno = ts.getCharno();
		if ((tt != (com.google.javascript.rhino.Token.XML)) && (tt != (com.google.javascript.rhino.Token.XMLEND))) {
			reportError("msg.syntax");
			return null;
		}
		com.google.javascript.rhino.Node pnXML = nf.createLeaf(com.google.javascript.rhino.Token.NEW, lineno, charno);
		java.lang.String xml = ts.getString();
		lineno = ts.getLineno();
		charno = ts.getCharno();
		boolean fAnonymous = xml.trim().startsWith("<>");
		com.google.javascript.rhino.Node pn = nf.createName((fAnonymous ? "XMLList" : "XML"), lineno, charno);
		nf.addChildToBack(pnXML, pn);
		pn = null;
		com.google.javascript.rhino.Node expr;
		for (; ; tt = ts.getNextXMLToken()) {
			switch (tt) {
				case com.google.javascript.rhino.Token.XML :
					xml = ts.getString();
					lineno = ts.getLineno();
					charno = ts.getCharno();
					decompiler.addName(xml);
					mustMatchToken(com.google.javascript.rhino.Token.LC, "msg.syntax");
					decompiler.addToken(com.google.javascript.rhino.Token.LC);
					expr = ((peekToken()) == (com.google.javascript.rhino.Token.RC)) ? nf.createString("", lineno, charno) : expr(false);
					mustMatchToken(com.google.javascript.rhino.Token.RC, "msg.syntax");
					decompiler.addToken(com.google.javascript.rhino.Token.RC);
					if (pn == null) {
						pn = nf.createString(xml, lineno, charno);
					}else {
						pn = nf.createBinary(com.google.javascript.rhino.Token.ADD, pn, nf.createString(xml, lineno, charno), lineno, charno);
					}
					int nodeType;
					if (ts.isXMLAttribute()) {
						nodeType = com.google.javascript.rhino.Token.ESCXMLATTR;
					}else {
						nodeType = com.google.javascript.rhino.Token.ESCXMLTEXT;
					}
					expr = nf.createUnary(nodeType, expr, lineno, charno);
					pn = nf.createBinary(com.google.javascript.rhino.Token.ADD, pn, expr, lineno, charno);
					break;
				case com.google.javascript.rhino.Token.XMLEND :
					xml = ts.getString();
					lineno = ts.getLineno();
					charno = ts.getCharno();
					decompiler.addName(xml);
					if (pn == null) {
						pn = nf.createString(xml, lineno, charno);
					}else {
						pn = nf.createBinary(com.google.javascript.rhino.Token.ADD, pn, nf.createString(xml, lineno, charno), lineno, charno);
					}
					nf.addChildToBack(pnXML, pn);
					return pnXML;
				default :
					reportError("msg.syntax");
					return null;
			}
		}
	}

	private void argumentList(com.google.javascript.rhino.Node listNode) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		boolean matched;
		matched = matchToken(com.google.javascript.rhino.Token.RP);
		if (!matched) {
			boolean first = true;
			do {
				if (!first)
					decompiler.addToken(com.google.javascript.rhino.Token.COMMA);
				
				first = false;
				nf.addChildToBack(listNode, assignExpr(false));
			} while (matchToken(com.google.javascript.rhino.Token.COMMA) );
			mustMatchToken(com.google.javascript.rhino.Token.RP, "msg.no.paren.arg");
		}
		decompiler.addToken(com.google.javascript.rhino.Token.RP);
	}

	private com.google.javascript.rhino.Node memberExpr(boolean allowCallSyntax) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		int tt;
		com.google.javascript.rhino.Node pn;
		tt = peekToken();
		int lineno = ts.getLineno();
		int charno = ts.getCharno();
		if (tt == (com.google.javascript.rhino.Token.NEW)) {
			consumeToken();
			decompiler.addToken(com.google.javascript.rhino.Token.NEW);
			pn = nf.createLeaf(com.google.javascript.rhino.Token.NEW, lineno, charno);
			nf.addChildToBack(pn, memberExpr(false));
			if (matchToken(com.google.javascript.rhino.Token.LP)) {
				decompiler.addToken(com.google.javascript.rhino.Token.LP);
				argumentList(pn);
			}
			tt = peekToken();
			if (tt == (com.google.javascript.rhino.Token.LC)) {
				nf.addChildToBack(pn, primaryExpr());
			}
		}else {
			pn = primaryExpr();
		}
		return memberExprTail(allowCallSyntax, pn);
	}

	private com.google.javascript.rhino.Node memberExprTail(boolean allowCallSyntax, com.google.javascript.rhino.Node pn) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		tailLoop : for (; ;) {
			int tt = peekToken();
			int lineno = ts.getLineno();
			int charno = ts.getCharno();
			switch (tt) {
				case com.google.javascript.rhino.Token.DOT :
				case com.google.javascript.rhino.Token.DOTDOT :
					{
						int memberTypeFlags;
						java.lang.String s;
						consumeToken();
						decompiler.addToken(tt);
						memberTypeFlags = 0;
						if (tt == (com.google.javascript.rhino.Token.DOTDOT)) {
							mustHaveXML();
							memberTypeFlags = com.google.javascript.rhino.Node.DESCENDANTS_FLAG;
						}
						if (!(compilerEnv.isXmlAvailable())) {
							mustMatchToken(com.google.javascript.rhino.Token.NAME, "msg.no.name.after.dot");
							s = ts.getString();
							decompiler.addName(s);
							pn = nf.createPropertyGet(pn, null, s, memberTypeFlags, lineno, charno, ts.getLineno(), ts.getCharno());
							break;
						}
						tt = nextToken();
						switch (tt) {
							case com.google.javascript.rhino.Token.NAME :
								s = ts.getString();
								decompiler.addName(s);
								pn = propertyName(pn, s, memberTypeFlags, lineno, charno, ts.getLineno(), ts.getCharno());
								break;
							case com.google.javascript.rhino.Token.MUL :
								decompiler.addName("*");
								pn = propertyName(pn, "*", memberTypeFlags, ts.getLineno(), ts.getCharno());
								break;
							case com.google.javascript.rhino.Token.XMLATTR :
								decompiler.addToken(com.google.javascript.rhino.Token.XMLATTR);
								pn = attributeAccess(pn, memberTypeFlags);
								break;
							default :
								reportError("msg.no.name.after.dot");
						}
					}
					break;
				case com.google.javascript.rhino.Token.DOTQUERY :
					consumeToken();
					mustHaveXML();
					decompiler.addToken(com.google.javascript.rhino.Token.DOTQUERY);
					pn = nf.createDotQuery(pn, expr(false), ts.getLineno(), ts.getCharno());
					mustMatchToken(com.google.javascript.rhino.Token.RP, "msg.no.paren");
					decompiler.addToken(com.google.javascript.rhino.Token.RP);
					break;
				case com.google.javascript.rhino.Token.LB :
					consumeToken();
					decompiler.addToken(com.google.javascript.rhino.Token.LB);
					pn = nf.createElementGet(pn, null, expr(false), 0, lineno, charno);
					mustMatchToken(com.google.javascript.rhino.Token.RB, "msg.no.bracket.index");
					decompiler.addToken(com.google.javascript.rhino.Token.RB);
					break;
				case com.google.javascript.rhino.Token.LP :
					if (!allowCallSyntax) {
						break tailLoop;
					}
					consumeToken();
					decompiler.addToken(com.google.javascript.rhino.Token.LP);
					pn = nf.createCallOrNew(com.google.javascript.rhino.Token.CALL, pn, ts.getLineno(), ts.getCharno());
					argumentList(pn);
					break;
				default :
					break tailLoop;
			}
		}
		return pn;
	}

	private com.google.javascript.rhino.Node attributeAccess(com.google.javascript.rhino.Node pn, int memberTypeFlags) throws java.io.IOException {
		memberTypeFlags |= com.google.javascript.rhino.Node.ATTRIBUTE_FLAG;
		int tt = nextToken();
		switch (tt) {
			case com.google.javascript.rhino.Token.NAME :
				{
					java.lang.String s = ts.getString();
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addName(s);
					pn = propertyName(pn, s, memberTypeFlags, lineno, charno);
				}
				break;
			case com.google.javascript.rhino.Token.MUL :
				decompiler.addName("*");
				pn = propertyName(pn, "*", memberTypeFlags, ts.getLineno(), ts.getCharno());
				break;
			case com.google.javascript.rhino.Token.LB :
				decompiler.addToken(com.google.javascript.rhino.Token.LB);
				pn = nf.createElementGet(pn, null, expr(false), memberTypeFlags, ts.getLineno(), ts.getCharno());
				mustMatchToken(com.google.javascript.rhino.Token.RB, "msg.no.bracket.index");
				decompiler.addToken(com.google.javascript.rhino.Token.RB);
				break;
			default :
				reportError("msg.no.name.after.xmlAttr");
				pn = nf.createPropertyGet(pn, null, "?", memberTypeFlags, ts.getLineno(), ts.getCharno(), ts.getLineno(), ts.getCharno());
				break;
		}
		return pn;
	}

	private com.google.javascript.rhino.Node propertyName(com.google.javascript.rhino.Node pn, java.lang.String name, int memberTypeFlags, int dotLineno, int dotCharno, int nameLineno, int nameCharno) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		java.lang.String namespace = null;
		if (matchToken(com.google.javascript.rhino.Token.COLONCOLON)) {
			decompiler.addToken(com.google.javascript.rhino.Token.COLONCOLON);
			namespace = name;
			int tt = nextToken();
			switch (tt) {
				case com.google.javascript.rhino.Token.NAME :
					name = ts.getString();
					decompiler.addName(name);
					break;
				case com.google.javascript.rhino.Token.MUL :
					decompiler.addName("*");
					name = "*";
					break;
				case com.google.javascript.rhino.Token.LB :
					decompiler.addToken(com.google.javascript.rhino.Token.LB);
					pn = nf.createElementGet(pn, namespace, expr(false), memberTypeFlags, nameLineno, nameCharno);
					mustMatchToken(com.google.javascript.rhino.Token.RB, "msg.no.bracket.index");
					decompiler.addToken(com.google.javascript.rhino.Token.RB);
					return pn;
				default :
					reportError("msg.no.name.after.coloncolon");
					name = "?";
			}
		}
		pn = nf.createPropertyGet(pn, namespace, name, memberTypeFlags, dotLineno, dotCharno, nameLineno, nameCharno);
		return pn;
	}

	private com.google.javascript.rhino.Node propertyName(com.google.javascript.rhino.Node pn, java.lang.String name, int memberTypeFlags, int lineno, int charno) throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		return propertyName(pn, name, memberTypeFlags, lineno, charno, lineno, charno);
	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	private com.google.javascript.rhino.Node primaryExpr() throws com.google.javascript.rhino.Parser.ParserException, java.io.IOException {
		com.google.javascript.rhino.Node pn;
		int ttFlagged = nextFlaggedToken();
		int tt = ttFlagged & (com.google.javascript.rhino.Parser.CLEAR_TI_MASK);
		switch (tt) {
			case com.google.javascript.rhino.Token.FUNCTION :
				return function(com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION);
			case com.google.javascript.rhino.Token.LB :
				{
					com.google.javascript.rhino.ObjArray elems = new com.google.javascript.rhino.ObjArray();
					int skipCount = 0;
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addToken(com.google.javascript.rhino.Token.LB);
					boolean after_lb_or_comma = true;
					for (; ;) {
						tt = peekToken();
						if (tt == (com.google.javascript.rhino.Token.COMMA)) {
							consumeToken();
							decompiler.addToken(com.google.javascript.rhino.Token.COMMA);
							if (!after_lb_or_comma) {
								after_lb_or_comma = true;
							}else {
								elems.add(null);
								++skipCount;
							}
						}else
							if (tt == (com.google.javascript.rhino.Token.RB)) {
								if (after_lb_or_comma && ((elems.size()) > 0)) {
									addWarning("msg.trailing.comma");
								}
								consumeToken();
								decompiler.addToken(com.google.javascript.rhino.Token.RB);
								break;
							}else {
								if (!after_lb_or_comma) {
									reportError("msg.no.bracket.arg");
								}
								elems.add(assignExpr(false));
								after_lb_or_comma = false;
							}
						
					}
					return nf.createArrayLiteral(elems, skipCount, lineno, charno);
				}
			case com.google.javascript.rhino.Token.LC :
				{
					com.google.javascript.rhino.ObjArray elems = new com.google.javascript.rhino.ObjArray();
					decompiler.addToken(com.google.javascript.rhino.Token.LC);
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					if (!(matchToken(com.google.javascript.rhino.Token.RC))) {
						boolean first = true;
						commaloop : do {
							com.google.javascript.rhino.Node property;
							if (!first)
								decompiler.addToken(com.google.javascript.rhino.Token.COMMA);
							else
								first = false;
							
							tt = peekToken();
							switch (tt) {
								case com.google.javascript.rhino.Token.NAME :
								case com.google.javascript.rhino.Token.STRING :
									{
										consumeToken();
										java.lang.String s = ts.getString();
										int linenoName = ts.getLineno();
										int charnoName = ts.getCharno();
										if (tt == (com.google.javascript.rhino.Token.NAME)) {
											if ((s.equals("get")) && ((peekToken()) == (com.google.javascript.rhino.Token.NAME))) {
												decompiler.addToken(com.google.javascript.rhino.Token.GET);
												consumeToken();
												s = ts.getString();
												decompiler.addName(s);
												if (!(getterSetterProperty(elems, s, true, linenoName, charnoName))) {
													break commaloop;
												}
												break;
											}else
												if ((s.equals("set")) && ((peekToken()) == (com.google.javascript.rhino.Token.NAME))) {
													decompiler.addToken(com.google.javascript.rhino.Token.SET);
													consumeToken();
													s = ts.getString();
													decompiler.addName(s);
													if (!(getterSetterProperty(elems, s, false, linenoName, charnoName))) {
														break commaloop;
													}
													break;
												}
											
											decompiler.addName(s);
											property = nf.createString(s, linenoName, charnoName);
										}else {
											decompiler.addString(s);
											property = nf.createString(s, linenoName, charnoName);
											property.setQuotedString();
										}
										plainProperty(elems, property);
										break;
									}
								case com.google.javascript.rhino.Token.NUMBER :
									{
										consumeToken();
										double n = ts.getNumber();
										int linenoNumber = ts.getLineno();
										int charnoNumber = ts.getCharno();
										decompiler.addNumber(n);
										property = nf.createNumber(n, linenoNumber, charnoNumber);
										plainProperty(elems, property);
										break;
									}
								case com.google.javascript.rhino.Token.COMMA :
									consumeToken();
								case com.google.javascript.rhino.Token.RC :
									addWarning("msg.trailing.comma");
									break commaloop;
								default :
									reportError("msg.bad.prop");
									break commaloop;
							}
						} while (matchToken(com.google.javascript.rhino.Token.COMMA) );
						mustMatchToken(com.google.javascript.rhino.Token.RC, "msg.no.brace.prop");
					}
					decompiler.addToken(com.google.javascript.rhino.Token.RC);
					return nf.createObjectLiteral(elems, lineno, charno);
				}
			case com.google.javascript.rhino.Token.LP :
				com.google.javascript.rhino.JSDocInfo info = ts.getAndResetJSDocInfo();
				decompiler.addToken(com.google.javascript.rhino.Token.LP);
				pn = expr(false);
				pn.putProp(com.google.javascript.rhino.Node.PARENTHESIZED_PROP, java.lang.Boolean.TRUE);
				decompiler.addToken(com.google.javascript.rhino.Token.RP);
				if (info == null) {
					info = ts.getAndResetJSDocInfo();
				}
				if ((info != null) && (info.hasType())) {
					pn.setJSDocInfo(info);
				}
				mustMatchToken(com.google.javascript.rhino.Token.RP, "msg.no.paren");
				return pn;
			case com.google.javascript.rhino.Token.XMLATTR :
				mustHaveXML();
				decompiler.addToken(com.google.javascript.rhino.Token.XMLATTR);
				pn = attributeAccess(null, 0);
				return pn;
			case com.google.javascript.rhino.Token.NAME :
				{
					java.lang.String name = ts.getString();
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					if ((ttFlagged & (com.google.javascript.rhino.Parser.TI_CHECK_LABEL)) != 0) {
						if ((peekToken()) == (com.google.javascript.rhino.Token.COLON)) {
							return nf.createLabel(name, lineno, charno);
						}
					}
					decompiler.addName(name);
					if (compilerEnv.isXmlAvailable()) {
						pn = propertyName(null, name, 0, lineno, charno);
					}else {
						pn = nf.createName(name, lineno, charno);
					}
					return pn;
				}
			case com.google.javascript.rhino.Token.NUMBER :
				{
					double n = ts.getNumber();
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addNumber(n);
					return nf.createNumber(n, lineno, charno);
				}
			case com.google.javascript.rhino.Token.STRING :
				{
					java.lang.String s = ts.getString();
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addString(s);
					return nf.createString(s, lineno, charno);
				}
			case com.google.javascript.rhino.Token.DIV :
			case com.google.javascript.rhino.Token.ASSIGN_DIV :
				{
					ts.readRegExp(tt);
					java.lang.String flags = ts.regExpFlags;
					ts.regExpFlags = null;
					java.lang.String re = ts.getString();
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addRegexp(re, flags);
					return nf.createRegExp(re, flags, lineno, charno);
				}
			case com.google.javascript.rhino.Token.NULL :
			case com.google.javascript.rhino.Token.THIS :
			case com.google.javascript.rhino.Token.FALSE :
			case com.google.javascript.rhino.Token.TRUE :
				{
					int lineno = ts.getLineno();
					int charno = ts.getCharno();
					decompiler.addToken(tt);
					return nf.createLeaf(tt, lineno, charno);
				}
			case com.google.javascript.rhino.Token.RESERVED :
				reportError("msg.reserved.id");
				break;
			case com.google.javascript.rhino.Token.ERROR :
				break;
			case com.google.javascript.rhino.Token.EOF :
				reportError("msg.unexpected.eof");
				break;
			default :
				reportError("msg.syntax");
				break;
		}
		return null;
	}

	java.lang.String getSourceName() {
		return sourceURI;
	}

	private void plainProperty(com.google.javascript.rhino.ObjArray elems, java.lang.Object property) throws java.io.IOException {
		mustMatchToken(com.google.javascript.rhino.Token.COLON, "msg.no.colon.prop");
		decompiler.addToken(com.google.javascript.rhino.Token.OBJECTLIT);
		elems.add(property);
		elems.add(assignExpr(false));
	}

	private boolean getterSetterProperty(com.google.javascript.rhino.ObjArray elems, java.lang.String property, boolean isGetter, int lineno, int charno) throws java.io.IOException {
		com.google.javascript.rhino.Node f = function(com.google.javascript.rhino.FunctionNode.FUNCTION_EXPRESSION);
		if ((f.getType()) != (com.google.javascript.rhino.Token.FUNCTION)) {
			reportError("msg.bad.prop");
			return false;
		}
		int fnIndex = f.getExistingIntProp(com.google.javascript.rhino.Node.FUNCTION_PROP);
		com.google.javascript.rhino.FunctionNode fn = currentScriptOrFn.getFunctionNode(fnIndex);
		if ((fn.getFunctionName().length()) != 0) {
			reportError("msg.bad.prop");
			return false;
		}
		elems.add(nf.createName(property, lineno, charno));
		if (isGetter) {
			elems.add(nf.createUnary(com.google.javascript.rhino.Token.GET, f, lineno, charno));
		}else {
			elems.add(nf.createUnary(com.google.javascript.rhino.Token.SET, f, lineno, charno));
		}
		return true;
	}
}

