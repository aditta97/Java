
package multipleclass;

import java.util.Scanner;

public class SecondClass {
    void display(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        int x = input.nextInt();
        
        System.out.println("Enter second number:");
        int y = input.nextInt();
        
        int z = x + y;
        
        System.out.println("Addition result: "+z);
        
    }
}
