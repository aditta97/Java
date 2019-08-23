
package zoneidclassexample;

import java.time.LocalTime;
import java.time.ZoneId;

/**
 *
 * @author adittachakraborty
 */
public class ZoneIdClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneId zoneId1 = ZoneId.of("Asia/Dhaka");
        ZoneId zoneId2 = ZoneId.of("Asia/Tokyo");
        
        LocalTime id1 = LocalTime.now(zoneId1);
        LocalTime id2 = LocalTime.now(zoneId2);
        
        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id1.isBefore(id2));
    }
    
}
