
package immutablestring;

/**
 *
 * @author adittachakraborty
 */
public class ImmutableString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Sachin";
        s.concat(" Tendulkar"); //concat() method appends the string at the end
        System.out.println(s);
        
        System.out.println();
        
        s = s.concat(" Tendulkar"); //still sachin object is not modified.
        System.out.println(s);
    }
    
}
