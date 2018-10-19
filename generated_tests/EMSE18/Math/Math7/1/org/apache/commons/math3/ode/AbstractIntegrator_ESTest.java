

package org.apache.commons.math3.ode;

import org.apache.commons.math3.ode.events.EventHandler;
import org.junit.Assert;
import org.apache.commons.math3.analysis.solvers.BrentSolver;
import org.apache.commons.math3.analysis.solvers.UnivariateSolver;
import org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegrator;
import org.apache.commons.math3.ode.nonstiff.DormandPrince54Integrator;
import org.junit.Test;
import org.apache.commons.math3.ode.nonstiff.DormandPrince853Integrator;
import org.apache.commons.math3.ode.sampling.DummyStepHandler;
import org.apache.commons.math3.ode.nonstiff.EulerIntegrator;
import org.apache.commons.math3.ode.nonstiff.GraggBulirschStoerIntegrator;
import org.apache.commons.math3.ode.nonstiff.MidpointIntegrator;
import org.apache.commons.math3.analysis.solvers.RegulaFalsiSolver;
import org.apache.commons.math3.ode.nonstiff.StepProblem;

public class AbstractIntegrator_ESTest  {
    @Test(timeout = 4000)
    public void test01() throws Throwable {
        StepProblem stepProblem0 = new StepProblem(((double) (Integer.MAX_VALUE)), (-3144.569257258), 1011.085459854);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double) (Integer.MAX_VALUE));
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.050833763855709E-193, ((double) (Integer.MAX_VALUE)), doubleArray0, doubleArray0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(((FirstOrderDifferentialEquations) (stepProblem0)));
        expandableStatefulODE0.setTime((-237.1));
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 223.7151963746576);
        graggBulirschStoerIntegrator0.integrate(((FirstOrderDifferentialEquations) (stepProblem0)), (-5132.18), doubleArray0, 2793.141426835221, doubleArray0);
        Assert.assertArrayEquals(new double[]{ 1.7021645644994344E13 }, doubleArray0, 0.01);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
        EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-237.1));
        StepProblem stepProblem0 = new StepProblem(((double) (Integer.MAX_VALUE)), (-3144.569257258), 1011.085459854);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(((FirstOrderDifferentialEquations) (stepProblem0)));
        expandableStatefulODE0.setTime((-739));
        eulerIntegrator0.integrate(expandableStatefulODE0, 2457.2);
        Assert.assertEquals(2457.2, expandableStatefulODE0.getTime(), 0.01);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
        EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-237.1));
        Assert.assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
        StepProblem stepProblem0 = new StepProblem(((double) (Integer.MAX_VALUE)), (-3144.569257258), 1011.085459854);
        double[] doubleArray0 = new double[1];
        double double0 = eulerIntegrator0.integrate(((FirstOrderDifferentialEquations) (stepProblem0)), 1203.23453694657, doubleArray0, ((double) (-739)), doubleArray0);
        Assert.assertArrayEquals(new double[]{ -4.170916906731377E12 }, doubleArray0, 0.01);
        Assert.assertEquals((-739.0), double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
        EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-3.081552929643174E-9));
        eulerIntegrator0.setMaxEvaluations(0);
        int int0 = eulerIntegrator0.getMaxEvaluations();
        Assert.assertEquals(0, int0);
        Assert.assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
        StepProblem stepProblem0 = new StepProblem(((double) (Integer.MAX_VALUE)), (-3144.569257258), 1011.085459854);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double) (Integer.MAX_VALUE));
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(296.0, 1274.1434998865652, doubleArray0, doubleArray0);
        ExpandableStatefulODE expandableStatefulODE0 = new ExpandableStatefulODE(((FirstOrderDifferentialEquations) (stepProblem0)));
        expandableStatefulODE0.setTime((-237.1));
        graggBulirschStoerIntegrator0.integrate(expandableStatefulODE0, 223.7151963746576);
        int int0 = graggBulirschStoerIntegrator0.getEvaluations();
        Assert.assertEquals(20, int0);
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
        double[] doubleArray0 = new double[7];
        DormandPrince853Integrator dormandPrince853Integrator0 = new DormandPrince853Integrator(0.0, 0.0, doubleArray0, doubleArray0);
        double double0 = dormandPrince853Integrator0.getCurrentSignedStepsize();
        Assert.assertEquals(0.0, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test14() throws Throwable {
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(Double.NaN, 0.0, 0.0, 0.0);
        graggBulirschStoerIntegrator0.setMaxEvaluations((-1));
        Assert.assertEquals(Double.NaN, graggBulirschStoerIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @Test(timeout = 4000)
    public void test15() throws Throwable {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
        DummyStepHandler dummyStepHandler0 = DummyStepHandler.getInstance();
        classicalRungeKuttaIntegrator0.addStepHandler(dummyStepHandler0);
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @Test(timeout = 4000)
    public void test16() throws Throwable {
        MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(223.7151963746576);
        midpointIntegrator0.clearEventHandlers();
        Assert.assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
    }

    @Test(timeout = 4000)
    public void test17() throws Throwable {
        EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-237.1));
        double[] doubleArray0 = new double[1];
        try {
            eulerIntegrator0.computeDerivatives(4.050833763855709E-193, doubleArray0, doubleArray0);
            Assert.fail("Expecting exception: NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test(timeout = 4000)
    public void test20() throws Throwable {
        BrentSolver brentSolver0 = new BrentSolver(0.0);
        EulerIntegrator eulerIntegrator0 = new EulerIntegrator(0.0);
        StepProblem stepProblem0 = new StepProblem((-1223.07075), 1831.046087, 0.0);
        eulerIntegrator0.addEventHandler(((EventHandler) (stepProblem0)), 2.2737367544323206E-10, (-1223.07075), 952, ((UnivariateSolver) (brentSolver0)));
        eulerIntegrator0.getEventHandlers();
        Assert.assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, eulerIntegrator0.getCurrentStepStart(), 0.01);
    }

    @Test(timeout = 4000)
    public void test21() throws Throwable {
        DormandPrince54Integrator dormandPrince54Integrator0 = new DormandPrince54Integrator(140.0, 140.0, (-829.86), (-829.86));
        String string0 = dormandPrince54Integrator0.getName();
        Assert.assertEquals("Dormand-Prince 5(4)", string0);
    }

    @Test(timeout = 4000)
    public void test22() throws Throwable {
        MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(223.71519637466);
        midpointIntegrator0.getStepHandlers();
        Assert.assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        Assert.assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @Test(timeout = 4000)
    public void test23() throws Throwable {
        EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-3.081552929643174E-9));
        double double0 = eulerIntegrator0.getCurrentStepStart();
        Assert.assertEquals(Double.NaN, eulerIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Double.NaN, double0, 0.01);
    }

    @Test(timeout = 4000)
    public void test24() throws Throwable {
        MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(223.7151963746576);
        int int0 = midpointIntegrator0.getMaxEvaluations();
        Assert.assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        Assert.assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
        Assert.assertEquals(Integer.MAX_VALUE, int0);
    }

    @Test(timeout = 4000)
    public void test25() throws Throwable {
        double[] doubleArray0 = new double[1];
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(296.0, 1274.1434998865652, doubleArray0, doubleArray0);
        int int0 = graggBulirschStoerIntegrator0.getEvaluations();
        Assert.assertEquals(0, int0);
    }

    @Test(timeout = 4000)
    public void test26() throws Throwable {
        ClassicalRungeKuttaIntegrator classicalRungeKuttaIntegrator0 = new ClassicalRungeKuttaIntegrator(0.0);
        double double0 = classicalRungeKuttaIntegrator0.getCurrentSignedStepsize();
        Assert.assertEquals(Double.NaN, double0, 0.01);
        Assert.assertEquals(Double.NaN, classicalRungeKuttaIntegrator0.getCurrentStepStart(), 0.01);
    }

    @Test(timeout = 4000)
    public void test27() throws Throwable {
        MidpointIntegrator midpointIntegrator0 = new MidpointIntegrator(223.7151963746576);
        midpointIntegrator0.clearStepHandlers();
        Assert.assertEquals(Double.NaN, midpointIntegrator0.getCurrentStepStart(), 0.01);
        Assert.assertEquals(Double.NaN, midpointIntegrator0.getCurrentSignedStepsize(), 0.01);
    }

    @Test(timeout = 4000)
    public void test28() throws Throwable {
        EulerIntegrator eulerIntegrator0 = new EulerIntegrator((-237.1));
        StepProblem stepProblem0 = new StepProblem(((double) (Integer.MAX_VALUE)), (-3144.569257258), 1011.085459854);
        double[] doubleArray0 = new double[1];
        eulerIntegrator0.integrate(((FirstOrderDifferentialEquations) (stepProblem0)), (-3144.569257258), doubleArray0, 761.1406075203889, doubleArray0);
        eulerIntegrator0.computeDerivatives(4.050833763855709E-193, doubleArray0, doubleArray0);
        Assert.assertEquals("Euler", eulerIntegrator0.getName());
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        StepProblem stepProblem0 = new StepProblem(((double) (Integer.MAX_VALUE)), (-3144.569257258), 1011.085459854);
        double[] doubleArray0 = new double[1];
        doubleArray0[0] = ((double) (Integer.MAX_VALUE));
        GraggBulirschStoerIntegrator graggBulirschStoerIntegrator0 = new GraggBulirschStoerIntegrator(4.050833763855709E-193, ((double) (Integer.MAX_VALUE)), doubleArray0, doubleArray0);
        RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(761.1406075203889, 3896.951960737746);
        graggBulirschStoerIntegrator0.addEventHandler(((EventHandler) (stepProblem0)), 761.1406075203889, 3896.951960737746, 10, ((UnivariateSolver) (regulaFalsiSolver0)));
        graggBulirschStoerIntegrator0.addEventHandler(((EventHandler) (stepProblem0)), (-237.1), ((double) (-739)), Integer.MAX_VALUE);
        graggBulirschStoerIntegrator0.integrate(((FirstOrderDifferentialEquations) (stepProblem0)), (-5132.18), doubleArray0, 2793.141426835221, doubleArray0);
        Assert.assertArrayEquals(new double[]{ 1.31947095978634E13}, doubleArray0, 0.01);
    }
}

