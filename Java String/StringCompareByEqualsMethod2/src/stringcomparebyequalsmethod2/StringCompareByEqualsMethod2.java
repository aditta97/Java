
package stringcomparebyequalsmethod2;

/**
 *
 * @author adittachakraborty
 */
public class StringCompareByEqualsMethod2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Aditta";
        String s2 = "ADITTA";  
        
        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); //true
    }
    
}
