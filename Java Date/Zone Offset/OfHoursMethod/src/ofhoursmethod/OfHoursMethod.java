
package ofhoursmethod;

import java.time.ZoneOffset;

/**
 *
 * @author adittachakraborty
 */
public class OfHoursMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneOffset zone = ZoneOffset.ofHours(5);
        System.out.println(zone);
    }
    
}
