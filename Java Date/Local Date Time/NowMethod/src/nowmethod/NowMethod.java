
package nowmethod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author adittachakraborty
 */
public class NowMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
        String formatDateTime = time1.format(format);
        
        System.out.println(formatDateTime);
    }
    
}
