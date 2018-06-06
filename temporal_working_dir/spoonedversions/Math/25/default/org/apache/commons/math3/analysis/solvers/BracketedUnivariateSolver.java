

package org.apache.commons.math3.analysis.solvers;


public interface BracketedUnivariateSolver<FUNC extends org.apache.commons.math3.analysis.UnivariateFunction> extends org.apache.commons.math3.analysis.solvers.BaseUnivariateSolver<FUNC> {
	double solve(int maxEval, FUNC f, double min, double max, org.apache.commons.math3.analysis.solvers.AllowedSolution allowedSolution);

	double solve(int maxEval, FUNC f, double min, double max, double startValue, org.apache.commons.math3.analysis.solvers.AllowedSolution allowedSolution);
}

