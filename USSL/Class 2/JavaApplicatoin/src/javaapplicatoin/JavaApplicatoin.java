/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicatoin;

import java.util.Scanner;

/**
 *
 * @author Hrido
 */
public class JavaApplicatoin {
        int a,b;    //instance variable
        void input(){
         Scanner ob2=new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        a=ob2.nextInt();
        System.out.println("Please enter the second number: ");
        b=ob2.nextInt();
        
        }
        void add(){
        int res=a+b;
            System.out.println(res);
    }
   
    public static void main(String[] args) {
        JavaApplicatoin ob=new JavaApplicatoin();
       ob.input();
        System.out.print("Result: ");
        ob.add();
        
        
    }
    
}
