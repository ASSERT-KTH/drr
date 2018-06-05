

package com.google.javascript.jscomp;


public enum CheckLevel {
ERROR, WARNING, OFF;
	boolean isOn() {
		return (com.google.javascript.jscomp.CheckLevel.this) != (com.google.javascript.jscomp.CheckLevel.OFF);
	}
}

