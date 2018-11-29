package lab5;
class rectangle{
    int lenth = 5, weight = 4, area, perimeter;
    rectangle(){
        System.out.println("React object created");
    }
    int react_area(){
        area = lenth*weight;
        return area;
    }
    int react_per(){
        perimeter = 2*(lenth+weight);
        return perimeter;
    }
}
class sq{
    int lenth = 5, area, perimeter;
    sq(){
        System.out.println("Sq object created");
    }
    int sq_area(){
        area = lenth*lenth;
        return area;
    }
    int sq_per(){
        perimeter = 2*(2*lenth);
        return perimeter;
    }
}
public class Lab5 {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        sq SQ = new sq();
      
        System.out.println("Area = "+r.react_area());
        System.out.println("Perimeter = "+r.react_per());
        System.out.println("Area = "+SQ.sq_area());
        System.out.println("Perimeter = "+SQ.sq_per());
    } 
}
