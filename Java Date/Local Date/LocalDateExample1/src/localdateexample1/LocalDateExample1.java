
package localdateexample1;

import java.time.LocalDate;

/**
 *
 * @author adittachakraborty
 */
public class LocalDateExample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = date.plusDays(1);
        
        //Default format: yyyy-mm-dd
        System.out.println("Today date: " + date);
        System.out.println("Yesterday date: " + yesterday);
        System.out.println("Tomorrow date: " + tomorrow);
    }
    
}
