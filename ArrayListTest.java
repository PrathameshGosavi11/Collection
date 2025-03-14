import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        
        List<Integer>  list=new ArrayList<>();
        list.add(12);
        list.add(14);
        list.add(16);

        for(int  i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        for(Integer i: list)
        {
            System.out.println("Iterate using enhaced loop ==> "+i);
        }
        
    }
}
