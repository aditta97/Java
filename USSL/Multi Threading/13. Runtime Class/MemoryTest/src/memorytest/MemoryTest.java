
package memorytest;

/**
 *
 * @author adittachakraborty
 */
public class MemoryTest {
    
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        
        System.out.println("Total Memory : " + r.totalMemory());
        System.out.println("Free Memory : " + r.freeMemory());
        
        for (int i = 0; i < 10000; i++){
            new MemoryTest();
        }
        
        System.out.println("After creating 10000 instance, free Memory : " + r.freeMemory());
        System.gc();
        System.out.println("After Garbage Collector, Free Memory : " + r.freeMemory());
    }
    
}
