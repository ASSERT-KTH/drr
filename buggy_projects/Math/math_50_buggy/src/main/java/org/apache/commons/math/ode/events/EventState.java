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

package org.apache.commons.math.ode.events;

import org.apache.commons.math.ConvergenceException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.solvers.AllowedSolution;
import org.apache.commons.math.analysis.solvers.BracketedUnivariateRealSolver;
import org.apache.commons.math.analysis.solvers.PegasusSolver;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolver;
import org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils;
import org.apache.commons.math.exception.MathUserException;
import org.apache.commons.math.ode.sampling.StepInterpolator;
import org.apache.commons.math.util.FastMath;

/** This class handles the state for one {@link EventHandler
 * event handler} during integration steps.
 *
 * <p>Each time the integrator proposes a step, the event handler
 * switching function should be checked. This class handles the state
 * of one handler during one integration step, with references to the
 * state at the end of the preceding step. This information is used to
 * decide if the handler should trigger an event or not during the
 * proposed step.</p>
 *
 * @version $Id$
 * @since 1.2
 */
public class EventState {

    /** Event handler. */
    private final EventHandler handler;

    /** Maximal time interval between events handler checks. */
    private final double maxCheckInterval;

    /** Convergence threshold for event localization. */
    private final double convergence;

    /** Upper limit in the iteration count for event localization. */
    private final int maxIterationCount;

    /** Time at the beginning of the step. */
    private double t0;

    /** Value of the events handler at the beginning of the step. */
    private double g0;

    /** Simulated sign of g0 (we cheat when crossing events). */
    private boolean g0Positive;

    /** Indicator of event expected during the step. */
    private boolean pendingEvent;

    /** Occurrence time of the pending event. */
    private double pendingEventTime;

    /** Occurrence time of the previous event. */
    private double previousEventTime;

    /** Integration direction. */
    private boolean forward;

    /** Variation direction around pending event.
     *  (this is considered with respect to the integration direction)
     */
    private boolean increasing;

    /** Next action indicator. */
    private int nextAction;

    /** Root-finding algorithm to use to detect state events. */
    private final UnivariateRealSolver solver;

    /** Simple constructor.
     * @param handler event handler
     * @param maxCheckInterval maximal time interval between switching
     * function checks (this interval prevents missing sign changes in
     * case the integration steps becomes very large)
     * @param convergence convergence threshold in the event time search
     * @param maxIterationCount upper limit of the iteration count in
     * the event time search
     * @param solver Root-finding algorithm to use to detect state events
     */
    public EventState(final EventHandler handler, final double maxCheckInterval,
                      final double convergence, final int maxIterationCount,
                      final UnivariateRealSolver solver) {
        this.handler           = handler;
        this.maxCheckInterval  = maxCheckInterval;
        this.convergence       = FastMath.abs(convergence);
        this.maxIterationCount = maxIterationCount;
        this.solver            = solver;

        // some dummy values ...
        t0                = Double.NaN;
        g0                = Double.NaN;
        g0Positive        = true;
        pendingEvent      = false;
        pendingEventTime  = Double.NaN;
        previousEventTime = Double.NaN;
        increasing        = true;
        nextAction        = EventHandler.CONTINUE;

    }

    /** Get the underlying event handler.
     * @return underlying event handler
     */
    public EventHandler getEventHandler() {
        return handler;
    }

    /** Get the maximal time interval between events handler checks.
     * @return maximal time interval between events handler checks
     */
    public double getMaxCheckInterval() {
        return maxCheckInterval;
    }

    /** Get the convergence threshold for event localization.
     * @return convergence threshold for event localization
     */
    public double getConvergence() {
        return convergence;
    }

    /** Get the upper limit in the iteration count for event localization.
     * @return upper limit in the iteration count for event localization
     */
    public int getMaxIterationCount() {
        return maxIterationCount;
    }

    /** Reinitialize the beginning of the step.
     * @param interpolator valid for the current step
     * @exception EventException if the event handler
     * value cannot be evaluated at the beginning of the step
     */
    public void reinitializeBegin(final StepInterpolator interpolator)
        throws EventException {
        try {

            t0 = interpolator.getPreviousTime();
            interpolator.setInterpolatedTime(t0);
            g0 = handler.g(t0, interpolator.getInterpolatedState());
            if (g0 == 0) {
                // excerpt from MATH-421 issue:
                // If an ODE solver is setup with an EventHandler that return STOP
                // when the even is triggered, the integrator stops (which is exactly
                // the expected behavior). If however the user wants to restart the
                // solver from the final state reached at the event with the same
                // configuration (expecting the event to be triggered again at a
                // later time), then the integrator may fail to start. It can get stuck
                // at the previous event. The use case for the bug MATH-421 is fairly
                // general, so events occurring exactly at start in the first step should
                // be ignored.

                // extremely rare case: there is a zero EXACTLY at interval start
                // we will use the sign slightly after step beginning to force ignoring this zero
                final double epsilon = FastMath.max(solver.getAbsoluteAccuracy(),
                                                    FastMath.abs(solver.getRelativeAccuracy() * t0));
                final double tStart = t0 + 0.5 * epsilon;
                interpolator.setInterpolatedTime(tStart);
                g0 = handler.g(tStart, interpolator.getInterpolatedState());
            }
            g0Positive = g0 >= 0;

        } catch (MathUserException mue) {
            throw new EventException(mue);
        }
    }

    /** Evaluate the impact of the proposed step on the event handler.
     * @param interpolator step interpolator for the proposed step
     * @return true if the event handler triggers an event before
     * the end of the proposed step
     * @exception MathUserException if the interpolator fails to
     * compute the switching function somewhere within the step
     * @exception EventException if the switching function
     * cannot be evaluated
     * @exception ConvergenceException if an event cannot be located
     */
    public boolean evaluateStep(final StepInterpolator interpolator)
        throws MathUserException, EventException, ConvergenceException {

        try {

            forward = interpolator.isForward();
            final double t1 = interpolator.getCurrentTime();
            final double dt = t1 - t0;
            if (FastMath.abs(dt) < convergence) {
                // we cannot do anything on such a small step, don't trigger any events
                return false;
            }
            final int    n = FastMath.max(1, (int) FastMath.ceil(FastMath.abs(dt) / maxCheckInterval));
            final double h = dt / n;

            final UnivariateRealFunction f = new UnivariateRealFunction() {
                public double value(final double t) {
                    try {
                        interpolator.setInterpolatedTime(t);
                        return handler.g(t, interpolator.getInterpolatedState());
                    } catch (EventException e) {
                        throw new ConveyedException(e);
                    }
                }
            };

            double ta = t0;
            double ga = g0;
            for (int i = 0; i < n; ++i) {

                // evaluate handler value at the end of the substep
                final double tb = t0 + (i + 1) * h;
                interpolator.setInterpolatedTime(tb);
                final double gb = handler.g(tb, interpolator.getInterpolatedState());

                // check events occurrence
                if (g0Positive ^ (gb >= 0)) {
                    // there is a sign change: an event is expected during this step

                    // variation direction, with respect to the integration direction
                    increasing = gb >= ga;

                    // find the event time making sure we select a solution just at or past the exact root
                    final double root;
                    if (solver instanceof BracketedUnivariateRealSolver<?>) {
                        @SuppressWarnings("unchecked")
                        BracketedUnivariateRealSolver<UnivariateRealFunction> bracketing =
                                (BracketedUnivariateRealSolver<UnivariateRealFunction>) solver;
                        root = forward ?
                               bracketing.solve(maxIterationCount, f, ta, tb, AllowedSolution.RIGHT_SIDE) :
                               bracketing.solve(maxIterationCount, f, tb, ta, AllowedSolution.LEFT_SIDE);
                    } else {
                        final double baseRoot = forward ?
                                                solver.solve(maxIterationCount, f, ta, tb) :
                                                solver.solve(maxIterationCount, f, tb, ta);
                        final int remainingEval = maxIterationCount - solver.getEvaluations();
                        BracketedUnivariateRealSolver<UnivariateRealFunction> bracketing =
                                new PegasusSolver(solver.getRelativeAccuracy(), solver.getAbsoluteAccuracy());
                        root = forward ?
                               UnivariateRealSolverUtils.forceSide(remainingEval, f, bracketing,
                                                                   baseRoot, ta, tb, AllowedSolution.RIGHT_SIDE) :
                               UnivariateRealSolverUtils.forceSide(remainingEval, f, bracketing,
                                                                   baseRoot, tb, ta, AllowedSolution.LEFT_SIDE);
                    }

                    if ((!Double.isNaN(previousEventTime)) &&
                        (FastMath.abs(root - ta) <= convergence) &&
                        (FastMath.abs(root - previousEventTime) <= convergence)) {
                        // we have either found nothing or found (again ?) a past event,
                        // retry the substep excluding this value
                        ta = forward ? ta + convergence : ta - convergence;
                        ga = f.value(ta);
                        --i;
                    } else if (Double.isNaN(previousEventTime) ||
                               (FastMath.abs(previousEventTime - root) > convergence)) {
                        pendingEventTime = root;
                        pendingEvent = true;
                        return true;
                    } else {
                        // no sign change: there is no event for now
                        ta = tb;
                        ga = gb;
                    }

                } else {
                    // no sign change: there is no event for now
                    ta = tb;
                    ga = gb;
                }

            }

            // no event during the whole step
            pendingEvent     = false;
            pendingEventTime = Double.NaN;
            return false;

        } catch (ConveyedException ce) {
            throw ce.getConveyedException();
        }

    }

    /** Get the occurrence time of the event triggered in the current step.
     * @return occurrence time of the event triggered in the current
     * step or infinity if no events are triggered
     */
    public double getEventTime() {
        return pendingEvent ?
               pendingEventTime :
               (forward ? Double.POSITIVE_INFINITY : Double.NEGATIVE_INFINITY);
    }

    /** Acknowledge the fact the step has been accepted by the integrator.
     * @param t value of the independent <i>time</i> variable at the
     * end of the step
     * @param y array containing the current value of the state vector
     * at the end of the step
     * @exception EventException if the value of the event
     * handler cannot be evaluated
     */
    public void stepAccepted(final double t, final double[] y)
        throws EventException {

        t0 = t;
        g0 = handler.g(t, y);

        if (pendingEvent && (FastMath.abs(pendingEventTime - t) <= convergence)) {
            // force the sign to its value "just after the event"
            previousEventTime = t;
            g0Positive        = increasing;
            nextAction        = handler.eventOccurred(t, y, !(increasing ^ forward));
        } else {
            g0Positive = g0 >= 0;
            nextAction = EventHandler.CONTINUE;
        }
    }

    /** Check if the integration should be stopped at the end of the
     * current step.
     * @return true if the integration should be stopped
     */
    public boolean stop() {
        return nextAction == EventHandler.STOP;
    }

    /** Let the event handler reset the state if it wants.
     * @param t value of the independent <i>time</i> variable at the
     * beginning of the next step
     * @param y array were to put the desired state vector at the beginning
     * of the next step
     * @return true if the integrator should reset the derivatives too
     * @exception EventException if the state cannot be reseted by the event
     * handler
     */
    public boolean reset(final double t, final double[] y)
        throws EventException {

        if (!(pendingEvent && (FastMath.abs(pendingEventTime - t) <= convergence))) {
            return false;
        }

        if (nextAction == EventHandler.RESET_STATE) {
            handler.resetState(t, y);
        }
        pendingEvent      = false;
        pendingEventTime  = Double.NaN;

        return (nextAction == EventHandler.RESET_STATE) ||
               (nextAction == EventHandler.RESET_DERIVATIVES);

    }

    /** Local exception to convey EventException instances through root finding algorithms. */
    private static class ConveyedException extends RuntimeException {

        /** Serializable uid. */
        private static final long serialVersionUID = 2668348550531980574L;

        /** Conveyed exception. */
        private final EventException conveyedException;

        /** Simple constructor.
         * @param conveyedException conveyed exception
         */
        public ConveyedException(final EventException conveyedException) {
            this.conveyedException = conveyedException;
        }

        /** Get the conveyed exception.
         * @return conveyed exception
         */
        public EventException getConveyedException() {
            return conveyedException;
        }

    }

}
