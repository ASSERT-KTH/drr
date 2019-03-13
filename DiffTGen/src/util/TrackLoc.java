package util;

import org.eclipse.jdt.core.dom.StructuralPropertyDescriptor;

public class TrackLoc
{
    StructuralPropertyDescriptor spd;
    int index;

    public TrackLoc(StructuralPropertyDescriptor spd, int index) {
	this.spd = spd;
	this.index = index;
    }

    public StructuralPropertyDescriptor getStructuralPropertyDescriptor() {
	return spd;
    }

    public int getIndex() {
	return index;
    }

    public String toString() {
	return "("+spd.toString()+","+index+")";
    }
}
