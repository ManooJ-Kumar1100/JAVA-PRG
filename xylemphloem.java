import java.util.Scanner;
public class xylemphloem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = s.nextInt();
        int ex1 = num%10;
        System.out.println("right corner number : "+ex1);
        int sum1 = 0;
        int sum2 = 0;
        num /= 10 ;
        while (num>9) {
            int rem = num%10;
            sum2 = sum2+rem;
            num/=10;
        }
        sum1 = ex1 + num;
        System.out.println("left corner number : "+num);
        System.out.println(sum1==sum2?"xylem":"phloem");
    }
}