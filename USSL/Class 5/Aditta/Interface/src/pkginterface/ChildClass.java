
package pkginterface;

public class ChildClass implements Interface{
    @Override
    public void show(){
        System.out.println("I am show method");
    }
    
    @Override
    public void display(){
        System.out.println("I am display method");
    }
    
    public static void main(String[] args) {
        ChildClass CC = new ChildClass();
        
        CC.show();
        CC.display();
    }
}
