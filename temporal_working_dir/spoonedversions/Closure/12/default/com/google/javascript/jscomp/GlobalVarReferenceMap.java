

package com.google.javascript.jscomp;


class GlobalVarReferenceMap implements com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap {
	private java.util.Map<java.lang.String, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> refMap = null;

	private final java.util.Map<com.google.javascript.rhino.InputId, java.lang.Integer> inputOrder;

	GlobalVarReferenceMap(java.util.List<com.google.javascript.jscomp.CompilerInput> inputs, java.util.List<com.google.javascript.jscomp.CompilerInput> externs) {
		inputOrder = com.google.common.collect.Maps.newHashMap();
		int ind = 0;
		for (com.google.javascript.jscomp.CompilerInput extern : externs) {
			inputOrder.put(extern.getInputId(), ind);
			ind++;
		}
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			inputOrder.put(input.getInputId(), ind);
			ind++;
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection getReferences(com.google.javascript.jscomp.Scope.Var var) {
		if (!(var.isGlobal())) {
			return null;
		}
		return refMap.get(var.getName());
	}

	private void resetGlobalVarReferences(java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> globalRefMap) {
		refMap = com.google.common.collect.Maps.newHashMap();
		for (java.util.Map.Entry<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> entry : globalRefMap.entrySet()) {
			com.google.javascript.jscomp.Scope.Var var = entry.getKey();
			if (var.isGlobal()) {
				refMap.put(var.getName(), entry.getValue());
			}
		}
	}

	void updateGlobalVarReferences(java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> refMapPatch, com.google.javascript.rhino.Node root) {
		if (((refMap) == null) || (!(root.isScript()))) {
			resetGlobalVarReferences(refMapPatch);
			return ;
		}
		com.google.javascript.rhino.InputId inputId = root.getInputId();
		com.google.common.base.Preconditions.checkNotNull(inputId);
		removeScriptReferences(inputId);
		for (java.util.Map.Entry<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> entry : refMapPatch.entrySet()) {
			com.google.javascript.jscomp.Scope.Var var = entry.getKey();
			if (var.isGlobal()) {
				replaceReferences(var.getName(), inputId, entry.getValue());
			}
		}
	}

	private void removeScriptReferences(com.google.javascript.rhino.InputId inputId) {
		com.google.common.base.Preconditions.checkNotNull(inputId);
		if (!(inputOrder.containsKey(inputId))) {
			return ;
		}
		for (com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection collection : refMap.values()) {
			if (collection == null) {
				continue;
			}
			java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> oldRefs = collection.references;
			com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange range = findSourceRefRange(oldRefs, inputId);
			java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> newRefs = com.google.common.collect.Lists.newArrayList(range.refsBefore());
			newRefs.addAll(range.refsAfter());
			collection.references = newRefs;
		}
	}

	private void replaceReferences(java.lang.String varName, com.google.javascript.rhino.InputId inputId, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection newSourceCollection) {
		com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection combined = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
		java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> combinedRefs = combined.references;
		com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection oldCollection = refMap.get(varName);
		refMap.put(varName, combined);
		if (oldCollection == null) {
			combinedRefs.addAll(newSourceCollection.references);
			return ;
		}
		com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange range = findSourceRefRange(oldCollection.references, inputId);
		combinedRefs.addAll(range.refsBefore());
		combinedRefs.addAll(newSourceCollection.references);
		combinedRefs.addAll(range.refsAfter());
	}

	private com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange findSourceRefRange(java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refList, com.google.javascript.rhino.InputId inputId) {
		com.google.common.base.Preconditions.checkNotNull(inputId);
		int lastBefore = -1;
		int firstAfter = refList.size();
		int index = 0;
		com.google.common.base.Preconditions.checkState(inputOrder.containsKey(inputId), inputId.getIdName());
		int sourceInputOrder = inputOrder.get(inputId);
		for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref : refList) {
			com.google.common.base.Preconditions.checkNotNull(ref.getInputId());
			int order = inputOrder.get(ref.getInputId());
			if (order < sourceInputOrder) {
				lastBefore = index;
			}else
				if (order > sourceInputOrder) {
					firstAfter = index;
					break;
				}
			
			index++;
		}
		return new com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange(refList, lastBefore, firstAfter);
	}

	private static class SourceRefRange {
		private final int lastBefore;

		private final int firstAfter;

		private final java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refList;

		SourceRefRange(java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refList, int lastBefore, int firstAfter) {
			this.lastBefore = java.lang.Math.max(lastBefore, (-1));
			this.firstAfter = java.lang.Math.min(firstAfter, refList.size());
			this.refList = refList;
		}

		java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refsBefore() {
			return refList.subList(0, ((lastBefore) + 1));
		}

		java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refsAfter() {
			return refList.subList(firstAfter, refList.size());
		}
	}

	public void updateReferencesWithGlobalScope(com.google.javascript.jscomp.Scope globalScope) {
		for (com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection collection : refMap.values()) {
			java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> newRefs = com.google.common.collect.Lists.newArrayListWithCapacity(collection.references.size());
			for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref : collection.references) {
				if ((ref.getScope()) != globalScope) {
					newRefs.add(ref.cloneWithNewScope(globalScope));
				}else {
					newRefs.add(ref);
				}
			}
			collection.references = newRefs;
		}
	}

	static class GlobalVarRefCleanupPass implements com.google.javascript.jscomp.HotSwapCompilerPass {
		private final com.google.javascript.jscomp.AbstractCompiler compiler;

		public GlobalVarRefCleanupPass(com.google.javascript.jscomp.AbstractCompiler compiler) {
			this.compiler = compiler;
		}

		@java.lang.Override
		public void hotSwapScript(com.google.javascript.rhino.Node scriptRoot, com.google.javascript.rhino.Node originalRoot) {
			com.google.javascript.jscomp.GlobalVarReferenceMap refMap = compiler.getGlobalVarReferences();
			if (refMap != null) {
				refMap.updateReferencesWithGlobalScope(compiler.getTopScope());
			}
		}

		@java.lang.Override
		public void process(com.google.javascript.rhino.Node externs, com.google.javascript.rhino.Node root) {
		}
	}
}

