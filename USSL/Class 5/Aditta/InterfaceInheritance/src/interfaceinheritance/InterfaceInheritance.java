
package interfaceinheritance;

public class InterfaceInheritance implements Showable {
    
    @Override
    public void print(){
        System.out.println("Hello I am print method");
    }
    
    @Override
    public void show(){
        System.out.println("Hello I am show method");
    }

    public static void main(String[] args) {
        InterfaceInheritance i = new InterfaceInheritance();
        
        i.print();
        i.show();
    }
    
}
