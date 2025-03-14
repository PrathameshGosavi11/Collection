import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linklisttest {
    
    public static void main(String[] args) {
        
        List<Integer> obj=new LinkedList<>();
        obj.add(12);
        obj.addFirst(10);
        obj.addLast(20);

        Iterator<Integer> iterator=obj.iterator();
        while (iterator.hasNext())
         {
            System.out.println(iterator.next());    
         }
    }
}
