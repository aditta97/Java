
package thisconstractor8;

class Student{
    int rollNo;
    String name, course;
    float fee;
    
    Student(int rollNo, String name, String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }
    
    Student(int rollNo, String name, String course, float fee){
        //this.fee = fee;
        this(rollNo, name, course);
        this.fee = fee;
    }
    
    void display(){
        System.out.println(rollNo+" "+name+" "+course+" "+fee);
    }
}

public class ThisConstractor8 {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Ärjun", "Java");
        Student s2 = new Student(222, "Ayan", "Python", 6000f);
        
        s1.display();
        s2.display();
    }
    
}
