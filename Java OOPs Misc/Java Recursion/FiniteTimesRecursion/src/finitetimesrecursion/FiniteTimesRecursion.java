/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finitetimesrecursion;

/**
 *
 * @author adittachakraborty
 */
public class FiniteTimesRecursion {
    
    static int count = 0;
    
    static void p() {
        count++;
        if(count <= 5) {
            System.out.println("hello " + count);
            p();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        p();
    }
    
}
