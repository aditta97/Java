package array2dreverse;

class Array2D {

    void arrayreverse() {
        int a[][] = {{100, 200, 300}, {3, 2, 1}, {1, 2, 3}, {10, 20, 30}};

        for (int i = 0; i < a.length; i++) {
            int end = a[i].length - 1;

            for (int j = 0; j < a[i].length / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][end];
                a[i][end] = temp;
                end--;
            }
            
            System.out.println("");
        }

        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                System.out.print(a1[j] + " ");
            }
            
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(" ");

        int endOfAr = a.length - 1;

        for (int i = 0; i < a.length / 2; i++) {
            int[] temp = new int[3];
            temp = a[i];
            a[i] = a[endOfAr];
            a[endOfAr] = temp;
            endOfAr--;
        }

        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                System.out.print(a1[j] + " ");
            }
            
            System.out.println(" ");
        }
    }
}

public class Array2DReverse {

    public static void main(String[] args) {
        Array2D arr = new Array2D();

        arr.arrayreverse();
    }

}
