public class Dividenum {
    public static void main(String[] args) {
        System.out.println("2,6,8 by divided num ");
        int num = 500;
        int i;
        for (i = 2; i <= 500; i++) {
            if (i % 2 == 0 && i % 6 == 0 && i % 8 == 0) {

                System.out.println(i);

            }


        }
    }
}