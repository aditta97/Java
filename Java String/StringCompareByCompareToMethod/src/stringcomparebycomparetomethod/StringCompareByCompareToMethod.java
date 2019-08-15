
package stringcomparebycomparetomethod;

/**
 *
 * @author adittachakraborty
 */
public class StringCompareByCompareToMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "Aditta";
        String s2 = "Aditta";
        String s3 = "Ratan";
        
        System.out.println(s1.compareTo(s2)); // 0
        System.out.println(s1.compareTo(s3)); // -17 (because s3 < s1)
        System.out.println(s3.compareTo(s1)); // 17 (because s1 > s3)
    }
    
}
