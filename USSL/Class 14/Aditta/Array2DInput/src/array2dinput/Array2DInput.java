package array2dinput;

import java.util.Scanner;

class Array {

    void array() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter column number: ");
        int column = input.nextInt();
        System.out.println("Enter rows: ");
        int row = input.nextInt();

        int twoD[][] = new int[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                twoD[i][j] = input.nextInt();
            }
        }

        //System.out.println(twoD.length+" \n"+twoD[0].length);
        for (int i = 0; i < twoD.length; i++) {
            int end = twoD[i].length - 1;
            for (int j = 0; i < twoD[i].length / 2; j++) {
                System.out.println(i + " " + j);
                int temp = twoD[i][j];
                twoD[i][j] = twoD[i][end];
                twoD[i][end] = temp;

                end--;
                System.out.println(twoD[column][row] + " \n");
            }
            System.out.println(" ");
        }
        for (int[] twoD1 : twoD) {
            for (int j = 0; j < twoD1.length; j++) {
                System.out.println(twoD[column][row] + " ");
            }
            System.out.println(" ");
        }
    }
}

public class Array2DInput {

    public static void main(String[] args) {
        Array arr = new Array();

        arr.array();
    }

}
