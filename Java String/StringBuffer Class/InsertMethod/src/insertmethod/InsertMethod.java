
package insertmethod;

/**
 *
 * @author adittachakraborty
 */
public class InsertMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.insert(1, "Java");   //now original string is changed
        // 1 (Int) - String will insert after counting int character
        
        System.out.println(sb);
    }
    
}
