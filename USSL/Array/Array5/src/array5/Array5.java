//Returning Array from the Method
package array5;

/**
 *
 * @author adittachakraborty
 */
public class Array5 {

    //creating method which returns an array
    static int[] get() {
        return new int[]{10, 30, 50, 90, 60};
    }

    public static void main(String[] args) {
        //calling method which returns an array
        int array[] = get();

        //printing the values of an array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
