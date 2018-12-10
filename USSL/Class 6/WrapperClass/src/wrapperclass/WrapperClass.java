/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;


public class WrapperClass {

    //Integer,Double,Char,Float
    //Integer ob=new 

    public static void main(String[] args) {
        //double db=122.33;
        Double ddddd=new Double(12222.44);
        Double dd2=122.33; //AutoBoxing
        double stored=dd2; //auto unboxing
        int a=19;
        double ttttttttt=(double)a; //typecasting
        System.out.println(stored);

      String value="400";
      int e=59;
     
      String bin=Integer.toBinaryString(e);
        System.out.println(Integer.hashCode(e));
        System.out.println(bin);
        
      
    }
    
}
