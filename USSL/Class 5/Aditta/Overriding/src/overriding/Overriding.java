
package overriding;

public class Overriding {

    public static void main(String[] args) {
       First f = new First();
       Second s = new Second();
       Third t = new Third();
       
       f.show(10, 20);
       s.show(45.21f, 43.27f);
       t.show("String");
    }
    
}
