/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseries;

/**
 *
 * @author adittachakraborty
 */
public class FibonacciSeries {
    
    static int n1 = 0, n2 = 1, n3 = 0;
    
    static void fibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacci(count - 1);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 15;
        System.out.print(n1 + " " + n2); //Printing 0 and 1
        fibonacci(count - 2); //n-2 because 2 numbers are already printed
    }
    
}
