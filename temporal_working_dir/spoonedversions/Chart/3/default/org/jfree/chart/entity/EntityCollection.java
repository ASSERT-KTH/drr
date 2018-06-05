

package org.jfree.chart.entity;


public interface EntityCollection {
	public void clear();

	public void add(org.jfree.chart.entity.ChartEntity entity);

	public void addAll(org.jfree.chart.entity.EntityCollection collection);

	public org.jfree.chart.entity.ChartEntity getEntity(double x, double y);

	public org.jfree.chart.entity.ChartEntity getEntity(int index);

	public int getEntityCount();

	public java.util.Collection getEntities();

	public java.util.Iterator iterator();
}

