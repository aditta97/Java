//Program of performing single task by multiple threads
package multitasking2;

/**
 *
 * @author adittachakraborty
 */
public class MultiTasking2 implements Runnable {
    
    @Override
    public void run() {
        System.out.println("task one");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiTasking2());    //passing annonymous object of TestMultitasking2 class
        Thread t2 = new Thread(new MultiTasking2());
        
        t1.start();
        t2.start();
    }
    
}
