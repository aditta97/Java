
package methodoverloading;

class overloading{
    void show(){
        System.out.println("1st");
    }
    void show(int a, int b){
        System.out.println("2nd");
    }
    void show(float a, int b){
        System.out.println("3rd");
    }
    void show(int a, float b){
        System.out.println("4th");
    }
    void show(float a, float b){
        System.out.println("5th");
    }
    void show(String S){
        System.out.println("6th "+S);
    }
    void show(double a, double b){
        System.out.println("7th");
    }
    void show(int a, float b, double c){
        System.out.println("8th");
    }
}


public class MethodOverloading {

    public static void main(String[] args) {
        overloading o = new overloading();
        
        o.show();
        o.show(10, 20);
        o.show(3.6f, 10);
        o.show(15, 6.7f);
        o.show(4.8f, 3.6f);
        o.show("String");
        o.show(32.5678, 86.345678);
        o.show(30, 12.7f, 675.34567890);
    }
    
}
