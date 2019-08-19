
package plushoursplusminutes;

import java.time.LocalTime;

/**
 *
 * @author adittachakraborty
 */
public class PlusHoursPlusMinutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(16, 57, 19);
        System.out.println(time1);
        
        LocalTime time2 = time1.plusHours(3);
        System.out.println(time2);
        
        LocalTime time3 = time2.plusMinutes(30);
        System.out.println(time3);
    }
    
}
