
package stringcomparebyequalsmethod;

/**
 *
 * @author adittachakraborty
 */
public class StringCompareByEqualsMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Aditta";
        String s2 = "Aditta";
        String s3 = new String("Aditta");
        String s4 = "Sachin";
        
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1.equals(s4)); //false
    }
    
}
