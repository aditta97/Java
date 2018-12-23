
package methodoverloadingsequenceofdatatypeofarguments;

public class MethodOverloadingSequenceOfDataTypeOfArguments {

    public static void main(String[] args) {
        DisplayOverloading DO = new DisplayOverloading();
        
        DO.disp('x', 51);
        DO.disp(52, 'y');
    }
    
}
