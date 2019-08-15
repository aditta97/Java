
package stringcomparebyequalequaloperator;

/**
 *
 * @author adittachakraborty
 */
public class StringCompareByEqualEqualOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Aditta";
        String s2 = "Aditta";
        String s3 = new String("Aditta");
        
        System.out.println(s1 == s2); //true (because both refer to same instance)
        System.out.println(s1 == s3); //false (because s3 refers to instance created in nonpool)
    }
    
}
