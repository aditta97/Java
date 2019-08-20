
package getmethod;

import java.time.MonthDay;
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
        MonthDay month = MonthDay.now();
        long n = month.get(ChronoField.MONTH_OF_YEAR);
        System.out.println(n);
    }
    
}
