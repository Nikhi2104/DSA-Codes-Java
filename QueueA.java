// public class QueueA {
//     static class Queue { // Queue implementation using arrays
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }

//         public static boolean isEmpty() { // 172
//             return rear == -1;
//         }

//         // add
//         public static void add(int data) {
//             if (rear == size - 1) {
//                 System.out.println("queue is full");
//                 return;
//             }
//             rear = rear + 1;
//             arr[rear] = data;

//         }

//         // remove
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("queue is empty");
//                 return -1;
//             }

//             int front = arr[0];
//             for (int i = 0; i < rear; i++) {
//                 arr[i] = arr[i + 1];
//             }
//             rear = rear - 1;
//             return front;
//         }

//         // peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         // 1 2 3

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }

// }




// public class QueueA {
//     static class Queue {
//         static int arr[]; // Circular Queue implementation using arrays
//         static int size;
//         static int rear;
//         static int front;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }

//         public static boolean isEmpty() { // 173
//             return rear == -1; // empty case
//         }

//         public static boolean isFull() {
//             return (rear + 1) % size == front; // full case
//         }

//         // add
//         public static void add(int data) {
//             if (isFull()) {
//                 System.out.println("Queue is full");
//                 return;
//             }

//             // add 1st element
//             if (front == -1) {
//                 front = 0;
//             }

//             rear = (rear + 1) % size;
//             arr[rear] = data;
//         }

//         // remove
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("queue is empty");
//                 return -1;
//             }

//             int result = arr[front];

//             // remove last element
//             if (rear == front) {
//                 rear = front = -1;
//             } else {
//                 front = (front + 1) % size;
//             }
//             return result;
//         }

//         // peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("queue is empty");
//                 return -1;
//             }
//             return arr[front];
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         // 1 2 3
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();

//         }

//     }

// }





// import java.util.*;
// public class QueueA {
//     static class Node { // 174
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null; // queue implementation using linkedlist
//         }
//     }

//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         // add
//         public static void add(int data) {
//             Node newNode = new Node(data);
//             if (head == null) {
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode;
//         }

//         // remove
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int front = head.data;
//             // single element
//             if (tail == head) {
//                 tail = head = null;
//             } else {
//                 head = head.next;
//             }
//             return front;
//         }

//         // peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("Empty queue");
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }

// }






// import java.util.*;

// public class QueueA { // using JCF

//     public static void main(String args[]) { // 175
//         // Queue q = new Queue();
//         // Queue<Integer> q = new LinkedList<>();
//         Queue<Integer> q = new ArrayDeque<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }

// }



// import java.util.*;

// public class QueueA {
//     static class Queue {
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() { // Queue using 2 stacks
//             return s1.isEmpty();
//         }

//         // add
//         public static void add(int data) {
//             while (!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while (!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         // remove
//         public static int remove() {
//             if (isEmpty()) {
//                 System.out.println("queue empty");
//                 return -1;
//             }
//             return s1.pop();
//         }

//         // peek
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("queue empty");
//                 return -1;
//             }
//             return s1.peek();
//         }

//     }

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }

//     }

// }






// import java.util.LinkedList;
// import java.util.*;

// public class QueueA { // 176
//     static class Stack {
//         static Queue<Integer> q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();

//         public static boolean isEmpty() {
//             return q1.isEmpty() && q2.isEmpty(); // Stacks using 2 Queues
//         }

//         // add/ push
//         public static void push(int data) {
//             if (!q1.isEmpty()) {
//                 q1.add(data);
//             } else {
//                 q2.add(data);
//             }
//         }

//         // pop/ remove
//         public static int pop() {
//             if (isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1;
//             }

//             int top = -1;

//             // case 1
//             if (!q1.isEmpty()) {
//                 while (!q1.isEmpty()) {
//                     top = q1.remove();
//                     if (q1.isEmpty()) {
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             } else { // case 2
//                 while (!q2.isEmpty()) {
//                     top = q2.remove();
//                     if (q2.isEmpty()) {
//                         break;
//                     }
//                     q1.add(top);
//                 }

//             }

//             return top;

//         }

//         // peek/top
//         public static int peek() {
//             if (isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top = -1;

//             // case 1
//             if (!q1.isEmpty()) {
//                 while (!q1.isEmpty()) {
//                     top = q1.remove();
//                     q2.add(top);
//                 }
//             } else { // case 2
//                 while (!q2.isEmpty()) {
//                     top = q2.remove();
//                     q1.add(top);
//                 }

//             }

//             return top;
//         }

//     }

//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }

//     }

// }




// import java.util.LinkedList;
// import java.util.*;

// public class QueueA {
//     public static void printnonRepeating(String str) { // 177
//         int freq[] = new int[26]; // 'a'-'z'
//         Queue<Character> q = new LinkedList<>();      // LinkedList or ArrayDeque

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i); // First non repeating letter in a stream of characters
//             q.add(ch); // Whenever in a question if a stream of letters is mentioned, it can be solved
//                        // through Queues
//             freq[ch - 'a']++;

//             while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
//                 q.remove();
//             }

//             if (q.isEmpty()) {
//                 System.out.print(-1 + " ");
//             } else {
//                 System.out.print(q.peek() + " ");
//             }

//         }

//         System.out.println();

//     }

//     public static void main(String args[]) {
//         String str = "aabccxb";
//         String str2 = "aabbcded";
//         printnonRepeating(str);

//     }

// }


// import java.util.LinkedList;
// import java.util.*; // 178

// public class QueueA {

//     public static void interLeave(Queue<Integer> q) { // Interleave 2 halves of a queue (Even length)
//         Queue<Integer> firstHalf = new LinkedList<>();
//         int size = q.size();

//         for (int i = 0; i < size / 2; i++) {
//             firstHalf.add(q.remove());
//         }

//         while (!firstHalf.isEmpty()) {
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }

//     }

//     public static void main(String args[]) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);

//         interLeave(q);
//         // print q
//         while (!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println();
//     }

// }




// import java.util.LinkedList;
// import java.util.*;

// public class QueueA { // reverse a queue
//     public static void reverse(Queue<Integer> q) {
//         Stack<Integer> s = new Stack<>();

//         while (!q.isEmpty()) {
//             s.push(q.remove());
//         }

//         while (!s.isEmpty()) {
//             q.add(s.pop());
//         }

//     }

//     public static void main(String args[]) { // 179
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         System.out.println(q); // 1 2 3 4 5

//         reverse(q);

//         while (!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println(); // 5 4 3 2 1

//     }

// }



// import java.util.LinkedList;
// import java.util.*;

// public class QueueA { // Deque basic operations
//     public static void main(String args[]) {
//         Deque<Integer> deque = new LinkedList<>(); // 180
//         deque.addFirst(1);
//         deque.addFirst(2);
//         deque.addLast(3);
//         deque.addLast(4);
//         // 2 1 3 4
//         System.out.println(deque);
//         deque.removeFirst();
//         System.out.println(deque);
//         deque.removeLast();
//         System.out.println(deque);

//         System.out.println("first el = " + deque.getFirst());
//         System.out.println("last el = " + deque.getLast());
//     }

// }




// import java.util.LinkedList;
// import java.util.*;

// public class QueueA {
//     static class Stack { // Stacks using deque
//         Deque<Integer> deque = new LinkedList<>();

//         public void push(int data) { // 181
//             deque.addLast(data);
//         }

//         public int pop() {
//             return deque.removeLast();
//         }

//         public int peek() {
//             return deque.getLast();
//         }

//     }

//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         System.out.println("peek = " + s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());

//     }

// }




// import java.util.*;

// public class QueueA {
//     static class Queue { // Queues using deque
//         Deque<Integer> deque = new LinkedList<>();

//         public void add(int data) {
//             deque.addFirst(data);
//         }

//         public int remove() {
//             return deque.removeLast(); // 182
//         }

//         public int peek() {
//             return deque.getLast();
//         }

//     }

//     public static void main(String args[]) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         System.out.println("peek = " + q.peek());
//         System.out.println(q.remove());
//         System.out.println(q.remove());
//         System.out.println(q.remove());

//     }

// }














