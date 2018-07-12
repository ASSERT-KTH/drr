

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
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
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(175.2802, 175.2802, 2.9808280810593163E-10);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(525, univariateRealFunction0, (-1868.6), 2.9808280810593163E-10, allowedSolution0);
        Assert.assertEquals((-934.2999999998509), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2.9808280810593163E-10, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(264, univariateRealFunction0, 0.0, ((double) (264)), 0.0, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0E-6, 0.0);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        illinoisSolver0.solve(422, ((UnivariateRealFunction) (quinticFunction0)), 48.27539, 0.0, 0.0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(48.27539, illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-549.307887618375));
            SinFunction sinFunction0 = new SinFunction();
            UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
            AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
            double double0 = regulaFalsiSolver0.solve(3244, univariateRealFunction0, (-1086.24331543), 807.64532746938, ((double) (3244)), allowedSolution0);
            Assert.assertEquals(3244.0, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(529.3583621298801, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-273.6), 1516.20258860885, (-273.6));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(133, univariateRealFunction0, (-967.8), (-273.6), 0.1818181574344635, allowedSolution0);
        Assert.assertEquals(0.1818181574344635, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-812.0469829844469), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(3437, univariateRealFunction0, 1.0, ((double) (3437)), allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(1719.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(3435.33127609859, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-549.307887618375));
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(477285303, univariateRealFunction0, (-1086.24331543), 807.64532746938, ((double) (477285303)), allowedSolution0);
        Assert.assertEquals(4.77285303E8, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(529.3583621298801, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((UnivariateRealFunction) (sinFunction0)), (-3860.0), (-1928.3950191653707), allowedSolution0);
        Assert.assertEquals((-2894.1975095826856), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2186.548486898496), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-273.6), 1516.20258860885, (-273.6));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = pegasusSolver0.solve(133, univariateRealFunction0, 1.5, ((double) (133)));
        Assert.assertEquals(67.25, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(131.79245347786178, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(175.2802, 27.7580310153246, 27.7580310153246);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(546, univariateRealFunction0, (-1868.6), 27.7580310153246, allowedSolution0);
        Assert.assertEquals(27.7580310153246, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-1843.6074905438727), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((UnivariateRealFunction) (sincFunction0)), (-1928.4), ((double) (3437)), allowedSolution0);
        Assert.assertEquals(754.2999999999997, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(3041.0616886749194, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1047.12713), (-1047.12713), 2320.207);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        regulaFalsiSolver0.solve(40, ((UnivariateRealFunction) (expm1Function0)), (-1.3438699868383645E-7), ((double) (40)), ((double) (40)), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(40.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1.343870010828141E-7), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(525, univariateRealFunction0, (-1868.6), 1.8379230800878759, allowedSolution0);
        Assert.assertEquals((-933.381038459956), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1867.676297134591), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((UnivariateRealFunction) (sincFunction0)), (-1928.3950191653707), ((double) (3437)), allowedSolution0);
        Assert.assertEquals(754.3024904173149, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1768.7166644982776), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((UnivariateRealFunction) (sincFunction0)), (-1928.3950191653707), ((double) (3437)), allowedSolution0);
        Assert.assertEquals(754.3024904173149, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1768.7166644982776), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1964.61553), (-1964.61553));
        SincFunction sincFunction0 = new SincFunction();
        double double0 = regulaFalsiSolver0.solve(715, ((UnivariateRealFunction) (sincFunction0)), 782.6168, 2532.54178378, (-1964.61553));
        Assert.assertEquals((-1964.61553), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2287.0794518133694, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(3437, ((UnivariateRealFunction) (sincFunction0)), (-3860.0), (-1928.3950191653707), allowedSolution0);
        Assert.assertEquals((-2894.1975095826856), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3474.601474870311), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-202.4826233423), (-202.4826233423));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = illinoisSolver0.solve(4589, ((UnivariateRealFunction) (quinticFunction0)), (-442.71519), ((double) (4589)), (-654.395160462));
        Assert.assertEquals((-654.395160462), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1047.12713), (-1047.12713), 2320.207);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = regulaFalsiSolver0.solve(40, univariateRealFunction0, (-1047.12713), 2320.207, allowedSolution0);
        Assert.assertEquals(636.539935, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1047.12713), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test37() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-1568.654));
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        illinoisSolver0.solve(4959, ((UnivariateRealFunction) (expm1Function0)), 1.5, 0.0, allowedSolution0);
    }
}

