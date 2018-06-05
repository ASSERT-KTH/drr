

package org.jfree.chart.block;


public class BlockContainer extends org.jfree.chart.block.AbstractBlock implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.block.Block , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 8199508075695195293L;

	private java.util.List blocks;

	private org.jfree.chart.block.Arrangement arrangement;

	public BlockContainer() {
		this(new org.jfree.chart.block.BorderArrangement());
	}

	public BlockContainer(org.jfree.chart.block.Arrangement arrangement) {
		if (arrangement == null) {
			throw new java.lang.IllegalArgumentException("Null 'arrangement' argument.");
		}
		org.jfree.chart.block.BlockContainer.this.arrangement = arrangement;
		org.jfree.chart.block.BlockContainer.this.blocks = new java.util.ArrayList();
	}

	public org.jfree.chart.block.Arrangement getArrangement() {
		return org.jfree.chart.block.BlockContainer.this.arrangement;
	}

	public void setArrangement(org.jfree.chart.block.Arrangement arrangement) {
		if (arrangement == null) {
			throw new java.lang.IllegalArgumentException("Null 'arrangement' argument.");
		}
		org.jfree.chart.block.BlockContainer.this.arrangement = arrangement;
	}

	public boolean isEmpty() {
		return org.jfree.chart.block.BlockContainer.this.blocks.isEmpty();
	}

	public java.util.List getBlocks() {
		return java.util.Collections.unmodifiableList(org.jfree.chart.block.BlockContainer.this.blocks);
	}

	public void add(org.jfree.chart.block.Block block) {
		add(block, null);
	}

	public void add(org.jfree.chart.block.Block block, java.lang.Object key) {
		org.jfree.chart.block.BlockContainer.this.blocks.add(block);
		org.jfree.chart.block.BlockContainer.this.arrangement.add(block, key);
	}

	public void clear() {
		org.jfree.chart.block.BlockContainer.this.blocks.clear();
		org.jfree.chart.block.BlockContainer.this.arrangement.clear();
	}

	public org.jfree.chart.util.Size2D arrange(java.awt.Graphics2D g2, org.jfree.chart.block.RectangleConstraint constraint) {
		return org.jfree.chart.block.BlockContainer.this.arrangement.arrange(org.jfree.chart.block.BlockContainer.this, g2, constraint);
	}

	public void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area) {
		draw(g2, area, null);
	}

	public java.lang.Object draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area, java.lang.Object params) {
		org.jfree.chart.block.EntityBlockParams ebp = null;
		org.jfree.chart.entity.StandardEntityCollection sec = null;
		if (params instanceof org.jfree.chart.block.EntityBlockParams) {
			ebp = ((org.jfree.chart.block.EntityBlockParams) (params));
			if (ebp.getGenerateEntities()) {
				sec = new org.jfree.chart.entity.StandardEntityCollection();
			}
		}
		java.awt.geom.Rectangle2D contentArea = ((java.awt.geom.Rectangle2D) (area.clone()));
		contentArea = trimMargin(contentArea);
		drawBorder(g2, contentArea);
		contentArea = trimBorder(contentArea);
		contentArea = trimPadding(contentArea);
		java.util.Iterator iterator = org.jfree.chart.block.BlockContainer.this.blocks.iterator();
		while (iterator.hasNext()) {
			org.jfree.chart.block.Block block = ((org.jfree.chart.block.Block) (iterator.next()));
			java.awt.geom.Rectangle2D bounds = block.getBounds();
			java.awt.geom.Rectangle2D drawArea = new java.awt.geom.Rectangle2D.Double(((bounds.getX()) + (area.getX())), ((bounds.getY()) + (area.getY())), bounds.getWidth(), bounds.getHeight());
			java.lang.Object r = block.draw(g2, drawArea, params);
			if (sec != null) {
				if (r instanceof org.jfree.chart.block.EntityBlockResult) {
					org.jfree.chart.block.EntityBlockResult ebr = ((org.jfree.chart.block.EntityBlockResult) (r));
					org.jfree.chart.entity.EntityCollection ec = ebr.getEntityCollection();
					sec.addAll(ec);
				}
			}
		} 
		org.jfree.chart.block.BlockResult result = null;
		if (sec != null) {
			result = new org.jfree.chart.block.BlockResult();
			result.setEntityCollection(sec);
		}
		return result;
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.block.BlockContainer.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.block.BlockContainer)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.block.BlockContainer that = ((org.jfree.chart.block.BlockContainer) (obj));
		if (!(org.jfree.chart.block.BlockContainer.this.arrangement.equals(that.arrangement))) {
			return false;
		}
		if (!(org.jfree.chart.block.BlockContainer.this.blocks.equals(that.blocks))) {
			return false;
		}
		return true;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.block.BlockContainer clone = ((org.jfree.chart.block.BlockContainer) (super.clone()));
		return clone;
	}
}

