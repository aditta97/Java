/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverriding1;

/**
 *
 * @author Hrido
 */
public class MethodOverriding1 extends ParenClass{
    void aa(){
        
        System.out.println("Hello I am Child Class");
        super.aa();
    }
    public static void main(String[] args) {
       MethodOverriding1 ob=new MethodOverriding1();
       ob.aa();
        
    }
    
}
