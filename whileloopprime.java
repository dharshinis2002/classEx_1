public class whileloopprime {
    public static void main(String[] args) {

        int primechknum;
        int n = 1;
        int count;

        while (n <= 500) {
            count = 0;
            primechknum = 2;


            while (primechknum <= n / 2) {
                if (n % primechknum == 0) {
                    count++;
                    break;
                }
                primechknum++;
             }
            if (count ==0 &&n!= 1) {
                System.out.println(n+"");
            }
            n++;
        }
    }
}