import java.util.Arrays;

public class SwapTheRow {
    public static void main(String[] args) {
        int[][]a={{1,2,3,},{4,5,6},{7,8,9}};
        int i=0,k=2;

    for (int j = 0; j < a.length; j++) {
        int temp=a[i][j];
        a[i][j]=a[k][j];
        a[k][j]=temp;
    }
    System.out.println(Arrays.deepToString(a));
}
}
