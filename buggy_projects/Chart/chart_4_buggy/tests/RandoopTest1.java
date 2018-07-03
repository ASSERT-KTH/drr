
import junit.framework.*;

public class RandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() {}
//   public void test1() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test1"); }
// 
// 
//     org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
//     var1.setBackgroundAlpha(1.0f);
//     var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
//     java.awt.Paint var5 = var1.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var8 = null;
//     var1.handleClick((-398), 0, var8);
//     org.jfree.chart.title.LegendTitle var10 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var1);
//     org.jfree.chart.text.TextBlock var11 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.util.HorizontalAlignment var12 = var11.getLineAlignment();
//     org.jfree.chart.LegendItem var14 = new org.jfree.chart.LegendItem("");
//     java.lang.Object var15 = var14.clone();
//     var14.setDescription("");
//     boolean var18 = var11.equals((java.lang.Object)"");
//     java.awt.Graphics2D var19 = null;
//     org.jfree.chart.util.Size2D var20 = var11.calculateDimensions(var19);
//     org.jfree.chart.plot.CombinedDomainXYPlot var23 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     var23.setDomainCrosshairValue(1.0d, true);
//     org.jfree.chart.plot.PlotOrientation var27 = var23.getOrientation();
//     org.jfree.chart.JFreeChart var28 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var23);
//     var28.fireChartChanged();
//     org.jfree.data.xy.DefaultXYDataset var30 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var31 = new org.jfree.chart.plot.PolarPlot();
//     var31.setBackgroundAlpha(1.0f);
//     var30.addChangeListener((org.jfree.data.general.DatasetChangeListener)var31);
//     java.awt.Paint var35 = var31.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var38 = null;
//     var31.handleClick((-398), 0, var38);
//     org.jfree.chart.title.LegendTitle var40 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var31);
//     var28.addLegend(var40);
//     java.awt.Color var45 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var46 = var45.brighter();
//     var40.setBackgroundPaint((java.awt.Paint)var45);
//     org.jfree.chart.util.RectangleAnchor var48 = var40.getLegendItemGraphicLocation();
//     org.jfree.chart.ui.Library var53 = new org.jfree.chart.ui.Library("", "hi!", "hi!", "");
//     java.lang.String var54 = var53.getLicenceName();
//     java.lang.String var55 = var53.getLicenceName();
//     boolean var56 = var48.equals((java.lang.Object)var55);
//     java.awt.geom.Rectangle2D var57 = org.jfree.chart.util.RectangleAnchor.createRectangle(var20, (-3.99999d), 5.0d, var48);
//     org.jfree.chart.renderer.xy.XYAreaRenderer var58 = new org.jfree.chart.renderer.xy.XYAreaRenderer();
//     org.jfree.chart.labels.XYItemLabelGenerator var60 = var58.getSeriesItemLabelGenerator((-398));
//     boolean var61 = var48.equals((java.lang.Object)(-398));
//     var10.setLegendItemGraphicAnchor(var48);
//     
//     // Checks the contract:  equals-hashcode on var1 and var31
//     assertTrue("Contract failed: equals-hashcode on var1 and var31", var1.equals(var31) ? var1.hashCode() == var31.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var31 and var1
//     assertTrue("Contract failed: equals-hashcode on var31 and var1", var31.equals(var1) ? var31.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.ResourceBundle var1 = java.util.ResourceBundle.getBundle("PieLabelLinkStyle.STANDARD");
      fail("Expected exception of type java.util.MissingResourceException");
    } catch (java.util.MissingResourceException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test3"); }


    org.jfree.chart.renderer.xy.XYAreaRenderer var0 = new org.jfree.chart.renderer.xy.XYAreaRenderer();
    org.jfree.chart.plot.XYPlot var1 = var0.getPlot();
    org.jfree.chart.plot.CombinedDomainXYPlot var2 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    java.lang.String var3 = var2.getPlotType();
    var0.setPlot((org.jfree.chart.plot.XYPlot)var2);
    org.jfree.chart.labels.XYItemLabelGenerator var6 = var0.getSeriesItemLabelGenerator(3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "Combined_Domain_XYPlot"+ "'", var3.equals("Combined_Domain_XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test4"); }


    org.jfree.data.Range var3 = new org.jfree.data.Range(0.0d, 0.0d);
    double var4 = var3.getLowerBound();
    org.jfree.chart.block.RectangleConstraint var5 = new org.jfree.chart.block.RectangleConstraint(6.0d, var3);
    org.jfree.chart.block.RectangleConstraint var6 = var5.toUnconstrainedHeight();
    org.jfree.data.Range var7 = var6.getWidthRange();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test5() {}
//   public void test5() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test5"); }
// 
// 
//     org.jfree.chart.renderer.xy.XYLineAndShapeRenderer var0 = new org.jfree.chart.renderer.xy.XYLineAndShapeRenderer();
//     var0.setUseOutlinePaint(true);
//     boolean var3 = var0.getDrawSeriesLineAsPath();
//     org.jfree.chart.text.TextBlock var4 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var8 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var9 = new org.jfree.chart.plot.PolarPlot();
//     var9.setBackgroundAlpha(1.0f);
//     boolean var12 = var8.hasListener((java.util.EventListener)var9);
//     java.awt.Shape var13 = var8.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var16 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var6, var13, "hi!", "hi!");
//     double var17 = var6.getUpperMargin();
//     java.awt.Font var18 = var6.getLabelFont();
//     java.awt.Color var22 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var23 = var22.brighter();
//     var4.addLine("", var18, (java.awt.Paint)var23);
//     java.awt.Color var28 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     float[] var32 = new float[] { 10.0f, (-1.0f), 100.0f};
//     float[] var33 = var28.getColorComponents(var32);
//     java.awt.color.ColorSpace var34 = var28.getColorSpace();
//     java.awt.Color var38 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     float[] var42 = new float[] { 10.0f, (-1.0f), 100.0f};
//     float[] var43 = var38.getColorComponents(var42);
//     java.awt.color.ColorSpace var44 = var38.getColorSpace();
//     java.awt.Color var48 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     float[] var52 = new float[] { 10.0f, (-1.0f), 100.0f};
//     float[] var53 = var48.getColorComponents(var52);
//     float[] var54 = var38.getRGBColorComponents(var52);
//     float[] var55 = var23.getColorComponents(var34, var52);
//     var0.setBaseOutlinePaint((java.awt.Paint)var23);
//     org.jfree.chart.urls.StandardXYURLGenerator var58 = new org.jfree.chart.urls.StandardXYURLGenerator();
//     var0.setSeriesURLGenerator(0, (org.jfree.chart.urls.XYURLGenerator)var58, false);
//     org.jfree.data.xy.DefaultXYDataset var61 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.data.Range var63 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds((org.jfree.data.xy.XYDataset)var61, true);
//     org.jfree.chart.plot.PolarPlot var64 = new org.jfree.chart.plot.PolarPlot();
//     var64.setBackgroundAlpha(1.0f);
//     java.awt.Paint var67 = var64.getBackgroundPaint();
//     org.jfree.chart.axis.TickUnit var68 = var64.getAngleTickUnit();
//     int var69 = var61.indexOf((java.lang.Comparable)var68);
//     java.lang.Number var70 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue((org.jfree.data.xy.XYDataset)var61);
//     java.lang.String var73 = var58.generateURL((org.jfree.data.xy.XYDataset)var61, 0, 15);
//     
//     // Checks the contract:  equals-hashcode on var9 and var64
//     assertTrue("Contract failed: equals-hashcode on var9 and var64", var9.equals(var64) ? var9.hashCode() == var64.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var64 and var9
//     assertTrue("Contract failed: equals-hashcode on var64 and var9", var64.equals(var9) ? var64.hashCode() == var9.hashCode() : true);
// 
//   }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test6"); }


    org.jfree.chart.plot.IntervalMarker var2 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    java.awt.Paint var3 = var2.getLabelPaint();
    org.jfree.chart.renderer.xy.XYAreaRenderer var4 = new org.jfree.chart.renderer.xy.XYAreaRenderer();
    org.jfree.chart.plot.XYPlot var5 = var4.getPlot();
    org.jfree.chart.plot.CombinedDomainXYPlot var6 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    java.lang.String var7 = var6.getPlotType();
    var4.setPlot((org.jfree.chart.plot.XYPlot)var6);
    org.jfree.chart.labels.XYSeriesLabelGenerator var9 = null;
    var4.setLegendItemURLGenerator(var9);
    var4.removeAnnotations();
    org.jfree.chart.LegendItemCollection var12 = var4.getLegendItems();
    org.jfree.chart.labels.ItemLabelPosition var14 = var4.getSeriesPositiveItemLabelPosition(1);
    org.jfree.chart.LegendItem var16 = new org.jfree.chart.LegendItem("");
    java.awt.Paint var17 = var16.getLinePaint();
    boolean var18 = var16.isShapeOutlineVisible();
    java.lang.String var19 = var16.getDescription();
    org.jfree.chart.util.GradientPaintTransformer var20 = var16.getFillPaintTransformer();
    var4.setGradientTransformer(var20);
    var2.setGradientPaintTransformer(var20);
    org.jfree.chart.event.MarkerChangeEvent var23 = null;
    var2.notifyListeners(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "Combined_Domain_XYPlot"+ "'", var7.equals("Combined_Domain_XYPlot"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test7"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    boolean var3 = var2.getAutoPopulateSeriesFillPaint();
    double var4 = var2.getLowerClip();
    org.jfree.chart.ChartColor var8 = new org.jfree.chart.ChartColor(10, 100, 1);
    var2.setBasePaint((java.awt.Paint)var8);
    java.awt.Paint var11 = var2.getSeriesPaint(0);
    org.jfree.chart.labels.CategoryItemLabelGenerator var12 = var2.getBaseItemLabelGenerator();
    org.jfree.data.category.CategoryDataset var13 = null;
    org.jfree.data.Range var14 = var2.findRangeBounds(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test8"); }


    org.jfree.chart.axis.NumberAxis3D var0 = new org.jfree.chart.axis.NumberAxis3D();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var3 = new org.jfree.chart.plot.PolarPlot();
    var3.setBackgroundAlpha(1.0f);
    boolean var6 = var2.hasListener((java.util.EventListener)var3);
    java.awt.Shape var7 = var2.getLeftArrow();
    org.jfree.chart.entity.AxisLabelEntity var10 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var0, var7, "hi!", "hi!");
    double var11 = var0.getUpperMargin();
    double var12 = var0.getAutoRangeMinimumSize();
    org.jfree.chart.axis.MarkerAxisBand var13 = null;
    var0.setMarkerBand(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.05d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1.0E-8d);

  }

  public void test9() {}
//   public void test9() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test9"); }
// 
// 
//     org.jfree.data.category.CategoryDataset var0 = null;
//     org.jfree.chart.axis.NumberTickUnit var2 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
//     java.lang.String var4 = var2.valueToString(0.0d);
//     org.jfree.data.general.PieDataset var5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(var0, (java.lang.Comparable)var2);
// 
//   }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test10"); }


    org.jfree.chart.StandardChartTheme var1 = new org.jfree.chart.StandardChartTheme(" version .\n.\n\nFor terms of use, see the licence below.\n\nFURTHER INFORMATION:hi!\nCONTRIBUTORS:\nOTHER LIBRARIES USED BY :None\n LICENCE TERMS:\n");
    org.jfree.chart.plot.RingPlot var2 = new org.jfree.chart.plot.RingPlot();
    org.jfree.chart.labels.StandardPieSectionLabelGenerator var3 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator();
    var2.setLegendLabelGenerator((org.jfree.chart.labels.PieSectionLabelGenerator)var3);
    org.jfree.chart.plot.PieLabelLinkStyle var5 = var2.getLabelLinkStyle();
    java.lang.String var6 = var5.toString();
    var1.setLabelLinkStyle(var5);
    org.jfree.chart.axis.NumberAxis3D var8 = new org.jfree.chart.axis.NumberAxis3D();
    org.jfree.chart.axis.NumberAxis3D var10 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var11 = new org.jfree.chart.plot.PolarPlot();
    var11.setBackgroundAlpha(1.0f);
    boolean var14 = var10.hasListener((java.util.EventListener)var11);
    java.awt.Shape var15 = var10.getLeftArrow();
    org.jfree.chart.entity.AxisLabelEntity var18 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var8, var15, "hi!", "hi!");
    java.awt.Color var22 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
    java.awt.Color var23 = var22.brighter();
    org.jfree.chart.title.LegendGraphic var24 = new org.jfree.chart.title.LegendGraphic(var15, (java.awt.Paint)var22);
    var1.setItemLabelPaint((java.awt.Paint)var22);
    java.awt.Paint var26 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setGridBandAlternatePaint(var26);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "PieLabelLinkStyle.STANDARD"+ "'", var6.equals("PieLabelLinkStyle.STANDARD"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test11() {}
//   public void test11() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test11"); }
// 
// 
//     org.jfree.data.xy.DefaultXYDataset var0 = new org.jfree.data.xy.DefaultXYDataset();
//     org.jfree.chart.plot.PolarPlot var1 = new org.jfree.chart.plot.PolarPlot();
//     var1.setBackgroundAlpha(1.0f);
//     var0.addChangeListener((org.jfree.data.general.DatasetChangeListener)var1);
//     java.awt.Paint var5 = var1.getAngleGridlinePaint();
//     org.jfree.chart.plot.PlotRenderingInfo var8 = null;
//     var1.handleClick((-398), 0, var8);
//     org.jfree.chart.title.LegendTitle var10 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var1);
//     org.jfree.chart.text.TextBlock var11 = new org.jfree.chart.text.TextBlock();
//     org.jfree.chart.axis.NumberAxis3D var13 = new org.jfree.chart.axis.NumberAxis3D();
//     org.jfree.chart.axis.NumberAxis3D var15 = new org.jfree.chart.axis.NumberAxis3D("");
//     org.jfree.chart.plot.PolarPlot var16 = new org.jfree.chart.plot.PolarPlot();
//     var16.setBackgroundAlpha(1.0f);
//     boolean var19 = var15.hasListener((java.util.EventListener)var16);
//     java.awt.Shape var20 = var15.getLeftArrow();
//     org.jfree.chart.entity.AxisLabelEntity var23 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var13, var20, "hi!", "hi!");
//     double var24 = var13.getUpperMargin();
//     java.awt.Font var25 = var13.getLabelFont();
//     java.awt.Color var29 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     java.awt.Color var30 = var29.brighter();
//     var11.addLine("", var25, (java.awt.Paint)var30);
//     java.awt.Color var35 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     float[] var39 = new float[] { 10.0f, (-1.0f), 100.0f};
//     float[] var40 = var35.getColorComponents(var39);
//     java.awt.color.ColorSpace var41 = var35.getColorSpace();
//     java.awt.Color var45 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     float[] var49 = new float[] { 10.0f, (-1.0f), 100.0f};
//     float[] var50 = var45.getColorComponents(var49);
//     java.awt.color.ColorSpace var51 = var45.getColorSpace();
//     java.awt.Color var55 = java.awt.Color.getHSBColor((-1.0f), 100.0f, 10.0f);
//     float[] var59 = new float[] { 10.0f, (-1.0f), 100.0f};
//     float[] var60 = var55.getColorComponents(var59);
//     float[] var61 = var45.getRGBColorComponents(var59);
//     float[] var62 = var30.getColorComponents(var41, var59);
//     boolean var63 = var1.equals((java.lang.Object)var62);
//     
//     // Checks the contract:  equals-hashcode on var1 and var16
//     assertTrue("Contract failed: equals-hashcode on var1 and var16", var1.equals(var16) ? var1.hashCode() == var16.hashCode() : true);
//     
//     // Checks the contract:  equals-hashcode on var16 and var1
//     assertTrue("Contract failed: equals-hashcode on var16 and var1", var16.equals(var1) ? var16.hashCode() == var1.hashCode() : true);
// 
//   }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test12"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    boolean var3 = var2.getAutoPopulateSeriesFillPaint();
    double var4 = var2.getLowerClip();
    var2.setShadowYOffset(1.0E-5d);
    double var7 = var2.getMaximumBarWidth();
    org.jfree.chart.labels.CategoryItemLabelGenerator var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setSeriesItemLabelGenerator((-1), var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1.0d);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test13"); }


    org.jfree.data.time.TimeSeries var3 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)"4", "Combined_Domain_XYPlot", "PlotOrientation.HORIZONTAL");
    org.jfree.data.time.TimeSeriesCollection var4 = new org.jfree.data.time.TimeSeriesCollection(var3);
    int var5 = var4.getSeriesCount();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var8 = var4.isSelected(2147483647, (-457));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test14"); }


    org.jfree.chart.plot.CategoryPlot var0 = new org.jfree.chart.plot.CategoryPlot();
    org.jfree.chart.axis.NumberAxis3D var2 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Paint var3 = var2.getTickLabelPaint();
    org.jfree.chart.plot.CombinedRangeXYPlot var4 = new org.jfree.chart.plot.CombinedRangeXYPlot((org.jfree.chart.axis.ValueAxis)var2);
    org.jfree.chart.plot.CombinedDomainXYPlot var5 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    java.awt.Paint var6 = var5.getRangeMinorGridlinePaint();
    boolean var7 = var5.isRangeMinorGridlinesVisible();
    var5.setDomainCrosshairVisible(false);
    org.jfree.chart.plot.PlotOrientation var10 = var5.getOrientation();
    var4.setOrientation(var10);
    org.jfree.chart.axis.NumberAxis3D var13 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var14 = var13.getAxisLineStroke();
    var13.resizeRange2(0.0d, 10.0d);
    java.awt.Font var18 = var13.getTickLabelFont();
    org.jfree.data.Range var19 = var13.getDefaultAutoRange();
    boolean var20 = var13.isAutoTickUnitSelection();
    java.awt.Stroke var21 = var13.getTickMarkStroke();
    var4.setRangeAxis((org.jfree.chart.axis.ValueAxis)var13);
    org.jfree.chart.plot.IntervalMarker var25 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    java.awt.Stroke var26 = var25.getOutlineStroke();
    org.jfree.chart.plot.PolarPlot var27 = new org.jfree.chart.plot.PolarPlot();
    var27.setBackgroundAlpha(1.0f);
    java.awt.Paint var30 = var27.getBackgroundPaint();
    var25.setPaint(var30);
    var4.addRangeMarker((org.jfree.chart.plot.Marker)var25);
    boolean var33 = var0.removeDomainMarker((org.jfree.chart.plot.Marker)var25);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.mapDatasetToRangeAxis((-1), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test15() {}
//   public void test15() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test15"); }
// 
// 
//     org.jfree.chart.axis.SegmentedTimeline var0 = org.jfree.chart.axis.SegmentedTimeline.newFifteenMinuteTimeline();
//     long var1 = var0.getStartTime();
//     var0.setStartTime(10L);
//     java.util.Date var5 = var0.getDate(10L);
//     org.jfree.data.time.Day var6 = new org.jfree.data.time.Day(var5);
//     org.jfree.data.time.Year var8 = new org.jfree.data.time.Year();
//     org.jfree.data.time.Year var9 = new org.jfree.data.time.Year();
//     long var10 = var9.getMiddleMillisecond();
//     org.jfree.chart.axis.PeriodAxis var11 = new org.jfree.chart.axis.PeriodAxis("10", (org.jfree.data.time.RegularTimePeriod)var8, (org.jfree.data.time.RegularTimePeriod)var9);
//     var11.setMinorTickMarkInsideLength((-1.0f));
//     boolean var14 = var11.isMinorTickMarksVisible();
//     java.util.TimeZone var15 = var11.getTimeZone();
//     java.util.Locale var16 = null;
//     org.jfree.data.time.Year var17 = new org.jfree.data.time.Year(var5, var15, var16);
// 
//   }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test16"); }


    org.jfree.chart.axis.NumberTickUnit var1 = new org.jfree.chart.axis.NumberTickUnit(100.0d);
    org.jfree.data.xy.XYSeries var4 = new org.jfree.data.xy.XYSeries((java.lang.Comparable)100.0d, true, true);
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D("");
    boolean var7 = var4.equals((java.lang.Object)"");
    var4.add((java.lang.Number)100.0d, (java.lang.Number)13, false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jfree.data.xy.XYDataItem var13 = var4.remove(10);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test17"); }


    org.jfree.chart.renderer.xy.XYBarRenderer.setDefaultShadowsVisible(true);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test18"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.axis.NumberAxis3D var3 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var4 = new org.jfree.chart.plot.PolarPlot();
    var4.setBackgroundAlpha(1.0f);
    boolean var7 = var3.hasListener((java.util.EventListener)var4);
    java.awt.Paint var8 = var4.getAngleLabelPaint();
    var1.setLabelPaint(var8);
    java.awt.Shape var10 = var1.getDownArrow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test19"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    boolean var3 = var2.getAutoPopulateSeriesFillPaint();
    double var4 = var2.getLowerClip();
    org.jfree.chart.ChartColor var8 = new org.jfree.chart.ChartColor(10, 100, 1);
    var2.setBasePaint((java.awt.Paint)var8);
    java.awt.Paint var11 = var2.getSeriesPaint(0);
    var2.setDrawBarOutline(true);
    java.awt.Paint var14 = var2.getBaseOutlinePaint();
    boolean var18 = var2.getItemCreateEntity(3, (-1), false);
    var2.setShadowVisible(true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test20"); }


    org.jfree.chart.axis.NumberAxis3D var1 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var2 = var1.getAxisLineStroke();
    var1.resizeRange2(0.0d, 10.0d);
    var1.setMinorTickMarkOutsideLength(10.0f);
    org.jfree.data.RangeType var8 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setRangeType(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test21"); }


    org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    java.awt.Paint var4 = var2.lookupSeriesPaint(10);
    java.awt.Stroke var6 = var2.lookupSeriesOutlineStroke(13);
    org.jfree.chart.renderer.category.BarRenderer3D var9 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
    java.awt.Paint var11 = var9.lookupSeriesPaint(10);
    java.awt.Stroke var13 = var9.lookupSeriesOutlineStroke(13);
    var2.setBaseStroke(var13);
    java.awt.Paint var16 = var2.getSeriesFillPaint(0);
    org.jfree.chart.annotations.CategoryAnnotation var17 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.addAnnotation(var17);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test22"); }


    org.jfree.chart.renderer.xy.XYStepAreaRenderer var0 = new org.jfree.chart.renderer.xy.XYStepAreaRenderer();
    boolean var1 = var0.getShapesVisible();
    org.jfree.chart.plot.IntervalMarker var9 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    org.jfree.chart.plot.PolarPlot var10 = new org.jfree.chart.plot.PolarPlot();
    var10.setBackgroundAlpha(1.0f);
    java.awt.Paint var13 = var10.getBackgroundPaint();
    var9.setLabelPaint(var13);
    org.jfree.chart.block.BlockBorder var15 = new org.jfree.chart.block.BlockBorder(0.0d, (-1.0d), 0.0d, 100.0d, var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setSeriesOutlinePaint(2147483647, var13, true);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test23() {}
//   public void test23() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test23"); }
// 
// 
//     java.util.TimeZone var0 = null;
//     org.jfree.data.time.TimeSeriesCollection var1 = new org.jfree.data.time.TimeSeriesCollection(var0);
//     double var3 = var1.getDomainLowerBound(false);
//     java.lang.Number var4 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue((org.jfree.data.xy.XYDataset)var1);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       double var7 = var1.getEndXValue(0, 100);
//       fail("Expected exception of type java.lang.IndexOutOfBoundsException");
//     } catch (java.lang.IndexOutOfBoundsException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue("'" + var4 + "' != '" + Double.NaN+ "'", var4.equals(Double.NaN));
// 
//   }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test24"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    boolean var5 = var0.isDomainMinorGridlinesVisible();
    org.jfree.chart.axis.NumberAxis3D var6 = new org.jfree.chart.axis.NumberAxis3D();
    org.jfree.chart.axis.NumberAxis3D var8 = new org.jfree.chart.axis.NumberAxis3D("");
    org.jfree.chart.plot.PolarPlot var9 = new org.jfree.chart.plot.PolarPlot();
    var9.setBackgroundAlpha(1.0f);
    boolean var12 = var8.hasListener((java.util.EventListener)var9);
    java.awt.Shape var13 = var8.getLeftArrow();
    org.jfree.chart.entity.AxisLabelEntity var16 = new org.jfree.chart.entity.AxisLabelEntity((org.jfree.chart.axis.Axis)var6, var13, "hi!", "hi!");
    org.jfree.chart.axis.NumberAxis3D var18 = new org.jfree.chart.axis.NumberAxis3D("");
    java.awt.Stroke var19 = var18.getAxisLineStroke();
    var18.resizeRange2(0.0d, 10.0d);
    org.jfree.chart.entity.AxisEntity var24 = new org.jfree.chart.entity.AxisEntity(var13, (org.jfree.chart.axis.Axis)var18, "hi!");
    int var25 = var0.getRangeAxisIndex((org.jfree.chart.axis.ValueAxis)var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var18.setRange(10.0d, 3.9999900000000004d);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == (-1));

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test25"); }


    org.jfree.chart.renderer.xy.XYAreaRenderer var0 = new org.jfree.chart.renderer.xy.XYAreaRenderer();
    org.jfree.chart.plot.XYPlot var1 = var0.getPlot();
    var0.removeAnnotations();
    var0.setUseFillPaint(false);
    org.jfree.chart.plot.DrawingSupplier var5 = var0.getDrawingSupplier();
    org.jfree.chart.urls.XYURLGenerator var7 = var0.getSeriesURLGenerator((-398));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);

  }

  public void test26() {}
//   public void test26() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test26"); }
// 
// 
//     org.jfree.chart.axis.SegmentedTimeline var0 = org.jfree.chart.axis.SegmentedTimeline.newMondayThroughFridayTimeline();
//     org.jfree.chart.axis.DateAxis var1 = new org.jfree.chart.axis.DateAxis();
//     java.util.Date var2 = var1.getMaximumDate();
//     long var3 = var0.toTimelineValue(var2);
//     org.jfree.data.time.Year var5 = new org.jfree.data.time.Year();
//     org.jfree.data.time.Year var6 = new org.jfree.data.time.Year();
//     long var7 = var6.getMiddleMillisecond();
//     org.jfree.chart.axis.PeriodAxis var8 = new org.jfree.chart.axis.PeriodAxis("10", (org.jfree.data.time.RegularTimePeriod)var5, (org.jfree.data.time.RegularTimePeriod)var6);
//     var8.setMinorTickMarkInsideLength((-1.0f));
//     boolean var11 = var8.isMinorTickMarksVisible();
//     java.util.TimeZone var12 = var8.getTimeZone();
//     org.jfree.data.time.Day var13 = new org.jfree.data.time.Day(var2, var12);
//     org.jfree.data.time.TimeSeriesCollection var14 = new org.jfree.data.time.TimeSeriesCollection(var12);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       int var16 = var14.getItemCount(13);
//       fail("Expected exception of type java.lang.IllegalArgumentException");
//     } catch (java.lang.IllegalArgumentException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var0);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var2);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == 1577894400001L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var7 == 1404331199999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var11 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var12);
// 
//   }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test27"); }


    org.jfree.data.time.DateRange var0 = new org.jfree.data.time.DateRange();
    java.util.Date var1 = var0.getUpperDate();
    double var2 = var0.getUpperBound();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1.0d);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test28"); }


    org.jfree.chart.axis.LogAxis var0 = new org.jfree.chart.axis.LogAxis();
    org.jfree.chart.plot.CombinedDomainXYPlot var1 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var1.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var5 = var1.getOrientation();
    org.jfree.chart.JFreeChart var6 = new org.jfree.chart.JFreeChart((org.jfree.chart.plot.Plot)var1);
    var6.fireChartChanged();
    org.jfree.data.xy.DefaultXYDataset var8 = new org.jfree.data.xy.DefaultXYDataset();
    org.jfree.chart.plot.PolarPlot var9 = new org.jfree.chart.plot.PolarPlot();
    var9.setBackgroundAlpha(1.0f);
    var8.addChangeListener((org.jfree.data.general.DatasetChangeListener)var9);
    java.awt.Paint var13 = var9.getAngleGridlinePaint();
    org.jfree.chart.plot.PlotRenderingInfo var16 = null;
    var9.handleClick((-398), 0, var16);
    org.jfree.chart.title.LegendTitle var18 = new org.jfree.chart.title.LegendTitle((org.jfree.chart.LegendItemSource)var9);
    var6.addLegend(var18);
    boolean var20 = var0.equals((java.lang.Object)var6);
    org.jfree.chart.util.RectangleInsets var21 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.setPadding(var21);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test29"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var1 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    java.awt.Graphics2D var2 = null;
    java.awt.geom.Rectangle2D var3 = null;
    org.jfree.chart.plot.PlotRenderingInfo var5 = null;
    org.jfree.chart.plot.CrosshairState var6 = null;
    boolean var7 = var1.render(var2, var3, 0, var5, var6);
    org.jfree.chart.JFreeChart var8 = new org.jfree.chart.JFreeChart("TitleEntity: tooltip = AxisLabelEntity: label = null", (org.jfree.chart.plot.Plot)var1);
    org.jfree.chart.event.ChartChangeListener var9 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.addChangeListener(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test30"); }


    org.jfree.chart.plot.CombinedDomainXYPlot var0 = new org.jfree.chart.plot.CombinedDomainXYPlot();
    var0.setDomainCrosshairValue(1.0d, true);
    org.jfree.chart.plot.PlotOrientation var4 = var0.getOrientation();
    org.jfree.chart.plot.IntervalMarker var7 = new org.jfree.chart.plot.IntervalMarker(0.0d, 1.0d);
    java.awt.Stroke var8 = var7.getOutlineStroke();
    org.jfree.chart.plot.PolarPlot var9 = new org.jfree.chart.plot.PolarPlot();
    var9.setBackgroundAlpha(1.0f);
    java.awt.Paint var12 = var9.getBackgroundPaint();
    var7.setPaint(var12);
    var0.setRangeMinorGridlinePaint(var12);
    org.jfree.chart.axis.AxisSpace var15 = null;
    var0.setFixedDomainAxisSpace(var15);
    java.awt.Stroke var17 = var0.getRangeZeroBaselineStroke();
    org.jfree.chart.axis.ValueAxis var19 = null;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setRangeAxis(2147483647, var19);
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest1.test31"); }


    org.jfree.chart.LegendItem var1 = new org.jfree.chart.LegendItem("");
    java.lang.Object var2 = var1.clone();
    org.jfree.data.xy.DefaultXYDataset var3 = new org.jfree.data.xy.DefaultXYDataset();
    var1.setDataset((org.jfree.data.general.Dataset)var3);
    var3.removeSeries((java.lang.Comparable)0.5d);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test32() {}
//   public void test32() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test32"); }
// 
// 
//     org.jfree.chart.plot.WaferMapPlot var0 = new org.jfree.chart.plot.WaferMapPlot();
//     org.jfree.chart.event.RendererChangeEvent var2 = new org.jfree.chart.event.RendererChangeEvent((java.lang.Object)(short)1);
//     var0.rendererChanged(var2);
//     org.jfree.chart.renderer.WaferMapRenderer var4 = null;
//     var0.setRenderer(var4);
//     org.jfree.chart.LegendItemCollection var6 = var0.getLegendItems();
// 
//   }

  public void test33() {}
//   public void test33() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test33"); }
// 
// 
//     java.util.TimeZone var0 = null;
//     org.jfree.data.time.TimeSeriesCollection var1 = new org.jfree.data.time.TimeSeriesCollection(var0);
//     double var3 = var1.getDomainLowerBound(false);
//     var1.removeAllSeries();
//     org.jfree.chart.plot.PiePlot3D var5 = new org.jfree.chart.plot.PiePlot3D();
//     org.jfree.chart.plot.CombinedDomainXYPlot var6 = new org.jfree.chart.plot.CombinedDomainXYPlot();
//     java.awt.Paint var7 = var6.getRangeMinorGridlinePaint();
//     boolean var8 = var6.isRangeMinorGridlinesVisible();
//     var6.setDomainCrosshairVisible(false);
//     org.jfree.chart.plot.PlotOrientation var11 = var6.getOrientation();
//     org.jfree.chart.renderer.category.BarRenderer3D var14 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
//     boolean var15 = var14.getAutoPopulateSeriesFillPaint();
//     org.jfree.chart.axis.NumberAxis3D var17 = new org.jfree.chart.axis.NumberAxis3D("");
//     java.awt.Stroke var18 = var17.getAxisLineStroke();
//     var14.setBaseOutlineStroke(var18, false);
//     var6.setDomainCrosshairStroke(var18);
//     var5.setLabelOutlineStroke(var18);
//     boolean var23 = var1.equals((java.lang.Object)var18);
//     org.jfree.data.time.TimeSeries var27 = new org.jfree.data.time.TimeSeries((java.lang.Comparable)"4", "Combined_Domain_XYPlot", "PlotOrientation.HORIZONTAL");
//     org.jfree.data.time.Year var28 = new org.jfree.data.time.Year();
//     long var29 = var28.getMiddleMillisecond();
//     org.jfree.data.time.RegularTimePeriod var30 = var28.previous();
//     var27.add((org.jfree.data.time.RegularTimePeriod)var28, (java.lang.Number)100.0f, false);
//     var1.addSeries(var27);
//     // The following exception was thrown during execution.
//     // This behavior will recorded for regression testing.
//     try {
//       java.lang.Number var37 = var1.getY(3, 1);
//       fail("Expected exception of type java.lang.IndexOutOfBoundsException");
//     } catch (java.lang.IndexOutOfBoundsException e) {
//       // Expected exception.
//     }
//     
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var3 == Double.NaN);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var7);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var8 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var11);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var15 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var18);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var23 == false);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertTrue(var29 == 1404331199999L);
//     
//     // Regression assertion (captures the current behavior of the code)
//     assertNotNull(var30);
// 
//   }

  public void test34() {}
//   public void test34() throws Throwable {
// 
//     if (debug) { System.out.println(); System.out.print("RandoopTest1.test34"); }
// 
// 
//     org.jfree.chart.renderer.category.BarRenderer3D var2 = new org.jfree.chart.renderer.category.BarRenderer3D(1.0E-8d, 0.0d);
//     boolean var3 = var2.getAutoPopulateSeriesFillPaint();
//     double var4 = var2.getLowerClip();
//     org.jfree.chart.ChartColor var8 = new org.jfree.chart.ChartColor(10, 100, 1);
//     var2.setBasePaint((java.awt.Paint)var8);
/