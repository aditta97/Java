
package arraylist5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author adittachakraborty
 */

class Student{
    int rollno;
    String name;
    int age;
    
    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

public class ArrayList5 {

    public static void main(String[] args) {
        //Creating user-defined class objects
        Student s1 = new Student(101, "Aditta", 403);
        Student s2 = new Student(102, "Peter", 404);
        Student s3 = new Student(103, "John", 405);
        
        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        
        //getting iterator
        Iterator itr = al.iterator();
        
        //traversing elements of ArrayList object
        while(itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " " + st.name + " " + st.age + " ");
        }
    }
    
}
