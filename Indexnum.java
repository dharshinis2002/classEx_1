public class Indexnum {
    public static void main(String[] args) {
        int[]numbers={1,8,4,2,7,9,6,3,7};
        int l= numbers.length;
        System.out.println("integer array length is:"+l);
        int i=0;
        for (i=0;i<numbers.length;i++){
            if( numbers[i]==7){
                System.out.println("index position of duplicate:"+i);
            }
        }
    }
}
