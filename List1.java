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

         String   res=obj.remove(1);
         System.out.println(res);

         int size =obj.size();
         System.out.println("size of the list :"+size);

         Boolean isPresent= obj.contains("Pratham");
         System.out.println(isPresent);

         boolean res11= obj.isEmpty();
         System.out.println("list is empty or not =>"+res11);

         int res111=obj.indexOf("Pratham");
         System.out.println(res111);

          obj.clear();
          int result=obj.size();
          System.out.println(result);
        



      
    }
}
