
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
        StringBuilder sb = new StringBuilder("Hello");
        sb.delete(0, 3);
        
        System.out.println(sb);
    }
    
}
