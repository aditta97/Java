/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditions.switchcase;

import java.util.Scanner;

/**
 *
 * @author Hrido
 */
public class ConditionsSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a="ad";
        switch (a){
        case "ad":
            
             System.out.println("Case one executed");
            
            
               
            
            
            Scanner ob=new Scanner(System.in);
            int t=ob.nextInt();
            break;
        case "bd":
            System.out.println("case two executed");
            break;
        default: System.out.println("Not found");
        }
    }
    
}
