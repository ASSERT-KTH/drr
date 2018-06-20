

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
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
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(2498, ((UnivariateRealFunction) (quinticFunction0)), 1.0, 1317.37548499, ((double) (2498)), allowedSolution0);
        Assert.assertEquals(2498.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method.valueOf("PEGASUS");
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1478.0, 0.0);
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1905, ((UnivariateRealFunction) (sinFunction0)), 0.0, 0.0, 0.0, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-83.377946689), 0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        double double0 = regulaFalsiSolver0.solve(3626, ((UnivariateRealFunction) (expm1Function0)), 0.0, (-83.377946689), (-233.68499269119));
        Assert.assertEquals((-83.377946689), regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1477.71097215, 1477.71097215);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        regulaFalsiSolver0.setup(855, univariateRealFunction0, 855, 0.0, 0.0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-1.0), (-1.0));
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        pegasusSolver0.solve(226, ((UnivariateRealFunction) (xMinus5Function0)), (-1.0), ((double) (226)), ((double) (226)), allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(226.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.329, 1.329);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.329, allowedSolution0);
        Assert.assertEquals((-598.3355), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1124.2383727521617), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2762, ((UnivariateRealFunction) (sinFunction0)), 1.3287406718783419, ((double) (31)), 1.3287406718783419, allowedSolution0);
        Assert.assertEquals(1.3287406718783419, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(21.991148575128555, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(2768.9567595, 1.0);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(4, ((UnivariateRealFunction) (sinFunction0)), 1.0, 2768.9567595, allowedSolution0);
        Assert.assertEquals(1384.97837975, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1310.7188093891793, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(2768.9567595, 1.0);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(24, univariateRealFunction0, (-1198.0), 1.0, allowedSolution0);
        Assert.assertEquals(1.0, pegasusSolver0.getMax(), 0.01);
        Assert.assertEquals((-624.8574099906533), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(2768.9567595, 1.0);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, 1.0, 1070.942819496, 1070.942819496);
        Assert.assertEquals(1070.942819496, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(390.82210187248893, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(2762, ((UnivariateRealFunction) (sinFunction0)), 1.0, ((double) (4)), 397.2119369351686, allowedSolution0);
        Assert.assertEquals(397.2119369351686, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2.579462454848934, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.3287406718783419, 1.3287406718783419, 1.3287406718783419);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.3287406718783419, allowedSolution0);
        Assert.assertEquals(1.3287406718783419, pegasusSolver0.getMax(), 0.01);
        Assert.assertEquals((-1110.0333797171834), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(4, ((UnivariateRealFunction) (sinFunction0)), 1.0, 2768.9567595, allowedSolution0);
        Assert.assertEquals(1.0, pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(1310.7188093891793, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(4, ((UnivariateRealFunction) (sinFunction0)), 1.0, 2768.9567595, allowedSolution0);
        Assert.assertEquals(1.0, pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.3287406718783419, 1.3287406718783419, 1.3287406718783419);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2762, ((UnivariateRealFunction) (sinFunction0)), 1.3287406718783419, ((double) (4)), 1.3287406718783419, allowedSolution0);
        Assert.assertEquals(1.3287406718783419, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(4.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.0, allowedSolution0);
        Assert.assertEquals((-1198.0), pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.0, 2768.9567595, 1.0);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(4, univariateRealFunction0, (-1198.0), 1.0, allowedSolution0);
        Assert.assertEquals(1.0, pegasusSolver0.getMax(), 0.01);
        Assert.assertEquals((-624.8574099906533), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        double double0 = regulaFalsiSolver0.solve(127, ((UnivariateRealFunction) (sincFunction0)), (-275.7219), ((double) (127)), (-275.7219));
        Assert.assertEquals(127.0, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-235.61944901923448), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SinFunction sinFunction0 = new SinFunction();
            UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
            AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
            double double0 = regulaFalsiSolver0.solve(89, univariateRealFunction0, (-1100.265943532), 1.5874010519681994, allowedSolution0);
            Assert.assertEquals((-1100.265943532), regulaFalsiSolver0.getMin(), 0.01);
            Assert.assertEquals((-331.4380259537232), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(3846, univariateRealFunction0, 1.0, (-781.0), 1.0E-6, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(1.0E-6, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-781.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1477.71097215, 1477.71097215);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(855, univariateRealFunction0, 0.0, 0.0, allowedSolution0);
        Assert.assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(3846, ((UnivariateRealFunction) (expm1Function0)), (-4.4094866234946765E-14), 0.3956831015156119, allowedSolution0);
    }
}

