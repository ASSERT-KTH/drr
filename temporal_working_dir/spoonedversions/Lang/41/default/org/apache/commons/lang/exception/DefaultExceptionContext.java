

package org.apache.commons.lang.exception;


public class DefaultExceptionContext implements org.apache.commons.lang.exception.ExceptionContext {
	private static final long serialVersionUID = 293747957535772807L;

	private java.util.List<java.lang.String> contextKeyList = new java.util.ArrayList<java.lang.String>();

	private java.util.Map<java.lang.String, java.io.Serializable> contextValueMap = new java.util.HashMap<java.lang.String, java.io.Serializable>();

	public org.apache.commons.lang.exception.ExceptionContext addLabeledValue(java.lang.String label, java.io.Serializable value) {
		org.apache.commons.lang.exception.DefaultExceptionContext.this.contextKeyList.add(label);
		org.apache.commons.lang.exception.DefaultExceptionContext.this.contextValueMap.put(label, value);
		return org.apache.commons.lang.exception.DefaultExceptionContext.this;
	}

	public java.io.Serializable getLabeledValue(java.lang.String label) {
		return org.apache.commons.lang.exception.DefaultExceptionContext.this.contextValueMap.get(label);
	}

	public java.util.Set<java.lang.String> getLabelSet() {
		return org.apache.commons.lang.exception.DefaultExceptionContext.this.contextValueMap.keySet();
	}

	public java.lang.String getFormattedExceptionMessage(java.lang.String baseMessage) {
		java.lang.StringBuffer buffer = new java.lang.StringBuffer(256);
		if (baseMessage != null) {
			buffer.append(baseMessage);
		}
		if ((contextKeyList.size()) > 0) {
			if ((buffer.length()) > 0L) {
				buffer.append(org.apache.commons.lang.SystemUtils.LINE_SEPARATOR);
			}
			buffer.append("Exception Context:");
			buffer.append(org.apache.commons.lang.SystemUtils.LINE_SEPARATOR);
			buffer.append("\t");
			java.lang.Object value;
			java.lang.String valueStr;
			for (java.lang.String label : org.apache.commons.lang.exception.DefaultExceptionContext.this.contextKeyList) {
				buffer.append("[");
				buffer.append(label);
				buffer.append("=");
				value = org.apache.commons.lang.exception.DefaultExceptionContext.this.contextValueMap.get(label);
				if (value == null) {
					buffer.append("null");
				}else {
					try {
						valueStr = value.toString();
					} catch (java.lang.Throwable t) {
						valueStr = "Excepted on toString(): " + (org.apache.commons.lang.exception.ExceptionUtils.getStackTrace(t));
					}
					buffer.append(valueStr);
				}
				buffer.append("]");
				buffer.append(org.apache.commons.lang.SystemUtils.LINE_SEPARATOR);
				buffer.append("\t");
			}
			buffer.append("---------------------------------");
		}
		return buffer.toString();
	}
}

