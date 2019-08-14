/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivetowrapper;

/**
 *
 * @author adittachakraborty
 */
public class PrimitiveToWrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Autoboxing
        //Converting int to Integer
        int a = 20;
        
        Integer i = Integer.valueOf(a);
        Integer j = a; //autoboxing, now compiler will write Integer.valueOf(a) internally
        
        System.out.println("int a = " + a + ", Integer i = " + i + ", autoboxing j = a = " + j);
    }
    
}
