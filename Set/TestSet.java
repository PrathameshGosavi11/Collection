import java.util.HashSet;
import java.util.Set;

class TestSet {
    
    public static void main(String[] args) {
        
        Set<Integer> set=new HashSet<>();
        set.add(12);
        set.add(10);
        set.add(12);

        System.out.println(set);


    }
}
