/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;

import java.util.ArrayList;

/**
 *
 * @author Hrido
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> ob;
        ob=new ArrayList<>();
        ob.add("Bangladesh");
        ob.add("Dhaka");
        ob.add("Rajshai");
        ob.add("Barishal");
        ob.add("Kumilla");
        ob.add("Bram");
        //ob.remove(0);
        ob.clear();
        int size=ob.size();
        System.out.println(size);
        try{
        System.out.println(ob.get(2));
            System.out.println(ob);
        }
        
        catch(IndexOutOfBoundsException e){
            System.out.println("Index is not present  here");
        }
        
//        String a="";
//        String b="";
//        a.equals(b);
        int a=10;
                int b=19;
                if(a==b){
                
                }
        
    }
    
}
