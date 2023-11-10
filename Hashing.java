// import java.util.*;
// import java.util.HashMap; // BASIC OPERATIONS

// public class Hashing {
//     public static void main(String args[]) {
//         HashMap<String, Integer> hmap = new HashMap<>();

//         // Put operation - O(1)
//         hmap.put("India", 140);
//         hmap.put("China", 130);
//         hmap.put("USA", 50);

//         System.out.println(hmap);

//         // // get operation - O(1)
//         // System.out.println(hmap.get("USA"));

//         // // containsKey operation - O(1)
//         // System.out.println(hmap.containsKey("India"));
//         // System.out.println(hmap.size());

//         // // remove operation - O(1)
//         // System.out.println(hmap.remove("China"));

//         // System.out.println(hmap);

//         System.out.println(hmap.size());

//         // hmap.clear();

//         // System.out.println(hmap.size());

//         // Iterate
//         // hmap.entrySet() method can also be used here
//         Set<String> keys = hmap.keySet(); // O(1)
//         System.out.println(keys);

//         for (String k : keys) { // Iteration on Hashmaps
//             System.out.println("key=" + k + ", value=" + hmap.get(k));
//         }

//     }

// }

// // Implementation of HashMap
// import java.util.*; // 240 - skipped heaps-pqs
// import java.util.HashMap;
// import java.util.ArrayList;
// import java.util.LinkedList;

// public class Hashing {
//     static class HashMap<K, V> { // generic class

//         private class Node {
//             K key;
//             V value;

//             public Node(K key, V value) {
//                 this.key = key;
//                 this.value = value;
//             }

//         }

//         private int n; // size
//         private LinkedList<Node> buckets[];
//         private int N; // Global variables // N = buckets.length

//         @SuppressWarnings("unchecked")
//         public HashMap() {
//             this.N = 4;
//             this.buckets = new LinkedList[4];
//             for (int i = 0; i < 4; i++) {
//                 this.buckets[i] = new LinkedList<>();
//             }

//         }

//         private int hashfunction(K key) {
//             int hc = key.hashCode();
//             return Math.abs(hc) % N; // to get bi-bucket index
//         }

//         private int SearchInLL(K key, int bi) { // to get di
//             LinkedList<Node> ll = buckets[bi];
//             int di = 0;

//             for (int i = 0; i < ll.size(); i++) {
//                 Node node = ll.get(i);
//                 if (node.key == key) {
//                     return di;
//                 }
//                 di++;
//             }
//             return -1;
//         }

//         @SuppressWarnings("unchecked")
//         private void rehash() {
//             LinkedList<Node> oldBuck[] = buckets;
//             buckets = new LinkedList[N * 2]; // bucket size is updated/increased
//             N = 2 * N;
//             for (int i = 0; i < buckets.length; i++) {
//                 buckets[i] = new LinkedList<>(); // new Array is created with linkedlist initialisation
//             }

//             // nodes -> add in bucket
//             for (int i = 0; i < oldBuck.length; i++) {
//                 LinkedList<Node> ll = oldBuck[i];
//                 for (int j = 0; j < ll.size(); j++) { // traversing through the linkedlists in the bi
//                     Node node = ll.remove();
//                     put(node.key, node.value);
//                 }
//             }

//         }

//         public void put(K key, V value) {
//             int bi = hashfunction(key);
//             int di = SearchInLL(key, bi);

//             if (di != -1) {
//                 Node node = buckets[bi].get(di);
//                 node.value = value;
//             } else {
//                 buckets[bi].add(new Node(key, value));
//                 n++;
//             }

//             double lambda = (double) n / N;
//             if (lambda > 2.0) {
//                 rehash();
//             }

//         }

//         public boolean containsKey(K key) {
//             int bi = hashfunction(key);
//             int di = SearchInLL(key, bi);

//             if (di != -1) { // valid case
//                 return true;
//             } else {
//                 return false;
//             }

//         }

//         public V remove(K key) {
//             int bi = hashfunction(key);
//             int di = SearchInLL(key, bi);

//             if (di != -1) {
//                 Node node = buckets[bi].remove(di);
//                 n--; // this is impt
//                 return node.value;
//             } else {
//                 return null;
//             }

//         }

//         public V get(K key) {
//             int bi = hashfunction(key);
//             int di = SearchInLL(key, bi);

//             if (di != -1) {
//                 Node node = buckets[bi].get(di);
//                 return node.value;
//             } else {
//                 return null;
//             }
//         }

//         public ArrayList<K> keySet() {
//             ArrayList<K> keys = new ArrayList<>();

//             for (int i = 0; i < buckets.length; i++) {
//                 LinkedList<Node> ll = buckets[i];
//                 for (Node node : ll) { // for-each loop
//                     keys.add(node.key);
//                 }
//             }
//             return keys;
//         }

//         public boolean isEmpty() {
//             return n == 0;
//         }

//     }

//     public static void main(String args[]) {
//         HashMap<String, Integer> hmap = new HashMap<>();
//         hmap.put("India", 140);
//         hmap.put("China", 130);
//         hmap.put("USA", 50);
//         hmap.put("Nepal", 5);

//         ArrayList<String> keys = hmap.keySet();
//         for (String key : keys) {
//             System.out.println(key);
//         }

//         // System.out.println(hmap.get("USA"));
//         System.out.println(hmap.get("India"));
//         System.out.println(hmap.remove("USA"));
//         System.out.println(hmap.get("USA"));

//     }

// }

// // LinkedHashMap and // TreeMap
// import java.util.*; // 241
// import java.util.HashMap;

// public class Hashing {
//     public static void main(String args[]) {
//         HashMap<String, Integer> hm = new HashMap<>(); // Usual HashMap
//         hm.put("India", 100);         // Unordered
//         hm.put("China", 150);
//         hm.put("US", 50);
//         hm.put("Indonesia", 10);   

//         LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
//         lhm.put("Indonesia", 10);
//         lhm.put("India", 100);        // Insertion-Ordered
//         lhm.put("China", 150);
//         lhm.put("US", 50);

//         TreeMap<String, Integer> tm = new TreeMap<>();
//         tm.put("India", 100);        // Alphabetically-sorted 
//         tm.put("China", 150);
//         tm.put("US", 50);
//         tm.put("Indonesia", 10);

//         System.out.println(hm);
//         System.out.println(lhm);
//         System.out.println(tm);

//     }

// }

// // Majority Element problem         
// import java.util.*; // 242
// import java.util.HashMap;

// public class Hashing {
//     public static void main(String args[]) {
//         int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 2, 3, 1};

//         HashMap<Integer, Integer> map = new HashMap<>();

//         // for (int i = 0; i < arr.length; i++) {
//         // if (map.containsKey(arr[i])) {
//         // map.put(arr[i], map.get(arr[i]) + 1);
//         // } else {
//         // map.put(arr[i], 1);
//         // }

//         // }

//         // or
//         for (int i = 0; i < arr.length; i++) {
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }

//         for (Integer key : map.keySet()) {
//             if (map.get(key) > arr.length / 3) {
//                 System.out.println(key);
//             }
//         }

//     }

// }

// // Valid Anagram
// import java.util.*; // 243

// public class Hashing {

//     public static boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }

//         HashMap<Character, Integer> map = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) { // String s

//             Character ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }

//         for (int i = 0; i < t.length(); i++) { // String t
//             Character ch = t.charAt(i);
//             if (map.get(ch) != null) {
//                 if (map.get(ch) == 1) {
//                     map.remove(ch);
//                 } else {
//                     map.put(ch, map.get(ch) - 1);
//                 }
//             } else {
//                 return false;
//             }
//         }

//         return map.isEmpty();
//     }

//     public static void main(String args[]) { // O(n) , where n = number of characters
//         String s = "dilip";
//         String t = "lipid";

//         System.out.println(isAnagram(s, t));
//     }

// }

// // HashSet
// import java.util.*;
// public class Hashing {
//     public static void main(String args[]) {
//         HashSet<Integer> set = new HashSet<>();

//         set.add(1);
//         set.add(2);
//         set.add(3);
//         set.add(4);
//         set.add(2); // duplicate

//         System.out.println(set);

//         set.remove(3);
//         if (set.contains(2)) {
//             System.out.println("set contains 2");
//         }

//         if (set.contains(3)) {
//             System.out.println("set contains 3");
//         }

//     }

// }

// // Iterations on HashSet
// import java.util.*;                   // 244

// public class Hashing {
//     public static void main(String args[]) {
//         HashSet<String> cities = new HashSet<>();

//         cities.add("Delhi");
//         cities.add("Bangalore");
//         cities.add("Hyderabad");
//         cities.add("Pune");

//         Iterator it = cities.iterator(); // 1-Using iterator
//         while (it.hasNext()) {
//             System.out.println(it.next()); // Here it prints the element as well as gets iterated
//         }

//         System.out.println();

//         for (String city : cities) { // 2-Using enhanced for loop
//             System.out.println(city);
//         }
//     }

// }

// // LinkedHashSet and TreeSet
// import java.util.*; // 245

// public class Hashing {
//     public static void main(String args[]) {
//         HashSet<String> cities = new HashSet<>(); // HashSet

//         cities.add("Delhi");
//         cities.add("Bangalore");
//         cities.add("Hyderabad");
//         cities.add("Pune");
//         cities.add(" ");    // null values are allowed
//         System.out.println(cities);

//         LinkedHashSet<String> lhs = new LinkedHashSet<>(); // LinkedHashSet

//         lhs.add("Delhi");
//         lhs.add("Bangalore");
//         lhs.add("Hyderabad");
//         lhs.add("Pune");
//         lhs.add(" ");
//         System.out.println(lhs);

//         TreeSet<String> ts = new TreeSet<>(); // TreeSet

//         ts.add("Delhi");
//         ts.add("Bangalore");
//         ts.add("Hyderabad");
//         ts.add("Pune");
//         ts.add(" ");  // null values are not allowed
//         System.out.println(ts);

//     }

// }

// Count distinct elements 
// import java.util.*;

// public class Hashing { // 246
//     public static void main(String args[]) {
//         int arr[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1, 8 };
//         HashSet<Integer> set = new HashSet<>();

//         for (int i = 0; i < arr.length; i++) {
//             set.add(arr[i]);
//         }

//         System.out.println("ans = " + set.size());
//     }

// }

// // Union and intersection problem
// import java.util.*; // 247

// public class Hashing {
//     public static void main(String args[]) {
//         int arr1[] = { 7, 3, 9 };
//         int arr2[] = { 6, 3, 9, 2, 9, 4 };
//         HashSet<Integer> set = new HashSet<>();

//         // union
//         for (int i = 0; i < arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         for (int i = 0; i < arr2.length; i++) {
//             set.add(arr2[i]);
//         }

//         System.out.println("union= " + set.size() + " " + set);

//         // Intersection
//         set.clear();
//         for (int i = 0; i < arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         int count = 0;
//         for (int i = 0; i < arr2.length; i++) {
//             if (set.contains(arr2[i])) {
//                 count++;
//                 set.remove(arr2[i]);
//                 System.out.print(arr2[i] + " ");
//             }
//         }
//         System.out.println();

//         System.out.println("intersection= " + count);

//     }

// }

// // Largest sub-array with 0 sum
// import java.util.*; // 248

// public class Hashing {
//     public static void main(String args[]) { // O(n)
//         int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };

//         HashMap<Integer, Integer> map = new HashMap<>();
//         // (sum, idx)
//         int sum = 0;
//         int len = 0;

//         for (int j = 0; j < arr.length; j++) {
//             sum += arr[j];
//             if (map.containsKey(sum)) {
//                 len = Math.max(len, j - map.get(sum)); // map.get(sum) gives the value of the index here
//             } else {
//                 map.put(sum, j); // sum[0,j] - sum[0,i] = sum[i+1, j] -> sum(j)-sum(i)=0
//             }
//         }

//         System.out.println(len);
//     }

// }



// // Sub-array sum equal to K
// import java.util.*; // 249

// public class Hashing {
//     public static void main(String args[]) { // O(n)
//         int arr[] = { 10, 2, -2, -20, 10 };
//         int k = -10;

//         HashMap<Integer, Integer> map = new HashMap<>();
//         // (sum, count)
//         map.put(0, 1); // add these default values

//         int sum = 0;
//         int ans = 0;

//         for (int j = 0; j < arr.length; j++) {
//             sum += arr[j];
//             if (map.containsKey(sum - k)) {
//                 ans += map.get(sum - k); // sum(j)= sum(i)+k => sum(i) = sum(j)-k
//             }
//             map.put(sum, map.getOrDefault(sum, 0) + 1);
//         }

//         System.out.println(ans);
//     }

// }





