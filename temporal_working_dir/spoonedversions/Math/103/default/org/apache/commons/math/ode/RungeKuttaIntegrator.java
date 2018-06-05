

package org.apache.commons.math.ode;


public abstract class RungeKuttaIntegrator implements org.apache.commons.math.ode.FirstOrderIntegrator {
	protected RungeKuttaIntegrator(boolean fsal, double[] c, double[][] a, double[] b, org.apache.commons.math.ode.RungeKuttaStepInterpolator prototype, double step) {
		org.apache.commons.math.ode.RungeKuttaIntegrator.this.fsal = fsal;
		org.apache.commons.math.ode.RungeKuttaIntegrator.this.c = c;
		org.apache.commons.math.ode.RungeKuttaIntegrator.this.a = a;
		org.apache.commons.math.ode.RungeKuttaIntegrator.this.b = b;
		org.apache.commons.math.ode.RungeKuttaIntegrator.this.prototype = prototype;
		org.apache.commons.math.ode.RungeKuttaIntegrator.this.step = step;
		handler = org.apache.commons.math.ode.DummyStepHandler.getInstance();
		switchesHandler = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
	}

	public abstract java.lang.String getName();

	public void setStepHandler(org.apache.commons.math.ode.StepHandler handler) {
		org.apache.commons.math.ode.RungeKuttaIntegrator.this.handler = handler;
	}

	public org.apache.commons.math.ode.StepHandler getStepHandler() {
		return handler;
	}

	public void addSwitchingFunction(org.apache.commons.math.ode.SwitchingFunction function, double maxCheckInterval, double convergence) {
		switchesHandler.add(function, maxCheckInterval, convergence);
	}

	public void integrate(org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, double t0, double[] y0, double t, double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException {
		if ((equations.getDimension()) != (y0.length)) {
			throw new org.apache.commons.math.ode.IntegratorException(("dimensions mismatch: ODE problem has dimension {0}," + " state vector has dimension {1}"), new java.lang.String[]{ java.lang.Integer.toString(equations.getDimension()) , java.lang.Integer.toString(y0.length) });
		}
		if ((java.lang.Math.abs((t - t0))) <= (1.0E-12 * (java.lang.Math.max(java.lang.Math.abs(t0), java.lang.Math.abs(t))))) {
			throw new org.apache.commons.math.ode.IntegratorException("too small integration interval: length = {0}", new java.lang.String[]{ java.lang.Double.toString(java.lang.Math.abs((t - t0))) });
		}
		boolean forward = t > t0;
		int stages = (c.length) + 1;
		if (y != y0) {
			java.lang.System.arraycopy(y0, 0, y, 0, y0.length);
		}
		double[][] yDotK = new double[stages][];
		for (int i = 0; i < stages; ++i) {
			yDotK[i] = new double[y0.length];
		}
		double[] yTmp = new double[y0.length];
		org.apache.commons.math.ode.AbstractStepInterpolator interpolator;
		if ((handler.requiresDenseOutput()) || (!(switchesHandler.isEmpty()))) {
			org.apache.commons.math.ode.RungeKuttaStepInterpolator rki = ((org.apache.commons.math.ode.RungeKuttaStepInterpolator) (prototype.clone()));
			rki.reinitialize(equations, yTmp, yDotK, forward);
			interpolator = rki;
		}else {
			interpolator = new org.apache.commons.math.ode.DummyStepInterpolator(yTmp, forward);
		}
		interpolator.storeTime(t0);
		double currentT = t0;
		long nbStep = java.lang.Math.max(1L, java.lang.Math.abs(java.lang.Math.round(((t - t0) / (step)))));
		double h = (t - t0) / nbStep;
		boolean firstTime = true;
		boolean lastStep = false;
		handler.reset();
		for (long i = 0; !lastStep; ++i) {
			interpolator.shift();
			boolean needUpdate = false;
			for (boolean loop = true; loop;) {
				if (firstTime || (!(fsal))) {
					equations.computeDerivatives(currentT, y, yDotK[0]);
					firstTime = false;
				}
				for (int k = 1; k < stages; ++k) {
					for (int j = 0; j < (y0.length); ++j) {
						double sum = (a[(k - 1)][0]) * (yDotK[0][j]);
						for (int l = 1; l < k; ++l) {
							sum += (a[(k - 1)][l]) * (yDotK[l][j]);
						}
						yTmp[j] = (y[j]) + (h * sum);
					}
					equations.computeDerivatives((currentT + ((c[(k - 1)]) * h)), yTmp, yDotK[k]);
				}
				for (int j = 0; j < (y0.length); ++j) {
					double sum = (b[0]) * (yDotK[0][j]);
					for (int l = 1; l < stages; ++l) {
						sum += (b[l]) * (yDotK[l][j]);
					}
					yTmp[j] = (y[j]) + (h * sum);
				}
				interpolator.storeTime((currentT + h));
				if (switchesHandler.evaluateStep(interpolator)) {
					needUpdate = true;
					h = (switchesHandler.getEventTime()) - currentT;
				}else {
					loop = false;
				}
			}
			currentT += h;
			java.lang.System.arraycopy(yTmp, 0, y, 0, y0.length);
			switchesHandler.stepAccepted(currentT, y);
			if (switchesHandler.stop()) {
				lastStep = true;
			}else {
				lastStep = i == (nbStep - 1);
			}
			interpolator.storeTime(currentT);
			handler.handleStep(interpolator, lastStep);
			if (fsal) {
				java.lang.System.arraycopy(yDotK[(stages - 1)], 0, yDotK[0], 0, y0.length);
			}
			if ((switchesHandler.reset(currentT, y)) && (!lastStep)) {
				equations.computeDerivatives(currentT, y, yDotK[0]);
			}
			if (needUpdate) {
				nbStep = java.lang.Math.max(1L, java.lang.Math.abs(java.lang.Math.round(((t - currentT) / (step)))));
				h = (t - currentT) / nbStep;
				i = -1;
			}
		}
	}

	private boolean fsal;

	private double[] c;

	private double[][] a;

	private double[] b;

	private org.apache.commons.math.ode.RungeKuttaStepInterpolator prototype;

	private double step;

	private org.apache.commons.math.ode.StepHandler handler;

	protected org.apache.commons.math.ode.SwitchingFunctionsHandler switchesHandler;
}

