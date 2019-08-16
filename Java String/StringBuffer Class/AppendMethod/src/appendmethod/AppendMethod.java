
package appendmethod;

/**
 *
 * @author adittachakraborty
 */
public class AppendMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" Java");     //The append() method concatenates the given argument with this string.
        
        System.out.println(sb);
    }
    
}
