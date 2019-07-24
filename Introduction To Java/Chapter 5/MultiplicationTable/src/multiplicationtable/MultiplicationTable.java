
package multiplicationtable;

public class MultiplicationTable {
    int i, j, c;
    void i(){
        
        System.out.println("    ");
        for(j = 1; j <= 9; j ++){
            System.out.println("    "+j);
        }
        System.out.println("\n---------------------------------");
    }
    
    void lol(){
        for(j = 1; j <= 9; j++){
                c = i * j;
                System.out.println("%4d"+c);
    }
    
    void j(){
        for(i = 1; i <= 9; i++){
            System.out.println(i+" | ");
            lol();
            
            System.out.println();
        }
    }
    
    void display(){
        i();
        j();
        
    }

    public static void main(String[] args) {
        MultiplicationTable m = new MultiplicationTable();
        System.out.println("    Multiplication Table");
        
        m.display();
    }
    
}
