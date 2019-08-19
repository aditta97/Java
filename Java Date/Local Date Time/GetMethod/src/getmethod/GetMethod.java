
package getmethod;

import java.time.LocalDateTime;
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
        // year, month, day, hour, minute
        LocalDateTime a = LocalDateTime.of(2019, 4, 26, 4, 39);
        
        System.out.println(a.get(ChronoField.DAY_OF_WEEK));
        System.out.println(a.get(ChronoField.DAY_OF_YEAR));
        System.out.println(a.get(ChronoField.DAY_OF_MONTH));
        System.out.println(a.get(ChronoField.HOUR_OF_DAY));
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY));
    }
    
}
