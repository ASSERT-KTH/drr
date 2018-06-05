

package org.apache.commons.math.optimization.linear;


public class SimplexSolver extends org.apache.commons.math.optimization.linear.AbstractLinearOptimizer {
	private static final double DEFAULT_EPSILON = 1.0E-6;

	private static final int DEFAULT_ULPS = 10;

	protected final double epsilon;

	protected final int maxUlps;

	public SimplexSolver() {
		this(org.apache.commons.math.optimization.linear.SimplexSolver.DEFAULT_EPSILON, org.apache.commons.math.optimization.linear.SimplexSolver.DEFAULT_ULPS);
	}

	public SimplexSolver(final double epsilon, final int maxUlps) {
		this.epsilon = epsilon;
		this.maxUlps = maxUlps;
	}

	private java.lang.Integer getPivotColumn(org.apache.commons.math.optimization.linear.SimplexTableau tableau) {
		double minValue = 0;
		java.lang.Integer minPos = null;
		for (int i = tableau.getNumObjectiveFunctions(); i < ((tableau.getWidth()) - 1); i++) {
			final double entry = tableau.getEntry(0, i);
			if ((org.apache.commons.math.util.MathUtils.compareTo(entry, minValue, maxUlps)) < 0) {
				minValue = entry;
				minPos = i;
			}
		}
		return minPos;
	}

	private java.lang.Integer getPivotRow(org.apache.commons.math.optimization.linear.SimplexTableau tableau, final int col) {
		java.util.List<java.lang.Integer> minRatioPositions = new java.util.ArrayList<java.lang.Integer>();
		double minRatio = java.lang.Double.MAX_VALUE;
		for (int i = tableau.getNumObjectiveFunctions(); i < (tableau.getHeight()); i++) {
			final double rhs = tableau.getEntry(i, ((tableau.getWidth()) - 1));
			final double entry = tableau.getEntry(i, col);
			if ((org.apache.commons.math.util.MathUtils.compareTo(entry, 0.0, maxUlps)) > 0) {
				final double ratio = rhs / entry;
				final int cmp = org.apache.commons.math.util.MathUtils.compareTo(ratio, minRatio, maxUlps);
				if (cmp == 0) {
					minRatioPositions.add(i);
				}else
					if (cmp < 0) {
						minRatio = ratio;
						minRatioPositions = new java.util.ArrayList<java.lang.Integer>();
						minRatioPositions.add(i);
					}
				
			}
		}
		if ((minRatioPositions.size()) == 0) {
			return null;
		}else
			if ((minRatioPositions.size()) > 1) {
				for (java.lang.Integer row : minRatioPositions) {
					for (int i = 0; i < (tableau.getNumArtificialVariables()); i++) {
						int column = i + (tableau.getArtificialVariableOffset());
						final double entry = tableau.getEntry(row, column);
						if ((org.apache.commons.math.util.MathUtils.equals(entry, 1.0, maxUlps)) && (row.equals(tableau.getBasicRow(column)))) {
							return row;
						}
					}
				}
			}
		
		return minRatioPositions.get(0);
	}

	protected void doIteration(final org.apache.commons.math.optimization.linear.SimplexTableau tableau) throws org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.optimization.linear.UnboundedSolutionException {
		incrementIterationsCounter();
		java.lang.Integer pivotCol = getPivotColumn(tableau);
		java.lang.Integer pivotRow = getPivotRow(tableau, pivotCol);
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

	protected void solvePhase1(final org.apache.commons.math.optimization.linear.SimplexTableau tableau) throws org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.optimization.linear.NoFeasibleSolutionException, org.apache.commons.math.optimization.linear.UnboundedSolutionException {
		if ((tableau.getNumArtificialVariables()) == 0) {
			return ;
		}
		while (!(tableau.isOptimal())) {
			doIteration(tableau);
		} 
		if (!(org.apache.commons.math.util.MathUtils.equals(tableau.getEntry(0, tableau.getRhsOffset()), 0.0, epsilon))) {
			throw new org.apache.commons.math.optimization.linear.NoFeasibleSolutionException();
		}
	}

	@java.lang.Override
	public org.apache.commons.math.optimization.RealPointValuePair doOptimize() throws org.apache.commons.math.exception.MaxCountExceededException, org.apache.commons.math.optimization.linear.NoFeasibleSolutionException, org.apache.commons.math.optimization.linear.UnboundedSolutionException {
		final org.apache.commons.math.optimization.linear.SimplexTableau tableau = new org.apache.commons.math.optimization.linear.SimplexTableau(function, linearConstraints, goal, nonNegative, epsilon, maxUlps);
		solvePhase1(tableau);
		tableau.dropPhase1Objective();
		while (!(tableau.isOptimal())) {
			doIteration(tableau);
		} 
		return tableau.getSolution();
	}
}

