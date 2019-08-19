
package minushoursminusminutes;

import java.time.LocalTime;

/**
 *
 * @author adittachakraborty
 */
public class MinusHoursMinusMinutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(12, 48, 45);
        System.out.println(time1);
        
        LocalTime time2 = time1.minusHours(5);
        System.out.println(time2);
        
        LocalTime time3 = time2.minusMinutes(20);
        System.out.println(time3);
    }
    
}
