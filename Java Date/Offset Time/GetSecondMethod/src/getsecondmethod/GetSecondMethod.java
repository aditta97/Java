
package getsecondmethod;

import java.time.OffsetTime;

/**
 *
 * @author adittachakraborty
 */
public class GetSecondMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int s = offset.getSecond();
        System.out.println(s + " Second");
    }
    
}
