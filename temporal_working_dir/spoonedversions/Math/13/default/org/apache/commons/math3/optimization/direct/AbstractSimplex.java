

package org.apache.commons.math3.optimization.direct;


@java.lang.Deprecated
public abstract class AbstractSimplex implements org.apache.commons.math3.optimization.OptimizationData {
	private org.apache.commons.math3.optimization.PointValuePair[] simplex;

	private double[][] startConfiguration;

	private final int dimension;

	protected AbstractSimplex(int n) {
		this(n, 1.0);
	}

	protected AbstractSimplex(int n, double sideLength) {
		this(org.apache.commons.math3.optimization.direct.AbstractSimplex.createHypercubeSteps(n, sideLength));
	}

	protected AbstractSimplex(final double[] steps) {
		if (steps == null) {
			throw new org.apache.commons.math3.exception.NullArgumentException();
		}
		if ((steps.length) == 0) {
			throw new org.apache.commons.math3.exception.ZeroException();
		}
		dimension = steps.length;
		startConfiguration = new double[dimension][dimension];
		for (int i = 0; i < (dimension); i++) {
			final double[] vertexI = startConfiguration[i];
			for (int j = 0; j < (i + 1); j++) {
				if ((steps[j]) == 0) {
					throw new org.apache.commons.math3.exception.ZeroException(org.apache.commons.math3.exception.util.LocalizedFormats.EQUAL_VERTICES_IN_SIMPLEX);
				}
				java.lang.System.arraycopy(steps, 0, vertexI, 0, (j + 1));
			}
		}
	}

	protected AbstractSimplex(final double[][] referenceSimplex) {
		if ((referenceSimplex.length) <= 0) {
			throw new org.apache.commons.math3.exception.NotStrictlyPositiveException(org.apache.commons.math3.exception.util.LocalizedFormats.SIMPLEX_NEED_ONE_POINT, referenceSimplex.length);
		}
		dimension = (referenceSimplex.length) - 1;
		startConfiguration = new double[dimension][dimension];
		final double[] ref0 = referenceSimplex[0];
		for (int i = 0; i < (referenceSimplex.length); i++) {
			final double[] refI = referenceSimplex[i];
			if ((refI.length) != (dimension)) {
				throw new org.apache.commons.math3.exception.DimensionMismatchException(refI.length, dimension);
			}
			for (int j = 0; j < i; j++) {
				final double[] refJ = referenceSimplex[j];
				boolean allEquals = true;
				for (int k = 0; k < (dimension); k++) {
					if ((refI[k]) != (refJ[k])) {
						allEquals = false;
						break;
					}
				}
				if (allEquals) {
					throw new org.apache.commons.math3.exception.MathIllegalArgumentException(org.apache.commons.math3.exception.util.LocalizedFormats.EQUAL_VERTICES_IN_SIMPLEX, i, j);
				}
			}
			if (i > 0) {
				final double[] confI = startConfiguration[(i - 1)];
				for (int k = 0; k < (dimension); k++) {
					confI[k] = (refI[k]) - (ref0[k]);
				}
			}
		}
	}

	public int getDimension() {
		return dimension;
	}

	public int getSize() {
		return simplex.length;
	}

	public abstract void iterate(final org.apache.commons.math3.analysis.MultivariateFunction evaluationFunction, final java.util.Comparator<org.apache.commons.math3.optimization.PointValuePair> comparator);

	public void build(final double[] startPoint) {
		if ((dimension) != (startPoint.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(dimension, startPoint.length);
		}
		simplex = new org.apache.commons.math3.optimization.PointValuePair[(dimension) + 1];
		simplex[0] = new org.apache.commons.math3.optimization.PointValuePair(startPoint, java.lang.Double.NaN);
		for (int i = 0; i < (dimension); i++) {
			final double[] confI = startConfiguration[i];
			final double[] vertexI = new double[dimension];
			for (int k = 0; k < (dimension); k++) {
				vertexI[k] = (startPoint[k]) + (confI[k]);
			}
			simplex[(i + 1)] = new org.apache.commons.math3.optimization.PointValuePair(vertexI, java.lang.Double.NaN);
		}
	}

	public void evaluate(final org.apache.commons.math3.analysis.MultivariateFunction evaluationFunction, final java.util.Comparator<org.apache.commons.math3.optimization.PointValuePair> comparator) {
		for (int i = 0; i < (simplex.length); i++) {
			final org.apache.commons.math3.optimization.PointValuePair vertex = simplex[i];
			final double[] point = vertex.getPointRef();
			if (java.lang.Double.isNaN(vertex.getValue())) {
				simplex[i] = new org.apache.commons.math3.optimization.PointValuePair(point, evaluationFunction.value(point), false);
			}
		}
		java.util.Arrays.sort(simplex, comparator);
	}

	protected void replaceWorstPoint(org.apache.commons.math3.optimization.PointValuePair pointValuePair, final java.util.Comparator<org.apache.commons.math3.optimization.PointValuePair> comparator) {
		for (int i = 0; i < (dimension); i++) {
			if ((comparator.compare(simplex[i], pointValuePair)) > 0) {
				org.apache.commons.math3.optimization.PointValuePair tmp = simplex[i];
				simplex[i] = pointValuePair;
				pointValuePair = tmp;
			}
		}
		simplex[dimension] = pointValuePair;
	}

	public org.apache.commons.math3.optimization.PointValuePair[] getPoints() {
		final org.apache.commons.math3.optimization.PointValuePair[] copy = new org.apache.commons.math3.optimization.PointValuePair[simplex.length];
		java.lang.System.arraycopy(simplex, 0, copy, 0, simplex.length);
		return copy;
	}

	public org.apache.commons.math3.optimization.PointValuePair getPoint(int index) {
		if ((index < 0) || (index >= (simplex.length))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(index, 0, ((simplex.length) - 1));
		}
		return simplex[index];
	}

	protected void setPoint(int index, org.apache.commons.math3.optimization.PointValuePair point) {
		if ((index < 0) || (index >= (simplex.length))) {
			throw new org.apache.commons.math3.exception.OutOfRangeException(index, 0, ((simplex.length) - 1));
		}
		simplex[index] = point;
	}

	protected void setPoints(org.apache.commons.math3.optimization.PointValuePair[] points) {
		if ((points.length) != (simplex.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(points.length, simplex.length);
		}
		simplex = points;
	}

	private static double[] createHypercubeSteps(int n, double sideLength) {
		final double[] steps = new double[n];
		for (int i = 0; i < n; i++) {
			steps[i] = sideLength;
		}
		return steps;
	}
}

