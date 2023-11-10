// // Wildcard Matching - HARD level problem
// import java.util.*;

// public class DPP5 {
//     public static boolean isMatch(String s, String p) {
//         int n = s.length();
//         int m = p.length();

//         boolean dp[][] = new boolean[n + 1][m + 1];

//         // initialize
//         dp[0][0] = true;
//         for (int i = 1; i < n + 1; i++) {
//             dp[i][0] = false;
//         }
//         for (int j = 1; j < m + 1; j++) {
//             if (p.charAt(j - 1) == '*') {
//                 dp[0][j] = dp[0][j - 1];
//             }
//         }

//         // bottom-up
//         for (int i = 1; i < n + 1; i++) {
//             for (int j = 1; j < m + 1; j++) {
//                 // case -> ith char == jth char || jth char == ?
//                 if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
//                     dp[i][j] = dp[i - 1][j - 1];
//                 } else if (p.charAt(j - 1) == '*') {
//                     dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
//                 } else {
//                     dp[i][j] = false;
//                 }
//             }
//         }
//         return dp[n][m];

//     }

//     public static void main(String args[]) {
//         String s = "baaabab";
//         String p = "*****ba*****ab";
//         System.out.println(isMatch(s, p)); // true

//     }

// }

// // Catalan's number - Recursion
// import java.util.*;

// public class DPP5{
//     public static int CatalanRec(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }

//         int ans = 0; // Cn- Catalan number
//         for (int i = 0; i < n; i++) {
//             ans += CatalanRec(i) * CatalanRec(n - i - 1);
//         }
//         return ans;
//     }

//     public static void main(String args[]) {
//         int n = 4;
//         System.out.println(CatalanRec(n));
//     }

// }

// // Catalan's number - Memoization
// import java.util.*;

// public class DPP5 {
//     public static int CatalanMem(int n, int dp[]) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }

//         if (dp[n] != -1) {
//             return dp[n];
//         }

//         int ans = 0;
//         for (int i = 0; i < n; i++) {
//             ans += CatalanMem(i, dp) * CatalanMem(n - i - 1, dp);
//         }

//         return dp[n] = ans;

//     }

//     public static void main(String args[]) {
//         int n = 4;

//         int dp[] = new int[n + 1];
//         Arrays.fill(dp, -1);
//         System.out.println(CatalanMem(n, dp));
//     }

// }




// // Catalan's number - Tabulation
// import java.util.*;

// public class DPP5 {
//     public static int CatalanTab(int n, int dp[]) {
//         // initialization
//         dp[0] = 1;
//         dp[1] = 1;

//         for (int i = 2; i <= n; i++) {     // bottom-up
//             for (int j = 0; j < i; j++) {
//                 dp[i] += dp[j] * dp[i - j - 1]; // Ci = Ci * Ci-j-1
//             }
//         }

//         return dp[n];

//     }

//     public static void main(String args[]) {
//         int n = 4;
//         int dp[] = new int[n + 1];  // Creating a table
//         System.out.println(CatalanTab(n, dp));
//     }

// }




// // Counting Trees - variation of catalan number
// import java.util.*;

// public class DPP5 {
//     public static int CountBST(int n, int dp[]) {
//         // initialization
//         dp[0] = 1;
//         dp[1] = 1;

//         for (int i = 2; i <= n; i++) {     // bottom-up
//             for (int j = 0; j < i; j++) {
//                 int left = dp[j];
//                 int right = dp[i-j-1];
//                 dp[i] += left * right; // Ci = Ci * Ci-j-1
//             }
//         }

//         return dp[n];

//     }

//     public static void main(String args[]) {
//         int n = 4;
//         int dp[] = new int[n + 1];  // Creating a table
//         System.out.println(CountBST(n, dp));
//     }

// }





// Mountain Ranges- variation of catalan number

import java.util.*;

public class DPP5 {
    public static int MountainRanges(int n, int dp[]) {
        // initialization
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) { // bottom-up
            // i-pairs -> mountain ranges -> Ci
            for (int j = 0; j < i; j++) {
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside * outside; // Ci = Ci * Ci-j-1
            }
        }

        return dp[n]; // n-pairs

    }

    public static void main(String args[]) {
        int n = 4;
        int dp[] = new int[n + 1];  // Creating a table
        System.out.println(MountainRanges(n, dp));
    }

}























































