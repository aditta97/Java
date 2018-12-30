
package wrapperclass1;

public class WrapperClass1 {

    public static void main(String[] args) {
        
        //Integer to String converting by wrapper class.
        
        int a = 10;
        
        Integer ob = new Integer(a);    //creating object for integer number
        
        String s = ob.toString();   //converting integer into String by calling reference variable
        
        System.out.println(s);      //printing interger number as String
        
    }
    
}
