/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Headline: Passing Array to Method in Java

package array3;

/**
 *
 * @author adittachakraborty
 */
public class Array3 {

    static void min(int array[]) {
        int min = array[2];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int array[] = {10, 20, 30};    //declaring and initializing an array
        min(array);
    }

}
