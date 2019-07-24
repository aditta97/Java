package joiningthread1;

/**
 *
 * @author adittachakraborty
 */
public class JoiningThread1 extends Thread {

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
        JoiningThread1 j1 = new JoiningThread1();
        JoiningThread1 j2 = new JoiningThread1();
        JoiningThread1 j3 = new JoiningThread1();

        j1.start();

        try {
            j1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        j2.start();
        j3.start();
    }

}

/**
 * The join() method waits for a thread to die. In other words, 
 * it causes the currently running threads to stop executing until the thread it joins with
 * completes its task.
 */
