package day4;

import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    

    public static void main(String[] args) {
        
        Map<Integer, String> userMap=new HashMap<>();
  userMap.put(1,"alice");
  userMap.put(2,"bob");
  userMap.put(3,"charlie");

  System.out.println("user with id 2"+userMap.get(2));
        
    }
    
}
