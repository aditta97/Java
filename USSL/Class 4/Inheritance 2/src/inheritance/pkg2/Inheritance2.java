
package inheritance.pkg2;


class FirstClass{
int a=10;
void aaa(){

    System.out.println("Hello i am First Class");
}
}
class SecondClass extends FirstClass{

int b=20;
int c=30;
void aaa(){
    System.out.println("Helo I am Second Class");

}
}
public class Inheritance2 {
    public static void main(String[] args) {
        FirstClass ob=new FirstClass();
        ob.aaa();
        FirstClass ob2=new SecondClass();
        ob2.aaa();
        
    }

}
    

