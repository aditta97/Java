/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectcloning;

/**
 *
 * @author adittachakraborty
 */
public class ObjectCloning implements Cloneable {
    
    int rollNo;
    String name;

    public ObjectCloning(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ObjectCloning oc1 = new ObjectCloning(101, "Amit");
            
            ObjectCloning oc2 = (ObjectCloning)oc1.clone();
            
            System.out.println(oc1.rollNo + " " + oc1.name);
            System.out.println(oc2.rollNo + " " + oc2.name);
        } catch (CloneNotSupportedException ex) {
            System.out.println("Cloning Error");
        }
    }
    
}
