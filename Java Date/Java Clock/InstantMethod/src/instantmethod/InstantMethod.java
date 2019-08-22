
package instantmethod;

import java.time.Clock;

/**
 *
 * @author adittachakraborty
 */
public class InstantMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
    }
    
}
