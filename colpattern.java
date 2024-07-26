import java.util.Scanner;
public class colpattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=s.nextInt();
             for (int i = 1; i <= n ; i++) {
             for (int j = 0; j <= n ; j++) {
            System.out.print(" * ");
        } 
        System.out.println();
        }
    }
}
