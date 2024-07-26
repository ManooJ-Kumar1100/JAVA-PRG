import java.util.Scanner;
public class armstrong {
    public static int count(int n)
    {
        int count=0;
        while ( n > 0)
        {
            n/=10;
            count ++;
        }
        return count;
    }
    public static int power(int base , int expo)  
    {
    int power=1;
    for(int i = 1; i <= expo; i++) {
        power = power*base;
    }
    return power;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = s.nextInt();  //n variable
        int m=n;
        int rem=0; //rem variable
        int sum=0; //sum variable
        int expo=count(n);
    while (n>0)
    {
        rem=n%10;
        sum=sum+power(rem, expo);
        n/=10;
    }
    System.out.println(sum==m ? "Armstrong":"Not Armstrong");
    }
}
