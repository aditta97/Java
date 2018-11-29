/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

/**
 *
 * @author adittachakraborty
 */
public class Class1 {
    int P;
    Class1(){
        P = 10;
    }
    
    void show (int X){
        System.out.println("value of X = "+X);
    }
    
    public static void main(String[] args) {
        Class1 R = new Class1();
        R.show(12);
        System.out.println(R.P);
    }
    
}
