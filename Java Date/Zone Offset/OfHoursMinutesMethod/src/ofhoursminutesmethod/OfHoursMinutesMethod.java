
package ofhoursminutesmethod;

import java.time.ZoneOffset;

/**
 *
 * @author adittachakraborty
 */
public class OfHoursMinutesMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneOffset zone = ZoneOffset.ofHoursMinutes(3, 19);
        System.out.println(zone);
    }
    
}
