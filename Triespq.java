// // 1 
// // Group anagrams together
// import java.util.*;    // 259

// public class Triespq {
//     public static class Node {
//         Node children[] = new Node[26]; // doubt- do it later
//                                         // we can use Hashmap here to solve the problem
//         boolean eow = false;

//         public Node() {
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//         }
//     }





    
// }






// // 2
// // Longest word with all prefixes
// import java.util.*; 

// public class Triespq {
//     public static class Node {
//         Node children[] = new Node[26];
//         boolean eow = false;

//         public Node() {
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for (int i = 0; i < word.length(); i++) {
//             int idx = word.charAt(i) - 'a';
//             if (curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String key) {
//         Node curr = root;
//         for (int i = 0; i < key.length(); i++) {
//             int idx = key.charAt(i) - 'a';
//             if (curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow == true;

//     }

//     public static String ans = "";

//     public static void longestWord(Node root, StringBuilder temp) {
//         if (root == null) {
//             return;
//         }

//         for (int i = 0; i < 26; i++) {
//             if (root.children[i] != null && root.children[i].eow == true) {
//                 char ch = (char) (i + 'a');
//                 temp.append(ch);
//                 if (temp.length() > ans.length()) {
//                     ans = temp.toString(); // Here temp is converted into a string
//                 }
//                 longestWord(root.children[i], temp);
//                 temp.deleteCharAt(temp.length() - 1); // backtracking**
//             }
//         }
//     }

//     public static void main(String args[]) {
//         String words[] = { "a", "banana", "app", "appl", "ap", "apple", "apply" };
//         for (int i = 0; i < words.length; i++) {
//             insert(words[i]);
//         }
//         longestWord(root, new StringBuilder(""));
//         System.out.println(ans);
//     }

// }








