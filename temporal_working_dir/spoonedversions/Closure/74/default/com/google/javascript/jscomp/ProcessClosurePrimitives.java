

package com.google.javascript.jscomp;


class ProcessClosurePrimitives extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType NULL_ARGUMENT_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NULL_ARGUMENT_ERROR", "method \"{0}\" called without an argument");

	static final com.google.javascript.jscomp.DiagnosticType EXPECTED_OBJECTLIT_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_EXPECTED_OBJECTLIT_ERROR", "method \"{0}\" expected an object literal argument");

	static final com.google.javascript.jscomp.DiagnosticType EXPECTED_STRING_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_EXPECTED_STRING_ERROR", "method \"{0}\" expected an object string argument");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_ARGUMENT_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_ARGUMENT_ERROR", "method \"{0}\" called with invalid argument");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_STYLE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_CSS_NAME_MAP_STYLE_ERROR", "Invalid CSS name map style {0}");

	static final com.google.javascript.jscomp.DiagnosticType TOO_MANY_ARGUMENTS_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_TOO_MANY_ARGUMENTS_ERROR", "method \"{0}\" called with more than one argument");

	static final com.google.javascript.jscomp.DiagnosticType DUPLICATE_NAMESPACE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_DUPLICATE_NAMESPACE_ERROR", "namespace \"{0}\" cannot be provided twice");

	static final com.google.javascript.jscomp.DiagnosticType FUNCTION_NAMESPACE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_FUNCTION_NAMESPACE_ERROR", "\"{0}\" cannot be both provided and declared as a function");

	static final com.google.javascript.jscomp.DiagnosticType MISSING_PROVIDE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_MISSING_PROVIDE_ERROR", "required \"{0}\" namespace never provided");

	static final com.google.javascript.jscomp.DiagnosticType LATE_PROVIDE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_LATE_PROVIDE_ERROR", "required \"{0}\" namespace not provided yet");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_PROVIDE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_PROVIDE_ERROR", "\"{0}\" is not a valid JS property name");

	static final com.google.javascript.jscomp.DiagnosticType XMODULE_REQUIRE_ERROR = com.google.javascript.jscomp.DiagnosticType.warning("JSC_XMODULE_REQUIRE_ERROR", ("namespace \"{0}\" provided in module {1} " + "but required in module {2}"));

	static final com.google.javascript.jscomp.DiagnosticType NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR", "goog.setCssNameMapping only takes an object literal with string values");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_CSS_RENAMING_MAP = com.google.javascript.jscomp.DiagnosticType.warning("INVALID_CSS_RENAMING_MAP", "Invalid entries in css renaming map: {0}");

	static final com.google.javascript.jscomp.DiagnosticType BASE_CLASS_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_BASE_CLASS_ERROR", "incorrect use of goog.base: {0}");

	static final java.lang.String GOOG = "goog";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.JSModuleGraph moduleGraph;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName> providedNames = com.google.common.collect.Maps.newTreeMap();

	private final java.util.List<com.google.javascript.jscomp.ProcessClosurePrimitives.UnrecognizedRequire> unrecognizedRequires = com.google.common.collect.Lists.newArrayList();

	private final java.util.Set<java.lang.String> exportedVariables = com.google.common.collect.Sets.newHashSet();

	private final com.google.javascript.jscomp.CheckLevel requiresLevel;

	private final boolean rewriteNewDateGoogNow;

	ProcessClosurePrimitives(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel requiresLevel, boolean rewriteNewDateGoogNow) {
		this.compiler = compiler;
		this.moduleGraph = compiler.getModuleGraph();
		this.requiresLevel = requiresLevel;
		this.rewriteNewDateGoogNow = rewriteNewDateGoogNow;
		providedNames.put(com.google.javascript.jscomp.ProcessClosurePrimitives.GOOG, new com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName(com.google.javascript.jscomp.ProcessClosurePrimitives.GOOG, null, null, false));
	}

	java.util.Set<java.lang.String> getExportedVariableNames() {
		return exportedVariables;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		new com.google.javascript.jscomp.NodeTraversal(compiler, com.google.javascript.jscomp.ProcessClosurePrimitives.this).traverse(root);
		for (com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName pn : providedNames.values()) {
			pn.replace();
		}
		if (requiresLevel.isOn()) {
			for (com.google.javascript.jscomp.ProcessClosurePrimitives.UnrecognizedRequire r : unrecognizedRequires) {
				com.google.javascript.jscomp.DiagnosticType error;
				com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName expectedName = providedNames.get(r.namespace);
				if ((expectedName != null) && ((expectedName.firstNode) != null)) {
					error = com.google.javascript.jscomp.ProcessClosurePrimitives.LATE_PROVIDE_ERROR;
				}else {
					error = com.google.javascript.jscomp.ProcessClosurePrimitives.MISSING_PROVIDE_ERROR;
				}
				compiler.report(com.google.javascript.jscomp.JSError.make(r.inputName, r.requireNode, requiresLevel, error, r.namespace));
			}
		}
	}

	@java.lang.Override
	public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.CALL :
				boolean isExpr = (parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT);
				com.google.javascript.rhino.Node left = n.getFirstChild();
				if ((left.getType()) == (com.google.javascript.rhino.Token.GETPROP)) {
					com.google.javascript.rhino.Node name = left.getFirstChild();
					if (((name.getType()) == (com.google.javascript.rhino.Token.NAME)) && (com.google.javascript.jscomp.ProcessClosurePrimitives.GOOG.equals(name.getString()))) {
						java.lang.String methodName = name.getNext().getString();
						if ("base".equals(methodName)) {
							processBaseClassCall(t, n);
						}else
							if (!isExpr) {
								break;
							}else
								if ("require".equals(methodName)) {
									processRequireCall(t, n, parent);
								}else
									if ("provide".equals(methodName)) {
										processProvideCall(t, n, parent);
									}else
										if ("exportSymbol".equals(methodName)) {
											com.google.javascript.rhino.Node arg = left.getNext();
											if ((arg.getType()) == (com.google.javascript.rhino.Token.STRING)) {
												int dot = arg.getString().indexOf('.');
												if (dot == (-1)) {
													exportedVariables.add(arg.getString());
												}else {
													exportedVariables.add(arg.getString().substring(0, dot));
												}
											}
										}else
											if ("addDependency".equals(methodName)) {
												com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
												java.util.List<java.lang.String> typeDecls = convention.identifyTypeDeclarationCall(n);
												if (typeDecls != null) {
													for (java.lang.String typeDecl : typeDecls) {
														compiler.getTypeRegistry().forwardDeclareType(typeDecl);
													}
												}
												parent.replaceChild(n, com.google.javascript.rhino.Node.newNumber(0));
												compiler.reportCodeChange();
											}else
												if ("setCssNameMapping".equals(methodName)) {
													processSetCssNameMapping(t, n, parent);
												}
											
										
									
								
							
						
					}
				}
				break;
			case com.google.javascript.rhino.Token.ASSIGN :
			case com.google.javascript.rhino.Token.NAME :
				handleCandidateProvideDefinition(t, n, parent);
				break;
			case com.google.javascript.rhino.Token.FUNCTION :
				if ((t.inGlobalScope()) && (!(com.google.javascript.jscomp.NodeUtil.isFunctionExpression(n)))) {
					java.lang.String name = n.getFirstChild().getString();
					com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName pn = providedNames.get(name);
					if (pn != null) {
						compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR, name));
					}
				}
				break;
			case com.google.javascript.rhino.Token.NEW :
				trySimplifyNewDate(t, n, parent);
				break;
			case com.google.javascript.rhino.Token.GETPROP :
				if (((((n.getFirstChild().getType()) == (com.google.javascript.rhino.Token.NAME)) && ((parent.getType()) != (com.google.javascript.rhino.Token.CALL))) && ((parent.getType()) != (com.google.javascript.rhino.Token.ASSIGN))) && ("goog.base".equals(n.getQualifiedName()))) {
					reportBadBaseClassUse(t, n, "May only be called directly.");
				}
				break;
		}
	}

	private void processRequireCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node arg = left.getNext();
		if (verifyArgument(t, left, arg)) {
			java.lang.String ns = arg.getString();
			com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName provided = providedNames.get(ns);
			if ((provided == null) || (!(provided.isExplicitlyProvided()))) {
				unrecognizedRequires.add(new com.google.javascript.jscomp.ProcessClosurePrimitives.UnrecognizedRequire(n, ns, t.getSourceName()));
			}else {
				com.google.javascript.jscomp.JSModule providedModule = provided.explicitModule;
				com.google.common.base.Preconditions.checkNotNull(providedModule);
				com.google.javascript.jscomp.JSModule module = t.getModule();
				if ((((moduleGraph) != null) && (module != providedModule)) && (!(moduleGraph.dependsOn(module, providedModule)))) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessClosurePrimitives.XMODULE_REQUIRE_ERROR, ns, providedModule.getName(), module.getName()));
				}
			}
			if ((provided != null) || (requiresLevel.isOn())) {
				parent.detachFromParent();
				compiler.reportCodeChange();
			}
		}
	}

	private void processProvideCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node arg = left.getNext();
		if (verifyProvide(t, left, arg)) {
			java.lang.String ns = arg.getString();
			if (providedNames.containsKey(ns)) {
				com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName previouslyProvided = providedNames.get(ns);
				if (!(previouslyProvided.isExplicitlyProvided())) {
					previouslyProvided.addProvide(parent, t.getModule(), true);
				}else {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR, ns));
				}
			}else {
				registerAnyProvidedPrefixes(ns, parent, t.getModule());
				providedNames.put(ns, new com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName(ns, parent, t.getModule(), true));
			}
		}
	}

	private void handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (t.inGlobalScope()) {
			java.lang.String name = null;
			if (((n.getType()) == (com.google.javascript.rhino.Token.NAME)) && ((parent.getType()) == (com.google.javascript.rhino.Token.VAR))) {
				name = n.getString();
			}else
				if (((n.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT))) {
					name = n.getFirstChild().getQualifiedName();
				}
			
			if (name != null) {
				if (parent.getBooleanProp(com.google.javascript.rhino.Node.IS_NAMESPACE)) {
					processProvideFromPreviousPass(t, name, parent);
				}else {
					com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName pn = providedNames.get(name);
					if (pn != null) {
						pn.addDefinition(parent, t.getModule());
					}
				}
			}
		}
	}

	private void processBaseClassCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node callee = n.getFirstChild();
		com.google.javascript.rhino.Node thisArg = callee.getNext();
		if ((thisArg == null) || ((thisArg.getType()) != (com.google.javascript.rhino.Token.THIS))) {
			reportBadBaseClassUse(t, n, "First argument must be 'this'.");
			return ;
		}
		com.google.javascript.rhino.Node enclosingFnNameNode = getEnclosingDeclNameNode(t);
		if (enclosingFnNameNode == null) {
			reportBadBaseClassUse(t, n, "Could not find enclosing method.");
			return ;
		}
		java.lang.String enclosingQname = enclosingFnNameNode.getQualifiedName();
		if ((enclosingQname.indexOf(".prototype.")) == (-1)) {
			com.google.javascript.rhino.Node enclosingParent = enclosingFnNameNode.getParent();
			com.google.javascript.rhino.Node maybeInheritsExpr = ((enclosingParent.getType()) == (com.google.javascript.rhino.Token.ASSIGN) ? enclosingParent.getParent() : enclosingParent).getNext();
			com.google.javascript.rhino.Node baseClassNode = null;
			if (((maybeInheritsExpr != null) && ((maybeInheritsExpr.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT))) && ((maybeInheritsExpr.getFirstChild().getType()) == (com.google.javascript.rhino.Token.CALL))) {
				com.google.javascript.rhino.Node callNode = maybeInheritsExpr.getFirstChild();
				if (("goog.inherits".equals(callNode.getFirstChild().getQualifiedName())) && (callNode.getLastChild().isQualifiedName())) {
					baseClassNode = callNode.getLastChild();
				}
			}
			if (baseClassNode == null) {
				reportBadBaseClassUse(t, n, "Could not find goog.inherits for base class");
				return ;
			}
			n.replaceChild(callee, com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), java.lang.String.format("%s.call", baseClassNode.getQualifiedName()), callee, "goog.base"));
			compiler.reportCodeChange();
		}else {
			com.google.javascript.rhino.Node methodNameNode = thisArg.getNext();
			if ((methodNameNode == null) || ((methodNameNode.getType()) != (com.google.javascript.rhino.Token.STRING))) {
				reportBadBaseClassUse(t, n, "Second argument must name a method.");
				return ;
			}
			java.lang.String methodName = methodNameNode.getString();
			java.lang.String ending = ".prototype." + methodName;
			if ((enclosingQname == null) || (!(enclosingQname.endsWith(ending)))) {
				reportBadBaseClassUse(t, n, ("Enclosing method does not match " + methodName));
				return ;
			}
			com.google.javascript.rhino.Node className = enclosingFnNameNode.getFirstChild().getFirstChild();
			n.replaceChild(callee, com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), java.lang.String.format("%s.superClass_.%s.call", className.getQualifiedName(), methodName), callee, "goog.base"));
			n.removeChild(methodNameNode);
			compiler.reportCodeChange();
		}
	}

	private com.google.javascript.rhino.Node getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.rhino.Node scopeRoot = t.getScopeRoot();
		if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(scopeRoot)) {
			return scopeRoot.getFirstChild();
		}else {
			com.google.javascript.rhino.Node parent = scopeRoot.getParent();
			if (parent != null) {
				if (((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) || (((parent.getLastChild()) == scopeRoot) && (parent.getFirstChild().isQualifiedName()))) {
					return parent.getFirstChild();
				}else
					if ((parent.getType()) == (com.google.javascript.rhino.Token.NAME)) {
						return parent;
					}
				
			}
		}
		return null;
	}

	private void reportBadBaseClassUse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, java.lang.String extraMessage) {
		compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessClosurePrimitives.BASE_CLASS_ERROR, extraMessage));
	}

	private void processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal t, java.lang.String name, com.google.javascript.rhino.Node parent) {
		if (!(providedNames.containsKey(name))) {
			com.google.javascript.rhino.Node expr = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT);
			expr.copyInformationFromForTree(parent);
			parent.getParent().addChildBefore(expr, parent);
			compiler.reportCodeChange();
			com.google.javascript.jscomp.JSModule module = t.getModule();
			registerAnyProvidedPrefixes(name, expr, module);
			com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName provided = new com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName(name, expr, module, true);
			providedNames.put(name, provided);
			provided.addDefinition(parent, module);
		}else {
			if (com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(parent)) {
				parent.getParent().removeChild(parent);
				compiler.reportCodeChange();
			}
		}
	}

	private void processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		com.google.javascript.rhino.Node left = n.getFirstChild();
		com.google.javascript.rhino.Node arg = left.getNext();
		if (verifySetCssNameMapping(t, left, arg)) {
			final java.util.Map<java.lang.String, java.lang.String> cssNames = com.google.common.collect.Maps.newHashMap();
			for (com.google.javascript.rhino.Node key = arg.getFirstChild(); key != null; key = key.getNext()) {
				com.google.javascript.rhino.Node value = key.getFirstChild();
				if ((((key.getType()) != (com.google.javascript.rhino.Token.STRING)) || (value == null)) || ((value.getType()) != (com.google.javascript.rhino.Token.STRING))) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessClosurePrimitives.NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR));
					return ;
				}
				cssNames.put(key.getString(), value.getString());
			}
			java.lang.String styleStr = "BY_PART";
			if ((arg.getNext()) != null) {
				styleStr = arg.getNext().getString();
			}
			final com.google.javascript.jscomp.CssRenamingMap.Style style;
			try {
				style = com.google.javascript.jscomp.CssRenamingMap.Style.valueOf(styleStr);
			} catch (java.lang.IllegalArgumentException e) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_STYLE_ERROR, styleStr));
				return ;
			}
			if (style == (com.google.javascript.jscomp.CssRenamingMap.Style.BY_PART)) {
				java.util.List<java.lang.String> errors = com.google.common.collect.Lists.newArrayList();
				for (java.lang.String key : cssNames.keySet()) {
					if (key.contains("-")) {
						errors.add(key);
					}
				}
				if ((errors.size()) != 0) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP, errors.toString()));
				}
			}else
				if (style == (com.google.javascript.jscomp.CssRenamingMap.Style.BY_WHOLE)) {
					java.util.List<java.lang.String> errors = com.google.common.collect.Lists.newArrayList();
					for (java.util.Map.Entry<java.lang.String, java.lang.String> b : cssNames.entrySet()) {
						if ((b.getKey().length()) > 10)
							continue;
						
						for (java.util.Map.Entry<java.lang.String, java.lang.String> a : cssNames.entrySet()) {
							java.lang.String combined = cssNames.get((((a.getKey()) + "-") + (b.getKey())));
							if ((combined != null) && (!(combined.equals((((a.getValue()) + "-") + (b.getValue())))))) {
								errors.add((((((((("map(" + (a.getKey())) + "-") + (b.getKey())) + ") != map(") + (a.getKey())) + ")-map(") + (b.getKey())) + ")"));
							}
						}
					}
					if ((errors.size()) != 0) {
						compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP, errors.toString()));
					}
				}
			
			com.google.javascript.jscomp.CssRenamingMap cssRenamingMap = new com.google.javascript.jscomp.CssRenamingMap() {
				public java.lang.String get(java.lang.String value) {
					if (cssNames.containsKey(value)) {
						return cssNames.get(value);
					}else {
						return value;
					}
				}

				public com.google.javascript.jscomp.CssRenamingMap.Style getStyle() {
					return style;
				}
			};
			compiler.setCssRenamingMap(cssRenamingMap);
			parent.getParent().removeChild(parent);
			compiler.reportCodeChange();
		}
	}

	private void trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (!(rewriteNewDateGoogNow)) {
			return ;
		}
		com.google.common.base.Preconditions.checkArgument(((n.getType()) == (com.google.javascript.rhino.Token.NEW)));
		com.google.javascript.rhino.Node date = n.getFirstChild();
		if ((!(com.google.javascript.jscomp.NodeUtil.isName(date))) || (!("Date".equals(date.getString())))) {
			return ;
		}
		com.google.javascript.rhino.Node callGoogNow = date.getNext();
		if (((callGoogNow == null) || (!(com.google.javascript.jscomp.NodeUtil.isCall(callGoogNow)))) || ((callGoogNow.getNext()) != null)) {
			return ;
		}
		com.google.javascript.rhino.Node googNow = callGoogNow.getFirstChild();
		java.lang.String googNowQName = googNow.getQualifiedName();
		if (((googNowQName == null) || (!("goog.now".equals(googNowQName)))) || ((googNow.getNext()) != null)) {
			return ;
		}
		n.removeChild(callGoogNow);
		compiler.reportCodeChange();
	}

	private boolean verifyProvide(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node methodName, com.google.javascript.rhino.Node arg) {
		if (!(verifyArgument(t, methodName, arg))) {
			return false;
		}
		for (java.lang.String part : arg.getString().split("\\.")) {
			if (!(com.google.javascript.jscomp.NodeUtil.isValidPropertyName(part))) {
				compiler.report(t.makeError(arg, com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_PROVIDE_ERROR, part));
				return false;
			}
		}
		return true;
	}

	private boolean verifyArgument(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node methodName, com.google.javascript.rhino.Node arg) {
		return verifyArgument(t, methodName, arg, com.google.javascript.rhino.Token.STRING);
	}

	private boolean verifyArgument(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node methodName, com.google.javascript.rhino.Node arg, int desiredType) {
		com.google.javascript.jscomp.DiagnosticType diagnostic = null;
		if (arg == null) {
			diagnostic = com.google.javascript.jscomp.ProcessClosurePrimitives.NULL_ARGUMENT_ERROR;
		}else
			if ((arg.getType()) != desiredType) {
				diagnostic = com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR;
			}else
				if ((arg.getNext()) != null) {
					diagnostic = com.google.javascript.jscomp.ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR;
				}
			
		
		if (diagnostic != null) {
			compiler.report(t.makeError(methodName, diagnostic, methodName.getQualifiedName()));
			return false;
		}
		return true;
	}

	private boolean verifySetCssNameMapping(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node methodName, com.google.javascript.rhino.Node firstArg) {
		com.google.javascript.jscomp.DiagnosticType diagnostic = null;
		if (firstArg == null) {
			diagnostic = com.google.javascript.jscomp.ProcessClosurePrimitives.NULL_ARGUMENT_ERROR;
		}else
			if ((firstArg.getType()) != (com.google.javascript.rhino.Token.OBJECTLIT)) {
				diagnostic = com.google.javascript.jscomp.ProcessClosurePrimitives.EXPECTED_OBJECTLIT_ERROR;
			}else
				if ((firstArg.getNext()) != null) {
					com.google.javascript.rhino.Node secondArg = firstArg.getNext();
					if ((secondArg.getType()) != (com.google.javascript.rhino.Token.STRING)) {
						diagnostic = com.google.javascript.jscomp.ProcessClosurePrimitives.EXPECTED_STRING_ERROR;
					}else
						if ((secondArg.getNext()) != null) {
							diagnostic = com.google.javascript.jscomp.ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR;
						}
					
				}
			
		
		if (diagnostic != null) {
			compiler.report(t.makeError(methodName, diagnostic, methodName.getQualifiedName()));
			return false;
		}
		return true;
	}

	private void registerAnyProvidedPrefixes(java.lang.String ns, com.google.javascript.rhino.Node node, com.google.javascript.jscomp.JSModule module) {
		int pos = ns.indexOf('.');
		while (pos != (-1)) {
			java.lang.String prefixNs = ns.substring(0, pos);
			pos = ns.indexOf('.', (pos + 1));
			if (providedNames.containsKey(prefixNs)) {
				providedNames.get(prefixNs).addProvide(node, module, false);
			}else {
				providedNames.put(prefixNs, new com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName(prefixNs, node, module, false));
			}
		} 
	}

	private class ProvidedName {
		private final java.lang.String namespace;

		private final com.google.javascript.rhino.Node firstNode;

		private final com.google.javascript.jscomp.JSModule firstModule;

		private com.google.javascript.rhino.Node explicitNode = null;

		private com.google.javascript.jscomp.JSModule explicitModule = null;

		private com.google.javascript.rhino.Node candidateDefinition = null;

		private com.google.javascript.jscomp.JSModule minimumModule = null;

		private com.google.javascript.rhino.Node replacementNode = null;

		ProvidedName(java.lang.String namespace, com.google.javascript.rhino.Node node, com.google.javascript.jscomp.JSModule module, boolean explicit) {
			com.google.common.base.Preconditions.checkArgument(((node == null) || (com.google.javascript.jscomp.NodeUtil.isExpressionNode(node))));
			this.namespace = namespace;
			this.firstNode = node;
			this.firstModule = module;
			addProvide(node, module, explicit);
		}

		void addProvide(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.JSModule module, boolean explicit) {
			if (explicit) {
				com.google.common.base.Preconditions.checkState(((explicitNode) == null));
				com.google.common.base.Preconditions.checkArgument(com.google.javascript.jscomp.NodeUtil.isExpressionNode(node));
				explicitNode = node;
				explicitModule = module;
			}
			updateMinimumModule(module);
		}

		boolean isExplicitlyProvided() {
			return (explicitNode) != null;
		}

		void addDefinition(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.JSModule module) {
			com.google.common.base.Preconditions.checkArgument((((com.google.javascript.jscomp.NodeUtil.isExpressionNode(node)) || (com.google.javascript.jscomp.NodeUtil.isFunction(node))) || (com.google.javascript.jscomp.NodeUtil.isVar(node))));
			com.google.common.base.Preconditions.checkArgument(((explicitNode) != node));
			if (((candidateDefinition) == null) || (!(com.google.javascript.jscomp.NodeUtil.isExpressionNode(node)))) {
				candidateDefinition = node;
				updateMinimumModule(module);
			}
		}

		private void updateMinimumModule(com.google.javascript.jscomp.JSModule newModule) {
			if ((minimumModule) == null) {
				minimumModule = newModule;
			}else
				if ((moduleGraph) != null) {
					minimumModule = moduleGraph.getDeepestCommonDependencyInclusive(minimumModule, newModule);
				}else {
					com.google.common.base.Preconditions.checkState((newModule == (minimumModule)), "Missing module graph");
				}
			
		}

		void replace() {
			if ((firstNode) == null) {
				replacementNode = candidateDefinition;
				return ;
			}
			if (((candidateDefinition) != null) && ((explicitNode) != null)) {
				explicitNode.detachFromParent();
				compiler.reportCodeChange();
				replacementNode = candidateDefinition;
				if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(candidateDefinition)) {
					candidateDefinition.putBooleanProp(com.google.javascript.rhino.Node.IS_NAMESPACE, true);
					com.google.javascript.rhino.Node assignNode = candidateDefinition.getFirstChild();
					com.google.javascript.rhino.Node nameNode = assignNode.getFirstChild();
					if ((nameNode.getType()) == (com.google.javascript.rhino.Token.NAME)) {
						com.google.javascript.rhino.Node valueNode = nameNode.getNext();
						assignNode.removeChild(nameNode);
						assignNode.removeChild(valueNode);
						nameNode.addChildToFront(valueNode);
						com.google.javascript.rhino.Node varNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, nameNode);
						varNode.copyInformationFrom(candidateDefinition);
						candidateDefinition.getParent().replaceChild(candidateDefinition, varNode);
						nameNode.setJSDocInfo(assignNode.getJSDocInfo());
						compiler.reportCodeChange();
						replacementNode = varNode;
					}
				}
			}else {
				replacementNode = createDeclarationNode();
				if ((firstModule) == (minimumModule)) {
					firstNode.getParent().addChildBefore(replacementNode, firstNode);
				}else {
					int indexOfDot = namespace.lastIndexOf('.');
					if (indexOfDot == (-1)) {
						compiler.getNodeForCodeInsertion(minimumModule).addChildToBack(replacementNode);
					}else {
						com.google.javascript.jscomp.ProcessClosurePrimitives.ProvidedName parentName = providedNames.get(namespace.substring(0, indexOfDot));
						com.google.common.base.Preconditions.checkNotNull(parentName);
						com.google.common.base.Preconditions.checkNotNull(parentName.replacementNode);
						parentName.replacementNode.getParent().addChildAfter(replacementNode, parentName.replacementNode);
					}
				}
				if ((explicitNode) != null) {
					explicitNode.detachFromParent();
				}
				compiler.reportCodeChange();
			}
		}

		private com.google.javascript.rhino.Node createDeclarationNode() {
			if ((namespace.indexOf('.')) == (-1)) {
				return makeVarDeclNode();
			}else {
				return makeAssignmentExprNode();
			}
		}

		private com.google.javascript.rhino.Node makeVarDeclNode() {
			com.google.javascript.rhino.Node name = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, namespace);
			name.addChildToFront(createNamespaceLiteral());
			com.google.javascript.rhino.Node decl = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR, name);
			decl.putBooleanProp(com.google.javascript.rhino.Node.IS_NAMESPACE, true);
			if (compiler.getCodingConvention().isConstant(namespace)) {
				name.putBooleanProp(com.google.javascript.rhino.Node.IS_CONSTANT_NAME, true);
			}
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(decl));
			setSourceInfo(decl);
			return decl;
		}

		private com.google.javascript.rhino.Node createNamespaceLiteral() {
			com.google.javascript.rhino.Node objlit = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.OBJECTLIT);
			objlit.setJSType(compiler.getTypeRegistry().createAnonymousObjectType());
			return objlit;
		}

		private com.google.javascript.rhino.Node makeAssignmentExprNode() {
			com.google.javascript.rhino.Node decl = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), namespace, firstNode, namespace), createNamespaceLiteral()));
			decl.putBooleanProp(com.google.javascript.rhino.Node.IS_NAMESPACE, true);
			com.google.common.base.Preconditions.checkState(com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(decl));
			setSourceInfo(decl);
			return decl;
		}

		private void setSourceInfo(com.google.javascript.rhino.Node newNode) {
			com.google.javascript.rhino.Node provideStringNode = getProvideStringNode();
			int offset = getSourceInfoOffset(provideStringNode);
			com.google.javascript.rhino.Node sourceInfoNode = provideStringNode == null ? firstNode : provideStringNode;
			newNode.copyInformationFromForTree(sourceInfoNode);
			if (offset != 0) {
				newNode.setSourcePositionForTree(((newNode.getSourcePosition()) + offset));
			}
		}

		private int getSourceInfoOffset(com.google.javascript.rhino.Node provideStringNode) {
			if (provideStringNode == null) {
				return 0;
			}
			int indexOfLastDot = namespace.lastIndexOf('.');
			return 2 + indexOfLastDot;
		}

		private com.google.javascript.rhino.Node getProvideStringNode() {
			return ((firstNode.getFirstChild()) != null) && (com.google.javascript.jscomp.NodeUtil.isExprCall(firstNode)) ? firstNode.getFirstChild().getLastChild() : null;
		}
	}

	private static boolean isNamespacePlaceholder(com.google.javascript.rhino.Node n) {
		if (!(n.getBooleanProp(com.google.javascript.rhino.Node.IS_NAMESPACE))) {
			return false;
		}
		com.google.javascript.rhino.Node value = null;
		if ((n.getType()) == (com.google.javascript.rhino.Token.EXPR_RESULT)) {
			com.google.javascript.rhino.Node assign = n.getFirstChild();
			value = assign.getLastChild();
		}else
			if ((n.getType()) == (com.google.javascript.rhino.Token.VAR)) {
				com.google.javascript.rhino.Node name = n.getFirstChild();
				value = name.getFirstChild();
			}
		
		return ((value != null) && ((value.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT))) && (!(value.hasChildren()));
	}

	private class UnrecognizedRequire {
		final com.google.javascript.rhino.Node requireNode;

		final java.lang.String namespace;

		final java.lang.String inputName;

		UnrecognizedRequire(com.google.javascript.rhino.Node requireNode, java.lang.String namespace, java.lang.String inputName) {
			this.requireNode = requireNode;
			this.namespace = namespace;
			this.inputName = inputName;
		}
	}
}

