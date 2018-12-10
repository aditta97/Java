/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.example;

class Bus{  
void fast(){System.out.println("faster");}  
}  
class Taxi extends Bus{  
void go(){System.out.println("going");}  
}  
class Bike extends Bus{  
void slow(){System.out.println("slower");}  
}  

public class InheritanceExample {

    
    public static void main(String[] args) {
        Taxi c=new Taxi();  
c.fast();  
c.go();  

    }
    
}
