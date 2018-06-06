

package com.google.javascript.jscomp;


class AstParallelizer {
	public static final java.lang.String TEMP_NAME = "JSC_TMP_PLACE_HOLDER";

	private final com.google.common.base.Predicate<com.google.javascript.rhino.Node> shouldSplit;

	private final com.google.common.base.Supplier<com.google.javascript.rhino.Node> placeHolderProvider;

	private final java.util.List<com.google.javascript.rhino.Node> forest;

	private final com.google.javascript.rhino.Node root;

	private final boolean includeRoot;

	private final java.util.List<com.google.javascript.jscomp.AstParallelizer.DettachPoint> detachPointList;

	public AstParallelizer(com.google.common.base.Predicate<com.google.javascript.rhino.Node> shouldSplit, com.google.common.base.Predicate<com.google.javascript.rhino.Node> shouldTraverse, com.google.common.base.Supplier<com.google.javascript.rhino.Node> placeHolderProvider, com.google.javascript.rhino.Node root, boolean includeRoot) {
		this.shouldSplit = shouldSplit;
		this.placeHolderProvider = placeHolderProvider;
		this.root = root;
		this.includeRoot = includeRoot;
		this.forest = com.google.common.collect.Lists.newLinkedList();
		this.detachPointList = com.google.common.collect.Lists.newLinkedList();
	}

	public static com.google.javascript.jscomp.AstParallelizer createNewFunctionLevelAstParallelizer(com.google.javascript.rhino.Node root, boolean globalPass) {
		com.google.common.base.Predicate<com.google.javascript.rhino.Node> shouldSplit = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node input) {
				return com.google.javascript.jscomp.NodeUtil.isFunction(input);
			}
		};
		com.google.common.base.Predicate<com.google.javascript.rhino.Node> shouldTraverse = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node ignored) {
				return true;
			}
		};
		com.google.common.base.Supplier<com.google.javascript.rhino.Node> placeHolders = new com.google.common.base.Supplier<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public com.google.javascript.rhino.Node get() {
				return new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FUNCTION, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, com.google.javascript.jscomp.AstParallelizer.TEMP_NAME), new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.LP), new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.BLOCK));
			}
		};
		return new com.google.javascript.jscomp.AstParallelizer(shouldSplit, shouldTraverse, placeHolders, root, globalPass);
	}

	public static com.google.javascript.jscomp.AstParallelizer createNewFileLevelAstParallelizer(com.google.javascript.rhino.Node root) {
		com.google.common.base.Predicate<com.google.javascript.rhino.Node> shouldSplit = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node input) {
				return (input.getSourceFileName()) != null;
			}
		};
		com.google.common.base.Supplier<com.google.javascript.rhino.Node> placeHolders = new com.google.common.base.Supplier<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public com.google.javascript.rhino.Node get() {
				return com.google.javascript.jscomp.NodeUtil.newExpr(com.google.javascript.rhino.Node.newString(com.google.javascript.jscomp.AstParallelizer.TEMP_NAME));
			}
		};
		com.google.common.base.Predicate<com.google.javascript.rhino.Node> shouldTraverse = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
			@java.lang.Override
			public boolean apply(com.google.javascript.rhino.Node n) {
				return (n.getType()) == (com.google.javascript.rhino.Token.BLOCK);
			}
		};
		return new com.google.javascript.jscomp.AstParallelizer(shouldSplit, shouldTraverse, placeHolders, root, false);
	}

	private void recordSplitPoint(com.google.javascript.rhino.Node placeHolder, com.google.javascript.rhino.Node before, com.google.javascript.rhino.Node orginal) {
		detachPointList.add(new com.google.javascript.jscomp.AstParallelizer.DettachPoint(placeHolder, before, orginal));
	}

	public java.util.List<com.google.javascript.rhino.Node> split() {
		if (includeRoot) {
			forest.add(root);
		}
		split(root);
		return forest;
	}

	private void split(com.google.javascript.rhino.Node n) {
		com.google.javascript.rhino.Node c = n.getFirstChild();
		com.google.javascript.rhino.Node before = null;
		while (c != null) {
			com.google.javascript.rhino.Node next = c.getNext();
			if (shouldSplit.apply(c)) {
				com.google.javascript.rhino.Node placeHolder = placeHolderProvider.get();
				if (before == null) {
					forest.add(n.removeFirstChild());
					n.addChildToFront(placeHolder);
				}else {
					n.addChildAfter(placeHolder, c);
					n.removeChildAfter(before);
					forest.add(c);
				}
				recordSplitPoint(placeHolder, before, c);
				before = placeHolder;
			}else {
				split(c);
				before = c;
			}
			c = next;
		} 
	}

	public void join() {
		while (!(detachPointList.isEmpty())) {
			com.google.javascript.jscomp.AstParallelizer.DettachPoint entry = detachPointList.remove(((detachPointList.size()) - 1));
			entry.reattach();
		} 
	}

	private static class DettachPoint {
		private com.google.javascript.rhino.Node placeHolder;

		private com.google.javascript.rhino.Node before;

		private com.google.javascript.rhino.Node original;

		private DettachPoint(com.google.javascript.rhino.Node placeHolder, com.google.javascript.rhino.Node before, com.google.javascript.rhino.Node orginal) {
			com.google.javascript.jscomp.AstParallelizer.DettachPoint.this.placeHolder = placeHolder;
			com.google.javascript.jscomp.AstParallelizer.DettachPoint.this.before = before;
			com.google.javascript.jscomp.AstParallelizer.DettachPoint.this.original = orginal;
		}

		public void reattach() {
			if ((placeHolder.getParent()) != null) {
				if ((before) == null) {
					placeHolder.getParent().addChildrenToFront(original);
					placeHolder.getParent().removeChildAfter(original);
				}else {
					placeHolder.getParent().addChildAfter(original, before);
					placeHolder.getParent().removeChildAfter(original);
				}
			}
		}
	}
}

