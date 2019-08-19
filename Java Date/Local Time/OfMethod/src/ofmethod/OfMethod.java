
package ofmethod;

import java.time.LocalTime;

/**
 *
 * @author adittachakraborty
 */
public class OfMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(7, 38, 22);
        System.out.println(time);
    }
    
}
