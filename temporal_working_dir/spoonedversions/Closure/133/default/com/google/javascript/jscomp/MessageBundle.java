

package com.google.javascript.jscomp;


public interface MessageBundle {
	public com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator();

	public com.google.javascript.jscomp.JsMessage getMessage(java.lang.String id);

	public java.lang.Iterable<com.google.javascript.jscomp.JsMessage> getAllMessages();
}

