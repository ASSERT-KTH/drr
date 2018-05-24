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

import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.optimization.BaseMultivariateRealOptimizer;
import org.apache.commons.math.optimization.BaseSimpleBoundsMultivariateRealOptimizer;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.RealPointValuePair;
import org.apache.commons.math.optimization.ConvergenceChecker;
import org.apache.commons.math.exception.DimensionMismatchException;
import org.apache.commons.math.exception.NumberIsTooSmallException;
import org.apache.commons.math.exception.NumberIsTooLargeException;

/**
 * Base class for implementing optimizers for multivariate scalar functions,
 * subject to simple bounds: The valid range of the parameters is an interval.
 * The interval can possibly be infinite (in one or both directions).
 * This base class handles the boiler-plate methods associated to thresholds
 * settings, iterations and evaluations counting.
 *
 * @param <FUNC> Type of the objective function to be optimized.
 *
 * @version $Id$
 * @since 3.0
 */
public abstract class BaseAbstractSimpleBoundsScalarOptimizer<FUNC extends MultivariateFunction>
    extends BaseAbstractScalarOptimizer<FUNC>
    implements BaseMultivariateRealOptimizer<FUNC>,
               BaseSimpleBoundsMultivariateRealOptimizer<FUNC> {
    /** Lower bounds. */
    private double[] lowerBound;
    /** Upper bounds. */
    private double[] upperBound;

    /**
     * Simple constructor with default settings.
     * The convergence checker is set to a
     * {@link org.apache.commons.math.optimization.SimpleScalarValueChecker} and
     * the allowed number of evaluations is set to {@link Integer#MAX_VALUE}.
     *
     * @see BaseAbstractScalarOptimizer#BaseAbstractScalarOptimizer()
     */
    protected BaseAbstractSimpleBoundsScalarOptimizer() {}

    /**
     * @param checker Convergence checker.
     */
    protected BaseAbstractSimpleBoundsScalarOptimizer(ConvergenceChecker<RealPointValuePair> checker) {
        super(checker);
    }

    /**
     * @return the lower bounds.
     */
    public double[] getLowerBound() {
        return lowerBound.clone();
    }

    /**
     * @return the upper bounds.
     */
    public double[] getUpperBound() {
        return upperBound.clone();
    }

    /** {@inheritDoc} */
    public RealPointValuePair optimize(int maxEval, FUNC f, GoalType goalType,
                                       double[] startPoint) {
        return optimize(maxEval, f, goalType, startPoint, null, null);
    }

    /** {@inheritDoc} */
    public RealPointValuePair optimize(int maxEval, FUNC f, GoalType goalType,
                                       double[] startPoint,
                                       double[] lower, double[] upper) {
        // Checks.
        final int dim = startPoint.length;
        if (lower != null) {
            if (lower.length != dim) {
                throw new DimensionMismatchException(lower.length, dim);
            }
            for (int i = 0; i < dim; i++) {
                final double v = startPoint[i];
                final double lo = lower[i];
                if (v < lo) {
                    throw new NumberIsTooSmallException(v, lo, true);
                }
            }
        }
        if (upper != null) {
            if (upper.length != dim) {
                throw new DimensionMismatchException(upper.length, dim);
            }
            for (int i = 0; i < dim; i++) {
                final double v = startPoint[i];
                final double hi = upper[i];
                if (v > hi) {
                    throw new NumberIsTooLargeException(v, hi, true);
                }
            }
        }

        // Initialization.
        if (lower == null) {
            lowerBound = new double[dim];
            for (int i = 0; i < dim; i++) {
                lowerBound[i] = Double.NEGATIVE_INFINITY;
            }
        } else {
            lowerBound = lower.clone();
        }
        if (upper == null) {
            upperBound = new double[dim];
            for (int i = 0; i < dim; i++) {
                upperBound[i] = Double.POSITIVE_INFINITY;
            }
        } else {
            upperBound = upper.clone();
        }

        // Base class method performs the non bound-specific initializations.
        return super.optimize(maxEval, f, goalType, startPoint);
    }
}
