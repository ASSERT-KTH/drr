package testgen;

import java.util.List;
import java.util.ArrayList;

public class TestTarget
{
    String package_name;
    String file_name;
    String file_ctnt;
    List<String> goal_locs;
    //List<String> goal_methods;

    public TestTarget(String package_name, String file_name, String file_ctnt, List<String> goal_locs) {
	this.package_name = package_name;
	this.file_name = file_name;
	this.file_ctnt = file_ctnt;
	this.goal_locs = goal_locs;
    }

    public String getPackageName() {
	return package_name;
    }
    
    public String getFileName() {
	return file_name;
    }

    public String getFileContent() {
	return file_ctnt;
    }

    public List<String> getGoalLocs() {
	return goal_locs;
    }

    /* Temporary */
    public List<String> getGoalMethods() {
	return new ArrayList<String>();
    }
    
    public String toString() {
	//String s = file_ctnt;
	String s = "Package Name: " + package_name;
	s += "\nFile Name: " + file_name;
	s += "\nGoal Locs: ";
	for (String goal_loc : goal_locs) {
	    s += goal_loc + " ";
	}
	return s;
    }
}
