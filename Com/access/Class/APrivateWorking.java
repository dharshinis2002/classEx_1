package Com.access.Class;

public class APrivateWorking {
    public static void main(String[] args) {
        Exercise ex=new Exercise();
        System.out.println(ex.getName());
    }
}








 class Exercise{

     private String name="M";
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }


 }


