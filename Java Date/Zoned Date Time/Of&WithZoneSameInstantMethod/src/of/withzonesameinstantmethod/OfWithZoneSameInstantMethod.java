
package of.withzonesameinstantmethod;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author adittachakraborty
 */
public class OfWithZoneSameInstantMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2018, Month.AUGUST, 23, 05, 57);
        ZoneId Bangladesh = ZoneId.of("Asia/Dhaka");
        ZonedDateTime zone1 = ZonedDateTime.of(ldt, Bangladesh);
        System.out.println("In Bangladesh Central Time Zone: " + zone1);
        ZoneId Tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zone2 = zone1.withZoneSameLocal(Tokyo);
        System.out.println("In Tokyo Central Time Zone: " + zone2);
    }
    
}
