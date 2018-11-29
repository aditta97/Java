package compute.area.with.constant;

import java.util.Scanner;

public class ComputeAreaWithConstant {

    public static void main(String[] args) {
        final double PI = 3.1426;

        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("The are for the circle of radius " + radius + " is " + area);
    }

}
