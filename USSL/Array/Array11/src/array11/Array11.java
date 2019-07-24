//Addition of 2 Matrices in Java
package array11;

/**
 *
 * @author adittachakraborty
 */
public class Array11 {

    public static void main(String[] args) {
        //creating two matrices 
        int a[][] = {{1, 2, 3}, {4, 5, 6}};
        int b[][] = {{1, 2, 3}, {4, 5, 6}};
        
        //creating another matrix to store the sum of two matrices  
        int c[][] = new int[2][3];  //3 column 2 rows
        
        //adding and printing addition of 2 matrices
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
