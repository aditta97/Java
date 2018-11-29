package lab4;
class Travel {
    int x = 9;
    void show() {
        System.out.println("travel");
    }
}
class Tourist extends Travel {
    int y = 11;
    void tour(int day) {
        System.out.println("tour for " +day+ " days");
    }
}
public class lab4 extends Travel { 
    String fun() {
        return "A lot of fun";
    }
    public static void main(String[] args) {
        
        //Objects :
        Travel t = new Travel();
        Tourist tr = new Tourist();
        lab4 A = new lab4();
        
        //Outputs :
        A.show();
        System.out.println(A.fun());
        tr.tour(tr.y);
        tr.show();
        System.out.println("Duration "+t.x);
        t.show();
    }
}