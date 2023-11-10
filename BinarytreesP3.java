// public class BinarytreesP3 { // 209

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

//     public static void Kthlevel(Node root, int level, int k) { // Kth level of a tree
//         if (root == null) {
//             return;
//         }

//         if (level == k) {
//             System.out.print(root.data + " ");
//             return;
//         }

//         Kthlevel(root.left, level + 1, k);
//         Kthlevel(root.right, level + 1, k);

//     }

// public static void main(String args[]) {
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

//         int k = 2;
//         Kthlevel(root, 1, k);

//     }        

// }

// import java.util.*;

// public class BinarytreesP3 { // 210

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

//     public static boolean getPath(Node root, int n, ArrayList<Node> path) {
//         if (root == null) {
//             return false;
//         }

//         path.add(root);

//         if (root.data == n) {
//             return true;
//         }

//         boolean foundLeft = getPath(root.left, n, path);
//         boolean foundRight = getPath(root.right, n, path); // lowest common ancestor problem

//         if (foundLeft || foundRight) {
//             return true;
//         }

//         path.remove(path.size() - 1);
//         return false;

//     }

//     public static Node lca2(Node root, int n1, int n2) {
//         if (root == null || root.data == n1 || root.data == n2) { // 2nd approach for lca (optimised space complexity,
//                                                                   // TC is same for both approaches)
//             return root;
//         }

//         Node leftlca = lca2(root.left, n1, n2);
//         Node rightlca = lca2(root.right, n1, n2);

//         // leftlca = val , rightlca = null
//         if (rightlca == null) {
//             return leftlca;
//         }
//         if (leftlca == null) { // rightlca = val , leftlca = null
//             return rightlca;
//         }
//         return root;

//     }

//     public static Node lca(Node root, int n1, int n2) {
//         ArrayList<Node> path1 = new ArrayList<>();
//         ArrayList<Node> path2 = new ArrayList<>();

//         getPath(root, n1, path1); // function call
//         getPath(root, n2, path2);

//         // last common ancestor
//         int i = 0;
//         for (; i < path1.size() && i < path2.size(); i++) {
//             if (path1.get(i) != path2.get(i)) {
//                 break;
//             }
//         }

//         // last equal node -> (i-1)th
//         Node lca = path1.get(i - 1);
//         return lca;

//     }

// public static void main(String args[]) {
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

//         int n1 = 4, n2 = 6;
//          System.out.println(lca(root, n1, n2).data);
//         //System.out.println(lca2(root, n1, n2).data);

//     }

// }

// import java.util.*;

// public class BinarytreesP3 { // 211

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

//     public static Node lca2(Node root, int n1, int n2) {
//         if (root == null || root.data == n1 || root.data == n2) {
//             return root;
//         }

//         Node leftlca = lca2(root.left, n1, n2);
//         Node rightlca = lca2(root.right, n1, n2);

//         // leftlca = val , rightlca = null
//         if (rightlca == null) {
//             return leftlca;
//         }
//         if (leftlca == null) { // rightlca = val , leftlca = null
//             return rightlca;
//         }
//         return root;

//     }

//     public static int lcaDist(Node root, int n) {
//         if (root == null) {
//             return -1;
//         }

//         if (root.data == n) { // Min dist b/w nodes problem
//             return 0;
//         }

//         int leftDist = lcaDist(root.left, n);
//         int rightDist = lcaDist(root.right, n);

//         if (leftDist == -1 && rightDist == -1) {
//             return -1;
//         } else if (leftDist == -1) {
//             return rightDist + 1;
//         } else {
//             return leftDist + 1;
//         }

//     }

//     public static int minDist(Node root, int n1, int n2) {
//         Node lca = lca2(root, n1, n2);
//         int dist1 = lcaDist(lca, n1); // function call
//         int dist2 = lcaDist(lca, n2);

//         return dist1 + dist2;
//     }

//     public static void main(String args[]) {
//         /*
//          *    1
//          *   / \
//          *  2   3
//          * / \ / \
//          * 4 5 6 7
//          * 
//          */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n1 = 4, n2 = 7;
//         System.out.println(minDist(root, n1, n2));

//     }

// }




// import java.util.*;

// public class BinarytreesP3 { // Kth ancestor of node

//     static class Node { // 212
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static int KthAncestor(Node root, int n, int k) {
//         if (root == null) {
//             return -1;
//         }
//         if (root.data == n) {
//             return 0;
//         }

//         int leftDist = KthAncestor(root.left, n, k);
//         int rightDist = KthAncestor(root.right, n, k);

//         if (leftDist == -1 && rightDist == -1) {
//             return -1;
//         }

//         int max = Math.max(leftDist, rightDist);
//         if (max + 1 == k) {
//             System.out.println(root.data);
//         }
//         return max + 1;

//     }

//     public static void main(String args[]) {
//         /*
//          *     1
//          *    /  \
//          *   2    3
//          *  / \   / \
//          * 4   5 6   7
//          * 
//          */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         int n = 6, k = 1;
//         KthAncestor(root, n, k);
//     }

// }





// import java.util.*;

// public class BinarytreesP3 { // 213

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

//     public static int transform(Node root) { // Transform to sum tree
//         if (root == null) {
//             return 0;
//         }

//         int leftChild = transform(root.left);
//         int rightChild = transform(root.right);

//         int data = root.data;

//         int newLeft = root.left == null ? 0 : root.left.data; // ternary operator
//         int newRight = root.right == null ? 0 : root.right.data;

//         root.data = newLeft + leftChild + newRight + rightChild;
//         return data;

//     }

//     public static void preOrder(Node root) { // pre-order traversal
//         if (root == null) { // similar to print function here
//             return;
//         }

//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     public static void main(String args[]) {
//         /*
//          *    1
//          *   / \
//          *  2   3
//          * / \ / \
//          * 4 5 6 7
//          * 
//          */

//         /*
//          * expected sum_tree is:
//          * 
//          *    27
//          *   / \
//          *  9  13
//          * / \ / \
//          * 0 0 0 0
//          * 
//          */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         transform(root);
//         preOrder(root);

//     }

// }






