

package org.apache.commons.math.ode;


public class JacobianMatrices {
	private org.apache.commons.math.ode.ExpandableStatefulODE efode;

	private int index;

	private org.apache.commons.math.ode.MainStateJacobianProvider jode;

	private org.apache.commons.math.ode.ParameterizedODE pode;

	private int stateDim;

	private org.apache.commons.math.ode.ParameterConfiguration[] selectedParameters;

	private java.util.List<org.apache.commons.math.ode.ParameterJacobianProvider> jacobianProviders;

	private int paramDim;

	private boolean dirtyParameter;

	private double[] matricesData;

	public JacobianMatrices(final org.apache.commons.math.ode.FirstOrderDifferentialEquations fode, final double[] hY, final java.lang.String... parameters) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		this(new org.apache.commons.math.ode.JacobianMatrices.MainStateJacobianWrapper(fode, hY), parameters);
	}

	public JacobianMatrices(final org.apache.commons.math.ode.MainStateJacobianProvider jode, final java.lang.String... parameters) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		org.apache.commons.math.ode.JacobianMatrices.this.efode = null;
		org.apache.commons.math.ode.JacobianMatrices.this.index = -1;
		org.apache.commons.math.ode.JacobianMatrices.this.jode = jode;
		org.apache.commons.math.ode.JacobianMatrices.this.pode = null;
		org.apache.commons.math.ode.JacobianMatrices.this.stateDim = jode.getDimension();
		if (parameters == null) {
			selectedParameters = null;
			paramDim = 0;
		}else {
			org.apache.commons.math.ode.JacobianMatrices.this.selectedParameters = new org.apache.commons.math.ode.ParameterConfiguration[parameters.length];
			for (int i = 0; i < (parameters.length); ++i) {
				selectedParameters[i] = new org.apache.commons.math.ode.ParameterConfiguration(parameters[i], java.lang.Double.NaN);
			}
			paramDim = parameters.length;
		}
		org.apache.commons.math.ode.JacobianMatrices.this.dirtyParameter = false;
		org.apache.commons.math.ode.JacobianMatrices.this.jacobianProviders = new java.util.ArrayList<org.apache.commons.math.ode.ParameterJacobianProvider>();
		matricesData = new double[((stateDim) + (paramDim)) * (stateDim)];
		for (int i = 0; i < (stateDim); ++i) {
			matricesData[(i * ((stateDim) + 1))] = 1.0;
		}
	}

	public void registerVariationalEquations(final org.apache.commons.math.ode.ExpandableStatefulODE expandable) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		final org.apache.commons.math.ode.FirstOrderDifferentialEquations ode = (jode) instanceof org.apache.commons.math.ode.JacobianMatrices.MainStateJacobianWrapper ? ((org.apache.commons.math.ode.JacobianMatrices.MainStateJacobianWrapper) (jode)).ode : jode;
		if ((expandable.getPrimary()) != ode) {
			throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.UNMATCHED_ODE_IN_EXPANDED_SET);
		}
		efode = expandable;
		index = efode.addSecondaryEquations(new org.apache.commons.math.ode.JacobianMatrices.JacobiansSecondaryEquations());
		efode.setSecondaryState(index, matricesData);
	}

	public void addParameterJacobianProvider(final org.apache.commons.math.ode.ParameterJacobianProvider provider) {
		jacobianProviders.add(provider);
	}

	public void setParameterizedODE(final org.apache.commons.math.ode.ParameterizedODE parameterizedOde) {
		org.apache.commons.math.ode.JacobianMatrices.this.pode = parameterizedOde;
		dirtyParameter = true;
	}

	public void setParameterStep(final java.lang.String parameter, final double hP) {
		for (org.apache.commons.math.ode.ParameterConfiguration param : selectedParameters) {
			if (parameter.equals(param.getParameterName())) {
				param.setHP(hP);
				dirtyParameter = true;
				return ;
			}
		}
		throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.UNKNOWN_PARAMETER, parameter);
	}

	public void setInitialMainStateJacobian(final double[][] dYdY0) throws org.apache.commons.math.exception.DimensionMismatchException {
		checkDimension(stateDim, dYdY0);
		checkDimension(stateDim, dYdY0[0]);
		int i = 0;
		for (final double[] row : dYdY0) {
			java.lang.System.arraycopy(row, 0, matricesData, i, stateDim);
			i += stateDim;
		}
		if ((efode) != null) {
			efode.setSecondaryState(index, matricesData);
		}
	}

	public void setInitialParameterJacobian(final java.lang.String pName, final double[] dYdP) throws org.apache.commons.math.exception.MathIllegalArgumentException {
		checkDimension(stateDim, dYdP);
		int i = (stateDim) * (stateDim);
		for (org.apache.commons.math.ode.ParameterConfiguration param : selectedParameters) {
			if (pName.equals(param.getParameterName())) {
				java.lang.System.arraycopy(dYdP, 0, matricesData, i, stateDim);
				if ((efode) != null) {
					efode.setSecondaryState(index, matricesData);
				}
				return ;
			}
			i += stateDim;
		}
		throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.UNKNOWN_PARAMETER, pName);
	}

	public void getCurrentMainSetJacobian(final double[][] dYdY0) {
		double[] p = efode.getSecondaryState(index);
		int j = 0;
		for (int i = 0; i < (stateDim); i++) {
			java.lang.System.arraycopy(p, j, dYdY0[i], 0, stateDim);
			j += stateDim;
		}
	}

	public void getCurrentParameterJacobian(java.lang.String pName, final double[] dYdP) {
		double[] p = efode.getSecondaryState(index);
		int i = (stateDim) * (stateDim);
		for (org.apache.commons.math.ode.ParameterConfiguration param : selectedParameters) {
			if (param.getParameterName().equals(pName)) {
				java.lang.System.arraycopy(p, i, dYdP, 0, stateDim);
				return ;
			}
			i += stateDim;
		}
	}

	private void checkDimension(final int expected, final java.lang.Object array) throws org.apache.commons.math.exception.DimensionMismatchException {
		int arrayDimension = array == null ? 0 : java.lang.reflect.Array.getLength(array);
		if (arrayDimension != expected) {
			throw new org.apache.commons.math.exception.DimensionMismatchException(arrayDimension, expected);
		}
	}

	private class JacobiansSecondaryEquations implements org.apache.commons.math.ode.SecondaryEquations {
		public int getDimension() {
			return (stateDim) * ((stateDim) + (paramDim));
		}

		public void computeDerivatives(final double t, final double[] y, final double[] yDot, final double[] z, final double[] zDot) {
			if ((dirtyParameter) && ((paramDim) != 0)) {
				jacobianProviders.add(new org.apache.commons.math.ode.ParameterJacobianWrapper(jode, pode, selectedParameters));
				dirtyParameter = false;
			}
			double[][] dFdY = new double[stateDim][stateDim];
			jode.computeMainStateJacobian(t, y, yDot, dFdY);
			for (int i = 0; i < (stateDim); ++i) {
				final double[] dFdYi = dFdY[i];
				for (int j = 0; j < (stateDim); ++j) {
					double s = 0;
					final int startIndex = j;
					int zIndex = startIndex;
					for (int l = 0; l < (stateDim); ++l) {
						s += (dFdYi[l]) * (z[zIndex]);
						zIndex += stateDim;
					}
					zDot[(startIndex + (i * (stateDim)))] = s;
				}
			}
			if ((paramDim) != 0) {
				double[] dFdP = new double[stateDim];
				int startIndex = (stateDim) * (stateDim);
				for (org.apache.commons.math.ode.ParameterConfiguration param : selectedParameters) {
					boolean found = false;
					for (org.apache.commons.math.ode.ParameterJacobianProvider provider : jacobianProviders) {
						if (provider.isSupported(param.getParameterName())) {
							try {
								provider.computeParameterJacobian(t, y, yDot, param.getParameterName(), dFdP);
								for (int i = 0; i < (stateDim); ++i) {
									final double[] dFdYi = dFdY[i];
									int zIndex = startIndex;
									double s = dFdP[i];
									for (int l = 0; l < (stateDim); ++l) {
										s += (dFdYi[l]) * (z[zIndex]);
										zIndex++;
									}
									zDot[(startIndex + i)] = s;
								}
								startIndex += stateDim;
								found = true;
								break;
							} catch (java.lang.IllegalArgumentException iae) {
							}
						}
					}
					if (!found) {
						throw new org.apache.commons.math.exception.MathIllegalArgumentException(org.apache.commons.math.exception.util.LocalizedFormats.UNKNOWN_PARAMETER, param);
					}
				}
			}
		}
	}

	private static class MainStateJacobianWrapper implements org.apache.commons.math.ode.MainStateJacobianProvider {
		private final org.apache.commons.math.ode.FirstOrderDifferentialEquations ode;

		private final double[] hY;

		public MainStateJacobianWrapper(final org.apache.commons.math.ode.FirstOrderDifferentialEquations ode, final double[] hY) {
			this.ode = ode;
			this.hY = hY.clone();
		}

		public int getDimension() {
			return ode.getDimension();
		}

		public void computeDerivatives(double t, double[] y, double[] yDot) {
			ode.computeDerivatives(t, y, yDot);
		}

		public void computeMainStateJacobian(double t, double[] y, double[] yDot, double[][] dFdY) {
			final int n = ode.getDimension();
			final double[] tmpDot = new double[n];
			for (int j = 0; j < n; ++j) {
				final double savedYj = y[j];
				y[j] += hY[j];
				ode.computeDerivatives(t, y, tmpDot);
				for (int i = 0; i < n; ++i) {
					dFdY[i][j] = ((tmpDot[i]) - (yDot[i])) / (hY[j]);
				}
				y[j] = savedYj;
			}
		}
	}
}

