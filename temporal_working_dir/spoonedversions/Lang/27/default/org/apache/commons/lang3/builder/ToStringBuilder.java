

package org.apache.commons.lang3.builder;


public class ToStringBuilder implements org.apache.commons.lang3.builder.Builder<java.lang.String> {
	private static volatile org.apache.commons.lang3.builder.ToStringStyle defaultStyle = org.apache.commons.lang3.builder.ToStringStyle.DEFAULT_STYLE;

	public static org.apache.commons.lang3.builder.ToStringStyle getDefaultStyle() {
		return org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle;
	}

	public static void setDefaultStyle(org.apache.commons.lang3.builder.ToStringStyle style) {
		if (style == null) {
			throw new java.lang.IllegalArgumentException("The style must not be null");
		}
		org.apache.commons.lang3.builder.ToStringBuilder.defaultStyle = style;
	}

	public static java.lang.String reflectionToString(java.lang.Object object) {
		return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object);
	}

	public static java.lang.String reflectionToString(java.lang.Object object, org.apache.commons.lang3.builder.ToStringStyle style) {
		return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style);
	}

	public static java.lang.String reflectionToString(java.lang.Object object, org.apache.commons.lang3.builder.ToStringStyle style, boolean outputTransients) {
		return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, null);
	}

	public static <T> java.lang.String reflectionToString(T object, org.apache.commons.lang3.builder.ToStringStyle style, boolean outputTransients, java.lang.Class<? super T> reflectUpToClass) {
		return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(object, style, outputTransients, false, reflectUpToClass);
	}

	private final java.lang.StringBuffer buffer;

	private final java.lang.Object object;

	private final org.apache.commons.lang3.builder.ToStringStyle style;

	public ToStringBuilder(java.lang.Object object) {
		this(object, null, null);
	}

	public ToStringBuilder(java.lang.Object object, org.apache.commons.lang3.builder.ToStringStyle style) {
		this(object, style, null);
	}

	public ToStringBuilder(java.lang.Object object, org.apache.commons.lang3.builder.ToStringStyle style, java.lang.StringBuffer buffer) {
		if (style == null) {
			style = org.apache.commons.lang3.builder.ToStringBuilder.getDefaultStyle();
		}
		if (buffer == null) {
			buffer = new java.lang.StringBuffer(512);
		}
		this.buffer = buffer;
		this.style = style;
		this.object = object;
		style.appendStart(buffer, object);
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(boolean value) {
		style.append(buffer, null, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(boolean[] array) {
		style.append(buffer, null, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(byte value) {
		style.append(buffer, null, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(byte[] array) {
		style.append(buffer, null, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(char value) {
		style.append(buffer, null, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(char[] array) {
		style.append(buffer, null, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(double value) {
		style.append(buffer, null, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(double[] array) {
		style.append(buffer, null, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(float value) {
		style.append(buffer, null, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(float[] array) {
		style.append(buffer, null, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(int value) {
		style.append(buffer, null, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(int[] array) {
		style.append(buffer, null, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(long value) {
		style.append(buffer, null, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(long[] array) {
		style.append(buffer, null, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.Object obj) {
		style.append(buffer, null, obj, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.Object[] array) {
		style.append(buffer, null, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(short value) {
		style.append(buffer, null, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(short[] array) {
		style.append(buffer, null, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, boolean value) {
		style.append(buffer, fieldName, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, boolean[] array) {
		style.append(buffer, fieldName, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, boolean[] array, boolean fullDetail) {
		style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, byte value) {
		style.append(buffer, fieldName, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, byte[] array) {
		style.append(buffer, fieldName, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, byte[] array, boolean fullDetail) {
		style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, char value) {
		style.append(buffer, fieldName, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, char[] array) {
		style.append(buffer, fieldName, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, char[] array, boolean fullDetail) {
		style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, double value) {
		style.append(buffer, fieldName, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, double[] array) {
		style.append(buffer, fieldName, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, double[] array, boolean fullDetail) {
		style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, float value) {
		style.append(buffer, fieldName, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, float[] array) {
		style.append(buffer, fieldName, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, float[] array, boolean fullDetail) {
		style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, int value) {
		style.append(buffer, fieldName, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, int[] array) {
		style.append(buffer, fieldName, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, int[] array, boolean fullDetail) {
		style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, long value) {
		style.append(buffer, fieldName, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, long[] array) {
		style.append(buffer, fieldName, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, long[] array, boolean fullDetail) {
		style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, java.lang.Object obj) {
		style.append(buffer, fieldName, obj, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, java.lang.Object obj, boolean fullDetail) {
		style.append(buffer, fieldName, obj, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, java.lang.Object[] array) {
		style.append(buffer, fieldName, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, java.lang.Object[] array, boolean fullDetail) {
		style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, short value) {
		style.append(buffer, fieldName, value);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, short[] array) {
		style.append(buffer, fieldName, array, null);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder append(java.lang.String fieldName, short[] array, boolean fullDetail) {
		style.append(buffer, fieldName, array, java.lang.Boolean.valueOf(fullDetail));
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder appendAsObjectToString(java.lang.Object object) {
		org.apache.commons.lang3.ObjectUtils.identityToString(org.apache.commons.lang3.builder.ToStringBuilder.this.getStringBuffer(), object);
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder appendSuper(java.lang.String superToString) {
		if (superToString != null) {
			style.appendSuper(buffer, superToString);
		}
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public org.apache.commons.lang3.builder.ToStringBuilder appendToString(java.lang.String toString) {
		if (toString != null) {
			style.appendToString(buffer, toString);
		}
		return org.apache.commons.lang3.builder.ToStringBuilder.this;
	}

	public java.lang.Object getObject() {
		return object;
	}

	public java.lang.StringBuffer getStringBuffer() {
		return buffer;
	}

	public org.apache.commons.lang3.builder.ToStringStyle getStyle() {
		return style;
	}

	@java.lang.Override
	public java.lang.String toString() {
		if ((org.apache.commons.lang3.builder.ToStringBuilder.this.getObject()) == null) {
			org.apache.commons.lang3.builder.ToStringBuilder.this.getStringBuffer().append(org.apache.commons.lang3.builder.ToStringBuilder.this.getStyle().getNullText());
		}else {
			style.appendEnd(org.apache.commons.lang3.builder.ToStringBuilder.this.getStringBuffer(), org.apache.commons.lang3.builder.ToStringBuilder.this.getObject());
		}
		return org.apache.commons.lang3.builder.ToStringBuilder.this.getStringBuffer().toString();
	}

	public java.lang.String build() {
		return toString();
	}
}

