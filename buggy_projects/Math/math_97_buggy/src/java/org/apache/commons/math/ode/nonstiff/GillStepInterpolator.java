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

package org.apache.commons.math.ode.nonstiff;

import org.apache.commons.math.ode.DerivativeException;
import org.apache.commons.math.ode.sampling.AbstractStepInterpolator;
import org.apache.commons.math.ode.sampling.StepInterpolator;

/**
 * This class implements a step interpolator for the Gill fourth
 * order Runge-Kutta integrator.
 *
 * <p>This interpolator allows to compute dense output inside the last
 * step computed. The interpolation equation is consistent with the
 * integration scheme :
 *
 * <pre>
 *   y(t_n + theta h) = y (t_n + h)
 *                    - (1 - theta) (h/6) [ (1 - theta) (1 - 4 theta) y'_1
 *                                        + (1 - theta) (1 + 2 theta) ((2-q) y'_2 + (2+q) y'_3)
 *                                        + (1 + theta + 4 theta^2) y'_4
 *                                        ]
 * </pre>
 * where theta belongs to [0 ; 1], q = sqrt(2) and where y'_1 to y'_4
 * are the four evaluations of the derivatives already computed during
 * the step.</p>
 *
 * @see GillIntegrator
 * @version $Revision$ $Date$
 * @since 1.2
 */

class GillStepInterpolator
  extends RungeKuttaStepInterpolator {
    
  /** Simple constructor.
   * This constructor builds an instance that is not usable yet, the
   * {@link AbstractStepInterpolator#reinitialize} method should be called
   * before using the instance in order to initialize the internal arrays. This
   * constructor is used only in order to delay the initialization in
   * some cases. The {@link RungeKuttaIntegrator} class uses the
   * prototyping design pattern to create the step interpolators by
   * cloning an uninitialized model and latter initializing the copy.
   */
  public GillStepInterpolator() {
  }

  /** Copy constructor.
   * @param interpolator interpolator to copy from. The copy is a deep
   * copy: its arrays are separated from the original arrays of the
   * instance
   */
  public GillStepInterpolator(final GillStepInterpolator interpolator) {
    super(interpolator);
  }

  /** {@inheritDoc} */
  protected StepInterpolator doCopy() {
    return new GillStepInterpolator(this);
  }


  /** {@inheritDoc} */
  protected void computeInterpolatedState(final double theta,
                                          final double oneMinusThetaH)
    throws DerivativeException {

    final double fourTheta = 4 * theta;
    final double s         = oneMinusThetaH / 6.0;
    final double soMt      = s * (1 - theta);
    final double c23       = soMt * (1 + 2 * theta);
    final double coeff1    = soMt * (1 - fourTheta);
    final double coeff2    = c23  * tMq;
    final double coeff3    = c23  * tPq;
    final double coeff4    = s * (1 + theta * (1 + fourTheta));

    for (int i = 0; i < interpolatedState.length; ++i) {
      interpolatedState[i] = currentState[i] -
                             coeff1 * yDotK[0][i] - coeff2 * yDotK[1][i] -
                             coeff3 * yDotK[2][i] - coeff4 * yDotK[3][i];
     }

  }

  /** First Gill coefficient. */
  private static final double tMq = 2 - Math.sqrt(2.0);

  /** Second Gill coefficient. */
  private static final double tPq = 2 + Math.sqrt(2.0);

  /** Serializable version identifier */
  private static final long serialVersionUID = -107804074496313322L;

}
