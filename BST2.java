// public class BST2 { // Sorted array to balanced BST

//     static class Node { // 226
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data; // Here Node left and Node right are = null
//         }
//     }

//     public static Node createBST(int arr[], int st, int end) {
//         if (st > end) {
//             return null;
//         }

//         int mid = (st + end) / 2;
//         Node root = new Node(arr[mid]);
//         root.left = createBST(arr, st, mid - 1);
//         root.right = createBST(arr, mid + 1, end);
//         return root;

//     }

//     // public static void preOrder(Node root) {
//     //     if (root == null) {
//     //         return;
//     //     }

//     //     System.out.print(root.data + " ");
//     //     preOrder(root.left);
//     //     preOrder(root.right);

//     // }

//     public static void inorder(Node root) {
//         if (root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);

//     }

//     public static void main(String args[]) {
//         int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

//         /*
//                  8 
//                 / \
//                5  10
//               / \    \
//              3   6   11
        
//         */

//         Node root = createBST(arr, 0, arr.length - 1);
//         //preOrder(root);
//         inorder(root);

//     }

// }




// import java.util.*;

// public class BST2 { // Convert BST to balanced BST

//     static class Node { // 227
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data; // Here Node left and Node right are = null
//         }
//     }

//     public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
//         if (st > end) {
//             return null;
//         }

//         int mid = (st + end) / 2;
//         Node root = new Node(inorder.get(mid));
//         root.left = createBST(inorder, st, mid - 1);
//         root.right = createBST(inorder, mid + 1, end);
//         return root;

//     }

//     public static Node balanceBST(Node root) {
//         // inorder seq
//         ArrayList<Integer> inorder = new ArrayList<>();
//         getInorder(root, inorder);

//         // sorted inorder -> balanced BST
//         root = createBST(inorder, 0, inorder.size() - 1);
//         return root;

//     }

//     public static void getInorder(Node root, ArrayList<Integer> inorder) {
//         if (root == null) {
//             return;
//         }

//         getInorder(root.left, inorder);
//         inorder.add(root.data);
//         getInorder(root.right, inorder);

//     }

//     public static void preOrder(Node root) {
//         if (root == null) {
//             return;
//         }

//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     public static void main(String args[]) {

//            /*
//                      8 
//                     / \
//                    6  10                   // given BST
//                   /     \
//                  5      11
//                /          \
//               3            12
      
//            */
      
//            Node root = new Node(8);
//            root.left = new Node(6);
//            root.left.left = new Node(5);
//            root.left.left.left = new Node(3);

//            root.right = new Node(10);
//            root.right.right = new Node(11);
//            root.right.right.right = new Node(12);

//         /*
//                     8
//                   /   \
//                  5    11              // expected BST
//                 / \   / \
//                3   6 10 12
         
//          */

//         root = balanceBST(root);
//         preOrder(root);

//      }
    
// }
    




// import java.util.*;

// public class BST2 { // Size of largest BST in BT

//     static class Node { // 228
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data; // Here Node left and Node right are = null
//             this.left = this.right = null;
//         }
//     }

//     static class Info {
//         boolean isBST;
//         int size;
//         int min;
//         int max;

//         public Info(boolean isBST, int size, int min, int max) {
//             this.isBST = isBST;
//             this.size = size;
//             this.min = min;
//             this.max = max;
//         }
//     }

//     public static int maxBST = 0;  // global declaration

//     public static Info largestBST(Node root) {
//         if (root == null) {
//             return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE); // Initialisation
//         }

//         Info leftInfo = largestBST(root.left);
//         Info rightInfo = largestBST(root.right);
//         int size = leftInfo.size + rightInfo.size + 1;
//         int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
//         int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

//         if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
//             return new Info(false, size, min, max);
//         }

//         if (leftInfo.isBST && rightInfo.isBST) {
//             maxBST = Math.max(maxBST, size);
//             return new Info(true, size, min, max);
//         }

//         return new Info(false, size, min, max);

//     }

//  public static void main(String args[]) {

//            /*
//                      50 
//                     / \
//                   30   60                   // given BST
//                  / \   / \
//                 5  20 45  70
//                          /  \
//                         65   80
      
//            */
      
//            Node root = new Node(50);
//            root.left = new Node(30);
//            root.left.left = new Node(5);
//            root.left.right = new Node(20);

//            root.right = new Node(60);
//            root.right.left = new Node(45);
//            root.right.right = new Node(70);
//            root.right.right.left = new Node(65);
//            root.right.right.right = new Node(80);

//         /*
//                60 
//               /  \
//              45  70 
//                  / \
//                 65  80        // expected BST : size = 5;

//          */

//         Info info = largestBST(root);
//         System.out.println("largest BST size = " + maxBST);

//     }

// }






// import java.util.*;

// public class BST2 { // Merge 2 BST's
//     static class Node {
//         int data; // 229
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data; // Here Node left and Node right are = null
//             this.left = this.right = null;
//         }
//     }

//     public static void getInorder(Node root, ArrayList<Integer> arr) {
//         if (root == null) {
//             return;
//         }

//         getInorder(root.left, arr);
//         arr.add(root.data);
//         getInorder(root.right, arr);
//     }

//     public static Node createBST(ArrayList<Integer> inorder, int st, int end) {
//         if (st > end) {
//             return null;
//         }

//         int mid = (st + end) / 2;
//         Node root = new Node(inorder.get(mid));
//         root.left = createBST(inorder, st, mid - 1);
//         root.right = createBST(inorder, mid + 1, end);
//         return root;
//     }

//     public static Node mergeBSTs(Node root1, Node root2) {
//         // step-1
//         ArrayList<Integer> arr1 = new ArrayList<>();
//         getInorder(root1, arr1);

//         // step-2
//         ArrayList<Integer> arr2 = new ArrayList<>();
//         getInorder(root2, arr2);

//         // merge
//         int i = 0, j = 0;
//         ArrayList<Integer> finalArr = new ArrayList<>();  // final arraylist
//         while (i < arr1.size() && j < arr2.size()) {
//             if (arr1.get(i) <= arr2.get(j)) {
//                 finalArr.add(arr1.get(i));
//                 i++;
//             } else {
//                 finalArr.add(arr2.get(j));
//                 j++;
//             }
//         }

//         while (i < arr1.size()) {
//             finalArr.add(arr1.get(i));
//             i++;
//         }

//         while (j < arr2.size()) {
//             finalArr.add(arr2.get(j));
//             j++;
//         }

//         // sorted AL -> balanced BST
//         return createBST(finalArr, 0, finalArr.size() - 1);

//     }

//     public static void preOrder(Node root) {
//         if (root == null) {
//             return;
//         }

//         System.out.print(root.data + " ");
//         preOrder(root.left);
//         preOrder(root.right);
//     }

//     public static void main(String args[]) {

//         /*
//                   2
//                  / \
//                 1   4                   // given BST
   
//         */

//         Node root1 = new Node(2);
//         root1.left = new Node(1);
//         root1.right = new Node(4);

//         /*
//             9 
//            / \
//           3  12 
           
//       */

//         Node root2 = new Node(9);
//         root2.left = new Node(3);
//         root2.right = new Node(12);

//      //                       3
//      //                     /   \
//      //                    1     9                   // final BST
//      //                     \   / \
//      //                      2  4  12


//      Node root = mergeBSTs(root1, root2);
//      preOrder(root);

//  }

// }





import java.util.*;

public class BST2 { // 230
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root; // static global variable

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    static int max(int a, int b) {
        return (a > b) ? a : b; // Using ternary operator

    }

    // right rotate subtree rooted with y
    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = max(height(y.left), height(y.right) + 1);
        x.height = max(height(x.left), height(x.right) + 1);

        // return new root
        return x;

    }

    // left rotate subtree rooted with x
    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = max(height(x.left), height(x.right) + 1);
        y.height = max(height(y.left), height(y.right) + 1);

        // return new root
        return y;

    }

    // get balance factor of node
    public static int getbalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public static Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root; // Duplicate keys not allowed

        // Update root height
        root.height = 1 + Math.max(height(root.left), height(root.right));

        // get root's balance factor
        int bf = getbalance(root);

        // LL case
        if (bf > 1 && key < root.left.data)
            return rightRotate(root);

        // RR case
        if (bf < -1 && key > root.right.data)
            return leftRotate(root);

        // LR case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RL case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root; // returned if AVL balanced

    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args[]) {
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*
         30 
        /  \                   // AVL tree
       20   40
      /  \    \
     10  25   50


    */

        preOrder(root);

    }

}







