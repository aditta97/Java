//ArrayIndexOutOfBoundsException
package array6;

/**
 *
 * @author adittachakraborty
 */
public class Array6 {

    public static void main(String[] args) {
        int array[] = {50, 60, 70, 80};
        for (int i = 0; i <= array.length; i++) {    //Equal sign is the exception
            System.out.println(array[i]);
        }
    }

}

/**The Java Virtual Machine (JVM) throws an ArrayIndexOutOfBoundsException
 * if length of the array in negative, equal to the array size or greater than the array size
 * while traversing the array.
 */