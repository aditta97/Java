/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formatmethod;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author adittachakraborty
 */
public class FormatMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        YearMonth ym = YearMonth.now();
        String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
        System.out.println(s);
    }
    
}
