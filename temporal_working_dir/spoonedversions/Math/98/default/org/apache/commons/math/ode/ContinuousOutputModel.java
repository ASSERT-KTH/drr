

package org.apache.commons.math.ode;


public class ContinuousOutputModel implements java.io.Serializable , org.apache.commons.math.ode.StepHandler {
	public ContinuousOutputModel() {
		steps = new java.util.ArrayList<org.apache.commons.math.ode.StepInterpolator>();
		reset();
	}

	public void append(org.apache.commons.math.ode.ContinuousOutputModel model) throws org.apache.commons.math.ode.DerivativeException {
		if ((model.steps.size()) == 0) {
			return ;
		}
		if ((steps.size()) == 0) {
			initialTime = model.initialTime;
			forward = model.forward;
		}else {
			if ((getInterpolatedState().length) != (model.getInterpolatedState().length)) {
				throw new java.lang.IllegalArgumentException("state vector dimension mismatch");
			}
			if ((forward) ^ (model.forward)) {
				throw new java.lang.IllegalArgumentException("propagation direction mismatch");
			}
			org.apache.commons.math.ode.StepInterpolator lastInterpolator = ((org.apache.commons.math.ode.StepInterpolator) (steps.get(index)));
			double current = lastInterpolator.getCurrentTime();
			double previous = lastInterpolator.getPreviousTime();
			double step = current - previous;
			double gap = (model.getInitialTime()) - current;
			if ((java.lang.Math.abs(gap)) > (0.001 * (java.lang.Math.abs(step)))) {
				throw new java.lang.IllegalArgumentException("hole between time ranges");
			}
		}
		for (org.apache.commons.math.ode.StepInterpolator interpolator : model.steps) {
			steps.add(interpolator.copy());
		}
		index = (steps.size()) - 1;
		finalTime = ((org.apache.commons.math.ode.StepInterpolator) (steps.get(index))).getCurrentTime();
	}

	public boolean requiresDenseOutput() {
		return true;
	}

	public void reset() {
		initialTime = java.lang.Double.NaN;
		finalTime = java.lang.Double.NaN;
		forward = true;
		index = 0;
		steps.clear();
	}

	public void handleStep(org.apache.commons.math.ode.StepInterpolator interpolator, boolean isLast) throws org.apache.commons.math.ode.DerivativeException {
		if ((steps.size()) == 0) {
			initialTime = interpolator.getPreviousTime();
			forward = interpolator.isForward();
		}
		steps.add(interpolator.copy());
		if (isLast) {
			finalTime = interpolator.getCurrentTime();
			index = (steps.size()) - 1;
		}
	}

	public double getInitialTime() {
		return initialTime;
	}

	public double getFinalTime() {
		return finalTime;
	}

	public double getInterpolatedTime() {
		return steps.get(index).getInterpolatedTime();
	}

	public void setInterpolatedTime(double time) {
		try {
			int iMin = 0;
			org.apache.commons.math.ode.StepInterpolator sMin = steps.get(iMin);
			double tMin = 0.5 * ((sMin.getPreviousTime()) + (sMin.getCurrentTime()));
			int iMax = (steps.size()) - 1;
			org.apache.commons.math.ode.StepInterpolator sMax = steps.get(iMax);
			double tMax = 0.5 * ((sMax.getPreviousTime()) + (sMax.getCurrentTime()));
			if ((locatePoint(time, sMin)) <= 0) {
				index = iMin;
				sMin.setInterpolatedTime(time);
				return ;
			}
			if ((locatePoint(time, sMax)) >= 0) {
				index = iMax;
				sMax.setInterpolatedTime(time);
				return ;
			}
			while ((iMax - iMin) > 5) {
				org.apache.commons.math.ode.StepInterpolator si = steps.get(index);
				int location = locatePoint(time, si);
				if (location < 0) {
					iMax = index;
					tMax = 0.5 * ((si.getPreviousTime()) + (si.getCurrentTime()));
				}else
					if (location > 0) {
						iMin = index;
						tMin = 0.5 * ((si.getPreviousTime()) + (si.getCurrentTime()));
					}else {
						si.setInterpolatedTime(time);
						return ;
					}
				
				int iMed = (iMin + iMax) / 2;
				org.apache.commons.math.ode.StepInterpolator sMed = steps.get(iMed);
				double tMed = 0.5 * ((sMed.getPreviousTime()) + (sMed.getCurrentTime()));
				if (((java.lang.Math.abs((tMed - tMin))) < 1.0E-6) || ((java.lang.Math.abs((tMax - tMed))) < 1.0E-6)) {
					index = iMed;
				}else {
					double d12 = tMax - tMed;
					double d23 = tMed - tMin;
					double d13 = tMax - tMin;
					double dt1 = time - tMax;
					double dt2 = time - tMed;
					double dt3 = time - tMin;
					double iLagrange = (((((dt2 * dt3) * d23) * iMax) - (((dt1 * dt3) * d13) * iMed)) + (((dt1 * dt2) * d12) * iMin)) / ((d12 * d23) * d13);
					index = ((int) (java.lang.Math.rint(iLagrange)));
				}
				int low = java.lang.Math.max((iMin + 1), (((9 * iMin) + iMax) / 10));
				int high = java.lang.Math.min((iMax - 1), ((iMin + (9 * iMax)) / 10));
				if ((index) < low) {
					index = low;
				}else
					if ((index) > high) {
						index = high;
					}
				
			} 
			index = iMin;
			while (((index) <= iMax) && ((locatePoint(time, steps.get(index))) > 0)) {
				++(index);
			} 
			steps.get(index).setInterpolatedTime(time);
		} catch (org.apache.commons.math.ode.DerivativeException de) {
			throw new java.lang.RuntimeException(("unexpected DerivativeException caught: " + (de.getMessage())));
		}
	}

	public double[] getInterpolatedState() {
		return steps.get(index).getInterpolatedState();
	}

	private int locatePoint(double time, org.apache.commons.math.ode.StepInterpolator interval) {
		if (forward) {
			if (time < (interval.getPreviousTime())) {
				return -1;
			}else
				if (time > (interval.getCurrentTime())) {
					return +1;
				}else {
					return 0;
				}
			
		}
		if (time > (interval.getPreviousTime())) {
			return -1;
		}else
			if (time < (interval.getCurrentTime())) {
				return +1;
			}else {
				return 0;
			}
		
	}

	private double initialTime;

	private double finalTime;

	private boolean forward;

	private int index;

	private java.util.List<org.apache.commons.math.ode.StepInterpolator> steps;

	private static final long serialVersionUID = -1417964919405031606L;
}

