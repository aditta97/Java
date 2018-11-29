
package task1;

class Travel{
    int D = 15;
    void feel(int days){
        System.out.println("My 1st travel ways about "+days+" days");
    }
}

class Area extends Travel{
    float cost = (float) 20000.57;
    String location(){
        return "My first tour in Cox'bazar & then Rangamati";
    }
}

class Coxsbazar extends Area{
        int swim = 25;
        void vehicle(){
            System.out.println("I go Cox'bazar by bus");
        }
}

class Rangamati{
    int picture = 3700;
    void Boat_ride(){
        System.out.println("Beside swiming I rided in boat also");
    }
}

public class Task1 {

    
    public static void main(String[] args) {
        
        //Objects:
        Travel t = new Travel();
        Area a = new Area();
        Coxsbazar c = new Coxsbazar();
        Rangamati r = new Rangamati();
        
        //Outputs :
        System.out.println("This is my 1st travel");
        t.feel(t.D);
        System.out.println("Travel cost was about "+a.cost+" taka");
        System.out.println(a.location());
        System.out.println("I swimed in sea beach upto "+c.swim+" times");
        c.vehicle();
        System.out.println("I took pictures upto "+r.picture+" in Cox'bazar");
        r.Boat_ride();
    }
    
}
