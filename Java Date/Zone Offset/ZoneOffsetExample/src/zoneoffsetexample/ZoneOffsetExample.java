
package zoneoffsetexample;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

/**
 *
 * @author adittachakraborty
 */
public class ZoneOffsetExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneOffset zone = ZoneOffset.UTC;
        Temporal temp = zone.adjustInto(ZonedDateTime.now());
        System.out.println(temp);
    }
    
}
