
package interface3;

public class Interface3 {

    public static void main(String[] args) {
       Bank b = new SBI();
       Bank b2 = new PNB();
       
       System.out.println("ROI: "+b.rateOfInterest()+" from SBI class");
       System.out.println("ROI: "+b2.rateOfInterest()+" from PNB class");
    }
    
}
