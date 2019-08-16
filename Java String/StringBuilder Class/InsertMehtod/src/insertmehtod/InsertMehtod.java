
package insertmehtod;

/**
 *
 * @author adittachakraborty
 */
public class InsertMehtod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.insert(3, "Java");
        
        System.out.println(sb);
    }
    
}
