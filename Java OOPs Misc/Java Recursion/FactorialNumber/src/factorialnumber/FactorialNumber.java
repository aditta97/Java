/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialnumber;

/**
 *
 * @author adittachakraborty
 */
public class FactorialNumber {
    
    static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: " + factorial(5));
    }
    
}
