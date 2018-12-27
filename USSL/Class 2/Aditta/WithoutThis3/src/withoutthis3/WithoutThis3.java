
package withoutthis3;

class Student{
    int rollNo;
    String name;
    float fee;

    public Student(int r, String n, float f) {
        rollNo = r;
        name = n;
        fee = f;
    }
    
    void display(){
        System.out.println(rollNo+" "+name+" "+fee);
    }
    
}

public class WithoutThis3 {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan", 463.2f);
        Student s2 = new Student(222, "Ayan", 754.2f);
        
        s1.display();
        s2.display();
    }
    
}
