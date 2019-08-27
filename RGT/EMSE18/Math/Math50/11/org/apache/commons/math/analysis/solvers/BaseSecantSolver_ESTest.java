

package org.apache.commons.math.analysis.solvers;

import org.apache.commons.math.analysis.SinFunction;
import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
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
        PegasusSolver pegasusSolver0 = new PegasusSolver(2879.0, 2879.0, 2879.0);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(5, ((UnivariateRealFunction) (xMinus5Function0)), 0.0, ((double) (5)), 2879.0, allowedSolution0);
        Assert.assertEquals(2879.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(2, ((UnivariateRealFunction) (quinticFunction0)), (-1.0), 0.9887046181866692, 0.0, allowedSolution0);
        Assert.assertEquals(0.9887046181866692, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        BaseSecantSolver.Method.valueOf("ILLINOIS");
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(1500, ((UnivariateRealFunction) (quinticFunction0)), 0.0, ((double) (1500)), allowedSolution0);
        Assert.assertEquals(1500.0, pegasusSolver0.getMax(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0);
        SinFunction sinFunction0 = new SinFunction();
        pegasusSolver0.solve(1347, ((UnivariateRealFunction) (sinFunction0)), 0.0, 0.0, ((double) (1347)));
        Assert.assertEquals(1347.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.04168701738764507, (-215.19881103898527));
        double double0 = illinoisSolver0.solve(1120, univariateRealFunction0, (-215.19881103898527), ((double) (1120)), 0.04168701738764507);
        Assert.assertEquals(0.04168701738764507, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-201.20006859653813), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.04168701738764507, (-188.16375258098));
        double double0 = illinoisSolver0.solve(158, univariateRealFunction0, (-2988.99), 1597.0, allowedSolution0);
        Assert.assertEquals(1597.0, illinoisSolver0.getMax(), 0.01);
        Assert.assertEquals((-2965.172117564688), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.04168701738764507, 0.04168701738764507);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(19, univariateRealFunction0, (-645.13), 0.04168701738764507, 0.04168701738764507, allowedSolution0);
        Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-542.4481468558039), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.04168701738764507, (-1397.60527512), (-1397.60527512));
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        regulaFalsiSolver0.solve(33, ((UnivariateRealFunction) (sincFunction0)), (-645.1265), 0.04168701738764507, (-258.0), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-644.0264934488041), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.04168701738764507, 0.04168701738764507);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(19, univariateRealFunction0, (-645.1265), 0.04168701738764507, (-258.0), allowedSolution0);
        Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-215.82494636290147), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.04168701738764507, (-1397.60527512));
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(19, univariateRealFunction0, (-645.1265), 0.04168701738764507, (-263.8839140741336), allowedSolution0);
        Assert.assertEquals((-263.8839140741336), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-206.84913592871908), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SinFunction sinFunction0 = new SinFunction();
            UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
            AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
            double double0 = regulaFalsiSolver0.solve(19, univariateRealFunction0, (-645.13), 0.04168701738764507, (-258.0), allowedSolution0);
            Assert.assertEquals((-258.0), regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals((-535.6415474370598), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.04168701738764507, (-1397.60527512));
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(19, univariateRealFunction0, (-644.4815274198834), 0.04168701738764507, (-258.0), allowedSolution0);
        Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-386.31137510971985), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver((-1397.60527512), 0.04168701738764507, 0.04168701738764507);
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(19, univariateRealFunction0, (-645.1265), 0.04168701738764507, (-258.0), allowedSolution0);
        Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals((-215.19881103898527), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(19, ((UnivariateRealFunction) (expm1Function0)), (-645.13), 0.04168701738764507, (-258.0), allowedSolution0);
        Assert.assertEquals((-258.0), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-8.446086283904567E-16), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SinFunction sinFunction0 = new SinFunction();
            UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
            AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
            double double0 = regulaFalsiSolver0.solve(33, univariateRealFunction0, (-645.1265), 0.04168701738764507, (-258.0), allowedSolution0);
            Assert.assertEquals((-258.0), regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals((-215.1990966508543), double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(2132477166, ((UnivariateRealFunction) (sincFunction0)), 0.0, 3.548439493963656, ((double) (2132477166)), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(3.548439493963656, regulaFalsiSolver0.getMax(), 0.01);
        Assert.assertEquals(3.141592653589793, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(33, ((UnivariateRealFunction) (sinFunction0)), (-1397.60527512), 0.04168701738764507, (-258.0), allowedSolution0);
        Assert.assertEquals((-258.0), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-6.283185307179586), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(19, univariateRealFunction0, (-645.1265), 0.04168701738764507, 0.04168701738764507, allowedSolution0);
        Assert.assertEquals(0.04168701738764507, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-215.19909677090084), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.0, 0.0);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(1110, ((UnivariateRealFunction) (sincFunction0)), 2.384185791015625E-7, ((double) (1110)), allowedSolution0);
        Assert.assertEquals(555.0000001192093, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(1108.982206717197, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        SinFunction sinFunction0 = new SinFunction();
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.04168701738764507, (-215.19881103898527));
        double double0 = illinoisSolver0.solve(1120, ((UnivariateRealFunction) (sinFunction0)), (-215.19881103898527), ((double) (1120)), 0.04168701738764507);
        Assert.assertEquals(0.04168701738764507, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(102.06506557216804, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = pegasusSolver0.solve(3066, ((UnivariateRealFunction) (xMinus5Function0)), 0.0, ((double) (3066)), 2879.0, allowedSolution0);
        Assert.assertEquals(2879.0, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(5.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test35() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(34.27832879899225, 0.0, 394.83672908);
        Expm1Function expm1Function0 = new Expm1Function();
        regulaFalsiSolver0.setup(2, expm1Function0, 2, 0.0, 0.79791350617846);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.0, (-1750.4096633595605));
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = illinoisSolver0.solve(3, univariateRealFunction0, 0.0, 0.0, 0.0, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
    }
}

