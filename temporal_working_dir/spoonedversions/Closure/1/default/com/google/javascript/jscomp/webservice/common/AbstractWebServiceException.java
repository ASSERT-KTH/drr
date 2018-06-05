

package com.google.javascript.jscomp.webservice.common;


public abstract class AbstractWebServiceException extends java.lang.Exception {
	public abstract com.google.javascript.jscomp.webservice.common.ErrorCode getErrorCode();

	public abstract java.lang.String getFormattedError();

	@java.lang.Override
	public java.lang.String toString() {
		return java.lang.String.format("Error(%d): %s", getErrorCode().getCode(), getFormattedError());
	}
}

