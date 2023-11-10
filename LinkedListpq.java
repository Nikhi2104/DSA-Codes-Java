// //// 1
// public class LinkedListpq {

//   public static class Node { // 157
//     int data;
//     Node next;

//     public Node(int data) {
//       this.data = data;
//       this.next = null;
//     }

//   }

//   public Node getIntersectionNode(Node head1, Node head2) { // insertion of 2 linkedlists
//     while (head2 != null) {
//       Node temp = head1;
//       while (temp != null) {
//         if (temp == head2) {
//           return head2;
//         }
//         temp = temp.next;
//       }
//       head2 = head2.next;
//     }
//     return null;

//   }

//   public static void main(String args[]) { // TC = O(n*m)
//     LinkedListpq ll = new LinkedListpq(); // SC = O(1)

//     Node head1, head2;
//     head1 = new Node(4);
//     head2 = new Node(1);

//     Node newNode = new Node(2);
//     head2.next = newNode;

//     newNode = new Node(3);
//     head2.next.next = newNode;

//     newNode = new Node(6);
//     head1.next = newNode;

//     head1.next = new Node(5);
//     head1.next.next = newNode; // LL-1
//     head2.next.next.next = newNode; // LL-2

//     newNode = new Node(7);
//     head1.next.next.next = newNode;

//     head1.next.next.next.next = null;

//     Node intersectionPoint = ll.getIntersectionNode(head1, head2);

//     if (intersectionPoint == null) {
//       System.out.println("No Intersection Point: ");
//     } else {
//       System.out.println("Intersection Point: " + intersectionPoint.data);

//     }

//   }

// }






// // 2
// import java.util.LinkedList;

// public class LinkedListpq {

//   public static class Node { // delete M nodes after N node in a linkedlist
//     int data;
//     Node next;
//   }

//   public static Node push(Node headRef, int new_data) { // TC = O(n)
//     Node newNode = new Node(); // SC = O(1)
//     newNode.data = new_data;
//     newNode.next = (headRef);      // similar to addfirst function(fn)
//     (headRef) = newNode;
//     return headRef;

//   }

//   public static void printList(Node head) { // 158
//     Node temp = head;
//     while (temp != null) {
//       System.out.print(temp.data + "->");
//       temp = temp.next;

//     }
//     System.out.println("null");
//   }

//   public static void skipMdeleteN(Node head, int M, int N) {
//     Node curr = head, t;
//     int count = 0;

//     while (curr != null) {
//       for (count = 1; count < M && curr != null; count++)
//         curr = curr.next;
//       if (curr == null) {
//         return; // base case
//       }
//       t = curr.next;

//       for (count = 1; count <= N && t != null; count++) {
//         Node temp = t;
//         t = t.next;
//       }
//       curr.next = t;
//       curr = t;

//     }

//   }

//   public static void main(String args[]) {
//     Node head = null;
//     int M = 2, N = 2;
//     head = push(head, 10);
//     head = push(head, 9);
//     head = push(head, 8);
//     head = push(head, 7);
//     head = push(head, 6);
//     head = push(head, 5);
//     head = push(head, 4);
//     head = push(head, 3);
//     head = push(head, 2);
//     head = push(head, 1);

//     printList(head);

//     skipMdeleteN(head, M, N);

//     printList(head);

//   }

// }





// // 3
// import java.util.LinkedList;

// public class LinkedListpq { // TC = O(n)
//   public static class Node { // SC = O(1)
//     int data;
//     Node next;

//     public Node(int data) {
//       this.data = data;
//       this.next = null;
//     }

//   }

//   public static Node head;

//   public static void swapNodes(int x, int y) { // 159

//     if (x == y) {
//       return;
//     }

//     Node prev = null, curr = head;

//     while (curr != null && curr.data != x) {
//       prev = curr;
//       curr = curr.next;
//     }

//     Node prev2 = null, curr2 = head;

//     while (curr2 != null && curr2.data != y) {
//       prev2 = curr2;
//       curr2 = curr2.next;
//     }

//     if (curr == null || curr2 == null) {   
//       return;
//     }

//     if (prev != null) {
//       prev.next = curr2;
//     } else {
//       head = curr2;
//     }

//     if (prev2 != null) {
//       prev2.next = curr;
//     } else {
//       head = curr;
//     }

//     Node temp = curr.next;
//     curr.next = curr2.next; // swapping
//     curr2.next = temp;

//   }

//   public void push(int new_data) {
//     Node newNode = new Node(new_data);
//     newNode.next = head;
//     head = newNode;
//   }


//   public void printList() {
//     Node temp = head;
//     while (temp != null) {
//       System.out.print(temp.data + "->");
//       temp = temp.next;

//     }
//     System.out.println("null");
//   }

//   public static void main(String args[]) {
//     LinkedListpq ll = new LinkedListpq();

//     ll.push(10);
//     ll.push(9);
//     ll.push(8);
//     ll.push(7);
//     ll.push(6);
//     ll.push(5);
//     ll.push(4);
//     ll.push(3);
//     ll.push(2);
//     ll.push(1);

//     ll.printList();

//     ll.swapNodes(2, 8);

//     ll.printList();

//   }

// }





// // 4
// import java.util.LinkedList;

// public class LinkedListpq { // Odd Even LinkedList
//   public static class Node {
//     int data;
//     Node next;

//     public Node(int data) { // TC = O(n)
//       this.data = data; // SC = O(1)
//       this.next = null;
//     }

//   }

//   static Node head;

//   void segregateEvenOdd() { // not clear*
//     Node end = head;
//     Node prev = null;
//     Node curr = head;

//     while (end.next != null) { // 160
//       end = end.next;  // end is traversing the LL
//     }

//     Node newEnd = end;

//     while (curr.data % 2 != 0 && curr != end) { // Odd Count
//       newEnd.next = curr;
//       curr = curr.next;
//       newEnd.next.next = null;
//       newEnd = newEnd.next;
//     }

//     if (curr.data % 2 == 0) { // Even Count
//       head = curr;
//       while (curr != end) {
//         if (curr.data % 2 == 0) {
//           prev = curr;
//           curr = curr.next;
//         } else {
//           prev.next = curr.next;
//           curr.next = null;
//           newEnd.next = curr;
//           newEnd = curr;
//           curr = prev.next;
//         }

//       }
//     }

//     else
//       prev = curr;
//     if (newEnd != end && end.data % 2 != 0) {
//       prev.next = end.next;
//       end.next = null;
//       newEnd.next = end;

//     }

//   }

//   void push(int new_data) {
//     Node newNode = new Node(new_data);
//     newNode.next = head;
//     head = newNode;
//   }

//   void printList() {
//     Node temp = head;
//     while (temp != null) {
//       System.out.print(temp.data + "->");
//       temp = temp.next;

//     }
//     System.out.println("null");
//   }

//   public static void main(String args[]) {
//     LinkedListpq ll = new LinkedListpq();

//     ll.push(11);
//     ll.push(10);
//     ll.push(8);
//     ll.push(5);
//     ll.push(4);
//     ll.push(2);
//     ll.push(6);
//     ll.push(3);
//     ll.push(2);
//     ll.push(1);

//     ll.printList();

//     ll.segregateEvenOdd();

//     ll.printList();

//   }

// }





// 5
import java.util.LinkedList;

public class LinkedListpq { // Merge k sorted lists

  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      // this.next = null;
    }
  }

  public static Node head;

  public static Node SortedMerge(Node a, Node b) { // 161
    Node result = null;
    if (a == null)
      return b;
    else if (b == null)
      return a;
    if (a.data <= b.data) {
      result = a;
      result.next = SortedMerge(a.next, b); // recursive call
    } else {
      result = b;
      result.next = SortedMerge(a, b.next); // recursive call
    }
    return result;

  }

  public static Node mergeKlists(Node arr[], int last) {
    while (last != 0) {
      int i = 0, j = last;
      while (i < j) {
        arr[i] = SortedMerge(arr[i], arr[j]); // function call
        i++;
        j--;
        if (i >= j)
          last = j;
      }
    }
    return arr[0];  //  final result arr

  }

  static void printList(Node temp) {
    // Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;

    }
    System.out.println("null");
  }

  public static void main(String args[]) {
    int k = 3;
    int n = 4;
    Node arr[] = new Node[k];

    arr[0] = new Node(1);
    arr[0].next = new Node(3);
    arr[0].next.next = new Node(5);
    arr[0].next.next.next = new Node(7);

    arr[1] = new Node(2);
    arr[1].next = new Node(4);
    arr[1].next.next = new Node(6);
    arr[1].next.next.next = new Node(8);

    arr[2] = new Node(0);
    arr[2].next = new Node(9);
    arr[2].next.next = new Node(10);
    arr[2].next.next.next = new Node(11);

    Node head = mergeKlists(arr, k - 1);
    printList(head);

  }

}










