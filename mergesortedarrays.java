import java.util.Arrays;

public class mergesortedarrays {

    private static void shiftArray(int[] arr, int position) {
        for (int i = arr.length-1; i > position; i--) {
            arr[i] = arr[i-1];
        }
    }

    private static void mergeSortedArrays(int[] nums1, int[] nums2, int nums1ValidElementSize) {
        int j = 0;
        if (nums1ValidElementSize + nums2.length != nums1.length) {
            System.out.println("Incompatible array sizes");
            return;
        }
        for (int i = 0; i < nums1.length;i++) {
            if (nums1[i] > nums2[j]) {
                shiftArray(nums1, i);
                nums1[i] = nums2[j];
                j++;
            }
            else if (nums1[i] == 0 && j < nums2.length) {
                nums1[i] = nums2[j];
                j++;
            }
        }
    }
    /*        int j = 0;
        for (int i = 0; i < nums1.length;i++) {
            if (nums1[i] > nums2[j]) {
                shiftArray(nums1, i);
                nums1[i] = nums2[j];
                j++;
            }
            else if (nums1[i] == 0 && j < nums2.length) {
                nums1[i] = nums2[j];
                j++;
            }
            
            System.out.println(Arrays.toString(nums1)+ ' '+ i + ' ' +  j );
        }
*/

    public static void main(String[] argv) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;

        System.out.println(Arrays.toString(nums1));
        mergeSortedArrays(nums1, nums2, m);        
        System.out.println(Arrays.toString(nums1));

        int[] nums3 = {1,2,3,0,0,0,0};
        m = 3;
        int[] nums4 = {2,5,6};
        n = 3;
        mergeSortedArrays(nums3, nums4, m);  

    }
    
}
