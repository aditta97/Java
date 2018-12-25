
package static1;

class Student{
    int rollNo;
    String name;
    static String college = "ITS";

    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    
    void display(){
        System.out.println(rollNo+" "+name+" "+college);
    }
}

public class Static1 {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Ayan");
        
        s1.display();
        s2.display();
    }
    
}
