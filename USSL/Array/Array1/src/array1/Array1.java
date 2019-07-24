/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author adittachakraborty
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = new int[5]; //declaration & instantiation
        array[0] = 10;  //initialization
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        //traversing array  
        for (int i = 0; i < array.length; i++){    //length is the property of array
            System.out.println(array[i]);
        }
    }
    
}
