

package com.google.javascript.jscomp;


class SuppressDocWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private static final long serialVersionUID = 1L;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.DiagnosticGroupWarningsGuard> suppressors = com.google.common.collect.Maps.newHashMap();

	SuppressDocWarningsGuard(java.util.Map<java.lang.String, com.google.javascript.jscomp.DiagnosticGroup> suppressibleGroups) {
		for (java.util.Map.Entry<java.lang.String, com.google.javascript.jscomp.DiagnosticGroup> entry : suppressibleGroups.entrySet()) {
			suppressors.put(entry.getKey(), new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(entry.getValue(), com.google.javascript.jscomp.CheckLevel.OFF));
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		com.google.javascript.rhino.Node node = error.node;
		if (node != null) {
			for (com.google.javascript.rhino.Node current = node; current != null; current = current.getParent()) {
				int type = current.getType();
				com.google.javascript.rhino.JSDocInfo info = null;
				if (type == (com.google.javascript.rhino.Token.FUNCTION)) {
					info = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(current);
				}else
					if (type == (com.google.javascript.rhino.Token.SCRIPT)) {
						info = current.getJSDocInfo();
					}else
						if (type == (com.google.javascript.rhino.Token.ASSIGN)) {
							com.google.javascript.rhino.Node rhs = current.getLastChild();
							if (rhs.isFunction()) {
								info = com.google.javascript.jscomp.NodeUtil.getFunctionJSDocInfo(rhs);
							}
						}
					
				
				if (info != null) {
					for (java.lang.String suppressor : info.getSuppressions()) {
						com.google.javascript.jscomp.WarningsGuard guard = suppressors.get(suppressor);
						if (guard != null) {
							com.google.javascript.jscomp.CheckLevel newLevel = guard.level(error);
							if (newLevel != null) {
								return newLevel;
							}
						}
					}
				}
			}
		}
		return null;
	}

	@java.lang.Override
	public int getPriority() {
		return com.google.javascript.jscomp.WarningsGuard.Priority.SUPPRESS_DOC.value;
	}
}

