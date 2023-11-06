// // Sorting algorithms
// import java.util.*;
// public class sortingpq{
//     public static void bubblesort(int arr[]){
//         int n=arr.length;
//         for(int turn=0;turn<n-1;turn++){
//             for(int j=0;j<n-1-turn;j++){

//                // swapping the numbers
//                if(arr[j]>arr[j+1]){                                         // 73
//                 int temp=arr[j+1];
//                 arr[j+1]=arr[j];
//                 arr[j]=temp;
//                } 
//             }
//         }

//     }                           

//     public static void printArr(int arr[]){
//       for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//       }
//       System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
//         bubblesort(arr);
//         printArr(arr);
//     }
    
// }




// import java.util.*;
// public class sortingpq {
//     public static void selectionsort(int arr[]) {
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             int minPos = i;
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[minPos]) {
//                     minPos = j; // 74
//                 }
//             }

//             // swapping
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }

//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
//         selectionsort(arr);
//         printArr(arr);

//     }

// }





// import java.util.*;

// public class sortingpq {
//     public static void insertionsort(int arr[]) {
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             int curr = arr[i];
//             int prev = i - 1;
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             arr[prev + 1] = curr;
//         }
//     }

//     public static void printArr(int arr[]) { // 75
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
//         insertionsort(arr);
//         printArr(arr);

//     }

// }




// import java.util.*;
// public class sortingpq {
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
//         for (int i = 0; i < count.length; i++) {
//             while (count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--; // 76
//             }
//         }

//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
//         countingsort(arr);
//         printArr(arr);

//     }

// }












