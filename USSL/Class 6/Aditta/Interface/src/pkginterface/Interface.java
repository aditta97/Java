
package pkginterface;

class B implements NewInterface{
    
    @Override
    public int fun(int y, int z){
        int x = y + z;
        System.out.println(x);
        return x;
    }
}

public class Interface {

    public static void main(String[] args) {
        B ob = new B();
        
        ob.fun(10, 20);
        
        ob.tt();
    }
    
}
