
package capacitymethod;

/**
 *
 * @author adittachakraborty
 */
public class CapacityMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());  //default 16
        
        sb.append("Hello");
        System.out.println(sb.capacity());  //now 16
        
        sb.append("Java is my favourite laguage");
        System.out.println(sb.capacity());  //now (16*2)+2=34 i.e (oldcapacity*2)+2  
    }
    
}
