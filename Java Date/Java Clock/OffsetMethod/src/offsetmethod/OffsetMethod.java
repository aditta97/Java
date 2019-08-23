
package offsetmethod;

import java.time.Clock;
import java.time.Duration;

/**
 *
 * @author adittachakraborty
 */
public class OffsetMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        Duration duration = Duration.ofHours(5);
        Clock c = Clock.offset(clock, duration);
        System.out.println(c.instant());
    }
    
}
