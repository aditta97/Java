/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass1;


public class AbstractClass1 extends ParenClass {
void abt(){
    System.out.println("I am setteled");
}
String h(){

    return "I";
}
void ab(){
    System.out.println("ABBBBBB");
    super.ab();
}

    public static void main(String[] args) {
        AbstractClass1 ob=new AbstractClass1();
        ob.abt();
        ob.h();
        ob.ab();
        
    }
    
}
