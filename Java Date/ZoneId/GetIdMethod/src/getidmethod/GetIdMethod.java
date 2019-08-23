
package getidmethod;

import java.time.ZoneId;

/**
 *
 * @author adittachakraborty
 */
public class GetIdMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ZoneId z = ZoneId.systemDefault();
        String s = z.getId();
        System.out.println(s);
    }
    
}
