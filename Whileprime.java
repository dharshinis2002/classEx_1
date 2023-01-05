public class Whileprime {
    public static void main(String[] args) {
        int num = 1;
        int position = 13;
        int count = 0;
       int i;
        while (count < position){
            num = num + 1;
             for (i = 2; i <num; i++) {
                if (num % i == 0) {
                    break;
                }
             } if(i ==num) {
                    count = count + 1;

                    }
                }
        System.out.println(num);

            }

}


