

package org.apache.commons.math.ode;


public class FirstOrderIntegratorFactoryImpl extends org.apache.commons.math.ode.FirstOrderIntegratorFactory {
	public org.apache.commons.math.ode.FirstOrderIntegrator newDefaultFixedStepsizeIntegrator(double step) {
		return newClassicalRungeKuttaIntegrator(step);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDefaultAdaptiveStepsizeIntegrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		return newDormandPrince853Integrator(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDefaultAdaptiveStepsizeIntegrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		return newDormandPrince853Integrator(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
	}

	public org.apache.commons.math.ode.FirstOrderIntegrator newEulerIntegrator(double step) {
		return new org.apache.commons.math.ode.EulerIntegrator(step);
	}

	public org.apache.commons.math.ode.FirstOrderIntegrator newMidpointIntegrator(double step) {
		return new org.apache.commons.math.ode.MidpointIntegrator(step);
	}

	public org.apache.commons.math.ode.FirstOrderIntegrator newClassicalRungeKuttaIntegrator(double step) {
		return new org.apache.commons.math.ode.ClassicalRungeKuttaIntegrator(step);
	}

	public org.apache.commons.math.ode.FirstOrderIntegrator newGillIntegrator(double step) {
		return new org.apache.commons.math.ode.GillIntegrator(step);
	}

	public org.apache.commons.math.ode.FirstOrderIntegrator newThreeEighthesIntegrator(double step) {
		return new org.apache.commons.math.ode.ThreeEighthesIntegrator(step);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newHighamHall54Integrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		return new org.apache.commons.math.ode.HighamHall54Integrator(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newHighamHall54Integrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		return new org.apache.commons.math.ode.HighamHall54Integrator(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDormandPrince54Integrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		return new org.apache.commons.math.ode.DormandPrince54Integrator(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDormandPrince54Integrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		return new org.apache.commons.math.ode.DormandPrince54Integrator(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDormandPrince853Integrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		return new org.apache.commons.math.ode.DormandPrince853Integrator(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDormandPrince853Integrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		return new org.apache.commons.math.ode.DormandPrince853Integrator(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newGraggBulirschStoerIntegrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance) {
		return new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(minStep, maxStep, scalAbsoluteTolerance, scalRelativeTolerance);
	}

	public org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newGraggBulirschStoerIntegrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance) {
		return new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(minStep, maxStep, vecAbsoluteTolerance, vecRelativeTolerance);
	}
}

