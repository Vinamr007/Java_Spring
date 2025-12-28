import java.util.List;
import java.util.ArrayList;


// class car{
//     String Brand;

//     car(String Brand){
//         this.Brand=Brand;

//     }

// }


public class listdemoo{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        System.out.println("Names in the list:");
        for(String name : names){
            System.out.println(name);
        }
    System.out.println(names.get(0));
   
    // for brand 
    Car c=new Car("toyota");
    Car c2=new Car("ford");


   List<Car> ca=new ArrayList<>();
    
    ca.add(c);
    ca.add(c2);
    for(Car car : ca){
        System.out.println(car.Brand);
    }
      }
}
class Car{
    String Brand;

    Car(String Brand){
        this.Brand=Brand;

    }

}
