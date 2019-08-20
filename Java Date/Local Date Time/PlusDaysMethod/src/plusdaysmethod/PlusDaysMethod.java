
package plusdaysmethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author adittachakraborty
 */
public class PlusDaysMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2017, 1, 14, 10, 34);
        LocalDateTime dateTime2 = dateTime1.plusDays(7);
        System.out.println("Before formatting: " + dateTime2);
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
        String dateTimeFormat = format.format(dateTime2);
        System.out.println("After formatting: " + dateTimeFormat);
    }
    
}
