//1) Java Thread Example by extending Thread class
package thread1;

/**
 *
 * @author adittachakraborty
 */
public class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }

}
