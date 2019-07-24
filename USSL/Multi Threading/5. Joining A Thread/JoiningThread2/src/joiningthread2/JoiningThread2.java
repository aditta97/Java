
package joiningthread2;

/**
 *
 * @author adittachakraborty
 */
public class JoiningThread2 extends Thread {
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        JoiningThread2 j1 = new JoiningThread2();
        JoiningThread2 j2 = new JoiningThread2();
        JoiningThread2 j3 = new JoiningThread2();
        
        j1.start();
        
        try {
            j1.join(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        j2.start();
        j3.start();
    }
    
}
