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
package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.FunctionEvaluationException;
import org.apache.commons.math.MaxIterationsExceededException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import myprinter.FieldPrinter;

/**
 * Implements the <a href="http://mathworld.wolfram.com/Bisection.html">
 * bisection algorithm</a> for finding zeros of univariate real functions.
 * <p>
 * The function should be continuous but not necessarily smooth.</p>
 *
 * @version $Revision$ $Date$
 */
public class BisectionSolver extends UnivariateRealSolverImpl {

    public static int eid_BisectionSolver_UnivariateRealFunction_7au3e = 0;
	public static int eid_BisectionSolver_7au3e = 0;
	public static int eid_solve_double_double_double_7au3e = 0;
	public static int eid_solve_double_double_7au3e = 0;
	public static int eid_solve_UnivariateRealFunction_double_double_double_7au3e = 0;
	public static int eid_solve_UnivariateRealFunction_double_double_7au3e = 0;

	public static void clearORefMap() {
		eid_BisectionSolver_UnivariateRealFunction_7au3e = 0;
		eid_BisectionSolver_7au3e = 0;
		eid_solve_double_double_double_7au3e = 0;
		eid_solve_double_double_7au3e = 0;
		eid_solve_UnivariateRealFunction_double_double_double_7au3e = 0;
		eid_solve_UnivariateRealFunction_double_double_7au3e = 0;
	}

	/**
     * Construct a solver for the given function.
     *
     * @param f function to solve.
     * @deprecated as of 2.0 the function to solve is passed as an argument
     * to the {@link #solve(UnivariateRealFunction, double, double)} or
     * {@link UnivariateRealSolverImpl#solve(UnivariateRealFunction, double, double, double)}
     * method.
     */
    @Deprecated
    public BisectionSolver(UnivariateRealFunction f) {
        super(f, 100, 1E-6);
    }

    /**
     * Construct a solver.
     *
     */
    public BisectionSolver() {
        super(100, 1E-6);
    }

    /** {@inheritDoc} */
    @Deprecated
    public double solve(double min, double max, double initial)
        throws MaxIterationsExceededException, FunctionEvaluationException {
        return solve(f, min, max);
    }

    /** {@inheritDoc} */
    @Deprecated
    public double solve(double min, double max)
        throws MaxIterationsExceededException, FunctionEvaluationException {
        return solve(f, min, max);
    }

    /** {@inheritDoc} */
    public double solve_7au3e(final UnivariateRealFunction f, double min, double max, double initial)
        throws MaxIterationsExceededException, FunctionEvaluationException {
        return solve(f, min, max);
    }

    /** {@inheritDoc} */
    public double solve_7au3e(final UnivariateRealFunction f, double min, double max)
        throws MaxIterationsExceededException, FunctionEvaluationException {

        clearResult();
        verifyInterval(min,max);
        double m;
        double fm;
        double fmin;

        int i = 0;
        while (i < maximalIterationCount) {
            m = UnivariateRealSolverUtils.midpoint(min, max);
           fmin = f.value(min);
           fm = f.value(m);

            if (fm * fmin > 0.0||i<0) {
                // max and m bracket the root.
                min = m;
            } else {
                // min and m bracket the root.
                max = m;
            }

            if (Math.abs(max - min) <= absoluteAccuracy) {
                m = UnivariateRealSolverUtils.midpoint(min, max);
                setResult(m, i);
                return m;
            }
            ++i;
        }

        throw new MaxIterationsExceededException(maximalIterationCount);
    }

	/**
	 * {@inheritDoc}  
	 */
	public double solve(final UnivariateRealFunction f, double min, double max,
			double initial) throws MaxIterationsExceededException,
			FunctionEvaluationException {
		Object o_7au3e = null;
		String c_7au3e = "org.apache.commons.math.analysis.solvers.BisectionSolver";
		String msig_7au3e = "solve(UnivariateRealFunction$double$double$double)"
				+ eid_solve_UnivariateRealFunction_double_double_double_7au3e;
		try {
			o_7au3e = solve_7au3e(f, min, max, initial);
			FieldPrinter
					.print(o_7au3e,
							eid_solve_UnivariateRealFunction_double_double_double_7au3e,
							c_7au3e, msig_7au3e, 0, 5);
			FieldPrinter
					.print(this,
							eid_solve_UnivariateRealFunction_double_double_double_7au3e,
							c_7au3e, msig_7au3e, 1, 5);
		} catch (Throwable t7au3e) {
			FieldPrinter
					.print(t7au3e,
							eid_solve_UnivariateRealFunction_double_double_double_7au3e,
							c_7au3e, msig_7au3e, 0, 5);
			throw t7au3e;
		} finally {
			eid_solve_UnivariateRealFunction_double_double_double_7au3e++;
		}
		return (double) o_7au3e;
	}

	/**
	 * {@inheritDoc}  
	 */
	public double solve(final UnivariateRealFunction f, double min, double max)
			throws MaxIterationsExceededException, FunctionEvaluationException {
		Object o_7au3e = null;
		String c_7au3e = "org.apache.commons.math.analysis.solvers.BisectionSolver";
		String msig_7au3e = "solve(UnivariateRealFunction$double$double)"
				+ eid_solve_UnivariateRealFunction_double_double_7au3e;
		try {
			o_7au3e = solve_7au3e(f, min, max);
			FieldPrinter.print(o_7au3e,
					eid_solve_UnivariateRealFunction_double_double_7au3e,
					c_7au3e, msig_7au3e, 0, 5);
			FieldPrinter.print(this,
					eid_solve_UnivariateRealFunction_double_double_7au3e,
					c_7au3e, msig_7au3e, 1, 5);
		} catch (Throwable t7au3e) {
			FieldPrinter.print(t7au3e,
					eid_solve_UnivariateRealFunction_double_double_7au3e,
					c_7au3e, msig_7au3e, 0, 5);
			throw t7au3e;
		} finally {
			eid_solve_UnivariateRealFunction_double_double_7au3e++;
		}
		return (double) o_7au3e;
	}
}
