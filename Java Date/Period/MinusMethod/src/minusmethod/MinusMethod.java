/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minusmethod;

import java.time.Period;

/**
 *
 * @author adittachakraborty
 */
public class MinusMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Period period1 = Period.ofMonths(8);
        Period period2 = period1.minus(Period.ofMonths(3));
        System.out.println(period2);
    }
    
}
