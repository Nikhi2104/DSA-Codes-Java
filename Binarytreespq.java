// 1
// import java.util.*;

// public class Binarytreespq { // 214

//   static class Node {
//     int data;
//     Node left; // Check if a binary tree is univalued or not
//     Node right;

//     Node(int data) {
//       this.data = data;
//       this.left = null;
//       this.right = null;
//     }
//   }

//   public static boolean checkifUnival(Node root) {

//     if (root == null) {
//       return true;
//     }

//     if (root.left != null && root.data != root.left.data) {
//       return false;
//     }

//     if (root.right != null && root.data != root.right.data) {
//       return false;
//     }

//     return checkifUnival(root.left) && checkifUnival(root.right);

//   }

//    public static void main(String args[]) {                                                                                             
//       /*
//                   2
//                  / \                                    
//                 2   2
//                / \ 
//               2   2
      
//       */  

      
//       Node root = new Node(2);
//       root.left = new Node(2);
//       root.right = new Node(2);
//       root.left.left = new Node(2);
//       root.left.right = new Node(2);

//       if (checkifUnival(root)) {
//         System.out.print("YES");
//       } else {
//         System.out.print("NO");
//       }

//     }

//   }






// // 2
// import java.util.*;
// public class Binarytreespq {                                    // Invert a binary tree

//  static class Node {                                                // 215
//         int data;       
//         Node left, right;
    
//         Node(int data){                                 
//           this.data = data;
//           left = right = null;
//         }

//   } 


//  public static class BinaryTree {
//       Node root; 

//       void mirror() {
//       root = mirror(root);
//      }
   
//    Node mirror(Node node) {
//      if(node == null) 
//          return node;

//     // do the subtrees
//      Node left = mirror(node.left);
//      Node right = mirror(node.right);        
 
//     // swap the left and right pointers
//        node.left = right;
//        node.right = left;
       
//        return node;
//      }        
//                                                                          // no o/p                                 
//         void inOrder() {
//            inOrder(root);
//         }

//         void inOrder(Node node){
//         if(node == null) 
//            return; 

//         inOrder(node.left);
//         System.out.print(node.data + " ");
//         inOrder(node.right);

//     }


// public static void main(String args[]) {
//         /*                                
//                     1
//                    / \
//                   2   3
//                  / \ / \
//                 4  5 6  7
        
//         */  

//         /* Expected o/p :
//                     1
//                    / \
//                   3   2
//                  / \ / \
//                 7  6 5  4                
          
//         */
        
//         BinaryTree treepq = new BinaryTree();
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);  
//         root.left.right = new Node(5);  
//         root.right.left = new Node(6);  
//         root.right.right = new Node(7);  

//         System.out.println("Inorder traversal pf input tree is : ");
//         treepq.inOrder();
//         System.out.println();
//         treepq.mirror();
//         System.out.println("Inorder traversal of binary tree is: ");
//         treepq.inOrder();

//      }

//    }  

//  } 


// // class Solution {
// //     public TreeNode invertTree(TreeNode root) {             // approach 2
// //         // Base case: if the tree is empty...
// //         if(root == null){
// //             return root;
// //         }
// //         // Call the function recursively for the left subtree...
// //         invertTree(root.left);
// //         // Call the function recursively for the right subtree...
// //         invertTree(root.right);
// //         // Swapping process...
// //         TreeNode curr = root.left;
// //         root.left = root.right;
// //         root.right = curr;
// //         return root;        // Return the root...
// //     }
// // }





// // 3
// import java.util.*;

// public class Binarytreespq { // delete left nodes with values as x
//   static class Node {
//     int data; // 216
//     Node left, right;

//     Node(int data) {
//       this.data = data;
//       this.left = null;
//       this.right = null;

//     }
//   }

//   // static Node newNode(int data){
//   // Node newNode = new Node();
//   // newNode.data = data;
//   // newNode.left = null;
//   // newNode.right = null;
//   // return(newNode);

//   // }

//   static Node deleteLeaves(Node root, int x) {
//     if (root == null)
//       return null;

//     root.left = deleteLeaves(root.left, x);
//     root.right = deleteLeaves(root.right, x);

//     if (root.data == x && root.left == null && root.right == null) {
//       return null;
//     }
//     return root;
//   }

//   static void inOrder(Node root) {
//     if (root == null)
//       return;
//     inOrder(root.left);
//     System.out.print(root.data + " ");
//     inOrder(root.right);

//   }


// public static void main(String args[]) {
//         /*
//                     1
//                    / \
//                   3   3
//                  / \ 
//                 3   2   
        
//         */  
        
//         Node root = new Node(1);
//         root.left = new Node(3);
//         root.right = new Node(3);
//         root.left.left = new Node(3);
//         root.left.right = new Node(2);
//         // root.right.left = newNode(3);
//         // root.right.right = newNode(4);

//         deleteLeaves(root, 3);
//         System.out.print("Inorder traversal after deletion: ");
//         inOrder(root);

//       }
// }





// // 4
// import java.util.*; // 217

// public class Binarytreespq {
//   static HashMap<String, Integer> m; // Hashmap declaration

//   static class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//       this.data = data;
//       this.left = null; // not understood
//       this.right = null;

//     }
//   }

//   static String inOrder(Node node) { // Find All Duplicate Subtree problem
//     if (node == null)
//       return " ";

//     String str = "(";
//     str += inOrder(node.left);
//     str += Integer.toString(node.data);
//     str += inOrder(node.right);
//     str += ")";

//     if (m.get(str) != null && m.get(str) == 1)
//       System.out.print(node.data + " ");

//     if (m.containsKey(str))
//       m.put(str, m.get(str) + 1);
//     else
//       m.put(str, 1);

//     return str;
//   }

//   static void printAllDups(Node root) {
//     m = new HashMap<>();
//     inOrder(root);
//   }

//      public static void main(String args[]) {
//         /*
//                     1
//                    / \
//                   2   3
//                  /   / \ 
//                 4   2   4  
//                    /
//                   4 
                 
//         */  

//         Node root = null;
//         root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.right.left = new Node(2);
//         root.right.left.left = new Node(4);
//         root.right.right = new Node(4);

//         printAllDups(root);

//       }

//     }




// 5 
public class Binarytreespq { // 218
  class Node {
    int data;
    Node left, right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;

    }
  }

  class Res {
    public int val;
  }

  class Solution {
    Node root;

    int findMaxUtil(Node node, Res res) {

      if (node == null)
        return 0;

      int l = findMaxUtil(node.left, res);
      int r = findMaxUtil(node.right, res);

      int max_single = Math.max(Math.max(l, r) + node.data, node.data);

      int max_top = Math.max(res.val, max_top);

      return max_single;

    }

    int findMaxSum() {
      return findMaxSum(root);
    }

    int findMaxSum(Node node) {
      Res res = new Res();
      res.val = Integer.MIN_VALUE;

      findMaxSum(node, res);
      return res.val;

    }

    public static void main(String args[]) { // incomplete code
      /*
       * 1
       * / \
       * 2 3
       * / / \
       * 4 2 4
       * /
       * 4
       * 
       */  
       
        Solution tree = new Solution();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);  
        tree.root.right.left = new Node(2);  
        tree.root.right.left.left = new Node(4);  
        tree.root.right.right = new Node(4); 
  
        System.out.println("maximum path is : " + tree.findMaxSum());    
     
     }

  }


}















