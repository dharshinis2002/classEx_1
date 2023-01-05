import java.util.Scanner;

 public class Indexposition {
    public static  void  main(String[] args) {
        String s = "Jack and jill went up the hill came back in the evening";
        Scanner scanner = new Scanner(System.in);
        char[] a = s.toCharArray();
        System.out.println("enter");
        char character = scanner.next().charAt(0);


        for (int i = 0; i < s.length(); i++) {
            if (a[i] == character) {

                System.out.println(i);
            }
        }
    } }