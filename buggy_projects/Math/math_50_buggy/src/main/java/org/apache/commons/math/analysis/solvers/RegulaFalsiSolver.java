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


/**
 * Implements the <em>Regula Falsi</em> or <em>False position</em> method for
 * root-finding (approximating a zero of a univariate real function). It is a
 * modified {@link SecantSolver <em>Secant</em>} method. Unlike the
 * <em>Secant</em> method, convergence is guaranteed by maintaining a
 * bracketed solution.
 *
 * <p>The <em>Regula Falsi</em> method assumes that the function is continuous,
 * but not necessarily smooth.</p>
 *
 * <p>Implementation based on the following article: M. Dowell and P. Jarratt,
 * <em>A modified regula falsi method for computing the root of an
 * equation</em>, BIT Numerical Mathematics, volume 11, number 2,
 * pages 168-174, Springer, 1971.</p>
 *
 * @since 3.0
 * @version $Id$
 */
public class RegulaFalsiSolver extends BaseSecantSolver {

    /** Construct a solver with default accuracy (1e-6). */
    public RegulaFalsiSolver() {
        super(DEFAULT_ABSOLUTE_ACCURACY, Method.REGULA_FALSI);
    }

    /**
     * Construct a solver.
     *
     * @param absoluteAccuracy absolute accuracy
     */
    public RegulaFalsiSolver(final double absoluteAccuracy) {
        super(absoluteAccuracy, Method.REGULA_FALSI);
    }

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy relative accuracy
     * @param absoluteAccuracy absolute accuracy
     */
    public RegulaFalsiSolver(final double relativeAccuracy,
                             final double absoluteAccuracy) {
        super(relativeAccuracy, absoluteAccuracy, Method.REGULA_FALSI);
    }

    /**
     * Construct a solver.
     *
     * @param relativeAccuracy relative accuracy
     * @param absoluteAccuracy absolute accuracy
     * @param functionValueAccuracy Maximum function value error.
     */
    public RegulaFalsiSolver(final double relativeAccuracy,
                             final double absoluteAccuracy,
                             final double functionValueAccuracy) {
        super(relativeAccuracy, absoluteAccuracy, functionValueAccuracy, Method.REGULA_FALSI);
    }
}
