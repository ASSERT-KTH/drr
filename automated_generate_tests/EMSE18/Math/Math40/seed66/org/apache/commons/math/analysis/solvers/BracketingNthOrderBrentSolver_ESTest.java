

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2122, univariateFunction0, (-1956.3547158747), 3903.727755602, 1620.1, allowedSolution0);
        Assert.assertEquals(3501.304726847962, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-223.0717082155), 1.0E-15, 2629);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(2629, ((UnivariateFunction) (expm1Function0)), (-205.276957), ((double) (2629)), allowedSolution0);
        bracketingNthOrderBrentSolver0.doSolve();
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(2848.027156191808, 2848.027156191808, 7.528875109147604E-14, 2112);
        SincFunction sincFunction0 = new SincFunction();
        bracketingNthOrderBrentSolver0.solve(2112, ((UnivariateFunction) (sincFunction0)), (-1934.9083147), 2848.027156191808, 7.528875109147604E-14);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals((-1934.9083147), double0, 0.01);
        Assert.assertEquals(2112, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (1648)), 628.813018251863, 1648);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1648, ((UnivariateFunction) (sinFunction0)), (-2131.529604870316), 628.813018251863, allowedSolution0);
        Assert.assertEquals((-751.3582933092264), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-751.3582933092264), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2629, ((UnivariateFunction) (sincFunction0)), (-223.0717082155), ((double) (2629)), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-216.76989313673883), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1491, ((UnivariateFunction) (expm1Function0)), (-6.714376022102489E279), 1.5456545335838927E-15, (-4626.551), allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-7.275957614183426E-12), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(628.813018251863, ((double) (1648)), 628.813018251863, 1648);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(24, ((UnivariateFunction) (sinFunction0)), (-2111.0232492756254), 0.0, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(1648, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, (-276.64179751), 4);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(4, ((UnivariateFunction) (sinFunction0)), 0.0, (-1222.69479949826), Double.NaN, allowedSolution0);
        Assert.assertEquals((-1222.69479949826), bracketingNthOrderBrentSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateFunction univariateFunction0 = expm1Function0.derivative();
        double double0 = bracketingNthOrderBrentSolver0.solve(1663, univariateFunction0, (-1314.4895989126264));
        Assert.assertEquals((-1314.4895989126264), double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-5.3502441327259514E-8), 2);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(2, int0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        bracketingNthOrderBrentSolver0.solve(2629, ((UnivariateFunction) (sincFunction0)), (-205.276957), ((double) (2629)), allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(2230.5307840477803, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2629, univariateFunction0, (-198.5594953508043), ((double) (2629)), allowedSolution0);
        Assert.assertEquals(774.4012977904516, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2122, ((UnivariateFunction) (sincFunction0)), (-1956.3547158747), 3903.727755602, 1620.1, allowedSolution0);
        Assert.assertEquals(-1545.6635855587363, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-223.0717082155), 1.0E-15, 2629);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2629, ((UnivariateFunction) (sincFunction0)), (-205.276957), ((double) (2629)), allowedSolution0);
        Assert.assertEquals(2629, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(2230.530784048753, double0, 0.01);
    }
}

