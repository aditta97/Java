//2) Java Thread Example by implementing Runnable interface
package thread2;

/**
 *
 * @author adittachakraborty
 */
public class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {

        //Creating Object
        Thread2 t1 = new Thread2();

        //class Thread implements Runnable
        Thread t2 = new Thread(t1);

        //calling thread
        t2.start();
    }

}
