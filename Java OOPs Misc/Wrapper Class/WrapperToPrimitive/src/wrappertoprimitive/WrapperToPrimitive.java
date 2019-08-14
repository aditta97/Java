/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrappertoprimitive;

/**
 *
 * @author adittachakraborty
 */
public class WrapperToPrimitive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Unboxing
        //Converting Integer to int
        Integer a = new Integer(3);
        int i = a.intValue();   //Convertig Integer to int explicitly
        int j = a;
        
        System.out.println("Integer a = " + a + ", int i = " + i + ", int j = a = " + j);
    }
    
}
