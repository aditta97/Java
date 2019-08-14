/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclassexample;

/**
 *
 * @author adittachakraborty
 */
public class WrapperClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Java Program to convert all primitives into its corresponding   
        //wrapper objects and vice-versa
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40;
        float f = 5.7f;
        double d = 60.0D;
        char c = 'a';
        boolean b2 = true;

        //Autoboxing: Converting primitives into objects
        Byte byteObj = b;
        Short shortObj = s;
        Integer intObj = i;
        Long longObj = l;
        Float floatObj = f;
        Double doubleObj = d;
        Character charObj = c;
        Boolean boolObj = b2;

        //Printing Objects
        System.out.println("---Printing object values---");
        System.out.println("Byte Object = " + byteObj);
        System.out.println("Short Object = " + shortObj);
        System.out.println("Integer Object = " + intObj);
        System.out.println("Long Object = " + longObj);
        System.out.println("Float Object = " + floatObj);
        System.out.println("Double Object = " + doubleObj);
        System.out.println("Character Object = " + charObj);
        System.out.println("Boolean Object = " + boolObj);
        
        System.out.println("");
        System.out.println("");

        //Unboxing: Converting Objects to Primitives
        byte byteValue = byteObj;
        short shortValue = shortObj;
        int intValue = intObj;
        long longValue = longObj;
        float floatValue = floatObj;
        double doubleValue = doubleObj;
        char charValue = charObj;
        boolean boolValue = boolObj;

        //Printing primitives  
        System.out.println("---Printing primitive values---");
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + boolValue);
    }

}
