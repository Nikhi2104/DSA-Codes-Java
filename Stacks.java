// import java.util.Stack;

// import java.util.ArrayList;

// public class Stacks {

//   public static class Stack {
//     public static ArrayList<Integer> list = new ArrayList<>(); // 162

//     public static boolean isEmpty() {
//       return list.size() == 0;
//     }

//     // push
//     public static void push(int data) { // Stacks implementation using Arraylists
//       list.add(data);
//     }

//     // pop
//     public static int pop() {
//       int top = list.get(list.size() - 1);
//       list.remove(list.size() - 1);
//       return top;
//     }

//     // peek
//     public static int peek() {
//       return list.get(list.size() - 1);
//     }

//   }

//   public static void main(String args[]) {
//     Stack s = new Stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     while (!s.isEmpty()) {
//       System.out.println(s.peek());
//       s.pop();
//     }

//   }

// }




// import java.util.LinkedList;

// public class Stacks {

// public static class Node {                                         // 163
//   int data;
//   Node next;
//     Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }


// public static class Stack{
//     static Node head = null;
//     public static boolean isEmpty(){                                 // Stacks implementation using Linkedlists
//         return head == null;
//       }
     

//    // push 
//    public static void push(int data){
//     Node newNode = new Node(data);

//       if(isEmpty()){
//         head = newNode;
//         return;
//       }
//       newNode.next = head;
//       head = newNode;
         
//    }

//   // pop
//   public static int pop(){
//    if(isEmpty()){
//     return -1;
//    }
//    int top = head.data;
//    head = head.next;
//    return top;
//   } 

//   // peek
//   public static int peek(){
//     if(isEmpty()){
//         return -1;
//       }
//       return head.data;
//   }

// }


//   public static void main(String args[]){
//     Stack s = new Stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);
    
//     while(!s.isEmpty()){
//     System.out.println(s.peek());
//     s.pop();
//    }

//   }

// }






// import java.util.*;

// public class Stacks { // direct implementation using JCF
//   public static void main(String args[]) {
//     // Stacks s = new Stack();
//     Stack<Integer> s = new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     while (!s.isEmpty()) {
//       System.out.println(s.peek());
//       s.pop();
//     }

//   }

// }




// import java.util.*;

// public class Stacks {
//   public static void pushAtBottom(Stack<Integer> s, int data) { // 164
//     if (s.isEmpty()) {
//       s.push(data);
//       return;
//     }
//     int top = s.pop();
//     pushAtBottom(s, data); // Recursive call
//     s.push(top);

//   }

//   public static void main(String args[]) { // push at the bottom of the stack
//     // Stacks s = new Stack();
//     Stack<Integer> s = new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     pushAtBottom(s, 4);

//     while (!s.isEmpty()) {
//       System.out.println(s.pop());
//     }

//   }

// }




// import java.util.*;

// public class Stacks {
//   public static String reverseString(String str) { // 165
//     Stack<Character> s = new Stack<>();
//     int i = 0;
//     while (i < str.length()) {
//       s.push(str.charAt(i));
//       i++;
//     }

//     StringBuilder res = new StringBuilder(""); // Reverse a string using stacks
//     while (!s.isEmpty()) {
//       char curr = s.pop();
//       res.append(curr);
//     }

//     return res.toString();
//   }

//   public static void main(String args[]) {
//     String str = "abc";
//     String res = reverseString(str);
//     System.out.println(res);

//   }

// }






// import java.util.*;

// public class Stacks {

//   public static void pushAtBottom(Stack<Integer> s, int data) { // 166
//     if (s.isEmpty()) {
//       s.push(data);
//       return;
//     }
//     int top = s.pop();
//     pushAtBottom(s, data);
//     s.push(top);
//   }

//   public static void reverseStack(Stack<Integer> s) { // Reverse a stack problem
//     if (s.isEmpty()) {
//       return;
//     }
//     int top = s.pop();
//     reverseStack(s);
//     pushAtBottom(s, top);
//   }

//   public static void printStack(Stack<Integer> s) {
//     while (!s.isEmpty()) {
//       System.out.println(s.pop());
//     }
//   }

//   public static void main(String args[]) {
//     Stack<Integer> s = new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);

//     reverseStack(s);
//     printStack(s);

//   }

// }





// import java.util.*;

// public class Stacks {
//   public static void stockSpan(int stocks[], int span[]) { // Stock span problem**
//     Stack<Integer> s = new Stack<>();
//     span[0] = 1;
//     s.push(0);

//     for (int i = 1; i < stocks.length; i++) {
//       int currPrice = stocks[i];
//       while (!s.isEmpty() && currPrice > stocks[s.peek()]) { // 167
//         s.pop();
//       }

//       if (s.isEmpty()) {
//         span[i] = i + 1;
//       } else {
//         int prevHigh = s.peek();
//         span[i] = i - prevHigh;
//       }
//       s.push(i);

//     }

//   }

//   public static void main(String args[]) {
//     int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
//     int span[] = new int[stocks.length];
//     stockSpan(stocks, span);

//     for (int i = 0; i < span.length; i++) {
//       System.out.println(span[i] + " ");
//     }

//   }

// }



// import java.util.*;

// public class Stacks {
//   public static void main(String args[]) { // next immediate greater element****
//     int arr[] = { 6, 8, 0, 1, 3 };
//     Stack<Integer> s = new Stack<>(); // this problem has many varieties it may also be asked as next greater left,
//                                       // next greater right, next smaller right, next smaller left
//     int nxtGreater[] = new int[arr.length];

//     for (int i = arr.length - 1; i >= 0; i--) {
//       // 1 while
//       while (!s.isEmpty() && arr[s.peek()] <= arr[i]) { // 168
//         s.pop();
//       }

//       // 2 if-else
//       if (s.isEmpty()) {
//         nxtGreater[i] = -1;
//       } else {
//         nxtGreater[i] = arr[s.peek()];
//       }

//       // 3 push in stack
//       s.push(i);

//     }

//     for (int i = 0; i < nxtGreater.length; i++) {
//       System.out.print(nxtGreater[i] + " ");
//     }
//     System.out.println(); // printing the result array

//   }
// }






// import java.util.*;

// public class Stacks {
//   public static boolean isValid(String str) { // valid parentheses problem
//     Stack<Character> s = new Stack<>();

//     for (int i = 0; i < str.length(); i++) {
//       char ch = str.charAt(i);

//       if (ch == '(' || ch == '{' || ch == '[') { // opening
//         s.push(ch);
//       }

//       else { // closing
//         if (s.isEmpty()) {
//           return false;
//         }

//         if ((s.peek() == '(' && ch == ')')
//             || (s.peek() == '{' && ch == '}')
//             || (s.peek() == '[' && ch == ']')) { // 169
//           s.pop();
//         } else {
//           return false;
//         }
//       }

//     }

//     if (s.isEmpty()) {
//       return true;
//     } else {
//       return false;
//     }

//   }

//   public static void main(String args[]) {
//     String str1 = "({})[]"; // true
//     String str2 = "{[])){]"; // false
//     String str3 = " ";

//     System.out.println(isValid(str1));
//   }
// }




// import java.util.*;

// public class Stacks {
//   public static boolean isDuplicate(String str) { // Duplicate parentheses problem
//     Stack<Character> s = new Stack<>();

//     for (int i = 0; i < str.length(); i++) { // TC = O(n)
//       char ch = str.charAt(i);

//       // closing
//       if (ch == ')') {
//         int count = 0;
//         while (s.pop() != '(') {
//           count++;
//         }

//         if (count < 1) {
//           return true; // duplicate // 170
//         }
//       }

//       else {
//         s.push(ch); // opening
//       }
//     }
//     return false;

//   }

//   public static void main(String args[]) {
//     String str1 = "((a+b))"; // true
//     String str2 = "(a-b)"; // false

//     System.out.println(isDuplicate(str2));
//   }

// }




// import java.util.*;

// public class Stacks {

//   public static void maxArea(int arr[]) { // max area in histogram
//     int maxArea = 0;
//     int nsr[] = new int[arr.length];
//     int nsl[] = new int[arr.length];

//     // next smaller left (nsl)
//     Stack<Integer> s = new Stack<>(); // 171

//     for (int i = arr.length - 1; i >= 0; i--) {
//       while (!s.isEmpty() && arr[s.peek()] >= arr[i]) { // TC = O(n)
//         s.pop();
//       }

//       if (s.isEmpty()) {
//         nsl[i] = arr.length;
//       } else {
//         nsl[i] = s.peek();
//       }
//       s.push(i);
//     }

//     // next smaller right (nsr)
//     s = new Stack<>();

//     for (int i = 0; i < arr.length; i++) {
//       while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
//         s.pop();
//       }

//       if (s.isEmpty()) {
//         nsr[i] = -1;

//       } else {
//         nsr[i] = s.peek();
//       }
//       s.push(i);
//     }

//     // current area: width=j-i-1 = (nsr[i] - nsr[i]-1)
//     for (int i = 0; i < arr.length; i++) {
//       int height = arr[i];
//       int width = nsl[i] - nsr[i] - 1; // j-i-1
//       int currArea = height * width;
//       maxArea = Math.max(currArea, maxArea);

//     }

//     System.out.println("max area in histogram = " + maxArea);

//   }

//   public static void main(String args[]) {
//     int arr[] = { 2, 1, 5, 6, 2, 3 }; // heights of histogram
//     maxArea(arr);

//   }

// }









