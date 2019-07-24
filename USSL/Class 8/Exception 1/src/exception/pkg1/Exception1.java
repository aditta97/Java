/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.pkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;


public class Exception1 {


    public static void main(String[] args) throws FileNotFoundException {
        String name="jfk";
        String n=null;
        FileInputStream in;
            in=new FileInputStream("jf");
        
        
        
        try{
            
            System.out.println(name.charAt(7));
            System.out.println(n.toString());
        }
        

        catch(StringIndexOutOfBoundsException e){
            System.out.println("String problem");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array problem");
        }
        catch(NullPointerException e){
            System.out.println("Null pointer");
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        
        finally{
            System.out.println("Important codes executed");
        }
        
        
    }
    
}
