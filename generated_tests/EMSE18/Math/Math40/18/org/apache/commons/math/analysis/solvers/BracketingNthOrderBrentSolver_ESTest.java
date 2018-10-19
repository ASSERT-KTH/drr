

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(27, ((UnivariateFunction) (quinticFunction0)), ((double) (27)), 0.0, Double.NaN, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(797, univariateFunction0, (-244.59305419909), 1010.850523, allowedSolution0);
        Assert.assertEquals((-29.811598788080133), double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals((-29.811598788080133), double1, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1943, ((UnivariateFunction) (sinFunction0)), (-0.871180689286), 3.141592649549291, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(797, univariateFunction0, (-244.59305419909), 1010.850523081495, allowedSolution0);
        Assert.assertEquals(73.81388145405346, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0625, 0.0625, 0.0625, 1951);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1951, ((UnivariateFunction) (sinFunction0)), 0.0625, ((double) (1951)), allowedSolution0);
        Assert.assertEquals(1951.0, double0, 0.01);
        Assert.assertEquals(1951, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0097980358612415, 1.0097980358612415, 1.0097980358612415, 1951);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1951, ((UnivariateFunction) (sinFunction0)), (-0.87118068928597), 976.0048990179306, allowedSolution0);
        Assert.assertEquals((-0.87118068928597), bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(976.0048990179306, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.0097980358612415, 1.0097980358612415, 1.0097980358612415, 1951);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1951, ((UnivariateFunction) (sinFunction0)), 1.0097980358612415, ((double) (1951)), allowedSolution0);
        Assert.assertEquals(1.0097980358612415, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(976.0048990179306, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1943, ((UnivariateFunction) (sinFunction0)), 0.0625, ((double) (1943)), allowedSolution0);
        Assert.assertEquals(3.141592649549291, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0625, 0.0625, 1.0, 1951);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1951, ((UnivariateFunction) (sinFunction0)), 1.0, ((double) (1951)), allowedSolution0);
        Assert.assertEquals(1.0, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(1951.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(975.0, 975.0, 975.0, 797);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1096, univariateFunction0, ((double) (797)), 1568.668407465, 975.0, allowedSolution0);
        Assert.assertEquals(975.0, double0, 0.01);
        Assert.assertEquals(797, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(975.0, 975.0, 975.0, 797);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        bracketingNthOrderBrentSolver0.solve(797, ((UnivariateFunction) (sincFunction0)), (-244.59305419909), 975.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(365.2034729004549, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals(365.2034729004549, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 0.0, 1951);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(1951, ((UnivariateFunction) (sinFunction0)), 0.0, ((double) (1951)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1951, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.5, (-870.7094394), 1995);
        Assert.assertEquals(1995, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1, ((UnivariateFunction) (quinticFunction0)), (-862.0), 1180.62447, (-1.0), allowedSolution0);
        Assert.assertEquals((-1.0), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0625, 0.0625, 0.0625, 1951);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1951, ((UnivariateFunction) (sinFunction0)), (-0.8711806892859728), 1951.0, allowedSolution0);
        Assert.assertEquals(-0.8711806892859728, bracketingNthOrderBrentSolver0.getMin(), 0.01);
        Assert.assertEquals(136.90578385124908, double0, 0.01);
    }
}

