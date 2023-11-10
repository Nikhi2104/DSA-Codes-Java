// // 1
// import java.util.*;

// public class Stackspq { // palindrome LinkedList using stacks

//   static class Node {
//     int data;
//     Node next;

//     Node(int data) {
//       this.data = data;
//       this.next = null;
//     }

//     static Node head;
//     static Node tail;
//     static int size;
//   }

//   static boolean isPalindrome(Node head) { // 183

//     Node slow = head;
//     boolean isPal = true;
//     Stack<Integer> s = new Stack<>();

//     while (slow != null) {
//       s.push(slow.data);
//       slow = slow.next;
//     }

//     while (head != null) {
//       int i = s.pop();
//       if (head.data == i) {
//         isPal = true;
//       } else {
//         isPal = false;
//         break;
//       }
//       head = head.next;
//     }
//     return isPal;

//   }

//   public static void main(String args[]) {
//     // LinkedList<Integer> list = new LinkedList<>();
//     Node one = new Node(1);
//     Node two = new Node(2);
//     Node three = new Node(3);
//     Node four = new Node(4);
//     Node five = new Node(3);
//     Node six = new Node(2);
//     Node seven = new Node(1);

//     one.next = two;
//     two.next = three;
//     three.next = four;
//     four.next = five;
//     five.next = six;
//     six.next = seven;

//     boolean isPal = isPalindrome(one);
//     System.out.println("isPalindrome: " + isPal);

//   }

// }






// // 2
// import java.util.*;

// public class Stackspq {
//   public static String simplify(String str) { // Simplify path problem

//     Stack<String> s = new Stack<>();
//     String res = "";
//     res += "/";
//     int n = str.length();

//     for (int i = 0; i < n; i++) {
//       String dir = ""; // dir = directory // not clear
//       while (i < n && str.charAt(i) == '/') {
//         i++;
//       }

//       while (i < n && str.charAt(i) != '/') { // 184
//         dir += str.charAt(i);
//         i++;
//       }

//       if (dir.equals("..") == true) {
//         if (!s.empty())
//           s.pop();
//       }

//       else if (dir.equals(".") == true) {
//         continue;
//       } else if (dir.length() != 0) {
//         s.push(dir);
//       }


//       Stack<String> s2 = new Stack<>();
//       while (!s.empty()) {
//         s2.push(s.pop());
//       }

//       while (!s2.empty()) {
//         if (s2.size() != 1) {
//           res += (s2.pop() + "/");
//         } else {
//           res += s2.pop();
//         }
//       }

//     }
//     return res;

//   }

//   public static void main(String args[]) {
//     String str = new String("/a./b/../../c/");
//     String str2 = new String("/apnacollege/");
//     String str3 = new String("/a/..");

//     String res = simplify(str);
//     System.out.println(res);
//   }

// }





// // 3 
// import java.util.*;

// class Stackspq {
//   static String decode(String str) { // Decode a string problem**
//     Stack<Integer> intstack = new Stack<>();
//     Stack<Character> strstack = new Stack<>();
//     String temp = "", result = "";

//     for (int i = 0; i < str.length(); i++) {

//       int count = 0;
//       if (Character.isDigit(str.charAt(i))) {
//         while (Character.isDigit(str.charAt(i))) {
//           count = count * 10 + str.charAt(i) - '0'; // this problem would have been solved easily using stringbuilder
//           i++;
//         }

//         i--;
//         intstack.push(count);

//       }

//       else if (str.charAt(i) == ']') { // 185
//         temp = "";
//         count = 0;

//         if (!intstack.isEmpty()) {
//           count = intstack.peek();
//           intstack.pop();
//         }

//         while (!strstack.isEmpty() && strstack.peek() != '[') { // not clear
//           temp = strstack.peek() + temp;
//           strstack.pop();
//         }

//         if (!strstack.empty() && strstack.peek() == '[')
//           strstack.pop();

//         for (int j = 0; j < count; j++)
//           result = result + temp;

//         for (int j = 0; j < result.length(); j++)
//           strstack.push(result.charAt(j));

//         result = "";

//       }

//       else if (str.charAt(i) == '[') {
//         if (Character.isDigit(str.charAt(i - 1)))
//           strstack.push(str.charAt(i));

//         else {
//           strstack.push(str.charAt(i));
//           intstack.push(1);
//         }
//       }

//       else
//         strstack.push(str.charAt(i));

//     }


//     while (!strstack.isEmpty()) {
//       result = strstack.peek() + result;
//       strstack.pop();
//     }
//     return result;

//   }

//   public static void main(String args[]) {
//     String str = "2[cv]";
//     String str2 = "3[b2[v]]L";
//     System.out.println(decode(str2));

//   }

// }






// 4
import java.util.*;

class Stackspq { // 186

  public static int maxWater(int height[]) { // Trapping rainwater problem using stacks
    Stack<Integer> s = new Stack<>();
    int n = height.length;
    int ans = 0;
    for (int i = 0; i < n; i++) {

      while ((!s.isEmpty()) && (height[s.peek()] < height[i])) {
        int pop_height = height[s.peek()];
        s.pop();

        // if(s.isEmpty())
        // break;

        int distance = i - s.peek() - 1;
        int min_height = Math.min(height[s.peek()], height[i] - pop_height); // dry run it separately
        ans += distance * min_height;

      }

      s.push(i);
    }

    return ans;
  }

  public static void main(String args[]) {
    int height[] = { 7, 0, 4, 2, 5, 0, 6, 4, 0, 5 };
    // int height2[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
    // int height3[] = { 3, 2, 5, 3, 0, 3, 5 };

    System.out.println(maxWater(height));
  }

}








