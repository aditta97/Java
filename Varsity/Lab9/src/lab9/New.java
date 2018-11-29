package lab9;

abstract class A{
    abstract void text();
    abstract void show(String S);
}

class B extends A{
    void text(){
        System.out.println("Yes");
    }
    void show(String S){
        System.out.println("Printing "+S);
    }
}

interface I{
    int sum(int a, int b);
    abstract void area();
}
class C implements I{
    public int sum(int a, int b){
        return a+b;
    }
    public void area(){
        System.out.println("big area");
    }
}

public class New {
    
    public static void main(String[] args) {
        B b = new B();
        b.text();
        b.show("Show method");
        C c = new C();
        c.area();
        System.out.println(c.sum(5,6));
    }
    
}

//Lab Final:

//Inheritence
//polymorphism
//encapsulation
//abstraction

//Lab report: 
//1. Problem definition
//2. code + output
//3. Explanation

//class test topic = polymorphism