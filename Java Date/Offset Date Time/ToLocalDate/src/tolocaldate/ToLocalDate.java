
package tolocaldate;

import java.time.OffsetDateTime;

/**
 *
 * @author adittachakraborty
 */
public class ToLocalDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime.toLocalDate());
    }
    
}
