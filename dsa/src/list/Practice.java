package list;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Practice {
    public static void main(String[] args) {
    	 List<String> marvel
         = new CopyOnWriteArrayList<String>();

     marvel.add("IronMan");
     marvel.add("BlackWidow");
     marvel.add("Hulk");
     marvel.add("DoctorStrange");
     marvel.add("SpiderMan");

   
     for (int i = 0; i < marvel.size(); i++) {
         System.out.println("Avenger : "
                            + marvel.get(i));

        
         if (marvel.get(i).equals("BlackWidow")) {

             marvel.remove(i);
             i--;
                marvel.add("CaptianAmerica");
         }
     }

    
     System.out.println("Total Avengers : "
                        + marvel.size());
    }
}
