 class Parent
{
    public final void provideMobileByParent()
    {
        System.out.println("mobile are not provide:");
    }
}
class Child extends Parent // not extends because class is secure using final keyword.
{
    public void gotMobile()
    {
        System.out.println("mobile are provide by parent ");
    }
    public void provideMobileByParent() // not override 
    {
        System.out.println("mobile are not provide:");
    }
}

public class FinalClass {
    
    public static void main(String[] args) {
        
        Child child=new Child();
        child.provideMobileByParent();
        child.gotMobile();
    }
}
