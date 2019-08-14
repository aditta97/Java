/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customwrapperclass;

/**
 *
 * @author adittachakraborty
 */
public class CustomWrapperClass {
    
    private int i;

    public CustomWrapperClass() {
        
    }

    public CustomWrapperClass(int i) {
        this.i = i;
    }
    
    public int getValue() {
        return i;
    }
    
    public void setValue(int i) {
        this.i = i;
    }
    
    @Override
    public String toString() {
        return Integer.toString(i);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomWrapperClass cwc = new CustomWrapperClass(10);
        
        System.out.println(cwc);
    }
    
}
