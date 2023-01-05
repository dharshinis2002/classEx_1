import java.util.Arrays;

public class OccurenceandIndexes {
    public static void main(String[] args) {
        int n=10;
        int element =9;
        int array []   = {1,2,7,6,5,9,9,2,6,9};

int c=0;
for (int i=0;i<n;i++) {
    if (element == array[i]) {
        c++;
    }
}
    System.out.println(element + "occured" + c + "times");

}}


