

package com.google.javascript.jscomp;


class ReplaceIdGenerators implements com.google.javascript.jscomp.CompilerPass {
	static final com.google.javascript.jscomp.DiagnosticType NON_GLOBAL_ID_GENERATOR_CALL = com.google.javascript.jscomp.DiagnosticType.error("JSC_NON_GLOBAL_ID_GENERATOR_CALL", "Id generator call must be in the global scope");

	static final com.google.javascript.jscomp.DiagnosticType CONDITIONAL_ID_GENERATOR_CALL = com.google.javascript.jscomp.DiagnosticType.error("JSC_CONDITIONAL_ID_GENERATOR_CALL", "Id generator call must be unconditional");

	static final com.google.javascript.jscomp.DiagnosticType CONFLICTING_GENERATOR_TYPE = com.google.javascript.jscomp.DiagnosticType.error("JSC_CONFLICTING_ID_GENERATOR_TYPE", "Id generator can only be one of consistent, inconsistent, or stable.");

	static final com.google.javascript.jscomp.DiagnosticType INVALID_GENERATOR_ID_MAPPING = com.google.javascript.jscomp.DiagnosticType.error("JSC_INVALID_GENERATOR_ID_MAPPING", "Invalid generator id mapping. {0}");

	private final com.google.javascript.jscomp.AbstractCompiler compiler;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier> nameGenerators;

	private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> consistNameMap;

	private final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> idGeneratorMaps;

	private final java.util.Map<java.lang.String, com.google.common.collect.BiMap<java.lang.String, java.lang.String>> previousMap;

	private final boolean generatePseudoNames;

	public ReplaceIdGenerators(com.google.javascript.jscomp.AbstractCompiler compiler, java.util.Set<java.lang.String> idGens, boolean generatePseudoNames, java.lang.String previousMapSerialized) {
		this.compiler = compiler;
		this.generatePseudoNames = generatePseudoNames;
		nameGenerators = com.google.common.collect.Maps.newLinkedHashMap();
		idGeneratorMaps = com.google.common.collect.Maps.newLinkedHashMap();
		consistNameMap = com.google.common.collect.Maps.newLinkedHashMap();
		java.util.Map<java.lang.String, com.google.common.collect.BiMap<java.lang.String, java.lang.String>> previousMap;
		previousMap = parsePreviousResults(previousMapSerialized);
		this.previousMap = previousMap;
		if (idGens != null) {
			for (java.lang.String gen : idGens) {
				nameGenerators.put(gen, createNameSupplier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.INCONSISTENT, previousMap.get(gen)));
				idGeneratorMaps.put(gen, com.google.common.collect.Maps.<java.lang.String, java.lang.String>newLinkedHashMap());
			}
		}
	}

	private enum RenameStrategy {
CONSISTENT, INCONSISTENT, STABLE;	}

	private static interface NameSupplier {
		java.lang.String getName(java.lang.String id, java.lang.String name);

		com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy getRenameStrategy();
	}

	private static class ObfuscatedNameSuppier implements com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier {
		private final com.google.javascript.jscomp.NameGenerator generator;

		private final java.util.Map<java.lang.String, java.lang.String> previousMappings;

		private com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy renameStrategy;

		public ObfuscatedNameSuppier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy renameStrategy, com.google.common.collect.BiMap<java.lang.String, java.lang.String> previousMappings) {
			this.previousMappings = previousMappings.inverse();
			this.generator = new com.google.javascript.jscomp.NameGenerator(previousMappings.keySet(), "", null);
			com.google.javascript.jscomp.ReplaceIdGenerators.ObfuscatedNameSuppier.this.renameStrategy = renameStrategy;
		}

		@java.lang.Override
		public java.lang.String getName(java.lang.String id, java.lang.String name) {
			java.lang.String newName = previousMappings.get(id);
			if (newName == null) {
				newName = generator.generateNextName();
			}
			return newName;
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy getRenameStrategy() {
			return renameStrategy;
		}
	}

	private static class PseudoNameSuppier implements com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier {
		private int counter = 0;

		private com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy renameStrategy;

		public PseudoNameSuppier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy renameStrategy) {
			com.google.javascript.jscomp.ReplaceIdGenerators.PseudoNameSuppier.this.renameStrategy = renameStrategy;
		}

		@java.lang.Override
		public java.lang.String getName(java.lang.String id, java.lang.String name) {
			if ((renameStrategy) == (com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.INCONSISTENT)) {
				return (name + "$") + ((counter)++);
			}
			return name + "$0";
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy getRenameStrategy() {
			return renameStrategy;
		}
	}

	private static class StableNameSupplier implements com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier {
		@java.lang.Override
		public java.lang.String getName(java.lang.String id, java.lang.String name) {
			return com.google.debugging.sourcemap.Base64.base64EncodeInt(name.hashCode());
		}

		@java.lang.Override
		public com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy getRenameStrategy() {
			return com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.STABLE;
		}
	}

	private com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier createNameSupplier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy renameStrategy, com.google.common.collect.BiMap<java.lang.String, java.lang.String> previousMappings) {
		previousMappings = (previousMappings != null) ? previousMappings : com.google.common.collect.ImmutableBiMap.<java.lang.String, java.lang.String>of();
		if (renameStrategy == (com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.STABLE)) {
			return new com.google.javascript.jscomp.ReplaceIdGenerators.StableNameSupplier();
		}else
			if (generatePseudoNames) {
				return new com.google.javascript.jscomp.ReplaceIdGenerators.PseudoNameSuppier(renameStrategy);
			}else {
				return new com.google.javascript.jscomp.ReplaceIdGenerators.ObfuscatedNameSuppier(renameStrategy, previousMappings);
			}
		
	}

	private class GatherGenerators extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			com.google.javascript.rhino.JSDocInfo doc = n.getJSDocInfo();
			if (doc == null) {
				return ;
			}
			int numGeneratorAnnotations = ((doc.isConsistentIdGenerator() ? 1 : 0) + (doc.isIdGenerator() ? 1 : 0)) + (doc.isStableIdGenerator() ? 1 : 0);
			if (numGeneratorAnnotations == 0) {
				return ;
			}else
				if (numGeneratorAnnotations > 1) {
					compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceIdGenerators.CONFLICTING_GENERATOR_TYPE));
				}
			
			java.lang.String name = null;
			if (n.isAssign()) {
				name = n.getFirstChild().getQualifiedName();
			}else
				if (n.isVar()) {
					name = n.getFirstChild().getString();
				}else
					if (n.isFunction()) {
						name = n.getFirstChild().getString();
						if (name.isEmpty()) {
							return ;
						}
					}
				
			
			if (doc.isConsistentIdGenerator()) {
				consistNameMap.put(name, com.google.common.collect.Maps.<java.lang.String, java.lang.String>newLinkedHashMap());
				nameGenerators.put(name, createNameSupplier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.CONSISTENT, previousMap.get(name)));
			}else
				if (doc.isStableIdGenerator()) {
					nameGenerators.put(name, createNameSupplier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.STABLE, previousMap.get(name)));
				}else {
					nameGenerators.put(name, createNameSupplier(com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.INCONSISTENT, previousMap.get(name)));
				}
			
			idGeneratorMaps.put(name, com.google.common.collect.Maps.<java.lang.String, java.lang.String>newLinkedHashMap());
		}
	}

	@java.lang.Override
	public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ReplaceIdGenerators.GatherGenerators());
		if (!(nameGenerators.isEmpty())) {
			com.google.javascript.jscomp.NodeTraversal.traverse(compiler, root, new com.google.javascript.jscomp.ReplaceIdGenerators.ReplaceGenerators());
		}
	}

	private class ReplaceGenerators extends com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback {
		@java.lang.Override
		public void visit(com.google.javascript.jscomp.NodeTraversal t, com.google.javascript.rhino.Node n, com.google.javascript.rhino.Node parent) {
			if (!(n.isCall())) {
				return ;
			}
			java.lang.String callName = n.getFirstChild().getQualifiedName();
			com.google.javascript.jscomp.ReplaceIdGenerators.NameSupplier nameGenerator = nameGenerators.get(callName);
			if (nameGenerator == null) {
				return ;
			}
			if ((!(t.inGlobalScope())) && ((nameGenerator.getRenameStrategy()) == (com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.INCONSISTENT))) {
				compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceIdGenerators.NON_GLOBAL_ID_GENERATOR_CALL));
				return ;
			}
			if ((nameGenerator.getRenameStrategy()) == (com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.INCONSISTENT)) {
				for (com.google.javascript.rhino.Node ancestor : n.getAncestors()) {
					if (com.google.javascript.jscomp.NodeUtil.isControlStructure(ancestor)) {
						compiler.report(t.makeError(n, com.google.javascript.jscomp.ReplaceIdGenerators.CONDITIONAL_ID_GENERATOR_CALL));
						return ;
					}
				}
			}
			com.google.javascript.rhino.Node id = n.getFirstChild().getNext();
			if (!(id.isString())) {
				return ;
			}
			java.util.Map<java.lang.String, java.lang.String> idGeneratorMap = idGeneratorMaps.get(callName);
			java.lang.String rename = null;
			java.lang.String name = id.getString();
			java.lang.String instanceId = getIdForGeneratorNode(((nameGenerator.getRenameStrategy()) == (com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.CONSISTENT)), id);
			if ((nameGenerator.getRenameStrategy()) == (com.google.javascript.jscomp.ReplaceIdGenerators.RenameStrategy.CONSISTENT)) {
				java.util.Map<java.lang.String, java.lang.String> entry = consistNameMap.get(callName);
				rename = entry.get(instanceId);
				if (rename == null) {
					rename = nameGenerator.getName(instanceId, name);
					entry.put(instanceId, rename);
				}
			}else {
				rename = nameGenerator.getName(instanceId, name);
			}
			parent.replaceChild(n, com.google.javascript.rhino.IR.string(rename));
			idGeneratorMap.put(rename, instanceId);
			compiler.reportCodeChange();
		}
	}

	public java.lang.String getSerializedIdMappings() {
		java.lang.StringBuilder sb = new java.lang.StringBuilder();
		for (java.util.Map.Entry<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> replacements : idGeneratorMaps.entrySet()) {
			if (!(replacements.getValue().isEmpty())) {
				sb.append("[");
				sb.append(replacements.getKey());
				sb.append("]\n\n");
				for (java.util.Map.Entry<java.lang.String, java.lang.String> replacement : replacements.getValue().entrySet()) {
					sb.append(replacement.getKey());
					sb.append(':');
					sb.append(replacement.getValue());
					sb.append("\n");
				}
				sb.append("\n");
			}
		}
		return sb.toString();
	}

	private java.util.Map<java.lang.String, com.google.common.collect.BiMap<java.lang.String, java.lang.String>> parsePreviousResults(java.lang.String serializedMap) {
		if ((serializedMap == null) || (serializedMap.isEmpty())) {
			return java.util.Collections.emptyMap();
		}
		java.util.Map<java.lang.String, com.google.common.collect.BiMap<java.lang.String, java.lang.String>> resultMap = com.google.common.collect.Maps.newHashMap();
		java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.StringReader(serializedMap));
		com.google.common.collect.BiMap<java.lang.String, java.lang.String> currentSectionMap = null;
		java.lang.String line;
		int lineIndex = 0;
		try {
			while ((line = reader.readLine()) != null) {
				lineIndex++;
				if (line.isEmpty()) {
					continue;
				}
				if ((line.charAt(0)) == '[') {
					java.lang.String currentSection = line.substring(1, ((line.length()) - 1));
					currentSectionMap = resultMap.get(currentSection);
					if (currentSectionMap == null) {
						currentSectionMap = com.google.common.collect.HashBiMap.create();
						resultMap.put(currentSection, currentSectionMap);
					}else {
						reportInvalidLine(line, lineIndex);
						return java.util.Collections.emptyMap();
					}
				}else {
					int split = line.indexOf(':');
					if (split != (-1)) {
						java.lang.String name = line.substring(0, split);
						java.lang.String location = line.substring((split + 1), line.length());
						currentSectionMap.put(name, location);
					}else {
						reportInvalidLine(line, lineIndex);
						return java.util.Collections.emptyMap();
					}
				}
			} 
		} catch (java.io.IOException e) {
			com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.ReplaceIdGenerators.INVALID_GENERATOR_ID_MAPPING, e.getMessage());
		}
		return resultMap;
	}

	private void reportInvalidLine(java.lang.String line, int lineIndex) {
		com.google.javascript.jscomp.JSError.make(com.google.javascript.jscomp.ReplaceIdGenerators.INVALID_GENERATOR_ID_MAPPING, ((("line(" + line) + "): ") + lineIndex));
	}

	java.lang.String getIdForGeneratorNode(boolean consistent, com.google.javascript.rhino.Node n) {
		com.google.common.base.Preconditions.checkState(n.isString());
		if (consistent) {
			return n.getString();
		}else {
			return ((((n.getSourceFileName()) + ':') + (n.getLineno())) + ":") + (n.getCharno());
		}
	}
}

