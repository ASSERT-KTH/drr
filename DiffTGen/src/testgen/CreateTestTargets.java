package testgen;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class CreateTestTargets {
	public static List<TestTarget> create(List<Modification> modList, String outpath) {
	String testid = Global.testID;
	String projectPath = outpath + "/" + testid;
	
	String targetPath = projectPath + "/target";
	TestTargetGenerator ttgen = new TestTargetGenerator();
	List<TestTarget> tt_list = ttgen.getTestTargets(modList);
	int tt_list_size = tt_list.size();
	for (int i=0; i<tt_list_size; i++) {
	    TestTarget tt = tt_list.get(i);
	    System.out.println("Test Target No."+i+":");
	    System.out.println(tt);
	    File ttf = new File(targetPath+"/"+tt.getFileName());
	    try { FileUtils.writeStringToFile(ttf, tt.getFileContent(), (String)null); }
	    catch (Throwable t) {
		System.err.println(t);
		t.printStackTrace();
	    }
	}
	return tt_list;
	}
}
