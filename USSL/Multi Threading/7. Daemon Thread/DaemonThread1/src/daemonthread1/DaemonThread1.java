package daemonthread1;

/**
 *
 * @author adittachakraborty
 */
public class DaemonThread1 extends Thread {

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread Work");
        } else {
            System.out.println("User Thread Work");
        }
    }

    public static void main(String[] args) {
        DaemonThread1 d1 = new DaemonThread1();
        DaemonThread1 d2 = new DaemonThread1();
        DaemonThread1 d3 = new DaemonThread1();

        d1.start();
        d2.start();
        d3.start();
    }

}
