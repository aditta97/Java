/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package issupported;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author adittachakraborty
 */
public class IsSupported {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instant inst = Instant.parse("2017-02-03T11:35:30.00Z");
        System.out.println(inst.isSupported(ChronoUnit.DAYS));
        System.out.println(inst.isSupported(ChronoUnit.YEARS));
    }
    
}
