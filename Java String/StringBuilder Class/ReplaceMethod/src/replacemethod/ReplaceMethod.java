
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
        StringBuilder sb = new StringBuilder("Hello");
        sb.replace(0, 2, "Java");
        
        System.out.println(sb);
    }
    
}
