

package org.apache.commons.math.ode;


public abstract class FirstOrderIntegratorFactory {
	protected FirstOrderIntegratorFactory() {
	}

	public static org.apache.commons.math.ode.FirstOrderIntegratorFactory newInstance() {
		org.apache.commons.math.ode.FirstOrderIntegratorFactory factory = null;
		try {
			org.apache.commons.discovery.tools.DiscoverClass dc = new org.apache.commons.discovery.tools.DiscoverClass();
			factory = ((org.apache.commons.math.ode.FirstOrderIntegratorFactory) (dc.newInstance(org.apache.commons.math.ode.FirstOrderIntegratorFactory.class, "org.apache.commons.math.analysis.FirstOrderIntegratorFactoryImpl")));
		} catch (java.lang.Throwable t) {
			return new org.apache.commons.math.ode.FirstOrderIntegratorFactoryImpl();
		}
		return factory;
	}

	public abstract org.apache.commons.math.ode.FirstOrderIntegrator newDefaultFixedStepsizeIntegrator(double step);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDefaultAdaptiveStepsizeIntegrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDefaultAdaptiveStepsizeIntegrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance);

	public abstract org.apache.commons.math.ode.FirstOrderIntegrator newEulerIntegrator(double step);

	public abstract org.apache.commons.math.ode.FirstOrderIntegrator newMidpointIntegrator(double step);

	public abstract org.apache.commons.math.ode.FirstOrderIntegrator newClassicalRungeKuttaIntegrator(double step);

	public abstract org.apache.commons.math.ode.FirstOrderIntegrator newGillIntegrator(double step);

	public abstract org.apache.commons.math.ode.FirstOrderIntegrator newThreeEighthesIntegrator(double step);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newHighamHall54Integrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newHighamHall54Integrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDormandPrince54Integrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDormandPrince54Integrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDormandPrince853Integrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newDormandPrince853Integrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newGraggBulirschStoerIntegrator(double minStep, double maxStep, double scalAbsoluteTolerance, double scalRelativeTolerance);

	public abstract org.apache.commons.math.ode.AdaptiveStepsizeIntegrator newGraggBulirschStoerIntegrator(double minStep, double maxStep, double[] vecAbsoluteTolerance, double[] vecRelativeTolerance);
}

