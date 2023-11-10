// // 1
// import java.util.LinkedList;
// import java.util.*;
// public class Queuepq {
//     static void printBinary(int n){
//         Queue<String> q  = new LinkedList<>();       // Generate binary numbers
//         q.add("1");                             // since range starts from 1 and goes to n
//         while((n--)>0){
//             String str1 = q.peek();             // front element is top here
//             q.remove();
//             System.out.print(str1+" ");            
//             String str2 = str1;
//             q.add(str1 + "0");
//             q.add(str1 + "1");

//         }
//  } 
    

// public static void main(String args[]){                        // 187
//    int n = 10, n2 = 6;
//    printBinary(n2);
//  }

// }




// // 2
// import java.util.*;

// class Queuepq {
//     static int minCost(int arr[], int n) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>(); // 188

//         for (int i = 0; i < n; i++) {
//             pq.add(arr[i]);
//         }

//         int res = 0;

//         while (pq.size() > 1) {
//             int first = pq.remove();
//             int second = pq.remove();
//             res += first + second;
//             pq.add(first + second);

//         }
//         return res;

//     }

//     public static void main(String args[]) {
//         int arr[] = { 4, 3, 2, 6 };
//         int arr2[] = {1,2,3};

//         int size = arr.length;
//         int size2 = arr2.length;

//         System.out.println("Total cost for connecting " + "ropes is: " + minCost(arr2, size2));

//     }

// }



// // 3
// import java.util.*;
// import java.util.ArrayList;

// public class Queuepq {
//     static class Job {
//         char job_id;
//         int deadline;
//         int profit;

//         Job(char job_id, int deadline, int profit) { // 189
//             this.deadline = deadline;
//             this.job_id = job_id;
//             this.profit = profit;
//         }
//     }

//     static void printJobScheduling(ArrayList<Job> arr) {
//         int n = arr.size();
//         Collections.sort(arr, (a, b) -> {
//             return a.deadline - b.deadline;  // doubt
//         });

//         ArrayList<Job> result = new ArrayList<>();
//         PriorityQueue<Job> maxHeap = new PriorityQueue<>((a, b) -> {
//             return b.profit - a.profit;
//         }); // job sequencing problem (similar problem can be found in greedy algo)

//         for (int i = n - 1; i > -1; i--) {
//             int slot_available;
//             if (i == 0) {
//                 slot_available = arr.get(i).deadline;
//             } else {
//                 slot_available = arr.get(i).deadline - arr.get(i - 1).deadline;
//             } // heaps is used here which will be learnt later so don't worry
//             maxHeap.add(arr.get(i));
//             while (slot_available > 0 && maxHeap.size() > 0) {
//                 Job job = maxHeap.remove();
//                 slot_available--;
//                 result.add(job);
//             }

//         }

//         Collections.sort(result, (a, b) -> {
//             return a.deadline - b.deadline;
//         });

//         for (Job job : result) {
//             System.out.print(job.job_id + " ");
//         }

//         System.out.println();

//     }

//     public static void main(String args[]) {
//         ArrayList<Job> arr = new ArrayList<>();

//         arr.add(new Job('a', 4, 20));
//         arr.add(new Job('b', 1, 10));
//         arr.add(new Job('c', 1, 40));
//         arr.add(new Job('d', 1, 30));

//         System.out.println("Maximum profit sequence of jobs");
//         printJobScheduling(arr);

//     }

// }







// //4
// import java.util.*;
// import java.util.LinkedList; // reversing the first k elements of a queue

// public class Queuepq {
//     static Queue<Integer> q; // global declaration of queue

//     static void reverseQueueFirstKElements(int k) {

//         if (q.isEmpty() == true || k > q.size())
//             return;       // Corner cases
//         if (k <= 0)
//             return;

//         Stack<Integer> s = new Stack<>(); // using stack to reverse the given range of numbers

//         for (int i = 0; i < k; i++) {
//             s.push(q.peek());
//             q.remove();
//         }

//         while (!s.empty()) {
//             q.add(s.peek());
//             s.pop();
//         }

//         for (int i = 0; i < q.size() - k; i++) { // 190
//             q.add(q.peek());
//             q.remove();

//         }

//     }

//     static void Print() {
//         while (!q.isEmpty()) {
//             System.out.print(q.peek() + " ");
//             q.remove();
//         }

//     }

//     public static void main(String args[]) {
//         q = new LinkedList<Integer>();
//         q.add(10);
//         q.add(20);
//         q.add(30);
//         q.add(40);
//         q.add(50);
//         q.add(60);
//         q.add(70);
//         q.add(80);
//         q.add(90);
//         q.add(100);

//         int k = 2;
//         reverseQueueFirstKElements(k);
//         Print();

//     }

// }






// // 5
// import java.util.*;
// import java.util.Deque;
// import java.util.LinkedList; // 191

// public class Queuepq {

//     public static void printMax(int arr[], int n, int k) { // Maximum of all subarrays of size k

//         Deque<Integer> deque = new LinkedList<>();
//         int i;
//         for (i = 0; i < k; ++i) {
//             while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
//                 deque.removeLast();
//                 deque.addLast(i);
//         }

//         for (; i < n; ++i) { // unique 'for' loop
//             System.out.print(arr[deque.peek()] + " ");
//             while (!deque.isEmpty() && deque.peek() <= i - k)
//                 deque.removeFirst();
//             while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) // not clear
//                 deque.removeLast();
//                 deque.addLast(i);

//         }
//         System.out.print(arr[deque.peek()]);
//     }

//     public static void main(String args[]) {
//         int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
//         int k = 3;
//         int n = arr.length;

//         printMax(arr, n, k);

//     }

// }















