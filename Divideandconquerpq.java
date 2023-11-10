// import java.util.Arrays;

// public class Divideandconquerpq {
//     public static void mergeSort(String arr[], int si, int ei) {
//         if (si == ei) {
//             return;
//         }
//         int mid = si + (ei - si) / 2;

//         mergeSort(arr, si, mid);
//         mergeSort(arr, mid + 1, ei);

//         merge(arr, si, mid, ei);

//     }

//     public static void merge(String arr[], int si, int mid, int ei) { // merge sorting for array of strings
//         String temp[] = new String[ei - si + 1]; // 124
//         int i = si;
//         int j = mid + 1;
//         int k = 0;

//         while (i <= mid && j <= ei) {
//             if (arr[i].compareTo(arr[j]) < 0) {
//                 temp[k] = arr[i];
//                 i++;
//             } else {
//                 temp[k] = arr[j];
//                 j++;
//             }
//             k++;
//         }

//         while (i <= mid) {
//             temp[k] = arr[i];
//             i++;
//             k++;
//         }

//         while (j <= ei) {
//             temp[k] = arr[j];
//             j++;
//             k++;
//         }

//         for (k = 0; k < temp.length; k++) {
//             arr[si + k] = temp[k];
//         }

//     }

//     public static void main(String args[]) {
//         String arr[] = { "sun", "earth", "mars", "mercury" };
//         mergeSort(arr, 0, arr.length - 1);
//         System.out.println("arr= " + Arrays.toString(arr));
//     }

// }




// import java.util.Arrays;

// public class Divideandconquerpq {
//     public static int majorityElement(int arr[],int n) { // 1st approach
//         int majorityCount = n / 2;
//         for (int i = 0; i < n; i++) {
//             int count = 0;
//             for (int j = 0; j < n; j++) {
//                 if (arr[j] == arr[i]) {
//                     count++;
//                 }
//             }
//             if (count > majorityCount) { // majority element problem
//                 return arr[i]; // 125
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) { // TC=O(n2)
//         int arr[] = { 2, 2, 1, 1, 1, 2, 2 };
//         int n = arr.length;
//         System.out.println(majorityElement(arr,n));
//     }
// }




// import java.util.Arrays;

// public class Divideandconquerpq {

//     private static int countInRange(int arr[], int num, int si, int ei) {
//         int count = 0;
//         for (int i = si; i <= ei; i++) {
//             if (arr[i] == num) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     private static int majorityElementRec(int arr[], int si, int ei) { // 2nd approach
//         if (si == ei) {
//             return arr[si];
//         }

//         int mid = si + (ei - si) / 2;
//         int left = majorityElementRec(arr, si, mid);
//         int right = majorityElementRec(arr, mid + 1, ei); // majority element problem (optimised TC)
//                                                           // 125
//         if (left == right) {
//             return left;
//         }

//         int leftCount = countInRange(arr, left, si, ei);
//         int rightCount = countInRange(arr, right, si, ei);

//         return leftCount > rightCount ? left : right;
//     }

//     public static void main(String args[]) { // TC=O(nlogn)
//         int arr[] = { 2, 1, 3, 1, 1, 3, 4 };
//         System.out.println(majorityElementRec(arr, 0, arr.length - 1));

//     }
// }



// public class Divideandconquerpq {
//     public static int invCount(int arr[]) {
//         int inverCount = 0;
//         for (int i = 0; i < arr.length - 1; i++) { // inversion count problem
//             for (int j = i + 1; j < arr.length; j++) { // TC=O(n2)
//                 if (arr[i] > arr[j]) {
//                     inverCount++;
//                 }
//             }
//         }
//         return inverCount;

//     } // 126

//     public static void main(String args[]) {
//         int arr[] = { 2, 4, 1, 3, 5 };
//         System.out.println(invCount(arr));

//     }
// }






public class Divideandconquerpq {
    private static int mergeSort(int arr[], int si, int ei) {

        int invCount = 0;

        if (ei > si) {
            int mid = si + (ei - si) / 2;

            invCount = mergeSort(arr, si, mid);
            invCount += mergeSort(arr, mid + 1, ei);
            invCount += merge(arr, si, mid + 1, ei);

        }

        return invCount;
    }

    public static int merge(int arr[], int si, int mid, int ei) { // inversion count (optimized problem)
        int i = si, j = mid, k = 0; // TC=O(nlogn)
        int temp[] = new int[ei - si + 1];
        int invCount = 0;

        while (i < mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                invCount += (mid - i);
                j++;
                k++;
            }

        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }
        return invCount;
    }

    // 126

    public static void main(String args[]) {
        int arr[] = { 2, 4, 1, 3, 5 };
        System.out.println(mergeSort(arr, 0, arr.length - 1));

    }

}   




