
package abstraction;
import java.util.Scanner;


public class ClassBody extends AbstractClasses {
       Scanner input = new Scanner(System.in);
    
    @Override
    int show(){
        System.out.println("Give any String");
        String showinput = input.nextLine();
        System.out.println("This is 'Show' method body "+showinput);
        return 0;
    }
    
    @Override
    float hello(){
        System.out.println("This is 'Hello' method body");
        return 0.0f;
    }
    
    @Override
    double world(){
        System.out.println("This is 'String' method body");
        return 0;
    }
    
}
