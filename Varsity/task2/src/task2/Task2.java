
package task2;

import java.util.Scanner;

class Travel{
    int days(){
        Scanner travel = new Scanner(System.in);
        System.out.println("How long did you travel?");
        int days = travel.nextInt();
        return days;
    }
    void feel(){
        Scanner travel = new Scanner(System.in);
        System.out.println("What was your feelings: ");
        String feel = travel.nextLine();
    }
}

class Area extends Travel{
    Scanner area = new Scanner(System.in);
    float cost(){
        System.out.println("What was your tour budget?");
        float cost = area.nextFloat();
        return cost;
    }
    String location(){
        System.out.println("Where do you wanna go? (Cox's Bazar / Rangamati):");
        String location = area.nextLine();
        return location;
    }
}

class Coxsbazar extends Travel{
    Scanner cosxbazar = new Scanner(System.in);
    void vehicle(){
        System.out.println("Which vehicles you were used to go in Cox'sbazar?");
        String vehicle = cosxbazar.nextLine();
    }
    int swim(){
        System.out.println("How many times you swimed in Cox'bazar?");
        int swim = cosxbazar.nextInt();
        return swim;
    }
}

class Rangamati{
    Scanner rangamati = new Scanner(System.in);
    int picture(){
        System.out.println("How many pictures you captured?");
        int picture = rangamati.nextInt();
        return picture;
    }
    void boatRide(){
        System.out.println("How many times did you travel to the boat?");
        int boatRide = rangamati.nextInt();
    }
}

class travelType extends Travel{
    String type;
    String companion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whoom you want to travel? (family / friends / alone):");
        String companion = scanner.nextLine();
        return companion;
    }
}

class Family extends travelType{
    int member(){
        Scanner family = new Scanner(System.in);
        System.out.println("How many member in your family? ");
        int member = family.nextInt();
        return member;
    }
    void hotel(){
        Scanner family = new Scanner(System.in);
        System.out.println("Which hotel were you?");
        String hotel = family.nextLine();
    }
}

class Friends extends travelType{
    void adventure(){
        Scanner friends = new Scanner(System.in);
        System.out.println("How many times you adventured with your friends?");
        int adventure = friends.nextInt();
    }
}

class Alone extends travelType{
    Scanner alone = new Scanner(System.in);
    String reason(){
        System.out.println("Why you traveled alone?");
        String reason = alone.nextLine();
        return reason;
    }
    void experience(){
        System.out.println("What was your experience? (Out of 5 star)");
        int experience = alone.nextInt();
    }
}

public class Task2 {

    public static void main(String[] args) {
        
        //objects :
        Travel t = new Travel();
        Area ar = new Area();
        Coxsbazar c = new Coxsbazar();
        Rangamati r = new Rangamati();
        travelType tT = new travelType();
        Family fm = new Family();
        Friends fr = new Friends();
        Alone al = new Alone();
        
        //outputs :
        String location = ar.location();
    if(location.equals("Cox's Bazar")){
        c.vehicle();
        c.swim();
    }
    else if(location.equals("Rangamati")){
        r.picture();
        r.boatRide();
    }
        
    String com = tT.companion();
    switch(com){
        case "family":
            fm.member();
            fm.hotel();
            break;
                
        case "friends":
            fr.adventure();
            break;
                
        case "alone":
            al.reason();
            al.experience();
            break;
                
        default:
            System.out.println("Invalid Input");
            break;
    }
    
    t.days();
    ar.cost();
    t.feel();
    }
}