

package org.apache.commons.math.optimization.linear;


public class SimplexSolver extends org.apache.commons.math.optimization.linear.AbstractLinearOptimizer {
	private static final double DEFAULT_EPSILON = 1.0E-6;

	protected final double epsilon;

	public SimplexSolver() {
		this(org.apache.commons.math.optimization.linear.SimplexSolver.DEFAULT_EPSILON);
	}

	public SimplexSolver(final double epsilon) {
		this.epsilon = epsilon;
	}

	private java.lang.Integer getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau tableau) {
		double minValue = 0;
		java.lang.Integer minPos = null;
		for (int i = tableau.getNumObjectiveFunctions(); i < ((tableau.getWidth()) - 1); i++) {
			if ((org.apache.commons.math.util.MathUtils.compareTo(tableau.getEntry(0, i), minValue, epsilon)) < 0) {
				minValue = tableau.getEntry(0, i);
				minPos = i;
			}
		}
		return minPos;
	}

	private java.lang.Integer getPivotRow(final int col, final org.apache.commons.math.optimization.linear.SimplexTableau tableau) {
		double minRatio = java.lang.Double.MAX_VALUE;
		java.lang.Integer minRatioPos = null;
		for (int i = tableau.getNumObjectiveFunctions(); i < (tableau.getHeight()); i++) {
			double rhs = tableau.getEntry(i, ((tableau.getWidth()) - 1));
			if ((org.apache.commons.math.util.MathUtils.compareTo(tableau.getEntry(i, col), 0, epsilon)) >= 0) {
				double ratio = rhs / (tableau.getEntry(i, col));
				if (ratio < minRatio) {
					minRatio = ratio;
					minRatioPos = i;
				}
			}
		}
		return minRatioPos;
	}

	protected void doIteration(final org.apache.commons.math.optimization.linear.SimplexTableau tableau) throws org.apache.commons.math.optimization.OptimizationException {
		incrementIterationsCounter();
		java.lang.Integer pivotCol = getPivotColumn(tableau);
		java.lang.Integer pivotRow = getPivotRow(pivotCol, tableau);
		if (pivotRow == null) {
			throw new org.apache.commons.math.optimization.linear.UnboundedSolutionException();
		}
		double pivotVal = tableau.getEntry(pivotRow, pivotCol);
		tableau.divideRow(pivotRow, pivotVal);
		for (int i = 0; i < (tableau.getHeight()); i++) {
			if (i != pivotRow) {
				double multiplier = tableau.getEntry(i, pivotCol);
				tableau.subtractRow(i, pivotRow, multiplier);
			}
		}
	}

	private boolean isPhase1Solved(final org.apache.commons.math.optimization.linear.SimplexTableau tableau) {
		if ((tableau.getNumArtificialVariables()) == 0) {
			return true;
		}
		for (int i = tableau.getNumObjectiveFunctions(); i < ((tableau.getWidth()) - 1); i++) {
			if ((org.apache.commons.math.util.MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon)) < 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isOptimal(final org.apache.commons.math.optimization.linear.SimplexTableau tableau) {
		if ((tableau.getNumArtificialVariables()) > 0) {
			return false;
		}
		for (int i = tableau.getNumObjectiveFunctions(); i < ((tableau.getWidth()) - 1); i++) {
			if ((org.apache.commons.math.util.MathUtils.compareTo(tableau.getEntry(0, i), 0, epsilon)) < 0) {
				return false;
			}
		}
		return true;
	}

	protected void solvePhase1(final org.apache.commons.math.optimization.linear.SimplexTableau tableau) throws org.apache.commons.math.optimization.OptimizationException {
		if ((tableau.getNumArtificialVariables()) == 0) {
			return ;
		}
		while (!(isPhase1Solved(tableau))) {
			doIteration(tableau);
		} 
		if (!(org.apache.commons.math.util.MathUtils.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0, epsilon))) {
			throw new org.apache.commons.math.optimization.linear.NoFeasibleSolutionException();
		}
	}

	@java.lang.Override
	public org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws org.apache.commons.math.optimization.OptimizationException {
		final org.apache.commons.math.optimization.linear.SimplexTableau tableau = new org.apache.commons.math.optimization.linear.SimplexTableau(f, constraints, goalType, restrictToNonNegative, epsilon);
		solvePhase1(tableau);
		tableau.discardArtificialVariables();
		while (!(isOptimal(tableau))) {
			doIteration(tableau);
		} 
		return tableau.getSolution();
	}
}

