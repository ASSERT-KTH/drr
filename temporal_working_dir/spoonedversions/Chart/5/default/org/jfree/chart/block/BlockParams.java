

package org.jfree.chart.block;


public class BlockParams implements org.jfree.chart.block.EntityBlockParams {
	private boolean generateEntities;

	private double translateX;

	private double translateY;

	public BlockParams() {
		org.jfree.chart.block.BlockParams.this.translateX = 0.0;
		org.jfree.chart.block.BlockParams.this.translateY = 0.0;
		org.jfree.chart.block.BlockParams.this.generateEntities = false;
	}

	public boolean getGenerateEntities() {
		return org.jfree.chart.block.BlockParams.this.generateEntities;
	}

	public void setGenerateEntities(boolean generate) {
		org.jfree.chart.block.BlockParams.this.generateEntities = generate;
	}

	public double getTranslateX() {
		return org.jfree.chart.block.BlockParams.this.translateX;
	}

	public void setTranslateX(double x) {
		org.jfree.chart.block.BlockParams.this.translateX = x;
	}

	public double getTranslateY() {
		return org.jfree.chart.block.BlockParams.this.translateY;
	}

	public void setTranslateY(double y) {
		org.jfree.chart.block.BlockParams.this.translateY = y;
	}
}

