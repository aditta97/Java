
package getdayofmonth;

import java.time.OffsetDateTime;

/**
 *
 * @author adittachakraborty
 */
public class GetDayOfMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime.getDayOfMonth());
    }
    
}
