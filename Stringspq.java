// import java.util.*;

// public class Stringspq {
//     public static int getlowercasevowelscount(String str) {
//         int count = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 count++; // 93
//             }
//         } // get vowel count problem
//         return count;
//     }

//     public static void main(String args[]) {
//         String str = "where are you going";
//         System.out.println(getlowercasevowelscount(str));
//     }

// }




import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Stringspq {
    public static boolean areAnagram(char str1[], char str2[]) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2) {
            return false;
        }

        Arrays.sort(str1); // anagram problem
        Arrays.sort(str2);

        for (int i = 0; i < n1; i++) { // 94
            if (str1[i] == str2[i]) {
                return true;
            }
        }
        return false;
        // TC=nlogn
    }

    public static void main(String args[]) {
        char str1[] = { 'l', 'i', 's', 't', 'e', 'n' };
        char str2[] = { 's', 'i', 'l', 'e', 'n', 't' };

        areAnagram(str1, str2);

        if (areAnagram(str1, str2)) {
            System.out.println("Strings are anagrams of each other");
        } else {
            System.out.println("Strings are not anagrams of each other");

        }
    }
}

