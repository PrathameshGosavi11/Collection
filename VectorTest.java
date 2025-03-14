import java.util.Vector;

public class VectorTest {
    
    public static void main(String[] args) {
        
        Vector<String> obj=new Vector<>();
        obj.add("Roshani");
        obj.add("Prathamesh");
        obj.add("Kaveri");
        obj.add("Kanha");

        System.out.println(obj);

        System.out.println("capacity of the vector :"+obj.capacity());

        System.out.println("first element of the vector :"+obj.getFirst());
        System.out.println("last element of the vector :"+obj.getLast());
    }
}
