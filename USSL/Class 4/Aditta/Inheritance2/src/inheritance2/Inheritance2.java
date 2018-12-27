
package inheritance2;

class Animal{
    void move(){
        System.out.println("Animal is moving");
    }
    
    void display(){
        System.out.println("Testing method");
    }
}
class Dog extends Animal{
    void barking(){
        System.out.println("Dog is barking");
    }
    
    @Override
    void move(){
        System.out.println("Dog is moving");
    }
}

public class Inheritance2 {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a2 = new Dog();
        Dog d = new Dog();
        
        d.move();
        d.barking();
        a2.move();
        a2.move();
        a2.display();
    }
    
}
