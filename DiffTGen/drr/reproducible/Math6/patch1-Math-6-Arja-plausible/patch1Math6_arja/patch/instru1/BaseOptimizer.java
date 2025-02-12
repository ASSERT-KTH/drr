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
package org.apache.commons.math3.optim;

import org.apache.commons.math3.util.Incrementor;
import org.apache.commons.math3.exception.TooManyEvaluationsException;
import org.apache.commons.math3.exception.TooManyIterationsException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import myprinter.FieldPrinter;

/**
 * Base class for implementing optimizers.
 * It contains the boiler-plate code for counting the number of evaluations
 * of the objective function and the number of iterations of the algorithm,
 * and storing the convergence checker.
 * <em>It is not a "user" class.</em>
 *
 * @param <PAIR> Type of the point/value pair returned by the optimization
 * algorithm.
 *
 * @version $Id$
 * @since 3.1
 */
public abstract class BaseOptimizer<PAIR> {
    public static int eid_BaseOptimizer_ConvergenceCheckerLTEMPPAIRRTEMP_7au3e = 0;
	public static int eid_getMaxEvaluations_7au3e = 0;
	public static int eid_getEvaluations_7au3e = 0;
	public static int eid_getMaxIterations_7au3e = 0;
	public static int eid_getIterations_7au3e = 0;
	public static int eid_getConvergenceChecker_7au3e = 0;
	public static int eid_optimize_OptimizationData_7au3e = 0;
	public static int eid_doOptimize_7au3e = 0;
	public static int eid_incrementEvaluationCount_7au3e = 0;
	public static int eid_incrementIterationCount_7au3e = 0;
	public static int eid_parseOptimizationData_OptimizationData_7au3e = 0;
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
		eid_BaseOptimizer_ConvergenceCheckerLTEMPPAIRRTEMP_7au3e = 0;
		eid_getMaxEvaluations_7au3e = 0;
		eid_getEvaluations_7au3e = 0;
		eid_getMaxIterations_7au3e = 0;
		eid_getIterations_7au3e = 0;
		eid_getConvergenceChecker_7au3e = 0;
		eid_optimize_OptimizationData_7au3e = 0;
		eid_doOptimize_7au3e = 0;
		eid_incrementEvaluationCount_7au3e = 0;
		eid_incrementIterationCount_7au3e = 0;
		eid_parseOptimizationData_OptimizationData_7au3e = 0;
	}

	/** Evaluations counter. */
    protected final Incrementor evaluations;
    /** Iterations counter. */
    protected final Incrementor iterations;
    /** Convergence checker. */
    private ConvergenceChecker<PAIR> checker;

    /**
     * @param checker Convergence checker.
     */
    protected BaseOptimizer(ConvergenceChecker<PAIR> checker) {
        this.checker = checker;

        evaluations = new Incrementor(0, new MaxEvalCallback());
        iterations = new Incrementor(0, new MaxIterCallback());
    }

    /**
     * Gets the maximal number of function evaluations.
     *
     * @return the maximal number of function evaluations.
     */
    public int getMaxEvaluations() {
        return evaluations.getMaximalCount();
    }

    /**
     * Gets the number of evaluations of the objective function.
     * The number of evaluations corresponds to the last call to the
     * {@code optimize} method. It is 0 if the method has not been
     * called yet.
     *
     * @return the number of evaluations of the objective function.
     */
    public int getEvaluations() {
        return evaluations.getCount();
    }

    /**
     * Gets the maximal number of iterations.
     *
     * @return the maximal number of iterations.
     */
    public int getMaxIterations() {
        return iterations.getMaximalCount();
    }

    /**
     * Gets the number of iterations performed by the algorithm.
     * The number iterations corresponds to the last call to the
     * {@code optimize} method. It is 0 if the method has not been
     * called yet.
     *
     * @return the number of evaluations of the objective function.
     */
    public int getIterations_7au3e() {
        return evaluations.getMaximalCount();
    }

    /**
     * Gets the convergence checker.
     *
     * @return the object used to check for convergence.
     */
    public ConvergenceChecker<PAIR> getConvergenceChecker() {
        return checker;
    }

    /**
     * Stores data and performs the optimization.
     * <br/>
     * The list of parameters is open-ended so that sub-classes can extend it
     * with arguments specific to their concrete implementations.
     * <br/>
     * When the method is called multiple times, instance data is overwritten
     * only when actually present in the list of arguments: when not specified,
     * data set in a previous call is retained (and thus is optional in
     * subsequent calls).
     * <br/>
     * Important note: Subclasses <em>must</em> override
     * {@link #parseOptimizationData(OptimizationData[])} if they need to register
     * their own options; but then, they <em>must</em> also call
     * {@code super.parseOptimizationData(optData)} within that method.
     *
     * @param optData Optimization data.
     * This method will register the following data:
     * <ul>
     *  <li>{@link MaxEval}</li>
     *  <li>{@link MaxIter}</li>
     * </ul>
     * @return a point/value pair that satifies the convergence criteria.
     * @throws TooManyEvaluationsException if the maximal number of
     * evaluations is exceeded.
     * @throws TooManyIterationsException if the maximal number of
     * iterations is exceeded.
     */
    public PAIR optimize(OptimizationData... optData)
        throws TooManyEvaluationsException,
               TooManyIterationsException {
        // Parse options.
        parseOptimizationData(optData);

        // Reset counters.
        evaluations.resetCount();
        iterations.resetCount();
        // Perform optimization.
        return doOptimize();
    }

    /**
     * Performs the bulk of the optimization algorithm.
     *
     * @return the point/value pair giving the optimal value of the
     * objective function.
     */
    protected abstract PAIR doOptimize();

    /**
     * Increment the evaluation count.
     *
     * @throws TooManyEvaluationsException if the allowed evaluations
     * have been exhausted.
     */
    protected void incrementEvaluationCount()
        throws TooManyEvaluationsException {
        evaluations.incrementCount();
    }

    /**
     * Increment the iteration count.
     *
     * @throws TooManyIterationsException if the allowed iterations
     * have been exhausted.
     */
    protected void incrementIterationCount()
        throws TooManyIterationsException {
        iterations.incrementCount();
    }

    /**
     * Scans the list of (required and optional) optimization data that
     * characterize the problem.
     *
     * @param optData Optimization data.
     * The following data will be looked for:
     * <ul>
     *  <li>{@link MaxEval}</li>
     *  <li>{@link MaxIter}</li>
     * </ul>
     */
    protected void parseOptimizationData(OptimizationData... optData) {
        // The existing values (as set by the previous call) are reused if
        // not provided in the argument list.
        for (OptimizationData data : optData) {
            if (data instanceof MaxEval) {
                evaluations.setMaximalCount(((MaxEval) data).getMaxEval());
                continue;
            }
            if (data instanceof MaxIter) {
                iterations.setMaximalCount(((MaxIter) data).getMaxIter());
                continue;
            }
        }
    }

    /**
     * Defines the action to perform when reaching the maximum number
     * of evaluations.
     */
    private static class MaxEvalCallback
        implements  Incrementor.MaxCountExceededCallback {
        /**
         * {@inheritDoc}
         * @throws TooManyEvaluationsException.
         */
        public void trigger(int max) {
            throw new TooManyEvaluationsException(max);
        }
    }

    /**
     * Defines the action to perform when reaching the maximum number
     * of evaluations.
     */
    private static class MaxIterCallback
        implements Incrementor.MaxCountExceededCallback {
        /**
         * {@inheritDoc}
         * @throws TooManyIterationsException.
         */
        public void trigger(int max) {
            throw new TooManyIterationsException(max);
        }
    }

	/**
	 * Gets the number of iterations performed by the algorithm. The number iterations corresponds to the last call to the {@code  optimize}  method. It is 0 if the method has not been called yet.
	 * @return  the number of evaluations of the objective function.
	 */
	public int getIterations() {
		Object o_7au3e = null;
		String c_7au3e = "org.apache.commons.math3.optim.BaseOptimizer";
		String msig_7au3e = "getIterations()" + eid_getIterations_7au3e;
		try {
			o_7au3e = getIterations_7au3e();
			addToORefMap(msig_7au3e, o_7au3e);
			addToORefMap(msig_7au3e, this);
		} catch (Throwable t7au3e) {
			addToORefMap(msig_7au3e, t7au3e);
			throw t7au3e;
		} finally {
			eid_getIterations_7au3e++;
		}
		return (int) o_7au3e;
	}
}
