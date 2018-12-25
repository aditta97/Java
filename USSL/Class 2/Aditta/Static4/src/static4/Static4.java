
package static4;

class Student{
    int rollNo;
    String name;
    static String college = "ITS";  //static variable
    
    static void change(){   //static method for static variable
        college = "BBDIT";
    }

    public Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    
    void display(){
        System.out.println(rollNo+" "+" "+name+" "+college);
    }
    
    
}

public class Static4 {

    public static void main(String[] args) {
        Student.change();
        
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Ayan");
        Student s3 = new Student(333, "Asha");
        
        s1.display();
        s2.display();
        s3.display();
        
    }
    
}
