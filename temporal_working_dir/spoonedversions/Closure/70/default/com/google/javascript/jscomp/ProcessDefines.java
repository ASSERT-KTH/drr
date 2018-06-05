

package com.google.javascript.jscomp;


class ProcessDefines implements com.google.javascript.jscomp.CompilerPass {
	private static final java.util.Set<java.lang.String> KNOWN_DEFINES = com.google.common.collect.Sets.newHashSet("COMPILED");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<java.lang.String, com.google.javascript.rhino.Node> dominantReplacements;

	private com.google.javascript.jscomp.GlobalNamespace namespace = null;

	static final com.google.javascript.jscomp.DiagnosticType UNKNOWN_DEFINE_WARNING = com.google.javascript.jscomp.DiagnosticType.warning("JSC_UNKNOWN_DEFINE_WARNING", "unknown @define variable {0}");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_DEFINE_TYPE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_DEFINE_INIT_ERROR", "@define tag only permits literal types");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_DEFINE_INIT_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_DEFINE_INIT_ERROR", "illegal initialization of @define variable {0}");

	static final com.google.javascript.jscomp.DiagnosticType NON_GLOBAL_DEFINE_INIT_ERROR = com.google.javascript.jscomp.DiagnosticType.error("JSC_NON_GLOBAL_DEFINE_INIT_ERROR", "@define variable {0} assignment must be global");

	static final com.google.javascript.jscomp.DiagnosticType DEFINE_NOT_ASSIGNABLE_ERROR = com.google.javascript.jscomp.DiagnosticType.error("@define variable cannot be assigned here", "@define variable {0} cannot be assigned due to unsafe code at {1}.");

	private static final java.text.MessageFormat REASON_DEFINE_NOT_ASSIGNABLE = new java.text.MessageFormat("line {0} of {1}");

	ProcessDefines(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.Map<java.lang.String, com.google.javascript.rhino.Node> replacements) {
		this.compiler = compiler;
		dominantReplacements = replacements;
	}

	com.google.javascript.jscomp.ProcessDefines injectNamespace(com.google.javascript.jscomp.GlobalNamespace namespace) {
		com.google.javascript.jscomp.ProcessDefines.this.namespace = namespace;
		return com.google.javascript.jscomp.ProcessDefines.this;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		if ((namespace) == null) {
			namespace = new com.google.javascript.jscomp.GlobalNamespace(compiler, root);
		}
		overrideDefines(collectDefines(root, namespace));
	}

	private void overrideDefines(java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessDefines.DefineInfo> allDefines) {
		boolean changed = false;
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.ProcessDefines.DefineInfo> def : allDefines.entrySet()) {
			java.lang.String defineName = def.getKey();
			com.google.javascript.jscomp.ProcessDefines.DefineInfo info = def.getValue();
			com.google.javascript.rhino.Node inputValue = dominantReplacements.get(defineName);
			com.google.javascript.rhino.Node finalValue = inputValue != null ? inputValue : info.getLastValue();
			if (finalValue != (info.initialValue)) {
				info.initialValueParent.replaceChild(info.initialValue, finalValue.cloneTree());
				compiler.addToDebugLog(("Overriding @define variable " + defineName));
				changed = (changed || ((finalValue.getType()) != (info.initialValue.getType()))) || (!(finalValue.isEquivalentTo(info.initialValue)));
			}
		}
		if (changed) {
			compiler.reportCodeChange();
		}
		java.util.Set<java.lang.String> unusedReplacements = dominantReplacements.keySet();
		unusedReplacements.removeAll(allDefines.keySet());
		unusedReplacements.removeAll(com.google.javascript.jscomp.ProcessDefines.KNOWN_DEFINES);
		for (java.lang.String unknownDefine : unusedReplacements) {
			compiler.report(com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.ProcessDefines.UNKNOWN_DEFINE_WARNING, unknownDefine));
		}
	}

	private static java.lang.String format(java.text.MessageFormat format, java.lang.Object... params) {
		return format.format(params);
	}

	private boolean isValidDefineType(com.google.javascript.rhino.JSTypeExpression expression) {
		com.google.javascript.rhino.jstype.JSType type = expression.evaluate(null, compiler.getTypeRegistry());
		return (!(type.isUnknownType())) && (type.isSubtype(compiler.getTypeRegistry().getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_STRING_BOOLEAN)));
	}

	private java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessDefines.DefineInfo> collectDefines(com.google.javascript.rhino.Node root, com.google.javascript.jscomp.GlobalNamespace namespace) {
		java.util.List<com.google.javascript.jscomp.GlobalNamespace.Name> allDefines = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.jscomp.GlobalNamespace.Name name : namespace.getNameIndex().values()) {
			if (((name.docInfo) != null) && (name.docInfo.isDefine())) {
				if (isValidDefineType(name.docInfo.getType())) {
					allDefines.add(name);
				}else {
					com.google.javascript.jscomp.JSError error = com.google.javascript.jscomp.JSError.make(name.declaration.getSourceName(), name.declaration.node, com.google.javascript.jscomp.ProcessDefines.INVALID_DEFINE_TYPE_ERROR);
					compiler.report(error);
				}
			}else {
				for (com.google.javascript.jscomp.GlobalNamespace.Ref ref : name.getRefs()) {
					if (ref == (name.declaration)) {
						continue;
					}
					com.google.javascript.rhino.Node n = ref.node;
					com.google.javascript.rhino.Node parent = ref.node.getParent();
					com.google.javascript.rhino.JSDocInfo info = n.getJSDocInfo();
					if (((info == null) && ((parent.getType()) == (com.google.javascript.rhino.Token.VAR))) && (parent.hasOneChild())) {
						info = parent.getJSDocInfo();
					}
					if ((info != null) && (info.isDefine())) {
						allDefines.add(name);
						break;
					}
				}
			}
		}
		com.google.javascript.jscomp.ProcessDefines.CollectDefines pass = new com.google.javascript.jscomp.ProcessDefines.CollectDefines(compiler, allDefines);
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, pass);
		return pass.getAllDefines();
	}

	private static final class CollectDefines implements com.google.javascript.jscomp.NodeTraversal.Callback {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		private final java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessDefines.DefineInfo> assignableDefines;

		private final java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessDefines.DefineInfo> allDefines;

		private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.ProcessDefines.CollectDefines.RefInfo> allRefInfo;

		private com.google.javascript.rhino.Node lvalueToRemoveLater = null;

		private final java.util.Deque<java.lang.Integer> assignAllowed;

		CollectDefines(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.List<com.google.javascript.jscomp.GlobalNamespace.Name> listOfDefines) {
			this.compiler = compiler;
			this.allDefines = com.google.common.collect.Maps.newHashMap();
			assignableDefines = com.google.common.collect.Maps.newHashMap();
			assignAllowed = new java.util.ArrayDeque<java.lang.Integer>();
			assignAllowed.push(1);
			allRefInfo = com.google.common.collect.Maps.newHashMap();
			for (com.google.javascript.jscomp.GlobalNamespace.Name name : listOfDefines) {
				if ((name.declaration) != null) {
					allRefInfo.put(name.declaration.node, new com.google.javascript.jscomp.ProcessDefines.CollectDefines.RefInfo(name.declaration, name));
				}
				for (com.google.javascript.jscomp.GlobalNamespace.Ref ref : name.getRefs()) {
					if (ref == (name.declaration)) {
						continue;
					}
					if (((ref.getTwin()) == null) || (!(ref.getTwin().isSet()))) {
						allRefInfo.put(ref.node, new com.google.javascript.jscomp.ProcessDefines.CollectDefines.RefInfo(ref, name));
					}
				}
			}
		}

		java.util.Map<java.lang.String, com.google.javascript.jscomp.ProcessDefines.DefineInfo> getAllDefines() {
			return allDefines;
		}

		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			updateAssignAllowedStack(n, true);
			return true;
		}

		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.jscomp.ProcessDefines.CollectDefines.RefInfo refInfo = allRefInfo.get(n);
			if (refInfo != null) {
				com.google.javascript.jscomp.GlobalNamespace.Ref ref = refInfo.ref;
				com.google.javascript.jscomp.GlobalNamespace.Name name = refInfo.name;
				java.lang.String fullName = name.fullName();
				switch (ref.type) {
					case SET_FROM_GLOBAL :
					case SET_FROM_LOCAL :
						com.google.javascript.rhino.Node valParent = com.google.javascript.jscomp.ProcessDefines.CollectDefines.getValueParent(ref);
						com.google.javascript.rhino.Node val = valParent.getLastChild();
						if ((((valParent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && (name.isSimpleName())) && ((name.declaration) == ref)) {
							compiler.report(t.makeError(val, com.google.javascript.jscomp.ProcessDefines.INVALID_DEFINE_INIT_ERROR, fullName));
						}else
							if (processDefineAssignment(t, fullName, val, valParent)) {
								refInfo.name.removeRef(ref);
								lvalueToRemoveLater = valParent;
							}
						
						break;
					default :
						if (t.inGlobalScope()) {
							com.google.javascript.jscomp.ProcessDefines.DefineInfo info = assignableDefines.get(fullName);
							if (info != null) {
								setDefineInfoNotAssignable(info, t);
								assignableDefines.remove(fullName);
							}
						}
						break;
				}
			}
			if (((!(t.inGlobalScope())) && ((n.getJSDocInfo()) != null)) && (n.getJSDocInfo().isDefine())) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR, ""));
			}
			if ((lvalueToRemoveLater) == n) {
				lvalueToRemoveLater = null;
				if ((n.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) {
					com.google.javascript.rhino.Node last = n.getLastChild();
					n.removeChild(last);
					parent.replaceChild(n, last);
				}else {
					com.google.common.base.Preconditions.checkState(((n.getType()) == (com.google.javascript.rhino.Token.NAME)));
					n.removeChild(n.getFirstChild());
				}
				compiler.reportCodeChange();
			}
			if ((n.getType()) == (com.google.javascript.rhino.Token.CALL)) {
				if (t.inGlobalScope()) {
					for (com.google.javascript.jscomp.ProcessDefines.DefineInfo info : assignableDefines.values()) {
						setDefineInfoNotAssignable(info, t);
					}
					assignableDefines.clear();
				}
			}
			updateAssignAllowedStack(n, false);
		}

		private void updateAssignAllowedStack(com.google.javascript.rhino.Node n, boolean entering) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.CASE :
				case com.google.javascript.rhino.Token.FOR :
				case com.google.javascript.rhino.Token.FUNCTION :
				case com.google.javascript.rhino.Token.HOOK :
				case com.google.javascript.rhino.Token.IF :
				case com.google.javascript.rhino.Token.SWITCH :
				case com.google.javascript.rhino.Token.WHILE :
					if (entering) {
						assignAllowed.push(0);
					}else {
						assignAllowed.remove();
					}
					break;
			}
		}

		private boolean isAssignAllowed() {
			return (assignAllowed.element()) == 1;
		}

		private boolean processDefineAssignment(com.google.javascript.jscomp.NodeTraversal t, java.lang.String name, com.google.javascript.rhino.Node value, com.google.javascript.rhino.Node valueParent) {
			if ((value == null) || (!(com.google.javascript.jscomp.NodeUtil.isValidDefineValue(value, allDefines.keySet())))) {
				compiler.report(t.makeError(value, com.google.javascript.jscomp.ProcessDefines.INVALID_DEFINE_INIT_ERROR, name));
			}else
				if (!(isAssignAllowed())) {
					compiler.report(t.makeError(valueParent, com.google.javascript.jscomp.ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR, name));
				}else {
					com.google.javascript.jscomp.ProcessDefines.DefineInfo info = allDefines.get(name);
					if (info == null) {
						info = new com.google.javascript.jscomp.ProcessDefines.DefineInfo(value, valueParent);
						allDefines.put(name, info);
						assignableDefines.put(name, info);
					}else
						if (info.recordAssignment(value)) {
							return true;
						}else {
							compiler.report(t.makeError(valueParent, com.google.javascript.jscomp.ProcessDefines.DEFINE_NOT_ASSIGNABLE_ERROR, name, info.getReasonWhyNotAssignable()));
						}
					
				}
			
			return false;
		}

		private static com.google.javascript.rhino.Node getValueParent(com.google.javascript.jscomp.GlobalNamespace.Ref ref) {
			return ((ref.node.getParent()) != null) && ((ref.node.getParent().getType()) == (com.google.javascript.rhino.Token.VAR)) ? ref.node : ref.node.getParent();
		}

		private void setDefineInfoNotAssignable(com.google.javascript.jscomp.ProcessDefines.DefineInfo info, com.google.javascript.jscomp.NodeTraversal t) {
			info.setNotAssignable(com.google.javascript.jscomp.ProcessDefines.format(com.google.javascript.jscomp.ProcessDefines.REASON_DEFINE_NOT_ASSIGNABLE, t.getLineNumber(), t.getSourceName()));
		}

		private static class RefInfo {
			final com.google.javascript.jscomp.GlobalNamespace.Ref ref;

			final com.google.javascript.jscomp.GlobalNamespace.Name name;

			RefInfo(com.google.javascript.jscomp.GlobalNamespace.Ref ref, com.google.javascript.jscomp.GlobalNamespace.Name name) {
				this.ref = ref;
				this.name = name;
			}
		}
	}

	private static final class DefineInfo {
		public final com.google.javascript.rhino.Node initialValueParent;

		public final com.google.javascript.rhino.Node initialValue;

		private com.google.javascript.rhino.Node lastValue;

		private boolean isAssignable;

		private java.lang.String reasonNotAssignable;

		public DefineInfo(com.google.javascript.rhino.Node initialValue, com.google.javascript.rhino.Node initialValueParent) {
			this.initialValueParent = initialValueParent;
			this.initialValue = initialValue;
			lastValue = initialValue;
			isAssignable = true;
		}

		public void setNotAssignable(java.lang.String reason) {
			isAssignable = false;
			reasonNotAssignable = reason;
		}

		public java.lang.String getReasonWhyNotAssignable() {
			return reasonNotAssignable;
		}

		public boolean recordAssignment(com.google.javascript.rhino.Node value) {
			lastValue = value;
			return isAssignable;
		}

		public com.google.javascript.rhino.Node getLastValue() {
			return lastValue;
		}
	}
}

