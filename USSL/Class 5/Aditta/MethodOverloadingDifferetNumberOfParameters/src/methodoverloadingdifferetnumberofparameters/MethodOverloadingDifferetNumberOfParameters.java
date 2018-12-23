
package methodoverloadingdifferetnumberofparameters;

public class MethodOverloadingDifferetNumberOfParameters extends DisplayOverloading {

    public static void main(String[] args) {
        DisplayOverloading DO = new DisplayOverloading();
        
        DO.disp('a');
        DO.disp('a', 10);
    }
    
}
