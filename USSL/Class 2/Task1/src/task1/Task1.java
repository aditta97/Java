
package task1;

import java.util.Scanner;

class Calculator{
    Scanner input = new Scanner(System.in);
    
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    
    int add(){
        
        int sum = num1 + num2;
        //System.out.println(sum);
        return sum;
    }
    
    int sub(){
        int sub = num1 - num2;
        //System.out.println(sub);
        return sub;
    }
    
    int mul(){
        int mul = num1 * num2;
        //System.out.println(mul);
        return mul;
    }
    
    double quo(){
        double quo = (double)num1 / num2;
        //System.out.println(quo);
        return quo;
    }
    
    int mod(){
        if(num1 > num2){
            int mod = num1 % num2;
            return mod;
        }
        else if(num2 >= num1){
            int mod = num2 % num1;
            return mod;
        }
        return 0;
    }
}

public class Task1 {


    public static void main(String[] args) {
        
        Calculator cal = new Calculator();
        
        System.out.println("Summation is "+cal.add());
        System.out.println("Subtruction is "+cal.sub());
        System.out.println("Multiplication is "+cal.mul());
        System.out.println("Quotient is "+cal.quo());
        System.out.println("Modulus is "+cal.mod());
        
//        cal.add();
//        cal.sub();
//        cal.mul();
//        cal.quo();
    }
    
}
