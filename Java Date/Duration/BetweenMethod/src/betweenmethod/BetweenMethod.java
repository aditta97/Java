/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betweenmethod;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author adittachakraborty
 */
public class BetweenMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duration d = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(d.get(ChronoUnit.SECONDS));
    }
    
}
