
package testdowhile;

import java.util.Scanner;

public class TestDoWhile {

    public static void main(String[] args) {
        
        int data;
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("If press 0 then summation will end.");
        
        do{
            System.out.println("Enter an integer: ");
            data = input.nextInt();
            
            sum += data;
        }
        while(data != 0);
        System.out.println("The sum is: "+sum);
    }
    
}
