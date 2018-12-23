
package methodoverloading2;

public class MethodOverloading2 extends Data {

    public static void main(String[] args) {
        MethodOverloading2 MO = new MethodOverloading2();
        
        MO.first();
        MO.first(10.4f);
        MO.first(30);
        MO.first(30.2f, 7);
        MO.first(55, 34.65f);
        MO.first(40.3f, 38.9f);
        MO.first(4, 8);
    }
    
}
