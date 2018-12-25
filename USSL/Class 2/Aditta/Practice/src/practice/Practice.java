
package practice;

import java.util.Scanner;

public class Practice {
    
    int a, b;   //Instance Variable
        
    void add(){
    int result = a + b;
    System.out.println(result);
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the first number:");
        p.a = input.nextInt();
        
        System.out.println("Please enter the second number:");
        p.b = input.nextInt();
        
        System.out.print("Result is: ");
        p.add();
    }
    
}
