/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbyvalue1;

/**
 *
 * @author adittachakraborty
 */
public class CallByValue1 {
    
    int data = 50;
    
    void change (int data) {
        data = data + 100;  //changes will be in the local variable only
        System.out.println("In change method: " + data);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CallByValue1 cbv = new CallByValue1();
        
        System.out.println("befor change: " + cbv.data);
        cbv.change(500);
        System.out.println("after change: " + cbv.data);
    }
    
}
