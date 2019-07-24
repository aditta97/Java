
package shutdownhook1;

/**
 *
 * @author adittachakraborty
 */
public class ShutDownHook1 extends Thread {
    
    @Override
    public void run() {
        System.out.println("Shut down hook completed");
    }
    
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new ShutDownHook1());
        
        System.out.println("Now main sleeping... press ctrl + c to exit");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
}
