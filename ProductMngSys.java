import java.util.ArrayList;
import java.util.List;

public class ProductMngSys {
    
    public static void main(String[] args) {
        
        List<String> product=new ArrayList<>();
        product.add("Laptop");
        product.add("TV");
        product.add("Mobile");
        product.add("friz");

        for( String res : product)
        {
            System.out.println("product in the cart"+res);
        }

        System.out.println("mujhe TV nhi pasand");
        product.remove("TV");
        
        for( String res : product)
        {
            System.out.println("product in the cart"+res);
        }

    }
}
