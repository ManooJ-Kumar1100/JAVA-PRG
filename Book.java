public class Book {
    String title;
    double price;







    public static void main(String[] args) {
    
    Book b1= new Book();
    Book b2 = new Book();
    Book b3 = new Book();
//book 1
    b1.title= "HARRY PORTOR";
    b1.price= 600;
//book 2
    b2.title = "JAVA";
    b2.price = 800;
//book 3
    b3.title = "PYTHON";
    b3.price = 950; 
//assign
System.out.println(b1.title);
System.out.println(b1.price);

System.out.println(b2.title);
System.out.println(b2.price);

System.out.println(b3.title);
System.out.println(b3.price);
}

}