

package org.jfree.chart.util;


public class ApplicationFrame extends javax.swing.JFrame implements java.awt.event.WindowListener {
	public ApplicationFrame(java.lang.String title) {
		super(title);
		addWindowListener(org.jfree.chart.util.ApplicationFrame.this);
	}

	public void windowClosing(java.awt.event.WindowEvent event) {
		if ((event.getWindow()) == (org.jfree.chart.util.ApplicationFrame.this)) {
			dispose();
			java.lang.System.exit(0);
		}
	}

	public void windowClosed(java.awt.event.WindowEvent event) {
	}

	public void windowActivated(java.awt.event.WindowEvent event) {
	}

	public void windowDeactivated(java.awt.event.WindowEvent event) {
	}

	public void windowDeiconified(java.awt.event.WindowEvent event) {
	}

	public void windowIconified(java.awt.event.WindowEvent event) {
	}

	public void windowOpened(java.awt.event.WindowEvent event) {
	}
}

