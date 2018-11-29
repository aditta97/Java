
package encapsulation;

class ABC{
    private int x;
    
    public void Set_X(int p){
        x = p;
    }
    
    public int Get_X(){
        return x;
    }
}

public class Encapsulation {
    
    public static void main(String[] args) {
       ABC A = new ABC();
       A.Set_X(10);
        System.out.println(A.Get_X());
       //x = 10;
    }
    
}
