

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 86);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(86, ((UnivariateFunction) (sinFunction0)), 0.0, ((double) (86)), allowedSolution0);
        Assert.assertEquals(86, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 53.0, 107);
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(107, ((UnivariateFunction) (sinFunction0)), (-715.8), 694.5806, 0.0, allowedSolution0);
        Assert.assertEquals(107, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1957.19625), 618);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1428, univariateFunction0, Double.NaN, ((double) (618)), 1.1357430455034003E-9, allowedSolution0);
        Assert.assertEquals(618, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(1.1357430455034003E-9, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        bracketingNthOrderBrentSolver0.solve(5256, ((UnivariateFunction) (xMinus5Function0)), ((double) (5)));
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 1468.5842, 267);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        bracketingNthOrderBrentSolver0.solve(267, ((UnivariateFunction) (sinFunction0)), (-994.674), 1.0E-6, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(267, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-497.3369995), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-17.305354596992295), 20);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(20, ((UnivariateFunction) (xMinus5Function0)), (-1.0), ((double) (20)), allowedSolution0);
        Assert.assertEquals(9.5, bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1151, ((UnivariateFunction) (sincFunction0)), (-2424.0), ((double) (1151)), allowedSolution0);
        Assert.assertEquals((-636.5), bracketingNthOrderBrentSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1906.946740728996), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 86);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(86, ((UnivariateFunction) (sincFunction0)), 1.0E-15, ((double) (86)), allowedSolution0);
        Assert.assertEquals(40.840704496667314, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1957.19625), 618);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1428, ((UnivariateFunction) (sincFunction0)), ((double) (-2185)), ((double) (618)), allowedSolution0);
        Assert.assertEquals(376.99111843077503, double0, 0.01);
        Assert.assertEquals(618, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-1957.19625), 618);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1428, ((UnivariateFunction) (sincFunction0)), ((double) (-2185)), ((double) (618)), allowedSolution0);
        Assert.assertEquals(618.0, bracketingNthOrderBrentSolver0.getMax(), 0.01);
        Assert.assertEquals(376.9911184307752, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 86);
        SinFunction sinFunction0 = new SinFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(86, ((UnivariateFunction) (sinFunction0)), (-441.66), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(86, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-2.0330362973820856E-8), (-2.0330362973820856E-8), (-2.0330362973820856E-8), 479);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(479, univariateFunction0, (-1.4173514838169418E-27), ((double) (479)), 204.867814708083, allowedSolution0);
        Assert.assertEquals((-1.4173514838169418E-27), double0, 0.01);
        Assert.assertEquals(479, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(3510.532085012, 3510.532085012, 4073);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(687, ((UnivariateFunction) (sincFunction0)), (-8.56825295972308E226), 3510.532085012);
        Assert.assertEquals(4073, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-4.28412647986154E226), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 0.0, 0.0, 3);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateFunction univariateFunction0 = sincFunction0.derivative();
        bracketingNthOrderBrentSolver0.solve(3, univariateFunction0, 0.0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(3, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(5, int0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(((double) (-2185)), 618);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(618, ((UnivariateFunction) (sincFunction0)), (-3707.6256974463367), ((double) (618)), allowedSolution0);
        Assert.assertEquals(618, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(-3223.2740625831248, double0, 0.01);
    }
}

