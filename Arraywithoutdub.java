import java.util.Arrays;
public class Arraywithoutdub {
    public static void main(String[] args) {

                   String [] array = {"dharshini","mabi","madhu","asiha","madhu","dharshini","priya","tamil","kutty"};

                   System.out.println(Arrays.toString(array)+"");


                   for (int i = 0; i < array.length; i++) {
                       if(array[i]!=null){
                          for (int j = i+1 ; j < array.length; j++) {
                              if (array[i].equals(array[j])) {
                                  array[j] = null;
                              }

                          }
                              }  System.out.println("without dublicate array" + array[i]);
                              }
                          }
                      }

