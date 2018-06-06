

package org.apache.commons.math3.optim.linear;


public enum Relationship {
EQ("="), LEQ("<="), GEQ(">=");
	private final java.lang.String stringValue;

	private Relationship(java.lang.String stringValue) {
		this.stringValue = stringValue;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return stringValue;
	}

	public org.apache.commons.math3.optim.linear.Relationship oppositeRelationship() {
		switch (org.apache.commons.math3.optim.linear.Relationship.this) {
			case LEQ :
				return org.apache.commons.math3.optim.linear.Relationship.GEQ;
			case GEQ :
				return org.apache.commons.math3.optim.linear.Relationship.LEQ;
			default :
				return org.apache.commons.math3.optim.linear.Relationship.EQ;
		}
	}
}

