package testgen;

import java.lang.reflect.*;


public class StackTrace
{
    //For a sequence of tested statements whose types are:
    //1. Variable Declarations;
    //2. Return statements;
    //3. Assignments;
    //4. Method Invocations, instrument the CHANGED fields.
    //For any statement, instrument any THROWN exceptions.

    public void setField(Object obj, int id, Object value) {}

    public void setField(Object obj, int id, byte value) {}

    public void setField(Object obj, int id, short value) {}

    public void setField(Object obj, int id, int value) {}

    public void setField(Object obj, int id, long value) {}

    public void setField(Object obj, int id, float value) {}

    public void setField(Object obj, int id, double value) {}

    public void setField(Object obj, int id, char value) {}

    public void setField(Object obj, int id, boolean value) {}

    public void setField(Object obj, int id, String value) {}    


    public void setArray(Object obj, int id, int index, Object value) {}

    public void setArray(Object obj, int id, int index, byte value) {}

    public void setArray(Object obj, int id, int index, short value) {}
    
    public void setArray(Object obj, int id, int index, int value) {}

    public void setArray(Object obj, int id, int index, long value) {}

    public void setArray(Object obj, int id, int index, float value) {}

    public void setArray(Object obj, int id, int index, double value) {}

    public void setArray(Object obj, int id, int index, char value) {}

    public void setArray(Object obj, int id, int index, boolean value) {}

    public void setArray(Object obj, int id, int index, String value) {}

    //public void setList(Object obj, int id, int index, Object value) {}
    

    public void label(Object obj, int id) {}


    public void setReturn(Method md, int id, Object value) {}

    public void setReturn(Method md, int id, byte value) {}

    public void setReturn(Method md, int id, short value) {}

    public void setReturn(Method md, int id, int value) {}

    public void setReturn(Method md, int id, long value) {}

    public void setReturn(Method md, int id, float value) {}

    public void setReturn(Method md, int id, double value) {}
    
    public void setReturn(Method md, int id, char value) {}
    
    public void setReturn(Method md, int id, boolean value) {}

    public void setReturn(Method md, int id, String value) {}


    public void setEntryField(Object obj, int id, Object value) {}

    public void setEntryField(Object obj, int id, byte value) {}

    public void setEntryField(Object obj, int id, short value) {}

    public void setEntryField(Object obj, int id, int value) {}

    public void setEntryField(Object obj, int id, long value) {}

    public void setEntryField(Object obj, int id, float value) {}

    public void setEntryField(Object obj, int id, double value) {}

    public void setEntryField(Object obj, int id, char value) {}

    public void setEntryField(Object obj, int id, boolean value) {}

    public void setEntryField(Object obj, int id, String value) {}

    //public void setEntryArray(Object obj, int id, int index, Object value) {}

    //public void setEntryList(Object obj, int id, int index, Object value) {}


    public void setExitField(Object obj, int id, Object value) {}

    public void setExitField(Object obj, int id, byte value) {}

    public void setExitField(Object obj, int id, short value) {}

    public void setExitField(Object obj, int id, int value) {}

    public void setExitField(Object obj, int id, long value) {}

    public void setExitField(Object obj, int id, float value) {}

    public void setExitField(Object obj, int id, double value) {}

    public void setExitField(Object obj, int id, char value) {}

    public void setExitField(Object obj, int id, boolean value) {}

    public void setExitField(Object obj, int id, String value) {}

    //public void setExitArray(Object obj, int id, int index, Object value) {}

    //public void setExitList(Object obj, int id, int index, Object value) {}


    public void setThrowable(Throwable t, int id, String value) {}
}
