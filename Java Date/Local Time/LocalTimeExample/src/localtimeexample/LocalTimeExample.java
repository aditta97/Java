
package localtimeexample;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author adittachakraborty
 */
public class LocalTimeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Asia/Tokyo");
        ZoneId zone2 = ZoneId.of("Asia/Dhaka");
        
        LocalTime time1 = LocalTime.now(zone1);
        System.out.println("Japan time: " + time1);
        
        LocalTime time2 = LocalTime.now(zone2);
        System.out.println("Dhaka time: " + time2);
        
        long hours = ChronoUnit.HOURS.between(time2, time1);
        System.out.println("Hours between two time zone: " + hours);
        
        long minutes = ChronoUnit.MINUTES.between(time2, time1);
        System.out.println("Minutes between two time zone: " + minutes);
    }
    
}
