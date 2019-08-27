

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
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.125, 0.125);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1716, ((UnivariateRealFunction) (quinticFunction0)), (-1.035339851490575), 1889.0, (-1599.3895705), allowedSolution0);
        Assert.assertEquals((-1599.3895705), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
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
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        regulaFalsiSolver0.solve(773, ((UnivariateRealFunction) (expm1Function0)), 3583.889343486809, 0.0, allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals(1791.9446717434046, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 0.0);
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        regulaFalsiSolver0.solve(67, univariateRealFunction0, 2.96123507E-316, (-989.9395), (-989.9395), allowedSolution0);
        double double0 = regulaFalsiSolver0.doSolve();
        Assert.assertEquals((-989.9395), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(2.96123507E-316, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-3489.012069923239), 2147.78481309, 0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        illinoisSolver0.solve(4156, ((UnivariateRealFunction) (expm1Function0)), (-2661.076757), 5.23774898406112E-309, (-3489.012069923239), allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals((-3489.012069923239), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2661.076757), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.125, 0.125);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1716, ((UnivariateRealFunction) (quinticFunction0)), (-0.4741591316148197), 1889.0, (-1599.3895705), allowedSolution0);
        Assert.assertEquals((-1599.3895705), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.007640381114796577, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(31.320818690948315, 31.320818690948315);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(199, ((UnivariateRealFunction) (sincFunction0)), (-2.356194490192345), 31.320818690948315, 31.320818690948315, allowedSolution0);
        Assert.assertEquals(31.320818690948315, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(30.98397974334872, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(31.320818690948315, 31.320818690948315);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(199, ((UnivariateRealFunction) (sincFunction0)), (-2.356194490192345), 31.320818690948315, 31.320818690948315, allowedSolution0);
        Assert.assertEquals(31.320818690948315, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(30.98397974334872, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SincFunction sincFunction0 = new SincFunction();
            AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
            double double0 = regulaFalsiSolver0.solve(199, ((UnivariateRealFunction) (sincFunction0)), (-2.356194490192345), ((double) (199)), ((double) (199)), allowedSolution0);
            Assert.assertEquals(199.0, regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(197.92033617615698, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(194, ((UnivariateRealFunction) (sincFunction0)), (-2.356194490192345), ((double) (194)), ((double) (194)), allowedSolution0);
        Assert.assertEquals(194.0, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(191.63715186894584, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        double double0 = illinoisSolver0.solve(30, ((UnivariateRealFunction) (sinFunction0)), (-2536.361), ((double) (30)), ((double) (30)));
        Assert.assertEquals((-2536.361), illinoisSolver0.getMin(), 0.01);
        Assert.assertEquals((-1448.2742133048946), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = regulaFalsiSolver0.solve(3160, ((UnivariateRealFunction) (expm1Function0)), (-584.2536753931414), 0.031, allowedSolution0);
        Assert.assertEquals((-292.11133769657073), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(3.5E-323, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(2015, ((UnivariateRealFunction) (sincFunction0)), (-2.356194490192345), 3974.6922, 3974.6922, allowedSolution0);
        Assert.assertEquals(3974.6922, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(3974.1147067911097, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0E-6, 1.0E-6, 1.0E-6);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(199, ((UnivariateRealFunction) (sincFunction0)), (-2.356194490192345), 3974.6922, 3974.6922, allowedSolution0);
        Assert.assertEquals(3974.6922, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(3974.1147067911097, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = regulaFalsiSolver0.solve(3160, ((UnivariateRealFunction) (expm1Function0)), (-559.8843111753359), 0.031, allowedSolution0);
        Assert.assertEquals((-279.926655587668), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2.616880796694137E-17), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = regulaFalsiSolver0.solve(199, ((UnivariateRealFunction) (sincFunction0)), (-2.356194490192345), 3974.6922, 3974.6922, allowedSolution0);
        Assert.assertEquals(3974.6922, regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals(3974.1147067911097, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(4156, ((UnivariateRealFunction) (expm1Function0)), (-2661.076757), 5.23774898406112E-309, (-3489.012069923239), allowedSolution0);
        Assert.assertEquals((-3489.012069923239), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-4.526133679786076E-154), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            Expm1Function expm1Function0 = new Expm1Function();
            AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
            double double0 = regulaFalsiSolver0.solve(3160, ((UnivariateRealFunction) (expm1Function0)), (-583.070316), 0.031, allowedSolution0);
            Assert.assertEquals((-291.51965800000005), regulaFalsiSolver0.getStartValue(), 0.01);
            Assert.assertEquals(8.9215087890625E-7, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.125, 0.125);
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(1716, ((UnivariateRealFunction) (quinticFunction0)), (-3.896299246239511E-298), 1889.0, (-1599.3895705), allowedSolution0);
        Assert.assertEquals((-1599.3895705), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(0.125, 0.125);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = pegasusSolver0.solve(1291, univariateRealFunction0, (-4.848465601082039E-10), (-4.503599627370496E15), allowedSolution0);
        Assert.assertEquals((-4.503599627370496E15), pegasusSolver0.getMax(), 0.01);
        Assert.assertEquals((-4.503599627370496E15), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0);
        SinFunction sinFunction0 = new SinFunction();
        double double0 = regulaFalsiSolver0.solve(1819, ((UnivariateRealFunction) (sinFunction0)), 0.0, ((double) (0)), 0.0);
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test36() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver();
        SinFunction sinFunction0 = new SinFunction();
        illinoisSolver0.solve(30, ((UnivariateRealFunction) (sinFunction0)), (-2758.27859548), ((double) (30)), ((double) (30)));
    }
}

