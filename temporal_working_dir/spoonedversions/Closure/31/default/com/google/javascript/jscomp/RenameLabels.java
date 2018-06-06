

package com.google.javascript.jscomp;


final class RenameLabels implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.common.base.Supplier<java.lang.String> nameSupplier;

	private final boolean removeUnused;

	RenameLabels(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this(compiler, new com.google.javascript.jscomp.RenameLabels.DefaultNameSupplier(), true);
	}

	RenameLabels(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.common.base.Supplier<java.lang.String> supplier, boolean removeUnused) {
		this.compiler = compiler;
		this.nameSupplier = supplier;
		this.removeUnused = removeUnused;
	}

	static class DefaultNameSupplier implements com.google.common.base.Supplier<java.lang.String> {
		final com.google.javascript.jscomp.NameGenerator nameGenerator = new com.google.javascript.jscomp.NameGenerator(new java.util.HashSet<java.lang.String>(), "", null);

		@java.lang.Override
		public java.lang.String get() {
			return nameGenerator.generateNextName();
		}
	}

	class ProcessLabels implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		ProcessLabels() {
			namespaceStack.push(new com.google.javascript.jscomp.RenameLabels.LabelNamespace());
		}

		final java.util.Deque<com.google.javascript.jscomp.RenameLabels.LabelNamespace> namespaceStack = com.google.common.collect.Lists.newLinkedList();

		final java.util.ArrayList<java.lang.String> names = new java.util.ArrayList<java.lang.String>();

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal nodeTraversal) {
			namespaceStack.push(new com.google.javascript.jscomp.RenameLabels.LabelNamespace());
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal nodeTraversal) {
			namespaceStack.pop();
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			if (node.isLabel()) {
				com.google.javascript.jscomp.RenameLabels.LabelNamespace current = namespaceStack.peek();
				int currentDepth = (current.renameMap.size()) + 1;
				java.lang.String name = node.getFirstChild().getString();
				com.google.javascript.jscomp.RenameLabels.LabelInfo li = new com.google.javascript.jscomp.RenameLabels.LabelInfo(currentDepth);
				com.google.common.base.Preconditions.checkState((!(current.renameMap.containsKey(name))));
				current.renameMap.put(name, li);
				if ((names.size()) < currentDepth) {
					names.add(nameSupplier.get());
				}
				java.lang.String newName = getNameForId(currentDepth);
				compiler.addToDebugLog(((("label renamed: " + name) + " => ") + newName));
			}
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal nodeTraversal, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			switch (node.getType()) {
				case com.google.javascript.rhino.Token.LABEL :
					visitLabel(node, parent);
					break;
				case com.google.javascript.rhino.Token.BREAK :
				case com.google.javascript.rhino.Token.CONTINUE :
					visitBreakOrContinue(node);
					break;
			}
		}

		private void visitBreakOrContinue(com.google.javascript.rhino.Node node) {
			com.google.javascript.rhino.Node nameNode = node.getFirstChild();
			if (nameNode != null) {
				java.lang.String name = nameNode.getString();
				com.google.common.base.Preconditions.checkState(((name.length()) != 0));
				com.google.javascript.jscomp.RenameLabels.LabelInfo li = getLabelInfo(name);
				if (li != null) {
					java.lang.String newName = getNameForId(li.id);
					li.referenced = true;
					if (!(name.equals(newName))) {
						nameNode.setString(newName);
						compiler.reportCodeChange();
					}
				}
			}
		}

		private void visitLabel(com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.Node nameNode = node.getFirstChild();
			com.google.common.base.Preconditions.checkState((nameNode != null));
			java.lang.String name = nameNode.getString();
			com.google.javascript.jscomp.RenameLabels.LabelInfo li = getLabelInfo(name);
			if ((li.referenced) || (!(removeUnused))) {
				java.lang.String newName = getNameForId(li.id);
				if (!(name.equals(newName))) {
					nameNode.setString(newName);
					compiler.reportCodeChange();
				}
			}else {
				com.google.javascript.rhino.Node newChild = node.getLastChild();
				node.removeChild(newChild);
				parent.replaceChild(node, newChild);
				if (newChild.isBlock()) {
					com.google.javascript.jscomp.NodeUtil.tryMergeBlock(newChild);
				}
				compiler.reportCodeChange();
			}
			namespaceStack.peek().renameMap.remove(name);
		}

		java.lang.String getNameForId(int id) {
			return names.get((id - 1));
		}

		com.google.javascript.jscomp.RenameLabels.LabelInfo getLabelInfo(java.lang.String name) {
			return namespaceStack.peek().renameMap.get(name);
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RenameLabels.ProcessLabels());
	}

	private static class LabelInfo {
		boolean referenced = false;

		final int id;

		LabelInfo(int id) {
			this.id = id;
		}
	}

	private static class LabelNamespace {
		final java.util.Map<java.lang.String, com.google.javascript.jscomp.RenameLabels.LabelInfo> renameMap = new java.util.HashMap<java.lang.String, com.google.javascript.jscomp.RenameLabels.LabelInfo>();
	}
}

