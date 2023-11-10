// public class Recursionpq {

//     public static void AllOccurences(int arr[], int i, int key) {
//         if (i == arr.length) {
//             return;
//         }

//         if (arr[i] == key) {
//             System.out.print(i + " ");
//         }

//         AllOccurences(arr, i + 1, key);

//     }

//     public static void main(String args[]) { // find All occurences problem
//         int arr[] = { 2, 5, 3, 8, 5, 6, 9, 7, 4, 6 }; // 116
//         AllOccurences(arr, 0, 5);
//         // System.out.println();
//     }

// }




// public class Recursionpq {

//     static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

//     public static void printDigits(int number) {
//         if (number == 0) {
//             return;
//         }
//         int ld = number % 10;
//         printDigits(number / 10);
//         System.out.print(digits[ld] + " "); // convert given number into string
//     }

//     public static void main(String args[]) { // 117
//         printDigits(2022);
//         System.out.println();
//     }

// }



// public class Recursionpq {

//     public static int getlength(String str) {
//         if (str.length() == 0) {
//             return 0;
//         }
//         return getlength(str.substring(1)) + 1; // get length of a string
//     }

//     public static void main(String args[]) { // 118
//         String str = "abcde";
//         System.out.println(getlength(str));
//     }

// }



// public class Recursionpq {

//     public static int countsubstrings(String str, int i, int j, int n) {
//         if (n == 1) {
//             return 1;
//         }
//         if (n <= 0) {
//             return 0;
//         }

//         int res = countsubstrings(str, i, j - 1, n - 1) + countsubstrings(str, i + 1, j, n - 1)
//                 - countsubstrings(str, i + 1, j - 1, n - 2);
//         if (str.charAt(i) == str.charAt(j)) {
//             res++;           // try to print the substring alongwith the count
//         }
//         return res;
//     }

//     public static void main(String args[]) { // count substrings with same ends
//         String str = "abcabc";
//         int n = str.length();
//         System.out.print(countsubstrings(str, 0, n - 1, n)); // 119  // Since string length keeps changing so we are passing it here itself
//     }

// }


public class Recursionpq {
    public static void towerofHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerofHanoi(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerofHanoi(n - 1, helper, src, dest);

    }

    public static void main(String args[]) { // Tower of Hanoi problem**
        int n = 2;
        towerofHanoi(n, "S", "H", "D"); // 120
    }

}










