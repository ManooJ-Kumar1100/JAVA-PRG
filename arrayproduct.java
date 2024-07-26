import java.util.Scanner;
public class arrayproduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size:");
        int size=s.nextInt();
        int a[]=new int[size];
        int product=1;
        for (int i = 0; i < a.length ; i++)
        {
            
            System.out.println("Enter No:");
            int n=s.nextInt();
            product=product*n; 
           
        }
        System.out.println();
        System.out.println("Result:"+product);
}
}