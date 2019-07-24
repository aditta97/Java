
package arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author adittachakraborty
 */
public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Ravi");
        list.add("Vijay");
        list.add("Aditta");
        list.add("Peter");
        
        //traversing list through iterator
        Iterator itr = list.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
