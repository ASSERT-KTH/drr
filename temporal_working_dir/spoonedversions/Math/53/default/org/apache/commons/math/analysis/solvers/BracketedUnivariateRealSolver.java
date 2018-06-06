

package org.apache.commons.math.analysis.solvers;


public interface BracketedUnivariateRealSolver<FUNC extends org.apache.commons.math.analysis.UnivariateRealFunction> extends org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver<FUNC> {
	double solve(int maxEval, FUNC f, double min, double max, org.apache.commons.math.analysis.solvers.AllowedSolutions allowedSolutions);

	double solve(int maxEval, FUNC f, double min, double max, double startValue, org.apache.commons.math.analysis.solvers.AllowedSolutions allowedSolutions);
}

