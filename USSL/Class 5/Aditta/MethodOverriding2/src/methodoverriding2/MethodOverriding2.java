
package methodoverriding2;

public class MethodOverriding2 extends ParentClass{
    
    @Override
    void show(){
        System.out.println("Hello I am child class overrding");
        super.show();   //Using super keyword calling parent class
    }

    public static void main(String[] args) {
        ParentClass PC = new ParentClass();
        MethodOverriding2 MO = new MethodOverriding2();
        
        PC.show();
        MO.show();
    }
    
}
