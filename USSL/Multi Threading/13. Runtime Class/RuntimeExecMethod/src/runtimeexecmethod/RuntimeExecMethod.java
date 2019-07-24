/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtimeexecmethod;

import java.io.IOException;

/**
 *
 * @author adittachakraborty
 */
public class RuntimeExecMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        
        try {
            //Windows only
            r.exec("notepad");    //will open a new notepad
        } catch (IOException ex) {
            System.out.println("Notepad Not Found");
        }
    }
    
}
