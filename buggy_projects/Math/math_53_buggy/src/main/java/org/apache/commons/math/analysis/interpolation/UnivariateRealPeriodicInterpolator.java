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
package org.apache.commons.math.analysis.interpolation;

import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.util.MathUtils;
import org.apache.commons.math.exception.NumberIsTooSmallException;

/**
 * Adapter for class implementing the {@link UnivariateRealInterpolator}
 * interface.
 * The data to be interpolated is assumed to be periodic. Thus values that are
 * outside of the range can be passed to the interpolation function: They will
 * be wrapped into the initial range before being passed to the class that
 * actually computes the interpolation.
 *
 * @version $Id$
 */
public class UnivariateRealPeriodicInterpolator
    implements UnivariateRealInterpolator {
    /** Default number of extension points of the samples array. */
    public static final int DEFAULT_EXTEND = 5;
    /** Interpolator. */
    private final UnivariateRealInterpolator interpolator;
    /** Period. */
    private final double period;
    /** Number of extension points. */
    private final int extend;

    /**
     * Builds an interpolator.
     *
     * @param interpolator Interpolator.
     * @param period Period.
     * @param extend Number of points to be appended at the beginning and
     * end of the sample arrays in order to avoid interpolation failure at
     * the (periodic) boundaries of the orginal interval. The value is the
     * number of sample points which the original {@code interpolator} needs
     * on each side of the interpolated point.
     */
    public UnivariateRealPeriodicInterpolator(UnivariateRealInterpolator interpolator,
                                              double period,
                                              int extend) {
        this.interpolator = interpolator;
        this.period = period;
        this.extend = extend;
    }

    /**
     * Builds an interpolator.
     * Uses {@link #DEFAULT_EXTEND} as the number of extension points on each side
     * of the original abscissae range.
     *
     * @param interpolator Interpolator.
     * @param period Period.
     */
    public UnivariateRealPeriodicInterpolator(UnivariateRealInterpolator interpolator,
                                              double period) {
        this(interpolator, period, DEFAULT_EXTEND);
    }

    /**
     * {@inheritDoc}
     *
     * @throws NumberIsTooSmallException if the number of extension points
     * iss larger then the size of {@code xval}.
     */
    public UnivariateRealFunction interpolate(double[] xval,
                                              double[] yval) {
        if (xval.length < extend) {
            throw new NumberIsTooSmallException(xval.length, extend, true);
        }

        MathUtils.checkOrder(xval);
        final double offset = xval[0];

        final int len = xval.length + extend * 2;
        final double[] x = new double[len];
        final double[] y = new double[len];
        for (int i = 0; i < xval.length; i++) {
            final int index = i + extend;
            x[index] = MathUtils.reduce(xval[i], period, offset);
            y[index] = yval[i];
        }

        // Wrap to enable interpolation at the boundaries.
        for (int i = 0; i < extend; i++) {
            int index = xval.length - extend + i;
            x[i] = MathUtils.reduce(xval[index], period, offset) - period;
            y[i] = yval[index];

            index = len - extend + i;
            x[index] = MathUtils.reduce(xval[i], period, offset) + period;
            y[index] = yval[i];
        }

        MathUtils.sortInPlace(x, y);

        final UnivariateRealFunction f = interpolator.interpolate(x, y);
        return new UnivariateRealFunction() {
            public double value(final double x) {
                return f.value(MathUtils.reduce(x, period, offset));
            }
        };
    }
}
