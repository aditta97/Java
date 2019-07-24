package generics1;

class Test <T> {
    private T a;
    
    T getValue(){
        return a;
    }
    
    void setValue(T a){
        this.a = a;
    }
}

public class Generics1 {

    public static void main(String[] args) {
        Test t = new Test();
        t.setValue(40);
        System.out.println(t.getValue());
        t.setValue(40.456);
        System.out.println(t.getValue());
    }
    
}
