
package getzonemethod;

import java.time.ZonedDateTime;

/**
 *
 * @author adittachakraborty
 */
public class GetZoneMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZonedDateTime zone = ZonedDateTime.now();
        System.out.println(zone.getZone());
    }
    
}
