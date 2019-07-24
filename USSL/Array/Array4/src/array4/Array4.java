//Anonymous Array in Java
package array4;

/**
 *
 * @author adittachakraborty
 */
public class Array4 {

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{10, 22, 44, 66});    //passing anonymous array to method
    }

}
