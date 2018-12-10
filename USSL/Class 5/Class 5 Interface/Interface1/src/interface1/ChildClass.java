/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author Hrido
 */
public class ChildClass implements Interface{

    @Override
    public void tt() {
        System.out.println("I am tt");
    }

    @Override
    public void tr() {
        System.out.println("I am tr");
    }
    public static void main(String[] args) {
        ChildClass ob=new ChildClass();
        ob.tt();
        ob.tr();
    }

    
}
