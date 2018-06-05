

package com.google.javascript.jscomp;


abstract class MethodCompilerPass implements com.google.javascript.jscomp.CompilerPass {
	final java.util.Set<java.lang.String> externMethods = com.google.common.collect.Sets.newHashSet();

	final java.util.Set<java.lang.String> externMethodsWithoutSignatures = com.google.common.collect.Sets.newHashSet();

	final java.util.Set<java.lang.String> nonMethodProperties = com.google.common.collect.Sets.newHashSet();

	final com.google.common.collect.Multimap<java.lang.String, com.google.javascript.rhino.Node> methodDefinitions = com.google.common.collect.LinkedHashMultimap.create();

	final com.google.javascript.jscomp.AbstractCompiler compiler;

	interface SignatureStore {
		public void reset();

		public void addSignature(java.lang.String functionName, com.google.javascript.rhino.Node functionNode, java.lang.String sourceFile);

		public void removeSignature(java.lang.String functionName);
	}

	MethodCompilerPass(com.google.javascript.jscomp.AbstractCompiler compiler) {
		this.compiler = compiler;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		externMethods.clear();
		externMethodsWithoutSignatures.clear();
		getSignatureStore().reset();
		methodDefinitions.clear();
		if (externs != null) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.MethodCompilerPass.GetExternMethods());
		}
		java.util.List<com.google.javascript.rhino.Node> externsAndJs = com.google.common.collect.Lists.newArrayList(externs, root);
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, com.google.common.collect.Lists.newArrayList(externs, root), new com.google.javascript.jscomp.MethodCompilerPass.GatherSignatures());
		com.google.javascript.jscomp.NodeTraversal.traverseRoots(compiler, externsAndJs, getActingCallback());
	}

	abstract com.google.javascript.jscomp.NodeTraversal.Callback getActingCallback();

	abstract com.google.javascript.jscomp.MethodCompilerPass.SignatureStore getSignatureStore();

	private void addPossibleSignature(java.lang.String name, com.google.javascript.rhino.Node node, com.google.javascript.jscomp.NodeTraversal t) {
		if ((node.getType()) == (com.google.javascript.rhino.Token.FUNCTION)) {
			addSignature(name, node, t.getSourceName());
		}else {
			nonMethodProperties.add(name);
		}
	}

	private void addSignature(java.lang.String name, com.google.javascript.rhino.Node function, java.lang.String fnSourceName) {
		if (externMethodsWithoutSignatures.contains(name)) {
			return ;
		}
		getSignatureStore().addSignature(name, function, fnSourceName);
		methodDefinitions.put(name, function);
	}

	private class GetExternMethods extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					{
						com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
						if ((dest.getType()) != (com.google.javascript.rhino.Token.STRING)) {
							return ;
						}
						java.lang.String name = dest.getString();
						if ((((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == n)) && ((n.getNext().getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
							addSignature(name, n.getNext(), t.getSourceName());
						}else {
							getSignatureStore().removeSignature(name);
							externMethodsWithoutSignatures.add(name);
						}
						externMethods.add(name);
					}
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					{
						for (com.google.javascript.rhino.Node key = n.getFirstChild(); key != null; key = key.getNext()) {
							com.google.javascript.rhino.Node value = key.getFirstChild();
							java.lang.String name = key.getString();
							if (((key.getType()) == (com.google.javascript.rhino.Token.STRING)) && ((value.getType()) == (com.google.javascript.rhino.Token.FUNCTION))) {
								addSignature(name, value, t.getSourceName());
							}else {
								getSignatureStore().removeSignature(name);
								externMethodsWithoutSignatures.add(name);
							}
							externMethods.add(name);
						}
					}
					break;
			}
		}
	}

	private class GatherSignatures extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					if ((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) {
						if (dest.getString().equals("prototype")) {
							processPrototypeParent(t, parent);
						}else {
							if (((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == n)) {
								addPossibleSignature(dest.getString(), n.getNext(), t);
							}
						}
					}
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					for (com.google.javascript.rhino.Node key = n.getFirstChild(); key != null; key = key.getNext()) {
						switch (key.getType()) {
							case com.google.javascript.rhino.Token.STRING :
								addPossibleSignature(key.getString(), key.getFirstChild(), t);
								break;
							case com.google.javascript.rhino.Token.SET :
							case com.google.javascript.rhino.Token.GET :
								nonMethodProperties.add(key.getString());
								break;
							default :
								throw new java.lang.IllegalStateException(("unexpect OBJECTLIT key: " + key));
						}
					}
					break;
			}
		}

		private void processPrototypeParent(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					com.google.javascript.rhino.Node parent = n.getParent().getParent();
					if (((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) && ((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN))) {
						com.google.javascript.rhino.Node assignee = parent.getFirstChild().getNext();
						addPossibleSignature(dest.getString(), assignee, t);
					}
					break;
			}
		}
	}
}

