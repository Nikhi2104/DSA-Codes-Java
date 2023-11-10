// import java.util.*; // Tries basic operations

// import javax.naming.directory.SearchResult;

// public class Tries {
//     static class Node {
//         Node children[] = new Node[26];
//         boolean eow = false;

//         public Node() { // constructor
//             for (int i = 0; i < 26; i++) {
//                 children[i] = null;
//             }
//         }
//     }

//     public static Node root = new Node(); // root node

//     public static void insert(String word) { // insertion in tries
//         Node curr = root;
//         for (int level = 0; level < word.length(); level++) {
//             int i = word.charAt(level) - 'a';
//             if (curr.children[i] == null) {
//                 curr.children[i] = new Node();
//             }
//             curr = curr.children[i];
//         }
//         curr.eow = true;
//     }

//     public static boolean search(String key) { // search in tries
//         Node curr = root;
//         for (int level = 0; level < key.length(); level++) {
//             int i = key.charAt(level) - 'a';
//             if (curr.children[i] == null) {
//                 return false;
//             }
//             curr = curr.children[i];
//         }
//         return curr.eow == true;
//     }

//     public static void main(String args[]) {
//         String words[] = { "the", "a", "there", "their", "thee", "any" };

//         for (int i = 0; i < words.length; i++) {
//             insert(words[i]);
//         }

//         System.out.println(search("the"));
//         System.out.println(search("anyone"));

//     }

// }




// // Word-Break problem
// import java.util.*; // 254

// public class Tries {
//     static class Node {
//         Node children[] = new Node[26]; // 'a' - 'z'
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

//         return curr.eow == true; // here we are returning since return type is boolean, also here "==" is very
//                                  // impt
//     }

//     public static boolean wordBreak(String key) {
//         if (key.length() == 0) {
//             return true;
//         }

//         for (int i = 1; i <= key.length(); i++) { // here i=1 bcoz the beginning idx and ending idx cannot be the same
//             if (search(key.substring(0, i)) && wordBreak(key.substring(i))) { // Here wordbreak(key.substring(i)) is the
//                                                                               // recursive call
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         String words[] = { "i", "like", "sam", "samsung", "mobile", "ice" };

//         for (int i = 0; i < words.length; i++) {
//             insert(words[i]);
//         }

//         String key = "ilikesamsung";
//         System.out.println(wordBreak(key));
//     }

// }




// // Prefix problem
// import java.util.*; // 255

// public class Tries {
//     public static class Node {
//         Node children[] = new Node[26];
//         Boolean eow = false;
//         int freq = 1; // the only difference here is freq variable is added

//         public Node() {
//             for (int i = 0; i < children.length; i++) {
//                 children[i] = null;
//             }
//             // freq = 1;
//         }

//     }

//     public static Node root = new Node();

//     public static void insert(String word) {
//         Node curr = root;
//         for (int i = 0; i < word.length(); i++) {
//             int idx = word.charAt(i) - 'a';
//             if (curr.children[idx] == null) {
//                 curr.children[idx] = new Node();
//             } else {
//                 curr.children[idx].freq++;    // freq++ is the extra step here
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }

//     // public static boolean search(String key) {
//     //     Node curr = root;
//     //     for (int i = 0; i < key.length(); i++) {
//     //         int idx = key.charAt(i) - 'a';
//     //         if (curr.children[idx] == null) {
//     //             return false;
//     //         }
//     //         curr = curr.children[idx];
//     //     }
//     //     return curr.eow == true;
//     // }

//     public static void findprefix(Node root, String ans) { // findprefix method
//         if (root == null) {
//             return;
//         }

//         if (root.freq == 1) {
//             System.out.println(ans);
//             return;
//         }

//         for (int i = 0; i < root.children.length; i++) {
//             if (root.children[i] != null) {
//                 findprefix(root.children[i], ans + (char) (i + 'a')); // since root is a global variable
//             }
//         }
//     }

//     public static void main(String args[]) {
//         String words[] = { "zebra", "dog", "duck", "dove" };
//         for (int i = 0; i < words.length; i++) {
//             insert(words[i]);
//         }

//         root.freq = -1;
//         findprefix(root, "");

//     }

// }




// // StartswithProblem
// import java.util.*; // 256

// public class Tries {
//     public static class Node {
//         Node children[] = new Node[26];
//         boolean eow;

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

//     public static boolean startsWith(String prefix) {  // similar to search operation
//         Node curr = root;
//         for (int i = 0; i < prefix.length(); i++) {
//             int idx = prefix.charAt(i) - 'a';
//             if (curr.children[idx] == null) {
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return true;
//     }

//     public static void main(String args[]) {
//         String words[] = { "apple", "app", "mango", "man", "woman" };
//         for (int i = 0; i < words.length; i++) {
//             insert(words[i]);
//         }

//         String prefix1 = "app";
//         String prefix2 = "man";

//         System.out.println(startsWith(prefix1));
//         System.out.println(startsWith(prefix2));
//     }

// }




// // Unique substrings
// import java.util.*; // 257

// public class Tries {
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

//     // public static boolean search(String key) {
//     // Node curr = root;
//     // for (int i = 0; i < key.length(); i++) {
//     // int idx = key.charAt(i) - 'a';
//     // if (curr.children[idx] == null) {
//     // return false;
//     // }
//     // curr = curr.children[idx];
//     // }
//     // return curr.eow == true;

//     // }

//     public static int countNodes(Node root) { // unique prefixes can be found using this method
//         if (root == null) { // base-case
//             return 0;
//         }

//         int count = 1; // for current root
//         for (int i = 0; i < 26; i++) {
//             if (root.children[i] != null) {
//                 count += countNodes(root.children[i]);
//             }
//         }
//         return count;
//     }

//     public static void main(String args[]) {
//         String word = "apple";
//         for (int i = 0; i < word.length(); i++) {
//             String suffix = word.substring(i); // first we need to get suffixes from the given word
//             insert(suffix); // we insert each suffix into the trie
//         }
//         System.out.println(countNodes(root)); // we get unique substrings here

//     }

// }



// // Longest word with all prefixes
// import java.util.*; // 258

// public class Tries {
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

//     // public static boolean search(String key) {
//     //     Node curr = root;
//     //     for (int i = 0; i < key.length(); i++) {
//     //         int idx = key.charAt(i) - 'a';
//     //         if (curr.children[idx] == null) {
//     //             return false;
//     //         }
//     //         curr = curr.children[idx];
//     //     }
//     //     return curr.eow == true;

//     // }

//     public static String ans = "";

//     public static void longestWord(Node root, StringBuilder temp) {
//         if (root == null) {
//             return;
//         }

//         for (int i = 0; i < 26; i++) {
//             if (root.children[i] != null && root.children[i].eow == true) {
//                 char ch = (char) (i + 'a'); // doubt
//                 temp.append(ch);
//                 if (temp.length() > ans.length()) {
//                     ans = temp.toString(); // Here temp is converted into a string
//                 }
//                 longestWord(root.children[i], temp);
//                 temp.deleteCharAt(temp.length() - 1); // backtracking** - doubt
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


