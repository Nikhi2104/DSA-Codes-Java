// import java.util.LinkedList;

// public class LinkedList2 { // floyd's cycle

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) { // 152
//             this.data = data;
//             this.next = null;
//         }

//     }

//     public static Node head;
//     public static Node tail;

//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next; // +1
//             fast = fast.next.next; // +2
//             if (slow == fast) {
//                 return true; // cycle exists
//             }
//         }

//         return false; // cycle doesn't exists
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String args[]) {
//         head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = head;
//         // 1->2->3
//         System.out.println(isCycle());

//     }

// }





// // Remove Cycle
// import java.util.LinkedList;

// public class LinkedList2 { // 153

//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }

//     }

//     public static Node head;
//     public static Node tail;

//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next; // +1
//             fast = fast.next.next; // +2
//             if (slow == fast) {
//                 return true; // cycle exists
//             }
//         }

//         return false; // cycle doesn't exists
//     }

//     public static void removeCycle() {
//         // detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) {
//                 cycle = true;
//                 break;
//             }
//         }

//         if (cycle == false) {
//             return;
//         }

//         // find meeting point
//         slow = head;
//         Node prev = null; // last node
//         while (slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         // remove cycle-> last.next = null;
//         prev.next = null;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String args[]) {
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;
//         // head.next.next.next = head;
//         // 1->2->3
//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());
//     }

// }





// import java.util.LinkedList;

// public class LinkedList2 {

//     public static void main(String args[]) { // LinkedList from JCF(Java collection framework)
//         // create
//         LinkedList<Integer> ll = new LinkedList<>();

//         // add
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addFirst(0);
//         // 0->1->2
//         System.out.println(ll);

//         // remove
//         ll.removeFirst();
//         ll.removeLast();

//         System.out.println(ll);

//     }
// }




// import java.util.*;
// import java.util.LinkedList;

// public class LinkedList2 {

//     public static class Node { // 154
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }

//     }

//     public static Node head;
//     public static Node tail;

//     private Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow; // mid node
//     }

//     public Node merge(Node head1, Node head2) { // Merge sort on LinkedList
//         Node mergedLL = new Node(-1);
//         Node temp = mergedLL;

//         while (head1 != null && head2 != null) {
//             if (head1.data <= head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }
//         }

//         while (head1 != null) {
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }

//         while (head2 != null) {
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }
//         return mergedLL.next;

//     }

//     public Node mergeSort(Node head) {
//         if (head == null || head.next == null) {
//             return head;
//         }

//         // find mid
//         Node mid = getMid(head);
//         // left & right MS
//         Node righthead = mid.next;
//         mid.next = null;
//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(righthead);

//         // merge
//         return merge(newLeft, newRight);

//     }

//     public void addFirst(int data) {
//         Node newNode = new Node(data); // Step-1: Create new node
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head; // Step-2: newNode next = head
//         head = newNode; // Step-3: head = newNode

//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String args[]) {

//         LinkedList2 ll = new LinkedList2();

//         ll.addFirst(1);
//         ll.addFirst(3);
//         ll.addFirst(5);
//         ll.addFirst(4);
//         ll.addFirst(2);
//         // 2->4->5->3->1

//         ll.print();
//         ll.head = ll.mergeSort(ll.head);
//         ll.print();

//     }

// }




// import java.util.*;
// public class LinkedList2 { // 155
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) { // Zig-Zag LL code
//             this.data = data;
//             this.next = null;
//         }

//     }

//     public static Node head;
//     public static Node tail;

//     public void Zigzag() {
//         // find mid
//         Node slow = head;
//         Node fast = head.next;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         Node mid = slow;

//         // reverse 2nd half
//         Node curr = mid.next;
//         mid.next = null;
//         Node prev = null;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         Node left = head;
//         Node right = prev;
//         Node nextL, nextR;

//         // alt merge or zigzag merge
//         while (left != null && right != null) {
//             nextL = left.next;
//             left.next = right;
//             nextR = right.next;
//             right.next = nextL;

//             left = nextL;
//             right = nextR;
//         }

//     }

//     public void addFirst(int data) {
//         Node newNode = new Node(data); // Step-1: Create new node
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head; // Step-2: newNode next = head
//         head = newNode; // Step-3: head = newNode

//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String args[]) {

//         LinkedList2 ll = new LinkedList2();

//         ll.addFirst(6);
//         ll.addFirst(5);
//         ll.addFirst(4);
//         ll.addFirst(3);
//         ll.addFirst(2);
//         ll.addFirst(1);

//         // 1->2->3->4->5->6

//         ll.print();
//         ll.Zigzag();
//         ll.print();

//     }

// }





// import java.util.*;
// public class DoublyLL { // DoublyLL basics

//     public static class Node {
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     // add
//     public void addFirst(int data) {
//         Node newNode = new Node(data); // Step-1: Create new node
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head; // Step-2: newNode next = head
//         head.prev = newNode; // Step-3: head = newNode
//         head = newNode;

//     }

//     // print
//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "<->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     // remove- removeFirst
//     public int removeFirst() {
//         if (head == null) {
//             System.out.println("Dll is empty");
//             return Integer.MIN_VALUE;
//         }

//         if (size == 1) {
//             int val = head.data;
//             head = tail = null;
//             size--;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         head.prev = null;
//         size--;
//         return val;

//     }

//     public static void main(String args[]) {

//         DoublyLL dll = new DoublyLL();

//         dll.addFirst(3);
//         dll.addFirst(2);
//         dll.addFirst(1);

//         dll.print();
//         System.out.println(dll.size);

//         dll.removeFirst();
//         dll.print();
//         System.out.println(dll.size);
//     }

// }





// public class DoublyLL { // Reversing a DoublyLL

//     public static class Node {
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data) { // 156
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }

//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     // reverse function
//     public void reverse() {
//         Node curr = head;
//         Node prev = null;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             curr.prev = next;

//             prev = curr;
//             curr = next;
//         }
//         head = prev;

//     }

//     // add
//     public void addFirst(int data) {
//         Node newNode = new Node(data); // Step-1: Create new node
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head; // Step-2: newNode next = head
//         head.prev = newNode; // Step-3: head = newNode
//         head = newNode;

//     }

//     // print
//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "<->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String args[]) {

//         DoublyLL dll = new DoublyLL();

//         dll.addFirst(3);
//         dll.addFirst(2);
//         dll.addFirst(1);

//         dll.print();
//         dll.reverse();
//         dll.print();

//     }

// }



