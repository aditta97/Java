
package thecurrentthread;

/**
 *
 * @author adittachakraborty
 */
public class TheCurrentThread extends Thread {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
    }
    
    public static void main(String[] args) {
        TheCurrentThread t1 = new TheCurrentThread();
        TheCurrentThread t2 = new TheCurrentThread();
        
        t1.start();
        t2.start();
    }
    
}
