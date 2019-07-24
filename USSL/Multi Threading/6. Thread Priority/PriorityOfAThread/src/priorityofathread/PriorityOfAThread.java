package priorityofathread;

/**
 *
 * @author adittachakraborty
 */
public class PriorityOfAThread extends Thread {

    @Override
    public void run() {
        System.out.println("Running thread name is : " + Thread.currentThread().getName());
        System.out.println("Running thread priority is : " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        PriorityOfAThread p1 = new PriorityOfAThread();
        PriorityOfAThread p2 = new PriorityOfAThread();

        p1.setPriority(Thread.MIN_PRIORITY);
        p2.setPriority(Thread.MAX_PRIORITY);

        p1.start();
        p2.start();
    }

}
