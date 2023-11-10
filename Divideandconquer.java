// public class Divideandconquer {
//   public static void mergeSort(int arr[], int si, int ei) {
//     if (si >= ei) {
//       return;
//     }
//     int mid = si + (ei - si) / 2;

//     mergeSort(arr, si, mid);
//     mergeSort(arr, mid + 1, ei);

//     merge(arr, si, mid, ei);

//   }

//   // merge method to merge the sorted parts
//   public static void merge(int arr[], int si, int mid, int ei) { // Merge sorting // 121
//     int temp[] = new int[ei - si + 1];
//     int i = si; // index for 1st part
//     int j = mid + 1; // index for 2nd part
//     int k = 0; // index for temp

//     while (i <= mid && j <= ei) {
//       if (arr[i] < arr[j]) {
//         temp[k] = arr[i];
//         i++;
//       } else {
//         temp[k] = arr[j];
//         j++;
//       }
//       k++;
//     }

//     // for leftover elements of 1st sorted part
//     while (i <= mid) {
//       temp[k++] = arr[i++];
//     }

//     // for leftover elements of 2nd sorted part
//     while (j <= ei) {
//       temp[k++] = arr[j++];
//     }

//     for (k = 0, i = si; k < temp.length; i++, k++) {
//       arr[i] = temp[k];
//     }
//   }

//   public static void printArr(int arr[]) {
//     for (int i = 0; i < arr.length; i++) {
//       System.out.print(arr[i] + " ");
//     }
//     System.out.println();
//   }

//   public static void main(String args[]) {
//     int arr[] = { 6, 3, 9, 5, 2, -4, 8 };
//     mergeSort(arr, 0, arr.length - 1);
//     printArr(arr);
//   }

// }






// public class Divideandconquer {
//   public static void quickSort(int arr[], int si, int ei) { // quick sort
//     if (si >= ei) {
//       return;
//     }
//     int pIdx = partition(arr, si, ei); // last element
//     quickSort(arr, si, pIdx - 1); // left
//     quickSort(arr, pIdx + 1, ei); // right

//   }

//   public static int partition(int arr[], int si, int ei) {
//     int pivot = arr[ei]; // assigning pivot=last element
//     int i = si - 1; // i=-1 (to make place for elements smaller than pivot)

//     for (int j = si; j < ei; j++) { // 122
//       if (arr[j] <= pivot) {
//         i++;
//         // swap
//         int temp = arr[j];
//         arr[j] = arr[i];
//         arr[i] = temp;
//       }
//     }

//     i++;
//     int temp = pivot;
//     arr[ei] = arr[i];
//     arr[i] = temp;
//     return i;
//   }

//   public static void printArr(int arr[]) {
//     for (int i = 0; i < arr.length; i++) {
//       System.out.print(arr[i] + " ");
//     }
//     System.out.println();
//   }

//   public static void main(String args[]) {
//     int arr[] = { 6, 3, 9, 8, 2, 5 };
//     quickSort(arr, 0, arr.length - 1);
//     printArr(arr);
//   }

// }



// public class Divideandconquer {

//   public static int search(int arr[], int tar, int si, int ei) {
//     if (si > ei) {
//       return -1;
//     }
//     int mid = si + (ei - si) / 2;

//     if (arr[mid] == tar) { // if target is found
//       return mid;
//     }

//     // mid on L1;
//     if (arr[si] <= arr[mid]) {
//       // case a:left
//       if (arr[si] <= tar && tar <= arr[mid]) {
//         return search(arr, tar, si, mid - 1); // search in rotated array // 123
//       }
//       // case b:right
//       else {
//         return search(arr, tar, mid + 1, ei);
//       }
//     }

//     // mid on L2
//     else {
//       // case c:right
//       if (arr[mid] <= tar && tar <= arr[ei]) {
//         return search(arr, tar, mid + 1, ei);
//       }
//       // case d:left
//       else {
//         return search(arr, tar, si, mid - 1);
//       }
//     }

//   }

//   public static void main(String args[]) {
//     int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
//     int target = 7;
//     int tarIdx = search(arr, target, 0, arr.length - 1);
//     System.out.println(tarIdx);

//   }

// }



