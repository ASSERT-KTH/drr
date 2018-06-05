

package org.apache.commons.math3.stat.clustering;


public class KMeansPlusPlusClusterer<T extends org.apache.commons.math3.stat.clustering.Clusterable<T>> {
	public static enum EmptyClusterStrategy {
LARGEST_VARIANCE, LARGEST_POINTS_NUMBER, FARTHEST_POINT, ERROR;	}

	private final java.util.Random random;

	private final org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy emptyStrategy;

	public KMeansPlusPlusClusterer(final java.util.Random random) {
		this(random, org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE);
	}

	public KMeansPlusPlusClusterer(final java.util.Random random, final org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy emptyStrategy) {
		this.random = random;
		this.emptyStrategy = emptyStrategy;
	}

	public java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> cluster(final java.util.Collection<T> points, final int k, int numTrials, int maxIterationsPerTrial) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> best = null;
		double bestVarianceSum = java.lang.Double.POSITIVE_INFINITY;
		for (int i = 0; i < numTrials; ++i) {
			java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> clusters = cluster(points, k, maxIterationsPerTrial);
			double varianceSum = 0.0;
			for (final org.apache.commons.math3.stat.clustering.Cluster<T> cluster : clusters) {
				if (!(cluster.getPoints().isEmpty())) {
					final T center = cluster.getCenter();
					final org.apache.commons.math3.stat.descriptive.moment.Variance stat = new org.apache.commons.math3.stat.descriptive.moment.Variance();
					for (final T point : cluster.getPoints()) {
						stat.increment(point.distanceFrom(center));
					}
					varianceSum += stat.getResult();
				}
			}
			if (varianceSum <= bestVarianceSum) {
				best = clusters;
				bestVarianceSum = varianceSum;
			}
		}
		return best;
	}

	public java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> cluster(final java.util.Collection<T> points, final int k, final int maxIterations) throws org.apache.commons.math3.exception.MathIllegalArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(points);
		if ((points.size()) < k) {
			throw new org.apache.commons.math3.exception.NumberIsTooSmallException(points.size(), k, false);
		}
		java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> clusters = org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(points, k, random);
		int[] assignments = new int[points.size()];
		org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(clusters, points, assignments);
		final int max = maxIterations < 0 ? java.lang.Integer.MAX_VALUE : maxIterations;
		for (int count = 0; count < max; count++) {
			boolean emptyCluster = false;
			java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> newClusters = new java.util.ArrayList<org.apache.commons.math3.stat.clustering.Cluster<T>>();
			for (final org.apache.commons.math3.stat.clustering.Cluster<T> cluster : clusters) {
				final T newCenter;
				if (cluster.getPoints().isEmpty()) {
					switch (emptyStrategy) {
						case LARGEST_VARIANCE :
							newCenter = getPointFromLargestVarianceCluster(clusters);
							break;
						case LARGEST_POINTS_NUMBER :
							newCenter = getPointFromLargestNumberCluster(clusters);
							break;
						case FARTHEST_POINT :
							newCenter = getFarthestPoint(clusters);
							break;
						default :
							throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
					}
					emptyCluster = true;
				}else {
					newCenter = cluster.getCenter().centroidOf(cluster.getPoints());
				}
				newClusters.add(new org.apache.commons.math3.stat.clustering.Cluster<T>(newCenter));
			}
			int changes = org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(newClusters, points, assignments);
			clusters = newClusters;
			if ((changes == 0) && (!emptyCluster)) {
				return clusters;
			}
		}
		return clusters;
	}

	private static <T extends org.apache.commons.math3.stat.clustering.Clusterable<T>> int assignPointsToClusters(final java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> clusters, final java.util.Collection<T> points, final int[] assignments) {
		int assignedDifferently = 0;
		int pointIndex = 0;
		for (final T p : points) {
			int clusterIndex = org.apache.commons.math3.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(clusters, p);
			if (clusterIndex != (assignments[pointIndex])) {
				assignedDifferently++;
			}
			org.apache.commons.math3.stat.clustering.Cluster<T> cluster = clusters.get(clusterIndex);
			cluster.addPoint(p);
			assignments[(pointIndex++)] = clusterIndex;
		}
		return assignedDifferently;
	}

	private static <T extends org.apache.commons.math3.stat.clustering.Clusterable<T>> java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> chooseInitialCenters(final java.util.Collection<T> points, final int k, final java.util.Random random) {
		final java.util.List<T> pointList = java.util.Collections.unmodifiableList(new java.util.ArrayList<T>(points));
		final int numPoints = pointList.size();
		final boolean[] taken = new boolean[numPoints];
		final java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> resultSet = new java.util.ArrayList<org.apache.commons.math3.stat.clustering.Cluster<T>>();
		final int firstPointIndex = random.nextInt(numPoints);
		final T firstPoint = pointList.get(firstPointIndex);
		resultSet.add(new org.apache.commons.math3.stat.clustering.Cluster<T>(firstPoint));
		taken[firstPointIndex] = true;
		final double[] minDistSquared = new double[numPoints];
		for (int i = 0; i < numPoints; i++) {
			if (i != firstPointIndex) {
				double d = firstPoint.distanceFrom(pointList.get(i));
				minDistSquared[i] = d * d;
			}
		}
		while ((resultSet.size()) < k) {
			double distSqSum = 0.0;
			for (int i = 0; i < numPoints; i++) {
				if (!(taken[i])) {
					distSqSum += minDistSquared[i];
				}
			}
			final double r = (random.nextDouble()) * distSqSum;
			int nextPointIndex = -1;
			double sum = 0.0;
			for (int i = 0; i < numPoints; i++) {
				if (!(taken[i])) {
					sum += minDistSquared[i];
					if (sum >= r) {
						nextPointIndex = i;
						break;
					}
				}
			}
			if (nextPointIndex == (-1)) {
				for (int i = numPoints - 1; i >= 0; i--) {
					if (!(taken[i])) {
						nextPointIndex = i;
						break;
					}
				}
			}
			if (nextPointIndex >= 0) {
				final T p = pointList.get(nextPointIndex);
				resultSet.add(new org.apache.commons.math3.stat.clustering.Cluster<T>(p));
				taken[nextPointIndex] = true;
				if ((resultSet.size()) < k) {
					for (int j = 0; j < numPoints; j++) {
						if (!(taken[j])) {
							double d = p.distanceFrom(pointList.get(j));
							double d2 = d * d;
							if (d2 < (minDistSquared[j])) {
								minDistSquared[j] = d2;
							}
						}
					}
				}
			}else {
				break;
			}
		} 
		return resultSet;
	}

	private T getPointFromLargestVarianceCluster(final java.util.Collection<org.apache.commons.math3.stat.clustering.Cluster<T>> clusters) {
		double maxVariance = java.lang.Double.NEGATIVE_INFINITY;
		org.apache.commons.math3.stat.clustering.Cluster<T> selected = null;
		for (final org.apache.commons.math3.stat.clustering.Cluster<T> cluster : clusters) {
			if (!(cluster.getPoints().isEmpty())) {
				final T center = cluster.getCenter();
				final org.apache.commons.math3.stat.descriptive.moment.Variance stat = new org.apache.commons.math3.stat.descriptive.moment.Variance();
				for (final T point : cluster.getPoints()) {
					stat.increment(point.distanceFrom(center));
				}
				final double variance = stat.getResult();
				if (variance > maxVariance) {
					maxVariance = variance;
					selected = cluster;
				}
			}
		}
		if (selected == null) {
			throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
		}
		final java.util.List<T> selectedPoints = selected.getPoints();
		return selectedPoints.remove(random.nextInt(selectedPoints.size()));
	}

	private T getPointFromLargestNumberCluster(final java.util.Collection<org.apache.commons.math3.stat.clustering.Cluster<T>> clusters) {
		int maxNumber = 0;
		org.apache.commons.math3.stat.clustering.Cluster<T> selected = null;
		for (final org.apache.commons.math3.stat.clustering.Cluster<T> cluster : clusters) {
			final int number = cluster.getPoints().size();
			if (number > maxNumber) {
				maxNumber = number;
				selected = cluster;
			}
		}
		if (selected == null) {
			throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
		}
		final java.util.List<T> selectedPoints = selected.getPoints();
		return selectedPoints.remove(random.nextInt(selectedPoints.size()));
	}

	private T getFarthestPoint(final java.util.Collection<org.apache.commons.math3.stat.clustering.Cluster<T>> clusters) {
		double maxDistance = java.lang.Double.NEGATIVE_INFINITY;
		org.apache.commons.math3.stat.clustering.Cluster<T> selectedCluster = null;
		int selectedPoint = -1;
		for (final org.apache.commons.math3.stat.clustering.Cluster<T> cluster : clusters) {
			final T center = cluster.getCenter();
			final java.util.List<T> points = cluster.getPoints();
			for (int i = 0; i < (points.size()); ++i) {
				final double distance = points.get(i).distanceFrom(center);
				if (distance > maxDistance) {
					maxDistance = distance;
					selectedCluster = cluster;
					selectedPoint = i;
				}
			}
		}
		if (selectedCluster == null) {
			throw new org.apache.commons.math3.exception.ConvergenceException(org.apache.commons.math3.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
		}
		return selectedCluster.getPoints().remove(selectedPoint);
	}

	private static <T extends org.apache.commons.math3.stat.clustering.Clusterable<T>> int getNearestCluster(final java.util.Collection<org.apache.commons.math3.stat.clustering.Cluster<T>> clusters, final T point) {
		double minDistance = java.lang.Double.MAX_VALUE;
		int clusterIndex = 0;
		int minCluster = 0;
		for (final org.apache.commons.math3.stat.clustering.Cluster<T> c : clusters) {
			final double distance = point.distanceFrom(c.getCenter());
			if (distance < minDistance) {
				minDistance = distance;
				minCluster = clusterIndex;
			}
			clusterIndex++;
		}
		return minCluster;
	}
}

