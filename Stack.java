public class Stack {
    
    public static void main(String[] args) {
        

   //type casting
   //implict.
   double d=15.12;
   int a=10;
   d=a; //double is bigger than int
   System.out.println(d+ "after perform the casting");

   //explict
   a=(int ) d;
   System.out.println("after perform casting:"+a); //10 only 10 because overflow 

    
    }
}
