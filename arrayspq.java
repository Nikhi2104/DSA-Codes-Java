
// import java.util.*;

// public class arrayspq {

//   public static boolean repeat(int nums[]) {

//     for (int i = 0; i < nums.length; i++) {
//       for (int j = i + 1; j < nums.length; j++)
//         if (nums[j] == nums[i]) {
//           return true;
//         } // duplicate elements problem // 66
//     }
//     return false;
//   }

//   public static void main(String args[]) {
//     int nums[] = { 1, 2, 3, 1, 5 };
//     System.out.println(repeat(nums));
//   }
// }



// import java.util.*;

// public class arrayspq {

//   public static int findtarget(int nums[], int target) {
//     for (int i = 0; i < nums.length; i++) {
//       if (target == nums[i]) {
//         return i;
//       }
//     }
//     return -1;
//   }

//   // return index of target problem // 67
//   public static void main(String args[]) {
//     int nums[] = { 4, 5, 6, 0, 1, 2, };
//     int target = 6;
//     System.out.println(findtarget(nums, target));

//   }
// }



// import java.util.*;

// public class arrayspq {

//   public static int buyandsellstocks(int prices[]) {
//     int n = prices.length;
//     int buyprice = Integer.MAX_VALUE;
//     int max_profit = 0;

//     for (int i = 0; i < n; i++) {
//       if (buyprice < prices[i]) {
//         int profit = prices[i] - buyprice; // today's profit
//         max_profit = Math.max(max_profit, profit); // total profit
//       } else {
//         buyprice = prices[i];
//       }
//     }
//     return max_profit;

//   } // buyandsell stocks problem TC=O(n) // equal to 65

//   public static void main(String args[]) {
//     int prices[] = { 7, 2, 5, 6, 8, 9, 10 };
//     System.out.println(buyandsellstocks(prices));

//   }
// }



// import java.util.*;

// public class arrayspq {

//   public static int trappedwater(int height[]) {
//     int n = height.length;

//     // calculate leftmax

//     int leftmax[] = new int[n]; // auxillary array created
//     leftmax[0] = height[0];
//     for (int i = 1; i < n; i++) {
//       leftmax[i] = Math.max(height[i], leftmax[i - 1]);
//     }

//     // calculate rightmax

//     int rightmax[] = new int[n]; // auxillary array created
//     rightmax[n - 1] = height[n - 1];
//     for (int i = n - 2; i >= 1; i--) {
//       rightmax[i] = Math.max(height[i], rightmax[i + 1]);
//     }

//     int trappedwater = 0;
//     for (int i = 0; i < n; i++) { // TC=O(n) // equal to 64

//       // waterlevel calculation

//       int waterlevel = Math.min(leftmax[i], rightmax[i]);

//       // trappedwater calculation

//       trappedwater += waterlevel - height[i];

//     }

//     return trappedwater;
//   } // Trapping rainwater problem (important problem**)

//   public static void main(String args[]) {
//     int height[] = {4, 2, 0, 6, 3, 2, 5};
//     System.out.println(trappedwater(height));

//   }
// }




// import java.util.*;

// public class arrayspq {

//   public static int triplets(int nums[]) {
//     int n = nums.length;
//     for (int i = 0; i < n; i++) {
//       for (int j = i + 1; j < n; j++) {
//         for (int k = j + 1; k < n; k++) {
//           if (nums[i] + nums[j] + nums[k] == 0) {
//             System.out.print("( " + nums[i] + "," + nums[j] + "," + nums[k] + " )");
//           }
//         }
//       } // will solve it later using hashing data structure
//     } // 68
//     return triplets;
//   }

//   public static void main(String args[]) {
//     int nums[] = { -1, 0, 1, 2, -1, -4 };
//     System.out.println(triplets(nums));

//   }
// }




// import java.util.*;

// public class arrayspq {
//   public static void getminmax(int nums[]) {
//     int min_num = Integer.MAX_VALUE;
//     int max_num = Integer.MIN_VALUE;

//     for (int i = 0; i < nums.length; i++) {
//       if (min_num > nums[i]) {
//         min_num = nums[i];
//       }
//       if (max_num < nums[i]) {
//         max_num = nums[i];
//       }
//     } // to getminmax of the given array // 69

//     System.out.println("Smallest element in the array is: " + min_num);
//     System.out.println("Largest element in the array is: " + max_num);

//   }

//   public static void main(String args[]) {
//     int nums[] = { -1, 2, 5, 4, 6, 20, 22 };
//     getminmax(nums);

//   }
// }








