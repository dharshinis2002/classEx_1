public class ArrayEx {
    public static void main(String[] args) {
        String[] names={"Keerthana","mabi","dharshini","varshini"};
        int i;
        int n= names.length;
        for(i=0;i<names.length;i++){
        char lastchar=names[i].charAt(names[i].length()-1);
        if(lastchar =='i'){
                System.out.println("last char:"+names[i]);
            }


        }



    }
}
