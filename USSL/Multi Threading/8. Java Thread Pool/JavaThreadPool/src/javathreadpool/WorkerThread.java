
package javathreadpool;

/**
 *
 * @author adittachakraborty
 */
public class WorkerThread implements Runnable {
    
    private String message;
    
    public WorkerThread(String s){
        this.message = s;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) Message " + message);
        processmessage();    //call processmessage method that sleeps the thread for 2 seconds
        System.out.println(Thread.currentThread().getName() + "(End) Message");    //prints thread name
    }
    
    private void processmessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
