
package getnamesetnamegetid;

/**
 *
 * @author adittachakraborty
 */
public class GetNameSetNameGetId extends Thread {

    @Override
    public void run(){
        System.out.println("Thread is running....");
    }
    
    public static void main(String[] args) {
        GetNameSetNameGetId g1 = new GetNameSetNameGetId();
        GetNameSetNameGetId g2 = new GetNameSetNameGetId();
        
        System.out.println("Name of g1 : " + g1.getName());
        System.out.println("Name of g2 : " + g2.getName());
        
        System.out.println();
        
        System.out.println("Id of g1 : " + g1.getId());
        System.out.println("Id of g2 : " + g2.getId());
        
        System.out.println();
        
        g1.start();
        g2.start();
        
        g1.setName("First Thread");
        g2.setName("Second Thread");
        
        System.out.println();
        
        System.out.println("After changing name of g1 : " + g1.getName());
        System.out.println("After changing name of g2 : " + g2.getName());
        
        System.out.println();
    }
    
}
