import java.util.Scanner;
public class BP {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("Enter ssbp:");
        int ssbp=c.nextInt();
        System.out.println("Enter dpbp:");
        int dpbp=c.nextInt();
        
    if(ssbp<90 || dpbp<60){
    System.out.println("Your Blood Pleasure is low,Please check the consultant");
    }
    else if(ssbp>=90 && dpbp<=120||ssbp>=60&&dpbp<=80){
        System.out.println("Your Blood Pleasure is Normal");
    }
    else if(ssbp>121 && dpbp<129||ssbp<90&&dpbp>60){
        System.out.println("Your Blood Pleasure is elevated please monitor");
        
    }
}
}
