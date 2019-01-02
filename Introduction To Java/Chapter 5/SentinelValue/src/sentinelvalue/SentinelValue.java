
package sentinelvalue;

import java.util.Scanner;

public class SentinelValue {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("If enter 0 then summation will stop");
        System.out.println("Enter an integer number: ");
        int data = input.nextInt();
        
        int sum = 0;
        while(data != 0){
            sum += data;
            
            System.out.println("Enter an integer number: ");
            data = input.nextInt();
        }
        
        System.out.println("The summation is: "+sum);
    }
    
}
