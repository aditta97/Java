
package offsettimeclassexample;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

/**
 *
 * @author adittachakraborty
 */
public class OffsetTimeClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int h = offset.get(ChronoField.HOUR_OF_DAY);
        System.out.println(h);
        
        int m = offset.get(ChronoField.MINUTE_OF_DAY);
        System.out.println(m);
        
        int s = offset.get(ChronoField.SECOND_OF_DAY);
        System.out.println(s);
    }
    
}
