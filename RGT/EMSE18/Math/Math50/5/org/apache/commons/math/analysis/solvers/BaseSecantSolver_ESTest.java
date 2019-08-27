

package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.Expm1Function;
import org.junit.Assert;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.QuinticFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateRealFunction;
import org.apache.commons.math.analysis.XMinus5Function;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.valueOf;
import static org.apache.commons.math.analysis.solvers.BaseSecantSolver.Method.values;

public class BaseSecantSolver_ESTest  {
    @Test(timeout = 4000)
    public void test00() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = regulaFalsiSolver0.solve(255, ((UnivariateRealFunction) (quinticFunction0)), 1.0, ((double) (255)), ((double) (255)));
        Assert.assertEquals(255.0, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals(1.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1738, ((UnivariateRealFunction) (quinticFunction0)), 0.0, ((double) (1738)), allowedSolution0);
        Assert.assertEquals(869.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0, 0.625);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1177, univariateRealFunction0, (-269.289002721308), (-2282.0042700474), (-679.493015), allowedSolution0);
        Assert.assertEquals((-679.493015), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2282.0042700474), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = regulaFalsiSolver0.solve(255, ((UnivariateRealFunction) (quinticFunction0)), 0.0, (-1693.568099732), 3763.85634);
        Assert.assertEquals((-1693.568099732), regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1023, ((UnivariateRealFunction) (sinFunction0)), ((double) (1023)), 2898.35, ((double) (1023)), allowedSolution0);
        Assert.assertEquals(1023.0, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2569.8227906364505, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1023, ((UnivariateRealFunction) (sinFunction0)), ((double) (1023)), 2898.3496680270728, 223.45574354738, allowedSolution0);
        Assert.assertEquals(223.45574354738, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1941.5042599184924, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 795.36193);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1496, univariateRealFunction0, 2.0, 1377.14, allowedSolution0);
        Assert.assertEquals(689.57, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1371.6155767220234, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        pegasusSolver0.setup(137, sinFunction0, 137, 4456.36185, 6.881225132664271);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(980.1769079200158, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(737.3895065, 11.263728146946836, 11.263728146946836);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(univariateRealFunction0);
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(828, ((UnivariateRealFunction) (monitoredFunction0)), (-1561.16473), ((double) (828)), allowedSolution0);
        Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        Assert.assertEquals(440.9708032893344, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((UnivariateRealFunction) (sinFunction0)), (-944.78653208), 3.0, allowedSolution0);
        Assert.assertEquals((-470.89326604), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-728.849495632832), double0, 0.01);
    }

    //@Test(timeout = 4000)
    public void test26() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((UnivariateRealFunction) (sinFunction0)), (-944.78653208), 3.0, allowedSolution0);
        Assert.assertEquals(3.0, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-728.8494954988815), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(737.3895065, 11.263728146946836, 11.263728146946836);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((UnivariateRealFunction) (sinFunction0)), (-944.78653208), 0.5, allowedSolution0);
        Assert.assertEquals((-472.14326604), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-371.1897210115454), double0, 0.01);
    }

    //@Test(timeout = 4000)
    public void test28() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((UnivariateRealFunction) (sinFunction0)), (-944.78653208), 3.0, allowedSolution0);
        Assert.assertEquals((-470.89326604), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-728.8494954988815), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672151, ((UnivariateRealFunction) (sinFunction0)), (-944.78653208), 0.5, allowedSolution0);
        Assert.assertEquals((-472.14326604), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-18.84955592153876), double0, 0.01);
    }

    //@Test(timeout = 4000)
    public void test30() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(2143672144, ((UnivariateRealFunction) (sinFunction0)), (-944.78653208), 0.5, allowedSolution0);
        Assert.assertEquals(0.5, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-18.849556921538756), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-0.5), (-0.5), 0.7076665202829873);
        SincFunction sincFunction0 = new SincFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateRealFunction) (sincFunction0)));
        double double0 = illinoisSolver0.solve(133, ((UnivariateRealFunction) (monitoredFunction0)), (-1492.5547339578), 0.5718793159141403, (-0.5));
        Assert.assertEquals(5, monitoredFunction0.getCallsCount());
        Assert.assertEquals((-1492.2442085397374), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1023, ((UnivariateRealFunction) (sinFunction0)), ((double) (1023)), 2898.3496680270728, 0.5, allowedSolution0);
        Assert.assertEquals(0.5, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1941.5042599184924, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(335791812, ((UnivariateRealFunction) (xMinus5Function0)), (-1858.6603836805948), 1690.069354358639, (-1858.6603836805948));
        Assert.assertEquals((-1858.6603836805948), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-959.63001407586), 0.5);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(15, ((UnivariateRealFunction) (expm1Function0)), (-959.63001407586), 0.0, 0.0, allowedSolution0);
        Assert.assertEquals((-959.63001407586), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        pegasusSolver0.setup(2887, sinFunction0, 0.0, 0.0, 0.0);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    //@Test(timeout = 4000)
    public void test37() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        regulaFalsiSolver0.solve(2143672151, ((UnivariateRealFunction) (sinFunction0)), (-944.78653208), 0.5, allowedSolution0);
        regulaFalsiSolver0.doSolve();
    }
}

