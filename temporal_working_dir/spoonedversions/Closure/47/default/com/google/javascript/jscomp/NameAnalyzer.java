

package com.google.javascript.jscomp;


final class NameAnalyzer implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.NameAnalyzer.JsName> allNames = com.google.common.collect.Maps.newTreeMap();

	private com.google.javascript.jscomp.graph.DiGraph<com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType> referenceGraph = com.google.javascript.jscomp.graph.LinkedDirectedGraph.createWithoutAnnotations();

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.jscomp.NameAnalyzer.NameInformation> scopes = com.google.common.collect.Maps.newHashMap();

	private static final java.lang.String PROTOTYPE_SUBSTRING = ".prototype.";

	private static final int PROTOTYPE_SUBSTRING_LEN = com.google.javascript.jscomp.NameAnalyzer.PROTOTYPE_SUBSTRING.length();

	private static final int PROTOTYPE_SUFFIX_LEN = ".prototype".length();

	private static final java.lang.String WINDOW = "window";

	private static final java.lang.String FUNCTION = "Function";

	static final java.util.Set<java.lang.String> DEFAULT_GLOBAL_NAMES = com.google.common.collect.ImmutableSet.of("window", "goog.global");

	private final boolean removeUnreferenced;

	private final java.util.Set<java.lang.String> globalNames;

	private final com.google.javascript.jscomp.AstChangeProxy changeProxy;

	private final java.util.Set<java.lang.String> externalNames = com.google.common.collect.Sets.newHashSet();

	private final java.util.List<com.google.javascript.jscomp.NameAnalyzer.RefNode> refNodes = com.google.common.collect.Lists.newArrayList();

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.NameAnalyzer.AliasSet> aliases = com.google.common.collect.Maps.newHashMap();

	private static class AliasSet {
		java.util.Set<java.lang.String> names = com.google.common.collect.Sets.newHashSet();

		AliasSet(java.lang.String name1, java.lang.String name2) {
			names.add(name1);
			names.add(name2);
		}
	}

	private static enum RefType {
REGULAR, INHERITANCE;	}

	private static class ReferencePropagationCallback implements com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback<com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType> {
		@java.lang.Override
		public boolean traverseEdge(com.google.javascript.jscomp.NameAnalyzer.JsName from, com.google.javascript.jscomp.NameAnalyzer.RefType callSite, com.google.javascript.jscomp.NameAnalyzer.JsName to) {
			if ((from.referenced) && (!(to.referenced))) {
				to.referenced = true;
				return true;
			}else {
				return false;
			}
		}
	}

	private static class NameInformation {
		java.lang.String name;

		boolean isExternallyReferenceable = false;

		boolean isPrototype = false;

		java.lang.String prototypeClass = null;

		java.lang.String prototypeProperty = null;

		java.lang.String superclass = null;

		boolean onlyAffectsClassDef = false;
	}

	private static class JsName implements java.lang.Comparable<com.google.javascript.jscomp.NameAnalyzer.JsName> {
		java.lang.String name;

		java.util.List<java.lang.String> prototypeNames = com.google.common.collect.Lists.newArrayList();

		boolean externallyDefined = false;

		boolean referenced = false;

		boolean hasWrittenDescendants = false;

		boolean hasInstanceOfReference = false;

		@java.lang.Override
		public java.lang.String toString() {
			java.lang.StringBuilder out = new java.lang.StringBuilder();
			out.append(name);
			if ((prototypeNames.size()) > 0) {
				out.append(" (CLASS)\n");
				out.append(" - FUNCTIONS: ");
				java.util.Iterator<java.lang.String> pIter = prototypeNames.iterator();
				while (pIter.hasNext()) {
					out.append(pIter.next());
					if (pIter.hasNext()) {
						out.append(", ");
					}
				} 
			}
			return out.toString();
		}

		@java.lang.Override
		public int compareTo(com.google.javascript.jscomp.NameAnalyzer.JsName rhs) {
			return com.google.javascript.jscomp.NameAnalyzer.JsName.this.name.compareTo(rhs.name);
		}
	}

	interface RefNode {
		com.google.javascript.jscomp.NameAnalyzer.JsName name();

		void remove();
	}

	private class JsNameRefNode implements com.google.javascript.jscomp.NameAnalyzer.RefNode {
		com.google.javascript.jscomp.NameAnalyzer.JsName name;

		@java.lang.SuppressWarnings(value = "unused")
		com.google.javascript.rhino.Node node;

		com.google.javascript.rhino.Node parent;

		JsNameRefNode(com.google.javascript.jscomp.NameAnalyzer.JsName name, com.google.javascript.rhino.Node node) {
			com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode.this.name = name;
			com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode.this.node = node;
			com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode.this.parent = node.getParent();
		}

		@java.lang.Override
		public com.google.javascript.jscomp.NameAnalyzer.JsName name() {
			return name;
		}

		@java.lang.Override
		public void remove() {
			com.google.javascript.rhino.Node containingNode = parent.getParent();
			switch (parent.getType()) {
				case com.google.javascript.rhino.Token.VAR :
					com.google.common.base.Preconditions.checkState(parent.hasOneChild());
					replaceWithRhs(containingNode, parent);
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					replaceWithRhs(containingNode, parent);
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
					if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(containingNode)) {
						replaceWithRhs(containingNode.getParent(), containingNode);
					}else {
						replaceWithRhs(containingNode, parent);
					}
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					break;
			}
		}
	}

	private class PrototypeSetNode extends com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode {
		PrototypeSetNode(com.google.javascript.jscomp.NameAnalyzer.JsName name, com.google.javascript.rhino.Node parent) {
			super(name, parent.getFirstChild());
			com.google.common.base.Preconditions.checkState(parent.isAssign());
		}

		@java.lang.Override
		public void remove() {
			com.google.javascript.rhino.Node gramps = parent.getParent();
			if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(gramps)) {
				changeProxy.removeChild(gramps.getParent(), gramps);
			}else {
				changeProxy.replaceWith(gramps, parent, parent.getLastChild().cloneTree());
			}
		}
	}

	private abstract class SpecialReferenceNode implements com.google.javascript.jscomp.NameAnalyzer.RefNode {
		com.google.javascript.jscomp.NameAnalyzer.JsName name;

		com.google.javascript.rhino.Node node;

		com.google.javascript.rhino.Node parent;

		com.google.javascript.rhino.Node gramps;

		SpecialReferenceNode(com.google.javascript.jscomp.NameAnalyzer.JsName name, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gramps) {
			com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.this.name = name;
			com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.this.node = node;
			com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.this.parent = parent;
			com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode.this.gramps = gramps;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.NameAnalyzer.JsName name() {
			return name;
		}
	}

	private class ClassDefiningFunctionNode extends com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode {
		ClassDefiningFunctionNode(com.google.javascript.jscomp.NameAnalyzer.JsName name, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gramps) {
			super(name, node, parent, gramps);
			com.google.common.base.Preconditions.checkState(node.isCall());
		}

		@java.lang.Override
		public void remove() {
			com.google.common.base.Preconditions.checkState(node.isCall());
			if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent)) {
				changeProxy.removeChild(gramps, parent);
			}else {
				changeProxy.replaceWith(parent, node, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.VOID, com.google.javascript.rhino.Node.newNumber(0)));
			}
		}
	}

	private class InstanceOfCheckNode extends com.google.javascript.jscomp.NameAnalyzer.SpecialReferenceNode {
		InstanceOfCheckNode(com.google.javascript.jscomp.NameAnalyzer.JsName name, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node gramps) {
			super(name, node, parent, gramps);
			com.google.common.base.Preconditions.checkState(node.isQualifiedName());
			com.google.common.base.Preconditions.checkState(((parent.getType()) == (com.google.javascript.rhino.Token.INSTANCEOF)));
		}

		@java.lang.Override
		public void remove() {
			changeProxy.replaceWith(gramps, parent, new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FALSE));
		}
	}

	private class ProcessExternals extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = null;
			if (com.google.javascript.jscomp.NodeUtil.isVarDeclaration(n)) {
				ns = createNameInformation(t, n, parent);
			}else
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
					ns = createNameInformation(t, n.getFirstChild(), n);
				}
			
			if (ns != null) {
				com.google.javascript.jscomp.NameAnalyzer.JsName jsName = getName(ns.name, true);
				jsName.externallyDefined = true;
				externalNames.add(ns.name);
			}
		}
	}

	private class FindDependencyScopes extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(t.inGlobalScope())) {
				return ;
			}
			if (n.isAssign()) {
				com.google.javascript.rhino.Node nameNode = n.getFirstChild();
				com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, nameNode, n);
				if (ns != null) {
					if ((parent.isFor()) && (!(com.google.javascript.jscomp.NodeUtil.isForIn(parent)))) {
						if ((parent.getFirstChild().getNext()) != n) {
							recordDepScope(n, ns);
						}else {
							recordDepScope(nameNode, ns);
						}
					}else {
						recordDepScope(n, ns);
					}
				}
			}else
				if (com.google.javascript.jscomp.NodeUtil.isVarDeclaration(n)) {
					com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, n, parent);
					recordDepScope(n, ns);
				}else
					if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
						com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, n.getFirstChild(), n);
						recordDepScope(n, ns);
					}else
						if (com.google.javascript.jscomp.NodeUtil.isExprCall(n)) {
							com.google.javascript.rhino.Node callNode = n.getFirstChild();
							com.google.javascript.rhino.Node nameNode = callNode.getFirstChild();
							com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, nameNode, callNode);
							if ((ns != null) && (ns.onlyAffectsClassDef)) {
								recordDepScope(n, ns);
							}
						}
					
				
			
		}

		private void recordDepScope(com.google.javascript.rhino.Node node, com.google.javascript.jscomp.NameAnalyzer.NameInformation name) {
			scopes.put(node, name);
		}
	}

	private class HoistVariableAndFunctionDeclarations extends com.google.javascript.jscomp.NodeTraversal.AbstractShallowCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (com.google.javascript.jscomp.NodeUtil.isVarDeclaration(n)) {
				com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, n, parent);
				com.google.common.base.Preconditions.checkNotNull(ns, "NameInformation is null");
				createName(ns.name);
			}else
				if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
					com.google.javascript.rhino.Node nameNode = n.getFirstChild();
					com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, nameNode, n);
					com.google.common.base.Preconditions.checkNotNull(ns, "NameInformation is null");
					createName(nameNode.getString());
				}
			
		}
	}

	private class FindDeclarationsAndSetters extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (t.inGlobalScope()) {
				if (com.google.javascript.jscomp.NodeUtil.isVarDeclaration(n)) {
					com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, n, parent);
					com.google.common.base.Preconditions.checkNotNull(ns);
					recordSet(ns.name, n);
				}else
					if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
						com.google.javascript.rhino.Node nameNode = n.getFirstChild();
						com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, nameNode, n);
						if (ns != null) {
							com.google.javascript.jscomp.NameAnalyzer.JsName nameInfo = getName(nameNode.getString(), true);
							recordSet(nameInfo.name, nameNode);
						}
					}else
						if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(n, parent)) {
							com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, n, parent);
							if (ns != null) {
								recordSet(ns.name, n);
							}
						}
					
				
			}
			if (n.isAssign()) {
				com.google.javascript.rhino.Node nameNode = n.getFirstChild();
				com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, nameNode, n);
				if (ns != null) {
					if (ns.isPrototype) {
						recordPrototypeSet(ns.prototypeClass, ns.prototypeProperty, n);
					}else {
						recordSet(ns.name, nameNode);
					}
				}
			}else
				if (n.isCall()) {
					com.google.javascript.rhino.Node nameNode = n.getFirstChild();
					com.google.javascript.jscomp.NameAnalyzer.NameInformation ns = createNameInformation(t, nameNode, n);
					if ((ns != null) && (ns.onlyAffectsClassDef)) {
						com.google.javascript.jscomp.NameAnalyzer.JsName name = getName(ns.name, false);
						if (name != null) {
							refNodes.add(new com.google.javascript.jscomp.NameAnalyzer.ClassDefiningFunctionNode(name, n, parent, parent.getParent()));
						}
					}
				}
			
		}

		private void recordSet(java.lang.String name, com.google.javascript.rhino.Node node) {
			com.google.javascript.jscomp.NameAnalyzer.JsName jsn = getName(name, true);
			com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode nameRefNode = new com.google.javascript.jscomp.NameAnalyzer.JsNameRefNode(jsn, node);
			refNodes.add(nameRefNode);
			if (node.isGetElem()) {
				recordWriteOnProperties(name);
			}else
				if ((name.indexOf('.')) != (-1)) {
					recordWriteOnProperties(name.substring(0, name.lastIndexOf('.')));
				}
			
		}

		private void recordPrototypeSet(java.lang.String className, java.lang.String prototypeProperty, com.google.javascript.rhino.Node node) {
			com.google.javascript.jscomp.NameAnalyzer.JsName name = getName(className, true);
			name.prototypeNames.add(prototypeProperty);
			refNodes.add(new com.google.javascript.jscomp.NameAnalyzer.PrototypeSetNode(name, node));
			recordWriteOnProperties(className);
		}

		private void recordWriteOnProperties(java.lang.String parentName) {
			do {
				com.google.javascript.jscomp.NameAnalyzer.JsName parent = getName(parentName, true);
				if (parent.hasWrittenDescendants) {
					return ;
				}else {
					parent.hasWrittenDescendants = true;
				}
				if ((parentName.indexOf('.')) == (-1)) {
					return ;
				}
				parentName = parentName.substring(0, parentName.lastIndexOf('.'));
			} while (true );
		}
	}

	private static final com.google.common.base.Predicate<com.google.javascript.rhino.Node> NON_LOCAL_RESULT_PREDICATE = new com.google.common.base.Predicate<com.google.javascript.rhino.Node>() {
		@java.lang.Override
		public boolean apply(com.google.javascript.rhino.Node input) {
			if (input.isCall()) {
				return false;
			}
			return true;
		}
	};

	private class FindReferences implements com.google.javascript.jscomp.NodeTraversal.Callback {
		java.util.Set<com.google.javascript.rhino.Node> nodesToKeep;

		FindReferences() {
			nodesToKeep = com.google.common.collect.Sets.newHashSet();
		}

		private void addAllChildren(com.google.javascript.rhino.Node n) {
			nodesToKeep.add(n);
			for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
				addAllChildren(child);
			}
		}

		private void addSimplifiedChildren(com.google.javascript.rhino.Node n) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, n, new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback(compiler, new com.google.javascript.jscomp.NameAnalyzer.FindReferences.NodeAccumulator()));
		}

		private void addSimplifiedExpression(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (parent.isVar()) {
				com.google.javascript.rhino.Node value = n.getFirstChild();
				if (value != null) {
					addSimplifiedChildren(value);
				}
			}else
				if ((n.isAssign()) && (((parent.isExprResult()) || (parent.isFor())) || (parent.isReturn()))) {
					for (com.google.javascript.rhino.Node child : n.children()) {
						addSimplifiedChildren(child);
					}
				}else
					if ((n.isCall()) && (parent.isExprResult())) {
						addSimplifiedChildren(n);
					}else {
						addAllChildren(n);
					}
				
			
		}

		@java.lang.Override
		public boolean shouldTraverse(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (parent == null) {
				return true;
			}
			if (n.isFor()) {
				if (!(com.google.javascript.jscomp.NodeUtil.isForIn(n))) {
					com.google.javascript.rhino.Node decl = n.getFirstChild();
					com.google.javascript.rhino.Node pred = decl.getNext();
					com.google.javascript.rhino.Node step = pred.getNext();
					addSimplifiedExpression(decl, n);
					addSimplifiedExpression(pred, n);
					addSimplifiedExpression(step, n);
				}else {
					com.google.javascript.rhino.Node decl = n.getFirstChild();
					com.google.javascript.rhino.Node iter = decl.getNext();
					addAllChildren(decl);
					addAllChildren(iter);
				}
			}
			if ((((parent.isVar()) || (parent.isExprResult())) || (parent.isReturn())) || (parent.isThrow())) {
				addSimplifiedExpression(n, parent);
			}
			if ((((((parent.isIf()) || ((parent.getType()) == (com.google.javascript.rhino.Token.WHILE))) || ((parent.getType()) == (com.google.javascript.rhino.Token.WITH))) || (parent.isSwitch())) || (parent.isCase())) && ((parent.getFirstChild()) == n)) {
				addAllChildren(n);
			}
			if ((parent.isDo()) && ((parent.getLastChild()) == n)) {
				addAllChildren(n);
			}
			return true;
		}

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!((n.isName()) || ((com.google.javascript.jscomp.NodeUtil.isGet(n)) && (!(parent.isGetProp()))))) {
				return ;
			}
			com.google.javascript.jscomp.NameAnalyzer.NameInformation nameInfo = createNameInformation(t, n, parent);
			if (nameInfo == null) {
				return ;
			}
			if (nameInfo.onlyAffectsClassDef) {
				if ((nameInfo.superclass) != null) {
					recordReference(nameInfo.name, nameInfo.superclass, com.google.javascript.jscomp.NameAnalyzer.RefType.INHERITANCE);
				}
				java.lang.String nodeName = n.getQualifiedName();
				if (nodeName != null) {
					recordReference(nameInfo.name, nodeName, com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
				}
				return ;
			}
			if ((((parent.getType()) == (com.google.javascript.rhino.Token.INSTANCEOF)) && ((parent.getLastChild()) == n)) && (n.isQualifiedName())) {
				com.google.javascript.jscomp.NameAnalyzer.JsName checkedClass = getName(nameInfo.name, true);
				refNodes.add(new com.google.javascript.jscomp.NameAnalyzer.InstanceOfCheckNode(checkedClass, n, parent, parent.getParent()));
				checkedClass.hasInstanceOfReference = true;
				return ;
			}
			com.google.javascript.jscomp.NameAnalyzer.NameInformation referring = getDependencyScope(n);
			java.lang.String referringName = "";
			if (referring != null) {
				referringName = (referring.isPrototype) ? referring.prototypeClass : referring.name;
			}
			java.lang.String name = nameInfo.name;
			if (maybeHiddenAlias(name, n)) {
				recordAlias(name, com.google.javascript.jscomp.NameAnalyzer.WINDOW);
			}
			if (nameInfo.isExternallyReferenceable) {
				recordReference(com.google.javascript.jscomp.NameAnalyzer.WINDOW, name, com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
				maybeRecordAlias(name, parent, referring, referringName);
				return ;
			}
			if (com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(n, parent)) {
				if (referring != null) {
					recordReference(referringName, name, com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
				}
				return ;
			}
			if (nodesToKeep.contains(n)) {
				com.google.javascript.jscomp.NameAnalyzer.NameInformation functionScope = getEnclosingFunctionDependencyScope(t);
				if (functionScope != null) {
					recordReference(functionScope.name, name, com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
				}else {
					recordReference(com.google.javascript.jscomp.NameAnalyzer.WINDOW, name, com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
				}
			}else
				if (referring != null) {
					if (!(maybeRecordAlias(name, parent, referring, referringName))) {
						com.google.javascript.jscomp.NameAnalyzer.RefType depType = referring.onlyAffectsClassDef ? com.google.javascript.jscomp.NameAnalyzer.RefType.INHERITANCE : com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR;
						recordReference(referringName, name, depType);
					}
				}else {
					for (com.google.javascript.rhino.Node ancestor : n.getAncestors()) {
						if ((com.google.javascript.jscomp.NodeUtil.isAssignmentOp(ancestor)) || (ancestor.isFunction())) {
							recordReference(com.google.javascript.jscomp.NameAnalyzer.WINDOW, name, com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
							break;
						}
					}
				}
			
		}

		private boolean maybeHiddenAlias(java.lang.String name, com.google.javascript.rhino.Node n) {
			com.google.javascript.rhino.Node parent = n.getParent();
			if (com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(n, parent)) {
				com.google.javascript.rhino.Node rhs = parent.isVar() ? n.getFirstChild() : parent.getLastChild();
				return (rhs != null) && (!(com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(rhs, com.google.javascript.jscomp.NameAnalyzer.NON_LOCAL_RESULT_PREDICATE)));
			}
			return false;
		}

		private boolean maybeRecordAlias(java.lang.String name, com.google.javascript.rhino.Node parent, com.google.javascript.jscomp.NameAnalyzer.NameInformation referring, java.lang.String referringName) {
			if ((((parent.isName()) || (parent.isAssign())) && (referring != null)) && ((scopes.get(parent)) == referring)) {
				recordAlias(referringName, name);
				return true;
			}
			return false;
		}

		private class NodeAccumulator implements com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.SideEffectAccumulator {
			@java.lang.Override
			public boolean classDefiningCallsHaveSideEffects() {
				return false;
			}

			@java.lang.Override
			public void keepSubTree(com.google.javascript.rhino.Node original) {
				addAllChildren(original);
			}

			@java.lang.Override
			public void keepSimplifiedShortCircuitExpression(com.google.javascript.rhino.Node original) {
				com.google.javascript.rhino.Node condition = original.getFirstChild();
				com.google.javascript.rhino.Node thenBranch = condition.getNext();
				addAllChildren(condition);
				addSimplifiedChildren(thenBranch);
			}

			@java.lang.Override
			public void keepSimplifiedHookExpression(com.google.javascript.rhino.Node hook, boolean thenHasSideEffects, boolean elseHasSideEffects) {
				com.google.javascript.rhino.Node condition = hook.getFirstChild();
				com.google.javascript.rhino.Node thenBranch = condition.getNext();
				com.google.javascript.rhino.Node elseBranch = thenBranch.getNext();
				addAllChildren(condition);
				if (thenHasSideEffects) {
					addSimplifiedChildren(thenBranch);
				}
				if (elseHasSideEffects) {
					addSimplifiedChildren(elseBranch);
				}
			}
		}
	}

	private class RemoveListener implements com.google.javascript.jscomp.AstChangeProxy.ChangeListener {
		@java.lang.Override
		public void nodeRemoved(com.google.javascript.rhino.Node n) {
			compiler.reportCodeChange();
		}
	}

	NameAnalyzer(com.google.javascript.jscomp.AbstractCompiler compiler, boolean removeUnreferenced) {
		this.compiler = compiler;
		this.removeUnreferenced = removeUnreferenced;
		this.globalNames = com.google.javascript.jscomp.NameAnalyzer.DEFAULT_GLOBAL_NAMES;
		this.changeProxy = new com.google.javascript.jscomp.AstChangeProxy();
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.NameAnalyzer.ProcessExternals());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.NameAnalyzer.FindDependencyScopes());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.NameAnalyzer.HoistVariableAndFunctionDeclarations());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.NameAnalyzer.FindDeclarationsAndSetters());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.NameAnalyzer.FindReferences());
		referenceParentNames();
		referenceAliases();
		calculateReferences();
		if (removeUnreferenced) {
			removeUnreferenced();
		}
	}

	private void recordAlias(java.lang.String fromName, java.lang.String toName) {
		recordReference(fromName, toName, com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
		com.google.javascript.jscomp.NameAnalyzer.AliasSet toNameAliasSet = aliases.get(toName);
		com.google.javascript.jscomp.NameAnalyzer.AliasSet fromNameAliasSet = aliases.get(fromName);
		com.google.javascript.jscomp.NameAnalyzer.AliasSet resultSet = null;
		if ((toNameAliasSet == null) && (fromNameAliasSet == null)) {
			resultSet = new com.google.javascript.jscomp.NameAnalyzer.AliasSet(toName, fromName);
		}else
			if ((toNameAliasSet != null) && (fromNameAliasSet != null)) {
				resultSet = toNameAliasSet;
				resultSet.names.addAll(fromNameAliasSet.names);
				for (java.lang.String name : fromNameAliasSet.names) {
					aliases.put(name, resultSet);
				}
			}else
				if (toNameAliasSet != null) {
					resultSet = toNameAliasSet;
					resultSet.names.add(fromName);
				}else {
					resultSet = fromNameAliasSet;
					resultSet.names.add(toName);
				}
			
		
		aliases.put(fromName, resultSet);
		aliases.put(toName, resultSet);
	}

	private void recordReference(java.lang.String fromName, java.lang.String toName, com.google.javascript.jscomp.NameAnalyzer.RefType depType) {
		if (fromName.equals(toName)) {
			return ;
		}
		com.google.javascript.jscomp.NameAnalyzer.JsName from = getName(fromName, true);
		com.google.javascript.jscomp.NameAnalyzer.JsName to = getName(toName, true);
		referenceGraph.createNode(from);
		referenceGraph.createNode(to);
		if (!(referenceGraph.isConnectedInDirection(from, depType, to))) {
			referenceGraph.connect(from, depType, to);
		}
	}

	void removeUnreferenced() {
		com.google.javascript.jscomp.NameAnalyzer.RemoveListener listener = new com.google.javascript.jscomp.NameAnalyzer.RemoveListener();
		changeProxy.registerListener(listener);
		for (com.google.javascript.jscomp.NameAnalyzer.RefNode refNode : refNodes) {
			com.google.javascript.jscomp.NameAnalyzer.JsName name = refNode.name();
			if ((!(name.referenced)) && (!(name.externallyDefined))) {
				refNode.remove();
			}
		}
		changeProxy.unregisterListener(listener);
	}

	java.lang.String getHtmlReport() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		sb.append(("<html><body><style type=\"text/css\">" + ((("body, td, p {font-family: Arial; font-size: 83%} " + "ul {margin-top:2px; margin-left:0px; padding-left:1em;} ") + "li {margin-top:3px; margin-left:24px; padding-left:0px;") + "padding-bottom: 4px}</style>")));
		sb.append("OVERALL STATS<ul>");
		appendListItem(sb, ("Total Names: " + (countOf(com.google.javascript.jscomp.NameAnalyzer.TriState.BOTH, com.google.javascript.jscomp.NameAnalyzer.TriState.BOTH))));
		appendListItem(sb, ("Total Classes: " + (countOf(com.google.javascript.jscomp.NameAnalyzer.TriState.TRUE, com.google.javascript.jscomp.NameAnalyzer.TriState.BOTH))));
		appendListItem(sb, ("Total Static Functions: " + (countOf(com.google.javascript.jscomp.NameAnalyzer.TriState.FALSE, com.google.javascript.jscomp.NameAnalyzer.TriState.BOTH))));
		appendListItem(sb, ("Referenced Names: " + (countOf(com.google.javascript.jscomp.NameAnalyzer.TriState.BOTH, com.google.javascript.jscomp.NameAnalyzer.TriState.TRUE))));
		appendListItem(sb, ("Referenced Classes: " + (countOf(com.google.javascript.jscomp.NameAnalyzer.TriState.TRUE, com.google.javascript.jscomp.NameAnalyzer.TriState.TRUE))));
		appendListItem(sb, ("Referenced Functions: " + (countOf(com.google.javascript.jscomp.NameAnalyzer.TriState.FALSE, com.google.javascript.jscomp.NameAnalyzer.TriState.TRUE))));
		sb.append("</ul>");
		sb.append("ALL NAMES<ul>\n");
		for (com.google.javascript.jscomp.NameAnalyzer.JsName node : allNames.values()) {
			sb.append((("<li>" + (nameAnchor(node.name))) + "<ul>"));
			if ((node.prototypeNames.size()) > 0) {
				sb.append("<li>PROTOTYPES: ");
				java.util.Iterator<java.lang.String> protoIter = node.prototypeNames.iterator();
				while (protoIter.hasNext()) {
					sb.append(protoIter.next());
					if (protoIter.hasNext()) {
						sb.append(", ");
					}
				} 
			}
			if (referenceGraph.hasNode(node)) {
				java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType>> refersTo = referenceGraph.getOutEdges(node);
				if ((refersTo.size()) > 0) {
					sb.append("<li>REFERS TO: ");
					java.util.Iterator<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType>> toIter = refersTo.iterator();
					while (toIter.hasNext()) {
						sb.append(nameLink(toIter.next().getDestination().getValue().name));
						if (toIter.hasNext()) {
							sb.append(", ");
						}
					} 
				}
				java.util.List<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType>> referencedBy = referenceGraph.getInEdges(node);
				if ((referencedBy.size()) > 0) {
					sb.append("<li>REFERENCED BY: ");
					java.util.Iterator<com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge<com.google.javascript.jscomp.NameAnalyzer.JsName, com.google.javascript.jscomp.NameAnalyzer.RefType>> fromIter = refersTo.iterator();
					while (fromIter.hasNext()) {
						sb.append(nameLink(fromIter.next().getDestination().getValue().name));
						if (fromIter.hasNext()) {
							sb.append(", ");
						}
					} 
				}
			}
			sb.append("</li>");
			sb.append("</ul></li>");
		}
		sb.append("</ul>");
		sb.append("</body></html>");
		return sb.toString();
	}

	private void appendListItem(java.lang.StringBuilder sb, java.lang.String text) {
		sb.append((("<li>" + text) + "</li>\n"));
	}

	private java.lang.String nameLink(java.lang.String name) {
		return ((("<a href=\"#" + name) + "\">") + name) + "</a>";
	}

	private java.lang.String nameAnchor(java.lang.String name) {
		return ((("<a name=\"" + name) + "\">") + name) + "</a>";
	}

	private com.google.javascript.jscomp.NameAnalyzer.JsName getName(java.lang.String name, boolean canCreate) {
		if (canCreate) {
			createName(name);
		}
		return allNames.get(name);
	}

	private void createName(java.lang.String name) {
		com.google.javascript.jscomp.NameAnalyzer.JsName jsn = allNames.get(name);
		if (jsn == null) {
			jsn = new com.google.javascript.jscomp.NameAnalyzer.JsName();
			jsn.name = name;
			allNames.put(name, jsn);
		}
	}

	private void referenceAliases() {
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.NameAnalyzer.AliasSet> entry : aliases.entrySet()) {
			com.google.javascript.jscomp.NameAnalyzer.JsName name = getName(entry.getKey(), false);
			if ((name.hasWrittenDescendants) || (name.hasInstanceOfReference)) {
				for (java.lang.String alias : entry.getValue().names) {
					recordReference(alias, entry.getKey(), com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
				}
			}
		}
	}

	private void referenceParentNames() {
		java.util.Set<com.google.javascript.jscomp.NameAnalyzer.JsName> allNamesCopy = com.google.common.collect.Sets.newHashSet(allNames.values());
		for (com.google.javascript.jscomp.NameAnalyzer.JsName name : allNamesCopy) {
			java.lang.String curName = name.name;
			com.google.javascript.jscomp.NameAnalyzer.JsName curJsName = name;
			while ((curName.indexOf('.')) != (-1)) {
				java.lang.String parentName = curName.substring(0, curName.lastIndexOf('.'));
				if (!(globalNames.contains(parentName))) {
					com.google.javascript.jscomp.NameAnalyzer.JsName parentJsName = getName(parentName, true);
					recordReference(curJsName.name, parentJsName.name, com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
					recordReference(parentJsName.name, curJsName.name, com.google.javascript.jscomp.NameAnalyzer.RefType.REGULAR);
					curJsName = parentJsName;
				}
				curName = parentName;
			} 
		}
	}

	private com.google.javascript.jscomp.NameAnalyzer.NameInformation createNameInformation(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		java.lang.String name = "";
		com.google.javascript.rhino.Node rootNameNode = n;
		boolean bNameWasShortened = false;
		while (true) {
			if (com.google.javascript.jscomp.NodeUtil.isGet(rootNameNode)) {
				com.google.javascript.rhino.Node prop = rootNameNode.getLastChild();
				if (rootNameNode.isGetProp()) {
					name = ("." + (prop.getString())) + name;
				}else {
					bNameWasShortened = true;
					name = "";
				}
				rootNameNode = rootNameNode.getFirstChild();
			}else
				if (com.google.javascript.jscomp.NodeUtil.isObjectLitKey(rootNameNode, rootNameNode.getParent())) {
					name = ("." + (rootNameNode.getString())) + name;
					com.google.javascript.rhino.Node objLit = rootNameNode.getParent();
					com.google.javascript.rhino.Node objLitParent = objLit.getParent();
					if (objLitParent.isAssign()) {
						rootNameNode = objLitParent.getFirstChild();
					}else
						if (objLitParent.isName()) {
							rootNameNode = objLitParent;
						}else
							if (objLitParent.isString()) {
								rootNameNode = objLitParent;
							}else {
								return null;
							}
						
					
				}else {
					break;
				}
			
		} 
		if ((parent.isCall()) && (t.inGlobalScope())) {
			com.google.javascript.jscomp.CodingConvention convention = compiler.getCodingConvention();
			com.google.javascript.jscomp.CodingConvention.SubclassRelationship classes = convention.getClassesDefinedByCall(parent);
			if (classes != null) {
				com.google.javascript.jscomp.NameAnalyzer.NameInformation nameInfo = new com.google.javascript.jscomp.NameAnalyzer.NameInformation();
				nameInfo.name = classes.subclassName;
				nameInfo.onlyAffectsClassDef = true;
				nameInfo.superclass = classes.superclassName;
				return nameInfo;
			}
			java.lang.String singletonGetterClass = convention.getSingletonGetterClassName(parent);
			if (singletonGetterClass != null) {
				com.google.javascript.jscomp.NameAnalyzer.NameInformation nameInfo = new com.google.javascript.jscomp.NameAnalyzer.NameInformation();
				nameInfo.name = singletonGetterClass;
				nameInfo.onlyAffectsClassDef = true;
				return nameInfo;
			}
		}
		switch (rootNameNode.getType()) {
			case com.google.javascript.rhino.Token.NAME :
				if ((((!bNameWasShortened) && (n.isGetProp())) && (parent.isAssign())) && ("prototype".equals(n.getLastChild().getString()))) {
					if ((createNameInformation(t, n.getFirstChild(), n)) != null) {
						name = (rootNameNode.getString()) + name;
						name = name.substring(0, ((name.length()) - (com.google.javascript.jscomp.NameAnalyzer.PROTOTYPE_SUFFIX_LEN)));
						com.google.javascript.jscomp.NameAnalyzer.NameInformation nameInfo = new com.google.javascript.jscomp.NameAnalyzer.NameInformation();
						nameInfo.name = name;
						return nameInfo;
					}else {
						return null;
					}
				}
				return createNameInformation(((rootNameNode.getString()) + name), t.getScope(), rootNameNode);
			case com.google.javascript.rhino.Token.THIS :
				if (t.inGlobalScope()) {
					com.google.javascript.jscomp.NameAnalyzer.NameInformation nameInfo = new com.google.javascript.jscomp.NameAnalyzer.NameInformation();
					if ((name.indexOf('.')) == 0) {
						nameInfo.name = name.substring(1);
					}else {
						nameInfo.name = name;
					}
					nameInfo.isExternallyReferenceable = true;
					return nameInfo;
				}
				return null;
			default :
				return null;
		}
	}

	private com.google.javascript.jscomp.NameAnalyzer.NameInformation createNameInformation(java.lang.String name, com.google.javascript.jscomp.Scope scope, com.google.javascript.rhino.Node rootNameNode) {
		java.lang.String rootName = rootNameNode.getString();
		com.google.javascript.jscomp.Scope.Var v = scope.getVar(rootName);
		boolean isExtern = (v == null) && (externalNames.contains(rootName));
		boolean isGlobalRef = (((v != null) && (v.isGlobal())) || isExtern) || (rootName.equals(com.google.javascript.jscomp.NameAnalyzer.WINDOW));
		if (!isGlobalRef) {
			return null;
		}
		com.google.javascript.jscomp.NameAnalyzer.NameInformation nameInfo = new com.google.javascript.jscomp.NameAnalyzer.NameInformation();
		int idx = name.indexOf(com.google.javascript.jscomp.NameAnalyzer.PROTOTYPE_SUBSTRING);
		if (idx != (-1)) {
			nameInfo.isPrototype = true;
			nameInfo.prototypeClass = name.substring(0, idx);
			nameInfo.prototypeProperty = name.substring((idx + (com.google.javascript.jscomp.NameAnalyzer.PROTOTYPE_SUBSTRING_LEN)));
		}
		nameInfo.name = name;
		nameInfo.isExternallyReferenceable = isExtern || (isExternallyReferenceable(scope, name));
		return nameInfo;
	}

	private boolean isExternallyReferenceable(com.google.javascript.jscomp.Scope scope, java.lang.String name) {
		if (compiler.getCodingConvention().isExported(name)) {
			return true;
		}
		if (scope.isLocal()) {
			return false;
		}
		for (java.lang.String s : globalNames) {
			if (name.startsWith(s)) {
				return true;
			}
		}
		return false;
	}

	private com.google.javascript.jscomp.NameAnalyzer.NameInformation getDependencyScope(com.google.javascript.rhino.Node n) {
		for (com.google.javascript.rhino.Node node : n.getAncestors()) {
			com.google.javascript.jscomp.NameAnalyzer.NameInformation ref = scopes.get(node);
			if (ref != null) {
				return ref;
			}
		}
		return null;
	}

	private com.google.javascript.jscomp.NameAnalyzer.NameInformation getEnclosingFunctionDependencyScope(com.google.javascript.jscomp.NodeTraversal t) {
		com.google.javascript.rhino.Node function = t.getEnclosingFunction();
		if (function == null) {
			return null;
		}
		com.google.javascript.jscomp.NameAnalyzer.NameInformation ref = scopes.get(function);
		if (ref != null) {
			return ref;
		}
		com.google.javascript.rhino.Node parent = function.getParent();
		if (parent != null) {
			while (parent.isHook()) {
				parent = parent.getParent();
			} 
			if (parent.isName()) {
				return scopes.get(parent);
			}
			if (parent.isAssign()) {
				return scopes.get(parent);
			}
		}
		return null;
	}

	private void calculateReferences() {
		com.google.javascript.jscomp.NameAnalyzer.JsName window = getName(com.google.javascript.jscomp.NameAnalyzer.WINDOW, true);
		window.referenced = true;
		com.google.javascript.jscomp.NameAnalyzer.JsName function = getName(com.google.javascript.jscomp.NameAnalyzer.FUNCTION, true);
		function.referenced = true;
		com.google.javascript.jscomp.graph.FixedPointGraphTraversal.newTraversal(new com.google.javascript.jscomp.NameAnalyzer.ReferencePropagationCallback()).computeFixedPoint(referenceGraph);
	}

	private enum TriState {
TRUE, FALSE, BOTH;	}

	private int countOf(com.google.javascript.jscomp.NameAnalyzer.TriState isClass, com.google.javascript.jscomp.NameAnalyzer.TriState referenced) {
		int count = 0;
		for (com.google.javascript.jscomp.NameAnalyzer.JsName name : allNames.values()) {
			boolean nodeIsClass = (name.prototypeNames.size()) > 0;
			boolean classMatch = ((isClass == (com.google.javascript.jscomp.NameAnalyzer.TriState.BOTH)) || (nodeIsClass && (isClass == (com.google.javascript.jscomp.NameAnalyzer.TriState.TRUE)))) || ((!nodeIsClass) && (isClass == (com.google.javascript.jscomp.NameAnalyzer.TriState.FALSE)));
			boolean referenceMatch = ((referenced == (com.google.javascript.jscomp.NameAnalyzer.TriState.BOTH)) || ((name.referenced) && (referenced == (com.google.javascript.jscomp.NameAnalyzer.TriState.TRUE)))) || ((!(name.referenced)) && (referenced == (com.google.javascript.jscomp.NameAnalyzer.TriState.FALSE)));
			if ((classMatch && referenceMatch) && (!(name.externallyDefined))) {
				count++;
			}
		}
		return count;
	}

	private java.util.List<com.google.javascript.rhino.Node> getSideEffectNodes(com.google.javascript.rhino.Node n) {
		java.util.List<com.google.javascript.rhino.Node> subexpressions = com.google.common.collect.Lists.newArrayList();
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, n, new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback(compiler, new com.google.javascript.jscomp.GatherSideEffectSubexpressionsCallback.CopySideEffectSubexpressions(compiler, subexpressions)));
		java.util.List<com.google.javascript.rhino.Node> replacements = com.google.common.collect.Lists.newArrayListWithExpectedSize(subexpressions.size());
		for (com.google.javascript.rhino.Node subexpression : subexpressions) {
			replacements.add(com.google.javascript.jscomp.NodeUtil.newExpr(subexpression));
		}
		return replacements;
	}

	private void replaceWithRhs(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node n) {
		if (valueConsumedByParent(n, parent)) {
			java.util.List<com.google.javascript.rhino.Node> replacements = getRhsSubexpressions(n);
			java.util.List<com.google.javascript.rhino.Node> newReplacements = com.google.common.collect.Lists.newArrayList();
			for (int i = 0; i < ((replacements.size()) - 1); i++) {
				newReplacements.addAll(getSideEffectNodes(replacements.get(i)));
			}
			com.google.javascript.rhino.Node valueExpr = replacements.get(((replacements.size()) - 1));
			valueExpr.detachFromParent();
			newReplacements.add(valueExpr);
			changeProxy.replaceWith(parent, n, collapseReplacements(newReplacements));
		}else
			if ((n.isAssign()) && ((parent.getType()) != (com.google.javascript.rhino.Token.FOR))) {
				com.google.javascript.rhino.Node replacement = n.getLastChild();
				replacement.detachFromParent();
				changeProxy.replaceWith(parent, n, replacement);
			}else {
				replaceTopLevelExpressionWithRhs(parent, n);
			}
		
	}

	private void replaceTopLevelExpressionWithRhs(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node n) {
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.BLOCK :
			case com.google.javascript.rhino.Token.SCRIPT :
			case com.google.javascript.rhino.Token.FOR :
			case com.google.javascript.rhino.Token.LABEL :
				break;
			default :
				throw new java.lang.IllegalArgumentException(("Unsupported parent node type in replaceWithRhs " + (com.google.javascript.rhino.Token.name(parent.getType()))));
		}
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.EXPR_RESULT :
			case com.google.javascript.rhino.Token.FUNCTION :
			case com.google.javascript.rhino.Token.VAR :
				break;
			case com.google.javascript.rhino.Token.ASSIGN :
				com.google.common.base.Preconditions.checkArgument(parent.isFor(), "Unsupported assignment in replaceWithRhs. parent: %s", com.google.javascript.rhino.Token.name(parent.getType()));
				break;
			default :
				throw new java.lang.IllegalArgumentException(("Unsupported node type in replaceWithRhs " + (com.google.javascript.rhino.Token.name(n.getType()))));
		}
		java.util.List<com.google.javascript.rhino.Node> replacements = com.google.common.collect.Lists.newArrayList();
		for (com.google.javascript.rhino.Node rhs : getRhsSubexpressions(n)) {
			replacements.addAll(getSideEffectNodes(rhs));
		}
		if (parent.isFor()) {
			if (replacements.isEmpty()) {
				replacements.add(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.EMPTY));
			}else {
				com.google.javascript.rhino.Node expr = collapseReplacements(replacements);
				replacements.clear();
				replacements.add(expr);
			}
		}
		changeProxy.replaceWith(parent, n, replacements);
	}

	private boolean valueConsumedByParent(com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
		if (com.google.javascript.jscomp.NodeUtil.isAssignmentOp(parent)) {
			return (parent.getLastChild()) == n;
		}
		switch (parent.getType()) {
			case com.google.javascript.rhino.Token.NAME :
			case com.google.javascript.rhino.Token.RETURN :
				return true;
			case com.google.javascript.rhino.Token.AND :
			case com.google.javascript.rhino.Token.OR :
			case com.google.javascript.rhino.Token.HOOK :
				return (parent.getFirstChild()) == n;
			case com.google.javascript.rhino.Token.FOR :
				return (parent.getFirstChild().getNext()) == n;
			case com.google.javascript.rhino.Token.IF :
			case com.google.javascript.rhino.Token.WHILE :
				return (parent.getFirstChild()) == n;
			case com.google.javascript.rhino.Token.DO :
				return (parent.getLastChild()) == n;
			default :
				return false;
		}
	}

	private com.google.javascript.rhino.Node collapseReplacements(java.util.List<com.google.javascript.rhino.Node> replacements) {
		com.google.javascript.rhino.Node expr = null;
		for (com.google.javascript.rhino.Node rep : replacements) {
			if (rep.isExprResult()) {
				rep = rep.getFirstChild();
				rep.detachFromParent();
			}
			if (expr == null) {
				expr = rep;
			}else {
				expr = new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.COMMA, expr, rep);
			}
		}
		return expr;
	}

	private java.util.List<com.google.javascript.rhino.Node> getRhsSubexpressions(com.google.javascript.rhino.Node n) {
		switch (n.getType()) {
			case com.google.javascript.rhino.Token.EXPR_RESULT :
				return getRhsSubexpressions(n.getFirstChild());
			case com.google.javascript.rhino.Token.FUNCTION :
				return java.util.Collections.emptyList();
			case com.google.javascript.rhino.Token.NAME :
				{
					com.google.javascript.rhino.Node rhs = n.getFirstChild();
					if (rhs != null) {
						return com.google.common.collect.Lists.newArrayList(rhs);
					}else {
						return java.util.Collections.emptyList();
					}
				}
			case com.google.javascript.rhino.Token.ASSIGN :
				{
					com.google.javascript.rhino.Node lhs = n.getFirstChild();
					com.google.javascript.rhino.Node rhs = lhs.getNext();
					return com.google.common.collect.Lists.newArrayList(lhs, rhs);
				}
			case com.google.javascript.rhino.Token.VAR :
				{
					java.util.List<com.google.javascript.rhino.Node> nodes = com.google.common.collect.Lists.newArrayList();
					for (com.google.javascript.rhino.Node child : n.children()) {
						nodes.addAll(getRhsSubexpressions(child));
					}
					return nodes;
				}
			default :
				throw new java.lang.IllegalArgumentException(("AstChangeProxy::getRhs " + n));
		}
	}
}

