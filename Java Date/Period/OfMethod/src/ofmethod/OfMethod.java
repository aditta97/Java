/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ofmethod;

import java.time.Period;

/**
 *
 * @author adittachakraborty
 */
public class OfMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Period period = Period.of(2019, 3, 14);
        System.out.println(period.toString());
    }
    
}
