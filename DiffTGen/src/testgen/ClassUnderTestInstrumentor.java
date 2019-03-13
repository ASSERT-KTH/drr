package testgen;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import util.*;


public class ClassUnderTestInstrumentor
{
    private final static String NAME_SUFFIX = "7au3e";
    private final static String EID_SUFFIX = "eid_"+ NAME_SUFFIX;


    /* For output instrumentation , return true if the class contains eid_xx_7au3e.
       For testcase instrumentation, return true if the class contains oref_map & eid_xx_7au3e. */
    private boolean isCUTInstrumented(int ic_type, CompilationUnit cu) {

	AbstractTypeDeclaration atd = (AbstractTypeDeclaration) cu.types().get(0);
	boolean contained_oref_map = false;
	boolean contained_eid = false;
	List bd_objs = atd.bodyDeclarations();
	for (Object bd_obj : bd_objs) {
	    if (bd_obj instanceof FieldDeclaration) {
		FieldDeclaration fd = (FieldDeclaration) bd_obj;
		List fd_fragments = fd.fragments();
		for (Object fd_fragment : fd_fragments) {
		    String fd_name = ((VariableDeclarationFragment) fd_fragment).getName().getIdentifier();
		    if (fd_name.startsWith("eid") && fd_name.endsWith(NAME_SUFFIX)) {
			contained_eid = true;
		    }
		    if (ic_type == 0 && contained_eid) {
			return true;
		    } 
		    if ("oref_map".equals(fd_name)) {
			contained_oref_map = true;
		    }
		    if (ic_type == 1 && contained_eid && contained_oref_map) {
			return true;
		    }
		}
	    }
	}
	return false;
    }

    private boolean isMUTInstrumented(int ic_type, MethodDeclaration md) {

	MethodInstrumentationChecker mic = new MethodInstrumentationChecker();
	md.accept(mic);
	if (ic_type == 0 && mic.isOutputInstrumented()) { return true; }
	if (ic_type == 1 && mic.isTestCaseInstrumented()) { return true; }
	return false;
    }

    public InstrumentedClass getOutputInstrumentedClass(String fpath, List<String> mlocs) {
	return getInstrumentedClass(0, fpath, mlocs);
    }
    
    public InstrumentedClass getTestCaseInstrumentedClass(String fpath, List<String> mlocs) {
	return getInstrumentedClass(1, fpath, mlocs);
    }

    public InstrumentedClass getInstrumentedClass(int ic_type, String fpath, List<String> mlocs) {
	File f = new File(fpath);
	String fctnt = null;
	try { fctnt = FileUtils.readFileToString(f, (String) null); }
	catch (Throwable t) {
	    t.printStackTrace();
	    System.err.println(t);
	}
	if (fctnt == null) { return null; }

	CompilationUnit cu = (CompilationUnit) ASTNodeLoader.getASTNode(fctnt);
	AST ast = cu.getAST();
	String package_name = cu.getPackage().getName().toString();
	AbstractTypeDeclaration atd = (AbstractTypeDeclaration) cu.types().get(0);
	boolean is_CUT_instrumented = isCUTInstrumented(ic_type, cu);
	ASTRewrite rw = ASTRewrite.create(ast);	

	//We actually don't consider the case when the class has been output-instrumented
	//and now should be testcase-instrumented. In fact, to create a
	//testcase-instrumented version, one has to work on a non-output-instrumented
	//version. But we do consider the case for the other way, i.e., it has been
	//testcase-instrumented, and now we do the output instrumentation.
	if (!is_CUT_instrumented) {
	    //Add imports for instrumentation
	    boolean contains_list_import = false;
	    boolean contains_arraylist_import = false;
	    boolean contains_map_import = false;
	    boolean contains_hashmap_import = false;
	    List import_list = cu.imports();
	    for (Object import_obj : import_list) {
		ImportDeclaration import_decl = (ImportDeclaration) import_obj;
		String import_decl_str = import_decl.toString().trim();
		if ("import java.util.*;".equals(import_decl_str)) {
		    contains_list_import = true;
		    contains_arraylist_import = true;
		    contains_map_import = true;
		    contains_hashmap_import = true;
		}
		if ("import java.util.List;".equals(import_decl_str)) {
		    contains_list_import = true;
		}
		if ("import java.util.ArrayList;".equals(import_decl_str)) {
		    contains_arraylist_import = true;
		}
		if ("import java.util.Map;".equals(import_decl_str)) {
		    contains_map_import = true;
		}
		if ("import java.util.HashMap;".equals(import_decl_str)) {
		    contains_hashmap_import = true;
		}
	    }
	    ListRewrite lrw0 = rw.getListRewrite(cu, CompilationUnit.IMPORTS_PROPERTY);
	    if (!contains_list_import) {
		ImportDeclaration import_decl0 = ast.newImportDeclaration();
		import_decl0.setName(ast.newName(new String[] {"java", "util", "List"}));
		lrw0.insertLast(import_decl0, null);
	    }
	    if (!contains_arraylist_import) {
		ImportDeclaration import_decl0 = ast.newImportDeclaration();
		import_decl0.setName(ast.newName(new String[] {"java", "util", "ArrayList"}));
		lrw0.insertLast(import_decl0, null);
	    }
	    if (!contains_map_import) {
		ImportDeclaration import_decl0 = ast.newImportDeclaration();
		import_decl0.setName(ast.newName(new String[] {"java", "util", "Map"}));
		lrw0.insertLast(import_decl0, null);
	    }
	    if (!contains_hashmap_import) {
		ImportDeclaration import_decl0 = ast.newImportDeclaration();
		import_decl0.setName(ast.newName(new String[] {"java", "util", "HashMap"}));
		lrw0.insertLast(import_decl0, null);
	    }
	    
	    ImportDeclaration import_decl0 = ast.newImportDeclaration();
	    import_decl0.setName(ast.newName(new String[] {"myprinter", "FieldPrinter"}));
	    lrw0.insertLast(import_decl0, null);
	    
	    //Add fields & methods for instrumentations
	    ListRewrite lrw1 = null;
	    if (atd instanceof AnnotationTypeDeclaration) {
		AnnotationTypeDeclaration aatd = (AnnotationTypeDeclaration) atd;
		lrw1 = rw.getListRewrite(aatd, AnnotationTypeDeclaration.BODY_DECLARATIONS_PROPERTY);
	    }
	    else if (atd instanceof EnumDeclaration) {
		EnumDeclaration ed = (EnumDeclaration) atd;
		lrw1 = rw.getListRewrite(ed, EnumDeclaration.BODY_DECLARATIONS_PROPERTY);
		
	    }
	    else if (atd instanceof TypeDeclaration) {
		TypeDeclaration td = (TypeDeclaration) atd;
		lrw1 = rw.getListRewrite(td, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
	    }

	    //Create eid static fields for all declared methods
	    //(e.g., "public static int eid_toBoolean_String_7au3e = 0;")
	    List<FieldDeclaration> eid_fd_list = new ArrayList<FieldDeclaration>();
	    List<String> eid_list = new ArrayList<String>();
	    List bd_obj_list = atd.bodyDeclarations();
	    for (Object bd_obj : bd_obj_list) {
		if (bd_obj instanceof MethodDeclaration) {
		    MethodDeclaration md = (MethodDeclaration) bd_obj;
		    String md_sigid = getMethodSignatureId(md);
		    VariableDeclarationFragment eid_fgmt = ast.newVariableDeclarationFragment();
		    eid_fgmt.setInitializer(ast.newNumberLiteral("0"));
		    String eid_str = "eid_"+md_sigid+"_"+NAME_SUFFIX;
		    eid_list.add(eid_str);
		    eid_fgmt.setName(ast.newSimpleName(eid_str));
		    FieldDeclaration eid_fd = ast.newFieldDeclaration(eid_fgmt);
		    eid_fd.setType(ast.newPrimitiveType(PrimitiveType.INT));
		    eid_fd.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		    eid_fd.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
		    eid_fd_list.add(eid_fd);
		}
	    }

	    if (ic_type == 0) {
		MethodDeclaration clear_md = createClearEidsMethodDeclaration(ast, eid_list);
		lrw1.insertFirst(clear_md, null);
	    }
	    else if (ic_type == 1) {
		//Create object-saving static fields
		//(as "public static Map oref_map = new HashMap();")
		VariableDeclarationFragment ref_map_fgmt = ast.newVariableDeclarationFragment();
		ClassInstanceCreation ref_map_init = ast.newClassInstanceCreation();
		ref_map_init.setType(ast.newSimpleType(ast.newSimpleName("HashMap")));
		ref_map_fgmt.setInitializer(ref_map_init);
		ref_map_fgmt.setName(ast.newSimpleName("oref_map"));
		FieldDeclaration ref_map_fd = ast.newFieldDeclaration(ref_map_fgmt);
		ref_map_fd.setType(ast.newSimpleType(ast.newSimpleName("Map")));
		ref_map_fd.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
		ref_map_fd.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
		//Create object-saving static methods
		MethodDeclaration ref_map_md0 = createAddORefMethodDeclaration(ast);
		MethodDeclaration ref_map_md1 = createClearORefMapMethodDeclaration(ast, eid_list);
		lrw1.insertFirst(ref_map_md1, null);
		lrw1.insertFirst(ref_map_md0, null);
		lrw1.insertFirst(ref_map_fd, null);
	    }

	    int eid_fd_list_size = eid_fd_list.size();
	    for (int i=eid_fd_list_size-1; i>=0; i--) {
		FieldDeclaration eid_fd = eid_fd_list.get(i);
		lrw1.insertFirst(eid_fd, null);
	    }
	}
	    
	int mlocs_size = mlocs.size();
	Set<String> instru_msigids = new HashSet<String>();
	for (int i=0; i<mlocs_size; i++) {
	    String mloc = mlocs.get(i);
	    //===============
	    //System.err.println("mloc in classundertestinstrumentor: " + mloc);
	    //===============
	    List<ASTNode> list = ASTNodeFinder.find(cu, mloc);
	    ASTNode mnode = null;
	    if(list.size()>0) {
	    	mnode = list.get(0);
	 	    if (!(mnode instanceof MethodDeclaration)) {
	 		System.err.println("Located Node is NOT a method.");
	 		System.err.println("File Path: " + fpath);
	 		System.err.println("Method Loc: " + mloc);
	 		continue;
	 	    }
	 	   MethodDeclaration tmd = (MethodDeclaration) mnode;
		    String tmd_sigid = getMethodSignatureId(tmd);
		    if (instru_msigids.contains(tmd_sigid)) { continue; } //avoid instru twice
		    else { instru_msigids.add(tmd_sigid); } 
	 	    
	 	    
	   
	   
	
	    
	    
	    String tmd_name = tmd.getName().getIdentifier();
	    MethodDeclaration tmd0 = tmd;
	    if (tmd_name.endsWith("_"+NAME_SUFFIX)) {
		//We need to check its instrumented version (whose name does not end with the suffix) and see whether it is instrumented as the required type
		String tmd0_sigid = tmd_sigid.replaceFirst("_"+NAME_SUFFIX, "");
		MethodDeclarationFinder mdf = new MethodDeclarationFinder(tmd0_sigid);
		cu.accept(mdf);
		tmd0 = mdf.getTargetMethodDeclaration();
	    }
	    boolean is_MUT_output_instrumented = isMUTInstrumented(0, tmd0);
	    boolean is_MUT_testcase_instrumented = isMUTInstrumented(1, tmd0);
	    boolean need_instru = true;
	    if (ic_type == 0 && is_MUT_output_instrumented) { need_instru = false; }
	    if (ic_type == 1 && is_MUT_testcase_instrumented) { need_instru = false; }
	    
	    if (need_instru) {
		boolean is_MUT_not_instrumented = ((!is_MUT_output_instrumented) && (!is_MUT_testcase_instrumented));
		if (is_MUT_not_instrumented) {
		    rw = instrumentNonInstrumentedMUT(ic_type, tmd0, rw);
		}
		else {
		    rw = instrumentPartialInstrumentedMUT(ic_type, tmd0, rw);
		}
	    }
	}
	}
	//Get the new content
	Document doc = new Document(fctnt);
	TextEdit tedit = rw.rewriteAST(doc, null);
	try { tedit.apply(doc); }
	catch (Exception e) {
	    System.err.println("Text Edit Apply Error: "+e);
	}
	 
	return new InstrumentedClass(atd.getName().getIdentifier(), doc.get());
    
	
	}

    private ASTRewrite instrumentNonInstrumentedMUT(int ic_type, MethodDeclaration tmd, ASTRewrite rw) {

	AST ast = tmd.getAST();
	if (ic_type == 0) {
	    CaughtExceptionPrintInstrumenter cepi = new CaughtExceptionPrintInstrumenter(rw);
	    tmd.accept(cepi); //Add print statement for each thrown exception
	    rw = cepi.getASTRewrite();
	}
	
	CompilationUnit cu = (CompilationUnit) tmd.getRoot();
	String package_name = cu.getPackage().getName().toString();
	AbstractTypeDeclaration atd = (AbstractTypeDeclaration) cu.types().get(0);
	String tmd_new_name = tmd.getName().getIdentifier()+"_"+NAME_SUFFIX;
	String tmd_sigid = getMethodSignatureId(tmd);
	String tmd_eid = "eid_"+tmd_sigid+"_"+NAME_SUFFIX;
	rw.set(tmd, MethodDeclaration.NAME_PROPERTY, ast.newSimpleName(tmd_new_name), null);
	List tmd_params = tmd.parameters();
	Type tmd_ret = tmd.getReturnType2();
	List tmd_modifiers = tmd.modifiers();
	boolean is_no_return = ((tmd_ret==null) || ("void".equals(tmd_ret.toString()))) ? true : false; //tmd_ret is null => tmd is a constructor
	boolean is_static = false;
	for (Object tmd_modifier_obj : tmd_modifiers) {
	    if (tmd_modifier_obj instanceof Modifier) {
		Modifier tmd_modifier = (Modifier) tmd_modifier_obj;
		if (tmd_modifier.isStatic()) {
		    is_static = true;
		    break;
		}
	    }
	}
	
	//Clean all modifiers of the original, now-renamed tmd
	List tmd_mods = (List) tmd.getStructuralProperty(MethodDeclaration.MODIFIERS2_PROPERTY);
	ListRewrite tmd_mod_lrw = rw.getListRewrite(tmd, MethodDeclaration.MODIFIERS2_PROPERTY);
	//Remove annotations (e.g., @Override), but do not remove other modifiers (e.g., static)
	for (Object tmd_mod : tmd_mods) {
	    if (tmd_mod instanceof Annotation) {
		tmd_mod_lrw.remove((ASTNode) tmd_mod, null);
	    }
	}
	if (tmd_ret == null) { //add the void return type
	    rw.set(tmd, MethodDeclaration.CONSTRUCTOR_PROPERTY, (new Boolean(false)), null);
	    rw.set(tmd, MethodDeclaration.RETURN_TYPE2_PROPERTY, ast.newPrimitiveType(PrimitiveType.VOID), null);
	}
	
	//Using "copySubtree" makes sure tmd0 preserves the exact signature of tmd & all its modifiers (e.g., @Override)
	MethodDeclaration tmd0 = (MethodDeclaration) ASTNode.copySubtree(ast, tmd);
	Block tmd0_block = ast.newBlock();
	tmd0.setBody(tmd0_block);
	List tmd0_block_stmts = tmd0_block.statements();
	
	//Create "Object o_7au3e = null;"
	String o_name = "o_" + NAME_SUFFIX;
	VariableDeclarationFragment vdf = ast.newVariableDeclarationFragment();
	vdf.setName(ast.newSimpleName(o_name));
	vdf.setInitializer(ast.newNullLiteral());
	VariableDeclarationStatement vds = ast.newVariableDeclarationStatement(vdf);
	vds.setType(ast.newSimpleType(ast.newSimpleName("Object")));
	tmd0_block_stmts.add(vds);

	//Create, e.g., "String c_7au3e = \"org.jfree.chart.JFreeChart\";"
	String c_name = "c_" + NAME_SUFFIX;
	VariableDeclarationFragment vdf1 = ast.newVariableDeclarationFragment();
	vdf1.setName(ast.newSimpleName(c_name));
	StringLiteral instru_class_name_sl = ast.newStringLiteral();
	String instru_class_name = package_name + "." + atd.getName().getIdentifier();
	instru_class_name_sl.setLiteralValue(instru_class_name);
	vdf1.setInitializer(instru_class_name_sl);
	VariableDeclarationStatement vds1 = ast.newVariableDeclarationStatement(vdf1);
	vds1.setType(ast.newSimpleType(ast.newSimpleName("String")));
	tmd0_block_stmts.add(vds1);
	
	//Create, e.g., "String msig_7au3e = \"draw(Graphics2D$Rectangle2D$Point2D$ChartRenderingInfo)\" + eid_draw_..._7au3e;"
	String msig_name = "msig_" + NAME_SUFFIX;
	VariableDeclarationFragment vdf2 = ast.newVariableDeclarationFragment();
	vdf2.setName(ast.newSimpleName(msig_name));
	InfixExpression ie2 = ast.newInfixExpression();
	ie2.setOperator(InfixExpression.Operator.PLUS);
	StringLiteral tmd_sig_sl = ast.newStringLiteral();
	tmd_sig_sl.setLiteralValue(getMethodSignatureString(tmd));
	ie2.setLeftOperand(tmd_sig_sl);
	ie2.setRightOperand(ast.newSimpleName(tmd_eid));
	vdf2.setInitializer(ie2);
	VariableDeclarationStatement vds2 = ast.newVariableDeclarationStatement(vdf2);
	vds2.setType(ast.newSimpleType(ast.newSimpleName("String")));
	tmd0_block_stmts.add(vds2);
    
	//Create a try-catch
	TryStatement ts = ast.newTryStatement();
	tmd0_block_stmts.add(ts);
	    
	Block ts_block = ts.getBody();
	List ts_block_stmts = ts_block.statements();
	List ts_cc_list = ts.catchClauses();
	    
	//Create the method call
	Expression call_exp = null;
	MethodInvocation mi = ast.newMethodInvocation();
	mi.setName(ast.newSimpleName(tmd_new_name));
	List mi_args = mi.arguments();
	for (Object tmd_param_obj : tmd_params) {
	    SingleVariableDeclaration svd = (SingleVariableDeclaration) tmd_param_obj;
	    mi_args.add(ast.newSimpleName(svd.getName().getIdentifier()));
	}
	if (is_no_return) {
	    call_exp = mi;
	}
	else {
	    Assignment asgn = ast.newAssignment();
	    asgn.setLeftHandSide(ast.newSimpleName(o_name));
	    asgn.setOperator(Assignment.Operator.ASSIGN);
	    asgn.setRightHandSide(mi);
	    call_exp = asgn;
	}
	
	ts_block_stmts.add(ast.newExpressionStatement(call_exp)); //add method call
	int obj_index = 0;
	if (!is_no_return) { //add return variable print
	    if (ic_type == 0) {
		ts_block_stmts.add(generateFieldPrintStatement(ast, ast.newSimpleName(o_name), obj_index, tmd_eid));
	    } else if (ic_type == 1) {
		ts_block_stmts.add(generateAddORefMethodInvocation(ast, o_name));
	    }
	}
	else {
	    if (ic_type == 1) {
		ts_block_stmts.add(generateAddORefMethodInvocation(ast, null));
	    }
	}
	obj_index += 1;
	
	if (!is_static) {
	    if (ic_type == 0) {
		ts_block_stmts.add(generateFieldPrintStatement(ast, ast.newThisExpression(), obj_index, tmd_eid)); //add this print
	    } else if (ic_type == 1) {
		ts_block_stmts.add(generateAddORefMethodInvocation(ast, "this"));
	    }
	}
	else {
	    if (ic_type == 1) {
		ts_block_stmts.add(generateAddORefMethodInvocation(ast, null));
	    }
	}
	obj_index += 1;
	
	for (Object tmd_param_obj : tmd_params) {
	    SingleVariableDeclaration svd = (SingleVariableDeclaration) tmd_param_obj;
	    boolean is_primitive = false;
	    Type svd_type = svd.getType();
	    if (svd_type.isPrimitiveType()) {
		is_primitive = true;
	    }
	    else if (svd_type.isSimpleType()) {
		SimpleType simple_svd_type = (SimpleType) svd_type;
		if ("String".equals(simple_svd_type.toString())) {
		    is_primitive = true;
		}
	    }
	    
	    boolean is_static_or_final = false;
	    List svd_modifiers = svd.modifiers();
	    for (Object svd_modifier_obj : svd_modifiers) {
		if (svd_modifier_obj instanceof Modifier) {
		    Modifier svd_modifier = (Modifier) svd_modifier_obj;
		    if (svd_modifier.isStatic() || svd_modifier.isFinal()) {
			is_static_or_final = true;
			break;
		    }
		}
	    }
	    
	    if (is_primitive || is_static_or_final) {
		if (ic_type == 1) {
		    ts_block_stmts.add(generateAddORefMethodInvocation(ast, null));
		}
	    }
	    else {
		String svd_name = svd.getName().getIdentifier();
		if (ic_type == 0) {
		    ts_block_stmts.add(generateFieldPrintStatement(ast, ast.newSimpleName(svd_name), obj_index, tmd_eid)); //add parameter print
		} else if (ic_type == 1) {
		    ts_block_stmts.add(generateAddORefMethodInvocation(ast, svd_name));
		}
	    }
	    obj_index += 1;
	}
	
	CatchClause cc = ast.newCatchClause();
	SingleVariableDeclaration cc_svd = ast.newSingleVariableDeclaration();
	cc_svd.setType(ast.newSimpleType(ast.newSimpleName("Throwable")));
	cc_svd.setName(ast.newSimpleName("t"+NAME_SUFFIX));
	cc.setException(cc_svd);
	Block cc_block = ast.newBlock();
	List cc_block_stmts = cc_block.statements();
	if (ic_type == 0) {
	    cc_block_stmts.add(generateFieldPrintStatement(ast, ast.newSimpleName("t"+NAME_SUFFIX), 0, tmd_eid));
	} else if (ic_type == 1) {
	    cc_block_stmts.add(generateAddORefMethodInvocation(ast, "t"+NAME_SUFFIX));
	}
	ThrowStatement cc_throw_stmt = ast.newThrowStatement();
	cc_throw_stmt.setExpression(ast.newSimpleName("t"+NAME_SUFFIX));
	cc_block_stmts.add(cc_throw_stmt);
	cc.setBody(cc_block);
	ts.catchClauses().add(cc);
	
	Block final_block = ast.newBlock();
	PostfixExpression pe3 = ast.newPostfixExpression();
	pe3.setOperator(PostfixExpression.Operator.INCREMENT);
	pe3.setOperand(ast.newSimpleName(tmd_eid));
	final_block.statements().add(ast.newExpressionStatement(pe3));
	ts.setFinally(final_block);
	
	if (!is_no_return) { //add return statement
	    ReturnStatement return_stmt = ast.newReturnStatement();
	    tmd0_block_stmts.add(return_stmt);
	    CastExpression cast_e = ast.newCastExpression();
	    cast_e.setExpression(ast.newSimpleName(o_name));
	    cast_e.setType((Type) ASTNode.copySubtree(ast, tmd_ret));
	    return_stmt.setExpression(cast_e);
	}
	
	//add tmd0 to the class
	StructuralPropertyDescriptor spd = tmd.getLocationInParent();
	ChildListPropertyDescriptor clpd = (ChildListPropertyDescriptor) spd;
	ListRewrite lrw = rw.getListRewrite(tmd.getParent(), clpd);
	lrw.insertLast(tmd0, null);

	return rw;
    }

    private ASTRewrite instrumentPartialInstrumentedMUT(int ic_type, MethodDeclaration tmd, ASTRewrite rw) {

	AST ast = tmd.getAST();
	//Get the method call as "xx_7au3e" from the body of tmd
	String tmd_uninstru_name = tmd.getName().getIdentifier() + "_" + NAME_SUFFIX;
	MethodInvocationFinder mif = new MethodInvocationFinder(tmd_uninstru_name);
	tmd.accept(mif);
	MethodInvocation tmi = mif.getTargetMethodInvocation();
	if (tmi == null) {
	    System.err.println("The uninstrumented version: " + tmd_uninstru_name + "does not exist.");
	    return rw;
	}
	ASTNode tmi_parent = tmi.getParent();
	while (tmi_parent != null) {
	    if (tmi_parent instanceof TryStatement) { break; }
	    tmi_parent = tmi_parent.getParent();
	}
	if (tmi_parent != null) {
	    TryStatement try_stmt = (TryStatement) tmi_parent;
	    Block try_block = try_stmt.getBody();
	    ListRewrite lrw = rw.getListRewrite(try_block, Block.STATEMENTS_PROPERTY);
	    Block cc_block = ((CatchClause) try_stmt.catchClauses().get(0)).getBody();
	    ListRewrite lrw1 = rw.getListRewrite(cc_block, Block.STATEMENTS_PROPERTY);

	    String tmd_sigid = getMethodSignatureId(tmd);
	    String tmd_eid = "eid_"+tmd_sigid+"_"+NAME_SUFFIX;
	    List tmd_params = tmd.parameters();
	    Type tmd_ret = tmd.getReturnType2();
	    List tmd_modifiers = tmd.modifiers();
	    boolean is_no_return = ((tmd_ret==null) || ("void".equals(tmd_ret.toString()))) ? true : false; //tmd_ret is null => tmd is a constructor
	    boolean is_static = false;
	    for (Object tmd_modifier_obj : tmd_modifiers) {
		if (tmd_modifier_obj instanceof Modifier) {
		    Modifier tmd_modifier = (Modifier) tmd_modifier_obj;
		    if (tmd_modifier.isStatic()) {
			is_static = true;
			break;
		    }
		}
	    }
	    String o_name = "o_" + NAME_SUFFIX;
	    int obj_index = 0;
	    if (!is_no_return) { //add return variable print
		if (ic_type == 0) {
		    lrw.insertLast(generateFieldPrintStatement(ast, ast.newSimpleName(o_name), obj_index, tmd_eid), null);
		} else if (ic_type == 1) {
		    lrw.insertLast(generateAddORefMethodInvocation(ast, o_name), null);
		}
	    }
	    else {
		if (ic_type == 1) {
		    lrw.insertLast(generateAddORefMethodInvocation(ast, null), null);
		}
	    }
	    obj_index += 1;

	    if (!is_static) {
		if (ic_type == 0) {
		    lrw.insertLast(generateFieldPrintStatement(ast, ast.newThisExpression(), obj_index, tmd_eid), null); //add this print
		} else if (ic_type == 1) {
		    lrw.insertLast(generateAddORefMethodInvocation(ast, "this"), null);
		}
	    }
	    else {
		if (ic_type == 1) {
		    lrw.insertLast(generateAddORefMethodInvocation(ast, null), null);
		}
	    }
	    obj_index += 1;

	    for (Object tmd_param_obj : tmd_params) {
		SingleVariableDeclaration svd = (SingleVariableDeclaration) tmd_param_obj;
		boolean is_primitive = false;
		Type svd_type = svd.getType();
		if (svd_type.isPrimitiveType()) {
		    is_primitive = true;
		}
		else if (svd_type.isSimpleType()) {
		    SimpleType simple_svd_type = (SimpleType) svd_type;
		    if ("String".equals(simple_svd_type.toString())) {
			is_primitive = true;
		    }
		}

		boolean is_static_or_final = false;
		List svd_modifiers = svd.modifiers();
		for (Object svd_modifier_obj : svd_modifiers) {
		    if (svd_modifier_obj instanceof Modifier) {
			Modifier svd_modifier = (Modifier) svd_modifier_obj;
			if (svd_modifier.isStatic() || svd_modifier.isFinal()) {
			    is_static_or_final = true;
			    break;
			}
		    }
		}

		if (is_primitive || is_static_or_final) {
		    if (ic_type == 1) {
			lrw.insertLast(generateAddORefMethodInvocation(ast, null), null);
		    }
		}
		else {
		    String svd_name = svd.getName().getIdentifier();
		    if (ic_type == 0) {
			lrw.insertLast(generateFieldPrintStatement(ast, ast.newSimpleName(svd_name), obj_index, tmd_eid), null); //add parameter print
		    } else if (ic_type == 1) {
			lrw.insertLast(generateAddORefMethodInvocation(ast, svd_name), null);
		    }
		}
		obj_index += 1;
	    }
	    if (ic_type == 0) {
		lrw1.insertFirst(generateFieldPrintStatement(ast, ast.newSimpleName("t"+NAME_SUFFIX), 0, tmd_eid), null);
	    } else if (ic_type == 1) {
		lrw1.insertFirst(generateAddORefMethodInvocation(ast, "t"+NAME_SUFFIX), null);
	    }
	}
	else {
	    System.err.println("The parent of the method call below is not a try statement.");
	    System.err.println(tmi);
	    return rw;
	}

	return rw;
    }
    

    private MethodDeclaration createAddORefMethodDeclaration(AST ast) {

	MethodDeclaration md = ast.newMethodDeclaration();
	md.setName(ast.newSimpleName("addToORefMap"));
	List md_params = md.parameters();
	SingleVariableDeclaration param0 = ast.newSingleVariableDeclaration();
	param0.setName(ast.newSimpleName("msig"));
	param0.setType(ast.newSimpleType(ast.newSimpleName("String")));
	SingleVariableDeclaration param1 = ast.newSingleVariableDeclaration();
	param1.setName(ast.newSimpleName("obj"));
	param1.setType(ast.newSimpleType(ast.newSimpleName("Object")));
	md_params.add(param0);
	md_params.add(param1);
	Block md_block = ast.newBlock();
	md.setBody(md_block);
	List md_block_stmts = md_block.statements();

	//Build "List l = (List) oref_map.get(msig);"
	VariableDeclarationFragment vdf0 = ast.newVariableDeclarationFragment();
	vdf0.setName(ast.newSimpleName("l"));
	MethodInvocation mi0 = ast.newMethodInvocation();
	mi0.setName(ast.newSimpleName("get"));
	mi0.setExpression(ast.newSimpleName("oref_map"));
	mi0.arguments().add(ast.newSimpleName("msig"));
	CastExpression ce0 = ast.newCastExpression();
	ce0.setExpression(mi0);
	ce0.setType(ast.newSimpleType(ast.newSimpleName("List")));
	vdf0.setInitializer(ce0);
	VariableDeclarationStatement vds0 = ast.newVariableDeclarationStatement(vdf0);
	vds0.setType(ast.newSimpleType(ast.newSimpleName("List")));
	md_block_stmts.add(vds0);

	//Build "if (l==null) {...}"
	IfStatement if_stmt1 = ast.newIfStatement();
	InfixExpression ie1 = ast.newInfixExpression();
	ie1.setOperator(InfixExpression.Operator.EQUALS);
	ie1.setLeftOperand(ast.newSimpleName("l"));
	ie1.setRightOperand(ast.newNullLiteral());
	if_stmt1.setExpression(ie1);
	Block then_block1 = ast.newBlock();
	if_stmt1.setThenStatement(then_block1);
	//Build "l = new ArrayList();"
	Assignment a1 = ast.newAssignment();
	a1.setOperator(Assignment.Operator.ASSIGN);
	a1.setLeftHandSide(ast.newSimpleName("l"));
	ClassInstanceCreation cic1 = ast.newClassInstanceCreation();
	cic1.setType(ast.newSimpleType(ast.newSimpleName("ArrayList")));
	a1.setRightHandSide(cic1);
	then_block1.statements().add(ast.newExpressionStatement(a1));
	//Build "oref_map.put(msig, l);"
	MethodInvocation mi1 = ast.newMethodInvocation();
	mi1.setName(ast.newSimpleName("put"));
	mi1.setExpression(ast.newSimpleName("oref_map"));
	mi1.arguments().add(ast.newSimpleName("msig"));
	mi1.arguments().add(ast.newSimpleName("l"));
	then_block1.statements().add(ast.newExpressionStatement(mi1));
	md_block_stmts.add(if_stmt1);

	//Build "l.add(obj);"
	MethodInvocation mi2 = ast.newMethodInvocation();
	mi2.setName(ast.newSimpleName("add"));
	mi2.setExpression(ast.newSimpleName("l"));
	mi2.arguments().add(ast.newSimpleName("obj"));
	md_block_stmts.add(ast.newExpressionStatement(mi2));

	md.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
	md.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	
	return md;
    }

    private MethodDeclaration createClearORefMapMethodDeclaration(AST ast, List<String> eid_list) {

	MethodDeclaration md = ast.newMethodDeclaration();
	md.setName(ast.newSimpleName("clearORefMap"));
	Block md_block = ast.newBlock();
	md.setBody(md_block);
	List md_block_stmts = md_block.statements();

	MethodInvocation mi = ast.newMethodInvocation();
	mi.setName(ast.newSimpleName("clear"));
	mi.setExpression(ast.newSimpleName("oref_map"));
	md_block_stmts.add(ast.newExpressionStatement(mi));

	for (String eid : eid_list) {
	    Assignment asgn = ast.newAssignment();
	    asgn.setOperator(Assignment.Operator.ASSIGN);
	    asgn.setLeftHandSide(ast.newSimpleName(eid));
	    asgn.setRightHandSide(ast.newNumberLiteral("0"));
	    md_block_stmts.add(ast.newExpressionStatement(asgn));
	}

	md.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
	md.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	
	return md;
    }

    private MethodDeclaration createClearEidsMethodDeclaration(AST ast, List<String> eid_list) {

	MethodDeclaration md = ast.newMethodDeclaration();
	md.setName(ast.newSimpleName("clearORefMap"));
	Block md_block = ast.newBlock();
	md.setBody(md_block);
	List md_block_stmts = md_block.statements();

	for (String eid : eid_list) {
	    Assignment asgn = ast.newAssignment();
	    asgn.setOperator(Assignment.Operator.ASSIGN);
	    asgn.setLeftHandSide(ast.newSimpleName(eid));
	    asgn.setRightHandSide(ast.newNumberLiteral("0"));
	    md_block_stmts.add(ast.newExpressionStatement(asgn));
	}

	md.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.PUBLIC_KEYWORD));
	md.modifiers().add(ast.newModifier(Modifier.ModifierKeyword.STATIC_KEYWORD));
	
	return md;
    }

    
    private Statement generateFieldPrintStatement(AST ast, Expression arg, int arg_index, String eid) {
	MethodInvocation mi = ast.newMethodInvocation();
	mi.setName(ast.newSimpleName("print"));
	mi.setExpression(ast.newSimpleName("FieldPrinter"));
	List mi_args = mi.arguments();
	mi_args.add(arg);
	mi_args.add(ast.newSimpleName(eid));
	mi_args.add(ast.newSimpleName("c_" + NAME_SUFFIX));
	mi_args.add(ast.newSimpleName("msig_" + NAME_SUFFIX));
	mi_args.add(ast.newNumberLiteral(arg_index+"")); //arg's index in the list saved in ref_map 
	mi_args.add(ast.newNumberLiteral("5")); //max_depth
	return ast.newExpressionStatement(mi);
    }

    private Statement generateSystemPrintStatement(AST ast, Expression arg) {

	MethodInvocation mi = ast.newMethodInvocation();
	mi.setName(ast.newSimpleName("println"));
	Expression e = ast.newQualifiedName(ast.newSimpleName("System"), ast.newSimpleName("out"));
	mi.setExpression(e);
	mi.arguments().add(arg);
	return ast.newExpressionStatement(mi);
    }

    private Statement generateAddORefMethodInvocation(AST ast, String oname) {
	MethodInvocation mi = ast.newMethodInvocation();
	mi.setName(ast.newSimpleName("addToORefMap"));
	mi.arguments().add(ast.newSimpleName("msig_" + NAME_SUFFIX));
	if (oname == null) {
	    mi.arguments().add(ast.newNullLiteral());
	}
	else if (oname.equals("this")) {
	    mi.arguments().add(ast.newThisExpression());
	}
	else {
	    mi.arguments().add(ast.newSimpleName(oname));
	}
	return ast.newExpressionStatement(mi);
    }

    private class CaughtExceptionPrintInstrumenter extends ASTVisitor {
	ASTRewrite rw;	
	public CaughtExceptionPrintInstrumenter(ASTRewrite rw) { this.rw = rw; }
	public ASTRewrite getASTRewrite() { return rw; }
	@Override public boolean visit(CatchClause cc) {
	    SingleVariableDeclaration svd = cc.getException();
	    AST ast = rw.getAST();
	    Expression printed_e = ast.newSimpleName(svd.getName().getIdentifier());
	    Statement printed_s = generateSystemPrintStatement(ast, printed_e);
	    Block cc_block = cc.getBody();
	    ListRewrite lrw = rw.getListRewrite(cc_block, Block.STATEMENTS_PROPERTY);
	    lrw.insertFirst(printed_s, null);
	    return false;
	}
    }

    private class MethodInstrumentationChecker extends ASTVisitor {
	private boolean is_output_instru;
	private boolean is_testcase_instru;
	public MethodInstrumentationChecker() {
	    is_output_instru = false;
	    is_testcase_instru = false;
	}
	public boolean isOutputInstrumented() { return is_output_instru; }
	public boolean isTestCaseInstrumented() { return is_testcase_instru; }
	@Override public boolean visit(MethodInvocation mi) {
	    String mname = mi.getName().getIdentifier();
	    if ("print".equals(mname)) {
		Expression exp = mi.getExpression();
		if (exp!=null && "FieldPrinter".equals(exp.toString())) {
		    is_output_instru = true;
		}
	    }
	    else if ("addToORefMap".equals(mname)) {
		is_testcase_instru = true;
	    }
	    return false;
	}
    }

    private class MethodInvocationFinder extends ASTVisitor {
	private String target_mname;
	private MethodInvocation target_mi;
	public MethodInvocationFinder(String tname) {
	    target_mname = tname;
	    target_mi = null;
	}
	public MethodInvocation getTargetMethodInvocation() {
	    return target_mi;
	}
	@Override public boolean visit(MethodInvocation mi) {
	    String mname = mi.getName().getIdentifier();
	    if (target_mi==null && mname.equals(target_mname)) {
		target_mi = mi;
	    }
	    return false;
	}
    }

    private class MethodDeclarationFinder extends ASTVisitor {
	private String target_msigid;
	private MethodDeclaration target_md;
	public MethodDeclarationFinder(String tmsigid) {
	    target_msigid = tmsigid;
	    target_md = null;
	}
	public MethodDeclaration getTargetMethodDeclaration() {
	    return target_md;
	}
	@Override public boolean visit(MethodDeclaration md) {
	    String msigid = getMethodSignatureId(md);
	    if (target_md==null && msigid.equals(target_msigid)) {
		target_md = md;
	    }
	    return false;
	}
    }

    
    private String getMethodSignatureString(MethodDeclaration md) {

	String mname = md.getName().getIdentifier();
	String marg = null;
	List param_list = md.parameters();
	for (Object param_obj : param_list) {
	    SingleVariableDeclaration param_svd = (SingleVariableDeclaration) param_obj;
	    if (marg == null) { marg = param_svd.getType().toString(); }
	    else { marg += "$" + param_svd.getType().toString(); }
	}
	if (marg == null) { marg = ""; }
	return mname + "(" + marg + ")";
    }

    private String getMethodSignatureId(MethodDeclaration md) {

	String mname = md.getName().getIdentifier();
	String marg = null;
	List param_list = md.parameters();
	for (Object param_obj : param_list) {
	    SingleVariableDeclaration param_svd = (SingleVariableDeclaration) param_obj;
	    String param_svd_type0 = param_svd.getType().toString();
	    char[] param_svd_type0_arr = param_svd_type0.toCharArray();
	    int param_svd_type0_arr_size = param_svd_type0_arr.length;
	    StringBuilder param_svd_type_sb = new StringBuilder();
	    for (int i=0; i<param_svd_type0_arr_size; i++) {
		char c = param_svd_type0_arr[i];
		if (Character.isJavaIdentifierPart(c)) {
		    param_svd_type_sb.append(c);
		}
		else {
		    if (c == '<') { param_svd_type_sb.append("LTEMP"); }
		    else if (c == '>') { param_svd_type_sb.append("RTEMP"); }
		    else if (c == '[') {
			char c0 = 'z'; //doesn't matter with 'z'
			if (i+1<param_svd_type0_arr_size) {
			    c0 = param_svd_type0_arr[i+1];
			}
			if (c0 == ']') {
			    param_svd_type_sb.append("ARR");
			    i++;
			}
			else {
			    param_svd_type_sb.append("_");
			}
		    }
		    else { param_svd_type_sb.append("_"); }
		}
	    }
	    String param_svd_type = param_svd_type_sb.toString();
	    if (marg == null) { marg = param_svd_type; }
	    else { marg += "_" + param_svd_type; }
	}
	if (marg == null) { return mname; }
	else { return mname + "_" + marg; }
    }
}
