

package com.google.javascript.jscomp.parsing;


public final class JsDocInfoParser {
	private final com.google.javascript.jscomp.parsing.JsDocTokenStream stream;

	private final com.google.javascript.rhino.JSDocInfoBuilder jsdocBuilder;

	private final java.lang.String sourceName;

	private final com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter;

	private final com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser parser = new com.google.javascript.jscomp.parsing.JsDocInfoParser.ErrorReporterParser();

	private final com.google.javascript.rhino.Node templateNode;

	private class ErrorReporterParser {
		void addParserWarning(java.lang.String messageId, java.lang.String messageArg, int lineno, int charno) {
			errorReporter.warning(com.google.javascript.rhino.ScriptRuntime.getMessage1(messageId, messageArg), sourceName, lineno, null, charno);
		}

		void addParserWarning(java.lang.String messageId, int lineno, int charno) {
			errorReporter.warning(com.google.javascript.rhino.ScriptRuntime.getMessage0(messageId), sourceName, lineno, null, charno);
		}

		void addTypeWarning(java.lang.String messageId, java.lang.String messageArg, int lineno, int charno) {
			errorReporter.warning(("Bad type annotation. " + (com.google.javascript.rhino.ScriptRuntime.getMessage1(messageId, messageArg))), sourceName, lineno, null, charno);
		}

		void addTypeWarning(java.lang.String messageId, int lineno, int charno) {
			errorReporter.warning(("Bad type annotation. " + (com.google.javascript.rhino.ScriptRuntime.getMessage0(messageId))), sourceName, lineno, null, charno);
		}
	}

	private com.google.javascript.rhino.JSDocInfo fileOverviewJSDocInfo = null;

	private com.google.javascript.jscomp.parsing.JsDocInfoParser.State state;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.parsing.Annotation> annotationNames;

	private final java.util.Set<java.lang.String> suppressionNames;

	private static final java.util.Set<java.lang.String> modifiesAnnotationKeywords = com.google.common.collect.ImmutableSet.<java.lang.String>of("this", "arguments");

	private com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder;

	void setFileLevelJsDocBuilder(com.google.javascript.rhino.Node.FileLevelJsDocBuilder fileLevelJsDocBuilder) {
		com.google.javascript.jscomp.parsing.JsDocInfoParser.this.fileLevelJsDocBuilder = fileLevelJsDocBuilder;
	}

	void setFileOverviewJSDocInfo(com.google.javascript.rhino.JSDocInfo fileOverviewJSDocInfo) {
		com.google.javascript.jscomp.parsing.JsDocInfoParser.this.fileOverviewJSDocInfo = fileOverviewJSDocInfo;
	}

	private enum State {
SEARCHING_ANNOTATION, SEARCHING_NEWLINE, NEXT_IS_ANNOTATION;	}

	JsDocInfoParser(com.google.javascript.jscomp.parsing.JsDocTokenStream stream, com.google.javascript.jscomp.mozilla.rhino.ast.Comment commentNode, java.lang.String sourceName, com.google.javascript.jscomp.parsing.Config config, com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter) {
		this.stream = stream;
		this.sourceName = sourceName;
		this.jsdocBuilder = new com.google.javascript.rhino.JSDocInfoBuilder(config.parseJsDocDocumentation);
		if (commentNode != null) {
			com.google.javascript.jscomp.parsing.JsDocInfoParser.this.jsdocBuilder.recordOriginalCommentString(commentNode.getValue());
		}
		this.annotationNames = config.annotationNames;
		this.suppressionNames = config.suppressionNames;
		this.errorReporter = errorReporter;
		this.templateNode = com.google.javascript.jscomp.parsing.JsDocInfoParser.this.createTemplateNode();
	}

	public static com.google.javascript.rhino.Node parseTypeString(java.lang.String typeString) {
		com.google.javascript.jscomp.parsing.Config config = new com.google.javascript.jscomp.parsing.Config(com.google.common.collect.Sets.<java.lang.String>newHashSet(), com.google.common.collect.Sets.<java.lang.String>newHashSet(), false, com.google.javascript.jscomp.parsing.Config.LanguageMode.ECMASCRIPT3, false);
		com.google.javascript.jscomp.parsing.JsDocInfoParser parser = new com.google.javascript.jscomp.parsing.JsDocInfoParser(new com.google.javascript.jscomp.parsing.JsDocTokenStream(typeString), null, "typeparsing", config, com.google.javascript.jscomp.parsing.NullErrorReporter.forNewRhino());
		return parser.parseTopLevelTypeExpression(parser.next());
	}

	boolean parse() {
		int lineno;
		int charno;
		com.google.javascript.rhino.JSTypeExpression type;
		state = com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_ANNOTATION;
		skipEOLs();
		com.google.javascript.jscomp.parsing.JsDocToken token = next();
		if (jsdocBuilder.shouldParseDocumentation()) {
			com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo blockInfo = extractBlockComment(token);
			token = blockInfo.token;
			if (!(blockInfo.string.isEmpty())) {
				jsdocBuilder.recordBlockDescription(blockInfo.string);
			}
		}else {
			if ((token != (com.google.javascript.jscomp.parsing.JsDocToken.ANNOTATION)) && (token != (com.google.javascript.jscomp.parsing.JsDocToken.EOC))) {
				jsdocBuilder.recordBlockDescription("");
			}
		}
		retry : for (; ;) {
			switch (token) {
				case ANNOTATION :
					if ((state) == (com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_ANNOTATION)) {
						state = com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_NEWLINE;
						lineno = stream.getLineno();
						charno = stream.getCharno();
						java.lang.String annotationName = stream.getString();
						com.google.javascript.jscomp.parsing.Annotation annotation = annotationNames.get(annotationName);
						if (annotation == null) {
							parser.addParserWarning("msg.bad.jsdoc.tag", annotationName, stream.getLineno(), stream.getCharno());
						}else {
							jsdocBuilder.markAnnotation(annotationName, lineno, charno);
							switch (annotation) {
								case AUTHOR :
									if (jsdocBuilder.shouldParseDocumentation()) {
										com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo authorInfo = extractSingleLineBlock();
										java.lang.String author = authorInfo.string;
										if ((author.length()) == 0) {
											parser.addParserWarning("msg.jsdoc.authormissing", stream.getLineno(), stream.getCharno());
										}else {
											jsdocBuilder.addAuthor(author);
										}
										token = authorInfo.token;
									}else {
										token = eatTokensUntilEOL(token);
									}
									continue retry;
								case CONSTANT :
									if (!(jsdocBuilder.recordConstancy())) {
										parser.addParserWarning("msg.jsdoc.const", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case CONSTRUCTOR :
									if (!(jsdocBuilder.recordConstructor())) {
										if (jsdocBuilder.isInterfaceRecorded()) {
											parser.addTypeWarning("msg.jsdoc.interface.constructor", stream.getLineno(), stream.getCharno());
										}else {
											parser.addTypeWarning("msg.jsdoc.incompat.type", stream.getLineno(), stream.getCharno());
										}
									}
									token = eatTokensUntilEOL();
									continue retry;
								case DEPRECATED :
									if (!(jsdocBuilder.recordDeprecated())) {
										parser.addParserWarning("msg.jsdoc.deprecated", stream.getLineno(), stream.getCharno());
									}
									com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo reasonInfo = extractMultilineTextualBlock(token);
									java.lang.String reason = reasonInfo.string;
									if ((reason.length()) > 0) {
										jsdocBuilder.recordDeprecationReason(reason);
									}
									token = reasonInfo.token;
									continue retry;
								case INTERFACE :
									if (!(jsdocBuilder.recordInterface())) {
										if (jsdocBuilder.isConstructorRecorded()) {
											parser.addTypeWarning("msg.jsdoc.interface.constructor", stream.getLineno(), stream.getCharno());
										}else {
											parser.addTypeWarning("msg.jsdoc.incompat.type", stream.getLineno(), stream.getCharno());
										}
									}
									token = eatTokensUntilEOL();
									continue retry;
								case DESC :
									if (jsdocBuilder.isDescriptionRecorded()) {
										parser.addParserWarning("msg.jsdoc.desc.extra", stream.getLineno(), stream.getCharno());
										token = eatTokensUntilEOL();
										continue retry;
									}else {
										com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo descriptionInfo = extractMultilineTextualBlock(token);
										java.lang.String description = descriptionInfo.string;
										jsdocBuilder.recordDescription(description);
										token = descriptionInfo.token;
										continue retry;
									}
								case FILE_OVERVIEW :
									java.lang.String fileOverview = "";
									if (jsdocBuilder.shouldParseDocumentation()) {
										com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo fileOverviewInfo = extractMultilineTextualBlock(token, com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption.TRIM);
										fileOverview = fileOverviewInfo.string;
										token = fileOverviewInfo.token;
									}else {
										token = eatTokensUntilEOL(token);
									}
									if ((!(jsdocBuilder.recordFileOverview(fileOverview))) || ((fileOverviewJSDocInfo) != null)) {
										parser.addParserWarning("msg.jsdoc.fileoverview.extra", stream.getLineno(), stream.getCharno());
									}
									continue retry;
								case LICENSE :
								case PRESERVE :
									com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo preserveInfo = extractMultilineTextualBlock(token, com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption.PRESERVE);
									java.lang.String preserve = preserveInfo.string;
									if ((preserve.length()) > 0) {
										if ((fileLevelJsDocBuilder) != null) {
											fileLevelJsDocBuilder.append(preserve);
										}
									}
									token = preserveInfo.token;
									continue retry;
								case ENUM :
									token = next();
									lineno = stream.getLineno();
									charno = stream.getCharno();
									type = null;
									if ((token != (com.google.javascript.jscomp.parsing.JsDocToken.EOL)) && (token != (com.google.javascript.jscomp.parsing.JsDocToken.EOC))) {
										type = createJSTypeExpression(parseAndRecordTypeNode(token));
									}
									if (type == null) {
										type = createJSTypeExpression(newStringNode("number"));
									}
									if (!(jsdocBuilder.recordEnumParameterType(type))) {
										parser.addTypeWarning("msg.jsdoc.incompat.type", lineno, charno);
									}
									token = eatTokensUntilEOL(token);
									continue retry;
								case EXPORT :
									if (!(jsdocBuilder.recordExport())) {
										parser.addParserWarning("msg.jsdoc.export", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case EXTERNS :
									if (!(jsdocBuilder.recordExterns())) {
										parser.addParserWarning("msg.jsdoc.externs", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case JAVA_DISPATCH :
									if (!(jsdocBuilder.recordJavaDispatch())) {
										parser.addParserWarning("msg.jsdoc.javadispatch", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case EXTENDS :
								case IMPLEMENTS :
									skipEOLs();
									token = next();
									lineno = stream.getLineno();
									charno = stream.getCharno();
									boolean matchingRc = false;
									if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)) {
										token = next();
										matchingRc = true;
									}
									if (token == (com.google.javascript.jscomp.parsing.JsDocToken.STRING)) {
										com.google.javascript.rhino.Node typeNode = parseAndRecordTypeNameNode(token, lineno, charno, matchingRc);
										lineno = stream.getLineno();
										charno = stream.getCharno();
										typeNode = wrapNode(com.google.javascript.rhino.Token.BANG, typeNode);
										if ((typeNode != null) && (!matchingRc)) {
											typeNode.putBooleanProp(com.google.javascript.rhino.Node.BRACELESS_TYPE, true);
										}
										type = createJSTypeExpression(typeNode);
										if (annotation == (com.google.javascript.jscomp.parsing.Annotation.EXTENDS)) {
											if (!(jsdocBuilder.recordBaseType(type))) {
												parser.addTypeWarning("msg.jsdoc.incompat.type", lineno, charno);
											}
										}else {
											com.google.common.base.Preconditions.checkState((annotation == (com.google.javascript.jscomp.parsing.Annotation.IMPLEMENTS)));
											if (!(jsdocBuilder.recordImplementedInterface(type))) {
												parser.addTypeWarning("msg.jsdoc.implements.duplicate", lineno, charno);
											}
										}
										token = next();
										if (matchingRc) {
											if (token != (com.google.javascript.jscomp.parsing.JsDocToken.RC)) {
												parser.addTypeWarning("msg.jsdoc.missing.rc", stream.getLineno(), stream.getCharno());
											}
										}else
											if (((token != (com.google.javascript.jscomp.parsing.JsDocToken.EOL)) && (token != (com.google.javascript.jscomp.parsing.JsDocToken.EOF))) && (token != (com.google.javascript.jscomp.parsing.JsDocToken.EOC))) {
												parser.addTypeWarning("msg.end.annotation.expected", stream.getLineno(), stream.getCharno());
											}
										
									}else {
										parser.addTypeWarning("msg.no.type.name", lineno, charno);
									}
									token = eatTokensUntilEOL(token);
									continue retry;
								case HIDDEN :
									if (!(jsdocBuilder.recordHiddenness())) {
										parser.addParserWarning("msg.jsdoc.hidden", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case LENDS :
									skipEOLs();
									matchingRc = false;
									if (match(com.google.javascript.jscomp.parsing.JsDocToken.LC)) {
										token = next();
										matchingRc = true;
									}
									if (match(com.google.javascript.jscomp.parsing.JsDocToken.STRING)) {
										token = next();
										if (!(jsdocBuilder.recordLends(stream.getString()))) {
											parser.addTypeWarning("msg.jsdoc.lends.incompatible", stream.getLineno(), stream.getCharno());
										}
									}else {
										parser.addTypeWarning("msg.jsdoc.lends.missing", stream.getLineno(), stream.getCharno());
									}
									if (matchingRc && (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RC)))) {
										parser.addTypeWarning("msg.jsdoc.missing.rc", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case MEANING :
									com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo meaningInfo = extractMultilineTextualBlock(token);
									java.lang.String meaning = meaningInfo.string;
									token = meaningInfo.token;
									if (!(jsdocBuilder.recordMeaning(meaning))) {
										parser.addParserWarning("msg.jsdoc.meaning.extra", stream.getLineno(), stream.getCharno());
									}
									continue retry;
								case NO_ALIAS :
									if (!(jsdocBuilder.recordNoAlias())) {
										parser.addParserWarning("msg.jsdoc.noalias", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case NO_COMPILE :
									if (!(jsdocBuilder.recordNoCompile())) {
										parser.addParserWarning("msg.jsdoc.nocompile", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case NO_TYPE_CHECK :
									if (!(jsdocBuilder.recordNoTypeCheck())) {
										parser.addParserWarning("msg.jsdoc.nocheck", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case NOT_IMPLEMENTED :
									token = eatTokensUntilEOL();
									continue retry;
								case INHERIT_DOC :
								case OVERRIDE :
									if (!(jsdocBuilder.recordOverride())) {
										parser.addTypeWarning("msg.jsdoc.override", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case THROWS :
									skipEOLs();
									token = next();
									lineno = stream.getLineno();
									charno = stream.getCharno();
									type = null;
									if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)) {
										type = createJSTypeExpression(parseAndRecordTypeNode(token));
										if (type == null) {
											token = eatTokensUntilEOL();
											continue retry;
										}
									}
									token = current();
									jsdocBuilder.recordThrowType(type);
									if (jsdocBuilder.shouldParseDocumentation()) {
										com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo descriptionInfo = extractMultilineTextualBlock(token);
										java.lang.String description = descriptionInfo.string;
										if ((description.length()) > 0) {
											jsdocBuilder.recordThrowDescription(type, description);
										}
										token = descriptionInfo.token;
									}else {
										token = eatTokensUntilEOL(token);
									}
									continue retry;
								case PARAM :
									skipEOLs();
									token = next();
									lineno = stream.getLineno();
									charno = stream.getCharno();
									type = null;
									if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)) {
										type = createJSTypeExpression(parseAndRecordParamTypeNode(token));
										if (type == null) {
											token = eatTokensUntilEOL();
											continue retry;
										}
										skipEOLs();
										token = next();
										lineno = stream.getLineno();
										charno = stream.getCharno();
									}
									java.lang.String name = null;
									boolean isBracketedParam = (com.google.javascript.jscomp.parsing.JsDocToken.LB) == token;
									if (isBracketedParam) {
										token = next();
									}
									if ((com.google.javascript.jscomp.parsing.JsDocToken.STRING) != token) {
										parser.addTypeWarning("msg.missing.variable.name", lineno, charno);
									}else {
										name = stream.getString();
										if (isBracketedParam) {
											token = next();
											if ((com.google.javascript.jscomp.parsing.JsDocToken.EQUALS) == token) {
												token = next();
												if ((com.google.javascript.jscomp.parsing.JsDocToken.STRING) == token) {
													token = next();
												}
											}
											if ((com.google.javascript.jscomp.parsing.JsDocToken.RB) != token) {
												reportTypeSyntaxWarning("msg.jsdoc.missing.rb");
											}else
												if (type != null) {
													type = com.google.javascript.rhino.JSTypeExpression.makeOptionalArg(type);
												}
											
										}
										if ((name.indexOf('.')) > (-1)) {
											name = null;
										}else
											if (!(jsdocBuilder.recordParameter(name, type))) {
												if (jsdocBuilder.hasParameter(name)) {
													parser.addTypeWarning("msg.dup.variable.name", name, lineno, charno);
												}else {
													parser.addTypeWarning("msg.jsdoc.incompat.type", name, lineno, charno);
												}
											}
										
									}
									if (name == null) {
										token = eatTokensUntilEOL(token);
										continue retry;
									}
									jsdocBuilder.markName(name, lineno, charno);
									if (jsdocBuilder.shouldParseDocumentation()) {
										com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo paramDescriptionInfo = extractMultilineTextualBlock(token);
										java.lang.String paramDescription = paramDescriptionInfo.string;
										if ((paramDescription.length()) > 0) {
											jsdocBuilder.recordParameterDescription(name, paramDescription);
										}
										token = paramDescriptionInfo.token;
									}else {
										token = eatTokensUntilEOL(token);
									}
									continue retry;
								case PRESERVE_TRY :
									if (!(jsdocBuilder.recordPreserveTry())) {
										parser.addParserWarning("msg.jsdoc.preservertry", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case PRIVATE :
									if (!(jsdocBuilder.recordVisibility(com.google.javascript.rhino.JSDocInfo.Visibility.PRIVATE))) {
										parser.addParserWarning("msg.jsdoc.visibility.private", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case PROTECTED :
									if (!(jsdocBuilder.recordVisibility(com.google.javascript.rhino.JSDocInfo.Visibility.PROTECTED))) {
										parser.addParserWarning("msg.jsdoc.visibility.protected", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case PUBLIC :
									if (!(jsdocBuilder.recordVisibility(com.google.javascript.rhino.JSDocInfo.Visibility.PUBLIC))) {
										parser.addParserWarning("msg.jsdoc.visibility.public", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case NO_SHADOW :
									if (!(jsdocBuilder.recordNoShadow())) {
										parser.addParserWarning("msg.jsdoc.noshadow", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case NO_SIDE_EFFECTS :
									if (!(jsdocBuilder.recordNoSideEffects())) {
										parser.addParserWarning("msg.jsdoc.nosideeffects", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case MODIFIES :
									token = parseModifiesTag(next());
									continue retry;
								case IMPLICIT_CAST :
									if (!(jsdocBuilder.recordImplicitCast())) {
										parser.addTypeWarning("msg.jsdoc.implicitcast", stream.getLineno(), stream.getCharno());
									}
									token = eatTokensUntilEOL();
									continue retry;
								case SEE :
									if (jsdocBuilder.shouldParseDocumentation()) {
										com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo referenceInfo = extractSingleLineBlock();
										java.lang.String reference = referenceInfo.string;
										if ((reference.length()) == 0) {
											parser.addParserWarning("msg.jsdoc.seemissing", stream.getLineno(), stream.getCharno());
										}else {
											jsdocBuilder.addReference(reference);
										}
										token = referenceInfo.token;
									}else {
										token = eatTokensUntilEOL(token);
									}
									continue retry;
								case SUPPRESS :
									token = parseSuppressTag(next());
									continue retry;
								case TEMPLATE :
									com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo templateInfo = extractSingleLineBlock();
									java.lang.String templateTypeName = templateInfo.string;
									if ((templateTypeName.length()) == 0) {
										parser.addTypeWarning("msg.jsdoc.templatemissing", stream.getLineno(), stream.getCharno());
									}else
										if (!(jsdocBuilder.recordTemplateTypeName(templateTypeName))) {
											parser.addTypeWarning("msg.jsdoc.template.at.most.once", stream.getLineno(), stream.getCharno());
										}
									
									token = templateInfo.token;
									continue retry;
								case VERSION :
									com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo versionInfo = extractSingleLineBlock();
									java.lang.String version = versionInfo.string;
									if ((version.length()) == 0) {
										parser.addParserWarning("msg.jsdoc.versionmissing", stream.getLineno(), stream.getCharno());
									}else {
										if (!(jsdocBuilder.recordVersion(version))) {
											parser.addParserWarning("msg.jsdoc.extraversion", stream.getLineno(), stream.getCharno());
										}
									}
									token = versionInfo.token;
									continue retry;
								case DEFINE :
								case RETURN :
								case THIS :
								case TYPE :
								case TYPEDEF :
									lineno = stream.getLineno();
									charno = stream.getCharno();
									com.google.javascript.rhino.Node typeNode = null;
									if ((!(lookAheadForTypeAnnotation())) && (annotation == (com.google.javascript.jscomp.parsing.Annotation.RETURN))) {
										typeNode = newNode(com.google.javascript.rhino.Token.QMARK);
									}else {
										skipEOLs();
										token = next();
										typeNode = parseAndRecordTypeNode(token, lineno, charno);
									}
									if (annotation == (com.google.javascript.jscomp.parsing.Annotation.THIS)) {
										typeNode = wrapNode(com.google.javascript.rhino.Token.BANG, typeNode);
										if ((typeNode != null) && (token != (com.google.javascript.jscomp.parsing.JsDocToken.LC))) {
											typeNode.putBooleanProp(com.google.javascript.rhino.Node.BRACELESS_TYPE, true);
										}
									}
									type = createJSTypeExpression(typeNode);
									if (type == null) {
									}else {
										switch (annotation) {
											case DEFINE :
												if (!(jsdocBuilder.recordDefineType(type))) {
													parser.addParserWarning("msg.jsdoc.define", lineno, charno);
												}
												break;
											case RETURN :
												if (!(jsdocBuilder.recordReturnType(type))) {
													parser.addTypeWarning("msg.jsdoc.incompat.type", lineno, charno);
													break;
												}
												if (jsdocBuilder.shouldParseDocumentation()) {
													com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo returnDescriptionInfo = extractMultilineTextualBlock(token);
													java.lang.String returnDescription = returnDescriptionInfo.string;
													if ((returnDescription.length()) > 0) {
														jsdocBuilder.recordReturnDescription(returnDescription);
													}
													token = returnDescriptionInfo.token;
												}else {
													token = eatTokensUntilEOL(token);
												}
												continue retry;
											case THIS :
												if (!(jsdocBuilder.recordThisType(type))) {
													parser.addTypeWarning("msg.jsdoc.incompat.type", lineno, charno);
												}
												break;
											case TYPE :
												if (!(jsdocBuilder.recordType(type))) {
													parser.addTypeWarning("msg.jsdoc.incompat.type", lineno, charno);
												}
												break;
											case TYPEDEF :
												if (!(jsdocBuilder.recordTypedef(type))) {
													parser.addTypeWarning("msg.jsdoc.incompat.type", lineno, charno);
												}
												break;
										}
										token = eatTokensUntilEOL();
									}
									continue retry;
							}
						}
					}
					break;
				case EOC :
					if (hasParsedFileOverviewDocInfo()) {
						fileOverviewJSDocInfo = retrieveAndResetParsedJSDocInfo();
					}
					return true;
				case EOF :
					jsdocBuilder.build(null);
					parser.addParserWarning("msg.unexpected.eof", stream.getLineno(), stream.getCharno());
					return false;
				case EOL :
					if ((state) == (com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_NEWLINE)) {
						state = com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_ANNOTATION;
					}
					token = next();
					continue retry;
				default :
					if ((token == (com.google.javascript.jscomp.parsing.JsDocToken.STAR)) && ((state) == (com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_ANNOTATION))) {
						token = next();
						continue retry;
					}else {
						state = com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_NEWLINE;
						token = eatTokensUntilEOL();
						continue retry;
					}
			}
			token = next();
		}
	}

	private com.google.javascript.jscomp.parsing.JsDocToken parseSuppressTag(com.google.javascript.jscomp.parsing.JsDocToken token) {
		if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)) {
			java.util.Set<java.lang.String> suppressions = new java.util.HashSet<java.lang.String>();
			while (true) {
				if (match(com.google.javascript.jscomp.parsing.JsDocToken.STRING)) {
					java.lang.String name = stream.getString();
					if (!(suppressionNames.contains(name))) {
						parser.addParserWarning("msg.jsdoc.suppress.unknown", name, stream.getLineno(), stream.getCharno());
					}
					suppressions.add(stream.getString());
					token = next();
				}else {
					parser.addParserWarning("msg.jsdoc.suppress", stream.getLineno(), stream.getCharno());
					return token;
				}
				if (match(com.google.javascript.jscomp.parsing.JsDocToken.PIPE)) {
					token = next();
				}else {
					break;
				}
			} 
			if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RC))) {
				parser.addParserWarning("msg.jsdoc.suppress", stream.getLineno(), stream.getCharno());
			}else {
				token = next();
				if (!(jsdocBuilder.recordSuppressions(suppressions))) {
					parser.addParserWarning("msg.jsdoc.suppress.duplicate", stream.getLineno(), stream.getCharno());
				}
			}
		}
		return token;
	}

	private com.google.javascript.jscomp.parsing.JsDocToken parseModifiesTag(com.google.javascript.jscomp.parsing.JsDocToken token) {
		if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)) {
			java.util.Set<java.lang.String> modifies = new java.util.HashSet<java.lang.String>();
			while (true) {
				if (match(com.google.javascript.jscomp.parsing.JsDocToken.STRING)) {
					java.lang.String name = stream.getString();
					if ((!(com.google.javascript.jscomp.parsing.JsDocInfoParser.modifiesAnnotationKeywords.contains(name))) && (!(jsdocBuilder.hasParameter(name)))) {
						parser.addParserWarning("msg.jsdoc.modifies.unknown", name, stream.getLineno(), stream.getCharno());
					}
					modifies.add(stream.getString());
					token = next();
				}else {
					parser.addParserWarning("msg.jsdoc.modifies", stream.getLineno(), stream.getCharno());
					return token;
				}
				if (match(com.google.javascript.jscomp.parsing.JsDocToken.PIPE)) {
					token = next();
				}else {
					break;
				}
			} 
			if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RC))) {
				parser.addParserWarning("msg.jsdoc.modifies", stream.getLineno(), stream.getCharno());
			}else {
				token = next();
				if (!(jsdocBuilder.recordModifies(modifies))) {
					parser.addParserWarning("msg.jsdoc.modifies.duplicate", stream.getLineno(), stream.getCharno());
				}
			}
		}
		return token;
	}

	private com.google.javascript.rhino.Node parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken token) {
		return parseAndRecordTypeNode(token, (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)));
	}

	private com.google.javascript.rhino.Node parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken token, boolean matchingLC) {
		return parseAndRecordTypeNode(token, stream.getLineno(), stream.getCharno(), matchingLC, false);
	}

	private com.google.javascript.rhino.Node parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken token, int lineno, int startCharno) {
		return parseAndRecordTypeNode(token, lineno, startCharno, (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)), false);
	}

	private com.google.javascript.rhino.Node parseAndRecordTypeNameNode(com.google.javascript.jscomp.parsing.JsDocToken token, int lineno, int startCharno, boolean matchingLC) {
		return parseAndRecordTypeNode(token, lineno, startCharno, matchingLC, true);
	}

	private com.google.javascript.rhino.Node parseAndRecordParamTypeNode(com.google.javascript.jscomp.parsing.JsDocToken token) {
		com.google.common.base.Preconditions.checkArgument((token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)));
		int lineno = stream.getLineno();
		int startCharno = stream.getCharno();
		com.google.javascript.rhino.Node typeNode = parseParamTypeExpressionAnnotation(token);
		int endCharno = stream.getCharno();
		jsdocBuilder.markTypeNode(typeNode, lineno, startCharno, endCharno, true);
		return typeNode;
	}

	private com.google.javascript.rhino.Node parseAndRecordTypeNode(com.google.javascript.jscomp.parsing.JsDocToken token, int lineno, int startCharno, boolean matchingLC, boolean onlyParseSimpleNames) {
		com.google.javascript.rhino.Node typeNode = null;
		if (onlyParseSimpleNames) {
			typeNode = parseTypeNameAnnotation(token);
		}else {
			typeNode = parseTypeExpressionAnnotation(token);
		}
		if ((typeNode != null) && (!matchingLC)) {
			typeNode.putBooleanProp(com.google.javascript.rhino.Node.BRACELESS_TYPE, true);
		}
		int endCharno = stream.getCharno();
		jsdocBuilder.markTypeNode(typeNode, lineno, startCharno, endCharno, matchingLC);
		return typeNode;
	}

	private java.lang.String toString(com.google.javascript.jscomp.parsing.JsDocToken token) {
		switch (token) {
			case ANNOTATION :
				return "@" + (stream.getString());
			case BANG :
				return "!";
			case COMMA :
				return ",";
			case COLON :
				return ":";
			case GT :
				return ">";
			case LB :
				return "[";
			case LC :
				return "{";
			case LP :
				return "(";
			case LT :
				return ".<";
			case QMARK :
				return "?";
			case PIPE :
				return "|";
			case RB :
				return "]";
			case RC :
				return "}";
			case RP :
				return ")";
			case STAR :
				return "*";
			case ELLIPSIS :
				return "...";
			case EQUALS :
				return "=";
			case STRING :
				return stream.getString();
			default :
				throw new java.lang.IllegalStateException(token.toString());
		}
	}

	private com.google.javascript.rhino.JSTypeExpression createJSTypeExpression(com.google.javascript.rhino.Node n) {
		return n == null ? null : new com.google.javascript.rhino.JSTypeExpression(n, sourceName);
	}

	private static class ExtractionInfo {
		private final java.lang.String string;

		private final com.google.javascript.jscomp.parsing.JsDocToken token;

		public ExtractionInfo(java.lang.String string, com.google.javascript.jscomp.parsing.JsDocToken token) {
			this.string = string;
			this.token = token;
		}
	}

	private com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo extractSingleLineBlock() {
		stream.update();
		int lineno = stream.getLineno();
		int charno = (stream.getCharno()) + 1;
		java.lang.String line = stream.getRemainingJSDocLine().trim();
		if ((line.length()) > 0) {
			jsdocBuilder.markText(line, lineno, charno, lineno, (charno + (line.length())));
		}
		return new com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo(line, next());
	}

	private com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo extractMultilineTextualBlock(com.google.javascript.jscomp.parsing.JsDocToken token) {
		return extractMultilineTextualBlock(token, com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption.SINGLE_LINE);
	}

	private enum WhitespaceOption {
PRESERVE, TRIM, SINGLE_LINE;	}

	@java.lang.SuppressWarnings(value = "fallthrough")
	private com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo extractMultilineTextualBlock(com.google.javascript.jscomp.parsing.JsDocToken token, com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption option) {
		if (((token == (com.google.javascript.jscomp.parsing.JsDocToken.EOC)) || (token == (com.google.javascript.jscomp.parsing.JsDocToken.EOL))) || (token == (com.google.javascript.jscomp.parsing.JsDocToken.EOF))) {
			return new com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo("", token);
		}
		stream.update();
		int startLineno = stream.getLineno();
		int startCharno = (stream.getCharno()) + 1;
		java.lang.String line = stream.getRemainingJSDocLine();
		if (option != (com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption.PRESERVE)) {
			line = line.trim();
		}
		java.lang.StringBuilder builder = new java.lang.StringBuilder();
		builder.append(line);
		state = com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_ANNOTATION;
		token = next();
		boolean ignoreStar = false;
		do {
			switch (token) {
				case STAR :
					if (!ignoreStar) {
						if ((builder.length()) > 0) {
							builder.append(' ');
						}
						builder.append('*');
					}
					token = next();
					continue;
				case EOL :
					if (option != (com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption.SINGLE_LINE)) {
						builder.append("\n");
					}
					ignoreStar = true;
					token = next();
					continue;
				case ANNOTATION :
				case EOC :
				case EOF :
					if (!((option == (com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption.PRESERVE)) && (token == (com.google.javascript.jscomp.parsing.JsDocToken.ANNOTATION)))) {
						java.lang.String multilineText = builder.toString();
						if (option != (com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption.PRESERVE)) {
							multilineText = multilineText.trim();
						}
						int endLineno = stream.getLineno();
						int endCharno = stream.getCharno();
						if ((multilineText.length()) > 0) {
							jsdocBuilder.markText(multilineText, startLineno, startCharno, endLineno, endCharno);
						}
						return new com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo(multilineText, token);
					}
				default :
					ignoreStar = false;
					state = com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_ANNOTATION;
					if ((builder.length()) > 0) {
						builder.append(' ');
					}
					builder.append(toString(token));
					line = stream.getRemainingJSDocLine();
					if (option != (com.google.javascript.jscomp.parsing.JsDocInfoParser.WhitespaceOption.PRESERVE)) {
						line = com.google.javascript.jscomp.parsing.JsDocInfoParser.trimEnd(line);
					}
					builder.append(line);
					token = next();
			}
		} while (true );
	}

	private com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo extractBlockComment(com.google.javascript.jscomp.parsing.JsDocToken token) {
		java.lang.StringBuilder builder = new java.lang.StringBuilder();
		boolean ignoreStar = true;
		do {
			switch (token) {
				case ANNOTATION :
				case EOC :
				case EOF :
					return new com.google.javascript.jscomp.parsing.JsDocInfoParser.ExtractionInfo(builder.toString().trim(), token);
				case STAR :
					if (!ignoreStar) {
						if ((builder.length()) > 0) {
							builder.append(' ');
						}
						builder.append('*');
					}
					token = next();
					continue;
				case EOL :
					ignoreStar = true;
					builder.append('\n');
					token = next();
					continue;
				default :
					if ((!ignoreStar) && ((builder.length()) > 0)) {
						builder.append(' ');
					}
					ignoreStar = false;
					builder.append(toString(token));
					java.lang.String line = stream.getRemainingJSDocLine();
					line = com.google.javascript.jscomp.parsing.JsDocInfoParser.trimEnd(line);
					builder.append(line);
					token = next();
			}
		} while (true );
	}

	private static java.lang.String trimEnd(java.lang.String s) {
		int trimCount = 0;
		while (trimCount < (s.length())) {
			char ch = s.charAt((((s.length()) - trimCount) - 1));
			if (java.lang.Character.isWhitespace(ch)) {
				trimCount++;
			}else {
				break;
			}
		} 
		if (trimCount == 0) {
			return s;
		}
		return s.substring(0, ((s.length()) - trimCount));
	}

	private com.google.javascript.rhino.Node parseTypeExpressionAnnotation(com.google.javascript.jscomp.parsing.JsDocToken token) {
		if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)) {
			skipEOLs();
			com.google.javascript.rhino.Node typeNode = parseTopLevelTypeExpression(next());
			if (typeNode != null) {
				skipEOLs();
				if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RC))) {
					reportTypeSyntaxWarning("msg.jsdoc.missing.rc");
				}else {
					next();
				}
			}
			return typeNode;
		}else {
			return parseTypeExpression(token);
		}
	}

	private com.google.javascript.rhino.Node parseParamTypeExpressionAnnotation(com.google.javascript.jscomp.parsing.JsDocToken token) {
		com.google.common.base.Preconditions.checkArgument((token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)));
		skipEOLs();
		boolean restArg = false;
		token = next();
		if (token == (com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS)) {
			token = next();
			if (token == (com.google.javascript.jscomp.parsing.JsDocToken.RC)) {
				return wrapNode(com.google.javascript.rhino.Token.ELLIPSIS, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY));
			}
			restArg = true;
		}
		com.google.javascript.rhino.Node typeNode = parseTopLevelTypeExpression(token);
		if (typeNode != null) {
			skipEOLs();
			if (restArg) {
				typeNode = wrapNode(com.google.javascript.rhino.Token.ELLIPSIS, typeNode);
			}else
				if (match(com.google.javascript.jscomp.parsing.JsDocToken.EQUALS)) {
					next();
					skipEOLs();
					typeNode = wrapNode(com.google.javascript.rhino.Token.EQUALS, typeNode);
				}
			
			if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RC))) {
				reportTypeSyntaxWarning("msg.jsdoc.missing.rc");
			}else {
				next();
			}
		}
		return typeNode;
	}

	private com.google.javascript.rhino.Node parseTypeNameAnnotation(com.google.javascript.jscomp.parsing.JsDocToken token) {
		if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)) {
			skipEOLs();
			com.google.javascript.rhino.Node typeNode = parseTypeName(next());
			if (typeNode != null) {
				skipEOLs();
				if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RC))) {
					reportTypeSyntaxWarning("msg.jsdoc.missing.rc");
				}else {
					next();
				}
			}
			return typeNode;
		}else {
			return parseTypeName(token);
		}
	}

	private com.google.javascript.rhino.Node parseTopLevelTypeExpression(com.google.javascript.jscomp.parsing.JsDocToken token) {
		com.google.javascript.rhino.Node typeExpr = parseTypeExpression(token);
		if (typeExpr != null) {
			if (match(com.google.javascript.jscomp.parsing.JsDocToken.PIPE)) {
				next();
				if (match(com.google.javascript.jscomp.parsing.JsDocToken.PIPE)) {
					next();
				}
				skipEOLs();
				token = next();
				return parseUnionTypeWithAlternate(token, typeExpr);
			}
		}
		return typeExpr;
	}

	private com.google.javascript.rhino.Node parseTypeExpressionList(com.google.javascript.jscomp.parsing.JsDocToken token) {
		com.google.javascript.rhino.Node typeExpr = parseTopLevelTypeExpression(token);
		if (typeExpr == null) {
			return null;
		}
		com.google.javascript.rhino.Node typeList = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK);
		typeList.addChildToBack(typeExpr);
		while (match(com.google.javascript.jscomp.parsing.JsDocToken.COMMA)) {
			next();
			skipEOLs();
			typeExpr = parseTopLevelTypeExpression(next());
			if (typeExpr == null) {
				return null;
			}
			typeList.addChildToBack(typeExpr);
		} 
		return typeList;
	}

	private com.google.javascript.rhino.Node parseTypeExpression(com.google.javascript.jscomp.parsing.JsDocToken token) {
		if (token == (com.google.javascript.jscomp.parsing.JsDocToken.QMARK)) {
			token = next();
			if (((((token == (com.google.javascript.jscomp.parsing.JsDocToken.COMMA)) || (token == (com.google.javascript.jscomp.parsing.JsDocToken.EQUALS))) || (token == (com.google.javascript.jscomp.parsing.JsDocToken.RC))) || (token == (com.google.javascript.jscomp.parsing.JsDocToken.RP))) || (token == (com.google.javascript.jscomp.parsing.JsDocToken.PIPE))) {
				restoreLookAhead(token);
				return newNode(com.google.javascript.rhino.Token.QMARK);
			}
			return wrapNode(com.google.javascript.rhino.Token.QMARK, parseBasicTypeExpression(token));
		}else
			if (token == (com.google.javascript.jscomp.parsing.JsDocToken.BANG)) {
				return wrapNode(com.google.javascript.rhino.Token.BANG, parseBasicTypeExpression(next()));
			}else {
				com.google.javascript.rhino.Node basicTypeExpr = parseBasicTypeExpression(token);
				if (basicTypeExpr != null) {
					if (match(com.google.javascript.jscomp.parsing.JsDocToken.QMARK)) {
						next();
						return wrapNode(com.google.javascript.rhino.Token.QMARK, basicTypeExpr);
					}else
						if (match(com.google.javascript.jscomp.parsing.JsDocToken.BANG)) {
							next();
							return wrapNode(com.google.javascript.rhino.Token.BANG, basicTypeExpr);
						}
					
				}
				return basicTypeExpr;
			}
		
	}

	private com.google.javascript.rhino.Node parseBasicTypeExpression(com.google.javascript.jscomp.parsing.JsDocToken token) {
		if (token == (com.google.javascript.jscomp.parsing.JsDocToken.STAR)) {
			return newNode(com.google.javascript.rhino.Token.STAR);
		}else
			if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LB)) {
				skipEOLs();
				return parseArrayType(next());
			}else
				if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LC)) {
					skipEOLs();
					return parseRecordType(next());
				}else
					if (token == (com.google.javascript.jscomp.parsing.JsDocToken.LP)) {
						skipEOLs();
						return parseUnionType(next());
					}else
						if (token == (com.google.javascript.jscomp.parsing.JsDocToken.STRING)) {
							java.lang.String string = stream.getString();
							if ("function".equals(string)) {
								skipEOLs();
								return parseFunctionType(next());
							}else
								if (("null".equals(string)) || ("undefined".equals(string))) {
									return newStringNode(string);
								}else {
									return parseTypeName(token);
								}
							
						}
					
				
			
		
		return reportGenericTypeSyntaxWarning();
	}

	private com.google.javascript.rhino.Node parseTypeName(com.google.javascript.jscomp.parsing.JsDocToken token) {
		if (token != (com.google.javascript.jscomp.parsing.JsDocToken.STRING)) {
			return reportGenericTypeSyntaxWarning();
		}
		java.lang.String typeName = stream.getString();
		while ((match(com.google.javascript.jscomp.parsing.JsDocToken.EOL)) && ((typeName.charAt(((typeName.length()) - 1))) == '.')) {
			skipEOLs();
			if (match(com.google.javascript.jscomp.parsing.JsDocToken.STRING)) {
				next();
				typeName += stream.getString();
			}
		} 
		com.google.javascript.rhino.Node typeNameNode = newStringNode(typeName);
		if (match(com.google.javascript.jscomp.parsing.JsDocToken.LT)) {
			next();
			skipEOLs();
			com.google.javascript.rhino.Node memberType = parseTypeExpressionList(next());
			if (memberType != null) {
				typeNameNode.addChildToFront(memberType);
				skipEOLs();
				if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.GT))) {
					return reportTypeSyntaxWarning("msg.jsdoc.missing.gt");
				}
				next();
			}
		}
		return typeNameNode;
	}

	private com.google.javascript.rhino.Node parseFunctionType(com.google.javascript.jscomp.parsing.JsDocToken token) {
		if (token != (com.google.javascript.jscomp.parsing.JsDocToken.LP)) {
			return reportTypeSyntaxWarning("msg.jsdoc.missing.lp");
		}
		com.google.javascript.rhino.Node functionType = newNode(com.google.javascript.rhino.Token.FUNCTION);
		com.google.javascript.rhino.Node parameters = null;
		skipEOLs();
		if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RP))) {
			token = next();
			boolean hasParams = true;
			if (token == (com.google.javascript.jscomp.parsing.JsDocToken.STRING)) {
				java.lang.String tokenStr = stream.getString();
				boolean isThis = "this".equals(tokenStr);
				boolean isNew = "new".equals(tokenStr);
				if (isThis || isNew) {
					if (match(com.google.javascript.jscomp.parsing.JsDocToken.COLON)) {
						next();
						skipEOLs();
						com.google.javascript.rhino.Node contextType = wrapNode((isThis ? com.google.javascript.rhino.Token.THIS : com.google.javascript.rhino.Token.NEW), parseTypeName(next()));
						if (contextType == null) {
							return null;
						}
						functionType.addChildToFront(contextType);
					}else {
						return reportTypeSyntaxWarning("msg.jsdoc.missing.colon");
					}
					if (match(com.google.javascript.jscomp.parsing.JsDocToken.COMMA)) {
						next();
						skipEOLs();
						token = next();
					}else {
						hasParams = false;
					}
				}
			}
			if (hasParams) {
				parameters = parseParametersType(token);
				if (parameters == null) {
					return null;
				}
			}
		}
		if (parameters != null) {
			functionType.addChildToBack(parameters);
		}
		skipEOLs();
		if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RP))) {
			return reportTypeSyntaxWarning("msg.jsdoc.missing.rp");
		}
		skipEOLs();
		com.google.javascript.rhino.Node resultType = parseResultType(next());
		if (resultType == null) {
			return null;
		}else {
			functionType.addChildToBack(resultType);
		}
		return functionType;
	}

	private com.google.javascript.rhino.Node parseParametersType(com.google.javascript.jscomp.parsing.JsDocToken token) {
		com.google.javascript.rhino.Node paramsType = newNode(com.google.javascript.rhino.Token.LP);
		boolean isVarArgs = false;
		com.google.javascript.rhino.Node paramType = null;
		if (token != (com.google.javascript.jscomp.parsing.JsDocToken.RP)) {
			do {
				if (paramType != null) {
					next();
					skipEOLs();
					token = next();
				}
				if (token == (com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS)) {
					skipEOLs();
					if (match(com.google.javascript.jscomp.parsing.JsDocToken.RP)) {
						paramType = newNode(com.google.javascript.rhino.Token.ELLIPSIS);
					}else {
						skipEOLs();
						if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.LB))) {
							return reportTypeSyntaxWarning("msg.jsdoc.missing.lb");
						}
						next();
						skipEOLs();
						paramType = wrapNode(com.google.javascript.rhino.Token.ELLIPSIS, parseTypeExpression(next()));
						skipEOLs();
						if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RB))) {
							return reportTypeSyntaxWarning("msg.jsdoc.missing.rb");
						}
						skipEOLs();
						next();
					}
					isVarArgs = true;
				}else {
					paramType = parseTypeExpression(token);
					if (match(com.google.javascript.jscomp.parsing.JsDocToken.EQUALS)) {
						skipEOLs();
						next();
						paramType = wrapNode(com.google.javascript.rhino.Token.EQUALS, paramType);
					}
				}
				if (paramType == null) {
					return null;
				}
				paramsType.addChildToBack(paramType);
				if (isVarArgs) {
					break;
				}
			} while (match(com.google.javascript.jscomp.parsing.JsDocToken.COMMA) );
		}
		if (isVarArgs && (match(com.google.javascript.jscomp.parsing.JsDocToken.COMMA))) {
			return reportTypeSyntaxWarning("msg.jsdoc.function.varargs");
		}
		return paramsType;
	}

	private com.google.javascript.rhino.Node parseResultType(com.google.javascript.jscomp.parsing.JsDocToken token) {
		skipEOLs();
		if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.COLON))) {
			return newNode(com.google.javascript.rhino.Token.EMPTY);
		}
		token = next();
		skipEOLs();
		if ((match(com.google.javascript.jscomp.parsing.JsDocToken.STRING)) && ("void".equals(stream.getString()))) {
			next();
			return newNode(com.google.javascript.rhino.Token.VOID);
		}else {
			return parseTypeExpression(next());
		}
	}

	private com.google.javascript.rhino.Node parseUnionType(com.google.javascript.jscomp.parsing.JsDocToken token) {
		return parseUnionTypeWithAlternate(token, null);
	}

	private com.google.javascript.rhino.Node parseUnionTypeWithAlternate(com.google.javascript.jscomp.parsing.JsDocToken token, com.google.javascript.rhino.Node alternate) {
		com.google.javascript.rhino.Node union = newNode(com.google.javascript.rhino.Token.PIPE);
		if (alternate != null) {
			union.addChildToBack(alternate);
		}
		com.google.javascript.rhino.Node expr = null;
		do {
			if (expr != null) {
				skipEOLs();
				token = next();
				com.google.common.base.Preconditions.checkState(((token == (com.google.javascript.jscomp.parsing.JsDocToken.PIPE)) || (token == (com.google.javascript.jscomp.parsing.JsDocToken.COMMA))));
				boolean isPipe = token == (com.google.javascript.jscomp.parsing.JsDocToken.PIPE);
				if (isPipe && (match(com.google.javascript.jscomp.parsing.JsDocToken.PIPE))) {
					next();
				}
				skipEOLs();
				token = next();
			}
			expr = parseTypeExpression(token);
			if (expr == null) {
				return null;
			}
			union.addChildToBack(expr);
		} while (match(com.google.javascript.jscomp.parsing.JsDocToken.PIPE, com.google.javascript.jscomp.parsing.JsDocToken.COMMA) );
		if (alternate == null) {
			skipEOLs();
			if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RP))) {
				return reportTypeSyntaxWarning("msg.jsdoc.missing.rp");
			}
			next();
		}
		return union;
	}

	private com.google.javascript.rhino.Node parseArrayType(com.google.javascript.jscomp.parsing.JsDocToken token) {
		com.google.javascript.rhino.Node array = newNode(com.google.javascript.rhino.Token.LB);
		com.google.javascript.rhino.Node arg = null;
		boolean hasVarArgs = false;
		do {
			if (arg != null) {
				next();
				skipEOLs();
				token = next();
			}
			if (token == (com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS)) {
				arg = wrapNode(com.google.javascript.rhino.Token.ELLIPSIS, parseTypeExpression(next()));
				hasVarArgs = true;
			}else {
				arg = parseTypeExpression(token);
			}
			if (arg == null) {
				return null;
			}
			array.addChildToBack(arg);
			if (hasVarArgs) {
				break;
			}
			skipEOLs();
		} while (match(com.google.javascript.jscomp.parsing.JsDocToken.COMMA) );
		if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RB))) {
			return reportTypeSyntaxWarning("msg.jsdoc.missing.rb");
		}
		next();
		return array;
	}

	private com.google.javascript.rhino.Node parseRecordType(com.google.javascript.jscomp.parsing.JsDocToken token) {
		com.google.javascript.rhino.Node recordType = newNode(com.google.javascript.rhino.Token.LC);
		com.google.javascript.rhino.Node fieldTypeList = parseFieldTypeList(token);
		if (fieldTypeList == null) {
			return reportGenericTypeSyntaxWarning();
		}
		skipEOLs();
		if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.RC))) {
			return reportTypeSyntaxWarning("msg.jsdoc.missing.rc");
		}
		next();
		recordType.addChildToBack(fieldTypeList);
		return recordType;
	}

	private com.google.javascript.rhino.Node parseFieldTypeList(com.google.javascript.jscomp.parsing.JsDocToken token) {
		com.google.javascript.rhino.Node fieldTypeList = newNode(com.google.javascript.rhino.Token.LB);
		do {
			com.google.javascript.rhino.Node fieldType = parseFieldType(token);
			if (fieldType == null) {
				return null;
			}
			fieldTypeList.addChildToBack(fieldType);
			skipEOLs();
			if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.COMMA))) {
				break;
			}
			next();
			skipEOLs();
			token = next();
		} while (true );
		return fieldTypeList;
	}

	private com.google.javascript.rhino.Node parseFieldType(com.google.javascript.jscomp.parsing.JsDocToken token) {
		com.google.javascript.rhino.Node fieldName = parseFieldName(token);
		if (fieldName == null) {
			return null;
		}
		skipEOLs();
		if (!(match(com.google.javascript.jscomp.parsing.JsDocToken.COLON))) {
			return fieldName;
		}
		next();
		skipEOLs();
		com.google.javascript.rhino.Node typeExpression = parseTypeExpression(next());
		if (typeExpression == null) {
			return null;
		}
		com.google.javascript.rhino.Node fieldType = newNode(com.google.javascript.rhino.Token.COLON);
		fieldType.addChildToBack(fieldName);
		fieldType.addChildToBack(typeExpression);
		return fieldType;
	}

	private com.google.javascript.rhino.Node parseFieldName(com.google.javascript.jscomp.parsing.JsDocToken token) {
		switch (token) {
			case STRING :
				java.lang.String string = stream.getString();
				return newStringNode(string);
			default :
				return null;
		}
	}

	private com.google.javascript.rhino.Node wrapNode(int type, com.google.javascript.rhino.Node n) {
		return n == null ? null : new com.google.javascript.rhino.Node(type, n, stream.getLineno(), stream.getCharno()).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newNode(int type) {
		return new com.google.javascript.rhino.Node(type, stream.getLineno(), stream.getCharno()).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node newStringNode(java.lang.String s) {
		return com.google.javascript.rhino.Node.newString(s, stream.getLineno(), stream.getCharno()).clonePropsFrom(templateNode);
	}

	private com.google.javascript.rhino.Node createTemplateNode() {
		com.google.javascript.rhino.Node templateNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.SCRIPT);
		templateNode.putProp(com.google.javascript.rhino.Node.SOURCENAME_PROP, sourceName);
		return templateNode;
	}

	private com.google.javascript.rhino.Node reportTypeSyntaxWarning(java.lang.String warning) {
		parser.addTypeWarning(warning, stream.getLineno(), stream.getCharno());
		return null;
	}

	private com.google.javascript.rhino.Node reportGenericTypeSyntaxWarning() {
		return reportTypeSyntaxWarning("msg.jsdoc.type.syntax");
	}

	private com.google.javascript.jscomp.parsing.JsDocToken eatTokensUntilEOL() {
		return eatTokensUntilEOL(next());
	}

	private com.google.javascript.jscomp.parsing.JsDocToken eatTokensUntilEOL(com.google.javascript.jscomp.parsing.JsDocToken token) {
		do {
			if (((token == (com.google.javascript.jscomp.parsing.JsDocToken.EOL)) || (token == (com.google.javascript.jscomp.parsing.JsDocToken.EOC))) || (token == (com.google.javascript.jscomp.parsing.JsDocToken.EOF))) {
				state = com.google.javascript.jscomp.parsing.JsDocInfoParser.State.SEARCHING_ANNOTATION;
				return token;
			}
			token = next();
		} while (true );
	}

	private static final com.google.javascript.jscomp.parsing.JsDocToken NO_UNREAD_TOKEN = null;

	private com.google.javascript.jscomp.parsing.JsDocToken unreadToken = com.google.javascript.jscomp.parsing.JsDocInfoParser.NO_UNREAD_TOKEN;

	private void restoreLookAhead(com.google.javascript.jscomp.parsing.JsDocToken token) {
		unreadToken = token;
	}

	private boolean match(com.google.javascript.jscomp.parsing.JsDocToken token) {
		unreadToken = next();
		return (unreadToken) == token;
	}

	private boolean match(com.google.javascript.jscomp.parsing.JsDocToken token1, com.google.javascript.jscomp.parsing.JsDocToken token2) {
		unreadToken = next();
		return ((unreadToken) == token1) || ((unreadToken) == token2);
	}

	private com.google.javascript.jscomp.parsing.JsDocToken next() {
		if ((unreadToken) == (com.google.javascript.jscomp.parsing.JsDocInfoParser.NO_UNREAD_TOKEN)) {
			return stream.getJsDocToken();
		}else {
			return current();
		}
	}

	private com.google.javascript.jscomp.parsing.JsDocToken current() {
		com.google.javascript.jscomp.parsing.JsDocToken t = unreadToken;
		unreadToken = com.google.javascript.jscomp.parsing.JsDocInfoParser.NO_UNREAD_TOKEN;
		return t;
	}

	private void skipEOLs() {
		while (match(com.google.javascript.jscomp.parsing.JsDocToken.EOL)) {
			next();
			if (match(com.google.javascript.jscomp.parsing.JsDocToken.STAR)) {
				next();
			}
		} 
	}

	private boolean hasParsedFileOverviewDocInfo() {
		return jsdocBuilder.isPopulatedWithFileOverview();
	}

	boolean hasParsedJSDocInfo() {
		return jsdocBuilder.isPopulated();
	}

	com.google.javascript.rhino.JSDocInfo retrieveAndResetParsedJSDocInfo() {
		return jsdocBuilder.build(sourceName);
	}

	com.google.javascript.rhino.JSDocInfo getFileOverviewJSDocInfo() {
		return fileOverviewJSDocInfo;
	}

	private boolean lookAheadForTypeAnnotation() {
		boolean matchedLc = false;
		int c;
		while (true) {
			c = stream.getChar();
			if (c == ' ') {
				continue;
			}else
				if (c == '{') {
					matchedLc = true;
					break;
				}else {
					break;
				}
			
		} 
		stream.ungetChar(c);
		return matchedLc;
	}
}

