import java.util.Scanner;

public class Positionprime {
    public static void main(String[] args) {
        //                Scanner s = new Scanner(System.in);
        // System.out.println("enter the primenum");
        //   int primenum = s.nextInt();
        int position = 7;
        int primenum = 17;

        int[] array = {1,2, 3, 5, 7, 11, 13, 17, 19};

        for (int i = 0; i < array.length; i++) {
            if (primenum == array[i]) {
                if (position == i) {
                    System.out.println("true");
                } else {
                    System.out.println("false");

                }
            }
        }

    }
}