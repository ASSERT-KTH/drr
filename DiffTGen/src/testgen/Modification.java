package testgen;

public class Modification
{
    String fppath, pppath;
    String fploc, pploc;
    String insert_dummy_path, insert_dummy_ctxtloc, insert_dummy_info;
    String del_dummy_path, del_dummy_ctxtloc, del_dummy_info;

    public Modification(String fppath, String fploc, String pppath, String pploc) {
	this.fppath = fppath;
	this.fploc = fploc;
	this.pppath = pppath;
	this.pploc = pploc;
	insert_dummy_path = null;
	insert_dummy_ctxtloc = null;
	insert_dummy_info = null;
	del_dummy_path = null;
	del_dummy_ctxtloc = null;
	del_dummy_info = null;
    }

    public Modification(String fppath, String fploc, String pppath, String pploc,
	String insert_dummy_path, String insert_dummy_ctxtloc, String insert_dummy_info,
	String del_dummy_path, String del_dummy_ctxtloc, String del_dummy_info) {
	this.fppath = fppath;
	this.fploc = fploc;
	this.pppath = pppath;
	this.pploc = pploc;
	this.insert_dummy_path = insert_dummy_path;
	this.insert_dummy_ctxtloc = insert_dummy_ctxtloc;
	this.insert_dummy_info = insert_dummy_info;
	this.del_dummy_path = del_dummy_path;
	this.del_dummy_ctxtloc = del_dummy_ctxtloc;
	this.del_dummy_info = del_dummy_info;
    }
    
    public String getFPPath() {
	return fppath;
    }    
    
    public String getFPLoc() {
	return fploc;
    }
    
    public String getPPPath() {
	return pppath;
    }

    public String getPPLoc() {
	return pploc;
    }

    public String getInsertDummyPath() {
	return insert_dummy_path;
    }

    public String getInsertDummyCtxtLoc() {
	return insert_dummy_ctxtloc;
    }

    public String getInsertDummyInfo() {
	return insert_dummy_info;
    }

    public String getDelDummyPath() {
	return del_dummy_path;
    }

    public String getDelDummyCtxtLoc() {
	return del_dummy_ctxtloc;
    }

    public String getDelDummyInfo() {
	return del_dummy_info;
    }
    

    public String toString() {
	String s = "";
	s += "fppath: " + fppath + "\n";
	s += "fploc: " + fploc + "\n";
	s += "pppath: " + pppath + "\n";
	s += "pploc: " + pploc + "\n";
	s += "insert_dummy_path: " + insert_dummy_path + "\n";
	s += "insert_dummy_ctxtloc: " + insert_dummy_ctxtloc + "\n";
	s += "insert_dummy_info: " + insert_dummy_info + "\n";
	s += "del_dummy_path: " + del_dummy_path + "\n";
	s += "del_dummy_ctxtloc: " + del_dummy_ctxtloc + "\n";
	s += "del_dummy_info: " + del_dummy_info;
	return s;
    }
}
