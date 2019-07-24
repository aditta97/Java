
package array.pkg1;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Array1 {

    public static void main(String[] args) throws IOException {
        Object[] a=new Object[4];
        Object[] ran=new Object[4];
        Array1 ob=new Array1();
        Random ob2=new Random();
        Scanner inl=new Scanner(System.in);
        for(int i=0;i<a.length; i++){
        a[i]= ob;
        ran[i]=ob2;
        }

        for(Object b: a){
            System.out.println(b);
        }
        
        
    }
    
}
