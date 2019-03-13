package testgen;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import org.apache.commons.io.FileUtils;
//import org.evosuite.EvoSuite;
import java.util.regex.Pattern;
import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import edu.brown.cs.ivy.jcomp.JcompAst;
import edu.brown.cs.ivy.jcomp.JcompSymbol;
import util.*;



public class TestClassGenerator
{
    public static Pattern goal_of_line_ptn;
    static { goal_of_line_ptn = Pattern.compile("\\* Goal \\d+\\..+: Line \\d+"); }
    private String tclass_name = "TestClass";
    

    public TestClass generateTestClass(String target_dpath, String targetid, String trialid, String project_cp, TestTarget target, boolean run_evosuite, String evosuite_jar_path, int evosuite_timeout) {
	String base_dpath = target_dpath + "/" + targetid + "/"+ trialid;
	File base_dir = new File(base_dpath);
	if (!base_dir.exists()) { base_dir.mkdir(); }
	//String project_cp = target_dpath+"/build/classes/all0.jar:/data/people/qx5/testgen/lib/myprinter.jar:/data/people/qx5/testgen/lib/commons-lang3-3.5.jar";
	String target_fname = target.getFileName();
	String target_fpath = target_dpath + "/" + target_fname;
	File target_f = new File(target_fpath);
	String target_package_name = target.getPackageName();
	String target_class_name = (target_fname.endsWith(".java") ?
	    target_fname.substring(0,target_fname.lastIndexOf(".")) : target_fname);
	String target_full_class_name = target_package_name + "." + target_class_name;
	List<String> goal_locs = target.getGoalLocs();

	String shell_timeout = (evosuite_timeout < 600) ? ((evosuite_timeout/60) * 5 + "m") : ((evosuite_timeout/60) * 2 + "m");
	
	List<String> arg_list = new ArrayList<String>();
	arg_list.add("-base_dir"); arg_list.add(base_dpath);
	arg_list.add("-projectCP"); arg_list.add(project_cp);
	arg_list.add("-class"); arg_list.add(target_full_class_name);
	arg_list.add("-Dassertions=false");
	arg_list.add("-Dsearch_budget=" + evosuite_timeout);

	String script_fctnt = "#!/bin/bash";
	//script_fctnt += "\n\nexport PATH=/pro/java/linux/jdk1.8.0/bin:$PATH";
	script_fctnt += "\n\njava -jar " + evosuite_jar_path;
	for (String arg : arg_list) { script_fctnt += " " + arg; }
	File script_f = new File(base_dpath+"/run_evosuite");
	try { FileUtils.writeStringToFile(script_f, script_fctnt, (String)null); }
	catch (Throwable t) { t.printStackTrace(); System.err.println(t); }

	String[] script_run_cmds = new String[] { "sh", "run_evosuite" };
	if (run_evosuite) {
	    System.err.println("Target "+targetid+" Trial "+trialid+" Running EvoSuite...");
	    CommandExecutor.execute(script_run_cmds, new File(base_dpath), new File(base_dpath+"/rslt"));
	}
	System.err.println("Target "+targetid+" Trial "+trialid+" Finish running EvoSuite.");
	
	String evosuite_fpath = base_dpath + "/evosuite-tests/" + target_package_name.replaceAll("\\.", "/") + "/" + target_class_name + "_ESTest.java";
	File evosuite_f = new File(evosuite_fpath);
	if (!evosuite_f.exists()) {
	    System.err.println("Target "+targetid+" Trial "+trialid+" did not generate an EvoSuite class.");
	    return null;
	}

	System.err.println("Target "+targetid+" Trial "+trialid+" generated an EvoSuite class at " + evosuite_fpath);
	List<Integer> target_line_list = new ArrayList<Integer>();
	for (String goal_loc : goal_locs) {
	    if (goal_loc != null) {
		List<Loc> goal_sub_locs = LocParser.getLocList(goal_loc);
		for (Loc goal_sub_loc : goal_sub_locs) {
		    if (goal_sub_loc != null) {
			target_line_list.add(new Integer(goal_sub_loc.getLineNumber()));
		    }
		}
	    }
	}

	int target_line_list_size = target_line_list.size();
	int[] target_lines = new int[target_line_list_size];
	for (int i=0; i<target_line_list_size; i++) {
	    target_lines[i] = target_line_list.get(i).intValue();
	}

	//Generate a cleaned-up test class with main method added
	return getTestClass(evosuite_f, target_lines, target_class_name);
    }

    private TestClass getTestClass(File evosuite_f, int[] target_lines, String target_class_name) {

	List<String> evosuite_flines = null;
	String evosuite_fctnt = null;
	try {
	    evosuite_flines = FileUtils.readLines(evosuite_f, (String) null);
	    evosuite_fctnt = FileUtils.readFileToString(evosuite_f, (String) null);
	} catch (Throwable t) { System.err.println(t); t.printStackTrace(); }
	if (evosuite_flines == null || evosuite_fctnt == null) { return null; }

	CompilationUnit cu = (CompilationUnit) ASTNodeLoader.getResolvedASTNode(evosuite_f);
	AST ast = cu.getAST();
	ASTRewrite rw = ASTRewrite.create(ast);

	//Get package name
	PackageDeclaration pd = cu.getPackage();
	String package_name = pd.getName().getFullyQualifiedName();
	
	//Add class declaration
	List types = cu.types();
	int type_size = types.size();
	boolean classname_changed = false;
	boolean mainmethod_added = false;
	boolean change_exercised = false;

	for (int i=0; i<type_size; i++) {
	    Object type_obj = types.get(i);
	    AbstractTypeDeclaration atd = (AbstractTypeDeclaration) type_obj;
	    cleanAbstractTypeDeclaration(atd, rw); //Clean modifiers, extensions, etc.
	    if (!(atd instanceof TypeDeclaration)) { continue; }
	    
	    TypeDeclaration td = (TypeDeclaration) atd;
	    if (!classname_changed) { //Change the class name to "TestClass"
		SimpleName sn_cp = (SimpleName) ASTNode.copySubtree(ast, td.getName());
		sn_cp.setIdentifier(tclass_name);
		rw.set(td, TypeDeclaration.NAME_PROPERTY, sn_cp, null);
		classname_changed = true;
	    }

	    List<String> target_method_names = new ArrayList<String>();
	    List bds = atd.bodyDeclarations();
	    for (Object bd_obj : bds) {
		BodyDeclaration bd = (BodyDeclaration) bd_obj;
		if (bd instanceof MethodDeclaration) {
		    MethodDeclaration md = (MethodDeclaration) bd;
		    int start_pos = md.getStartPosition();
		    int start_ln = cu.getLineNumber(start_pos);
		    int ex_start_ln = -1;
		    for (int j=start_ln-1; j>=0; j--) {
			String evosuite_fline = evosuite_flines.get(j).trim();
			if (evosuite_fline.startsWith("//Test case number:")) {
			    ex_start_ln = j;
			    break;
			}
		    }
		    if (ex_start_ln == -1) { continue; }
		    
		    boolean is_target = false;
		    //Read the EvoSuite comments
		    for (int j=ex_start_ln; j<start_ln; j++) {
			//evosuite_fline is something like:
			//* Goal 5. org.apache.commons.math.analysis.solvers.BaseSecantSolver.doSolve()D: Line 130
			String evosuite_fline = evosuite_flines.get(j).trim();
			if (!goal_of_line_ptn.matcher(evosuite_fline).matches()) {
			    continue;
			}
			String[] line_items = evosuite_fline.split(":");
			String line_num_str = line_items[line_items.length-1].trim().substring(5); //Exercised line number
			int line_num = Integer.parseInt(line_num_str);
			for (int target_line : target_lines) {
			    if (line_num == target_line) {
				is_target = true;
				break;
			    }
			}
			if (is_target) { break; }
		    }
		    if (is_target) {
			transformMethodDeclaration(md, rw, target_class_name);
			target_method_names.add(md.getName().getIdentifier());
			change_exercised = true;
		    }
		    else {
			rw.remove(md, null);
		    }
		}
	    }

	    if (!mainmethod_added) {
		mainmethod_added = true;
		MethodDeclaration main_md = ast.newMethodDeclaration();
		main_md.setName(ast.newSimpleName("main"));
		//main_md.setReturnType2(ast.newSimpleType(ast.newSimpleName("void")));
		List mod_list = (List) main_md.getStructuralProperty(MethodDeclaration.MODIFIERS2_PROPERTY);
		mod_list.add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		mod_list.add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
		List params = main_md.parameters();
		SingleVariableDeclaration param_svd = ast.newSingleVariableDeclaration();
		param_svd.setName(ast.newSimpleName("args"));
		param_svd.setType(ast.newArrayType(ast.newSimpleType(ast.newSimpleName("String"))));
		params.add(param_svd);

		Block main_md_block = ast.newBlock();
		main_md.setBody(main_md_block);
		List main_md_block_stmts = main_md_block.statements();
		VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
		vdf.setName(ast.newSimpleName("tm"));
		ClassInstanceCreation vdf_init = ast.newClassInstanceCreation();
		vdf_init.setType(ast.newSimpleType(ast.newSimpleName(tclass_name)));
		vdf.setInitializer(vdf_init);
		VariableDeclarationStatement vds = ast.newVariableDeclarationStatement(vdf);
		vds.setType(ast.newSimpleType(ast.newSimpleName(tclass_name)));
		main_md_block_stmts.add(vds);
		
		boolean first_target_method = true;
		for (String target_method_name : target_method_names) {

		    //Add "java.lang.System.out.println("<ssssss>");"
		    if (!first_target_method) {
			MethodInvocation mi0 = ast.newMethodInvocation();
			Expression e0 = ast.newQualifiedName(getLangSystemName(ast), ast.newSimpleName("out"));
			mi0.setExpression(e0);
			mi0.setName(ast.newSimpleName("println"));
			List mi0_args = mi0.arguments();
			StringLiteral sl0 = ast.newStringLiteral();
			sl0.setLiteralValue("<ssssss>");
			mi0_args.add(sl0);
			main_md_block_stmts.add(ast.newExpressionStatement(mi0));
		    }

		    first_target_method = false;

		    //Create a new try-statement, where a test method is called
		    TryStatement ts = ast.newTryStatement();
		    main_md_block_stmts.add(ts);
		    CatchClause cc = ast.newCatchClause();
		    ts.catchClauses().add(cc);
		    SingleVariableDeclaration cc_svd = ast.newSingleVariableDeclaration();
		    cc_svd.setType(ast.newSimpleType(ast.newSimpleName("Throwable")));
		    cc_svd.setName(ast.newSimpleName("t"));
		    cc.setException(cc_svd);
		    List try_block_stmts = ts.getBody().statements();
		    
		    MethodInvocation mi1 = ast.newMethodInvocation();
		    Expression e1 = ast.newQualifiedName(getLangSystemName(ast), ast.newSimpleName("out"));
		    mi1.setExpression(e1);
		    mi1.setName(ast.newSimpleName("println"));
		    List mi1_args = mi1.arguments();
		    StringLiteral sl1 = ast.newStringLiteral();
		    sl1.setLiteralValue("Test Method: "+target_method_name);
		    mi1_args.add(sl1);
		    try_block_stmts.add(ast.newExpressionStatement(mi1));
		    
		    MethodInvocation mi = ast.newMethodInvocation();
		    mi.setExpression(ast.newSimpleName("tm"));
		    mi.setName(ast.newSimpleName(target_method_name));
		    try_block_stmts.add(ast.newExpressionStatement(mi));
		}
		
		ListRewrite td_lrw = rw.getListRewrite(td, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
		td_lrw.insertLast(main_md, null);
	    }
	}

	Document doc = new Document(evosuite_fctnt);
	TextEdit tedit = rw.rewriteAST(doc, null);
	try { tedit.apply(doc); }
	catch (Exception e) { System.err.println("Text Edit Apply Error: "+e); }

	TestClass tc = new TestClass(package_name, tclass_name, doc.get(), change_exercised);
	return tc;
    }

    private void cleanAbstractTypeDeclaration(AbstractTypeDeclaration atd, ASTRewrite rw) {
	if (atd instanceof TypeDeclaration) {
	    TypeDeclaration td = (TypeDeclaration) atd;
	    List modifiers = (List) td.getStructuralProperty(TypeDeclaration.MODIFIERS2_PROPERTY);
	    ListRewrite modifier_lrw = rw.getListRewrite(td, TypeDeclaration.MODIFIERS2_PROPERTY);
	    for (Object modifier : modifiers) {
		modifier_lrw.remove((ASTNode) modifier, null);
	    }
	    AST ast = rw.getAST();
	    modifier_lrw.insertFirst(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD), null);
	    
	    List interface_types = (List) td.getStructuralProperty(TypeDeclaration.SUPER_INTERFACE_TYPES_PROPERTY);
	    ListRewrite interface_type_lrw = rw.getListRewrite(td, TypeDeclaration.SUPER_INTERFACE_TYPES_PROPERTY);
	    for (Object interface_type : interface_types) {
		interface_type_lrw.remove((ASTNode) interface_type, null);
	    }

	    rw.set(td, TypeDeclaration.SUPERCLASS_TYPE_PROPERTY, null, null);
	}
	
    }
    
    private void transformMethodDeclaration(MethodDeclaration md, ASTRewrite rw, String target_class_name) {
	//Remove all modifiers
	List modifiers = (List) md.getStructuralProperty(MethodDeclaration.MODIFIERS2_PROPERTY);
	ListRewrite modifier_lrw = rw.getListRewrite(md, MethodDeclaration.MODIFIERS2_PROPERTY);
	for (Object modifier : modifiers) {
	    modifier_lrw.remove((ASTNode) modifier, null);
	}
	AST ast = rw.getAST();
	//Add only the public modifier
	Modifier public_modifier = ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD);
	modifier_lrw.insertFirst(public_modifier, null);

	ListRewrite body_block_lrw = rw.getListRewrite(md.getBody(), Block.STATEMENTS_PROPERTY);
	//Add, e.g., "EventState.clearORefMap();" as the first.
	MethodInvocation clear_mi = ast.newMethodInvocation();
	clear_mi.setName(ast.newSimpleName("clearORefMap"));
	clear_mi.setExpression(ast.newSimpleName(target_class_name));
	body_block_lrw.insertFirst(ast.newExpressionStatement(clear_mi), null);
	
	//Make further modifications
	/*
	DeclaredOnlyVisitor v0 = new DeclaredOnlyVisitor();
	md.accept(v0);
	Set<JcompSymbol> doss = v0.getDeclaredOnlySymbolSet();
	TransformationVisitor v1 = new TransformationVisitor(rw, doss);
	md.accept(v1);
	*/
    }


    private class DeclaredOnlyVisitor extends ASTVisitor
    {
	Set<JcompSymbol> doss;

	public DeclaredOnlyVisitor() {
	    doss = new HashSet<JcompSymbol>();
	}

	public Set<JcompSymbol> getDeclaredOnlySymbolSet() {
	    return doss;
	}

	@Override public boolean preVisit2(ASTNode node) {
	    if (node instanceof SimpleName) {
		SimpleName sn = (SimpleName) node;
		boolean is_declared_name = false;
		ASTNode par = sn.getParent();
		if (par instanceof VariableDeclarationFragment) {
		    VariableDeclarationFragment vdf = (VariableDeclarationFragment) par;
		    if (sn == vdf.getName() &&
			((vdf.getParent()) instanceof VariableDeclarationStatement)) {
			is_declared_name = true;
			JcompSymbol dsymbol = JcompAst.getReference(sn);
			if (dsymbol != null) {
			    doss.add(dsymbol);
			}
		    }
		}
		if (!is_declared_name) {
		    JcompSymbol dsymbol = JcompAst.getReference(sn);
		    doss.remove(dsymbol);
		}
	    }
	    return true;
	}
    }

    private class TransformationVisitor extends ASTVisitor
    {
	Set<JcompSymbol> doss;
	ASTRewrite rw;

	public TransformationVisitor(ASTRewrite rw, Set<JcompSymbol> doss) {
	    this.rw = rw;
	    this.doss = doss;
	}

	public ASTRewrite getASTRewrite() {
	    return rw;
	}

	@Override public boolean visit(VariableDeclarationStatement vds) {
	    List fragments = vds.fragments();
	    for (Object fragment : fragments) {
		VariableDeclarationFragment vdf = (VariableDeclarationFragment) fragment;
		SimpleName sn = vdf.getName();
		JcompSymbol sn_symbol = JcompAst.getReference(sn);
		if (sn_symbol != null && doss.contains(sn_symbol)) {
		    StructuralPropertyDescriptor vds_loc = vds.getLocationInParent();
		    if (vds_loc.isChildListProperty()) { //Should be normalized!
			ListRewrite lrw = rw.getListRewrite(vds.getParent(), (ChildListPropertyDescriptor) vds_loc);
			//lrw.insertAfter(createPrintStmt(rw.getAST(), sn.getIdentifier()), vds, null);
			lrw.insertAfter(createMyPrintStmt(rw.getAST(), sn.getIdentifier()), vds, null);
		    }
		}
	    }
	    return false;
	}

	@Override public boolean visit(CatchClause cc) {
	    SingleVariableDeclaration svd = cc.getException();
	    AST ast = rw.getAST();
	    Type svd_type = svd.getType();
	    if ("TooManyResourcesException".equals(svd_type.toString())) {
		SingleVariableDeclaration svd0 = ast.newSingleVariableDeclaration();
		svd0.setType(ast.newSimpleType(ast.newSimpleName("Exception")));
		svd0.setName(ast.newSimpleName("e"));
		rw.set(cc, CatchClause.EXCEPTION_PROPERTY, svd0, null);
	    }
	    Statement print_stmt = createPrintStmt(ast, svd.getName().getIdentifier());
	    Block block0 = ast.newBlock();
	    block0.statements().add(print_stmt);
	    rw.set(cc, CatchClause.BODY_PROPERTY, block0, null);
	    return false;
	}
	
	private Statement createPrintStmt(AST ast, String print_ctnt) {
	    MethodInvocation mi = ast.newMethodInvocation();
	    mi.setName(ast.newSimpleName("println"));
	    QualifiedName qn = ast.newQualifiedName(getLangSystemName(ast), ast.newSimpleName("out"));
	    mi.setExpression(qn);
	    mi.arguments().add(ast.newSimpleName(print_ctnt));
	    return ast.newExpressionStatement(mi);
	}

	private Statement createMyPrintStmt(AST ast, String print_ctnt) {
	    MethodInvocation mi = ast.newMethodInvocation();
	    mi.setName(ast.newSimpleName("print"));
	    mi.setExpression(ast.newSimpleName("FieldPrinter"));
	    mi.arguments().add(ast.newSimpleName(print_ctnt));
	    return ast.newExpressionStatement(mi);
	}
	
    }

    private Name getLangSystemName(AST ast) {

	QualifiedName qn0 = ast.newQualifiedName(ast.newSimpleName("java"), ast.newSimpleName("lang"));
	return ast.newQualifiedName(qn0, ast.newSimpleName("System"));
    }
}
