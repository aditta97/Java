//
//package lab8;
//
//class ABC{
//    public void myMethod(){
//        System.out.println("Overriden method");
//    }
//}
//
//public class Lab8 extends ABC{
//    public void myMethod(){
//        super.myMethod();
//        System.out.println("Overriden method");
//    }
//
//    public static void main(String[] args) {
//        Lab8 obj = new Lab8();
//        obj.myMethod();
//    } 
//}



package lab8;

class Parentclass{
    String str = "Yahoo";
    Parentclass(){
        System.out.println("no arg constructor of parent class");
    }
    Parentclass(String str){
        System.out.println("parameterized constructor of parant class "+this.str);
    }
}

public class Lab8 extends Parentclass{
    Lab8(){
        super("Hahaha");
        System.out.println("Constructor of child class");
    }
    void display(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Lab8 obj = new Lab8();
        obj.display();
    } 
}
