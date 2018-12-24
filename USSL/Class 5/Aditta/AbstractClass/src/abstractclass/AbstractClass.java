
package abstractclass;

public class AbstractClass extends ParentClass {
    @Override
    void display(){
        System.out.println("Display method implemented");
    }
    
    @Override
    String h(){
        System.out.println("lol");
        return "I am String h method";
    }

    public static void main(String[] args) {
        
        AbstractClass AC = new AbstractClass();
        
        AC.show();
        AC.display();
        AC.h();
    }
    
}
