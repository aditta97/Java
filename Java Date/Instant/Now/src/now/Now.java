/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package now;

import java.time.Instant;

/**
 *
 * @author adittachakraborty
 */
public class Now {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
    }
    
}
