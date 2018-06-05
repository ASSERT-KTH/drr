

package org.jfree.data.xml;


public class RootHandler extends org.xml.sax.helpers.DefaultHandler implements org.jfree.data.xml.DatasetTags {
	private java.util.Stack subHandlers;

	public RootHandler() {
		org.jfree.data.xml.RootHandler.this.subHandlers = new java.util.Stack();
	}

	public java.util.Stack getSubHandlers() {
		return org.jfree.data.xml.RootHandler.this.subHandlers;
	}

	public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
		org.xml.sax.helpers.DefaultHandler handler = getCurrentHandler();
		if (handler != (org.jfree.data.xml.RootHandler.this)) {
			handler.characters(ch, start, length);
		}
	}

	public org.xml.sax.helpers.DefaultHandler getCurrentHandler() {
		org.xml.sax.helpers.DefaultHandler result = org.jfree.data.xml.RootHandler.this;
		if ((org.jfree.data.xml.RootHandler.this.subHandlers) != null) {
			if ((org.jfree.data.xml.RootHandler.this.subHandlers.size()) > 0) {
				java.lang.Object top = org.jfree.data.xml.RootHandler.this.subHandlers.peek();
				if (top != null) {
					result = ((org.xml.sax.helpers.DefaultHandler) (top));
				}
			}
		}
		return result;
	}

	public void pushSubHandler(org.xml.sax.helpers.DefaultHandler subhandler) {
		org.jfree.data.xml.RootHandler.this.subHandlers.push(subhandler);
	}

	public org.xml.sax.helpers.DefaultHandler popSubHandler() {
		return ((org.xml.sax.helpers.DefaultHandler) (org.jfree.data.xml.RootHandler.this.subHandlers.pop()));
	}
}

