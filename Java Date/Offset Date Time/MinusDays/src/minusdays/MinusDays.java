
package minusdays;

import java.time.OffsetDateTime;

/**
 *
 * @author adittachakraborty
 */
public class MinusDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime minusDays = offsetDateTime.minusDays(4);
        System.out.println(minusDays);
    }
    
}
