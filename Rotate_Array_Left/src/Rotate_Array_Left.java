import java.util.*;

public class Rotate_Array_Left {

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        int  d = 3;


        // ================= Way 1: Rotate one by one TC = O(n*d) SC = O(1) ========================
//        for(int i=0;i<d;i++)
//        {
//            int first = arr[0];
//            for(int j=0;j<arr.length-1;j++)
//            {
//                arr[j] = arr[j+1];
//            }
//            arr[arr.length-1] = first;
//        }

        // =======================================================================================


        // ===================== Way 2: Using Temporary Array TC = O(n) SC = O(n) ===================================

//        int[] temp_array = new int[arr.length];
//        for(int i=0,j=d;i<arr.length - d;i++,j++)
//        {
//            temp_array[i] = arr[j];
//        }
//        for(int i=arr.length-d,j=0;i<arr.length;i++,j++)
//        {
//            temp_array[i] = arr[j];
//        }
//
//        for(int k=0;k<temp_array.length;k++)
//        {
//            arr[k] = temp_array[k];
//        }

        // ===========================================================================================================
        System.out.println();
        for(int item: arr)
        System.out.print(item + " ");



    }
}
