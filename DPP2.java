// // Basics
// import java.util.*;

// public class DPP2 {
//     public static int Knapsack(int val[], int wt[], int W, int n) {
//         if (W == 0 || n == 0) {
//             return 0;
//         }

//         if ((wt[n - 1]) <= W) { // valid
//             // include
//             int ans1 = val[n - 1] + Knapsack(val, wt, W - wt[n - 1], n - 1);
//             // exclude
//             int ans2 = Knapsack(val, wt, W, n - 1);
//             return Math.max(ans1, ans2);
//         } else { // not valid
//             return Knapsack(val, wt, W, n - 1);
//         }

//     }

//     public static void main(String args[]) {
//         int val[] = { 15, 14, 10, 45, 30 };
//         int wt[] = { 2, 5, 1, 3, 7 };
//         int W = 7;

//         System.out.println(Knapsack(val, wt, W, val.length));

//     }

// }



// Memoization Code
import java.util.*;

public class DPP2 {

    public static int Knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) { // valid
            // include
            int ans1 = val[n - 1] + Knapsack(val, wt, W - wt[n - 1], n - 1, dp);
            // exclude
            int ans2 = Knapsack(val, wt, W, n - 1, dp);

            return Math.max(ans1, ans2);

        } else { // invalid
            return Knapsack(val, wt, W, n - 1, dp);
        }

    }

    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 }; // fixed param
        int wt[] = { 2, 5, 1, 3, 4 }; // fixed param
        int W = 7; // variable param
        int n = val.length; 

        int dp[][] = new int[n + 1][W + 1]; // creating 2D-array
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }

        }

        System.out.println(Knapsack(val, wt, W, n, dp));

    }

}



// // Tabulation Code
// import java.util.*;

// public class DPP2 {

//     public static void print(int dp[][]) {
//         for (int i = 0; i < dp.length; i++) {
//             for (int j = 0; j < dp[0].length; j++) {
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//     }

//     public static int KnapsackTab(int val[], int wt[], int W) {
//         int n = val.length;
//         int dp[][] = new int[n + 1][W + 1];
//         for (int i = 0; i < dp.length; i++) { // 0th column
//             dp[i][0] = 0;
//         }

//         for (int j = 0; j < dp[0].length; j++) { // 0th row
//             dp[0][j] = 0;
//         }

//         for (int i = 1; i < n + 1; i++) {
//             for (int j = 1; j < W + 1; j++) {
//                 int v = val[i - 1]; // ith item val
//                 int w = wt[i - 1]; // ith item weight/capacity
//                 if (w <= j) { // valid
//                     int incProfit = v + dp[i - 1][j - w];
//                     int excProfit = dp[i - 1][j];
//                     dp[i][j] = Math.max(incProfit, excProfit);
//                 } else {
//                     int excProfit = dp[i - 1][j];
//                     dp[i][j] = excProfit;
//                 }
//             }

//         }

//         print(dp); // if needed
//         return dp[n][W];

//     }

//     public static void main(String args[]) {
//         int val[] = { 15, 14, 10, 45, 30 };
//         int wt[] = { 2, 5, 1, 3, 4 };
//         int W = 7;
//         int dp[][] = new int[val.length + 1][W + 1];
//         for (int i = 0; i < dp.length; i++) {
//             for (int j = 0; j < dp[0].length; j++) {
//                 dp[i][j] = -1;            // initialisation default val = -1
//             }
//         }

//         System.out.println(KnapsackTab(val, wt, W));

//     }

// }



// // targetSumSubset - variation of 0-1 knapsack
// import java.util.*;

// public class DPP2 {

//     public static void print(boolean dp[][]) {
//         for (int i = 0; i < dp.length; i++) {
//             for (int j = 0; j < dp[0].length; j++) {
//                 System.out.print(dp[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println();

//     }

//     public static boolean targetSumSubset(int arr[], int sum) {
//         int n = arr.length;
//         boolean dp[][] = new boolean[n + 1][sum + 1]; // 2D-Array
//         // i = items & j = target sum
//         for (int i = 0; i < n + 1; i++) {
//             dp[i][0] = true;
//         }

//         // In java by default all the values will be false so no need to initialise with false again

//         for (int i = 1; i < n + 1; i++) {
//             for (int j = 1; j < sum + 1; j++) {
//                 int v = arr[i - 1];
//                 // Valid - include
//                 if (v <= j && dp[i - 1][j - v] == true) {
//                     dp[i][j] = true;
//                 }
//                 // Invalid - exclude
//                 else if (dp[i - 1][j] == true) {
//                     dp[i][j] = true;
//                 }
//             }
//         }

//         print(dp);  // if needed
//         return dp[n][sum];
//     }

//     public static void main(String args[]) {
//         int arr[] = { 4, 2, 7, 1, 3 };
//         int sum = 10;
//         System.out.println(targetSumSubset(arr, sum));
//     }

// }



// // Unbounded KnapSack
// import java.util.*;

// public class DPP2 {

//     public static int UnboundedKnapsack(int val[], int wt[], int W) {
//         int n = val.length;
//         int dp[][] = new int[n + 1][W + 1];

//         for (int i = 0; i < n + 1; i++) {
//             dp[i][0] = 0;
//         }

//         for (int j = 0; j < W + 1; j++) {
//             dp[0][j] = 0;
//         }

//         for (int i = 1; i < n + 1; i++) {
//             for (int j = 1; j < W + 1; j++) {
//                 int v = wt[i - 1]; // To simplify
//                 if (v <= j) { // valid - include + exclude
//                     dp[i][j] = Math.max(val[i - 1] + dp[i][j - v], dp[i - 1][j]);
//                 } else { // invalid - exclude
//                     dp[i][j] = dp[i - 1][j];
//                 }
//             }
//         }

//         return dp[n][W];
//     }

//     public static void main(String args[]) {
//         int val[] = { 15, 14, 10, 45, 30 };
//         int wt[] = { 2, 5, 1, 3, 4 };
//         int W = 7;

//         System.out.println(UnboundedKnapsack(val, wt, W));

//     }

// }











