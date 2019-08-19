
package localdatetimeexample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author adittachakraborty
 */
public class LocalDateTimeExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before formatting: " + now);
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        
        System.out.println("After formating: " + formatDateTime);
    }
    
}
