
package isvalidyearmethod;

import java.time.MonthDay;

/**
 *
 * @author adittachakraborty
 */
public class IsValidYearMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MonthDay month = MonthDay.now();
        boolean b = month.isValidYear(2019);
        System.out.println(b);
    }
    
}
