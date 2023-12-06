import java.util.ArrayList;
import java.util.Collections;   

public class GymLocation {
   public static void main(String a[]){
      ArrayList<Gym> gyms = new ArrayList<Gym>();
               
              //name, distance, budget, quality
      gyms.add(new Gym("Rimar",2.5, 600, 4.3));
      gyms.add(new Gym("Chad",2.1, 550, 4.5));
      gyms.add(new Gym("Eldrin",1.5, 200, 4.6));
      gyms.add(new Gym("Franz",2.4, 535, 3.9));
      
      //System.out.print(gyms.size());
      
      //Collections.sort(gyms);  // Sort myNumbers
   
      for (Gym gym : gyms) {
        System.out.println(gym);
        gym.gymInfo();
      }
   
   }

}