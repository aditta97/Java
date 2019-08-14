/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbyvalue2;

/**
 *
 * @author adittachakraborty
 */
public class CallByValue2 {
    
    int data = 50;
    
    void change(CallByValue2 c) {
        c.data = c.data + 100;  //changes will be in the instance variable
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CallByValue2 cbv = new CallByValue2();
        
        System.out.println("before change: " + cbv.data);
        cbv.change(cbv);    //passing object
        System.out.println("after change: " + cbv.data);
    }
    
}
