

package com.google.javascript.jscomp;


class AliasKeywords implements com.google.javascript.jscomp.CompilerPass {
	private class FindAliasableNodes extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			final int type = n.getType();
			if (isAliasableType(type)) {
				visitAliasableNode(n, parent);
			}else
				if (type == (com.google.javascript.rhino.Token.NAME)) {
					visitNameNode(n);
				}
			
		}

		private void visitAliasableNode(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.jscomp.AliasKeywords.AliasSpecification aliasableNodes = aliasTypes.get(n.getType());
			aliasableNodes.visit(n, parent);
		}

		private void visitNameNode(com.google.javascript.rhino.Node n) {
			if (isAliasDefinition(n)) {
				throw new java.lang.IllegalStateException(("Existing alias definition for " + (com.google.javascript.rhino.Node.tokenToName(n.getType()))));
			}
		}
	}

	private abstract static class AliasSpecification {
		private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node> nodes = com.google.common.collect.Maps.newHashMap();

		private boolean isAliased = false;

		private java.lang.String aliasName;

		private int tokenId;

		public AliasSpecification(java.lang.String aliasName, int tokenId) {
			com.google.javascript.jscomp.AliasKeywords.AliasSpecification.this.aliasName = aliasName;
			com.google.javascript.jscomp.AliasKeywords.AliasSpecification.this.tokenId = tokenId;
		}

		public void visit(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			nodes.put(n, parent);
		}

		boolean maybeInsertAliasDeclarationIntoParseTree(com.google.javascript.rhino.Node codeRoot) {
			if ((nodes.size()) >= (minOccurrencesRequiredToAlias())) {
				insertAliasDeclaration(codeRoot);
				isAliased = true;
				return true;
			}
			return false;
		}

		public void doAlias(com.google.javascript.jscomp.AbstractCompiler compiler) {
			if (isAliased) {
				for (java.util.Map.Entry<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node> entry : nodes.entrySet()) {
					com.google.javascript.rhino.Node n = entry.getKey();
					com.google.javascript.rhino.Node parent = entry.getValue();
					aliasNode(n, parent);
					compiler.reportCodeChange();
				}
			}
		}

		public int getTokenId() {
			return tokenId;
		}

		public java.lang.String getAliasName() {
			return aliasName;
		}

		protected abstract int minOccurrencesRequiredToAlias();

		protected abstract void insertAliasDeclaration(com.google.javascript.rhino.Node codeRoot);

		protected abstract void aliasNode(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent);
	}

	private class ThrowAliasSpecification extends com.google.javascript.jscomp.AliasKeywords.AliasSpecification {
		ThrowAliasSpecification(java.lang.String aliasName) {
			super(aliasName, com.google.javascript.rhino.Token.THROW);
		}

		@java.lang.Override
		protected void aliasNode(com.google.javascript.rhino.Node throwNode, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node name = com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), getAliasName(), throwNode, getAliasName());
			com.google.javascript.rhino.Node aliasCall = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.CALL, name, throwNode.removeFirstChild());
			aliasCall.putBooleanProp(com.google.javascript.rhino.Node.FREE_CALL, true);
			com.google.javascript.rhino.Node exprResult = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EXPR_RESULT, aliasCall);
			parent.replaceChild(throwNode, exprResult);
		}

		@java.lang.Override
		protected void insertAliasDeclaration(com.google.javascript.rhino.Node codeRoot) {
			codeRoot.addChildToFront(com.google.javascript.jscomp.AliasKeywords.createAliasFunctionNode(getAliasName()));
		}

		@java.lang.Override
		protected int minOccurrencesRequiredToAlias() {
			return com.google.javascript.jscomp.AliasKeywords.MIN_OCCURRENCES_REQUIRED_TO_ALIAS_THROW;
		}
	}

	static int estimateMinOccurrencesRequriedToAlias() {
		com.google.javascript.rhino.Node alias = com.google.javascript.jscomp.AliasKeywords.createAliasFunctionNode("TT");
		return ((com.google.javascript.jscomp.InlineCostEstimator.getCost(alias)) / 2) + 1;
	}

	private static com.google.javascript.rhino.Node createAliasFunctionNode(java.lang.String aliasName) {
		com.google.javascript.rhino.Node parameterName = com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, "jscomp_throw_param");
		java.util.List<com.google.javascript.rhino.Node> parameters = com.google.common.collect.Lists.newArrayList(parameterName.cloneNode());
		com.google.javascript.rhino.Node throwStatement = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.THROW, parameterName);
		com.google.javascript.rhino.Node body = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK, throwStatement);
		return com.google.javascript.jscomp.NodeUtil.newFunctionNode(aliasName, parameters, body, (-1), (-1));
	}

	private class KeywordAliasSpecification extends com.google.javascript.jscomp.AliasKeywords.AliasSpecification {
		KeywordAliasSpecification(java.lang.String aliasName, int tokenId) {
			super(aliasName, tokenId);
		}

		@java.lang.Override
		protected int minOccurrencesRequiredToAlias() {
			return com.google.javascript.jscomp.AliasKeywords.MIN_OCCURRENCES_REQUIRED_TO_ALIAS_LITERAL;
		}

		@java.lang.Override
		protected void aliasNode(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node aliasNode = com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), getAliasName(), n, getAliasName());
			parent.replaceChild(n, aliasNode);
		}

		@java.lang.Override
		protected void insertAliasDeclaration(com.google.javascript.rhino.Node codeRoot) {
			com.google.javascript.rhino.Node varNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR);
			com.google.javascript.rhino.Node value = new com.google.javascript.rhino.Node(getTokenId());
			com.google.javascript.rhino.Node name = com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), getAliasName(), varNode, getAliasName());
			name.addChildToBack(value);
			varNode.addChildToBack(name);
			codeRoot.addChildrenToFront(varNode);
		}
	}

	private class VoidKeywordAliasSpecification extends com.google.javascript.jscomp.AliasKeywords.AliasSpecification {
		VoidKeywordAliasSpecification(java.lang.String aliasName, int tokenId) {
			super(aliasName, tokenId);
		}

		@java.lang.Override
		public void visit(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node value = n.getFirstChild();
			if ((value.isNumber()) && ((value.getDouble()) == 0)) {
				super.visit(n, parent);
			}
		}

		@java.lang.Override
		protected int minOccurrencesRequiredToAlias() {
			return com.google.javascript.jscomp.AliasKeywords.MIN_OCCURRENCES_REQUIRED_TO_ALIAS_LITERAL;
		}

		@java.lang.Override
		protected void aliasNode(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node aliasNode = com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), getAliasName(), n, getAliasName());
			parent.replaceChild(n, aliasNode);
		}

		@java.lang.Override
		protected void insertAliasDeclaration(com.google.javascript.rhino.Node codeRoot) {
			com.google.javascript.rhino.Node varNode = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VAR);
			com.google.javascript.rhino.Node value = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VOID, com.google.javascript.rhino.Node.newNumber(0));
			com.google.javascript.rhino.Node name = com.google.javascript.jscomp.NodeUtil.newName(compiler.getCodingConvention(), getAliasName(), varNode, getAliasName());
			name.addChildToBack(value);
			varNode.addChildToBack(name);
			codeRoot.addChildrenToFront(varNode);
		}
	}

	static final java.lang.String ALIAS_NULL = "JSCompiler_alias_NULL";

	static final java.lang.String ALIAS_TRUE = "JSCompiler_alias_TRUE";

	static final java.lang.String ALIAS_FALSE = "JSCompiler_alias_FALSE";

	static final java.lang.String ALIAS_THROW = "JSCompiler_alias_THROW";

	static final java.lang.String ALIAS_VOID = "JSCompiler_alias_VOID";

	static final int MIN_OCCURRENCES_REQUIRED_TO_ALIAS_LITERAL = 6;

	static final int MIN_OCCURRENCES_REQUIRED_TO_ALIAS_THROW = com.google.javascript.jscomp.AliasKeywords.estimateMinOccurrencesRequriedToAlias();

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.List<com.google.javascript.jscomp.AliasKeywords.AliasSpecification> aliasSpecifications;

	private final java.util.Map<java.lang.Integer, com.google.javascript.jscomp.AliasKeywords.AliasSpecification> aliasTypes;

	private final java.util.Set<java.lang.String> aliasNames;

	AliasKeywords(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
		aliasSpecifications = createAliasSpecifications();
		aliasTypes = com.google.common.collect.Maps.newLinkedHashMap();
		aliasNames = com.google.common.collect.Sets.newLinkedHashSet();
		for (com.google.javascript.jscomp.AliasKeywords.AliasSpecification specification : aliasSpecifications) {
			aliasTypes.put(specification.getTokenId(), specification);
			aliasNames.add(specification.getAliasName());
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.AliasKeywords.FindAliasableNodes());
		if (needsAliases()) {
			addAliasNodes(compiler.getNodeForCodeInsertion(null));
			for (com.google.javascript.jscomp.AliasKeywords.AliasSpecification spec : aliasSpecifications) {
				spec.doAlias(compiler);
			}
		}
	}

	private boolean needsAliases() {
		for (com.google.javascript.jscomp.AliasKeywords.AliasSpecification spec : aliasSpecifications) {
			if (!(spec.nodes.isEmpty())) {
				return true;
			}
		}
		return false;
	}

	private void addAliasNodes(com.google.javascript.rhino.Node codeRoot) {
		boolean codeChanged = false;
		for (com.google.javascript.jscomp.AliasKeywords.AliasSpecification spec : aliasSpecifications) {
			if (spec.maybeInsertAliasDeclarationIntoParseTree(codeRoot)) {
				codeChanged = true;
			}
		}
		if (codeChanged) {
			compiler.reportCodeChange();
		}
	}

	private boolean isAliasDefinition(com.google.javascript.rhino.Node n) {
		if ((n.getType()) != (com.google.javascript.rhino.Token.NAME)) {
			return false;
		}
		if (!(isAliasName(n.getString()))) {
			return false;
		}
		return (n.getFirstChild()) != null;
	}

	private boolean isAliasableType(int type) {
		return aliasTypes.containsKey(type);
	}

	private boolean isAliasName(java.lang.String name) {
		return aliasNames.contains(name);
	}

	private java.util.List<com.google.javascript.jscomp.AliasKeywords.AliasSpecification> createAliasSpecifications() {
		java.util.List<com.google.javascript.jscomp.AliasKeywords.AliasSpecification> l = com.google.common.collect.Lists.newArrayList();
		l.add(new com.google.javascript.jscomp.AliasKeywords.KeywordAliasSpecification(com.google.javascript.jscomp.AliasKeywords.ALIAS_FALSE, com.google.javascript.rhino.Token.FALSE));
		l.add(new com.google.javascript.jscomp.AliasKeywords.KeywordAliasSpecification(com.google.javascript.jscomp.AliasKeywords.ALIAS_NULL, com.google.javascript.rhino.Token.NULL));
		l.add(new com.google.javascript.jscomp.AliasKeywords.KeywordAliasSpecification(com.google.javascript.jscomp.AliasKeywords.ALIAS_TRUE, com.google.javascript.rhino.Token.TRUE));
		l.add(new com.google.javascript.jscomp.AliasKeywords.VoidKeywordAliasSpecification(com.google.javascript.jscomp.AliasKeywords.ALIAS_VOID, com.google.javascript.rhino.Token.VOID));
		l.add(new com.google.javascript.jscomp.AliasKeywords.ThrowAliasSpecification(com.google.javascript.jscomp.AliasKeywords.ALIAS_THROW));
		return l;
	}
}

