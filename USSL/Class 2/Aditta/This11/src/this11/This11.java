
package this11;

class A{
    
    void method(){
        System.out.println(this);   //prints same reference ID
    }
}

public class This11 {

    public static void main(String[] args) {
        
        A a = new A();
        System.out.println(a);  //prints the reference ID
        
        a.method();
    }
    
}
