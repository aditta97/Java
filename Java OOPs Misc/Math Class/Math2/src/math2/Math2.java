package math2;

/**
 *
 * @author adittachakraborty
 */
public class Math2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = 30;
        
        //converting values to radian
        double b = Math.toRadians(a);
        System.out.println("Radian of " + a + " is " + b);
        
        //return the trigonometric sine value of a
        System.out.println("Sine value of a is: " + Math.sin(a));
        
        //return the trigonometric cosine value of a
        System.out.println("Cosine value of a is: " + Math.cos(a));
        
        //return the trigonometric tangent value of a
        System.out.println("Tangent value of a is: " + Math.tan(a));
        
        //return the trigonometric arc sine value of a
        System.out.println("arc Sine value of a is: " + Math.asin(a));
        
        //return the trigonometric arc cosine value of a
        System.out.println("arc Cosine value of a is: " + Math.acos(a));
        
        //return the trigonometric arc tangent value of a
        System.out.println("arc Tangent value of a is: " + Math.atan(a));
        
        //return the hyperbolic sine of a
        System.out.println("hyperbolic Sine value of a is: " + Math.sinh(a));
        
        //return the hyperbolic cosine of a
        System.out.println("hyperbolic Cosine of a is: " + Math.cosh(a));
        
        //return the hyperbolic tangent of a
        System.out.println("hyperbolic Tangent of a is: " + Math.tanh(a));
    }
    
}
