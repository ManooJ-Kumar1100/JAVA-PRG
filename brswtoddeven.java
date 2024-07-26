import java.util.Scanner;
public class brswtoddeven {
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter a Number:");
        int num = s.nextInt();
        {
            switch (Math.abs(num%2)) {
                case 0:
                    System.out.println(num + " is even");
                    break;
                case 1 :
                    System.out.println(num + " is odd");


            }
        }    
    }
}
