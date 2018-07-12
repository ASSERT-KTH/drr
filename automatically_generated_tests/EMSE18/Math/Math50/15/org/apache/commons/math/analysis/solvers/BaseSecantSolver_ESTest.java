

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values;

public class BaseSecantSolver_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(2627.8579621);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(169, univariateRealFunction0, (-3625.2859), 6.084917829749588E-9, 0.5, allowedSolution0);
        Assert.assertEquals(0.5, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3625.2859), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method.valueOf("REGULA_FALSI");
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(1766, ((UnivariateRealFunction) (sinFunction0)), 0.0, 0.0, allowedSolution0);
        Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-0.25), (-0.25), (-0.25));
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = regulaFalsiSolver0.solve(2066, ((UnivariateRealFunction) (expm1Function0)), (-0.25), 0.0, (-1145.3873));
        Assert.assertEquals((-0.25), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-1125.0));
        Expm1Function expm1Function0 = new Expm1Function();
        pegasusSolver0.setup(946, expm1Function0, 0.0, (-1125.0), (-0.25));
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SincFunction sincFunction0 = new SincFunction();
            AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
            double double0 = regulaFalsiSolver0.solve(1890, ((UnivariateRealFunction) (sincFunction0)), 0.14285714285714285, ((double) (1890)), allowedSolution0);
            Assert.assertEquals(945.0714285714286, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(1888.0971838074659, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1564, univariateRealFunction0, 0.14982304, 1730.43909941802, 591.4, allowedSolution0);
        Assert.assertEquals(591.4, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1409.0043051350224, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(1564, univariateRealFunction0, (-1143.804211696541), 1730.43909941802, 591.4, allowedSolution0);
        Assert.assertEquals(591.4, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(906.3494805606554, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3089.0827211470328), 0.8944071040972403);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(421, univariateRealFunction0, (-3093.123946), (-860.79778622), (-588.32943), allowedSolution0);
        Assert.assertEquals((-1120.4021750175157), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.8944071040972403, 5.650007086920087E-9);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(421, univariateRealFunction0, (-3093.123946), (-860.79778622), (-618.7672616725664), allowedSolution0);
        Assert.assertEquals((-618.7672616725664), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2961.9244820989356), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1915, ((UnivariateRealFunction) (sincFunction0)), 0.14285714285714285, ((double) (1915)), allowedSolution0);
        Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(1913.229926036184, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        regulaFalsiSolver0.solve(1915, ((UnivariateRealFunction) (sincFunction0)), 0.14285714285714285, ((double) (1915)), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(1913.2299262167585, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1915, ((UnivariateRealFunction) (sincFunction0)), (-2.449098717290399), ((double) (1915)), allowedSolution0);
        Assert.assertEquals((-2.449098717290399), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(1913.2299260361842, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(1890, ((UnivariateRealFunction) (sincFunction0)), 0.14285714285714285, ((double) (1890)), allowedSolution0);
        Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(1888.0971848074657, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1915, ((UnivariateRealFunction) (sincFunction0)), 0.14285714285714285, ((double) (1915)), allowedSolution0);
        Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(1913.2299262167585, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1915, ((UnivariateRealFunction) (sincFunction0)), (-0.16624879837036133), ((double) (1915)), allowedSolution0);
        Assert.assertEquals((-0.16624879837036133), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(1913.229926036184, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        pegasusSolver0.solve(1564, ((UnivariateRealFunction) (sinFunction0)), (-994.5781728959039), 0.14982304);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals((-497.21417492795194), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-18.84955592153876), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(49, ((UnivariateRealFunction) (sinFunction0)), (-990.8149), ((double) (49)), allowedSolution0);
        Assert.assertEquals((-990.8149), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals((-216.76989309769576), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(4887.666606859597, 4887.666606859597, 4887.666606859597);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(1694, ((UnivariateRealFunction) (xMinus5Function0)), 0.0, 2129.556695688225, 4887.666606859597);
        Assert.assertEquals(4887.666606859597, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(56, univariateRealFunction0, 1620.705, (-3286.7224358164067), 2295.976523, allowedSolution0);
        Assert.assertEquals(1620.705, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals((-3286.7224358164067), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(4.503599627370496E15, (-1147.0415555080717));
        SincFunction sincFunction0 = new SincFunction();
        double double0 = illinoisSolver0.solve(2795, ((UnivariateRealFunction) (sincFunction0)), (-1074.8560439634107), 414.0372479, (-1885.10379774));
        Assert.assertEquals((-1074.8560439634107), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals((-762.8744536602126), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        regulaFalsiSolver0.solve(123, ((UnivariateRealFunction) (expm1Function0)), 0.0, 0.5, 349.768662, allowedSolution0);
    }
}

