
package zoneddatetimeclassexample;

import java.time.ZonedDateTime;

/**
 *
 * @author adittachakraborty
 */
public class ZonedDateTimeClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Dhaka]");
        System.out.println(zone);
    }
    
}
