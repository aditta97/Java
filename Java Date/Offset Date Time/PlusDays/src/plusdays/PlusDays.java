
package plusdays;

import java.time.OffsetDateTime;

/**
 *
 * @author adittachakraborty
 */
public class PlusDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime plusDays = offsetDateTime.plusDays(13);
        System.out.println(plusDays);
    }
    
}
