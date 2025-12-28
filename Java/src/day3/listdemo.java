package day3;

import java.util.ArrayList;
import java.util.List;

public class listdemo {
    public listdemo() {
    }

    public static void main(String[] var0) {
        List<String> var1 = new ArrayList<>();
        var1.add("vinu");
        var1.add("sai");
        
      
        System.out.println("all user");
        for(String v : var1){
            System.out.println(v);
            System.out.println(var1.get(0));
        }

    }
}
