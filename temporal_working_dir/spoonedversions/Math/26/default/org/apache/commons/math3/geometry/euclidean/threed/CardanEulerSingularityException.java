

package org.apache.commons.math3.geometry.euclidean.threed;


public class CardanEulerSingularityException extends org.apache.commons.math3.exception.MathIllegalStateException {
	private static final long serialVersionUID = -1360952845582206770L;

	public CardanEulerSingularityException(boolean isCardan) {
		super((isCardan ? org.apache.commons.math3.exception.util.LocalizedFormats.CARDAN_ANGLES_SINGULARITY : org.apache.commons.math3.exception.util.LocalizedFormats.EULER_ANGLES_SINGULARITY));
	}
}

