

package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.Expm1Function;
import org.junit.Assert;
import org.apache.commons.math.analysis.MonitoredFunction;
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
        BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((UnivariateRealFunction) (expm1Function0)), (-1135.4579017), 0.5, ((double) (767)), allowedSolution0);
        Assert.assertEquals(767.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-3054.5516920666505), 0.0);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        double double0 = regulaFalsiSolver0.solve(1794, univariateRealFunction0, 0.0, (-3371.0), 0.14982303977012634);
        Assert.assertEquals((-3371.0), regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1663.037919015956);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (quinticFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(362, ((UnivariateRealFunction) (monitoredFunction0)), 0.0, 0.0, allowedSolution0);
        illinoisSolver0.doSolve();
        Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        regulaFalsiSolver0.solve(2909, ((UnivariateRealFunction) (xMinus5Function0)), 0.5, 401.0, ((double) (2909)), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(2909.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(408.96000509);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(924, ((UnivariateRealFunction) (expm1Function0)), (-2577.906263788), 0.3333333333332802, 408.96000509, allowedSolution0);
        Assert.assertEquals(408.96000509, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-206.83981492055545), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(408.96000509);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((UnivariateRealFunction) (expm1Function0)), (-1135.4579017), 0.5, ((double) (767)), allowedSolution0);
        Assert.assertEquals(767.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-175.36686872392067), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(408.96000509);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((UnivariateRealFunction) (expm1Function0)), (-1135.4579017), 0.5, ((double) (767)), allowedSolution0);
        Assert.assertEquals(767.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(2025, ((UnivariateRealFunction) (expm1Function0)), (-5.3303841588318384E-14), 2.7553817452272217E-6, allowedSolution0);
        Assert.assertEquals(4.1761948595190557E-53, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-921.4));
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((UnivariateRealFunction) (expm1Function0)), (-1135.4579017), 0.5, ((double) (767)), allowedSolution0);
        Assert.assertEquals(767.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-6.422488831378098E-16), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(767, ((UnivariateRealFunction) (expm1Function0)), (-5.3303841588319804E-14), 1.0, allowedSolution0);
        Assert.assertEquals(1.0, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-6.780194531536821E-16), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2025, ((UnivariateRealFunction) (expm1Function0)), (-1777.9), 2.7553817452272217E-6, allowedSolution0);
        Assert.assertEquals((-888.9499986223092), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-6.750718358448926E-9), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(2025, ((UnivariateRealFunction) (expm1Function0)), (-1777.9), 2.7553817452272217E-6, allowedSolution0);
        Assert.assertEquals((-888.9499986223092), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-6.750718358448926E-9), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(716.79152421, 716.79152421, 716.79152421);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        double double0 = pegasusSolver0.solve(1636, ((UnivariateRealFunction) (monitoredFunction0)), 0.1716593258327805, ((double) (1636)), 0.1716593258327805);
        Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        Assert.assertEquals(946.4043933895443, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            Expm1Function expm1Function0 = new Expm1Function();
            AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
            double double0 = regulaFalsiSolver0.solve(767, ((UnivariateRealFunction) (expm1Function0)), (-8.221413583658807E-16), 0.5, 0.5, allowedSolution0);
            Assert.assertEquals(0.5, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(9.073524475097657E-7, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        illinoisSolver0.solve(8351723, ((UnivariateRealFunction) (sinFunction0)), (-1887.27), (-1190.93), 0.030589580535888672);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(0.030589580535888672, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1595.929068023615), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1.0E-6, 1.0E-14, 0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(2146930791, univariateRealFunction0, (-1.0), (-1290.393), 1.0E-14, allowedSolution0);
        Assert.assertEquals(1.0E-14, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1290.393), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = illinoisSolver0.solve(922, univariateRealFunction0, (-2566.45), 0.0, 0.0);
        Assert.assertEquals(0.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, illinoisSolver0.getMax(), 0.01);
        Assert.assertEquals((-2566.45), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(2025, ((UnivariateRealFunction) (expm1Function0)), (-5.3303841588318384E-14), 2.7553817452272217E-6, allowedSolution0);
    }
}

