
package plus;

import java.time.Period;
import java.time.ZonedDateTime;

/**
 *
 * @author adittachakraborty
 */
public class Plus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.now();
        ZonedDateTime p = zone.plus(Period.ofDays(7));
        System.out.println(p);
    }
    
}
