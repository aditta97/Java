
package monthdayclassexample;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 *
 * @author adittachakraborty
 */
public class MonthDayClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MonthDay month = MonthDay.now();
        System.out.println(month);  //month & day, no year
        
        LocalDate date = month.atYear(2019);    //adding year
        System.out.println(date);
    }
    
}
