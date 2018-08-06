import java.io.IOException; 
import java.io.RandomAccessFile;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    
static boolean flag__lxy=false;
static public void printRuntimeMSG (String printMSG)
{
if(flag__lxy)return;
flag__lxy=true;
	try {
	RandomAccessFile randomFile = new RandomAccessFile("/Users/sophie/Documents/xiongyingfei/DefectRepairing/tool/source/tmp_aChart1Patch1get_randoop_coverage", "rw");
	long fileLength = randomFile.length();
	randomFile.seek(fileLength);
	randomFile.writeBytes(printMSG+"\n");
	randomFile.close();
	} catch (IOException e__e__e) {
	e__e__e.printStackTrace();

	}
flag__lxy=false;
}
public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
printRuntimeMSG("---RegressionTest0:test001");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.jfree.chart.plot.Plot plot0 = null;
        try {
            org.jfree.chart.event.PlotChangeEvent plotChangeEvent1 = new org.jfree.chart.event.PlotChangeEvent(plot0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null source");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
printRuntimeMSG("---RegressionTest0:test002");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE5;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test003() throws Throwable {
printRuntimeMSG("---RegressionTest0:test003");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = java.awt.Transparency.OPAQUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test004() throws Throwable {
printRuntimeMSG("---RegressionTest0:test004");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = java.awt.Transparency.BITMASK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test005() throws Throwable {
printRuntimeMSG("---RegressionTest0:test005");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.CENTER_RIGHT;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test006() throws Throwable {
printRuntimeMSG("---RegressionTest0:test006");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.awt.Shape shape0 = null;
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        try {
            org.jfree.chart.entity.CategoryItemEntity categoryItemEntity6 = new org.jfree.chart.entity.CategoryItemEntity(shape0, "", "", categoryDataset3, (java.lang.Comparable) 10, (java.lang.Comparable) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'area' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
printRuntimeMSG("---RegressionTest0:test007");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int0 = org.jfree.chart.plot.Plot.MINIMUM_WIDTH_TO_DRAW;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test008() throws Throwable {
printRuntimeMSG("---RegressionTest0:test008");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        try {
            categoryPlot0.handleClick((-1), 10, plotRenderingInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
printRuntimeMSG("---RegressionTest0:test009");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE11;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test010() throws Throwable {
printRuntimeMSG("---RegressionTest0:test010");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_BACKGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test011() throws Throwable {
printRuntimeMSG("---RegressionTest0:test011");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Shape shape3 = null;
        try {
            renderAttributes0.setSeriesShape((int) (byte) -1, shape3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(paint1);
    }

    @Test
    public void test012() throws Throwable {
printRuntimeMSG("---RegressionTest0:test012");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        boolean boolean0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARKS_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test013() throws Throwable {
printRuntimeMSG("---RegressionTest0:test013");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int3 = java.awt.Color.HSBtoRGB((float) (byte) 0, 0.0f, (float) 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-16777216) + "'", int3 == (-16777216));
    }

    @Test
    public void test014() throws Throwable {
printRuntimeMSG("---RegressionTest0:test014");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Locale locale1 = null;
        java.lang.ClassLoader classLoader2 = null;
        try {
            java.util.ResourceBundle resourceBundle3 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("hi!", locale1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
printRuntimeMSG("---RegressionTest0:test015");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        try {
            categoryPlot0.addRangeMarker(marker6, layer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
    }

    @Test
    public void test016() throws Throwable {
printRuntimeMSG("---RegressionTest0:test016");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        try {
            rectangleInsets0.trim(rectangle2D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
    }

    @Test
    public void test017() throws Throwable {
printRuntimeMSG("---RegressionTest0:test017");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Locale locale1 = null;
        java.lang.ClassLoader classLoader2 = null;
        try {
            java.util.ResourceBundle resourceBundle3 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("TextAnchor.HALF_ASCENT_LEFT", locale1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
printRuntimeMSG("---RegressionTest0:test018");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.text.AttributedString attributedString0 = null;
        java.awt.Shape shape4 = null;
        java.awt.Paint paint5 = null;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        try {
            org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem(attributedString0, "hi!", "TextAnchor.HALF_ASCENT_LEFT", "TextAnchor.HALF_ASCENT_LEFT", shape4, paint5, stroke6, (java.awt.Paint) color7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'label' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test019() throws Throwable {
printRuntimeMSG("---RegressionTest0:test019");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.awt.Color color1 = null;
        try {
            org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator5 = new org.jfree.chart.util.DefaultShadowGenerator(10, color1, (float) (byte) 100, (int) (short) -1, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'color' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
printRuntimeMSG("---RegressionTest0:test020");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = null;
        try {
            org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer1 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'type' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
printRuntimeMSG("---RegressionTest0:test021");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        java.awt.geom.Rectangle2D rectangle2D2 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D5 = rectangleInsets0.createOutsetRectangle(rectangle2D2, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
    }

    @Test
    public void test022() throws Throwable {
printRuntimeMSG("---RegressionTest0:test022");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        try {
            categoryPlot0.setDomainAxisLocation((-1), axisLocation2, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
    }

    @Test
    public void test023() throws Throwable {
printRuntimeMSG("---RegressionTest0:test023");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.awt.Color color0 = java.awt.Color.BLUE;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test024() throws Throwable {
printRuntimeMSG("---RegressionTest0:test024");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test025() throws Throwable {
printRuntimeMSG("---RegressionTest0:test025");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.awt.Paint paint0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test026() throws Throwable {
printRuntimeMSG("---RegressionTest0:test026");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Shape shape1 = null;
        try {
            renderAttributes0.setDefaultShape(shape1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
printRuntimeMSG("---RegressionTest0:test027");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.awt.Color color0 = java.awt.Color.WHITE;
        org.jfree.data.general.Dataset dataset1 = null;
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo2 = null;
        try {
            org.jfree.data.event.DatasetChangeEvent datasetChangeEvent3 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) color0, dataset1, datasetChangeInfo2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'info' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test028() throws Throwable {
printRuntimeMSG("---RegressionTest0:test028");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        java.awt.Paint paint6 = null;
        try {
            categoryPlot0.setRangeGridlinePaint(paint6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test029() throws Throwable {
printRuntimeMSG("---RegressionTest0:test029");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Double double0 = org.jfree.chart.renderer.AbstractRenderer.ZERO;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0.equals(0.0d));
    }

    @Test
    public void test030() throws Throwable {
printRuntimeMSG("---RegressionTest0:test030");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.awt.Shape shape0 = null;
        try {
            org.jfree.chart.entity.ChartEntity chartEntity3 = new org.jfree.chart.entity.ChartEntity(shape0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'area' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test031() throws Throwable {
printRuntimeMSG("---RegressionTest0:test031");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.awt.Shape shape3 = null;
        try {
            lineAndShapeRenderer2.setBaseShape(shape3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'shape' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
printRuntimeMSG("---RegressionTest0:test032");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE1;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test033() throws Throwable {
printRuntimeMSG("---RegressionTest0:test033");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE9;
        java.lang.String str1 = itemLabelAnchor0.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ItemLabelAnchor.OUTSIDE9" + "'", str1.equals("ItemLabelAnchor.OUTSIDE9"));
    }

    @Test
    public void test034() throws Throwable {
printRuntimeMSG("---RegressionTest0:test034");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE9;
        java.awt.Paint paint1 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray2 = new java.awt.Paint[] { paint1 };
        java.awt.Color color3 = java.awt.Color.BLUE;
        java.awt.Color color4 = java.awt.Color.RED;
        java.awt.Paint paint5 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray6 = new java.awt.Paint[] { color3, color4, paint5 };
        java.awt.Color color7 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel8 = null;
        java.awt.Rectangle rectangle9 = null;
        java.awt.geom.Rectangle2D rectangle2D10 = null;
        java.awt.geom.AffineTransform affineTransform11 = null;
        java.awt.RenderingHints renderingHints12 = null;
        java.awt.PaintContext paintContext13 = color7.createContext(colorModel8, rectangle9, rectangle2D10, affineTransform11, renderingHints12);
        java.awt.Color color14 = java.awt.Color.WHITE;
        java.awt.Color color15 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel16 = null;
        java.awt.Rectangle rectangle17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.AffineTransform affineTransform19 = null;
        java.awt.RenderingHints renderingHints20 = null;
        java.awt.PaintContext paintContext21 = color15.createContext(colorModel16, rectangle17, rectangle2D18, affineTransform19, renderingHints20);
        java.awt.Color color22 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray23 = new java.awt.Paint[] { color7, color14, color15, color22 };
        java.awt.Stroke stroke24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke25 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray29 = new java.awt.Stroke[] { stroke24, stroke25, stroke26, stroke27, stroke28 };
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke33 = categoryPlot32.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray34 = new java.awt.Stroke[] { stroke30, stroke31, stroke33 };
        java.awt.Shape shape35 = null;
        java.awt.Shape[] shapeArray36 = new java.awt.Shape[] { shape35 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier37 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray2, paintArray6, paintArray23, strokeArray29, strokeArray34, shapeArray36);
        boolean boolean38 = itemLabelAnchor0.equals((java.lang.Object) paintArray6);
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(paintArray2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paintArray6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(paintContext13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(paintContext21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(paintArray23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(strokeArray29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(strokeArray34);
        org.junit.Assert.assertNotNull(shapeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test035() throws Throwable {
printRuntimeMSG("---RegressionTest0:test035");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        try {
            lineAndShapeRenderer7.setItemMargin((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires 0.0 <= margin < 1.0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
    }

    @Test
    public void test036() throws Throwable {
printRuntimeMSG("---RegressionTest0:test036");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.Color color14 = java.awt.Color.GRAY;
        java.awt.Stroke stroke15 = null;
        try {
            lineAndShapeRenderer7.drawDomainLine(graphics2D10, categoryPlot11, rectangle2D12, (double) (byte) 0, (java.awt.Paint) color14, stroke15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test037() throws Throwable {
printRuntimeMSG("---RegressionTest0:test037");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE12;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test038() throws Throwable {
printRuntimeMSG("---RegressionTest0:test038");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double1 = rectangleInsets0.getRight();
        double double3 = rectangleInsets0.calculateTopInset(0.0d);
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D7 = rectangleInsets0.createOutsetRectangle(rectangle2D4, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test039() throws Throwable {
printRuntimeMSG("---RegressionTest0:test039");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        boolean boolean0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABELS_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test040() throws Throwable {
printRuntimeMSG("---RegressionTest0:test040");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE8;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test041() throws Throwable {
printRuntimeMSG("---RegressionTest0:test041");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.awt.Shape shape0 = null;
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        try {
            org.jfree.chart.entity.CategoryItemEntity categoryItemEntity6 = new org.jfree.chart.entity.CategoryItemEntity(shape0, "TextAnchor.HALF_ASCENT_LEFT", "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]", categoryDataset3, (java.lang.Comparable) (byte) 1, (java.lang.Comparable) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'area' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
printRuntimeMSG("---RegressionTest0:test042");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        try {
            java.lang.Object obj2 = keyedObjects0.getObject((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test043() throws Throwable {
printRuntimeMSG("---RegressionTest0:test043");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jfree.chart.axis.CategoryAnchor categoryAnchor0 = org.jfree.chart.axis.CategoryAnchor.END;
        org.junit.Assert.assertNotNull(categoryAnchor0);
    }

    @Test
    public void test044() throws Throwable {
printRuntimeMSG("---RegressionTest0:test044");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.BOTTOM_LEFT;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke2 = categoryPlot1.getRangeMinorGridlineStroke();
        boolean boolean3 = categoryPlot1.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        categoryPlot1.drawBackgroundImage(graphics2D4, rectangle2D5);
        boolean boolean7 = textAnchor0.equals((java.lang.Object) rectangle2D5);
        org.junit.Assert.assertNotNull(textAnchor0);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test045() throws Throwable {
printRuntimeMSG("---RegressionTest0:test045");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        java.awt.Font font7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 0, font7, true);
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisibleInLegend(0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test046() throws Throwable {
printRuntimeMSG("---RegressionTest0:test046");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.BASELINE_CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test047() throws Throwable {
printRuntimeMSG("---RegressionTest0:test047");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Locale locale1 = null;
        try {
            java.util.ResourceBundle resourceBundle2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("TextAnchor.HALF_ASCENT_LEFT", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
printRuntimeMSG("---RegressionTest0:test048");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.Marker marker1 = null;
        org.jfree.chart.util.Layer layer2 = null;
        try {
            boolean boolean3 = categoryPlot0.removeRangeMarker(marker1, layer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
printRuntimeMSG("---RegressionTest0:test049");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        boolean boolean4 = lineAndShapeRenderer2.isSeriesVisible((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test050() throws Throwable {
printRuntimeMSG("---RegressionTest0:test050");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        float float0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_OUTSIDE_LENGTH;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 2.0f + "'", float0 == 2.0f);
    }

    @Test
    public void test051() throws Throwable {
printRuntimeMSG("---RegressionTest0:test051");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE11;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test052() throws Throwable {
printRuntimeMSG("---RegressionTest0:test052");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.Number number0 = null;
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue(number0);
        boolean boolean2 = selectableValue1.isSelected();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test053() throws Throwable {
printRuntimeMSG("---RegressionTest0:test053");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.CategoryMarker categoryMarker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        try {
            categoryPlot0.addDomainMarker(categoryMarker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test054() throws Throwable {
printRuntimeMSG("---RegressionTest0:test054");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        categoryAxis0.setLowerMargin((double) (short) 0);
        java.awt.Graphics2D graphics2D5 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke7 = categoryPlot6.getRangeMinorGridlineStroke();
        boolean boolean8 = categoryPlot6.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        categoryPlot6.removeChangeListener(plotChangeListener9);
        boolean boolean11 = categoryPlot6.isRangeCrosshairLockedOnData();
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke16 = categoryPlot15.getRangeMinorGridlineStroke();
        categoryPlot13.setParent((org.jfree.chart.plot.Plot) categoryPlot15);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot13.getFixedLegendItems();
        java.lang.Comparable comparable19 = categoryPlot13.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot13.getRangeAxisEdge();
        org.jfree.chart.axis.AxisSpace axisSpace21 = null;
        try {
            org.jfree.chart.axis.AxisSpace axisSpace22 = categoryAxis0.reserveSpace(graphics2D5, (org.jfree.chart.plot.Plot) categoryPlot6, rectangle2D12, rectangleEdge20, axisSpace21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertNull(comparable19);
        org.junit.Assert.assertNotNull(rectangleEdge20);
    }

    @Test
    public void test055() throws Throwable {
printRuntimeMSG("---RegressionTest0:test055");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        double double0 = org.jfree.chart.renderer.category.BarRenderer.DEFAULT_ITEM_MARGIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.2d + "'", double0 == 0.2d);
    }

    @Test
    public void test056() throws Throwable {
printRuntimeMSG("---RegressionTest0:test056");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        try {
            keyedObjects0.removeValue((-8355712));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -8355712");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
printRuntimeMSG("---RegressionTest0:test057");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        java.awt.geom.Rectangle2D rectangle2D7 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke9 = categoryPlot8.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        categoryPlot8.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot8.getFixedLegendItems();
        java.lang.Comparable comparable14 = categoryPlot8.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot8.getRangeAxisEdge();
        try {
            double double16 = categoryAxis0.getCategorySeriesMiddle((java.lang.Comparable) 1, (java.lang.Comparable) false, categoryDataset5, (double) 1, rectangle2D7, rectangleEdge15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertNull(comparable14);
        org.junit.Assert.assertNotNull(rectangleEdge15);
    }

    @Test
    public void test058() throws Throwable {
printRuntimeMSG("---RegressionTest0:test058");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 1.0f);
        selectableValue1.setSelected(true);
    }

    @Test
    public void test059() throws Throwable {
printRuntimeMSG("---RegressionTest0:test059");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot0.setDomainCrosshairStroke(stroke11);
        java.awt.Stroke stroke13 = categoryPlot0.getRangeGridlineStroke();
        try {
            categoryPlot0.setBackgroundImageAlpha((float) (-16777216));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test060() throws Throwable {
printRuntimeMSG("---RegressionTest0:test060");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.awt.Color color0 = java.awt.Color.blue;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test061() throws Throwable {
printRuntimeMSG("---RegressionTest0:test061");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot0.getDrawingSupplier();
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.axis.AxisState axisState11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke16 = categoryPlot15.getRangeMinorGridlineStroke();
        categoryPlot13.setParent((org.jfree.chart.plot.Plot) categoryPlot15);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot13.getFixedLegendItems();
        java.lang.Comparable comparable19 = categoryPlot13.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot13.getRangeAxisEdge();
        try {
            java.util.List list21 = categoryAxis8.refreshTicks(graphics2D10, axisState11, rectangle2D12, rectangleEdge20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertNull(comparable19);
        org.junit.Assert.assertNotNull(rectangleEdge20);
    }

    @Test
    public void test062() throws Throwable {
printRuntimeMSG("---RegressionTest0:test062");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        org.jfree.chart.plot.Plot plot8 = null;
        try {
            org.jfree.chart.entity.PlotEntity plotEntity10 = new org.jfree.chart.entity.PlotEntity(shape6, plot8, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'plot' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
    }

    @Test
    public void test063() throws Throwable {
printRuntimeMSG("---RegressionTest0:test063");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        double double1 = categoryAxis0.getUpperMargin();
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke6 = categoryPlot5.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke8 = categoryPlot7.getRangeMinorGridlineStroke();
        categoryPlot5.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot5.getFixedLegendItems();
        java.lang.Comparable comparable11 = categoryPlot5.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge12 = categoryPlot5.getRangeAxisEdge();
        try {
            double double13 = categoryAxis0.getCategoryStart((int) (short) 0, (int) '#', rectangle2D4, rectangleEdge12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05d + "'", double1 == 0.05d);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(legendItemCollection10);
        org.junit.Assert.assertNull(comparable11);
        org.junit.Assert.assertNotNull(rectangleEdge12);
    }

    @Test
    public void test064() throws Throwable {
printRuntimeMSG("---RegressionTest0:test064");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) '4', (int) '4', false);
        java.awt.Shape shape14 = null;
        java.awt.Color color15 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color17 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem18 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape14, (java.awt.Paint) color15, stroke16, (java.awt.Paint) color17);
        java.lang.Class<?> wildcardClass19 = color15.getClass();
        try {
            lineAndShapeRenderer2.setSeriesItemLabelPaint((int) (short) -1, (java.awt.Paint) color15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test065() throws Throwable {
printRuntimeMSG("---RegressionTest0:test065");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo7 = null;
        try {
            categoryPlot2.handleClick(100, 192, plotRenderingInfo7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test066() throws Throwable {
printRuntimeMSG("---RegressionTest0:test066");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        categoryPlot0.setDomainCrosshairRowKey((java.lang.Comparable) (byte) 1);
        org.junit.Assert.assertNull(categoryItemRenderer11);
    }

    @Test
    public void test067() throws Throwable {
printRuntimeMSG("---RegressionTest0:test067");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE7;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test068() throws Throwable {
printRuntimeMSG("---RegressionTest0:test068");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.awt.geom.Rectangle2D rectangle2D1 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D2 = rectangleInsets0.createOutsetRectangle(rectangle2D1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
    }

    @Test
    public void test069() throws Throwable {
printRuntimeMSG("---RegressionTest0:test069");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double2 = rectangleInsets0.calculateTopInset((double) 100);
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType4 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D6 = rectangleInsets0.createAdjustedRectangle(rectangle2D3, lengthAdjustmentType4, lengthAdjustmentType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
    }

    @Test
    public void test070() throws Throwable {
printRuntimeMSG("---RegressionTest0:test070");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.awt.Color color0 = java.awt.Color.ORANGE;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test071() throws Throwable {
printRuntimeMSG("---RegressionTest0:test071");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE2;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test072() throws Throwable {
printRuntimeMSG("---RegressionTest0:test072");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot0.setDomainCrosshairStroke(stroke11);
        java.awt.Stroke stroke13 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setForegroundAlpha((float) (-1));
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation16 = null;
        try {
            boolean boolean17 = categoryPlot0.removeAnnotation(categoryAnnotation16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test073() throws Throwable {
printRuntimeMSG("---RegressionTest0:test073");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Locale locale1 = null;
        try {
            java.util.ResourceBundle resourceBundle2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
printRuntimeMSG("---RegressionTest0:test074");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.data.category.CategoryDataset categoryDataset8 = categoryPlot0.getDataset((int) (short) 1);
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        try {
            categoryPlot0.drawOutline(graphics2D11, rectangle2D12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNull(categoryDataset8);
    }

    @Test
    public void test075() throws Throwable {
printRuntimeMSG("---RegressionTest0:test075");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        try {
            keyedObjects0.removeValue((-16777216));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -16777216");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test076() throws Throwable {
printRuntimeMSG("---RegressionTest0:test076");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.text.AttributedString attributedString0 = null;
        java.awt.Shape shape5 = null;
        java.awt.Paint paint7 = null;
        java.awt.Paint paint9 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        categoryPlot10.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation14 = categoryPlot10.getOrientation();
        java.awt.Paint paint15 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray16 = new java.awt.Paint[] { paint15 };
        java.awt.Color color17 = java.awt.Color.BLUE;
        java.awt.Color color18 = java.awt.Color.RED;
        java.awt.Paint paint19 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray20 = new java.awt.Paint[] { color17, color18, paint19 };
        java.awt.Color color21 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel22 = null;
        java.awt.Rectangle rectangle23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        java.awt.geom.AffineTransform affineTransform25 = null;
        java.awt.RenderingHints renderingHints26 = null;
        java.awt.PaintContext paintContext27 = color21.createContext(colorModel22, rectangle23, rectangle2D24, affineTransform25, renderingHints26);
        java.awt.Color color28 = java.awt.Color.WHITE;
        java.awt.Color color29 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel30 = null;
        java.awt.Rectangle rectangle31 = null;
        java.awt.geom.Rectangle2D rectangle2D32 = null;
        java.awt.geom.AffineTransform affineTransform33 = null;
        java.awt.RenderingHints renderingHints34 = null;
        java.awt.PaintContext paintContext35 = color29.createContext(colorModel30, rectangle31, rectangle2D32, affineTransform33, renderingHints34);
        java.awt.Color color36 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray37 = new java.awt.Paint[] { color21, color28, color29, color36 };
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke39 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray43 = new java.awt.Stroke[] { stroke38, stroke39, stroke40, stroke41, stroke42 };
        java.awt.Stroke stroke44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke47 = categoryPlot46.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray48 = new java.awt.Stroke[] { stroke44, stroke45, stroke47 };
        java.awt.Shape shape49 = null;
        java.awt.Shape[] shapeArray50 = new java.awt.Shape[] { shape49 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier51 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray16, paintArray20, paintArray37, strokeArray43, strokeArray48, shapeArray50);
        java.awt.Shape shape52 = defaultDrawingSupplier51.getNextShape();
        java.awt.Stroke stroke53 = defaultDrawingSupplier51.getNextOutlineStroke();
        categoryPlot10.setDomainGridlineStroke(stroke53);
        java.awt.Shape shape56 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke58 = categoryPlot57.getRangeMinorGridlineStroke();
        java.awt.Paint paint59 = null;
        try {
            org.jfree.chart.LegendItem legendItem60 = new org.jfree.chart.LegendItem(attributedString0, "hi!", "TextAnchor.HALF_ASCENT_LEFT", "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]", false, shape5, false, paint7, false, paint9, stroke53, false, shape56, stroke58, paint59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'label' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(plotOrientation14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paintArray16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(paintArray20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(paintContext27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(paintContext35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(paintArray37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(strokeArray43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(strokeArray48);
        org.junit.Assert.assertNotNull(shapeArray50);
        org.junit.Assert.assertNull(shape52);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(shape56);
        org.junit.Assert.assertNotNull(stroke58);
    }

    @Test
    public void test077() throws Throwable {
printRuntimeMSG("---RegressionTest0:test077");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        float float0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_INSIDE_LENGTH;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test078() throws Throwable {
printRuntimeMSG("---RegressionTest0:test078");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.awt.Color color1 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem2 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color1);
        java.awt.Color color3 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.color.ColorSpace colorSpace4 = color3.getColorSpace();
        float[] floatArray7 = new float[] { 192, ' ' };
        try {
            float[] floatArray8 = color1.getComponents(colorSpace4, floatArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(colorSpace4);
        org.junit.Assert.assertNotNull(floatArray7);
    }

    @Test
    public void test079() throws Throwable {
printRuntimeMSG("---RegressionTest0:test079");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        org.jfree.chart.plot.CategoryMarker categoryMarker3 = null;
        try {
            categoryPlot0.addDomainMarker(categoryMarker3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(collection2);
    }

    @Test
    public void test080() throws Throwable {
printRuntimeMSG("---RegressionTest0:test080");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        categoryAxis1.setVisible(false);
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke16 = categoryPlot15.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke18 = categoryPlot17.getRangeMinorGridlineStroke();
        categoryPlot15.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = categoryPlot15.getFixedLegendItems();
        java.lang.Comparable comparable21 = categoryPlot15.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge22 = categoryPlot15.getRangeAxisEdge();
        try {
            double double23 = categoryAxis1.getCategoryStart((int) (short) -1, 0, rectangle2D14, rectangleEdge22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(legendItemCollection20);
        org.junit.Assert.assertNull(comparable21);
        org.junit.Assert.assertNotNull(rectangleEdge22);
    }

    @Test
    public void test081() throws Throwable {
printRuntimeMSG("---RegressionTest0:test081");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        double double0 = org.jfree.chart.axis.CategoryAxis.DEFAULT_AXIS_MARGIN;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.05d + "'", double0 == 0.05d);
    }

    @Test
    public void test082() throws Throwable {
printRuntimeMSG("---RegressionTest0:test082");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        categoryAxis1.setLabelToolTip("hi!");
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis15.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis18 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer21.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot(categoryDataset14, categoryAxis15, valueAxis18, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer21);
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke26 = categoryPlot25.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke28 = categoryPlot27.getRangeMinorGridlineStroke();
        categoryPlot25.setParent((org.jfree.chart.plot.Plot) categoryPlot27);
        org.jfree.chart.LegendItemCollection legendItemCollection30 = categoryPlot25.getFixedLegendItems();
        java.lang.Comparable comparable31 = categoryPlot25.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge32 = categoryPlot25.getRangeAxisEdge();
        org.jfree.chart.axis.AxisSpace axisSpace33 = null;
        try {
            org.jfree.chart.axis.AxisSpace axisSpace34 = categoryAxis1.reserveSpace(graphics2D13, (org.jfree.chart.plot.Plot) categoryPlot23, rectangle2D24, rectangleEdge32, axisSpace33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNull(legendItemCollection30);
        org.junit.Assert.assertNull(comparable31);
        org.junit.Assert.assertNotNull(rectangleEdge32);
    }

    @Test
    public void test083() throws Throwable {
printRuntimeMSG("---RegressionTest0:test083");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE9;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test084() throws Throwable {
printRuntimeMSG("---RegressionTest0:test084");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = null;
        categoryPlot0.setFixedRangeAxisSpace(axisSpace8);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
    }

    @Test
    public void test085() throws Throwable {
printRuntimeMSG("---RegressionTest0:test085");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke8 = categoryPlot7.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke10 = categoryPlot9.getRangeMinorGridlineStroke();
        categoryPlot7.setParent((org.jfree.chart.plot.Plot) categoryPlot9);
        org.jfree.chart.LegendItemCollection legendItemCollection12 = categoryPlot7.getFixedLegendItems();
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        try {
            lineAndShapeRenderer2.drawBackground(graphics2D6, categoryPlot7, rectangle2D13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNull(legendItemCollection12);
    }

    @Test
    public void test086() throws Throwable {
printRuntimeMSG("---RegressionTest0:test086");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        java.awt.Stroke stroke5 = null;
        try {
            lineAndShapeRenderer2.setBaseStroke(stroke5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'stroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test087() throws Throwable {
printRuntimeMSG("---RegressionTest0:test087");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jfree.chart.renderer.category.BarPainter barPainter0 = null;
        try {
            org.jfree.chart.renderer.category.BarRenderer.setDefaultBarPainter(barPainter0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'painter' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test088() throws Throwable {
printRuntimeMSG("---RegressionTest0:test088");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.awt.Color color0 = java.awt.Color.DARK_GRAY;
        int int1 = color0.getRGB();
        int int2 = color0.getRGB();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-12566464) + "'", int1 == (-12566464));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-12566464) + "'", int2 == (-12566464));
    }

    @Test
    public void test089() throws Throwable {
printRuntimeMSG("---RegressionTest0:test089");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.awt.Color color1 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem2 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color1);
        java.lang.String str3 = legendItem2.getToolTipText();
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer4 = null;
        try {
            legendItem2.setFillPaintTransformer(gradientPaintTransformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'transformer' attribute.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test090() throws Throwable {
printRuntimeMSG("---RegressionTest0:test090");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.awt.Color color0 = java.awt.Color.lightGray;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test091() throws Throwable {
printRuntimeMSG("---RegressionTest0:test091");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        categoryPlot0.setWeight((int) (byte) 1);
        categoryPlot0.setAnchorValue(0.0d, true);
    }

    @Test
    public void test092() throws Throwable {
printRuntimeMSG("---RegressionTest0:test092");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder4 = categoryPlot0.getDatasetRenderingOrder();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder4);
    }

    @Test
    public void test093() throws Throwable {
printRuntimeMSG("---RegressionTest0:test093");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        boolean boolean0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_RANGE_GRIDLINES_VISIBLE;
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test094() throws Throwable {
printRuntimeMSG("---RegressionTest0:test094");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.jfree.data.category.CategoryDataset categoryDataset3 = null;
        try {
            org.jfree.chart.entity.CategoryItemEntity categoryItemEntity6 = new org.jfree.chart.entity.CategoryItemEntity(shape0, "ItemLabelAnchor.OUTSIDE9", "hi!", categoryDataset3, (java.lang.Comparable) (-8355712), (java.lang.Comparable) "TextAnchor.HALF_ASCENT_LEFT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test095() throws Throwable {
printRuntimeMSG("---RegressionTest0:test095");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        boolean boolean9 = legendItem8.isLineVisible();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test096() throws Throwable {
printRuntimeMSG("---RegressionTest0:test096");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(false);
    }

    @Test
    public void test097() throws Throwable {
printRuntimeMSG("---RegressionTest0:test097");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        try {
            java.lang.Object obj2 = keyedObjects0.getObject((java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (hi!) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
    }

    @Test
    public void test098() throws Throwable {
printRuntimeMSG("---RegressionTest0:test098");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer2.getNegativeItemLabelPosition(0, 0, true);
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = new org.jfree.chart.axis.CategoryAxis();
        double double15 = categoryAxis14.getUpperMargin();
        categoryAxis14.addCategoryLabelToolTip((java.lang.Comparable) 'a', "");
        org.jfree.chart.plot.CategoryMarker categoryMarker19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        try {
            lineAndShapeRenderer2.drawDomainMarker(graphics2D12, categoryPlot13, categoryAxis14, categoryMarker19, rectangle2D20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.05d + "'", double15 == 0.05d);
    }

    @Test
    public void test099() throws Throwable {
printRuntimeMSG("---RegressionTest0:test099");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jfree.chart.renderer.category.BarRenderer.setDefaultShadowsVisible(true);
    }

    @Test
    public void test100() throws Throwable {
printRuntimeMSG("---RegressionTest0:test100");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) (byte) -1, true);
    }

    @Test
    public void test101() throws Throwable {
printRuntimeMSG("---RegressionTest0:test101");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.chart.plot.Plot plot5 = plotChangeEvent4.getPlot();
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType6 = plotChangeEvent4.getType();
        java.lang.Object obj7 = plotChangeEvent4.getSource();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNotNull(chartChangeEventType6);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test102() throws Throwable {
printRuntimeMSG("---RegressionTest0:test102");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        double double9 = categoryAxis8.getUpperMargin();
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke13 = categoryPlot12.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer14 = null;
        categoryPlot12.setRenderer(categoryItemRenderer14);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent16 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot12);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis18.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer24.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis21, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer24);
        java.util.List list27 = categoryPlot12.getCategoriesForAxis(categoryAxis18);
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke30 = categoryPlot29.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke32 = categoryPlot31.getRangeMinorGridlineStroke();
        categoryPlot29.setParent((org.jfree.chart.plot.Plot) categoryPlot31);
        org.jfree.chart.LegendItemCollection legendItemCollection34 = categoryPlot29.getFixedLegendItems();
        java.lang.Comparable comparable35 = categoryPlot29.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = categoryPlot29.getRangeAxisEdge();
        try {
            double double37 = categoryAxis8.getCategoryMiddle((java.lang.Comparable) 4.0d, list27, rectangle2D28, rectangleEdge36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid category index: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNull(legendItemCollection34);
        org.junit.Assert.assertNull(comparable35);
        org.junit.Assert.assertNotNull(rectangleEdge36);
    }

    @Test
    public void test103() throws Throwable {
printRuntimeMSG("---RegressionTest0:test103");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.awt.Paint[] paintArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE;
        org.junit.Assert.assertNotNull(paintArray0);
    }

    @Test
    public void test104() throws Throwable {
printRuntimeMSG("---RegressionTest0:test104");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.awt.Color color0 = org.jfree.chart.ChartColor.LIGHT_BLUE;
        float[] floatArray1 = new float[] {};
        try {
            float[] floatArray2 = color0.getRGBComponents(floatArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(floatArray1);
    }

    @Test
    public void test105() throws Throwable {
printRuntimeMSG("---RegressionTest0:test105");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        renderAttributes0.setDefaultLabelVisible((java.lang.Boolean) true);
        org.junit.Assert.assertNull(paint1);
    }

    @Test
    public void test106() throws Throwable {
printRuntimeMSG("---RegressionTest0:test106");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj2 = objectList0.get(1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test107() throws Throwable {
printRuntimeMSG("---RegressionTest0:test107");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = lineAndShapeRenderer2.lookupSeriesFillPaint((int) (short) 100);
        java.awt.Paint paint7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_PAINT;
        try {
            lineAndShapeRenderer2.setSeriesItemLabelPaint((-8355712), paint7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test108() throws Throwable {
printRuntimeMSG("---RegressionTest0:test108");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        categoryPlot0.setAnchorValue(0.0d);
        org.jfree.chart.plot.Marker marker8 = null;
        org.jfree.chart.util.Layer layer9 = null;
        try {
            categoryPlot0.addRangeMarker(marker8, layer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
    }

    @Test
    public void test109() throws Throwable {
printRuntimeMSG("---RegressionTest0:test109");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Paint paint3 = categoryPlot0.getBackgroundPaint();
        categoryPlot0.setRangePannable(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        categoryPlot0.setDomainAxis(0, categoryAxis7);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test110() throws Throwable {
printRuntimeMSG("---RegressionTest0:test110");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        try {
            categoryPlot0.addRangeMarker(1, marker7, layer8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
printRuntimeMSG("---RegressionTest0:test111");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        java.awt.Paint paint9 = legendItem8.getLabelPaint();
        java.lang.String str10 = legendItem8.getURLText();
        java.awt.Paint paint11 = legendItem8.getOutlinePaint();
        java.awt.Paint paint12 = legendItem8.getFillPaint();
        java.awt.Stroke stroke13 = legendItem8.getOutlineStroke();
        org.jfree.data.general.Dataset dataset14 = legendItem8.getDataset();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str10.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(dataset14);
    }

    @Test
    public void test112() throws Throwable {
printRuntimeMSG("---RegressionTest0:test112");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke6 = categoryPlot5.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke8 = categoryPlot7.getRangeMinorGridlineStroke();
        categoryPlot5.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot5.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent11 = null;
        categoryPlot5.axisChanged(axisChangeEvent11);
        org.jfree.chart.axis.AxisSpace axisSpace13 = categoryPlot5.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset14 = null;
        categoryPlot5.setDataset(categoryDataset14);
        java.awt.Stroke stroke16 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot5.setDomainCrosshairStroke(stroke16);
        java.awt.Stroke stroke18 = categoryPlot5.getRangeGridlineStroke();
        lineAndShapeRenderer2.setBaseStroke(stroke18);
        java.awt.Graphics2D graphics2D20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis22.setMinorTickMarkOutsideLength((float) (short) 0);
        categoryAxis22.setLowerMargin((double) (short) 0);
        categoryAxis22.clearCategoryLabelToolTips();
        org.jfree.chart.axis.ValueAxis valueAxis28 = null;
        org.jfree.chart.util.Layer layer29 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        try {
            lineAndShapeRenderer2.drawAnnotations(graphics2D20, rectangle2D21, categoryAxis22, valueAxis28, layer29, plotRenderingInfo30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(legendItemCollection10);
        org.junit.Assert.assertNull(axisSpace13);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test113() throws Throwable {
printRuntimeMSG("---RegressionTest0:test113");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setRangeZeroBaselineVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (byte) -1);
        java.awt.Color color12 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot0.setDomainCrosshairPaint((java.awt.Paint) color12);
        categoryPlot0.clearDomainAxes();
        categoryPlot0.setCrosshairDatasetIndex((int) (short) -1, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test114() throws Throwable {
printRuntimeMSG("---RegressionTest0:test114");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        int int11 = categoryPlot0.getBackgroundImageAlignment();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test115() throws Throwable {
printRuntimeMSG("---RegressionTest0:test115");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.awt.Color color2 = java.awt.Color.getColor("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", (-8355712));
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test116() throws Throwable {
printRuntimeMSG("---RegressionTest0:test116");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test117() throws Throwable {
printRuntimeMSG("---RegressionTest0:test117");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        lineAndShapeRenderer2.clearSeriesStrokes(false);
        int int10 = lineAndShapeRenderer2.getRowCount();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer2.getSeriesItemLabelGenerator(100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
    }

    @Test
    public void test118() throws Throwable {
printRuntimeMSG("---RegressionTest0:test118");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        try {
            org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor(2, (-16777216), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Color parameter outside of expected range: Green");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
printRuntimeMSG("---RegressionTest0:test119");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        try {
            org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor((-12566464), (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Color parameter outside of expected range: Red");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test120() throws Throwable {
printRuntimeMSG("---RegressionTest0:test120");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        int int6 = lineAndShapeRenderer2.getPassCount();
        try {
            lineAndShapeRenderer2.setSeriesShapesFilled((-1), (java.lang.Boolean) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test121() throws Throwable {
printRuntimeMSG("---RegressionTest0:test121");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.awt.Color color3 = java.awt.Color.getHSBColor((float) (byte) 0, (float) 0, (float) (-12566464));
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test122() throws Throwable {
printRuntimeMSG("---RegressionTest0:test122");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        java.awt.Paint paint6 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray7 = new java.awt.Paint[] { paint6 };
        java.awt.Color color8 = java.awt.Color.BLUE;
        java.awt.Color color9 = java.awt.Color.RED;
        java.awt.Paint paint10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray11 = new java.awt.Paint[] { color8, color9, paint10 };
        java.awt.Color color12 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel13 = null;
        java.awt.Rectangle rectangle14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.AffineTransform affineTransform16 = null;
        java.awt.RenderingHints renderingHints17 = null;
        java.awt.PaintContext paintContext18 = color12.createContext(colorModel13, rectangle14, rectangle2D15, affineTransform16, renderingHints17);
        java.awt.Color color19 = java.awt.Color.WHITE;
        java.awt.Color color20 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel21 = null;
        java.awt.Rectangle rectangle22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        java.awt.geom.AffineTransform affineTransform24 = null;
        java.awt.RenderingHints renderingHints25 = null;
        java.awt.PaintContext paintContext26 = color20.createContext(colorModel21, rectangle22, rectangle2D23, affineTransform24, renderingHints25);
        java.awt.Color color27 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray28 = new java.awt.Paint[] { color12, color19, color20, color27 };
        java.awt.Stroke stroke29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke30 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray34 = new java.awt.Stroke[] { stroke29, stroke30, stroke31, stroke32, stroke33 };
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke38 = categoryPlot37.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray39 = new java.awt.Stroke[] { stroke35, stroke36, stroke38 };
        java.awt.Shape shape40 = null;
        java.awt.Shape[] shapeArray41 = new java.awt.Shape[] { shape40 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier42 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray7, paintArray11, paintArray28, strokeArray34, strokeArray39, shapeArray41);
        java.awt.Paint paint43 = defaultDrawingSupplier42.getNextOutlinePaint();
        java.lang.Object obj44 = defaultDrawingSupplier42.clone();
        java.awt.Paint paint45 = defaultDrawingSupplier42.getNextOutlinePaint();
        categoryPlot0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier) defaultDrawingSupplier42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        java.awt.geom.Point2D point2D49 = null;
        categoryPlot0.panDomainAxes((double) 0, plotRenderingInfo48, point2D49);
        java.awt.Color color51 = org.jfree.chart.ChartColor.DARK_RED;
        categoryPlot0.setRangeZeroBaselinePaint((java.awt.Paint) color51);
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke54 = categoryPlot53.getRangeMinorGridlineStroke();
        categoryPlot53.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation57 = categoryPlot53.getOrientation();
        categoryPlot0.setOrientation(plotOrientation57);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paintArray7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paintArray11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(paintContext18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(paintContext26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(paintArray28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(strokeArray34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(strokeArray39);
        org.junit.Assert.assertNotNull(shapeArray41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(plotOrientation57);
    }

    @Test
    public void test123() throws Throwable {
printRuntimeMSG("---RegressionTest0:test123");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        try {
            categoryPlot0.addRangeMarker(marker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test124() throws Throwable {
printRuntimeMSG("---RegressionTest0:test124");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis6.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer12.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis9, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer12);
        java.util.List list15 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.axis.AxisLocation axisLocation16 = null;
        try {
            categoryPlot0.setDomainAxisLocation(axisLocation16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test125() throws Throwable {
printRuntimeMSG("---RegressionTest0:test125");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getParent();
        categoryPlot0.setDomainCrosshairRowKey((java.lang.Comparable) (-1L), false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(plot5);
    }

    @Test
    public void test126() throws Throwable {
printRuntimeMSG("---RegressionTest0:test126");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.awt.Color color0 = java.awt.Color.pink;
        java.awt.image.ColorModel colorModel1 = null;
        java.awt.Rectangle rectangle2 = null;
        java.awt.geom.Rectangle2D rectangle2D3 = null;
        java.awt.geom.AffineTransform affineTransform4 = null;
        java.awt.RenderingHints renderingHints5 = null;
        java.awt.PaintContext paintContext6 = color0.createContext(colorModel1, rectangle2, rectangle2D3, affineTransform4, renderingHints5);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(paintContext6);
    }

    @Test
    public void test127() throws Throwable {
printRuntimeMSG("---RegressionTest0:test127");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        double double11 = categoryAxis1.getFixedDimension();
        java.awt.Paint paint13 = categoryAxis1.getTickLabelPaint((java.lang.Comparable) 4.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets14 = categoryAxis1.getTickLabelInsets();
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D18 = rectangleInsets14.createInsetRectangle(rectangle2D15, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(rectangleInsets14);
    }

    @Test
    public void test128() throws Throwable {
printRuntimeMSG("---RegressionTest0:test128");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint1 = categoryAxis0.getTickLabelPaint();
        java.awt.Graphics2D graphics2D2 = null;
        org.jfree.chart.axis.AxisState axisState3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor5 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE4;
        org.jfree.chart.axis.AxisLocation axisLocation6 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation7 = axisLocation6.getOpposite();
        boolean boolean8 = itemLabelAnchor5.equals((java.lang.Object) axisLocation6);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke10 = categoryPlot9.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke12 = categoryPlot11.getRangeMinorGridlineStroke();
        categoryPlot9.setParent((org.jfree.chart.plot.Plot) categoryPlot11);
        org.jfree.chart.LegendItemCollection legendItemCollection14 = categoryPlot9.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent15 = null;
        categoryPlot9.axisChanged(axisChangeEvent15);
        org.jfree.chart.axis.AxisSpace axisSpace17 = categoryPlot9.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset18 = null;
        categoryPlot9.setDataset(categoryDataset18);
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot9.setDomainCrosshairStroke(stroke20);
        java.awt.Stroke stroke22 = categoryPlot9.getRangeGridlineStroke();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent23 = null;
        categoryPlot9.annotationChanged(annotationChangeEvent23);
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation26 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        categoryPlot25.setOrientation(plotOrientation26);
        categoryPlot9.setOrientation(plotOrientation26);
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation6, plotOrientation26);
        try {
            java.util.List list30 = categoryAxis0.refreshTicks(graphics2D2, axisState3, rectangle2D4, rectangleEdge29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(itemLabelAnchor5);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(legendItemCollection14);
        org.junit.Assert.assertNull(axisSpace17);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(plotOrientation26);
        org.junit.Assert.assertNotNull(rectangleEdge29);
    }

    @Test
    public void test129() throws Throwable {
printRuntimeMSG("---RegressionTest0:test129");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        try {
            categoryPlot0.drawOutline(graphics2D3, rectangle2D4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test130() throws Throwable {
printRuntimeMSG("---RegressionTest0:test130");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
        java.awt.Color color2 = org.jfree.chart.ChartColor.DARK_GREEN;
        renderAttributes1.setDefaultOutlinePaint((java.awt.Paint) color2);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = null;
        lineAndShapeRenderer7.setBaseToolTipGenerator(categoryToolTipGenerator9);
        java.awt.Font font12 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer7.setSeriesItemLabelFont((int) (short) 0, font12, true);
        try {
            renderAttributes1.setSeriesLabelFont(4, font12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(font12);
    }

    @Test
    public void test131() throws Throwable {
printRuntimeMSG("---RegressionTest0:test131");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        float float0 = org.jfree.chart.plot.Plot.DEFAULT_FOREGROUND_ALPHA;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test132() throws Throwable {
printRuntimeMSG("---RegressionTest0:test132");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean10 = sortOrder8.equals((java.lang.Object) categoryPlot9);
        org.jfree.chart.plot.CategoryMarker categoryMarker11 = null;
        try {
            categoryPlot9.addDomainMarker(categoryMarker11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test133() throws Throwable {
printRuntimeMSG("---RegressionTest0:test133");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        boolean boolean8 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator9 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator9);
        org.jfree.data.category.CategoryDataset categoryDataset11 = null;
        try {
            java.lang.String str13 = standardCategorySeriesLabelGenerator9.generateLabel(categoryDataset11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'dataset' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test134() throws Throwable {
printRuntimeMSG("---RegressionTest0:test134");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis6.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer12.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis9, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer12);
        java.util.List list15 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        java.awt.Color color16 = org.jfree.chart.ChartColor.DARK_GREEN;
        categoryAxis6.setTickMarkPaint((java.awt.Paint) color16);
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke25 = categoryPlot24.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke27 = categoryPlot26.getRangeMinorGridlineStroke();
        categoryPlot24.setParent((org.jfree.chart.plot.Plot) categoryPlot26);
        org.jfree.chart.LegendItemCollection legendItemCollection29 = categoryPlot24.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent30 = null;
        categoryPlot24.axisChanged(axisChangeEvent30);
        org.jfree.chart.axis.AxisSpace axisSpace32 = categoryPlot24.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        categoryPlot24.setDataset(categoryDataset33);
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot24.setDomainCrosshairStroke(stroke35);
        java.awt.Stroke stroke37 = categoryPlot24.getRangeGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge38 = categoryPlot24.getRangeAxisEdge();
        try {
            double double39 = categoryAxis6.getCategorySeriesMiddle((int) (short) 100, 128, (int) (byte) 0, (int) '#', (double) (-16777216), rectangle2D23, rectangleEdge38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNull(legendItemCollection29);
        org.junit.Assert.assertNull(axisSpace32);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(rectangleEdge38);
    }

    @Test
    public void test135() throws Throwable {
printRuntimeMSG("---RegressionTest0:test135");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
        java.awt.Color color2 = org.jfree.chart.ChartColor.DARK_GREEN;
        renderAttributes1.setDefaultOutlinePaint((java.awt.Paint) color2);
        java.awt.Color color4 = org.jfree.chart.ChartColor.VERY_DARK_YELLOW;
        renderAttributes1.setDefaultLabelPaint((java.awt.Paint) color4);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color4);
    }

    @Test
    public void test136() throws Throwable {
printRuntimeMSG("---RegressionTest0:test136");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        java.awt.Color color3 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem4 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color3);
        java.lang.String str5 = legendItem4.getToolTipText();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem4.setOutlineStroke(stroke6);
        legendItem1.setOutlineStroke(stroke6);
        java.awt.Stroke stroke9 = legendItem1.getLineStroke();
        java.lang.String str10 = legendItem1.getLabel();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "ItemLabelAnchor.OUTSIDE9" + "'", str10.equals("ItemLabelAnchor.OUTSIDE9"));
    }

    @Test
    public void test137() throws Throwable {
printRuntimeMSG("---RegressionTest0:test137");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator11, true);
        boolean boolean14 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        try {
            lineAndShapeRenderer2.setSeriesCreateEntities((-1), (java.lang.Boolean) true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test138() throws Throwable {
printRuntimeMSG("---RegressionTest0:test138");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        try {
            java.lang.Object obj2 = keyedObjects0.getObject(128);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 128, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test139() throws Throwable {
printRuntimeMSG("---RegressionTest0:test139");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes(true);
        keyedObjects0.setObject((java.lang.Comparable) true, (java.lang.Object) true);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke6 = categoryPlot5.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation7 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation8 = axisLocation7.getOpposite();
        categoryPlot5.setDomainAxisLocation(axisLocation8, false);
        boolean boolean11 = categoryPlot5.canSelectByRegion();
        categoryPlot5.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot14.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo17, point2D18);
        categoryPlot14.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot14.getRowRenderingOrder();
        categoryPlot5.setRowRenderingOrder(sortOrder22);
        boolean boolean25 = sortOrder22.equals((java.lang.Object) 4);
        keyedObjects0.sortByObjects(sortOrder22);
        try {
            java.lang.Object obj28 = keyedObjects0.getObject((java.lang.Comparable) "TextAnchor.HALF_ASCENT_LEFT");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (TextAnchor.HALF_ASCENT_LEFT) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test140() throws Throwable {
printRuntimeMSG("---RegressionTest0:test140");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setRangeZeroBaselineVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (byte) -1);
        java.awt.Color color12 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot0.setDomainCrosshairPaint((java.awt.Paint) color12);
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test141() throws Throwable {
printRuntimeMSG("---RegressionTest0:test141");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        java.awt.Font font7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 0, font7, true);
        java.lang.Boolean boolean11 = lineAndShapeRenderer2.getSeriesCreateEntities((int) 'a');
        java.awt.Paint paint13 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray14 = new java.awt.Paint[] { paint13 };
        java.awt.Color color15 = java.awt.Color.BLUE;
        java.awt.Color color16 = java.awt.Color.RED;
        java.awt.Paint paint17 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray18 = new java.awt.Paint[] { color15, color16, paint17 };
        java.awt.Color color19 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel20 = null;
        java.awt.Rectangle rectangle21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.AffineTransform affineTransform23 = null;
        java.awt.RenderingHints renderingHints24 = null;
        java.awt.PaintContext paintContext25 = color19.createContext(colorModel20, rectangle21, rectangle2D22, affineTransform23, renderingHints24);
        java.awt.Color color26 = java.awt.Color.WHITE;
        java.awt.Color color27 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel28 = null;
        java.awt.Rectangle rectangle29 = null;
        java.awt.geom.Rectangle2D rectangle2D30 = null;
        java.awt.geom.AffineTransform affineTransform31 = null;
        java.awt.RenderingHints renderingHints32 = null;
        java.awt.PaintContext paintContext33 = color27.createContext(colorModel28, rectangle29, rectangle2D30, affineTransform31, renderingHints32);
        java.awt.Color color34 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray35 = new java.awt.Paint[] { color19, color26, color27, color34 };
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke37 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray41 = new java.awt.Stroke[] { stroke36, stroke37, stroke38, stroke39, stroke40 };
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke45 = categoryPlot44.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray46 = new java.awt.Stroke[] { stroke42, stroke43, stroke45 };
        java.awt.Shape shape47 = null;
        java.awt.Shape[] shapeArray48 = new java.awt.Shape[] { shape47 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier49 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray14, paintArray18, paintArray35, strokeArray41, strokeArray46, shapeArray48);
        java.awt.Shape shape50 = defaultDrawingSupplier49.getNextShape();
        java.awt.Stroke stroke51 = defaultDrawingSupplier49.getNextOutlineStroke();
        java.awt.Stroke stroke52 = defaultDrawingSupplier49.getNextOutlineStroke();
        try {
            lineAndShapeRenderer2.setSeriesOutlineStroke((-16777216), stroke52, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paintArray14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(paintArray18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(paintContext25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(paintContext33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(paintArray35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(strokeArray41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(strokeArray46);
        org.junit.Assert.assertNotNull(shapeArray48);
        org.junit.Assert.assertNull(shape50);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test142() throws Throwable {
printRuntimeMSG("---RegressionTest0:test142");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        double double11 = categoryAxis1.getFixedDimension();
        java.lang.Object obj12 = categoryAxis1.clone();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke16 = categoryPlot15.getRangeMinorGridlineStroke();
        categoryPlot13.setParent((org.jfree.chart.plot.Plot) categoryPlot15);
        categoryAxis1.addChangeListener((org.jfree.chart.event.AxisChangeListener) categoryPlot15);
        org.jfree.chart.plot.CategoryMarker categoryMarker19 = null;
        try {
            categoryPlot15.addDomainMarker(categoryMarker19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke16);
    }

    @Test
    public void test143() throws Throwable {
printRuntimeMSG("---RegressionTest0:test143");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.HALF_ASCENT_RIGHT;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test144() throws Throwable {
printRuntimeMSG("---RegressionTest0:test144");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        categoryAxis1.setVisible(false);
        java.lang.String str13 = categoryAxis1.getCategoryLabelToolTip((java.lang.Comparable) 0);
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions14 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.setAxisLineVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets17 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str18 = rectangleInsets17.toString();
        double double19 = rectangleInsets17.getTop();
        categoryAxis1.setTickLabelInsets(rectangleInsets17);
        categoryAxis1.addCategoryLabelToolTip((java.lang.Comparable) "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", "");
        java.lang.Comparable comparable25 = null;
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke30 = categoryPlot29.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke32 = categoryPlot31.getRangeMinorGridlineStroke();
        categoryPlot29.setParent((org.jfree.chart.plot.Plot) categoryPlot31);
        org.jfree.chart.LegendItemCollection legendItemCollection34 = categoryPlot29.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent35 = null;
        categoryPlot29.axisChanged(axisChangeEvent35);
        org.jfree.chart.axis.AxisSpace axisSpace37 = categoryPlot29.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        categoryPlot29.setDataset(categoryDataset38);
        java.awt.Stroke stroke40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot29.setDomainCrosshairStroke(stroke40);
        java.awt.Stroke stroke42 = categoryPlot29.getRangeGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge43 = categoryPlot29.getRangeAxisEdge();
        try {
            double double44 = categoryAxis1.getCategorySeriesMiddle((java.lang.Comparable) 100.0d, comparable25, categoryDataset26, (double) (byte) 0, rectangle2D28, rectangleEdge43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(categoryLabelPositions14);
        org.junit.Assert.assertNotNull(rectangleInsets17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str18.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 2.0d + "'", double19 == 2.0d);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNull(legendItemCollection34);
        org.junit.Assert.assertNull(axisSpace37);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(rectangleEdge43);
    }

    @Test
    public void test145() throws Throwable {
printRuntimeMSG("---RegressionTest0:test145");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        double double9 = categoryAxis8.getUpperMargin();
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        java.awt.Paint paint11 = categoryAxis8.getLabelPaint();
        java.awt.Graphics2D graphics2D12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer15.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean18 = lineAndShapeRenderer15.getBaseLinesVisible();
        lineAndShapeRenderer15.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer15.setAutoPopulateSeriesShape(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = null;
        lineAndShapeRenderer15.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator24, true);
        java.awt.Shape shape28 = lineAndShapeRenderer15.lookupSeriesShape((int) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke30 = categoryPlot29.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke32 = categoryPlot31.getRangeMinorGridlineStroke();
        categoryPlot29.setParent((org.jfree.chart.plot.Plot) categoryPlot31);
        org.jfree.chart.LegendItemCollection legendItemCollection34 = categoryPlot29.getFixedLegendItems();
        java.lang.Comparable comparable35 = categoryPlot29.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge36 = categoryPlot29.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent37 = null;
        categoryPlot29.notifyListeners(plotChangeEvent37);
        boolean boolean39 = categoryPlot29.isOutlineVisible();
        java.awt.geom.GeneralPath generalPath40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        org.jfree.chart.RenderingSource renderingSource42 = null;
        categoryPlot29.select(generalPath40, rectangle2D41, renderingSource42);
        org.jfree.chart.util.ShadowGenerator shadowGenerator44 = null;
        categoryPlot29.setShadowGenerator(shadowGenerator44);
        org.jfree.chart.entity.PlotEntity plotEntity46 = new org.jfree.chart.entity.PlotEntity(shape28, (org.jfree.chart.plot.Plot) categoryPlot29);
        java.awt.geom.Rectangle2D rectangle2D47 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot48 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke49 = categoryPlot48.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke51 = categoryPlot50.getRangeMinorGridlineStroke();
        categoryPlot48.setParent((org.jfree.chart.plot.Plot) categoryPlot50);
        org.jfree.chart.LegendItemCollection legendItemCollection53 = categoryPlot48.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent54 = null;
        categoryPlot48.axisChanged(axisChangeEvent54);
        org.jfree.chart.axis.AxisSpace axisSpace56 = categoryPlot48.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset57 = null;
        categoryPlot48.setDataset(categoryDataset57);
        java.awt.Stroke stroke59 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot48.setDomainCrosshairStroke(stroke59);
        java.awt.Stroke stroke61 = categoryPlot48.getRangeGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge62 = categoryPlot48.getRangeAxisEdge();
        org.jfree.chart.axis.AxisSpace axisSpace63 = null;
        try {
            org.jfree.chart.axis.AxisSpace axisSpace64 = categoryAxis8.reserveSpace(graphics2D12, (org.jfree.chart.plot.Plot) categoryPlot29, rectangle2D47, rectangleEdge62, axisSpace63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shape28);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNull(legendItemCollection34);
        org.junit.Assert.assertNull(comparable35);
        org.junit.Assert.assertNotNull(rectangleEdge36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNull(legendItemCollection53);
        org.junit.Assert.assertNull(axisSpace56);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertNotNull(stroke61);
        org.junit.Assert.assertNotNull(rectangleEdge62);
    }

    @Test
    public void test146() throws Throwable {
printRuntimeMSG("---RegressionTest0:test146");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double1 = rectangleInsets0.getRight();
        double double3 = rectangleInsets0.calculateTopInset(0.0d);
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D5 = rectangleInsets0.createOutsetRectangle(rectangle2D4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test147() throws Throwable {
printRuntimeMSG("---RegressionTest0:test147");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        double double1 = categoryAxis0.getUpperMargin();
        categoryAxis0.addCategoryLabelToolTip((java.lang.Comparable) 'a', "");
        java.awt.Paint paint5 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray6 = new java.awt.Paint[] { paint5 };
        java.awt.Color color7 = java.awt.Color.BLUE;
        java.awt.Color color8 = java.awt.Color.RED;
        java.awt.Paint paint9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray10 = new java.awt.Paint[] { color7, color8, paint9 };
        java.awt.Color color11 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel12 = null;
        java.awt.Rectangle rectangle13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        java.awt.geom.AffineTransform affineTransform15 = null;
        java.awt.RenderingHints renderingHints16 = null;
        java.awt.PaintContext paintContext17 = color11.createContext(colorModel12, rectangle13, rectangle2D14, affineTransform15, renderingHints16);
        java.awt.Color color18 = java.awt.Color.WHITE;
        java.awt.Color color19 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel20 = null;
        java.awt.Rectangle rectangle21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        java.awt.geom.AffineTransform affineTransform23 = null;
        java.awt.RenderingHints renderingHints24 = null;
        java.awt.PaintContext paintContext25 = color19.createContext(colorModel20, rectangle21, rectangle2D22, affineTransform23, renderingHints24);
        java.awt.Color color26 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray27 = new java.awt.Paint[] { color11, color18, color19, color26 };
        java.awt.Stroke stroke28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke29 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray33 = new java.awt.Stroke[] { stroke28, stroke29, stroke30, stroke31, stroke32 };
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke37 = categoryPlot36.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray38 = new java.awt.Stroke[] { stroke34, stroke35, stroke37 };
        java.awt.Shape shape39 = null;
        java.awt.Shape[] shapeArray40 = new java.awt.Shape[] { shape39 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier41 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray6, paintArray10, paintArray27, strokeArray33, strokeArray38, shapeArray40);
        java.awt.Shape shape42 = defaultDrawingSupplier41.getNextShape();
        java.awt.Stroke stroke43 = defaultDrawingSupplier41.getNextOutlineStroke();
        java.awt.Stroke stroke44 = defaultDrawingSupplier41.getNextOutlineStroke();
        categoryAxis0.setTickMarkStroke(stroke44);
        java.lang.Comparable comparable46 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot47 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke48 = categoryPlot47.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke50 = categoryPlot49.getRangeMinorGridlineStroke();
        categoryPlot47.setParent((org.jfree.chart.plot.Plot) categoryPlot49);
        org.jfree.chart.LegendItemCollection legendItemCollection52 = categoryPlot47.getFixedLegendItems();
        java.lang.Comparable comparable53 = categoryPlot47.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge54 = categoryPlot47.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent55 = null;
        categoryPlot47.notifyListeners(plotChangeEvent55);
        org.jfree.chart.axis.CategoryAxis categoryAxis57 = null;
        java.util.List list58 = categoryPlot47.getCategoriesForAxis(categoryAxis57);
        java.awt.geom.Rectangle2D rectangle2D59 = null;
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor60 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE4;
        org.jfree.chart.axis.AxisLocation axisLocation61 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation62 = axisLocation61.getOpposite();
        boolean boolean63 = itemLabelAnchor60.equals((java.lang.Object) axisLocation61);
        org.jfree.chart.plot.CategoryPlot categoryPlot64 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke65 = categoryPlot64.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot66 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke67 = categoryPlot66.getRangeMinorGridlineStroke();
        categoryPlot64.setParent((org.jfree.chart.plot.Plot) categoryPlot66);
        org.jfree.chart.LegendItemCollection legendItemCollection69 = categoryPlot64.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent70 = null;
        categoryPlot64.axisChanged(axisChangeEvent70);
        org.jfree.chart.axis.AxisSpace axisSpace72 = categoryPlot64.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset73 = null;
        categoryPlot64.setDataset(categoryDataset73);
        java.awt.Stroke stroke75 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot64.setDomainCrosshairStroke(stroke75);
        java.awt.Stroke stroke77 = categoryPlot64.getRangeGridlineStroke();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent78 = null;
        categoryPlot64.annotationChanged(annotationChangeEvent78);
        org.jfree.chart.plot.CategoryPlot categoryPlot80 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation81 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        categoryPlot80.setOrientation(plotOrientation81);
        categoryPlot64.setOrientation(plotOrientation81);
        org.jfree.chart.util.RectangleEdge rectangleEdge84 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation61, plotOrientation81);
        try {
            double double85 = categoryAxis0.getCategoryMiddle(comparable46, list58, rectangle2D59, rectangleEdge84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid category index: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05d + "'", double1 == 0.05d);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paintArray6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paintArray10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(paintContext17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(paintContext25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(paintArray27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(strokeArray33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(strokeArray38);
        org.junit.Assert.assertNotNull(shapeArray40);
        org.junit.Assert.assertNull(shape42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNull(legendItemCollection52);
        org.junit.Assert.assertNull(comparable53);
        org.junit.Assert.assertNotNull(rectangleEdge54);
        org.junit.Assert.assertNotNull(list58);
        org.junit.Assert.assertNotNull(itemLabelAnchor60);
        org.junit.Assert.assertNotNull(axisLocation61);
        org.junit.Assert.assertNotNull(axisLocation62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(stroke65);
        org.junit.Assert.assertNotNull(stroke67);
        org.junit.Assert.assertNull(legendItemCollection69);
        org.junit.Assert.assertNull(axisSpace72);
        org.junit.Assert.assertNotNull(stroke75);
        org.junit.Assert.assertNotNull(stroke77);
        org.junit.Assert.assertNotNull(plotOrientation81);
        org.junit.Assert.assertNotNull(rectangleEdge84);
    }

    @Test
    public void test148() throws Throwable {
printRuntimeMSG("---RegressionTest0:test148");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        org.jfree.chart.plot.CategoryMarker categoryMarker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        try {
            categoryPlot0.addDomainMarker(0, categoryMarker12, layer13, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test149() throws Throwable {
printRuntimeMSG("---RegressionTest0:test149");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        org.jfree.chart.axis.ValueAxis valueAxis13 = categoryPlot0.getRangeAxis(1);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        try {
            categoryPlot0.drawBackground(graphics2D14, rectangle2D15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(valueAxis13);
    }

    @Test
    public void test150() throws Throwable {
printRuntimeMSG("---RegressionTest0:test150");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.awt.Color color3 = java.awt.Color.getHSBColor((float) 'a', (float) 100, 0.0f);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test151() throws Throwable {
printRuntimeMSG("---RegressionTest0:test151");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.plot.Plot plot10 = categoryPlot0.getRootPlot();
        java.awt.Paint paint11 = null;
        try {
            categoryPlot0.setRangeMinorGridlinePaint(paint11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(plot10);
    }

    @Test
    public void test152() throws Throwable {
printRuntimeMSG("---RegressionTest0:test152");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
    }

    @Test
    public void test153() throws Throwable {
printRuntimeMSG("---RegressionTest0:test153");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot0.getDrawingSupplier();
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        boolean boolean10 = categoryPlot0.isDomainZoomable();
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset11 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup12 = new org.jfree.data.general.DatasetGroup();
        abstractCategoryDataset11.setGroup(datasetGroup12);
        org.jfree.chart.event.DatasetChangeInfo datasetChangeInfo14 = null;
        try {
            org.jfree.data.event.DatasetChangeEvent datasetChangeEvent15 = new org.jfree.data.event.DatasetChangeEvent((java.lang.Object) categoryPlot0, (org.jfree.data.general.Dataset) abstractCategoryDataset11, datasetChangeInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'info' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test154() throws Throwable {
printRuntimeMSG("---RegressionTest0:test154");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Color color2 = java.awt.Color.RED;
        renderAttributes0.setDefaultOutlinePaint((java.awt.Paint) color2);
        java.awt.Shape shape6 = renderAttributes0.getItemShape((int) 'a', (int) ' ');
        java.awt.Paint paint7 = renderAttributes0.getDefaultFillPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo12, point2D13);
        org.jfree.chart.plot.PlotOrientation plotOrientation15 = categoryPlot9.getOrientation();
        categoryPlot9.setNoDataMessage("TextAnchor.HALF_ASCENT_LEFT");
        java.awt.Paint paint18 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray19 = new java.awt.Paint[] { paint18 };
        java.awt.Color color20 = java.awt.Color.BLUE;
        java.awt.Color color21 = java.awt.Color.RED;
        java.awt.Paint paint22 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray23 = new java.awt.Paint[] { color20, color21, paint22 };
        java.awt.Color color24 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel25 = null;
        java.awt.Rectangle rectangle26 = null;
        java.awt.geom.Rectangle2D rectangle2D27 = null;
        java.awt.geom.AffineTransform affineTransform28 = null;
        java.awt.RenderingHints renderingHints29 = null;
        java.awt.PaintContext paintContext30 = color24.createContext(colorModel25, rectangle26, rectangle2D27, affineTransform28, renderingHints29);
        java.awt.Color color31 = java.awt.Color.WHITE;
        java.awt.Color color32 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel33 = null;
        java.awt.Rectangle rectangle34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        java.awt.geom.AffineTransform affineTransform36 = null;
        java.awt.RenderingHints renderingHints37 = null;
        java.awt.PaintContext paintContext38 = color32.createContext(colorModel33, rectangle34, rectangle2D35, affineTransform36, renderingHints37);
        java.awt.Color color39 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray40 = new java.awt.Paint[] { color24, color31, color32, color39 };
        java.awt.Stroke stroke41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke42 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke43 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke44 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke45 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray46 = new java.awt.Stroke[] { stroke41, stroke42, stroke43, stroke44, stroke45 };
        java.awt.Stroke stroke47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke48 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot49 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke50 = categoryPlot49.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray51 = new java.awt.Stroke[] { stroke47, stroke48, stroke50 };
        java.awt.Shape shape52 = null;
        java.awt.Shape[] shapeArray53 = new java.awt.Shape[] { shape52 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier54 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray19, paintArray23, paintArray40, strokeArray46, strokeArray51, shapeArray53);
        java.awt.Shape shape55 = defaultDrawingSupplier54.getNextShape();
        java.awt.Stroke stroke56 = defaultDrawingSupplier54.getNextOutlineStroke();
        java.awt.Stroke stroke57 = defaultDrawingSupplier54.getNextOutlineStroke();
        categoryPlot9.setRangeCrosshairStroke(stroke57);
        java.awt.Stroke stroke59 = categoryPlot9.getRangeCrosshairStroke();
        try {
            renderAttributes0.setSeriesOutlineStroke((-12566464), stroke59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(plotOrientation15);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(paintArray19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(paintArray23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(paintContext30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(paintContext38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(paintArray40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertNotNull(strokeArray46);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(strokeArray51);
        org.junit.Assert.assertNotNull(shapeArray53);
        org.junit.Assert.assertNull(shape55);
        org.junit.Assert.assertNotNull(stroke56);
        org.junit.Assert.assertNotNull(stroke57);
        org.junit.Assert.assertNotNull(stroke59);
    }

    @Test
    public void test155() throws Throwable {
printRuntimeMSG("---RegressionTest0:test155");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        java.awt.Font font7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 0, font7, true);
        java.awt.Paint paint11 = lineAndShapeRenderer2.getSeriesOutlinePaint((int) '4');
        java.awt.Shape shape17 = null;
        java.awt.Color color18 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color20 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem21 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape17, (java.awt.Paint) color18, stroke19, (java.awt.Paint) color20);
        java.awt.Paint paint22 = legendItem21.getLabelPaint();
        java.lang.String str23 = legendItem21.getURLText();
        java.awt.Paint paint24 = legendItem21.getOutlinePaint();
        java.awt.Paint paint25 = legendItem21.getFillPaint();
        java.awt.Stroke stroke26 = legendItem21.getOutlineStroke();
        try {
            lineAndShapeRenderer2.setSeriesOutlineStroke((-1), stroke26, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(paint22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str23.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test156() throws Throwable {
printRuntimeMSG("---RegressionTest0:test156");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.PlotOrientation plotOrientation13 = null;
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge14 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation12, plotOrientation13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'orientation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test157() throws Throwable {
printRuntimeMSG("---RegressionTest0:test157");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        java.awt.Color color8 = org.jfree.chart.ChartColor.LIGHT_MAGENTA;
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color8, false);
        double double11 = lineAndShapeRenderer2.getItemLabelAnchorOffset();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 2.0d + "'", double11 == 2.0d);
    }

    @Test
    public void test158() throws Throwable {
printRuntimeMSG("---RegressionTest0:test158");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getLegendTextPaint((-1));
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke16 = categoryPlot15.getRangeMinorGridlineStroke();
        categoryPlot13.setParent((org.jfree.chart.plot.Plot) categoryPlot15);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot13.getFixedLegendItems();
        java.lang.Comparable comparable19 = categoryPlot13.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge20 = categoryPlot13.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent21 = null;
        categoryPlot13.notifyListeners(plotChangeEvent21);
        boolean boolean23 = categoryPlot13.isOutlineVisible();
        java.awt.Font font24 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot13.setNoDataMessageFont(font24);
        java.awt.Font font26 = categoryPlot13.getNoDataMessageFont();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot13.panRangeAxes((double) (byte) 10, plotRenderingInfo28, point2D29);
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.data.category.CategoryDataset categoryDataset32 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis33 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis33.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis36 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer39 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator40 = lineAndShapeRenderer39.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot(categoryDataset32, categoryAxis33, valueAxis36, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer39);
        boolean boolean42 = categoryAxis33.isTickLabelsVisible();
        double double43 = categoryAxis33.getFixedDimension();
        java.awt.Paint paint45 = categoryAxis33.getTickLabelPaint((java.lang.Comparable) 4.0d);
        categoryAxis31.setTickLabelPaint(paint45);
        categoryAxis31.setTickMarkInsideLength((float) (-1L));
        org.jfree.chart.axis.ValueAxis valueAxis49 = null;
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        try {
            lineAndShapeRenderer2.drawItem(graphics2D10, categoryItemRendererState11, rectangle2D12, categoryPlot13, categoryAxis31, valueAxis49, categoryDataset50, (int) (byte) -1, (-12566464), true, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertNull(comparable19);
        org.junit.Assert.assertNotNull(rectangleEdge20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNull(categoryItemLabelGenerator40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test159() throws Throwable {
printRuntimeMSG("---RegressionTest0:test159");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.chart.plot.Plot plot5 = plotChangeEvent4.getPlot();
        boolean boolean6 = plot5.isSubplot();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test160() throws Throwable {
printRuntimeMSG("---RegressionTest0:test160");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean11 = lineAndShapeRenderer9.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean12 = lineAndShapeRenderer9.getBaseLinesVisible();
        lineAndShapeRenderer9.setAutoPopulateSeriesPaint(false);
        java.awt.Color color16 = org.jfree.chart.ChartColor.DARK_GREEN;
        lineAndShapeRenderer9.setSeriesPaint(2, (java.awt.Paint) color16);
        categoryPlot0.setRangeZeroBaselinePaint((java.awt.Paint) color16);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke21 = categoryPlot20.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke23 = categoryPlot22.getRangeMinorGridlineStroke();
        categoryPlot20.setParent((org.jfree.chart.plot.Plot) categoryPlot22);
        org.jfree.chart.LegendItemCollection legendItemCollection25 = categoryPlot20.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier26 = categoryPlot20.getDrawingSupplier();
        java.awt.Stroke stroke27 = categoryPlot20.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis();
        java.util.List list29 = categoryPlot20.getCategoriesForAxis(categoryAxis28);
        try {
            categoryPlot0.mapDatasetToRangeAxes((int) (short) 1, list29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(legendItemCollection25);
        org.junit.Assert.assertNotNull(drawingSupplier26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(list29);
    }

    @Test
    public void test161() throws Throwable {
printRuntimeMSG("---RegressionTest0:test161");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Paint paint3 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getRangeMarkers((int) (byte) 0, layer5);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation7 = null;
        try {
            categoryPlot0.addAnnotation(categoryAnnotation7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(collection6);
    }

    @Test
    public void test162() throws Throwable {
printRuntimeMSG("---RegressionTest0:test162");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        double double9 = categoryAxis8.getUpperMargin();
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        java.awt.Paint paint11 = categoryAxis8.getLabelPaint();
        int int12 = categoryAxis8.getCategoryLabelPositionOffset();
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke19 = categoryPlot18.getRangeMinorGridlineStroke();
        categoryPlot16.setParent((org.jfree.chart.plot.Plot) categoryPlot18);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = categoryPlot16.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        categoryPlot16.axisChanged(axisChangeEvent22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = categoryPlot16.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        categoryPlot16.setDataset(categoryDataset25);
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot16.setDomainCrosshairStroke(stroke27);
        java.awt.Stroke stroke29 = categoryPlot16.getRangeGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge30 = categoryPlot16.getRangeAxisEdge();
        try {
            double double31 = categoryAxis8.getCategoryMiddle(0, 100, rectangle2D15, rectangleEdge30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(legendItemCollection21);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(rectangleEdge30);
    }

    @Test
    public void test163() throws Throwable {
printRuntimeMSG("---RegressionTest0:test163");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(0);
        java.awt.Shape shape12 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        try {
            lineAndShapeRenderer2.setSeriesShape((-12566464), shape12, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(shape12);
    }

    @Test
    public void test164() throws Throwable {
printRuntimeMSG("---RegressionTest0:test164");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        java.awt.Stroke stroke11 = categoryPlot0.getRangeZeroBaselineStroke();
        try {
            categoryPlot0.mapDatasetToRangeAxis((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires 'index' >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
    }

    @Test
    public void test165() throws Throwable {
printRuntimeMSG("---RegressionTest0:test165");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Color color2 = java.awt.Color.RED;
        renderAttributes0.setDefaultOutlinePaint((java.awt.Paint) color2);
        int int4 = color2.getTransparency();
        int int5 = color2.getRGB();
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-65536) + "'", int5 == (-65536));
    }

    @Test
    public void test166() throws Throwable {
printRuntimeMSG("---RegressionTest0:test166");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue((java.lang.Number) 2);
    }

    @Test
    public void test167() throws Throwable {
printRuntimeMSG("---RegressionTest0:test167");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        double double11 = categoryAxis1.getFixedDimension();
        java.awt.Paint paint13 = categoryAxis1.getTickLabelPaint((java.lang.Comparable) 4.0d);
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor18 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE4;
        org.jfree.chart.axis.AxisLocation axisLocation19 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation20 = axisLocation19.getOpposite();
        boolean boolean21 = itemLabelAnchor18.equals((java.lang.Object) axisLocation19);
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke23 = categoryPlot22.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke25 = categoryPlot24.getRangeMinorGridlineStroke();
        categoryPlot22.setParent((org.jfree.chart.plot.Plot) categoryPlot24);
        org.jfree.chart.LegendItemCollection legendItemCollection27 = categoryPlot22.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent28 = null;
        categoryPlot22.axisChanged(axisChangeEvent28);
        org.jfree.chart.axis.AxisSpace axisSpace30 = categoryPlot22.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset31 = null;
        categoryPlot22.setDataset(categoryDataset31);
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot22.setDomainCrosshairStroke(stroke33);
        java.awt.Stroke stroke35 = categoryPlot22.getRangeGridlineStroke();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent36 = null;
        categoryPlot22.annotationChanged(annotationChangeEvent36);
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation39 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        categoryPlot38.setOrientation(plotOrientation39);
        categoryPlot22.setOrientation(plotOrientation39);
        org.jfree.chart.util.RectangleEdge rectangleEdge42 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation19, plotOrientation39);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo43 = null;
        try {
            org.jfree.chart.axis.AxisState axisState44 = categoryAxis1.draw(graphics2D14, (double) (byte) 100, rectangle2D16, rectangle2D17, rectangleEdge42, plotRenderingInfo43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(itemLabelAnchor18);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertNotNull(axisLocation20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(legendItemCollection27);
        org.junit.Assert.assertNull(axisSpace30);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(plotOrientation39);
        org.junit.Assert.assertNotNull(rectangleEdge42);
    }

    @Test
    public void test168() throws Throwable {
printRuntimeMSG("---RegressionTest0:test168");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.jfree.chart.renderer.RenderAttributes renderAttributes2 = new org.jfree.chart.renderer.RenderAttributes(true);
        java.awt.Color color3 = org.jfree.chart.ChartColor.DARK_GREEN;
        renderAttributes2.setDefaultOutlinePaint((java.awt.Paint) color3);
        java.awt.Color color5 = java.awt.Color.getColor("", color3);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test169() throws Throwable {
printRuntimeMSG("---RegressionTest0:test169");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        int int6 = lineAndShapeRenderer2.getPassCount();
        java.awt.Paint paint10 = lineAndShapeRenderer2.getItemLabelPaint(0, (int) '#', true);
        lineAndShapeRenderer2.setItemLabelAnchorOffset((-1.0d));
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke16 = categoryPlot15.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation17 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation18 = axisLocation17.getOpposite();
        categoryPlot15.setDomainAxisLocation(axisLocation18, false);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis22.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = lineAndShapeRenderer28.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis25, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer28);
        boolean boolean31 = categoryAxis22.isTickLabelsVisible();
        categoryAxis22.setLabelToolTip("hi!");
        boolean boolean34 = categoryAxis22.isVisible();
        org.jfree.chart.axis.ValueAxis valueAxis35 = null;
        org.jfree.data.category.CategoryDataset categoryDataset36 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState40 = null;
        java.awt.geom.Rectangle2D rectangle2D41 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D42 = lineAndShapeRenderer2.createHotSpotBounds(graphics2D13, rectangle2D14, categoryPlot15, categoryAxis22, valueAxis35, categoryDataset36, (-65536), 15, true, categoryItemRendererState40, rectangle2D41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test170() throws Throwable {
printRuntimeMSG("---RegressionTest0:test170");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        boolean boolean1 = barRenderer0.getAutoPopulateSeriesShape();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test171() throws Throwable {
printRuntimeMSG("---RegressionTest0:test171");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int int3 = java.awt.Color.HSBtoRGB((float) (-1L), (float) (-65536), (float) 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test172() throws Throwable {
printRuntimeMSG("---RegressionTest0:test172");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.CENTER;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test173() throws Throwable {
printRuntimeMSG("---RegressionTest0:test173");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.awt.Paint paint11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        lineAndShapeRenderer2.setBaseOutlinePaint(paint11);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) (byte) 10, (int) (short) 100, true);
        org.jfree.chart.text.TextAnchor textAnchor17 = itemLabelPosition16.getRotationAnchor();
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertNotNull(textAnchor17);
    }

    @Test
    public void test174() throws Throwable {
printRuntimeMSG("---RegressionTest0:test174");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Paint paint3 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getRangeMarkers((int) (byte) 0, layer5);
        java.awt.Paint paint7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray8 = new java.awt.Paint[] { paint7 };
        java.awt.Color color9 = java.awt.Color.BLUE;
        java.awt.Color color10 = java.awt.Color.RED;
        java.awt.Paint paint11 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray12 = new java.awt.Paint[] { color9, color10, paint11 };
        java.awt.Color color13 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel14 = null;
        java.awt.Rectangle rectangle15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.AffineTransform affineTransform17 = null;
        java.awt.RenderingHints renderingHints18 = null;
        java.awt.PaintContext paintContext19 = color13.createContext(colorModel14, rectangle15, rectangle2D16, affineTransform17, renderingHints18);
        java.awt.Color color20 = java.awt.Color.WHITE;
        java.awt.Color color21 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel22 = null;
        java.awt.Rectangle rectangle23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        java.awt.geom.AffineTransform affineTransform25 = null;
        java.awt.RenderingHints renderingHints26 = null;
        java.awt.PaintContext paintContext27 = color21.createContext(colorModel22, rectangle23, rectangle2D24, affineTransform25, renderingHints26);
        java.awt.Color color28 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray29 = new java.awt.Paint[] { color13, color20, color21, color28 };
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke31 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray35 = new java.awt.Stroke[] { stroke30, stroke31, stroke32, stroke33, stroke34 };
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke39 = categoryPlot38.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray40 = new java.awt.Stroke[] { stroke36, stroke37, stroke39 };
        java.awt.Shape shape41 = null;
        java.awt.Shape[] shapeArray42 = new java.awt.Shape[] { shape41 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier43 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray8, paintArray12, paintArray29, strokeArray35, strokeArray40, shapeArray42);
        java.awt.Shape shape44 = defaultDrawingSupplier43.getNextShape();
        categoryPlot0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier) defaultDrawingSupplier43, true);
        boolean boolean47 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paintArray8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paintArray12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(paintContext19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(paintContext27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(paintArray29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(strokeArray35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(strokeArray40);
        org.junit.Assert.assertNotNull(shapeArray42);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test175() throws Throwable {
printRuntimeMSG("---RegressionTest0:test175");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String str0 = org.jfree.chart.labels.StandardCategorySeriesLabelGenerator.DEFAULT_LABEL_FORMAT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "{0}" + "'", str0.equals("{0}"));
    }

    @Test
    public void test176() throws Throwable {
printRuntimeMSG("---RegressionTest0:test176");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean10 = sortOrder8.equals((java.lang.Object) categoryPlot9);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = new org.jfree.chart.axis.CategoryAxis();
        double double12 = categoryAxis11.getUpperMargin();
        categoryPlot9.setDomainAxis(categoryAxis11);
        boolean boolean14 = categoryAxis11.isVisible();
        categoryAxis11.configure();
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.05d + "'", double12 == 0.05d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test177() throws Throwable {
printRuntimeMSG("---RegressionTest0:test177");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        java.awt.Font font8 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesShapesVisible((int) (short) 10);
        boolean boolean11 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        try {
            lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition12, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(font8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test178() throws Throwable {
printRuntimeMSG("---RegressionTest0:test178");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes(true);
        keyedObjects0.setObject((java.lang.Comparable) true, (java.lang.Object) true);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke6 = categoryPlot5.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation7 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation8 = axisLocation7.getOpposite();
        categoryPlot5.setDomainAxisLocation(axisLocation8, false);
        boolean boolean11 = categoryPlot5.canSelectByRegion();
        categoryPlot5.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot14.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo17, point2D18);
        categoryPlot14.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot14.getRowRenderingOrder();
        categoryPlot5.setRowRenderingOrder(sortOrder22);
        boolean boolean25 = sortOrder22.equals((java.lang.Object) 4);
        keyedObjects0.sortByObjects(sortOrder22);
        try {
            java.lang.Object obj28 = keyedObjects0.getObject((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 32, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test179() throws Throwable {
printRuntimeMSG("---RegressionTest0:test179");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        java.awt.Color color3 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        try {
            barRenderer0.setSeriesPaint((-16777216), (java.awt.Paint) color3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test180() throws Throwable {
printRuntimeMSG("---RegressionTest0:test180");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearAnnotations();
        int int7 = categoryPlot0.getCrosshairDatasetIndex();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test181() throws Throwable {
printRuntimeMSG("---RegressionTest0:test181");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        boolean boolean0 = org.jfree.chart.renderer.category.BarRenderer.getDefaultShadowsVisible();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + true + "'", boolean0 == true);
    }

    @Test
    public void test182() throws Throwable {
printRuntimeMSG("---RegressionTest0:test182");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        java.awt.Stroke stroke11 = categoryPlot0.getRangeZeroBaselineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot0.getRenderer(10);
        org.jfree.chart.axis.AxisLocation axisLocation15 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation16 = axisLocation15.getOpposite();
        categoryPlot0.setRangeAxisLocation((int) (byte) 1, axisLocation16);
        int int18 = categoryPlot0.getRangeAxisCount();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(categoryItemRenderer13);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test183() throws Throwable {
printRuntimeMSG("---RegressionTest0:test183");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator11, true);
        lineAndShapeRenderer2.setSeriesShapesVisible(4, true);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test184() throws Throwable {
printRuntimeMSG("---RegressionTest0:test184");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent5 = null;
        categoryPlot2.annotationChanged(annotationChangeEvent5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer9.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer9.setBaseToolTipGenerator(categoryToolTipGenerator11);
        java.awt.Paint paint14 = lineAndShapeRenderer9.lookupSeriesOutlinePaint((int) (byte) 1);
        categoryPlot2.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer9);
        org.jfree.chart.plot.Marker marker16 = null;
        try {
            boolean boolean17 = categoryPlot2.removeRangeMarker(marker16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test185() throws Throwable {
printRuntimeMSG("---RegressionTest0:test185");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE3;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test186() throws Throwable {
printRuntimeMSG("---RegressionTest0:test186");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        categoryAxis1.setLabelToolTip("hi!");
        boolean boolean13 = categoryAxis1.isVisible();
        categoryAxis1.setMaximumCategoryLabelWidthRatio((float) 10L);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryAxis1.getLabelInsets();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(rectangleInsets16);
    }

    @Test
    public void test187() throws Throwable {
printRuntimeMSG("---RegressionTest0:test187");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        java.awt.Paint paint11 = lineAndShapeRenderer2.getItemOutlinePaint((int) (short) 10, (int) (byte) 10, false);
        lineAndShapeRenderer2.setDrawOutlines(true);
        org.jfree.chart.axis.AxisLocation axisLocation14 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator15 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        boolean boolean16 = axisLocation14.equals((java.lang.Object) standardCategorySeriesLabelGenerator15);
        lineAndShapeRenderer2.setLegendItemToolTipGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator15);
        java.awt.Graphics2D graphics2D18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke20 = categoryPlot19.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis(valueAxis21);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot19.getRangeAxisLocation((-12566464));
        java.awt.Image image26 = categoryPlot19.getBackgroundImage();
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke31 = categoryPlot30.getRangeMinorGridlineStroke();
        boolean boolean32 = categoryPlot30.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.PlotChangeListener plotChangeListener33 = null;
        categoryPlot30.removeChangeListener(plotChangeListener33);
        org.jfree.chart.renderer.RenderAttributes renderAttributes35 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint36 = renderAttributes35.getDefaultLabelPaint();
        java.awt.Color color37 = java.awt.Color.RED;
        renderAttributes35.setDefaultOutlinePaint((java.awt.Paint) color37);
        categoryPlot30.setDomainGridlinePaint((java.awt.Paint) color37);
        int int40 = color37.getTransparency();
        java.awt.Color color42 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem43 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color42);
        java.lang.String str44 = legendItem43.getToolTipText();
        java.awt.Stroke stroke45 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem43.setOutlineStroke(stroke45);
        try {
            lineAndShapeRenderer2.drawRangeLine(graphics2D18, categoryPlot19, valueAxis27, rectangle2D28, (double) (byte) 10, (java.awt.Paint) color37, stroke45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertNull(image26);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(paint36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(stroke45);
    }

    @Test
    public void test188() throws Throwable {
printRuntimeMSG("---RegressionTest0:test188");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) '4', (int) '4', false);
        lineAndShapeRenderer2.setDefaultEntityRadius(3);
        java.awt.Font font12 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNull(categoryURLGenerator13);
    }

    @Test
    public void test189() throws Throwable {
printRuntimeMSG("---RegressionTest0:test189");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer2.getToolTipGenerator((-65536), 4, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
    }

    @Test
    public void test190() throws Throwable {
printRuntimeMSG("---RegressionTest0:test190");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.jfree.chart.util.UnitType unitType0 = org.jfree.chart.util.UnitType.RELATIVE;
        org.junit.Assert.assertNotNull(unitType0);
    }

    @Test
    public void test191() throws Throwable {
printRuntimeMSG("---RegressionTest0:test191");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        boolean boolean9 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = null;
        try {
            lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test192() throws Throwable {
printRuntimeMSG("---RegressionTest0:test192");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        double double9 = categoryAxis8.getUpperMargin();
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (short) -1, 2.0d, plotRenderingInfo13, point2D14);
        boolean boolean16 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis18.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer24.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis21, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer24);
        boolean boolean27 = categoryAxis18.isTickLabelsVisible();
        double double28 = categoryAxis18.getFixedDimension();
        java.awt.Paint paint30 = categoryAxis18.getTickLabelPaint((java.lang.Comparable) 4.0d);
        org.jfree.chart.util.RectangleInsets rectangleInsets31 = categoryAxis18.getTickLabelInsets();
        categoryPlot0.setAxisOffset(rectangleInsets31);
        categoryPlot0.setDomainCrosshairColumnKey((java.lang.Comparable) 96.0d);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(rectangleInsets31);
    }

    @Test
    public void test193() throws Throwable {
printRuntimeMSG("---RegressionTest0:test193");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.jfree.chart.renderer.category.BarPainter barPainter0 = org.jfree.chart.renderer.category.BarRenderer.getDefaultBarPainter();
        org.junit.Assert.assertNotNull(barPainter0);
    }

    @Test
    public void test194() throws Throwable {
printRuntimeMSG("---RegressionTest0:test194");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer11.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator13);
        java.awt.Font font16 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer11.setSeriesItemLabelFont((int) (short) 0, font16, true);
        lineAndShapeRenderer2.setBaseLegendTextFont(font16);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = lineAndShapeRenderer2.getLegendItems();
        boolean boolean21 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        java.awt.Shape shape23 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_BOX;
        try {
            lineAndShapeRenderer2.setSeriesShape((-16777216), shape23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(shape23);
    }

    @Test
    public void test195() throws Throwable {
printRuntimeMSG("---RegressionTest0:test195");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        java.awt.Paint paint7 = lineAndShapeRenderer2.lookupSeriesOutlinePaint((int) (byte) 1);
        java.awt.Font font8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        lineAndShapeRenderer2.setBaseLegendTextFont(font8);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font8);
    }

    @Test
    public void test196() throws Throwable {
printRuntimeMSG("---RegressionTest0:test196");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_INSETS;
        org.junit.Assert.assertNotNull(rectangleInsets0);
    }

    @Test
    public void test197() throws Throwable {
printRuntimeMSG("---RegressionTest0:test197");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.plot.Marker marker10 = null;
        org.jfree.chart.util.Layer layer11 = null;
        try {
            categoryPlot9.addRangeMarker(marker10, layer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
    }

    @Test
    public void test198() throws Throwable {
printRuntimeMSG("---RegressionTest0:test198");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (short) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (byte) 10, categoryURLGenerator14);
        org.jfree.chart.LegendItem legendItem18 = lineAndShapeRenderer2.getLegendItem((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(legendItem18);
    }

    @Test
    public void test199() throws Throwable {
printRuntimeMSG("---RegressionTest0:test199");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        java.awt.Paint paint10 = barRenderer0.getShadowPaint();
        java.awt.Shape shape11 = barRenderer0.getBaseShape();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke15 = categoryPlot14.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        categoryPlot14.setParent((org.jfree.chart.plot.Plot) categoryPlot16);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = categoryPlot14.getFixedLegendItems();
        java.lang.Comparable comparable20 = categoryPlot14.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge21 = categoryPlot14.getRangeAxisEdge();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke23 = categoryPlot22.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke25 = categoryPlot24.getRangeMinorGridlineStroke();
        categoryPlot22.setParent((org.jfree.chart.plot.Plot) categoryPlot24);
        org.jfree.chart.LegendItemCollection legendItemCollection27 = categoryPlot22.getFixedLegendItems();
        java.lang.Comparable comparable28 = categoryPlot22.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge29 = categoryPlot22.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent30 = null;
        categoryPlot22.notifyListeners(plotChangeEvent30);
        org.jfree.chart.axis.CategoryAxis categoryAxis32 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis32.setMinorTickMarkOutsideLength((float) (short) 0);
        float float35 = categoryAxis32.getMinorTickMarkInsideLength();
        java.util.List list36 = categoryPlot22.getCategoriesForAxis(categoryAxis32);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.data.category.CategoryDataset categoryDataset38 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState42 = null;
        java.awt.geom.Rectangle2D rectangle2D43 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D44 = barRenderer0.createHotSpotBounds(graphics2D12, rectangle2D13, categoryPlot14, categoryAxis32, valueAxis37, categoryDataset38, (-1), 1, true, categoryItemRendererState42, rectangle2D43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(legendItemCollection19);
        org.junit.Assert.assertNull(comparable20);
        org.junit.Assert.assertNotNull(rectangleEdge21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNull(legendItemCollection27);
        org.junit.Assert.assertNull(comparable28);
        org.junit.Assert.assertNotNull(rectangleEdge29);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + 0.0f + "'", float35 == 0.0f);
        org.junit.Assert.assertNotNull(list36);
    }

    @Test
    public void test200() throws Throwable {
printRuntimeMSG("---RegressionTest0:test200");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean6 = lineAndShapeRenderer4.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean7 = lineAndShapeRenderer4.getBaseLinesVisible();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer4.setBaseLegendShape(shape8);
        renderAttributes0.setSeriesShape((int) ' ', shape8);
        org.jfree.chart.entity.ChartEntity chartEntity12 = new org.jfree.chart.entity.ChartEntity(shape8, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        org.jfree.chart.imagemap.ToolTipTagFragmentGenerator toolTipTagFragmentGenerator13 = null;
        org.jfree.chart.imagemap.URLTagFragmentGenerator uRLTagFragmentGenerator14 = null;
        try {
            java.lang.String str15 = chartEntity12.getImageMapAreaTag(toolTipTagFragmentGenerator13, uRLTagFragmentGenerator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shape8);
    }

    @Test
    public void test201() throws Throwable {
printRuntimeMSG("---RegressionTest0:test201");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        categoryPlot0.setForegroundAlpha((float) '#');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = null;
        lineAndShapeRenderer12.setSeriesPositiveItemLabelPosition(0, itemLabelPosition14);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer12.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean18 = lineAndShapeRenderer12.getUseFillPaint();
        java.lang.Boolean boolean20 = lineAndShapeRenderer12.getSeriesItemLabelsVisible(0);
        categoryPlot0.setRenderer(3, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer12, false);
        boolean boolean23 = lineAndShapeRenderer12.getAutoPopulateSeriesShape();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test202() throws Throwable {
printRuntimeMSG("---RegressionTest0:test202");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        int int7 = categoryPlot0.getWeight();
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = categoryPlot0.getOrientation();
        categoryPlot0.setWeight((int) (short) 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(plotOrientation8);
    }

    @Test
    public void test203() throws Throwable {
printRuntimeMSG("---RegressionTest0:test203");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot0.getDataRange(valueAxis10);
        org.junit.Assert.assertNull(range11);
    }

    @Test
    public void test204() throws Throwable {
printRuntimeMSG("---RegressionTest0:test204");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Paint paint3 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getRangeMarkers((int) (byte) 0, layer5);
        java.awt.Paint paint7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray8 = new java.awt.Paint[] { paint7 };
        java.awt.Color color9 = java.awt.Color.BLUE;
        java.awt.Color color10 = java.awt.Color.RED;
        java.awt.Paint paint11 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray12 = new java.awt.Paint[] { color9, color10, paint11 };
        java.awt.Color color13 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel14 = null;
        java.awt.Rectangle rectangle15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.AffineTransform affineTransform17 = null;
        java.awt.RenderingHints renderingHints18 = null;
        java.awt.PaintContext paintContext19 = color13.createContext(colorModel14, rectangle15, rectangle2D16, affineTransform17, renderingHints18);
        java.awt.Color color20 = java.awt.Color.WHITE;
        java.awt.Color color21 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel22 = null;
        java.awt.Rectangle rectangle23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        java.awt.geom.AffineTransform affineTransform25 = null;
        java.awt.RenderingHints renderingHints26 = null;
        java.awt.PaintContext paintContext27 = color21.createContext(colorModel22, rectangle23, rectangle2D24, affineTransform25, renderingHints26);
        java.awt.Color color28 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray29 = new java.awt.Paint[] { color13, color20, color21, color28 };
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke31 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray35 = new java.awt.Stroke[] { stroke30, stroke31, stroke32, stroke33, stroke34 };
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke39 = categoryPlot38.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray40 = new java.awt.Stroke[] { stroke36, stroke37, stroke39 };
        java.awt.Shape shape41 = null;
        java.awt.Shape[] shapeArray42 = new java.awt.Shape[] { shape41 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier43 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray8, paintArray12, paintArray29, strokeArray35, strokeArray40, shapeArray42);
        java.awt.Shape shape44 = defaultDrawingSupplier43.getNextShape();
        categoryPlot0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier) defaultDrawingSupplier43, true);
        java.lang.Object obj47 = defaultDrawingSupplier43.clone();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paintArray8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paintArray12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(paintContext19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(paintContext27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(paintArray29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(strokeArray35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(strokeArray40);
        org.junit.Assert.assertNotNull(shapeArray42);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test205() throws Throwable {
printRuntimeMSG("---RegressionTest0:test205");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = lineAndShapeRenderer2.getSeriesURLGenerator((int) (byte) 0);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(categoryURLGenerator9);
    }

    @Test
    public void test206() throws Throwable {
printRuntimeMSG("---RegressionTest0:test206");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        java.lang.Comparable comparable2 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer5 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean7 = lineAndShapeRenderer5.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean8 = lineAndShapeRenderer5.getBaseLinesVisible();
        lineAndShapeRenderer5.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer5.setAutoPopulateSeriesShape(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = null;
        lineAndShapeRenderer5.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator14, true);
        java.awt.Shape shape18 = lineAndShapeRenderer5.lookupSeriesShape((int) '4');
        boolean boolean19 = lineAndShapeRenderer5.getDataBoundsIncludesVisibleSeriesOnly();
        try {
            keyedObjects0.insertValue(2, comparable2, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test207() throws Throwable {
printRuntimeMSG("---RegressionTest0:test207");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.Object obj0 = null;
        try {
            org.jfree.chart.event.ChartChangeEvent chartChangeEvent1 = new org.jfree.chart.event.ChartChangeEvent(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null source");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
printRuntimeMSG("---RegressionTest0:test208");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.text.AttributedString attributedString0 = null;
        org.jfree.chart.renderer.RenderAttributes renderAttributes4 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean10 = lineAndShapeRenderer8.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean11 = lineAndShapeRenderer8.getBaseLinesVisible();
        java.awt.Shape shape12 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer8.setBaseLegendShape(shape12);
        renderAttributes4.setSeriesShape((int) ' ', shape12);
        java.awt.Color color15 = org.jfree.chart.ChartColor.DARK_BLUE;
        int int16 = color15.getBlue();
        java.awt.color.ColorSpace colorSpace17 = color15.getColorSpace();
        try {
            org.jfree.chart.LegendItem legendItem18 = new org.jfree.chart.LegendItem(attributedString0, "GradientPaintTransformType.CENTER_VERTICAL", "ItemLabelAnchor.OUTSIDE9", "TextAnchor.HALF_ASCENT_LEFT", shape12, (java.awt.Paint) color15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'label' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 192 + "'", int16 == 192);
        org.junit.Assert.assertNotNull(colorSpace17);
    }

    @Test
    public void test209() throws Throwable {
printRuntimeMSG("---RegressionTest0:test209");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes(true);
        keyedObjects0.setObject((java.lang.Comparable) true, (java.lang.Object) true);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke6 = categoryPlot5.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation7 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation8 = axisLocation7.getOpposite();
        categoryPlot5.setDomainAxisLocation(axisLocation8, false);
        boolean boolean11 = categoryPlot5.canSelectByRegion();
        categoryPlot5.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot14.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo17, point2D18);
        categoryPlot14.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot14.getRowRenderingOrder();
        categoryPlot5.setRowRenderingOrder(sortOrder22);
        boolean boolean25 = sortOrder22.equals((java.lang.Object) 4);
        keyedObjects0.sortByObjects(sortOrder22);
        java.util.List list27 = keyedObjects0.getKeys();
        try {
            java.lang.Object obj29 = keyedObjects0.getObject((java.lang.Comparable) 96.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (96.0) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test210() throws Throwable {
printRuntimeMSG("---RegressionTest0:test210");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        java.awt.Color color6 = org.jfree.chart.ChartColor.LIGHT_BLUE;
        lineAndShapeRenderer2.setSeriesPaint(0, (java.awt.Paint) color6);
        java.awt.Graphics2D graphics2D8 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke10 = categoryPlot9.getRangeMinorGridlineStroke();
        boolean boolean11 = categoryPlot9.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        categoryPlot9.drawBackgroundImage(graphics2D12, rectangle2D13);
        categoryPlot9.clearAnnotations();
        boolean boolean16 = categoryPlot9.isRangeMinorGridlinesVisible();
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        try {
            lineAndShapeRenderer2.drawOutline(graphics2D8, categoryPlot9, rectangle2D17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test211() throws Throwable {
printRuntimeMSG("---RegressionTest0:test211");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer11.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator13);
        java.awt.Font font16 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer11.setSeriesItemLabelFont((int) (short) 0, font16, true);
        lineAndShapeRenderer2.setBaseLegendTextFont(font16);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Color color22 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem23 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color22);
        legendItemCollection20.add(legendItem23);
        try {
            org.jfree.chart.LegendItem legendItem26 = legendItemCollection20.get(255);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 255, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test212() throws Throwable {
printRuntimeMSG("---RegressionTest0:test212");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.awt.Paint paint0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray1 = new java.awt.Paint[] { paint0 };
        java.awt.Color color2 = java.awt.Color.BLUE;
        java.awt.Color color3 = java.awt.Color.RED;
        java.awt.Paint paint4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray5 = new java.awt.Paint[] { color2, color3, paint4 };
        java.awt.Color color6 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel7 = null;
        java.awt.Rectangle rectangle8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.AffineTransform affineTransform10 = null;
        java.awt.RenderingHints renderingHints11 = null;
        java.awt.PaintContext paintContext12 = color6.createContext(colorModel7, rectangle8, rectangle2D9, affineTransform10, renderingHints11);
        java.awt.Color color13 = java.awt.Color.WHITE;
        java.awt.Color color14 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel15 = null;
        java.awt.Rectangle rectangle16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        java.awt.geom.AffineTransform affineTransform18 = null;
        java.awt.RenderingHints renderingHints19 = null;
        java.awt.PaintContext paintContext20 = color14.createContext(colorModel15, rectangle16, rectangle2D17, affineTransform18, renderingHints19);
        java.awt.Color color21 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray22 = new java.awt.Paint[] { color6, color13, color14, color21 };
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke24 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray28 = new java.awt.Stroke[] { stroke23, stroke24, stroke25, stroke26, stroke27 };
        java.awt.Stroke stroke29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke32 = categoryPlot31.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray33 = new java.awt.Stroke[] { stroke29, stroke30, stroke32 };
        java.awt.Shape shape34 = null;
        java.awt.Shape[] shapeArray35 = new java.awt.Shape[] { shape34 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier36 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray1, paintArray5, paintArray22, strokeArray28, strokeArray33, shapeArray35);
        java.lang.Object obj37 = defaultDrawingSupplier36.clone();
        java.awt.Paint paint38 = defaultDrawingSupplier36.getNextPaint();
        org.junit.Assert.assertNotNull(paint0);
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNotNull(paint4);
        org.junit.Assert.assertNotNull(paintArray5);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(paintContext12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(paintContext20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(paintArray22);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(strokeArray28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(strokeArray33);
        org.junit.Assert.assertNotNull(shapeArray35);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertNotNull(paint38);
    }

    @Test
    public void test213() throws Throwable {
printRuntimeMSG("---RegressionTest0:test213");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        categoryAxis1.setVisible(false);
        java.lang.String str13 = categoryAxis1.getCategoryLabelToolTip((java.lang.Comparable) 0);
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions14 = categoryAxis1.getCategoryLabelPositions();
        categoryAxis1.setAxisLineVisible(false);
        java.awt.Stroke stroke17 = categoryAxis1.getTickMarkStroke();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(categoryLabelPositions14);
        org.junit.Assert.assertNotNull(stroke17);
    }

    @Test
    public void test214() throws Throwable {
printRuntimeMSG("---RegressionTest0:test214");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        int int0 = org.jfree.chart.util.AbstractObjectList.DEFAULT_INITIAL_CAPACITY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test215() throws Throwable {
printRuntimeMSG("---RegressionTest0:test215");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        boolean boolean11 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.panRangeAxes(0.0d, plotRenderingInfo13, point2D14);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test216() throws Throwable {
printRuntimeMSG("---RegressionTest0:test216");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.BASELINE_LEFT;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test217() throws Throwable {
printRuntimeMSG("---RegressionTest0:test217");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.net.URL uRL0 = null;
        java.net.URLClassLoader uRLClassLoader1 = null;
        try {
            org.jfree.chart.util.ResourceBundleWrapper.removeCodeBase(uRL0, uRLClassLoader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test218() throws Throwable {
printRuntimeMSG("---RegressionTest0:test218");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Color color2 = java.awt.Color.RED;
        renderAttributes0.setDefaultOutlinePaint((java.awt.Paint) color2);
        java.awt.Shape shape6 = renderAttributes0.getItemShape((int) 'a', (int) ' ');
        java.awt.Paint paint7 = renderAttributes0.getDefaultFillPaint();
        java.lang.Boolean boolean8 = renderAttributes0.getDefaultCreateEntity();
        java.awt.Paint paint10 = renderAttributes0.getSeriesPaint((-1));
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test219() throws Throwable {
printRuntimeMSG("---RegressionTest0:test219");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.jfree.data.UnknownKeyException unknownKeyException1 = new org.jfree.data.UnknownKeyException("TextAnchor.HALF_ASCENT_LEFT");
        java.lang.Throwable[] throwableArray2 = unknownKeyException1.getSuppressed();
        java.lang.String str3 = unknownKeyException1.toString();
        org.jfree.data.UnknownKeyException unknownKeyException5 = new org.jfree.data.UnknownKeyException("TextAnchor.HALF_ASCENT_LEFT");
        unknownKeyException1.addSuppressed((java.lang.Throwable) unknownKeyException5);
        java.lang.Throwable throwable7 = null;
        try {
            unknownKeyException5.addSuppressed(throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str3.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
    }

    @Test
    public void test220() throws Throwable {
printRuntimeMSG("---RegressionTest0:test220");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        lineAndShapeRenderer10.setSeriesPositiveItemLabelPosition(0, itemLabelPosition12);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer10.setLegendItemToolTipGenerator(categorySeriesLabelGenerator14);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        boolean boolean17 = lineAndShapeRenderer10.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        java.lang.Object obj19 = lineAndShapeRenderer10.clone();
        categoryPlot0.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer10, true);
        org.jfree.chart.plot.Marker marker22 = null;
        org.jfree.chart.util.Layer layer23 = null;
        try {
            boolean boolean24 = categoryPlot0.removeRangeMarker(marker22, layer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test221() throws Throwable {
printRuntimeMSG("---RegressionTest0:test221");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean6 = lineAndShapeRenderer4.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean7 = lineAndShapeRenderer4.getBaseLinesVisible();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer4.setBaseLegendShape(shape8);
        renderAttributes0.setSeriesShape((int) ' ', shape8);
        org.jfree.chart.entity.ChartEntity chartEntity12 = new org.jfree.chart.entity.ChartEntity(shape8, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        org.jfree.chart.util.RectangleInsets rectangleInsets13 = org.jfree.chart.util.RectangleInsets.ZERO_INSETS;
        boolean boolean14 = chartEntity12.equals((java.lang.Object) rectangleInsets13);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(rectangleInsets13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test222() throws Throwable {
printRuntimeMSG("---RegressionTest0:test222");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis(valueAxis2);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getRangeAxisLocation((-12566464));
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setDomainCrosshairVisible(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke12 = categoryPlot11.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = null;
        categoryPlot11.setRenderer(categoryItemRenderer13);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent15 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot11);
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis17.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer23.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis20, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer23);
        java.util.List list26 = categoryPlot11.getCategoriesForAxis(categoryAxis17);
        try {
            categoryPlot0.mapDatasetToDomainAxes(0, list26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(image7);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNotNull(list26);
    }

    @Test
    public void test223() throws Throwable {
printRuntimeMSG("---RegressionTest0:test223");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        double double0 = org.jfree.chart.renderer.category.BarRenderer.BAR_OUTLINE_WIDTH_THRESHOLD;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 3.0d + "'", double0 == 3.0d);
    }

    @Test
    public void test224() throws Throwable {
printRuntimeMSG("---RegressionTest0:test224");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.lang.Number number0 = org.jfree.chart.plot.Plot.ZERO;
        org.junit.Assert.assertTrue("'" + number0 + "' != '" + 0 + "'", number0.equals(0));
    }

    @Test
    public void test225() throws Throwable {
printRuntimeMSG("---RegressionTest0:test225");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        java.awt.Graphics2D graphics2D6 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke8 = categoryPlot7.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke10 = categoryPlot9.getRangeMinorGridlineStroke();
        categoryPlot7.setParent((org.jfree.chart.plot.Plot) categoryPlot9);
        org.jfree.chart.plot.Plot plot12 = categoryPlot7.getParent();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer15.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator17 = null;
        lineAndShapeRenderer15.setBaseToolTipGenerator(categoryToolTipGenerator17);
        java.awt.Font font20 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer15.setSeriesItemLabelFont((int) (short) 0, font20, true);
        java.lang.Boolean boolean24 = lineAndShapeRenderer15.getSeriesCreateEntities((int) 'a');
        java.awt.Paint paint25 = lineAndShapeRenderer15.getBaseItemLabelPaint();
        categoryPlot7.setRangeMinorGridlinePaint(paint25);
        org.jfree.chart.plot.CategoryPlot categoryPlot27 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo30 = null;
        java.awt.geom.Point2D point2D31 = null;
        categoryPlot27.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo30, point2D31);
        categoryPlot27.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder35 = categoryPlot27.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean37 = sortOrder35.equals((java.lang.Object) categoryPlot36);
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = new org.jfree.chart.axis.CategoryAxis();
        double double39 = categoryAxis38.getUpperMargin();
        categoryPlot36.setDomainAxis(categoryAxis38);
        org.jfree.chart.plot.CategoryMarker categoryMarker41 = null;
        java.awt.geom.Rectangle2D rectangle2D42 = null;
        try {
            lineAndShapeRenderer2.drawDomainMarker(graphics2D6, categoryPlot7, categoryAxis38, categoryMarker41, rectangle2D42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(plot12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(sortOrder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.05d + "'", double39 == 0.05d);
    }

    @Test
    public void test226() throws Throwable {
printRuntimeMSG("---RegressionTest0:test226");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.Locale locale1 = null;
        try {
            java.util.ResourceBundle resourceBundle2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("ItemLabelAnchor.OUTSIDE9", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test227() throws Throwable {
printRuntimeMSG("---RegressionTest0:test227");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        try {
            defaultCategoryDataset0.removeColumn((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
printRuntimeMSG("---RegressionTest0:test228");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.HALF_ASCENT_CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test229() throws Throwable {
printRuntimeMSG("---RegressionTest0:test229");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        try {
            java.lang.Object obj2 = keyedObjects0.getObject((java.lang.Comparable) 10);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (10) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
    }

    @Test
    public void test230() throws Throwable {
printRuntimeMSG("---RegressionTest0:test230");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.BOTTOM_LEFT;
        java.lang.String str1 = textAnchor0.toString();
        org.junit.Assert.assertNotNull(textAnchor0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "TextAnchor.BOTTOM_LEFT" + "'", str1.equals("TextAnchor.BOTTOM_LEFT"));
    }

    @Test
    public void test231() throws Throwable {
printRuntimeMSG("---RegressionTest0:test231");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = null;
        lineAndShapeRenderer11.setSeriesPositiveItemLabelPosition(0, itemLabelPosition13);
        int int15 = lineAndShapeRenderer11.getPassCount();
        java.awt.Paint paint19 = lineAndShapeRenderer11.getItemLabelPaint(0, (int) '#', true);
        try {
            lineAndShapeRenderer2.setSeriesFillPaint((-65536), paint19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(paint19);
    }

    @Test
    public void test232() throws Throwable {
printRuntimeMSG("---RegressionTest0:test232");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Stroke stroke4 = renderAttributes0.getItemStroke((int) (byte) 10, (int) 'a');
        java.awt.Paint paint7 = renderAttributes0.getItemPaint(192, 255);
        java.awt.Paint paint9 = renderAttributes0.getSeriesFillPaint(1);
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test233() throws Throwable {
printRuntimeMSG("---RegressionTest0:test233");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = lineAndShapeRenderer8.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        lineAndShapeRenderer8.setBaseToolTipGenerator(categoryToolTipGenerator10);
        java.awt.Font font13 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 0, font13, true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer8.getSeriesCreateEntities((int) 'a');
        java.awt.Paint paint18 = lineAndShapeRenderer8.getBaseItemLabelPaint();
        categoryPlot0.setRangeMinorGridlinePaint(paint18);
        boolean boolean20 = categoryPlot0.isRangeZoomable();
        org.jfree.chart.plot.CategoryMarker categoryMarker21 = null;
        try {
            categoryPlot0.addDomainMarker(categoryMarker21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test234() throws Throwable {
printRuntimeMSG("---RegressionTest0:test234");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = lineAndShapeRenderer2.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = lineAndShapeRenderer2.getSeriesURLGenerator(0);
        double double8 = lineAndShapeRenderer2.getItemMargin();
        java.awt.Stroke stroke10 = lineAndShapeRenderer2.lookupSeriesOutlineStroke(100);
        java.awt.Shape shape12 = null;
        lineAndShapeRenderer2.setLegendShape(2, shape12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(stroke10);
    }

    @Test
    public void test235() throws Throwable {
printRuntimeMSG("---RegressionTest0:test235");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int1 = defaultCategoryDataset0.getRowCount();
        try {
            boolean boolean4 = defaultCategoryDataset0.isSelected((int) (byte) -1, (-65536));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test236() throws Throwable {
printRuntimeMSG("---RegressionTest0:test236");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        try {
            boolean boolean3 = defaultCategoryDataset0.isSelected(255, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 255, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test237() throws Throwable {
printRuntimeMSG("---RegressionTest0:test237");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        boolean boolean10 = lineAndShapeRenderer2.isSeriesItemLabelsVisible(0);
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke13 = categoryPlot12.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke15 = categoryPlot14.getRangeMinorGridlineStroke();
        categoryPlot12.setParent((org.jfree.chart.plot.Plot) categoryPlot14);
        org.jfree.chart.LegendItemCollection legendItemCollection17 = categoryPlot12.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent18 = null;
        categoryPlot12.axisChanged(axisChangeEvent18);
        org.jfree.chart.axis.AxisSpace axisSpace20 = categoryPlot12.getFixedRangeAxisSpace();
        categoryPlot12.configureDomainAxes();
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        try {
            lineAndShapeRenderer2.drawBackground(graphics2D11, categoryPlot12, rectangle2D22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(legendItemCollection17);
        org.junit.Assert.assertNull(axisSpace20);
    }

    @Test
    public void test238() throws Throwable {
printRuntimeMSG("---RegressionTest0:test238");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        java.awt.Graphics2D graphics2D4 = null;
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke7 = categoryPlot6.getRangeMinorGridlineStroke();
        boolean boolean8 = categoryPlot6.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.PlotChangeListener plotChangeListener9 = null;
        categoryPlot6.removeChangeListener(plotChangeListener9);
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint12 = renderAttributes11.getDefaultLabelPaint();
        java.awt.Color color13 = java.awt.Color.RED;
        renderAttributes11.setDefaultOutlinePaint((java.awt.Paint) color13);
        categoryPlot6.setDomainGridlinePaint((java.awt.Paint) color13);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = null;
        lineAndShapeRenderer18.setSeriesPositiveItemLabelPosition(0, itemLabelPosition20);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = lineAndShapeRenderer18.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean24 = lineAndShapeRenderer18.getUseFillPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = lineAndShapeRenderer27.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator29 = null;
        lineAndShapeRenderer27.setBaseToolTipGenerator(categoryToolTipGenerator29);
        java.awt.Font font32 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer27.setSeriesItemLabelFont((int) (short) 0, font32, true);
        lineAndShapeRenderer18.setBaseLegendTextFont(font32);
        org.jfree.chart.LegendItemCollection legendItemCollection36 = lineAndShapeRenderer18.getLegendItems();
        categoryPlot6.setFixedLegendItems(legendItemCollection36);
        org.jfree.chart.axis.CategoryAxis categoryAxis38 = null;
        org.jfree.chart.axis.ValueAxis valueAxis39 = null;
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset40 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState44 = null;
        try {
            boolean boolean45 = barRenderer0.hitTest((double) 1, (double) 100, graphics2D4, rectangle2D5, categoryPlot6, categoryAxis38, valueAxis39, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset40, 8, (int) '4', false, categoryItemRendererState44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator28);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(legendItemCollection36);
    }

    @Test
    public void test239() throws Throwable {
printRuntimeMSG("---RegressionTest0:test239");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_YELLOW;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test240() throws Throwable {
printRuntimeMSG("---RegressionTest0:test240");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        try {
            defaultCategoryDataset0.removeColumn((java.lang.Comparable) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
printRuntimeMSG("---RegressionTest0:test241");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot0.getRowRenderingOrder();
        java.awt.Paint paint9 = categoryPlot0.getRangeZeroBaselinePaint();
        java.awt.Paint paint10 = null;
        try {
            categoryPlot0.setRangeMinorGridlinePaint(paint10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'paint' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test242() throws Throwable {
printRuntimeMSG("---RegressionTest0:test242");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        boolean boolean8 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator9 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke12 = categoryPlot11.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        categoryPlot11.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        org.jfree.chart.plot.Plot plot16 = categoryPlot11.getParent();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer19.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = null;
        lineAndShapeRenderer19.setBaseToolTipGenerator(categoryToolTipGenerator21);
        java.awt.Font font24 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer19.setSeriesItemLabelFont((int) (short) 0, font24, true);
        java.lang.Boolean boolean28 = lineAndShapeRenderer19.getSeriesCreateEntities((int) 'a');
        java.awt.Paint paint29 = lineAndShapeRenderer19.getBaseItemLabelPaint();
        categoryPlot11.setRangeMinorGridlinePaint(paint29);
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot11);
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator34 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator34);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test243() throws Throwable {
printRuntimeMSG("---RegressionTest0:test243");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getLegendTextPaint((-1));
        java.awt.Font font11 = lineAndShapeRenderer2.lookupLegendTextFont(0);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNull(font11);
    }

    @Test
    public void test244() throws Throwable {
printRuntimeMSG("---RegressionTest0:test244");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getDomainMarkers(2, layer13);
        int int15 = categoryPlot0.getCrosshairDatasetIndex();
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        try {
            boolean boolean19 = categoryPlot0.removeRangeMarker((int) (byte) 100, marker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test245() throws Throwable {
printRuntimeMSG("---RegressionTest0:test245");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Graphics2D graphics2D9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        java.awt.Color color14 = org.jfree.chart.ChartColor.DARK_GREEN;
        java.awt.Shape shape19 = null;
        java.awt.Color color20 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color22 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem23 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape19, (java.awt.Paint) color20, stroke21, (java.awt.Paint) color22);
        try {
            lineAndShapeRenderer2.drawDomainLine(graphics2D9, categoryPlot10, rectangle2D12, (double) (byte) 10, (java.awt.Paint) color14, stroke21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test246() throws Throwable {
printRuntimeMSG("---RegressionTest0:test246");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer11.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator13);
        java.awt.Font font16 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer11.setSeriesItemLabelFont((int) (short) 0, font16, true);
        lineAndShapeRenderer2.setBaseLegendTextFont(font16);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = lineAndShapeRenderer2.getLegendItems();
        java.awt.Color color22 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem23 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color22);
        legendItemCollection20.add(legendItem23);
        java.util.Iterator iterator25 = legendItemCollection20.iterator();
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(iterator25);
    }

    @Test
    public void test247() throws Throwable {
printRuntimeMSG("---RegressionTest0:test247");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE2;
        java.awt.Shape shape5 = null;
        java.awt.Color color6 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke7 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color8 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem9 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape5, (java.awt.Paint) color6, stroke7, (java.awt.Paint) color8);
        boolean boolean10 = itemLabelAnchor0.equals((java.lang.Object) "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT");
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test248() throws Throwable {
printRuntimeMSG("---RegressionTest0:test248");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        try {
            defaultCategoryDataset0.removeValue((java.lang.Comparable) 3, (java.lang.Comparable) "hi!");
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (3) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
    }

    @Test
    public void test249() throws Throwable {
printRuntimeMSG("---RegressionTest0:test249");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis(valueAxis2);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getRangeAxisLocation((-12566464));
        java.awt.Image image7 = categoryPlot0.getBackgroundImage();
        categoryPlot0.setDomainCrosshairVisible(false);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 100, 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNull(image7);
    }

    @Test
    public void test250() throws Throwable {
printRuntimeMSG("---RegressionTest0:test250");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = lineAndShapeRenderer2.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = lineAndShapeRenderer2.getSeriesURLGenerator(0);
        double double8 = lineAndShapeRenderer2.getItemMargin();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator9);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test251() throws Throwable {
printRuntimeMSG("---RegressionTest0:test251");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo8 = null;
        try {
            categoryPlot0.handleClick((int) (byte) 0, (-12566464), plotRenderingInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
    }

    @Test
    public void test252() throws Throwable {
printRuntimeMSG("---RegressionTest0:test252");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getColumnKeys();
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) 1.0d);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (1.0) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test253() throws Throwable {
printRuntimeMSG("---RegressionTest0:test253");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent5 = null;
        categoryPlot2.annotationChanged(annotationChangeEvent5);
        categoryPlot2.setCrosshairDatasetIndex((int) (byte) -1, false);
        java.awt.Image image10 = null;
        categoryPlot2.setBackgroundImage(image10);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot2.getRangeMarkers((int) (short) 100, layer13);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(collection14);
    }

    @Test
    public void test254() throws Throwable {
printRuntimeMSG("---RegressionTest0:test254");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        try {
            defaultCategoryDataset0.setSelected(10, (int) (short) 1, false, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test255() throws Throwable {
printRuntimeMSG("---RegressionTest0:test255");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset5 = new org.jfree.data.category.DefaultCategoryDataset();
        int int6 = defaultCategoryDataset5.getRowCount();
        org.jfree.data.category.CategoryDataset categoryDataset7 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis8.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis11 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer14.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot(categoryDataset7, categoryAxis8, valueAxis11, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer14);
        boolean boolean17 = categoryAxis8.isTickLabelsVisible();
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke20 = categoryPlot19.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        categoryPlot19.setRangeAxis(valueAxis21);
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot19.getRangeAxisEdge();
        try {
            double double24 = barRenderer0.getItemMiddle((java.lang.Comparable) 1.0d, (java.lang.Comparable) 4, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset5, categoryAxis8, rectangle2D18, rectangleEdge23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid category index: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(rectangleEdge23);
    }

    @Test
    public void test256() throws Throwable {
printRuntimeMSG("---RegressionTest0:test256");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.plot.Plot plot5 = categoryPlot0.getParent();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = lineAndShapeRenderer8.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        lineAndShapeRenderer8.setBaseToolTipGenerator(categoryToolTipGenerator10);
        java.awt.Font font13 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 0, font13, true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer8.getSeriesCreateEntities((int) 'a');
        java.awt.Paint paint18 = lineAndShapeRenderer8.getBaseItemLabelPaint();
        categoryPlot0.setRangeMinorGridlinePaint(paint18);
        boolean boolean20 = categoryPlot0.isRangeZoomable();
        java.lang.String str21 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(plot5);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Category Plot" + "'", str21.equals("Category Plot"));
    }

    @Test
    public void test257() throws Throwable {
printRuntimeMSG("---RegressionTest0:test257");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        try {
            java.util.ResourceBundle resourceBundle1 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name hi!, locale en_US");
        } catch (java.util.MissingResourceException e) {
        }
    }

    @Test
    public void test258() throws Throwable {
printRuntimeMSG("---RegressionTest0:test258");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
        java.awt.Stroke stroke2 = renderAttributes1.getDefaultOutlineStroke();
        java.awt.Paint paint4 = null;
        try {
            renderAttributes1.setSeriesFillPaint((int) (byte) -1, paint4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(stroke2);
    }

    @Test
    public void test259() throws Throwable {
printRuntimeMSG("---RegressionTest0:test259");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.jfree.chart.plot.DatasetRenderingOrder datasetRenderingOrder0 = org.jfree.chart.plot.DatasetRenderingOrder.FORWARD;
        java.lang.Object obj1 = null;
        boolean boolean2 = datasetRenderingOrder0.equals(obj1);
        org.junit.Assert.assertNotNull(datasetRenderingOrder0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test260() throws Throwable {
printRuntimeMSG("---RegressionTest0:test260");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.jfree.chart.renderer.RenderAttributes renderAttributes4 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean10 = lineAndShapeRenderer8.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean11 = lineAndShapeRenderer8.getBaseLinesVisible();
        java.awt.Shape shape12 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer8.setBaseLegendShape(shape12);
        renderAttributes4.setSeriesShape((int) ' ', shape12);
        org.jfree.chart.entity.ChartEntity chartEntity16 = new org.jfree.chart.entity.ChartEntity(shape12, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color19 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem20 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color19);
        java.lang.String str21 = legendItem20.getToolTipText();
        java.awt.Stroke stroke22 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem20.setOutlineStroke(stroke22);
        java.awt.Shape shape28 = null;
        java.awt.Color color29 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color31 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem32 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape28, (java.awt.Paint) color29, stroke30, (java.awt.Paint) color31);
        java.lang.Class<?> wildcardClass33 = color29.getClass();
        org.jfree.chart.LegendItem legendItem34 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape12, paint17, stroke22, (java.awt.Paint) color29);
        legendItem34.setSeriesIndex((int) (short) 0);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test261() throws Throwable {
printRuntimeMSG("---RegressionTest0:test261");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.text.AttributedString attributedString0 = null;
        org.jfree.chart.renderer.RenderAttributes renderAttributes9 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean15 = lineAndShapeRenderer13.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean16 = lineAndShapeRenderer13.getBaseLinesVisible();
        java.awt.Shape shape17 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer13.setBaseLegendShape(shape17);
        renderAttributes9.setSeriesShape((int) ' ', shape17);
        org.jfree.chart.entity.ChartEntity chartEntity21 = new org.jfree.chart.entity.ChartEntity(shape17, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint22 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color24 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem25 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color24);
        java.lang.String str26 = legendItem25.getToolTipText();
        java.awt.Stroke stroke27 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem25.setOutlineStroke(stroke27);
        java.awt.Shape shape33 = null;
        java.awt.Color color34 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color36 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem37 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape33, (java.awt.Paint) color34, stroke35, (java.awt.Paint) color36);
        java.lang.Class<?> wildcardClass38 = color34.getClass();
        org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape17, paint22, stroke27, (java.awt.Paint) color34);
        org.jfree.chart.entity.ChartEntity chartEntity40 = new org.jfree.chart.entity.ChartEntity(shape17);
        java.awt.Paint paint42 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot44 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke45 = categoryPlot44.getRangeMinorGridlineStroke();
        boolean boolean46 = categoryPlot44.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.PlotChangeListener plotChangeListener47 = null;
        categoryPlot44.removeChangeListener(plotChangeListener47);
        org.jfree.chart.renderer.RenderAttributes renderAttributes49 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint50 = renderAttributes49.getDefaultLabelPaint();
        java.awt.Color color51 = java.awt.Color.RED;
        renderAttributes49.setDefaultOutlinePaint((java.awt.Paint) color51);
        categoryPlot44.setDomainGridlinePaint((java.awt.Paint) color51);
        java.awt.Stroke stroke54 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        org.jfree.chart.renderer.category.BarRenderer barRenderer56 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint57 = barRenderer56.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot58 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo61 = null;
        java.awt.geom.Point2D point2D62 = null;
        categoryPlot58.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo61, point2D62);
        categoryPlot58.clearAnnotations();
        boolean boolean65 = barRenderer56.equals((java.lang.Object) categoryPlot58);
        java.awt.Paint paint66 = barRenderer56.getShadowPaint();
        java.awt.Shape shape67 = barRenderer56.getBaseShape();
        org.jfree.chart.plot.CategoryPlot categoryPlot68 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke69 = categoryPlot68.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation70 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation71 = axisLocation70.getOpposite();
        categoryPlot68.setDomainAxisLocation(axisLocation71, false);
        boolean boolean74 = categoryPlot68.canSelectByRegion();
        categoryPlot68.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot77 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo80 = null;
        java.awt.geom.Point2D point2D81 = null;
        categoryPlot77.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo80, point2D81);
        categoryPlot77.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder85 = categoryPlot77.getRowRenderingOrder();
        categoryPlot68.setRowRenderingOrder(sortOrder85);
        java.awt.Stroke stroke87 = categoryPlot68.getRangeCrosshairStroke();
        java.awt.Paint paint88 = null;
        try {
            org.jfree.chart.LegendItem legendItem89 = new org.jfree.chart.LegendItem(attributedString0, "ItemLabelAnchor.OUTSIDE9", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", "ItemLabelAnchor.INSIDE5", false, shape17, true, paint42, true, (java.awt.Paint) color51, stroke54, true, shape67, stroke87, paint88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'label' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(stroke45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(paint50);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(paint57);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(shape67);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertNotNull(axisLocation70);
        org.junit.Assert.assertNotNull(axisLocation71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(sortOrder85);
        org.junit.Assert.assertNotNull(stroke87);
    }

    @Test
    public void test262() throws Throwable {
printRuntimeMSG("---RegressionTest0:test262");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = categoryPlot0.getFixedLegendItems();
        java.awt.Font font9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot0.setNoDataMessageFont(font9);
        java.awt.Color color12 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color12);
        java.lang.String str14 = legendItem13.getToolTipText();
        java.awt.Stroke stroke15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem13.setOutlineStroke(stroke15);
        categoryPlot0.setDomainCrosshairStroke(stroke15);
        java.awt.Paint paint18 = categoryPlot0.getDomainCrosshairPaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(legendItemCollection8);
        org.junit.Assert.assertNotNull(font9);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test263() throws Throwable {
printRuntimeMSG("---RegressionTest0:test263");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        java.awt.Paint paint6 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray7 = new java.awt.Paint[] { paint6 };
        java.awt.Color color8 = java.awt.Color.BLUE;
        java.awt.Color color9 = java.awt.Color.RED;
        java.awt.Paint paint10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray11 = new java.awt.Paint[] { color8, color9, paint10 };
        java.awt.Color color12 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel13 = null;
        java.awt.Rectangle rectangle14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.AffineTransform affineTransform16 = null;
        java.awt.RenderingHints renderingHints17 = null;
        java.awt.PaintContext paintContext18 = color12.createContext(colorModel13, rectangle14, rectangle2D15, affineTransform16, renderingHints17);
        java.awt.Color color19 = java.awt.Color.WHITE;
        java.awt.Color color20 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel21 = null;
        java.awt.Rectangle rectangle22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        java.awt.geom.AffineTransform affineTransform24 = null;
        java.awt.RenderingHints renderingHints25 = null;
        java.awt.PaintContext paintContext26 = color20.createContext(colorModel21, rectangle22, rectangle2D23, affineTransform24, renderingHints25);
        java.awt.Color color27 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray28 = new java.awt.Paint[] { color12, color19, color20, color27 };
        java.awt.Stroke stroke29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke30 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray34 = new java.awt.Stroke[] { stroke29, stroke30, stroke31, stroke32, stroke33 };
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke38 = categoryPlot37.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray39 = new java.awt.Stroke[] { stroke35, stroke36, stroke38 };
        java.awt.Shape shape40 = null;
        java.awt.Shape[] shapeArray41 = new java.awt.Shape[] { shape40 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier42 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray7, paintArray11, paintArray28, strokeArray34, strokeArray39, shapeArray41);
        java.awt.Paint paint43 = defaultDrawingSupplier42.getNextOutlinePaint();
        java.lang.Object obj44 = defaultDrawingSupplier42.clone();
        java.awt.Paint paint45 = defaultDrawingSupplier42.getNextOutlinePaint();
        categoryPlot0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier) defaultDrawingSupplier42);
        categoryPlot0.setDomainGridlinesVisible(false);
        java.awt.Paint paint49 = categoryPlot0.getDomainGridlinePaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paintArray7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paintArray11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(paintContext18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(paintContext26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(paintArray28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(strokeArray34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(strokeArray39);
        org.junit.Assert.assertNotNull(shapeArray41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(paint45);
        org.junit.Assert.assertNotNull(paint49);
    }

    @Test
    public void test264() throws Throwable {
printRuntimeMSG("---RegressionTest0:test264");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        int int6 = lineAndShapeRenderer2.getPassCount();
        lineAndShapeRenderer2.setBaseSeriesVisible(false);
        java.awt.Shape shape13 = null;
        java.awt.Color color14 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke15 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color16 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem17 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape13, (java.awt.Paint) color14, stroke15, (java.awt.Paint) color16);
        java.awt.Paint paint18 = legendItem17.getLabelPaint();
        java.lang.String str19 = legendItem17.getURLText();
        java.awt.Paint paint20 = legendItem17.getOutlinePaint();
        lineAndShapeRenderer2.setBaseItemLabelPaint(paint20, true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNull(paint18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str19.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNotNull(paint20);
    }

    @Test
    public void test265() throws Throwable {
printRuntimeMSG("---RegressionTest0:test265");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        boolean boolean8 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        boolean boolean9 = lineAndShapeRenderer2.getBaseCreateEntities();
        java.lang.Boolean boolean11 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((-8355712));
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(boolean11);
    }

    @Test
    public void test266() throws Throwable {
printRuntimeMSG("---RegressionTest0:test266");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        boolean boolean8 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator9 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator9);
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke12 = categoryPlot11.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        categoryPlot11.setParent((org.jfree.chart.plot.Plot) categoryPlot13);
        org.jfree.chart.plot.Plot plot16 = categoryPlot11.getParent();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer19.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator21 = null;
        lineAndShapeRenderer19.setBaseToolTipGenerator(categoryToolTipGenerator21);
        java.awt.Font font24 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer19.setSeriesItemLabelFont((int) (short) 0, font24, true);
        java.lang.Boolean boolean28 = lineAndShapeRenderer19.getSeriesCreateEntities((int) 'a');
        java.awt.Paint paint29 = lineAndShapeRenderer19.getBaseItemLabelPaint();
        categoryPlot11.setRangeMinorGridlinePaint(paint29);
        lineAndShapeRenderer2.removeChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot11);
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        boolean boolean34 = lineAndShapeRenderer2.getUseSeriesOffset();
        boolean boolean36 = lineAndShapeRenderer2.isSeriesItemLabelsVisible((int) (byte) 1);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(plot16);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
        org.junit.Assert.assertNotNull(font24);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test267() throws Throwable {
printRuntimeMSG("---RegressionTest0:test267");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        java.awt.geom.GeneralPath generalPath11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.RenderingSource renderingSource13 = null;
        categoryPlot0.select(generalPath11, rectangle2D12, renderingSource13);
        org.jfree.chart.util.ShadowGenerator shadowGenerator15 = null;
        categoryPlot0.setShadowGenerator(shadowGenerator15);
        org.jfree.chart.plot.Marker marker17 = null;
        org.jfree.chart.util.Layer layer18 = null;
        try {
            categoryPlot0.addRangeMarker(marker17, layer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test268() throws Throwable {
printRuntimeMSG("---RegressionTest0:test268");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint2 = renderAttributes0.getSeriesPaint((int) (short) 0);
        java.awt.Paint paint4 = renderAttributes0.getSeriesFillPaint((int) (byte) 100);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(paint4);
    }

    @Test
    public void test269() throws Throwable {
printRuntimeMSG("---RegressionTest0:test269");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset10 = new org.jfree.data.category.DefaultCategoryDataset();
        int int11 = defaultCategoryDataset10.getRowCount();
        org.jfree.data.category.CategoryDataset categoryDataset12 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis13.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis16 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator20 = lineAndShapeRenderer19.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot(categoryDataset12, categoryAxis13, valueAxis16, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer19);
        categoryAxis13.setVisible(false);
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = null;
        try {
            double double26 = lineAndShapeRenderer2.getItemMiddle((java.lang.Comparable) 4.0d, (java.lang.Comparable) 2.0d, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset10, categoryAxis13, rectangle2D24, rectangleEdge25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid category index: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator20);
    }

    @Test
    public void test270() throws Throwable {
printRuntimeMSG("---RegressionTest0:test270");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int1 = defaultCategoryDataset0.getRowCount();
        try {
            defaultCategoryDataset0.setSelected((-8355712), 0, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -8355712");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test271() throws Throwable {
printRuntimeMSG("---RegressionTest0:test271");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.HORIZONTAL;
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
    }

    @Test
    public void test272() throws Throwable {
printRuntimeMSG("---RegressionTest0:test272");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        try {
            lineAndShapeRenderer2.setSeriesShapesVisible((-65536), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
    }

    @Test
    public void test273() throws Throwable {
printRuntimeMSG("---RegressionTest0:test273");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (short) 10);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint((int) (byte) -1);
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double16 = rectangleInsets15.getRight();
        java.awt.Color color17 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        boolean boolean18 = rectangleInsets15.equals((java.lang.Object) color17);
        lineAndShapeRenderer2.setBaseLegendTextPaint((java.awt.Paint) color17);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator21 = null;
        try {
            lineAndShapeRenderer2.setSeriesURLGenerator((-16777216), categoryURLGenerator21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(rectangleInsets15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 4.0d + "'", double16 == 4.0d);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test274() throws Throwable {
printRuntimeMSG("---RegressionTest0:test274");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = lineAndShapeRenderer2.getPlot();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        boolean boolean12 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation11);
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(renderAttributes13);
    }

    @Test
    public void test275() throws Throwable {
printRuntimeMSG("---RegressionTest0:test275");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        java.awt.Paint paint11 = lineAndShapeRenderer2.getItemOutlinePaint((int) (short) 10, (int) (byte) 10, false);
        double double12 = lineAndShapeRenderer2.getItemLabelAnchorOffset();
        java.awt.Stroke stroke14 = lineAndShapeRenderer2.getSeriesStroke((int) (byte) -1);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
        org.junit.Assert.assertNull(stroke14);
    }

    @Test
    public void test276() throws Throwable {
printRuntimeMSG("---RegressionTest0:test276");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        java.lang.Comparable comparable9 = categoryPlot0.getDomainCrosshairRowKey();
        java.awt.Paint paint10 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.Marker marker12 = null;
        org.jfree.chart.util.Layer layer13 = null;
        try {
            boolean boolean15 = categoryPlot0.removeRangeMarker((-1), marker12, layer13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNull(comparable9);
        org.junit.Assert.assertNotNull(paint10);
    }

    @Test
    public void test277() throws Throwable {
printRuntimeMSG("---RegressionTest0:test277");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getLegendTextPaint((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean15 = lineAndShapeRenderer13.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke19 = categoryPlot18.getRangeMinorGridlineStroke();
        categoryPlot16.setParent((org.jfree.chart.plot.Plot) categoryPlot18);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = categoryPlot16.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        categoryPlot16.axisChanged(axisChangeEvent22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = categoryPlot16.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        categoryPlot16.setDataset(categoryDataset25);
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot16.setDomainCrosshairStroke(stroke27);
        java.awt.Stroke stroke29 = categoryPlot16.getRangeGridlineStroke();
        lineAndShapeRenderer13.setBaseStroke(stroke29);
        lineAndShapeRenderer2.setBaseStroke(stroke29, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        lineAndShapeRenderer2.setBaseLinesVisible(true);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(legendItemCollection21);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
    }

    @Test
    public void test278() throws Throwable {
printRuntimeMSG("---RegressionTest0:test278");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        java.awt.Color color10 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        categoryPlot0.setRangeZeroBaselinePaint((java.awt.Paint) color10);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint13 = categoryAxis12.getTickLabelPaint();
        categoryPlot0.setDomainGridlinePaint(paint13);
        org.jfree.chart.plot.CategoryMarker categoryMarker15 = null;
        try {
            categoryPlot0.addDomainMarker(categoryMarker15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test279() throws Throwable {
printRuntimeMSG("---RegressionTest0:test279");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        try {
            java.awt.Color color1 = java.awt.Color.decode("Category Plot");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Category Plot\"");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test280() throws Throwable {
printRuntimeMSG("---RegressionTest0:test280");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.awt.Paint paint0 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_PAINT;
        org.junit.Assert.assertNotNull(paint0);
    }

    @Test
    public void test281() throws Throwable {
printRuntimeMSG("---RegressionTest0:test281");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean6 = lineAndShapeRenderer4.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean7 = lineAndShapeRenderer4.getBaseLinesVisible();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer4.setBaseLegendShape(shape8);
        renderAttributes0.setSeriesShape((int) ' ', shape8);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean15 = lineAndShapeRenderer13.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean16 = lineAndShapeRenderer13.getBaseLinesVisible();
        java.awt.Shape shape17 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer13.setBaseLegendShape(shape17);
        renderAttributes0.setDefaultShape(shape17);
        java.awt.Paint paint20 = renderAttributes0.getDefaultFillPaint();
        java.awt.Stroke stroke23 = renderAttributes0.getItemStroke((int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNull(stroke23);
    }

    @Test
    public void test282() throws Throwable {
printRuntimeMSG("---RegressionTest0:test282");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        boolean boolean9 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setUseFillPaint(false);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator13 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator13, false);
        java.awt.Graphics2D graphics2D18 = null;
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis23 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis23.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis26 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = lineAndShapeRenderer29.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot31 = new org.jfree.chart.plot.CategoryPlot(categoryDataset22, categoryAxis23, valueAxis26, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer29);
        boolean boolean32 = categoryAxis23.isTickLabelsVisible();
        double double33 = categoryAxis23.getFixedDimension();
        java.awt.Paint paint35 = categoryAxis23.getTickLabelPaint((java.lang.Comparable) 4.0d);
        categoryAxis21.setTickLabelPaint(paint35);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset38 = new org.jfree.data.category.AbstractCategoryDataset();
        java.lang.Object obj39 = abstractCategoryDataset38.clone();
        java.lang.Object obj40 = abstractCategoryDataset38.clone();
        org.jfree.chart.renderer.RenderAttributes renderAttributes49 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer53 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean55 = lineAndShapeRenderer53.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean56 = lineAndShapeRenderer53.getBaseLinesVisible();
        java.awt.Shape shape57 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer53.setBaseLegendShape(shape57);
        renderAttributes49.setSeriesShape((int) ' ', shape57);
        org.jfree.chart.entity.ChartEntity chartEntity61 = new org.jfree.chart.entity.ChartEntity(shape57, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color64 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem65 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color64);
        java.lang.String str66 = legendItem65.getToolTipText();
        java.awt.Stroke stroke67 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem65.setOutlineStroke(stroke67);
        java.awt.Shape shape73 = null;
        java.awt.Color color74 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke75 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color76 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem77 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape73, (java.awt.Paint) color74, stroke75, (java.awt.Paint) color76);
        java.lang.Class<?> wildcardClass78 = color74.getClass();
        org.jfree.chart.LegendItem legendItem79 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape57, paint62, stroke67, (java.awt.Paint) color74);
        org.jfree.chart.entity.ChartEntity chartEntity80 = new org.jfree.chart.entity.ChartEntity(shape57);
        java.awt.Color color81 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem82 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape57, (java.awt.Paint) color81);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset85 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity88 = new org.jfree.chart.entity.CategoryItemEntity(shape57, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset85, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        abstractCategoryDataset38.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset85);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState93 = null;
        try {
            boolean boolean94 = lineAndShapeRenderer2.hitTest((double) (byte) 0, 0.0d, graphics2D18, rectangle2D19, categoryPlot20, categoryAxis21, valueAxis37, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset85, 15, 0, false, categoryItemRendererState93);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(categoryItemLabelGenerator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(boolean55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(shape57);
        org.junit.Assert.assertNotNull(paint62);
        org.junit.Assert.assertNotNull(color64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(stroke67);
        org.junit.Assert.assertNotNull(color74);
        org.junit.Assert.assertNotNull(stroke75);
        org.junit.Assert.assertNotNull(color76);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNotNull(color81);
    }

    @Test
    public void test283() throws Throwable {
printRuntimeMSG("---RegressionTest0:test283");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearAnnotations();
        categoryPlot0.setCrosshairDatasetIndex(192, false);
        categoryPlot0.setOutlineVisible(false);
    }

    @Test
    public void test284() throws Throwable {
printRuntimeMSG("---RegressionTest0:test284");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator11, true);
        java.awt.Shape shape15 = lineAndShapeRenderer2.lookupSeriesShape((int) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke19 = categoryPlot18.getRangeMinorGridlineStroke();
        categoryPlot16.setParent((org.jfree.chart.plot.Plot) categoryPlot18);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = categoryPlot16.getFixedLegendItems();
        java.lang.Comparable comparable22 = categoryPlot16.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot16.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        categoryPlot16.notifyListeners(plotChangeEvent24);
        boolean boolean26 = categoryPlot16.isOutlineVisible();
        java.awt.geom.GeneralPath generalPath27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.RenderingSource renderingSource29 = null;
        categoryPlot16.select(generalPath27, rectangle2D28, renderingSource29);
        org.jfree.chart.util.ShadowGenerator shadowGenerator31 = null;
        categoryPlot16.setShadowGenerator(shadowGenerator31);
        org.jfree.chart.entity.PlotEntity plotEntity33 = new org.jfree.chart.entity.PlotEntity(shape15, (org.jfree.chart.plot.Plot) categoryPlot16);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean38 = lineAndShapeRenderer36.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean39 = lineAndShapeRenderer36.getBaseLinesVisible();
        lineAndShapeRenderer36.setAutoPopulateSeriesPaint(false);
        boolean boolean42 = lineAndShapeRenderer36.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = lineAndShapeRenderer36.getBasePositiveItemLabelPosition();
        boolean boolean44 = plotEntity33.equals((java.lang.Object) itemLabelPosition43);
        java.lang.Object obj45 = plotEntity33.clone();
        java.awt.Shape shape50 = null;
        java.awt.Color color51 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color53 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem54 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape50, (java.awt.Paint) color51, stroke52, (java.awt.Paint) color53);
        java.awt.Paint paint55 = legendItem54.getFillPaint();
        java.awt.Font font56 = legendItem54.getLabelFont();
        legendItem54.setSeriesIndex((int) (byte) 10);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer59 = legendItem54.getFillPaintTransformer();
        boolean boolean60 = plotEntity33.equals((java.lang.Object) legendItem54);
        java.lang.String str61 = legendItem54.getURLText();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(legendItemCollection21);
        org.junit.Assert.assertNull(comparable22);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(boolean38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(paint55);
        org.junit.Assert.assertNull(font56);
        org.junit.Assert.assertNotNull(gradientPaintTransformer59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str61.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
    }

    @Test
    public void test285() throws Throwable {
printRuntimeMSG("---RegressionTest0:test285");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator12 = lineAndShapeRenderer11.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator13 = null;
        lineAndShapeRenderer11.setBaseToolTipGenerator(categoryToolTipGenerator13);
        java.awt.Font font16 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer11.setSeriesItemLabelFont((int) (short) 0, font16, true);
        lineAndShapeRenderer2.setBaseLegendTextFont(font16);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = lineAndShapeRenderer2.getLegendItems();
        java.util.Iterator iterator21 = legendItemCollection20.iterator();
        java.lang.Object obj22 = legendItemCollection20.clone();
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator12);
        org.junit.Assert.assertNotNull(font16);
        org.junit.Assert.assertNotNull(legendItemCollection20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test286() throws Throwable {
printRuntimeMSG("---RegressionTest0:test286");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis10.setMinorTickMarkOutsideLength((float) (short) 0);
        float float13 = categoryAxis10.getMinorTickMarkInsideLength();
        java.util.List list14 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        categoryPlot0.setForegroundAlpha((float) 1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test287() throws Throwable {
printRuntimeMSG("---RegressionTest0:test287");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getItemPaint((-16777216), (int) ' ', true);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test288() throws Throwable {
printRuntimeMSG("---RegressionTest0:test288");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis6.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer12.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis9, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer12);
        java.util.List list15 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        java.awt.Paint paint16 = categoryAxis6.getTickLabelPaint();
        boolean boolean17 = categoryAxis6.isAxisLineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = null;
        lineAndShapeRenderer21.setSeriesPositiveItemLabelPosition(0, itemLabelPosition23);
        int int25 = lineAndShapeRenderer21.getPassCount();
        java.awt.Paint paint29 = lineAndShapeRenderer21.getItemLabelPaint(0, (int) '#', true);
        categoryAxis6.setTickLabelPaint((java.lang.Comparable) 255, paint29);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test289() throws Throwable {
printRuntimeMSG("---RegressionTest0:test289");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        int int2 = keyedObjects0.getIndex((java.lang.Comparable) (short) -1);
        try {
            java.lang.Object obj4 = keyedObjects0.getObject((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test290() throws Throwable {
printRuntimeMSG("---RegressionTest0:test290");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        categoryPlot0.setAnchorValue(0.0d, false);
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot0.getRangeAxis((int) (short) -1);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(valueAxis11);
    }

    @Test
    public void test291() throws Throwable {
printRuntimeMSG("---RegressionTest0:test291");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType5 = plotChangeEvent4.getType();
        java.lang.String str6 = chartChangeEventType5.toString();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(chartChangeEventType5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ChartChangeEventType.GENERAL" + "'", str6.equals("ChartChangeEventType.GENERAL"));
    }

    @Test
    public void test292() throws Throwable {
printRuntimeMSG("---RegressionTest0:test292");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.awt.Stroke stroke0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_STROKE;
        org.junit.Assert.assertNotNull(stroke0);
    }

    @Test
    public void test293() throws Throwable {
printRuntimeMSG("---RegressionTest0:test293");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (short) 10);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (byte) 10, categoryURLGenerator14);
        org.jfree.data.KeyedObjects2D keyedObjects2D17 = new org.jfree.data.KeyedObjects2D();
        java.util.List list18 = keyedObjects2D17.getColumnKeys();
        org.jfree.chart.renderer.category.BarRenderer barRenderer19 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint20 = barRenderer19.getShadowPaint();
        boolean boolean21 = barRenderer19.getBaseSeriesVisible();
        org.jfree.chart.renderer.RenderAttributes renderAttributes22 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint23 = renderAttributes22.getDefaultLabelPaint();
        java.awt.Paint paint26 = renderAttributes22.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke27 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes22.setDefaultStroke(stroke27);
        barRenderer19.setBaseStroke(stroke27, true);
        boolean boolean31 = keyedObjects2D17.equals((java.lang.Object) stroke27);
        lineAndShapeRenderer2.setSeriesStroke(15, stroke27, false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(list18);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertNull(paint26);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test294() throws Throwable {
printRuntimeMSG("---RegressionTest0:test294");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent2 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) (-16777216), jFreeChart1);
        java.lang.String str3 = chartChangeEvent2.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "org.jfree.chart.event.ChartChangeEvent[source=-16777216]" + "'", str3.equals("org.jfree.chart.event.ChartChangeEvent[source=-16777216]"));
    }

    @Test
    public void test295() throws Throwable {
printRuntimeMSG("---RegressionTest0:test295");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL;
        boolean boolean2 = gradientPaintTransformType0.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test296() throws Throwable {
printRuntimeMSG("---RegressionTest0:test296");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        java.awt.Paint paint6 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray7 = new java.awt.Paint[] { paint6 };
        java.awt.Color color8 = java.awt.Color.BLUE;
        java.awt.Color color9 = java.awt.Color.RED;
        java.awt.Paint paint10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray11 = new java.awt.Paint[] { color8, color9, paint10 };
        java.awt.Color color12 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel13 = null;
        java.awt.Rectangle rectangle14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        java.awt.geom.AffineTransform affineTransform16 = null;
        java.awt.RenderingHints renderingHints17 = null;
        java.awt.PaintContext paintContext18 = color12.createContext(colorModel13, rectangle14, rectangle2D15, affineTransform16, renderingHints17);
        java.awt.Color color19 = java.awt.Color.WHITE;
        java.awt.Color color20 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel21 = null;
        java.awt.Rectangle rectangle22 = null;
        java.awt.geom.Rectangle2D rectangle2D23 = null;
        java.awt.geom.AffineTransform affineTransform24 = null;
        java.awt.RenderingHints renderingHints25 = null;
        java.awt.PaintContext paintContext26 = color20.createContext(colorModel21, rectangle22, rectangle2D23, affineTransform24, renderingHints25);
        java.awt.Color color27 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray28 = new java.awt.Paint[] { color12, color19, color20, color27 };
        java.awt.Stroke stroke29 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke30 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray34 = new java.awt.Stroke[] { stroke29, stroke30, stroke31, stroke32, stroke33 };
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot37 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke38 = categoryPlot37.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray39 = new java.awt.Stroke[] { stroke35, stroke36, stroke38 };
        java.awt.Shape shape40 = null;
        java.awt.Shape[] shapeArray41 = new java.awt.Shape[] { shape40 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier42 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray7, paintArray11, paintArray28, strokeArray34, strokeArray39, shapeArray41);
        java.awt.Paint paint43 = defaultDrawingSupplier42.getNextOutlinePaint();
        java.lang.Object obj44 = defaultDrawingSupplier42.clone();
        java.awt.Paint paint45 = defaultDrawingSupplier42.getNextOutlinePaint();
        categoryPlot0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier) defaultDrawingSupplier42);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        java.awt.geom.Point2D point2D49 = null;
        categoryPlot0.panDomainAxes((double) 0, plotRenderingInfo48, point2D49);
        java.awt.Graphics2D graphics2D51 = null;
        java.awt.geom.Rectangle2D rectangle2D52 = null;
        java.awt.geom.Point2D point2D53 = null;
        org.jfree.chart.plot.PlotState plotState54 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo55 = null;
        try {
            categoryPlot0.draw(graphics2D51, rectangle2D52, point2D53, plotState54, plotRenderingInfo55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNotNull(paintArray7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(paintArray11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(paintContext18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(paintContext26);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNotNull(paintArray28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(strokeArray34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(strokeArray39);
        org.junit.Assert.assertNotNull(shapeArray41);
        org.junit.Assert.assertNotNull(paint43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNotNull(paint45);
    }

    @Test
    public void test297() throws Throwable {
printRuntimeMSG("---RegressionTest0:test297");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint1 = categoryAxis0.getTickLabelPaint();
        categoryAxis0.setTickLabelsVisible(false);
        float float4 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test298() throws Throwable {
printRuntimeMSG("---RegressionTest0:test298");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer3 = categoryPlot0.getRenderer();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(categoryItemRenderer3);
    }

    @Test
    public void test299() throws Throwable {
printRuntimeMSG("---RegressionTest0:test299");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE4;
        java.lang.String str1 = itemLabelAnchor0.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ItemLabelAnchor.OUTSIDE4" + "'", str1.equals("ItemLabelAnchor.OUTSIDE4"));
    }

    @Test
    public void test300() throws Throwable {
printRuntimeMSG("---RegressionTest0:test300");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.awt.Shape[] shapeArray0 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_SHAPE_SEQUENCE;
        org.junit.Assert.assertNotNull(shapeArray0);
    }

    @Test
    public void test301() throws Throwable {
printRuntimeMSG("---RegressionTest0:test301");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.String str10 = categoryAxis1.getLabelToolTip();
        float float11 = categoryAxis1.getMaximumCategoryLabelWidthRatio();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test302() throws Throwable {
printRuntimeMSG("---RegressionTest0:test302");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.jfree.chart.util.UnitType unitType1 = org.jfree.chart.util.UnitType.ABSOLUTE;
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot4 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke5 = categoryPlot4.getRangeMinorGridlineStroke();
        categoryPlot2.setParent((org.jfree.chart.plot.Plot) categoryPlot4);
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot2.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier8 = categoryPlot2.getDrawingSupplier();
        java.awt.Stroke stroke9 = categoryPlot2.getOutlineStroke();
        boolean boolean10 = unitType1.equals((java.lang.Object) categoryPlot2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot2.zoomRangeAxes(0.0d, (double) (byte) -1, plotRenderingInfo13, point2D14);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean20 = lineAndShapeRenderer18.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean21 = lineAndShapeRenderer18.getBaseLinesVisible();
        java.awt.Shape shape22 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer18.setBaseLegendShape(shape22);
        java.awt.Color color24 = org.jfree.chart.ChartColor.LIGHT_MAGENTA;
        lineAndShapeRenderer18.setBaseOutlinePaint((java.awt.Paint) color24, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = null;
        lineAndShapeRenderer29.setSeriesPositiveItemLabelPosition(0, itemLabelPosition31);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = lineAndShapeRenderer29.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean35 = lineAndShapeRenderer29.getUseFillPaint();
        lineAndShapeRenderer29.setDataBoundsIncludesVisibleSeriesOnly(true);
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        lineAndShapeRenderer29.setBaseStroke(stroke38, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray41 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { lineAndShapeRenderer18, lineAndShapeRenderer29 };
        categoryPlot2.setRenderers(categoryItemRendererArray41);
        java.awt.Paint paint43 = categoryPlot2.getRangeZeroBaselinePaint();
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("org.jfree.chart.event.ChartChangeEvent[source=-16777216]", paint43);
        org.junit.Assert.assertNotNull(unitType1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(stroke5);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(drawingSupplier8);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(categoryItemRendererArray41);
        org.junit.Assert.assertNotNull(paint43);
    }

    @Test
    public void test303() throws Throwable {
printRuntimeMSG("---RegressionTest0:test303");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test304() throws Throwable {
printRuntimeMSG("---RegressionTest0:test304");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxisForDataset(100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(legendItemCollection5);
        org.junit.Assert.assertNull(valueAxis7);
    }

    @Test
    public void test305() throws Throwable {
printRuntimeMSG("---RegressionTest0:test305");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        double double2 = rectangleInsets0.getTop();
        double double4 = rectangleInsets0.calculateTopOutset((double) ' ');
        double double6 = rectangleInsets0.calculateRightOutset(100.0d);
        double double8 = rectangleInsets0.trimHeight((double) 0L);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.0d + "'", double6 == 4.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-4.0d) + "'", double8 == (-4.0d));
    }

    @Test
    public void test306() throws Throwable {
printRuntimeMSG("---RegressionTest0:test306");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        java.awt.Paint paint11 = lineAndShapeRenderer2.getItemOutlinePaint((int) (short) 10, (int) (byte) 10, false);
        lineAndShapeRenderer2.setDrawOutlines(true);
        boolean boolean14 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test307() throws Throwable {
printRuntimeMSG("---RegressionTest0:test307");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        boolean boolean12 = categoryPlot10.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot10.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        categoryPlot10.drawBackgroundImage(graphics2D16, rectangle2D17);
        lineAndShapeRenderer7.setPlot(categoryPlot10);
        java.awt.Color color20 = org.jfree.chart.ChartColor.DARK_GREEN;
        lineAndShapeRenderer7.setBaseLegendTextPaint((java.awt.Paint) color20);
        org.jfree.chart.renderer.RenderAttributes renderAttributes23 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint24 = renderAttributes23.getDefaultLabelPaint();
        java.awt.Stroke stroke27 = renderAttributes23.getItemStroke((int) (byte) 10, (int) 'a');
        org.jfree.chart.renderer.RenderAttributes renderAttributes28 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint29 = renderAttributes28.getDefaultLabelPaint();
        java.awt.Paint paint32 = renderAttributes28.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke33 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes28.setDefaultStroke(stroke33);
        renderAttributes23.setDefaultOutlineStroke(stroke33);
        try {
            lineAndShapeRenderer7.setSeriesOutlineStroke((int) (byte) -1, stroke33, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
    }

    @Test
    public void test308() throws Throwable {
printRuntimeMSG("---RegressionTest0:test308");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.awt.Color color0 = java.awt.Color.YELLOW;
        org.junit.Assert.assertNotNull(color0);
    }

    @Test
    public void test309() throws Throwable {
printRuntimeMSG("---RegressionTest0:test309");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        java.awt.Stroke stroke13 = lineAndShapeRenderer2.getItemStroke((int) 'a', (int) (short) 0, false);
        boolean boolean16 = lineAndShapeRenderer2.getItemShapeFilled(100, 128);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test310() throws Throwable {
printRuntimeMSG("---RegressionTest0:test310");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.util.Locale locale1 = null;
        try {
            java.util.ResourceBundle resourceBundle2 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("GradientPaintTransformType.CENTER_VERTICAL", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
printRuntimeMSG("---RegressionTest0:test311");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        boolean boolean9 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.lang.Object obj11 = lineAndShapeRenderer2.clone();
        double double12 = lineAndShapeRenderer2.getItemMargin();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = lineAndShapeRenderer2.getToolTipGenerator(0, 4, false);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNull(categoryToolTipGenerator16);
    }

    @Test
    public void test312() throws Throwable {
printRuntimeMSG("---RegressionTest0:test312");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.jfree.chart.util.UnitType unitType0 = org.jfree.chart.util.UnitType.ABSOLUTE;
        org.jfree.chart.util.RectangleInsets rectangleInsets5 = new org.jfree.chart.util.RectangleInsets(unitType0, (double) 2.0f, (double) 100, 100.0d, (double) ' ');
        double double7 = rectangleInsets5.calculateTopOutset((double) 'a');
        org.junit.Assert.assertNotNull(unitType0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
    }

    @Test
    public void test313() throws Throwable {
printRuntimeMSG("---RegressionTest0:test313");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot0.getRowRenderingOrder();
        java.lang.Comparable comparable8 = categoryPlot0.getDomainCrosshairColumnKey();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sortOrder7);
        org.junit.Assert.assertNull(comparable8);
    }

    @Test
    public void test314() throws Throwable {
printRuntimeMSG("---RegressionTest0:test314");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        categoryPlot0.setNoDataMessage("TextAnchor.HALF_ASCENT_LEFT");
        java.awt.Paint paint9 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray10 = new java.awt.Paint[] { paint9 };
        java.awt.Color color11 = java.awt.Color.BLUE;
        java.awt.Color color12 = java.awt.Color.RED;
        java.awt.Paint paint13 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray14 = new java.awt.Paint[] { color11, color12, paint13 };
        java.awt.Color color15 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel16 = null;
        java.awt.Rectangle rectangle17 = null;
        java.awt.geom.Rectangle2D rectangle2D18 = null;
        java.awt.geom.AffineTransform affineTransform19 = null;
        java.awt.RenderingHints renderingHints20 = null;
        java.awt.PaintContext paintContext21 = color15.createContext(colorModel16, rectangle17, rectangle2D18, affineTransform19, renderingHints20);
        java.awt.Color color22 = java.awt.Color.WHITE;
        java.awt.Color color23 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel24 = null;
        java.awt.Rectangle rectangle25 = null;
        java.awt.geom.Rectangle2D rectangle2D26 = null;
        java.awt.geom.AffineTransform affineTransform27 = null;
        java.awt.RenderingHints renderingHints28 = null;
        java.awt.PaintContext paintContext29 = color23.createContext(colorModel24, rectangle25, rectangle2D26, affineTransform27, renderingHints28);
        java.awt.Color color30 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray31 = new java.awt.Paint[] { color15, color22, color23, color30 };
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke33 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray37 = new java.awt.Stroke[] { stroke32, stroke33, stroke34, stroke35, stroke36 };
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke41 = categoryPlot40.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray42 = new java.awt.Stroke[] { stroke38, stroke39, stroke41 };
        java.awt.Shape shape43 = null;
        java.awt.Shape[] shapeArray44 = new java.awt.Shape[] { shape43 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier45 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray10, paintArray14, paintArray31, strokeArray37, strokeArray42, shapeArray44);
        java.awt.Shape shape46 = defaultDrawingSupplier45.getNextShape();
        java.awt.Stroke stroke47 = defaultDrawingSupplier45.getNextOutlineStroke();
        java.awt.Stroke stroke48 = defaultDrawingSupplier45.getNextOutlineStroke();
        categoryPlot0.setRangeCrosshairStroke(stroke48);
        java.awt.Stroke stroke50 = categoryPlot0.getRangeCrosshairStroke();
        org.jfree.chart.util.SortOrder sortOrder51 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.Marker marker52 = null;
        try {
            boolean boolean53 = categoryPlot0.removeRangeMarker(marker52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNotNull(paint9);
        org.junit.Assert.assertNotNull(paintArray10);
        org.junit.Assert.assertNotNull(color11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertNotNull(paintArray14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(paintContext21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(paintContext29);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNotNull(paintArray31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(strokeArray37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(strokeArray42);
        org.junit.Assert.assertNotNull(shapeArray44);
        org.junit.Assert.assertNull(shape46);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(stroke48);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(sortOrder51);
    }

    @Test
    public void test315() throws Throwable {
printRuntimeMSG("---RegressionTest0:test315");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot0.getDrawingSupplier();
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot0.getDomainAxisForDataset(0);
        categoryPlot0.setCrosshairDatasetIndex((-65536));
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertNull(categoryAxis11);
    }

    @Test
    public void test316() throws Throwable {
printRuntimeMSG("---RegressionTest0:test316");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator11, true);
        java.awt.Shape shape15 = lineAndShapeRenderer2.lookupSeriesShape((int) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke19 = categoryPlot18.getRangeMinorGridlineStroke();
        categoryPlot16.setParent((org.jfree.chart.plot.Plot) categoryPlot18);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = categoryPlot16.getFixedLegendItems();
        java.lang.Comparable comparable22 = categoryPlot16.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge23 = categoryPlot16.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = null;
        categoryPlot16.notifyListeners(plotChangeEvent24);
        boolean boolean26 = categoryPlot16.isOutlineVisible();
        java.awt.geom.GeneralPath generalPath27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        org.jfree.chart.RenderingSource renderingSource29 = null;
        categoryPlot16.select(generalPath27, rectangle2D28, renderingSource29);
        org.jfree.chart.util.ShadowGenerator shadowGenerator31 = null;
        categoryPlot16.setShadowGenerator(shadowGenerator31);
        org.jfree.chart.entity.PlotEntity plotEntity33 = new org.jfree.chart.entity.PlotEntity(shape15, (org.jfree.chart.plot.Plot) categoryPlot16);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean38 = lineAndShapeRenderer36.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean39 = lineAndShapeRenderer36.getBaseLinesVisible();
        lineAndShapeRenderer36.setAutoPopulateSeriesPaint(false);
        boolean boolean42 = lineAndShapeRenderer36.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition43 = lineAndShapeRenderer36.getBasePositiveItemLabelPosition();
        boolean boolean44 = plotEntity33.equals((java.lang.Object) itemLabelPosition43);
        org.jfree.chart.text.TextAnchor textAnchor45 = itemLabelPosition43.getTextAnchor();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(legendItemCollection21);
        org.junit.Assert.assertNull(comparable22);
        org.junit.Assert.assertNotNull(rectangleEdge23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(boolean38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(textAnchor45);
    }

    @Test
    public void test317() throws Throwable {
printRuntimeMSG("---RegressionTest0:test317");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        org.jfree.chart.event.PlotChangeListener plotChangeListener3 = null;
        categoryPlot0.removeChangeListener(plotChangeListener3);
        org.jfree.chart.renderer.RenderAttributes renderAttributes5 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint6 = renderAttributes5.getDefaultLabelPaint();
        java.awt.Color color7 = java.awt.Color.RED;
        renderAttributes5.setDefaultOutlinePaint((java.awt.Paint) color7);
        categoryPlot0.setDomainGridlinePaint((java.awt.Paint) color7);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = null;
        lineAndShapeRenderer12.setSeriesPositiveItemLabelPosition(0, itemLabelPosition14);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = lineAndShapeRenderer12.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean18 = lineAndShapeRenderer12.getUseFillPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer21.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        lineAndShapeRenderer21.setBaseToolTipGenerator(categoryToolTipGenerator23);
        java.awt.Font font26 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer21.setSeriesItemLabelFont((int) (short) 0, font26, true);
        lineAndShapeRenderer12.setBaseLegendTextFont(font26);
        org.jfree.chart.LegendItemCollection legendItemCollection30 = lineAndShapeRenderer12.getLegendItems();
        categoryPlot0.setFixedLegendItems(legendItemCollection30);
        java.awt.Graphics2D graphics2D32 = null;
        java.awt.geom.Rectangle2D rectangle2D33 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo35 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState36 = null;
        boolean boolean37 = categoryPlot0.render(graphics2D32, rectangle2D33, (int) '#', plotRenderingInfo35, categoryCrosshairState36);
        categoryPlot0.setForegroundAlpha((float) 8);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(legendItemCollection30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test318() throws Throwable {
printRuntimeMSG("---RegressionTest0:test318");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        java.lang.Object obj1 = abstractCategoryDataset0.clone();
        java.lang.Object obj2 = abstractCategoryDataset0.clone();
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer15.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean18 = lineAndShapeRenderer15.getBaseLinesVisible();
        java.awt.Shape shape19 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer15.setBaseLegendShape(shape19);
        renderAttributes11.setSeriesShape((int) ' ', shape19);
        org.jfree.chart.entity.ChartEntity chartEntity23 = new org.jfree.chart.entity.ChartEntity(shape19, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color26 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem27 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color26);
        java.lang.String str28 = legendItem27.getToolTipText();
        java.awt.Stroke stroke29 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem27.setOutlineStroke(stroke29);
        java.awt.Shape shape35 = null;
        java.awt.Color color36 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color38 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape35, (java.awt.Paint) color36, stroke37, (java.awt.Paint) color38);
        java.lang.Class<?> wildcardClass40 = color36.getClass();
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape19, paint24, stroke29, (java.awt.Paint) color36);
        org.jfree.chart.entity.ChartEntity chartEntity42 = new org.jfree.chart.entity.ChartEntity(shape19);
        java.awt.Color color43 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape19, (java.awt.Paint) color43);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity50 = new org.jfree.chart.entity.CategoryItemEntity(shape19, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        abstractCategoryDataset0.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset47);
        java.lang.Comparable comparable54 = null;
        try {
            defaultCategoryDataset47.addValue(10.0d, (java.lang.Comparable) 0.05d, comparable54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test319() throws Throwable {
printRuntimeMSG("---RegressionTest0:test319");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        java.awt.Shape shape15 = null;
        java.awt.Color color16 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color18 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem19 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape15, (java.awt.Paint) color16, stroke17, (java.awt.Paint) color18);
        java.awt.Paint paint20 = legendItem19.getLabelPaint();
        java.lang.String str21 = legendItem19.getURLText();
        java.awt.Paint paint22 = legendItem19.getOutlinePaint();
        try {
            barRenderer0.setSeriesPaint((-16777216), paint22, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str21.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNotNull(paint22);
    }

    @Test
    public void test320() throws Throwable {
printRuntimeMSG("---RegressionTest0:test320");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint3 = renderAttributes0.getItemFillPaint((-65536), (int) (byte) 1);
        java.awt.Stroke stroke5 = null;
        renderAttributes0.setSeriesStroke((int) (byte) 100, stroke5);
        org.junit.Assert.assertNull(paint3);
    }

    @Test
    public void test321() throws Throwable {
printRuntimeMSG("---RegressionTest0:test321");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator7 = lineAndShapeRenderer6.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = null;
        lineAndShapeRenderer6.setBaseToolTipGenerator(categoryToolTipGenerator8);
        java.awt.Font font11 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer6.setSeriesItemLabelFont((int) (short) 0, font11, true);
        java.awt.Color color14 = org.jfree.chart.ChartColor.VERY_LIGHT_CYAN;
        boolean boolean15 = lineAndShapeRenderer6.equals((java.lang.Object) color14);
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer20 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean22 = lineAndShapeRenderer20.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean23 = lineAndShapeRenderer20.getBaseLinesVisible();
        java.awt.Shape shape24 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer20.setBaseLegendShape(shape24);
        renderAttributes16.setSeriesShape((int) ' ', shape24);
        org.jfree.chart.entity.ChartEntity chartEntity28 = new org.jfree.chart.entity.ChartEntity(shape24, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        lineAndShapeRenderer6.setBaseShape(shape24, true);
        java.awt.Color color31 = java.awt.Color.red;
        java.awt.Stroke stroke32 = null;
        java.awt.Paint paint33 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_PAINT;
        try {
            org.jfree.chart.LegendItem legendItem34 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE4", "SortOrder.ASCENDING", "{0}", "ChartChangeEventType.GENERAL", shape24, (java.awt.Paint) color31, stroke32, paint33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'outlineStroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator7);
        org.junit.Assert.assertNotNull(font11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(shape24);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(paint33);
    }

    @Test
    public void test322() throws Throwable {
printRuntimeMSG("---RegressionTest0:test322");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        java.lang.Object obj1 = abstractCategoryDataset0.clone();
        java.lang.Object obj2 = abstractCategoryDataset0.clone();
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer15.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean18 = lineAndShapeRenderer15.getBaseLinesVisible();
        java.awt.Shape shape19 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer15.setBaseLegendShape(shape19);
        renderAttributes11.setSeriesShape((int) ' ', shape19);
        org.jfree.chart.entity.ChartEntity chartEntity23 = new org.jfree.chart.entity.ChartEntity(shape19, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color26 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem27 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color26);
        java.lang.String str28 = legendItem27.getToolTipText();
        java.awt.Stroke stroke29 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem27.setOutlineStroke(stroke29);
        java.awt.Shape shape35 = null;
        java.awt.Color color36 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color38 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape35, (java.awt.Paint) color36, stroke37, (java.awt.Paint) color38);
        java.lang.Class<?> wildcardClass40 = color36.getClass();
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape19, paint24, stroke29, (java.awt.Paint) color36);
        org.jfree.chart.entity.ChartEntity chartEntity42 = new org.jfree.chart.entity.ChartEntity(shape19);
        java.awt.Color color43 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape19, (java.awt.Paint) color43);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity50 = new org.jfree.chart.entity.CategoryItemEntity(shape19, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        abstractCategoryDataset0.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset47);
        try {
            defaultCategoryDataset47.removeColumn((-16777216));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -16777216");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test323() throws Throwable {
printRuntimeMSG("---RegressionTest0:test323");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        abstractCategoryDataset0.validateObject();
        org.jfree.data.general.DatasetGroup datasetGroup2 = null;
        try {
            abstractCategoryDataset0.setGroup(datasetGroup2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'group' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test324() throws Throwable {
printRuntimeMSG("---RegressionTest0:test324");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        java.awt.Stroke stroke11 = categoryPlot0.getRangeZeroBaselineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer13 = categoryPlot0.getRenderer(10);
        categoryPlot0.setBackgroundImageAlignment((-8355712));
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(categoryItemRenderer13);
    }

    @Test
    public void test325() throws Throwable {
printRuntimeMSG("---RegressionTest0:test325");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        double double3 = rectangleInsets0.calculateTopOutset((double) (short) -1);
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType5 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType6 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D7 = rectangleInsets0.createAdjustedRectangle(rectangle2D4, lengthAdjustmentType5, lengthAdjustmentType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test326() throws Throwable {
printRuntimeMSG("---RegressionTest0:test326");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        categoryPlot0.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo12, point2D13);
        categoryPlot9.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot9.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder17);
        java.awt.geom.GeneralPath generalPath19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        org.jfree.chart.RenderingSource renderingSource21 = null;
        categoryPlot0.select(generalPath19, rectangle2D20, renderingSource21);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sortOrder17);
    }

    @Test
    public void test327() throws Throwable {
printRuntimeMSG("---RegressionTest0:test327");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
        java.awt.Shape shape4 = renderAttributes1.getItemShape((int) '4', (int) (byte) 100);
        java.awt.Stroke stroke6 = renderAttributes1.getSeriesStroke((int) (short) 0);
        java.awt.Paint paint9 = renderAttributes1.getItemOutlinePaint((-65536), (-65536));
        org.junit.Assert.assertNull(shape4);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNull(paint9);
    }

    @Test
    public void test328() throws Throwable {
printRuntimeMSG("---RegressionTest0:test328");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getLegendItems();
        try {
            org.jfree.chart.LegendItem legendItem7 = legendItemCollection5.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 97, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(legendItemCollection5);
    }

    @Test
    public void test329() throws Throwable {
printRuntimeMSG("---RegressionTest0:test329");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        java.lang.Object obj1 = objectList0.clone();
        int int2 = objectList0.size();
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test330() throws Throwable {
printRuntimeMSG("---RegressionTest0:test330");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean6 = lineAndShapeRenderer4.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean7 = lineAndShapeRenderer4.getBaseLinesVisible();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer4.setBaseLegendShape(shape8);
        renderAttributes0.setSeriesShape((int) ' ', shape8);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean15 = lineAndShapeRenderer13.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean16 = lineAndShapeRenderer13.getBaseLinesVisible();
        java.awt.Shape shape17 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer13.setBaseLegendShape(shape17);
        renderAttributes0.setDefaultShape(shape17);
        org.jfree.chart.entity.ChartEntity chartEntity21 = new org.jfree.chart.entity.ChartEntity(shape17, "PlotOrientation.VERTICAL");
        java.lang.String str22 = chartEntity21.getShapeCoords();
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(shape17);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "4,0,2,2,0,4,-2,2,-4,0,-2,-2,0,-4,2,-2,4,0,4,0" + "'", str22.equals("4,0,2,2,0,4,-2,2,-4,0,-2,-2,0,-4,2,-2,4,0,4,0"));
    }

    @Test
    public void test331() throws Throwable {
printRuntimeMSG("---RegressionTest0:test331");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = lineAndShapeRenderer3.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator8 = lineAndShapeRenderer3.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer3.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean13 = lineAndShapeRenderer3.getSeriesCreateEntities((int) (short) 10);
        java.awt.Color color16 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem17 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color16);
        java.awt.Color color18 = java.awt.Color.getColor("hi!", color16);
        lineAndShapeRenderer3.setBaseOutlinePaint((java.awt.Paint) color18);
        org.jfree.chart.LegendItem legendItem20 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color18);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNull(categoryToolTipGenerator8);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(color18);
    }

    @Test
    public void test332() throws Throwable {
printRuntimeMSG("---RegressionTest0:test332");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint4 = renderAttributes3.getDefaultLabelPaint();
        java.awt.Paint paint7 = renderAttributes3.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes3.setDefaultStroke(stroke8);
        barRenderer0.setBaseStroke(stroke8, true);
        barRenderer0.setBaseSeriesVisibleInLegend(true);
        double double14 = barRenderer0.getBase();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = null;
        try {
            barRenderer0.setSeriesItemLabelGenerator((int) (short) -1, categoryItemLabelGenerator16, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test333() throws Throwable {
printRuntimeMSG("---RegressionTest0:test333");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        double double9 = categoryAxis8.getUpperMargin();
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (short) -1, 2.0d, plotRenderingInfo13, point2D14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D16, rectangle2D17, (int) (byte) 100, plotRenderingInfo19, categoryCrosshairState20);
        boolean boolean22 = categoryPlot0.isNotify();
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.Marker marker25 = null;
        org.jfree.chart.util.Layer layer26 = null;
        try {
            boolean boolean27 = categoryPlot0.removeRangeMarker((int) '#', marker25, layer26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(sortOrder23);
    }

    @Test
    public void test334() throws Throwable {
printRuntimeMSG("---RegressionTest0:test334");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.jfree.chart.JFreeChart jFreeChart1 = null;
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent2 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) (-16777216), jFreeChart1);
        org.jfree.chart.JFreeChart jFreeChart3 = chartChangeEvent2.getChart();
        org.junit.Assert.assertNull(jFreeChart3);
    }

    @Test
    public void test335() throws Throwable {
printRuntimeMSG("---RegressionTest0:test335");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint1 = categoryAxis0.getTickLabelPaint();
        categoryAxis0.setTickLabelsVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double5 = rectangleInsets4.getRight();
        double double7 = rectangleInsets4.calculateTopInset(0.0d);
        categoryAxis0.setTickLabelInsets(rectangleInsets4);
        double double9 = rectangleInsets4.getLeft();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test336() throws Throwable {
printRuntimeMSG("---RegressionTest0:test336");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint1 = categoryAxis0.getTickLabelPaint();
        categoryAxis0.setTickLabelsVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double5 = rectangleInsets4.getRight();
        double double7 = rectangleInsets4.calculateTopInset(0.0d);
        categoryAxis0.setTickLabelInsets(rectangleInsets4);
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType10 = null;
        org.jfree.chart.util.LengthAdjustmentType lengthAdjustmentType11 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D12 = rectangleInsets4.createAdjustedRectangle(rectangle2D9, lengthAdjustmentType10, lengthAdjustmentType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
    }

    @Test
    public void test337() throws Throwable {
printRuntimeMSG("---RegressionTest0:test337");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setCategoryMargin((double) 10.0f);
        java.awt.Font font3 = categoryAxis0.getTickLabelFont();
        categoryAxis0.addCategoryLabelToolTip((java.lang.Comparable) 188.0d, "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT");
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke13 = categoryPlot12.getRangeMinorGridlineStroke();
        categoryPlot10.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot10.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent16 = null;
        categoryPlot10.axisChanged(axisChangeEvent16);
        org.jfree.chart.axis.AxisSpace axisSpace18 = categoryPlot10.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset19 = null;
        categoryPlot10.setDataset(categoryDataset19);
        java.awt.Stroke stroke21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot10.setDomainCrosshairStroke(stroke21);
        java.awt.Stroke stroke23 = categoryPlot10.getRangeGridlineStroke();
        org.jfree.chart.util.RectangleEdge rectangleEdge24 = categoryPlot10.getRangeAxisEdge();
        try {
            double double25 = categoryAxis0.getCategoryStart(10, 0, rectangle2D9, rectangleEdge24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(legendItemCollection15);
        org.junit.Assert.assertNull(axisSpace18);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleEdge24);
    }

    @Test
    public void test338() throws Throwable {
printRuntimeMSG("---RegressionTest0:test338");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.text.AttributedString attributedString0 = null;
        org.jfree.chart.renderer.RenderAttributes renderAttributes12 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean18 = lineAndShapeRenderer16.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean19 = lineAndShapeRenderer16.getBaseLinesVisible();
        java.awt.Shape shape20 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer16.setBaseLegendShape(shape20);
        renderAttributes12.setSeriesShape((int) ' ', shape20);
        org.jfree.chart.entity.ChartEntity chartEntity24 = new org.jfree.chart.entity.ChartEntity(shape20, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color27 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem28 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color27);
        java.lang.String str29 = legendItem28.getToolTipText();
        java.awt.Stroke stroke30 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem28.setOutlineStroke(stroke30);
        java.awt.Shape shape36 = null;
        java.awt.Color color37 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color39 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem40 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape36, (java.awt.Paint) color37, stroke38, (java.awt.Paint) color39);
        java.lang.Class<?> wildcardClass41 = color37.getClass();
        org.jfree.chart.LegendItem legendItem42 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape20, paint25, stroke30, (java.awt.Paint) color37);
        org.jfree.chart.entity.ChartEntity chartEntity43 = new org.jfree.chart.entity.ChartEntity(shape20);
        java.awt.Color color44 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem45 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape20, (java.awt.Paint) color44);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset48 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity51 = new org.jfree.chart.entity.CategoryItemEntity(shape20, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset48, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        java.lang.String str52 = categoryItemEntity51.toString();
        java.awt.Shape shape53 = categoryItemEntity51.getArea();
        org.jfree.chart.renderer.RenderAttributes renderAttributes54 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint55 = renderAttributes54.getDefaultLabelPaint();
        java.awt.Stroke stroke58 = renderAttributes54.getItemStroke((int) (byte) 10, (int) 'a');
        org.jfree.chart.renderer.RenderAttributes renderAttributes59 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint60 = renderAttributes59.getDefaultLabelPaint();
        java.awt.Paint paint63 = renderAttributes59.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke64 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes59.setDefaultStroke(stroke64);
        renderAttributes54.setDefaultOutlineStroke(stroke64);
        java.awt.Paint paint67 = null;
        try {
            org.jfree.chart.LegendItem legendItem68 = new org.jfree.chart.LegendItem(attributedString0, "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", "ChartChangeEventType.NEW_DATASET", "ItemLabelAnchor.INSIDE5", shape53, stroke64, paint67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'label' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(shape53);
        org.junit.Assert.assertNull(paint55);
        org.junit.Assert.assertNull(stroke58);
        org.junit.Assert.assertNull(paint60);
        org.junit.Assert.assertNull(paint63);
        org.junit.Assert.assertNotNull(stroke64);
    }

    @Test
    public void test339() throws Throwable {
printRuntimeMSG("---RegressionTest0:test339");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        double double2 = rectangleInsets0.getTop();
        double double4 = rectangleInsets0.trimHeight((double) 100);
        double double5 = rectangleInsets0.getRight();
        double double7 = rectangleInsets0.trimHeight((-1.2566464E7d));
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 96.0d + "'", double4 == 96.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.2566468E7d) + "'", double7 == (-1.2566468E7d));
    }

    @Test
    public void test340() throws Throwable {
printRuntimeMSG("---RegressionTest0:test340");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getLegendTextPaint((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        try {
            lineAndShapeRenderer2.setSeriesShapesFilled((-65536), false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
    }

    @Test
    public void test341() throws Throwable {
printRuntimeMSG("---RegressionTest0:test341");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.jfree.chart.renderer.RenderAttributes renderAttributes4 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean10 = lineAndShapeRenderer8.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean11 = lineAndShapeRenderer8.getBaseLinesVisible();
        java.awt.Shape shape12 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer8.setBaseLegendShape(shape12);
        renderAttributes4.setSeriesShape((int) ' ', shape12);
        org.jfree.chart.entity.ChartEntity chartEntity16 = new org.jfree.chart.entity.ChartEntity(shape12, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint17 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color19 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem20 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color19);
        java.lang.String str21 = legendItem20.getToolTipText();
        java.awt.Stroke stroke22 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem20.setOutlineStroke(stroke22);
        java.awt.Shape shape28 = null;
        java.awt.Color color29 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color31 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem32 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape28, (java.awt.Paint) color29, stroke30, (java.awt.Paint) color31);
        java.lang.Class<?> wildcardClass33 = color29.getClass();
        org.jfree.chart.LegendItem legendItem34 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape12, paint17, stroke22, (java.awt.Paint) color29);
        org.jfree.chart.entity.ChartEntity chartEntity35 = new org.jfree.chart.entity.ChartEntity(shape12);
        chartEntity35.setToolTipText("");
        java.lang.String str38 = chartEntity35.toString();
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(shape12);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(color31);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "ChartEntity: tooltip = " + "'", str38.equals("ChartEntity: tooltip = "));
    }

    @Test
    public void test342() throws Throwable {
printRuntimeMSG("---RegressionTest0:test342");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.jfree.chart.axis.AxisLocation axisLocation0 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke2 = categoryPlot1.getRangeMinorGridlineStroke();
        categoryPlot1.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation5 = categoryPlot1.getOrientation();
        java.lang.String str6 = plotOrientation5.toString();
        try {
            org.jfree.chart.util.RectangleEdge rectangleEdge7 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation0, plotOrientation5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(plotOrientation5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "PlotOrientation.VERTICAL" + "'", str6.equals("PlotOrientation.VERTICAL"));
    }

    @Test
    public void test343() throws Throwable {
printRuntimeMSG("---RegressionTest0:test343");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.awt.Shape shape0 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_SHAPE;
        org.junit.Assert.assertNotNull(shape0);
    }

    @Test
    public void test344() throws Throwable {
printRuntimeMSG("---RegressionTest0:test344");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.jfree.chart.util.StrokeList strokeList0 = new org.jfree.chart.util.StrokeList();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = lineAndShapeRenderer3.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = lineAndShapeRenderer3.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = lineAndShapeRenderer3.getSeriesURLGenerator(0);
        boolean boolean9 = strokeList0.equals((java.lang.Object) categoryURLGenerator8);
        java.awt.Stroke stroke11 = strokeList0.getStroke((-12566464));
        int int12 = strokeList0.size();
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryURLGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test345() throws Throwable {
printRuntimeMSG("---RegressionTest0:test345");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesItemLabelsVisible(0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        boolean boolean14 = lineAndShapeRenderer13.getUseOutlinePaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean19 = lineAndShapeRenderer17.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = lineAndShapeRenderer17.getNegativeItemLabelPosition((int) '4', (int) '4', false);
        lineAndShapeRenderer13.setBasePositiveItemLabelPosition(itemLabelPosition23);
        lineAndShapeRenderer2.setBaseNegativeItemLabelPosition(itemLabelPosition23);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator30 = lineAndShapeRenderer29.getBaseItemLabelGenerator();
        java.awt.Paint paint32 = lineAndShapeRenderer29.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = lineAndShapeRenderer29.getSeriesURLGenerator(0);
        double double35 = lineAndShapeRenderer29.getItemMargin();
        java.awt.Stroke stroke37 = lineAndShapeRenderer29.lookupSeriesOutlineStroke(100);
        try {
            lineAndShapeRenderer2.setSeriesStroke((-8355712), stroke37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNull(categoryItemLabelGenerator30);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertNull(categoryURLGenerator34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(stroke37);
    }

    @Test
    public void test346() throws Throwable {
printRuntimeMSG("---RegressionTest0:test346");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis9.setCategoryMargin((double) 10.0f);
        java.awt.Font font12 = categoryAxis9.getTickLabelFont();
        lineAndShapeRenderer2.setSeriesItemLabelFont(15, font12, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
    }

    @Test
    public void test347() throws Throwable {
printRuntimeMSG("---RegressionTest0:test347");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) '4', (int) '4', false);
        lineAndShapeRenderer2.setDefaultEntityRadius(3);
        java.awt.Font font12 = lineAndShapeRenderer2.lookupLegendTextFont((int) (short) 100);
        boolean boolean13 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test348() throws Throwable {
printRuntimeMSG("---RegressionTest0:test348");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot0.setDomainCrosshairStroke(stroke11);
        java.awt.Stroke stroke13 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setForegroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset16 = categoryPlot0.getDataset();
        java.awt.Paint paint17 = categoryPlot0.getDomainCrosshairPaint();
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        categoryPlot0.setRangeAxis(4, valueAxis19);
        org.jfree.chart.plot.Marker marker21 = null;
        org.jfree.chart.util.Layer layer22 = null;
        try {
            boolean boolean23 = categoryPlot0.removeRangeMarker(marker21, layer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test349() throws Throwable {
printRuntimeMSG("---RegressionTest0:test349");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint2 = renderAttributes0.getSeriesPaint(10);
        java.awt.Paint paint4 = renderAttributes0.getSeriesPaint((int) (byte) 1);
        boolean boolean5 = renderAttributes0.getAllowNull();
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test350() throws Throwable {
printRuntimeMSG("---RegressionTest0:test350");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.util.Locale locale1 = null;
        java.lang.ClassLoader classLoader2 = null;
        try {
            java.util.ResourceBundle resourceBundle3 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("PlotOrientation.VERTICAL", locale1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test351() throws Throwable {
printRuntimeMSG("---RegressionTest0:test351");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        org.jfree.chart.axis.ValueAxis valueAxis10 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(valueAxis10);
    }

    @Test
    public void test352() throws Throwable {
printRuntimeMSG("---RegressionTest0:test352");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis2 = null;
        categoryPlot0.setRangeAxis(valueAxis2);
        org.jfree.chart.util.RectangleEdge rectangleEdge4 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.axis.AxisLocation axisLocation6 = categoryPlot0.getRangeAxisLocation((-12566464));
        org.jfree.chart.util.RectangleInsets rectangleInsets7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str8 = rectangleInsets7.toString();
        double double9 = rectangleInsets7.getTop();
        categoryPlot0.setAxisOffset(rectangleInsets7);
        categoryPlot0.mapDatasetToDomainAxis((int) (byte) 1, (-65536));
        org.jfree.chart.plot.Marker marker14 = null;
        try {
            categoryPlot0.addRangeMarker(marker14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str8.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
    }

    @Test
    public void test353() throws Throwable {
printRuntimeMSG("---RegressionTest0:test353");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Stroke stroke4 = renderAttributes0.getItemStroke((int) (byte) 10, (int) 'a');
        java.awt.Shape shape9 = null;
        java.awt.Color color10 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color12 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem13 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape9, (java.awt.Paint) color10, stroke11, (java.awt.Paint) color12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke15 = categoryPlot14.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer16 = null;
        categoryPlot14.setRenderer(categoryItemRenderer16);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent18 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot14);
        categoryPlot14.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis21 = categoryPlot14.getRangeAxis();
        org.jfree.chart.LegendItemCollection legendItemCollection22 = categoryPlot14.getFixedLegendItems();
        java.awt.Font font23 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        categoryPlot14.setNoDataMessageFont(font23);
        legendItem13.setLabelFont(font23);
        renderAttributes0.setDefaultLabelFont(font23);
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNull(valueAxis21);
        org.junit.Assert.assertNull(legendItemCollection22);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test354() throws Throwable {
printRuntimeMSG("---RegressionTest0:test354");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint2 = renderAttributes0.getSeriesPaint(10);
        java.awt.Paint paint4 = renderAttributes0.getSeriesPaint((int) (byte) 1);
        java.awt.Color color6 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem7 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color6);
        java.lang.String str8 = legendItem7.getToolTipText();
        java.awt.Stroke stroke9 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem7.setOutlineStroke(stroke9);
        renderAttributes0.setDefaultStroke(stroke9);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(stroke9);
    }

    @Test
    public void test355() throws Throwable {
printRuntimeMSG("---RegressionTest0:test355");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.awt.Shape shape0 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke2 = categoryPlot1.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke4 = categoryPlot3.getRangeMinorGridlineStroke();
        categoryPlot1.setParent((org.jfree.chart.plot.Plot) categoryPlot3);
        org.jfree.chart.LegendItemCollection legendItemCollection6 = categoryPlot1.getFixedLegendItems();
        java.lang.Comparable comparable7 = categoryPlot1.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge8 = categoryPlot1.getRangeAxisEdge();
        categoryPlot1.setRangeZeroBaselineVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = categoryPlot1.getRenderer((int) (byte) -1);
        org.jfree.chart.entity.PlotEntity plotEntity13 = new org.jfree.chart.entity.PlotEntity(shape0, (org.jfree.chart.plot.Plot) categoryPlot1);
        categoryPlot1.setRangeCrosshairValue(0.05d, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot1.getRenderer();
        org.junit.Assert.assertNotNull(shape0);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(legendItemCollection6);
        org.junit.Assert.assertNull(comparable7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNull(categoryItemRenderer17);
    }

    @Test
    public void test356() throws Throwable {
printRuntimeMSG("---RegressionTest0:test356");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 1, 2.0d, (double) 10, (double) 4);
    }

    @Test
    public void test357() throws Throwable {
printRuntimeMSG("---RegressionTest0:test357");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        java.awt.Paint paint7 = lineAndShapeRenderer2.lookupSeriesOutlinePaint((int) (byte) 1);
        java.awt.Font font8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_VALUE_LABEL_FONT;
        lineAndShapeRenderer2.setBaseLegendTextFont(font8);
        boolean boolean10 = lineAndShapeRenderer2.getDrawOutlines();
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test358() throws Throwable {
printRuntimeMSG("---RegressionTest0:test358");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.awt.Paint paint11 = lineAndShapeRenderer7.getSeriesFillPaint((int) (byte) 1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test359() throws Throwable {
printRuntimeMSG("---RegressionTest0:test359");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.text.AttributedString attributedString0 = null;
        org.jfree.chart.renderer.RenderAttributes renderAttributes12 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean18 = lineAndShapeRenderer16.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean19 = lineAndShapeRenderer16.getBaseLinesVisible();
        java.awt.Shape shape20 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer16.setBaseLegendShape(shape20);
        renderAttributes12.setSeriesShape((int) ' ', shape20);
        org.jfree.chart.entity.ChartEntity chartEntity24 = new org.jfree.chart.entity.ChartEntity(shape20, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color27 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem28 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color27);
        java.lang.String str29 = legendItem28.getToolTipText();
        java.awt.Stroke stroke30 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem28.setOutlineStroke(stroke30);
        java.awt.Shape shape36 = null;
        java.awt.Color color37 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color39 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem40 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape36, (java.awt.Paint) color37, stroke38, (java.awt.Paint) color39);
        java.lang.Class<?> wildcardClass41 = color37.getClass();
        org.jfree.chart.LegendItem legendItem42 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape20, paint25, stroke30, (java.awt.Paint) color37);
        org.jfree.chart.entity.ChartEntity chartEntity43 = new org.jfree.chart.entity.ChartEntity(shape20);
        java.awt.Color color44 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem45 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape20, (java.awt.Paint) color44);
        java.awt.Stroke stroke46 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        org.jfree.chart.axis.CategoryAxis categoryAxis47 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.data.category.CategoryDataset categoryDataset48 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis49 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis49.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis52 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = lineAndShapeRenderer55.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot(categoryDataset48, categoryAxis49, valueAxis52, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer55);
        boolean boolean58 = categoryAxis49.isTickLabelsVisible();
        double double59 = categoryAxis49.getFixedDimension();
        java.awt.Paint paint61 = categoryAxis49.getTickLabelPaint((java.lang.Comparable) 4.0d);
        categoryAxis47.setTickLabelPaint(paint61);
        try {
            org.jfree.chart.LegendItem legendItem63 = new org.jfree.chart.LegendItem(attributedString0, "org.jfree.chart.event.ChartChangeEvent[source=-16777216]", "GradientPaintTransformType.VERTICAL", "ChartEntity: tooltip = ", shape20, stroke46, paint61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'label' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(color44);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNull(categoryItemLabelGenerator56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertNotNull(paint61);
    }

    @Test
    public void test360() throws Throwable {
printRuntimeMSG("---RegressionTest0:test360");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Stroke stroke4 = renderAttributes0.getItemStroke((int) (byte) 10, (int) 'a');
        org.jfree.chart.renderer.RenderAttributes renderAttributes5 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint6 = renderAttributes5.getDefaultLabelPaint();
        java.awt.Paint paint9 = renderAttributes5.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes5.setDefaultStroke(stroke10);
        renderAttributes0.setDefaultOutlineStroke(stroke10);
        java.awt.Color color13 = java.awt.Color.GRAY;
        renderAttributes0.setDefaultOutlinePaint((java.awt.Paint) color13);
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test361() throws Throwable {
printRuntimeMSG("---RegressionTest0:test361");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition1 = barRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getNegativeItemLabelPositionFallback();
        java.awt.Font font6 = barRenderer0.getItemLabelFont(0, (int) (short) 1, false);
        org.junit.Assert.assertNull(itemLabelPosition1);
        org.junit.Assert.assertNull(itemLabelPosition2);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test362() throws Throwable {
printRuntimeMSG("---RegressionTest0:test362");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        double double2 = rectangleInsets0.getTop();
        double double4 = rectangleInsets0.calculateTopOutset((double) ' ');
        double double6 = rectangleInsets0.trimWidth((double) (short) -1);
        double double8 = rectangleInsets0.calculateTopInset(0.05d);
        double double9 = rectangleInsets0.getRight();
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-9.0d) + "'", double6 == (-9.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 2.0d + "'", double8 == 2.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 4.0d + "'", double9 == 4.0d);
    }

    @Test
    public void test363() throws Throwable {
printRuntimeMSG("---RegressionTest0:test363");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        java.awt.Paint paint9 = legendItem8.getLabelPaint();
        java.lang.String str10 = legendItem8.getURLText();
        java.lang.Comparable comparable11 = legendItem8.getSeriesKey();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str10.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNull(comparable11);
    }

    @Test
    public void test364() throws Throwable {
printRuntimeMSG("---RegressionTest0:test364");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.plot.Marker marker7 = null;
        org.jfree.chart.util.Layer layer8 = null;
        boolean boolean10 = categoryPlot0.removeDomainMarker((int) (short) 1, marker7, layer8, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test365() throws Throwable {
printRuntimeMSG("---RegressionTest0:test365");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        java.lang.Object obj1 = abstractCategoryDataset0.clone();
        java.lang.Object obj2 = abstractCategoryDataset0.clone();
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer15.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean18 = lineAndShapeRenderer15.getBaseLinesVisible();
        java.awt.Shape shape19 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer15.setBaseLegendShape(shape19);
        renderAttributes11.setSeriesShape((int) ' ', shape19);
        org.jfree.chart.entity.ChartEntity chartEntity23 = new org.jfree.chart.entity.ChartEntity(shape19, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color26 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem27 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color26);
        java.lang.String str28 = legendItem27.getToolTipText();
        java.awt.Stroke stroke29 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem27.setOutlineStroke(stroke29);
        java.awt.Shape shape35 = null;
        java.awt.Color color36 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color38 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape35, (java.awt.Paint) color36, stroke37, (java.awt.Paint) color38);
        java.lang.Class<?> wildcardClass40 = color36.getClass();
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape19, paint24, stroke29, (java.awt.Paint) color36);
        org.jfree.chart.entity.ChartEntity chartEntity42 = new org.jfree.chart.entity.ChartEntity(shape19);
        java.awt.Color color43 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape19, (java.awt.Paint) color43);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity50 = new org.jfree.chart.entity.CategoryItemEntity(shape19, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        abstractCategoryDataset0.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset47);
        java.lang.Comparable comparable54 = null;
        try {
            defaultCategoryDataset47.setValue((java.lang.Number) 0.0d, (java.lang.Comparable) "org.jfree.chart.event.ChartChangeEvent[source=-16777216]", comparable54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'columnKey' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test366() throws Throwable {
printRuntimeMSG("---RegressionTest0:test366");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    }

    @Test
    public void test367() throws Throwable {
printRuntimeMSG("---RegressionTest0:test367");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot0.getDrawingSupplier();
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        java.util.List list9 = categoryPlot0.getCategoriesForAxis(categoryAxis8);
        java.awt.Graphics2D graphics2D10 = null;
        org.jfree.chart.axis.AxisState axisState11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.util.RectangleEdge rectangleEdge13 = null;
        try {
            java.util.List list14 = categoryAxis8.refreshTicks(graphics2D10, axisState11, rectangle2D12, rectangleEdge13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(list9);
    }

    @Test
    public void test368() throws Throwable {
printRuntimeMSG("---RegressionTest0:test368");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        categoryPlot0.setWeight((int) (short) 1);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation14 = null;
        try {
            boolean boolean16 = categoryPlot0.removeAnnotation(categoryAnnotation14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list11);
    }

    @Test
    public void test369() throws Throwable {
printRuntimeMSG("---RegressionTest0:test369");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        barRenderer0.setBaseItemLabelsVisible(false);
        double double5 = barRenderer0.getItemMargin();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = barRenderer0.getBaseURLGenerator();
        barRenderer0.setShadowXOffset((double) (-16777216));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = barRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.renderer.RenderAttributes renderAttributes14 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean20 = lineAndShapeRenderer18.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean21 = lineAndShapeRenderer18.getBaseLinesVisible();
        java.awt.Shape shape22 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer18.setBaseLegendShape(shape22);
        renderAttributes14.setSeriesShape((int) ' ', shape22);
        org.jfree.chart.entity.ChartEntity chartEntity26 = new org.jfree.chart.entity.ChartEntity(shape22, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color29 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem30 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color29);
        java.lang.String str31 = legendItem30.getToolTipText();
        java.awt.Stroke stroke32 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem30.setOutlineStroke(stroke32);
        java.awt.Shape shape38 = null;
        java.awt.Color color39 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color41 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem42 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape38, (java.awt.Paint) color39, stroke40, (java.awt.Paint) color41);
        java.lang.Class<?> wildcardClass43 = color39.getClass();
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape22, paint27, stroke32, (java.awt.Paint) color39);
        boolean boolean45 = barRenderer0.equals((java.lang.Object) "GradientPaintTransformType.CENTER_VERTICAL");
        boolean boolean46 = barRenderer0.getShadowsVisible();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test370() throws Throwable {
printRuntimeMSG("---RegressionTest0:test370");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        double double1 = categoryAxis0.getUpperMargin();
        java.awt.Font font3 = categoryAxis0.getTickLabelFont((java.lang.Comparable) 3);
        categoryAxis0.clearCategoryLabelToolTips();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.05d + "'", double1 == 0.05d);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test371() throws Throwable {
printRuntimeMSG("---RegressionTest0:test371");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.jfree.chart.axis.AxisLocation axisLocation0 = org.jfree.chart.axis.AxisLocation.TOP_OR_RIGHT;
        org.junit.Assert.assertNotNull(axisLocation0);
    }

    @Test
    public void test372() throws Throwable {
printRuntimeMSG("---RegressionTest0:test372");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getLegendTextPaint((-1));
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) ' ');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
    }

    @Test
    public void test373() throws Throwable {
printRuntimeMSG("---RegressionTest0:test373");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.chart.event.ChartChangeEventType chartChangeEventType5 = plotChangeEvent4.getType();
        org.jfree.chart.JFreeChart jFreeChart6 = null;
        plotChangeEvent4.setChart(jFreeChart6);
        org.jfree.chart.plot.Plot plot8 = plotChangeEvent4.getPlot();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(chartChangeEventType5);
        org.junit.Assert.assertNotNull(plot8);
    }

    @Test
    public void test374() throws Throwable {
printRuntimeMSG("---RegressionTest0:test374");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer2.getNegativeItemLabelPosition(0, 0, true);
        boolean boolean12 = lineAndShapeRenderer2.getBaseShapesVisible();
        boolean boolean13 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = null;
        lineAndShapeRenderer2.setBaseItemLabelGenerator(categoryItemLabelGenerator14, true);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test375() throws Throwable {
printRuntimeMSG("---RegressionTest0:test375");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        boolean boolean12 = categoryPlot0.canSelectByRegion();
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test376() throws Throwable {
printRuntimeMSG("---RegressionTest0:test376");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        double double9 = categoryAxis8.getUpperMargin();
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (short) -1, 2.0d, plotRenderingInfo13, point2D14);
        org.jfree.chart.plot.Marker marker16 = null;
        boolean boolean17 = categoryPlot0.removeDomainMarker(marker16);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test377() throws Throwable {
printRuntimeMSG("---RegressionTest0:test377");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE10;
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
    }

    @Test
    public void test378() throws Throwable {
printRuntimeMSG("---RegressionTest0:test378");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean6 = lineAndShapeRenderer4.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean7 = lineAndShapeRenderer4.getBaseLinesVisible();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer4.setBaseLegendShape(shape8);
        renderAttributes0.setSeriesShape((int) ' ', shape8);
        org.jfree.chart.entity.ChartEntity chartEntity12 = new org.jfree.chart.entity.ChartEntity(shape8, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        chartEntity12.setToolTipText("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT");
        java.lang.String str15 = chartEntity12.toString();
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "ChartEntity: tooltip = org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str15.equals("ChartEntity: tooltip = org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
    }

    @Test
    public void test379() throws Throwable {
printRuntimeMSG("---RegressionTest0:test379");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        java.util.List list3 = keyedObjects2D0.getColumnKeys();
        try {
            keyedObjects2D0.removeObject((java.lang.Comparable) 4, (java.lang.Comparable) (-16777216));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (4) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test380() throws Throwable {
printRuntimeMSG("---RegressionTest0:test380");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Color color2 = java.awt.Color.RED;
        renderAttributes0.setDefaultOutlinePaint((java.awt.Paint) color2);
        java.awt.Shape shape6 = renderAttributes0.getItemShape((int) 'a', (int) ' ');
        java.awt.Paint paint7 = renderAttributes0.getDefaultFillPaint();
        java.awt.Shape shape10 = renderAttributes0.getItemShape((int) (short) 0, 128);
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(shape10);
    }

    @Test
    public void test381() throws Throwable {
printRuntimeMSG("---RegressionTest0:test381");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        categoryPlot2.setDomainCrosshairColumnKey((java.lang.Comparable) (-1L), true);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot2.getDomainAxisLocation(0);
        java.awt.Graphics2D graphics2D10 = null;
        java.awt.geom.Rectangle2D rectangle2D11 = null;
        java.awt.geom.Point2D point2D12 = null;
        org.jfree.chart.plot.PlotState plotState13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        try {
            categoryPlot2.draw(graphics2D10, rectangle2D11, point2D12, plotState13, plotRenderingInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test382() throws Throwable {
printRuntimeMSG("---RegressionTest0:test382");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis2.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = lineAndShapeRenderer8.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        boolean boolean11 = categoryAxis2.isTickLabelsVisible();
        double double12 = categoryAxis2.getFixedDimension();
        java.awt.Paint paint14 = categoryAxis2.getTickLabelPaint((java.lang.Comparable) 4.0d);
        categoryAxis0.setTickLabelPaint(paint14);
        categoryAxis0.setTickMarkInsideLength((float) (-1L));
        categoryAxis0.setCategoryMargin((double) (byte) 100);
        java.awt.Paint paint20 = categoryAxis0.getTickLabelPaint();
        float float21 = categoryAxis0.getMinorTickMarkInsideLength();
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test383() throws Throwable {
printRuntimeMSG("---RegressionTest0:test383");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        lineAndShapeRenderer10.setSeriesPositiveItemLabelPosition(0, itemLabelPosition12);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer10.setLegendItemToolTipGenerator(categorySeriesLabelGenerator14);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        boolean boolean17 = lineAndShapeRenderer10.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        java.lang.Object obj19 = lineAndShapeRenderer10.clone();
        categoryPlot0.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer10, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer10.setBaseURLGenerator(categoryURLGenerator22);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset24 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.Range range25 = lineAndShapeRenderer10.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset24);
        java.lang.Object obj26 = defaultCategoryDataset24.clone();
        try {
            java.lang.Comparable comparable28 = defaultCategoryDataset24.getColumnKey((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(range25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test384() throws Throwable {
printRuntimeMSG("---RegressionTest0:test384");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (short) 10);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint((int) (byte) -1);
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke19 = categoryPlot18.getRangeMinorGridlineStroke();
        categoryPlot16.setParent((org.jfree.chart.plot.Plot) categoryPlot18);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = categoryPlot16.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        categoryPlot16.axisChanged(axisChangeEvent22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = categoryPlot16.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        categoryPlot16.setDataset(categoryDataset25);
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot16.setDomainCrosshairStroke(stroke27);
        java.awt.Stroke stroke29 = categoryPlot16.getRangeGridlineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        lineAndShapeRenderer32.setSeriesPositiveItemLabelPosition(0, itemLabelPosition34);
        java.awt.Shape shape40 = null;
        java.awt.Color color41 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color43 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape40, (java.awt.Paint) color41, stroke42, (java.awt.Paint) color43);
        lineAndShapeRenderer32.setBaseOutlineStroke(stroke42, false);
        categoryPlot16.setDomainGridlineStroke(stroke42);
        categoryPlot16.setCrosshairDatasetIndex(4);
        int int50 = categoryPlot16.getRangeAxisCount();
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        try {
            lineAndShapeRenderer2.drawOutline(graphics2D15, categoryPlot16, rectangle2D51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(legendItemCollection21);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test385() throws Throwable {
printRuntimeMSG("---RegressionTest0:test385");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        java.awt.Paint paint10 = barRenderer0.getShadowPaint();
        java.awt.Shape shape11 = barRenderer0.getBaseShape();
        barRenderer0.setMaximumBarWidth((double) 0L);
        barRenderer0.setItemLabelAnchorOffset((double) (byte) -1);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test386() throws Throwable {
printRuntimeMSG("---RegressionTest0:test386");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        lineAndShapeRenderer10.setSeriesPositiveItemLabelPosition(0, itemLabelPosition12);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer10.setLegendItemToolTipGenerator(categorySeriesLabelGenerator14);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        boolean boolean17 = lineAndShapeRenderer10.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        java.lang.Object obj19 = lineAndShapeRenderer10.clone();
        categoryPlot0.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer10, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer10.setBaseURLGenerator(categoryURLGenerator22);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset24 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.Range range25 = lineAndShapeRenderer10.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset24);
        try {
            java.lang.Number number28 = defaultCategoryDataset24.getValue((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(range25);
    }

    @Test
    public void test387() throws Throwable {
printRuntimeMSG("---RegressionTest0:test387");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        int int6 = lineAndShapeRenderer2.getPassCount();
        java.awt.Paint paint10 = lineAndShapeRenderer2.getItemLabelPaint(0, (int) '#', true);
        java.awt.Paint paint12 = lineAndShapeRenderer2.getSeriesItemLabelPaint((-16777216));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint12);
    }

    @Test
    public void test388() throws Throwable {
printRuntimeMSG("---RegressionTest0:test388");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes(true);
        keyedObjects0.setObject((java.lang.Comparable) true, (java.lang.Object) true);
        keyedObjects0.clear();
        try {
            java.lang.Object obj7 = keyedObjects0.getObject((java.lang.Comparable) 100);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: The key (100) is not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
    }

    @Test
    public void test389() throws Throwable {
printRuntimeMSG("---RegressionTest0:test389");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean10 = sortOrder8.equals((java.lang.Object) categoryPlot9);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = new org.jfree.chart.axis.CategoryAxis();
        double double12 = categoryAxis11.getUpperMargin();
        categoryPlot9.setDomainAxis(categoryAxis11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot9.markerChanged(markerChangeEvent14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        categoryPlot16.setBackgroundImageAlignment((int) (byte) -1);
        int int20 = categoryPlot16.getDatasetCount();
        java.awt.Paint paint21 = categoryPlot16.getDomainCrosshairPaint();
        categoryPlot9.setDomainGridlinePaint(paint21);
        org.jfree.chart.plot.CategoryMarker categoryMarker23 = null;
        try {
            categoryPlot9.addDomainMarker(categoryMarker23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.05d + "'", double12 == 0.05d);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test390() throws Throwable {
printRuntimeMSG("---RegressionTest0:test390");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        barRenderer0.setBaseItemLabelsVisible(false);
        double double5 = barRenderer0.getItemMargin();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = barRenderer0.getBaseURLGenerator();
        barRenderer0.setIncludeBaseInRange(true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = null;
        barRenderer0.setBaseURLGenerator(categoryURLGenerator9, true);
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke15 = categoryPlot14.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        categoryPlot14.setParent((org.jfree.chart.plot.Plot) categoryPlot16);
        org.jfree.chart.LegendItemCollection legendItemCollection19 = categoryPlot14.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier20 = categoryPlot14.getDrawingSupplier();
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.data.category.CategoryDataset categoryDataset23 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis24 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis24.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis27 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer30.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot(categoryDataset23, categoryAxis24, valueAxis27, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer30);
        boolean boolean33 = categoryAxis24.isTickLabelsVisible();
        double double34 = categoryAxis24.getFixedDimension();
        java.awt.Paint paint36 = categoryAxis24.getTickLabelPaint((java.lang.Comparable) 4.0d);
        categoryAxis22.setTickLabelPaint(paint36);
        categoryAxis22.setTickMarkInsideLength((float) (-1L));
        categoryAxis22.setMinorTickMarkInsideLength((float) (-12566464));
        categoryPlot14.setDomainAxis(192, categoryAxis22, true);
        org.jfree.data.category.CategoryDataset categoryDataset44 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis45 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis45.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis48 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator52 = lineAndShapeRenderer51.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot(categoryDataset44, categoryAxis45, valueAxis48, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer51);
        boolean boolean54 = categoryAxis45.isTickLabelsVisible();
        double double55 = categoryAxis45.getFixedDimension();
        org.jfree.chart.axis.ValueAxis valueAxis56 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot57 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke58 = categoryPlot57.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation59 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation60 = axisLocation59.getOpposite();
        categoryPlot57.setDomainAxisLocation(axisLocation60, false);
        boolean boolean63 = categoryPlot57.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer67 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition69 = null;
        lineAndShapeRenderer67.setSeriesPositiveItemLabelPosition(0, itemLabelPosition69);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator71 = null;
        lineAndShapeRenderer67.setLegendItemToolTipGenerator(categorySeriesLabelGenerator71);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition73 = lineAndShapeRenderer67.getBasePositiveItemLabelPosition();
        boolean boolean74 = lineAndShapeRenderer67.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition75 = lineAndShapeRenderer67.getBasePositiveItemLabelPosition();
        java.lang.Object obj76 = lineAndShapeRenderer67.clone();
        categoryPlot57.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer67, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator79 = null;
        lineAndShapeRenderer67.setBaseURLGenerator(categoryURLGenerator79);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset81 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.Range range82 = lineAndShapeRenderer67.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset81);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState86 = null;
        java.awt.geom.Rectangle2D rectangle2D87 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D88 = barRenderer0.createHotSpotBounds(graphics2D12, rectangle2D13, categoryPlot14, categoryAxis45, valueAxis56, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset81, (int) ' ', (-1), false, categoryItemRendererState86, rectangle2D87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(legendItemCollection19);
        org.junit.Assert.assertNotNull(drawingSupplier20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertNotNull(paint36);
        org.junit.Assert.assertNull(categoryItemLabelGenerator52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertNotNull(axisLocation59);
        org.junit.Assert.assertNotNull(axisLocation60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNull(range82);
    }

    @Test
    public void test391() throws Throwable {
printRuntimeMSG("---RegressionTest0:test391");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.awt.Color color3 = java.awt.Color.getHSBColor(0.0f, (float) 10L, (float) (byte) -1);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test392() throws Throwable {
printRuntimeMSG("---RegressionTest0:test392");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes(true);
        keyedObjects0.setObject((java.lang.Comparable) true, (java.lang.Object) true);
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke6 = categoryPlot5.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation7 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation8 = axisLocation7.getOpposite();
        categoryPlot5.setDomainAxisLocation(axisLocation8, false);
        boolean boolean11 = categoryPlot5.canSelectByRegion();
        categoryPlot5.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        java.awt.geom.Point2D point2D18 = null;
        categoryPlot14.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo17, point2D18);
        categoryPlot14.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder22 = categoryPlot14.getRowRenderingOrder();
        categoryPlot5.setRowRenderingOrder(sortOrder22);
        boolean boolean25 = sortOrder22.equals((java.lang.Object) 4);
        keyedObjects0.sortByObjects(sortOrder22);
        java.util.List list27 = keyedObjects0.getKeys();
        org.jfree.chart.event.ChartChangeEvent chartChangeEvent28 = new org.jfree.chart.event.ChartChangeEvent((java.lang.Object) keyedObjects0);
        java.lang.Comparable comparable29 = null;
        try {
            keyedObjects0.removeValue(comparable29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test393() throws Throwable {
printRuntimeMSG("---RegressionTest0:test393");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        java.awt.geom.GeneralPath generalPath11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.RenderingSource renderingSource13 = null;
        categoryPlot0.select(generalPath11, rectangle2D12, renderingSource13);
        org.jfree.chart.util.ShadowGenerator shadowGenerator15 = null;
        categoryPlot0.setShadowGenerator(shadowGenerator15);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke19 = categoryPlot18.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke21 = categoryPlot20.getRangeMinorGridlineStroke();
        categoryPlot18.setParent((org.jfree.chart.plot.Plot) categoryPlot20);
        org.jfree.chart.LegendItemCollection legendItemCollection23 = categoryPlot18.getFixedLegendItems();
        java.lang.Comparable comparable24 = categoryPlot18.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge25 = categoryPlot18.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent26 = null;
        categoryPlot18.notifyListeners(plotChangeEvent26);
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis28.setMinorTickMarkOutsideLength((float) (short) 0);
        float float31 = categoryAxis28.getMinorTickMarkInsideLength();
        java.util.List list32 = categoryPlot18.getCategoriesForAxis(categoryAxis28);
        try {
            categoryPlot0.mapDatasetToRangeAxes((int) (byte) 10, list32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty list not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNull(legendItemCollection23);
        org.junit.Assert.assertNull(comparable24);
        org.junit.Assert.assertNotNull(rectangleEdge25);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertNotNull(list32);
    }

    @Test
    public void test394() throws Throwable {
printRuntimeMSG("---RegressionTest0:test394");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        java.awt.Font font7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 0, font7, true);
        java.awt.Color color10 = org.jfree.chart.ChartColor.VERY_LIGHT_CYAN;
        boolean boolean11 = lineAndShapeRenderer2.equals((java.lang.Object) color10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes12 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean18 = lineAndShapeRenderer16.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean19 = lineAndShapeRenderer16.getBaseLinesVisible();
        java.awt.Shape shape20 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer16.setBaseLegendShape(shape20);
        renderAttributes12.setSeriesShape((int) ' ', shape20);
        org.jfree.chart.entity.ChartEntity chartEntity24 = new org.jfree.chart.entity.ChartEntity(shape20, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        lineAndShapeRenderer2.setBaseShape(shape20, true);
        lineAndShapeRenderer2.setUseSeriesOffset(false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(shape20);
    }

    @Test
    public void test395() throws Throwable {
printRuntimeMSG("---RegressionTest0:test395");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        lineAndShapeRenderer10.setSeriesPositiveItemLabelPosition(0, itemLabelPosition12);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer10.setLegendItemToolTipGenerator(categorySeriesLabelGenerator14);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        boolean boolean17 = lineAndShapeRenderer10.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        java.lang.Object obj19 = lineAndShapeRenderer10.clone();
        categoryPlot0.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer10, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = lineAndShapeRenderer10.getSeriesPositiveItemLabelPosition(100);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator24 = lineAndShapeRenderer10.getBaseToolTipGenerator();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(itemLabelPosition23);
        org.junit.Assert.assertNull(categoryToolTipGenerator24);
    }

    @Test
    public void test396() throws Throwable {
printRuntimeMSG("---RegressionTest0:test396");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        java.lang.Object obj1 = abstractCategoryDataset0.clone();
        java.lang.Object obj2 = abstractCategoryDataset0.clone();
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer15.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean18 = lineAndShapeRenderer15.getBaseLinesVisible();
        java.awt.Shape shape19 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer15.setBaseLegendShape(shape19);
        renderAttributes11.setSeriesShape((int) ' ', shape19);
        org.jfree.chart.entity.ChartEntity chartEntity23 = new org.jfree.chart.entity.ChartEntity(shape19, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color26 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem27 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color26);
        java.lang.String str28 = legendItem27.getToolTipText();
        java.awt.Stroke stroke29 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem27.setOutlineStroke(stroke29);
        java.awt.Shape shape35 = null;
        java.awt.Color color36 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color38 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape35, (java.awt.Paint) color36, stroke37, (java.awt.Paint) color38);
        java.lang.Class<?> wildcardClass40 = color36.getClass();
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape19, paint24, stroke29, (java.awt.Paint) color36);
        org.jfree.chart.entity.ChartEntity chartEntity42 = new org.jfree.chart.entity.ChartEntity(shape19);
        java.awt.Color color43 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape19, (java.awt.Paint) color43);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity50 = new org.jfree.chart.entity.CategoryItemEntity(shape19, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        abstractCategoryDataset0.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset47);
        java.util.EventListener eventListener52 = null;
        boolean boolean53 = abstractCategoryDataset0.hasListener(eventListener52);
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test397() throws Throwable {
printRuntimeMSG("---RegressionTest0:test397");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = null;
        lineAndShapeRenderer12.setSeriesPositiveItemLabelPosition(0, itemLabelPosition14);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator16 = null;
        lineAndShapeRenderer12.setLegendItemToolTipGenerator(categorySeriesLabelGenerator16);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer12.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition((int) (byte) 0, itemLabelPosition18, false);
        org.jfree.chart.text.TextAnchor textAnchor21 = itemLabelPosition18.getRotationAnchor();
        org.jfree.chart.text.TextAnchor textAnchor22 = itemLabelPosition18.getRotationAnchor();
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(textAnchor21);
        org.junit.Assert.assertNotNull(textAnchor22);
    }

    @Test
    public void test398() throws Throwable {
printRuntimeMSG("---RegressionTest0:test398");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.chart.util.SortOrder sortOrder5 = categoryPlot0.getColumnRenderingOrder();
        int int6 = categoryPlot0.getDomainAxisCount();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(sortOrder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test399() throws Throwable {
printRuntimeMSG("---RegressionTest0:test399");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        double double9 = categoryAxis8.getUpperMargin();
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (short) -1, 2.0d, plotRenderingInfo13, point2D14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D16, rectangle2D17, (int) (byte) 100, plotRenderingInfo19, categoryCrosshairState20);
        categoryPlot0.setDomainCrosshairColumnKey((java.lang.Comparable) (byte) 100);
        org.jfree.chart.plot.Marker marker24 = null;
        org.jfree.chart.util.Layer layer25 = null;
        try {
            boolean boolean26 = categoryPlot0.removeRangeMarker(marker24, layer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test400() throws Throwable {
printRuntimeMSG("---RegressionTest0:test400");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.awt.Paint paint12 = lineAndShapeRenderer2.lookupSeriesPaint(3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test401() throws Throwable {
printRuntimeMSG("---RegressionTest0:test401");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        barRenderer0.setBaseItemLabelsVisible(false);
        double double5 = barRenderer0.getItemMargin();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = barRenderer0.getBasePositiveItemLabelPosition();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
    }

    @Test
    public void test402() throws Throwable {
printRuntimeMSG("---RegressionTest0:test402");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE4;
        org.jfree.chart.axis.AxisLocation axisLocation1 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation2 = axisLocation1.getOpposite();
        boolean boolean3 = itemLabelAnchor0.equals((java.lang.Object) axisLocation1);
        java.lang.String str4 = axisLocation1.toString();
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertNotNull(axisLocation1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AxisLocation.BOTTOM_OR_RIGHT" + "'", str4.equals("AxisLocation.BOTTOM_OR_RIGHT"));
    }

    @Test
    public void test403() throws Throwable {
printRuntimeMSG("---RegressionTest0:test403");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        categoryPlot0.setRangeZeroBaselineVisible(false);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRenderer((int) (byte) -1);
        java.awt.Color color12 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        categoryPlot0.setDomainCrosshairPaint((java.awt.Paint) color12);
        categoryPlot0.setAnchorValue(0.0d);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test404() throws Throwable {
printRuntimeMSG("---RegressionTest0:test404");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot0.getDrawingSupplier();
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        int int9 = categoryPlot0.indexOf(categoryDataset8);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer13.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = lineAndShapeRenderer13.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer13.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean23 = lineAndShapeRenderer13.getSeriesCreateEntities((int) (short) 10);
        java.awt.Paint paint25 = lineAndShapeRenderer13.getSeriesItemLabelPaint((int) (byte) -1);
        boolean boolean26 = lineAndShapeRenderer13.getBaseShapesVisible();
        categoryPlot0.setRenderer(15, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer13, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNull(categoryToolTipGenerator18);
        org.junit.Assert.assertNull(boolean23);
        org.junit.Assert.assertNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test405() throws Throwable {
printRuntimeMSG("---RegressionTest0:test405");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        java.awt.Paint paint10 = barRenderer0.getShadowPaint();
        java.awt.Shape shape11 = barRenderer0.getBaseShape();
        java.awt.Color color12 = org.jfree.chart.ChartColor.LIGHT_MAGENTA;
        barRenderer0.setBaseFillPaint((java.awt.Paint) color12);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(shape11);
        org.junit.Assert.assertNotNull(color12);
    }

    @Test
    public void test406() throws Throwable {
printRuntimeMSG("---RegressionTest0:test406");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.util.Layer layer9 = null;
        java.util.Collection collection10 = categoryPlot0.getRangeMarkers(layer9);
        boolean boolean11 = categoryPlot0.isRangeZoomable();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test407() throws Throwable {
printRuntimeMSG("---RegressionTest0:test407");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.jfree.chart.renderer.RenderAttributes renderAttributes8 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean14 = lineAndShapeRenderer12.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean15 = lineAndShapeRenderer12.getBaseLinesVisible();
        java.awt.Shape shape16 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer12.setBaseLegendShape(shape16);
        renderAttributes8.setSeriesShape((int) ' ', shape16);
        org.jfree.chart.entity.ChartEntity chartEntity20 = new org.jfree.chart.entity.ChartEntity(shape16, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color23 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem24 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color23);
        java.lang.String str25 = legendItem24.getToolTipText();
        java.awt.Stroke stroke26 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem24.setOutlineStroke(stroke26);
        java.awt.Shape shape32 = null;
        java.awt.Color color33 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color35 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem36 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape32, (java.awt.Paint) color33, stroke34, (java.awt.Paint) color35);
        java.lang.Class<?> wildcardClass37 = color33.getClass();
        org.jfree.chart.LegendItem legendItem38 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape16, paint21, stroke26, (java.awt.Paint) color33);
        org.jfree.chart.entity.ChartEntity chartEntity39 = new org.jfree.chart.entity.ChartEntity(shape16);
        java.awt.Color color40 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape16, (java.awt.Paint) color40);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset44 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity47 = new org.jfree.chart.entity.CategoryItemEntity(shape16, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset44, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        defaultCategoryDataset44.addValue((java.lang.Number) (-1), (java.lang.Comparable) "org.jfree.chart.event.ChartChangeEvent[source=-16777216]", (java.lang.Comparable) "SortOrder.ASCENDING");
        defaultCategoryDataset44.clearSelection();
        java.lang.Comparable comparable53 = null;
        try {
            int int54 = defaultCategoryDataset44.getRowIndex(comparable53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'key' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(color40);
    }

    @Test
    public void test408() throws Throwable {
printRuntimeMSG("---RegressionTest0:test408");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        categoryPlot0.drawBackgroundImage(graphics2D3, rectangle2D4);
        categoryPlot0.clearAnnotations();
        boolean boolean7 = categoryPlot0.isRangeMinorGridlinesVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        try {
            boolean boolean9 = categoryPlot0.removeAnnotation(categoryAnnotation8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test409() throws Throwable {
printRuntimeMSG("---RegressionTest0:test409");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        java.awt.Color color3 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem4 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color3);
        java.lang.String str5 = legendItem4.getToolTipText();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem4.setOutlineStroke(stroke6);
        legendItem1.setOutlineStroke(stroke6);
        legendItem1.setLineVisible(false);
        java.awt.Stroke stroke11 = legendItem1.getOutlineStroke();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer14.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean17 = lineAndShapeRenderer14.getBaseLinesVisible();
        lineAndShapeRenderer14.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer14.setAutoPopulateSeriesShape(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = null;
        lineAndShapeRenderer14.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator23, true);
        java.awt.Shape shape27 = lineAndShapeRenderer14.lookupSeriesShape((int) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke29 = categoryPlot28.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke31 = categoryPlot30.getRangeMinorGridlineStroke();
        categoryPlot28.setParent((org.jfree.chart.plot.Plot) categoryPlot30);
        org.jfree.chart.LegendItemCollection legendItemCollection33 = categoryPlot28.getFixedLegendItems();
        java.lang.Comparable comparable34 = categoryPlot28.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot28.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent36 = null;
        categoryPlot28.notifyListeners(plotChangeEvent36);
        boolean boolean38 = categoryPlot28.isOutlineVisible();
        java.awt.geom.GeneralPath generalPath39 = null;
        java.awt.geom.Rectangle2D rectangle2D40 = null;
        org.jfree.chart.RenderingSource renderingSource41 = null;
        categoryPlot28.select(generalPath39, rectangle2D40, renderingSource41);
        org.jfree.chart.util.ShadowGenerator shadowGenerator43 = null;
        categoryPlot28.setShadowGenerator(shadowGenerator43);
        org.jfree.chart.entity.PlotEntity plotEntity45 = new org.jfree.chart.entity.PlotEntity(shape27, (org.jfree.chart.plot.Plot) categoryPlot28);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer48 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean50 = lineAndShapeRenderer48.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean51 = lineAndShapeRenderer48.getBaseLinesVisible();
        lineAndShapeRenderer48.setAutoPopulateSeriesPaint(false);
        boolean boolean54 = lineAndShapeRenderer48.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = lineAndShapeRenderer48.getBasePositiveItemLabelPosition();
        boolean boolean56 = plotEntity45.equals((java.lang.Object) itemLabelPosition55);
        java.lang.Object obj57 = plotEntity45.clone();
        java.awt.Shape shape62 = null;
        java.awt.Color color63 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke64 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color65 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem66 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape62, (java.awt.Paint) color63, stroke64, (java.awt.Paint) color65);
        java.awt.Paint paint67 = legendItem66.getFillPaint();
        java.awt.Font font68 = legendItem66.getLabelFont();
        legendItem66.setSeriesIndex((int) (byte) 10);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer71 = legendItem66.getFillPaintTransformer();
        boolean boolean72 = plotEntity45.equals((java.lang.Object) legendItem66);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer73 = legendItem66.getFillPaintTransformer();
        legendItem1.setFillPaintTransformer(gradientPaintTransformer73);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(shape27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNull(legendItemCollection33);
        org.junit.Assert.assertNull(comparable34);
        org.junit.Assert.assertNotNull(rectangleEdge35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(boolean50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(stroke64);
        org.junit.Assert.assertNotNull(color65);
        org.junit.Assert.assertNotNull(paint67);
        org.junit.Assert.assertNull(font68);
        org.junit.Assert.assertNotNull(gradientPaintTransformer71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(gradientPaintTransformer73);
    }

    @Test
    public void test410() throws Throwable {
printRuntimeMSG("---RegressionTest0:test410");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.data.category.CategoryDataset categoryDataset8 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis9.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis12 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator16 = lineAndShapeRenderer15.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot(categoryDataset8, categoryAxis9, valueAxis12, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer15);
        boolean boolean18 = categoryAxis9.isTickLabelsVisible();
        java.util.List list19 = categoryPlot0.getCategoriesForAxis(categoryAxis9);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(categoryItemLabelGenerator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(list19);
    }

    @Test
    public void test411() throws Throwable {
printRuntimeMSG("---RegressionTest0:test411");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot0.setDomainCrosshairStroke(stroke11);
        java.awt.Stroke stroke13 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.Marker marker14 = null;
        org.jfree.chart.util.Layer layer15 = null;
        try {
            categoryPlot0.addRangeMarker(marker14, layer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test412() throws Throwable {
printRuntimeMSG("---RegressionTest0:test412");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint1 = categoryAxis0.getTickLabelPaint();
        categoryAxis0.setMaximumCategoryLabelLines((int) (short) -1);
        double double4 = categoryAxis0.getFixedDimension();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test413() throws Throwable {
printRuntimeMSG("---RegressionTest0:test413");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        boolean boolean12 = categoryPlot10.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot10.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        categoryPlot10.drawBackgroundImage(graphics2D16, rectangle2D17);
        lineAndShapeRenderer7.setPlot(categoryPlot10);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke21 = categoryPlot20.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer22 = null;
        categoryPlot20.setRenderer(categoryItemRenderer22);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent24 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot20);
        org.jfree.chart.util.SortOrder sortOrder25 = categoryPlot20.getColumnRenderingOrder();
        categoryPlot10.setColumnRenderingOrder(sortOrder25);
        org.jfree.chart.util.RectangleEdge rectangleEdge28 = categoryPlot10.getRangeAxisEdge((-65536));
        categoryPlot10.clearDomainMarkers();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(sortOrder25);
        org.junit.Assert.assertNotNull(rectangleEdge28);
    }

    @Test
    public void test414() throws Throwable {
printRuntimeMSG("---RegressionTest0:test414");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
        java.awt.Stroke stroke2 = renderAttributes1.getDefaultOutlineStroke();
        java.awt.Paint paint4 = renderAttributes1.getSeriesOutlinePaint(255);
        java.awt.Color color6 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel7 = null;
        java.awt.Rectangle rectangle8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        java.awt.geom.AffineTransform affineTransform10 = null;
        java.awt.RenderingHints renderingHints11 = null;
        java.awt.PaintContext paintContext12 = color6.createContext(colorModel7, rectangle8, rectangle2D9, affineTransform10, renderingHints11);
        java.awt.Color color13 = java.awt.Color.RED;
        java.awt.Color color14 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.Color color15 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.color.ColorSpace colorSpace16 = color15.getColorSpace();
        float[] floatArray23 = new float[] { 100.0f, (-8355712), 'a', 'a', (-1), (short) 1 };
        float[] floatArray24 = color14.getColorComponents(colorSpace16, floatArray23);
        float[] floatArray25 = color13.getComponents(floatArray24);
        float[] floatArray26 = color6.getColorComponents(floatArray25);
        renderAttributes1.setSeriesOutlinePaint((int) '4', (java.awt.Paint) color6);
        java.awt.Stroke stroke30 = renderAttributes1.getItemStroke((int) (byte) 1, (-1));
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(paintContext12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(colorSpace16);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertNotNull(floatArray24);
        org.junit.Assert.assertNotNull(floatArray25);
        org.junit.Assert.assertNotNull(floatArray26);
        org.junit.Assert.assertNull(stroke30);
    }

    @Test
    public void test415() throws Throwable {
printRuntimeMSG("---RegressionTest0:test415");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.awt.Color color2 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem3 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color2);
        java.awt.color.ColorSpace colorSpace4 = color2.getColorSpace();
        keyedObjects2D0.addObject((java.lang.Object) colorSpace4, (java.lang.Comparable) (-4.0d), (java.lang.Comparable) (-4.0d));
        int int8 = keyedObjects2D0.getColumnCount();
        try {
            java.lang.Comparable comparable10 = keyedObjects2D0.getRowKey((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(colorSpace4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test416() throws Throwable {
printRuntimeMSG("---RegressionTest0:test416");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        lineAndShapeRenderer10.setSeriesPositiveItemLabelPosition(0, itemLabelPosition12);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer10.setLegendItemToolTipGenerator(categorySeriesLabelGenerator14);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        boolean boolean17 = lineAndShapeRenderer10.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        java.lang.Object obj19 = lineAndShapeRenderer10.clone();
        categoryPlot0.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer10, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer10.setBaseURLGenerator(categoryURLGenerator22);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset24 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.Range range25 = lineAndShapeRenderer10.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset24);
        java.lang.Object obj26 = defaultCategoryDataset24.clone();
        try {
            java.lang.Comparable comparable28 = defaultCategoryDataset24.getColumnKey((-8355712));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(range25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test417() throws Throwable {
printRuntimeMSG("---RegressionTest0:test417");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        java.lang.String str5 = categoryPlot0.getPlotType();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Category Plot" + "'", str5.equals("Category Plot"));
    }

    @Test
    public void test418() throws Throwable {
printRuntimeMSG("---RegressionTest0:test418");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Paint paint3 = categoryPlot0.getBackgroundPaint();
        org.jfree.chart.util.Layer layer5 = null;
        java.util.Collection collection6 = categoryPlot0.getRangeMarkers((int) (byte) 0, layer5);
        java.awt.Paint paint7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray8 = new java.awt.Paint[] { paint7 };
        java.awt.Color color9 = java.awt.Color.BLUE;
        java.awt.Color color10 = java.awt.Color.RED;
        java.awt.Paint paint11 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray12 = new java.awt.Paint[] { color9, color10, paint11 };
        java.awt.Color color13 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel14 = null;
        java.awt.Rectangle rectangle15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        java.awt.geom.AffineTransform affineTransform17 = null;
        java.awt.RenderingHints renderingHints18 = null;
        java.awt.PaintContext paintContext19 = color13.createContext(colorModel14, rectangle15, rectangle2D16, affineTransform17, renderingHints18);
        java.awt.Color color20 = java.awt.Color.WHITE;
        java.awt.Color color21 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel22 = null;
        java.awt.Rectangle rectangle23 = null;
        java.awt.geom.Rectangle2D rectangle2D24 = null;
        java.awt.geom.AffineTransform affineTransform25 = null;
        java.awt.RenderingHints renderingHints26 = null;
        java.awt.PaintContext paintContext27 = color21.createContext(colorModel22, rectangle23, rectangle2D24, affineTransform25, renderingHints26);
        java.awt.Color color28 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray29 = new java.awt.Paint[] { color13, color20, color21, color28 };
        java.awt.Stroke stroke30 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke31 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke32 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray35 = new java.awt.Stroke[] { stroke30, stroke31, stroke32, stroke33, stroke34 };
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke39 = categoryPlot38.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray40 = new java.awt.Stroke[] { stroke36, stroke37, stroke39 };
        java.awt.Shape shape41 = null;
        java.awt.Shape[] shapeArray42 = new java.awt.Shape[] { shape41 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier43 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray8, paintArray12, paintArray29, strokeArray35, strokeArray40, shapeArray42);
        java.awt.Shape shape44 = defaultDrawingSupplier43.getNextShape();
        categoryPlot0.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier) defaultDrawingSupplier43, true);
        categoryPlot0.setRangeCrosshairVisible(true);
        boolean boolean49 = categoryPlot0.isRangeMinorGridlinesVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertNull(collection6);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNotNull(paintArray8);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paintArray12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(paintContext19);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNotNull(paintContext27);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(paintArray29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(strokeArray35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(strokeArray40);
        org.junit.Assert.assertNotNull(shapeArray42);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test419() throws Throwable {
printRuntimeMSG("---RegressionTest0:test419");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getColumnKeys();
        try {
            java.lang.Object obj4 = keyedObjects2D0.getObject((java.lang.Comparable) (short) -1, (java.lang.Comparable) (-8355712));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-1) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
        org.junit.Assert.assertNotNull(list1);
    }

    @Test
    public void test420() throws Throwable {
printRuntimeMSG("---RegressionTest0:test420");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean8 = lineAndShapeRenderer2.getUseFillPaint();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesLinesVisible(0);
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke16 = categoryPlot15.getRangeMinorGridlineStroke();
        categoryPlot13.setParent((org.jfree.chart.plot.Plot) categoryPlot15);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot13.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent19 = null;
        categoryPlot13.axisChanged(axisChangeEvent19);
        org.jfree.chart.axis.AxisSpace axisSpace21 = categoryPlot13.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset22 = null;
        categoryPlot13.setDataset(categoryDataset22);
        org.jfree.chart.axis.AxisLocation axisLocation25 = categoryPlot13.getRangeAxisLocation((int) '#');
        double double26 = categoryPlot13.getRangeCrosshairValue();
        org.jfree.data.category.CategoryDataset categoryDataset27 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis28 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis28.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis31 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer34 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator35 = lineAndShapeRenderer34.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot(categoryDataset27, categoryAxis28, valueAxis31, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer34);
        boolean boolean37 = categoryAxis28.isTickLabelsVisible();
        double double38 = categoryAxis28.getFixedDimension();
        java.lang.String str40 = categoryAxis28.getCategoryLabelToolTip((java.lang.Comparable) 0);
        org.jfree.chart.axis.ValueAxis valueAxis41 = null;
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset42 = new org.jfree.data.category.AbstractCategoryDataset();
        java.lang.Object obj43 = abstractCategoryDataset42.clone();
        java.lang.Object obj44 = abstractCategoryDataset42.clone();
        org.jfree.chart.renderer.RenderAttributes renderAttributes53 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer57 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean59 = lineAndShapeRenderer57.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean60 = lineAndShapeRenderer57.getBaseLinesVisible();
        java.awt.Shape shape61 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer57.setBaseLegendShape(shape61);
        renderAttributes53.setSeriesShape((int) ' ', shape61);
        org.jfree.chart.entity.ChartEntity chartEntity65 = new org.jfree.chart.entity.ChartEntity(shape61, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint66 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color68 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem69 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color68);
        java.lang.String str70 = legendItem69.getToolTipText();
        java.awt.Stroke stroke71 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem69.setOutlineStroke(stroke71);
        java.awt.Shape shape77 = null;
        java.awt.Color color78 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke79 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color80 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem81 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape77, (java.awt.Paint) color78, stroke79, (java.awt.Paint) color80);
        java.lang.Class<?> wildcardClass82 = color78.getClass();
        org.jfree.chart.LegendItem legendItem83 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape61, paint66, stroke71, (java.awt.Paint) color78);
        org.jfree.chart.entity.ChartEntity chartEntity84 = new org.jfree.chart.entity.ChartEntity(shape61);
        java.awt.Color color85 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem86 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape61, (java.awt.Paint) color85);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset89 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity92 = new org.jfree.chart.entity.CategoryItemEntity(shape61, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset89, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        abstractCategoryDataset42.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset89);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState97 = null;
        try {
            java.awt.Shape shape98 = lineAndShapeRenderer2.createHotSpotShape(graphics2D11, rectangle2D12, categoryPlot13, categoryAxis28, valueAxis41, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset89, (int) (byte) -1, 15, true, categoryItemRendererState97);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Not implemented.");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertNull(axisSpace21);
        org.junit.Assert.assertNotNull(axisLocation25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNull(categoryItemLabelGenerator35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
        org.junit.Assert.assertNull(boolean59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(shape61);
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(stroke71);
        org.junit.Assert.assertNotNull(color78);
        org.junit.Assert.assertNotNull(stroke79);
        org.junit.Assert.assertNotNull(color80);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertNotNull(color85);
    }

    @Test
    public void test421() throws Throwable {
printRuntimeMSG("---RegressionTest0:test421");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset0 = new org.jfree.data.category.AbstractCategoryDataset();
        java.lang.Object obj1 = abstractCategoryDataset0.clone();
        java.lang.Object obj2 = abstractCategoryDataset0.clone();
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer15.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean18 = lineAndShapeRenderer15.getBaseLinesVisible();
        java.awt.Shape shape19 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer15.setBaseLegendShape(shape19);
        renderAttributes11.setSeriesShape((int) ' ', shape19);
        org.jfree.chart.entity.ChartEntity chartEntity23 = new org.jfree.chart.entity.ChartEntity(shape19, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint24 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color26 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem27 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color26);
        java.lang.String str28 = legendItem27.getToolTipText();
        java.awt.Stroke stroke29 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem27.setOutlineStroke(stroke29);
        java.awt.Shape shape35 = null;
        java.awt.Color color36 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color38 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem39 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape35, (java.awt.Paint) color36, stroke37, (java.awt.Paint) color38);
        java.lang.Class<?> wildcardClass40 = color36.getClass();
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape19, paint24, stroke29, (java.awt.Paint) color36);
        org.jfree.chart.entity.ChartEntity chartEntity42 = new org.jfree.chart.entity.ChartEntity(shape19);
        java.awt.Color color43 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape19, (java.awt.Paint) color43);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset47 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity50 = new org.jfree.chart.entity.CategoryItemEntity(shape19, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset47, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        abstractCategoryDataset0.setSelectionState((org.jfree.data.category.CategoryDatasetSelectionState) defaultCategoryDataset47);
        org.jfree.data.category.AbstractCategoryDataset abstractCategoryDataset52 = new org.jfree.data.category.AbstractCategoryDataset();
        org.jfree.data.general.DatasetGroup datasetGroup53 = new org.jfree.data.general.DatasetGroup();
        abstractCategoryDataset52.setGroup(datasetGroup53);
        defaultCategoryDataset47.setGroup(datasetGroup53);
        try {
            defaultCategoryDataset47.setSelected((-65536), 0, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(shape19);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(color43);
    }

    @Test
    public void test422() throws Throwable {
printRuntimeMSG("---RegressionTest0:test422");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        categoryPlot0.drawBackgroundImage(graphics2D7, rectangle2D8);
        java.awt.Color color10 = org.jfree.chart.ChartColor.DARK_MAGENTA;
        categoryPlot0.setRangeZeroBaselinePaint((java.awt.Paint) color10);
        org.jfree.chart.axis.CategoryAxis categoryAxis12 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint13 = categoryAxis12.getTickLabelPaint();
        categoryPlot0.setDomainGridlinePaint(paint13);
        categoryPlot0.clearSelection();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertNotNull(paint13);
    }

    @Test
    public void test423() throws Throwable {
printRuntimeMSG("---RegressionTest0:test423");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        java.awt.Font font8 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.awt.Font font10 = lineAndShapeRenderer2.getSeriesItemLabelFont((int) (short) 1);
        try {
            lineAndShapeRenderer2.setSeriesVisible((-12566464), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(font8);
        org.junit.Assert.assertNull(font10);
    }

    @Test
    public void test424() throws Throwable {
printRuntimeMSG("---RegressionTest0:test424");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        lineAndShapeRenderer10.setSeriesPositiveItemLabelPosition(0, itemLabelPosition12);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer10.setLegendItemToolTipGenerator(categorySeriesLabelGenerator14);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        boolean boolean17 = lineAndShapeRenderer10.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        java.lang.Object obj19 = lineAndShapeRenderer10.clone();
        categoryPlot0.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer10, true);
        lineAndShapeRenderer10.clearSeriesPaints(false);
        org.jfree.chart.renderer.RenderAttributes renderAttributes24 = lineAndShapeRenderer10.getSelectedItemAttributes();
        java.awt.Shape shape25 = renderAttributes24.getDefaultShape();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(renderAttributes24);
        org.junit.Assert.assertNull(shape25);
    }

    @Test
    public void test425() throws Throwable {
printRuntimeMSG("---RegressionTest0:test425");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setCategoryMargin((double) 10.0f);
        java.awt.Font font3 = categoryAxis0.getTickLabelFont();
        categoryAxis0.addCategoryLabelToolTip((java.lang.Comparable) 188.0d, "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT");
        org.jfree.chart.plot.Plot plot7 = null;
        categoryAxis0.setPlot(plot7);
        org.junit.Assert.assertNotNull(font3);
    }

    @Test
    public void test426() throws Throwable {
printRuntimeMSG("---RegressionTest0:test426");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint1 = categoryAxis0.getTickLabelPaint();
        categoryAxis0.setTickLabelsVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double5 = rectangleInsets4.getRight();
        double double7 = rectangleInsets4.calculateTopInset(0.0d);
        categoryAxis0.setTickLabelInsets(rectangleInsets4);
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D12 = rectangleInsets4.createOutsetRectangle(rectangle2D9, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
    }

    @Test
    public void test427() throws Throwable {
printRuntimeMSG("---RegressionTest0:test427");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis6.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer12.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis9, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer12);
        java.util.List list15 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = org.jfree.chart.util.RectangleInsets.ZERO_INSETS;
        categoryAxis6.setLabelInsets(rectangleInsets16, true);
        boolean boolean19 = categoryAxis6.isTickMarksVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test428() throws Throwable {
printRuntimeMSG("---RegressionTest0:test428");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent5 = null;
        categoryPlot2.annotationChanged(annotationChangeEvent5);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = lineAndShapeRenderer9.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator11 = null;
        lineAndShapeRenderer9.setBaseToolTipGenerator(categoryToolTipGenerator11);
        java.awt.Paint paint14 = lineAndShapeRenderer9.lookupSeriesOutlinePaint((int) (byte) 1);
        categoryPlot2.setRenderer((org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer9);
        java.awt.Paint paint17 = lineAndShapeRenderer9.lookupSeriesFillPaint(192);
        lineAndShapeRenderer9.setSeriesCreateEntities(4, (java.lang.Boolean) false, true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test429() throws Throwable {
printRuntimeMSG("---RegressionTest0:test429");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.jfree.chart.renderer.RenderAttributes renderAttributes8 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean14 = lineAndShapeRenderer12.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean15 = lineAndShapeRenderer12.getBaseLinesVisible();
        java.awt.Shape shape16 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer12.setBaseLegendShape(shape16);
        renderAttributes8.setSeriesShape((int) ' ', shape16);
        org.jfree.chart.entity.ChartEntity chartEntity20 = new org.jfree.chart.entity.ChartEntity(shape16, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color23 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem24 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color23);
        java.lang.String str25 = legendItem24.getToolTipText();
        java.awt.Stroke stroke26 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem24.setOutlineStroke(stroke26);
        java.awt.Shape shape32 = null;
        java.awt.Color color33 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color35 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem36 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape32, (java.awt.Paint) color33, stroke34, (java.awt.Paint) color35);
        java.lang.Class<?> wildcardClass37 = color33.getClass();
        org.jfree.chart.LegendItem legendItem38 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape16, paint21, stroke26, (java.awt.Paint) color33);
        org.jfree.chart.entity.ChartEntity chartEntity39 = new org.jfree.chart.entity.ChartEntity(shape16);
        java.awt.Color color40 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape16, (java.awt.Paint) color40);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset44 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity47 = new org.jfree.chart.entity.CategoryItemEntity(shape16, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset44, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        java.lang.String str48 = categoryItemEntity47.toString();
        org.jfree.data.category.CategoryDataset categoryDataset49 = categoryItemEntity47.getDataset();
        boolean boolean51 = categoryItemEntity47.equals((java.lang.Object) 0.5f);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(categoryDataset49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test430() throws Throwable {
printRuntimeMSG("---RegressionTest0:test430");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.awt.Color color0 = java.awt.Color.PINK;
        int int1 = color0.getBlue();
        java.awt.Color color2 = color0.darker();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 175 + "'", int1 == 175);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test431() throws Throwable {
printRuntimeMSG("---RegressionTest0:test431");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean6 = lineAndShapeRenderer4.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean7 = lineAndShapeRenderer4.getBaseLinesVisible();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer4.setBaseLegendShape(shape8);
        renderAttributes0.setSeriesShape((int) ' ', shape8);
        java.awt.Paint paint11 = renderAttributes0.getDefaultPaint();
        renderAttributes0.setDefaultCreateEntity((java.lang.Boolean) false);
        java.awt.Paint paint14 = renderAttributes0.getDefaultPaint();
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(paint14);
    }

    @Test
    public void test432() throws Throwable {
printRuntimeMSG("---RegressionTest0:test432");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.awt.Color color2 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem3 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color2);
        java.awt.Color color4 = java.awt.Color.getColor("hi!", color2);
        java.awt.color.ColorSpace colorSpace5 = null;
        java.awt.Color color6 = java.awt.Color.RED;
        java.awt.Color color7 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.Color color8 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.color.ColorSpace colorSpace9 = color8.getColorSpace();
        float[] floatArray16 = new float[] { 100.0f, (-8355712), 'a', 'a', (-1), (short) 1 };
        float[] floatArray17 = color7.getColorComponents(colorSpace9, floatArray16);
        float[] floatArray18 = color6.getComponents(floatArray17);
        try {
            float[] floatArray19 = color2.getColorComponents(colorSpace5, floatArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color8);
        org.junit.Assert.assertNotNull(colorSpace9);
        org.junit.Assert.assertNotNull(floatArray16);
        org.junit.Assert.assertNotNull(floatArray17);
        org.junit.Assert.assertNotNull(floatArray18);
    }

    @Test
    public void test433() throws Throwable {
printRuntimeMSG("---RegressionTest0:test433");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double1 = rectangleInsets0.getRight();
        double double3 = rectangleInsets0.calculateBottomOutset((double) (short) 0);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test434() throws Throwable {
printRuntimeMSG("---RegressionTest0:test434");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.BarRenderer barRenderer6 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint7 = barRenderer6.getShadowPaint();
        boolean boolean8 = barRenderer6.getBaseSeriesVisible();
        categoryPlot0.setRenderer((int) (short) 100, (org.jfree.chart.renderer.category.CategoryItemRenderer) barRenderer6);
        double double10 = barRenderer6.getShadowXOffset();
        java.awt.Graphics2D graphics2D11 = null;
        java.awt.geom.Rectangle2D rectangle2D12 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        categoryPlot13.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = categoryPlot13.getOrientation();
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis18.setCategoryMargin((double) 10.0f);
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke22 = categoryPlot21.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke24 = categoryPlot23.getRangeMinorGridlineStroke();
        categoryPlot21.setParent((org.jfree.chart.plot.Plot) categoryPlot23);
        org.jfree.chart.LegendItemCollection legendItemCollection26 = categoryPlot21.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier27 = categoryPlot21.getDrawingSupplier();
        java.awt.Stroke stroke28 = categoryPlot21.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis29 = new org.jfree.chart.axis.CategoryAxis();
        java.util.List list30 = categoryPlot21.getCategoriesForAxis(categoryAxis29);
        boolean boolean31 = categoryPlot21.isDomainZoomable();
        java.awt.Paint paint32 = categoryPlot21.getBackgroundPaint();
        boolean boolean33 = categoryAxis18.hasListener((java.util.EventListener) categoryPlot21);
        org.jfree.chart.axis.ValueAxis valueAxis34 = null;
        org.jfree.chart.renderer.RenderAttributes renderAttributes43 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer47 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean49 = lineAndShapeRenderer47.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean50 = lineAndShapeRenderer47.getBaseLinesVisible();
        java.awt.Shape shape51 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer47.setBaseLegendShape(shape51);
        renderAttributes43.setSeriesShape((int) ' ', shape51);
        org.jfree.chart.entity.ChartEntity chartEntity55 = new org.jfree.chart.entity.ChartEntity(shape51, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint56 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color58 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem59 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color58);
        java.lang.String str60 = legendItem59.getToolTipText();
        java.awt.Stroke stroke61 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem59.setOutlineStroke(stroke61);
        java.awt.Shape shape67 = null;
        java.awt.Color color68 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke69 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color70 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem71 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape67, (java.awt.Paint) color68, stroke69, (java.awt.Paint) color70);
        java.lang.Class<?> wildcardClass72 = color68.getClass();
        org.jfree.chart.LegendItem legendItem73 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape51, paint56, stroke61, (java.awt.Paint) color68);
        org.jfree.chart.entity.ChartEntity chartEntity74 = new org.jfree.chart.entity.ChartEntity(shape51);
        java.awt.Color color75 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem76 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape51, (java.awt.Paint) color75);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset79 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity82 = new org.jfree.chart.entity.CategoryItemEntity(shape51, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset79, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState86 = null;
        java.awt.geom.Rectangle2D rectangle2D87 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D88 = barRenderer6.createHotSpotBounds(graphics2D11, rectangle2D12, categoryPlot13, categoryAxis18, valueAxis34, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset79, (int) (byte) 0, 8, false, categoryItemRendererState86, rectangle2D87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNull(legendItemCollection26);
        org.junit.Assert.assertNotNull(drawingSupplier27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(list30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(paint32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(boolean49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(shape51);
        org.junit.Assert.assertNotNull(paint56);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(stroke61);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertNotNull(stroke69);
        org.junit.Assert.assertNotNull(color70);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertNotNull(color75);
    }

    @Test
    public void test435() throws Throwable {
printRuntimeMSG("---RegressionTest0:test435");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        java.awt.Font font8 = lineAndShapeRenderer2.getBaseLegendTextFont();
        java.lang.Boolean boolean10 = lineAndShapeRenderer2.getSeriesShapesVisible((int) (short) 10);
        boolean boolean11 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        lineAndShapeRenderer2.setAutoPopulateSeriesFillPaint(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        java.awt.Font font16 = lineAndShapeRenderer2.getLegendTextFont((int) (short) 1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(font8);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator14);
        org.junit.Assert.assertNull(font16);
    }

    @Test
    public void test436() throws Throwable {
printRuntimeMSG("---RegressionTest0:test436");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        categoryPlot0.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo12, point2D13);
        categoryPlot9.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder17 = categoryPlot9.getRowRenderingOrder();
        categoryPlot0.setRowRenderingOrder(sortOrder17);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation19 = null;
        try {
            boolean boolean21 = categoryPlot0.removeAnnotation(categoryAnnotation19, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sortOrder17);
    }

    @Test
    public void test437() throws Throwable {
printRuntimeMSG("---RegressionTest0:test437");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis("TextAnchor.HALF_ASCENT_LEFT");
        java.awt.Color color3 = java.awt.Color.MAGENTA;
        categoryAxis1.setTickLabelPaint((java.lang.Comparable) (-1.0d), (java.awt.Paint) color3);
        categoryAxis1.setMinorTickMarksVisible(false);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test438() throws Throwable {
printRuntimeMSG("---RegressionTest0:test438");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        double double11 = categoryAxis1.getFixedDimension();
        java.lang.String str13 = categoryAxis1.getCategoryLabelToolTip((java.lang.Comparable) 0);
        float float14 = categoryAxis1.getMinorTickMarkOutsideLength();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test439() throws Throwable {
printRuntimeMSG("---RegressionTest0:test439");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset0 = new org.jfree.data.category.DefaultCategoryDataset();
        int int1 = defaultCategoryDataset0.getRowCount();
        try {
            defaultCategoryDataset0.removeColumn((java.lang.Comparable) 3);
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (3) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test440() throws Throwable {
printRuntimeMSG("---RegressionTest0:test440");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        int int3 = java.awt.Color.HSBtoRGB((float) 10L, (float) 8, (float) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void test441() throws Throwable {
printRuntimeMSG("---RegressionTest0:test441");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        try {
            categoryPlot0.mapDatasetToRangeAxis((-16777216), 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires 'index' >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(axisSpace5);
    }

    @Test
    public void test442() throws Throwable {
printRuntimeMSG("---RegressionTest0:test442");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        double double9 = categoryAxis8.getUpperMargin();
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        categoryAxis8.setAxisLineVisible(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test443() throws Throwable {
printRuntimeMSG("---RegressionTest0:test443");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.BASELINE_RIGHT;
        java.lang.String str1 = textAnchor0.toString();
        org.junit.Assert.assertNotNull(textAnchor0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "TextAnchor.BASELINE_RIGHT" + "'", str1.equals("TextAnchor.BASELINE_RIGHT"));
    }

    @Test
    public void test444() throws Throwable {
printRuntimeMSG("---RegressionTest0:test444");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.awt.Color color0 = java.awt.Color.RED;
        float[] floatArray3 = new float[] { 3, (byte) 10 };
        try {
            float[] floatArray4 = color0.getRGBColorComponents(floatArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(floatArray3);
    }

    @Test
    public void test445() throws Throwable {
printRuntimeMSG("---RegressionTest0:test445");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        java.awt.Paint paint3 = categoryPlot0.getRangeCrosshairPaint();
        categoryPlot0.setRangeZeroBaselineVisible(false);
        categoryPlot0.setOutlineVisible(false);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test446() throws Throwable {
printRuntimeMSG("---RegressionTest0:test446");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) '4', (int) '4', false);
        lineAndShapeRenderer2.setBaseSeriesVisible(false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
    }

    @Test
    public void test447() throws Throwable {
printRuntimeMSG("---RegressionTest0:test447");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        lineAndShapeRenderer2.setSeriesCreateEntities(0, (java.lang.Boolean) false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
    }

    @Test
    public void test448() throws Throwable {
printRuntimeMSG("---RegressionTest0:test448");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        categoryPlot0.setRangePannable(true);
        categoryPlot0.clearDomainMarkers();
        org.jfree.chart.event.PlotChangeListener plotChangeListener13 = null;
        categoryPlot0.addChangeListener(plotChangeListener13);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
    }

    @Test
    public void test449() throws Throwable {
printRuntimeMSG("---RegressionTest0:test449");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        float float11 = categoryPlot0.getForegroundAlpha();
        categoryPlot0.setDomainCrosshairColumnKey((java.lang.Comparable) 0);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test450() throws Throwable {
printRuntimeMSG("---RegressionTest0:test450");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer10 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = null;
        lineAndShapeRenderer10.setSeriesPositiveItemLabelPosition(0, itemLabelPosition12);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = null;
        lineAndShapeRenderer10.setLegendItemToolTipGenerator(categorySeriesLabelGenerator14);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        boolean boolean17 = lineAndShapeRenderer10.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition18 = lineAndShapeRenderer10.getBasePositiveItemLabelPosition();
        java.lang.Object obj19 = lineAndShapeRenderer10.clone();
        categoryPlot0.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer10, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator22 = null;
        lineAndShapeRenderer10.setBaseURLGenerator(categoryURLGenerator22);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset24 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.Range range25 = lineAndShapeRenderer10.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset24);
        java.lang.Object obj26 = defaultCategoryDataset24.clone();
        try {
            boolean boolean29 = defaultCategoryDataset24.isSelected(1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNull(range25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test451() throws Throwable {
printRuntimeMSG("---RegressionTest0:test451");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint1 = categoryAxis0.getTickLabelPaint();
        categoryAxis0.setTickLabelsVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double5 = rectangleInsets4.getRight();
        double double7 = rectangleInsets4.calculateTopInset(0.0d);
        categoryAxis0.setTickLabelInsets(rectangleInsets4);
        categoryAxis0.setMaximumCategoryLabelWidthRatio((float) (short) 10);
        float float11 = categoryAxis0.getTickMarkInsideLength();
        java.awt.Font font13 = categoryAxis0.getTickLabelFont((java.lang.Comparable) 3.0d);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNotNull(rectangleInsets4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNotNull(font13);
    }

    @Test
    public void test452() throws Throwable {
printRuntimeMSG("---RegressionTest0:test452");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        java.awt.Shape shape10 = barRenderer0.getBaseShape();
        barRenderer0.setMinimumBarLength((double) 0.0f);
        barRenderer0.setSeriesVisibleInLegend((int) '#', (java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test453() throws Throwable {
printRuntimeMSG("---RegressionTest0:test453");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double1 = rectangleInsets0.getRight();
        double double3 = rectangleInsets0.calculateTopInset(0.0d);
        double double5 = rectangleInsets0.calculateLeftOutset(0.0d);
        java.awt.geom.Rectangle2D rectangle2D6 = null;
        try {
            rectangleInsets0.trim(rectangle2D6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test454() throws Throwable {
printRuntimeMSG("---RegressionTest0:test454");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = lineAndShapeRenderer8.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator10 = null;
        lineAndShapeRenderer8.setBaseToolTipGenerator(categoryToolTipGenerator10);
        java.awt.Font font13 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer8.setSeriesItemLabelFont((int) (short) 0, font13, true);
        lineAndShapeRenderer2.setBaseLegendTextFont(font13);
        boolean boolean17 = lineAndShapeRenderer2.getBaseSeriesVisibleInLegend();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test455() throws Throwable {
printRuntimeMSG("---RegressionTest0:test455");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.axis.ValueAxis valueAxis10 = null;
        org.jfree.data.Range range11 = categoryPlot9.getDataRange(valueAxis10);
        categoryPlot9.setWeight((int) 'a');
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo17 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState18 = null;
        boolean boolean19 = categoryPlot9.render(graphics2D14, rectangle2D15, 0, plotRenderingInfo17, categoryCrosshairState18);
        org.jfree.chart.axis.AxisLocation axisLocation20 = null;
        try {
            categoryPlot9.setDomainAxisLocation(axisLocation20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'location' for index 0 not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(range11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test456() throws Throwable {
printRuntimeMSG("---RegressionTest0:test456");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        boolean boolean12 = categoryPlot10.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D13 = null;
        java.awt.geom.Rectangle2D rectangle2D14 = null;
        categoryPlot10.drawBackgroundImage(graphics2D13, rectangle2D14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        categoryPlot10.drawBackgroundImage(graphics2D16, rectangle2D17);
        lineAndShapeRenderer7.setPlot(categoryPlot10);
        java.awt.Graphics2D graphics2D20 = null;
        org.jfree.chart.renderer.category.CategoryItemRendererState categoryItemRendererState21 = null;
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke24 = categoryPlot23.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke26 = categoryPlot25.getRangeMinorGridlineStroke();
        categoryPlot23.setParent((org.jfree.chart.plot.Plot) categoryPlot25);
        org.jfree.chart.LegendItemCollection legendItemCollection28 = categoryPlot23.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier29 = categoryPlot23.getDrawingSupplier();
        java.awt.Stroke stroke30 = categoryPlot23.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis31 = new org.jfree.chart.axis.CategoryAxis();
        java.util.List list32 = categoryPlot23.getCategoriesForAxis(categoryAxis31);
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = categoryPlot23.getDomainAxisForDataset(0);
        org.jfree.chart.axis.CategoryAxis categoryAxis35 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis35.setMinorTickMarkOutsideLength((float) (short) 0);
        java.awt.Font font38 = categoryAxis35.getTickLabelFont();
        float float39 = categoryAxis35.getMaximumCategoryLabelWidthRatio();
        org.jfree.chart.axis.ValueAxis valueAxis40 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke42 = categoryPlot41.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation43 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation44 = axisLocation43.getOpposite();
        categoryPlot41.setDomainAxisLocation(axisLocation44, false);
        boolean boolean47 = categoryPlot41.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer51 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition53 = null;
        lineAndShapeRenderer51.setSeriesPositiveItemLabelPosition(0, itemLabelPosition53);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator55 = null;
        lineAndShapeRenderer51.setLegendItemToolTipGenerator(categorySeriesLabelGenerator55);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition57 = lineAndShapeRenderer51.getBasePositiveItemLabelPosition();
        boolean boolean58 = lineAndShapeRenderer51.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition59 = lineAndShapeRenderer51.getBasePositiveItemLabelPosition();
        java.lang.Object obj60 = lineAndShapeRenderer51.clone();
        categoryPlot41.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer51, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator63 = null;
        lineAndShapeRenderer51.setBaseURLGenerator(categoryURLGenerator63);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset65 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.Range range66 = lineAndShapeRenderer51.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset65);
        try {
            lineAndShapeRenderer7.drawItem(graphics2D20, categoryItemRendererState21, rectangle2D22, categoryPlot23, categoryAxis35, valueAxis40, (org.jfree.data.category.CategoryDataset) defaultCategoryDataset65, 0, (-65536), true, 255);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNull(legendItemCollection28);
        org.junit.Assert.assertNotNull(drawingSupplier29);
        org.junit.Assert.assertNotNull(stroke30);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNull(categoryAxis34);
        org.junit.Assert.assertNotNull(font38);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + 0.0f + "'", float39 == 0.0f);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(axisLocation43);
        org.junit.Assert.assertNotNull(axisLocation44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition59);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertNull(range66);
    }

    @Test
    public void test457() throws Throwable {
printRuntimeMSG("---RegressionTest0:test457");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_LIGHT_MAGENTA;
        int int1 = color0.getTransparency();
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test458() throws Throwable {
printRuntimeMSG("---RegressionTest0:test458");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (short) 10);
        java.awt.Paint paint14 = lineAndShapeRenderer2.getSeriesItemLabelPaint((int) (byte) -1);
        java.awt.Paint paint18 = lineAndShapeRenderer2.getItemFillPaint((int) (byte) -1, (int) (byte) 0, true);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation19 = null;
        try {
            lineAndShapeRenderer2.addAnnotation(categoryAnnotation19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNull(paint14);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test459() throws Throwable {
printRuntimeMSG("---RegressionTest0:test459");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
        java.awt.Color color2 = org.jfree.chart.ChartColor.DARK_GREEN;
        renderAttributes1.setDefaultOutlinePaint((java.awt.Paint) color2);
        java.awt.Paint paint6 = renderAttributes1.getItemFillPaint((int) '#', (int) (short) 0);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer9 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean11 = lineAndShapeRenderer9.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean12 = lineAndShapeRenderer9.getBaseLinesVisible();
        java.awt.Shape shape13 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer9.setBaseLegendShape(shape13);
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis16.setCategoryMargin((double) 10.0f);
        java.awt.Font font19 = categoryAxis16.getTickLabelFont();
        lineAndShapeRenderer9.setSeriesItemLabelFont(15, font19, true);
        renderAttributes1.setDefaultLabelFont(font19);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(shape13);
        org.junit.Assert.assertNotNull(font19);
    }

    @Test
    public void test460() throws Throwable {
printRuntimeMSG("---RegressionTest0:test460");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        boolean boolean5 = categoryPlot2.isRangeMinorGridlinesVisible();
        try {
            categoryPlot2.setBackgroundImageAlpha((float) (-10));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The 'alpha' value must be in the range 0.0f to 1.0f.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test461() throws Throwable {
printRuntimeMSG("---RegressionTest0:test461");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL;
        java.lang.String str1 = gradientPaintTransformType0.toString();
        java.lang.String str2 = gradientPaintTransformType0.toString();
        java.lang.String str3 = gradientPaintTransformType0.toString();
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "GradientPaintTransformType.CENTER_VERTICAL" + "'", str1.equals("GradientPaintTransformType.CENTER_VERTICAL"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "GradientPaintTransformType.CENTER_VERTICAL" + "'", str2.equals("GradientPaintTransformType.CENTER_VERTICAL"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GradientPaintTransformType.CENTER_VERTICAL" + "'", str3.equals("GradientPaintTransformType.CENTER_VERTICAL"));
    }

    @Test
    public void test462() throws Throwable {
printRuntimeMSG("---RegressionTest0:test462");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D7, rectangle2D8, (int) (byte) 1, plotRenderingInfo10, categoryCrosshairState11);
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation15 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation16 = axisLocation15.getOpposite();
        categoryPlot13.setDomainAxisLocation(axisLocation16, false);
        boolean boolean19 = categoryPlot13.canSelectByRegion();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        lineAndShapeRenderer23.setSeriesPositiveItemLabelPosition(0, itemLabelPosition25);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = null;
        lineAndShapeRenderer23.setLegendItemToolTipGenerator(categorySeriesLabelGenerator27);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = lineAndShapeRenderer23.getBasePositiveItemLabelPosition();
        boolean boolean30 = lineAndShapeRenderer23.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = lineAndShapeRenderer23.getBasePositiveItemLabelPosition();
        java.lang.Object obj32 = lineAndShapeRenderer23.clone();
        categoryPlot13.setRenderer((int) (short) 1, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer23, true);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = null;
        lineAndShapeRenderer23.setBaseURLGenerator(categoryURLGenerator35);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset37 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.data.Range range38 = lineAndShapeRenderer23.findRangeBounds((org.jfree.data.category.CategoryDataset) defaultCategoryDataset37);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer39 = categoryPlot0.getRendererForDataset((org.jfree.data.category.CategoryDataset) defaultCategoryDataset37);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer42 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean44 = lineAndShapeRenderer42.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean45 = lineAndShapeRenderer42.getBaseLinesVisible();
        lineAndShapeRenderer42.setAutoPopulateSeriesPaint(false);
        boolean boolean48 = lineAndShapeRenderer42.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator49 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        lineAndShapeRenderer42.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator49);
        java.awt.Color color52 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        lineAndShapeRenderer42.setSeriesFillPaint((int) '4', (java.awt.Paint) color52);
        java.awt.Shape shape59 = null;
        java.awt.Color color60 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke61 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color62 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem63 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape59, (java.awt.Paint) color60, stroke61, (java.awt.Paint) color62);
        java.awt.Paint paint64 = legendItem63.getLabelPaint();
        java.lang.String str65 = legendItem63.getURLText();
        java.awt.Paint paint66 = legendItem63.getFillPaint();
        java.awt.Stroke stroke67 = legendItem63.getLineStroke();
        lineAndShapeRenderer42.setSeriesOutlineStroke(100, stroke67, true);
        categoryPlot0.setRangeCrosshairStroke(stroke67);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(axisLocation15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(range38);
        org.junit.Assert.assertNull(categoryItemRenderer39);
        org.junit.Assert.assertNull(boolean44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(color52);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(stroke61);
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNull(paint64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str65.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNotNull(paint66);
        org.junit.Assert.assertNotNull(stroke67);
    }

    @Test
    public void test463() throws Throwable {
printRuntimeMSG("---RegressionTest0:test463");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 1, (double) (byte) 100, (double) 100, 1.0d);
        double double6 = rectangleInsets4.calculateBottomOutset((double) (-12566464));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test464() throws Throwable {
printRuntimeMSG("---RegressionTest0:test464");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        int int4 = categoryPlot0.getDatasetCount();
        java.awt.Paint paint5 = categoryPlot0.getDomainCrosshairPaint();
        java.awt.Paint paint6 = categoryPlot0.getRangeZeroBaselinePaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test465() throws Throwable {
printRuntimeMSG("---RegressionTest0:test465");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer0 = new org.jfree.chart.util.StandardGradientPaintTransformer();
    }

    @Test
    public void test466() throws Throwable {
printRuntimeMSG("---RegressionTest0:test466");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getLegendTextPaint((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer13 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean15 = lineAndShapeRenderer13.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke19 = categoryPlot18.getRangeMinorGridlineStroke();
        categoryPlot16.setParent((org.jfree.chart.plot.Plot) categoryPlot18);
        org.jfree.chart.LegendItemCollection legendItemCollection21 = categoryPlot16.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent22 = null;
        categoryPlot16.axisChanged(axisChangeEvent22);
        org.jfree.chart.axis.AxisSpace axisSpace24 = categoryPlot16.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset25 = null;
        categoryPlot16.setDataset(categoryDataset25);
        java.awt.Stroke stroke27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot16.setDomainCrosshairStroke(stroke27);
        java.awt.Stroke stroke29 = categoryPlot16.getRangeGridlineStroke();
        lineAndShapeRenderer13.setBaseStroke(stroke29);
        lineAndShapeRenderer2.setBaseStroke(stroke29, false);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(false);
        java.awt.Shape shape36 = lineAndShapeRenderer2.getLegendShape(0);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNull(legendItemCollection21);
        org.junit.Assert.assertNull(axisSpace24);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(shape36);
    }

    @Test
    public void test467() throws Throwable {
printRuntimeMSG("---RegressionTest0:test467");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        java.awt.Paint paint9 = legendItem8.getFillPaint();
        legendItem8.setURLText("ChartChangeEventType.NEW_DATASET");
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test468() throws Throwable {
printRuntimeMSG("---RegressionTest0:test468");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean6 = lineAndShapeRenderer4.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean7 = lineAndShapeRenderer4.getBaseLinesVisible();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer4.setBaseLegendShape(shape8);
        renderAttributes0.setSeriesShape((int) ' ', shape8);
        java.awt.Paint paint11 = renderAttributes0.getDefaultPaint();
        renderAttributes0.setDefaultCreateEntity((java.lang.Boolean) false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer16 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator17 = lineAndShapeRenderer16.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator18 = null;
        lineAndShapeRenderer16.setBaseToolTipGenerator(categoryToolTipGenerator18);
        java.awt.Font font21 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer16.setSeriesItemLabelFont((int) (short) 0, font21, true);
        renderAttributes0.setDefaultLabelFont(font21);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNull(paint11);
        org.junit.Assert.assertNull(categoryItemLabelGenerator17);
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test469() throws Throwable {
printRuntimeMSG("---RegressionTest0:test469");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (short) 10);
        java.awt.Color color15 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem16 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color15);
        java.awt.Color color17 = java.awt.Color.getColor("hi!", color15);
        lineAndShapeRenderer2.setBaseOutlinePaint((java.awt.Paint) color17);
        int int19 = lineAndShapeRenderer2.getPassCount();
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test470() throws Throwable {
printRuntimeMSG("---RegressionTest0:test470");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.jfree.chart.text.TextAnchor textAnchor0 = org.jfree.chart.text.TextAnchor.BOTTOM_CENTER;
        org.junit.Assert.assertNotNull(textAnchor0);
    }

    @Test
    public void test471() throws Throwable {
printRuntimeMSG("---RegressionTest0:test471");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        float float3 = categoryAxis0.getMinorTickMarkInsideLength();
        categoryAxis0.setMinorTickMarkInsideLength(100.0f);
        java.awt.Paint paint6 = categoryAxis0.getTickMarkPaint();
        categoryAxis0.setAxisLineVisible(false);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(paint6);
    }

    @Test
    public void test472() throws Throwable {
printRuntimeMSG("---RegressionTest0:test472");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        double double2 = rectangleInsets0.getTop();
        double double4 = rectangleInsets0.calculateTopOutset((double) ' ');
        java.awt.geom.Rectangle2D rectangle2D5 = null;
        try {
            java.awt.geom.Rectangle2D rectangle2D8 = rectangleInsets0.createOutsetRectangle(rectangle2D5, true, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'base' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
    }

    @Test
    public void test473() throws Throwable {
printRuntimeMSG("---RegressionTest0:test473");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        categoryAxis1.setVisible(false);
        float float12 = categoryAxis1.getTickMarkOutsideLength();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 2.0f + "'", float12 == 2.0f);
    }

    @Test
    public void test474() throws Throwable {
printRuntimeMSG("---RegressionTest0:test474");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        barRenderer0.setBaseItemLabelsVisible(false);
        double double5 = barRenderer0.getItemMargin();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = barRenderer0.getBaseURLGenerator();
        barRenderer0.setShadowXOffset((double) (-16777216));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = barRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.renderer.RenderAttributes renderAttributes14 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean20 = lineAndShapeRenderer18.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean21 = lineAndShapeRenderer18.getBaseLinesVisible();
        java.awt.Shape shape22 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer18.setBaseLegendShape(shape22);
        renderAttributes14.setSeriesShape((int) ' ', shape22);
        org.jfree.chart.entity.ChartEntity chartEntity26 = new org.jfree.chart.entity.ChartEntity(shape22, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color29 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem30 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color29);
        java.lang.String str31 = legendItem30.getToolTipText();
        java.awt.Stroke stroke32 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem30.setOutlineStroke(stroke32);
        java.awt.Shape shape38 = null;
        java.awt.Color color39 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color41 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem42 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape38, (java.awt.Paint) color39, stroke40, (java.awt.Paint) color41);
        java.lang.Class<?> wildcardClass43 = color39.getClass();
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape22, paint27, stroke32, (java.awt.Paint) color39);
        boolean boolean45 = barRenderer0.equals((java.lang.Object) "GradientPaintTransformType.CENTER_VERTICAL");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer49 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition51 = null;
        lineAndShapeRenderer49.setSeriesPositiveItemLabelPosition(0, itemLabelPosition51);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator53 = null;
        lineAndShapeRenderer49.setLegendItemToolTipGenerator(categorySeriesLabelGenerator53);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition55 = lineAndShapeRenderer49.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition59 = lineAndShapeRenderer49.getNegativeItemLabelPosition((int) (short) -1, (int) (short) -1, false);
        try {
            barRenderer0.setSeriesPositiveItemLabelPosition((-10), itemLabelPosition59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition55);
        org.junit.Assert.assertNotNull(itemLabelPosition59);
    }

    @Test
    public void test475() throws Throwable {
printRuntimeMSG("---RegressionTest0:test475");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        barRenderer0.setBaseItemLabelsVisible(false);
        double double5 = barRenderer0.getItemMargin();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = barRenderer0.getBaseURLGenerator();
        barRenderer0.setShadowXOffset((double) (-16777216));
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator9 = barRenderer0.getLegendItemLabelGenerator();
        org.jfree.chart.renderer.RenderAttributes renderAttributes14 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean20 = lineAndShapeRenderer18.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean21 = lineAndShapeRenderer18.getBaseLinesVisible();
        java.awt.Shape shape22 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer18.setBaseLegendShape(shape22);
        renderAttributes14.setSeriesShape((int) ' ', shape22);
        org.jfree.chart.entity.ChartEntity chartEntity26 = new org.jfree.chart.entity.ChartEntity(shape22, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint27 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color29 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem30 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color29);
        java.lang.String str31 = legendItem30.getToolTipText();
        java.awt.Stroke stroke32 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem30.setOutlineStroke(stroke32);
        java.awt.Shape shape38 = null;
        java.awt.Color color39 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color41 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem42 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape38, (java.awt.Paint) color39, stroke40, (java.awt.Paint) color41);
        java.lang.Class<?> wildcardClass43 = color39.getClass();
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape22, paint27, stroke32, (java.awt.Paint) color39);
        boolean boolean45 = barRenderer0.equals((java.lang.Object) "GradientPaintTransformType.CENTER_VERTICAL");
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator47 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator("");
        boolean boolean48 = barRenderer0.equals((java.lang.Object) "");
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator9);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(shape22);
        org.junit.Assert.assertNotNull(paint27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test476() throws Throwable {
printRuntimeMSG("---RegressionTest0:test476");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.lang.Number number0 = null;
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue(number0, true);
        selectableValue2.setSelected(true);
    }

    @Test
    public void test477() throws Throwable {
printRuntimeMSG("---RegressionTest0:test477");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.awt.Stroke stroke0 = org.jfree.chart.plot.Plot.DEFAULT_OUTLINE_STROKE;
        org.junit.Assert.assertNotNull(stroke0);
    }

    @Test
    public void test478() throws Throwable {
printRuntimeMSG("---RegressionTest0:test478");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        categoryPlot0.setDrawSharedDomainAxis(true);
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor8 = org.jfree.chart.labels.ItemLabelAnchor.OUTSIDE12;
        boolean boolean9 = categoryPlot0.equals((java.lang.Object) itemLabelAnchor8);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(itemLabelAnchor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test479() throws Throwable {
printRuntimeMSG("---RegressionTest0:test479");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        boolean boolean9 = lineAndShapeRenderer2.getDataBoundsIncludesVisibleSeriesOnly();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.lang.Object obj11 = lineAndShapeRenderer2.clone();
        double double12 = lineAndShapeRenderer2.getItemMargin();
        java.awt.Paint paint14 = lineAndShapeRenderer2.lookupSeriesOutlinePaint(2);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition15 = null;
        try {
            lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition15, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'position' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
    }

    @Test
    public void test480() throws Throwable {
printRuntimeMSG("---RegressionTest0:test480");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        java.awt.Font font7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 0, font7, true);
        java.lang.Boolean boolean11 = lineAndShapeRenderer2.getSeriesCreateEntities((int) 'a');
        java.awt.Paint paint12 = lineAndShapeRenderer2.getBaseItemLabelPaint();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator14 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator((int) (short) 0, categoryItemLabelGenerator14);
        try {
            lineAndShapeRenderer2.setSeriesVisible((-1), (java.lang.Boolean) false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test481() throws Throwable {
printRuntimeMSG("---RegressionTest0:test481");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        lineAndShapeRenderer2.setBaseLinesVisible(true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-16777216));
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
    }

    @Test
    public void test482() throws Throwable {
printRuntimeMSG("---RegressionTest0:test482");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        int int2 = keyedObjects0.getIndex((java.lang.Comparable) (short) -1);
        try {
            keyedObjects0.removeValue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 52, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test483() throws Throwable {
printRuntimeMSG("---RegressionTest0:test483");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        boolean boolean3 = categoryPlot0.isRangeMinorGridlinesVisible();
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test484() throws Throwable {
printRuntimeMSG("---RegressionTest0:test484");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.jfree.chart.util.ShapeList shapeList4 = new org.jfree.chart.util.ShapeList();
        org.jfree.chart.renderer.RenderAttributes renderAttributes10 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer14.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean17 = lineAndShapeRenderer14.getBaseLinesVisible();
        java.awt.Shape shape18 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer14.setBaseLegendShape(shape18);
        renderAttributes10.setSeriesShape((int) ' ', shape18);
        org.jfree.chart.entity.ChartEntity chartEntity22 = new org.jfree.chart.entity.ChartEntity(shape18, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color25 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem26 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color25);
        java.lang.String str27 = legendItem26.getToolTipText();
        java.awt.Stroke stroke28 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem26.setOutlineStroke(stroke28);
        java.awt.Shape shape34 = null;
        java.awt.Color color35 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color37 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem38 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape34, (java.awt.Paint) color35, stroke36, (java.awt.Paint) color37);
        java.lang.Class<?> wildcardClass39 = color35.getClass();
        org.jfree.chart.LegendItem legendItem40 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape18, paint23, stroke28, (java.awt.Paint) color35);
        org.jfree.chart.entity.ChartEntity chartEntity41 = new org.jfree.chart.entity.ChartEntity(shape18);
        shapeList4.setShape((int) (short) 1, shape18);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator47 = lineAndShapeRenderer46.getBaseItemLabelGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = lineAndShapeRenderer46.getSeriesNegativeItemLabelPosition(192);
        java.awt.Shape shape50 = lineAndShapeRenderer46.getBaseShape();
        shapeList4.setShape((int) (short) 10, shape50);
        java.awt.Stroke stroke52 = null;
        java.awt.Paint paint53 = null;
        try {
            org.jfree.chart.LegendItem legendItem54 = new org.jfree.chart.LegendItem("PlotOrientation.VERTICAL", "PlotOrientation.VERTICAL", "DatasetRenderingOrder.FORWARD", "hi!", shape50, stroke52, paint53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'lineStroke' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(categoryItemLabelGenerator47);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
        org.junit.Assert.assertNotNull(shape50);
    }

    @Test
    public void test485() throws Throwable {
printRuntimeMSG("---RegressionTest0:test485");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.jfree.chart.renderer.RenderAttributes renderAttributes8 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean14 = lineAndShapeRenderer12.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean15 = lineAndShapeRenderer12.getBaseLinesVisible();
        java.awt.Shape shape16 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer12.setBaseLegendShape(shape16);
        renderAttributes8.setSeriesShape((int) ' ', shape16);
        org.jfree.chart.entity.ChartEntity chartEntity20 = new org.jfree.chart.entity.ChartEntity(shape16, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint21 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color23 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem24 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color23);
        java.lang.String str25 = legendItem24.getToolTipText();
        java.awt.Stroke stroke26 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem24.setOutlineStroke(stroke26);
        java.awt.Shape shape32 = null;
        java.awt.Color color33 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color35 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem36 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape32, (java.awt.Paint) color33, stroke34, (java.awt.Paint) color35);
        java.lang.Class<?> wildcardClass37 = color33.getClass();
        org.jfree.chart.LegendItem legendItem38 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape16, paint21, stroke26, (java.awt.Paint) color33);
        org.jfree.chart.entity.ChartEntity chartEntity39 = new org.jfree.chart.entity.ChartEntity(shape16);
        java.awt.Color color40 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape16, (java.awt.Paint) color40);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset44 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity47 = new org.jfree.chart.entity.CategoryItemEntity(shape16, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset44, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        java.lang.String str48 = categoryItemEntity47.toString();
        java.awt.Shape shape49 = categoryItemEntity47.getArea();
        categoryItemEntity47.setRowKey((java.lang.Comparable) "ChartChangeEventType.GENERAL");
        org.jfree.data.category.CategoryDataset categoryDataset52 = categoryItemEntity47.getDataset();
        categoryItemEntity47.setColumnKey((java.lang.Comparable) 1L);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(shape16);
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(shape49);
        org.junit.Assert.assertNotNull(categoryDataset52);
    }

    @Test
    public void test486() throws Throwable {
printRuntimeMSG("---RegressionTest0:test486");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.util.List list1 = keyedObjects2D0.getColumnKeys();
        org.jfree.chart.renderer.category.BarRenderer barRenderer2 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint3 = barRenderer2.getShadowPaint();
        boolean boolean4 = barRenderer2.getBaseSeriesVisible();
        org.jfree.chart.renderer.RenderAttributes renderAttributes5 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint6 = renderAttributes5.getDefaultLabelPaint();
        java.awt.Paint paint9 = renderAttributes5.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke10 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes5.setDefaultStroke(stroke10);
        barRenderer2.setBaseStroke(stroke10, true);
        boolean boolean14 = keyedObjects2D0.equals((java.lang.Object) stroke10);
        try {
            java.lang.Object obj17 = keyedObjects2D0.getObject(15, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 15, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test487() throws Throwable {
printRuntimeMSG("---RegressionTest0:test487");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.data.category.CategoryDataset categoryDataset7 = categoryPlot0.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis8 = new org.jfree.chart.axis.CategoryAxis();
        double double9 = categoryAxis8.getUpperMargin();
        int int10 = categoryPlot0.getDomainAxisIndex(categoryAxis8);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomDomainAxes((double) (short) -1, 2.0d, plotRenderingInfo13, point2D14);
        java.awt.Graphics2D graphics2D16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState20 = null;
        boolean boolean21 = categoryPlot0.render(graphics2D16, rectangle2D17, (int) (byte) 100, plotRenderingInfo19, categoryCrosshairState20);
        categoryPlot0.setDomainCrosshairColumnKey((java.lang.Comparable) (byte) 100);
        boolean boolean24 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation25 = null;
        try {
            categoryPlot0.addAnnotation(categoryAnnotation25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test488() throws Throwable {
printRuntimeMSG("---RegressionTest0:test488");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        org.jfree.data.category.CategoryDataset categoryDataset5 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis6 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis6.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator13 = lineAndShapeRenderer12.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot(categoryDataset5, categoryAxis6, valueAxis9, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer12);
        java.util.List list15 = categoryPlot0.getCategoriesForAxis(categoryAxis6);
        java.awt.Paint paint16 = categoryAxis6.getTickLabelPaint();
        categoryAxis6.setFixedDimension(3.0d);
        categoryAxis6.setLabelAngle((double) (short) 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(paint16);
    }

    @Test
    public void test489() throws Throwable {
printRuntimeMSG("---RegressionTest0:test489");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        java.util.List list3 = keyedObjects2D0.getColumnKeys();
        try {
            keyedObjects2D0.removeColumn((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 0, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
    }

    @Test
    public void test490() throws Throwable {
printRuntimeMSG("---RegressionTest0:test490");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Paint paint4 = renderAttributes0.getItemPaint((int) (short) 1, (int) (byte) 10);
        org.jfree.chart.renderer.RenderAttributes renderAttributes10 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer14.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean17 = lineAndShapeRenderer14.getBaseLinesVisible();
        java.awt.Shape shape18 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer14.setBaseLegendShape(shape18);
        renderAttributes10.setSeriesShape((int) ' ', shape18);
        org.jfree.chart.entity.ChartEntity chartEntity22 = new org.jfree.chart.entity.ChartEntity(shape18, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color25 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem26 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color25);
        java.lang.String str27 = legendItem26.getToolTipText();
        java.awt.Stroke stroke28 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem26.setOutlineStroke(stroke28);
        java.awt.Shape shape34 = null;
        java.awt.Color color35 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color37 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem38 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape34, (java.awt.Paint) color35, stroke36, (java.awt.Paint) color37);
        java.lang.Class<?> wildcardClass39 = color35.getClass();
        org.jfree.chart.LegendItem legendItem40 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape18, paint23, stroke28, (java.awt.Paint) color35);
        org.jfree.chart.entity.ChartEntity chartEntity41 = new org.jfree.chart.entity.ChartEntity(shape18);
        renderAttributes0.setSeriesShape(1, shape18);
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke44 = categoryPlot43.getRangeMinorGridlineStroke();
        boolean boolean45 = categoryPlot43.isRangeCrosshairLockedOnData();
        org.jfree.chart.entity.PlotEntity plotEntity48 = new org.jfree.chart.entity.PlotEntity(shape18, (org.jfree.chart.plot.Plot) categoryPlot43, "ItemLabelAnchor.OUTSIDE9", "org.jfree.chart.event.ChartChangeEvent[source=-16777216]");
        java.lang.String str49 = plotEntity48.toString();
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(shape18);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(color37);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "PlotEntity: tooltip = ItemLabelAnchor.OUTSIDE9" + "'", str49.equals("PlotEntity: tooltip = ItemLabelAnchor.OUTSIDE9"));
    }

    @Test
    public void test491() throws Throwable {
printRuntimeMSG("---RegressionTest0:test491");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) '4', (int) '4', false);
        java.lang.Object obj9 = lineAndShapeRenderer2.clone();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = lineAndShapeRenderer2.getSeriesItemLabelGenerator((int) (byte) 0);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(categoryItemLabelGenerator11);
    }

    @Test
    public void test492() throws Throwable {
printRuntimeMSG("---RegressionTest0:test492");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        try {
            org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor((-8355712), 4, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Color parameter outside of expected range: Red");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test493() throws Throwable {
printRuntimeMSG("---RegressionTest0:test493");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.jfree.chart.util.ShapeList shapeList0 = new org.jfree.chart.util.ShapeList();
        org.jfree.chart.util.StrokeList strokeList1 = new org.jfree.chart.util.StrokeList();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator5 = lineAndShapeRenderer4.getBaseItemLabelGenerator();
        java.awt.Paint paint7 = lineAndShapeRenderer4.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator9 = lineAndShapeRenderer4.getSeriesURLGenerator(0);
        boolean boolean10 = strokeList1.equals((java.lang.Object) categoryURLGenerator9);
        java.awt.Stroke stroke12 = strokeList1.getStroke((-12566464));
        strokeList1.clear();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke16 = categoryPlot15.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke18 = categoryPlot17.getRangeMinorGridlineStroke();
        categoryPlot15.setParent((org.jfree.chart.plot.Plot) categoryPlot17);
        org.jfree.chart.LegendItemCollection legendItemCollection20 = categoryPlot15.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent21 = null;
        categoryPlot15.axisChanged(axisChangeEvent21);
        org.jfree.chart.axis.AxisSpace axisSpace23 = categoryPlot15.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset24 = null;
        categoryPlot15.setDataset(categoryDataset24);
        java.awt.Stroke stroke26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot15.setDomainCrosshairStroke(stroke26);
        java.awt.Stroke stroke28 = categoryPlot15.getRangeGridlineStroke();
        strokeList1.setStroke((int) '#', stroke28);
        boolean boolean30 = shapeList0.equals((java.lang.Object) '#');
        java.awt.Shape shape32 = shapeList0.getShape((int) '#');
        org.junit.Assert.assertNull(categoryItemLabelGenerator5);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertNull(categoryURLGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(stroke12);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNull(legendItemCollection20);
        org.junit.Assert.assertNull(axisSpace23);
        org.junit.Assert.assertNotNull(stroke26);
        org.junit.Assert.assertNotNull(stroke28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(shape32);
    }

    @Test
    public void test494() throws Throwable {
printRuntimeMSG("---RegressionTest0:test494");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis2.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = lineAndShapeRenderer8.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        boolean boolean11 = categoryAxis2.isTickLabelsVisible();
        double double12 = categoryAxis2.getFixedDimension();
        java.awt.Paint paint14 = categoryAxis2.getTickLabelPaint((java.lang.Comparable) 4.0d);
        categoryAxis0.setTickLabelPaint(paint14);
        categoryAxis0.setLabelToolTip("hi!");
        int int18 = categoryAxis0.getCategoryLabelPositionOffset();
        categoryAxis0.setLabel("PlotOrientation.VERTICAL");
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test495() throws Throwable {
printRuntimeMSG("---RegressionTest0:test495");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent6 = null;
        categoryPlot0.axisChanged(axisChangeEvent6);
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset9 = null;
        categoryPlot0.setDataset(categoryDataset9);
        java.awt.Stroke stroke11 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot0.setDomainCrosshairStroke(stroke11);
        java.awt.Stroke stroke13 = categoryPlot0.getRangeGridlineStroke();
        categoryPlot0.setForegroundAlpha((float) (-1));
        org.jfree.data.category.CategoryDataset categoryDataset16 = categoryPlot0.getDataset();
        java.awt.Paint paint17 = categoryPlot0.getDomainCrosshairPaint();
        java.awt.Stroke stroke18 = categoryPlot0.getRangeZeroBaselineStroke();
        java.awt.Stroke stroke19 = categoryPlot0.getOutlineStroke();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test496() throws Throwable {
printRuntimeMSG("---RegressionTest0:test496");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        java.awt.Color color2 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem3 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color2);
        java.awt.color.ColorSpace colorSpace4 = color2.getColorSpace();
        keyedObjects2D0.addObject((java.lang.Object) colorSpace4, (java.lang.Comparable) (-4.0d), (java.lang.Comparable) (-4.0d));
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke9 = categoryPlot8.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer10 = null;
        categoryPlot8.setRenderer(categoryItemRenderer10);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent12 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot8);
        categoryPlot8.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D15 = null;
        java.awt.geom.Rectangle2D rectangle2D16 = null;
        categoryPlot8.drawBackgroundImage(graphics2D15, rectangle2D16);
        org.jfree.chart.plot.Plot plot18 = categoryPlot8.getRootPlot();
        boolean boolean19 = keyedObjects2D0.equals((java.lang.Object) plot18);
        try {
            keyedObjects2D0.removeObject((java.lang.Comparable) (-65536), (java.lang.Comparable) (-1.2566468E7d));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Row key (-65536) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNotNull(colorSpace4);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(plot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test497() throws Throwable {
printRuntimeMSG("---RegressionTest0:test497");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder8 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean10 = sortOrder8.equals((java.lang.Object) categoryPlot9);
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = new org.jfree.chart.axis.CategoryAxis();
        double double12 = categoryAxis11.getUpperMargin();
        categoryPlot9.setDomainAxis(categoryAxis11);
        org.jfree.chart.event.MarkerChangeEvent markerChangeEvent14 = null;
        categoryPlot9.markerChanged(markerChangeEvent14);
        org.jfree.chart.event.PlotChangeListener plotChangeListener16 = null;
        categoryPlot9.removeChangeListener(plotChangeListener16);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo20 = null;
        java.awt.geom.Point2D point2D21 = null;
        categoryPlot9.zoomRangeAxes(0.0d, (double) (-65536), plotRenderingInfo20, point2D21);
        org.jfree.chart.plot.Marker marker23 = null;
        org.jfree.chart.util.Layer layer24 = null;
        try {
            boolean boolean25 = categoryPlot9.removeRangeMarker(marker23, layer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.05d + "'", double12 == 0.05d);
    }

    @Test
    public void test498() throws Throwable {
printRuntimeMSG("---RegressionTest0:test498");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.BarRenderer barRenderer6 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint7 = barRenderer6.getShadowPaint();
        boolean boolean8 = barRenderer6.getBaseSeriesVisible();
        categoryPlot0.setRenderer((int) (short) 100, (org.jfree.chart.renderer.category.CategoryItemRenderer) barRenderer6);
        double double10 = barRenderer6.getShadowXOffset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator15 = lineAndShapeRenderer14.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator19 = lineAndShapeRenderer14.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer14.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.awt.Paint paint23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        lineAndShapeRenderer14.setBaseOutlinePaint(paint23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = lineAndShapeRenderer14.getNegativeItemLabelPosition((int) (byte) 10, (int) (short) 100, true);
        barRenderer6.setSeriesNegativeItemLabelPosition(0, itemLabelPosition28);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator30 = null;
        barRenderer6.setBaseToolTipGenerator(categoryToolTipGenerator30);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNull(categoryItemLabelGenerator15);
        org.junit.Assert.assertNull(categoryToolTipGenerator19);
        org.junit.Assert.assertNotNull(paint23);
        org.junit.Assert.assertNotNull(itemLabelPosition28);
    }

    @Test
    public void test499() throws Throwable {
printRuntimeMSG("---RegressionTest0:test499");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint3 = renderAttributes0.getItemOutlinePaint(1, (int) 'a');
        java.awt.Paint paint4 = renderAttributes0.getDefaultFillPaint();
        java.awt.Paint paint7 = renderAttributes0.getItemOutlinePaint((int) 'a', 4);
        org.jfree.data.KeyedObjects keyedObjects9 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.RenderAttributes renderAttributes12 = new org.jfree.chart.renderer.RenderAttributes(true);
        keyedObjects9.setObject((java.lang.Comparable) true, (java.lang.Object) true);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke15 = categoryPlot14.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation16 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation17 = axisLocation16.getOpposite();
        categoryPlot14.setDomainAxisLocation(axisLocation17, false);
        boolean boolean20 = categoryPlot14.canSelectByRegion();
        categoryPlot14.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot23.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo26, point2D27);
        categoryPlot23.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder31 = categoryPlot23.getRowRenderingOrder();
        categoryPlot14.setRowRenderingOrder(sortOrder31);
        boolean boolean34 = sortOrder31.equals((java.lang.Object) 4);
        keyedObjects9.sortByObjects(sortOrder31);
        java.awt.Color color36 = java.awt.Color.yellow;
        boolean boolean37 = keyedObjects9.equals((java.lang.Object) color36);
        renderAttributes0.setSeriesOutlinePaint(2, (java.awt.Paint) color36);
        java.awt.Paint paint40 = renderAttributes0.getSeriesPaint((-8355712));
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(axisLocation16);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(sortOrder31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(paint40);
    }

    @Test
    public void test500() throws Throwable {
printRuntimeMSG("---RegressionTest0:test500");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        java.lang.Comparable comparable6 = categoryPlot0.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge7 = categoryPlot0.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent8 = null;
        categoryPlot0.notifyListeners(plotChangeEvent8);
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = null;
        java.util.List list11 = categoryPlot0.getCategoriesForAxis(categoryAxis10);
        org.jfree.chart.util.Layer layer13 = null;
        java.util.Collection collection14 = categoryPlot0.getDomainMarkers(2, layer13);
        boolean boolean15 = categoryPlot0.isRangeCrosshairVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}

