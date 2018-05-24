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

package org.apache.commons.math.distribution;

import java.io.Serializable;

import org.apache.commons.math.exception.NotPositiveException;
import org.apache.commons.math.exception.NotStrictlyPositiveException;
import org.apache.commons.math.exception.NumberIsTooLargeException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.util.FastMath;

/**
 * The default implementation of {@link HypergeometricDistribution}.
 *
 * @version $Id$
 */
public class HypergeometricDistributionImpl extends AbstractIntegerDistribution
    implements HypergeometricDistribution, Serializable {
    /** Serializable version identifier. */
    private static final long serialVersionUID = -436928820673516179L;
    /** The number of successes in the population. */
    private final int numberOfSuccesses;
    /** The population size. */
    private final int populationSize;
    /** The sample size. */
    private final int sampleSize;

    /**
     * Construct a new hypergeometric distribution with the given the
     * population size, the number of successes in the population, and
     * the sample size.
     *
     * @param populationSize Population size.
     * @param numberOfSuccesses Number of successes in the population.
     * @param sampleSize Sample size.
     * @throws NotPositiveException if {@code numberOfSuccesses < 0}.
     * @throws NotStrictlyPositiveException if {@code populationSize <= 0}.
     * @throws NotPositiveException if {@code populationSize < 0}.
     * @throws NumberIsTooLargeException if {@code numberOfSuccesses > populationSize}.
     * @throws NumberIsTooLargeException if {@code sampleSize > populationSize}.
     */
    public HypergeometricDistributionImpl(int populationSize,
                                          int numberOfSuccesses,
                                          int sampleSize) {
        if (populationSize <= 0) {
            throw new NotStrictlyPositiveException(LocalizedFormats.POPULATION_SIZE,
                                                   populationSize);
        }
        if (numberOfSuccesses < 0) {
            throw new NotPositiveException(LocalizedFormats.NUMBER_OF_SUCCESSES,
                                           numberOfSuccesses);
        }
        if (sampleSize < 0) {
            throw new NotPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES,
                                           sampleSize);
        }

        if (numberOfSuccesses > populationSize) {
            throw new NumberIsTooLargeException(LocalizedFormats.NUMBER_OF_SUCCESS_LARGER_THAN_POPULATION_SIZE,
                                                numberOfSuccesses, populationSize, true);
        }
        if (sampleSize > populationSize) {
            throw new NumberIsTooLargeException(LocalizedFormats.SAMPLE_SIZE_LARGER_THAN_POPULATION_SIZE,
                                                sampleSize, populationSize, true);
        }

        this.numberOfSuccesses = numberOfSuccesses;
        this.populationSize = populationSize;
        this.sampleSize = sampleSize;
    }

    /**
     * For this distribution, {@code X}, this method returns {@code P(X <= x)}.
     *
     * @param x Value at which the PDF is evaluated.
     * @return PDF for this distribution.
     */
    @Override
    public double cumulativeProbability(int x) {
        double ret;

        int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
        if (x < domain[0]) {
            ret = 0.0;
        } else if (x >= domain[1]) {
            ret = 1.0;
        } else {
            ret = innerCumulativeProbability(domain[0], x, 1, populationSize,
                                             numberOfSuccesses, sampleSize);
        }

        return ret;
    }

    /**
     * Return the domain for the given hypergeometric distribution parameters.
     *
     * @param n Population size.
     * @param m Number of successes in the population.
     * @param k Sample size.
     * @return a two element array containing the lower and upper bounds of the
     * hypergeometric distribution.
     */
    private int[] getDomain(int n, int m, int k) {
        return new int[] { getLowerDomain(n, m, k), getUpperDomain(m, k) };
    }

    /**
     * Access the domain value lower bound, based on {@code p}, used to
     * bracket a PDF root.
     *
     * @param p Desired probability for the critical value.
     * @return the domain value lower bound, i.e. {@code P(X < 'lower bound') < p}.
     */
    @Override
    protected int getDomainLowerBound(double p) {
        return getLowerDomain(populationSize, numberOfSuccesses, sampleSize);
    }

    /**
     * Access the domain value upper bound, based on {@code p}, used to
     * bracket a PDF root.
     *
     * @param p Desired probability for the critical value
     * @return the domain value upper bound, i.e. {@code P(X < 'upper bound') > p}.
     */
    @Override
    protected int getDomainUpperBound(double p) {
        return getUpperDomain(sampleSize, numberOfSuccesses);
    }

    /**
     * Return the lowest domain value for the given hypergeometric distribution
     * parameters.
     *
     * @param n Population size.
     * @param m Number of successes in the population.
     * @param k Sample size.
     * @return the lowest domain value of the hypergeometric distribution.
     */
    private int getLowerDomain(int n, int m, int k) {
        return FastMath.max(0, m - (n - k));
    }

    /**
     * {@inheritDoc}
     */
    public int getNumberOfSuccesses() {
        return numberOfSuccesses;
    }

    /**
     * {@inheritDoc}
     */
    public int getPopulationSize() {
        return populationSize;
    }

    /**
     * {@inheritDoc}
     */
    public int getSampleSize() {
        return sampleSize;
    }

    /**
     * Return the highest domain value for the given hypergeometric distribution
     * parameters.
     *
     * @param m Number of successes in the population.
     * @param k Sample size.
     * @return the highest domain value of the hypergeometric distribution.
     */
    private int getUpperDomain(int m, int k) {
        return FastMath.min(k, m);
    }

    /**
     * For this distribution, {@code X}, this method returns {@code P(X = x)}.
     *
     * @param x Value at which the PMF is evaluated.
     * @return PMF for this distribution.
     */
    public double probability(int x) {
        double ret;

        int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
        if (x < domain[0] || x > domain[1]) {
            ret = 0.0;
        } else {
            double p = (double) sampleSize / (double) populationSize;
            double q = (double) (populationSize - sampleSize) / (double) populationSize;
            double p1 = SaddlePointExpansion.logBinomialProbability(x,
                    numberOfSuccesses, p, q);
            double p2 =
                SaddlePointExpansion.logBinomialProbability(sampleSize - x,
                    populationSize - numberOfSuccesses, p, q);
            double p3 =
                SaddlePointExpansion.logBinomialProbability(sampleSize, populationSize, p, q);
            ret = FastMath.exp(p1 + p2 - p3);
        }

        return ret;
    }

    /**
     * For this distribution, {@code X}, defined by the given hypergeometric
     *  distribution parameters, this method returns {@code P(X = x)}.
     *
     * @param x Value at which the PMF is evaluated.
     * @param n the population size.
     * @param m number of successes in the population.
     * @param k the sample size.
     * @return PMF for the distribution.
     */
    private double probability(int n, int m, int k, int x) {
        return FastMath.exp(MathUtils.binomialCoefficientLog(m, x) +
               MathUtils.binomialCoefficientLog(n - m, k - x) -
               MathUtils.binomialCoefficientLog(n, k));
    }

    /**
     * For this distribution, {@code X}, this method returns {@code P(X >= x)}.
     *
     * @param x Value at which the CDF is evaluated.
     * @return the upper tail CDF for this distribution.
     * @since 1.1
     */
    public double upperCumulativeProbability(int x) {
        double ret;

        final int[] domain = getDomain(populationSize, numberOfSuccesses, sampleSize);
        if (x < domain[0]) {
            ret = 1.0;
        } else if (x > domain[1]) {
            ret = 0.0;
        } else {
            ret = innerCumulativeProbability(domain[1], x, -1, populationSize,
                                             numberOfSuccesses, sampleSize);
        }

        return ret;
    }

    /**
     * For this distribution, {@code X}, this method returns
     * {@code P(x0 <= X <= x1)}.
     * This probability is computed by summing the point probabilities for the
     * values {@code x0, x0 + 1, x0 + 2, ..., x1}, in the order directed by
     * {@code dx}.
     *
     * @param x0 Inclusive lower bound.
     * @param x1 Inclusive upper bound.
     * @param dx Direction of summation (1 indicates summing from x0 to x1, and
     * 0 indicates summing from x1 to x0).
     * @param n the population size.
     * @param m number of successes in the population.
     * @param k the sample size.
     * @return {@code P(x0 <= X <= x1)}.
     */
    private double innerCumulativeProbability(int x0, int x1, int dx,
                                              int n, int m, int k) {
        double ret = probability(n, m, k, x0);
        while (x0 != x1) {
            x0 += dx;
            ret += probability(n, m, k, x0);
        }
        return ret;
    }

    /**
     * {@inheritDoc}
     *
     * For population size <code>N</code>,
     * number of successes <code>m</code>, and
     * sample size <code>n</code>,
     * the lower bound of the support is
     * <code>max(0, n + m - N)</code>
     *
     * @return lower bound of the support
     */
    @Override
    public int getSupportLowerBound() {
        return FastMath.max(0,
                getSampleSize() + getNumberOfSuccesses() - getPopulationSize());
    }

    /**
     * {@inheritDoc}
     *
     * For number of successes <code>m</code> and
     * sample size <code>n</code>,
     * the upper bound of the support is
     * <code>min(m, n)</code>
     *
     * @return upper bound of the support
     */
    @Override
    public int getSupportUpperBound() {
        return FastMath.min(getNumberOfSuccesses(), getSampleSize());
    }

    /**
     * {@inheritDoc}
     *
     * For population size <code>N</code>,
     * number of successes <code>m</code>, and
     * sample size <code>n</code>, the mean is
     * <code>n * m / N</code>
     *
     * @return {@inheritDoc}
     */
    @Override
    protected double calculateNumericalMean() {
        return (double)(getSampleSize() * getNumberOfSuccesses()) / (double)getPopulationSize();
    }

    /**
     * {@inheritDoc}
     *
     * For population size <code>N</code>,
     * number of successes <code>m</code>, and
     * sample size <code>n</code>, the variance is
     * <code>[ n * m * (N - n) * (N - m) ] / [ N^2 * (N - 1) ]</code>
     *
     * @return {@inheritDoc}
     */
    @Override
    protected double calculateNumericalVariance() {
        final double N = getPopulationSize();
        final double m = getNumberOfSuccesses();
        final double n = getSampleSize();
        return ( n * m * (N - n) * (N - m) ) / ( (N*N * (N - 1)) );
    }
}
