
package minusdaysmethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author adittachakraborty
 */
public class MinusDaysMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2019, 8, 18, 07, 30);
        LocalDateTime dateTime2 = dateTime1.minusDays(20);
        
        System.out.println("Befor formatting: " + dateTime2);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm:ss");
        String dateTimeFormat = format.format(dateTime2);
        System.out.println("After formatting: " + dateTimeFormat);
    }
    
}
