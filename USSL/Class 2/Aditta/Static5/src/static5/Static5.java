
package static5;

class Calculate{
    static int cube(int x){
        return x*x*x;
    }
}

public class Static5 {

    public static void main(String[] args) {
        int result = Calculate.cube(5);
        System.out.println(result);
        
    }
    
}
