public class bookref {
    public static void main(String[] args) {
        bookref b1 = new bookref(); 
        bookref b2 = b1; //new bookref(); 
        bookref b3 = b1; //new bookref();
        System.out.println(b1+ ","+ b2+","+b3);
        System.out.println(b1==b2);
        System.out.println(b1==b3);
        System.out.println(b2==b3);
    }
}
