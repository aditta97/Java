
package lab3;

public class Lab3 {
    int total;
    int price(int quantity, int unit_price){
        return quantity * unit_price;
    }

    public static void main(String[] args) {
        
        int q = 5, p = 6;
        
        //creating objects:
        Lab3 A = new Lab3();
        Lab3 A2 = new Lab3();
        
        //way - 1:
        int total = A.price(q, p);
        
        //way - 1 print:
        System.out.println("Total price is "+total+" from 1st object");
        
        //way - 2:
        A.total = A.price(q, p);
        A2.total = A.price(10, 5);
        
        //way - 2 print:
        System.out.println("Total price is "+A.total+" from 1st object by class");
        System.out.println("Total price is "+A2.total+" from 1st object by class");
    }
    
}
