

package org.jfree.chart.title;


public abstract class Title extends org.jfree.chart.block.AbstractBlock implements java.io.Serializable , java.lang.Cloneable , org.jfree.chart.block.Block {
	private static final long serialVersionUID = -6675162505277817221L;

	public static final org.jfree.chart.util.RectangleEdge DEFAULT_POSITION = org.jfree.chart.util.RectangleEdge.TOP;

	public static final org.jfree.chart.util.HorizontalAlignment DEFAULT_HORIZONTAL_ALIGNMENT = org.jfree.chart.util.HorizontalAlignment.CENTER;

	public static final org.jfree.chart.util.VerticalAlignment DEFAULT_VERTICAL_ALIGNMENT = org.jfree.chart.util.VerticalAlignment.CENTER;

	public static final org.jfree.chart.util.RectangleInsets DEFAULT_PADDING = new org.jfree.chart.util.RectangleInsets(1, 1, 1, 1);

	private org.jfree.chart.util.RectangleEdge position;

	private org.jfree.chart.util.HorizontalAlignment horizontalAlignment;

	private org.jfree.chart.util.VerticalAlignment verticalAlignment;

	private transient javax.swing.event.EventListenerList listenerList;

	private boolean notify;

	protected Title() {
		this(org.jfree.chart.title.Title.DEFAULT_POSITION, org.jfree.chart.title.Title.DEFAULT_HORIZONTAL_ALIGNMENT, org.jfree.chart.title.Title.DEFAULT_VERTICAL_ALIGNMENT, org.jfree.chart.title.Title.DEFAULT_PADDING);
	}

	protected Title(org.jfree.chart.util.RectangleEdge position, org.jfree.chart.util.HorizontalAlignment horizontalAlignment, org.jfree.chart.util.VerticalAlignment verticalAlignment) {
		this(position, horizontalAlignment, verticalAlignment, org.jfree.chart.title.Title.DEFAULT_PADDING);
	}

	protected Title(org.jfree.chart.util.RectangleEdge position, org.jfree.chart.util.HorizontalAlignment horizontalAlignment, org.jfree.chart.util.VerticalAlignment verticalAlignment, org.jfree.chart.util.RectangleInsets padding) {
		if (position == null) {
			throw new java.lang.IllegalArgumentException("Null 'position' argument.");
		}
		if (horizontalAlignment == null) {
			throw new java.lang.IllegalArgumentException("Null 'horizontalAlignment' argument.");
		}
		if (verticalAlignment == null) {
			throw new java.lang.IllegalArgumentException("Null 'verticalAlignment' argument.");
		}
		if (padding == null) {
			throw new java.lang.IllegalArgumentException("Null 'spacer' argument.");
		}
		org.jfree.chart.title.Title.this.position = position;
		org.jfree.chart.title.Title.this.horizontalAlignment = horizontalAlignment;
		org.jfree.chart.title.Title.this.verticalAlignment = verticalAlignment;
		setPadding(padding);
		org.jfree.chart.title.Title.this.listenerList = new javax.swing.event.EventListenerList();
		org.jfree.chart.title.Title.this.notify = true;
	}

	public org.jfree.chart.util.RectangleEdge getPosition() {
		return org.jfree.chart.title.Title.this.position;
	}

	public void setPosition(org.jfree.chart.util.RectangleEdge position) {
		if (position == null) {
			throw new java.lang.IllegalArgumentException("Null 'position' argument.");
		}
		if ((org.jfree.chart.title.Title.this.position) != position) {
			org.jfree.chart.title.Title.this.position = position;
			notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.Title.this));
		}
	}

	public org.jfree.chart.util.HorizontalAlignment getHorizontalAlignment() {
		return org.jfree.chart.title.Title.this.horizontalAlignment;
	}

	public void setHorizontalAlignment(org.jfree.chart.util.HorizontalAlignment alignment) {
		if (alignment == null) {
			throw new java.lang.IllegalArgumentException("Null 'alignment' argument.");
		}
		if ((org.jfree.chart.title.Title.this.horizontalAlignment) != alignment) {
			org.jfree.chart.title.Title.this.horizontalAlignment = alignment;
			notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.Title.this));
		}
	}

	public org.jfree.chart.util.VerticalAlignment getVerticalAlignment() {
		return org.jfree.chart.title.Title.this.verticalAlignment;
	}

	public void setVerticalAlignment(org.jfree.chart.util.VerticalAlignment alignment) {
		if (alignment == null) {
			throw new java.lang.IllegalArgumentException("Null 'alignment' argument.");
		}
		if ((org.jfree.chart.title.Title.this.verticalAlignment) != alignment) {
			org.jfree.chart.title.Title.this.verticalAlignment = alignment;
			notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.Title.this));
		}
	}

	public boolean getNotify() {
		return org.jfree.chart.title.Title.this.notify;
	}

	public void setNotify(boolean flag) {
		org.jfree.chart.title.Title.this.notify = flag;
		if (flag) {
			notifyListeners(new org.jfree.chart.event.TitleChangeEvent(org.jfree.chart.title.Title.this));
		}
	}

	public abstract void draw(java.awt.Graphics2D g2, java.awt.geom.Rectangle2D area);

	public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
		org.jfree.chart.title.Title duplicate = ((org.jfree.chart.title.Title) (super.clone()));
		duplicate.listenerList = new javax.swing.event.EventListenerList();
		return duplicate;
	}

	public void addChangeListener(org.jfree.chart.event.TitleChangeListener listener) {
		org.jfree.chart.title.Title.this.listenerList.add(org.jfree.chart.event.TitleChangeListener.class, listener);
	}

	public void removeChangeListener(org.jfree.chart.event.TitleChangeListener listener) {
		org.jfree.chart.title.Title.this.listenerList.remove(org.jfree.chart.event.TitleChangeListener.class, listener);
	}

	protected void notifyListeners(org.jfree.chart.event.TitleChangeEvent event) {
		if (org.jfree.chart.title.Title.this.notify) {
			java.lang.Object[] listeners = org.jfree.chart.title.Title.this.listenerList.getListenerList();
			for (int i = (listeners.length) - 2; i >= 0; i -= 2) {
				if ((listeners[i]) == (org.jfree.chart.event.TitleChangeListener.class)) {
					((org.jfree.chart.event.TitleChangeListener) (listeners[(i + 1)])).titleChanged(event);
				}
			}
		}
	}

	public boolean equals(java.lang.Object obj) {
		if (obj == (org.jfree.chart.title.Title.this)) {
			return true;
		}
		if (!(obj instanceof org.jfree.chart.title.Title)) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		org.jfree.chart.title.Title that = ((org.jfree.chart.title.Title) (obj));
		if ((org.jfree.chart.title.Title.this.position) != (that.position)) {
			return false;
		}
		if ((org.jfree.chart.title.Title.this.horizontalAlignment) != (that.horizontalAlignment)) {
			return false;
		}
		if ((org.jfree.chart.title.Title.this.verticalAlignment) != (that.verticalAlignment)) {
			return false;
		}
		if ((org.jfree.chart.title.Title.this.notify) != (that.notify)) {
			return false;
		}
		return true;
	}

	public int hashCode() {
		int result = 193;
		result = (37 * result) + (org.jfree.chart.util.ObjectUtilities.hashCode(org.jfree.chart.title.Title.this.position));
		result = (37 * result) + (org.jfree.chart.util.ObjectUtilities.hashCode(org.jfree.chart.title.Title.this.horizontalAlignment));
		result = (37 * result) + (org.jfree.chart.util.ObjectUtilities.hashCode(org.jfree.chart.title.Title.this.verticalAlignment));
		return result;
	}

	private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
		stream.defaultWriteObject();
	}

	private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
		stream.defaultReadObject();
		org.jfree.chart.title.Title.this.listenerList = new javax.swing.event.EventListenerList();
	}
}

