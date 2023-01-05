import java.util.Scanner;

public class CalcyyEx {
    public static void main(String[] args) {
        int a;
        int b;
        char Operator;
        Scanner name = new Scanner(System.in);

        System.out.println("enter the first num");
        a = name.nextInt();

        System.out.println("enter the second num");
        b = name.nextInt();

        System.out.println("enter the operators from '+','-','*','/','%':");
        Operator = name.next().charAt(0);

        if (Operator == '+') {
            System.out.println("addition is:" + add(a, b));

        } else if (Operator == '-') {
            System.out.println("subtraction is :" + sub(a, b));
        } else if (Operator == '*') {
            System.out.println("mul is" + mul(a, b));
        } else if (Operator == '/') {
            System.out.println("division is:" + div(a, b));
        } else if (Operator == '%') {
            System.out.println("modulus is:" + modulus(a, b));

        } else {
            System.out.println("invalid Operators");
        }
    }

    static int add(int x, int y) {
        int z = x + y;
        return z;
    }

    static int sub(int x, int y) {
        int z = x - y;
        return z;

    }

    static int mul(int x, int y) {
        int z = x * y;
        return z;

    }

    static int div(int x, int y) {
        int z = x / y;
        return z;

    }

    static int modulus(int x, int y) {
        int z = x % y;
        return z;
    }
}
