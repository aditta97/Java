
package additionquiz;

import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {
        
        int number1 = (int)(System.currentTimeMillis() %10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is "+number1+" + "+number2+"?");
        
        int number = input.nextInt();
        int answer = number1 + number2;
        
        if(answer == number){
            System.out.println("Correct Answer");
            System.out.println(number1+" + "+number2+" = "+answer+" is true");
        }
        
        else{
            System.out.println("Wrong Answer, "+number+" is false");
            System.out.println("Correct answer is "+number1+" + "+number2+" = "+answer);
        }
    }
    
}
