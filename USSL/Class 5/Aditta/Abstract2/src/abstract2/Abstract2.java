
package abstract2;

public class Abstract2 {

    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of interest is "+b.getRateOfInterest()+"%");
        
        b = new PNB();
        System.out.println("Rate of interest is "+b.getRateOfInterest()+"%");
    }
    
}
