

package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.Expm1Function;
import org.junit.Assert;
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
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(746, ((UnivariateRealFunction) (quinticFunction0)), ((double) (746)), 0.0, allowedSolution0);
        Assert.assertEquals(373.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1425.4), (-1425.4));
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = regulaFalsiSolver0.solve(1942, univariateRealFunction0, (-1425.4), ((double) (1942)), allowedSolution0);
        Assert.assertEquals(258.29999999999995, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1425.4), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(Integer.MAX_VALUE, ((UnivariateRealFunction) (expm1Function0)), (-2461.5010863176), 0.0, 0.0, allowedSolution0);
        Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(2096.55971103);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        pegasusSolver0.solve(1004, univariateRealFunction0, (-1069.9773331), 2922.5779732119886, ((double) (1004)));
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(1004.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1069.9773331), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 0.5);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1344, ((UnivariateRealFunction) (sincFunction0)), 0.04168701738764507, ((double) (1344)), 0.5, allowedSolution0);
        Assert.assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1341.4600628161, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(24.18346493848108, (-383.6374626567826), 0.0);
        SincFunction sincFunction0 = new SincFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sincFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2299, ((UnivariateRealFunction) (monitoredFunction0)), 0.0, 1669.3, 1344.1734051857318, allowedSolution0);
        Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        Assert.assertEquals(1668.4028795329286, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.333333333333333, (-383.63746265678265), 0.0);
        SincFunction sincFunction0 = new SincFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sincFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(2279, ((UnivariateRealFunction) (monitoredFunction0)), 0.0, ((double) (2279)), 5.0, allowedSolution0);
        Assert.assertEquals(5.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2278.0257275802455, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-623.0), 5.5344232771374716E-5);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(Integer.MAX_VALUE, ((UnivariateRealFunction) (expm1Function0)), (-1854.0), 1.5830993332061267E-10, 0.0, allowedSolution0);
        Assert.assertEquals((-2.933483064198878E-7), double0, 0.01);
        Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.333333333333333, (-383.63746265678265), 0.0);
        SincFunction sincFunction0 = new SincFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sincFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(2303, ((UnivariateRealFunction) (monitoredFunction0)), 0.0, 5.0, 1344.1734051857318, allowedSolution0);
        Assert.assertEquals(1344.1734051857318, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(3.2544642357220774, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.5, 0.5, 0.5);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1283, ((UnivariateRealFunction) (sincFunction0)), (-9.501787376057395), ((double) (1283)), 0.5, allowedSolution0);
        Assert.assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1175.4815496764697, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
            SincFunction sincFunction0 = new SincFunction();
            AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
            double double0 = regulaFalsiSolver0.solve(1344, ((UnivariateRealFunction) (sincFunction0)), 0.0, ((double) (1344)), (-1229.761396), allowedSolution0);
            Assert.assertEquals((-1229.761396), regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(1344.601655736435, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(1344, ((UnivariateRealFunction) (sincFunction0)), 0.04168701738764507, ((double) (1344)), 0.0, allowedSolution0);
        Assert.assertEquals(1341.4600628161, double0, 0.01);
        Assert.assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 1.5830993332061267E-10);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(Integer.MAX_VALUE, ((UnivariateRealFunction) (expm1Function0)), (-623.0), 1.5830993332061267E-10, 797.0667, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(797.0667, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(7.794303767674833E-18, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 1.5830993332061267E-10);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(Integer.MAX_VALUE, ((UnivariateRealFunction) (expm1Function0)), (-2461.5010863176), 1.5830993332061267E-10, 0.0, allowedSolution0);
        Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3.083258161520777E-17), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = regulaFalsiSolver0.solve(1369, ((UnivariateRealFunction) (sincFunction0)), 0.04168701738764507, ((double) (1369)), (-1.0));
        Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(1366.59280431156, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
            SincFunction sincFunction0 = new SincFunction();
            AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
            double double0 = regulaFalsiSolver0.solve(1369, ((UnivariateRealFunction) (sincFunction0)), 0.04168701738764507, ((double) (1369)), 0.0, allowedSolution0);
            Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMin(), 0.01);
            Assert.assertEquals(1366.5928043115655, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(1344, ((UnivariateRealFunction) (sincFunction0)), 0.04168701738764507, ((double) (1344)), 0.0, allowedSolution0);
        Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(1341.460063082842, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(Integer.MAX_VALUE, ((UnivariateRealFunction) (expm1Function0)), (-2461.5010863176), 1.5830993332061267E-10, (-1702.9215892577568), allowedSolution0);
        Assert.assertEquals((-1702.9215892577568), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3.8952176287941417E-7), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(201, ((UnivariateRealFunction) (xMinus5Function0)), (-217.87755), ((double) (201)), allowedSolution0);
        Assert.assertEquals((-217.87755), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-0.5), (-0.5), 2142.69);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = regulaFalsiSolver0.solve(3, ((UnivariateRealFunction) (quinticFunction0)), (-1567.374019132), 0.5, 2142.69);
        Assert.assertEquals(0.5, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        regulaFalsiSolver0.solve(6502, univariateRealFunction0, 0.0, 496.953449268034, 0.0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(496.953449268034, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }
}

