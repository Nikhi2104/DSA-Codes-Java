// // Bubble sort
// import java.util.*;

// public class sorting {

//     public static void bubblesort(int arr[]) {
//         int n = arr.length;
//         for (int turn = 0; turn < n - 1; turn++) {     // i=turn
//             for (int j = 0; j < n - 1 - turn; j++) {

//                 // swapping the numbers
//                 if (arr[j] > arr[j + 1]) {   
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     // Bubble sort // 70
//     public static void printArr(int arr[]) {
//         // printing the sorted array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 5, 4, 1, 3, 2};
//         bubblesort(arr);
//         printArr(arr);
//     }

// }




// // Selection sort
// import java.util.*;
// public class sorting {
//     public static void selectionsort(int arr[]) {
//         int n = arr.length;
//         for (int i = 0; i < n - 1; i++) {
//             int minPos = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[minPos] > arr[j]) {
//                     minPos = j;
//                 }
//             }

//             // swapping the numbers
//             int temp = arr[minPos];
//             arr[minPos] = arr[i]; // arr[i]=current position
//             arr[i] = temp;
//         }
//     }

//     // selection sort // 71
//     public static void printArr(int arr[]) {
//         // printing the sorted array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 5, 4, 1, 3, 2 };
//         selectionsort(arr);
//         printArr(arr);
//     }
// }



// // Insertion sort
// import java.util.*;

// public class sorting {

//     public static void insertionsort(int arr[]) {
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             int curr = arr[i];
//             int prev = i - 1;
//             // finding out the correct position to insert
//             while (prev >= 0 && arr[prev] > curr) {       // We use while loop here
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             // insertion
//             arr[prev + 1] = curr;
//         }
//     }

//     // insertion sort // 72
//     public static void printArr(int arr[]) {
//         // printing the sorted array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 5, 4, 1, 3, 2 };
//         insertionsort(arr);
//         printArr(arr);

//     }

// }





// // Inbuilt sort
// import java.util.Arrays;
// import java.util.Collections;

// public class sorting {

//     public static void printArr(int arr[]) { // int for ascending and Integer for descending
//         // printing the sorted array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         // int arr[] = { 5, 4, 1, 3, 2 };
//         // // inbuilt sort function
//         // Arrays.sort(arr); // ascending order
//         // printArr(arr);

//         // Integer arr[]={5,4,1,3,2};
//         // Arrays.sort(arr,Collections.reverseOrder()); // descending order int is taken as Integer here
//         // printArr(arr);
//     }

// }




// // Counting sort
// import java.util.*;
// public class sorting {
//     public static void countingsort(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int[largest + 1];
//         for (int i = 0; i < arr.length; i++) {
//             count[arr[i]]++;
//         }

//         int j = 0;
//         for (int i = 0; i < count.length; i++) {    // doubt
//             while (count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }

//     }

//     // counting sort // 72
//     public static void printArr(int arr[]) {
//         // printing the sorted array
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
//         countingsort(arr);
//         printArr(arr);
//     }

// }






