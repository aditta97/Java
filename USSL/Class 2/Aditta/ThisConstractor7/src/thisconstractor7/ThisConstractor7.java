
package thisconstractor7;

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
        this(rollNo, name, course);     //reusing constractor
        this.fee = fee;
    }

    void display(){
        System.out.println(rollNo+" "+name+" "+course+" "+fee);
    }
}

public class ThisConstractor7 {

    public static void main(String[] args) {

        Student s1 = new Student(111, "Karan", "Java");
        Student s2 = new Student(222, "Ayan", "Python", 600f);

        s1.display();
        s2.display();
    }
    
}
