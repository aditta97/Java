
package methodoverloading2;


public class Data {
    void first(){
        System.out.println("I am first method");
    }
    void first(int a){
        System.out.println("I am int");
    }
    void first(float a){
        System.out.println("I am float");
    }
    void first(int a, int b){
        System.out.println("I am int, int");
    }
    void first(float a, int b){
        System.out.println("I am float, int");
    }
    void first(float a, float b){
        System.out.println("I am float, float");
    }
    void first(int a, float b){
        System.out.println("I am int, float");
    }
}
