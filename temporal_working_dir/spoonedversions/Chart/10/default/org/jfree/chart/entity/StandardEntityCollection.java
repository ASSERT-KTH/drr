

package org.jfree.chart.entity;


public class StandardEntityCollection implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.entity.EntityCollection , org.jfree.chart.util.PublicCloneable {
	private static final long serialVersionUID = 5384773031184897047L;

	private java.util.List entities;

	public StandardEntityCollection() {
		org.jfree.chart.entity.StandardEntityCollection.this.entities = new java.util.ArrayList();
	}

	public int getEntityCount() {
		return org.jfree.chart.entity.StandardEntityCollection.this.entities.size();
	}

	public org.jfree.chart.entity.ChartEntity getEntity(int index) {
		return ((org.jfree.chart.entity.ChartEntity) (org.jfree.chart.entity.StandardEntityCollection.this.entities.get(index)));
	}

	public void clear() {
		org.jfree.chart.entity.StandardEntityCollection.this.entities.clear();
	}

	public void add(org.jfree.chart.entity.ChartEntity entity) {
		if (entity == null) {
			throw new java.lang.IllegalArgumentException("Null 'entity' argument.");
		}
		org.jfree.chart.entity.StandardEntityCollection.this.entities.add(entity);
	}

	public void addAll(org.jfree.chart.entity.EntityCollection collection) {
		org.jfree.chart.entity.StandardEntityCollection.this.entities.addAll(collection.getEntities());
	}

	public org.jfree.chart.entity.ChartEntity getEntity(double x, double y) {
		int entityCount = org.jfree.chart.entity.StandardEntityCollection.this.entities.size();
		for (int i = entityCount - 1; i >= 0; i--) {
			org.jfree.chart.entity.ChartEntity entity = ((org.jfree.chart.entity.ChartEntity) (org.jfree.chart.entity.StandardEntityCollection.this.entities.get(i)));
			if (entity.getArea().contains(x, y)) {
				return entity;
			}
		}
		return null;
	}

	public java.util.Collection getEntities() {
		return java.util.Collections.unmodifiableCollection(org.jfree.chart.entity.StandardEntityCollection.this.entities);
	}

	public java.util.Iterator iterator() {
		return org.jfree.chart.entity.StandardEntityCollection.this.entities.iterator();
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.entity.StandardEntityCollection.this)) {
			return true;
		}
		if (obj instanceof org.jfree.chart.entity.StandardEntityCollection) {
			org.jfree.chart.entity.StandardEntityCollection that = ((org.jfree.chart.entity.StandardEntityCollection) (obj));
			return org.jfree.chart.util.ObjectUtilities.equal(org.jfree.chart.entity.StandardEntityCollection.this.entities, that.entities);
		}
		return false;
	}

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.entity.StandardEntityCollection clone = ((org.jfree.chart.entity.StandardEntityCollection) (super.clone()));
		clone.entities = new java.util.ArrayList(org.jfree.chart.entity.StandardEntityCollection.this.entities.size());
		for (int i = 0; i < (org.jfree.chart.entity.StandardEntityCollection.this.entities.size()); i++) {
			org.jfree.chart.entity.ChartEntity entity = ((org.jfree.chart.entity.ChartEntity) (org.jfree.chart.entity.StandardEntityCollection.this.entities.get(i)));
			clone.entities.add(entity.clone());
		}
		return clone;
	}
}

