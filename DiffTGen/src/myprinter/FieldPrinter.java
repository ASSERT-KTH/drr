package myprinter;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.apache.commons.lang3.reflect.FieldUtils;


public class FieldPrinter
{
    public static void print(Object x) {
	print(x, 5);
    }

    public static void print(Object x, int max_depth) {
	String init_x_loc = x.getClass().getName();
	print(x, init_x_loc, 0, max_depth);
    }

    public static void print(Object x, int eid, String instru_class_name, String msig, int x_loc_index, int max_depth) {
	String init_x_loc = "(E)" + eid + ",(C)" + instru_class_name +
	    ",(MSIG)" + msig + ",(I)" + x_loc_index;
	print(x, init_x_loc, 0, max_depth);
    }
    
    private static void print(Object x, String x_loc, int depth, int max_depth) {

	if (depth >= max_depth) {
	    //===============
	    System.out.println("*** MAX_DEPTH EXCEEDED! ***");
	    //===============
	    return;
	}

	if (x == null) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:NULL");
	    System.out.println("VALUE:null");
	    return;
	}
	
	Class x_class = x.getClass();
	if (x instanceof Boolean) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:Boolean");
	    System.out.println("VALUE:" + x);
	    return;
	}
	else if (x instanceof Byte) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:Byte");
	    System.out.println("VALUE:" + x);
	    return;
	}
	else if (x instanceof Character) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:Character");
	    System.out.println("VALUE:" + x);
	    return;
	}
	else if (x instanceof Short) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:Short");
	    System.out.println("VALUE:" + x);
	    return;
	}
	else if (x instanceof Integer) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:Integer");
	    System.out.println("VALUE:" + x);
	    return;
	}
	else if (x instanceof Long) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:Long");
	    System.out.println("VALUE:" + x);
	    return;

	}
	else if (x instanceof Float) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:Float");
	    System.out.println("VALUE:" + x);
	    return;

	}
	else if (x instanceof Double) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:Double");
	    System.out.println("VALUE:" + x);
	    return;

	}
	else if (x instanceof String) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:String");
	    System.out.println("VALUE:" + x);
	    return;
	}
	else if (x instanceof Throwable) {
	    System.out.println("PRIM_LOC:" + x_loc);
	    System.out.println("TYPE:Throwable");
	    //System.out.println("VALUE:" + ((Throwable) x).getMessage());
	    System.out.println("VALUE:" + ((Throwable) x).toString());
	    return;
	}
	

	String x_class_name = x_class.getName();
	
	//================
	System.out.println("--- Class Type (" + depth + ") ---");
	System.out.println(x_class_name);
	System.out.println();
	//================

	if ("java.lang.Class".equals(x_class_name)) {
	    //Is this OK?
	    return;
	}
	
	if (x_class.isArray()) {
	    Object[] elem_arr = convertToObjectArray(x);
	    int elem_arr_length = elem_arr.length;
	    for (int i=0; i<elem_arr_length; i++) {
		Object elem = elem_arr[i];
		print(elem, x_loc+",(A)"+i, depth+1, max_depth);
	    }
	    return;
	}
	
	if (x instanceof List) {
	    List elem_list = (List) x;
	    int elem_list_length = elem_list.size();
	    for (int i=0; i<elem_list_length; i++) {
		Object elem = elem_list.get(i);
		print(elem, x_loc+",(L)"+i, depth+1, max_depth);
	    }	
	    return;
	}

	if (x instanceof Set) {
	    List elem_list = new ArrayList((Set) x);
	    int elem_list_length = elem_list.size();
	    for (int i=0; i<elem_list_length; i++) {
		Object elem = elem_list.get(i);
		print(elem, x_loc+",(S)"+i, depth+1, max_depth);
	    }
	    return;
	}
	
	if (x instanceof Map) {
	    Map map_x = (Map) x;
	    List elem_list = new ArrayList(map_x.keySet());
	    int elem_list_length = elem_list.size();
	    for (int i=0; i<elem_list_length; i++) {
		Object elem = elem_list.get(i);
		System.out.println("<<<< KEY >>>>");
		print(elem, x_loc+",(MK)"+i, depth+1, max_depth);
		System.out.println("<<<< VALUE >>>>");
		print(map_x.get(elem), x_loc+",(MV)"+i, depth+1, max_depth);
	    }
	    return;
	}
	
	Field[] fields = FieldUtils.getAllFields(x_class);
	int fields_length = fields.length;
	for (int i=0; i<fields_length; i++) {
	    Field field = fields[i];
	    System.out.println(field.getName()+" (" + field.getDeclaringClass().getName() + "):");
	    //Ignore Final Fields
	    if (Modifier.isFinal(field.getModifiers())) {
		//System.out.println("FINAL FIELD, IGNORE.");
		continue;
	    }

	    //Ignore Static Fields
	    if (Modifier.isStatic(field.getModifiers())) {
		//System.out.println("STATIC FIELD, IGNORE.");
		continue;
	    }
	    
	    Object field_value = null;
	    try { field_value = FieldUtils.readField(field, x, true); }
	    catch (Throwable t) {
		System.err.println(t);
	    }
	    if (field_value == null) { continue; }

	    String field_value_loc = x_loc + ",(F)" + i;
	    print(field_value, field_value_loc, depth+1, max_depth);
	}
    }

    public static Object[] convertToObjectArray(Object array) {
	Class ofArray = array.getClass().getComponentType();
	if (ofArray.isPrimitive()) {
	    List ar = new ArrayList();
	    int length = Array.getLength(array);
	    for (int i = 0; i < length; i++) {
		ar.add(Array.get(array, i));
	    }
	    return ar.toArray();
	}
	else {
	    return (Object[]) array;
	}
    }
}
