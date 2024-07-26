public class staticAdd {
    public static void demo()
    {
        System.out.println("from demo()");
        
    }
    public static void main(String[] args) {
        demo();
        staticAdd.demo();
    }
}
