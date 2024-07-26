import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size:");
        int size=s.nextInt();
        int a[]=new int[size];
        int sum=0;
       // System.out.println("Enter Value");
        for (int i = 0; i < a.length ; i++)
        {
            
            System.out.println("Enter No:");
            int n=s.nextInt();
            sum=sum+n; 
           
        }
        System.out.println("Result:"+sum);
}
}