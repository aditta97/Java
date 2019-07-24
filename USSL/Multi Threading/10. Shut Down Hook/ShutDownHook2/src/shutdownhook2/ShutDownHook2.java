//Shutdown Hook by annonymous class:
package shutdownhook2;

/**
 *
 * @author adittachakraborty
 */
public class ShutDownHook2 extends Thread {

    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.out.println("shut down task completed..");
            }
        });
        System.out.println("Now main sleeping... press ctrl + c to exit");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}

/**
 * The shutdown hook can be used to perform cleanup resource or save the state 
 * when JVM shuts down normally or abruptly. Performing clean resource means closing log file, s
 * ending some alerts or something else. So if you want to execute some code before JVM shuts down, use shutdown hook.
 */