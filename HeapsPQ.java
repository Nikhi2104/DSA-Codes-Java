
// PRIORITY QUEUES
// import java.util.*; // basics
// import java.util.PriorityQueue;

// public class HeapsPQ {

//     public static void main(String args[]) {
//         // PriorityQueue<Integer> pq = new PriorityQueue<>();
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//         pq.add(3); // O(logn)
//         pq.add(4);
//         pq.add(1);
//         pq.add(7);

//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek()); // O(1)
//             pq.remove(); // O(logn)

//         }

//     }
// }

// // HEAPS
// import java.util.*; // Insert,Peek,Remove & Heapify functions
// import java.util.ArrayList;

// public class HeapsPQ {

//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>(); // global arraylist 

//         public void add(int data) { // O(logn)

//             arr.add(data); // add at last index
//             int x = arr.size() - 1; // x is child index
//             int par = (x - 1) / 2; // par index

//             while (arr.get(x) < arr.get(par)) { // O(logn)
//                 // swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x - 1) / 2;

//             }
//         }

//         public int peek() {
//             return arr.get(0);
//         }

//         private void heapify(int i) {
//             int left = 2 * i + 1;
//             int right = 2 * i + 2;
//             int minIdx = i;

//             if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
//                 minIdx = left;
//             }

//             if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
//                 minIdx = right;
//             }

//             if (minIdx != i) {
//                 // swap
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx));
//                 arr.set(minIdx, temp);

//                 heapify(minIdx);

//             }

//         }

//         public int remove() {
//             int data = arr.get(0);

//             // step-1 - swap first and last
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size() - 1));
//             arr.set(arr.size() - 1, temp);

//             // step-2 - delete last
//             arr.remove(arr.size() - 1);

//             // step-3 - heapify
//             heapify(0);

//             return data;
//         }

//         public boolean isEmpty() {
//             return arr.size() == 0;
//         }
//     }

//     public static void main(String args[]) {
//         Heap h = new Heap();
//         h.add(3);
//         h.add(4);
//         h.add(1);
//         h.add(5);

//         while (!h.isEmpty()) {
//             System.out.println(h.peek());
//             h.remove();
//         }
//     }

// }

// // HEAP SORT
// import java.util.*; // 236

// public class HeapsPQ {

//     public static void heapify(int arr[], int i, int size) {
//         int left = 2 * i + 1;
//         int right = 2 * i + 2;
//         int maxIdx = i;

//         if (left < size && arr[left] > arr[maxIdx]) {
//             maxIdx = left;
//         }

//         if (right < size && arr[right] > arr[maxIdx]) {
//             maxIdx = right;
//         }

//         if (maxIdx != i) {
//             // swap
//             int temp = arr[i];
//             arr[i] = arr[maxIdx];
//             arr[maxIdx] = temp;

//             heapify(arr, maxIdx, size);
//         }
//     }

//     public static void heapSort(int arr[]) {

//         // step-1 - build maxheap
//         int n = arr.length;
//         for (int i = n / 2; i >= 0; i--) {
//             heapify(arr, i, n);
//         }

//         // step - 2 - push largest at end
//         for (int i = n - 1; i > 0; i--) {
//             // swap (largest first with last)
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr, 0, i);
//         }

//     }

//     public static void main(String args[]) {
//         int arr[] = { 1, 2, 4, 5, 3 };
//         heapSort(arr);

//         // Print
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

// }

// // Nearby Cars
// import java.util.*; // 237

// public class HeapsPQ {
//     static class Point implements Comparable<Point> {
//         int x, y, distSq, idx;

//         public Point(int x, int y, int distSq, int idx) {
//             this.x = x;
//             this.y = y;
//             this.distSq = distSq;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Point p2) {
//             return this.distSq - p2.distSq;
//         }

//     }

//     public static void main(String args[]) {
//         int pts[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
//         int k = 2;

//         PriorityQueue<Point> pq = new PriorityQueue<>();
//         for (int i = 0; i < pts.length; i++) {
//             int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
//             pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
//         }

//         // nearest K cars
//         for (int i = 0; i < k; i++) {
//             System.out.println("C" + pq.remove().idx);
//         }

//     }

// }




// // Connect N Ropes
// import java.util.*;

// public class HeapsPQ {
//     public static void main(String args[]) {
//         int ropes[] = { 2, 3, 3, 4, 6 };

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for (int i = 0; i < ropes.length; i++) {
//             pq.add(ropes[i]);
//         }

//         int cost = 0;
//         while (pq.size() > 1) {
//             int min = pq.remove();
//             int min2 = pq.remove();
//             cost += min + min2;
//             pq.add(min + min2);
//         }

//         System.out.println("Cost of connecting N ropes = " + cost);

//     }

// }



// import java.util.*; // doubt

// public class HeapsPQ { // 238
//     static class Row implements Comparable<Row> {
//         int soldiers;
//         int idx;

//         public Row(int soldiers, int idx) {
//             this.soldiers = soldiers;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Row r2) {
//             if (this.soldiers == r2.soldiers) {
//                 return this.idx - r2.idx;
//             } else {
//                 return this.soldiers - r2.soldiers;
//             }
//         }

//     }

//     public static void main(String args[]) {
//         int army[][] = { { 1, 0, 0, 0 },
//                 { 1, 1, 1, 1 },
//                 { 1, 0, 0, 0 },
//                 { 1, 0, 0, 0 } };

//         int k = 2;

//         PriorityQueue<Row> pq = new PriorityQueue<>();

//         for (int i = 0; i < army.length; i++) {
//             int count = 0;
//             for (int j = 0; j < army[0].length; j++) {
//                 count += army[i][j] == 1 ? 1 : 0;
//             }
//             pq.add(new Row(count, i));
//         }

//         for (int i = 0; i < k; i++) {
//             System.out.println("R" + pq.remove().idx);
//         }

//     }

// }




// // Sliding Window Maximum
// import java.util.*; // 239

// public class HeapsPQ {
//     static class Pair implements Comparable<Pair> {
//         int val;
//         int idx;

//         public Pair(int val, int idx) {
//             this.val = val;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Pair p2) {
//             // // ascending
//             // return this.val - p2.val;
//             // descending
//              return p2.val-this.val;
//         }

//     }

//     public static void main(String args[]) {
//         int arr[] = { 1, -3, -1, -3, 5, 3, 6, 7 };
//         int k = 3; // window size
//         int res[] = new int[arr.length - k + 1];

//         PriorityQueue<Pair> pq = new PriorityQueue<>();

//         // 1st window
//         for (int i = 0; i < k; i++) {
//             pq.add(new Pair(arr[i], i));
//         }

//         res[0] = pq.peek().val;

//         for (int i = k; i < arr.length; i++) {
//             while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
//                 pq.remove();
//             }

//             pq.add(new Pair(arr[i], i));
//             res[i - k + 1] = pq.peek().val;

//         }

//         // print result
//         for (int i = 0; i < res.length; i++) {
//             System.out.print(res[i] + " ");
//         }
//         System.out.println();

//     }

// }







