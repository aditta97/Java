/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverload1;

/**
 *
 * @author Hrido
 */
public class Data {
    void first(){
        System.out.println("I am first Method");
    }
    void first(int a){
        System.out.println("I am Integer");
    }
    void first(float a){
        System.out.println("I am float");
    }
    void first(float a,int b){
        System.out.println("I am float,integer");
        
    }
    void first(int a,float b){
        System.out.println("I am integer,float");
    }
    
}
