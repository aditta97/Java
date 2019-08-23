
package getdisplaynamemethod;

import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author adittachakraborty
 */
public class GetDisplayNameMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT));
    }
    
}
