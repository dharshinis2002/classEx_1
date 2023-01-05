import  java.util.Scanner;
public class CountintsString {
    public static void main(String[] args) {

        String s ="Jack and jill hent up the hill came back in the evening";
        Scanner scanner = new Scanner(System.in);
       char[] a=s.toCharArray();
        char character= scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == character) {
                count++;

                System.out.println(i);
            }

        }
    }

}