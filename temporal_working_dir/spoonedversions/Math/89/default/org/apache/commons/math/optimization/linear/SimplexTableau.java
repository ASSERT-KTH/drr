

package org.apache.commons.math.optimization.linear;


class SimplexTableau implements java.io.Serializable {
	private static final long serialVersionUID = -1369660067587938365L;

	private final org.apache.commons.math.optimization.linear.LinearObjectiveFunction f;

	private final java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> constraints;

	private final boolean restrictToNonNegative;

	protected org.apache.commons.math.linear.RealMatrix tableau;

	protected final int numDecisionVariables;

	protected final int numSlackVariables;

	protected int numArtificialVariables;

	protected final double epsilon;

	SimplexTableau(final org.apache.commons.math.optimization.linear.LinearObjectiveFunction f, final java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint> constraints, final org.apache.commons.math.optimization.GoalType goalType, final boolean restrictToNonNegative, final double epsilon) {
		this.f = f;
		this.constraints = constraints;
		this.restrictToNonNegative = restrictToNonNegative;
		this.epsilon = epsilon;
		this.numDecisionVariables = (getNumVariables()) + (restrictToNonNegative ? 0 : 1);
		this.numSlackVariables = (getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship.LEQ)) + (getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship.GEQ));
		org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables = (getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship.EQ)) + (getConstraintTypeCounts(org.apache.commons.math.optimization.linear.Relationship.GEQ));
		org.apache.commons.math.optimization.linear.SimplexTableau.this.tableau = new org.apache.commons.math.linear.RealMatrixImpl(createTableau((goalType == (org.apache.commons.math.optimization.GoalType.MAXIMIZE))));
		initialize();
	}

	protected double[][] createTableau(final boolean maximize) {
		java.util.List<org.apache.commons.math.optimization.linear.LinearConstraint> constraints = getNormalizedConstraints();
		int width = ((((numDecisionVariables) + (numSlackVariables)) + (numArtificialVariables)) + (getNumObjectiveFunctions())) + 1;
		int height = (constraints.size()) + (getNumObjectiveFunctions());
		double[][] matrix = new double[height][width];
		if ((getNumObjectiveFunctions()) == 2) {
			matrix[0][0] = -1;
		}
		int zIndex = (getNumObjectiveFunctions()) == 1 ? 0 : 1;
		matrix[zIndex][zIndex] = (maximize) ? 1 : -1;
		org.apache.commons.math.linear.RealVector objectiveCoefficients = maximize ? f.getCoefficients().mapMultiply((-1)) : f.getCoefficients();
		copyArray(objectiveCoefficients.getData(), matrix[zIndex], getNumObjectiveFunctions());
		matrix[zIndex][(width - 1)] = (maximize) ? f.getConstantTerm() : (-1) * (f.getConstantTerm());
		if (!(restrictToNonNegative)) {
			matrix[zIndex][((getSlackVariableOffset()) - 1)] = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(objectiveCoefficients);
		}
		int slackVar = 0;
		int artificialVar = 0;
		for (int i = 0; i < (constraints.size()); i++) {
			org.apache.commons.math.optimization.linear.LinearConstraint constraint = constraints.get(i);
			int row = (getNumObjectiveFunctions()) + i;
			copyArray(constraint.getCoefficients().getData(), matrix[row], 1);
			if (!(restrictToNonNegative)) {
				matrix[row][((getSlackVariableOffset()) - 1)] = org.apache.commons.math.optimization.linear.SimplexTableau.getInvertedCoeffiecientSum(constraint.getCoefficients());
			}
			matrix[row][(width - 1)] = constraint.getValue();
			if ((constraint.getRelationship()) == (org.apache.commons.math.optimization.linear.Relationship.LEQ)) {
				matrix[row][((getSlackVariableOffset()) + (slackVar++))] = 1;
			}else
				if ((constraint.getRelationship()) == (org.apache.commons.math.optimization.linear.Relationship.GEQ)) {
					matrix[row][((getSlackVariableOffset()) + (slackVar++))] = -1;
				}
			
			if (((constraint.getRelationship()) == (org.apache.commons.math.optimization.linear.Relationship.EQ)) || ((constraint.getRelationship()) == (org.apache.commons.math.optimization.linear.Relationship.GEQ))) {
				matrix[0][((getArtificialVariableOffset()) + artificialVar)] = 1;
				matrix[row][((getArtificialVariableOffset()) + (artificialVar++))] = 1;
			}
		}
		return matrix;
	}

	public int getNumVariables() {
		return f.getCoefficients().getDimension();
	}

	public java.util.List<org.apache.commons.math.optimization.linear.LinearConstraint> getNormalizedConstraints() {
		java.util.List<org.apache.commons.math.optimization.linear.LinearConstraint> normalized = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
		for (org.apache.commons.math.optimization.linear.LinearConstraint constraint : constraints) {
			normalized.add(normalize(constraint));
		}
		return normalized;
	}

	private org.apache.commons.math.optimization.linear.LinearConstraint normalize(final org.apache.commons.math.optimization.linear.LinearConstraint constraint) {
		if ((constraint.getValue()) < 0) {
			return new org.apache.commons.math.optimization.linear.LinearConstraint(constraint.getCoefficients().mapMultiply((-1)), constraint.getRelationship().oppositeRelationship(), ((-1) * (constraint.getValue())));
		}
		return new org.apache.commons.math.optimization.linear.LinearConstraint(constraint.getCoefficients(), constraint.getRelationship(), constraint.getValue());
	}

	protected final int getNumObjectiveFunctions() {
		return (org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables) > 0 ? 2 : 1;
	}

	private int getConstraintTypeCounts(final org.apache.commons.math.optimization.linear.Relationship relationship) {
		int count = 0;
		for (final org.apache.commons.math.optimization.linear.LinearConstraint constraint : constraints) {
			if ((constraint.getRelationship()) == relationship) {
				++count;
			}
		}
		return count;
	}

	private void initialize() {
		for (int artificialVar = 0; artificialVar < (numArtificialVariables); artificialVar++) {
			int row = getBasicRow(((getArtificialVariableOffset()) + artificialVar));
			subtractRow(0, row, 1.0);
		}
	}

	protected static double getInvertedCoeffiecientSum(final org.apache.commons.math.linear.RealVector coefficients) {
		double sum = 0;
		for (double coefficient : coefficients.getData()) {
			sum -= coefficient;
		}
		return sum;
	}

	private java.lang.Integer getBasicRow(final int col) {
		java.lang.Integer row = null;
		for (int i = getNumObjectiveFunctions(); i < (getHeight()); i++) {
			if (!(org.apache.commons.math.util.MathUtils.equals(getEntry(i, col), 0.0, epsilon))) {
				if (row == null) {
					row = i;
				}else {
					return null;
				}
			}
		}
		return row;
	}

	protected void discardArtificialVariables() {
		if ((numArtificialVariables) == 0) {
			return ;
		}
		int width = ((getWidth()) - (numArtificialVariables)) - 1;
		int height = (getHeight()) - 1;
		double[][] matrix = new double[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < (width - 1); j++) {
				matrix[i][j] = getEntry((i + 1), (j + 1));
			}
			matrix[i][(width - 1)] = getEntry((i + 1), getRhsOffset());
		}
		org.apache.commons.math.optimization.linear.SimplexTableau.this.tableau = new org.apache.commons.math.linear.RealMatrixImpl(matrix);
		org.apache.commons.math.optimization.linear.SimplexTableau.this.numArtificialVariables = 0;
	}

	private void copyArray(final double[] src, final double[] dest, final int destPos) {
		java.lang.System.arraycopy(src, 0, dest, getNumObjectiveFunctions(), src.length);
	}

	protected org.apache.commons.math.optimization.RealPointValuePair getSolution() {
		double[] coefficients = new double[getOriginalNumDecisionVariables()];
		double mostNegative = getDecisionVariableValue(getOriginalNumDecisionVariables());
		for (int i = 0; i < (coefficients.length); i++) {
			coefficients[i] = (getDecisionVariableValue(i)) - (restrictToNonNegative ? 0 : mostNegative);
		}
		return new org.apache.commons.math.optimization.RealPointValuePair(coefficients, f.getValue(coefficients));
	}

	protected double getDecisionVariableValue(final int decisionVariable) {
		int col = (getNumObjectiveFunctions()) + decisionVariable;
		java.lang.Integer basicRow = getBasicRow(col);
		if (basicRow == null) {
			return 0;
		}
		for (int i = getNumObjectiveFunctions(); i < col; i++) {
			if ((tableau.getEntry(basicRow, i)) == 1) {
				return 0;
			}
		}
		return getEntry(basicRow, getRhsOffset());
	}

	protected void divideRow(final int dividendRow, final double divisor) {
		for (int j = 0; j < (getWidth()); j++) {
			tableau.setEntry(dividendRow, j, ((tableau.getEntry(dividendRow, j)) / divisor));
		}
	}

	protected void subtractRow(final int minuendRow, final int subtrahendRow, final double multiple) {
		for (int j = 0; j < (getWidth()); j++) {
			tableau.setEntry(minuendRow, j, ((tableau.getEntry(minuendRow, j)) - (multiple * (tableau.getEntry(subtrahendRow, j)))));
		}
	}

	protected final int getWidth() {
		return tableau.getColumnDimension();
	}

	protected final int getHeight() {
		return tableau.getRowDimension();
	}

	protected final double getEntry(final int row, final int column) {
		return tableau.getEntry(row, column);
	}

	protected final void setEntry(final int row, final int column, final double value) {
		tableau.setEntry(row, column, value);
	}

	protected final int getSlackVariableOffset() {
		return (getNumObjectiveFunctions()) + (numDecisionVariables);
	}

	protected final int getArtificialVariableOffset() {
		return ((getNumObjectiveFunctions()) + (numDecisionVariables)) + (numSlackVariables);
	}

	protected final int getRhsOffset() {
		return (getWidth()) - 1;
	}

	protected final int getNumDecisionVariables() {
		return numDecisionVariables;
	}

	protected final int getOriginalNumDecisionVariables() {
		return restrictToNonNegative ? numDecisionVariables : (numDecisionVariables) - 1;
	}

	protected final int getNumSlackVariables() {
		return numSlackVariables;
	}

	protected final int getNumArtificialVariables() {
		return numArtificialVariables;
	}

	protected final double[][] getData() {
		return tableau.getData();
	}
}

