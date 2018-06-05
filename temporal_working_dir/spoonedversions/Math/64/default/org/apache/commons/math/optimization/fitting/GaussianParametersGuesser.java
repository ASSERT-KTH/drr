

package org.apache.commons.math.optimization.fitting;


public class GaussianParametersGuesser {
	private final org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] observations;

	private double[] parameters;

	public GaussianParametersGuesser(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] observations) {
		if (observations == null) {
			throw new org.apache.commons.math.exception.NullArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.INPUT_ARRAY);
		}
		if ((observations.length) < 3) {
			throw new org.apache.commons.math.exception.NumberIsTooSmallException(observations.length, 3, true);
		}
		this.observations = observations.clone();
	}

	public double[] guess() {
		if ((parameters) == null) {
			parameters = basicGuess(observations);
		}
		return parameters.clone();
	}

	private double[] basicGuess(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] points) {
		java.util.Arrays.sort(points, createWeightedObservedPointComparator());
		double[] params = new double[4];
		int minYIdx = findMinY(points);
		params[0] = points[minYIdx].getY();
		int maxYIdx = findMaxY(points);
		params[1] = points[maxYIdx].getY();
		params[2] = points[maxYIdx].getX();
		double fwhmApprox;
		try {
			double halfY = (params[0]) + (((params[1]) - (params[0])) / 2.0);
			double fwhmX1 = interpolateXAtY(points, maxYIdx, (-1), halfY);
			double fwhmX2 = interpolateXAtY(points, maxYIdx, (+1), halfY);
			fwhmApprox = fwhmX2 - fwhmX1;
		} catch (org.apache.commons.math.exception.OutOfRangeException e) {
			fwhmApprox = (points[((points.length) - 1)].getX()) - (points[0].getX());
		}
		params[3] = fwhmApprox / (2.0 * (java.lang.Math.sqrt((2.0 * (java.lang.Math.log(2.0))))));
		return params;
	}

	private int findMinY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] points) {
		int minYIdx = 0;
		for (int i = 1; i < (points.length); i++) {
			if ((points[i].getY()) < (points[minYIdx].getY())) {
				minYIdx = i;
			}
		}
		return minYIdx;
	}

	private int findMaxY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] points) {
		int maxYIdx = 0;
		for (int i = 1; i < (points.length); i++) {
			if ((points[i].getY()) > (points[maxYIdx].getY())) {
				maxYIdx = i;
			}
		}
		return maxYIdx;
	}

	private double interpolateXAtY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] points, int startIdx, int idxStep, double y) throws org.apache.commons.math.exception.OutOfRangeException {
		if (idxStep == 0) {
			throw new org.apache.commons.math.exception.ZeroException();
		}
		org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] twoPoints = getInterpolationPointsForY(points, startIdx, idxStep, y);
		org.apache.commons.math.optimization.fitting.WeightedObservedPoint pointA = twoPoints[0];
		org.apache.commons.math.optimization.fitting.WeightedObservedPoint pointB = twoPoints[1];
		if ((pointA.getY()) == y) {
			return pointA.getX();
		}
		if ((pointB.getY()) == y) {
			return pointB.getX();
		}
		return (pointA.getX()) + (((y - (pointA.getY())) * ((pointB.getX()) - (pointA.getX()))) / ((pointB.getY()) - (pointA.getY())));
	}

	private org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] getInterpolationPointsForY(org.apache.commons.math.optimization.fitting.WeightedObservedPoint[] points, int startIdx, int idxStep, double y) throws org.apache.commons.math.exception.OutOfRangeException {
		if (idxStep == 0) {
			throw new org.apache.commons.math.exception.ZeroException();
		}
		for (int i = startIdx; idxStep < 0 ? (i + idxStep) >= 0 : (i + idxStep) < (points.length); i += idxStep) {
			if (isBetween(y, points[i].getY(), points[(i + idxStep)].getY())) {
				return idxStep < 0 ? new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[]{ points[(i + idxStep)] , points[i] } : new org.apache.commons.math.optimization.fitting.WeightedObservedPoint[]{ points[i] , points[(i + idxStep)] };
			}
		}
		double minY = java.lang.Double.POSITIVE_INFINITY;
		double maxY = java.lang.Double.NEGATIVE_INFINITY;
		for (final org.apache.commons.math.optimization.fitting.WeightedObservedPoint point : points) {
			minY = java.lang.Math.min(minY, point.getY());
			maxY = java.lang.Math.max(maxY, point.getY());
		}
		throw new org.apache.commons.math.exception.OutOfRangeException(y, minY, maxY);
	}

	private boolean isBetween(double value, double boundary1, double boundary2) {
		return ((value >= boundary1) && (value <= boundary2)) || ((value >= boundary2) && (value <= boundary1));
	}

	private java.util.Comparator<org.apache.commons.math.optimization.fitting.WeightedObservedPoint> createWeightedObservedPointComparator() {
		return new java.util.Comparator<org.apache.commons.math.optimization.fitting.WeightedObservedPoint>() {
			public int compare(org.apache.commons.math.optimization.fitting.WeightedObservedPoint p1, org.apache.commons.math.optimization.fitting.WeightedObservedPoint p2) {
				if ((p1 == null) && (p2 == null)) {
					return 0;
				}
				if (p1 == null) {
					return -1;
				}
				if (p2 == null) {
					return 1;
				}
				if ((p1.getX()) < (p2.getX())) {
					return -1;
				}
				if ((p1.getX()) > (p2.getX())) {
					return 1;
				}
				if ((p1.getY()) < (p2.getY())) {
					return -1;
				}
				if ((p1.getY()) > (p2.getY())) {
					return 1;
				}
				if ((p1.getWeight()) < (p2.getWeight())) {
					return -1;
				}
				if ((p1.getWeight()) > (p2.getWeight())) {
					return 1;
				}
				return 0;
			}
		};
	}
}

