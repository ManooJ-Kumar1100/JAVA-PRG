import java.util.Scanner;

public class ifstmt
 {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = s.nextInt();
        System.out.println("Welcome");
        if (age>=18)
            System.out.println("You are Eligible");
        System.out.println("Thank you");
    }
}