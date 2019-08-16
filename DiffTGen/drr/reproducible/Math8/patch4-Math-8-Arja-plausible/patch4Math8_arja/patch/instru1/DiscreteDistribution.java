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
package org.apache.commons.math3.distribution;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.exception.MathArithmeticException;
import org.apache.commons.math3.exception.MathIllegalArgumentException;
import org.apache.commons.math3.exception.NotPositiveException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.util.LocalizedFormats;
import org.apache.commons.math3.random.RandomGenerator;
import org.apache.commons.math3.random.Well19937c;
import org.apache.commons.math3.util.MathArrays;
import org.apache.commons.math3.util.Pair;
import java.util.Map;
import java.util.HashMap;
import myprinter.FieldPrinter;

/**
 * Generic implementation of the discrete distribution.
 *
 * @param <T> type of the random variable.
 * @see <a href="http://en.wikipedia.org/wiki/Probability_distribution#Discrete_probability_distribution">Discrete probability distribution (Wikipedia)</a>
 * @see <a href="http://mathworld.wolfram.com/DiscreteDistribution.html">Discrete Distribution (MathWorld)</a>
 * @version $Id: DiscreteDistribution.java 169 2013-03-08 09:02:38Z wydrych $
 */
public class DiscreteDistribution<T> {

    public static int eid_DiscreteDistribution_ListLTEMPPairLTEMPT_DoubleRTEMPRTEMP_7au3e = 0;
	public static int eid_DiscreteDistribution_RandomGenerator_ListLTEMPPairLTEMPT_DoubleRTEMPRTEMP_7au3e = 0;
	public static int eid_reseedRandomGenerator_long_7au3e = 0;
	public static int eid_probability_T_7au3e = 0;
	public static int eid_getSamples_7au3e = 0;
	public static int eid_sample_7au3e = 0;
	public static int eid_sample_int_7au3e = 0;
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
		eid_DiscreteDistribution_ListLTEMPPairLTEMPT_DoubleRTEMPRTEMP_7au3e = 0;
		eid_DiscreteDistribution_RandomGenerator_ListLTEMPPairLTEMPT_DoubleRTEMPRTEMP_7au3e = 0;
		eid_reseedRandomGenerator_long_7au3e = 0;
		eid_probability_T_7au3e = 0;
		eid_getSamples_7au3e = 0;
		eid_sample_7au3e = 0;
		eid_sample_int_7au3e = 0;
	}

	/**
     * RNG instance used to generate samples from the distribution.
     */
    protected final RandomGenerator random;
    /**
     * List of random variable values.
     */
    private final List<T> singletons;
    /**
     * Normalized array of probabilities of respective random variable values.
     */
    private final double[] probabilities;

    /**
     * Create a discrete distribution using the given probability mass function
     * definition.
     *
     * @param samples definition of probability mass function in the format of
     * list of pairs.
     * @throws NotPositiveException if probability of at least one value is
     * negative.
     * @throws MathArithmeticException if the probabilities sum to zero.
     * @throws MathIllegalArgumentException if probability of at least one value
     * is infinite.
     */
    public DiscreteDistribution(final List<Pair<T, Double>> samples)
        throws NotPositiveException, MathArithmeticException, MathIllegalArgumentException {
        this(new Well19937c(), samples);
    }

    /**
     * Create a discrete distribution using the given random number generator
     * and probability mass function definition.
     *
     * @param rng random number generator.
     * @param samples definition of probability mass function in the format of
     * list of pairs.
     * @throws NotPositiveException if probability of at least one value is
     * negative.
     * @throws MathArithmeticException if the probabilities sum to zero.
     * @throws MathIllegalArgumentException if probability of at least one value
     * is infinite.
     */
    public DiscreteDistribution(final RandomGenerator rng, final List<Pair<T, Double>> samples)
        throws NotPositiveException, MathArithmeticException, MathIllegalArgumentException {
        random = rng;

        singletons = new ArrayList<T>(samples.size());
        final double[] probs = new double[samples.size()];

        for (int i = 0; i < samples.size(); i++) {
            final Pair<T, Double> sample = samples.get(i);
            singletons.add(sample.getKey());
            if (sample.getValue() < 0) {
                throw new NotPositiveException(sample.getValue());
            }
            probs[i] = sample.getValue();
        }

        probabilities = MathArrays.normalizeArray(probs, 1.0);
    }

    /**
     * Reseed the random generator used to generate samples.
     *
     * @param seed the new seed
     */
    public void reseedRandomGenerator(long seed) {
        random.setSeed(seed);
    }

    /**
     * For a random variable {@code X} whose values are distributed according to
     * this distribution, this method returns {@code P(X = x)}. In other words,
     * this method represents the probability mass function (PMF) for the
     * distribution.
     *
     * @param x the point at which the PMF is evaluated
     * @return the value of the probability mass function at {@code x}
     */
    double probability(final T x) {
        double probability = 0;

        for (int i = 0; i < probabilities.length; i++) {
            if ((x == null && singletons.get(i) == null) ||
                (x != null && x.equals(singletons.get(i)))) {
                probability += probabilities[i];
            }
        }

        return probability;
    }

    /**
     * Return the definition of probability mass function in the format of list
     * of pairs.
     *
     * @return definition of probability mass function.
     */
    public List<Pair<T, Double>> getSamples() {
        final List<Pair<T, Double>> samples = new ArrayList<Pair<T, Double>>(probabilities.length);

        for (int i = 0; i < probabilities.length; i++) {
            samples.add(new Pair<T, Double>(singletons.get(i), probabilities[i]));
        }

        return samples;
    }

    /**
     * Generate a random value sampled from this distribution.
     *
     * @return a random value.
     */
    public T sample() {
        final double randomValue = random.nextDouble();
        double sum = 0;

        for (int i = 0; i < probabilities.length; i++) {
            sum += probabilities[i];
            if (randomValue < sum) {
                return singletons.get(i);
            }
        }

        /* This should never happen, but it ensures we will return a correct
         * object in case the loop above has some floating point inequality
         * problem on the final iteration. */
        return singletons.get(singletons.size() - 1);
    }

    /**
     * Generate a random sample from the distribution.
     *
     * @param sampleSize the number of random values to generate.
     * @return an array representing the random sample.
     * @throws NotStrictlyPositiveException if {@code sampleSize} is not
     * positive.
     */
    public T[] sample_7au3e(int sampleSize) throws NotStrictlyPositiveException {
        if (sampleSize <= 0) {
            throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES,
                    sampleSize);
        }

        final T[]out = (T[]) java.lang.reflect.Array.newInstance(singletons.get(0).getClass(), sampleSize);

        if (sampleSize < 0) {
        	  throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_SAMPLES,sampleSize);
        }

        return out;

    }

	/**
	 * Generate a random sample from the distribution.
	 * @param sampleSize  the number of random values to generate.
	 * @return  an array representing the random sample.
	 * @throws NotStrictlyPositiveException  if  {@code  sampleSize}  is not positive.
	 */
	public T[] sample(int sampleSize) throws NotStrictlyPositiveException {
		Object o_7au3e = null;
		String c_7au3e = "org.apache.commons.math3.distribution.DiscreteDistribution";
		String msig_7au3e = "sample(int)" + eid_sample_int_7au3e;
		try {
			o_7au3e = sample_7au3e(sampleSize);
			addToORefMap(msig_7au3e, o_7au3e);
			addToORefMap(msig_7au3e, this);
			addToORefMap(msig_7au3e, null);
		} catch (Throwable t7au3e) {
			addToORefMap(msig_7au3e, t7au3e);
			throw t7au3e;
		} finally {
			eid_sample_int_7au3e++;
		}
		return (T[]) o_7au3e;
	}

}
