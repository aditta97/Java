
package futuretution;

public class FutureTution {

    public static void main(String[] args) {
        double tution = 10000;
        int year = 0;
        while(tution < 20000){
            tution = tution * 1.07;
            year++;
        }
        
        System.out.println("Tution fee will doubled in "+year+" years");
        System.out.println("Tution fee will be $"+tution+" in "+year+" years ");
    }
    
}
