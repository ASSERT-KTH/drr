

package com.google.javascript.jscomp;


class ExtractPrototypeMemberDeclarations implements com.google.javascript.jscomp.CompilerPass {
	private java.lang.String prototypeAlias = "JSCompiler_prototypeAlias";

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.Pattern pattern;

	enum Pattern {
USE_GLOBAL_TEMP("var t;".length(),"t=y.prototype;".length(),(("t.y=".length()) - ("x[p].y=".length()))), USE_ANON_FUNCTION(0,"(function(t){})(y.prototype);".length(),(("t.y=".length()) - ("x.prototype.y=".length())));
		private final int globalOverhead;

		private final int perExtractionOverhead;

		private final int perMemberOverhead;

		Pattern(int globalOverHead, int perExtractionOverhead, int perMemberOverhead) {
			this.globalOverhead = globalOverHead;
			this.perExtractionOverhead = perExtractionOverhead;
			this.perMemberOverhead = perMemberOverhead;
		}
	}

	ExtractPrototypeMemberDeclarations(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.Pattern pattern) {
		this.compiler = compiler;
		this.pattern = pattern;
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
		if ((pattern) == (com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.Pattern.USE_GLOBAL_TEMP)) {
			com.google.javascript.rhino.Node injectionPoint = compiler.getNodeForCodeInsertion(null);
			com.google.javascript.rhino.Node var = com.google.javascript.jscomp.NodeUtil.newVarNode(prototypeAlias, null).copyInformationFromForTree(injectionPoint);
			injectionPoint.addChildrenToFront(var);
		}
		for (com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance instance : info.instances) {
			extractInstance(instance);
		}
	}

	private void extractInstance(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.ExtractionInstance instance) {
		com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration first = instance.declarations.getFirst();
		java.lang.String className = first.qualifiedClassName;
		if ((pattern) == (com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.Pattern.USE_GLOBAL_TEMP)) {
			com.google.javascript.rhino.Node stmt = new com.google.javascript.rhino.Node(first.node.getType(), com.google.javascript.rhino.IR.assign(com.google.javascript.rhino.IR.name(prototypeAlias), com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), (className + ".prototype"), instance.parent, (className + ".prototype")))).copyInformationFromForTree(first.node);
			instance.parent.addChildBefore(stmt, first.node);
		}else
			if ((pattern) == (com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.Pattern.USE_ANON_FUNCTION)) {
				com.google.javascript.rhino.Node block = com.google.javascript.rhino.IR.block();
				com.google.javascript.rhino.Node func = com.google.javascript.rhino.IR.function(com.google.javascript.rhino.IR.name(""), com.google.javascript.rhino.IR.paramList(com.google.javascript.rhino.IR.name(prototypeAlias)), block);
				com.google.javascript.rhino.Node call = com.google.javascript.rhino.IR.call(func, com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), (className + ".prototype"), instance.parent, (className + ".prototype")));
				call.putIntProp(com.google.javascript.rhino.Node.FREE_CALL, 1);
				com.google.javascript.rhino.Node stmt = new com.google.javascript.rhino.Node(first.node.getType(), call);
				stmt.copyInformationFromForTree(first.node);
				instance.parent.addChildBefore(stmt, first.node);
				for (com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration declar : instance.declarations) {
					block.addChildToBack(declar.node.detachFromParent());
				}
			}
		
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

		private int totalDelta = pattern.globalOverhead;

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if ((!(n.isScript())) && (!(n.isBlock()))) {
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

	private class ExtractionInstance {
		java.util.LinkedList<com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration> declarations = com.google.common.collect.Lists.newLinkedList();

		private int delta = 0;

		private final com.google.javascript.rhino.Node parent;

		private ExtractionInstance(com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration head, com.google.javascript.rhino.Node parent) {
			this.parent = parent;
			declarations.add(head);
			delta = (pattern.perExtractionOverhead) + (pattern.perMemberOverhead);
			for (com.google.javascript.rhino.Node cur = head.node.getNext(); cur != null; cur = cur.getNext()) {
				if (cur.isFunction()) {
					continue;
				}
				com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration prototypeMember = com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations.PrototypeMemberDeclaration.extractDeclaration(cur);
				if ((prototypeMember == null) || (!(head.isSameClass(prototypeMember)))) {
					break;
				}
				declarations.add(prototypeMember);
				delta += pattern.perMemberOverhead;
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

