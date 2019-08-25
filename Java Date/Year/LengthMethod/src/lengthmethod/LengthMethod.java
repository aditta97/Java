/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengthmethod;

import java.time.Year;

/**
 *
 * @author adittachakraborty
 */
public class LengthMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Year year = Year.of(2019);
        System.out.println(year.length());
    }
    
}
