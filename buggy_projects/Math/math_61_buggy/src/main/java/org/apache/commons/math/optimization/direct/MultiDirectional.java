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

package org.apache.commons.math.optimization.direct;

import java.util.Comparator;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.MultivariateRealOptimizer;

/**
 * This class implements the multi-directional direct search method.
 *
 * @version $Revision$ $Date$
 * @see NelderMead
 * @since 1.2
 */
public class MultiDirectional extends DirectSearchOptimizer
    implements MultivariateRealOptimizer {
    /** Expansion coefficient. */
    private final double khi;
    /** Contraction coefficient. */
    private final double gamma;

    /**
     * Build a multi-directional optimizer with default coefficients.
     * The default values are 2.0 for khi and 0.5 for gamma.
     */
    public MultiDirectional() {
        this.khi   = 2.0;
        this.gamma = 0.5;
    }

    /**
     * Build a multi-directional optimizer with specified coefficients.
     *
     * @param khi Expansion coefficient.
     * @param gamma Contraction coefficient.
     */
    public MultiDirectional(final double khi, final double gamma) {
        this.khi   = khi;
        this.gamma = gamma;
    }

    /** {@inheritDoc} */
    @Override
    protected void iterateSimplex(final Comparator<RealPointValuePair> comparator)
        throws FunctionEvaluationException {

        final ConvergenceChecker<RealPointValuePair> checker = getConvergenceChecker();
        int iteration = 0;
        while (true) {
            ++iteration;

            // Save the original vertex.
            final RealPointValuePair[] original = simplex;
            final RealPointValuePair best = original[0];

            // Perform a reflection step.
            final RealPointValuePair reflected = evaluateNewSimplex(original, 1.0, comparator);
            if (comparator.compare(reflected, best) < 0) {

                // Compute the expanded simplex.
                final RealPointValuePair[] reflectedSimplex = simplex;
                final RealPointValuePair expanded = evaluateNewSimplex(original, khi, comparator);
                if (comparator.compare(reflected, expanded) <= 0) {
                    // Accept the reflected simplex.
                    simplex = reflectedSimplex;
                }

                return;
            }

            // Compute the contracted simplex.
            final RealPointValuePair contracted = evaluateNewSimplex(original, gamma, comparator);
            if (comparator.compare(contracted, best) < 0) {
                // Accept the contracted simplex.
                return;
            }

            // Check convergence.
            boolean converged = true;
            for (int i = 0; i < simplex.length; ++i) {
                converged &= checker.converged(iteration, original[i], simplex[i]);
            }
            if (converged) {
                return;
            }
        }
    }

    /**
     * Compute and evaluate a new simplex.
     *
     * @param original Original simplex (to be preserved).
     * @param coeff Linear coefficient.
     * @param comparator Comparator to use to sort simplex vertices from best
     * to poorest.
     * @return the best point in the transformed simplex.
     * @throws FunctionEvaluationException if the function cannot be
     * evaluated at some point.
     * @throws org.apache.commons.math.exception.TooManyEvaluationsException
     * if the maximal number of evaluations is exceeded.
     */
    private RealPointValuePair evaluateNewSimplex(final RealPointValuePair[] original,
                                                  final double coeff,
                                                  final Comparator<RealPointValuePair> comparator)
        throws FunctionEvaluationException {

        final double[] xSmallest = original[0].getPointRef();
        final int n = xSmallest.length;

        // Create the linearly transformed simplex.
        simplex = new RealPointValuePair[n + 1];
        simplex[0] = original[0];
        for (int i = 1; i <= n; ++i) {
            final double[] xOriginal    = original[i].getPointRef();
            final double[] xTransformed = new double[n];
            for (int j = 0; j < n; ++j) {
                xTransformed[j] = xSmallest[j] + coeff * (xSmallest[j] - xOriginal[j]);
            }
            simplex[i] = new RealPointValuePair(xTransformed, Double.NaN, false);
        }

        // Evaluate the simplex.
        evaluateSimplex(comparator);
        return simplex[0];
    }
}
