import java.util.Scanner;
public class welyesorno {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    char ch;
do
{
    System.out.println("Welcome");
    System.out.println("Do you want me to print again");
    System.out.println("type y for yes , type n for no" );
    ch=s.next().charAt(0);
}
while (ch=='y');
}
}
