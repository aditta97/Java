
package thisconstructor5;

class A{
    A(){
        System.out.println("I am class A constructor");
    }
    
    A(int x){
        this();     //calling A() Constractor
        System.out.println(x);
    }
}

public class ThisConstructor5 {

    public static void main(String[] args) {
        A a = new A(50);
    }
    
}
