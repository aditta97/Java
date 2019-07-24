//Multidimensional Java Array
package array7;

/**
 *
 * @author adittachakraborty
 */
public class Array7 {

    public static void main(String[] args) {
        //declaring and initializing 2D array
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};    // 3 column 3 rows
        //Printing 2D Array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
