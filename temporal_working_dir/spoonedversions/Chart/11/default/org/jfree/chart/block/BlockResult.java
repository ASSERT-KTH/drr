

package org.jfree.chart.block;


public class BlockResult implements org.jfree.chart.block.EntityBlockResult {
	private org.jfree.chart.entity.EntityCollection entities;

	public BlockResult() {
		org.jfree.chart.block.BlockResult.this.entities = null;
	}

	public org.jfree.chart.entity.EntityCollection getEntityCollection() {
		return org.jfree.chart.block.BlockResult.this.entities;
	}

	public void setEntityCollection(org.jfree.chart.entity.EntityCollection entities) {
		org.jfree.chart.block.BlockResult.this.entities = entities;
	}
}

