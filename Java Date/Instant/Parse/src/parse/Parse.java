/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parse;

import java.time.Instant;

/**
 *
 * @author adittachakraborty
 */
public class Parse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instant inst = Instant.parse("2017-02-03T10:37:30.00Z");
        System.out.println(inst);
    }
    
}
