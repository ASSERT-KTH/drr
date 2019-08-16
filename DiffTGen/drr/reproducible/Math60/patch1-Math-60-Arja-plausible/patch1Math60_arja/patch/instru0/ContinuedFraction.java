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
package org.apache.commons.math.util;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.MathException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.exception.util.LocalizedFormats;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import myprinter.FieldPrinter;

/**
 * Provides a generic means to evaluate continued fractions.  Subclasses simply
 * provided the a and b coefficients to evaluate the continued fraction.
 *
 * <p>
 * References:
 * <ul>
 * <li><a href="http://mathworld.wolfram.com/ContinuedFraction.html">
 * Continued Fraction</a></li>
 * </ul>
 * </p>
 *
 * @version $Revision$ $Date$
 */
public abstract class ContinuedFraction {

    public static int eid_ContinuedFraction_7au3e = 0;
	public static int eid_getA_int_double_7au3e = 0;
	public static int eid_getB_int_double_7au3e = 0;
	public static int eid_evaluate_double_7au3e = 0;
	public static int eid_evaluate_double_double_7au3e = 0;
	public static int eid_evaluate_double_int_7au3e = 0;
	public static int eid_evaluate_double_double_int_7au3e = 0;

	public static void clearORefMap() {
		eid_ContinuedFraction_7au3e = 0;
		eid_getA_int_double_7au3e = 0;
		eid_getB_int_double_7au3e = 0;
		eid_evaluate_double_7au3e = 0;
		eid_evaluate_double_double_7au3e = 0;
		eid_evaluate_double_int_7au3e = 0;
		eid_evaluate_double_double_int_7au3e = 0;
	}

	/** Maximum allowed numerical error. */
    private static final double DEFAULT_EPSILON = 10e-9;

    /**
     * Default constructor.
     */
    protected ContinuedFraction() {
        super();
    }

    /**
     * Access the n-th a coefficient of the continued fraction.  Since a can be
     * a function of the evaluation point, x, that is passed in as well.
     * @param n the coefficient index to retrieve.
     * @param x the evaluation point.
     * @return the n-th a coefficient.
     */
    protected abstract double getA(int n, double x);

    /**
     * Access the n-th b coefficient of the continued fraction.  Since b can be
     * a function of the evaluation point, x, that is passed in as well.
     * @param n the coefficient index to retrieve.
     * @param x the evaluation point.
     * @return the n-th b coefficient.
     */
    protected abstract double getB(int n, double x);

    /**
     * Evaluates the continued fraction at the value x.
     * @param x the evaluation point.
     * @return the value of the continued fraction evaluated at x.
     * @throws MathException if the algorithm fails to converge.
     */
    public double evaluate(double x) throws MathException {
        return evaluate(x, DEFAULT_EPSILON, Integer.MAX_VALUE);
    }

    /**
     * Evaluates the continued fraction at the value x.
     * @param x the evaluation point.
     * @param epsilon maximum error allowed.
     * @return the value of the continued fraction evaluated at x.
     * @throws MathException if the algorithm fails to converge.
     */
    public double evaluate(double x, double epsilon) throws MathException {
        return evaluate(x, epsilon, Integer.MAX_VALUE);
    }

    /**
     * Evaluates the continued fraction at the value x.
     * @param x the evaluation point.
     * @param maxIterations maximum number of convergents
     * @return the value of the continued fraction evaluated at x.
     * @throws MathException if the algorithm fails to converge.
     */
    public double evaluate(double x, int maxIterations) throws MathException {
        return evaluate(x, DEFAULT_EPSILON, maxIterations);
    }

    /**
     * <p>
     * Evaluates the continued fraction at the value x.
     * </p>
     *
     * <p>
     * The implementation of this method is based on equations 14-17 of:
     * <ul>
     * <li>
     *   Eric W. Weisstein. "Continued Fraction." From MathWorld--A Wolfram Web
     *   Resource. <a target="_blank"
     *   href="http://mathworld.wolfram.com/ContinuedFraction.html">
     *   http://mathworld.wolfram.com/ContinuedFraction.html</a>
     * </li>
     * </ul>
     * The recurrence relationship defined in those equations can result in
     * very large intermediate results which can result in numerical overflow.
     * As a means to combat these overflow conditions, the intermediate results
     * are scaled whenever they threaten to become numerically unstable.</p>
     *
     * @param x the evaluation point.
     * @param epsilon maximum error allowed.
     * @param maxIterations maximum number of convergents
     * @return the value of the continued fraction evaluated at x.
     * @throws MathException if the algorithm fails to converge.
     */
    public double evaluate_7au3e(double x, double epsilon, int maxIterations)
        throws MathException
    {
        double p0 = 1.0;
        double p1 = getA(0, x);
        double q0 = 0.0;
        double q1 = 1.0;
        double c = p1 / q1;
        int n = 0;
        double relativeError = Double.MAX_VALUE;
        while (n < maxIterations && relativeError > epsilon) {
            ++n;
            double a = getA(n, x);
            double b = getB(n, x);
            double p2 = a * p1 + b * p0;
            double q2 = a * q1 + b * q0;
            boolean infinite = false;
            if (Double.isInfinite(p2) || Double.isInfinite(q2)) {
                /*
                 * Need to scale. Try successive powers of the larger of a or b
                 * up to 5th power. Throw ConvergenceException if one or both
                 * of p2, q2 still overflow.
                 */
                double scaleFactor = 1d;
                double lastScaleFactor = 1d;
                final int maxPower = 5;
                final double scale = FastMath.max(a,b);
                if (scale <= 0) {  // Can't scale
                    throw new ConvergenceException(
                            LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE,
                             x);
                }
                infinite = true;
                continue;
            }

            if (infinite) {
               // Scaling failed
               throw new ConvergenceException(
                 LocalizedFormats.CONTINUED_FRACTION_INFINITY_DIVERGENCE,
                  x);
            }

            double r = p2 / q2;

            if (Double.isNaN(r)) {
                return 0.0;
            }
            relativeError = FastMath.abs(r / c - 1.0);

            // prepare for next iteration
            c = p2 / q2;
            p0 = p1;
            p1 = p2;
            q0 = q1;
            q1 = q2;
        }

        if (n >= maxIterations) {
            throw new MaxIterationsExceededException(maxIterations,
                LocalizedFormats.NON_CONVERGENT_CONTINUED_FRACTION,
                x);
        }

        return c;
    }

	/**
	 * <p> Evaluates the continued fraction at the value x. </p> <p> The implementation of this method is based on equations 14-17 of: <ul> <li> Eric W. Weisstein. "Continued Fraction." From MathWorld--A Wolfram Web Resource. <a target="_blank" href="http://mathworld.wolfram.com/ContinuedFraction.html"> http://mathworld.wolfram.com/ContinuedFraction.html</a> </li> </ul> The recurrence relationship defined in those equations can result in very large intermediate results which can result in numerical overflow. As a means to combat these overflow conditions, the intermediate results are scaled whenever they threaten to become numerically unstable.</p>
	 * @param x  the evaluation point.
	 * @param epsilon  maximum error allowed.
	 * @param maxIterations  maximum number of convergents
	 * @return  the value of the continued fraction evaluated at x.
	 * @throws MathException  if the algorithm fails to converge.
	 */
	public double evaluate(double x, double epsilon, int maxIterations)
			throws MathException {
		Object o_7au3e = null;
		String c_7au3e = "org.apache.commons.math.util.ContinuedFraction";
		String msig_7au3e = "evaluate(double$double$int)"
				+ eid_evaluate_double_double_int_7au3e;
		try {
			o_7au3e = evaluate_7au3e(x, epsilon, maxIterations);
			FieldPrinter.print(o_7au3e, eid_evaluate_double_double_int_7au3e,
					c_7au3e, msig_7au3e, 0, 5);
			FieldPrinter.print(this, eid_evaluate_double_double_int_7au3e,
					c_7au3e, msig_7au3e, 1, 5);
		} catch (Throwable t7au3e) {
			FieldPrinter.print(t7au3e, eid_evaluate_double_double_int_7au3e,
					c_7au3e, msig_7au3e, 0, 5);
			throw t7au3e;
		} finally {
			eid_evaluate_double_double_int_7au3e++;
		}
		return (double) o_7au3e;
	}
}
