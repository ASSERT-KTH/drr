

package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.exception.TooManyEvaluationsException;
import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
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
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = pegasusSolver0.solve(112, univariateRealFunction0, ((double) (183)), (-982.6));
        Assert.assertEquals(183.0, pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals((-982.6), double0, 0.01);
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
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.073741824E9, 0.0);
        double double0 = regulaFalsiSolver0.solve(6, ((UnivariateRealFunction) (sinFunction0)), 0.0, ((double) (-1986005976)), allowedSolution0);
        Assert.assertEquals((-9.93002988E8), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-140.169969772));
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(3735, ((UnivariateRealFunction) (sincFunction0)), (-1518.7978), (-140.169969772), 55.2, allowedSolution0);
        Assert.assertEquals(55.2, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1485.9733251479722), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1552.619));
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = regulaFalsiSolver0.solve(12, ((UnivariateRealFunction) (xMinus5Function0)), 0.0, 2776.60104019, (-1088.51951074046));
        Assert.assertEquals((-1088.51951074046), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(6.123233995736766E-17, 6.123233995736766E-17);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        double double0 = regulaFalsiSolver0.solve(1024, univariateRealFunction0, (-2009.141522629), (-2009.141522629), (-2009.141522629));
        Assert.assertEquals((-2009.141522629), regulaFalsiSolver0.getMin(), 0.01);
        Assert.assertEquals((-2009.141522629), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-366.678476072));
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(728199437, ((UnivariateRealFunction) (sinFunction0)), 712.776576621, ((double) (728199437)), allowedSolution0);
        Assert.assertEquals(3.641000748882883E8, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(7.216139962029771E8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-366.678476072));
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(728199437, ((UnivariateRealFunction) (sinFunction0)), 712.776576621, ((double) (728199437)), allowedSolution0);
        Assert.assertEquals(3.641000748882883E8, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(7.216139962029772E8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.073741824E9);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(6, ((UnivariateRealFunction) (sinFunction0)), 1.0E-6, ((double) (6)), (-211.0), allowedSolution0);
        Assert.assertEquals((-211.0), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2.247331685367726E-5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = pegasusSolver0.solve(742, univariateRealFunction0, 0.0, 253.76472374654452);
        Assert.assertEquals(126.88236187327226, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(202.63272615654168, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-366.678476072));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(728199437, univariateRealFunction0, 712.776576621, ((double) (728199437)), allowedSolution0);
        Assert.assertEquals(3.641000748882883E8, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(7.281988639402919E8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-0.09489056177858377));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(3735, ((UnivariateRealFunction) (quinticFunction0)), (-0.09489056177858377), ((double) (3735)), allowedSolution0);
        Assert.assertEquals(1867.4525547191106, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1.504632769052528E-36, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1060.2559180271674, 1060.2559180271674, 1060.2559180271674);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = pegasusSolver0.solve(14, ((UnivariateRealFunction) (sincFunction0)), (-6.032174644509064E-23), 1060.2559180271674, allowedSolution0);
        Assert.assertEquals(530.1279590135837, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-6.032174644509064E-23), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-366.678476072));
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(728199423, ((UnivariateRealFunction) (sincFunction0)), 712.776576621, ((double) (728199423)), allowedSolution0);
        Assert.assertEquals(3.641000678882883E8, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(7.28198259183706E8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-366.678476072));
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(728199437, ((UnivariateRealFunction) (sincFunction0)), 712.776576621, ((double) (728199437)), allowedSolution0);
        Assert.assertEquals(3.641000748882883E8, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(7.281935028124294E8, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(3735, ((UnivariateRealFunction) (quinticFunction0)), (-0.09489056177858377), 1930.746, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(965.3255547191108, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(6.008405587225413E-10, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver((-366.678476072));
        SincFunction sincFunction0 = new SincFunction();
        double double0 = pegasusSolver0.solve(728199403, ((UnivariateRealFunction) (sincFunction0)), 712.776576621, 1418.574);
        Assert.assertEquals(1065.6752883105, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1372.8759896187396, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SinFunction sinFunction0 = new SinFunction();
            AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
            double double0 = regulaFalsiSolver0.solve(9587, ((UnivariateRealFunction) (sinFunction0)), (-936.9230718701311), 0.008333333333329196, allowedSolution0);
            Assert.assertEquals((-468.4573692683989), regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals((-622.0353454107791), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        illinoisSolver0.solve(3735, ((UnivariateRealFunction) (quinticFunction0)), (-0.09489056177858377), 1930.746, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(965.3255547191108, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-8.965758960673982E-20), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(4.062448741381501E-29, (-1.866852726275606E-6), (-1.866852726275606E-6));
        SinFunction sinFunction0 = new SinFunction();
        pegasusSolver0.solve(233, ((UnivariateRealFunction) (sinFunction0)), (-1.866852726275606E-6), 1.0E-6);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = illinoisSolver0.solve(3735, ((UnivariateRealFunction) (quinticFunction0)), (-2605.6139566297), 0.0, (-1252.2717170339));
        Assert.assertEquals((-2605.6139566297), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(1.073741824E9);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(6, ((UnivariateRealFunction) (sinFunction0)), 1.0E-6, ((double) (6)), (-211.0), allowedSolution0);
        Assert.assertEquals(1.0E-6, illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals(2.247331685367726E-5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, 0.0);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        illinoisSolver0.solve(1451, univariateRealFunction0, 0.0, 0.0, 768.1562722, allowedSolution0);
        Assert.assertEquals(768.1562722, illinoisSolver0.getStartValue(), 0.01);
    }
}

