
package gethourmethod;

import java.time.OffsetTime;

/**
 *
 * @author adittachakraborty
 */
public class GetHourMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int h = offset.getHour();
        System.out.println(h + " Hour");
    }
    
}
