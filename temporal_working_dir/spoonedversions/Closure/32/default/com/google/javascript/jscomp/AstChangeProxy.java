

package com.google.javascript.jscomp;


class AstChangeProxy {
	interface ChangeListener {
		void nodeRemoved(com.google.javascript.rhino.Node node);
	}

	private final java.util.List<com.google.javascript.jscomp.AstChangeProxy.ChangeListener> listeners;

	AstChangeProxy() {
		listeners = com.google.common.collect.Lists.newArrayList();
	}

	final void registerListener(com.google.javascript.jscomp.AstChangeProxy.ChangeListener listener) {
		listeners.add(listener);
	}

	final void unregisterListener(com.google.javascript.jscomp.AstChangeProxy.ChangeListener listener) {
		listeners.remove(listener);
	}

	private void notifyOfRemoval(com.google.javascript.rhino.Node node) {
		for (com.google.javascript.jscomp.AstChangeProxy.ChangeListener listener : listeners) {
			listener.nodeRemoved(node);
		}
	}

	final void removeChild(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node node) {
		parent.removeChild(node);
		notifyOfRemoval(node);
	}

	final void replaceWith(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node node, com.google.javascript.rhino.Node replacement) {
		replaceWith(parent, node, com.google.common.collect.Lists.newArrayList(replacement));
	}

	final void replaceWith(com.google.javascript.rhino.Node parent, com.google.javascript.rhino.Node node, java.util.List<com.google.javascript.rhino.Node> replacements) {
		com.google.common.base.Preconditions.checkNotNull(replacements, "\"replacements\" is null.");
		int size = replacements.size();
		if ((size == 1) && (node.isEquivalentTo(replacements.get(0)))) {
			return ;
		}
		int parentType = parent.getType();
		com.google.common.base.Preconditions.checkState(((((size == 1) || (parentType == (com.google.javascript.rhino.Token.BLOCK))) || (parentType == (com.google.javascript.rhino.Token.SCRIPT))) || (parentType == (com.google.javascript.rhino.Token.LABEL))));
		if ((parentType == (com.google.javascript.rhino.Token.LABEL)) && (size != 1)) {
			com.google.javascript.rhino.Node block = com.google.javascript.rhino.IR.block();
			for (com.google.javascript.rhino.Node newChild : replacements) {
				newChild.copyInformationFrom(node);
				com.google.javascript.rhino.Node oldParent = newChild.getParent();
				block.addChildToBack(newChild);
			}
			parent.replaceChild(node, block);
		}else {
			for (com.google.javascript.rhino.Node newChild : replacements) {
				newChild.copyInformationFrom(node);
				com.google.javascript.rhino.Node oldParent = newChild.getParent();
				parent.addChildBefore(newChild, node);
			}
			parent.removeChild(node);
		}
		notifyOfRemoval(node);
	}
}

