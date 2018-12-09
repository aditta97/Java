
package task2;

class Tour{
    int money = 2000;
    void travel(int days){
        System.out.println("I am traveling for "+days+" days");
    }
}

class Budget extends Tour{
    int picture = 3000;
    void invest(){
        System.out.println("My budget is "+money+" taka");
    }
    
    Budget(){
         System.out.println("I took "+this.picture+" pictures");
    }
}

class encapsulation{
    private int swim;
    
    public void setSwim(int s){
        swim = s;
    }
    
    public int getSwim(){
        System.out.println("I swimed "+swim+" times");
        return swim;
    }
}

public class Task2 {

    public static void main(String[] args) {
        Tour t = new Tour();
        Budget b = new Budget();
        encapsulation e = new encapsulation();
        
        t.travel(4);
        b.invest();
        
        e.setSwim(100);
        e.getSwim();
    }
    
}
