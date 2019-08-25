/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusmethod;

import java.time.Period;
import java.time.YearMonth;

/**
 *
 * @author adittachakraborty
 */
public class PlusMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        YearMonth ym1 = YearMonth.now();
        YearMonth ym2 = ym1.plus(Period.ofYears(2));
        System.out.println(ym2);
    }
    
}
