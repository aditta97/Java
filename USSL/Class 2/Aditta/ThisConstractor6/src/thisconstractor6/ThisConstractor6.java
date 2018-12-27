
package thisconstractor6;

class A{
    
    A(){
        this(5);
        System.out.println("Hello A");
    }
    
    A(int x){
        System.out.println(x);
    }
}

public class ThisConstractor6 {

    public static void main(String[] args) {
        A a = new A();
    }
    
}
