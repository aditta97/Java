
package startathreadtwiceerror;

/**
 *
 * @author adittachakraborty
 */
public class StartAThreadTwiceError extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
    
    public static void main(String[] args) {
        StartAThreadTwiceError s= new StartAThreadTwiceError();
        s.start();
        s.start();
        
        //We can't call a thread twice (IllegalThreadStateException)
    }
    
}
