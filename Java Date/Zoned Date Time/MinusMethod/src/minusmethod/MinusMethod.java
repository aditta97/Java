
package minusmethod;

import java.time.Period;
import java.time.ZonedDateTime;

/**
 *
 * @author adittachakraborty
 */
public class MinusMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.now();
        ZonedDateTime m = zone.minus(Period.ofDays(20));
        System.out.println(m);
    }
    
}
