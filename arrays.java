
// import java.util.*;

// public class arrays {

//     public static void main(String args[]) {
//         int marks[] = new int[50];
//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt(); // phy
//         marks[1] = sc.nextInt(); // math
//         marks[2] = sc.nextInt(); // chem

//         System.out.println("Physics marks: " + marks[0]); // marks entry array problem // 53
//         System.out.println("Math marks: " + marks[1]);
//         System.out.println("Chem marks: " + marks[2]);

//         double percentage = (double) (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("percentage : " + percentage + " %");

//         System.out.println("size of the array: " + marks.length);

//     }

// }

// import java.util.*;

// public class arrays {

//     public static int linearsearch(int numbers[], int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String args[]) {
//         int numbers[] = { 1, 5, 4, 6, 10, 12, 50, 60, 75, 100 }; // array problem to find which index has the key
//                                                                  // element // 54
//         int key = 12;
//         int index = linearsearch(numbers, key);

//         if (index == -1) {
//             System.out.println("Key Not Found");
//         } else {
//             System.out.println("key found at: " + index);
//         }

//     }
// }

// import java.util.*;

// public class arrays {

//     public static int linearsearch(String names[], String key) {
//         for (int i = 0; i < names.length; i++) {
//             if (names[i] == key) {
//                 return i;
//             }
//         }
//         return -1;

//     } // array problem using linear search // 55

//     public static void main(String args[]) {
//         String names[] = { "mango", "dosa", "samosa", "cholebature", "coke", "friedrice" };
//         String key = "coke";

//         int index = linearsearch(names, key);

//         if (index == -1) {
//             System.out.println("Key Not Found");
//         } else {
//             System.out.println("key found at: " + index);
//         }

//     }
// }

// import java.util.*;

// public class arrays {

//     public static int largestnumber(int numbers[]) {
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for (int i = 0; i < numbers.length; i++) {
//             if (largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//             if (smallest > numbers[i]) {
//                 smallest = numbers[i];
//             }

//         }
//         System.out.println("smallest number is: " + smallest);
//         return largest;

//     } // array problem to find the largest number // 56

//     public static void main(String args[]) {
//         int numbers[] = { 1, 8, 4, 9, 12, 500, 60, 100 };
//         System.out.println("Largest number is: " + largestnumber(numbers));

//     }
// }

// import java.util.*;

// public class arrays {

//     public static int binarysearch(int numbers[], int key) {
//         int n = numbers.length;
//         int start = 0;
//         int end = n - 1; // you can put start=i and end=j

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (numbers[mid] == key) {
//                 return mid;
//             } else if (numbers[mid] > key) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }

//         return -1;
//     } // array problem to find index using binary search // 57

//     public static void main(String args[]) {
//         int numbers[] = { 2, 8, 4, 9, 12, 50, 60, 100 };
//         int key = 12;
//         System.out.println("index for key is: " + binarysearch(numbers, key));

//     }
// }

// import java.util.*;

// public class arrays {

//     public static void reverseArray(int numbers[]) {
//         int n = numbers.length;
//         int i = 0;
//         int j = n - 1;
//         while (i < j) {
//             int temp = numbers[j];
//             numbers[j] = numbers[i];
//             numbers[i] = temp;

//             i++;
//             j--;
//         }

//     } // reversing an array
//       // in cpp we have swap function to directly swap the numbers

//     public static void main(String args[]) { // 58
//         int numbers[] = { 10, 20, 30, 40, 50 };
//         reverseArray(numbers);

//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }

//     }
// }

// import java.util.*;

// public class arrays {

//     public static void printPairs(int num[]) {
//         int n = num.length;
//         int tp = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 System.out.print(" (" + num[i] + "," + num[j] + ")");
//                 tp++;
//             }
//             System.out.println();
//         }
//         System.out.println("total pairs are: " + tp);
//     } // print pairs of an array // 59

//     public static void main(String args[]) {
//         int num[] = { 1, 2, 3, 4, 5 };
//         printPairs(num);

//     }
// }

// import java.util.*;

// public class arrays {

//     public static void printsubArrays(int num[]) {
//         int n = num.length;
//         // int ts=0;

//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 for (int k = i; k <= j; k++) { // here we can directly write start=i and end=j in the loop // 60
//                     System.out.print(num[k] + " ");
//                 }
//                 System.out.println();
//                 // ts++;

//             }

//         }
//         // System.out.println("Total subarray = "+ts);

//     }
//     // print subarrays of an array

//     public static void main(String args[]) {
//         int num[] = { 1, 2, 3, 4 };
//         printsubArrays(num);

//     }
// }

// import java.util.*;

// public class arrays {

//     public static void getmaxsubArrays(int num[]) {
//         int n = num.length;
//         // int curr_sum;
//         int maxSum = Integer.MIN_VALUE;
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) {
//                 int curr_sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     curr_sum += num[k]; // subarray sum // 61
//                 }
//                 System.out.println(curr_sum);
//                 if (maxSum < curr_sum) {
//                     maxSum = curr_sum;
//                 }

//             }

//         }
//         System.out.println("Maximum sum of  all subarrays: " + maxSum);

//     } // print maxSum of a subarray

//     public static void main(String args[]) { // bruteforce approach O(n3)
//         int num[] = { 1, -2, 5, -4, 6 };
//         getmaxsubArrays(num);

//     }
// }

// import java.util.*;

// public class arrays {

//     public static void getmaxsubArrays(int num[]) {
//         int n = num.length;
//         int curr_sum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[n];
//         prefix[0] = num[0];
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + num[i];
//         }
//         for (int i = 0; i < n; i++) {
//             for (int j = i; j < n; j++) { // optimized approach O(n2) // prefix sum
//                 curr_sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1]; // here we are using ternary operator  // doubt
//                 if (maxSum < curr_sum) {
//                     maxSum = curr_sum;
//                 }
//                 System.out.println(curr_sum);

//             }

//         }
//         System.out.println("Maximum sum of  all subarrays: " + maxSum);

//     } // print maxSum of a subarray // 62

//     public static void main(String args[]) {
//         int num[] = { 1, -2, 5, -4, 6 };
//         getmaxsubArrays(num);

//     }
// }

// import java.util.*;

// public class arrays {

//     public static void kadanes(int num[]) {
//         int n = num.length;
//         int cs = 0;
//         int ms = Integer.MIN_VALUE;
//         int curr_sum = 0;
//         int max_sum = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {
//             curr_sum += num[i];
//             if (max_sum < curr_sum) { // if all the elements in the array are negative
//                 max_sum = curr_sum;
//             }
//             max_sum = Math.min(max_sum, 0);
//         }
//         System.out.println("Maximum sum of  all subarrays in case of all -ve numbers: " + max_sum);

//         for (int i = 0; i < n; i++) {
//             cs += num[i]; // most optimised approach using kadanes algorithm O(n)
//             if (cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }

//         System.out.println("Maximum sum of  all subarrays: " + ms);

//     } // print maxSum of a subarray // 63

//     public static void main(String args[]) {
//         int num[] = { 1, -2, 5, -4, 6 };
//         kadanes(num);

//     }
// }




// import java.util.*;

// public class arrays {

//     public static int trappedwater(int height[]) {
//         int n = height.length;

//         // calculate leftmax

//         int leftmax[] = new int[n]; // auxillary array created
//         leftmax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftmax[i] = Math.max(height[i], leftmax[i - 1]);
//         }

//         // calculate rightmax

//         int rightmax[] = new int[n]; // auxillary array created
//         rightmax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 1; i--) {
//             rightmax[i] = Math.max(height[i], rightmax[i + 1]);
//         }

//         int trappedwater = 0;
//         for (int i = 0; i < n; i++) { // TC=O(n) // 64

//             int waterlevel = Math.min(leftmax[i], rightmax[i]); // waterlevel calculation

//             trappedwater += waterlevel - height[i]; // trappedwater calculation

//         }

//         return trappedwater;
//     } // Trapping rainwater problem (important problem**)

//     public static void main(String args[]) {
//         int height[] = {4, 2, 0, 6, 3, 2, 5 };
//         System.out.println(trappedwater(height));

//     }
// }



// import java.util.*;

// public class arrays {

//     public static int buyandsellstocks(int prices[]) {
//         int n = prices.length;
//         int buyprice = Integer.MAX_VALUE;
//         int max_profit = 0;

//         for (int i = 0; i < n; i++) {
//             if (buyprice < prices[i]) {
//                 int profit = prices[i] - buyprice; // today's profit
//                 max_profit = Math.max(max_profit, profit); // total profit
//             } else {
//                 buyprice = prices[i];
//             }
//         }
//         return max_profit;

//     } // buyandsell stocks problem TC=O(n) // 65

//     public static void main(String args[]) {
//         int prices[] = { 2, 5, 1, 7, 8, 6, 10 };
//         System.out.println(buyandsellstocks(prices));

//     }
// }


