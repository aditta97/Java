//Jagged Array in Java
package array8;

/**
 *
 * @author adittachakraborty
 */
public class Array8 {

    public static void main(String[] args) {

        //declaring a 2D array with odd columns
        int array[][] = new int[3][];
        array[0] = new int[3];
        array[1] = new int[4];
        array[2] = new int[2];

        //initializing a jagged array
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count++;
            }
        }

        //printing the data of a jagged array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
