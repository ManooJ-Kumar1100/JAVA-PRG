import java.util.Arrays;

class transpose{
    public static void main(String[] args) {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};

         for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[i].length; j++) {
                
            if (i!=j) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                }
            }
         }
    System.out.println(Arrays.deepToString(arr));
    }
}