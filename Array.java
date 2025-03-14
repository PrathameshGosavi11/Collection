import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    
    public static void main(String[] args) {
        
        String[] arr={"Pratham","vikas","rushi"};

        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(arr));



        arrayList.add("om");

        for(String s : arrayList)
        {
            System.out.println(s);

        }

    }
}
