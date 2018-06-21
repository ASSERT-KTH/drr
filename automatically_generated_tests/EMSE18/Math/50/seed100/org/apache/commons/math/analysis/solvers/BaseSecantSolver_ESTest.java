

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
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(2.2250738585072014E-308, 1179.349670107828, 1179.349670107828);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((UnivariateRealFunction) (sinFunction0)), (-2025.0), 2.2250738585072014E-308, allowedSolution0);
        Assert.assertEquals((-1012.5), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-4.64054995133801E-305), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        BaseSecantSolver.Method.valueOf("PEGASUS");
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
        BaseSecantSolver.Method[] baseSecantSolver_MethodArray0 = BaseSecantSolver.Method.values();
        Assert.assertNotNull(baseSecantSolver_MethodArray0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(2004, ((UnivariateRealFunction) (expm1Function0)), 0.0, 3.9736429850260626E-8, allowedSolution0);
        Assert.assertEquals(1.9868214925130313E-8, pegasusSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        regulaFalsiSolver0.solve(2, ((UnivariateRealFunction) (expm1Function0)), 0.0, 0.0, ((double) (2)));
        Assert.assertEquals(2.0, regulaFalsiSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        pegasusSolver0.solve(2004, ((UnivariateRealFunction) (expm1Function0)), ((double) (2004)), 0.0, 0.0, allowedSolution0);
        double double0 = pegasusSolver0.doSolve();
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(0.0, pegasusSolver0.getStartValue(), 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.9995576540188896, 1179.349670107828, 1179.349670107828);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        illinoisSolver0.solve(1338009747, ((UnivariateRealFunction) (sinFunction0)), (-2024.3131929383615), 0.9995576540188896, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals((-1011.6568176421713), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-975.5981853960625), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test19() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(53, ((UnivariateRealFunction) (sinFunction0)), (-324.267413), 795.95, allowedSolution0);
        Assert.assertEquals(235.84129350000006, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-47.1238898038469), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.9995576540188896, 0.9995576540188896);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1338009720, ((UnivariateRealFunction) (sinFunction0)), (-2025.2444772291865), 0.9995576540188896, allowedSolution0);
        Assert.assertEquals((-1012.1224597875838), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-89.13457273434088), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.9995576540188896, 1183.9021556332796, 1183.9021556332796);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((UnivariateRealFunction) (sinFunction0)), (-2025.6560297837634), 0.9995576540188896, allowedSolution0);
        Assert.assertEquals((-1012.3282360648723), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.9995576540188896, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-54.33546125909403));
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((UnivariateRealFunction) (sinFunction0)), (-2025.0), (-54.33546125909403), allowedSolution0);
        Assert.assertEquals((-1039.667730629547), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-433.5397861953915), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-452.620282963));
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        SinFunction sinFunction0 = new SinFunction();
        UnivariateRealFunction univariateRealFunction0 = sinFunction0.derivative();
        double double0 = illinoisSolver0.solve(1338009763, univariateRealFunction0, (-2080.90740693), (-2025.0), (-1745.4), allowedSolution0);
        Assert.assertEquals((-1745.4), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2059.313984428109), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1691.35490895767, (-3715.10329));
        SincFunction sincFunction0 = new SincFunction();
        double double0 = pegasusSolver0.solve(2117803252, ((UnivariateRealFunction) (sincFunction0)), (-1113.51), 6.283185307179586, (-1113.51));
        Assert.assertEquals((-1113.51), pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(6.28318530713014, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver();
        SincFunction sincFunction0 = new SincFunction();
        UnivariateRealFunction univariateRealFunction0 = sincFunction0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = pegasusSolver0.solve(2801, univariateRealFunction0, (-0.3233370407462927), 386.4, allowedSolution0);
        Assert.assertEquals(193.03833147962686, pegasusSolver0.getStartValue(), 0.01);
        Assert.assertEquals(384.8425016050027, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.9995576540188896, 0.9995576540188896, 0.9995576540188896);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((UnivariateRealFunction) (sinFunction0)), (-2025.2444772291865), 0.9995576540188896, allowedSolution0);
        Assert.assertEquals((-1012.1224597875838), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-987.4275123798103), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.9995576540188896, 1178.5155964155442, 1178.5155964155442);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1338009788, ((UnivariateRealFunction) (sinFunction0)), (-2024.3131929383615), 0.9995576540188896, allowedSolution0);
        Assert.assertEquals((-1011.6568176421713), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-975.5981853960625), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.9995576540188896, 1178.5155964155442, 1178.5155964155442);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((UnivariateRealFunction) (sinFunction0)), (-1301.3931258150835), 0.9995576540188896, allowedSolution0);
        Assert.assertEquals((-650.1967840805323), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.9995576540188896, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test29() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.9995576540188896, 1178.5155964155442, 1178.5155964155442);
        SincFunction sincFunction0 = new SincFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = illinoisSolver0.solve(1338009747, ((UnivariateRealFunction) (sincFunction0)), (-2584.034636861273), 1178.5155964155442, (-2024.3131929383615), allowedSolution0);
        Assert.assertEquals((-2024.3131929383615), illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-2584.034636861273), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test30() throws Throwable {
        try {
            RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver();
            SincFunction sincFunction0 = new SincFunction();
            AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
            double double0 = regulaFalsiSolver0.solve(271, ((UnivariateRealFunction) (sincFunction0)), 41.0, ((double) (271)), allowedSolution0);
            Assert.assertEquals(41.0, regulaFalsiSolver0.getMin(), 0.01);
            Assert.assertEquals(106.81414922205298, double0, 0.01);
            org.junit.Assert.fail("Expecting exception: TooManyEvaluationsException");
        } catch (TooManyEvaluationsException expectedException__TooManyEvaluationsException) {
            org.junit.Assert.assertTrue(true);
        }
    }

    @Test(timeout = 4000)
    public void test31() throws Throwable {
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(0.0, 0.0, 0.0);
        Expm1Function expm1Function0 = new Expm1Function();
        UnivariateRealFunction univariateRealFunction0 = expm1Function0.derivative();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = regulaFalsiSolver0.solve(5, univariateRealFunction0, 0.0, (-971.619), allowedSolution0);
        Assert.assertEquals((-485.8095), regulaFalsiSolver0.getStartValue(), 0.01);
        Assert.assertEquals((-971.619), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test32() throws Throwable {
        PegasusSolver pegasusSolver0 = new PegasusSolver(1743.8158449, (-2568.0));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = pegasusSolver0.solve(2, ((UnivariateRealFunction) (quinticFunction0)), 0.5, 9.243863392686452E-8, (-108.86), allowedSolution0);
        Assert.assertEquals(0.5, pegasusSolver0.getMin(), 0.01);
        Assert.assertEquals(0.5, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test33() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver(0.9995576540188896, 1179.349670107828, 1179.349670107828);
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        illinoisSolver0.solve(1338009747, ((UnivariateRealFunction) (sinFunction0)), (-0.015354984424235399), 0.9995576540188896, allowedSolution0);
        double double0 = illinoisSolver0.doSolve();
        Assert.assertEquals(0.49210133479732715, illinoisSolver0.getStartValue(), 0.01);
        Assert.assertEquals(0.0028374098338689313, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test34() throws Throwable {
        IllinoisSolver illinoisSolver0 = new IllinoisSolver((-847.555058), (-847.555058));
        QuinticFunction quinticFunction0 = new QuinticFunction();
        double double0 = illinoisSolver0.solve(1756, ((UnivariateRealFunction) (quinticFunction0)), (-847.555058), 2934.707, ((double) (1756)));
        Assert.assertEquals(2934.707, illinoisSolver0.getMax(), 0.01);
        Assert.assertEquals((-1.0), double0, 0.01);
    }
}

