/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessingexample;


public class StringProcessingExample {


    public static void main(String[] args) {
        String data="AgrA";
        String dat="agro";
        System.out.println(data.replace('A', 'f'));
        System.out.println(data);
        
        StringBuilder ob=new StringBuilder(data);
        System.out.println(ob.length());
        
        System.out.println(ob.charAt(0));
        System.out.println(ob.reverse());
    }
    
}
