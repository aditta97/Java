
package atdatemethod;

import java.time.LocalDate;
import java.time.Year;

/**
 *
 * @author adittachakraborty
 */
public class AtDateMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Year year = Year.of(2019);
        LocalDate localDate = year.atDay(124);
        System.out.println(localDate);
    }
    
}
