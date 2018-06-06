

package com.google.javascript.jscomp;


@java.lang.SuppressWarnings(value = "sunapi")
public class XtbMessageBundle implements com.google.javascript.jscomp.MessageBundle {
	private static final com.google.javascript.jscomp.XtbMessageBundle.SecureEntityResolver NOOP_RESOLVER = new com.google.javascript.jscomp.XtbMessageBundle.SecureEntityResolver();

	private final java.lang.String projectId;

	private final java.util.Map<java.lang.String, com.google.javascript.jscomp.JsMessage> messages;

	private final com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator;

	public XtbMessageBundle(java.io.InputStream xtb, @javax.annotation.Nullable
	java.lang.String projectId, boolean unused) {
		this(xtb, projectId);
	}

	public XtbMessageBundle(java.io.InputStream xtb, @javax.annotation.Nullable
	java.lang.String projectId) {
		com.google.common.base.Preconditions.checkState((!("".equals(projectId))));
		this.projectId = projectId;
		this.messages = com.google.common.collect.Maps.newHashMap();
		this.idGenerator = new com.google.javascript.jscomp.GoogleJsMessageIdGenerator(projectId);
		try {
			javax.xml.parsers.SAXParser parser = createSAXParser();
			org.xml.sax.XMLReader reader = parser.getXMLReader();
			com.google.javascript.jscomp.XtbMessageBundle.Handler contentHandler = new com.google.javascript.jscomp.XtbMessageBundle.Handler();
			reader.setContentHandler(contentHandler);
			reader.parse(new org.xml.sax.InputSource(xtb));
		} catch (javax.xml.parsers.ParserConfigurationException e) {
			throw new java.lang.RuntimeException(e);
		} catch (org.xml.sax.SAXException e) {
			throw new java.lang.RuntimeException(e);
		} catch (java.io.IOException e) {
			throw new java.lang.RuntimeException(e);
		}
	}

	private javax.xml.parsers.SAXParser createSAXParser() throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException {
		javax.xml.parsers.SAXParserFactory factory = javax.xml.parsers.SAXParserFactory.newInstance();
		factory.setValidating(false);
		factory.setXIncludeAware(false);
		factory.setFeature("http://xml.org/sax/features/external-general-entities", false);
		factory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
		factory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
		factory.setFeature(javax.xml.XMLConstants.FEATURE_SECURE_PROCESSING, true);
		javax.xml.parsers.SAXParser parser = factory.newSAXParser();
		org.xml.sax.XMLReader xmlReader = parser.getXMLReader();
		xmlReader.setEntityResolver(com.google.javascript.jscomp.XtbMessageBundle.NOOP_RESOLVER);
		return parser;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.JsMessage getMessage(java.lang.String id) {
		return messages.get(id);
	}

	@java.lang.Override
	public com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator() {
		return idGenerator;
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.JsMessage> getAllMessages() {
		return com.google.common.collect.Iterables.unmodifiableIterable(messages.values());
	}

	private class Handler implements org.xml.sax.ContentHandler {
		private static final java.lang.String BUNDLE_ELEM_NAME = "translationbundle";

		private static final java.lang.String LANG_ATT_NAME = "lang";

		private static final java.lang.String TRANSLATION_ELEM_NAME = "translation";

		private static final java.lang.String MESSAGE_ID_ATT_NAME = "id";

		private static final java.lang.String PLACEHOLDER_ELEM_NAME = "ph";

		private static final java.lang.String PLACEHOLDER_NAME_ATT_NAME = "name";

		java.lang.String lang;

		com.google.javascript.jscomp.JsMessage.Builder msgBuilder;

		@java.lang.Override
		public void setDocumentLocator(org.xml.sax.Locator locator) {
		}

		@java.lang.Override
		public void startDocument() {
		}

		@java.lang.Override
		public void endDocument() {
		}

		@java.lang.Override
		public void startPrefixMapping(java.lang.String prefix, java.lang.String uri) {
		}

		@java.lang.Override
		public void endPrefixMapping(java.lang.String prefix) {
		}

		@java.lang.Override
		public void startElement(java.lang.String uri, java.lang.String localName, java.lang.String qName, org.xml.sax.Attributes atts) {
			if (com.google.javascript.jscomp.XtbMessageBundle.Handler.BUNDLE_ELEM_NAME.equals(qName)) {
				com.google.common.base.Preconditions.checkState(((lang) == null));
				lang = atts.getValue(com.google.javascript.jscomp.XtbMessageBundle.Handler.LANG_ATT_NAME);
				com.google.common.base.Preconditions.checkState((((lang) != null) && (!(lang.isEmpty()))));
			}else
				if (com.google.javascript.jscomp.XtbMessageBundle.Handler.TRANSLATION_ELEM_NAME.equals(qName)) {
					com.google.common.base.Preconditions.checkState(((msgBuilder) == null));
					java.lang.String id = atts.getValue(com.google.javascript.jscomp.XtbMessageBundle.Handler.MESSAGE_ID_ATT_NAME);
					com.google.common.base.Preconditions.checkState(((id != null) && (!(id.isEmpty()))));
					msgBuilder = new com.google.javascript.jscomp.JsMessage.Builder(id);
				}else
					if (com.google.javascript.jscomp.XtbMessageBundle.Handler.PLACEHOLDER_ELEM_NAME.equals(qName)) {
						com.google.common.base.Preconditions.checkState(((msgBuilder) != null));
						java.lang.String phRef = atts.getValue(com.google.javascript.jscomp.XtbMessageBundle.Handler.PLACEHOLDER_NAME_ATT_NAME);
						phRef = com.google.javascript.jscomp.JsMessageVisitor.toLowerCamelCaseWithNumericSuffixes(phRef);
						msgBuilder.appendPlaceholderReference(phRef);
					}
				
			
		}

		@java.lang.Override
		public void endElement(java.lang.String uri, java.lang.String localName, java.lang.String qName) {
			if (com.google.javascript.jscomp.XtbMessageBundle.Handler.TRANSLATION_ELEM_NAME.equals(qName)) {
				com.google.common.base.Preconditions.checkState(((msgBuilder) != null));
				if (!(msgBuilder.hasParts())) {
					msgBuilder.appendStringPart("");
				}
				java.lang.String key = msgBuilder.getKey();
				messages.put(key, msgBuilder.build());
				msgBuilder = null;
			}
		}

		@java.lang.Override
		public void characters(char[] ch, int start, int length) {
			if ((msgBuilder) != null) {
				msgBuilder.appendStringPart(java.lang.String.valueOf(ch, start, length));
			}
		}

		@java.lang.Override
		public void ignorableWhitespace(char[] ch, int start, int length) {
			if ((msgBuilder) != null) {
				msgBuilder.appendStringPart(java.lang.String.valueOf(ch, start, length));
			}
		}

		@java.lang.Override
		public void processingInstruction(java.lang.String target, java.lang.String data) {
		}

		@java.lang.Override
		public void skippedEntity(java.lang.String name) {
		}
	}

	private static final class SecureEntityResolver implements org.xml.sax.EntityResolver {
		@java.lang.Override
		public org.xml.sax.InputSource resolveEntity(java.lang.String publicId, java.lang.String systemId) {
			return new org.xml.sax.InputSource(new java.io.StringReader(""));
		}
	}
}

