/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package availableproccessor;

/**
 *
 * @author adittachakraborty
 */
public class AvailableProcessors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        
        System.out.println("Available Processors : " + r.availableProcessors());
    }
    
}
