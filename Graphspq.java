// // Part-1
// // 1-Cycle detection in undirected graphs using BFS

// import java.util.*;
// import java.util.ArrayList;
// import java.util.LinkedList;

// public class Graphspq {
//     public static class Edge { // doubt;
//         int src;
//         int dest;
     
//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 3));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 2));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 1));

//         graph[3].add(new Edge(3, 0));
//         graph[3].add(new Edge(3, 4));

//         graph[4].add(new Edge(4, 3));

//     }

//     public static boolean isCycleUtil(ArrayList<Edge> graph[], boolean vis[], int curr, int par) {
//         Queue<Integer> q = new LinkedList<>();
//         vis[curr] = true;
//         q.add(0);

//         while (!q.isEmpty()) {
//             int u = q.remove(); // or q.poll()
//             for (int i = 0; i < graph[u].size(); i++) {
//                 Edge e = graph[u].get(i);
//                 if (!vis[e.dest] && isCycleUtil(graph, vis, e.dest, curr)) {
//                     return true;
//                 }
//             }

//         }
//         return false;

//     }

//     public static boolean isCycle(ArrayList<Edge> graph[], int V) {
//         boolean vis[] = new boolean[V];

//         for (int i = 0; i < graph.length; i++) {
//             if (!vis[i]) {
//                 if (isCycleUtil(graph, vis, i, -1)) {
//                     return true;
//                 }
//             }
//         }
//         return false;

//     }

//     public static void main(String args[]) {
//         int V = 6;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         isCycle(graph, V);

//     }

// }



// 2 - Minimum depth of a binary tree 
import java.util.*;
import java.util.LinkedList;

public class Graphspq {
    static class Node {
        int data;
        Node left, right;
    }

    static class qitem { // custom class
        Node node;
        int depth;

        public qitem(Node node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    static int minDepth(Node root) {
        if (root == null) {
            return 0;
        }

        Queue<qitem> q = new LinkedList<>();
        qitem qi = new qitem(root, 1);
        q.add(qi);

        while (!q.isEmpty()) {
            qi = q.peek();
            q.remove();
            Node node = qi.node;
            int depth = qi.depth;
            if (node.left == null && node.right == null) {
                return depth;
            }
            if (node.left != null) {
                qi.node = node.left;
                qi.depth = depth + 1;
                q.add(qi);
            }
            if (node.right != null) {
                qi.node = node.right;
                qi.depth = depth + 1;
                q.add(qi);
            }
        }

        return 0;

    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    public static void main(String args[]) { // Creating Binary tree
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);

        System.out.println(minDepth(root));
    }

}



// // 3 - Minimum time required to rot all oranges
// import java.util.*;
// import java.util.LinkedList;    // doubt

// public class Graphspq {
//     public final static int R = 3;
//     public final static int C = 5;

//     static class Ele {
//         int x = 0;
//         int y = 0;

//         Ele(int x, int y) {
//             this.x = x;
//             this.y = y;
//         }
//     }

//     static boolean isValid(int i, int j) {
//         return (i >= 0 && j >= 0 && i < R && j < C);
//     }

//     static boolean isDelim(Ele temp) {
//         return (temp.x == -1 && temp.y == -1);
//     }

//     static boolean checkAll(int arr[][]) {
//         for (int i = 0; i < R; i++) 
//             for (int j = 0; j < C; j++) 
//                 if (arr[i][j] == 1)
//                     return true;

//         return false;
//     }

//     static int Solution(int arr[][]) {
//         Queue<Ele> Q = new LinkedList<>();
//         Ele temp; // Element temp is created
//         int ans = 0;
//         for (int i = 0; i < R; i++)
//             for (int j = 0; j < C; j++)
//                 if (arr[i][j] == 2)
//                     Q.add(new Ele(i, j));

//         Q.add(new Ele(-1, -1));

//         while (!Q.isEmpty()) {
//             boolean flag = false;
//             while (!isDelim(Q.peek())) {
//                 temp = Q.peek();
//                 if (isValid(temp.x + 1, temp.y) && arr[temp.x + 1][temp.y] == 1) {
//                     if (!flag) {
//                         ans++;
//                         flag = true;
//                     }
//                     arr[temp.x + 1][temp.y] = 2;

//                     temp.x++;
//                     Q.add(new Ele(temp.x, temp.y));
//                     temp.x--;
//                 }

//                 if (isValid(temp.x - 1, temp.y) && arr[temp.x - 1][temp.y] == 1) {
//                     if (!flag) {
//                         ans++;
//                         flag = true;
//                     }
//                     arr[temp.x - 1][temp.y] = 2;

//                     temp.x--;
//                     Q.add(new Ele(temp.x, temp.y));
//                     temp.x++;
//                 }

//                 if (isValid(temp.x, temp.y + 1) && arr[temp.x][temp.y + 1] == 1) {
//                     if (!flag) {
//                         ans++;
//                         flag = true;
//                     }
//                     arr[temp.x][temp.y + 1] = 2;

//                     temp.y++;
//                     Q.add(new Ele(temp.x, temp.y));
//                     temp.y--;
//                 }

//                 if (isValid(temp.x, temp.y - 1) && arr[temp.x][temp.y - 1] == 1) {
//                     if (!flag) {
//                         ans++;
//                         flag = true;
//                     }
//                     arr[temp.x][temp.y - 1] = 2;

//                     temp.y--;
//                     Q.add(new Ele(temp.x, temp.y));
//                 }
//                 Q.remove();
//             }

//             Q.remove();
//             if (!Q.isEmpty()) {
//                 Q.add(new Ele(-1, -1));
//             }
//         }

//         return (checkAll(arr)) ? -1 : ans;
//     }

     
//     public static void main(String args[]) {
//         int arr[][] = { { 2, 1, 0, 2, 1 },
//                 { 1, 0, 1, 2, 1 },
//                 { 1, 0, 0, 2, 1 } };

//         int ans = Solution(arr);

//         if (ans == -1) {
//             System.out.println("All oranges cannot rot");  // incorrect output
//         } else {
//             System.out.println("Time required for all oranges to rot: " + ans);
//         }
//     }

// }





// // 4 - To Find the size of the largest region in the Boolean Matrix

// import java.util.*;

// public class Graphspq {
//     static int ROW, COL, count;

//     public static boolean isSafe(int[][] M, int row, int col, boolean visited[][]) {
//           return ( (row >= 0) && (row<ROW) && (col>=0) && (col<COL) && 
//                      (M[row][col] == 1 && !visited[row][col]));

//     }
    
//     public static void DFS(int M[][], int row, int col, boolean visited[][]) {
//         int rowNbr[] = { -1, -1, -1, 0, 0, 1, 1, 1 };  // doubt
//         int colNbr[] = { -1, 0, 1, -1, 1, -1, 0, 1 };

//         visited[row][col] = true;
//         for (int k = 0; k < 8; k++) {
//             if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited)) {
//                 count++;
//                 DFS(M, row + rowNbr[k], col + colNbr[k], visited);
//             }

//         }

//     }

//     public static int largestRegion(int M[][]) {

//         boolean visited[][] = new boolean[ROW][COL];
//         int result = 0;

//         for (int i = 0; i < ROW; i++) {
//             for (int j = 0; j < COL; j++) {
//                 if (M[i][j] == 1 && !visited[i][j]) {
//                     count = 1;
//                     DFS(M, i, j, visited);
//                     result = Math.max(result, count);
//                 }
//             }
//         }
//         return result;
//     }

//     public static void main(String args[]) {
//         int M[][] = { { 0, 0, 1, 1, 1 },
//                       { 0, 0, 1, 1, 0 },
//                       { 0, 1, 0, 0, 1 },
//                       { 0, 0, 0, 0, 0 } };

//          ROW = 4;
//          COL = 5;
//         System.out.println(largestRegion(M));
//     }

// }





// // 5 - Word Ladder
// import java.util.*;
// import java.util.LinkedList;

// public class Graphspq { 

//     public static int shortestChainLen(String start,
//             String target, Set<String> D) {
//         if (start == target) // base-case
//             return 0;

//         int level = 0, wordlength = start.length();

//         Queue<String> Q = new LinkedList<>();
//         Q.add(start);
//         while (!Q.isEmpty()) {
//             ++level;
//             int sizeofQ = Q.size();
//             for (int i = 0; i < sizeofQ; i++) {
//                 char word[] = Q.peek().toCharArray();
//                 Q.remove();

//                 for (int pos = 0; pos < wordlength; ++pos) {
//                     char orig_char = word[pos];

//                     for (char c = 'a'; c <= 'z'; ++c) {
//                         word[pos] = c;
//                         if (String.valueOf(word).equals(target))
//                             return level + 1;
//                         if (!D.contains(String.valueOf(word)))
//                             continue;

//                         D.remove(String.valueOf(word));
//                         Q.add(String.valueOf(word));
//                     }

//                     word[pos] = orig_char;
//                 }

//             }
//         }

//         return 0;

//     }

//     public static void main(String args[]) {
//         Set<String> D = new HashSet<String>();
//         D.add("poon");
//         D.add("plee");
//         D.add("same");
//         D.add("poie");
//         D.add("plie");
//         D.add("poin");
//         D.add("plea");

//         String start = "toon";
//         String target = "plea";
//         System.out.println("Length of the shortest chain is: "
//                 + shortestChainLen(start, target, D));

//     }

// }








