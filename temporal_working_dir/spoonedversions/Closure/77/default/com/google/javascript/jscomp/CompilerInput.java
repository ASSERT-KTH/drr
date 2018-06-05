

package com.google.javascript.jscomp;


public class CompilerInput implements com.google.javascript.jscomp.SourceAst , com.google.javascript.jscomp.deps.DependencyInfo {
	private static final long serialVersionUID = 1L;

	private com.google.javascript.jscomp.JSModule module;

	private boolean isExtern;

	private final java.lang.String name;

	private final com.google.javascript.jscomp.SourceAst ast;

	private final java.util.Set<java.lang.String> provides = com.google.common.collect.Sets.newHashSet();

	private final java.util.Set<java.lang.String> requires = com.google.common.collect.Sets.newHashSet();

	private boolean generatedDependencyInfoFromSource = false;

	private com.google.javascript.jscomp.ErrorManager errorManager;

	private com.google.javascript.jscomp.AbstractCompiler compiler;

	public CompilerInput(com.google.javascript.jscomp.SourceAst ast) {
		this(ast, ast.getSourceFile().getName(), false);
	}

	public CompilerInput(com.google.javascript.jscomp.SourceAst ast, boolean isExtern) {
		this(ast, ast.getSourceFile().getName(), isExtern);
	}

	public CompilerInput(com.google.javascript.jscomp.SourceAst ast, java.lang.String inputName, boolean isExtern) {
		this.ast = ast;
		this.name = inputName;
		com.google.javascript.jscomp.CompilerInput.this.isExtern = isExtern;
	}

	public CompilerInput(com.google.javascript.jscomp.JSSourceFile file) {
		this(file, false);
	}

	public CompilerInput(com.google.javascript.jscomp.JSSourceFile file, boolean isExtern) {
		this.ast = new com.google.javascript.jscomp.JsAst(file);
		this.name = file.getName();
		com.google.javascript.jscomp.CompilerInput.this.isExtern = isExtern;
	}

	@java.lang.Override
	public java.lang.String getName() {
		return name;
	}

	@java.lang.Override
	public java.lang.String getPathRelativeToClosureBase() {
		throw new java.lang.UnsupportedOperationException();
	}

	@java.lang.Override
	public com.google.javascript.rhino.Node getAstRoot(com.google.javascript.jscomp.AbstractCompiler compiler) {
		return ast.getAstRoot(compiler);
	}

	@java.lang.Override
	public void clearAst() {
		ast.clearAst();
	}

	@java.lang.Override
	public com.google.javascript.jscomp.SourceFile getSourceFile() {
		return ast.getSourceFile();
	}

	@java.lang.Override
	public void setSourceFile(com.google.javascript.jscomp.SourceFile file) {
		ast.setSourceFile(file);
	}

	public com.google.javascript.jscomp.SourceAst getSourceAst() {
		return ast;
	}

	public void setErrorManager(com.google.javascript.jscomp.ErrorManager errorManager) {
		com.google.javascript.jscomp.CompilerInput.this.errorManager = errorManager;
	}

	public void setCompiler(com.google.javascript.jscomp.AbstractCompiler compiler) {
		com.google.javascript.jscomp.CompilerInput.this.compiler = compiler;
		setErrorManager(compiler.getErrorManager());
	}

	@java.lang.Override
	public java.util.Collection<java.lang.String> getRequires() {
		com.google.common.base.Preconditions.checkNotNull(errorManager, "Expected setErrorManager to be called first");
		try {
			regenerateDependencyInfoIfNecessary();
			return java.util.Collections.<java.lang.String>unmodifiableSet(requires);
		} catch (java.io.IOException e) {
			errorManager.report(com.google.javascript.jscomp.CheckLevel.ERROR, com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.AbstractCompiler.READ_ERROR, getName()));
			return com.google.common.collect.ImmutableList.<java.lang.String>of();
		}
	}

	@java.lang.Override
	public java.util.Collection<java.lang.String> getProvides() {
		com.google.common.base.Preconditions.checkNotNull(errorManager, "Expected setErrorManager to be called first");
		try {
			regenerateDependencyInfoIfNecessary();
			return java.util.Collections.<java.lang.String>unmodifiableSet(provides);
		} catch (java.io.IOException e) {
			errorManager.report(com.google.javascript.jscomp.CheckLevel.ERROR, com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.AbstractCompiler.READ_ERROR, getName()));
			return com.google.common.collect.ImmutableList.<java.lang.String>of();
		}
	}

	private void regenerateDependencyInfoIfNecessary() throws java.io.IOException {
		if (!((ast) instanceof com.google.javascript.jscomp.JsAst)) {
			com.google.common.base.Preconditions.checkNotNull(compiler, "Expected setCompiler to be called first");
			com.google.javascript.jscomp.CompilerInput.DepsFinder finder = new com.google.javascript.jscomp.CompilerInput.DepsFinder();
			com.google.javascript.rhino.Node root = getAstRoot(compiler);
			if (root == null) {
				return ;
			}
			finder.visitTree(getAstRoot(compiler));
			provides.addAll(finder.provides);
			requires.addAll(finder.requires);
		}else {
			if (!(generatedDependencyInfoFromSource)) {
				com.google.javascript.jscomp.deps.DependencyInfo info = new com.google.javascript.jscomp.deps.JsFileParser(errorManager).parseFile(getName(), getName(), getCode());
				provides.addAll(info.getProvides());
				requires.addAll(info.getRequires());
				generatedDependencyInfoFromSource = true;
			}
		}
	}

	private static class DepsFinder {
		private final java.util.List<java.lang.String> provides = com.google.common.collect.Lists.newArrayList();

		private final java.util.List<java.lang.String> requires = com.google.common.collect.Lists.newArrayList();

		private final com.google.javascript.jscomp.CodingConvention codingConvention = new com.google.javascript.jscomp.ClosureCodingConvention();

		void visitTree(com.google.javascript.rhino.Node n) {
			visitSubtree(n, null);
		}

		void visitSubtree(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((n.getType()) == (com.google.javascript.rhino.Token.CALL)) {
				java.lang.String require = codingConvention.extractClassNameIfRequire(n, parent);
				if (require != null) {
					requires.add(require);
				}
				java.lang.String provide = codingConvention.extractClassNameIfProvide(n, parent);
				if (provide != null) {
					provides.add(provide);
				}
				return ;
			}else
				if (((parent != null) && ((parent.getType()) != (com.google.javascript.rhino.Token.EXPR_RESULT))) && ((parent.getType()) != (com.google.javascript.rhino.Token.SCRIPT))) {
					return ;
				}
			
			for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
				visitSubtree(child, n);
			}
		}
	}

	public java.lang.String getLine(int lineNumber) {
		return getSourceFile().getLine(lineNumber);
	}

	public com.google.javascript.jscomp.Region getRegion(int lineNumber) {
		return getSourceFile().getRegion(lineNumber);
	}

	public java.lang.String getCode() throws java.io.IOException {
		return getSourceFile().getCode();
	}

	public com.google.javascript.jscomp.JSModule getModule() {
		return module;
	}

	public void setModule(com.google.javascript.jscomp.JSModule module) {
		com.google.common.base.Preconditions.checkArgument((((module == null) || ((com.google.javascript.jscomp.CompilerInput.this.module) == null)) || ((com.google.javascript.jscomp.CompilerInput.this.module) == module)));
		com.google.javascript.jscomp.CompilerInput.this.module = module;
	}

	public boolean isExtern() {
		return isExtern;
	}

	void setIsExtern(boolean isExtern) {
		com.google.javascript.jscomp.CompilerInput.this.isExtern = isExtern;
	}
}

