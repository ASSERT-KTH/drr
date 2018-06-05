

package com.google.javascript.jscomp;


class GlobalVarReferenceMap implements com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap {
	private java.util.Map<java.lang.String, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> refMap = null;

	private final java.util.Map<java.lang.String, java.lang.Integer> inputOrder;

	GlobalVarReferenceMap(java.util.List<com.google.javascript.jscomp.CompilerInput> inputs, java.util.List<com.google.javascript.jscomp.CompilerInput> externs) {
		inputOrder = com.google.common.collect.Maps.newHashMap();
		int ind = 0;
		for (com.google.javascript.jscomp.CompilerInput extern : externs) {
			inputOrder.put(extern.getName(), ind);
			ind++;
		}
		for (com.google.javascript.jscomp.CompilerInput input : inputs) {
			inputOrder.put(input.getName(), ind);
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
		if (((refMap) == null) || ((root.getType()) != (com.google.javascript.rhino.Token.SCRIPT))) {
			resetGlobalVarReferences(refMapPatch);
			return ;
		}
		java.lang.String sourceName = com.google.javascript.jscomp.NodeUtil.getSourceName(root);
		com.google.common.base.Preconditions.checkNotNull(sourceName);
		removeScriptReferences(sourceName);
		for (java.util.Map.Entry<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> entry : refMapPatch.entrySet()) {
			com.google.javascript.jscomp.Scope.Var var = entry.getKey();
			if (var.isGlobal()) {
				replaceReferences(var.getName(), sourceName, entry.getValue());
			}
		}
	}

	private void removeScriptReferences(java.lang.String sourceName) {
		for (com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection collection : refMap.values()) {
			if (collection == null) {
				continue;
			}
			java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> oldRefs = collection.references;
			com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange range = findSourceRefRange(oldRefs, sourceName);
			java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> newRefs = com.google.common.collect.Lists.newArrayList(range.refsBefore());
			newRefs.addAll(range.refsAfter());
			collection.references = newRefs;
		}
	}

	private void replaceReferences(java.lang.String varName, java.lang.String sourceName, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection newSourceCollection) {
		com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection combined = new com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection();
		java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> combinedRefs = combined.references;
		com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection oldCollection = refMap.get(varName);
		refMap.put(varName, combined);
		if (oldCollection == null) {
			combinedRefs.addAll(newSourceCollection.references);
			return ;
		}
		com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange range = findSourceRefRange(oldCollection.references, sourceName);
		combinedRefs.addAll(range.refsBefore());
		combinedRefs.addAll(newSourceCollection.references);
		combinedRefs.addAll(range.refsAfter());
	}

	private com.google.javascript.jscomp.GlobalVarReferenceMap.SourceRefRange findSourceRefRange(java.util.List<com.google.javascript.jscomp.ReferenceCollectingCallback.Reference> refList, java.lang.String sourceName) {
		int lastBefore = -1;
		int firstAfter = refList.size();
		int index = 0;
		int sourceInputOrder = inputOrder.get(sourceName);
		for (com.google.javascript.jscomp.ReferenceCollectingCallback.Reference ref : refList) {
			int order = inputOrder.get(ref.getSourceFile().getName());
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
}

