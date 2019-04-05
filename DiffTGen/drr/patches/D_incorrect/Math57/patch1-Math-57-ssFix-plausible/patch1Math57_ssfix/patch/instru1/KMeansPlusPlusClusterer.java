/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math.stat.clustering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.apache.commons.math.exception.ConvergenceException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.stat.descriptive.moment.Variance;
import java.util.Map;
import java.util.HashMap;
import myprinter.FieldPrinter;

/**
 * Clustering algorithm based on David Arthur and Sergei Vassilvitski k-means++ algorithm.
 * @param <T> type of the points to cluster
 * @see <a href="http://en.wikipedia.org/wiki/K-means%2B%2B">K-means++ (wikipedia)</a>
 * @version $Revision$ $Date$
 * @since 2.0
 */
public class KMeansPlusPlusClusterer<T extends Clusterable<T>> {

    public static int eid_KMeansPlusPlusClusterer_Random_7au3e = 0;

	public static int eid_KMeansPlusPlusClusterer_Random_EmptyClusterStrategy_7au3e = 0;

	public static int eid_cluster_CollectionLTEMPTRTEMP_int_int_7au3e = 0;

	public static int eid_assignPointsToClusters_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_CollectionLTEMPTRTEMP_7au3e = 0;

	public static int eid_chooseInitialCenters_CollectionLTEMPTRTEMP_int_Random_7au3e = 0;

	public static int eid_getPointFromLargestVarianceCluster_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_7au3e = 0;

	public static int eid_getPointFromLargestNumberCluster_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_7au3e = 0;

	public static int eid_getFarthestPoint_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_7au3e = 0;

	public static int eid_getNearestCluster_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_T_7au3e = 0;

	public static Map oref_map = new HashMap();

	public static void addToORefMap(String msig, Object obj) {
		List l = (List) oref_map.get(msig);
		if (l == null) {
			l = new ArrayList();
			oref_map.put(msig, l);
		}
		l.add(obj);
	}

	public static void clearORefMap() {
		oref_map.clear();
		eid_KMeansPlusPlusClusterer_Random_7au3e = 0;
		eid_KMeansPlusPlusClusterer_Random_EmptyClusterStrategy_7au3e = 0;
		eid_cluster_CollectionLTEMPTRTEMP_int_int_7au3e = 0;
		eid_assignPointsToClusters_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_CollectionLTEMPTRTEMP_7au3e = 0;
		eid_chooseInitialCenters_CollectionLTEMPTRTEMP_int_Random_7au3e = 0;
		eid_getPointFromLargestVarianceCluster_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_7au3e = 0;
		eid_getPointFromLargestNumberCluster_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_7au3e = 0;
		eid_getFarthestPoint_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_7au3e = 0;
		eid_getNearestCluster_CollectionLTEMPClusterLTEMPTRTEMPRTEMP_T_7au3e = 0;
	}

	/** Strategies to use for replacing an empty cluster. */
    public static enum EmptyClusterStrategy {

        /** Split the cluster with largest distance variance. */
        LARGEST_VARIANCE,

        /** Split the cluster with largest number of points. */
        LARGEST_POINTS_NUMBER,

        /** Create a cluster around the point farthest from its centroid. */
        FARTHEST_POINT,

        /** Generate an error. */
        ERROR

    }

    /** Random generator for choosing initial centers. */
    private final Random random;

    /** Selected strategy for empty clusters. */
    private final EmptyClusterStrategy emptyStrategy;

    /** Build a clusterer.
     * <p>
     * The default strategy for handling empty clusters that may appear during
     * algorithm iterations is to split the cluster with largest distance variance.
     * </p>
     * @param random random generator to use for choosing initial centers
     */
    public KMeansPlusPlusClusterer(final Random random) {
        this(random, EmptyClusterStrategy.LARGEST_VARIANCE);
    }

    /** Build a clusterer.
     * @param random random generator to use for choosing initial centers
     * @param emptyStrategy strategy to use for handling empty clusters that
     * may appear during algorithm iterations
     * @since 2.2
     */
    public KMeansPlusPlusClusterer(final Random random, final EmptyClusterStrategy emptyStrategy) {
        this.random        = random;
        this.emptyStrategy = emptyStrategy;
    }

    /**
     * Runs the K-means++ clustering algorithm.
     *
     * @param points the points to cluster
     * @param k the number of clusters to split the data into
     * @param maxIterations the maximum number of iterations to run the algorithm
     *     for.  If negative, no maximum will be used
     * @return a list of clusters containing the points
     */
    public List<Cluster<T>> cluster(final Collection<T> points,
                                    final int k, final int maxIterations) {
        // create the initial clusters
        List<Cluster<T>> clusters = chooseInitialCenters(points, k, random);
        assignPointsToClusters(clusters, points);

        // iterate through updating the centers until we're done
        final int max = (maxIterations < 0) ? Integer.MAX_VALUE : maxIterations;
        for (int count = 0; count < max; count++) {
            boolean clusteringChanged = false;
            List<Cluster<T>> newClusters = new ArrayList<Cluster<T>>();
            for (final Cluster<T> cluster : clusters) {
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
                            throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
                    }
                    clusteringChanged = true;
                } else {
                    newCenter = cluster.getCenter().centroidOf(cluster.getPoints());
                    if (!newCenter.equals(cluster.getCenter())) {
                        clusteringChanged = true;
                    }
                }
                newClusters.add(new Cluster<T>(newCenter));
            }
            if (!clusteringChanged) {
                return clusters;
            }
            assignPointsToClusters(newClusters, points);
            clusters = newClusters;
        }
        return clusters;
    }

    /**
     * Adds the given points to the closest {@link Cluster}.
     *
     * @param <T> type of the points to cluster
     * @param clusters the {@link Cluster}s to add the points to
     * @param points the points to add to the given {@link Cluster}s
     */
    private static <T extends Clusterable<T>> void
        assignPointsToClusters(final Collection<Cluster<T>> clusters, final Collection<T> points) {
        for (final T p : points) {
            Cluster<T> cluster = getNearestCluster(clusters, p);
            cluster.addPoint(p);
        }
    }

    /**
     * Use K-means++ to choose the initial centers.
     *
     * @param <T> type of the points to cluster
     * @param points the points to choose the initial centers from
     * @param k the number of centers to choose
     * @param random random generator to use
     * @return the initial centers
     */
    private static <T extends Clusterable<T>> List<Cluster<T>>
        chooseInitialCenters_7au3e(final Collection<T> points, final int k, final Random random) {

        final List<T> pointSet = new ArrayList<T>(points);
        final List<Cluster<T>> resultSet = new ArrayList<Cluster<T>>();

        // Choose one center uniformly at random from among the data points.
        final T firstPoint = pointSet.remove(random.nextInt(pointSet.size()));
        resultSet.add(new Cluster<T>(firstPoint));

        final double[] dx2 = new double[pointSet.size()];
        while (resultSet.size() < k) {
            // For each data point x, compute D(x), the distance between x and
            // the nearest center that has already been chosen.
            float sum = 0;
            for (int i = 0; i < pointSet.size(); i++) {
                final T p = pointSet.get(i);
                final Cluster<T> nearest = getNearestCluster(resultSet, p);
                final double d = p.distanceFrom(nearest.getCenter());
                sum += d * d;
                dx2[i] = sum;
            }

            // Add one new data point as a center. Each point x is chosen with
            // probability proportional to D(x)2
            final double r = random.nextDouble() * sum;
            for (int i = 0 ; i < dx2.length; i++) {
                if (dx2[i] >= r) {
                    final T p = pointSet.remove(i);
                    resultSet.add(new Cluster<T>(p));
                    break;
                }
            }
        }

        return resultSet;

    }

    /**
     * Get a random point from the {@link Cluster} with the largest distance variance.
     *
     * @param clusters the {@link Cluster}s to search
     * @return a random point from the selected cluster
     */
    private T getPointFromLargestVarianceCluster(final Collection<Cluster<T>> clusters) {

        double maxVariance = Double.NEGATIVE_INFINITY;
        Cluster<T> selected = null;
        for (final Cluster<T> cluster : clusters) {
            if (!cluster.getPoints().isEmpty()) {

                // compute the distance variance of the current cluster
                final T center = cluster.getCenter();
                final Variance stat = new Variance();
                for (final T point : cluster.getPoints()) {
                    stat.increment(point.distanceFrom(center));
                }
                final double variance = stat.getResult();

                // select the cluster with the largest variance
                if (variance > maxVariance) {
                    maxVariance = variance;
                    selected = cluster;
                }

            }
        }

        // did we find at least one non-empty cluster ?
        if (selected == null) {
            throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
        }

        // extract a random point from the cluster
        final List<T> selectedPoints = selected.getPoints();
        return selectedPoints.remove(random.nextInt(selectedPoints.size()));

    }

    /**
     * Get a random point from the {@link Cluster} with the largest number of points
     *
     * @param clusters the {@link Cluster}s to search
     * @return a random point from the selected cluster
     */
    private T getPointFromLargestNumberCluster(final Collection<Cluster<T>> clusters) {

        int maxNumber = 0;
        Cluster<T> selected = null;
        for (final Cluster<T> cluster : clusters) {

            // get the number of points of the current cluster
            final int number = cluster.getPoints().size();

            // select the cluster with the largest number of points
            if (number > maxNumber) {
                maxNumber = number;
                selected = cluster;
            }

        }

        // did we find at least one non-empty cluster ?
        if (selected == null) {
            throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
        }

        // extract a random point from the cluster
        final List<T> selectedPoints = selected.getPoints();
        return selectedPoints.remove(random.nextInt(selectedPoints.size()));

    }

    /**
     * Get the point farthest to its cluster center
     *
     * @param clusters the {@link Cluster}s to search
     * @return point farthest to its cluster center
     */
    private T getFarthestPoint(final Collection<Cluster<T>> clusters) {

        double maxDistance = Double.NEGATIVE_INFINITY;
        Cluster<T> selectedCluster = null;
        int selectedPoint = -1;
        for (final Cluster<T> cluster : clusters) {

            // get the farthest point
            final T center = cluster.getCenter();
            final List<T> points = cluster.getPoints();
            for (int i = 0; i < points.size(); ++i) {
                final double distance = points.get(i).distanceFrom(center);
                if (distance > maxDistance) {
                    maxDistance     = distance;
                    selectedCluster = cluster;
                    selectedPoint   = i;
                }
            }

        }

        // did we find at least one non-empty cluster ?
        if (selectedCluster == null) {
            throw new ConvergenceException(LocalizedFormats.EMPTY_CLUSTER_IN_K_MEANS);
        }

        return selectedCluster.getPoints().remove(selectedPoint);

    }

    /**
     * Returns the nearest {@link Cluster} to the given point
     *
     * @param <T> type of the points to cluster
     * @param clusters the {@link Cluster}s to search
     * @param point the point to find the nearest {@link Cluster} for
     * @return the nearest {@link Cluster} to the given point
     */
    private static <T extends Clusterable<T>> Cluster<T>
        getNearestCluster(final Collection<Cluster<T>> clusters, final T point) {
        double minDistance = Double.MAX_VALUE;
        Cluster<T> minCluster = null;
        for (final Cluster<T> c : clusters) {
            final double distance = point.distanceFrom(c.getCenter());
            if (distance < minDistance) {
                minDistance = distance;
                minCluster = c;
            }
        }
        return minCluster;
    }

	/**
	 * Use K-means++ to choose the initial centers.
	 * @param < T >  type of the points to cluster
	 * @param points  the points to choose the initial centers from
	 * @param k  the number of centers to choose
	 * @param random  random generator to use
	 * @return  the initial centers
	 */
	private static <T extends Clusterable<T>>List<Cluster<T>> chooseInitialCenters(final Collection<T> points,final int k,final Random random){Object o_7au3e=null;String c_7au3e="org.apache.commons.math.stat.clustering.KMeansPlusPlusClusterer";String msig_7au3e="chooseInitialCenters(Collection<T>$int$Random)" + eid_chooseInitialCenters_CollectionLTEMPTRTEMP_int_Random_7au3e;try {o_7au3e=chooseInitialCenters_7au3e(points,k,random);addToORefMap(msig_7au3e,o_7au3e);addToORefMap(msig_7au3e,null);addToORefMap(msig_7au3e,null);addToORefMap(msig_7au3e,null);addToORefMap(msig_7au3e,null);} catch (Throwable t7au3e){addToORefMap(msig_7au3e,t7au3e);throw t7au3e;} finally {eid_chooseInitialCenters_CollectionLTEMPTRTEMP_int_Random_7au3e++;}return (List<Cluster<T>>)o_7au3e;}

}
