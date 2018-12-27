
package this2;

class Student{
    int rollNo;
    String name;
    float fee;

    public Student(int rollNo, String name, float fee) {
        this.rollNo = rollNo;
        this.name = name;
        this.fee = fee;
    }
    
    void display(){
        System.out.println(rollNo+" "+name+" "+fee);
    }
    
}

public class This2 {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan", 478.3f);
        Student s2 = new Student(112, "Sumit", 455.2f);
        
        s1.display();
        s2.display();
    }
    
}
