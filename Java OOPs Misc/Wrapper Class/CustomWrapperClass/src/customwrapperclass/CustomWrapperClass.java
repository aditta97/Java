package customwrapperclass;

/**
 *
 * @author adittachakraborty
 */
public class CustomWrapperClass {
    
    private int i;

    public CustomWrapperClass() {
        
    }

    public CustomWrapperClass(int i) {
        this.i = i;
    }
    
    public int getValue() {
        return i;
    }
    
    public void setValue(int i) {
        this.i = i;
    }
    
    @Override
    public String toString() {
        return Integer.toString(i);
    }
    
    public static void main(String[] args) {
        CustomWrapperClass cwc = new CustomWrapperClass(10);
        
        System.out.println(cwc);
    }
    
}
