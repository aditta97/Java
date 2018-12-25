
package variable1;

public class Variable1 {
    
    static int a, b, c;     //class variable or static variable
    
    int x = 34, y, z;    //Instance variable
    
    void add(){
        int r;      //Local variable
    }
    
    int another(){
        int r;      //same local method using 2nd time without error
        return 0;
    }
    
    int test(int c){
        this.c = c;
        return 0;
    }

    public Variable1(int p) {        //Constractor (no return type)
        x = 43;     // Replacing the Instance variable value
        x = p;
    }
    
    public Variable1(int p, int q) {        //Constractor (no return type)
        x = p;
    }
    

    public static void main(String[] args) {
        Variable1 v = new Variable1(30);
        Variable1 v2 = new Variable1(30, 40);
        
        Variable1.a = 17;
        
        System.out.println(v.x);
        
    }
    
}
