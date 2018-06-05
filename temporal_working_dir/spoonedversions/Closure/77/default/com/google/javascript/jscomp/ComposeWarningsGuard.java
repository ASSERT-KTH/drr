

package com.google.javascript.jscomp;


public class ComposeWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private final java.util.List<com.google.javascript.jscomp.WarningsGuard> guards;

	private static final java.util.Comparator<com.google.javascript.jscomp.WarningsGuard> guardComparator = new java.util.Comparator<com.google.javascript.jscomp.WarningsGuard>() {
		@java.lang.Override
		public int compare(com.google.javascript.jscomp.WarningsGuard a, com.google.javascript.jscomp.WarningsGuard b) {
			return (a.getPriority()) - (b.getPriority());
		}
	};

	public ComposeWarningsGuard(java.util.List<com.google.javascript.jscomp.WarningsGuard> guards) {
		this.guards = com.google.common.collect.Lists.newArrayList();
		addGuards(guards);
	}

	public ComposeWarningsGuard(com.google.javascript.jscomp.WarningsGuard... guards) {
		this(com.google.common.collect.Lists.newArrayList(guards));
	}

	void addGuard(com.google.javascript.jscomp.WarningsGuard guard) {
		if (guard instanceof com.google.javascript.jscomp.ComposeWarningsGuard) {
			addGuards(com.google.common.collect.Lists.reverse(((com.google.javascript.jscomp.ComposeWarningsGuard) (guard)).guards));
		}else {
			int index = java.util.Collections.binarySearch(com.google.javascript.jscomp.ComposeWarningsGuard.this.guards, guard, com.google.javascript.jscomp.ComposeWarningsGuard.guardComparator);
			if (index < 0) {
				index = (-index) - 1;
			}
			com.google.javascript.jscomp.ComposeWarningsGuard.this.guards.add(index, guard);
		}
	}

	private void addGuards(java.lang.Iterable<com.google.javascript.jscomp.WarningsGuard> guards) {
		for (com.google.javascript.jscomp.WarningsGuard guard : guards) {
			addGuard(guard);
		}
	}

	@java.lang.Override
	public com.google.javascript.jscomp.CheckLevel level(com.google.javascript.jscomp.JSError error) {
		for (com.google.javascript.jscomp.WarningsGuard guard : guards) {
			com.google.javascript.jscomp.CheckLevel newLevel = guard.level(error);
			if (newLevel != null) {
				return newLevel;
			}
		}
		return null;
	}

	@java.lang.Override
	public boolean disables(com.google.javascript.jscomp.DiagnosticGroup group) {
		nextSingleton : for (com.google.javascript.jscomp.DiagnosticType type : group.getTypes()) {
			com.google.javascript.jscomp.DiagnosticGroup singleton = com.google.javascript.jscomp.DiagnosticGroup.forType(type);
			for (com.google.javascript.jscomp.WarningsGuard guard : guards) {
				if (guard.disables(singleton)) {
					continue nextSingleton;
				}else
					if (guard.enables(singleton)) {
						return false;
					}
				
			}
			return false;
		}
		return true;
	}

	@java.lang.Override
	public boolean enables(com.google.javascript.jscomp.DiagnosticGroup group) {
		for (com.google.javascript.jscomp.WarningsGuard guard : guards) {
			if (guard.enables(group)) {
				return true;
			}else
				if (guard.disables(group)) {
					return false;
				}
			
		}
		return false;
	}

	java.util.List<com.google.javascript.jscomp.WarningsGuard> getGuards() {
		return java.util.Collections.unmodifiableList(guards);
	}
}

