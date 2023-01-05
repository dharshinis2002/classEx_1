
public class Primenum {
    public static void main(String[] args) {
//        System.out.println("prime number from 1 to 500");
        int count;
        System.out.println("prime number from 1 to 500");

           for (int i = 2; i <= 500; i++) {
               count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                    System.out.println(i);
                }
            }
                    }

                }
            }



