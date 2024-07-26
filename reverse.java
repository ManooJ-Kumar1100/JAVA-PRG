import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=s.nextInt();
        int rev=0;
    while ( num!=0 ) 
{
    int rem = num%10;
    rev=(rev*10)+rem;
    num/=10;
}
    System.out.println(rev);
    }
}
