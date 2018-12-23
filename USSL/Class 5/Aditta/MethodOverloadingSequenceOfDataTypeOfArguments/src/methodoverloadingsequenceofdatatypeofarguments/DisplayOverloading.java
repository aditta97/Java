
package methodoverloadingsequenceofdatatypeofarguments;

public class DisplayOverloading {
    public void disp(char c, int num){
        System.out.println("I am the first definition of method display");
    }
    public void disp(int num, char c){
        System.out.println("I am the second definition of method display");
    }
}
