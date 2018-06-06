

package org.jfree.chart.panel;


public class AbstractMouseHandler implements java.awt.event.MouseListener , java.awt.event.MouseMotionListener {
	private int modifier;

	public AbstractMouseHandler() {
		org.jfree.chart.panel.AbstractMouseHandler.this.modifier = 0;
	}

	public int getModifier() {
		return org.jfree.chart.panel.AbstractMouseHandler.this.modifier;
	}

	public void setModifier(int modifier) {
		org.jfree.chart.panel.AbstractMouseHandler.this.modifier = modifier;
	}

	public void mousePressed(java.awt.event.MouseEvent e) {
	}

	public void mouseReleased(java.awt.event.MouseEvent e) {
	}

	public void mouseClicked(java.awt.event.MouseEvent e) {
	}

	public void mouseEntered(java.awt.event.MouseEvent e) {
	}

	public void mouseMoved(java.awt.event.MouseEvent e) {
	}

	public void mouseExited(java.awt.event.MouseEvent e) {
	}

	public void mouseDragged(java.awt.event.MouseEvent e) {
	}
}

