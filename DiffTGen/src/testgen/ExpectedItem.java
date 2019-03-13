package testgen;

public class ExpectedItem
{
    public String tm_name;
    public String item_loc;
    public String item_type;
    public String item_value;
    public boolean is_throwable;

    private int property; //0: overfitting, 1: repair, 2: both-incorrect

    public ExpectedItem(String n, String l, String t, String v, boolean it) {
	tm_name = n;
	item_loc = l;
	item_type = t;
	item_value = v;
	is_throwable = it;
	property = -1;
    }

    public String getTargetMethodName() { return tm_name; }
    
    public String getItemLoc() { return item_loc; }

    public String getItemType() { return item_type; }

    public String getItemValue() { return item_value; }

    public boolean isThrowable() { return is_throwable; }

    public void setProperty(int p) { property = p; }

    public int getProperty() { return property; }

    public String toString() {

	String s = "";
	if (property == 0) { s += "Overfittting Indicative"; }
	else if (property == 1) { s += "Repair Indicative"; }
	else if (property == 2) { s += "Both-incorrect Indicative"; }
	s += "\nTest Method Name: " + tm_name;
	s += "\nItem Loc: " + item_loc;
	s += "\nExpected Item Type: " + item_type;
	s += "\nExpected Item Value: " + item_value;
	s += "\nIs Throwable? " + is_throwable;
	return s;
    }
}
