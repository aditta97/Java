
package arraylist4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author adittachakraborty
 */
public class ArrayList4 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("Ravi");
        list.add("Vijay");
        list.add("Aditta");
        list.add("Peter");
        
        System.out.println("Traversing list through list iterator : ");
        //Here, element iterates in reverse order
        ListIterator<String> list1 = list.listIterator(list.size());
        while(list1.hasPrevious()){
            String str = list1.previous();
            System.out.println(str);
        }
        System.out.println();
        
        System.out.println("Traversing list through for loop");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        
        System.out.println("Traversing list through forEach() method");
        //The forEach() method is a new feature, introduced in Java 8.
        list.forEach(a ->{    //Here, we are using lambda expression
            System.out.println(a);
        });
        System.out.println();
        
        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(a ->{    //Here, we are using lambda expression 
            System.out.println(a);
        });
    }
    
}
