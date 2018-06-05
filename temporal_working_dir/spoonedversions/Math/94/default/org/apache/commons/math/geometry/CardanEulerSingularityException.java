

package org.apache.commons.math.geometry;


public class CardanEulerSingularityException extends org.apache.commons.math.MathException {
	public CardanEulerSingularityException(boolean isCardan) {
		super((isCardan ? "Cardan angles singularity" : "Euler angles singularity"), null);
	}

	private static final long serialVersionUID = -1360952845582206770L;
}

