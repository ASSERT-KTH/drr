

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values;

public class BaseSecantSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (quinticFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(5, ((UnivariateRealFunction) (monitoredFunction0)), (-1.0), ((double) (5)), allowedSolution0);
        Assert.assertEquals((-1.0), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
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
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        illinoisSolver0.solve(229, ((UnivariateRealFunction) (monitoredFunction0)), 0.0, 0.0, allowedSolution0);
        Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.992366895155564);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = regulaFalsiSolver0.solve(255, univariateRealFunction0, (-194.8789996079), (-3332.963650225538), allowedSolution0);
        Assert.assertEquals((-194.8789996079), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals((-3332.963650225538), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(50, ((UnivariateRealFunction) (sinFunction0)), ((double) (0)), ((double) (50)), ((double) (0)), allowedSolution0);
        Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1053.796464));
            SinFunction sinFunction0 = new SinFunction();
            MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
            double double0 = regulaFalsiSolver0.solve(632, ((UnivariateRealFunction) (monitoredFunction0)), (-1053.796464), ((double) (632)), ((double) (632)));
            Assert.assertEquals(632.0, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(543.4955290710342, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1100, ((UnivariateRealFunction) (monitoredFunction0)), ((double) (1100)), 3423.457954543, 1.0, allowedSolution0);
        Assert.assertEquals(1.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2761.459942505428, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1119, ((UnivariateRealFunction) (monitoredFunction0)), ((double) (1119)), 3423.457954543, ((double) (1119)), allowedSolution0);
        Assert.assertEquals(1119.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2855.707722113122, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(14, ((UnivariateRealFunction) (sinFunction0)), ((double) (-2)), ((double) (14)), ((double) (-2)), allowedSolution0);
        Assert.assertEquals((-2.0), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(6.2831853287225705, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1053.7450681945998));
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        regulaFalsiSolver0.solve(632, ((UnivariateRealFunction) (sinFunction0)), (-1053.7450681945998), (-138.9439516739101), ((double) (632)), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(632.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-260.75219024795285), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1100, ((UnivariateRealFunction) (monitoredFunction0)), ((double) (1100)), 3423.457954543, 3423.457954543, allowedSolution0);
        Assert.assertEquals(3423.457954543, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2761.4599425054284, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(50, univariateRealFunction0, ((double) (2)), ((double) (50)), ((double) (2)), allowedSolution0);
        Assert.assertEquals(2.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(23.56194490192345, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(50, univariateRealFunction0, ((double) (2)), ((double) (50)), ((double) (2)), allowedSolution0);
        Assert.assertEquals(2.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(23.56194490192345, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(14, univariateRealFunction0, ((double) (2)), ((double) (14)), ((double) (2)), allowedSolution0);
        Assert.assertEquals(2.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(10.995574287564276, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(14, univariateRealFunction0, ((double) (2)), ((double) (14)), ((double) (2)), allowedSolution0);
        Assert.assertEquals(2.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(10.995574287564278, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(3674, ((UnivariateRealFunction) (sincFunction0)), ((double) (2)), ((double) (3674)), ((double) (2)), allowedSolution0);
        Assert.assertEquals(2.0, pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(3672.5218120458208, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1053.796464));
            SinFunction sinFunction0 = new SinFunction();
            MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
            double double0 = regulaFalsiSolver0.solve(632, ((UnivariateRealFunction) (monitoredFunction0)), (-1053.796464), (-6.663542893624021E-14), ((double) (632)));
            Assert.assertEquals(632.0, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals((-1014.7344271095033), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(14, univariateRealFunction0, ((double) (2)), ((double) (14)), ((double) (2)), allowedSolution0);
        Assert.assertEquals(2.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(10.995574287564276, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
        SinFunction sinFunction0 = new SinFunction();
        double double0 = pegasusSolver0.solve(1215, ((UnivariateRealFunction) (sinFunction0)), ((double) (1215)), 0.0, 0.0);
        Assert.assertEquals(1215.0, pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(3.0);
        Expm1Function expm1Function0 = new Expm1Function();
        regulaFalsiSolver0.solve(38, ((UnivariateRealFunction) (expm1Function0)), 0.0, 0.0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-1283.47638316), 327.3605, (-1366.13));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(270, ((UnivariateRealFunction) (quinticFunction0)), (-1366.13), 327.3605, allowedSolution0);
        Assert.assertEquals(327.3605, pegasusSolver0.getMax(), 0.01);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-1918.04038251), (-1918.04038251));
        Assert.assertEquals(0.0, pegasusSolver0.getMax(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1918.04038251), (-1918.04038251), 9.118428564913415E-14);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = illinoisSolver0.solve(1371, ((UnivariateRealFunction) (quinticFunction0)), (-577.6954018756), ((double) (1371)));
        Assert.assertEquals(396.6522990622, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1.0000000000000002), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sinFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        illinoisSolver0.solve(1115, ((UnivariateRealFunction) (monitoredFunction0)), ((double) (1115)), 3423.457954543, 3423.457954543, allowedSolution0);
        illinoisSolver0.doSolve();
    }
}

