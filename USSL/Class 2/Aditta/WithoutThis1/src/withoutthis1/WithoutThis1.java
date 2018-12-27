
package withoutthis1;

class Student{
    int rollNo;
    String name;
    float fee;

    public Student(int rollNo, String name, float fee) {
        rollNo = rollNo;
        name = name;
        fee = fee;
    }
    
    void display(){
        System.out.println(rollNo+" "+name+" "+fee);
    }
    
}

public class WithoutThis1 {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan", 478.3f);
        Student s2 = new Student(112, "Sumit", 455.2f);
        
        s1.display();
        s2.display();
    }
    
}
