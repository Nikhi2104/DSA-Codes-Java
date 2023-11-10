
// public class Recursion {
//     public static void printDec(int n) {
//         if (n == 1) {
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " "); // recursion basic intro problem
//         printDec(n - 1);
//     }

//     public static void main(String args[]) { // print numbers in decreasing order
//         int n = 10;
//         printDec(n); // 101
//     }
// }



// public class Recursion {
//     public static void printInc(int n) {
//         if (n == 1) {
//             System.out.print(n + " ");
//             return;
//         }
//         printInc(n - 1);
//         System.out.print(n + " ");
//     }

//     public static void main(String args[]) { // print numbers in increasing order
//         int n = 10;
//         printInc(n); // 102
//     }
// }



// public class Recursion {
//     public static int printFact(int n) {
//         if (n == 0) {
//             return 1;
//         }
//         // int fnm1 = printFact(n - 1); // factorial of a number
//         int fn = n * printFact(n - 1);
//         return fn;
//     }

//     public static void main(String args[]) { // 103
//         int n = 6;
//         System.out.println(printFact(n));
//     }
// }



// public class Recursion {
//     public static int calcSum(int n) {
//         if (n == 1) {
//             return 1;
//         }
//         int Snm1 = calcSum(n - 1); // sum of first 'n' natural numbers
//         int Sn = n + calcSum(n - 1);
//         return Sn;
//     }

//     public static void main(String args[]) { // 104
//         int n = 6;
//         System.out.println(calcSum(n));
//     }
// }



// public class Recursion {
//     public static int printFib(int n) {
//         if (n == 0 || n == 1) {
//             return n;
//         }
//         int fnm1 = printFib(n - 1);
//         int fnm2 = printFib(n - 2); // fibonacci numbers
//         int fib = fnm1 + fnm2;
//         return fib;

//     }

//     public static void main(String args[]) { // 105
//         int n = 6;
//         System.out.println(printFib(n));
//     }
// }



// public class Recursion {
//     public static boolean isSorted(int arr[], int i) {
//         if (i == arr.length - 1) {
//             return true;
//         }
//         if (arr[i] > arr[i + 1]) {
//             return false;
//         } // to check given array is sorted or not
//         return isSorted(arr, i + 1);
//     }

//     public static void main(String args[]) { // 106
//         int arr[] = { 1, 2, 3, 4, 5 };
//         System.out.println(isSorted(arr, 0));
//     }
// }




// public class Recursion {
//     public static int firstOccurence(int arr[], int i, int key) {
//         if (i == arr.length - 1) {
//             return -1;
//         }
//         if (arr[i] == key) {
//             return i;
//         }

//         return firstOccurence(arr, i + 1, key); // first occurence problem
//     }

//     public static void main(String args[]) { // 107
//         int arr[] = { 2, 4, 3, 8, 5, 6, 9, 7, 4, 6 };
//         System.out.println(firstOccurence(arr, 0, 4));
//     }
// }



// public class Recursion {
//     public static int lastOccurence(int arr[], int i, int key) {
//         if (i == arr.length) {
//             return -1;
//         }
//         int isFound = lastOccurence(arr, i + 1, key);
//         if (isFound == -1 && arr[i] == key) {
//             return i;
//         }

//         return isFound; // last occurence problem
//     }

//     public static void main(String args[]) { // 108
//         int arr[] = { 2, 4, 3, 8, 5, 6, 9, 7, 4, 6 };
//         System.out.println(lastOccurence(arr, 0, 4));
//     }
// }




// public class Recursion {
//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return x * power(x, n - 1);
//     } // print x^n problem

//     public static void main(String args[]) { // 109
//         System.out.println(power(2, 10));
//     }
// }




// public class Recursion {
//     public static int optimizedpower(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         int halfpower = optimizedpower(x, n / 2); // print x^n problem
//         int halfpowerSq = halfpower * halfpower;
//         if (n % 2 != 0) {
//             halfpowerSq = x * halfpowerSq;
//         }
//         return halfpowerSq;
//     }

//     public static void main(String args[]) { // 110
//         System.out.println(optimizedpower(2, 10));
//     }
// }



// public class Recursion {
//     public static int tilingproblem(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }
//         int fnm1 = tilingproblem(n - 1);
//         int fnm2 = tilingproblem(n - 2);
//         int totalWays = fnm1 + fnm2;
//         return totalWays; // tiling problem
//     }

//     public static void main(String args[]) { // 111
//         System.out.println(tilingproblem(4));
//     }
// }


// public class Recursion {
//     public static void removeDuplicates(String str, int i, StringBuilder newstr, boolean map[]) {
//         if (i == str.length()) {
//             System.out.println(newstr);
//             return;
//         }
//         char currChar = str.charAt(i);
//         if (map[currChar - 'a'] == true) {
//             removeDuplicates(str, i + 1, newstr, map);
//         }
//         // remove duplicates
//         else {
//             map[currChar - 'a'] = true;
//             removeDuplicates(str, i + 1, newstr.append(currChar), map);
//         }

//     }

//     public static void main(String args[]) { // 112
//         String str = "appnnacollege";
//         removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }


// public class Recursion {
//     public static int friendsPairing(int n) {
//         if (n == 1 || n == 2) {
//             return n;
//         }
//         return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2); // friends pairing problem

//     }

//     public static void main(String args[]) { // 113
//         System.out.println(friendsPairing(4));     
//     }

// }




// public class Recursion {

//     public static void printbinarystrings(int n, int lastPlace, String str) {
//         if (n == 0) {
//             System.out.println(str);
//             return;
//         }
//         printbinarystrings(n - 1, 0, str + "0"+" "); // if lastplace == 1
//         if (lastPlace == 0) { // print binary strings without consecutive 1's
//             printbinarystrings(n - 1, 1, str + "1"+" ");
//         }

//     }

//     public static void main(String args[]) { // 114
//         printbinarystrings(3, 0, "");
//     }

// }



public class Recursion {

    public static void printbinarystrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printbinarystrings(n - 1, 1, str + "1"+" ");
        if (lastPlace == 1) { // print binary strings without consecutive 0's
            printbinarystrings(n - 1, 0, str + "0"+" ");
        }

    }

    public static void main(String args[]) { // 115
        printbinarystrings(3, 1, "");
    }

}



