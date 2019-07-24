
package arrayreverse;

class Array{
     void array(){
         int a[] = new int[6];
         a[0] = 10;
         a[1] = 20;
         a[2] = 30;
         a[3] = 40;
         a[4] = 50;
         a[5] = 60;
         
         int end = a.length - 1;
         for(int i = 0; i <= (a.length)/2; i++){
             //System.out.println(a[i]);
             
             int temp = a[i];
             a[i] = a[end];
             a[end] = temp;
             
             end--;
             
         }
         
         for(int i = 0; i < a.length; i++){
             System.out.println(a[i]);
         }
     }
}

public class ArrayReverse {

    public static void main(String[] args) {
        Array arr = new Array();
        
        arr.array();
    }
    
}
