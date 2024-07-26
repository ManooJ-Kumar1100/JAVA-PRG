import java.util.Scanner;
public class power {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Base:");
        int base= s.nextInt();
        System.out.println("Enter a Exponent:");
        int exponent= s.nextInt();
        int power=1;

    for(int i=1 ; i <= exponent ; i++)
    power=power*base;
System.out.println("Power value of "+base+"  expo is "+power);
}
}

