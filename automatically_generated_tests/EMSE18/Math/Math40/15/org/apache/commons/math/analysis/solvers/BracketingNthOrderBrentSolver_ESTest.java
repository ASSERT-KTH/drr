

package org.apache.commons.math.analysis.solvers;

import org.junit.Assert;
import org.apache.commons.math.analysis.Expm1Function;
import org.apache.commons.math.analysis.MonitoredFunction;
import org.apache.commons.math.analysis.SinFunction;
import org.apache.commons.math.analysis.SincFunction;
import org.junit.Test;
import org.apache.commons.math.analysis.UnivariateFunction;
import org.apache.commons.math.analysis.XMinus5Function;

public class BracketingNthOrderBrentSolver_ESTest  {
    @Test(timeout = 4000)
    public void test08() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-0.0625), (-490.926013), 1.3585975011665141E-8, 1462);
        Expm1Function expm1Function0 = new Expm1Function();
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(1462, ((UnivariateFunction) (expm1Function0)), (-4090.954), 1.3585975011665141E-8, allowedSolution0);
        Assert.assertEquals(0.0, double0, 0.01);
        Assert.assertEquals(1462, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(87, ((UnivariateFunction) (sinFunction0)), 333.0088212867936, 897.8138174, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(336.15041418606506, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SincFunction sincFunction0 = new SincFunction();
        double double0 = bracketingNthOrderBrentSolver0.solve(46, ((UnivariateFunction) (sincFunction0)), ((double) (46)), 4843.471481991499);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(3930.132409640831, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.LEFT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(87, ((UnivariateFunction) (sinFunction0)), ((double) (87)), 2421.465242179113, allowedSolution0);
        Assert.assertEquals(1740.4423300887454, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ANY_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(87, ((UnivariateFunction) (sinFunction0)), (-1854.4), 2413.617891, allowedSolution0);
        Assert.assertEquals(333.0088212867936, double0, 0.01);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-41.080251711), (-41.080251711), ((double) (2770)), 2770);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(2770, ((UnivariateFunction) (xMinus5Function0)), (-41.080251711), ((double) (2770)), (-21.951354980716278), allowedSolution0);
        Assert.assertEquals(2770, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals((-21.951354980716278), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver((-41.080251711), 2779);
        XMinus5Function xMinus5Function0 = new XMinus5Function();
        double double0 = bracketingNthOrderBrentSolver0.solve(2779, ((UnivariateFunction) (xMinus5Function0)), 4.194022929828008E-9, 5.0);
        Assert.assertEquals(5.0, double0, 0.01);
        Assert.assertEquals(2779, bracketingNthOrderBrentSolver0.getMaximalOrder());
    }

    @Test(timeout = 4000)
    public void test18() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (sinFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5383, ((UnivariateFunction) (monitoredFunction0)), 0.0, ((double) (5383)), ((double) (2222)), allowedSolution0);
        Assert.assertEquals(2, monitoredFunction0.getCallsCount());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        Expm1Function expm1Function0 = new Expm1Function();
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        AllowedSolution allowedSolution0 = AllowedSolution.BELOW_SIDE;
        bracketingNthOrderBrentSolver0.solve(741, ((UnivariateFunction) (expm1Function0)), (-868.788237042736), 3233.470355, 0.0, allowedSolution0);
        double double0 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver(0.0, 3);
        int int0 = bracketingNthOrderBrentSolver0.getMaximalOrder();
        Assert.assertEquals(3, int0);
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(109, ((UnivariateFunction) (sinFunction0)), ((double) (109)), 2392.545964764044, allowedSolution0);
        Assert.assertEquals(5, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(1266.0618388473151, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        MonitoredFunction monitoredFunction0 = new MonitoredFunction(((UnivariateFunction) (sinFunction0)));
        AllowedSolution allowedSolution0 = AllowedSolution.RIGHT_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(5383, ((UnivariateFunction) (monitoredFunction0)), 735.9286508, ((double) (5383)), ((double) (2222)), allowedSolution0);
        Assert.assertEquals(15, monitoredFunction0.getCallsCount());
        Assert.assertEquals(1963.4954084936664, double0, 0.01);
    }

    //@Test(timeout = 4000)
    public void test25() throws Throwable {
        BracketingNthOrderBrentSolver bracketingNthOrderBrentSolver0 = new BracketingNthOrderBrentSolver();
        SinFunction sinFunction0 = new SinFunction();
        AllowedSolution allowedSolution0 = AllowedSolution.ABOVE_SIDE;
        double double0 = bracketingNthOrderBrentSolver0.solve(49, ((UnivariateFunction) (sinFunction0)), ((double) (49)), 2421.465242179113, allowedSolution0);
        Assert.assertEquals(2092.300708047387, double0, 0.01);
        double double1 = bracketingNthOrderBrentSolver0.doSolve();
        Assert.assertEquals(1963.4954084936664, bracketingNthOrderBrentSolver0.getMaximalOrder());
        Assert.assertEquals(2111.150263212341, double1, 0.01);
    }
}

