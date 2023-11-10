// import java.util.*;

// public class Strings {
//     public static void printletters(String str) {
//         for (int i = 0; i < str.length(); i++) {
//             System.out.print(str.charAt(i) + " ");
//         }
//         System.out.println();
//     }

//     // sample problem

//     public static void main(String args[]) {
//         String firstName = "Nikhil";
//         String lastName = "Suresh";
//         String fullName = firstName + " " + lastName; // 86

//         printletters(fullName);
//     }
// }



// import java.util.*;

// public class Strings {
//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i < str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) == str.charAt(n - 1 - i)) {
//                 return true;
//             }
//         }
//         return false; // palindrome string problem
//     }

//     public static void main(String args[]) {
//         String str = "racecar"; // 87
//         System.out.println(isPalindrome(str));
//     }
// }




// import java.util.*;

// public class Strings {
//     public static float getshortestpath(String path) {
//         int x = 0, y = 0;

//         for (int i = 0; i < path.length(); i++) {
//             char dir = path.charAt(i);
//             if (dir == 'N') {
//                 y++;
//             } else if (dir == 'S') {
//                 y--;
//             } // shortest path problem
//             else if (dir == 'E') {
//                 x++; // TC=O(n)
//             } else {
//                 x--;
//             }
//         }
//         float X2 = x * x;
//         float Y2 = y * y;
//         return (float) Math.sqrt(X2 + Y2); // 88

//     }

//     public static void main(String args[]) {
//         String path = "NSNEEW";
//         System.out.println(getshortestpath(path));
//     }
// }



// import java.util.*;

// public class Strings {
//     public static String substring(String str, int si, int ei) {
//         String substr = "";
//         for (int i = si; i < ei; i++) {
//             substr += str.charAt(i);
//         }
//         return substr; // printing substring
//     }

//     public static void main(String args[]) { // 89
//         String str = "HelloWorld";
//         System.out.println(substring(str, 0, 4));
//         // System.out.println(str.substring(0,5)); // inbuilt java function to get a
//         // substring

//     }
// }




// import java.util.*;

// public class Strings {

//     public static void main(String args[]) {
//         String str[] = { "apple", "banana", "mango", "watermelon" };

//         String largest = str[0]; // largest string problem
//         for (int i = 1; i < str.length; i++) { // 90
//             if (largest.compareTo(str[i]) < 0) {   // doubt
//                 largest = str[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }


// import java.util.*;

// public class Strings {
//     public static String toUpperCase(String str) { // unique problem*
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch); // 91

//         for (int i = 1; i < str.length(); i++) { // TC=O(n)
//             if (str.charAt(i) == ' ' && i < str.length() - 1) {
//                 sb.append(str.charAt(i)); // append any words,numbers,etc..
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i))); // append first letter of the word to upper case
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString(); // converting sb to string
//     }

//     public static void main(String args[]) {
//         String str = "hello, my name is nikhil";
//         System.out.println(toUpperCase(str));
//     }

// }



// import java.util.*;

// public class Strings {
//     public static String stringcompression(String str) { // string compression problem
//         String newstr = "";

//         for (int i = 0; i < str.length(); i++) { // very important string problem**
//             Integer count = 1;
//             while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
//                 count++;
//                 i++; // 92
//             }
//             newstr += str.charAt(i);
//             if (count >= 1) {
//                 newstr += count.toString();
//             } // TC=O(n)
//         }
//         return newstr;
//     }

//     public static void main(String args[]) {
//         String str = "abbcccdd";
//         System.out.println(stringcompression(str));
//     }

// }




// // hw problem
// // using stringbuilder 

// import java.util.*;
// public class Strings{
//    public static String stringcompression(String str){                             // string compression problem
//         StringBuilder sb=new StringBuilder("");
        
//          for(int i=0;i<str.length();i++){                                    // very important string problem**
//           Integer count=1;
//           while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
//             count++;   
//              i++;                                                                 // 92
//           }
//           sb.append(str.charAt(i));
//           if(count>=1){
//           sb.append(count.toString());
//           }                                                                              // TC=O(n)
//          }
//      return sb.toString();
//    }

//    public static void main(String args[]){
//      String str="abbcccdd";
//      System.out.println(stringcompression(str));
//    }

// }




