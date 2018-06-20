

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
    public void test00() throws Throwable {
        BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1703.960853758905, 1703.960853758905);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(536, univariateRealFunction0, 0.0, (-999.7880896), allowedSolution0);
        Assert.assertEquals((-499.8940448), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3311.57), 5825.9774718, 5825.9774718);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = regulaFalsiSolver0.solve(1275, univariateRealFunction0, (-1.5663058908232807E-9), (-3311.57), ((double) (1275)));
        Assert.assertEquals(1275.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1.5663058908232807E-9), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        illinoisSolver0.solve(355926629, ((UnivariateRealFunction) (xMinus5Function0)), (-1.6160554529051658), ((double) (355926629)), (-3639.25));
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals((-1.6160554529051658), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, (-2252.989673011949));
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        regulaFalsiSolver0.solve(2667, univariateRealFunction0, (-2026.2), (-2026.2), 1832.25117565, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(1832.25117565, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2026.2), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1703.960853758905, 1703.960853758905);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(947, ((UnivariateRealFunction) (sincFunction0)), 0.0, ((double) (947)), Double.POSITIVE_INFINITY, allowedSolution0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3311.57), 5825.9774718, (-1.0));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(64, univariateRealFunction0, (-3311.57), ((double) (64)), (-1.0), allowedSolution0);
        Assert.assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3155.7109259753047), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(11, ((UnivariateRealFunction) (sincFunction0)), 1.0E-6, ((double) (11)), 1.0, allowedSolution0);
        Assert.assertEquals(1.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(9.424777960803848, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(2835.98629611358, 2835.98629611358);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1541, univariateRealFunction0, 0.2, 1011.774877600609, allowedSolution0);
        Assert.assertEquals(0.2, illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(997.1827749982031, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(2822.382646661114);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1541, ((UnivariateRealFunction) (sincFunction0)), 0.32136587294519264, 1010.6857778398078, allowedSolution0);
        Assert.assertEquals(0.32136587294519264, illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(0.32136587294519264, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-168.8741791), (-168.8741791));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(64, univariateRealFunction0, (-3311.57), ((double) (64)), (-168.8741791), allowedSolution0);
        Assert.assertEquals((-168.8741791), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3152.5879106776492), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(11, ((UnivariateRealFunction) (sincFunction0)), (-4627.82057618162), 1.0E-6, allowedSolution0);
        Assert.assertEquals((-2313.9102875908097), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-4627.565978737765), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0));
            SincFunction sincFunction0 = new SincFunction();
            UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
            AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
            double double0 = regulaFalsiSolver0.solve(1654, univariateRealFunction0, (-1.0), 727.0034281189, ((double) (1654)), allowedSolution0);
            Assert.assertEquals(1654.0, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(724.1357256967385, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1.0), (-1.0));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(64, univariateRealFunction0, (-3311.57), ((double) (64)), (-1.0), allowedSolution0);
        Assert.assertEquals((-1.0), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3152.587910677649), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1541, univariateRealFunction0, 0.2, 1011.7536093908523, allowedSolution0);
        Assert.assertEquals(505.9768046954261, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1003.7378565462326, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = illinoisSolver0.solve(42, univariateRealFunction0, 0.0, ((double) (42)));
        Assert.assertEquals(21.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(32.98672286269283, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(11, ((UnivariateRealFunction) (sincFunction0)), (-4627.82057618162), 1.0E-6, allowedSolution0);
        Assert.assertEquals((-2313.9102875908097), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-4627.565978742891), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(((double) (947)));
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(4, univariateRealFunction0, (-999.7880896), (-22.094016100295452), 0.0, allowedSolution0);
        Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-984.2604338002133), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-168.8741791), (-168.8741791));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = regulaFalsiSolver0.solve(64, univariateRealFunction0, ((double) (64)), 1.0E-15);
        Assert.assertEquals(64.0, regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(1.0E-15, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1703.960853758905, 1703.960853758905);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        regulaFalsiSolver0.solve(947, univariateRealFunction0, 0.0, ((double) (947)), 0.0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(947.0, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1703.960853758905, 1703.960853758905);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = regulaFalsiSolver0.solve(947, ((UnivariateRealFunction) (sincFunction0)), 0.0, ((double) (947)), 0.0);
        Assert.assertEquals(946.0190479065085, double0, 0.01);
        Assert.assertEquals(0.0, regulaFalsiSolver0.getStartValue(), 0.01);
    }
}

