

package com.google.javascript.jscomp;


class RenamePrototypes implements com.google.javascript.jscomp.CompilerPass {
	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final boolean aggressiveRenaming;

	private final char[] reservedCharacters;

	private final com.google.javascript.jscomp.VariableMap prevUsedRenameMap;

	private class Property {
		java.lang.String oldName;

		java.lang.String newName;

		int prototypeCount;

		int objLitCount;

		int refCount;

		Property(java.lang.String name) {
			com.google.javascript.jscomp.RenamePrototypes.Property.this.oldName = name;
			com.google.javascript.jscomp.RenamePrototypes.Property.this.newName = null;
			com.google.javascript.jscomp.RenamePrototypes.Property.this.prototypeCount = 0;
			com.google.javascript.jscomp.RenamePrototypes.Property.this.objLitCount = 0;
			com.google.javascript.jscomp.RenamePrototypes.Property.this.refCount = 0;
		}

		int count() {
			return ((prototypeCount) + (objLitCount)) + (refCount);
		}

		boolean canRename() {
			if (((com.google.javascript.jscomp.RenamePrototypes.Property.this.prototypeCount) > 0) && ((com.google.javascript.jscomp.RenamePrototypes.Property.this.objLitCount) == 0)) {
				return canRenamePrototypeProperty();
			}
			if (((com.google.javascript.jscomp.RenamePrototypes.Property.this.objLitCount) > 0) && ((com.google.javascript.jscomp.RenamePrototypes.Property.this.prototypeCount) == 0)) {
				return canRenameObjLitProperty();
			}
			return (canRenamePrototypeProperty()) && (canRenameObjLitProperty());
		}

		private boolean canRenamePrototypeProperty() {
			if (compiler.getCodingConvention().isExported(oldName)) {
				return false;
			}
			if (compiler.getCodingConvention().isPrivate(oldName)) {
				return true;
			}
			if (aggressiveRenaming) {
				return true;
			}
			for (int i = 0, n = oldName.length(); i < n; i++) {
				char ch = oldName.charAt(i);
				if ((java.lang.Character.isUpperCase(ch)) || (!(java.lang.Character.isLetter(ch)))) {
					return true;
				}
			}
			return false;
		}

		private boolean canRenameObjLitProperty() {
			if (compiler.getCodingConvention().isExported(oldName)) {
				return false;
			}
			if (compiler.getCodingConvention().isPrivate(oldName)) {
				return true;
			}
			return false;
		}
	}

	private static final java.util.Comparator<com.google.javascript.jscomp.RenamePrototypes.Property> FREQUENCY_COMPARATOR = new java.util.Comparator<com.google.javascript.jscomp.RenamePrototypes.Property>() {
		public int compare(com.google.javascript.jscomp.RenamePrototypes.Property a1, com.google.javascript.jscomp.RenamePrototypes.Property a2) {
			int n1 = a1.count();
			int n2 = a2.count();
			if (n1 != n2) {
				return n2 - n1;
			}
			return a1.oldName.compareTo(a2.oldName);
		}
	};

	private final java.util.Set<com.google.javascript.rhino.Node> stringNodes = new java.util.HashSet<com.google.javascript.rhino.Node>();

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.RenamePrototypes.Property> properties = new java.util.HashMap<java.lang.String, com.google.javascript.jscomp.RenamePrototypes.Property>();

	private final java.util.Set<java.lang.String> reservedNames = new java.util.HashSet<java.lang.String>(java.util.Arrays.asList("indexOf", "lastIndexOf", "toString", "valueOf"));

	private final java.util.Set<com.google.javascript.rhino.Node> prototypeObjLits = new java.util.HashSet<com.google.javascript.rhino.Node>();

	RenamePrototypes(com.google.javascript.jscomp.AbstractCompiler compiler, boolean aggressiveRenaming, @javax.annotation.Nullable
	char[] reservedCharacters, @javax.annotation.Nullable
	com.google.javascript.jscomp.VariableMap prevUsedRenameMap) {
		this.compiler = compiler;
		this.aggressiveRenaming = aggressiveRenaming;
		this.reservedCharacters = reservedCharacters;
		this.prevUsedRenameMap = prevUsedRenameMap;
	}

	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, externs, new com.google.javascript.jscomp.RenamePrototypes.ProcessExternedProperties());
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.RenamePrototypes.ProcessProperties());
		java.util.SortedSet<com.google.javascript.jscomp.RenamePrototypes.Property> propsByFrequency = new java.util.TreeSet<com.google.javascript.jscomp.RenamePrototypes.Property>(com.google.javascript.jscomp.RenamePrototypes.FREQUENCY_COMPARATOR);
		for (java.util.Iterator<java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.RenamePrototypes.Property>> it = properties.entrySet().iterator(); it.hasNext();) {
			com.google.javascript.jscomp.RenamePrototypes.Property a = it.next().getValue();
			if ((a.canRename()) && (!(reservedNames.contains(a.oldName)))) {
				propsByFrequency.add(a);
			}else {
				it.remove();
				reservedNames.add(a.oldName);
			}
		}
		if ((prevUsedRenameMap) != null) {
			reusePrototypeNames(propsByFrequency);
		}
		com.google.javascript.jscomp.NameGenerator nameGen = new com.google.javascript.jscomp.NameGenerator(reservedNames, "", reservedCharacters);
		java.lang.StringBuilder debug = new java.lang.StringBuilder();
		for (com.google.javascript.jscomp.RenamePrototypes.Property a : propsByFrequency) {
			if ((a.newName) == null) {
				a.newName = nameGen.generateNextName();
				reservedNames.add(a.newName);
			}
			debug.append(a.oldName).append(" => ").append(a.newName).append('\n');
		}
		compiler.addToDebugLog(("JS property assignments:\n" + debug));
		boolean changed = false;
		for (com.google.javascript.rhino.Node n : stringNodes) {
			java.lang.String oldName = n.getString();
			com.google.javascript.jscomp.RenamePrototypes.Property a = properties.get(oldName);
			if ((a != null) && ((a.newName) != null)) {
				n.setString(a.newName);
				changed = changed || (!(a.newName.equals(oldName)));
			}
		}
		if (changed) {
			compiler.reportCodeChange();
		}
	}

	private void reusePrototypeNames(java.util.Set<com.google.javascript.jscomp.RenamePrototypes.Property> properties) {
		for (com.google.javascript.jscomp.RenamePrototypes.Property prop : properties) {
			java.lang.String prevName = prevUsedRenameMap.lookupNewName(prop.oldName);
			if (prevName != null) {
				if (reservedNames.contains(prevName)) {
					continue;
				}
				prop.newName = prevName;
				reservedNames.add(prevName);
			}
		}
	}

	private class ProcessExternedProperties extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					if ((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) {
						reservedNames.add(dest.getString());
					}
			}
		}
	}

	private class ProcessProperties extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					if ((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) {
						java.lang.String s = dest.getString();
						if (s.equals("prototype")) {
							processPrototypeParent(parent, t.getInput());
						}else {
							markPropertyAccessCandidate(dest, t.getInput());
						}
					}
					break;
				case com.google.javascript.rhino.Token.OBJECTLIT :
					if (!(prototypeObjLits.contains(n))) {
						for (com.google.javascript.rhino.Node child = n.getFirstChild(); child != null; child = child.getNext()) {
							if ((child.getType()) != (com.google.javascript.rhino.Token.NUMBER)) {
								markObjLitPropertyCandidate(child, t.getInput());
							}
						}
					}
					break;
			}
		}

		private void processPrototypeParent(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CompilerInput input) {
			switch (n.getType()) {
				case com.google.javascript.rhino.Token.GETPROP :
				case com.google.javascript.rhino.Token.GETELEM :
					com.google.javascript.rhino.Node dest = n.getFirstChild().getNext();
					if ((dest.getType()) == (com.google.javascript.rhino.Token.STRING)) {
						markPrototypePropertyCandidate(dest, input);
					}
					break;
				case com.google.javascript.rhino.Token.ASSIGN :
				case com.google.javascript.rhino.Token.CALL :
					com.google.javascript.rhino.Node map;
					if ((n.getType()) == (com.google.javascript.rhino.Token.ASSIGN)) {
						map = n.getFirstChild().getNext();
					}else {
						map = n.getLastChild();
					}
					if ((map.getType()) == (com.google.javascript.rhino.Token.OBJECTLIT)) {
						prototypeObjLits.add(map);
						for (com.google.javascript.rhino.Node key = map.getFirstChild(); key != null; key = key.getNext()) {
							if ((key.getType()) != (com.google.javascript.rhino.Token.NUMBER)) {
								markPrototypePropertyCandidate(key, input);
							}
						}
					}
					break;
			}
		}

		private void markPrototypePropertyCandidate(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CompilerInput input) {
			stringNodes.add(n);
			(getProperty(n.getString()).prototypeCount)++;
		}

		private void markObjLitPropertyCandidate(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CompilerInput input) {
			stringNodes.add(n);
			(getProperty(n.getString()).objLitCount)++;
		}

		private void markPropertyAccessCandidate(com.google.javascript.rhino.Node n, com.google.javascript.jscomp.CompilerInput input) {
			stringNodes.add(n);
			(getProperty(n.getString()).refCount)++;
		}

		private com.google.javascript.jscomp.RenamePrototypes.Property getProperty(java.lang.String name) {
			com.google.javascript.jscomp.RenamePrototypes.Property prop = properties.get(name);
			if (prop == null) {
				prop = new com.google.javascript.jscomp.RenamePrototypes.Property(name);
				properties.put(name, prop);
			}
			return prop;
		}
	}

	com.google.javascript.jscomp.VariableMap getPropertyMap() {
		java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (com.google.javascript.jscomp.RenamePrototypes.Property p : properties.values()) {
			if ((p.newName) != null) {
				map.put(p.oldName, p.newName);
			}
		}
		return new com.google.javascript.jscomp.VariableMap(map);
	}
}

