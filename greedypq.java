// // 1
// import java.util.*;

// public class greedypq { // 199

//    public static int balancedPartition(String str, int n) {
//       if (n == 0) { // maximum balanced string partitions
//          return 0;
//       }

//       int lCount = 0, rCount = 0;
//       int ans = 0;

//       for (int i = 0; i < n; i++) {
//          if (str.charAt(i) == 'L') {
//             lCount++;
//          } else if (str.charAt(i) == 'R') {
//             rCount++;
//          }

//          if (lCount == rCount) {
//             ans++;
//          }
//       }
//       return ans;

//    }

//    public static void main(String args[]) {
//       String str = "LRRRRLLRLLRL";
//       int n = str.length();

//       System.out.println("Max number of balanced substrings = " + balancedPartition(str, n));

//    }
// }




// // 2
// import java.util.*;

// public class greedypq { // 200

//    public static int kthOdd(int arr[], int k) { // kth largest odd number in a given range
//       if (k <= 0) {
//          return 0;
//       }

//       int L = arr[0];
//       int R = arr[1];

//       if ((R & 1) > 0) { // ANDing R with 1
//          int count = (int) Math.ceil((R - L + 1) / 2); // unique statement
//          if (k > count) {
//             return 0;
//          } else {
//             return (R - 2 * k + 2);
//          }
//       }

//       else {
//          int count = (R - L + 1) / 2;
//          if (k > count) {
//             return 0;
//          } else {
//             return (R - 2 * k + 1);
//          }

//       }
//    }

//    public static void main(String args[]) {
//       int arr[] = { -10, 10 };
//       int k = 2;
//       System.out.println(kthOdd(arr, k));
//    }

// }




// // 3
// import java.util.*;

// public class greedypq { // Lexicographically smallest string of length N and sum K

//    public static char[] lexo_small(int n, int k) { // 201
//       char arr[] = new char[n];
//       Arrays.fill(arr, 'a');
//       for (int i = n - 1; i >= 0; i--) {
//          k -= i; // k = k-i
//          if (k >= 0) {
//             if (k >= 26) {
//                arr[i] = 'z';
//                k -= 26; // k = k-26
//             } else {
//                arr[i] = (char) (k + 97 - 1);
//                k -= (arr[i] - 'a') + 1; // k = k-arr[i]-'a'+1
//             }
//          }

//          else
//             break;

//          k += i; // k = k+i
//       }

//       return arr;

//    }

//    public static void main(String args[]) {
//       int n = 5, k = 42;
//       char arr[] = lexo_small(n, k);

//       System.out.print(new String(arr));

//    }

// }





// // 4
// public class greedypq {

//    public static int maxProfit(int prices[], int n) { // buy and sell stocks
//       int buy = prices[0], max_profit = 0;
//       for (int i = 1; i < n; i++) {
//          if (buy > prices[i])
//             buy = prices[i];
//          else if (prices[i] - buy > max_profit) // 202
//             max_profit = prices[i] - buy;
//       }
//       return max_profit;

//    }

//    public static void main(String args[]) {
//       int prices[] = { 7, 1, 5, 3, 6, 4 };
//       int n = prices.length;
//       int max_profit = maxProfit(prices, n);
//       System.out.println(max_profit);

//    }

// }





// 5
import java.util.*;

public class greedypq { // split the given array into K sub-arrays
   public static int ans = 10000000;

   public static void solve(int a[], int n, int k, int index, int sum, int maxSum) { // 203
      if (k == 1) {
         maxSum = Math.max(maxSum, sum);
         sum = 0;
         for (int i = index; i < n; i++) {
            sum += a[i];
         }
         maxSum = Math.max(maxSum, sum);
         ans = Math.min(ans, maxSum);
         return;
      }

      sum = 0;
      for (int i = index; i < n; i++) {
         sum += a[i];
         maxSum = Math.max(maxSum, sum);
         solve(a, n, k - 1, i + 1, sum, maxSum);
      }
   }

   public static void main(String args[]) {
      int arr[] = { 1, 2, 3, 4 };
      int k = 3; // K divisions
      int n = arr.length;
      solve(arr, n, k, 0, 0, 0);
      System.out.println(ans + " ");

   }

}





