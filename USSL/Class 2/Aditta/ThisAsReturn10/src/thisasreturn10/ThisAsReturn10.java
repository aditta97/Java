
package thisasreturn10;

class A{
    A getA(){
        return this;
    }
    
    void display(){
        System.out.println("Hello World");
    }
}

public class ThisAsReturn10 {

    public static void main(String[] args) {
        new A().getA().display();
    }
    
}
