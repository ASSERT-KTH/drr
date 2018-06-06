

package com.google.javascript.jscomp;


public class EmptyMessageBundle implements com.google.javascript.jscomp.MessageBundle {
	@java.lang.Override
	public com.google.javascript.jscomp.JsMessage.IdGenerator idGenerator() {
		return null;
	}

	@java.lang.Override
	public com.google.javascript.jscomp.JsMessage getMessage(java.lang.String id) {
		return null;
	}

	@java.lang.Override
	public java.lang.Iterable<com.google.javascript.jscomp.JsMessage> getAllMessages() {
		return com.google.common.collect.ImmutableList.of();
	}
}

