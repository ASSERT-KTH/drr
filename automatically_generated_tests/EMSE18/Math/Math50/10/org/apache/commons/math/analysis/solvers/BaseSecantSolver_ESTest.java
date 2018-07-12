

package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.MonitoredFunction;
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
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(2, ((UnivariateRealFunction) (monitoredFunction0)), 0.0, (-1232.28634), allowedSolution0);
        Assert.assertEquals((-1232.28634), pegasusSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.17496926661752185);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (quinticFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(275, ((UnivariateRealFunction) (monitoredFunction0)), (-1.0), 0.17496926661752185, (-1.0), allowedSolution0);
        Assert.assertEquals((-1.0), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(165.03601, 0.99);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        double double0 = pegasusSolver0.solve(1023, ((UnivariateRealFunction) (monitoredFunction0)), ((double) (1023)), 0.0, 0.0);
        Assert.assertEquals(1023.0, pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-1.0), (-2863.67825671518));
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = pegasusSolver0.solve(398, univariateRealFunction0, 0.0, (-2863.67825671518), 0.5);
        Assert.assertEquals(0.5, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2863.67825671518), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        illinoisSolver0.setup(367, quinticFunction0, 1.0E-6, 0.0, 367);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        illinoisSolver0.setup(367, quinticFunction0, 1.0E-6, (-1.0), 367);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.42999842671, 2265.42999842671);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((UnivariateRealFunction) (quinticFunction0)), 0.75, 1372.3588667886, 1.0E-6, allowedSolution0);
        Assert.assertEquals(1372.3588667886, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.42999842671, 2265.42999842671);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((UnivariateRealFunction) (sincFunction0)), (-1261.5704389), ((double) (14)), allowedSolution0);
        Assert.assertEquals((-623.78521945), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1247.7791049070356), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(9, ((UnivariateRealFunction) (sincFunction0)), (-1261.5704389), ((double) (9)), allowedSolution0);
        Assert.assertEquals(9.0, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-1240.467552804072), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(3, ((UnivariateRealFunction) (sincFunction0)), (-1261.5704389), ((double) (3)), allowedSolution0);
        Assert.assertEquals((-629.28521945), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1241.1158876473717), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0E-6, 1.0E-6);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(2930, ((UnivariateRealFunction) (sincFunction0)), (-4139.855530522), (-1736.2), allowedSolution0);
        Assert.assertEquals((-2938.027765261), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-3226.4156476147914), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177);
        SincFunction sincFunction0 = new SincFunction();
        double double0 = regulaFalsiSolver0.solve(911, ((UnivariateRealFunction) (sincFunction0)), 2.0361168711330653E-10, 1350.5, 1350.5);
        Assert.assertEquals(1350.5, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1350.1246925164533, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177, 2265.82177, 2265.82177);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((UnivariateRealFunction) (sincFunction0)), 1.3105776597833636, 2265.82177, allowedSolution0);
        Assert.assertEquals(1133.5661738298916, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2265.82177, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((UnivariateRealFunction) (sincFunction0)), (-1261.5704389), ((double) (14)), allowedSolution0);
        Assert.assertEquals(14.0, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-1247.2122834751478), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177, 2265.82177, 2265.82177);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(14, ((UnivariateRealFunction) (sincFunction0)), (-1261.5704389), 0.5, allowedSolution0);
        Assert.assertEquals(0.5, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-1260.5533035658682), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.0E-6, 1.0E-6, 1.0E-6);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(2930, ((UnivariateRealFunction) (sincFunction0)), (-4139.855530522), (-1736.2), allowedSolution0);
        Assert.assertEquals((-1736.2), illinoisSolver0.getMax(), 0.01);
        Assert.assertEquals((-1737.3007352398367), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(2265.82177, 2265.82177, 2265.82177);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2065, ((UnivariateRealFunction) (sinFunction0)), (-0.3058015757857271), ((double) (14)), allowedSolution0);
        Assert.assertEquals(14.0, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-0.3058015757857271), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        double double0 = regulaFalsiSolver0.solve(911, ((UnivariateRealFunction) (sincFunction0)), 2.0361168711330653E-10, 1350.5, 1350.5);
        Assert.assertEquals(1350.5, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1347.743248390022, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SincFunction sincFunction0 = new SincFunction();
            AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
            double double0 = regulaFalsiSolver0.solve(14, ((UnivariateRealFunction) (sincFunction0)), (-1261.5704389), 1.2843, allowedSolution0);
            Assert.assertEquals((-630.14306945), regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals((-1259.778653425739), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        illinoisSolver0.solve(3266, ((UnivariateRealFunction) (sincFunction0)), (-2627.3423302), 745.2127335776034, 745.2127335776034, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(745.2127335776034, illinoisSolver0.getMax(), 0.01);
        Assert.assertEquals(744.5574589007812, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(437.219);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(77, ((UnivariateRealFunction) (xMinus5Function0)), (-2590.143), ((double) (77)));
        Assert.assertEquals((-1256.5715), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, (-1069.785));
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(372, ((UnivariateRealFunction) (sinFunction0)), (-1069.785), 0.0, (-507.1911582), allowedSolution0);
        Assert.assertEquals((-1069.785), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }
}

