/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusmethod;

import java.time.Duration;
import java.time.LocalTime;

/**
 *
 * @author adittachakraborty
 */
public class PlusMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.NOON, LocalTime.MAX);
        System.out.println(d1.getSeconds());
        Duration d2 = d1.plus(d1);
        System.out.println(d2.getSeconds());
    }
    
}
