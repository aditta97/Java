
package wrapperclass4;

public class WrapperClass4 {

    public static void main(String[] args) {
        
        double db = 110.43;
        
        Double dd = new Double(34.23);  //Boxing
        
        //Alternate of - Double dd = new Double(34.23);
        
        Double dd2 = 34.23; //Autoboxing
        
        Double stored = dd2;    //AutoUnboxing
        
        //Double stored = (double)dd2;    //Unboxing (If do typecasting)
        
        System.out.println(stored);
        
        
        int a = 19;
        
        Double d = (double)a;   //TypeCasting
    }
    
}
