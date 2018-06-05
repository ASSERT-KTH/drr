

package com.google.javascript.jscomp;


public class ProcessCommonJSModules implements com.google.javascript.jscomp.CompilerPass {
	private static final java.lang.String MODULE_SLASH = "/";

	public static final java.lang.String DEFAULT_FILENAME_PREFIX = "." + (com.google.javascript.jscomp.ProcessCommonJSModules.MODULE_SLASH);

	private static final java.lang.String MODULE_NAME_SEPARATOR = "\\$";

	private static final java.lang.String MODULE_NAME_PREFIX = "module$";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.lang.String filenamePrefix;

	private final boolean reportDependencies;

	private com.google.javascript.jscomp.JSModule module;

	ProcessCommonJSModules(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String filenamePrefix) {
		this(compiler, filenamePrefix, true);
	}

	ProcessCommonJSModules(com.google.javascript.jscomp.AbstractCompiler compiler, java.lang.String filenamePrefix, boolean reportDependencies) {
		this.compiler = compiler;
		this.filenamePrefix = (filenamePrefix.endsWith(com.google.javascript.jscomp.ProcessCommonJSModules.MODULE_SLASH)) ? filenamePrefix : filenamePrefix + (com.google.javascript.jscomp.ProcessCommonJSModules.MODULE_SLASH);
		this.reportDependencies = reportDependencies;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ProcessCommonJSModules.ProcessCommonJsModulesCallback());
	}

	java.lang.String guessCJSModuleName(java.lang.String filename) {
		return com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(normalizeSourceName(filename));
	}

	com.google.javascript.jscomp.JSModule getModule() {
		return module;
	}

	public static java.lang.String toModuleName(java.lang.String filename) {
		return (com.google.javascript.jscomp.ProcessCommonJSModules.MODULE_NAME_PREFIX) + (filename.replaceAll(("^\\." + (java.util.regex.Pattern.quote(com.google.javascript.jscomp.ProcessCommonJSModules.MODULE_SLASH))), "").replaceAll(java.util.regex.Pattern.quote(com.google.javascript.jscomp.ProcessCommonJSModules.MODULE_SLASH), com.google.javascript.jscomp.ProcessCommonJSModules.MODULE_NAME_SEPARATOR).replaceAll("\\.js$", "").replaceAll("-", "_"));
	}

	public static java.lang.String toModuleName(java.lang.String requiredFilename, java.lang.String currentFilename) {
		requiredFilename = requiredFilename.replaceAll("\\.js$", "");
		currentFilename = currentFilename.replaceAll("\\.js$", "");
		if ((requiredFilename.startsWith(("." + (com.google.javascript.jscomp.ProcessCommonJSModules.MODULE_SLASH)))) || (requiredFilename.startsWith((".." + (com.google.javascript.jscomp.ProcessCommonJSModules.MODULE_SLASH))))) {
			try {
				requiredFilename = new java.net.URI(currentFilename).resolve(new java.net.URI(requiredFilename)).toString();
			} catch (java.net.URISyntaxException e) {
				throw new java.lang.RuntimeException(e);
			}
		}
		return com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(requiredFilename);
	}

	private java.lang.String normalizeSourceName(java.lang.String filename) {
		if ((filename.indexOf(filenamePrefix)) == 0) {
			filename = filename.substring(filenamePrefix.length());
		}
		return filename;
	}

	private class ProcessCommonJsModulesCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private int scriptNodeCount = 0;

		private java.util.Set<java.lang.String> modulesWithExports = com.google.common.collect.Sets.newHashSet();

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((((n.isCall()) && ((n.getChildCount()) == 2)) && ("require".equals(n.getFirstChild().getQualifiedName()))) && (n.getChildAtIndex(1).isString())) {
				visitRequireCall(t, n, parent);
			}
			if (n.isScript()) {
				(scriptNodeCount)++;
				visitScript(t, n);
			}
			if ((n.isGetProp()) && ("module.exports".equals(n.getQualifiedName()))) {
				visitModuleExports(n);
			}
		}

		private void visitRequireCall(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node require, com.google.javascript.rhino.Node parent) {
			java.lang.String moduleName = com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(require.getChildAtIndex(1).getString(), normalizeSourceName(t.getSourceName()));
			com.google.javascript.rhino.Node moduleRef = com.google.javascript.rhino.IR.name(moduleName).srcref(require);
			parent.replaceChild(require, moduleRef);
			com.google.javascript.rhino.Node script = getCurrentScriptNode(parent);
			if (reportDependencies) {
				t.getInput().addRequire(moduleName);
			}
			script.addChildToFront(com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.call(com.google.javascript.rhino.IR.getprop(com.google.javascript.rhino.IR.name("goog"), com.google.javascript.rhino.IR.string("require")), com.google.javascript.rhino.IR.string(moduleName))).copyInformationFromForTree(require));
			compiler.reportCodeChange();
		}

		private void visitScript(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node script) {
			com.google.common.base.Preconditions.checkArgument(((scriptNodeCount) == 1), ("ProcessCommonJSModules supports only one invocation per " + "CompilerInput / script node"));
			java.lang.String moduleName = guessCJSModuleName(normalizeSourceName(script.getSourceFileName()));
			script.addChildToFront(com.google.javascript.rhino.IR.var(com.google.javascript.rhino.IR.name(moduleName), com.google.javascript.rhino.IR.objectlit()).copyInformationFromForTree(script));
			if (reportDependencies) {
				com.google.javascript.jscomp.CompilerInput ci = t.getInput();
				ci.addProvide(moduleName);
				com.google.javascript.jscomp.JSModule m = new com.google.javascript.jscomp.JSModule(moduleName);
				m.addAndOverrideModule(ci);
				module = m;
			}
			script.addChildToFront(com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.call(com.google.javascript.rhino.IR.getprop(com.google.javascript.rhino.IR.name("goog"), com.google.javascript.rhino.IR.string("provide")), com.google.javascript.rhino.IR.string(moduleName))).copyInformationFromForTree(script));
			emitOptionalModuleExportsOverride(script, moduleName);
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, script, new com.google.javascript.jscomp.ProcessCommonJSModules.SuffixVarsCallback(moduleName));
			compiler.reportCodeChange();
		}

		private void emitOptionalModuleExportsOverride(com.google.javascript.rhino.Node script, java.lang.String moduleName) {
			if (!(modulesWithExports.contains(moduleName))) {
				return ;
			}
			com.google.javascript.rhino.Node moduleExportsProp = com.google.javascript.rhino.IR.getprop(com.google.javascript.rhino.IR.name(moduleName), com.google.javascript.rhino.IR.string("module$exports"));
			script.addChildToBack(com.google.javascript.rhino.IR.ifNode(moduleExportsProp, com.google.javascript.rhino.IR.block(com.google.javascript.rhino.IR.exprResult(com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.IR.name(moduleName), moduleExportsProp.cloneTree())))).copyInformationFromForTree(script));
		}

		private void visitModuleExports(com.google.javascript.rhino.Node prop) {
			java.lang.String moduleName = guessCJSModuleName(prop.getSourceFileName());
			com.google.javascript.rhino.Node module = prop.getChildAtIndex(0);
			module.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, "module");
			module.setString(moduleName);
			com.google.javascript.rhino.Node exports = prop.getChildAtIndex(1);
			exports.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, "exports");
			exports.setString("module$exports");
			modulesWithExports.add(moduleName);
		}

		private com.google.javascript.rhino.Node getCurrentScriptNode(com.google.javascript.rhino.Node n) {
			while (true) {
				if (n.isScript()) {
					return n;
				}
				n = n.getParent();
			} 
		}
	}

	private class SuffixVarsCallback extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		private static final java.lang.String EXPORTS = "exports";

		private final java.lang.String suffix;

		SuffixVarsCallback(java.lang.String suffix) {
			this.suffix = suffix;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (n.isName()) {
				java.lang.String name = n.getString();
				if (suffix.equals(name)) {
					return ;
				}
				if (com.google.javascript.jscomp.ProcessCommonJSModules.SuffixVarsCallback.EXPORTS.equals(name)) {
					n.setString(suffix);
					n.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, com.google.javascript.jscomp.ProcessCommonJSModules.SuffixVarsCallback.EXPORTS);
				}else {
					com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
					if ((var != null) && (var.isGlobal())) {
						n.setString(((name + "$$") + (suffix)));
						n.putProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP, name);
					}
				}
			}
		}
	}
}

