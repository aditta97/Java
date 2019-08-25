/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addtomethod;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;

/**
 *
 * @author adittachakraborty
 */
public class AddToMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Period period = Period.ofDays(26);
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);
    }
    
}
