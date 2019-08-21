
package getminutemehtod;

import java.time.OffsetTime;

/**
 *
 * @author adittachakraborty
 */
public class GetMinuteMehtod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int m = offset.getMinute();
        System.out.println(m + " Minute");
    }
    
}
