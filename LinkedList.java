// import java.util.*;
// public class LinkedList{

//   public static class Node { // Linkedlist basics
//     int data;
//     Node next;

//     public Node(int data) {
//       this.data = data;
//       this.next = null;
//     }
//   }

//   public static Node head;
//   public static Node tail;
//   public static int size;

//   public void addFirst(int data) {
//     Node newNode = new Node(data); // Step-1: Create new node
//     size++;
//     if (head == null) {
//       head = tail = newNode;
//       return;
//     }
//     newNode.next = head; // Step-2: newNode next = head
//     head = newNode; // Step-3: head = newNode

//   }

//   public void addLast(int data) {
//     Node newNode = new Node(data); // Step-1: Create new node
//     size++;
//     if (head == null) {
//       head = tail = newNode;
//       return;
//     }
//     tail.next = newNode; // Step-2: tail next = newNode
//     tail = newNode; // Step-3: tail = newNode

//   }

//   public void add(int idx, int data) { // insertion
//     if (idx == 0) {
//       addFirst(data); // inserting at the very first position
//       return;
//     }
//     Node newNode = new Node(data);
//     size++;
//     Node temp = head;
//     int i = 0;

//     while (i < idx - 1) {
//       temp = temp.next;
//       i++;
//     }

//     // if i = idx-1; temp->prev
//     newNode.next = temp.next;
//     temp.next = newNode;

//   }

//   public int removeFirst() {
//     if (size == 0) {
//       System.out.println("LL is empty");
//       return Integer.MIN_VALUE;
//     } else if (size == 1) {
//       int val = head.data; // or int val = tail.data
//       head = tail = null;
//       size = 0;
//       return val;
//     }
//     int val = head.data;
//     head = head.next;
//     size--;
//     return val;
//   }

//   public int removeLast() {
//     if (size == 0) {
//       System.out.println("LL is empty");
//       return Integer.MIN_VALUE;
//     } else if (size == 1) {
//       int val = head.data; // or int val = tail.data
//       head = tail = null;
//       size = 0;
//       return val;
//     }

//     // prev : i = size-2 (2nd last element)

//     Node prev = head; // prev = temp here
//     for (int i = 0; i < size - 2; i++) {
//       prev = prev.next;
//     }

//     int val = prev.next.data;
//     prev.next = null;
//     tail = prev;
//     size--;

//     return val;
//   }

//   public void print() {
//     Node temp = head;
//     while (temp != null) {
//       System.out.print(temp.data + "->");
//       temp = temp.next;
//     }
//     System.out.println("null");
//   }

//   public static void main(String args[]) {
//     LinkedList ll = new LinkedList();
//     // ll.print();
//     ll.addFirst(2);
//     // ll.print();
//     ll.addFirst(1);
//     // ll.print();
//     ll.addLast(3);
//     // ll.print();
//     ll.addLast(4);
//     // ll.print();
//     ll.add(2, 9); // insert an element in the middle
//     ll.print();

//     ll.removeFirst();
//     ll.print();

//     ll.removeLast();
//     ll.print();

//     System.out.println(ll.size);

//   }

// }





// // Search for key using Iterative method
// public class LinkedList { // 148

//   public static class Node {
//     int data;
//     Node next;

//     public Node(int data) { // TC = O(n)
//       this.data = data;
//       this.next = null;
//     }
//   }

//   public static Node head;
//   public static Node tail;
//   public static int size; // size will be set to 0 by java

//   public int itrSearch(int key) {
//     Node temp = head;
//     int i = 0;

//     while (temp != null) {
//       if (temp.data == key) { // if key is found
//         return i;
//       }
//       // iterative approach
//       temp = temp.next;
//       i++;
//     }

//     return -1; // if key is not found

//   }

//   public void addFirst(int data) {
//     Node newNode = new Node(data); // Step-1: Create new node
//     size++;
//     if (head == null) {
//       head = tail = newNode;
//       return;
//     }
//     newNode.next = head; // Step-2: newNode next = head
//     head = newNode; // Step-3: head = newNode

//   }

//   public void print() {
//     Node temp = head;
//     while (temp != null) {
//       System.out.print(temp.data + "->");
//       temp = temp.next;
//     }
//     System.out.println("null");
//   }

//   public static void main(String args[]) {
//     LinkedList ll = new LinkedList();
//     ll.addFirst(2);
//     ll.addFirst(1);
//     ll.addFirst(4);
//     ll.addFirst(5);
//     ll.addFirst(6);

//     ll.print();

//     System.out.print(ll.itrSearch(4)+" ");
//     System.out.print(ll.itrSearch(10));

//   }

// }




// // Search for key using recursive method

// public class LinkedList {

//   public static class Node { // 148
//     int data;
//     Node next;

//     public Node(int data) {
//       this.data = data;
//       this.next = null;
//     }
//   }

//   public static Node head;
//   public static Node tail;
//   public static int size; // size will be set to 0 by java

//   public int helper(Node head, int key) {
//     if (head == null) {
//       return -1;
//     }

//     if (head.data == key) {
//       return 0;
//     }

//     int idx = helper(head.next, key);
//     if (idx == -1) {
//       return -1;
//     }
//     return idx + 1;

//   }

//   public int recSearch(int key) {
//     return helper(head, key); // recursive call
//   }

//   public void addFirst(int data) {
//     Node newNode = new Node(data); // Step-1: Create new node
//     size++;
//     if (head == null) {
//       head = tail = newNode;
//       return;
//     }
//     newNode.next = head; // Step-2: newNode next = head
//     head = newNode; // Step-3: head = newNode

//   }

//   public void print() {
//     Node temp = head;
//     while (temp != null) {
//       System.out.print(temp.data + "->");
//       temp = temp.next;
//     }
//     System.out.println("null");
//   }

//   public static void main(String args[]) {
//     LinkedList ll = new LinkedList();
//     ll.addFirst(2);
//     ll.addFirst(1);
//     ll.addFirst(4);
//     ll.addFirst(5);
//     ll.addFirst(6);

//     ll.print();

//     System.out.println(ll.recSearch(4));
//     System.out.println(ll.recSearch(10));

//   }

// }








// public class LinkedList{  
//                                                                            // reverse a linkedlist**
//    public static class Node{                     
//      int data;
//      Node next;
    
//      public Node(int data){                                                  // 149                                   
//        this.data = data;
//        this.next = null;
//      }
//   }


//   public static Node head;
//   public static Node tail;
//   public static int size; 


//  public void reverse(){                                                        // TC=O(n)
//      Node prev = null;
//      Node curr = tail = head ;
//      Node next;

//      while(curr != null){
//        next = curr.next;
//        curr.next = prev;
//        prev = curr;
//        curr = next;
//      }
//      head = prev;
//  }


//  public void addFirst(int data){
//   Node newNode = new Node(data);     // Step-1: Create new node
//   size++;
//   if(head == null){ 
//     head = tail = newNode;
//     return;
//   }
//    newNode.next = head;             // Step-2: newNode next = head 
//    head = newNode;                  // Step-3: head = newNode

//  }


//   public void print(){
//       Node temp = head;
//       while(temp != null){
//           System.out.print(temp.data+"->");
//           temp = temp.next;
//       }
//       System.out.println("null");
//      }

// public static void main(String args[]){
// LinkedList ll = new LinkedList();
// ll.addFirst(2);
// ll.addFirst(3);
// ll.addFirst(4);
// ll.addFirst(5);
// ll.addFirst(6);

// ll.print();
// ll.reverse();
// ll.print();

// } 

// }





// // Remove nth node from the end
// public class LinkedList { // 150

//   public static class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//       this.data = data;
//       this.next = null;
//     }

//   }

//   public static Node head;
//   public static Node tail;
//   public static int size;

//   public void deleteNthfromEnd(int n) {
//     // calculate size
//     int sz = 0;
//     Node temp = head;
//     while (temp != null) {
//       temp = temp.next;
//       sz++;
//     }

//     if (n == sz) {
//       head = head.next; // removeFirst
//       return;
//     }

//     // sz-1
//     int i = 1;
//     int iToFind = sz - n;
//     Node prev = head;
//     while (i < iToFind) {
//       prev = prev.next;
//       i++;
//     }

//     prev.next = prev.next.next;
//     return;

//   }

//   public void addFirst(int data) {
//     Node newNode = new Node(data); // Step-1: Create new node
//     if (head == null) {
//       head = tail = newNode;
//       return;
//     }
//     newNode.next = head; // Step-2: newNode next = head
//     head = newNode; // Step-3: head = newNode

//   }

//   public void print() {
//     Node temp = head;
//     while (temp != null) {
//       System.out.print(temp.data + "->");
//       temp = temp.next;
//     }
//     System.out.println("null");
//   }

//   public static void main(String args[]) {
//     LinkedList ll = new LinkedList();
//     ll.addFirst(5);
//     ll.addFirst(4);
//     ll.addFirst(3);
//     ll.addFirst(2);
//     ll.addFirst(1);

//     ll.print();
//     ll.deleteNthfromEnd(4);
//     ll.print();
//   }

// }





// // Palindrome problem in linkedlist
// import java.util.*;


// public class LinkedList { // 151

//   public static class Node {
//     int data;
//     Node next;

//     public Node(int data) {
//       this.data = data;
//       this.next = null;
//     }

//   }

//   public static Node head;
//   public static Node tail;
//   public static int size;

//   // Slow-fast approach
//   public Node findMid(Node head) {
//     Node slow = head;
//     Node fast = head;

//     while (fast != null && fast.next != null) { // helper
//       slow = slow.next; // +1
//       fast = fast.next.next; // +2
//     }
//     return slow; // slow is the midNode
//   }

//   public boolean checkPalindrome() {
//     if (head == null || head.next == null) {
//       return true;
//     }
//     // step1- find mid
//     Node midNode = findMid(head);

//     // step2- reverse 2nd half
//     Node prev = null;
//     Node curr = midNode; // midNode is taken 1st node in 2nd half
//     Node next;

//     while (curr != null) {
//       next = curr.next;
//       curr.next = prev;
//       prev = curr;
//       curr = next;
//     }

//     Node right = prev; // right half head
//     Node left = head;

//     // step3- check left half and right half
//     while (right != null) {
//       if (left.data != right.data) {
//         return false;
//       }
//       left = left.next;
//       right = right.next;
//     }

//     return true;
//   }

//   public void addFirst(int data) {
//     Node newNode = new Node(data); // Step-1: Create new node
//     if (head == null) {
//       head = tail = newNode;
//       return;
//     }
//     newNode.next = head; // Step-2: newNode next = head
//     head = newNode; // Step-3: head = newNode

//   }

//   public void print() {
//     Node temp = head;
//     while (temp != null) {
//       System.out.print(temp.data + "->");
//       temp = temp.next;
//     }
//     System.out.println("null");
//   }

//   public static void main(String args[]) {
//     LinkedList ll = new LinkedList();
//     ll.addFirst(1);
//     ll.addFirst(2);
//     ll.addFirst(2);
//     ll.addFirst(1);

//     ll.print();
//     System.out.println(ll.checkPalindrome());

//   }

// }


