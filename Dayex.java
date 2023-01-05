import java.util.Calendar;
import java.util.Scanner;

public class Dayex {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the value");
        int x=in.nextInt();
        int y = x % 7;
        switch (y) {
            case 1:
                System.out.println("monday");
       break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 0:
                System.out.println("sunday");
                break;

        }
    }
}