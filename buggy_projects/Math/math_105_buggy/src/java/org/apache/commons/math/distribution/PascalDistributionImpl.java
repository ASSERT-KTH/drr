/*
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
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

import org.apache.commons.math.MathException;
import org.apache.commons.math.special.Beta;
import org.apache.commons.math.util.MathUtils;

/**
 * The default implementation of {@link PascalDistribution}.
 *
 * @version $Revision:$
 */
public class PascalDistributionImpl
    extends AbstractIntegerDistribution
    implements PascalDistribution, Serializable {

    /** Serializable version identifier */
    private static final long serialVersionUID = 6751309484392813623L;

    /** The number of trials */
    private int numberOfSuccesses;

    /** The probability of success */
    private double probabilityOfSuccess;

    /**
     * Create a binomial distribution with the given number of trials and
     * probability of success.
     * 
     * @param r the number of successes
     * @param p the probability of success
     */
    public PascalDistributionImpl(int r, double p) {
        super();
        setNumberOfSuccesses(r);
        setProbabilityOfSuccess(p);
    }

    /**
     * Access the number of trials for this distribution.
     * 
     * @return the number of trials
     */
    public int getNumberOfSuccesses() {
        return numberOfSuccesses;
    }

    /**
     * Access the probability of success for this distribution.
     * 
     * @return the probability of success
     */
    public double getProbabilityOfSuccess() {
        return probabilityOfSuccess;
    }

    /**
     * Change the number of trials for this distribution.
     * 
     * @param successes the new number of trials
     * @throws IllegalArgumentException if <code>trials</code> is not positive.
     */
    public void setNumberOfSuccesses(int successes) {
        if (successes < 0) {
            throw new IllegalArgumentException("number of trials must be non-negative.");
        }
        numberOfSuccesses = successes;
    }

    /**
     * Change the probability of success for this distribution.
     * 
     * @param p the new probability of success
     * @throws IllegalArgumentException if <code>p</code> is not a valid
     *         probability.
     */
    public void setProbabilityOfSuccess(double p) {
        if (p < 0.0 || p > 1.0) {
            throw new IllegalArgumentException("probability of success must be between 0.0 and 1.0, inclusive.");
        }
        probabilityOfSuccess = p;
    }

    /**
     * Access the domain value lower bound, based on <code>p</code>, used to
     * bracket a PDF root.
     * 
     * @param p the desired probability for the critical value
     * @return domain value lower bound, i.e.
     *         P(X &lt; <i>lower bound</i>) &lt; <code>p</code> 
     */
    protected int getDomainLowerBound(double p) {
        return -1;
    }

    /**
     * Access the domain value upper bound, based on <code>p</code>, used to
     * bracket a PDF root.
     * 
     * @param p the desired probability for the critical value
     * @return domain value upper bound, i.e.
     *         P(X &lt; <i>upper bound</i>) &gt; <code>p</code> 
     */
    protected int getDomainUpperBound(double p) {
      // use MAX - 1 because MAX causes loop
      return Integer.MAX_VALUE - 1;
    }

    /**
     * For this distribution, X, this method returns P(X &le; x).
     * 
     * @param x the value at which the PDF is evaluated
     * @return PDF for this distribution
     * @throws MathException if the cumulative probability can not be
     *            computed due to convergence or other numerical errors
     */
    public double cumulativeProbability(int x) throws MathException {
        double ret;
        if (x < 0) {
            ret = 0.0;
        } else {
            ret = Beta.regularizedBeta(
                        getProbabilityOfSuccess(),
                        getNumberOfSuccesses(),
                        x + 1);
        }
        return ret;
    }

    /**
     * For this distribution, X, this method returns P(X = x).
     * 
     * @param x the value at which the PMF is evaluated
     * @return PMF for this distribution 
     */
    public double probability(int x) {
        double ret;
        if (x < 0) {
            ret = 0.0;
        } else {
            ret = MathUtils.binomialCoefficientDouble(x + getNumberOfSuccesses() - 1,
                    getNumberOfSuccesses() - 1) *
                  Math.pow(getProbabilityOfSuccess(), getNumberOfSuccesses()) *
                  Math.pow(1.0 - getProbabilityOfSuccess(),
                        x);
        }
        return ret;
    }
    
    /**
     * For this distribution, X, this method returns the largest x, such
     * that P(X &le; x) &le; <code>p</code>.
     * <p>
     * Returns <code>-1</code> for p=0 and <code>Integer.MAX_VALUE</code> for
     * p=1.
     *
     * @param p the desired probability
     * @return the largest x such that P(X &le; x) <= p
     * @throws MathException if the inverse cumulative probability can not be
     *            computed due to convergence or other numerical errors.
     * @throws IllegalArgumentException if p < 0 or p > 1
     */
    public int inverseCumulativeProbability(final double p) throws MathException {
        // handle extreme values explicitly
        if (p == 0) {
            return -1;
        } 
        if (p == 1) {
            return Integer.MAX_VALUE; 
        }
        
        // use default bisection impl
        return super.inverseCumulativeProbability(p);
    }
}
