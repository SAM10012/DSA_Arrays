import java.util.Arrays;

public class Sort_0s_1s_2s_in_Array {

    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,0, 1, 2, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1,0,0,1};

        // ================ Way 1: Using sort method in Collections TC = O(nlogn) SC = O(1) ====================
//        Arrays.sort(arr);
//        for(int item : arr)
//        {
//            System.out.print(item + " ");
//        }

        // ==========================================================================================

        // ================ Way 2: Using frequency TC = O(n) SC = O(1) Multiple Pass ======================
//        int zeros = 0;
//        int ones = 0;
//        int twos = 0;
//
//        for (int i : arr) {
//            if (i == 0) {
//                zeros++;
//            }
//            if (i == 1) {
//                ones++;
//            }
//            if (i == 2) {
//                twos++;
//            }
//        }
//
//        int index = 0;
//
//        for(int i=0;i<zeros;i++) {
//            arr[index] = 0;
//            index = index + 1;
//        }
//
//        for(int i=0;i<ones;i++) {
//            arr[index] = 1;
//            index = index + 1;
//        }
//        for(int i=0;i<twos;i++) {
//            arr[index] = 2;
//            index = index + 1;
//        }
//
//        for (int item : arr) {
//            System.out.print(item + " ");
//        }

        // ==================================================================================

        // ================ Way 3: Dutch National Flag Solution TC = O(n) SC = O(1) Single Pass =====================

        int start = 0;
        int mid = 0;
        int end = arr.length - 1;

        while(mid <= end)
        {
            switch(arr[mid])
            {
                case 0:
                    swap(arr,start,mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,end);
                    end--;
                    break;
            }
        }

        for (int item : arr) {
            System.out.print(item + " ");
       }


    }
}
