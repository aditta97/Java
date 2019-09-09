/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plus;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author adittachakraborty
 */
public class Plus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instant inst1 = Instant.parse("2019-02-03T11:25:30.00Z");
        Instant inst2 = inst1.plus(Duration.ofDays(7));
        System.out.println(inst2);
    }
    
}
