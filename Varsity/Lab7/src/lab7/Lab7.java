
package lab7;

class SimpleCalculator{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    float add(float x, int y){
        return x-y;
    }
    float add(float a, float b){
        return a+b;
    }
}

public class Lab7 {

    public static void main(String[] args) {
        SimpleCalculator obj = new SimpleCalculator();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(30.7f,20));
        System.out.println(obj.add(7.2f, 20.6f));
    }
    
}
