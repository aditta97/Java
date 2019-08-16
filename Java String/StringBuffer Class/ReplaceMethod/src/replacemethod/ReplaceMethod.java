
package replacemethod;

/**
 *
 * @author adittachakraborty
 */
public class ReplaceMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(2, 3, "Java");
        
        System.out.println(sb);
    }
    
}
