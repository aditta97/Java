
package isleapyearmethod;

import java.time.LocalDate;

/**
 *
 * @author adittachakraborty
 */
public class IsLeapYearMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2019, 8, 20);
        System.out.println(date1.isLeapYear()); //false
        
        LocalDate date2 = LocalDate.of(2016, 9, 23);
        System.out.println(date2.isLeapYear()); //true
    }
    
}
