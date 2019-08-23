
package systemdefaultmethod;

import java.time.ZoneId;

/**
 *
 * @author adittachakraborty
 */
public class SystemDefaultMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
    }
    
}
