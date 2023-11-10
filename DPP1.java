// DPP1- Fibonacci - 3 approaches, Climbing Stairs - 3 approaches 

// import java.util.*;

// public class DPP1 { // basic fibonacci code
//   public static int fib(int n) { // recursive method
//     if (n == 0 || n == 1) {
//       return n;
//     }
//     return fib(n - 1) + fib(n - 2);
//   }

//   public static void main(String args[]) {
//     int n = 6;
//     System.out.println(fib(n));
//   }

// }

// import java.util.*;

// public class DPP1 { // Memoization code
//   public static int fib(int n, int f[]) {
//     if (n == 0 || n == 1) {
//       return n;
//     }
//     if (f[n] != 0) { // fib[n] is already calculated
//       return f[n];
//     }
//     f[n] = fib(n - 1, f) + fib(n - 2, f);
//     return f[n];
//   }

//   public static void main(String args[]) {
//     int n = 5;
//     int f[] = new int[n + 1]; // 0, 0, 0, 0
//     System.out.println(fib(n, f));
//   }

// }

// import java.util.*;

// public class DPP1 { // Tabulation code
//   public static int fibTabulation(int n) {
//     int dp[] = new int[n + 1]; // dp array is created
//     dp[0] = 0;
//     dp[1] = 1;
//     for (int i = 2; i <= n; i++) {
//       dp[i] = dp[i - 1] + dp[i - 2]; // ans is stored in dp[i] array
//     }
//     return dp[n]; // ans
//   }

//   public static void main(String args[]) {
//     int n = 6;
//     // int f[] = new int[n + 1]; // 0, 0, 0, 0
//     System.out.println(fibTabulation(n));
//   }

// }

// Climbing stairs problem - Similar to fibonacci problem
// memoization code=O(n)|normal recursion=O(2*n)

// import java.util.*; 

// public class DPP1 {
//   public static int countWays(int n, int ways[]) {
//     if (n == 0) {
//       return 1;
//     }
//     if (n < 0) {
//       return 0;
//     }

//     if (ways[n] != -1) { // already calculated
//       return ways[n];
//     }
//     ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways);
//     return ways[n];
//   }

//   public static void main(String args[]) {
//     int n = 5;
//     int ways[] = new int[n + 1]; // 0 0 0 0
//     Arrays.fill(ways, -1); // -1 -1 -1 -1
//     System.out.println(countWays(n, ways));  
//   }

// }



// // Climbing stairs problem 
// // tabulation code = O(n)
// import java.util.*;

// public class DPP1 {
//   public static int countWaysTab(int n) {
//     int dp[] = new int[n + 1];
//     dp[0] = 1;

//     // tabulation loop
//     for (int i = 1; i <= n; i++) {
//       if (i == 1) {
//         dp[i] = dp[i - 1] + 0;
//       } else {
//         dp[i] = dp[i - 1] + dp[i - 2];
//       }
//     }
//     return dp[n];

//   }

//   public static void main(String args[]) {
//     int n = 5; // n=3 -> 3 & n=4 -> 5 => 8
//     int ways[] = new int[n + 1]; // 0 0 0 0
//     Arrays.fill(ways, -1); // -1 -1 -1 -1
//     System.out.println(countWaysTab(n));
//   }

// }
