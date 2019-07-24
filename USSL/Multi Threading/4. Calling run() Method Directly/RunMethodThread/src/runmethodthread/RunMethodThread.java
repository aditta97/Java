
package runmethodthread;

/**
 *
 * @author adittachakraborty
 */
public class RunMethodThread extends Thread {
    
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        RunMethodThread r1 = new RunMethodThread();
        RunMethodThread r2 = new RunMethodThread();
        
        //calling Run() method direct without using Start() method
        r1.run();
        r2.run();
    }
    
}
