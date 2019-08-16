
package deletemethod;

/**
 *
 * @author adittachakraborty
 */
public class DeleteMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        
        System.out.println(sb);
    }
    
}
