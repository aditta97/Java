
package nowmethod;

import java.time.Year;

/**
 *
 * @author adittachakraborty
 */
public class NowMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Year year = Year.now();
        System.out.println(year);
    }
    
}
