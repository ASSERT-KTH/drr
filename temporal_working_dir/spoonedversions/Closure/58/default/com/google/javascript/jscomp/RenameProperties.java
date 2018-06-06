

package com.google.javascript.jscomp;


class RenameProperties implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean generatePseudoNames;

	private final com.google.javascript.jscomp.VariableMap prevUsedPropertyMap;

	private final java.util.List<com.google.javascript.rhino.Node> stringNodesToRename = new java.util.ArrayList<com.google.javascript.rhino.Node>();

	private final java.util.Map<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node> callNodeToParentMap = new java.util.HashMap<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node>();

	private final char[] reservedCharacters;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.RenameProperties.Property> propertyMap = new java.util.HashMap<java.lang.String, com.google.javascript.jscomp.RenameProperties.Property>();

	private final com.google.javascript.jscomp.graph.UndiGraph<com.google.javascript.jscomp.RenameProperties.Property, com.google.javascript.jscomp.RenameProperties.PropertyAffinity> affinityGraph;

	private final java.util.Set<java.lang.String> externedNames = new java.util.HashSet<java.lang.String>(java.util.Arrays.asList("prototype"));

	private final java.util.Set<java.lang.String> quotedNames = new java.util.HashSet<java.lang.String>();

	private static final java.util.Comparator<com.google.javascript.jscomp.RenameProperties.Property> FREQUENCY_COMPARATOR = new java.util.Comparator<com.google.javascript.jscomp.RenameProperties.Property>() {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.RenameProperties.Property p1, com.google.javascript.jscomp.RenameProperties.Property p2) {
			if ((p1.numOccurrences) != (p2.numOccurrences)) {
				return (p2.numOccurrences) - (p1.numOccurrences);
			}else
				if ((p1.affinityScore) != (p2.affinityScore)) {
					return (p2.affinityScore) - (p1.affinityScore);
				}
			
			return p1.oldName.compareTo(p2.oldName);
		}
	};

	static final java.lang.String RENAME_PROPERTY_FUNCTION_NAME = "JSCompiler_renameProperty";

	static final com.google.javascript.jscomp.DiagnosticType BAD_CALL = com.google.javascript.jscomp.DiagnosticType.error("JSC_BAD_RENAME_PROPERTY_FUNCTION_NAME_CALL", ((("Bad " + (com.google.javascript.jscomp.RenameProperties.RENAME_PROPERTY_FUNCTION_NAME)) + " call - ") + "argument must be a string literal"));

	static final com.google.javascript.jscomp.DiagnosticType BAD_ARG = com.google.javascript.jscomp.DiagnosticType.error("JSC_BAD_RENAME_PROPERTY_FUNCTION_NAME_ARG", ((("Bad " + (com.google.javascript.jscomp.RenameProperties.RENAME_PROPERTY_FUNCTION_NAME)) + " argument - ") + "'{0}' is not a valid JavaScript identifier"));

	RenameProperties(com.google.javascript.jscomp.AbstractCompiler compiler, boolean affinity, boolean generatePseudoNames) {
		this(compiler, affinity, generatePseudoNames, null, null);
	}

	RenameProperties(com.google.javascript.jscomp.AbstractCompiler compiler, boolean affinity, boolean generatePseudoNames, com.google.javascript.jscomp.VariableMap prevUsedPropertyMap) {
		this(compiler, affinity, generatePseudoNames, prevUsedPropertyMap, null);
	}

	RenameProperties(com.google.javascript.jscomp.AbstractCompiler compiler, boolean affinity, boolean generatePseudoNames, com.google.javascript.jscomp.VariableMap prevUsedPropertyMap, @javax.annotation.Nullable
	char[] reservedCharacters) {
		this.compiler = compiler;
		this.generatePseudoNames = generatePseudoNames;
		this.prevUsedPropertyMap = prevUsedPropertyMap;
		this.reservedCharacters = reservedCharacters;
		if (affinity) {
			this.affinityGraph = com.google.javascript.jscomp.graph.LinkedUndirectedGraph.createWithoutAnnotations();
		}else {
			this.affinityGraph = null;
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.common.base.Preconditions.checkState(compiler.getLifeCycleStage().isNormalized());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.RenameProperties.ProcessExterns());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RenameProperties.ProcessProperties());
		java.util.Set<java.lang.String> reservedNames = new java.util.HashSet<java.lang.String>(((externedNames.size()) + (quotedNames.size())));
		reservedNames.addAll(externedNames);
		reservedNames.addAll(quotedNames);
		if ((prevUsedPropertyMap) != null) {
			reusePropertyNames(reservedNames, propertyMap.values());
		}
		compiler.addToDebugLog("JS property assignments:");
		if ((affinityGraph) != null) {
			computeAffinityScores();
		}
		java.util.Set<com.google.javascript.jscomp.RenameProperties.Property> propsByFreq = new java.util.TreeSet<com.google.javascript.jscomp.RenameProperties.Property>(com.google.javascript.jscomp.RenameProperties.FREQUENCY_COMPARATOR);
		propsByFreq.addAll(propertyMap.values());
		generateNames(propsByFreq, reservedNames);
		boolean changed = false;
		for (com.google.javascript.rhino.Node n : stringNodesToRename) {
			java.lang.String oldName = n.getString();
			com.google.javascript.jscomp.RenameProperties.Property p = propertyMap.get(oldName);
			if ((p != null) && ((p.newName) != null)) {
				com.google.common.base.Preconditions.checkState(oldName.equals(p.oldName));
				n.setString(p.newName);
				changed = changed || (!(p.newName.equals(oldName)));
			}
		}
		for (java.util.Map.Entry<com.google.javascript.rhino.Node, com.google.javascript.rhino.Node> nodeEntry : callNodeToParentMap.entrySet()) {
			com.google.javascript.rhino.Node parent = nodeEntry.getValue();
			com.google.javascript.rhino.Node firstArg = nodeEntry.getKey().getFirstChild().getNext();
			java.lang.StringBuilder sb = new java.lang.StringBuilder();
			for (java.lang.String oldName : firstArg.getString().split("[.]")) {
				com.google.javascript.jscomp.RenameProperties.Property p = propertyMap.get(oldName);
				java.lang.String replacement;
				if ((p != null) && ((p.newName) != null)) {
					com.google.common.base.Preconditions.checkState(oldName.equals(p.oldName));
					replacement = p.newName;
				}else {
					replacement = oldName;
				}
				if ((sb.length()) > 0) {
					sb.append('.');
				}
				sb.append(replacement);
			}
			parent.replaceChild(nodeEntry.getKey(), com.google.javascript.rhino.Node.newString(sb.toString()));
			changed = true;
		}
		if (changed) {
			compiler.reportCodeChange();
		}
		compiler.setLifeCycleStage(com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED);
	}

	private void reusePropertyNames(java.util.Set<java.lang.String> reservedNames, java.util.Collection<com.google.javascript.jscomp.RenameProperties.Property> allProps) {
		for (com.google.javascript.jscomp.RenameProperties.Property prop : allProps) {
			java.lang.String prevName = prevUsedPropertyMap.lookupNewName(prop.oldName);
			if ((!(generatePseudoNames)) && (prevName != null)) {
				if (reservedNames.contains(prevName)) {
					continue;
				}
				prop.newName = prevName;
				reservedNames.add(prevName);
			}
		}
	}

	private void computeAffinityScores() {
		for (com.google.javascript.jscomp.RenameProperties.Property p : propertyMap.values()) {
			com.google.javascript.jscomp.graph.UndiGraph.UndiGraphNode<com.google.javascript.jscomp.RenameProperties.Property, com.google.javascript.jscomp.RenameProperties.PropertyAffinity> node = affinityGraph.getUndirectedGraphNode(p);
			int affinityScore = 0;
			for (java.util.Iterator<com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<com.google.javascript.jscomp.RenameProperties.Property, com.google.javascript.jscomp.RenameProperties.PropertyAffinity>> edgeIterator = node.getNeighborEdgesIterator(); edgeIterator.hasNext();) {
				com.google.javascript.jscomp.graph.UndiGraph.UndiGraphEdge<com.google.javascript.jscomp.RenameProperties.Property, com.google.javascript.jscomp.RenameProperties.PropertyAffinity> edge = edgeIterator.next();
				affinityScore += (edge.getValue().affinity) + (node == (edge.getNodeA()) ? edge.getNodeB().getValue().numOccurrences : edge.getNodeA().getValue().numOccurrences);
			}
			node.getValue().affinityScore = affinityScore;
		}
	}

	private void generateNames(java.util.Set<com.google.javascript.jscomp.RenameProperties.Property> props, java.util.Set<java.lang.String> reservedNames) {
		com.google.javascript.jscomp.NameGenerator nameGen = new com.google.javascript.jscomp.NameGenerator(reservedNames, "", reservedCharacters);
		for (com.google.javascript.jscomp.RenameProperties.Property p : props) {
			if (generatePseudoNames) {
				p.newName = ("$" + (p.oldName)) + "$";
			}else {
				if ((p.newName) == null) {
					p.newName = nameGen.generateNextName();
				}
			}
			reservedNames.add(p.newName);
			compiler.addToDebugLog((((p.oldName) + " => ") + (p.newName)));
		}
	}

	com.google.javascript.jscomp.VariableMap getPropertyMap() {
		java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (com.google.javascript.jscomp.RenameProperties.Property p : propertyMap.values()) {
			if ((p.newName) != null) {
				map.put(p.oldName, p.newName);
			}
		}
		return new com.google.javascript.jscomp.VariableMap(map);
	}

	private class ProcessExterns extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					if ((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) {
						externedNames.add(dest.getString());
					}
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
						externedNames.add(child.getString());
					}
					break;
			}
		}
	}

	private class ProcessProperties extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback implements com.google.javascript.jscomp.NodeTraversal.ScopedCallback {
		private java.util.Set<com.google.javascript.jscomp.RenameProperties.Property> currentHighAffinityProperties = null;

		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
					com.google.javascript.rhino.Node propNode = n.getFirstChild().getNext();
					if ((propNode.getType()) == (com.google.javascript.rhino.Token.STRING)) {
						maybeMarkCandidate(propNode);
					}
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					for (com.google.javascript.rhino.Node key = n.getFirstChild(); key != null; key = key.getNext()) {
						if (!(key.isQuotedString())) {
							maybeMarkCandidate(key);
						}else {
							quotedNames.add(key.getString());
						}
					}
					break;
				case com.google.javascript.rhino.Token.GETELEM :
					com.google.javascript.rhino.Node child = n.getLastChild();
					if ((child != null) && ((child.getType()) == (com.google.javascript.rhino.Token.STRING))) {
						quotedNames.add(child.getString());
					}
					break;
				case com.google.javascript.rhino.Token.CALL :
					com.google.javascript.rhino.Node fnName = n.getFirstChild();
					if (((fnName.getType()) == (com.google.javascript.rhino.Token.NAME)) && (com.google.javascript.jscomp.RenameProperties.RENAME_PROPERTY_FUNCTION_NAME.equals(fnName.getString()))) {
						callNodeToParentMap.put(n, parent);
						countCallCandidates(t, n);
					}
					break;
				case com.google.javascript.rhino.Token.FUNCTION :
					if (com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(n)) {
						java.lang.String name = n.getFirstChild().getString();
						if (com.google.javascript.jscomp.RenameProperties.RENAME_PROPERTY_FUNCTION_NAME.equals(name)) {
							if (com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent)) {
								parent.detachFromParent();
							}else {
								parent.removeChild(n);
							}
							compiler.reportCodeChange();
						}
					}else
						if (((parent.getType()) == (com.google.javascript.rhino.Token.NAME)) && (com.google.javascript.jscomp.RenameProperties.RENAME_PROPERTY_FUNCTION_NAME.equals(parent.getString()))) {
							com.google.javascript.rhino.Node varNode = parent.getParent();
							if ((varNode.getType()) == (com.google.javascript.rhino.Token.VAR)) {
								varNode.removeChild(parent);
								if (!(varNode.hasChildren())) {
									varNode.detachFromParent();
								}
								compiler.reportCodeChange();
							}
						}
					
					break;
			}
		}

		private void maybeMarkCandidate(com.google.javascript.rhino.Node n) {
			java.lang.String name = n.getString();
			if (!(externedNames.contains(name))) {
				stringNodesToRename.add(n);
				countPropertyOccurrence(name);
			}
		}

		private void countCallCandidates(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node callNode) {
			com.google.javascript.rhino.Node firstArg = callNode.getFirstChild().getNext();
			if ((firstArg.getType()) != (com.google.javascript.rhino.Token.STRING)) {
				t.report(callNode, com.google.javascript.jscomp.RenameProperties.BAD_CALL);
				return ;
			}
			for (java.lang.String name : firstArg.getString().split("[.]")) {
				if (!(com.google.javascript.rhino.TokenStream.isJSIdentifier(name))) {
					t.report(callNode, com.google.javascript.jscomp.RenameProperties.BAD_ARG, name);
					continue;
				}
				if (!(externedNames.contains(name))) {
					countPropertyOccurrence(name);
				}
			}
		}

		private void countPropertyOccurrence(java.lang.String name) {
			com.google.javascript.jscomp.RenameProperties.Property prop = propertyMap.get(name);
			if (prop == null) {
				prop = new com.google.javascript.jscomp.RenameProperties.Property(name);
				propertyMap.put(name, prop);
				if ((affinityGraph) != null) {
					affinityGraph.createNode(prop);
				}
			}
			(prop.numOccurrences)++;
			if ((currentHighAffinityProperties) != null) {
				currentHighAffinityProperties.add(prop);
			}
		}

		@java.lang.Override
		public void enterScope(com.google.javascript.jscomp.NodeTraversal t) {
			if ((!(t.inGlobalScope())) && (t.getScope().getParent().isGlobal())) {
				currentHighAffinityProperties = com.google.common.collect.Sets.newHashSet();
			}
		}

		@java.lang.Override
		public void exitScope(com.google.javascript.jscomp.NodeTraversal t) {
			if ((affinityGraph) == null) {
				return ;
			}
			if ((!(t.inGlobalScope())) && (t.getScope().getParent().isGlobal())) {
				for (com.google.javascript.jscomp.RenameProperties.Property p1 : currentHighAffinityProperties) {
					for (com.google.javascript.jscomp.RenameProperties.Property p2 : currentHighAffinityProperties) {
						if ((p1.oldName.compareTo(p2.oldName)) < 0) {
							com.google.javascript.jscomp.graph.Graph.GraphEdge<com.google.javascript.jscomp.RenameProperties.Property, com.google.javascript.jscomp.RenameProperties.PropertyAffinity> edge = affinityGraph.getFirstEdge(p1, p2);
							if (edge == null) {
								affinityGraph.connect(p1, new com.google.javascript.jscomp.RenameProperties.PropertyAffinity(1), p2);
							}else {
								edge.getValue().increase();
							}
						}
					}
				}
				currentHighAffinityProperties = null;
			}
		}
	}

	private class Property {
		final java.lang.String oldName;

		java.lang.String newName;

		int numOccurrences;

		int affinityScore = 0;

		Property(java.lang.String name) {
			this.oldName = name;
		}
	}

	private class PropertyAffinity {
		private int affinity = 0;

		private PropertyAffinity(int affinity) {
			com.google.javascript.jscomp.RenameProperties.PropertyAffinity.this.affinity = affinity;
		}

		private void increase() {
			(affinity)++;
		}
	}
}

