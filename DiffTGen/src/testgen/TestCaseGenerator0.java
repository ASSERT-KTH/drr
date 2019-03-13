package testgen;

import java.io.File;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEdit;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import util.*;


public class TestCaseGenerator0
{
    private static final String NAME_SUFFIX = "7au3e";
    
    public String createTestCaseClass(TestClass tc, ExpectedItem ei) {

	String tc_ctnt = tc.getClassContent();
	CompilationUnit cu = (CompilationUnit) ASTNodeLoader.getASTNode(tc_ctnt);
	AST ast = cu.getAST();
	ASTRewrite rw = ASTRewrite.create(ast);
	TypeDeclaration td = (TypeDeclaration) cu.types().get(0);
	String classname = "DiffTGen" + ei.getProperty() + "Test";
	rw.set(td, TypeDeclaration.NAME_PROPERTY, ast.newSimpleName(classname), null);
	
	MethodDeclaration[] mds = td.getMethods();
	String tmd_name = ei.getTargetMethodName();
	MethodDeclaration tmd = null;
	for (MethodDeclaration md : mds) {
	    //This is ok because EvoSuite doesn't create identical method names
	    if (md.getName().getIdentifier().equals(tmd_name)) { tmd = md; }
	    else { rw.remove(md, null); }
	}
	if (tmd == null) {
	    System.err.println("Target Method " + tmd_name + " Not Found in the generated Test Class!");
	    return null;
	}

	List<Statement> ex_stmts0 = createExtendedStatements0(ast, ei);
	if (ex_stmts0 == null) { return null; }
	
	//Add imports for java.util.*, FieldUtils, reflects.*, etc.
	addImports(cu, rw);

	//Add @Test marker annotation
	ListRewrite lrw_mod = rw.getListRewrite(tmd, MethodDeclaration.MODIFIERS2_PROPERTY);
	Annotation test_annot = ast.newMarkerAnnotation();
	test_annot.setStructuralProperty(MarkerAnnotation.TYPE_NAME_PROPERTY, ast.newSimpleName("Test"));
	lrw_mod.insertFirst(test_annot, null);


	//Modify the test method into a test case
	String target_obj_name = "target_obj_" + NAME_SUFFIX;

	if (ei.isThrowable()) {
	    Block tmd_new_body = ast.newBlock();
	    rw.set(tmd, MethodDeclaration.BODY_PROPERTY, tmd_new_body, null);
	    List tmd_new_body_stmts = tmd_new_body.statements();
	    TryStatement try_stmt_t = ast.newTryStatement();

	    //Create "Object target_obj_7au3e = null;"
	    VariableDeclarationFragment vdf0 = ast.newVariableDeclarationFragment();
	    vdf0.setName(ast.newSimpleName(target_obj_name));
	    vdf0.setInitializer(ast.newNullLiteral());
	    VariableDeclarationStatement vds0 = ast.newVariableDeclarationStatement(vdf0);
	    vds0.setType(ast.newSimpleType(ast.newSimpleName("Object")));
	    tmd_new_body_stmts.add(vds0);

	    //Create "boolean not_thrown = false;"
	    VariableDeclarationFragment vdf1 = ast.newVariableDeclarationFragment();
	    vdf1.setName(ast.newSimpleName("not_thrown"));
	    vdf1.setInitializer(ast.newBooleanLiteral(false));
	    VariableDeclarationStatement vds1 = ast.newVariableDeclarationStatement(vdf1);
	    vds1.setType(ast.newPrimitiveType(PrimitiveType.BOOLEAN));
	    tmd_new_body_stmts.add(vds1);

	    tmd_new_body_stmts.add(try_stmt_t);
	    Block new_tmd_block = (Block) ASTNode.copySubtree(ast, tmd.getBody());

	    //Create "not_thrown = true;"
	    Assignment asgn2 = ast.newAssignment();
	    asgn2.setOperator(Assignment.Operator.ASSIGN);
	    asgn2.setLeftHandSide(ast.newSimpleName("not_thrown"));
	    asgn2.setRightHandSide(ast.newBooleanLiteral(true));
	    new_tmd_block.statements().add(ast.newExpressionStatement(asgn2));

	    //Create "fail()"
	    MethodInvocation mi3 = ast.newMethodInvocation();
	    mi3.setName(ast.newSimpleName("fail"));
	    new_tmd_block.statements().add(ast.newExpressionStatement(mi3));
	    
	    try_stmt_t.setBody(new_tmd_block);
	    
	    CatchClause cc_t = ast.newCatchClause();
	    try_stmt_t.catchClauses().add(cc_t);
	    SingleVariableDeclaration svd_t = ast.newSingleVariableDeclaration();
	    svd_t.setName(ast.newSimpleName("t"));
	    svd_t.setType(ast.newSimpleType(ast.newSimpleName("Throwable")));
	    cc_t.setException(svd_t);

	    Block cc_t_block = ast.newBlock();
	    cc_t.setBody(cc_t_block);
	    IfStatement if_stmt4 = ast.newIfStatement();
	    cc_t_block.statements().add(if_stmt4);
	    if_stmt4.setExpression(ast.newSimpleName("not_thrown"));
	    Block then_block4 = ast.newBlock();
	    if_stmt4.setThenStatement(then_block4);
	    Block else_block4 = ast.newBlock();
	    if_stmt4.setElseStatement(else_block4);

	    MethodInvocation mi4 = ast.newMethodInvocation();
	    mi4.setName(ast.newSimpleName("fail"));
	    StringLiteral sl4 = ast.newStringLiteral();
	    sl4.setLiteralValue("Throwable Expected!");
	    mi4.arguments().add(sl4);
	    then_block4.statements().add(ast.newExpressionStatement(mi4));

	    List else_block4_stmts = else_block4.statements();
	    for (Statement ex_stmt : ex_stmts0) {
		else_block4_stmts.add(ex_stmt);
	    }
	}
	else {
	    ListRewrite lrw1 = rw.getListRewrite(tmd.getBody(), Block.STATEMENTS_PROPERTY);
	    for (Statement ex_stmt : ex_stmts0) {
		lrw1.insertLast(ex_stmt, null);
	    }
	}
	
	Document doc = new Document(tc_ctnt);
	TextEdit tedit = rw.rewriteAST(doc, null);
	try { tedit.apply(doc); }
	catch (Throwable t) {
	    t.printStackTrace();
	    System.err.println("Text Edit Apply Error: "+t);
	}
	return doc.get();
    }

    private void addImports(CompilationUnit cu, ASTRewrite rw) {

	AST ast = cu.getAST();
	
	boolean contains_list_import = false;
	boolean contains_arraylist_import = false;
	boolean contains_map_import = false;
	boolean contains_hashmap_import = false;
	boolean contains_set_import = false;
	boolean contains_hashset_import = false;
	boolean contains_reflect_field_import = false;
	boolean contains_apache_fieldutils_import = false;
	boolean contains_junit_static_assert_import = false;
	boolean contains_fieldprinter_import = false;

	List import_list = cu.imports();
	for (Object import_obj : import_list) {
	    ImportDeclaration import_decl = (ImportDeclaration) import_obj;
	    String import_decl_str = import_decl.toString().trim();
	    if ("import java.util.*;".equals(import_decl_str)) {
		contains_list_import = true;
		contains_arraylist_import = true;
		contains_map_import = true;
		contains_hashmap_import = true;
		contains_set_import = true;
		contains_hashset_import = true;
		//contains_reflect_field_import = true;
	    }
	    if ("import java.lang.reflect.*;".equals(import_decl_str)) {
		contains_reflect_field_import = true;
	    }
	    if ("import org.apache.commons.lang3.reflect.FieldUtils;".equals(import_decl_str)) {
		contains_apache_fieldutils_import = true;
	    }
	    if ("import static org.junit.Assert.*;".equals(import_decl_str)) { //Problem?
		contains_junit_static_assert_import = true;
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
	    if ("import java.util.Set;".equals(import_decl_str)) {
		contains_set_import = true;
	    }
	    if ("import java.util.HashSet;".equals(import_decl_str)) {
		contains_hashset_import = true;
	    }
	    if ("import java.lang.reflect.Field;".equals(import_decl_str)) {
		contains_reflect_field_import = true;
	    }
	    if ("import myprinter.FieldPrinter;".equals(import_decl_str)) {
		contains_fieldprinter_import = true;
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
	if (!contains_set_import) {
	    ImportDeclaration import_decl0 = ast.newImportDeclaration();
	    import_decl0.setName(ast.newName(new String[] {"java", "util", "Set"}));
	    lrw0.insertLast(import_decl0, null);
	}
	if (!contains_hashset_import) {
	    ImportDeclaration import_decl0 = ast.newImportDeclaration();
	    import_decl0.setName(ast.newName(new String[] {"java", "util", "HashSet"}));
	    lrw0.insertLast(import_decl0, null);
	}
	if (!contains_reflect_field_import) {
	    ImportDeclaration import_decl0 = ast.newImportDeclaration();
	    import_decl0.setName(ast.newName(new String[] {"java", "lang", "reflect", "Field"}));
	    lrw0.insertLast(import_decl0, null);
	}
	if (!contains_apache_fieldutils_import) {
	    ImportDeclaration import_decl0 = ast.newImportDeclaration();
	    import_decl0.setName(ast.newName(new String[] {"org", "apache", "commons", "lang3", "reflect", "FieldUtils"}));
	    lrw0.insertLast(import_decl0, null);
	}
	if (!contains_junit_static_assert_import) {
	    //import static org.junit.Assert.*;
	    ImportDeclaration import_decl0 = ast.newImportDeclaration();
	    import_decl0.setStatic(true);
	    import_decl0.setOnDemand(true);
	    import_decl0.setName(ast.newName(new String[] {"org", "junit", "Assert"}));
	    lrw0.insertLast(import_decl0, null);
	}
	if (!contains_fieldprinter_import) {
	    ImportDeclaration import_decl0 = ast.newImportDeclaration();
	    import_decl0.setName(ast.newName(new String[] {"myprinter", "FieldPrinter"}));
	    lrw0.insertLast(import_decl0, null);
	}
    }

    private List<Statement> createExtendedStatements0(AST ast, ExpectedItem ei) {

	List<Statement> ex_stmts0 = new ArrayList<Statement>();

	String item_loc = ei.getItemLoc(); //loc value
	String item_type = ei.getItemType(); //type value
	String item_value = ei.getItemValue(); //check value
	String[] item_loc_items = item_loc.split(",");
	int item_loc_items_length = item_loc_items.length;
	String eid_item = item_loc_items[0];
	String full_class_name_item = item_loc_items[1];
	String msig_item = item_loc_items[2];
	String obj_index_item = item_loc_items[3];
	String eid_str = eid_item.startsWith("(E)") ? eid_item.substring(3) : null;
	String full_class_name = full_class_name_item.startsWith("(C)") ? full_class_name_item.substring(3) : null;
	String msig = msig_item.startsWith("(MSIG)") ? msig_item.substring(6) : null;
	String obj_index_str = obj_index_item.startsWith("(I)") ? obj_index_item.substring(3) : null;

	if (eid_str == null) {
	    System.err.println("Execution ID is Null!");
	    return null;
	}
	if (full_class_name == null) {
	    System.err.println("Full Class Name is Null!");
	    return null;
	}
	if (msig == null) {
	    System.err.println("Method Signature is Null!");
	    return null;
	}
	if (obj_index_str == null) {
	    System.err.println("Object Index is Null!");
	    return null;
	}

	String class_name = null;
	int last_index_of_dot = full_class_name.lastIndexOf(".");
	if (last_index_of_dot == -1) { class_name = full_class_name; }
	else { class_name = full_class_name.substring(last_index_of_dot + 1); }
	
	String target_obj_name = "target_obj_" + NAME_SUFFIX;
	String obj_list_name = "obj_list_" + NAME_SUFFIX;
	//Create, e.g., "List obj_list_7au3e = (List) EventState.oref_map.get("stepAccepted()0");"
	VariableDeclarationFragment vdf0 = ast.newVariableDeclarationFragment();
	vdf0.setName(ast.newSimpleName(obj_list_name));
	CastExpression ce_to_list = ast.newCastExpression();
	ce_to_list.setType(ast.newSimpleType(ast.newSimpleName("List")));
	MethodInvocation mi0 = ast.newMethodInvocation();
	ce_to_list.setExpression(mi0);
	mi0.setName(ast.newSimpleName("get"));
	StringLiteral sl0 = ast.newStringLiteral();
	sl0.setLiteralValue(msig);
	mi0.arguments().add(sl0);
	FieldAccess fa0 = ast.newFieldAccess();
	fa0.setName(ast.newSimpleName("oref_map"));
	fa0.setExpression(ast.newSimpleName(class_name));
	mi0.setExpression(fa0);
	vdf0.setInitializer(ce_to_list);
	VariableDeclarationStatement vds0 = ast.newVariableDeclarationStatement(vdf0);
	vds0.setType(ast.newSimpleType(ast.newSimpleName("List")));
	ex_stmts0.add(vds0);

	//Create, e.g., "Object target_obj_7au3e = obj_list_7au3e.get(1);"
	//If item_type is Throwable, create, e.g., "target_obj_7au3e = obj_list_7au3e.get(0);"
	MethodInvocation mi1 = ast.newMethodInvocation();
	mi1.setName(ast.newSimpleName("get"));
	mi1.arguments().add(ast.newNumberLiteral(obj_index_str));
	mi1.setExpression(ast.newSimpleName(obj_list_name));
	if (ei.isThrowable()) {
	    Assignment asgn1 = ast.newAssignment();
	    asgn1.setOperator(Assignment.Operator.ASSIGN);
	    asgn1.setLeftHandSide(ast.newSimpleName(target_obj_name));
	    asgn1.setRightHandSide(mi1);
	    ex_stmts0.add(ast.newExpressionStatement(asgn1));
	}
	else {
	    VariableDeclarationFragment vdf1 = ast.newVariableDeclarationFragment();
	    vdf1.setName(ast.newSimpleName(target_obj_name));
	    vdf1.setInitializer(mi1);
	    VariableDeclarationStatement vds1 = ast.newVariableDeclarationStatement(vdf1);
	    vds1.setType(ast.newSimpleType(ast.newSimpleName("Object")));
	    ex_stmts0.add(vds1);
	}

	//Create field tracking statements
	for (int i=4; i<item_loc_items_length; i++) {
	    String item_loc_item = item_loc_items[i];

	    if (item_loc_item.startsWith("(F)")) {
		//Create, e.g., "Field[] target_fields_4 = FieldUtils.getAllFields(target_obj_7au3e.getClass());"
		VariableDeclarationFragment vdfi = ast.newVariableDeclarationFragment();
		vdfi.setName(ast.newSimpleName("target_fields_"+i));
		MethodInvocation mii = ast.newMethodInvocation();
		mii.setName(ast.newSimpleName("getAllFields"));
		MethodInvocation mii0 = ast.newMethodInvocation();
		mii0.setName(ast.newSimpleName("getClass"));
		mii0.setExpression(ast.newSimpleName(target_obj_name));
		mii.arguments().add(mii0);
		mii.setExpression(ast.newSimpleName("FieldUtils"));
		vdfi.setInitializer(mii);
		VariableDeclarationStatement vdsi = ast.newVariableDeclarationStatement(vdfi);
		vdsi.setType(ast.newArrayType(ast.newSimpleType(ast.newSimpleName("Field"))));
		ex_stmts0.add(vdsi);


		String field_index_str = item_loc_item.substring(3);
		//Create, e.g., "target_obj_7au3e = FieldUtils.readField(target_fields_4[2], target_obj_7au3e, true);"
		Assignment asgni = ast.newAssignment();
		asgni.setOperator(Assignment.Operator.ASSIGN);
		asgni.setLeftHandSide(ast.newSimpleName(target_obj_name));
		MethodInvocation mii1 = ast.newMethodInvocation();
		asgni.setRightHandSide(mii1);
		mii1.setName(ast.newSimpleName("readField"));
		mii1.setExpression(ast.newSimpleName("FieldUtils"));
		List mii1_args = mii1.arguments();
		ArrayAccess aai = ast.newArrayAccess();
		aai.setArray(ast.newSimpleName("target_fields_"+i));
		aai.setIndex(ast.newNumberLiteral(field_index_str));
		mii1_args.add(aai);
		mii1_args.add(ast.newSimpleName(target_obj_name));
		mii1_args.add(ast.newBooleanLiteral(true));
		ex_stmts0.add(ast.newExpressionStatement(asgni));
	    }
	    
	    else if (item_loc_item.startsWith("(A)")) {
		
		//Create, e.g., "Object[] target_arr_i = FieldPrinter.convertToObjectArray(target_obj_7au3e);"
		VariableDeclarationFragment vdfi = ast.newVariableDeclarationFragment();
		vdfi.setName(ast.newSimpleName("target_arr_"+i));
		MethodInvocation mii = ast.newMethodInvocation();
		mii.setName(ast.newSimpleName("convertToObjectArray"));
		mii.arguments().add(ast.newSimpleName(target_obj_name));
		mii.setExpression(ast.newSimpleName("FieldPrinter"));
		vdfi.setInitializer(mii);
		VariableDeclarationStatement vdsi = ast.newVariableDeclarationStatement(vdfi);
		vdsi.setType(ast.newArrayType(ast.newSimpleType(ast.newSimpleName("Object"))));
		ex_stmts0.add(vdsi);

		//Create, e.g., "target_obj_7au3e = target_arr_i[5]";
		String arr_index_str = item_loc_item.substring(3);
		ArrayAccess aai = ast.newArrayAccess();
		aai.setArray(ast.newSimpleName("target_arr_"+i));
		aai.setIndex(ast.newNumberLiteral(arr_index_str));
		Assignment asgni = ast.newAssignment();
		asgni.setOperator(Assignment.Operator.ASSIGN);
		asgni.setLeftHandSide(ast.newSimpleName(target_obj_name));
		asgni.setRightHandSide(aai);
		ex_stmts0.add(ast.newExpressionStatement(asgni));
	    }

	    else if (item_loc_item.startsWith("(L)")) {

		//Create, e.g, "List target_list_5 = (List) target_obj_7au3e;"
		VariableDeclarationFragment vdfi = ast.newVariableDeclarationFragment();
		vdfi.setName(ast.newSimpleName("target_list_"+i));
		CastExpression cei = ast.newCastExpression();
		cei.setExpression(ast.newSimpleName(target_obj_name));
		cei.setType(ast.newSimpleType(ast.newSimpleName("List")));
		vdfi.setInitializer(cei);
		VariableDeclarationStatement vdsi = ast.newVariableDeclarationStatement(vdfi);
		vdsi.setType(ast.newSimpleType(ast.newSimpleName("List")));
		ex_stmts0.add(vdsi);

		//Create, e.g, "target_obj_7au3e = target_list_5.get(7);"
		String list_index_str = item_loc_item.substring(3);
		MethodInvocation mii = ast.newMethodInvocation();
		mii.setName(ast.newSimpleName("get"));
		mii.setExpression(ast.newSimpleName("target_list_"+i));
		mii.arguments().add(ast.newNumberLiteral(list_index_str));
		Assignment asgni = ast.newAssignment();
		asgni.setOperator(Assignment.Operator.ASSIGN);
		asgni.setLeftHandSide(ast.newSimpleName(target_obj_name));
		asgni.setRightHandSide(mii);
		ex_stmts0.add(ast.newExpressionStatement(asgni));
	    }

	    else if (item_loc_item.startsWith("(S)")) {

		//Create, e.g., "List target_set_list_6 = new ArrayList((Set) target_obj_7au3e);"
		VariableDeclarationFragment vdfi = ast.newVariableDeclarationFragment();
		vdfi.setName(ast.newSimpleName("target_set_list_"+i));
		ClassInstanceCreation cici = ast.newClassInstanceCreation();
		vdfi.setInitializer(cici);
		cici.setType(ast.newSimpleType(ast.newSimpleName("ArrayList")));
		CastExpression cei = ast.newCastExpression();
		cici.setExpression(cei);
		cei.setType(ast.newSimpleType(ast.newSimpleName("Set")));
		cei.setExpression(ast.newSimpleName(target_obj_name));
		VariableDeclarationStatement vdsi = ast.newVariableDeclarationStatement(vdfi);
		vdsi.setType(ast.newSimpleType(ast.newSimpleName("List")));
		ex_stmts0.add(vdsi);
		
		//Create, e.g., "target_obj_7au3e = target_set_list_6.get(3)"
		String set_list_index_str = item_loc_item.substring(3);
		MethodInvocation mii = ast.newMethodInvocation();
		mii.setName(ast.newSimpleName("get"));
		mii.setExpression(ast.newSimpleName("target_set_list_"+i));
		mii.arguments().add(ast.newNumberLiteral(set_list_index_str));
		Assignment asgni = ast.newAssignment();
		asgni.setOperator(Assignment.Operator.ASSIGN);
		asgni.setLeftHandSide(ast.newSimpleName(target_obj_name));
		asgni.setRightHandSide(mii);
		ex_stmts0.add(ast.newExpressionStatement(asgni));
	    }

	    else if (item_loc_item.startsWith("(MK)")) {

		//Create, e.g., "List target_key_list_7 = new ArrayList(((Map) target_obj_7au3e).ketSet());"
		VariableDeclarationFragment vdfi = ast.newVariableDeclarationFragment();
		vdfi.setName(ast.newSimpleName("target_key_list_"+i));
		ClassInstanceCreation cici = ast.newClassInstanceCreation();
		vdfi.setInitializer(cici);
		cici.setType(ast.newSimpleType(ast.newSimpleName("ArrayList")));
		MethodInvocation mii = ast.newMethodInvocation();
		cici.setExpression(mii);
		mii.setName(ast.newSimpleName("keySet"));
		CastExpression cei = ast.newCastExpression();
		mii.setExpression(cei);
		cei.setType(ast.newSimpleType(ast.newSimpleName("Map")));
		cei.setExpression(ast.newSimpleName(target_obj_name));
		VariableDeclarationStatement vdsi = ast.newVariableDeclarationStatement(vdfi);
		vdsi.setType(ast.newSimpleType(ast.newSimpleName("List")));
		ex_stmts0.add(vdsi);
		
		//Create, e.g., target_obj_7au3e = target_key_list_7.get(6);
		String key_list_index_str = item_loc_item.substring(4);
		MethodInvocation mii0 = ast.newMethodInvocation();
		mii0.setName(ast.newSimpleName("get"));
		mii0.setExpression(ast.newSimpleName("target_key_list_"+i));
		mii0.arguments().add(ast.newNumberLiteral(key_list_index_str));
		Assignment asgni = ast.newAssignment();
		asgni.setOperator(Assignment.Operator.ASSIGN);
		asgni.setLeftHandSide(ast.newSimpleName(target_obj_name));
		asgni.setRightHandSide(mii0);
		ex_stmts0.add(ast.newExpressionStatement(asgni));
	    }

	    else if (item_loc_item.startsWith("(MV)")) {

		//Create, "Map target_obj_7au3e_map_7 = (Map) target_obj_7au3e;"
		String target_obj_map_name = target_obj_name + "_map_" + i;
		VariableDeclarationFragment vdfi = ast.newVariableDeclarationFragment();
		vdfi.setName(ast.newSimpleName(target_obj_map_name));
		CastExpression cei = ast.newCastExpression();
		vdfi.setInitializer(cei);
		cei.setType(ast.newSimpleType(ast.newSimpleName("Map")));
		cei.setExpression(ast.newSimpleName(target_obj_name));
		VariableDeclarationStatement vdsi = ast.newVariableDeclarationStatement(vdfi);
		vdsi.setType(ast.newSimpleType(ast.newSimpleName("Map")));
		ex_stmts0.add(vdsi);
		
		//Create, e.g., "List target_key_list_7 = new ArrayList(target_obj_7au3e_map_7.ketSet());"
		VariableDeclarationFragment vdfi0 = ast.newVariableDeclarationFragment();
		vdfi0.setName(ast.newSimpleName("target_key_list_"+i));
		ClassInstanceCreation cici = ast.newClassInstanceCreation();
		vdfi0.setInitializer(cici);
		cici.setType(ast.newSimpleType(ast.newSimpleName("ArrayList")));
		MethodInvocation mii = ast.newMethodInvocation();
		cici.setExpression(mii);
		mii.setName(ast.newSimpleName("keySet"));
		mii.setExpression(ast.newSimpleName(target_obj_map_name));
		VariableDeclarationStatement vdsi0 = ast.newVariableDeclarationStatement(vdfi0);
		vdsi0.setType(ast.newSimpleType(ast.newSimpleName("List")));
		ex_stmts0.add(vdsi0);
		

		//Create, e.g., target_obj_7au3e = target_obj_7au3e_map_7.get(target_key_list_7.get(6));
		String value_list_index_str = item_loc_item.substring(4);
		MethodInvocation mii0 = ast.newMethodInvocation();
		mii0.setName(ast.newSimpleName("get"));
		mii0.setExpression(ast.newSimpleName("target_key_list_"+i));
		mii0.arguments().add(ast.newNumberLiteral(value_list_index_str));
		MethodInvocation mii1 = ast.newMethodInvocation();
		mii1.setName(ast.newSimpleName("get"));
		mii1.setExpression(ast.newSimpleName(target_obj_map_name));
		mii1.arguments().add(mii0);
		Assignment asgni = ast.newAssignment();
		asgni.setOperator(Assignment.Operator.ASSIGN);
		asgni.setLeftHandSide(ast.newSimpleName(target_obj_name));
		asgni.setRightHandSide(mii1);
		ex_stmts0.add(ast.newExpressionStatement(asgni));
	    }

	    else {
		System.err.println("Unrecgonized loc item: " + item_loc_item + " from " + item_loc);
		return null;
	    }
	}

	//Now we reach the primitive object (target_obj_7au3e) whose value is to be asserted
	String assert_message = item_loc;
	if ("NULL".equals(item_type)) {
	    //Create "assertNull(\"msg\", target_obj_7au3e);"
	    MethodInvocation assert_mi = ast.newMethodInvocation();
	    assert_mi.setName(ast.newSimpleName("assertNull"));
	    StringLiteral sl = ast.newStringLiteral();
	    sl.setLiteralValue(assert_message);
	    assert_mi.arguments().add(sl);
	    assert_mi.arguments().add(ast.newSimpleName(target_obj_name));
	    ex_stmts0.add(ast.newExpressionStatement(assert_mi));
	}
	else if ("Boolean".equals(item_type)) {
	    //Create, e.g., "assertTrue(\"msg\", item_value_long, ((Boolean) target_obj_7au3e).booleanValue());"
	    MethodInvocation assert_mi = ast.newMethodInvocation();
	    String assert_mi_name = (item_value.toLowerCase().equals("true")) ? "assertTrue" : "assertFalse";
	    assert_mi.setName(ast.newSimpleName(assert_mi_name));
	    StringLiteral sl = ast.newStringLiteral();
	    sl.setLiteralValue(assert_message);
	    assert_mi.arguments().add(sl);
	    MethodInvocation to_value_mi = ast.newMethodInvocation();
	    to_value_mi.setName(ast.newSimpleName("booleanValue"));
	    CastExpression ce0 = ast.newCastExpression();
	    ce0.setType(ast.newSimpleType(ast.newSimpleName("Boolean")));
	    ce0.setExpression(ast.newSimpleName(target_obj_name));
	    ParenthesizedExpression pe0 = ast.newParenthesizedExpression();
	    pe0.setExpression(ce0);
	    to_value_mi.setExpression(pe0);
	    assert_mi.arguments().add(to_value_mi);
	    ex_stmts0.add(ast.newExpressionStatement(assert_mi));
	}
	else if ("Byte".equals(item_type) || "Short".equals(item_type) || "Integer".equals(item_type) || "Long".equals(item_type)) {
	    //Create, e.g., "assertEquals(\"msg\", 3l, ((Short) target_obj_7au3e).longValue());"
	    MethodInvocation assert_mi = ast.newMethodInvocation();
	    assert_mi.setName(ast.newSimpleName("assertEquals"));
	    StringLiteral sl = ast.newStringLiteral();
	    sl.setLiteralValue(assert_message);
	    assert_mi.arguments().add(sl);
	    assert_mi.arguments().add(ast.newNumberLiteral(item_value+"l"));
	    MethodInvocation to_value_mi = ast.newMethodInvocation();
	    to_value_mi.setName(ast.newSimpleName("longValue"));
	    CastExpression ce0 = ast.newCastExpression();
	    ce0.setType(ast.newSimpleType(ast.newSimpleName(item_type)));
	    ce0.setExpression(ast.newSimpleName(target_obj_name));
	    ParenthesizedExpression pe0 = ast.newParenthesizedExpression();
	    pe0.setExpression(ce0);
	    to_value_mi.setExpression(pe0);
	    assert_mi.arguments().add(to_value_mi);
	    ex_stmts0.add(ast.newExpressionStatement(assert_mi));
	}
	else if ("Float".equals(item_type) || "Double".equals(item_type)) {
	    //Create, e.g., "assertEquals(\"msg\", 3d, ((Float) target_obj_7au3e).doubleValue(), 1e-12);"
	    MethodInvocation assert_mi = ast.newMethodInvocation();
	    assert_mi.setName(ast.newSimpleName("assertEquals"));
	    List assert_mi_args = assert_mi.arguments();
	    StringLiteral sl = ast.newStringLiteral();
	    sl.setLiteralValue(assert_message);
	    assert_mi_args.add(sl);
	    if (NumberUtils.isNumber(item_value)) {
		assert_mi_args.add(ast.newNumberLiteral(item_value+"d"));
	    }
	    else {
		Double item_value_d = null;
		try { item_value_d = Double.parseDouble(item_value); }
		catch (Throwable t) {
		    System.err.println("Cannot parse the expected value " + item_value + " as a Double.");
		}
		if (item_value_d == null) { return null; }
		if (item_value_d.isInfinite()) {
		    QualifiedName ivqn = ast.newQualifiedName(ast.newSimpleName("Double"), ast.newSimpleName("POSITIVE_INFINITY"));
		    assert_mi_args.add(ivqn);
		}
		else if (item_value_d.isNaN()) {
		    QualifiedName ivqn = ast.newQualifiedName(ast.newSimpleName("Double"), ast.newSimpleName("NaN"));
		    assert_mi_args.add(ivqn);
		}
		else {
		    System.err.println("Cannot parse the expected value " + item_value + " as a Double.");
		    return null;
		}
	    }
	    MethodInvocation to_value_mi = ast.newMethodInvocation();
	    to_value_mi.setName(ast.newSimpleName("doubleValue"));
	    CastExpression ce0 = ast.newCastExpression();
	    ce0.setType(ast.newSimpleType(ast.newSimpleName(item_type)));
	    ce0.setExpression(ast.newSimpleName(target_obj_name));
	    ParenthesizedExpression pe0 = ast.newParenthesizedExpression();
	    pe0.setExpression(ce0);
	    to_value_mi.setExpression(pe0);
	    assert_mi_args.add(to_value_mi);
	    assert_mi_args.add(ast.newNumberLiteral("1e-12"));
	    ex_stmts0.add(ast.newExpressionStatement(assert_mi));
	}
	else if ("Character".equals(item_type) || ("String".equals(item_type))) {
	    //Create, e.g., "assertEquals(\"msg\", "c", ((Character) target_obj_7au3e).toString());"
	    MethodInvocation assert_mi = ast.newMethodInvocation();
	    assert_mi.setName(ast.newSimpleName("assertEquals"));
	    List assert_mi_args = assert_mi.arguments();
	    StringLiteral sl00 = ast.newStringLiteral();
	    sl00.setLiteralValue(assert_message);
	    assert_mi_args.add(sl00);
	    StringLiteral sl01 = ast.newStringLiteral();
	    sl01.setLiteralValue(item_value);
	    assert_mi_args.add(sl01);
	    MethodInvocation to_value_mi = ast.newMethodInvocation();
	    to_value_mi.setName(ast.newSimpleName("toString"));
	    CastExpression ce0 = ast.newCastExpression();
	    ce0.setType(ast.newSimpleType(ast.newSimpleName(item_type)));
	    ce0.setExpression(ast.newSimpleName(target_obj_name));
	    ParenthesizedExpression pe0 = ast.newParenthesizedExpression();
	    pe0.setExpression(ce0);
	    to_value_mi.setExpression(pe0);
	    assert_mi_args.add(to_value_mi);
	    ex_stmts0.add(ast.newExpressionStatement(assert_mi));
	}
	else if (ei.isThrowable()) {
	    MethodInvocation assert_mi = ast.newMethodInvocation();
	    //Create, e.g., "assertEquals(\"msg\", "null-pointer exception", ((Throwable) target_obj_7au3e).toString());"
	    assert_mi.setName(ast.newSimpleName("assertEquals"));
	    List assert_mi_args = assert_mi.arguments();
	    StringLiteral sl00 = ast.newStringLiteral();
	    sl00.setLiteralValue(assert_message);
	    StringLiteral sl01 = ast.newStringLiteral();
	    sl01.setLiteralValue(item_value);
	    assert_mi_args.add(sl00);
	    assert_mi_args.add(sl01);
	    MethodInvocation to_value_mi = ast.newMethodInvocation();
	    to_value_mi.setName(ast.newSimpleName("toString"));
	    CastExpression ce0 = ast.newCastExpression();
	    ce0.setType(ast.newSimpleType(ast.newSimpleName("Throwable")));
	    ce0.setExpression(ast.newSimpleName(target_obj_name));
	    ParenthesizedExpression pe0 = ast.newParenthesizedExpression();
	    pe0.setExpression(ce0);
	    to_value_mi.setExpression(pe0);
	    assert_mi_args.add(to_value_mi);
	    ex_stmts0.add(ast.newExpressionStatement(assert_mi));
	}

	return ex_stmts0;
    }
}
