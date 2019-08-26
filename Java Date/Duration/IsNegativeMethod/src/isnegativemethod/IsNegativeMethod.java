/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isnegativemethod;

import java.time.Duration;
import java.time.LocalTime;

/**
 *
 * @author adittachakraborty
 */
public class IsNegativeMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.MAX, LocalTime.NOON);
        System.out.println(d1.isNegative());
        Duration d2 = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(d2.isNegative());
    }
    
}
