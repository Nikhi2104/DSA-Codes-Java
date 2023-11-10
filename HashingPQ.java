
// // 1 - Bottom view of a binary tree
// import java.util.*; // 250

// public class HashingPQ {

//     public static class Node {
//         int data;
//         int hd;
//         Node left, right;

//         public Node(int key) {
//             this.data = key;
//             this.hd = Integer.MAX_VALUE;    // horizontal data 
//             this.left = this.right = null;
//         }

//     }

//     public static void bottomViewHelper(Node root, int curr, int hd, TreeMap<Integer, int[]> map) {
//         if (root == null) {
//             return;
//         }

//         // if node for a particular hd is not present, add to the map
//         if (!map.containsKey(hd)) {
//             map.put(hd, new int[] { root.data, curr});    // stores the values for the first time occurence
//         }

//         // Compare height for already present node at similar horizontal distance
//         else {
//             int p[] = map.get(hd);
//             if (p[1] <= curr) {                 // doubt ****
//                 p[1] = curr;
//                 p[0] = root.data;             // stores the updated value 
//             }

//             map.put(hd, p);               
//         }

//         bottomViewHelper(root.left, curr + 1, hd - 1, map); // call for left subtree

//         bottomViewHelper(root.right, curr + 1, hd + 1, map); // call for right subtree

//     }

//     public static void printBottomView(Node root) {
//         TreeMap<Integer, int[]> map = new TreeMap<>(); // map to store Horizontal values,height and data.

//         bottomViewHelper(root, 0, 0, map);

//         for (int val[] : map.values()) { // print the values stored by bottomViewHelper()
//             System.out.print(val[0] + " ");
//         }
//     }

//     public static void main(String args[]) {
//         Node root = new Node(20);
//         root.left = new Node(8);
//         root.right = new Node(22);
//         root.left.left = new Node(5);
//         root.left.right = new Node(3);
//         root.right.right = new Node(25);
//         root.left.right.left = new Node(10);
//         root.left.right.right = new Node(14);

//         System.out.println("Bottom view of the binary tree is: ");

//         printBottomView(root);

//     }

// }

// // 2 - Two Sum
// import java.util.*; // 251

// public class HashingPQ {

//     public static int[] twoSum(int arr[], int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < arr.length; i++) {
//             int diff = target - arr[i]; // diff = target - number given at i'th index

//             if (map.containsKey(diff)) {
//                 return new int[] { map.get(diff), i };
//             }
//             map.put(arr[i], i);

//         }

//         return new int[] { 0, 0 };

//     }

//     public static void main(String args[]) {
//         int arr[] = { 2, 7, 11, 15 };
//         int target = 18;

//         int ans[] = twoSum(arr, target);
//         for (int i = 0; i < ans.length; i++)
//             System.out.print(ans[i] + " ");

//     }

// }



// // // 3 - Sort by frequency
// import java.util.*; // 252

// public class HashingPQ {
//     public static String frequencySort(String s) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
//         }

//         PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
//                 (a, b) -> a.getValue() == b.getValue() ? a.getKey() - b.getKey() : b.getValue() - a.getValue()); // ternary
//                                                                                                                                                                                        // operator

//         for (Map.Entry<Character, Integer> e : map.entrySet()) {
//             pq.add(e);
//         }

//         StringBuilder res = new StringBuilder();
//         while (pq.size() != 0) {
//             char ch = pq.poll().getKey();
//             int val = map.get(ch);
//             while (val != 0) {
//                 res.append(ch);
//                 val--;
//             }
//         }
//         return res.toString();

//     }

//     public static void main(String args[]) {
//         String s = "tree";

//         String str = frequencySort(s);
//         for (int i = 0; i < str.length(); i++)
//             System.out.print(str + " "); // ** here eert is printed 4 times since tree has 4 characters which should not
//                                          // happen

//     }

// }



// LRU Cache problem(Impt**)            // 253

// Leetcode problem


