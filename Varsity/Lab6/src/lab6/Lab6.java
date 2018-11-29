
package lab6;
import java.util.Scanner;

class Vehicle{
    int idVehicle = 432;
    void Manufacture (){
        Scanner manu = new Scanner(System.in);
            System.out.println("Select your car by enter Number: (1. Prado, 2. BMW)");
            int Manufacture = manu.nextInt();
     
        switch(Manufacture){
            case 1:
                System.out.println("Your selected car is Prado");
            break;
            
            case 2:
                System.out.println("Your selected car is BMW");
            break;
                
            default:
                System.out.println("Invalid Input");
            break;
        }
    }
}

class TransportationVehicle extends Vehicle{
    int loadCapacity = 20;
}

class Truck extends TransportationVehicle{
    int noOfContainers = 5;
}

class PassangerVehicle extends Vehicle{
    int noOfPassanger = 4;
}

class Car extends PassangerVehicle{
    int noOfDoors = 5;
}

class Bike extends PassangerVehicle{
    int saddleHeight = 100;
}


public class Lab6 {
    
    public static void main(String[] args) {
        
        //Objects :
        Vehicle v = new Vehicle();
        TransportationVehicle tv = new TransportationVehicle();
        Truck tk = new Truck();
        PassangerVehicle pv = new PassangerVehicle();
        Car c = new Car();
        Bike b = new Bike();
        
        //outputs :
        System.out.println("ID number is: "+v.idVehicle);
        v.Manufacture();
        System.out.println("It can load: "+tv.loadCapacity);
        System.out.println("Number of Containers: "+tk.noOfContainers+" tones");
        System.out.println("Number of passanger: "+pv.noOfPassanger);
        System.out.println("Number of doors: "+c.noOfDoors);
        System.out.println("Saddle Hight is "+b.saddleHeight+" inches");
    }
    
}
