// import java.util.LinkedList;

// import java.util.*;

// public class BinarytreesP2 { // 206

//         static class Node {
//                 int data;
//                 Node left;
//                 Node right;

//                 Node(int data) {
//                         this.data = data;
//                         this.left = null;
//                         this.right = null;
//                 }
//         }

//         public static int height(Node root) { // height of a tree
//                 if (root == null) {
//                         return 0;
//                 }

//                 int lh = height(root.left);
//                 int rh = height(root.right);
//                 return Math.max(lh, rh) + 1;

//         }

//         public static int diameter(Node root) { // Diameter of a tree
//                 if (root == null) {
//                         return 0;
//                 }

//                 int leftDiam = diameter(root.left);
//                 int leftHt = height(root.left);
//                 int rightDiam = diameter(root.right);
//                 int rightHt = height(root.right);

//                 int selfDiam = leftHt + rightHt + 1;

//                 return Math.max(selfDiam, Math.max(leftDiam, rightDiam));

//         }


//  public static void main(String args[]) {
//         /*
//                     1
//                    / \
//                   2   3
//                  / \ / \
//                 4  5 6  7
        
//         */  

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(diameter(root));

// }

// }




// import java.util.*;

// public class BinarytreesP2 { // Subtree of another tree

//         static class Node { // 207
//                 int data;
//                 Node left;
//                 Node right;

//                 Node(int data) {
//                         this.data = data;
//                         this.left = null;
//                         this.right = null;
//                 }
//         }

//         public static boolean isIdentical(Node node, Node subRoot) {
//                 if (node == null && subRoot == null) {
//                         return true;
//                 } else if (node == null || subRoot == null || node.data != subRoot.data) {
//                         return false;
//                 }

//                 if (!isIdentical(node.left, subRoot.left)) { // checking for unidentical conditions
//                         return false;
//                 }

//                 if (!isIdentical(node.right, subRoot.right)) {
//                         return false;
//                 }
//                 return true;

//         }

//         public static boolean isSubtree(Node root, Node subRoot) {
//                 if (root == null) {
//                         return false;
//                 }
//                 if (root.data == subRoot.data) {
//                         if (isIdentical(root, subRoot)) {
//                                 return true;
//                         }
//                 }
//                 return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot); // recursive call

//         }


//  public static void main(String args[]) {
//         /*
//                     1
//                    / \
//                   2   3
//                  / \ / \
//                 4  5 6  7
        
//         */  
        
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);  
//         root.left.right = new Node(5);  
//         root.right.left = new Node(6);  
//         root.right.right = new Node(7);  

//         /*
//                   2  
//                  / \
//                 4   5
          
//         */

//         Node subRoot = new Node(2);
//         subRoot.left = new Node(4);
//         subRoot.right = new Node(5);
        
//         System.out.println(isSubtree(root, subRoot)); 
   
//      }

// }






// import java.util.*;
// import java.util.LinkedList;

// public class BinarytreesP2 { // 208

//         static class Node {
//                 int data;
//                 Node left;
//                 Node right;

//                 Node(int data) {
//                         this.data = data;
//                         this.left = null;
//                         this.right = null;
//                 }
//         }

//         static class Info {
//                 Node node;
//                 int hd;

//                 public Info(Node node, int hd) {
//                         this.node = node;
//                         this.hd = hd;
//                 }
//         }

//         public static void topView(Node root) { // Top view of a tree
//                 // Level Order
//                 Queue<Info> q = new LinkedList<>(); // queue is used here since we have to level-traverse
//                 HashMap<Integer, Node> map = new HashMap<>();

//                 int min = 0, max = 0;
//                 q.add(new Info(root, 0));
//                 q.add(null);

//                 while (!q.isEmpty()) {
//                         Info curr = q.remove();
//                         if (curr == null) {
//                                 if (q.isEmpty()) {
//                                         break;
//                                 } else {
//                                         q.add(null);
//                                 }
//                         }

//                         else {

//                                 if (!map.containsKey(curr.hd)) { // first time my hd is occuring
//                                         map.put(curr.hd, curr.node); // here put = add method
//                                 }

//                                 if (curr.node.left != null) {
//                                         q.add(new Info(curr.node.left, curr.hd - 1));
//                                         min = Math.min(min, curr.hd - 1);
//                                 }

//                                 if (curr.node.right != null) {
//                                         q.add(new Info(curr.node.right, curr.hd + 1));
//                                         max = Math.max(max, curr.hd + 1);
//                                 }
//                         }

//                 }

//                 for (int i = min; i <= max; i++) {
//                         System.out.print(map.get(i).data + " "); // o/p
//                 }
//                 System.out.println();

//         }

//         public static void main(String args[]) {
//            /*
//                     1
//                    / \
//                   2   3
//                  / \ / \
//                 4  5 6  7
        
//         */  
        
//            Node root = new Node(1);
//            root.left = new Node(2);
//            root.right = new Node(3);
//            root.left.left = new Node(4);
//            root.left.right = new Node(5);
//            root.right.left = new Node(6);
//            root.right.right = new Node(7);

//            topView(root);
//    }

// }










