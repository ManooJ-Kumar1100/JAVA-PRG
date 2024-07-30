import java.util.Scanner;
public class ForLcm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=s.nextInt();
        System.out.println("Enter b:");
        int b=s.nextInt();
        //inside n storing larger number
        int n=a>b?a:b;
        int i=n;
        while (true) {
            if(n%a==0&&n%b==0){
            break;}
            n=n+i;
        }
        System.out.println("Lcm of a and b is " + n);
    }
}
