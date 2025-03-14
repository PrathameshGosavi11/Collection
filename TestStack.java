import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        
        Stack obj=new Stack();
        obj.push(14);
        obj.push("pratham");
        obj.push(23);
        obj.push("roshani");
        obj.push(31);
        obj.push("wedding"); //last me add first me gaya 

        System.out.println("current element:"+obj.peek()); //wedding.

        System.out.println("remove the element:"+obj.addFirst("Kanha "));

        
    }
}
