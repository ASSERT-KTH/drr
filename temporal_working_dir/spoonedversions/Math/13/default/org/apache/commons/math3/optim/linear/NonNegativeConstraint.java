

package org.apache.commons.math3.optim.linear;


public class NonNegativeConstraint implements org.apache.commons.math3.optim.OptimizationData {
	private final boolean isRestricted;

	public NonNegativeConstraint(boolean restricted) {
		isRestricted = restricted;
	}

	public boolean isRestrictedToNonNegative() {
		return isRestricted;
	}
}

