

package org.jfree.data.xml;


public class KeyHandler extends org.xml.sax.helpers.DefaultHandler implements org.jfree.data.xml.DatasetTags {
	private org.jfree.data.xml.RootHandler rootHandler;

	private org.jfree.data.xml.ItemHandler itemHandler;

	private java.lang.StringBuffer currentText;

	public KeyHandler(org.jfree.data.xml.RootHandler rootHandler, org.jfree.data.xml.ItemHandler itemHandler) {
		org.jfree.data.xml.KeyHandler.this.rootHandler = rootHandler;
		org.jfree.data.xml.KeyHandler.this.itemHandler = itemHandler;
		org.jfree.data.xml.KeyHandler.this.currentText = new java.lang.StringBuffer();
	}

	public void startElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) throws org.xml.sax.SAXException {
		if (qName.equals(org.jfree.data.xml.DatasetTags.KEY_TAG)) {
			clearCurrentText();
		}else {
			throw new org.xml.sax.SAXException(("Expecting <Key> but found " + qName));
		}
	}

	public void endElement(java.lang.String namespaceURI, java.lang.String localName, java.lang.String qName) throws org.xml.sax.SAXException {
		if (qName.equals(org.jfree.data.xml.DatasetTags.KEY_TAG)) {
			org.jfree.data.xml.KeyHandler.this.itemHandler.setKey(getCurrentText());
			org.jfree.data.xml.KeyHandler.this.rootHandler.popSubHandler();
			org.jfree.data.xml.KeyHandler.this.rootHandler.pushSubHandler(new org.jfree.data.xml.ValueHandler(org.jfree.data.xml.KeyHandler.this.rootHandler, org.jfree.data.xml.KeyHandler.this.itemHandler));
		}else {
			throw new org.xml.sax.SAXException(("Expecting </Key> but found " + qName));
		}
	}

	public void characters(char[] ch, int start, int length) {
		if ((org.jfree.data.xml.KeyHandler.this.currentText) != null) {
			org.jfree.data.xml.KeyHandler.this.currentText.append(java.lang.String.copyValueOf(ch, start, length));
		}
	}

	protected java.lang.String getCurrentText() {
		return org.jfree.data.xml.KeyHandler.this.currentText.toString();
	}

	protected void clearCurrentText() {
		org.jfree.data.xml.KeyHandler.this.currentText.delete(0, org.jfree.data.xml.KeyHandler.this.currentText.length());
	}
}

