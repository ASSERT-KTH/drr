

package org.apache.commons.math.optimization.direct;


public class MultiDirectionalSimplex extends org.apache.commons.math.optimization.direct.AbstractSimplex {
	private static final double DEFAULT_KHI = 2;

	private static final double DEFAULT_GAMMA = 0.5;

	private final double khi;

	private final double gamma;

	public MultiDirectionalSimplex(final int n) {
		this(n, 1.0);
	}

	public MultiDirectionalSimplex(final int n, double sideLength) {
		this(n, sideLength, org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.DEFAULT_KHI, org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.DEFAULT_GAMMA);
	}

	public MultiDirectionalSimplex(final int n, final double khi, final double gamma) {
		this(n, 1.0, khi, gamma);
	}

	public MultiDirectionalSimplex(final int n, double sideLength, final double khi, final double gamma) {
		super(n, sideLength);
		this.khi = khi;
		this.gamma = gamma;
	}

	public MultiDirectionalSimplex(final double[] steps) {
		this(steps, org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.DEFAULT_KHI, org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.DEFAULT_GAMMA);
	}

	public MultiDirectionalSimplex(final double[] steps, final double khi, final double gamma) {
		super(steps);
		this.khi = khi;
		this.gamma = gamma;
	}

	public MultiDirectionalSimplex(final double[][] referenceSimplex) {
		this(referenceSimplex, org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.DEFAULT_KHI, org.apache.commons.math.optimization.direct.MultiDirectionalSimplex.DEFAULT_GAMMA);
	}

	public MultiDirectionalSimplex(final double[][] referenceSimplex, final double khi, final double gamma) {
		super(referenceSimplex);
		this.khi = khi;
		this.gamma = gamma;
	}

	@java.lang.Override
	public void iterate(final org.apache.commons.math.analysis.MultivariateFunction evaluationFunction, final java.util.Comparator<org.apache.commons.math.optimization.PointValuePair> comparator) {
		final org.apache.commons.math.optimization.PointValuePair[] original = getPoints();
		final org.apache.commons.math.optimization.PointValuePair best = original[0];
		final org.apache.commons.math.optimization.PointValuePair reflected = evaluateNewSimplex(evaluationFunction, original, 1, comparator);
		if ((comparator.compare(reflected, best)) < 0) {
			final org.apache.commons.math.optimization.PointValuePair[] reflectedSimplex = getPoints();
			final org.apache.commons.math.optimization.PointValuePair expanded = evaluateNewSimplex(evaluationFunction, original, khi, comparator);
			if ((comparator.compare(reflected, expanded)) <= 0) {
				setPoints(reflectedSimplex);
			}
			return ;
		}
		evaluateNewSimplex(evaluationFunction, original, gamma, comparator);
	}

	private org.apache.commons.math.optimization.PointValuePair evaluateNewSimplex(final org.apache.commons.math.analysis.MultivariateFunction evaluationFunction, final org.apache.commons.math.optimization.PointValuePair[] original, final double coeff, final java.util.Comparator<org.apache.commons.math.optimization.PointValuePair> comparator) {
		final double[] xSmallest = original[0].getPointRef();
		setPoint(0, original[0]);
		final int dim = getDimension();
		for (int i = 1; i < (getSize()); i++) {
			final double[] xOriginal = original[i].getPointRef();
			final double[] xTransformed = new double[dim];
			for (int j = 0; j < dim; j++) {
				xTransformed[j] = (xSmallest[j]) + (coeff * ((xSmallest[j]) - (xOriginal[j])));
			}
			setPoint(i, new org.apache.commons.math.optimization.PointValuePair(xTransformed, java.lang.Double.NaN, false));
		}
		evaluate(evaluationFunction, comparator);
		return getPoint(0);
	}
}

