
package arraylist3;

import java.util.ArrayList;

/**
 *
 * @author adittachakraborty
 */
public class ArrayList3 {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        
        al.add("Ravi");
        al.add("Vijoy");
        al.add("Aditta");
        al.add("Peter");
        
        for (String obj : al) {
            System.out.println(obj);
        }
    }
    
}
