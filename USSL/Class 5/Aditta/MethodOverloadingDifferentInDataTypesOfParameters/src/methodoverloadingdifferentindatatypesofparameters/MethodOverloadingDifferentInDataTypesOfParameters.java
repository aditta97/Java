
package methodoverloadingdifferentindatatypesofparameters;

public class MethodOverloadingDifferentInDataTypesOfParameters {

    public static void main(String[] args) {
       DisplayOverloading DO = new DisplayOverloading();
       
       DO.disp('a');
       DO.disp(5);
    }
    
}
