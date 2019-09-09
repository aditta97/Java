/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minus;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author adittachakraborty
 */
public class Minus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instant instant = Instant.parse("2019-02-03T11:25:30.00Z");
        instant = instant.minus(Duration.ofDays(10));
        System.out.println(instant);
    }
    
}
