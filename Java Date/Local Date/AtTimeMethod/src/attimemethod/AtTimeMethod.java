
package attimemethod;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author adittachakraborty
 */
public class AtTimeMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, 8, 20);
        LocalDateTime dateTime = date.atTime(7, 29, 5);
        
        System.out.println(dateTime);
    }
    
}
