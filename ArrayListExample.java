import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ArrayListExample
{
    public static void main(String[] args) {
        
        List num=new ArrayList();
        //here cretea base class refernece becauce class are loosly coupled.      
        num.add(12);
        num.add(14);
        num.add(45);

        // for (Object a : num) {

        //     System.out.println(a);
        // }
        System.out.println(num);

        //System.out.println(num.remove(14));

       // System.out.println(num.remove(1));
        System.out.println(num.get(1));

        num.addFirst(15);
        num.add(67);
        System.out.println(num);

        List list2=new ArrayList<>(num);
        list2.add(58);
        System.out.println(list2);

    //    boolean res= num.removeAll(list2);
    //     System.out.println(res);

       List ref= num.subList(0, 2); //15 12
        System.out.println(ref);

        int index=num.indexOf(15);
        System.out.println("Index is:"+index); //0



    }
}