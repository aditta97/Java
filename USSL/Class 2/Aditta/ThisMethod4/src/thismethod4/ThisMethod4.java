
package thismethod4;

class A{
    void m(){
        System.out.println("Hello, I am M method");
    }
    
    void n(){
        System.out.println("Hello, I am N method");
        //m();
        this.m();
    }
}

public class ThisMethod4 {

    public static void main(String[] args) {
        A a = new A();
        
        a.n();
    }
    
}
