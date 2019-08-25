/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmethod;

import java.time.YearMonth;
import java.time.temporal.ChronoField;

/**
 *
 * @author adittachakraborty
 */
public class GetMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        YearMonth y = YearMonth.now();
        long l1 = y.get(ChronoField.YEAR);
        System.out.println(l1);
        long l2 = y.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(l2);
    }
    
}
