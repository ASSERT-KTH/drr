

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-976.02), 5);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1220, ((UnivariateFunction) (expm1Function0)), (-976.02), 0.0625, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-2.220446049250313E-16), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2279.72), 2948);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        bracketingNthOrderBrentSolver0.solve(2948, ((UnivariateFunction) (expm1Function0)), (-2279.72), ((double) (2948)), (-11.269408847792668), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        bracketingNthOrderBrentSolver0.solve(2956, ((UnivariateFunction) (sincFunction0)), 3.9881475846239045, ((double) (2956)), 2492.3862);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(2921.681167838508, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2279.72), 2948);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2948, ((UnivariateFunction) (expm1Function0)), (-2279.72), ((double) (2948)), (-9.473065131618158E-33), allowedSolution0);
        Assert.assertEquals((-9.473065131618158E-33), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1249.8), (-1.0), 3684);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(3684, ((UnivariateFunction) (expm1Function0)), (-3111.28), 5888.045, (-1.0), allowedSolution0);
        Assert.assertEquals(2.220446049250313E-16, double0, 0.01);
        Assert.assertEquals(3684, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-13.123368785584738), 2948);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2948, ((UnivariateFunction) (expm1Function0)), (-13.123368785584738), ((double) (2948)), (-9.473065131618158E-33), allowedSolution0);
        Assert.assertEquals(6.392456008974534E-16, double0, 0.01);
        Assert.assertEquals(2948, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1249.8), (-1.0), 3684);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateFunction univariateFunction0 = expm1Function0.derivative();
        bracketingNthOrderBrentSolver0.solve(3684, univariateFunction0, (-1140.2376812664952), Double.POSITIVE_INFINITY, 5888.045);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(3684, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-1140.2376812664952), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2094.954732468426), 55);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(55, ((UnivariateFunction) (expm1Function0)), (-2094.954732468426), ((double) (55)), 0.0, allowedSolution0);
        Assert.assertEquals(55, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(3, ((UnivariateFunction) (xMinus5Function0)), ((double) (3)), 5.0, allowedSolution0);
        Assert.assertEquals(4.0, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (2948)), ((double) (2948)), 1259.7820523185203, 2948);
        SinFunction sinFunction0 = new SinFunction();
        try {
            bracketingNthOrderBrentSolver0.solve(2948, ((UnivariateFunction) (sinFunction0)), 1.4511240277243614E-16, ((double) (2948)), ((AllowedSolution) (null)));
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1981.55973606122, 2);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.4511240277243614E-16, 2948);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(762739780, ((UnivariateFunction) (sinFunction0)), (-643.0), 4166.0603415267815, allowedSolution0);
        Assert.assertEquals(2948, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(-25.132741228718512, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(2948, ((UnivariateFunction) (sinFunction0)), (-2383.51669256353), 1.4511240277243614E-16);
        Assert.assertEquals(-2274.5130811990216, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2948, ((UnivariateFunction) (sinFunction0)), 1.4511240277243614E-16, ((double) (2948)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(197.9203365271767, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(1.4511240277243614E-16, 2948);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2948, ((UnivariateFunction) (sinFunction0)), 1.4511240277243614E-16, ((double) (2948)), allowedSolution0);
        Assert.assertEquals(197.92033717615698, double0, 0.01);
        Assert.assertEquals(2948, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1249.8), (-1.0), 3684);
        Expm1Function expm1Function0 = new Expm1Function();
        {
            bracketingNthOrderBrentSolver0.solve(3684, ((UnivariateFunction) (expm1Function0)), (-3111.28), 5888.045, (-1.0), ((AllowedSolution) (null)));
        }
    }
}

