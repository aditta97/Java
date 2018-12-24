
package multipleinheritancebyinterface1;

public class MultipleInheritanceByInterface1 implements Printable, Showable {
    
    @Override
    public void print(){
        System.out.println("I am print method from Printable (Interface)");
    }
    
    @Override
    public void show(){
        System.out.println("I am show method from Showable (Interface)");
    }

    public static void main(String[] args) {
        MultipleInheritanceByInterface1 m = new MultipleInheritanceByInterface1();
        
        m.show();
        m.print();
    }
    
}
