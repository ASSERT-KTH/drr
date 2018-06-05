

package org.apache.commons.math3.optimization.direct;


@java.lang.Deprecated
public class NelderMeadSimplex extends org.apache.commons.math3.optimization.direct.AbstractSimplex {
	private static final double DEFAULT_RHO = 1;

	private static final double DEFAULT_KHI = 2;

	private static final double DEFAULT_GAMMA = 0.5;

	private static final double DEFAULT_SIGMA = 0.5;

	private final double rho;

	private final double khi;

	private final double gamma;

	private final double sigma;

	public NelderMeadSimplex(final int n) {
		this(n, 1.0);
	}

	public NelderMeadSimplex(final int n, double sideLength) {
		this(n, sideLength, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_RHO, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_KHI, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_GAMMA, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_SIGMA);
	}

	public NelderMeadSimplex(final int n, double sideLength, final double rho, final double khi, final double gamma, final double sigma) {
		super(n, sideLength);
		this.rho = rho;
		this.khi = khi;
		this.gamma = gamma;
		this.sigma = sigma;
	}

	public NelderMeadSimplex(final int n, final double rho, final double khi, final double gamma, final double sigma) {
		this(n, 1.0, rho, khi, gamma, sigma);
	}

	public NelderMeadSimplex(final double[] steps) {
		this(steps, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_RHO, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_KHI, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_GAMMA, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_SIGMA);
	}

	public NelderMeadSimplex(final double[] steps, final double rho, final double khi, final double gamma, final double sigma) {
		super(steps);
		this.rho = rho;
		this.khi = khi;
		this.gamma = gamma;
		this.sigma = sigma;
	}

	public NelderMeadSimplex(final double[][] referenceSimplex) {
		this(referenceSimplex, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_RHO, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_KHI, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_GAMMA, org.apache.commons.math3.optimization.direct.NelderMeadSimplex.DEFAULT_SIGMA);
	}

	public NelderMeadSimplex(final double[][] referenceSimplex, final double rho, final double khi, final double gamma, final double sigma) {
		super(referenceSimplex);
		this.rho = rho;
		this.khi = khi;
		this.gamma = gamma;
		this.sigma = sigma;
	}

	@java.lang.Override
	public void iterate(final org.apache.commons.math3.analysis.MultivariateFunction evaluationFunction, final java.util.Comparator<org.apache.commons.math3.optimization.PointValuePair> comparator) {
		final int n = getDimension();
		final org.apache.commons.math3.optimization.PointValuePair best = getPoint(0);
		final org.apache.commons.math3.optimization.PointValuePair secondBest = getPoint((n - 1));
		final org.apache.commons.math3.optimization.PointValuePair worst = getPoint(n);
		final double[] xWorst = worst.getPointRef();
		final double[] centroid = new double[n];
		for (int i = 0; i < n; i++) {
			final double[] x = getPoint(i).getPointRef();
			for (int j = 0; j < n; j++) {
				centroid[j] += x[j];
			}
		}
		final double scaling = 1.0 / n;
		for (int j = 0; j < n; j++) {
			centroid[j] *= scaling;
		}
		final double[] xR = new double[n];
		for (int j = 0; j < n; j++) {
			xR[j] = (centroid[j]) + ((rho) * ((centroid[j]) - (xWorst[j])));
		}
		final org.apache.commons.math3.optimization.PointValuePair reflected = new org.apache.commons.math3.optimization.PointValuePair(xR, evaluationFunction.value(xR), false);
		if (((comparator.compare(best, reflected)) <= 0) && ((comparator.compare(reflected, secondBest)) < 0)) {
			replaceWorstPoint(reflected, comparator);
		}else
			if ((comparator.compare(reflected, best)) < 0) {
				final double[] xE = new double[n];
				for (int j = 0; j < n; j++) {
					xE[j] = (centroid[j]) + ((khi) * ((xR[j]) - (centroid[j])));
				}
				final org.apache.commons.math3.optimization.PointValuePair expanded = new org.apache.commons.math3.optimization.PointValuePair(xE, evaluationFunction.value(xE), false);
				if ((comparator.compare(expanded, reflected)) < 0) {
					replaceWorstPoint(expanded, comparator);
				}else {
					replaceWorstPoint(reflected, comparator);
				}
			}else {
				if ((comparator.compare(reflected, worst)) < 0) {
					final double[] xC = new double[n];
					for (int j = 0; j < n; j++) {
						xC[j] = (centroid[j]) + ((gamma) * ((xR[j]) - (centroid[j])));
					}
					final org.apache.commons.math3.optimization.PointValuePair outContracted = new org.apache.commons.math3.optimization.PointValuePair(xC, evaluationFunction.value(xC), false);
					if ((comparator.compare(outContracted, reflected)) <= 0) {
						replaceWorstPoint(outContracted, comparator);
						return ;
					}
				}else {
					final double[] xC = new double[n];
					for (int j = 0; j < n; j++) {
						xC[j] = (centroid[j]) - ((gamma) * ((centroid[j]) - (xWorst[j])));
					}
					final org.apache.commons.math3.optimization.PointValuePair inContracted = new org.apache.commons.math3.optimization.PointValuePair(xC, evaluationFunction.value(xC), false);
					if ((comparator.compare(inContracted, worst)) < 0) {
						replaceWorstPoint(inContracted, comparator);
						return ;
					}
				}
				final double[] xSmallest = getPoint(0).getPointRef();
				for (int i = 1; i <= n; i++) {
					final double[] x = getPoint(i).getPoint();
					for (int j = 0; j < n; j++) {
						x[j] = (xSmallest[j]) + ((sigma) * ((x[j]) - (xSmallest[j])));
					}
					setPoint(i, new org.apache.commons.math3.optimization.PointValuePair(x, java.lang.Double.NaN, false));
				}
				evaluate(evaluationFunction, comparator);
			}
		
	}
}

