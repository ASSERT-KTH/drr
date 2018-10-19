

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 564.7, (-1.0), 1474);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(3672, ((UnivariateFunction) (expm1Function0)), (-2284.71726), 0.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1474, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1247.4801), 1059);
        Assert.assertEquals(1059, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(397, ((UnivariateFunction) (sinFunction0)), (-2323.23114542), ((double) (397)), (-0.0625), allowedSolution0);
        Assert.assertEquals((-97.3893722612836), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0E-6, 1.0E-6, 1394.4, 1059);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(4, ((UnivariateFunction) (sinFunction0)), ((double) (4)), 1019.7349107924, 332.6993486548768, allowedSolution0);
        Assert.assertEquals(4.0, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(332.6993486548768, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(397, ((UnivariateFunction) (sinFunction0)), ((double) (0)), 941.0, ((double) (397)), allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(422, ((UnivariateFunction) (sinFunction0)), (-422.0), 938.78520875527, ((double) (422)), allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(5, ((UnivariateFunction) (expm1Function0)), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2971.70051112031), (-2971.70051112031), 2333);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(2333, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(397, ((UnivariateFunction) (sinFunction0)), (-2323.23114542), 941.0, ((double) (397)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(505.7964172286893, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2977.244549874294), (-2977.244549874294), 2333);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2333, ((UnivariateFunction) (sincFunction0)), (-2977.244549874294), ((double) (2333)), allowedSolution0);
        Assert.assertEquals(-951.9025740377074, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(2333, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(-951.9025740377074, double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        double double0 = bracketingNthOrderBrentSolver0.solve(387, ((UnivariateFunction) (sinFunction0)), (-421.9), 938.78520875527, ((double) (387)), allowedSolution0);
        Assert.assertEquals(816.8140899333463, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2971.70051112031), (-2971.70051112031), 2333);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(2333, ((UnivariateFunction) (sincFunction0)), (-2971.70051112031), ((double) (2333)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(-319.3502555601549, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals(-317.3008580125691, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(2897, ((UnivariateFunction) (quinticFunction0)), (-5737.8989), 109.29655003243488);
        Assert.assertEquals(-1.0000000010577403, double0, 0.01);
    }
}

