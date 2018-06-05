

package org.apache.commons.math.stat.clustering;


public class KMeansPlusPlusClusterer<T extends org.apache.commons.math.stat.clustering.Clusterable<T>> {
	public static enum EmptyClusterStrategy {
LARGEST_VARIANCE, LARGEST_POINTS_NUMBER, FARTHEST_POINT, ERROR;	}

	private final java.util.Random random;

	private final org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy emptyStrategy;

	public KMeansPlusPlusClusterer(final java.util.Random random) {
		this(random, org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy.LARGEST_VARIANCE);
	}

	public KMeansPlusPlusClusterer(final java.util.Random random, final org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.EmptyClusterStrategy emptyStrategy) {
		this.random = random;
		this.emptyStrategy = emptyStrategy;
	}

	public java.util.List<org.apache.commons.math.stat.clustering.Cluster<T>> cluster(final java.util.Collection<T> points, final int k, final int maxIterations) {
		java.util.List<org.apache.commons.math.stat.clustering.Cluster<T>> clusters = org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.chooseInitialCenters(points, k, random);
		org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(clusters, points);
		final int max = maxIterations < 0 ? java.lang.Integer.MAX_VALUE : maxIterations;
		for (int count = 0; count < max; count++) {
			boolean clusteringChanged = false;
			java.util.List<org.apache.commons.math.stat.clustering.Cluster<T>> newClusters = new java.util.ArrayList<org.apache.commons.math.stat.clustering.Cluster<T>>();
			for (final org.apache.commons.math.stat.clustering.Cluster<T> cluster : clusters) {
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
							throw new org.apache.commons.math.exception.ConvergenceException(org.apache.commons.math.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
					}
					clusteringChanged = true;
				}else {
					newCenter = cluster.getCenter().centroidOf(cluster.getPoints());
					if (!(newCenter.equals(cluster.getCenter()))) {
						clusteringChanged = true;
					}
				}
				newClusters.add(new org.apache.commons.math.stat.clustering.Cluster<T>(newCenter));
			}
			if (!clusteringChanged) {
				return clusters;
			}
			org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.assignPointsToClusters(newClusters, points);
			clusters = newClusters;
		}
		return clusters;
	}

	private static <T extends org.apache.commons.math.stat.clustering.Clusterable<T>> void assignPointsToClusters(final java.util.Collection<org.apache.commons.math.stat.clustering.Cluster<T>> clusters, final java.util.Collection<T> points) {
		for (final T p : points) {
			org.apache.commons.math.stat.clustering.Cluster<T> cluster = org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(clusters, p);
			cluster.addPoint(p);
		}
	}

	private static <T extends org.apache.commons.math.stat.clustering.Clusterable<T>> java.util.List<org.apache.commons.math.stat.clustering.Cluster<T>> chooseInitialCenters(final java.util.Collection<T> points, final int k, final java.util.Random random) {
		final java.util.List<T> pointSet = new java.util.ArrayList<T>(points);
		final java.util.List<org.apache.commons.math.stat.clustering.Cluster<T>> resultSet = new java.util.ArrayList<org.apache.commons.math.stat.clustering.Cluster<T>>();
		final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
		resultSet.add(new org.apache.commons.math.stat.clustering.Cluster<T>(firstPoint));
		final double[] dx2 = new double[pointSet.size()];
		while ((resultSet.size()) < k) {
			int sum = 0;
			for (int i = 0; i < (pointSet.size()); i++) {
				final T p = pointSet.get(i);
				final org.apache.commons.math.stat.clustering.Cluster<T> nearest = org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer.getNearestCluster(resultSet, p);
				final double d = p.distanceFrom(nearest.getCenter());
				sum += d * d;
				dx2[i] = sum;
			}
			final double r = (random.nextDouble()) * sum;
			for (int i = 0; i < (dx2.length); i++) {
				if ((dx2[i]) >= r) {
					final T p = pointSet.remove(i);
					resultSet.add(new org.apache.commons.math.stat.clustering.Cluster<T>(p));
					break;
				}
			}
		} 
		return resultSet;
	}

	private T getPointFromLargestVarianceCluster(final java.util.Collection<org.apache.commons.math.stat.clustering.Cluster<T>> clusters) {
		double maxVariance = java.lang.Double.NEGATIVE_INFINITY;
		org.apache.commons.math.stat.clustering.Cluster<T> selected = null;
		for (final org.apache.commons.math.stat.clustering.Cluster<T> cluster : clusters) {
			if (!(cluster.getPoints().isEmpty())) {
				final T center = cluster.getCenter();
				final org.apache.commons.math.stat.descriptive.moment.Variance stat = new org.apache.commons.math.stat.descriptive.moment.Variance();
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
			throw new org.apache.commons.math.exception.ConvergenceException(org.apache.commons.math.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
		}
		final java.util.List<T> selectedPoints = selected.getPoints();
		return selectedPoints.remove(random.nextInt(selectedPoints.size()));
	}

	private T getPointFromLargestNumberCluster(final java.util.Collection<org.apache.commons.math.stat.clustering.Cluster<T>> clusters) {
		int maxNumber = 0;
		org.apache.commons.math.stat.clustering.Cluster<T> selected = null;
		for (final org.apache.commons.math.stat.clustering.Cluster<T> cluster : clusters) {
			final int number = cluster.getPoints().size();
			if (number > maxNumber) {
				maxNumber = number;
				selected = cluster;
			}
		}
		if (selected == null) {
			throw new org.apache.commons.math.exception.ConvergenceException(org.apache.commons.math.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
		}
		final java.util.List<T> selectedPoints = selected.getPoints();
		return selectedPoints.remove(random.nextInt(selectedPoints.size()));
	}

	private T getFarthestPoint(final java.util.Collection<org.apache.commons.math.stat.clustering.Cluster<T>> clusters) {
		double maxDistance = java.lang.Double.NEGATIVE_INFINITY;
		org.apache.commons.math.stat.clustering.Cluster<T> selectedCluster = null;
		int selectedPoint = -1;
		for (final org.apache.commons.math.stat.clustering.Cluster<T> cluster : clusters) {
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
			throw new org.apache.commons.math.exception.ConvergenceException(org.apache.commons.math.exception.util.LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
		}
		return selectedCluster.getPoints().remove(selectedPoint);
	}

	private static <T extends org.apache.commons.math.stat.clustering.Clusterable<T>> org.apache.commons.math.stat.clustering.Cluster<T> getNearestCluster(final java.util.Collection<org.apache.commons.math.stat.clustering.Cluster<T>> clusters, final T point) {
		double minDistance = java.lang.Double.MAX_VALUE;
		org.apache.commons.math.stat.clustering.Cluster<T> minCluster = null;
		for (final org.apache.commons.math.stat.clustering.Cluster<T> c : clusters) {
			final double distance = point.distanceFrom(c.getCenter());
			if (distance < minDistance) {
				minDistance = distance;
				minCluster = c;
			}
		}
		return minCluster;
	}
}

