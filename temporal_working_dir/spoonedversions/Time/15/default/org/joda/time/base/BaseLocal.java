

package org.joda.time.base;


public abstract class BaseLocal extends org.joda.time.base.AbstractPartial {
	private static final long serialVersionUID = 276453175381783L;

	protected BaseLocal() {
		super();
	}

	protected abstract long getLocalMillis();
}

