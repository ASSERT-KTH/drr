

package org.jfree.data.xml;


public class ValueHandler extends org.xml.sax.helpers.DefaultHandler implements org.jfree.data.xml.DatasetTags {
	private org.jfree.data.xml.RootHandler rootHandler;

	private org.jfree.data.xml.ItemHandler itemHandler;

	private java.lang.StringBuffer currentText;

	public ValueHandler(org.jfree.data.xml.RootHandler rootHandler, org.jfree.data.xml.ItemHandler itemHandler) {
		org.jfree.data.xml.ValueHandler.this.rootHandler = rootHandler;
		org.jfree.data.xml.ValueHandler.this.itemHandler = itemHandler;
		org.jfree.data.xml.ValueHandler.this.currentText = new java.lang.StringBuffer();
	}

	public void startElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
		if (qName.equals(org.jfree.data.xml.DatasetTags.VALUE_TAG)) {
			clearCurrentText();
		}else {
			throw new org.xml.sax.SAXException(("Expecting <Value> but found " + qName));
		}
	}

	public void endElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
		if (qName.equals(org.jfree.data.xml.DatasetTags.VALUE_TAG)) {
			java.lang.Number value;
			try {
				value = java.lang.Double.valueOf(org.jfree.data.xml.ValueHandler.this.currentText.toString());
				if (((java.lang.Double) (value)).isNaN()) {
					value = null;
				}
			} catch (java.lang.NumberFormatException e1) {
				value = null;
			}
			org.jfree.data.xml.ValueHandler.this.itemHandler.setValue(value);
			org.jfree.data.xml.ValueHandler.this.rootHandler.popSubHandler();
		}else {
			throw new org.xml.sax.SAXException(("Expecting </Value> but found " + qName));
		}
	}

	public void characters(char[] ch, int start, int length) {
		if ((org.jfree.data.xml.ValueHandler.this.currentText) != null) {
			org.jfree.data.xml.ValueHandler.this.currentText.append(java.lang.String.copyValueOf(ch, start, length));
		}
	}

	protected java.lang.String getCurrentText() {
		return org.jfree.data.xml.ValueHandler.this.currentText.toString();
	}

	protected void clearCurrentText() {
		org.jfree.data.xml.ValueHandler.this.currentText.delete(0, org.jfree.data.xml.ValueHandler.this.currentText.length());
	}
}

