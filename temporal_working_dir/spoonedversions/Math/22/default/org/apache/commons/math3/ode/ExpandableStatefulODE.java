

package org.apache.commons.math3.ode;


public class ExpandableStatefulODE {
	private final org.apache.commons.math3.ode.FirstOrderDifferentialEquations primary;

	private final org.apache.commons.math3.ode.EquationsMapper primaryMapper;

	private double time;

	private final double[] primaryState;

	private final double[] primaryStateDot;

	private java.util.List<org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent> components;

	public ExpandableStatefulODE(final org.apache.commons.math3.ode.FirstOrderDifferentialEquations primary) {
		final int n = primary.getDimension();
		this.primary = primary;
		this.primaryMapper = new org.apache.commons.math3.ode.EquationsMapper(0, n);
		org.apache.commons.math3.ode.ExpandableStatefulODE.this.time = java.lang.Double.NaN;
		this.primaryState = new double[n];
		this.primaryStateDot = new double[n];
		org.apache.commons.math3.ode.ExpandableStatefulODE.this.components = new java.util.ArrayList<org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent>();
	}

	public org.apache.commons.math3.ode.FirstOrderDifferentialEquations getPrimary() {
		return primary;
	}

	public int getTotalDimension() {
		if (components.isEmpty()) {
			return primaryMapper.getDimension();
		}else {
			final org.apache.commons.math3.ode.EquationsMapper lastMapper = components.get(((components.size()) - 1)).mapper;
			return (lastMapper.getFirstIndex()) + (lastMapper.getDimension());
		}
	}

	public void computeDerivatives(final double t, final double[] y, final double[] yDot) throws org.apache.commons.math3.exception.DimensionMismatchException, org.apache.commons.math3.exception.MaxCountExceededException {
		primaryMapper.extractEquationData(y, primaryState);
		primary.computeDerivatives(t, primaryState, primaryStateDot);
		primaryMapper.insertEquationData(primaryStateDot, yDot);
		for (final org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent component : components) {
			component.mapper.extractEquationData(y, component.state);
			component.equation.computeDerivatives(t, primaryState, primaryStateDot, component.state, component.stateDot);
			component.mapper.insertEquationData(component.stateDot, yDot);
		}
	}

	public int addSecondaryEquations(final org.apache.commons.math3.ode.SecondaryEquations secondary) {
		final int firstIndex;
		if (components.isEmpty()) {
			components = new java.util.ArrayList<org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent>();
			firstIndex = primary.getDimension();
		}else {
			final org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent last = components.get(((components.size()) - 1));
			firstIndex = (last.mapper.getFirstIndex()) + (last.mapper.getDimension());
		}
		components.add(new org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent(secondary, firstIndex));
		return (components.size()) - 1;
	}

	public org.apache.commons.math3.ode.EquationsMapper getPrimaryMapper() {
		return primaryMapper;
	}

	public org.apache.commons.math3.ode.EquationsMapper[] getSecondaryMappers() {
		final org.apache.commons.math3.ode.EquationsMapper[] mappers = new org.apache.commons.math3.ode.EquationsMapper[components.size()];
		for (int i = 0; i < (mappers.length); ++i) {
			mappers[i] = components.get(i).mapper;
		}
		return mappers;
	}

	public void setTime(final double time) {
		org.apache.commons.math3.ode.ExpandableStatefulODE.this.time = time;
	}

	public double getTime() {
		return time;
	}

	public void setPrimaryState(final double[] primaryState) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if ((primaryState.length) != (org.apache.commons.math3.ode.ExpandableStatefulODE.this.primaryState.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(primaryState.length, org.apache.commons.math3.ode.ExpandableStatefulODE.this.primaryState.length);
		}
		java.lang.System.arraycopy(primaryState, 0, org.apache.commons.math3.ode.ExpandableStatefulODE.this.primaryState, 0, primaryState.length);
	}

	public double[] getPrimaryState() {
		return primaryState.clone();
	}

	public double[] getPrimaryStateDot() {
		return primaryStateDot.clone();
	}

	public void setSecondaryState(final int index, final double[] secondaryState) throws org.apache.commons.math3.exception.DimensionMismatchException {
		double[] localArray = components.get(index).state;
		if ((secondaryState.length) != (localArray.length)) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(secondaryState.length, localArray.length);
		}
		java.lang.System.arraycopy(secondaryState, 0, localArray, 0, secondaryState.length);
	}

	public double[] getSecondaryState(final int index) {
		return components.get(index).state.clone();
	}

	public double[] getSecondaryStateDot(final int index) {
		return components.get(index).stateDot.clone();
	}

	public void setCompleteState(final double[] completeState) throws org.apache.commons.math3.exception.DimensionMismatchException {
		if ((completeState.length) != (getTotalDimension())) {
			throw new org.apache.commons.math3.exception.DimensionMismatchException(completeState.length, getTotalDimension());
		}
		primaryMapper.extractEquationData(completeState, primaryState);
		for (final org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent component : components) {
			component.mapper.extractEquationData(completeState, component.state);
		}
	}

	public double[] getCompleteState() throws org.apache.commons.math3.exception.DimensionMismatchException {
		double[] completeState = new double[getTotalDimension()];
		primaryMapper.insertEquationData(primaryState, completeState);
		for (final org.apache.commons.math3.ode.ExpandableStatefulODE.SecondaryComponent component : components) {
			component.mapper.insertEquationData(component.state, completeState);
		}
		return completeState;
	}

	private static class SecondaryComponent {
		private final org.apache.commons.math3.ode.SecondaryEquations equation;

		private final org.apache.commons.math3.ode.EquationsMapper mapper;

		private final double[] state;

		private final double[] stateDot;

		public SecondaryComponent(final org.apache.commons.math3.ode.SecondaryEquations equation, final int firstIndex) {
			final int n = equation.getDimension();
			this.equation = equation;
			mapper = new org.apache.commons.math3.ode.EquationsMapper(firstIndex, n);
			state = new double[n];
			stateDot = new double[n];
		}
	}
}

