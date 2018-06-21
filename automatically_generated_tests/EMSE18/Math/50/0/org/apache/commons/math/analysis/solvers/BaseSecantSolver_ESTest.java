

package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.SinFunction;
import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values;

public class BaseSecantSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = pegasusSolver0.solve(227, ((UnivariateRealFunction) (xMinus5Function0)), (-1.0), ((double) (227)), (-1.0));
        Assert.assertEquals((-1.0), pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method.valueOf("REGULA_FALSI");
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(17, ((UnivariateRealFunction) (quinticFunction0)), 0.0, (-1.0), allowedSolution0);
        Assert.assertEquals((-1.0), regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.19999999999923582, (-1070.0));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (quinticFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(27, ((UnivariateRealFunction) (monitoredFunction0)), (-1.0), (-1.0), allowedSolution0);
        Assert.assertEquals((-1.0), pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(9.220590270857665E-9, 0.0, 0.0);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = illinoisSolver0.solve(4, univariateRealFunction0, 0.0, ((double) (4)), 1.0E-6);
        Assert.assertEquals(1.0E-6, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, (-1884.86));
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        double double0 = pegasusSolver0.solve(2694, ((UnivariateRealFunction) (monitoredFunction0)), 0.0, (-1884.86), 0.0);
        Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1884.86), double0, 0.01);
        Assert.assertEquals(0.0, pegasusSolver0.getMin(), 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SinFunction sinFunction0 = new SinFunction();
            AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
            double double0 = regulaFalsiSolver0.solve(1878, ((UnivariateRealFunction) (sinFunction0)), (-486.3), 1.625, 29.189039182181823, allowedSolution0);
            Assert.assertEquals(29.189039182181823, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals((-219.91148554688124), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.4), ((double) (950)), (-22.4), allowedSolution0);
        Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(695.247555454348, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(2116891581, univariateRealFunction0, (-22.4), ((double) (2116891581)), (-22.4), allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1.139399777543923E9, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), 0.7853981633974483);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(39, ((UnivariateRealFunction) (sincFunction0)), 3.3636031800315114, ((double) (39)), allowedSolution0);
        Assert.assertEquals(3.3636031800315114, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(31.008582337760895, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.5);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(70, ((UnivariateRealFunction) (sincFunction0)), ((double) (70)), 720.103288882, allowedSolution0);
        Assert.assertEquals(395.051644441, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(687.9327606718497, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0));
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(746, ((UnivariateRealFunction) (sincFunction0)), 1.0E-6, 4.0, allowedSolution0);
        Assert.assertEquals(2.0000005, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(3.141592653589793, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.4), ((double) (950)), (-22.4), allowedSolution0);
        Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(695.247555454348, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(931, univariateRealFunction0, (-22.4), ((double) (931)), (-22.4), allowedSolution0);
        Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(610.9178455671902, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        pegasusSolver0.solve(931, univariateRealFunction0, (-22.4), ((double) (931)), (-22.4), allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-22.4), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.4), ((double) (950)), (-22.4), allowedSolution0);
        Assert.assertEquals((-22.4), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(950.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), 0.7853981633974483);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2146760832, ((UnivariateRealFunction) (sincFunction0)), 0.7853981633974483, 3.3636031800315114, (-871.896342), allowedSolution0);
        Assert.assertEquals((-871.896342), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(3.141592653589793, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(950, univariateRealFunction0, (-22.723829792422418), ((double) (950)), (-22.723829792422418), allowedSolution0);
        Assert.assertEquals((-22.723829792422418), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(653.6409875724768, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.5);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(70, ((UnivariateRealFunction) (sincFunction0)), ((double) (70)), 720.103288882, allowedSolution0);
        Assert.assertEquals(395.051644441, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(687.9327606718497, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            Expm1Function expm1Function0 = new Expm1Function();
            AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
            double double0 = regulaFalsiSolver0.solve(1878, ((UnivariateRealFunction) (expm1Function0)), (-486.3), 1.625, 29.189039182181823, allowedSolution0);
            Assert.assertEquals(29.189039182181823, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(0.0, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, (-3594.52218));
        SinFunction sinFunction0 = new SinFunction();
        pegasusSolver0.setup(44532, sinFunction0, 1.0E-6, 0.0, 2.0813231423926306E-5);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(10.478942041689834, 10.478942041689834, 1844.0);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        illinoisSolver0.solve(2713, ((UnivariateRealFunction) (quinticFunction0)), (-3589.3092531), 725.36218753966, 2156.45932);
    }
}

