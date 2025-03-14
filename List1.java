import java.util.ArrayList;
import java.util.List;

public class List1 {
    
    public static void main(String[] args) {
        
        List<String> obj=new ArrayList<>();
        obj.add("Pratham");
        obj.add("Ypgesh");
        obj.add("isha");
        obj.add("Deepak");

        obj.add(1, "siraj");

        //modify the value
        System.out.println("element of the 1st position:"+obj.get(1));

        obj.set(1, "h Rana");

        System.out.println("player update here :"+obj.get(1));
      
    }
}
