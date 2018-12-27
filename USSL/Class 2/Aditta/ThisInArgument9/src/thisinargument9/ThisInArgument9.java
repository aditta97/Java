
package thisinargument9;

class Test{
    
    void method(Test object){
        System.out.println("Method is invoked");
    }
    
    void lol(){
        method(this);
    }
}

public class ThisInArgument9 {

    public static void main(String[] args) {
        Test t = new Test();
        
        t.lol();
    }
    
}
