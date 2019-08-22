
package getzonemethod;

import java.time.Clock;

/**
 *
 * @author adittachakraborty
 */
public class GetZoneMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock clock = Clock.systemDefaultZone();
        System.out.println("Clock: " + clock);
        System.out.println("Get Clock Zone: " + clock.getZone());
    }
    
}
