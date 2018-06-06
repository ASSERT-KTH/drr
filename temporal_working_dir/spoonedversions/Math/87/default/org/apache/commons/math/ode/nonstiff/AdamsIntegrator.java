

package org.apache.commons.math.ode.nonstiff;


public class AdamsIntegrator extends org.apache.commons.math.ode.MultistepIntegrator {
	private static final long serialVersionUID = -5893911062100008922L;

	private static final java.util.Map<java.lang.Integer, org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients> cache = new java.util.HashMap<java.lang.Integer, org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients>();

	private static final java.lang.String NO_CORRECTION_METHOD_NAME = "Adams-Bashforth";

	private static final java.lang.String CORRECTION_METHOD_NAME = "Adams-Moulton";

	private final boolean withCorrection;

	private final transient org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients coefficients;

	private final double step;

	public AdamsIntegrator(final int order, final boolean withCorrection, final double step) throws java.lang.IllegalArgumentException {
		super((withCorrection ? org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CORRECTION_METHOD_NAME : org.apache.commons.math.ode.nonstiff.AdamsIntegrator.NO_CORRECTION_METHOD_NAME), order, new org.apache.commons.math.ode.sampling.NordsieckStepInterpolator());
		if (order <= 1) {
			throw org.apache.commons.math.MathRuntimeException.createIllegalArgumentException("{0} is supported only for orders 2 or more", getName());
		}
		this.withCorrection = withCorrection;
		synchronized(org.apache.commons.math.ode.nonstiff.AdamsIntegrator.cache) {
			org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients coeff = org.apache.commons.math.ode.nonstiff.AdamsIntegrator.cache.get(order);
			if (coeff == null) {
				coeff = new org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients(order);
				org.apache.commons.math.ode.nonstiff.AdamsIntegrator.cache.put(order, coeff);
			}
			coefficients = coeff;
		}
		this.step = java.lang.Math.abs(step);
	}

	public double integrate(final org.apache.commons.math.ode.FirstOrderDifferentialEquations equations, final double t0, final double[] y0, final double t, final double[] y) throws org.apache.commons.math.ode.DerivativeException, org.apache.commons.math.ode.IntegratorException {
		final int n = y0.length;
		sanityChecks(equations, t0, y0, t, y);
		final boolean forward = t > t0;
		if (y != y0) {
			java.lang.System.arraycopy(y0, 0, y, 0, n);
		}
		final double[] yTmp = new double[y0.length];
		final org.apache.commons.math.ode.sampling.NordsieckStepInterpolator interpolator = ((org.apache.commons.math.ode.sampling.NordsieckStepInterpolator) (prototype.copy()));
		interpolator.reinitialize(yTmp, forward);
		stepStart = t0;
		stepSize = (forward) ? step : -(step);
		for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
			handler.reset();
		}
		org.apache.commons.math.ode.events.CombinedEventsManager manager = addEndTimeChecker(t0, t, eventsHandlersManager);
		double stopTime = start(previousF.length, stepSize, manager, equations, stepStart, y);
		if (java.lang.Double.isNaN(previousT[0])) {
			return stopTime;
		}
		stepStart = previousT[0];
		java.lang.System.arraycopy(y, 0, yTmp, 0, n);
		double[] scaled = convertToNordsieckLow();
		org.apache.commons.math.linear.RealMatrix nordsieck = convertToNordsieckHigh(scaled);
		interpolator.reinitialize(stepSize, scaled, nordsieck);
		interpolator.storeTime(stepStart);
		boolean lastStep = false;
		while (!lastStep) {
			interpolator.shift();
			if (withCorrection) {
				final double stepEnd = (stepStart) + (stepSize);
				final double[] f0 = previousF[0];
				previousT[0] = stepEnd;
				equations.computeDerivatives(stepEnd, interpolator.getInterpolatedState(), f0);
				nordsieck = coefficients.msUpdate.multiply(nordsieck);
				final double[] end = new double[y0.length];
				for (int j = 0; j < (y0.length); ++j) {
					end[j] = (stepSize) * (f0[j]);
				}
				nordsieck.walkInOptimizedOrder(new org.apache.commons.math.ode.nonstiff.AdamsIntegrator.NordsieckUpdater(scaled, end, coefficients.c1));
				scaled = end;
				nordsieck.walkInOptimizedOrder(new org.apache.commons.math.ode.nonstiff.AdamsIntegrator.Corrector(y, scaled, yTmp));
				interpolator.reinitialize(stepSize, scaled, nordsieck);
			}
			interpolator.storeTime(((stepStart) + (stepSize)));
			if (manager.evaluateStep(interpolator)) {
				stepSize = (manager.getEventTime()) - (stepStart);
			}
			final double nextStep = (stepStart) + (stepSize);
			interpolator.setInterpolatedTime(nextStep);
			java.lang.System.arraycopy(interpolator.getInterpolatedState(), 0, y, 0, n);
			manager.stepAccepted(nextStep, y);
			lastStep = manager.stop();
			for (org.apache.commons.math.ode.sampling.StepHandler handler : stepHandlers) {
				handler.handleStep(interpolator, lastStep);
			}
			stepStart = nextStep;
			if (!lastStep) {
				if (manager.reset(stepStart, y)) {
					stopTime = start(previousF.length, stepSize, manager, equations, stepStart, y);
					if (java.lang.Double.isNaN(previousT[0])) {
						return stopTime;
					}
					stepStart = previousT[0];
					scaled = convertToNordsieckLow();
					nordsieck = convertToNordsieckHigh(scaled);
					interpolator.reinitialize(stepSize, scaled, nordsieck);
					interpolator.storeTime(stepStart);
				}else {
					final double[] f0 = previousF[0];
					previousT[0] = stepStart;
					equations.computeDerivatives(stepStart, y, f0);
					if (!(withCorrection)) {
						nordsieck = coefficients.msUpdate.multiply(nordsieck);
					}
					final double[] end = new double[y0.length];
					for (int j = 0; j < (y0.length); ++j) {
						end[j] = (stepSize) * (f0[j]);
					}
					nordsieck.walkInOptimizedOrder(new org.apache.commons.math.ode.nonstiff.AdamsIntegrator.NordsieckUpdater(scaled, end, coefficients.c1));
					scaled = end;
					interpolator.reinitialize(stepSize, scaled, nordsieck);
				}
				java.lang.System.arraycopy(y, 0, yTmp, 0, n);
			}
		} 
		stopTime = stepStart;
		stepStart = java.lang.Double.NaN;
		stepSize = java.lang.Double.NaN;
		return stopTime;
	}

	private double[] convertToNordsieckLow() {
		final double[] f0 = previousF[0];
		final double[] scaled = new double[f0.length];
		for (int j = 0; j < (f0.length); ++j) {
			scaled[j] = (stepSize) * (f0[j]);
		}
		return scaled;
	}

	private org.apache.commons.math.linear.RealMatrix convertToNordsieckHigh(final double[] scaled) {
		final double[] f0 = previousF[0];
		final double[][] multistep = new double[coefficients.msToN.getColumnDimension()][f0.length];
		for (int i = 0; i < (multistep.length); ++i) {
			final double[] msI = multistep[i];
			final double[] fI = previousF[(i + 1)];
			for (int j = 0; j < (f0.length); ++j) {
				msI[j] = ((stepSize) * (fI[j])) - (scaled[j]);
			}
		}
		return coefficients.msToN.multiply(new org.apache.commons.math.linear.RealMatrixImpl(multistep, false));
	}

	private static class Corrector implements org.apache.commons.math.linear.RealMatrixPreservingVisitor {
		private final double[] previous;

		private final double[] scaled;

		private final double[] corrected;

		public Corrector(final double[] previous, final double[] scaled, final double[] corrected) {
			this.previous = previous;
			this.scaled = scaled;
			this.corrected = corrected;
		}

		public void start(int rows, int columns, int startRow, int endRow, int startColumn, int endColumn) {
			java.util.Arrays.fill(corrected, 0.0);
		}

		public void visit(int row, int column, double value) throws org.apache.commons.math.linear.MatrixVisitorException {
			if ((row & 1) == 0) {
				corrected[column] -= value;
			}else {
				corrected[column] += value;
			}
		}

		public double end() {
			for (int i = 0; i < (corrected.length); ++i) {
				corrected[i] += (previous[i]) + (scaled[i]);
			}
			return 0;
		}
	}

	private static class NordsieckUpdater extends org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor {
		private final double[] start;

		private final double[] end;

		private final double[] c1;

		public NordsieckUpdater(final double[] start, final double[] end, final double[] c1) {
			this.start = start;
			this.end = end;
			this.c1 = c1;
		}

		@java.lang.Override
		public double visit(int row, int column, double value) throws org.apache.commons.math.linear.MatrixVisitorException {
			return value + ((c1[row]) * ((start[column]) - (end[column])));
		}
	}

	private static class CachedCoefficients {
		private final org.apache.commons.math.linear.RealMatrix msToN;

		private final org.apache.commons.math.linear.RealMatrix msUpdate;

		private final double[] c1;

		public CachedCoefficients(int order) {
			org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> bigNtoMS = org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients.buildP(order);
			org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> bigMStoN = new org.apache.commons.math.linear.FieldLUDecompositionImpl<org.apache.commons.math.fraction.BigFraction>(bigNtoMS).getSolver().getInverse();
			org.apache.commons.math.fraction.BigFraction[] u = new org.apache.commons.math.fraction.BigFraction[order - 1];
			java.util.Arrays.fill(u, org.apache.commons.math.fraction.BigFraction.ONE);
			org.apache.commons.math.fraction.BigFraction[] bigC1 = bigMStoN.operate(u);
			org.apache.commons.math.fraction.BigFraction[][] shiftedP = bigNtoMS.getData();
			for (int i = (shiftedP.length) - 1; i > 0; --i) {
				shiftedP[i] = shiftedP[(i - 1)];
			}
			shiftedP[0] = new org.apache.commons.math.fraction.BigFraction[order - 1];
			java.util.Arrays.fill(shiftedP[0], org.apache.commons.math.fraction.BigFraction.ZERO);
			org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> bigMSupdate = bigMStoN.multiply(new org.apache.commons.math.linear.FieldMatrixImpl<org.apache.commons.math.fraction.BigFraction>(shiftedP, false));
			msToN = org.apache.commons.math.linear.MatrixUtils.bigFractionMatrixToRealMatrix(bigMStoN);
			msUpdate = org.apache.commons.math.linear.MatrixUtils.bigFractionMatrixToRealMatrix(bigMSupdate);
			c1 = new double[order - 1];
			for (int i = 0; i < (order - 1); ++i) {
				c1[i] = bigC1[i].doubleValue();
			}
		}

		private static org.apache.commons.math.linear.FieldMatrix<org.apache.commons.math.fraction.BigFraction> buildP(final int order) {
			final org.apache.commons.math.fraction.BigFraction[][] pData = new org.apache.commons.math.fraction.BigFraction[order - 1][order - 1];
			for (int i = 0; i < (pData.length); ++i) {
				final org.apache.commons.math.fraction.BigFraction[] pI = pData[i];
				final int factor = -(i + 1);
				int aj = factor;
				for (int j = 0; j < (pI.length); ++j) {
					pI[j] = new org.apache.commons.math.fraction.BigFraction((aj * (j + 2)));
					aj *= factor;
				}
			}
			return new org.apache.commons.math.linear.FieldMatrixImpl<org.apache.commons.math.fraction.BigFraction>(pData, false);
		}
	}

	private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException {
		oos.defaultWriteObject();
		oos.writeInt(((coefficients.msToN.getRowDimension()) + 1));
	}

	private void readObject(java.io.ObjectInputStream ois) throws java.io.IOException, java.lang.ClassNotFoundException {
		try {
			ois.defaultReadObject();
			final int order = ois.readInt();
			final java.lang.Class<org.apache.commons.math.ode.nonstiff.AdamsIntegrator> cl = org.apache.commons.math.ode.nonstiff.AdamsIntegrator.class;
			final java.lang.reflect.Field f = cl.getDeclaredField("coefficients");
			f.setAccessible(true);
			synchronized(org.apache.commons.math.ode.nonstiff.AdamsIntegrator.cache) {
				org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients coeff = org.apache.commons.math.ode.nonstiff.AdamsIntegrator.cache.get(order);
				if (coeff == null) {
					coeff = new org.apache.commons.math.ode.nonstiff.AdamsIntegrator.CachedCoefficients(order);
					org.apache.commons.math.ode.nonstiff.AdamsIntegrator.cache.put(order, coeff);
				}
				f.set(org.apache.commons.math.ode.nonstiff.AdamsIntegrator.this, coeff);
			}
		} catch (java.lang.NoSuchFieldException nsfe) {
			java.io.IOException ioe = new java.io.IOException();
			ioe.initCause(nsfe);
			throw ioe;
		} catch (java.lang.IllegalAccessException iae) {
			java.io.IOException ioe = new java.io.IOException();
			ioe.initCause(iae);
			throw ioe;
		}
	}
}

