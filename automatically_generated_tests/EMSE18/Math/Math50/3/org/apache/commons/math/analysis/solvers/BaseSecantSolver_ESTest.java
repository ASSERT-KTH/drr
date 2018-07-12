

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.QuinticFunction;
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
    public void test00() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-1874.462353454005));
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = pegasusSolver0.solve(1293, ((UnivariateRealFunction) (xMinus5Function0)), (-1874.462353454005), 1978.317306384737, 1978.317306384737);
        Assert.assertEquals(1978.317306384737, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(1102, ((UnivariateRealFunction) (quinticFunction0)), ((double) (1102)), 1.0, 0.14285714285714285, allowedSolution0);
        Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method.valueOf("PEGASUS");
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1102, ((UnivariateRealFunction) (quinticFunction0)), 0.0, 1.0, 0.14285714285714285, allowedSolution0);
        Assert.assertEquals(0.14285714285714285, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(630.41771448114, 0.0, 630.41771448114);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        pegasusSolver0.solve(1274, univariateRealFunction0, 0.0, 1.0E-6, allowedSolution0);
        pegasusSolver0.doSolve();
        Assert.assertEquals(5.0E-7, pegasusSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2720.189456914537, 2.0, 0.5);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((UnivariateRealFunction) (quinticFunction0)), (-47.1238898038469), 2720.189456914537, 2.0, allowedSolution0);
        Assert.assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2720.189456914537, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2720.189456914537, 2.0, 2.0);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(257, ((UnivariateRealFunction) (quinticFunction0)), (-47.1238898038469), 2720.189456914537, 2.0, allowedSolution0);
        Assert.assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-47.123885488419546), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95023, 0.560027378010827, 2444.95023);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((UnivariateRealFunction) (quinticFunction0)), (-47.1238898038469), 26.914484140738182, 0.560027378010827, allowedSolution0);
        Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(22.67725599152373, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95022881, 2.0, 0.5);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((UnivariateRealFunction) (quinticFunction0)), (-47.1238898038469), 2.0, 2.0, allowedSolution0);
        Assert.assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1.9999952410178599, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95023, 0.560027378010827, 0.5);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((UnivariateRealFunction) (quinticFunction0)), (-47.1238898038469), 26.914484140738182, 0.560027378010827, allowedSolution0);
        Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-47.1238898038469), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95023, 0.560027378010827, 0.5);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(261, ((UnivariateRealFunction) (quinticFunction0)), 0.560027378010827, 26.914484140738182, 0.560027378010827, allowedSolution0);
        Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(26.914484140738182, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SincFunction sincFunction0 = new SincFunction();
            AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
            double double0 = regulaFalsiSolver0.solve(126, ((UnivariateRealFunction) (sincFunction0)), 2.4999724819560025E-7, 47.12389080383605, ((double) (126)), allowedSolution0);
            Assert.assertEquals(126.0, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(56.548667764616305, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2444.95022881, 0.560027378010827, 0.5);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(261, ((UnivariateRealFunction) (quinticFunction0)), (-47.1238898038469), 1.0E-6, 0.560027378010827, allowedSolution0);
        Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2.0, 0.560027378010827, 0.5);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        regulaFalsiSolver0.solve(261, ((UnivariateRealFunction) (quinticFunction0)), (-47.1238898038469), 1.0E-6, 0.560027378010827, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(0.560027378010827, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(9.9999994927524E-7, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1749.3));
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(1253, univariateRealFunction0, (-1749.3), 0.1111111111111111, allowedSolution0);
        Assert.assertEquals(0.1111111111111111, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-70.68583470577045), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(126, ((UnivariateRealFunction) (sincFunction0)), 2.4999724819560025E-7, 47.12389080383605, ((double) (126)), allowedSolution0);
        Assert.assertEquals(126.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(47.12388980384692, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1749.3));
            SinFunction sinFunction0 = new SinFunction();
            UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
            AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
            double double0 = regulaFalsiSolver0.solve(1253, univariateRealFunction0, (-1749.3), 0.0, allowedSolution0);
            Assert.assertEquals((-874.65), regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals((-1170.243263462198), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-1874.462353454005));
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(1293, univariateRealFunction0, (-1874.462353454005), 1978.317306384737, 1978.317306384737);
        Assert.assertEquals((-1874.462353454005), pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(1977.6325754347747, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.167, (-1.546907122064593), (-1.546907122064593));
        SinFunction sinFunction0 = new SinFunction();
        double double0 = illinoisSolver0.solve(2047, ((UnivariateRealFunction) (sinFunction0)), (-1.546907122064593), 0.167, ((double) (2047)));
        Assert.assertEquals(2047.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-0.49999999999999994));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(997, univariateRealFunction0, 1.2246467991473532E-16, (-21.986923), allowedSolution0);
        Assert.assertEquals((-21.986923), illinoisSolver0.getMax(), 0.01);
        Assert.assertEquals(1.2246467991473532E-16, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.0, 0.560027378010827);
        Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        regulaFalsiSolver0.solve(1405, ((UnivariateRealFunction) (sincFunction0)), (-50.18109298), 0.0, (-1487.265554980558));
        regulaFalsiSolver0.doSolve();
    }
}

