

package com.google.javascript.jscomp;


class ExtractPrototypeMemberDeclarations implements com.google.javascript.jscomp.CompilerPass {
	private static final int GLOBAL_VAR_DECL_OVERHEAD = "var t;".length();

	private static final int PER_EXTRACTION_INSTANCE_OVERHEAD = "t=y.prototype;".length();

	private static final int PER_PROTOTYPE_MEMBER_DELTA = ("t.y=".length()) - ("x[p].y=".length());

	private java.lang.String prototypeAlias = "JSCompiler_prototypeAlias";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	public ExtractPrototypeMemberDeclarations(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.GatherExtractionInfo extractionInfo = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.GatherExtractionInfo();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, extractionInfo);
		if (extractionInfo.shouldExtract()) {
			doExtraction(extractionInfo);
			compiler.reportCodeChange();
		}
	}

	private void doExtraction(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.GatherExtractionInfo info) {
		com.google.javascript.rhino.Node injectionPoint = compiler.getNodeForCodeInsertion(null);
		com.google.javascript.rhino.Node var = com.google.javascript.jscomp.NodeUtil.newVarNode(prototypeAlias, null).copyInformationFromForTree(injectionPoint);
		injectionPoint.addChildrenToFront(var);
		for (com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance instance : info.instances) {
			extractInstance(instance);
		}
	}

	private void extractInstance(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance instance) {
		com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration first = instance.declarations.getFirst();
		java.lang.String className = first.qualifiedClassName;
		com.google.javascript.rhino.Node stmt = new com.google.javascript.rhino.Node(first.node.getType(), new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.ASSIGN, com.google.javascript.rhino.Node.newString(com.google.javascript.rhino.Token.NAME, prototypeAlias), com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), (className + ".prototype"), instance.parent, (className + ".prototype")))).copyInformationFromForTree(first.node);
		instance.parent.addChildBefore(stmt, first.node);
		for (com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration declar : instance.declarations) {
			replacePrototypeMemberDeclaration(declar);
		}
	}

	private void replacePrototypeMemberDeclaration(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration declar) {
		com.google.javascript.rhino.Node assignment = declar.node.getFirstChild();
		com.google.javascript.rhino.Node lhs = assignment.getFirstChild();
		com.google.javascript.rhino.Node name = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), (((prototypeAlias) + ".") + (declar.memberName)), declar.node, declar.memberName);
		com.google.javascript.rhino.Node accessNode = declar.lhs.getFirstChild().getFirstChild();
		java.lang.Object originalName = accessNode.getProp(com.google.javascript.rhino.Node.ORIGINALNAME_PROP);
		java.lang.String className = "?";
		if (originalName != null) {
			className = originalName.toString();
		}
		com.google.javascript.jscomp.NodeUtil.setDebugInformation(name.getFirstChild(), lhs, (className + ".prototype"));
		assignment.replaceChild(lhs, name);
	}

	private class GatherExtractionInfo extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback {
		private java.util.List<com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance> instances = com.google.common.collect.Lists.newLinkedList();

		private int totalDelta = com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.GLOBAL_VAR_DECL_OVERHEAD;

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (((n.getType()) != (com.google.javascript.rhino.Token.SCRIPT)) && ((n.getType()) != (com.google.javascript.rhino.Token.BLOCK))) {
				return ;
			}
			for (com.google.javascript.rhino.Node cur = n.getFirstChild(); cur != null; cur = cur.getNext()) {
				com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration prototypeMember = com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration.extractDeclaration(cur);
				if (prototypeMember == null) {
					continue;
				}
				com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance instance = new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance(prototypeMember, n);
				cur = instance.declarations.getLast().node;
				if (instance.isFavorable()) {
					instances.add(instance);
					totalDelta += instance.delta;
				}
			}
		}

		private boolean shouldExtract() {
			return (totalDelta) < 0;
		}
	}

	private static class ExtractionInstance {
		java.util.LinkedList<com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration> declarations = com.google.common.collect.Lists.newLinkedList();

		private int delta = 0;

		private final com.google.javascript.rhino.Node parent;

		private ExtractionInstance(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration head, com.google.javascript.rhino.Node parent) {
			this.parent = parent;
			declarations.add(head);
			delta = (com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PER_EXTRACTION_INSTANCE_OVERHEAD) + (com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PER_PROTOTYPE_MEMBER_DELTA);
			for (com.google.javascript.rhino.Node cur = head.node.getNext(); cur != null; cur = cur.getNext()) {
				if (com.google.javascript.jscomp.NodeUtil.isFunction(cur)) {
					continue;
				}
				com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration prototypeMember = com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration.extractDeclaration(cur);
				if ((prototypeMember == null) || (!(head.isSameClass(prototypeMember)))) {
					break;
				}
				declarations.add(prototypeMember);
				delta += com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PER_PROTOTYPE_MEMBER_DELTA;
			}
		}

		boolean isFavorable() {
			return (delta) <= 0;
		}
	}

	private static class PrototypeMemberDeclaration {
		final java.lang.String memberName;

		final com.google.javascript.rhino.Node node;

		final java.lang.String qualifiedClassName;

		final com.google.javascript.rhino.Node lhs;

		private PrototypeMemberDeclaration(com.google.javascript.rhino.Node lhs, com.google.javascript.rhino.Node node) {
			this.lhs = lhs;
			this.memberName = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(lhs);
			this.node = node;
			this.qualifiedClassName = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(lhs).getQualifiedName();
		}

		private boolean isSameClass(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration other) {
			return qualifiedClassName.equals(other.qualifiedClassName);
		}

		private static com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration extractDeclaration(com.google.javascript.rhino.Node n) {
			if (!(com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(n))) {
				return null;
			}
			com.google.javascript.rhino.Node lhs = n.getFirstChild().getFirstChild();
			return new com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration(lhs, n);
		}
	}
}

