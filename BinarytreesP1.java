// public class BinarytreesP1 {

//     static class Node { // Binary trees basics
//         int data;
//         Node left;
//         Node right;

//         Node(int data) { // Build tree code
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class Binarytree {
//         static int idx = -1;

//         public static Node buildTree(int nodes[]) {
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;

//         }
//     }

//     public static void main(String args[]) {
//         int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 }; // o/p = 1
//         Binarytree tree = new Binarytree();
//         Node root = tree.buildTree(nodes);
//         System.out.println(root.data);

//     }

// }





// // Tree traversals
// public class BinarytreesP1 {

//     static class Node { // Binary trees basics
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class Binarytree {
//         static int idx = -1;

//         public static Node buildTree(int nodes[]) {
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null; // or return -1
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;

//         }

//         // public static void preorder(Node root){ // Preorder traversal
//         // if(root == null){
//         // return;
//         // }

//         // System.out.print(root.data+" ");
//         // preorder(root.left); // recursive left call
//         // preorder(root.right); // recursive right call
//         // } // 1 2 4 5 3 6

//         // }

//     //     public static void inorder(Node root) { // In-order traversal
//     //         if (root == null) {
//     //             return;
//     //         }

//     //         inorder(root.left);
//     //         System.out.print(root.data + " ");
//     //         inorder(root.right); // 4 2 5 1 3 6
//     //     }
//     // }

//     public static void postorder(Node root) { // post-order traversal
//         if (root == null) {
//             return;
//         }

//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.data + " "); // 4 5 2 6 3 1
//     }
// }

//     public static void main(String args[]) {
//         int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         Binarytree tree = new Binarytree();
//         Node root = tree.buildTree(nodes);

//          //tree.preorder(root);
//          //tree.inorder(root);
//         tree.postorder(root);

//     }

// }




// import java.util.*;
// import java.util.LinkedList;

// public class BinarytreesP1 {

//     static class Node { // 204
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class Binarytree {
//         static int idx = -1;

//         public static Node buildTree(int nodes[]) { // Build tree code
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }

//         public static void levelorder(Node root) { // level order traversal
//             if (root == null) {
//                 return;
//             }

//             Queue<Node> q = new LinkedList<>();
//             q.add(root);
//             q.add(null);

//             while (!q.isEmpty()) {
//                 Node currNode = q.remove();

//                 if (currNode == null) {
//                     System.out.println();
//                     if (q.isEmpty()) {
//                         break;
//                     } else {
//                         q.add(null);
//                     }
//                 }

//                 else {
//                     System.out.print(currNode.data + " ");
//                     if (currNode.left != null) {
//                         q.add(currNode.left);
//                     }
//                     if (currNode.right != null) {
//                         q.add(currNode.right);
//                     }

//                 }
//             }
//         }

//     }

//     public static void main(String args[]) {
//         int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         Binarytree tree = new Binarytree();
//         Node root = tree.buildTree(nodes);

//         tree.levelorder(root);

//     }

// }




// public class BinarytreesP1 { // 205
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int height(Node root) { // height of a tree
//         if (root == null) {
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);
//         return Math.max(lh, rh) + 1;  // + 1 to include root as well

//     }

//     public static int count(Node root) { // count of a tree
//         if (root == null) {
//             return 0;
//         }

//         int lc = count(root.left);
//         int rc = count(root.right);
//         return lc + rc + 1; // + 1 to include root as well
//     }

//     public static int sum(Node root) { // sum of a tree
//         if (root == null) {
//             return 0;
//         }

//         int ls = sum(root.left);
//         int rs = sum(root.right);
//         return ls + rs + root.data;
//     }

// public static void main(String args[]) {
//   /*
//               1
//              / \
//             2   3
//            / \ / \
//           4  5 6  7
  
//   */  

//   Node root = new Node(1);
//   root.left = new Node(2);
//   root.right = new Node(3);
//   root.left.left = new Node(4);
//   root.left.right = new Node(5);
//   root.right.left = new Node(6);
//   root.right.right = new Node(7);

//    // System.out.println(height(root));
//    // System.out.println(count(root));
//      System.out.println(sum(root));

// }

// }






