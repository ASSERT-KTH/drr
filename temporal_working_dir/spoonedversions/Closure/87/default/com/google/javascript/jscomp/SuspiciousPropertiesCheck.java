

package com.google.javascript.jscomp;


class SuspiciousPropertiesCheck implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final com.google.javascript.jscomp.CheckLevel checkReads;

	private final com.google.javascript.jscomp.CheckLevel checkWrites;

	static final int MAX_REPORTS_PER_PROPERTY = 5;

	static final com.google.javascript.jscomp.DiagnosticType READ_WITHOUT_SET = com.google.javascript.jscomp.DiagnosticType.warning("JSC_READ_WITHOUT_SET", "property {0} is read here, but never set");

	static final com.google.javascript.jscomp.DiagnosticType SET_WITHOUT_READ = com.google.javascript.jscomp.DiagnosticType.warning("JSC_SET_WITHOUT_READ", "property {0} is set here, but never read");

	private static final java.util.regex.Pattern DOT_PATTERN = java.util.regex.Pattern.compile("\\.");

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.SuspiciousPropertiesCheck.Property> properties = com.google.common.collect.Maps.newHashMap();

	private java.util.Set<java.lang.String> externPropertyNames = com.google.common.collect.Sets.newHashSet();

	SuspiciousPropertiesCheck(com.google.javascript.jscomp.AbstractCompiler compiler, com.google.javascript.jscomp.CheckLevel checkReads, com.google.javascript.jscomp.CheckLevel checkWrites) {
		this.compiler = compiler;
		this.checkReads = checkReads;
		this.checkWrites = checkWrites;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.SuspiciousPropertiesCheck.ProcessExternedProperties());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.SuspiciousPropertiesCheck.ProcessProperties());
		for (com.google.javascript.jscomp.SuspiciousPropertiesCheck.Property prop : properties.values()) {
			if ((prop.reads) != null) {
				for (com.google.javascript.rhino.Node n : prop.reads) {
					compiler.report(com.google.javascript.jscomp.JSError.make(((java.lang.String) (n.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP))), n, checkReads, com.google.javascript.jscomp.SuspiciousPropertiesCheck.READ_WITHOUT_SET, n.getString()));
				}
			}
			if ((prop.writes) != null) {
				for (com.google.javascript.rhino.Node n : prop.writes) {
					compiler.report(com.google.javascript.jscomp.JSError.make(((java.lang.String) (n.getProp(com.google.javascript.rhino.Node.SOURCENAME_PROP))), n, checkWrites, com.google.javascript.jscomp.SuspiciousPropertiesCheck.SET_WITHOUT_READ, n.getString()));
				}
			}
		}
	}

	private com.google.javascript.jscomp.SuspiciousPropertiesCheck.Property getProperty(java.lang.String name) {
		com.google.javascript.jscomp.SuspiciousPropertiesCheck.Property prop = properties.get(name);
		if (prop == null) {
			prop = new com.google.javascript.jscomp.SuspiciousPropertiesCheck.Property(name);
			properties.put(name, prop);
		}
		return prop;
	}

	private boolean isExternallyDefined(java.lang.String name) {
		return externPropertyNames.contains(name);
	}

	private boolean isExported(java.lang.String name) {
		return compiler.getCodingConvention().isExported(name);
	}

	private class ProcessExternedProperties extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					if ((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) {
						externPropertyNames.add(dest.getString());
					}
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
						if ((child.getType()) == (com.google.javascript.rhino.Token.STRING)) {
							externPropertyNames.add(child.getString());
						}
					}
					break;
				case com.google.javascript.rhino.Token.NAME :
					java.lang.String name = n.getString();
					if (!(name.isEmpty())) {
						com.google.javascript.jscomp.Scope.Var var = t.getScope().getVar(name);
						if ((var != null) && (!(var.isLocal()))) {
							externPropertyNames.add(name);
						}
					}
					break;
			}
		}
	}

	private class ProcessProperties extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					if ((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) {
						if ((((parent.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) && ((parent.getFirstChild()) == n)) || (com.google.javascript.jscomp.NodeUtil.isExpressionNode(parent))) {
							addWrite(dest, t, false);
						}else {
							addRead(dest, t);
						}
					}
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
						if ((child.getType()) == (com.google.javascript.rhino.Token.STRING)) {
							addWrite(child, t, true);
						}
					}
					break;
				case com.google.javascript.rhino.Token.CALL :
					com.google.javascript.rhino.Node callee = n.getFirstChild();
					if (((callee.getType()) == (com.google.javascript.rhino.Token.NAME)) && (callee.getString().equals(com.google.javascript.jscomp.RenameProperties.RENAME_PROPERTY_FUNCTION_NAME))) {
						com.google.javascript.rhino.Node argument = callee.getNext();
						if ((argument.getType()) == (com.google.javascript.rhino.Token.STRING)) {
							for (java.lang.String name : com.google.javascript.jscomp.SuspiciousPropertiesCheck.DOT_PATTERN.split(argument.getString())) {
								com.google.javascript.jscomp.SuspiciousPropertiesCheck.Property prop = getProperty(name);
								(prop.readCount)++;
								(prop.writeCount)++;
								prop.reads = null;
								prop.writes = null;
							}
						}
					}
					break;
			}
		}

		private void addRead(com.google.javascript.rhino.Node nameNode, com.google.javascript.jscomp.NodeTraversal t) {
			java.lang.String name = nameNode.getString();
			com.google.javascript.jscomp.SuspiciousPropertiesCheck.Property prop = getProperty(name);
			(prop.readCount)++;
			if (((prop.writeCount) == 0) && (!(isExternallyDefined(name)))) {
				if (checkReads.isOn()) {
					if ((prop.reads) == null) {
						prop.reads = new java.util.ArrayList<com.google.javascript.rhino.Node>(com.google.javascript.jscomp.SuspiciousPropertiesCheck.MAX_REPORTS_PER_PROPERTY);
					}
					if ((prop.reads.size()) < (com.google.javascript.jscomp.SuspiciousPropertiesCheck.MAX_REPORTS_PER_PROPERTY)) {
						nameNode.putProp(com.google.javascript.rhino.Node.SOURCENAME_PROP, t.getSourceName());
						prop.reads.add(nameNode);
					}
				}
			}else {
				prop.reads = null;
			}
			prop.writes = null;
		}

		private void addWrite(com.google.javascript.rhino.Node nameNode, com.google.javascript.jscomp.NodeTraversal t, boolean objLit) {
			java.lang.String name = nameNode.getString();
			com.google.javascript.jscomp.SuspiciousPropertiesCheck.Property prop = getProperty(name);
			(prop.writeCount)++;
			if (((prop.readCount) == 0) && (!(isExported(name)))) {
				if ((checkWrites.isOn()) && (!objLit)) {
					if ((prop.writes) == null) {
						prop.writes = new java.util.ArrayList<com.google.javascript.rhino.Node>(com.google.javascript.jscomp.SuspiciousPropertiesCheck.MAX_REPORTS_PER_PROPERTY);
					}
					if ((prop.writes.size()) < (com.google.javascript.jscomp.SuspiciousPropertiesCheck.MAX_REPORTS_PER_PROPERTY)) {
						nameNode.putProp(com.google.javascript.rhino.Node.SOURCENAME_PROP, t.getSourceName());
						prop.writes.add(nameNode);
					}
				}
			}else {
				prop.writes = null;
			}
			prop.reads = null;
		}
	}

	private static class Property {
		final java.lang.String name;

		int readCount = 0;

		int writeCount = 0;

		java.util.List<com.google.javascript.rhino.Node> reads = null;

		java.util.List<com.google.javascript.rhino.Node> writes = null;

		Property(java.lang.String name) {
			this.name = name;
		}
	}
}

