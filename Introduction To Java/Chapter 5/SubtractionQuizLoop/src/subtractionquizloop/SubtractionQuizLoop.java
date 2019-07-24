
package subtractionquizloop;

import java.util.Scanner;

public class SubtractionQuizLoop {

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        
        Scanner input = new Scanner(System.in);
        
        while(count < NUMBER_OF_QUESTIONS){
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            
            if(number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("What is "+number1+" - "+number2+" = ?");
            int answer = input.nextInt();
            
            if(number1 - number2 == answer){
                System.out.println("Your are correct.");
                correctCount++;
            }
            else{
                System.out.println("Your answer is wrong.");
                System.out.println(number1+" - "+number2+" should be "+(number1 - number2));
            }
            count++;
            
            output += "\n"+number1+" - "+number2+" = "+answer+((number1 - number2 == answer)? " Correct" : " Wrong");
        }
        
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        
        System.out.println("Correct count is: "+correctCount);
        System.out.println("You take: "+testTime/1000+" seconds\n"+output);
    }
    
}