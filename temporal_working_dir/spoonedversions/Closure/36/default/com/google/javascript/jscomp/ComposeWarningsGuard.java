

package com.google.javascript.jscomp;


public class ComposeWarningsGuard extends com.google.javascript.jscomp.WarningsGuard {
	private static final long serialVersionUID = 1L;

	private final java.util.Map<com.google.javascript.jscomp.WarningsGuard, java.lang.Integer> orderOfAddition = com.google.common.collect.Maps.newHashMap();

	private int numberOfAdds = 0;

	private final java.util.Comparator<com.google.javascript.jscomp.WarningsGuard> guardComparator = new com.google.javascript.jscomp.ComposeWarningsGuard.GuardComparator(orderOfAddition);

	private static class GuardComparator implements java.io.Serializable , java.util.Comparator<com.google.javascript.jscomp.WarningsGuard> {
		private static final long serialVersionUID = 1L;

		private final java.util.Map<com.google.javascript.jscomp.WarningsGuard, java.lang.Integer> orderOfAddition;

		private GuardComparator(java.util.Map<com.google.javascript.jscomp.WarningsGuard, java.lang.Integer> orderOfAddition) {
			this.orderOfAddition = orderOfAddition;
		}

		@java.lang.Override
		public int compare(com.google.javascript.jscomp.WarningsGuard a, com.google.javascript.jscomp.WarningsGuard b) {
			int priorityDiff = (a.getPriority()) - (b.getPriority());
			if (priorityDiff != 0) {
				return priorityDiff;
			}
			return (orderOfAddition.get(b).intValue()) - (orderOfAddition.get(a).intValue());
		}
	}

	private final java.util.TreeSet<com.google.javascript.jscomp.WarningsGuard> guards = new java.util.TreeSet<com.google.javascript.jscomp.WarningsGuard>(guardComparator);

	public ComposeWarningsGuard(java.util.List<com.google.javascript.jscomp.WarningsGuard> guards) {
		addGuards(guards);
	}

	public ComposeWarningsGuard(com.google.javascript.jscomp.WarningsGuard... guards) {
		this(com.google.common.collect.Lists.newArrayList(guards));
	}

	void addGuard(com.google.javascript.jscomp.WarningsGuard guard) {
		if (guard instanceof com.google.javascript.jscomp.ComposeWarningsGuard) {
			addGuards(((com.google.javascript.jscomp.ComposeWarningsGuard) (guard)).guards.descendingSet());
		}else {
			(numberOfAdds)++;
			orderOfAddition.put(guard, numberOfAdds);
			guards.remove(guard);
			guards.add(guard);
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
		return java.util.Collections.unmodifiableList(com.google.common.collect.Lists.newArrayList(guards));
	}

	com.google.javascript.jscomp.ComposeWarningsGuard makeEmergencyFailSafeGuard() {
		com.google.javascript.jscomp.ComposeWarningsGuard safeGuard = new com.google.javascript.jscomp.ComposeWarningsGuard();
		for (com.google.javascript.jscomp.WarningsGuard guard : guards.descendingSet()) {
			if (guard instanceof com.google.javascript.jscomp.StrictWarningsGuard) {
				continue;
			}else
				if (guard instanceof com.google.javascript.jscomp.DiagnosticGroupWarningsGuard) {
					com.google.javascript.jscomp.DiagnosticGroupWarningsGuard dgGuard = ((com.google.javascript.jscomp.DiagnosticGroupWarningsGuard) (guard));
					if ((dgGuard.level) == (com.google.javascript.jscomp.CheckLevel.ERROR)) {
						safeGuard.addGuard(new com.google.javascript.jscomp.DiagnosticGroupWarningsGuard(dgGuard.group, com.google.javascript.jscomp.CheckLevel.WARNING));
					}else {
						safeGuard.addGuard(guard);
					}
				}else {
					safeGuard.addGuard(guard);
				}
			
		}
		return safeGuard;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return com.google.common.base.Joiner.on(", ").join(guards);
	}
}

