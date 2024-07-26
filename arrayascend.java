public class arrayascend {
    public static void main(String[] args) {
        
    int[] a = {0,1,0,1,1,1,2,2,1,3,0};
    int temp=0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            } 
        }
        for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
        }
    }
}
