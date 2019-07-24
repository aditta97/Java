
package greatestcommondivisor;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first integer: ");
        int number1 = input.nextInt();
        
        System.out.println("Enter second integer: ");
        int number2 = input.nextInt();
        
        int gcd = 1;    //Initial gcd is 1
        int k = 2;      //Possible gcd
        
        while(k <= number1 && number2 % k == 0){
            if(number1 % k == 0 && number2 % k == 0){
                gcd = k;    //Update gcd
            }
            k++;
        }
        System.out.println("The greatest common divisor for "+number1+
                " and "+number2+" is "+gcd);
    }
    
}
