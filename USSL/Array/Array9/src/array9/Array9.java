//What is the class name of Java array?
package array9;

/**
 *
 * @author adittachakraborty
 */
public class Array9 {

    
    public static void main(String[] args) {
        //declaration and initialization of array 
        double array[] = {4, 4, 5};
        //getting the class name of Java array
        Class c = array.getClass();
        String name = c.getName();
        //printing the class name of Java array
        System.out.println(name);
    }
    
}
