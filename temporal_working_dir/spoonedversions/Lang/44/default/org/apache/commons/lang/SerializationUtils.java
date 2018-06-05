

package org.apache.commons.lang;


public class SerializationUtils {
	public SerializationUtils() {
		super();
	}

	public static java.lang.Object clone(java.io.Serializable object) {
		return org.apache.commons.lang.SerializationUtils.deserialize(org.apache.commons.lang.SerializationUtils.serialize(object));
	}

	public static void serialize(java.io.Serializable obj, java.io.OutputStream outputStream) {
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("The OutputStream must not be null");
		}
		java.io.ObjectOutputStream out = null;
		try {
			out = new java.io.ObjectOutputStream(outputStream);
			out.writeObject(obj);
		} catch (java.io.IOException ex) {
			throw new org.apache.commons.lang.SerializationException(ex);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (java.io.IOException ex) {
			}
		}
	}

	public static byte[] serialize(java.io.Serializable obj) {
		java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream(512);
		org.apache.commons.lang.SerializationUtils.serialize(obj, baos);
		return baos.toByteArray();
	}

	public static java.lang.Object deserialize(java.io.InputStream inputStream) {
		if (inputStream == null) {
			throw new java.lang.IllegalArgumentException("The InputStream must not be null");
		}
		java.io.ObjectInputStream in = null;
		try {
			in = new java.io.ObjectInputStream(inputStream);
			return in.readObject();
		} catch (java.lang.ClassNotFoundException ex) {
			throw new org.apache.commons.lang.SerializationException(ex);
		} catch (java.io.IOException ex) {
			throw new org.apache.commons.lang.SerializationException(ex);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (java.io.IOException ex) {
			}
		}
	}

	public static java.lang.Object deserialize(byte[] objectData) {
		if (objectData == null) {
			throw new java.lang.IllegalArgumentException("The byte[] must not be null");
		}
		java.io.ByteArrayInputStream bais = new java.io.ByteArrayInputStream(objectData);
		return org.apache.commons.lang.SerializationUtils.deserialize(bais);
	}
}

