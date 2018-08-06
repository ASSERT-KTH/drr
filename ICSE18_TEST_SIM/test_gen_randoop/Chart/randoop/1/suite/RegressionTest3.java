import java.io.IOException; 
import java.io.RandomAccessFile;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    
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
printRuntimeMSG("---RegressionTest3:test001");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test001");
        java.util.Locale locale1 = null;
        java.lang.ClassLoader classLoader2 = null;
        try {
            java.util.ResourceBundle resourceBundle3 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("", locale1, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
printRuntimeMSG("---RegressionTest3:test002");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test002");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = categoryPlot0.getAxisOffset();
        java.awt.Image image48 = null;
        categoryPlot0.setBackgroundImage(image48);
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
        org.junit.Assert.assertNotNull(rectangleInsets47);
    }

    @Test
    public void test003() throws Throwable {
printRuntimeMSG("---RegressionTest3:test003");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test003");
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
        org.jfree.chart.axis.AxisLocation axisLocation14 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge15 = categoryPlot0.getDomainAxisEdge();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo18 = null;
        java.awt.geom.Point2D point2D19 = null;
        categoryPlot0.zoomRangeAxes(2.0d, (double) (-16777216), plotRenderingInfo18, point2D19);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition25 = null;
        lineAndShapeRenderer23.setSeriesPositiveItemLabelPosition(0, itemLabelPosition25);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator27 = null;
        lineAndShapeRenderer23.setLegendItemToolTipGenerator(categorySeriesLabelGenerator27);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition29 = lineAndShapeRenderer23.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = lineAndShapeRenderer23.getNegativeItemLabelPosition((int) (short) -1, (int) (short) -1, false);
        java.awt.Color color34 = org.jfree.chart.ChartColor.LIGHT_GREEN;
        lineAndShapeRenderer23.setBaseLegendTextPaint((java.awt.Paint) color34);
        lineAndShapeRenderer23.setUseFillPaint(false);
        java.awt.Paint paint41 = lineAndShapeRenderer23.getItemFillPaint((int) (short) 100, 128, false);
        categoryPlot0.setNoDataMessagePaint(paint41);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(axisLocation14);
        org.junit.Assert.assertNotNull(rectangleEdge15);
        org.junit.Assert.assertNotNull(itemLabelPosition29);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test004() throws Throwable {
printRuntimeMSG("---RegressionTest3:test004");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test004");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        double double3 = rectangleInsets0.calculateTopOutset((double) (short) -1);
        double double5 = rectangleInsets0.calculateLeftInset((-1.2566464E7d));
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 4.0d + "'", double5 == 4.0d);
    }

    @Test
    public void test005() throws Throwable {
printRuntimeMSG("---RegressionTest3:test005");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test005");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation1 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        categoryPlot0.setOrientation(plotOrientation1);
        categoryPlot0.setBackgroundImageAlpha(0.0f);
        categoryPlot0.setDomainCrosshairRowKey((java.lang.Comparable) true);
        categoryPlot0.clearDomainMarkers((int) ' ');
        categoryPlot0.setRangeGridlinesVisible(false);
        org.junit.Assert.assertNotNull(plotOrientation1);
    }

    @Test
    public void test006() throws Throwable {
printRuntimeMSG("---RegressionTest3:test006");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test006");
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
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition14 = barRenderer0.getSeriesPositiveItemLabelPosition(15);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(shape10);
        org.junit.Assert.assertNotNull(itemLabelPosition14);
    }

    @Test
    public void test007() throws Throwable {
printRuntimeMSG("---RegressionTest3:test007");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test007");
        org.jfree.chart.util.StrokeList strokeList0 = new org.jfree.chart.util.StrokeList();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = lineAndShapeRenderer3.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = lineAndShapeRenderer3.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = lineAndShapeRenderer3.getSeriesURLGenerator(0);
        boolean boolean9 = strokeList0.equals((java.lang.Object) categoryURLGenerator8);
        java.awt.Stroke stroke11 = strokeList0.getStroke(49);
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType12 = org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL;
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer13 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType12);
        java.lang.Object obj14 = standardGradientPaintTransformer13.clone();
        java.lang.Object obj15 = standardGradientPaintTransformer13.clone();
        boolean boolean16 = strokeList0.equals((java.lang.Object) standardGradientPaintTransformer13);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryURLGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNotNull(gradientPaintTransformType12);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test008() throws Throwable {
printRuntimeMSG("---RegressionTest3:test008");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test008");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer4 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean6 = lineAndShapeRenderer4.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean7 = lineAndShapeRenderer4.getBaseLinesVisible();
        java.awt.Shape shape8 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer4.setBaseLegendShape(shape8);
        renderAttributes0.setSeriesShape((int) ' ', shape8);
        org.jfree.chart.entity.ChartEntity chartEntity12 = new org.jfree.chart.entity.ChartEntity(shape8, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        org.jfree.chart.plot.CategoryPlot categoryPlot13 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke14 = categoryPlot13.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot15 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke16 = categoryPlot15.getRangeMinorGridlineStroke();
        categoryPlot13.setParent((org.jfree.chart.plot.Plot) categoryPlot15);
        org.jfree.chart.LegendItemCollection legendItemCollection18 = categoryPlot13.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier19 = categoryPlot13.getDrawingSupplier();
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
        categoryAxis21.setTickMarkInsideLength((float) (-1L));
        categoryAxis21.setMinorTickMarkInsideLength((float) (-12566464));
        categoryPlot13.setDomainAxis(192, categoryAxis21, true);
        categoryPlot13.clearDomainMarkers();
        org.jfree.chart.entity.PlotEntity plotEntity46 = new org.jfree.chart.entity.PlotEntity(shape8, (org.jfree.chart.plot.Plot) categoryPlot13, "ItemLabelAnchor.INSIDE5", "DatasetRenderingOrder.FORWARD");
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent47 = null;
        categoryPlot13.annotationChanged(annotationChangeEvent47);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(shape8);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(stroke16);
        org.junit.Assert.assertNull(legendItemCollection18);
        org.junit.Assert.assertNotNull(drawingSupplier19);
        org.junit.Assert.assertNull(categoryItemLabelGenerator30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test009() throws Throwable {
printRuntimeMSG("---RegressionTest3:test009");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test009");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint4 = renderAttributes3.getDefaultLabelPaint();
        java.awt.Paint paint7 = renderAttributes3.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes3.setDefaultStroke(stroke8);
        barRenderer0.setBaseStroke(stroke8, true);
        barRenderer0.setItemMargin((double) 'a');
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
    }

    @Test
    public void test010() throws Throwable {
printRuntimeMSG("---RegressionTest3:test010");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test010");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Color color2 = java.awt.Color.RED;
        renderAttributes0.setDefaultOutlinePaint((java.awt.Paint) color2);
        java.awt.Stroke stroke6 = renderAttributes0.getItemStroke((-1), 100);
        java.awt.Paint paint8 = renderAttributes0.getSeriesOutlinePaint(0);
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot9.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo12, point2D13);
        categoryPlot9.clearAnnotations();
        java.lang.String str16 = categoryPlot9.getNoDataMessage();
        java.awt.Color color17 = java.awt.Color.pink;
        categoryPlot9.setBackgroundPaint((java.awt.Paint) color17);
        renderAttributes0.setDefaultLabelPaint((java.awt.Paint) color17);
        try {
            java.awt.Paint paint21 = renderAttributes0.getSeriesLabelPaint(49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(stroke6);
        org.junit.Assert.assertNull(paint8);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test011() throws Throwable {
printRuntimeMSG("---RegressionTest3:test011");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test011");
        java.awt.Color color1 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem2 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes7 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean13 = lineAndShapeRenderer11.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean14 = lineAndShapeRenderer11.getBaseLinesVisible();
        java.awt.Shape shape15 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer11.setBaseLegendShape(shape15);
        renderAttributes7.setSeriesShape((int) ' ', shape15);
        org.jfree.chart.entity.ChartEntity chartEntity19 = new org.jfree.chart.entity.ChartEntity(shape15, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color22 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem23 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color22);
        java.lang.String str24 = legendItem23.getToolTipText();
        java.awt.Stroke stroke25 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem23.setOutlineStroke(stroke25);
        java.awt.Shape shape31 = null;
        java.awt.Color color32 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke33 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color34 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem35 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape31, (java.awt.Paint) color32, stroke33, (java.awt.Paint) color34);
        java.lang.Class<?> wildcardClass36 = color32.getClass();
        org.jfree.chart.LegendItem legendItem37 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape15, paint20, stroke25, (java.awt.Paint) color32);
        legendItem2.setFillPaint((java.awt.Paint) color32);
        int int39 = color32.getTransparency();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(shape15);
        org.junit.Assert.assertNotNull(paint20);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(color34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test012() throws Throwable {
printRuntimeMSG("---RegressionTest3:test012");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test012");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        categoryAxis1.setLabelToolTip("hi!");
        float float13 = categoryAxis1.getTickMarkInsideLength();
        float float14 = categoryAxis1.getTickMarkInsideLength();
        categoryAxis1.configure();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test013() throws Throwable {
printRuntimeMSG("---RegressionTest3:test013");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test013");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getPositiveItemLabelPositionFallback();
        double double3 = barRenderer0.getMaximumBarWidth();
        java.awt.Shape shape4 = barRenderer0.getBaseShape();
        barRenderer0.setItemMargin((double) 0.0f);
        barRenderer0.setAutoPopulateSeriesStroke(true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(itemLabelPosition2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(shape4);
    }

    @Test
    public void test014() throws Throwable {
printRuntimeMSG("---RegressionTest3:test014");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test014");
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
        java.awt.Color color27 = java.awt.Color.yellow;
        boolean boolean28 = keyedObjects0.equals((java.lang.Object) color27);
        keyedObjects0.clear();
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(color27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test015() throws Throwable {
printRuntimeMSG("---RegressionTest3:test015");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test015");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        java.util.List list3 = keyedObjects2D0.getColumnKeys();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean8 = lineAndShapeRenderer6.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean9 = lineAndShapeRenderer6.getBaseLinesVisible();
        lineAndShapeRenderer6.setAutoPopulateSeriesPaint(false);
        boolean boolean12 = lineAndShapeRenderer6.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator13 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        lineAndShapeRenderer6.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator13);
        java.lang.Object obj15 = standardCategorySeriesLabelGenerator13.clone();
        boolean boolean16 = keyedObjects2D0.equals(obj15);
        java.lang.Object obj17 = keyedObjects2D0.clone();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test016() throws Throwable {
printRuntimeMSG("---RegressionTest3:test016");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test016");
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
        int int25 = lineAndShapeRenderer10.getPassCount();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(renderAttributes24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test017() throws Throwable {
printRuntimeMSG("---RegressionTest3:test017");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test017");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        barRenderer0.setBaseItemLabelsVisible(false);
        double double5 = barRenderer0.getItemMargin();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = barRenderer0.getBaseNegativeItemLabelPosition();
        barRenderer0.setBaseCreateEntities(false);
        java.awt.Color color9 = java.awt.Color.GREEN;
        barRenderer0.setShadowPaint((java.awt.Paint) color9);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = null;
        lineAndShapeRenderer14.setSeriesPositiveItemLabelPosition(0, itemLabelPosition16);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition19 = lineAndShapeRenderer14.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean20 = lineAndShapeRenderer14.getUseFillPaint();
        lineAndShapeRenderer14.setDataBoundsIncludesVisibleSeriesOnly(true);
        java.awt.Stroke stroke23 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        lineAndShapeRenderer14.setBaseStroke(stroke23, false);
        org.jfree.chart.util.ShapeList shapeList26 = new org.jfree.chart.util.ShapeList();
        org.jfree.chart.util.StrokeList strokeList27 = new org.jfree.chart.util.StrokeList();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer30 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator31 = lineAndShapeRenderer30.getBaseItemLabelGenerator();
        java.awt.Paint paint33 = lineAndShapeRenderer30.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator35 = lineAndShapeRenderer30.getSeriesURLGenerator(0);
        boolean boolean36 = strokeList27.equals((java.lang.Object) categoryURLGenerator35);
        java.awt.Stroke stroke38 = strokeList27.getStroke((-12566464));
        strokeList27.clear();
        org.jfree.chart.plot.CategoryPlot categoryPlot41 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke42 = categoryPlot41.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke44 = categoryPlot43.getRangeMinorGridlineStroke();
        categoryPlot41.setParent((org.jfree.chart.plot.Plot) categoryPlot43);
        org.jfree.chart.LegendItemCollection legendItemCollection46 = categoryPlot41.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent47 = null;
        categoryPlot41.axisChanged(axisChangeEvent47);
        org.jfree.chart.axis.AxisSpace axisSpace49 = categoryPlot41.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset50 = null;
        categoryPlot41.setDataset(categoryDataset50);
        java.awt.Stroke stroke52 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot41.setDomainCrosshairStroke(stroke52);
        java.awt.Stroke stroke54 = categoryPlot41.getRangeGridlineStroke();
        strokeList27.setStroke((int) '#', stroke54);
        boolean boolean56 = shapeList26.equals((java.lang.Object) '#');
        org.jfree.chart.renderer.RenderAttributes renderAttributes62 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer66 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean68 = lineAndShapeRenderer66.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean69 = lineAndShapeRenderer66.getBaseLinesVisible();
        java.awt.Shape shape70 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer66.setBaseLegendShape(shape70);
        renderAttributes62.setSeriesShape((int) ' ', shape70);
        org.jfree.chart.entity.ChartEntity chartEntity74 = new org.jfree.chart.entity.ChartEntity(shape70, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint75 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color77 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem78 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color77);
        java.lang.String str79 = legendItem78.getToolTipText();
        java.awt.Stroke stroke80 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem78.setOutlineStroke(stroke80);
        java.awt.Shape shape86 = null;
        java.awt.Color color87 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke88 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color89 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem90 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape86, (java.awt.Paint) color87, stroke88, (java.awt.Paint) color89);
        java.lang.Class<?> wildcardClass91 = color87.getClass();
        org.jfree.chart.LegendItem legendItem92 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape70, paint75, stroke80, (java.awt.Paint) color87);
        org.jfree.chart.entity.ChartEntity chartEntity93 = new org.jfree.chart.entity.ChartEntity(shape70);
        shapeList26.setShape(1, shape70);
        lineAndShapeRenderer14.setBaseShape(shape70);
        org.jfree.chart.entity.ChartEntity chartEntity97 = new org.jfree.chart.entity.ChartEntity(shape70, "");
        barRenderer0.setSeriesShape(1, shape70);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(itemLabelPosition6);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNotNull(itemLabelPosition19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(categoryItemLabelGenerator31);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertNull(categoryURLGenerator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(stroke38);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNull(legendItemCollection46);
        org.junit.Assert.assertNull(axisSpace49);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(boolean68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(shape70);
        org.junit.Assert.assertNotNull(paint75);
        org.junit.Assert.assertNotNull(color77);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(stroke80);
        org.junit.Assert.assertNotNull(color87);
        org.junit.Assert.assertNotNull(stroke88);
        org.junit.Assert.assertNotNull(color89);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test018() throws Throwable {
printRuntimeMSG("---RegressionTest3:test018");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test018");
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
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator17 = lineAndShapeRenderer2.getBaseURLGenerator();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertNull(categoryURLGenerator17);
    }

    @Test
    public void test019() throws Throwable {
printRuntimeMSG("---RegressionTest3:test019");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test019");
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
        int int29 = keyedObjects0.getIndex((java.lang.Comparable) 0.0d);
        java.lang.Object obj30 = keyedObjects0.clone();
        try {
            keyedObjects0.removeValue(175);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 175, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test020() throws Throwable {
printRuntimeMSG("---RegressionTest3:test020");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test020");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer2.getNegativeItemLabelPosition(0, 0, true);
        boolean boolean12 = lineAndShapeRenderer2.getBaseShapesVisible();
        int int13 = lineAndShapeRenderer2.getPassCount();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator15 = null;
        lineAndShapeRenderer2.setSeriesURLGenerator((int) (byte) 100, categoryURLGenerator15);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test021() throws Throwable {
printRuntimeMSG("---RegressionTest3:test021");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test021");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        categoryPlot0.setNoDataMessage("");
        org.jfree.chart.plot.Marker marker6 = null;
        org.jfree.chart.util.Layer layer7 = null;
        boolean boolean8 = categoryPlot0.removeDomainMarker(marker6, layer7);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test022() throws Throwable {
printRuntimeMSG("---RegressionTest3:test022");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test022");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition2 = barRenderer0.getPositiveItemLabelPositionFallback();
        double double3 = barRenderer0.getMaximumBarWidth();
        java.awt.Shape shape4 = barRenderer0.getBaseShape();
        barRenderer0.setItemMargin((double) 0.0f);
        barRenderer0.setMaximumBarWidth((double) 2.0f);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator9 = barRenderer0.getBaseToolTipGenerator();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertNull(itemLabelPosition2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(shape4);
        org.junit.Assert.assertNull(categoryToolTipGenerator9);
    }

    @Test
    public void test023() throws Throwable {
printRuntimeMSG("---RegressionTest3:test023");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test023");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setCategoryMargin((double) 10.0f);
        java.awt.Stroke stroke3 = categoryAxis0.getAxisLineStroke();
        categoryAxis0.clearCategoryLabelToolTips();
        java.awt.Paint paint5 = categoryAxis0.getTickLabelPaint();
        java.awt.Font font6 = categoryAxis0.getTickLabelFont();
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNotNull(font6);
    }

    @Test
    public void test024() throws Throwable {
printRuntimeMSG("---RegressionTest3:test024");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test024");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = categoryPlot2.getOrientation();
        categoryPlot2.setNoDataMessage("TextAnchor.HALF_ASCENT_LEFT");
        java.awt.Paint paint11 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray12 = new java.awt.Paint[] { paint11 };
        java.awt.Color color13 = java.awt.Color.BLUE;
        java.awt.Color color14 = java.awt.Color.RED;
        java.awt.Paint paint15 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray16 = new java.awt.Paint[] { color13, color14, paint15 };
        java.awt.Color color17 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel18 = null;
        java.awt.Rectangle rectangle19 = null;
        java.awt.geom.Rectangle2D rectangle2D20 = null;
        java.awt.geom.AffineTransform affineTransform21 = null;
        java.awt.RenderingHints renderingHints22 = null;
        java.awt.PaintContext paintContext23 = color17.createContext(colorModel18, rectangle19, rectangle2D20, affineTransform21, renderingHints22);
        java.awt.Color color24 = java.awt.Color.WHITE;
        java.awt.Color color25 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel26 = null;
        java.awt.Rectangle rectangle27 = null;
        java.awt.geom.Rectangle2D rectangle2D28 = null;
        java.awt.geom.AffineTransform affineTransform29 = null;
        java.awt.RenderingHints renderingHints30 = null;
        java.awt.PaintContext paintContext31 = color25.createContext(colorModel26, rectangle27, rectangle2D28, affineTransform29, renderingHints30);
        java.awt.Color color32 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray33 = new java.awt.Paint[] { color17, color24, color25, color32 };
        java.awt.Stroke stroke34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke35 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke36 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray39 = new java.awt.Stroke[] { stroke34, stroke35, stroke36, stroke37, stroke38 };
        java.awt.Stroke stroke40 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke43 = categoryPlot42.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray44 = new java.awt.Stroke[] { stroke40, stroke41, stroke43 };
        java.awt.Shape shape45 = null;
        java.awt.Shape[] shapeArray46 = new java.awt.Shape[] { shape45 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier47 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray12, paintArray16, paintArray33, strokeArray39, strokeArray44, shapeArray46);
        java.awt.Shape shape48 = defaultDrawingSupplier47.getNextShape();
        java.awt.Stroke stroke49 = defaultDrawingSupplier47.getNextOutlineStroke();
        java.awt.Stroke stroke50 = defaultDrawingSupplier47.getNextOutlineStroke();
        categoryPlot2.setRangeCrosshairStroke(stroke50);
        java.awt.Stroke stroke52 = categoryPlot2.getRangeCrosshairStroke();
        java.awt.Stroke stroke53 = categoryPlot2.getRangeZeroBaselineStroke();
        renderAttributes1.setDefaultOutlineStroke(stroke53);
        java.awt.Shape shape57 = renderAttributes1.getItemShape((int) (byte) 100, 3);
        org.junit.Assert.assertNotNull(plotOrientation8);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(paintArray12);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertNotNull(paintArray16);
        org.junit.Assert.assertNotNull(color17);
        org.junit.Assert.assertNotNull(paintContext23);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(paintContext31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(paintArray33);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(strokeArray39);
        org.junit.Assert.assertNotNull(stroke40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke43);
        org.junit.Assert.assertNotNull(strokeArray44);
        org.junit.Assert.assertNotNull(shapeArray46);
        org.junit.Assert.assertNull(shape48);
        org.junit.Assert.assertNotNull(stroke49);
        org.junit.Assert.assertNotNull(stroke50);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNull(shape57);
    }

    @Test
    public void test025() throws Throwable {
printRuntimeMSG("---RegressionTest3:test025");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test025");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryAxis6.getLabelInsets();
        double double18 = rectangleInsets16.extendHeight((double) 175);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 181.0d + "'", double18 == 181.0d);
    }

    @Test
    public void test026() throws Throwable {
printRuntimeMSG("---RegressionTest3:test026");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test026");
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
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke23 = categoryPlot22.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        categoryPlot22.setRangeAxis(valueAxis24);
        org.jfree.chart.util.RectangleEdge rectangleEdge26 = categoryPlot22.getRangeAxisEdge();
        try {
            double double27 = categoryAxis6.getCategoryStart(0, 0, rectangle2D21, rectangleEdge26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(rectangleEdge26);
    }

    @Test
    public void test027() throws Throwable {
printRuntimeMSG("---RegressionTest3:test027");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test027");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        boolean boolean8 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor10 = itemLabelPosition9.getTextAnchor();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition9);
        org.junit.Assert.assertNotNull(textAnchor10);
    }

    @Test
    public void test028() throws Throwable {
printRuntimeMSG("---RegressionTest3:test028");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test028");
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
        java.lang.Object obj61 = plotEntity33.clone();
        java.lang.String str62 = plotEntity33.getToolTipText();
        boolean boolean64 = plotEntity33.equals((java.lang.Object) 0.0d);
        org.jfree.data.category.CategoryDataset categoryDataset65 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis66 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis66.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis69 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer72 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator73 = lineAndShapeRenderer72.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot74 = new org.jfree.chart.plot.CategoryPlot(categoryDataset65, categoryAxis66, valueAxis69, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer72);
        boolean boolean75 = categoryAxis66.isTickLabelsVisible();
        double double76 = categoryAxis66.getFixedDimension();
        java.lang.Object obj77 = categoryAxis66.clone();
        org.jfree.chart.util.RectangleInsets rectangleInsets78 = categoryAxis66.getLabelInsets();
        boolean boolean79 = plotEntity33.equals((java.lang.Object) rectangleInsets78);
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
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
        org.junit.Assert.assertNotNull(obj77);
        org.junit.Assert.assertNotNull(rectangleInsets78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test029() throws Throwable {
printRuntimeMSG("---RegressionTest3:test029");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test029");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        barRenderer0.setBaseItemLabelsVisible(false);
        double double5 = barRenderer0.getItemMargin();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator6 = barRenderer0.getBaseURLGenerator();
        boolean boolean7 = barRenderer0.getIncludeBaseInRange();
        java.awt.Shape shape9 = barRenderer0.getSeriesShape((int) (byte) 10);
        barRenderer0.setShadowXOffset((double) (byte) -1);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNull(categoryURLGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(shape9);
    }

    @Test
    public void test030() throws Throwable {
printRuntimeMSG("---RegressionTest3:test030");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test030");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D3 = null;
        java.awt.geom.Rectangle2D rectangle2D4 = null;
        categoryPlot0.drawBackgroundImage(graphics2D3, rectangle2D4);
        categoryPlot0.clearAnnotations();
        categoryPlot0.configureDomainAxes();
        org.jfree.chart.plot.Marker marker9 = null;
        org.jfree.chart.util.Layer layer10 = null;
        try {
            categoryPlot0.addRangeMarker(8, marker9, layer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test031() throws Throwable {
printRuntimeMSG("---RegressionTest3:test031");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test031");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D7, rectangle2D8, 0, plotRenderingInfo10, categoryCrosshairState11);
        boolean boolean13 = categoryPlot0.isDomainCrosshairVisible();
        int int14 = categoryPlot0.getWeight();
        java.awt.Paint paint15 = categoryPlot0.getRangeZeroBaselinePaint();
        float float16 = categoryPlot0.getBackgroundImageAlpha();
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator17 = new org.jfree.chart.util.DefaultShadowGenerator();
        float float18 = defaultShadowGenerator17.getShadowOpacity();
        double double19 = defaultShadowGenerator17.getAngle();
        double double20 = defaultShadowGenerator17.getAngle();
        float float21 = defaultShadowGenerator17.getShadowOpacity();
        float float22 = defaultShadowGenerator17.getShadowOpacity();
        categoryPlot0.setShadowGenerator((org.jfree.chart.util.ShadowGenerator) defaultShadowGenerator17);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-0.7853981633974483d) + "'", double19 == (-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-0.7853981633974483d) + "'", double20 == (-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.5f + "'", float22 == 0.5f);
    }

    @Test
    public void test032() throws Throwable {
printRuntimeMSG("---RegressionTest3:test032");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test032");
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
        java.awt.Color color12 = java.awt.Color.gray;
        categoryAxis8.setTickLabelPaint((java.awt.Paint) color12);
        int int14 = categoryAxis8.getCategoryLabelPositionOffset();
        categoryAxis8.setTickLabelsVisible(true);
        java.awt.Paint paint17 = categoryAxis8.getLabelPaint();
        java.lang.String str18 = categoryAxis8.getLabelToolTip();
        java.awt.Stroke stroke19 = categoryAxis8.getTickMarkStroke();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(stroke19);
    }

    @Test
    public void test033() throws Throwable {
printRuntimeMSG("---RegressionTest3:test033");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test033");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        boolean boolean8 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        boolean boolean9 = lineAndShapeRenderer2.getBaseCreateEntities();
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(true);
        int int12 = lineAndShapeRenderer2.getDefaultEntityRadius();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test034() throws Throwable {
printRuntimeMSG("---RegressionTest3:test034");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test034");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke17 = categoryPlot16.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer18 = null;
        categoryPlot16.setRenderer(categoryItemRenderer18);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent20 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot16);
        org.jfree.data.category.CategoryDataset categoryDataset21 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis22 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis22.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis25 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator29 = lineAndShapeRenderer28.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot(categoryDataset21, categoryAxis22, valueAxis25, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer28);
        java.util.List list31 = categoryPlot16.getCategoriesForAxis(categoryAxis22);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.util.RectangleInsets.ZERO_INSETS;
        categoryAxis22.setLabelInsets(rectangleInsets32, true);
        categoryAxis0.setLabelInsets(rectangleInsets32);
        float float36 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertNotNull(stroke17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator29);
        org.junit.Assert.assertNotNull(list31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 0.0f + "'", float36 == 0.0f);
    }

    @Test
    public void test035() throws Throwable {
printRuntimeMSG("---RegressionTest3:test035");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test035");
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
        barRenderer0.setShadowYOffset(0.0d);
        barRenderer0.setBase((double) '#');
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(shape11);
    }

    @Test
    public void test036() throws Throwable {
printRuntimeMSG("---RegressionTest3:test036");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test036");
        org.jfree.data.category.CategoryDataset categoryDataset1 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis2 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis2.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis5 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer8 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator9 = lineAndShapeRenderer8.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot(categoryDataset1, categoryAxis2, valueAxis5, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer8);
        boolean boolean11 = categoryAxis2.isTickLabelsVisible();
        categoryAxis2.setLowerMargin((double) 5);
        java.awt.Shape shape18 = null;
        java.awt.Color color19 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color21 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem22 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape18, (java.awt.Paint) color19, stroke20, (java.awt.Paint) color21);
        categoryAxis2.setLabelPaint((java.awt.Paint) color21);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator27 = new org.jfree.chart.util.DefaultShadowGenerator((int) '4', color21, (float) (-12566464), 200, (double) (-12566464));
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(color21);
    }

    @Test
    public void test037() throws Throwable {
printRuntimeMSG("---RegressionTest3:test037");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test037");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        java.awt.Color color3 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem4 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color3);
        java.lang.String str5 = legendItem4.getToolTipText();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem4.setOutlineStroke(stroke6);
        legendItem1.setOutlineStroke(stroke6);
        java.awt.Stroke stroke9 = legendItem1.getLineStroke();
        java.awt.Shape shape10 = legendItem1.getLine();
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(shape10);
    }

    @Test
    public void test038() throws Throwable {
printRuntimeMSG("---RegressionTest3:test038");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test038");
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
        java.awt.Font font15 = barRenderer0.getLegendTextFont(128);
        java.awt.Paint paint16 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        barRenderer0.setShadowPaint(paint16);
        org.jfree.chart.plot.CategoryPlot categoryPlot18 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke19 = categoryPlot18.getRangeMinorGridlineStroke();
        categoryPlot18.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation22 = categoryPlot18.getOrientation();
        org.jfree.chart.renderer.category.BarRenderer barRenderer24 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint25 = barRenderer24.getShadowPaint();
        boolean boolean26 = barRenderer24.getBaseSeriesVisible();
        categoryPlot18.setRenderer((int) (short) 100, (org.jfree.chart.renderer.category.CategoryItemRenderer) barRenderer24);
        double double28 = barRenderer24.getShadowXOffset();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator33 = lineAndShapeRenderer32.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator37 = lineAndShapeRenderer32.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer32.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        lineAndShapeRenderer32.setBaseOutlinePaint(paint41);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = lineAndShapeRenderer32.getNegativeItemLabelPosition((int) (byte) 10, (int) (short) 100, true);
        barRenderer24.setSeriesNegativeItemLabelPosition(0, itemLabelPosition46);
        barRenderer0.setBasePositiveItemLabelPosition(itemLabelPosition46, false);
        org.jfree.chart.plot.CategoryPlot categoryPlot50 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke51 = categoryPlot50.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer52 = null;
        categoryPlot50.setRenderer(categoryItemRenderer52);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent54 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot50);
        categoryPlot50.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent57 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot50);
        java.awt.Color color58 = org.jfree.chart.ChartColor.LIGHT_YELLOW;
        java.awt.Color color59 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.Color color60 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.color.ColorSpace colorSpace61 = color60.getColorSpace();
        float[] floatArray68 = new float[] { 100.0f, (-8355712), 'a', 'a', (-1), (short) 1 };
        float[] floatArray69 = color59.getColorComponents(colorSpace61, floatArray68);
        float[] floatArray70 = color58.getComponents(floatArray68);
        categoryPlot50.setBackgroundPaint((java.awt.Paint) color58);
        barRenderer0.addChangeListener((org.jfree.chart.event.RendererChangeListener) categoryPlot50);
        org.jfree.chart.util.RectangleInsets rectangleInsets73 = categoryPlot50.getAxisOffset();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(font15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(plotOrientation22);
        org.junit.Assert.assertNotNull(paint25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 4.0d + "'", double28 == 4.0d);
        org.junit.Assert.assertNull(categoryItemLabelGenerator33);
        org.junit.Assert.assertNull(categoryToolTipGenerator37);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(itemLabelPosition46);
        org.junit.Assert.assertNotNull(stroke51);
        org.junit.Assert.assertNotNull(color58);
        org.junit.Assert.assertNotNull(color59);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertNotNull(colorSpace61);
        org.junit.Assert.assertNotNull(floatArray68);
        org.junit.Assert.assertNotNull(floatArray69);
        org.junit.Assert.assertNotNull(floatArray70);
        org.junit.Assert.assertNotNull(rectangleInsets73);
    }

    @Test
    public void test039() throws Throwable {
printRuntimeMSG("---RegressionTest3:test039");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test039");
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
        org.jfree.data.category.CategoryDataset categoryDataset16 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis17.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis20 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer23 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator24 = lineAndShapeRenderer23.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot25 = new org.jfree.chart.plot.CategoryPlot(categoryDataset16, categoryAxis17, valueAxis20, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer23);
        categoryAxis17.setVisible(false);
        java.lang.String str29 = categoryAxis17.getCategoryLabelToolTip((java.lang.Comparable) 0);
        org.jfree.chart.axis.CategoryLabelPositions categoryLabelPositions30 = categoryAxis17.getCategoryLabelPositions();
        categoryAxis17.setAxisLineVisible(false);
        org.jfree.chart.util.RectangleInsets rectangleInsets33 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str34 = rectangleInsets33.toString();
        double double35 = rectangleInsets33.getTop();
        categoryAxis17.setTickLabelInsets(rectangleInsets33);
        categoryAxis1.setTickLabelInsets(rectangleInsets33);
        categoryAxis1.setFixedDimension(0.0d);
        org.jfree.data.KeyedObjects keyedObjects41 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.RenderAttributes renderAttributes44 = new org.jfree.chart.renderer.RenderAttributes(true);
        keyedObjects41.setObject((java.lang.Comparable) true, (java.lang.Object) true);
        org.jfree.chart.plot.CategoryPlot categoryPlot46 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke47 = categoryPlot46.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation48 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation49 = axisLocation48.getOpposite();
        categoryPlot46.setDomainAxisLocation(axisLocation49, false);
        boolean boolean52 = categoryPlot46.canSelectByRegion();
        categoryPlot46.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot55 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo58 = null;
        java.awt.geom.Point2D point2D59 = null;
        categoryPlot55.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo58, point2D59);
        categoryPlot55.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder63 = categoryPlot55.getRowRenderingOrder();
        categoryPlot46.setRowRenderingOrder(sortOrder63);
        boolean boolean66 = sortOrder63.equals((java.lang.Object) 4);
        keyedObjects41.sortByObjects(sortOrder63);
        java.awt.Color color68 = java.awt.Color.yellow;
        boolean boolean69 = keyedObjects41.equals((java.lang.Object) color68);
        java.awt.color.ColorSpace colorSpace70 = color68.getColorSpace();
        categoryAxis1.setTickLabelPaint((java.lang.Comparable) 3.0d, (java.awt.Paint) color68);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(categoryLabelPositions30);
        org.junit.Assert.assertNotNull(rectangleInsets33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str34.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2.0d + "'", double35 == 2.0d);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(axisLocation48);
        org.junit.Assert.assertNotNull(axisLocation49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(sortOrder63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(colorSpace70);
    }

    @Test
    public void test040() throws Throwable {
printRuntimeMSG("---RegressionTest3:test040");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test040");
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
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        boolean boolean20 = categoryPlot0.removeDomainMarker((int) (byte) 10, marker18, layer19);
        boolean boolean21 = categoryPlot0.isRangePannable();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(categoryDataset16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test041() throws Throwable {
printRuntimeMSG("---RegressionTest3:test041");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test041");
        org.jfree.chart.util.RectangleInsets rectangleInsets4 = new org.jfree.chart.util.RectangleInsets((double) 100.0f, 1.0d, (double) 0.5f, (double) (short) 1);
    }

    @Test
    public void test042() throws Throwable {
printRuntimeMSG("---RegressionTest3:test042");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test042");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        java.awt.Paint paint9 = legendItem8.getLabelPaint();
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer12 = legendItem11.getFillPaintTransformer();
        legendItem8.setFillPaintTransformer(gradientPaintTransformer12);
        java.lang.String str14 = legendItem8.getURLText();
        legendItem8.setLineVisible(false);
        legendItem8.setSeriesKey((java.lang.Comparable) "ItemLabelAnchor.INSIDE4");
        int int19 = legendItem8.getSeriesIndex();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(gradientPaintTransformer12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str14.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test043() throws Throwable {
printRuntimeMSG("---RegressionTest3:test043");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test043");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        float float3 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        org.jfree.chart.plot.CategoryPlot categoryPlot5 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke6 = categoryPlot5.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke8 = categoryPlot7.getRangeMinorGridlineStroke();
        categoryPlot5.setParent((org.jfree.chart.plot.Plot) categoryPlot7);
        org.jfree.chart.LegendItemCollection legendItemCollection10 = categoryPlot5.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier11 = categoryPlot5.getDrawingSupplier();
        java.awt.Stroke stroke12 = categoryPlot5.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis13 = new org.jfree.chart.axis.CategoryAxis();
        java.util.List list14 = categoryPlot5.getCategoriesForAxis(categoryAxis13);
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor16 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE4;
        org.jfree.chart.axis.AxisLocation axisLocation17 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation18 = axisLocation17.getOpposite();
        boolean boolean19 = itemLabelAnchor16.equals((java.lang.Object) axisLocation17);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke21 = categoryPlot20.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke23 = categoryPlot22.getRangeMinorGridlineStroke();
        categoryPlot20.setParent((org.jfree.chart.plot.Plot) categoryPlot22);
        org.jfree.chart.LegendItemCollection legendItemCollection25 = categoryPlot20.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent26 = null;
        categoryPlot20.axisChanged(axisChangeEvent26);
        org.jfree.chart.axis.AxisSpace axisSpace28 = categoryPlot20.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        categoryPlot20.setDataset(categoryDataset29);
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot20.setDomainCrosshairStroke(stroke31);
        java.awt.Stroke stroke33 = categoryPlot20.getRangeGridlineStroke();
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent34 = null;
        categoryPlot20.annotationChanged(annotationChangeEvent34);
        org.jfree.chart.plot.CategoryPlot categoryPlot36 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation37 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        categoryPlot36.setOrientation(plotOrientation37);
        categoryPlot20.setOrientation(plotOrientation37);
        org.jfree.chart.util.RectangleEdge rectangleEdge40 = org.jfree.chart.plot.Plot.resolveDomainAxisLocation(axisLocation17, plotOrientation37);
        try {
            double double41 = categoryAxis0.getCategoryMiddle((java.lang.Comparable) (-1.0d), list14, rectangle2D15, rectangleEdge40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid category index: -1");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(legendItemCollection10);
        org.junit.Assert.assertNotNull(drawingSupplier11);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(itemLabelAnchor16);
        org.junit.Assert.assertNotNull(axisLocation17);
        org.junit.Assert.assertNotNull(axisLocation18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(legendItemCollection25);
        org.junit.Assert.assertNull(axisSpace28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(plotOrientation37);
        org.junit.Assert.assertNotNull(rectangleEdge40);
    }

    @Test
    public void test044() throws Throwable {
printRuntimeMSG("---RegressionTest3:test044");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test044");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint3 = renderAttributes0.getItemOutlinePaint(1, (int) 'a');
        java.awt.Shape shape5 = renderAttributes0.getSeriesShape((int) (short) 0);
        java.awt.Paint paint7 = renderAttributes0.getSeriesPaint((int) ' ');
        java.awt.Paint paint10 = renderAttributes0.getItemOutlinePaint(200, (-16777216));
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(paint10);
    }

    @Test
    public void test045() throws Throwable {
printRuntimeMSG("---RegressionTest3:test045");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test045");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        java.util.List list3 = keyedObjects2D0.getColumnKeys();
        java.lang.Object obj4 = null;
        boolean boolean5 = keyedObjects2D0.equals(obj4);
        org.jfree.chart.plot.CategoryPlot categoryPlot6 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke7 = categoryPlot6.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer8 = null;
        categoryPlot6.setRenderer(categoryItemRenderer8);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent10 = null;
        categoryPlot6.datasetChanged(datasetChangeEvent10);
        java.awt.Paint paint12 = org.jfree.chart.axis.Axis.DEFAULT_TICK_MARK_PAINT;
        java.awt.Paint[] paintArray13 = new java.awt.Paint[] { paint12 };
        java.awt.Color color14 = java.awt.Color.BLUE;
        java.awt.Color color15 = java.awt.Color.RED;
        java.awt.Paint paint16 = org.jfree.chart.plot.CategoryPlot.DEFAULT_GRIDLINE_PAINT;
        java.awt.Paint[] paintArray17 = new java.awt.Paint[] { color14, color15, paint16 };
        java.awt.Color color18 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel19 = null;
        java.awt.Rectangle rectangle20 = null;
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        java.awt.geom.AffineTransform affineTransform22 = null;
        java.awt.RenderingHints renderingHints23 = null;
        java.awt.PaintContext paintContext24 = color18.createContext(colorModel19, rectangle20, rectangle2D21, affineTransform22, renderingHints23);
        java.awt.Color color25 = java.awt.Color.WHITE;
        java.awt.Color color26 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel27 = null;
        java.awt.Rectangle rectangle28 = null;
        java.awt.geom.Rectangle2D rectangle2D29 = null;
        java.awt.geom.AffineTransform affineTransform30 = null;
        java.awt.RenderingHints renderingHints31 = null;
        java.awt.PaintContext paintContext32 = color26.createContext(colorModel27, rectangle28, rectangle2D29, affineTransform30, renderingHints31);
        java.awt.Color color33 = org.jfree.chart.ChartColor.LIGHT_RED;
        java.awt.Paint[] paintArray34 = new java.awt.Paint[] { color18, color25, color26, color33 };
        java.awt.Stroke stroke35 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke36 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LINE_STROKE;
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke[] strokeArray40 = new java.awt.Stroke[] { stroke35, stroke36, stroke37, stroke38, stroke39 };
        java.awt.Stroke stroke41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Stroke stroke42 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        org.jfree.chart.plot.CategoryPlot categoryPlot43 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke44 = categoryPlot43.getRangeMinorGridlineStroke();
        java.awt.Stroke[] strokeArray45 = new java.awt.Stroke[] { stroke41, stroke42, stroke44 };
        java.awt.Shape shape46 = null;
        java.awt.Shape[] shapeArray47 = new java.awt.Shape[] { shape46 };
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier48 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray13, paintArray17, paintArray34, strokeArray40, strokeArray45, shapeArray47);
        java.awt.Paint paint49 = defaultDrawingSupplier48.getNextOutlinePaint();
        java.lang.Object obj50 = defaultDrawingSupplier48.clone();
        java.awt.Paint paint51 = defaultDrawingSupplier48.getNextOutlinePaint();
        categoryPlot6.setDrawingSupplier((org.jfree.chart.plot.DrawingSupplier) defaultDrawingSupplier48);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo54 = null;
        java.awt.geom.Point2D point2D55 = null;
        categoryPlot6.panDomainAxes((double) 0, plotRenderingInfo54, point2D55);
        java.awt.Color color57 = org.jfree.chart.ChartColor.DARK_RED;
        categoryPlot6.setRangeZeroBaselinePaint((java.awt.Paint) color57);
        java.awt.Stroke stroke59 = categoryPlot6.getRangeMinorGridlineStroke();
        boolean boolean60 = keyedObjects2D0.equals((java.lang.Object) stroke59);
        try {
            java.lang.Comparable comparable62 = keyedObjects2D0.getColumnKey((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 100, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(paint12);
        org.junit.Assert.assertNotNull(paintArray13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paintArray17);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(paintContext24);
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNotNull(paintContext32);
        org.junit.Assert.assertNotNull(color33);
        org.junit.Assert.assertNotNull(paintArray34);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(strokeArray40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(stroke44);
        org.junit.Assert.assertNotNull(strokeArray45);
        org.junit.Assert.assertNotNull(shapeArray47);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertNotNull(color57);
        org.junit.Assert.assertNotNull(stroke59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test046() throws Throwable {
printRuntimeMSG("---RegressionTest3:test046");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test046");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
        java.awt.Stroke stroke2 = renderAttributes1.getDefaultOutlineStroke();
        java.awt.Shape shape5 = renderAttributes1.getItemShape((int) (byte) 1, (int) (byte) 1);
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
        renderAttributes1.setDefaultShape(shape18);
        org.junit.Assert.assertNull(stroke2);
        org.junit.Assert.assertNull(shape5);
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
    }

    @Test
    public void test047() throws Throwable {
printRuntimeMSG("---RegressionTest3:test047");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test047");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        java.awt.Paint paint9 = legendItem8.getLabelPaint();
        java.lang.String str10 = legendItem8.getURLText();
        java.awt.Shape shape11 = legendItem8.getShape();
        boolean boolean12 = legendItem8.isShapeOutlineVisible();
        legendItem8.setDatasetIndex((int) '4');
        boolean boolean15 = legendItem8.isLineVisible();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str10.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test048() throws Throwable {
printRuntimeMSG("---RegressionTest3:test048");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test048");
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
        lineAndShapeRenderer7.setBaseShapesFilled(false);
        lineAndShapeRenderer7.setUseOutlinePaint(false);
        java.awt.Paint paint25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_VALUE_LABEL_PAINT;
        lineAndShapeRenderer7.setSeriesPaint(0, paint25);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(paint25);
    }

    @Test
    public void test049() throws Throwable {
printRuntimeMSG("---RegressionTest3:test049");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test049");
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
        double double12 = rectangleInsets7.calculateRightInset((-1.0d));
        double double13 = rectangleInsets7.getBottom();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(rectangleEdge4);
        org.junit.Assert.assertNotNull(axisLocation6);
        org.junit.Assert.assertNotNull(rectangleInsets7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str8.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 4.0d + "'", double12 == 4.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 2.0d + "'", double13 == 2.0d);
    }

    @Test
    public void test050() throws Throwable {
printRuntimeMSG("---RegressionTest3:test050");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test050");
        org.jfree.chart.util.UnitType unitType0 = org.jfree.chart.util.UnitType.ABSOLUTE;
        org.jfree.chart.plot.CategoryPlot categoryPlot1 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke2 = categoryPlot1.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot3 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke4 = categoryPlot3.getRangeMinorGridlineStroke();
        categoryPlot1.setParent((org.jfree.chart.plot.Plot) categoryPlot3);
        org.jfree.chart.LegendItemCollection legendItemCollection6 = categoryPlot1.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier7 = categoryPlot1.getDrawingSupplier();
        java.awt.Stroke stroke8 = categoryPlot1.getOutlineStroke();
        boolean boolean9 = unitType0.equals((java.lang.Object) categoryPlot1);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo12 = null;
        java.awt.geom.Point2D point2D13 = null;
        categoryPlot1.zoomRangeAxes(0.0d, (double) (byte) -1, plotRenderingInfo12, point2D13);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean19 = lineAndShapeRenderer17.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean20 = lineAndShapeRenderer17.getBaseLinesVisible();
        java.awt.Shape shape21 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer17.setBaseLegendShape(shape21);
        java.awt.Color color23 = org.jfree.chart.ChartColor.LIGHT_MAGENTA;
        lineAndShapeRenderer17.setBaseOutlinePaint((java.awt.Paint) color23, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer28 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = null;
        lineAndShapeRenderer28.setSeriesPositiveItemLabelPosition(0, itemLabelPosition30);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition33 = lineAndShapeRenderer28.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean34 = lineAndShapeRenderer28.getUseFillPaint();
        lineAndShapeRenderer28.setDataBoundsIncludesVisibleSeriesOnly(true);
        java.awt.Stroke stroke37 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        lineAndShapeRenderer28.setBaseStroke(stroke37, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray40 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { lineAndShapeRenderer17, lineAndShapeRenderer28 };
        categoryPlot1.setRenderers(categoryItemRendererArray40);
        org.jfree.chart.axis.ValueAxis valueAxis43 = null;
        categoryPlot1.setRangeAxis(0, valueAxis43);
        org.jfree.chart.axis.AxisLocation axisLocation46 = categoryPlot1.getRangeAxisLocation(0);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer47 = categoryPlot1.getRenderer();
        org.junit.Assert.assertNotNull(unitType0);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(legendItemCollection6);
        org.junit.Assert.assertNotNull(drawingSupplier7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(color23);
        org.junit.Assert.assertNotNull(itemLabelPosition33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stroke37);
        org.junit.Assert.assertNotNull(categoryItemRendererArray40);
        org.junit.Assert.assertNotNull(axisLocation46);
        org.junit.Assert.assertNotNull(categoryItemRenderer47);
    }

    @Test
    public void test051() throws Throwable {
printRuntimeMSG("---RegressionTest3:test051");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test051");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        categoryPlot2.setDomainCrosshairColumnKey((java.lang.Comparable) (-1L), true);
        org.jfree.chart.axis.AxisLocation axisLocation9 = categoryPlot2.getDomainAxisLocation(0);
        categoryPlot2.setRangeCrosshairValue(96.0d, true);
        categoryPlot2.setRangeZeroBaselineVisible(true);
        categoryPlot2.setDomainGridlinesVisible(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(axisLocation9);
    }

    @Test
    public void test052() throws Throwable {
printRuntimeMSG("---RegressionTest3:test052");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test052");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        categoryAxis0.setLabel("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        boolean boolean5 = categoryAxis0.isTickMarksVisible();
        categoryAxis0.setTickMarkInsideLength(2.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test053() throws Throwable {
printRuntimeMSG("---RegressionTest3:test053");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test053");
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
        boolean boolean38 = lineAndShapeRenderer2.getItemCreateEntity((int) (byte) 10, 200, false);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test054() throws Throwable {
printRuntimeMSG("---RegressionTest3:test054");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test054");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint2 = categoryAxis1.getTickLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets3 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double4 = rectangleInsets3.getRight();
        double double6 = rectangleInsets3.calculateTopInset(0.0d);
        categoryAxis1.setLabelInsets(rectangleInsets3, false);
        org.jfree.chart.axis.ValueAxis valueAxis9 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation12 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation13 = axisLocation12.getOpposite();
        categoryPlot10.setDomainAxisLocation(axisLocation13, false);
        boolean boolean16 = categoryPlot10.canSelectByRegion();
        categoryPlot10.setForegroundAlpha((float) '#');
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = null;
        lineAndShapeRenderer22.setSeriesPositiveItemLabelPosition(0, itemLabelPosition24);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition27 = lineAndShapeRenderer22.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean28 = lineAndShapeRenderer22.getUseFillPaint();
        java.lang.Boolean boolean30 = lineAndShapeRenderer22.getSeriesItemLabelsVisible(0);
        categoryPlot10.setRenderer(3, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer22, false);
        java.lang.Boolean boolean34 = lineAndShapeRenderer22.getSeriesLinesVisible((-1));
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis9, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer22);
        categoryPlot35.setNoDataMessage("DatasetRenderingOrder.FORWARD");
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNotNull(rectangleInsets3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 4.0d + "'", double4 == 4.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(axisLocation12);
        org.junit.Assert.assertNotNull(axisLocation13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNull(boolean34);
    }

    @Test
    public void test055() throws Throwable {
printRuntimeMSG("---RegressionTest3:test055");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test055");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition(192);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator7 = lineAndShapeRenderer2.getLegendItemToolTipGenerator();
        org.jfree.chart.renderer.RenderAttributes renderAttributes8 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint10 = renderAttributes8.getSeriesPaint(10);
        java.awt.Shape shape13 = renderAttributes8.getItemShape((int) (short) 0, (int) (byte) -1);
        java.awt.Paint paint15 = renderAttributes8.getSeriesPaint(255);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean20 = lineAndShapeRenderer18.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean21 = lineAndShapeRenderer18.getBaseLinesVisible();
        lineAndShapeRenderer18.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer18.setAutoPopulateSeriesShape(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = null;
        lineAndShapeRenderer18.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator27, true);
        java.awt.Shape shape31 = lineAndShapeRenderer18.lookupSeriesShape((int) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke33 = categoryPlot32.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke35 = categoryPlot34.getRangeMinorGridlineStroke();
        categoryPlot32.setParent((org.jfree.chart.plot.Plot) categoryPlot34);
        org.jfree.chart.LegendItemCollection legendItemCollection37 = categoryPlot32.getFixedLegendItems();
        java.lang.Comparable comparable38 = categoryPlot32.getDomainCrosshairRowKey();
        org.jfree.chart.util.RectangleEdge rectangleEdge39 = categoryPlot32.getRangeAxisEdge();
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent40 = null;
        categoryPlot32.notifyListeners(plotChangeEvent40);
        boolean boolean42 = categoryPlot32.isOutlineVisible();
        java.awt.geom.GeneralPath generalPath43 = null;
        java.awt.geom.Rectangle2D rectangle2D44 = null;
        org.jfree.chart.RenderingSource renderingSource45 = null;
        categoryPlot32.select(generalPath43, rectangle2D44, renderingSource45);
        org.jfree.chart.util.ShadowGenerator shadowGenerator47 = null;
        categoryPlot32.setShadowGenerator(shadowGenerator47);
        org.jfree.chart.entity.PlotEntity plotEntity49 = new org.jfree.chart.entity.PlotEntity(shape31, (org.jfree.chart.plot.Plot) categoryPlot32);
        renderAttributes8.setDefaultShape(shape31);
        lineAndShapeRenderer2.setBaseShape(shape31, false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNull(categorySeriesLabelGenerator7);
        org.junit.Assert.assertNull(paint10);
        org.junit.Assert.assertNull(shape13);
        org.junit.Assert.assertNull(paint15);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(shape31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertNull(legendItemCollection37);
        org.junit.Assert.assertNull(comparable38);
        org.junit.Assert.assertNotNull(rectangleEdge39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test056() throws Throwable {
printRuntimeMSG("---RegressionTest3:test056");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test056");
        try {
            java.util.ResourceBundle resourceBundle1 = org.jfree.chart.util.ResourceBundleWrapper.getBundle("ChartChangeEventType.NEW_DATASET");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name ChartChangeEventType.NEW_DATASET, locale en_US");
        } catch (java.util.MissingResourceException e) {
        }
    }

    @Test
    public void test057() throws Throwable {
printRuntimeMSG("---RegressionTest3:test057");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test057");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.BarRenderer barRenderer6 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint7 = barRenderer6.getShadowPaint();
        boolean boolean8 = barRenderer6.getBaseSeriesVisible();
        categoryPlot0.setRenderer((int) (short) 100, (org.jfree.chart.renderer.category.CategoryItemRenderer) barRenderer6);
        categoryPlot0.setNoDataMessage("TextAnchor.BASELINE_RIGHT");
        java.awt.Paint paint12 = categoryPlot0.getNoDataMessagePaint();
        org.jfree.chart.axis.ValueAxis valueAxis14 = null;
        try {
            categoryPlot0.setRangeAxis((int) (byte) -1, valueAxis14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(paint12);
    }

    @Test
    public void test058() throws Throwable {
printRuntimeMSG("---RegressionTest3:test058");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test058");
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
        categoryPlot0.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test059() throws Throwable {
printRuntimeMSG("---RegressionTest3:test059");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test059");
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
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean34 = lineAndShapeRenderer32.getSeriesItemLabelsVisible((int) (short) 100);
        java.awt.Color color36 = org.jfree.chart.ChartColor.LIGHT_BLUE;
        lineAndShapeRenderer32.setSeriesPaint(0, (java.awt.Paint) color36);
        lineAndShapeRenderer32.setBaseSeriesVisible(true);
        try {
            keyedObjects0.insertValue((int) (byte) 10, (java.lang.Comparable) (short) -1, (java.lang.Object) lineAndShapeRenderer32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list27);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertNotNull(color36);
    }

    @Test
    public void test060() throws Throwable {
printRuntimeMSG("---RegressionTest3:test060");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test060");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(192);
    }

    @Test
    public void test061() throws Throwable {
printRuntimeMSG("---RegressionTest3:test061");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test061");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint2 = renderAttributes0.getSeriesPaint((int) (short) 0);
        java.awt.Paint paint3 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Stroke stroke4 = renderAttributes0.getDefaultOutlineStroke();
        java.awt.Paint paint7 = renderAttributes0.getItemOutlinePaint((int) (byte) -1, (-1));
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(paint7);
    }

    @Test
    public void test062() throws Throwable {
printRuntimeMSG("---RegressionTest3:test062");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test062");
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
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo27 = null;
        java.awt.geom.Point2D point2D28 = null;
        categoryPlot0.zoomDomainAxes((double) 10.0f, (double) (byte) -1, plotRenderingInfo27, point2D28);
        org.jfree.chart.axis.AxisLocation axisLocation31 = categoryPlot0.getRangeAxisLocation(15);
        org.jfree.chart.util.RectangleInsets rectangleInsets32 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double33 = rectangleInsets32.getRight();
        double double35 = rectangleInsets32.calculateTopInset(0.0d);
        double double37 = rectangleInsets32.calculateLeftOutset(0.0d);
        double double39 = rectangleInsets32.calculateTopOutset((double) 0L);
        categoryPlot0.setInsets(rectangleInsets32);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(axisLocation31);
        org.junit.Assert.assertNotNull(rectangleInsets32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 4.0d + "'", double33 == 4.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 2.0d + "'", double35 == 2.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 4.0d + "'", double37 == 4.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 2.0d + "'", double39 == 2.0d);
    }

    @Test
    public void test063() throws Throwable {
printRuntimeMSG("---RegressionTest3:test063");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test063");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Color color1 = java.awt.Color.CYAN;
        float[] floatArray2 = null;
        float[] floatArray3 = color1.getComponents(floatArray2);
        float[] floatArray4 = color0.getComponents(floatArray2);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertNotNull(floatArray4);
    }

    @Test
    public void test064() throws Throwable {
printRuntimeMSG("---RegressionTest3:test064");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test064");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        java.lang.Object obj7 = null;
        boolean boolean8 = plotOrientation6.equals(obj7);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test065() throws Throwable {
printRuntimeMSG("---RegressionTest3:test065");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test065");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        categoryPlot0.setBackgroundImageAlignment((int) (byte) -1);
        org.jfree.chart.plot.PlotOrientation plotOrientation4 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.BarRenderer barRenderer6 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint7 = barRenderer6.getShadowPaint();
        boolean boolean8 = barRenderer6.getBaseSeriesVisible();
        categoryPlot0.setRenderer((int) (short) 100, (org.jfree.chart.renderer.category.CategoryItemRenderer) barRenderer6);
        double double10 = barRenderer6.getShadowXOffset();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator14 = barRenderer6.getURLGenerator((int) (short) 0, (-16777216), true);
        barRenderer6.setShadowVisible(true);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(plotOrientation4);
        org.junit.Assert.assertNotNull(paint7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 4.0d + "'", double10 == 4.0d);
        org.junit.Assert.assertNull(categoryURLGenerator14);
    }

    @Test
    public void test066() throws Throwable {
printRuntimeMSG("---RegressionTest3:test066");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test066");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        categoryPlot0.setWeight((int) (byte) 1);
        boolean boolean10 = categoryPlot0.isRangePannable();
        java.awt.Paint paint11 = categoryPlot0.getRangeGridlinePaint();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo13 = null;
        java.awt.geom.Point2D point2D14 = null;
        categoryPlot0.zoomRangeAxes((double) 1, plotRenderingInfo13, point2D14, true);
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer17 = categoryPlot0.getRenderer();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(categoryItemRenderer17);
    }

    @Test
    public void test067() throws Throwable {
printRuntimeMSG("---RegressionTest3:test067");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test067");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D7, rectangle2D8, 0, plotRenderingInfo10, categoryCrosshairState11);
        boolean boolean13 = categoryPlot0.isOutlineVisible();
        categoryPlot0.setNotify(false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test068() throws Throwable {
printRuntimeMSG("---RegressionTest3:test068");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test068");
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
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = lineAndShapeRenderer7.getSeriesItemLabelGenerator((-12566464));
        java.awt.Font font25 = lineAndShapeRenderer7.getLegendTextFont((int) (short) 1);
        boolean boolean26 = lineAndShapeRenderer7.getBaseCreateEntities();
        boolean boolean27 = lineAndShapeRenderer7.getUseFillPaint();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertNull(font25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test069() throws Throwable {
printRuntimeMSG("---RegressionTest3:test069");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test069");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        java.awt.Font font3 = categoryAxis0.getTickLabelFont();
        float float4 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        categoryAxis0.addCategoryLabelToolTip((java.lang.Comparable) (-1.2566468E7d), "Category Plot");
        java.awt.Shape shape12 = null;
        java.awt.Color color13 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke14 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color15 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem16 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape12, (java.awt.Paint) color13, stroke14, (java.awt.Paint) color15);
        java.awt.Color color18 = org.jfree.chart.ChartColor.VERY_LIGHT_CYAN;
        java.awt.Color color19 = java.awt.Color.getColor("hi!", color18);
        legendItem16.setOutlinePaint((java.awt.Paint) color18);
        int int21 = color18.getRed();
        categoryAxis0.setAxisLinePaint((java.awt.Paint) color18);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(stroke14);
        org.junit.Assert.assertNotNull(color15);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 128 + "'", int21 == 128);
    }

    @Test
    public void test070() throws Throwable {
printRuntimeMSG("---RegressionTest3:test070");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test070");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        categoryPlot0.setNoDataMessage("TextAnchor.HALF_ASCENT_LEFT");
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis10.setMinorTickMarkOutsideLength((float) (short) 0);
        float float13 = categoryAxis10.getMinorTickMarkInsideLength();
        categoryAxis10.setMinorTickMarkInsideLength(100.0f);
        java.awt.Paint paint16 = categoryAxis10.getTickMarkPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint18 = categoryAxis17.getTickLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double20 = rectangleInsets19.getRight();
        double double22 = rectangleInsets19.calculateTopInset(0.0d);
        categoryAxis17.setLabelInsets(rectangleInsets19, false);
        java.lang.String str25 = rectangleInsets19.toString();
        categoryAxis10.setTickLabelInsets(rectangleInsets19);
        categoryPlot0.setInsets(rectangleInsets19);
        org.jfree.chart.renderer.RenderAttributes renderAttributes36 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean42 = lineAndShapeRenderer40.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean43 = lineAndShapeRenderer40.getBaseLinesVisible();
        java.awt.Shape shape44 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer40.setBaseLegendShape(shape44);
        renderAttributes36.setSeriesShape((int) ' ', shape44);
        org.jfree.chart.entity.ChartEntity chartEntity48 = new org.jfree.chart.entity.ChartEntity(shape44, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint49 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color51 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem52 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color51);
        java.lang.String str53 = legendItem52.getToolTipText();
        java.awt.Stroke stroke54 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem52.setOutlineStroke(stroke54);
        java.awt.Shape shape60 = null;
        java.awt.Color color61 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke62 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color63 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem64 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape60, (java.awt.Paint) color61, stroke62, (java.awt.Paint) color63);
        java.lang.Class<?> wildcardClass65 = color61.getClass();
        org.jfree.chart.LegendItem legendItem66 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape44, paint49, stroke54, (java.awt.Paint) color61);
        org.jfree.chart.entity.ChartEntity chartEntity67 = new org.jfree.chart.entity.ChartEntity(shape44);
        java.awt.Color color68 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem69 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape44, (java.awt.Paint) color68);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset72 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity75 = new org.jfree.chart.entity.CategoryItemEntity(shape44, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset72, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        defaultCategoryDataset72.clearSelection();
        java.util.EventListener eventListener77 = null;
        boolean boolean78 = defaultCategoryDataset72.hasListener(eventListener77);
        categoryPlot0.setDataset((org.jfree.data.category.CategoryDataset) defaultCategoryDataset72);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str25.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertNull(boolean42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(shape44);
        org.junit.Assert.assertNotNull(paint49);
        org.junit.Assert.assertNotNull(color51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(color61);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertNotNull(color63);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(color68);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test071() throws Throwable {
printRuntimeMSG("---RegressionTest3:test071");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test071");
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator0 = new org.jfree.chart.util.DefaultShadowGenerator();
        float float1 = defaultShadowGenerator0.getShadowOpacity();
        double double2 = defaultShadowGenerator0.getAngle();
        double double3 = defaultShadowGenerator0.getAngle();
        float float4 = defaultShadowGenerator0.getShadowOpacity();
        int int5 = defaultShadowGenerator0.calculateOffsetY();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7853981633974483d) + "'", double2 == (-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7853981633974483d) + "'", double3 == (-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2) + "'", int5 == (-2));
    }

    @Test
    public void test072() throws Throwable {
printRuntimeMSG("---RegressionTest3:test072");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test072");
        org.jfree.data.KeyedObjects keyedObjects0 = new org.jfree.data.KeyedObjects();
        try {
            keyedObjects0.insertValue((-1), (java.lang.Comparable) "", (java.lang.Object) 18.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 'position' out of bounds.");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
printRuntimeMSG("---RegressionTest3:test073");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test073");
        org.jfree.data.SelectableValue selectableValue2 = new org.jfree.data.SelectableValue((java.lang.Number) (-13.0d), true);
    }

    @Test
    public void test074() throws Throwable {
printRuntimeMSG("---RegressionTest3:test074");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test074");
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
        java.awt.Paint paint32 = categoryPlot11.getRangeGridlinePaint();
        categoryPlot11.setRangeGridlinesVisible(true);
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
        org.junit.Assert.assertNotNull(paint32);
    }

    @Test
    public void test075() throws Throwable {
printRuntimeMSG("---RegressionTest3:test075");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test075");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D7, rectangle2D8, 0, plotRenderingInfo10, categoryCrosshairState11);
        org.jfree.chart.renderer.category.BarRenderer barRenderer13 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint14 = barRenderer13.getShadowPaint();
        boolean boolean15 = barRenderer13.getBaseSeriesVisible();
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint17 = renderAttributes16.getDefaultLabelPaint();
        java.awt.Paint paint20 = renderAttributes16.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke21 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes16.setDefaultStroke(stroke21);
        barRenderer13.setBaseStroke(stroke21, true);
        categoryPlot0.setOutlineStroke(stroke21);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(paint17);
        org.junit.Assert.assertNull(paint20);
        org.junit.Assert.assertNotNull(stroke21);
    }

    @Test
    public void test076() throws Throwable {
printRuntimeMSG("---RegressionTest3:test076");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test076");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint1 = categoryAxis0.getTickLabelPaint();
        categoryAxis0.setFixedDimension((double) 1);
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
        categoryAxis0.setAxisLineStroke(stroke26);
        categoryAxis0.setCategoryMargin(4.0d);
        org.junit.Assert.assertNotNull(paint1);
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
    }

    @Test
    public void test077() throws Throwable {
printRuntimeMSG("---RegressionTest3:test077");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test077");
        java.awt.Color color2 = java.awt.Color.getColor("GradientPaintTransformType.VERTICAL", 10);
        org.junit.Assert.assertNotNull(color2);
    }

    @Test
    public void test078() throws Throwable {
printRuntimeMSG("---RegressionTest3:test078");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test078");
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition0 = new org.jfree.chart.labels.ItemLabelPosition();
        org.jfree.chart.LegendItem legendItem2 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        java.awt.Color color4 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem5 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color4);
        java.lang.String str6 = legendItem5.getToolTipText();
        java.awt.Stroke stroke7 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem5.setOutlineStroke(stroke7);
        legendItem2.setOutlineStroke(stroke7);
        java.awt.Stroke stroke10 = legendItem2.getLineStroke();
        java.awt.Paint paint11 = legendItem2.getOutlinePaint();
        org.jfree.chart.renderer.RenderAttributes renderAttributes12 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint13 = renderAttributes12.getDefaultLabelPaint();
        java.awt.Color color14 = java.awt.Color.RED;
        renderAttributes12.setDefaultOutlinePaint((java.awt.Paint) color14);
        legendItem2.setLinePaint((java.awt.Paint) color14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis18.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis21 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer24 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator25 = lineAndShapeRenderer24.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot(categoryDataset17, categoryAxis18, valueAxis21, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer24);
        boolean boolean27 = categoryAxis18.isTickLabelsVisible();
        double double28 = categoryAxis18.getFixedDimension();
        java.lang.Object obj29 = categoryAxis18.clone();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke31 = categoryPlot30.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke33 = categoryPlot32.getRangeMinorGridlineStroke();
        categoryPlot30.setParent((org.jfree.chart.plot.Plot) categoryPlot32);
        categoryAxis18.addChangeListener((org.jfree.chart.event.AxisChangeListener) categoryPlot32);
        java.awt.Color color36 = java.awt.Color.WHITE;
        categoryPlot32.setRangeCrosshairPaint((java.awt.Paint) color36);
        legendItem2.setOutlinePaint((java.awt.Paint) color36);
        boolean boolean39 = itemLabelPosition0.equals((java.lang.Object) legendItem2);
        java.lang.Comparable comparable40 = legendItem2.getSeriesKey();
        org.junit.Assert.assertNotNull(color4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertNull(categoryItemLabelGenerator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(comparable40);
    }

    @Test
    public void test079() throws Throwable {
printRuntimeMSG("---RegressionTest3:test079");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test079");
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
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke20 = categoryPlot19.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot21 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke22 = categoryPlot21.getRangeMinorGridlineStroke();
        categoryPlot19.setParent((org.jfree.chart.plot.Plot) categoryPlot21);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo25 = null;
        java.awt.geom.Point2D point2D26 = null;
        categoryPlot21.zoomDomainAxes((double) '4', plotRenderingInfo25, point2D26);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor28 = categoryPlot21.getDomainGridlinePosition();
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot32 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke33 = categoryPlot32.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot34 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke35 = categoryPlot34.getRangeMinorGridlineStroke();
        categoryPlot32.setParent((org.jfree.chart.plot.Plot) categoryPlot34);
        categoryPlot34.setDomainCrosshairColumnKey((java.lang.Comparable) (-1L), true);
        categoryPlot34.mapDatasetToRangeAxis((int) 'a', (int) (short) 0);
        boolean boolean43 = categoryPlot34.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge45 = categoryPlot34.getDomainAxisEdge(0);
        try {
            double double46 = categoryAxis6.getCategoryJava2DCoordinate(categoryAnchor28, 15, (int) 'a', rectangle2D31, rectangleEdge45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke22);
        org.junit.Assert.assertNotNull(categoryAnchor28);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(stroke35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(rectangleEdge45);
    }

    @Test
    public void test080() throws Throwable {
printRuntimeMSG("---RegressionTest3:test080");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test080");
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
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState27 = defaultCategoryDataset24.getSelectionState();
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
        org.junit.Assert.assertNotNull(categoryDatasetSelectionState27);
    }

    @Test
    public void test081() throws Throwable {
printRuntimeMSG("---RegressionTest3:test081");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test081");
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
        org.jfree.chart.renderer.category.BarRenderer barRenderer29 = new org.jfree.chart.renderer.category.BarRenderer();
        barRenderer29.setDrawBarOutline(false);
        keyedObjects0.setObject((java.lang.Comparable) "TextAnchor.BOTTOM_LEFT", (java.lang.Object) barRenderer29);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(list27);
    }

    @Test
    public void test082() throws Throwable {
printRuntimeMSG("---RegressionTest3:test082");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test082");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        java.awt.Color color3 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem4 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color3);
        java.lang.String str5 = legendItem4.getToolTipText();
        java.awt.Stroke stroke6 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem4.setOutlineStroke(stroke6);
        legendItem1.setOutlineStroke(stroke6);
        java.awt.Stroke stroke9 = legendItem1.getLineStroke();
        java.awt.Paint paint10 = legendItem1.getOutlinePaint();
        org.jfree.chart.renderer.RenderAttributes renderAttributes11 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint12 = renderAttributes11.getDefaultLabelPaint();
        java.awt.Color color13 = java.awt.Color.RED;
        renderAttributes11.setDefaultOutlinePaint((java.awt.Paint) color13);
        legendItem1.setLinePaint((java.awt.Paint) color13);
        legendItem1.setToolTipText("SortOrder.ASCENDING");
        java.awt.Font font18 = null;
        legendItem1.setLabelFont(font18);
        org.junit.Assert.assertNotNull(color3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test083() throws Throwable {
printRuntimeMSG("---RegressionTest3:test083");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test083");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        lineAndShapeRenderer2.clearSeriesStrokes(false);
        int int10 = lineAndShapeRenderer2.getRowCount();
        lineAndShapeRenderer2.setBaseItemLabelsVisible(false);
        java.awt.Color color14 = org.jfree.chart.ChartColor.VERY_LIGHT_GREEN;
        lineAndShapeRenderer2.setSeriesPaint((int) ' ', (java.awt.Paint) color14, true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test084() throws Throwable {
printRuntimeMSG("---RegressionTest3:test084");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test084");
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
        categoryAxis11.setFixedDimension((-1.2566464E7d));
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.05d + "'", double12 == 0.05d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test085() throws Throwable {
printRuntimeMSG("---RegressionTest3:test085");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test085");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        int int7 = categoryPlot0.getWeight();
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = categoryPlot0.getOrientation();
        boolean boolean9 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setCrosshairDatasetIndex((-12566464), false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(plotOrientation8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test086() throws Throwable {
printRuntimeMSG("---RegressionTest3:test086");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test086");
        org.jfree.data.KeyedObjects2D keyedObjects2D0 = new org.jfree.data.KeyedObjects2D();
        int int2 = keyedObjects2D0.getRowIndex((java.lang.Comparable) true);
        int int3 = keyedObjects2D0.getColumnCount();
        try {
            keyedObjects2D0.removeColumn((java.lang.Comparable) (-2));
            org.junit.Assert.fail("Expected exception of type org.jfree.data.UnknownKeyException; message: Column key (-2) not recognised.");
        } catch (org.jfree.data.UnknownKeyException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test087() throws Throwable {
printRuntimeMSG("---RegressionTest3:test087");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test087");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getLegendTextPaint((-1));
        boolean boolean11 = lineAndShapeRenderer2.isSeriesVisibleInLegend(0);
        lineAndShapeRenderer2.setBaseShapesVisible(true);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test088() throws Throwable {
printRuntimeMSG("---RegressionTest3:test088");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test088");
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
        categoryPlot9.clearRangeMarkers();
        org.junit.Assert.assertNotNull(sortOrder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.05d + "'", double12 == 0.05d);
    }

    @Test
    public void test089() throws Throwable {
printRuntimeMSG("---RegressionTest3:test089");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test089");
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
        defaultCategoryDataset44.clear();
        defaultCategoryDataset44.addValue((double) 5, (java.lang.Comparable) (short) 10, (java.lang.Comparable) "PlotOrientation.VERTICAL");
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
    public void test090() throws Throwable {
printRuntimeMSG("---RegressionTest3:test090");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test090");
        org.jfree.chart.util.StrokeList strokeList0 = new org.jfree.chart.util.StrokeList();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer3 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator4 = lineAndShapeRenderer3.getBaseItemLabelGenerator();
        java.awt.Paint paint6 = lineAndShapeRenderer3.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator8 = lineAndShapeRenderer3.getSeriesURLGenerator(0);
        boolean boolean9 = strokeList0.equals((java.lang.Object) categoryURLGenerator8);
        java.awt.Stroke stroke11 = strokeList0.getStroke((-12566464));
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer14 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean16 = lineAndShapeRenderer14.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean17 = strokeList0.equals((java.lang.Object) boolean16);
        java.lang.Object obj18 = strokeList0.clone();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo22 = null;
        java.awt.geom.Point2D point2D23 = null;
        categoryPlot19.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo22, point2D23);
        categoryPlot19.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder27 = categoryPlot19.getRowRenderingOrder();
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        boolean boolean29 = sortOrder27.equals((java.lang.Object) categoryPlot28);
        org.jfree.chart.axis.CategoryAxis categoryAxis30 = new org.jfree.chart.axis.CategoryAxis();
        double double31 = categoryAxis30.getUpperMargin();
        categoryPlot28.setDomainAxis(categoryAxis30);
        boolean boolean33 = categoryAxis30.isVisible();
        boolean boolean34 = strokeList0.equals((java.lang.Object) categoryAxis30);
        org.junit.Assert.assertNull(categoryItemLabelGenerator4);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(categoryURLGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(stroke11);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(sortOrder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.05d + "'", double31 == 0.05d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test091() throws Throwable {
printRuntimeMSG("---RegressionTest3:test091");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test091");
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
        boolean boolean23 = categoryPlot0.isOutlineVisible();
        java.lang.Comparable comparable24 = categoryPlot0.getDomainCrosshairRowKey();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(comparable24);
    }

    @Test
    public void test092() throws Throwable {
printRuntimeMSG("---RegressionTest3:test092");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test092");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        java.awt.Paint paint9 = legendItem8.getLabelPaint();
        java.lang.String str10 = legendItem8.getURLText();
        java.awt.Paint paint11 = legendItem8.getOutlinePaint();
        java.awt.Paint paint12 = legendItem8.getLabelPaint();
        java.awt.Paint paint13 = legendItem8.getLabelPaint();
        java.awt.Shape shape18 = null;
        java.awt.Color color19 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color21 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem22 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape18, (java.awt.Paint) color19, stroke20, (java.awt.Paint) color21);
        java.awt.Paint paint23 = legendItem22.getLabelPaint();
        java.lang.String str24 = legendItem22.getURLText();
        java.awt.Shape shape25 = legendItem22.getShape();
        java.awt.Stroke stroke26 = legendItem22.getOutlineStroke();
        legendItem8.setOutlineStroke(stroke26);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str10.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(paint12);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(color19);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(color21);
        org.junit.Assert.assertNull(paint23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str24.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNull(shape25);
        org.junit.Assert.assertNotNull(stroke26);
    }

    @Test
    public void test093() throws Throwable {
printRuntimeMSG("---RegressionTest3:test093");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test093");
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
        org.jfree.chart.axis.AxisSpace axisSpace15 = categoryPlot0.getFixedRangeAxisSpace();
        categoryPlot0.setBackgroundImageAlignment((-8355712));
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNull(axisSpace15);
    }

    @Test
    public void test094() throws Throwable {
printRuntimeMSG("---RegressionTest3:test094");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test094");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator11 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(2, categoryItemLabelGenerator11, true);
        boolean boolean14 = lineAndShapeRenderer2.getAutoPopulateSeriesStroke();
        java.lang.Boolean boolean16 = lineAndShapeRenderer2.getSeriesVisibleInLegend((int) '#');
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test095() throws Throwable {
printRuntimeMSG("---RegressionTest3:test095");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test095");
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
        boolean boolean49 = categoryPlot0.isOutlineVisible();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test096() throws Throwable {
printRuntimeMSG("---RegressionTest3:test096");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test096");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType0 = org.jfree.chart.util.GradientPaintTransformType.CENTER_HORIZONTAL;
        java.lang.String str1 = gradientPaintTransformType0.toString();
        org.junit.Assert.assertNotNull(gradientPaintTransformType0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "GradientPaintTransformType.CENTER_HORIZONTAL" + "'", str1.equals("GradientPaintTransformType.CENTER_HORIZONTAL"));
    }

    @Test
    public void test097() throws Throwable {
printRuntimeMSG("---RegressionTest3:test097");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test097");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.chart.util.Layer layer7 = null;
        java.util.Collection collection8 = categoryPlot0.getDomainMarkers((int) (byte) 1, layer7);
        int int9 = categoryPlot0.getRendererCount();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(axisSpace5);
        org.junit.Assert.assertNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test098() throws Throwable {
printRuntimeMSG("---RegressionTest3:test098");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test098");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        double double2 = rectangleInsets0.getTop();
        double double4 = rectangleInsets0.calculateTopOutset((double) ' ');
        double double6 = rectangleInsets0.calculateBottomInset((double) 100.0f);
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.0d + "'", double2 == 2.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 2.0d + "'", double4 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 2.0d + "'", double6 == 2.0d);
    }

    @Test
    public void test099() throws Throwable {
printRuntimeMSG("---RegressionTest3:test099");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test099");
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
        boolean boolean11 = categoryPlot0.isDomainGridlinesVisible();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test100() throws Throwable {
printRuntimeMSG("---RegressionTest3:test100");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test100");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        java.awt.Color color6 = org.jfree.chart.ChartColor.LIGHT_BLUE;
        lineAndShapeRenderer2.setSeriesPaint(0, (java.awt.Paint) color6);
        lineAndShapeRenderer2.setBaseSeriesVisible(true);
        boolean boolean12 = lineAndShapeRenderer2.getItemShapeFilled((int) (byte) 10, (int) '4');
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = lineAndShapeRenderer2.getLegendItems();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition21 = null;
        lineAndShapeRenderer19.setSeriesPositiveItemLabelPosition(0, itemLabelPosition21);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition24 = lineAndShapeRenderer19.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean25 = lineAndShapeRenderer19.getUseFillPaint();
        java.lang.Boolean boolean27 = lineAndShapeRenderer19.getSeriesItemLabelsVisible(0);
        lineAndShapeRenderer19.setBaseItemLabelsVisible(false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = null;
        lineAndShapeRenderer32.setSeriesPositiveItemLabelPosition(0, itemLabelPosition34);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition37 = lineAndShapeRenderer32.getSeriesPositiveItemLabelPosition((-1));
        lineAndShapeRenderer19.setBasePositiveItemLabelPosition(itemLabelPosition37, false);
        lineAndShapeRenderer2.setSeriesNegativeItemLabelPosition((int) (short) 0, itemLabelPosition37);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(legendItemCollection15);
        org.junit.Assert.assertNotNull(itemLabelPosition24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertNotNull(itemLabelPosition37);
    }

    @Test
    public void test101() throws Throwable {
printRuntimeMSG("---RegressionTest3:test101");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test101");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        java.awt.Paint paint11 = lineAndShapeRenderer2.getItemOutlinePaint((int) (short) 10, (int) (byte) 10, false);
        lineAndShapeRenderer2.setDrawOutlines(true);
        lineAndShapeRenderer2.setDrawOutlines(false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer18 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean20 = lineAndShapeRenderer18.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean21 = lineAndShapeRenderer18.getBaseLinesVisible();
        lineAndShapeRenderer18.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer18.setAutoPopulateSeriesShape(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot26 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke27 = categoryPlot26.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot28 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke29 = categoryPlot28.getRangeMinorGridlineStroke();
        categoryPlot26.setParent((org.jfree.chart.plot.Plot) categoryPlot28);
        org.jfree.chart.LegendItemCollection legendItemCollection31 = categoryPlot26.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent32 = null;
        categoryPlot26.axisChanged(axisChangeEvent32);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer36 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator37 = lineAndShapeRenderer36.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator38 = null;
        lineAndShapeRenderer36.setBaseToolTipGenerator(categoryToolTipGenerator38);
        java.awt.Paint paint41 = lineAndShapeRenderer36.lookupSeriesOutlinePaint((int) (byte) 1);
        categoryPlot26.setDomainCrosshairPaint(paint41);
        lineAndShapeRenderer18.setBaseOutlinePaint(paint41, false);
        lineAndShapeRenderer2.setBaseFillPaint(paint41, false);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(stroke27);
        org.junit.Assert.assertNotNull(stroke29);
        org.junit.Assert.assertNull(legendItemCollection31);
        org.junit.Assert.assertNull(categoryItemLabelGenerator37);
        org.junit.Assert.assertNotNull(paint41);
    }

    @Test
    public void test102() throws Throwable {
printRuntimeMSG("---RegressionTest3:test102");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test102");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        int int2 = legendItem1.getDatasetIndex();
        java.awt.Paint paint3 = legendItem1.getOutlinePaint();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(paint3);
    }

    @Test
    public void test103() throws Throwable {
printRuntimeMSG("---RegressionTest3:test103");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test103");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint4 = renderAttributes3.getDefaultLabelPaint();
        java.awt.Paint paint7 = renderAttributes3.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes3.setDefaultStroke(stroke8);
        barRenderer0.setBaseStroke(stroke8, true);
        java.awt.Color color13 = java.awt.Color.WHITE;
        barRenderer0.setSeriesItemLabelPaint(0, (java.awt.Paint) color13);
        java.awt.color.ColorSpace colorSpace15 = null;
        org.jfree.chart.renderer.category.BarRenderer barRenderer16 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint17 = barRenderer16.getShadowPaint();
        org.jfree.chart.LegendItem legendItem19 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        org.jfree.chart.renderer.RenderAttributes renderAttributes28 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer32 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean34 = lineAndShapeRenderer32.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean35 = lineAndShapeRenderer32.getBaseLinesVisible();
        java.awt.Shape shape36 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer32.setBaseLegendShape(shape36);
        renderAttributes28.setSeriesShape((int) ' ', shape36);
        org.jfree.chart.entity.ChartEntity chartEntity40 = new org.jfree.chart.entity.ChartEntity(shape36, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color43 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem44 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color43);
        java.lang.String str45 = legendItem44.getToolTipText();
        java.awt.Stroke stroke46 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem44.setOutlineStroke(stroke46);
        java.awt.Shape shape52 = null;
        java.awt.Color color53 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke54 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color55 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem56 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape52, (java.awt.Paint) color53, stroke54, (java.awt.Paint) color55);
        java.lang.Class<?> wildcardClass57 = color53.getClass();
        org.jfree.chart.LegendItem legendItem58 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape36, paint41, stroke46, (java.awt.Paint) color53);
        org.jfree.chart.entity.ChartEntity chartEntity59 = new org.jfree.chart.entity.ChartEntity(shape36);
        java.awt.Color color60 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem61 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape36, (java.awt.Paint) color60);
        legendItem19.setLabelPaint((java.awt.Paint) color60);
        barRenderer16.setBaseLegendTextPaint((java.awt.Paint) color60);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator64 = new org.jfree.chart.util.DefaultShadowGenerator();
        float float65 = defaultShadowGenerator64.getShadowOpacity();
        java.awt.Color color66 = defaultShadowGenerator64.getShadowColor();
        float[] floatArray71 = new float[] { (short) -1, 10.0f, (byte) 0, (-8355712) };
        float[] floatArray72 = color66.getRGBColorComponents(floatArray71);
        float[] floatArray73 = color60.getColorComponents(floatArray72);
        try {
            float[] floatArray74 = color13.getComponents(colorSpace15, floatArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(color13);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNull(boolean34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(shape36);
        org.junit.Assert.assertNotNull(paint41);
        org.junit.Assert.assertNotNull(color43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(stroke46);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNotNull(color55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(color60);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 0.5f + "'", float65 == 0.5f);
        org.junit.Assert.assertNotNull(color66);
        org.junit.Assert.assertNotNull(floatArray71);
        org.junit.Assert.assertNotNull(floatArray72);
        org.junit.Assert.assertNotNull(floatArray73);
    }

    @Test
    public void test104() throws Throwable {
printRuntimeMSG("---RegressionTest3:test104");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test104");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        java.awt.Color color6 = org.jfree.chart.ChartColor.LIGHT_BLUE;
        lineAndShapeRenderer2.setSeriesPaint(0, (java.awt.Paint) color6);
        lineAndShapeRenderer2.setBaseSeriesVisible(true);
        boolean boolean12 = lineAndShapeRenderer2.getItemShapeFilled((int) (byte) 10, (int) '4');
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = lineAndShapeRenderer2.getLegendItems();
        try {
            org.jfree.chart.LegendItem legendItem17 = legendItemCollection15.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNotNull(color6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(legendItemCollection15);
    }

    @Test
    public void test105() throws Throwable {
printRuntimeMSG("---RegressionTest3:test105");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test105");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent5 = null;
        categoryPlot2.annotationChanged(annotationChangeEvent5);
        categoryPlot2.clearSelection();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
    }

    @Test
    public void test106() throws Throwable {
printRuntimeMSG("---RegressionTest3:test106");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test106");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        double double10 = barRenderer0.getMaximumBarWidth();
        java.awt.Paint paint11 = barRenderer0.getBaseItemLabelPaint();
        boolean boolean12 = barRenderer0.getAutoPopulateSeriesFillPaint();
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test107() throws Throwable {
printRuntimeMSG("---RegressionTest3:test107");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test107");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        int int7 = categoryPlot0.getWeight();
        org.jfree.chart.plot.PlotOrientation plotOrientation8 = categoryPlot0.getOrientation();
        org.jfree.chart.renderer.category.BarRenderer barRenderer9 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint10 = barRenderer9.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot11.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo14, point2D15);
        categoryPlot11.clearAnnotations();
        boolean boolean18 = barRenderer9.equals((java.lang.Object) categoryPlot11);
        java.awt.Paint paint19 = barRenderer9.getShadowPaint();
        java.awt.Shape shape20 = barRenderer9.getBaseShape();
        barRenderer9.setShadowYOffset(0.0d);
        barRenderer9.setMaximumBarWidth(0.0d);
        boolean boolean25 = plotOrientation8.equals((java.lang.Object) barRenderer9);
        barRenderer9.setShadowYOffset((double) 255);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator29 = null;
        barRenderer9.setSeriesURLGenerator((int) 'a', categoryURLGenerator29);
        java.awt.Paint paint31 = barRenderer9.getBaseOutlinePaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(plotOrientation8);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(paint19);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(paint31);
    }

    @Test
    public void test108() throws Throwable {
printRuntimeMSG("---RegressionTest3:test108");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test108");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        categoryAxis1.setLowerMargin((double) 5);
        java.awt.Shape shape17 = null;
        java.awt.Color color18 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke19 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color20 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem21 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape17, (java.awt.Paint) color18, stroke19, (java.awt.Paint) color20);
        categoryAxis1.setLabelPaint((java.awt.Paint) color20);
        categoryAxis1.setMaximumCategoryLabelWidthRatio((float) (byte) 100);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(stroke19);
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test109() throws Throwable {
printRuntimeMSG("---RegressionTest3:test109");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test109");
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
        org.jfree.chart.renderer.category.BarRenderer barRenderer43 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint44 = barRenderer43.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot45 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo48 = null;
        java.awt.geom.Point2D point2D49 = null;
        categoryPlot45.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo48, point2D49);
        categoryPlot45.clearAnnotations();
        boolean boolean52 = barRenderer43.equals((java.lang.Object) categoryPlot45);
        java.awt.Paint paint53 = barRenderer43.getShadowPaint();
        java.awt.Shape shape54 = barRenderer43.getBaseShape();
        org.jfree.chart.entity.ChartEntity chartEntity57 = new org.jfree.chart.entity.ChartEntity(shape54, "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", "AxisLocation.BOTTOM_OR_RIGHT");
        renderAttributes0.setDefaultShape(shape54);
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
        org.junit.Assert.assertNotNull(paint44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(paint53);
        org.junit.Assert.assertNotNull(shape54);
    }

    @Test
    public void test110() throws Throwable {
printRuntimeMSG("---RegressionTest3:test110");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test110");
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
        int int14 = categoryPlot1.getCrosshairDatasetIndex();
        categoryPlot1.setRangeCrosshairLockedOnData(false);
        org.junit.Assert.assertNotNull(shape0);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(legendItemCollection6);
        org.junit.Assert.assertNull(comparable7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test111() throws Throwable {
printRuntimeMSG("---RegressionTest3:test111");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test111");
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
        categoryItemEntity47.setURLText("ChartChangeEventType.GENERAL");
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
    public void test112() throws Throwable {
printRuntimeMSG("---RegressionTest3:test112");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test112");
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
        categoryPlot10.setRangeCrosshairValue(0.0d);
        org.jfree.chart.plot.PlotOrientation plotOrientation22 = categoryPlot10.getOrientation();
        org.jfree.chart.util.SortOrder sortOrder23 = categoryPlot10.getRowRenderingOrder();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(plotOrientation22);
        org.junit.Assert.assertNotNull(sortOrder23);
    }

    @Test
    public void test113() throws Throwable {
printRuntimeMSG("---RegressionTest3:test113");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test113");
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
        org.jfree.chart.entity.ChartEntity chartEntity27 = new org.jfree.chart.entity.ChartEntity(shape20);
        org.jfree.chart.renderer.category.BarRenderer barRenderer28 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint29 = barRenderer28.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot30 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        java.awt.geom.Point2D point2D34 = null;
        categoryPlot30.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo33, point2D34);
        categoryPlot30.clearAnnotations();
        boolean boolean37 = barRenderer28.equals((java.lang.Object) categoryPlot30);
        java.awt.Shape shape38 = barRenderer28.getBaseShape();
        barRenderer28.setMinimumBarLength((double) 0.0f);
        boolean boolean41 = chartEntity27.equals((java.lang.Object) barRenderer28);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNotNull(color10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(shape20);
        org.junit.Assert.assertNotNull(paint29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(shape38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test114() throws Throwable {
printRuntimeMSG("---RegressionTest3:test114");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test114");
        java.awt.Color color1 = org.jfree.chart.ChartColor.LIGHT_RED;
        org.jfree.chart.LegendItem legendItem2 = new org.jfree.chart.LegendItem("GradientPaintTransformType.VERTICAL", (java.awt.Paint) color1);
        org.junit.Assert.assertNotNull(color1);
    }

    @Test
    public void test115() throws Throwable {
printRuntimeMSG("---RegressionTest3:test115");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test115");
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
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent14 = null;
        categoryPlot0.annotationChanged(annotationChangeEvent14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        categoryPlot16.setOrientation(plotOrientation17);
        categoryPlot0.setOrientation(plotOrientation17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis21.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = lineAndShapeRenderer27.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis24, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer27);
        boolean boolean30 = categoryAxis21.isTickLabelsVisible();
        double double31 = categoryAxis21.getFixedDimension();
        java.lang.Object obj32 = categoryAxis21.clone();
        java.awt.Paint paint33 = categoryAxis21.getLabelPaint();
        boolean boolean34 = plotOrientation17.equals((java.lang.Object) categoryAxis21);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke36 = categoryPlot35.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation37 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation38 = axisLocation37.getOpposite();
        categoryPlot35.setDomainAxisLocation(axisLocation38, false);
        boolean boolean41 = categoryPlot35.canSelectByRegion();
        categoryPlot35.setForegroundAlpha((float) '#');
        categoryAxis21.removeChangeListener((org.jfree.chart.event.AxisChangeListener) categoryPlot35);
        java.awt.Font font46 = categoryAxis21.getTickLabelFont((java.lang.Comparable) 8.0d);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(font46);
    }

    @Test
    public void test116() throws Throwable {
printRuntimeMSG("---RegressionTest3:test116");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test116");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getLegendItems();
        java.awt.Graphics2D graphics2D8 = null;
        java.awt.geom.Rectangle2D rectangle2D9 = null;
        try {
            categoryPlot0.drawBackground(graphics2D8, rectangle2D9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(legendItemCollection7);
    }

    @Test
    public void test117() throws Throwable {
printRuntimeMSG("---RegressionTest3:test117");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test117");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets15 = null;
        try {
            categoryAxis10.setLabelInsets(rectangleInsets15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'insets' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(list14);
    }

    @Test
    public void test118() throws Throwable {
printRuntimeMSG("---RegressionTest3:test118");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test118");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer2.getNegativeItemLabelPosition(0, 0, true);
        boolean boolean12 = lineAndShapeRenderer2.getBaseShapesVisible();
        boolean boolean13 = lineAndShapeRenderer2.getBaseSeriesVisible();
        org.jfree.chart.renderer.category.BarRenderer barRenderer15 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint16 = barRenderer15.getShadowPaint();
        boolean boolean17 = barRenderer15.getBaseSeriesVisible();
        java.awt.Paint paint18 = barRenderer15.getShadowPaint();
        lineAndShapeRenderer2.setSeriesItemLabelPaint((int) '4', paint18);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(paint18);
    }

    @Test
    public void test119() throws Throwable {
printRuntimeMSG("---RegressionTest3:test119");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test119");
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor0 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE5;
        java.lang.String str1 = itemLabelAnchor0.toString();
        org.jfree.chart.labels.ItemLabelAnchor itemLabelAnchor2 = org.jfree.chart.labels.ItemLabelAnchor.INSIDE7;
        org.jfree.chart.text.TextAnchor textAnchor3 = org.jfree.chart.text.TextAnchor.CENTER_LEFT;
        java.lang.String str4 = textAnchor3.toString();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = new org.jfree.chart.labels.ItemLabelPosition(itemLabelAnchor2, textAnchor3);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition6 = new org.jfree.chart.labels.ItemLabelPosition(itemLabelAnchor0, textAnchor3);
        org.junit.Assert.assertNotNull(itemLabelAnchor0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ItemLabelAnchor.INSIDE5" + "'", str1.equals("ItemLabelAnchor.INSIDE5"));
        org.junit.Assert.assertNotNull(itemLabelAnchor2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "TextAnchor.CENTER_LEFT" + "'", str4.equals("TextAnchor.CENTER_LEFT"));
    }

    @Test
    public void test120() throws Throwable {
printRuntimeMSG("---RegressionTest3:test120");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test120");
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
        categoryPlot0.setDrawSharedDomainAxis(false);
        java.awt.Paint paint34 = categoryPlot0.getRangeGridlinePaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(itemLabelPosition17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNotNull(legendItemCollection30);
        org.junit.Assert.assertNotNull(paint34);
    }

    @Test
    public void test121() throws Throwable {
printRuntimeMSG("---RegressionTest3:test121");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test121");
        org.jfree.chart.renderer.category.BarRenderer barRenderer1 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint2 = barRenderer1.getShadowPaint();
        org.jfree.chart.LegendItem legendItem4 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        org.jfree.chart.renderer.RenderAttributes renderAttributes13 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer17 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean19 = lineAndShapeRenderer17.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean20 = lineAndShapeRenderer17.getBaseLinesVisible();
        java.awt.Shape shape21 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer17.setBaseLegendShape(shape21);
        renderAttributes13.setSeriesShape((int) ' ', shape21);
        org.jfree.chart.entity.ChartEntity chartEntity25 = new org.jfree.chart.entity.ChartEntity(shape21, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint26 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color28 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem29 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color28);
        java.lang.String str30 = legendItem29.getToolTipText();
        java.awt.Stroke stroke31 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem29.setOutlineStroke(stroke31);
        java.awt.Shape shape37 = null;
        java.awt.Color color38 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke39 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color40 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem41 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape37, (java.awt.Paint) color38, stroke39, (java.awt.Paint) color40);
        java.lang.Class<?> wildcardClass42 = color38.getClass();
        org.jfree.chart.LegendItem legendItem43 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape21, paint26, stroke31, (java.awt.Paint) color38);
        org.jfree.chart.entity.ChartEntity chartEntity44 = new org.jfree.chart.entity.ChartEntity(shape21);
        java.awt.Color color45 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem46 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape21, (java.awt.Paint) color45);
        legendItem4.setLabelPaint((java.awt.Paint) color45);
        barRenderer1.setBaseLegendTextPaint((java.awt.Paint) color45);
        java.awt.Color color49 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.Color color50 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.color.ColorSpace colorSpace51 = color50.getColorSpace();
        float[] floatArray58 = new float[] { 100.0f, (-8355712), 'a', 'a', (-1), (short) 1 };
        float[] floatArray59 = color49.getColorComponents(colorSpace51, floatArray58);
        float[] floatArray60 = color45.getColorComponents(floatArray59);
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator64 = new org.jfree.chart.util.DefaultShadowGenerator(8, color45, (float) (-739), 3, (double) (byte) -1);
        org.junit.Assert.assertNotNull(paint2);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(shape21);
        org.junit.Assert.assertNotNull(paint26);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(color38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(color45);
        org.junit.Assert.assertNotNull(color49);
        org.junit.Assert.assertNotNull(color50);
        org.junit.Assert.assertNotNull(colorSpace51);
        org.junit.Assert.assertNotNull(floatArray58);
        org.junit.Assert.assertNotNull(floatArray59);
        org.junit.Assert.assertNotNull(floatArray60);
    }

    @Test
    public void test122() throws Throwable {
printRuntimeMSG("---RegressionTest3:test122");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test122");
        org.jfree.chart.util.ObjectList objectList0 = new org.jfree.chart.util.ObjectList();
        java.awt.Paint[] paintArray1 = org.jfree.chart.ChartColor.createDefaultPaintArray();
        java.awt.Paint[] paintArray2 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_PAINT_SEQUENCE;
        java.awt.Paint[] paintArray3 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE;
        java.awt.Stroke[] strokeArray4 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE;
        java.awt.Stroke[] strokeArray5 = org.jfree.chart.plot.DefaultDrawingSupplier.DEFAULT_OUTLINE_STROKE_SEQUENCE;
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
        org.jfree.chart.plot.DefaultDrawingSupplier defaultDrawingSupplier43 = new org.jfree.chart.plot.DefaultDrawingSupplier(paintArray1, paintArray2, paintArray3, strokeArray4, strokeArray5, shapeArray41);
        int int44 = objectList0.indexOf((java.lang.Object) shapeArray41);
        java.lang.Object obj45 = objectList0.clone();
        org.junit.Assert.assertNotNull(paintArray1);
        org.junit.Assert.assertNotNull(paintArray2);
        org.junit.Assert.assertNotNull(paintArray3);
        org.junit.Assert.assertNotNull(strokeArray4);
        org.junit.Assert.assertNotNull(strokeArray5);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test123() throws Throwable {
printRuntimeMSG("---RegressionTest3:test123");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test123");
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
        org.jfree.chart.axis.CategoryAnchor categoryAnchor11 = categoryPlot0.getDomainGridlinePosition();
        java.awt.Graphics2D graphics2D12 = null;
        java.awt.geom.Rectangle2D rectangle2D13 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState16 = null;
        boolean boolean17 = categoryPlot0.render(graphics2D12, rectangle2D13, 4, plotRenderingInfo15, categoryCrosshairState16);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNull(comparable9);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(categoryAnchor11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test124() throws Throwable {
printRuntimeMSG("---RegressionTest3:test124");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test124");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearAnnotations();
        categoryPlot0.setAnchorValue((double) (-8355712));
    }

    @Test
    public void test125() throws Throwable {
printRuntimeMSG("---RegressionTest3:test125");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test125");
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
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint18 = categoryAxis17.getTickLabelPaint();
        categoryAxis17.setFixedDimension((double) 1);
        java.lang.String str21 = categoryAxis17.getLabel();
        java.util.List list22 = categoryPlot1.getCategoriesForAxis(categoryAxis17);
        org.junit.Assert.assertNotNull(shape0);
        org.junit.Assert.assertNotNull(stroke2);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertNull(legendItemCollection6);
        org.junit.Assert.assertNull(comparable7);
        org.junit.Assert.assertNotNull(rectangleEdge8);
        org.junit.Assert.assertNull(categoryItemRenderer12);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(list22);
    }

    @Test
    public void test126() throws Throwable {
printRuntimeMSG("---RegressionTest3:test126");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test126");
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
        org.jfree.chart.util.RectangleInsets rectangleInsets47 = categoryPlot0.getInsets();
        java.awt.Stroke stroke48 = categoryPlot0.getDomainGridlineStroke();
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
        org.junit.Assert.assertNotNull(rectangleInsets47);
        org.junit.Assert.assertNotNull(stroke48);
    }

    @Test
    public void test127() throws Throwable {
printRuntimeMSG("---RegressionTest3:test127");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test127");
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
        int int16 = categoryAxis0.getCategoryLabelPositionOffset();
        java.awt.geom.Rectangle2D rectangle2D19 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke21 = categoryPlot20.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke23 = categoryPlot22.getRangeMinorGridlineStroke();
        categoryPlot20.setParent((org.jfree.chart.plot.Plot) categoryPlot22);
        org.jfree.chart.LegendItemCollection legendItemCollection25 = categoryPlot20.getFixedLegendItems();
        org.jfree.chart.event.AxisChangeEvent axisChangeEvent26 = null;
        categoryPlot20.axisChanged(axisChangeEvent26);
        org.jfree.chart.axis.AxisSpace axisSpace28 = categoryPlot20.getFixedRangeAxisSpace();
        org.jfree.data.category.CategoryDataset categoryDataset29 = null;
        categoryPlot20.setDataset(categoryDataset29);
        java.awt.Stroke stroke31 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        categoryPlot20.setDomainCrosshairStroke(stroke31);
        java.awt.Stroke stroke33 = categoryPlot20.getRangeGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation34 = categoryPlot20.getRangeAxisLocation();
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot20.getDomainAxisEdge();
        try {
            double double36 = categoryAxis0.getCategoryStart((int) ' ', (-16777216), rectangle2D19, rectangleEdge35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(paint14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(stroke21);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNull(legendItemCollection25);
        org.junit.Assert.assertNull(axisSpace28);
        org.junit.Assert.assertNotNull(stroke31);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(axisLocation34);
        org.junit.Assert.assertNotNull(rectangleEdge35);
    }

    @Test
    public void test128() throws Throwable {
printRuntimeMSG("---RegressionTest3:test128");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test128");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        categoryPlot0.clearDomainMarkers((int) (short) 0);
        categoryPlot0.setWeight((int) (byte) 1);
        org.jfree.data.category.CategoryDataset categoryDataset10 = null;
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer11 = categoryPlot0.getRendererForDataset(categoryDataset10);
        org.jfree.chart.axis.AxisLocation axisLocation12 = categoryPlot0.getRangeAxisLocation();
        org.jfree.chart.plot.CategoryMarker categoryMarker13 = null;
        org.jfree.chart.util.Layer layer14 = null;
        try {
            categoryPlot0.addDomainMarker(categoryMarker13, layer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'marker' not permitted.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(categoryItemRenderer11);
        org.junit.Assert.assertNotNull(axisLocation12);
    }

    @Test
    public void test129() throws Throwable {
printRuntimeMSG("---RegressionTest3:test129");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test129");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (short) 10);
        boolean boolean13 = lineAndShapeRenderer2.getAutoPopulateSeriesShape();
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test130() throws Throwable {
printRuntimeMSG("---RegressionTest3:test130");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test130");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        java.awt.Paint paint9 = legendItem8.getLabelPaint();
        java.lang.String str10 = legendItem8.getURLText();
        java.awt.Shape shape11 = legendItem8.getShape();
        boolean boolean12 = legendItem8.isShapeOutlineVisible();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition17 = null;
        lineAndShapeRenderer15.setSeriesPositiveItemLabelPosition(0, itemLabelPosition17);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition20 = lineAndShapeRenderer15.getSeriesPositiveItemLabelPosition((-1));
        java.awt.Paint paint24 = lineAndShapeRenderer15.getItemOutlinePaint((int) (short) 10, (int) (byte) 10, false);
        legendItem8.setOutlinePaint(paint24);
        boolean boolean26 = legendItem8.isLineVisible();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str10.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition20);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test131() throws Throwable {
printRuntimeMSG("---RegressionTest3:test131");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test131");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        java.lang.String str1 = rectangleInsets0.toString();
        double double3 = rectangleInsets0.calculateTopOutset((double) (short) -1);
        double double5 = rectangleInsets0.calculateBottomInset((double) (-196608));
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str1.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
    }

    @Test
    public void test132() throws Throwable {
printRuntimeMSG("---RegressionTest3:test132");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test132");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint2 = renderAttributes0.getSeriesPaint((int) (short) 0);
        java.awt.Paint paint3 = renderAttributes0.getDefaultLabelPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer6 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = null;
        lineAndShapeRenderer6.setSeriesPositiveItemLabelPosition(0, itemLabelPosition8);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition11 = lineAndShapeRenderer6.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean12 = lineAndShapeRenderer6.getUseFillPaint();
        lineAndShapeRenderer6.setDataBoundsIncludesVisibleSeriesOnly(true);
        org.jfree.chart.axis.CategoryAxis categoryAxis15 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint16 = categoryAxis15.getTickLabelPaint();
        categoryAxis15.setFixedDimension((double) 1);
        java.awt.Font font20 = org.jfree.chart.axis.Axis.DEFAULT_AXIS_LABEL_FONT;
        categoryAxis15.setTickLabelFont((java.lang.Comparable) (-12566464), font20);
        java.awt.Font font23 = categoryAxis15.getTickLabelFont((java.lang.Comparable) 100);
        lineAndShapeRenderer6.setBaseItemLabelFont(font23);
        renderAttributes0.setDefaultLabelFont(font23);
        org.junit.Assert.assertNull(paint2);
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertNotNull(itemLabelPosition11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(font23);
    }

    @Test
    public void test133() throws Throwable {
printRuntimeMSG("---RegressionTest3:test133");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test133");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        java.awt.Paint paint9 = legendItem8.getLabelPaint();
        java.lang.String str10 = legendItem8.getURLText();
        java.awt.Shape shape11 = legendItem8.getShape();
        legendItem8.setToolTipText("Category Plot");
        java.awt.Color color14 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        int int15 = color14.getTransparency();
        legendItem8.setLinePaint((java.awt.Paint) color14);
        legendItem8.setDatasetIndex((int) (short) 100);
        java.awt.Shape shape23 = null;
        java.awt.Color color24 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke25 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color26 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem27 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape23, (java.awt.Paint) color24, stroke25, (java.awt.Paint) color26);
        java.awt.Paint paint28 = legendItem27.getLabelPaint();
        org.jfree.chart.LegendItem legendItem30 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer31 = legendItem30.getFillPaintTransformer();
        legendItem27.setFillPaintTransformer(gradientPaintTransformer31);
        java.lang.String str33 = legendItem27.getURLText();
        org.jfree.chart.renderer.category.BarRenderer barRenderer34 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint35 = barRenderer34.getShadowPaint();
        boolean boolean36 = barRenderer34.getBaseSeriesVisible();
        org.jfree.chart.renderer.RenderAttributes renderAttributes37 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint38 = renderAttributes37.getDefaultLabelPaint();
        java.awt.Paint paint41 = renderAttributes37.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke42 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes37.setDefaultStroke(stroke42);
        barRenderer34.setBaseStroke(stroke42, true);
        java.awt.Color color47 = java.awt.Color.WHITE;
        barRenderer34.setSeriesItemLabelPaint(0, (java.awt.Paint) color47);
        legendItem27.setLabelPaint((java.awt.Paint) color47);
        legendItem8.setLinePaint((java.awt.Paint) color47);
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke52 = categoryPlot51.getRangeMinorGridlineStroke();
        legendItem8.setOutlineStroke(stroke52);
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str10.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNull(shape11);
        org.junit.Assert.assertNotNull(color14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(color24);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertNotNull(color26);
        org.junit.Assert.assertNull(paint28);
        org.junit.Assert.assertNotNull(gradientPaintTransformer31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str33.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNotNull(paint35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(paint38);
        org.junit.Assert.assertNull(paint41);
        org.junit.Assert.assertNotNull(stroke42);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(stroke52);
    }

    @Test
    public void test134() throws Throwable {
printRuntimeMSG("---RegressionTest3:test134");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test134");
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
        org.jfree.data.general.DatasetGroup datasetGroup51 = categoryPlot0.getDatasetGroup();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer55 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator56 = lineAndShapeRenderer55.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator60 = lineAndShapeRenderer55.getToolTipGenerator((int) (short) 100, (-1), false);
        java.awt.Font font61 = lineAndShapeRenderer55.getBaseLegendTextFont();
        lineAndShapeRenderer55.setSeriesCreateEntities((int) (byte) 10, (java.lang.Boolean) true, true);
        categoryPlot0.setRenderer(175, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer55, false);
        lineAndShapeRenderer55.setSeriesLinesVisible(4, (java.lang.Boolean) true);
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
        org.junit.Assert.assertNull(datasetGroup51);
        org.junit.Assert.assertNull(categoryItemLabelGenerator56);
        org.junit.Assert.assertNull(categoryToolTipGenerator60);
        org.junit.Assert.assertNull(font61);
    }

    @Test
    public void test135() throws Throwable {
printRuntimeMSG("---RegressionTest3:test135");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test135");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        boolean boolean2 = categoryPlot0.isRangeCrosshairLockedOnData();
        categoryPlot0.setRangeCrosshairVisible(false);
        org.jfree.chart.axis.AxisSpace axisSpace5 = categoryPlot0.getFixedRangeAxisSpace();
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent6 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent6);
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation8 = null;
        try {
            categoryPlot0.addAnnotation(categoryAnnotation8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(axisSpace5);
    }

    @Test
    public void test136() throws Throwable {
printRuntimeMSG("---RegressionTest3:test136");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test136");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        categoryPlot2.clearDomainAxes();
        java.awt.Paint paint11 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_PAINT;
        categoryPlot2.setDomainCrosshairPaint(paint11);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo14 = null;
        java.awt.geom.Point2D point2D15 = null;
        categoryPlot2.panRangeAxes((double) (byte) 0, plotRenderingInfo14, point2D15);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test137() throws Throwable {
printRuntimeMSG("---RegressionTest3:test137");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test137");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        java.lang.String str10 = categoryAxis1.getLabelToolTip();
        java.awt.Paint paint11 = categoryAxis1.getTickLabelPaint();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(paint11);
    }

    @Test
    public void test138() throws Throwable {
printRuntimeMSG("---RegressionTest3:test138");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test138");
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
        boolean boolean10 = categoryPlot0.isRangeZeroBaselineVisible();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        try {
            boolean boolean12 = categoryPlot0.removeAnnotation(categoryAnnotation11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'annotation' argument.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test139() throws Throwable {
printRuntimeMSG("---RegressionTest3:test139");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test139");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = lineAndShapeRenderer2.getPlot();
        org.jfree.chart.annotations.CategoryAnnotation categoryAnnotation11 = null;
        boolean boolean12 = lineAndShapeRenderer2.removeAnnotation(categoryAnnotation11);
        java.awt.Graphics2D graphics2D13 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = null;
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        org.jfree.chart.plot.Marker marker16 = null;
        java.awt.geom.Rectangle2D rectangle2D17 = null;
        lineAndShapeRenderer2.drawRangeMarker(graphics2D13, categoryPlot14, valueAxis15, marker16, rectangle2D17);
        java.awt.Paint paint22 = lineAndShapeRenderer2.getItemFillPaint(0, 8, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition28 = null;
        lineAndShapeRenderer26.setSeriesPositiveItemLabelPosition(0, itemLabelPosition28);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator30 = null;
        lineAndShapeRenderer26.setLegendItemToolTipGenerator(categorySeriesLabelGenerator30);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition32 = lineAndShapeRenderer26.getBasePositiveItemLabelPosition();
        java.awt.Stroke stroke34 = lineAndShapeRenderer26.lookupSeriesOutlineStroke(192);
        lineAndShapeRenderer2.setSeriesOutlineStroke(8, stroke34);
        java.awt.Paint paint36 = lineAndShapeRenderer2.getBaseFillPaint();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(paint22);
        org.junit.Assert.assertNotNull(itemLabelPosition32);
        org.junit.Assert.assertNotNull(stroke34);
        org.junit.Assert.assertNotNull(paint36);
    }

    @Test
    public void test140() throws Throwable {
printRuntimeMSG("---RegressionTest3:test140");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test140");
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
        boolean boolean21 = categoryPlot0.isRangeCrosshairVisible();
        org.jfree.chart.axis.ValueAxis valueAxis22 = null;
        try {
            int int23 = categoryPlot0.getRangeAxisIndex(valueAxis22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Null 'axis' argument.");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test141() throws Throwable {
printRuntimeMSG("---RegressionTest3:test141");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test141");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.util.Layer layer1 = null;
        java.util.Collection collection2 = categoryPlot0.getDomainMarkers(layer1);
        java.awt.Color color3 = java.awt.Color.green;
        categoryPlot0.setBackgroundPaint((java.awt.Paint) color3);
        org.junit.Assert.assertNull(collection2);
        org.junit.Assert.assertNotNull(color3);
    }

    @Test
    public void test142() throws Throwable {
printRuntimeMSG("---RegressionTest3:test142");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test142");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        org.jfree.chart.util.SortOrder sortOrder7 = categoryPlot0.getRowRenderingOrder();
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent8 = null;
        categoryPlot0.rendererChanged(rendererChangeEvent8);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer12 = null;
        categoryPlot10.setRenderer(categoryItemRenderer12);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent14 = null;
        categoryPlot10.datasetChanged(datasetChangeEvent14);
        org.jfree.data.category.CategoryDataset categoryDataset17 = categoryPlot10.getDataset((int) '4');
        org.jfree.chart.axis.CategoryAxis categoryAxis18 = new org.jfree.chart.axis.CategoryAxis();
        double double19 = categoryAxis18.getUpperMargin();
        int int20 = categoryPlot10.getDomainAxisIndex(categoryAxis18);
        java.awt.Paint paint21 = categoryAxis18.getLabelPaint();
        java.awt.Color color22 = java.awt.Color.gray;
        categoryAxis18.setTickLabelPaint((java.awt.Paint) color22);
        categoryPlot0.setRangeGridlinePaint((java.awt.Paint) color22);
        org.jfree.chart.axis.CategoryAxis categoryAxis25 = new org.jfree.chart.axis.CategoryAxis();
        org.jfree.data.category.CategoryDataset categoryDataset26 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis27 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis27.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis30 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator34 = lineAndShapeRenderer33.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot(categoryDataset26, categoryAxis27, valueAxis30, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer33);
        boolean boolean36 = categoryAxis27.isTickLabelsVisible();
        double double37 = categoryAxis27.getFixedDimension();
        java.awt.Paint paint39 = categoryAxis27.getTickLabelPaint((java.lang.Comparable) 4.0d);
        categoryAxis25.setTickLabelPaint(paint39);
        categoryAxis25.setLabelToolTip("hi!");
        float float43 = categoryAxis25.getMinorTickMarkInsideLength();
        int int44 = categoryPlot0.getDomainAxisIndex(categoryAxis25);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(sortOrder7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(categoryDataset17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.05d + "'", double19 == 0.05d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(paint21);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertNull(categoryItemLabelGenerator34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(paint39);
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test143() throws Throwable {
printRuntimeMSG("---RegressionTest3:test143");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test143");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Paint paint4 = renderAttributes0.getItemPaint((int) (short) 1, (int) (byte) 10);
        org.jfree.chart.axis.CategoryAxis categoryAxis5 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis5.setMinorTickMarkOutsideLength((float) (short) 0);
        java.awt.Font font8 = categoryAxis5.getTickLabelFont();
        renderAttributes0.setDefaultLabelFont(font8);
        java.awt.Paint paint11 = renderAttributes0.getSeriesOutlinePaint((int) (byte) -1);
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNotNull(font8);
        org.junit.Assert.assertNull(paint11);
    }

    @Test
    public void test144() throws Throwable {
printRuntimeMSG("---RegressionTest3:test144");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test144");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D7 = null;
        java.awt.geom.Rectangle2D rectangle2D8 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo10 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState11 = null;
        boolean boolean12 = categoryPlot0.render(graphics2D7, rectangle2D8, 0, plotRenderingInfo10, categoryCrosshairState11);
        categoryPlot0.setDomainCrosshairRowKey((java.lang.Comparable) 128);
        categoryPlot0.configureDomainAxes();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test145() throws Throwable {
printRuntimeMSG("---RegressionTest3:test145");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test145");
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
        java.awt.Color color62 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem63 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color62);
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer64 = legendItem63.getFillPaintTransformer();
        legendItem54.setFillPaintTransformer(gradientPaintTransformer64);
        legendItem54.setDescription("");
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
        org.junit.Assert.assertNotNull(color62);
        org.junit.Assert.assertNotNull(gradientPaintTransformer64);
    }

    @Test
    public void test146() throws Throwable {
printRuntimeMSG("---RegressionTest3:test146");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test146");
        java.awt.Color color0 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        int int1 = color0.getTransparency();
        org.jfree.data.KeyedObjects keyedObjects2 = new org.jfree.data.KeyedObjects();
        org.jfree.chart.renderer.RenderAttributes renderAttributes5 = new org.jfree.chart.renderer.RenderAttributes(true);
        keyedObjects2.setObject((java.lang.Comparable) true, (java.lang.Object) true);
        org.jfree.chart.plot.CategoryPlot categoryPlot7 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke8 = categoryPlot7.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation9 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation10 = axisLocation9.getOpposite();
        categoryPlot7.setDomainAxisLocation(axisLocation10, false);
        boolean boolean13 = categoryPlot7.canSelectByRegion();
        categoryPlot7.setForegroundAlpha((float) '#');
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot16.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo19, point2D20);
        categoryPlot16.clearDomainMarkers((int) (short) 0);
        org.jfree.chart.util.SortOrder sortOrder24 = categoryPlot16.getRowRenderingOrder();
        categoryPlot7.setRowRenderingOrder(sortOrder24);
        boolean boolean27 = sortOrder24.equals((java.lang.Object) 4);
        keyedObjects2.sortByObjects(sortOrder24);
        java.awt.Color color29 = java.awt.Color.yellow;
        boolean boolean30 = keyedObjects2.equals((java.lang.Object) color29);
        java.awt.color.ColorSpace colorSpace31 = color29.getColorSpace();
        java.awt.Color color32 = java.awt.Color.MAGENTA;
        java.awt.image.ColorModel colorModel33 = null;
        java.awt.Rectangle rectangle34 = null;
        java.awt.geom.Rectangle2D rectangle2D35 = null;
        java.awt.geom.AffineTransform affineTransform36 = null;
        java.awt.RenderingHints renderingHints37 = null;
        java.awt.PaintContext paintContext38 = color32.createContext(colorModel33, rectangle34, rectangle2D35, affineTransform36, renderingHints37);
        java.awt.Color color39 = java.awt.Color.RED;
        java.awt.Color color40 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.Color color41 = org.jfree.chart.ChartColor.VERY_DARK_MAGENTA;
        java.awt.color.ColorSpace colorSpace42 = color41.getColorSpace();
        float[] floatArray49 = new float[] { 100.0f, (-8355712), 'a', 'a', (-1), (short) 1 };
        float[] floatArray50 = color40.getColorComponents(colorSpace42, floatArray49);
        float[] floatArray51 = color39.getComponents(floatArray50);
        float[] floatArray52 = color32.getColorComponents(floatArray51);
        float[] floatArray53 = color0.getColorComponents(colorSpace31, floatArray51);
        org.junit.Assert.assertNotNull(color0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNotNull(axisLocation9);
        org.junit.Assert.assertNotNull(axisLocation10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(sortOrder24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(colorSpace31);
        org.junit.Assert.assertNotNull(color32);
        org.junit.Assert.assertNotNull(paintContext38);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(color41);
        org.junit.Assert.assertNotNull(colorSpace42);
        org.junit.Assert.assertNotNull(floatArray49);
        org.junit.Assert.assertNotNull(floatArray50);
        org.junit.Assert.assertNotNull(floatArray51);
        org.junit.Assert.assertNotNull(floatArray52);
        org.junit.Assert.assertNotNull(floatArray53);
    }

    @Test
    public void test147() throws Throwable {
printRuntimeMSG("---RegressionTest3:test147");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test147");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Stroke stroke10 = lineAndShapeRenderer2.getSeriesOutlineStroke(192);
        java.awt.Font font12 = lineAndShapeRenderer2.getLegendTextFont((int) (short) 1);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.text.TextAnchor textAnchor14 = itemLabelPosition13.getRotationAnchor();
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNotNull(itemLabelPosition13);
        org.junit.Assert.assertNotNull(textAnchor14);
    }

    @Test
    public void test148() throws Throwable {
printRuntimeMSG("---RegressionTest3:test148");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test148");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = lineAndShapeRenderer2.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = lineAndShapeRenderer2.getSeriesURLGenerator(0);
        double double8 = lineAndShapeRenderer2.getItemMargin();
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator10 = lineAndShapeRenderer2.getSeriesURLGenerator((int) (short) -1);
        java.awt.Stroke stroke12 = lineAndShapeRenderer2.getSeriesStroke(8);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(categoryURLGenerator10);
        org.junit.Assert.assertNull(stroke12);
    }

    @Test
    public void test149() throws Throwable {
printRuntimeMSG("---RegressionTest3:test149");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test149");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer2.setAutoPopulateSeriesShape(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = lineAndShapeRenderer2.getPlot();
        lineAndShapeRenderer2.setUseOutlinePaint(false);
        org.jfree.chart.renderer.RenderAttributes renderAttributes21 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer25 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean27 = lineAndShapeRenderer25.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean28 = lineAndShapeRenderer25.getBaseLinesVisible();
        java.awt.Shape shape29 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer25.setBaseLegendShape(shape29);
        renderAttributes21.setSeriesShape((int) ' ', shape29);
        org.jfree.chart.entity.ChartEntity chartEntity33 = new org.jfree.chart.entity.ChartEntity(shape29, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint34 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color36 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem37 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color36);
        java.lang.String str38 = legendItem37.getToolTipText();
        java.awt.Stroke stroke39 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem37.setOutlineStroke(stroke39);
        java.awt.Shape shape45 = null;
        java.awt.Color color46 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke47 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color48 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem49 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape45, (java.awt.Paint) color46, stroke47, (java.awt.Paint) color48);
        java.lang.Class<?> wildcardClass50 = color46.getClass();
        org.jfree.chart.LegendItem legendItem51 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape29, paint34, stroke39, (java.awt.Paint) color46);
        org.jfree.chart.entity.ChartEntity chartEntity52 = new org.jfree.chart.entity.ChartEntity(shape29);
        java.awt.Color color53 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem54 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape29, (java.awt.Paint) color53);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset57 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity60 = new org.jfree.chart.entity.CategoryItemEntity(shape29, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset57, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        java.lang.String str61 = categoryItemEntity60.toString();
        org.jfree.data.category.CategoryDataset categoryDataset62 = categoryItemEntity60.getDataset();
        org.jfree.data.Range range63 = lineAndShapeRenderer2.findRangeBounds(categoryDataset62);
        java.awt.Stroke stroke64 = lineAndShapeRenderer2.getBaseStroke();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryPlot10);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(shape29);
        org.junit.Assert.assertNotNull(paint34);
        org.junit.Assert.assertNotNull(color36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(color46);
        org.junit.Assert.assertNotNull(stroke47);
        org.junit.Assert.assertNotNull(color48);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(color53);
        org.junit.Assert.assertNotNull(categoryDataset62);
        org.junit.Assert.assertNull(range63);
        org.junit.Assert.assertNotNull(stroke64);
    }

    @Test
    public void test150() throws Throwable {
printRuntimeMSG("---RegressionTest3:test150");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test150");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        categoryPlot2.setForegroundAlpha((float) 100);
        org.jfree.chart.renderer.RenderAttributes renderAttributes15 = new org.jfree.chart.renderer.RenderAttributes();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean21 = lineAndShapeRenderer19.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean22 = lineAndShapeRenderer19.getBaseLinesVisible();
        java.awt.Shape shape23 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer19.setBaseLegendShape(shape23);
        renderAttributes15.setSeriesShape((int) ' ', shape23);
        org.jfree.chart.entity.ChartEntity chartEntity27 = new org.jfree.chart.entity.ChartEntity(shape23, "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        java.awt.Paint paint28 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_PAINT;
        java.awt.Color color30 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem31 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color30);
        java.lang.String str32 = legendItem31.getToolTipText();
        java.awt.Stroke stroke33 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem31.setOutlineStroke(stroke33);
        java.awt.Shape shape39 = null;
        java.awt.Color color40 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke41 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color42 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem43 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape39, (java.awt.Paint) color40, stroke41, (java.awt.Paint) color42);
        java.lang.Class<?> wildcardClass44 = color40.getClass();
        org.jfree.chart.LegendItem legendItem45 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9", "SortOrder.ASCENDING", "GradientPaintTransformType.CENTER_VERTICAL", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape23, paint28, stroke33, (java.awt.Paint) color40);
        org.jfree.chart.entity.ChartEntity chartEntity46 = new org.jfree.chart.entity.ChartEntity(shape23);
        java.awt.Color color47 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem48 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape23, (java.awt.Paint) color47);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset51 = new org.jfree.data.category.DefaultCategoryDataset();
        org.jfree.chart.entity.CategoryItemEntity categoryItemEntity54 = new org.jfree.chart.entity.CategoryItemEntity(shape23, "ItemLabelAnchor.OUTSIDE9", "", (org.jfree.data.category.CategoryDataset) defaultCategoryDataset51, (java.lang.Comparable) (-12566464), (java.lang.Comparable) (byte) 100);
        defaultCategoryDataset51.clearSelection();
        java.util.List list56 = defaultCategoryDataset51.getColumnKeys();
        defaultCategoryDataset51.addValue((double) 100, (java.lang.Comparable) "ChartChangeEventType.GENERAL", (java.lang.Comparable) "UnitType.ABSOLUTE");
        org.jfree.chart.plot.CategoryPlot categoryPlot61 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke62 = categoryPlot61.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer63 = null;
        categoryPlot61.setRenderer(categoryItemRenderer63);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent65 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot61);
        categoryPlot61.setRangeMinorGridlinesVisible(true);
        int int68 = categoryPlot61.getWeight();
        org.jfree.chart.plot.PlotOrientation plotOrientation69 = categoryPlot61.getOrientation();
        boolean boolean70 = categoryPlot61.isRangeCrosshairLockedOnData();
        categoryPlot61.mapDatasetToDomainAxis((int) (short) 0, (int) (byte) 100);
        org.jfree.chart.axis.AxisLocation axisLocation74 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation75 = axisLocation74.getOpposite();
        categoryPlot61.setRangeAxisLocation(axisLocation74, false);
        boolean boolean78 = defaultCategoryDataset51.equals((java.lang.Object) axisLocation74);
        categoryPlot2.setDataset((org.jfree.data.category.CategoryDataset) defaultCategoryDataset51);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(shape23);
        org.junit.Assert.assertNotNull(paint28);
        org.junit.Assert.assertNotNull(color30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertNotNull(color40);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(color47);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(stroke62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(plotOrientation69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(axisLocation74);
        org.junit.Assert.assertNotNull(axisLocation75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test151() throws Throwable {
printRuntimeMSG("---RegressionTest3:test151");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test151");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        categoryAxis0.setLabel("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]");
        float float5 = categoryAxis0.getMinorTickMarkInsideLength();
        categoryAxis0.setLabelURL("DatasetRenderingOrder.FORWARD");
        org.jfree.chart.plot.CategoryPlot categoryPlot8 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke9 = categoryPlot8.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        categoryPlot8.setParent((org.jfree.chart.plot.Plot) categoryPlot10);
        org.jfree.chart.LegendItemCollection legendItemCollection13 = categoryPlot8.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier14 = categoryPlot8.getDrawingSupplier();
        java.awt.Stroke stroke15 = categoryPlot8.getOutlineStroke();
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis();
        java.util.List list17 = categoryPlot8.getCategoriesForAxis(categoryAxis16);
        boolean boolean18 = categoryPlot8.isDomainZoomable();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator22 = lineAndShapeRenderer21.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator23 = null;
        lineAndShapeRenderer21.setBaseToolTipGenerator(categoryToolTipGenerator23);
        java.awt.Font font26 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer21.setSeriesItemLabelFont((int) (short) 0, font26, true);
        java.lang.Boolean boolean30 = lineAndShapeRenderer21.getSeriesCreateEntities((int) 'a');
        java.awt.Paint paint31 = lineAndShapeRenderer21.getBaseItemLabelPaint();
        int int32 = categoryPlot8.getIndexOf((org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer21);
        org.jfree.chart.LegendItemCollection legendItemCollection33 = categoryPlot8.getLegendItems();
        categoryAxis0.addChangeListener((org.jfree.chart.event.AxisChangeListener) categoryPlot8);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(stroke9);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNull(legendItemCollection13);
        org.junit.Assert.assertNotNull(drawingSupplier14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator22);
        org.junit.Assert.assertNotNull(font26);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(paint31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(legendItemCollection33);
    }

    @Test
    public void test152() throws Throwable {
printRuntimeMSG("---RegressionTest3:test152");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test152");
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
        org.jfree.data.category.CategoryDataset categoryDataset15 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis16 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis16.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis19 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator23 = lineAndShapeRenderer22.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot(categoryDataset15, categoryAxis16, valueAxis19, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer22);
        boolean boolean25 = categoryAxis16.isTickLabelsVisible();
        double double26 = categoryAxis16.getFixedDimension();
        java.lang.Object obj27 = categoryAxis16.clone();
        categoryAxis16.setLabelToolTip("DatasetRenderingOrder.FORWARD");
        boolean boolean30 = categoryAxis16.isTickLabelsVisible();
        boolean boolean31 = keyedObjects2D0.equals((java.lang.Object) categoryAxis16);
        int int33 = keyedObjects2D0.getRowIndex((java.lang.Comparable) "");
        org.junit.Assert.assertNotNull(list1);
        org.junit.Assert.assertNotNull(paint3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(paint6);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(stroke10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test153() throws Throwable {
printRuntimeMSG("---RegressionTest3:test153");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test153");
        org.jfree.chart.LegendItem legendItem1 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
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
        java.awt.Color color42 = org.jfree.chart.ChartColor.DARK_RED;
        org.jfree.chart.LegendItem legendItem43 = new org.jfree.chart.LegendItem("hi!", "GradientPaintTransformType.CENTER_VERTICAL", "", "", shape18, (java.awt.Paint) color42);
        legendItem1.setLabelPaint((java.awt.Paint) color42);
        int int45 = color42.getBlue();
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
        org.junit.Assert.assertNotNull(color42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test154() throws Throwable {
printRuntimeMSG("---RegressionTest3:test154");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test154");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator10 = null;
        lineAndShapeRenderer2.setSeriesItemLabelGenerator(3, categoryItemLabelGenerator10);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
    }

    @Test
    public void test155() throws Throwable {
printRuntimeMSG("---RegressionTest3:test155");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test155");
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
        java.awt.geom.Rectangle2D rectangle2D51 = null;
        org.jfree.chart.RenderingSource renderingSource52 = null;
        categoryPlot0.select(0.05d, (double) ' ', rectangle2D51, renderingSource52);
        int int54 = categoryPlot0.getRendererCount();
        java.lang.String str55 = categoryPlot0.getNoDataMessage();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test156() throws Throwable {
printRuntimeMSG("---RegressionTest3:test156");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test156");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        boolean boolean2 = barRenderer0.getBaseSeriesVisible();
        org.jfree.chart.renderer.RenderAttributes renderAttributes3 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint4 = renderAttributes3.getDefaultLabelPaint();
        java.awt.Paint paint7 = renderAttributes3.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke8 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes3.setDefaultStroke(stroke8);
        barRenderer0.setBaseStroke(stroke8, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition12 = barRenderer0.getNegativeItemLabelPositionFallback();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer15 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer15.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean18 = lineAndShapeRenderer15.getBaseLinesVisible();
        lineAndShapeRenderer15.setAutoPopulateSeriesPaint(false);
        boolean boolean21 = lineAndShapeRenderer15.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator22 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        lineAndShapeRenderer15.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator22);
        barRenderer0.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator22);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertNull(itemLabelPosition12);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test157() throws Throwable {
printRuntimeMSG("---RegressionTest3:test157");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test157");
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
        barRenderer6.setAutoPopulateSeriesFillPaint(true);
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
    public void test158() throws Throwable {
printRuntimeMSG("---RegressionTest3:test158");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test158");
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
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent14 = null;
        categoryPlot0.annotationChanged(annotationChangeEvent14);
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotOrientation plotOrientation17 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        categoryPlot16.setOrientation(plotOrientation17);
        categoryPlot0.setOrientation(plotOrientation17);
        org.jfree.data.category.CategoryDataset categoryDataset20 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis21 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis21.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis24 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = lineAndShapeRenderer27.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot29 = new org.jfree.chart.plot.CategoryPlot(categoryDataset20, categoryAxis21, valueAxis24, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer27);
        boolean boolean30 = categoryAxis21.isTickLabelsVisible();
        double double31 = categoryAxis21.getFixedDimension();
        java.lang.Object obj32 = categoryAxis21.clone();
        java.awt.Paint paint33 = categoryAxis21.getLabelPaint();
        boolean boolean34 = plotOrientation17.equals((java.lang.Object) categoryAxis21);
        org.jfree.chart.plot.CategoryPlot categoryPlot35 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke36 = categoryPlot35.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation37 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation38 = axisLocation37.getOpposite();
        categoryPlot35.setDomainAxisLocation(axisLocation38, false);
        boolean boolean41 = categoryPlot35.canSelectByRegion();
        categoryPlot35.setForegroundAlpha((float) '#');
        categoryAxis21.removeChangeListener((org.jfree.chart.event.AxisChangeListener) categoryPlot35);
        org.jfree.chart.util.SortOrder sortOrder45 = categoryPlot35.getColumnRenderingOrder();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(plotOrientation17);
        org.junit.Assert.assertNull(categoryItemLabelGenerator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(paint33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(stroke36);
        org.junit.Assert.assertNotNull(axisLocation37);
        org.junit.Assert.assertNotNull(axisLocation38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(sortOrder45);
    }

    @Test
    public void test159() throws Throwable {
printRuntimeMSG("---RegressionTest3:test159");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test159");
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
        boolean boolean35 = legendItem34.isShapeFilled();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test160() throws Throwable {
printRuntimeMSG("---RegressionTest3:test160");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test160");
        org.jfree.chart.util.DefaultShadowGenerator defaultShadowGenerator0 = new org.jfree.chart.util.DefaultShadowGenerator();
        float float1 = defaultShadowGenerator0.getShadowOpacity();
        double double2 = defaultShadowGenerator0.getAngle();
        double double3 = defaultShadowGenerator0.getAngle();
        float float4 = defaultShadowGenerator0.getShadowOpacity();
        float float5 = defaultShadowGenerator0.getShadowOpacity();
        java.awt.Color color6 = defaultShadowGenerator0.getShadowColor();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-0.7853981633974483d) + "'", double2 == (-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-0.7853981633974483d) + "'", double3 == (-0.7853981633974483d));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.5f + "'", float5 == 0.5f);
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test161() throws Throwable {
printRuntimeMSG("---RegressionTest3:test161");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test161");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        lineAndShapeRenderer2.clearSeriesStrokes(false);
        int int10 = lineAndShapeRenderer2.getRowCount();
        boolean boolean11 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        java.awt.Shape shape13 = lineAndShapeRenderer2.getSeriesShape((-2));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(shape13);
    }

    @Test
    public void test162() throws Throwable {
printRuntimeMSG("---RegressionTest3:test162");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test162");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.LegendItemCollection legendItemCollection8 = categoryPlot0.getFixedLegendItems();
        boolean boolean9 = categoryPlot0.isRangePannable();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(legendItemCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test163() throws Throwable {
printRuntimeMSG("---RegressionTest3:test163");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test163");
        java.awt.Color color1 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem2 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color1);
        java.lang.String str3 = legendItem2.getToolTipText();
        java.awt.Stroke stroke4 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        legendItem2.setOutlineStroke(stroke4);
        boolean boolean6 = legendItem2.isShapeFilled();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(stroke4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test164() throws Throwable {
printRuntimeMSG("---RegressionTest3:test164");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test164");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        java.awt.Shape shape6 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer2.setBaseLegendShape(shape6);
        org.jfree.chart.axis.CategoryAxis categoryAxis9 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis9.setCategoryMargin((double) 10.0f);
        java.awt.Font font12 = categoryAxis9.getTickLabelFont();
        lineAndShapeRenderer2.setSeriesItemLabelFont(15, font12, true);
        double double15 = lineAndShapeRenderer2.getItemMargin();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(font12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test165() throws Throwable {
printRuntimeMSG("---RegressionTest3:test165");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test165");
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
        org.jfree.chart.plot.Plot plot49 = plotEntity48.getPlot();
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
        org.junit.Assert.assertNotNull(plot49);
    }

    @Test
    public void test166() throws Throwable {
printRuntimeMSG("---RegressionTest3:test166");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test166");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        float float3 = categoryAxis0.getMinorTickMarkInsideLength();
        categoryAxis0.setMinorTickMarkInsideLength(100.0f);
        java.awt.Paint paint6 = categoryAxis0.getTickMarkPaint();
        categoryAxis0.setLabelAngle((double) (byte) 1);
        java.lang.String str10 = categoryAxis0.getCategoryLabelToolTip((java.lang.Comparable) 100L);
        java.awt.Graphics2D graphics2D11 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo15 = null;
        java.awt.geom.Point2D point2D16 = null;
        categoryPlot12.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo15, point2D16);
        categoryPlot12.clearAnnotations();
        categoryPlot12.setCrosshairDatasetIndex(192, false);
        java.awt.geom.Rectangle2D rectangle2D22 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot23 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke24 = categoryPlot23.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer25 = null;
        categoryPlot23.setRenderer(categoryItemRenderer25);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent27 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot23);
        categoryPlot23.setRangeMinorGridlinesVisible(true);
        java.awt.Graphics2D graphics2D30 = null;
        java.awt.geom.Rectangle2D rectangle2D31 = null;
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo33 = null;
        org.jfree.chart.plot.CategoryCrosshairState categoryCrosshairState34 = null;
        boolean boolean35 = categoryPlot23.render(graphics2D30, rectangle2D31, 0, plotRenderingInfo33, categoryCrosshairState34);
        boolean boolean36 = categoryPlot23.isDomainCrosshairVisible();
        int int37 = categoryPlot23.getWeight();
        org.jfree.chart.plot.CategoryPlot categoryPlot38 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke39 = categoryPlot38.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot40 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke41 = categoryPlot40.getRangeMinorGridlineStroke();
        categoryPlot38.setParent((org.jfree.chart.plot.Plot) categoryPlot40);
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent43 = null;
        categoryPlot40.annotationChanged(annotationChangeEvent43);
        categoryPlot40.setCrosshairDatasetIndex((int) (byte) -1, false);
        boolean boolean48 = categoryPlot23.equals((java.lang.Object) categoryPlot40);
        org.jfree.chart.util.RectangleEdge rectangleEdge49 = categoryPlot23.getRangeAxisEdge();
        org.jfree.chart.axis.AxisSpace axisSpace50 = null;
        try {
            org.jfree.chart.axis.AxisSpace axisSpace51 = categoryAxis0.reserveSpace(graphics2D11, (org.jfree.chart.plot.Plot) categoryPlot12, rectangle2D22, rectangleEdge49, axisSpace50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertNotNull(paint6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(stroke39);
        org.junit.Assert.assertNotNull(stroke41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(rectangleEdge49);
    }

    @Test
    public void test167() throws Throwable {
printRuntimeMSG("---RegressionTest3:test167");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test167");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        java.awt.Paint paint10 = barRenderer0.getShadowPaint();
        org.jfree.chart.renderer.category.BarPainter barPainter11 = barRenderer0.getBarPainter();
        org.jfree.chart.LegendItem legendItem14 = barRenderer0.getLegendItem((int) (byte) 1, 8);
        boolean boolean15 = barRenderer0.getShadowsVisible();
        boolean boolean16 = barRenderer0.getShadowsVisible();
        org.jfree.chart.LegendItem legendItem19 = barRenderer0.getLegendItem(192, 175);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(paint10);
        org.junit.Assert.assertNotNull(barPainter11);
        org.junit.Assert.assertNull(legendItem14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(legendItem19);
    }

    @Test
    public void test168() throws Throwable {
printRuntimeMSG("---RegressionTest3:test168");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test168");
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
        barRenderer0.setShadowYOffset((double) 15);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator18 = null;
        barRenderer0.setSeriesItemLabelGenerator(0, categoryItemLabelGenerator18, false);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(paint4);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNotNull(stroke8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test169() throws Throwable {
printRuntimeMSG("---RegressionTest3:test169");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test169");
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
        org.jfree.chart.axis.AxisLocation axisLocation19 = categoryPlot0.getRangeAxisLocation();
        java.lang.String str20 = axisLocation19.toString();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(axisLocation19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "AxisLocation.TOP_OR_LEFT" + "'", str20.equals("AxisLocation.TOP_OR_LEFT"));
    }

    @Test
    public void test170() throws Throwable {
printRuntimeMSG("---RegressionTest3:test170");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test170");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        java.awt.Font font7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 0, font7, true);
        java.lang.Boolean boolean11 = lineAndShapeRenderer2.getSeriesCreateEntities((int) 'a');
        org.jfree.chart.event.RendererChangeEvent rendererChangeEvent12 = null;
        lineAndShapeRenderer2.notifyListeners(rendererChangeEvent12);
        org.jfree.chart.plot.CategoryPlot categoryPlot14 = lineAndShapeRenderer2.getPlot();
        lineAndShapeRenderer2.setBaseLinesVisible(false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer19 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean21 = lineAndShapeRenderer19.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean22 = lineAndShapeRenderer19.getBaseLinesVisible();
        lineAndShapeRenderer19.setAutoPopulateSeriesPaint(false);
        boolean boolean25 = lineAndShapeRenderer19.getAutoPopulateSeriesPaint();
        boolean boolean26 = lineAndShapeRenderer19.getBaseCreateEntities();
        java.awt.Color color28 = org.jfree.chart.ChartColor.VERY_DARK_CYAN;
        lineAndShapeRenderer19.setSeriesPaint((int) '4', (java.awt.Paint) color28, true);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean35 = lineAndShapeRenderer33.getSeriesItemLabelsVisible((int) (short) 100);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition39 = lineAndShapeRenderer33.getNegativeItemLabelPosition((int) '4', (int) '4', false);
        lineAndShapeRenderer33.setDefaultEntityRadius(3);
        java.awt.Font font43 = lineAndShapeRenderer33.lookupLegendTextFont((int) (short) 100);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer46 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean48 = lineAndShapeRenderer46.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean49 = lineAndShapeRenderer46.getBaseLinesVisible();
        lineAndShapeRenderer46.setAutoPopulateSeriesPaint(false);
        boolean boolean52 = lineAndShapeRenderer46.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.StandardCategorySeriesLabelGenerator standardCategorySeriesLabelGenerator53 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
        lineAndShapeRenderer46.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator53);
        java.lang.Object obj55 = standardCategorySeriesLabelGenerator53.clone();
        lineAndShapeRenderer33.setLegendItemToolTipGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator53);
        lineAndShapeRenderer19.setLegendItemLabelGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator53);
        lineAndShapeRenderer2.setLegendItemURLGenerator((org.jfree.chart.labels.CategorySeriesLabelGenerator) standardCategorySeriesLabelGenerator53);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(categoryPlot14);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertNotNull(itemLabelPosition39);
        org.junit.Assert.assertNull(font43);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(obj55);
    }

    @Test
    public void test171() throws Throwable {
printRuntimeMSG("---RegressionTest3:test171");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test171");
        org.jfree.chart.util.RectangleInsets rectangleInsets0 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double1 = rectangleInsets0.getRight();
        double double3 = rectangleInsets0.calculateRightOutset(0.05d);
        double double5 = rectangleInsets0.extendWidth((double) (-65536));
        org.junit.Assert.assertNotNull(rectangleInsets0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.0d + "'", double1 == 4.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-65528.0d) + "'", double5 == (-65528.0d));
    }

    @Test
    public void test172() throws Throwable {
printRuntimeMSG("---RegressionTest3:test172");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test172");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.LegendItemCollection legendItemCollection5 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier6 = categoryPlot0.getDrawingSupplier();
        java.awt.Stroke stroke7 = categoryPlot0.getOutlineStroke();
        org.jfree.chart.axis.CategoryAnchor categoryAnchor8 = categoryPlot0.getDomainGridlinePosition();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer11 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition13 = null;
        lineAndShapeRenderer11.setSeriesPositiveItemLabelPosition(0, itemLabelPosition13);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition16 = lineAndShapeRenderer11.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean17 = lineAndShapeRenderer11.getUseFillPaint();
        lineAndShapeRenderer11.setDataBoundsIncludesVisibleSeriesOnly(true);
        java.awt.Stroke stroke20 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        lineAndShapeRenderer11.setBaseStroke(stroke20, false);
        categoryPlot0.setRangeMinorGridlineStroke(stroke20);
        java.awt.Stroke stroke24 = categoryPlot0.getRangeGridlineStroke();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo26 = null;
        java.awt.geom.Point2D point2D27 = null;
        categoryPlot0.zoomRangeAxes((double) (short) 1, plotRenderingInfo26, point2D27);
        java.awt.Paint paint29 = categoryPlot0.getOutlinePaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(categoryAnchor8);
        org.junit.Assert.assertNotNull(itemLabelPosition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertNotNull(paint29);
    }

    @Test
    public void test173() throws Throwable {
printRuntimeMSG("---RegressionTest3:test173");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test173");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        java.awt.Paint paint5 = lineAndShapeRenderer2.lookupSeriesFillPaint((int) (short) 100);
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator7 = lineAndShapeRenderer2.getSeriesURLGenerator(0);
        lineAndShapeRenderer2.setItemLabelAnchorOffset((double) '4');
        org.jfree.chart.plot.CategoryPlot categoryPlot10 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke11 = categoryPlot10.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot12 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke13 = categoryPlot12.getRangeMinorGridlineStroke();
        categoryPlot10.setParent((org.jfree.chart.plot.Plot) categoryPlot12);
        org.jfree.chart.LegendItemCollection legendItemCollection15 = categoryPlot10.getFixedLegendItems();
        java.lang.Comparable comparable16 = categoryPlot10.getDomainCrosshairRowKey();
        org.jfree.data.category.CategoryDataset categoryDataset18 = categoryPlot10.getDataset((int) (short) 1);
        categoryPlot10.setRangeCrosshairLockedOnData(false);
        categoryPlot10.setBackgroundImageAlignment(1);
        org.jfree.chart.renderer.RenderAttributes renderAttributes23 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint24 = renderAttributes23.getDefaultLabelPaint();
        java.awt.Stroke stroke27 = renderAttributes23.getItemStroke((int) (byte) 10, (int) 'a');
        org.jfree.chart.renderer.RenderAttributes renderAttributes28 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint29 = renderAttributes28.getDefaultLabelPaint();
        java.awt.Paint paint32 = renderAttributes28.getItemPaint((int) (short) 1, (int) (byte) 10);
        java.awt.Stroke stroke33 = org.jfree.chart.plot.CategoryPlot.DEFAULT_CROSSHAIR_STROKE;
        renderAttributes28.setDefaultStroke(stroke33);
        renderAttributes23.setDefaultOutlineStroke(stroke33);
        categoryPlot10.setDomainCrosshairStroke(stroke33);
        lineAndShapeRenderer2.setBaseOutlineStroke(stroke33, false);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator39 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator39);
        org.jfree.chart.axis.CategoryAxis categoryAxis41 = new org.jfree.chart.axis.CategoryAxis();
        double double42 = categoryAxis41.getUpperMargin();
        java.awt.Font font44 = categoryAxis41.getTickLabelFont((java.lang.Comparable) 3);
        lineAndShapeRenderer2.setBaseLegendTextFont(font44);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(paint5);
        org.junit.Assert.assertNull(categoryURLGenerator7);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNull(legendItemCollection15);
        org.junit.Assert.assertNull(comparable16);
        org.junit.Assert.assertNull(categoryDataset18);
        org.junit.Assert.assertNull(paint24);
        org.junit.Assert.assertNull(stroke27);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNull(paint32);
        org.junit.Assert.assertNotNull(stroke33);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.05d + "'", double42 == 0.05d);
        org.junit.Assert.assertNotNull(font44);
    }

    @Test
    public void test174() throws Throwable {
printRuntimeMSG("---RegressionTest3:test174");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test174");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator4 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator4);
        java.awt.Font font7 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer2.setSeriesItemLabelFont((int) (short) 0, font7, true);
        lineAndShapeRenderer2.setUseSeriesOffset(true);
        int int12 = lineAndShapeRenderer2.getDefaultEntityRadius();
        java.awt.Paint paint13 = lineAndShapeRenderer2.getBaseLegendTextPaint();
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator14 = lineAndShapeRenderer2.getLegendItemLabelGenerator();
        java.awt.Font font18 = lineAndShapeRenderer2.getItemLabelFont((-1), (-10), false);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(font7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(paint13);
        org.junit.Assert.assertNotNull(categorySeriesLabelGenerator14);
        org.junit.Assert.assertNotNull(font18);
    }

    @Test
    public void test175() throws Throwable {
printRuntimeMSG("---RegressionTest3:test175");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test175");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint2 = renderAttributes0.getSeriesPaint(10);
        java.awt.Paint paint4 = null;
        try {
            renderAttributes0.setSeriesPaint((-1), paint4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(paint2);
    }

    @Test
    public void test176() throws Throwable {
printRuntimeMSG("---RegressionTest3:test176");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test176");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition7 = lineAndShapeRenderer2.getSeriesPositiveItemLabelPosition((-1));
        java.awt.Paint paint11 = lineAndShapeRenderer2.getItemOutlinePaint((int) (short) 10, (int) (byte) 10, false);
        lineAndShapeRenderer2.setDrawOutlines(true);
        java.awt.Shape shape15 = lineAndShapeRenderer2.getLegendShape(3);
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator16 = null;
        lineAndShapeRenderer2.setBaseToolTipGenerator(categoryToolTipGenerator16);
        org.junit.Assert.assertNotNull(itemLabelPosition7);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(shape15);
    }

    @Test
    public void test177() throws Throwable {
printRuntimeMSG("---RegressionTest3:test177");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test177");
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
        org.jfree.chart.plot.Plot plot11 = categoryPlot0.getParent();
        java.awt.Stroke stroke12 = categoryPlot0.getRangeZeroBaselineStroke();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(plot11);
        org.junit.Assert.assertNotNull(stroke12);
    }

    @Test
    public void test178() throws Throwable {
printRuntimeMSG("---RegressionTest3:test178");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test178");
        java.awt.Shape shape4 = null;
        java.awt.Color color5 = org.jfree.chart.ChartColor.VERY_DARK_GREEN;
        java.awt.Stroke stroke6 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        java.awt.Color color7 = java.awt.Color.RED;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", "", "", "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT", shape4, (java.awt.Paint) color5, stroke6, (java.awt.Paint) color7);
        java.awt.Paint paint9 = legendItem8.getLabelPaint();
        org.jfree.chart.LegendItem legendItem11 = new org.jfree.chart.LegendItem("ItemLabelAnchor.OUTSIDE9");
        org.jfree.chart.util.GradientPaintTransformer gradientPaintTransformer12 = legendItem11.getFillPaintTransformer();
        legendItem8.setFillPaintTransformer(gradientPaintTransformer12);
        java.lang.String str14 = legendItem8.getURLText();
        legendItem8.setLineVisible(false);
        legendItem8.setSeriesKey((java.lang.Comparable) "ItemLabelAnchor.INSIDE4");
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType19 = org.jfree.chart.util.GradientPaintTransformType.CENTER_VERTICAL;
        org.jfree.chart.util.StandardGradientPaintTransformer standardGradientPaintTransformer20 = new org.jfree.chart.util.StandardGradientPaintTransformer(gradientPaintTransformType19);
        legendItem8.setFillPaintTransformer((org.jfree.chart.util.GradientPaintTransformer) standardGradientPaintTransformer20);
        org.jfree.chart.util.GradientPaintTransformType gradientPaintTransformType22 = standardGradientPaintTransformer20.getType();
        org.junit.Assert.assertNotNull(color5);
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(gradientPaintTransformer12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT" + "'", str14.equals("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertNotNull(gradientPaintTransformType19);
        org.junit.Assert.assertNotNull(gradientPaintTransformType22);
    }

    @Test
    public void test179() throws Throwable {
printRuntimeMSG("---RegressionTest3:test179");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test179");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition5 = lineAndShapeRenderer2.getSeriesNegativeItemLabelPosition(192);
        java.awt.Shape shape6 = lineAndShapeRenderer2.getBaseShape();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getNegativeItemLabelPosition((int) (byte) -1, (-8355712), true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNotNull(itemLabelPosition5);
        org.junit.Assert.assertNotNull(shape6);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
    }

    @Test
    public void test180() throws Throwable {
printRuntimeMSG("---RegressionTest3:test180");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test180");
        java.lang.Number number0 = null;
        org.jfree.data.SelectableValue selectableValue1 = new org.jfree.data.SelectableValue(number0);
        selectableValue1.setSelected(true);
        boolean boolean4 = selectableValue1.isSelected();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test181() throws Throwable {
printRuntimeMSG("---RegressionTest3:test181");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test181");
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
        java.lang.String str49 = categoryItemEntity47.getToolTipText();
        org.jfree.chart.util.UnitType unitType50 = org.jfree.chart.util.UnitType.ABSOLUTE;
        org.jfree.chart.plot.CategoryPlot categoryPlot51 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke52 = categoryPlot51.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot53 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke54 = categoryPlot53.getRangeMinorGridlineStroke();
        categoryPlot51.setParent((org.jfree.chart.plot.Plot) categoryPlot53);
        org.jfree.chart.LegendItemCollection legendItemCollection56 = categoryPlot51.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier57 = categoryPlot51.getDrawingSupplier();
        java.awt.Stroke stroke58 = categoryPlot51.getOutlineStroke();
        boolean boolean59 = unitType50.equals((java.lang.Object) categoryPlot51);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo62 = null;
        java.awt.geom.Point2D point2D63 = null;
        categoryPlot51.zoomRangeAxes(0.0d, (double) (byte) -1, plotRenderingInfo62, point2D63);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer67 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean69 = lineAndShapeRenderer67.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean70 = lineAndShapeRenderer67.getBaseLinesVisible();
        java.awt.Shape shape71 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer67.setBaseLegendShape(shape71);
        java.awt.Color color73 = org.jfree.chart.ChartColor.LIGHT_MAGENTA;
        lineAndShapeRenderer67.setBaseOutlinePaint((java.awt.Paint) color73, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer78 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition80 = null;
        lineAndShapeRenderer78.setSeriesPositiveItemLabelPosition(0, itemLabelPosition80);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition83 = lineAndShapeRenderer78.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean84 = lineAndShapeRenderer78.getUseFillPaint();
        lineAndShapeRenderer78.setDataBoundsIncludesVisibleSeriesOnly(true);
        java.awt.Stroke stroke87 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        lineAndShapeRenderer78.setBaseStroke(stroke87, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray90 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { lineAndShapeRenderer67, lineAndShapeRenderer78 };
        categoryPlot51.setRenderers(categoryItemRendererArray90);
        categoryPlot51.setForegroundAlpha((float) 5);
        org.jfree.chart.event.PlotChangeListener plotChangeListener94 = null;
        categoryPlot51.removeChangeListener(plotChangeListener94);
        boolean boolean96 = categoryItemEntity47.equals((java.lang.Object) plotChangeListener94);
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
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "ItemLabelAnchor.OUTSIDE9" + "'", str49.equals("ItemLabelAnchor.OUTSIDE9"));
        org.junit.Assert.assertNotNull(unitType50);
        org.junit.Assert.assertNotNull(stroke52);
        org.junit.Assert.assertNotNull(stroke54);
        org.junit.Assert.assertNull(legendItemCollection56);
        org.junit.Assert.assertNotNull(drawingSupplier57);
        org.junit.Assert.assertNotNull(stroke58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(boolean69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(shape71);
        org.junit.Assert.assertNotNull(color73);
        org.junit.Assert.assertNotNull(itemLabelPosition83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(stroke87);
        org.junit.Assert.assertNotNull(categoryItemRendererArray90);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test182() throws Throwable {
printRuntimeMSG("---RegressionTest3:test182");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test182");
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
        categoryAxis6.setLabelURL("org.jfree.data.UnknownKeyException: TextAnchor.HALF_ASCENT_LEFT");
        java.awt.Font font20 = categoryAxis6.getLabelFont();
        java.awt.Paint paint21 = categoryAxis6.getAxisLinePaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryItemLabelGenerator13);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(color16);
        org.junit.Assert.assertNotNull(font20);
        org.junit.Assert.assertNotNull(paint21);
    }

    @Test
    public void test183() throws Throwable {
printRuntimeMSG("---RegressionTest3:test183");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test183");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.axis.AxisLocation axisLocation2 = org.jfree.chart.axis.AxisLocation.BOTTOM_OR_RIGHT;
        org.jfree.chart.axis.AxisLocation axisLocation3 = axisLocation2.getOpposite();
        categoryPlot0.setDomainAxisLocation(axisLocation3, false);
        boolean boolean6 = categoryPlot0.canSelectByRegion();
        categoryPlot0.setForegroundAlpha((float) '#');
        java.awt.Paint paint9 = categoryPlot0.getRangeZeroBaselinePaint();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(axisLocation2);
        org.junit.Assert.assertNotNull(axisLocation3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(paint9);
    }

    @Test
    public void test184() throws Throwable {
printRuntimeMSG("---RegressionTest3:test184");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test184");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        categoryAxis1.setLabelToolTip("hi!");
        float float13 = categoryAxis1.getTickMarkInsideLength();
        float float14 = categoryAxis1.getTickMarkInsideLength();
        float float15 = categoryAxis1.getMinorTickMarkInsideLength();
        java.awt.geom.Rectangle2D rectangle2D21 = null;
        org.jfree.chart.plot.CategoryPlot categoryPlot22 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke23 = categoryPlot22.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot24 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke25 = categoryPlot24.getRangeMinorGridlineStroke();
        categoryPlot22.setParent((org.jfree.chart.plot.Plot) categoryPlot24);
        categoryPlot24.setDomainCrosshairColumnKey((java.lang.Comparable) (-1L), true);
        categoryPlot24.mapDatasetToRangeAxis((int) 'a', (int) (short) 0);
        boolean boolean33 = categoryPlot24.isRangeCrosshairVisible();
        org.jfree.chart.util.RectangleEdge rectangleEdge35 = categoryPlot24.getDomainAxisEdge(0);
        try {
            double double36 = categoryAxis1.getCategorySeriesMiddle(100, (int) (short) 0, (int) (short) 1, 10, (double) (short) 100, rectangle2D21, rectangleEdge35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertNotNull(stroke23);
        org.junit.Assert.assertNotNull(stroke25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(rectangleEdge35);
    }

    @Test
    public void test185() throws Throwable {
printRuntimeMSG("---RegressionTest3:test185");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test185");
        try {
            org.jfree.chart.ChartColor chartColor3 = new org.jfree.chart.ChartColor((-196608), 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Color parameter outside of expected range: Red Blue");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
printRuntimeMSG("---RegressionTest3:test186");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test186");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.data.event.DatasetChangeEvent datasetChangeEvent4 = null;
        categoryPlot0.datasetChanged(datasetChangeEvent4);
        org.jfree.chart.axis.CategoryAxis categoryAxis7 = null;
        categoryPlot0.setDomainAxis((int) ' ', categoryAxis7, true);
        boolean boolean10 = categoryPlot0.isOutlineVisible();
        org.jfree.chart.axis.ValueAxis valueAxis11 = categoryPlot0.getRangeAxis();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(valueAxis11);
    }

    @Test
    public void test187() throws Throwable {
printRuntimeMSG("---RegressionTest3:test187");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test187");
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
        categoryPlot0.setRangeCrosshairValue((double) 100L, false);
        org.jfree.chart.axis.CategoryAxis categoryAxis14 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis14.setMinorTickMarkOutsideLength((float) (short) 0);
        float float17 = categoryAxis14.getMinorTickMarkInsideLength();
        java.awt.Stroke stroke18 = categoryAxis14.getTickMarkStroke();
        categoryPlot0.setDomainAxis(categoryAxis14);
        categoryAxis14.configure();
        categoryAxis14.setLabelAngle((double) (-15935));
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNotNull(stroke18);
    }

    @Test
    public void test188() throws Throwable {
printRuntimeMSG("---RegressionTest3:test188");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test188");
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
        boolean boolean16 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.axis.ValueAxis valueAxis18 = categoryPlot0.getRangeAxisForDataset((int) (byte) 100);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(comparable6);
        org.junit.Assert.assertNotNull(rectangleEdge7);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(valueAxis18);
    }

    @Test
    public void test189() throws Throwable {
printRuntimeMSG("---RegressionTest3:test189");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test189");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        barRenderer0.setBaseCreateEntities(false, true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test190() throws Throwable {
printRuntimeMSG("---RegressionTest3:test190");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test190");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint9 = lineAndShapeRenderer2.getLegendTextPaint((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition10 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Paint paint11 = lineAndShapeRenderer2.getBaseOutlinePaint();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier12 = lineAndShapeRenderer2.getDrawingSupplier();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(paint9);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(paint11);
        org.junit.Assert.assertNull(drawingSupplier12);
    }

    @Test
    public void test191() throws Throwable {
printRuntimeMSG("---RegressionTest3:test191");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test191");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Stroke stroke10 = lineAndShapeRenderer2.getSeriesOutlineStroke(192);
        java.awt.Font font12 = lineAndShapeRenderer2.getLegendTextFont((int) (short) 1);
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        boolean boolean17 = lineAndShapeRenderer2.getItemShapeVisible(0, 255);
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test192() throws Throwable {
printRuntimeMSG("---RegressionTest3:test192");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test192");
        org.jfree.data.general.DatasetGroup datasetGroup1 = new org.jfree.data.general.DatasetGroup("hi!");
        java.lang.Object obj2 = datasetGroup1.clone();
        org.jfree.chart.text.TextAnchor textAnchor3 = org.jfree.chart.text.TextAnchor.HALF_ASCENT_LEFT;
        java.lang.String str4 = textAnchor3.toString();
        boolean boolean5 = datasetGroup1.equals((java.lang.Object) textAnchor3);
        java.lang.String str6 = datasetGroup1.getID();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertNotNull(textAnchor3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "TextAnchor.HALF_ASCENT_LEFT" + "'", str4.equals("TextAnchor.HALF_ASCENT_LEFT"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test193() throws Throwable {
printRuntimeMSG("---RegressionTest3:test193");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test193");
        java.awt.Color color1 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem2 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color1);
        boolean boolean3 = legendItem2.isShapeOutlineVisible();
        boolean boolean4 = legendItem2.isShapeVisible();
        org.junit.Assert.assertNotNull(color1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test194() throws Throwable {
printRuntimeMSG("---RegressionTest3:test194");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test194");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint1 = categoryAxis0.getTickLabelPaint();
        categoryAxis0.setMaximumCategoryLabelLines((int) (short) -1);
        categoryAxis0.setLabelURL("AxisLocation.BOTTOM_OR_RIGHT");
        categoryAxis0.setMinorTickMarksVisible(false);
        org.junit.Assert.assertNotNull(paint1);
    }

    @Test
    public void test195() throws Throwable {
printRuntimeMSG("---RegressionTest3:test195");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test195");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        org.jfree.chart.LegendItemCollection legendItemCollection7 = categoryPlot0.getFixedLegendItems();
        org.jfree.chart.util.RectangleInsets rectangleInsets8 = categoryPlot0.getInsets();
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertNull(legendItemCollection7);
        org.junit.Assert.assertNotNull(rectangleInsets8);
    }

    @Test
    public void test196() throws Throwable {
printRuntimeMSG("---RegressionTest3:test196");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test196");
        org.jfree.chart.renderer.RenderAttributes renderAttributes1 = new org.jfree.chart.renderer.RenderAttributes(true);
        java.awt.Color color2 = org.jfree.chart.ChartColor.DARK_GREEN;
        renderAttributes1.setDefaultOutlinePaint((java.awt.Paint) color2);
        java.awt.Paint paint5 = renderAttributes1.getSeriesPaint((int) (short) 0);
        java.awt.Paint paint6 = renderAttributes1.getDefaultLabelPaint();
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(paint5);
        org.junit.Assert.assertNull(paint6);
    }

    @Test
    public void test197() throws Throwable {
printRuntimeMSG("---RegressionTest3:test197");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test197");
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
        org.jfree.chart.renderer.RenderAttributes renderAttributes16 = lineAndShapeRenderer2.getSelectedItemAttributes();
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(itemLabelPosition10);
        org.junit.Assert.assertNotNull(renderAttributes16);
    }

    @Test
    public void test198() throws Throwable {
printRuntimeMSG("---RegressionTest3:test198");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test198");
        org.jfree.chart.util.ObjectList objectList1 = new org.jfree.chart.util.ObjectList(8);
        org.jfree.data.category.DefaultCategoryDataset defaultCategoryDataset2 = new org.jfree.data.category.DefaultCategoryDataset();
        int int3 = defaultCategoryDataset2.getRowCount();
        org.jfree.data.category.CategoryDatasetSelectionState categoryDatasetSelectionState4 = null;
        defaultCategoryDataset2.setSelectionState(categoryDatasetSelectionState4);
        int int6 = objectList1.indexOf((java.lang.Object) categoryDatasetSelectionState4);
        java.lang.Object obj8 = objectList1.get(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test199() throws Throwable {
printRuntimeMSG("---RegressionTest3:test199");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test199");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean4 = lineAndShapeRenderer2.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean5 = lineAndShapeRenderer2.getBaseLinesVisible();
        lineAndShapeRenderer2.setAutoPopulateSeriesPaint(false);
        boolean boolean8 = lineAndShapeRenderer2.getAutoPopulateSeriesPaint();
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition9 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(true);
        int int12 = lineAndShapeRenderer2.getPassCount();
        org.jfree.chart.renderer.category.BarRenderer barRenderer14 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint15 = barRenderer14.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot16 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo19 = null;
        java.awt.geom.Point2D point2D20 = null;
        categoryPlot16.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo19, point2D20);
        categoryPlot16.clearAnnotations();
        boolean boolean23 = barRenderer14.equals((java.lang.Object) categoryPlot16);
        java.awt.Paint paint24 = barRenderer14.getShadowPaint();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer27 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator28 = lineAndShapeRenderer27.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator29 = null;
        lineAndShapeRenderer27.setBaseToolTipGenerator(categoryToolTipGenerator29);
        java.awt.Font font32 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer27.setSeriesItemLabelFont((int) (short) 0, font32, true);
        lineAndShapeRenderer27.setUseSeriesOffset(true);
        java.awt.Shape shape38 = lineAndShapeRenderer27.lookupLegendShape((-1));
        barRenderer14.setBaseShape(shape38, false);
        lineAndShapeRenderer2.setSeriesShape(0, shape38, false);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(paint15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(paint24);
        org.junit.Assert.assertNull(categoryItemLabelGenerator28);
        org.junit.Assert.assertNotNull(font32);
        org.junit.Assert.assertNotNull(shape38);
    }

    @Test
    public void test200() throws Throwable {
printRuntimeMSG("---RegressionTest3:test200");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test200");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        java.awt.Font font3 = categoryAxis0.getTickLabelFont();
        float float4 = categoryAxis0.getMaximumCategoryLabelWidthRatio();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator12 = lineAndShapeRenderer7.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer7.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean17 = lineAndShapeRenderer7.getSeriesCreateEntities((int) (short) 10);
        java.awt.Color color20 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem21 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color20);
        java.awt.Color color22 = java.awt.Color.getColor("hi!", color20);
        lineAndShapeRenderer7.setBaseOutlinePaint((java.awt.Paint) color22);
        categoryAxis0.setTickLabelPaint((java.awt.Paint) color22);
        org.junit.Assert.assertNotNull(font3);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertNull(categoryToolTipGenerator12);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(color22);
    }

    @Test
    public void test201() throws Throwable {
printRuntimeMSG("---RegressionTest3:test201");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test201");
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
        defaultCategoryDataset24.addValue(0.0d, (java.lang.Comparable) "ChartEntity: tooltip = ", (java.lang.Comparable) (-12566464));
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
    public void test202() throws Throwable {
printRuntimeMSG("---RegressionTest3:test202");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test202");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Color color2 = java.awt.Color.RED;
        renderAttributes0.setDefaultOutlinePaint((java.awt.Paint) color2);
        java.awt.Shape shape6 = renderAttributes0.getItemShape((int) 'a', (int) ' ');
        java.awt.Paint paint7 = renderAttributes0.getDefaultFillPaint();
        java.lang.Boolean boolean8 = renderAttributes0.getDefaultLabelVisible();
        boolean boolean9 = renderAttributes0.getAllowNull();
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer12 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean14 = lineAndShapeRenderer12.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean15 = lineAndShapeRenderer12.getBaseLinesVisible();
        lineAndShapeRenderer12.setAutoPopulateSeriesPaint(false);
        lineAndShapeRenderer12.setAutoPopulateSeriesShape(false);
        org.jfree.chart.plot.CategoryPlot categoryPlot20 = lineAndShapeRenderer12.getPlot();
        lineAndShapeRenderer12.setUseOutlinePaint(false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer26 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator27 = lineAndShapeRenderer26.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator28 = null;
        lineAndShapeRenderer26.setBaseToolTipGenerator(categoryToolTipGenerator28);
        java.awt.Font font31 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_FONT;
        lineAndShapeRenderer26.setSeriesItemLabelFont((int) (short) 0, font31, true);
        lineAndShapeRenderer12.setSeriesItemLabelFont(2, font31, false);
        renderAttributes0.setDefaultLabelFont(font31);
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNotNull(color2);
        org.junit.Assert.assertNull(shape6);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(categoryPlot20);
        org.junit.Assert.assertNull(categoryItemLabelGenerator27);
        org.junit.Assert.assertNotNull(font31);
    }

    @Test
    public void test203() throws Throwable {
printRuntimeMSG("---RegressionTest3:test203");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test203");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        int int2 = categoryPlot0.getCrosshairDatasetIndex();
        org.jfree.chart.plot.PlotOrientation plotOrientation3 = org.jfree.chart.plot.PlotOrientation.HORIZONTAL;
        java.lang.String str4 = plotOrientation3.toString();
        categoryPlot0.setOrientation(plotOrientation3);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(plotOrientation3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "PlotOrientation.HORIZONTAL" + "'", str4.equals("PlotOrientation.HORIZONTAL"));
    }

    @Test
    public void test204() throws Throwable {
printRuntimeMSG("---RegressionTest3:test204");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test204");
        org.jfree.chart.axis.CategoryAxis categoryAxis0 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis0.setMinorTickMarkOutsideLength((float) (short) 0);
        categoryAxis0.setLowerMargin((double) (short) 0);
        categoryAxis0.clearCategoryLabelToolTips();
        java.awt.Paint paint7 = categoryAxis0.getTickLabelPaint((java.lang.Comparable) (-12566464));
        org.junit.Assert.assertNotNull(paint7);
    }

    @Test
    public void test205() throws Throwable {
printRuntimeMSG("---RegressionTest3:test205");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test205");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        lineAndShapeRenderer2.clearSeriesStrokes(false);
        int int10 = lineAndShapeRenderer2.getRowCount();
        org.jfree.chart.plot.CategoryPlot categoryPlot11 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke12 = categoryPlot11.getRangeMinorGridlineStroke();
        boolean boolean13 = categoryPlot11.isRangeCrosshairLockedOnData();
        java.awt.Graphics2D graphics2D14 = null;
        java.awt.geom.Rectangle2D rectangle2D15 = null;
        categoryPlot11.drawBackgroundImage(graphics2D14, rectangle2D15);
        categoryPlot11.clearAnnotations();
        categoryPlot11.configureDomainAxes();
        lineAndShapeRenderer2.setPlot(categoryPlot11);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer22 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean24 = lineAndShapeRenderer22.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean25 = lineAndShapeRenderer22.getBaseLinesVisible();
        lineAndShapeRenderer22.setAutoPopulateSeriesPaint(false);
        java.awt.Paint paint29 = lineAndShapeRenderer22.getLegendTextPaint((-1));
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition30 = lineAndShapeRenderer22.getBasePositiveItemLabelPosition();
        lineAndShapeRenderer2.setBasePositiveItemLabelPosition(itemLabelPosition30, false);
        java.lang.Boolean boolean34 = lineAndShapeRenderer2.getSeriesVisibleInLegend(175);
        lineAndShapeRenderer2.setSeriesItemLabelsVisible((int) (byte) 0, (java.lang.Boolean) true, false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(paint29);
        org.junit.Assert.assertNotNull(itemLabelPosition30);
        org.junit.Assert.assertNull(boolean34);
    }

    @Test
    public void test206() throws Throwable {
printRuntimeMSG("---RegressionTest3:test206");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test206");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke3 = categoryPlot2.getRangeMinorGridlineStroke();
        categoryPlot0.setParent((org.jfree.chart.plot.Plot) categoryPlot2);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo6 = null;
        java.awt.geom.Point2D point2D7 = null;
        categoryPlot2.zoomDomainAxes((double) '4', plotRenderingInfo6, point2D7);
        org.jfree.chart.axis.CategoryAnchor categoryAnchor9 = categoryPlot2.getDomainGridlinePosition();
        org.jfree.chart.axis.CategoryAxis categoryAxis11 = categoryPlot2.getDomainAxis((-1));
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNotNull(categoryAnchor9);
        org.junit.Assert.assertNull(categoryAxis11);
    }

    @Test
    public void test207() throws Throwable {
printRuntimeMSG("---RegressionTest3:test207");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test207");
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
        categoryPlot0.setRangeCrosshairValue((double) 100L, false);
        org.jfree.chart.axis.ValueAxis valueAxis15 = null;
        categoryPlot0.setRangeAxis((int) '#', valueAxis15, false);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNotNull(drawingSupplier6);
        org.junit.Assert.assertNotNull(stroke7);
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test208() throws Throwable {
printRuntimeMSG("---RegressionTest3:test208");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test208");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator3 = lineAndShapeRenderer2.getBaseItemLabelGenerator();
        org.jfree.chart.labels.CategoryToolTipGenerator categoryToolTipGenerator7 = lineAndShapeRenderer2.getToolTipGenerator((int) (short) 100, (-1), false);
        lineAndShapeRenderer2.setSeriesLinesVisible((int) (byte) 100, (java.lang.Boolean) true);
        java.lang.Boolean boolean12 = lineAndShapeRenderer2.getSeriesCreateEntities((int) (short) 10);
        lineAndShapeRenderer2.setAutoPopulateSeriesOutlinePaint(true);
        lineAndShapeRenderer2.setBaseSeriesVisibleInLegend(false, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer21 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition23 = null;
        lineAndShapeRenderer21.setSeriesPositiveItemLabelPosition(0, itemLabelPosition23);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition26 = lineAndShapeRenderer21.getSeriesPositiveItemLabelPosition((-1));
        java.awt.Paint paint30 = lineAndShapeRenderer21.getItemOutlinePaint((int) (short) 10, (int) (byte) 10, false);
        java.awt.Stroke stroke32 = lineAndShapeRenderer21.lookupSeriesStroke((-16777216));
        org.jfree.data.category.CategoryDataset categoryDataset33 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis34 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis34.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis37 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer40 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator41 = lineAndShapeRenderer40.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot42 = new org.jfree.chart.plot.CategoryPlot(categoryDataset33, categoryAxis34, valueAxis37, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer40);
        categoryAxis34.setVisible(false);
        java.awt.Font font45 = categoryAxis34.getTickLabelFont();
        java.awt.Font font47 = categoryAxis34.getTickLabelFont((java.lang.Comparable) "PlotEntity: tooltip = null");
        lineAndShapeRenderer21.setBaseLegendTextFont(font47);
        lineAndShapeRenderer2.setSeriesItemLabelFont(4, font47, true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator3);
        org.junit.Assert.assertNull(categoryToolTipGenerator7);
        org.junit.Assert.assertNull(boolean12);
        org.junit.Assert.assertNotNull(itemLabelPosition26);
        org.junit.Assert.assertNotNull(paint30);
        org.junit.Assert.assertNotNull(stroke32);
        org.junit.Assert.assertNull(categoryItemLabelGenerator41);
        org.junit.Assert.assertNotNull(font45);
        org.junit.Assert.assertNotNull(font47);
    }

    @Test
    public void test209() throws Throwable {
printRuntimeMSG("---RegressionTest3:test209");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test209");
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
        org.jfree.chart.urls.CategoryURLGenerator categoryURLGenerator34 = null;
        lineAndShapeRenderer2.setBaseURLGenerator(categoryURLGenerator34);
        try {
            lineAndShapeRenderer2.setSeriesItemLabelsVisible((-65536), (java.lang.Boolean) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Requires index >= 0.");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
    public void test210() throws Throwable {
printRuntimeMSG("---RegressionTest3:test210");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test210");
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
        org.jfree.chart.event.AnnotationChangeEvent annotationChangeEvent14 = null;
        categoryPlot0.annotationChanged(annotationChangeEvent14);
        org.jfree.chart.axis.ValueAxis valueAxis17 = null;
        categoryPlot0.setRangeAxis((int) ' ', valueAxis17);
        categoryPlot0.clearSelection();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
    }

    @Test
    public void test211() throws Throwable {
printRuntimeMSG("---RegressionTest3:test211");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test211");
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
        org.jfree.data.category.CategoryDataset categoryDataset53 = categoryItemEntity47.getDataset();
        java.lang.String str54 = categoryItemEntity47.getShapeCoords();
        categoryItemEntity47.setColumnKey((java.lang.Comparable) "rect");
        java.lang.String str57 = categoryItemEntity47.getShapeCoords();
        java.awt.Shape shape58 = categoryItemEntity47.getArea();
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
        org.junit.Assert.assertNotNull(categoryDataset53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "4,0,2,2,0,4,-2,2,-4,0,-2,-2,0,-4,2,-2,4,0,4,0" + "'", str54.equals("4,0,2,2,0,4,-2,2,-4,0,-2,-2,0,-4,2,-2,4,0,4,0"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "4,0,2,2,0,4,-2,2,-4,0,-2,-2,0,-4,2,-2,4,0,4,0" + "'", str57.equals("4,0,2,2,0,4,-2,2,-4,0,-2,-2,0,-4,2,-2,4,0,4,0"));
        org.junit.Assert.assertNotNull(shape58);
    }

    @Test
    public void test212() throws Throwable {
printRuntimeMSG("---RegressionTest3:test212");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test212");
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
        try {
            org.jfree.chart.axis.CategoryAxis categoryAxis23 = categoryPlot0.getDomainAxisForDataset((-12566464));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Negative 'index'.");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(categoryDataset7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.05d + "'", double9 == 0.05d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test213() throws Throwable {
printRuntimeMSG("---RegressionTest3:test213");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test213");
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
        org.jfree.chart.util.RectangleEdge rectangleEdge14 = categoryPlot0.getRangeAxisEdge();
        java.awt.Stroke stroke15 = categoryPlot0.getDomainGridlineStroke();
        org.jfree.chart.util.RectangleInsets rectangleInsets16 = categoryPlot0.getInsets();
        org.jfree.chart.plot.Marker marker18 = null;
        org.jfree.chart.util.Layer layer19 = null;
        boolean boolean20 = categoryPlot0.removeDomainMarker(10, marker18, layer19);
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNotNull(stroke3);
        org.junit.Assert.assertNull(legendItemCollection5);
        org.junit.Assert.assertNull(axisSpace8);
        org.junit.Assert.assertNotNull(stroke11);
        org.junit.Assert.assertNotNull(stroke13);
        org.junit.Assert.assertNotNull(rectangleEdge14);
        org.junit.Assert.assertNotNull(stroke15);
        org.junit.Assert.assertNotNull(rectangleInsets16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test214() throws Throwable {
printRuntimeMSG("---RegressionTest3:test214");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test214");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo3 = null;
        java.awt.geom.Point2D point2D4 = null;
        categoryPlot0.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo3, point2D4);
        org.jfree.chart.plot.PlotOrientation plotOrientation6 = categoryPlot0.getOrientation();
        categoryPlot0.setNoDataMessage("TextAnchor.HALF_ASCENT_LEFT");
        boolean boolean9 = categoryPlot0.getDrawSharedDomainAxis();
        org.jfree.chart.axis.CategoryAxis categoryAxis10 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis10.setMinorTickMarkOutsideLength((float) (short) 0);
        float float13 = categoryAxis10.getMinorTickMarkInsideLength();
        categoryAxis10.setMinorTickMarkInsideLength(100.0f);
        java.awt.Paint paint16 = categoryAxis10.getTickMarkPaint();
        org.jfree.chart.axis.CategoryAxis categoryAxis17 = new org.jfree.chart.axis.CategoryAxis();
        java.awt.Paint paint18 = categoryAxis17.getTickLabelPaint();
        org.jfree.chart.util.RectangleInsets rectangleInsets19 = org.jfree.chart.axis.Axis.DEFAULT_TICK_LABEL_INSETS;
        double double20 = rectangleInsets19.getRight();
        double double22 = rectangleInsets19.calculateTopInset(0.0d);
        categoryAxis17.setLabelInsets(rectangleInsets19, false);
        java.lang.String str25 = rectangleInsets19.toString();
        categoryAxis10.setTickLabelInsets(rectangleInsets19);
        categoryPlot0.setInsets(rectangleInsets19);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo29 = null;
        java.awt.geom.Point2D point2D30 = null;
        categoryPlot0.zoomDomainAxes((double) 1.0f, plotRenderingInfo29, point2D30, false);
        org.junit.Assert.assertNotNull(plotOrientation6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertNotNull(paint16);
        org.junit.Assert.assertNotNull(paint18);
        org.junit.Assert.assertNotNull(rectangleInsets19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 4.0d + "'", double20 == 4.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 2.0d + "'", double22 == 2.0d);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]" + "'", str25.equals("RectangleInsets[t=2.0,l=4.0,b=2.0,r=4.0]"));
    }

    @Test
    public void test215() throws Throwable {
printRuntimeMSG("---RegressionTest3:test215");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test215");
        org.jfree.chart.plot.CategoryPlot categoryPlot0 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke1 = categoryPlot0.getRangeMinorGridlineStroke();
        org.jfree.chart.renderer.category.CategoryItemRenderer categoryItemRenderer2 = null;
        categoryPlot0.setRenderer(categoryItemRenderer2);
        org.jfree.chart.event.PlotChangeEvent plotChangeEvent4 = new org.jfree.chart.event.PlotChangeEvent((org.jfree.chart.plot.Plot) categoryPlot0);
        categoryPlot0.setRangeMinorGridlinesVisible(true);
        org.jfree.chart.axis.ValueAxis valueAxis7 = categoryPlot0.getRangeAxis();
        org.jfree.chart.axis.AxisSpace axisSpace8 = categoryPlot0.getFixedRangeAxisSpace();
        org.junit.Assert.assertNotNull(stroke1);
        org.junit.Assert.assertNull(valueAxis7);
        org.junit.Assert.assertNull(axisSpace8);
    }

    @Test
    public void test216() throws Throwable {
printRuntimeMSG("---RegressionTest3:test216");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test216");
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer2 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition4 = null;
        lineAndShapeRenderer2.setSeriesPositiveItemLabelPosition(0, itemLabelPosition4);
        org.jfree.chart.labels.CategorySeriesLabelGenerator categorySeriesLabelGenerator6 = null;
        lineAndShapeRenderer2.setLegendItemToolTipGenerator(categorySeriesLabelGenerator6);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition8 = lineAndShapeRenderer2.getBasePositiveItemLabelPosition();
        java.awt.Stroke stroke10 = lineAndShapeRenderer2.getSeriesOutlineStroke(192);
        java.awt.Font font12 = lineAndShapeRenderer2.getLegendTextFont((int) (short) 1);
        lineAndShapeRenderer2.setBaseCreateEntities(false);
        java.awt.Graphics2D graphics2D15 = null;
        org.jfree.chart.util.UnitType unitType16 = org.jfree.chart.util.UnitType.ABSOLUTE;
        org.jfree.chart.plot.CategoryPlot categoryPlot17 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke18 = categoryPlot17.getRangeMinorGridlineStroke();
        org.jfree.chart.plot.CategoryPlot categoryPlot19 = new org.jfree.chart.plot.CategoryPlot();
        java.awt.Stroke stroke20 = categoryPlot19.getRangeMinorGridlineStroke();
        categoryPlot17.setParent((org.jfree.chart.plot.Plot) categoryPlot19);
        org.jfree.chart.LegendItemCollection legendItemCollection22 = categoryPlot17.getFixedLegendItems();
        org.jfree.chart.plot.DrawingSupplier drawingSupplier23 = categoryPlot17.getDrawingSupplier();
        java.awt.Stroke stroke24 = categoryPlot17.getOutlineStroke();
        boolean boolean25 = unitType16.equals((java.lang.Object) categoryPlot17);
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo28 = null;
        java.awt.geom.Point2D point2D29 = null;
        categoryPlot17.zoomRangeAxes(0.0d, (double) (byte) -1, plotRenderingInfo28, point2D29);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer33 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        java.lang.Boolean boolean35 = lineAndShapeRenderer33.getSeriesItemLabelsVisible((int) (short) 100);
        boolean boolean36 = lineAndShapeRenderer33.getBaseLinesVisible();
        java.awt.Shape shape37 = org.jfree.chart.plot.Plot.DEFAULT_LEGEND_ITEM_CIRCLE;
        lineAndShapeRenderer33.setBaseLegendShape(shape37);
        java.awt.Color color39 = org.jfree.chart.ChartColor.LIGHT_MAGENTA;
        lineAndShapeRenderer33.setBaseOutlinePaint((java.awt.Paint) color39, false);
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer44 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition46 = null;
        lineAndShapeRenderer44.setSeriesPositiveItemLabelPosition(0, itemLabelPosition46);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition49 = lineAndShapeRenderer44.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean50 = lineAndShapeRenderer44.getUseFillPaint();
        lineAndShapeRenderer44.setDataBoundsIncludesVisibleSeriesOnly(true);
        java.awt.Stroke stroke53 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        lineAndShapeRenderer44.setBaseStroke(stroke53, false);
        org.jfree.chart.renderer.category.CategoryItemRenderer[] categoryItemRendererArray56 = new org.jfree.chart.renderer.category.CategoryItemRenderer[] { lineAndShapeRenderer33, lineAndShapeRenderer44 };
        categoryPlot17.setRenderers(categoryItemRendererArray56);
        org.jfree.chart.plot.Marker marker58 = null;
        boolean boolean59 = categoryPlot17.removeDomainMarker(marker58);
        categoryPlot17.setDomainCrosshairColumnKey((java.lang.Comparable) 100.0f, true);
        categoryPlot17.setOutlineVisible(false);
        java.awt.geom.Rectangle2D rectangle2D65 = null;
        try {
            lineAndShapeRenderer2.drawBackground(graphics2D15, categoryPlot17, rectangle2D65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(itemLabelPosition8);
        org.junit.Assert.assertNull(stroke10);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNotNull(unitType16);
        org.junit.Assert.assertNotNull(stroke18);
        org.junit.Assert.assertNotNull(stroke20);
        org.junit.Assert.assertNull(legendItemCollection22);
        org.junit.Assert.assertNotNull(drawingSupplier23);
        org.junit.Assert.assertNotNull(stroke24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(boolean35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(shape37);
        org.junit.Assert.assertNotNull(color39);
        org.junit.Assert.assertNotNull(itemLabelPosition49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(stroke53);
        org.junit.Assert.assertNotNull(categoryItemRendererArray56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test217() throws Throwable {
printRuntimeMSG("---RegressionTest3:test217");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test217");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Stroke stroke4 = renderAttributes0.getItemStroke((int) (byte) 10, (int) 'a');
        java.awt.Paint paint7 = renderAttributes0.getItemOutlinePaint((-16777216), 0);
        java.awt.Paint paint8 = renderAttributes0.getDefaultFillPaint();
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNull(stroke4);
        org.junit.Assert.assertNull(paint7);
        org.junit.Assert.assertNull(paint8);
    }

    @Test
    public void test218() throws Throwable {
printRuntimeMSG("---RegressionTest3:test218");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test218");
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
        lineAndShapeRenderer2.setAutoPopulateSeriesStroke(false);
        lineAndShapeRenderer2.setItemLabelAnchorOffset(0.0d);
        boolean boolean21 = lineAndShapeRenderer2.getAutoPopulateSeriesOutlinePaint();
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(categoryItemLabelGenerator9);
        org.junit.Assert.assertNotNull(font13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test219() throws Throwable {
printRuntimeMSG("---RegressionTest3:test219");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test219");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint1 = renderAttributes0.getDefaultLabelPaint();
        java.awt.Color color2 = java.awt.Color.RED;
        renderAttributes0.setDefaultOutlinePaint((java.awt.Paint) color2);
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
        renderAttributes0.setDefaultShape(shape16);
        java.awt.Stroke stroke40 = renderAttributes0.getDefaultStroke();
        try {
            java.awt.Font font43 = renderAttributes0.getItemLabelFont(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(paint1);
        org.junit.Assert.assertNotNull(color2);
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
        org.junit.Assert.assertNull(stroke40);
    }

    @Test
    public void test220() throws Throwable {
printRuntimeMSG("---RegressionTest3:test220");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test220");
        org.jfree.data.category.CategoryDataset categoryDataset0 = null;
        org.jfree.chart.axis.CategoryAxis categoryAxis1 = new org.jfree.chart.axis.CategoryAxis();
        categoryAxis1.setMinorTickMarkOutsideLength((float) (short) 0);
        org.jfree.chart.axis.ValueAxis valueAxis4 = null;
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer7 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.CategoryItemLabelGenerator categoryItemLabelGenerator8 = lineAndShapeRenderer7.getBaseItemLabelGenerator();
        org.jfree.chart.plot.CategoryPlot categoryPlot9 = new org.jfree.chart.plot.CategoryPlot(categoryDataset0, categoryAxis1, valueAxis4, (org.jfree.chart.renderer.category.CategoryItemRenderer) lineAndShapeRenderer7);
        boolean boolean10 = categoryAxis1.isTickLabelsVisible();
        categoryAxis1.setLabelToolTip("hi!");
        float float13 = categoryAxis1.getMaximumCategoryLabelWidthRatio();
        org.junit.Assert.assertNull(categoryItemLabelGenerator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test221() throws Throwable {
printRuntimeMSG("---RegressionTest3:test221");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test221");
        org.jfree.chart.renderer.category.BarRenderer barRenderer0 = new org.jfree.chart.renderer.category.BarRenderer();
        java.awt.Paint paint1 = barRenderer0.getShadowPaint();
        org.jfree.chart.plot.CategoryPlot categoryPlot2 = new org.jfree.chart.plot.CategoryPlot();
        org.jfree.chart.plot.PlotRenderingInfo plotRenderingInfo5 = null;
        java.awt.geom.Point2D point2D6 = null;
        categoryPlot2.zoomRangeAxes((double) (-16777216), (double) (short) 1, plotRenderingInfo5, point2D6);
        categoryPlot2.clearAnnotations();
        boolean boolean9 = barRenderer0.equals((java.lang.Object) categoryPlot2);
        double double10 = barRenderer0.getMaximumBarWidth();
        java.awt.Stroke stroke12 = barRenderer0.lookupSeriesStroke((-1));
        java.awt.Paint paint13 = barRenderer0.getShadowPaint();
        barRenderer0.setBaseItemLabelsVisible(false, false);
        boolean boolean17 = barRenderer0.getIncludeBaseInRange();
        barRenderer0.setIncludeBaseInRange(true);
        org.junit.Assert.assertNotNull(paint1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(stroke12);
        org.junit.Assert.assertNotNull(paint13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test222() throws Throwable {
printRuntimeMSG("---RegressionTest3:test222");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test222");
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
        org.jfree.chart.renderer.category.LineAndShapeRenderer lineAndShapeRenderer29 = new org.jfree.chart.renderer.category.LineAndShapeRenderer(true, true);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition31 = null;
        lineAndShapeRenderer29.setSeriesPositiveItemLabelPosition(0, itemLabelPosition31);
        org.jfree.chart.labels.ItemLabelPosition itemLabelPosition34 = lineAndShapeRenderer29.getSeriesPositiveItemLabelPosition((-1));
        boolean boolean35 = lineAndShapeRenderer29.getUseFillPaint();
        lineAndShapeRenderer29.setDataBoundsIncludesVisibleSeriesOnly(true);
        java.awt.Stroke stroke38 = org.jfree.chart.renderer.AbstractRenderer.DEFAULT_OUTLINE_STROKE;
        lineAndShapeRenderer29.setBaseStroke(stroke38, false);
        boolean boolean41 = lineAndShapeRenderer29.getDataBoundsIncludesVisibleSeriesOnly();
        boolean boolean42 = keyedObjects0.equals((java.lang.Object) lineAndShapeRenderer29);
        org.jfree.data.KeyedObjects2D keyedObjects2D43 = new org.jfree.data.KeyedObjects2D();
        java.util.List list44 = keyedObjects2D43.getColumnKeys();
        keyedObjects2D43.addObject((java.lang.Object) 255, (java.lang.Comparable) (-65536), (java.lang.Comparable) 0.2d);
        java.util.List list49 = keyedObjects2D43.getColumnKeys();
        boolean boolean50 = keyedObjects0.equals((java.lang.Object) list49);
        try {
            keyedObjects0.removeValue(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 49, Size: 1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(stroke6);
        org.junit.Assert.assertNotNull(axisLocation7);
        org.junit.Assert.assertNotNull(axisLocation8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(sortOrder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(itemLabelPosition34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(stroke38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(list44);
        org.junit.Assert.assertNotNull(list49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test223() throws Throwable {
printRuntimeMSG("---RegressionTest3:test223");

        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test223");
        org.jfree.chart.renderer.RenderAttributes renderAttributes0 = new org.jfree.chart.renderer.RenderAttributes();
        java.awt.Paint paint3 = renderAttributes0.getItemFillPaint((-65536), (int) (byte) 1);
        java.awt.Color color7 = java.awt.Color.orange;
        org.jfree.chart.LegendItem legendItem8 = new org.jfree.chart.LegendItem("", (java.awt.Paint) color7);
        java.awt.Color color9 = java.awt.Color.getColor("hi!", color7);
        renderAttributes0.setSeriesFillPaint((int) (byte) 100, (java.awt.Paint) color9);
        java.awt.Stroke stroke13 = renderAttributes0.getItemStroke((-15935), (-739));
        org.junit.Assert.assertNull(paint3);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(color9);
        org.junit.Assert.assertNull(stroke13);
    }
}

