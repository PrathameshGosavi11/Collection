 class FinalVariable {
    
    public static void main(String[] args) {
        final int data=10;

        System.out.println("value is:"+data); //10

        data=20; // modify the value
        System.out.println("change the value:"+data); //20

        data++;
        System.out.println("after change the value:"+data); //21

    }
    
}
