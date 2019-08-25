/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isleapmethod;

import java.time.Year;

/**
 *
 * @author adittachakraborty
 */
public class IsLeapMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Year year1 = Year.of(20109);
        System.out.println(year1.isLeap());
        
        Year year2 = Year.of(2020);
        System.out.println(year2.isLeap());
    }
    
}
