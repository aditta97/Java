
package rangemethod;

import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

/**
 *
 * @author adittachakraborty
 */
public class RangeMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MonthDay month = MonthDay.now();
        ValueRange r1 = month.range(ChronoField.MONTH_OF_YEAR);
        System.out.println(r1);
        
        ValueRange r2 = month.range(ChronoField.DAY_OF_MONTH);
        System.out.println(r2);
    }
    
}
