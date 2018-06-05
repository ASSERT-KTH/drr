

package org.apache.commons.math3.stat.clustering;


public class DBSCANClusterer<T extends org.apache.commons.math3.stat.clustering.Clusterable<T>> {
	private final double eps;

	private final int minPts;

	private enum PointStatus {
NOISE, PART_OF_CLUSTER;	}

	public DBSCANClusterer(final double eps, final int minPts) throws org.apache.commons.math3.exception.NotPositiveException {
		if (eps < 0.0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(eps);
		}
		if (minPts < 0) {
			throw new org.apache.commons.math3.exception.NotPositiveException(minPts);
		}
		this.eps = eps;
		this.minPts = minPts;
	}

	public double getEps() {
		return eps;
	}

	public int getMinPts() {
		return minPts;
	}

	public java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> cluster(final java.util.Collection<T> points) throws org.apache.commons.math3.exception.NullArgumentException {
		org.apache.commons.math3.util.MathUtils.checkNotNull(points);
		final java.util.List<org.apache.commons.math3.stat.clustering.Cluster<T>> clusters = new java.util.ArrayList<org.apache.commons.math3.stat.clustering.Cluster<T>>();
		final java.util.Map<org.apache.commons.math3.stat.clustering.Clusterable<T>, org.apache.commons.math3.stat.clustering.DBSCANClusterer.PointStatus> visited = new java.util.HashMap<org.apache.commons.math3.stat.clustering.Clusterable<T>, org.apache.commons.math3.stat.clustering.DBSCANClusterer.PointStatus>();
		for (final T point : points) {
			if ((visited.get(point)) != null) {
				continue;
			}
			final java.util.List<T> neighbors = getNeighbors(point, points);
			if ((neighbors.size()) >= (minPts)) {
				final org.apache.commons.math3.stat.clustering.Cluster<T> cluster = new org.apache.commons.math3.stat.clustering.Cluster<T>(null);
				clusters.add(expandCluster(cluster, point, neighbors, points, visited));
			}else {
				visited.put(point, org.apache.commons.math3.stat.clustering.DBSCANClusterer.PointStatus.NOISE);
			}
		}
		return clusters;
	}

	private org.apache.commons.math3.stat.clustering.Cluster<T> expandCluster(final org.apache.commons.math3.stat.clustering.Cluster<T> cluster, final T point, final java.util.List<T> neighbors, final java.util.Collection<T> points, final java.util.Map<org.apache.commons.math3.stat.clustering.Clusterable<T>, org.apache.commons.math3.stat.clustering.DBSCANClusterer.PointStatus> visited) {
		cluster.addPoint(point);
		visited.put(point, org.apache.commons.math3.stat.clustering.DBSCANClusterer.PointStatus.PART_OF_CLUSTER);
		java.util.List<T> seeds = new java.util.ArrayList<T>(neighbors);
		int index = 0;
		while (index < (seeds.size())) {
			final T current = seeds.get(index);
			org.apache.commons.math3.stat.clustering.DBSCANClusterer.PointStatus pStatus = visited.get(current);
			if (pStatus == null) {
				final java.util.List<T> currentNeighbors = getNeighbors(current, points);
				if ((currentNeighbors.size()) >= (minPts)) {
					seeds = merge(seeds, currentNeighbors);
				}
			}
			if (pStatus != (org.apache.commons.math3.stat.clustering.DBSCANClusterer.PointStatus.PART_OF_CLUSTER)) {
				visited.put(current, org.apache.commons.math3.stat.clustering.DBSCANClusterer.PointStatus.PART_OF_CLUSTER);
				cluster.addPoint(current);
			}
			index++;
		} 
		return cluster;
	}

	private java.util.List<T> getNeighbors(final T point, final java.util.Collection<T> points) {
		final java.util.List<T> neighbors = new java.util.ArrayList<T>();
		for (final T neighbor : points) {
			if ((point != neighbor) && ((neighbor.distanceFrom(point)) <= (eps))) {
				neighbors.add(neighbor);
			}
		}
		return neighbors;
	}

	private java.util.List<T> merge(final java.util.List<T> one, final java.util.List<T> two) {
		final java.util.Set<T> oneSet = new java.util.HashSet<T>(one);
		for (T item : two) {
			if (!(oneSet.contains(item))) {
				one.add(item);
			}
		}
		return one;
	}
}

