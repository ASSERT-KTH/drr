

package org.apache.commons.lang3.exception;


class DefaultExceptionContext implements java.io.Serializable , org.apache.commons.lang3.exception.ExceptionContext {
	private static final long serialVersionUID = 293747957535772807L;

	private java.util.Map<java.lang.String, java.lang.Object> contextValueMap = new java.util.LinkedHashMap<java.lang.String, java.lang.Object>();

	public org.apache.commons.lang3.exception.ExceptionContext addValue(java.lang.String label, java.lang.Object value) {
		contextValueMap.put(label, value);
		return org.apache.commons.lang3.exception.DefaultExceptionContext.this;
	}

	public java.lang.Object getValue(java.lang.String label) {
		return contextValueMap.get(label);
	}

	public java.util.Set<java.lang.String> getLabelSet() {
		return contextValueMap.keySet();
	}

	public java.lang.String getFormattedExceptionMessage(java.lang.String baseMessage) {
		java.lang.StringBuilder buffer = new java.lang.StringBuilder(256);
		if (baseMessage != null) {
			buffer.append(baseMessage);
		}
		if ((contextValueMap.size()) > 0) {
			if ((buffer.length()) > 0L) {
				buffer.append(org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR);
			}
			buffer.append("Exception Context:");
			buffer.append(org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR);
			buffer.append("\t");
			java.lang.Object value;
			java.lang.String valueStr;
			for (java.lang.String label : contextValueMap.keySet()) {
				buffer.append("[");
				buffer.append(label);
				buffer.append("=");
				value = org.apache.commons.lang3.exception.DefaultExceptionContext.this.contextValueMap.get(label);
				if (value == null) {
					buffer.append("null");
				}else {
					try {
						valueStr = value.toString();
					} catch (java.lang.Throwable t) {
						valueStr = "Excepted on toString(): " + (org.apache.commons.lang3.exception.ExceptionUtils.getStackTrace(t));
					}
					buffer.append(valueStr);
				}
				buffer.append("]");
				buffer.append(org.apache.commons.lang3.SystemUtils.LINE_SEPARATOR);
				buffer.append("\t");
			}
			buffer.append("---------------------------------");
		}
		return buffer.toString();
	}
}

