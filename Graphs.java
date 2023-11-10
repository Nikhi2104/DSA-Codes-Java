// import java.util.*; // Graph basics;
// import java.util.ArrayList;

// public class Graphs {
//     static class Edge {
//         int src;
//         int dest;
//         int weight;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.weight = w;
//         }
//     }

//     public static void main(String args[]) {
//         /*
//         //              (5)
//         //          0 ------ 1
//         //         / \
//         //    (1) /   \(3)
//         //       /     \
//         //      2-------3
//         //      | (1)
//         //  (2) |
//         //      |
//         //      4
        
//         */

//         int V = 5;
//         ArrayList<Edge>[] graph = new ArrayList[V]; // null -> arraylist

//         for (int i = 0; i < V; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // 0-vertex
//         graph[0].add(new Edge(0, 1, 5));

//         // 1-vertex
//         graph[1].add(new Edge(1, 0, 5));
//         graph[1].add(new Edge(1, 3, 1));
//         graph[1].add(new Edge(1, 3, 3));

//         // 2-vertex
//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2, 3, 1));
//         graph[2].add(new Edge(2, 4, 4));

//         // 3-vertex
//         graph[3].add(new Edge(3, 1, 3));
//         graph[3].add(new Edge(3, 2, 1));

//         // 4-vertex
//         graph[4].add(new Edge(4, 2, 2));

//         // 2's neighbours
//         for (int i = 0; i < graph[2].size(); i++) {
//             Edge e = graph[2].get(i); // src, dest, weight
//             System.out.println(e.dest); // dest is printed
//         }

//     }

// }




// // Graph traversals
// import java.util.*; // 260
// import java.util.ArrayList; // BFS-Breadth first search
// import java.util.LinkedList;

// public class Graphs {
//     static class Edge {
//         int src;
//         int dest;
//         int weight;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.weight = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // 0-vertex
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         // 1-vertex
//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         // 2-vertex
//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         // 3-vertex
//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         // 4-vertex
//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         // 5-vertex
//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));

//         // 6-vertex
//         graph[6].add(new Edge(6, 5, 1));

//     }

//     public static void bfs(ArrayList<Edge> graph[]) {
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[graph.length];
//         q.add(0); // source = 0 , Here source can be anything but simplicity we take src=0

//         while (!q.isEmpty()) {
//             int curr = q.remove();
//             if (!vis[curr]) { // visit curr
//                 System.out.print(curr + " ");
//                 vis[curr] = true;
//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest); // edges destn's are inserted into queue here
//                 }
//             }
//         }

//     }

//     public static void main(String args[]) {
//         /*
//          * 
//          *    1-----3
//          *  /       | \
//          *  0       | 5 ---- 6
//          *  \       | /
//          *   2------4
//          * 
//          */

//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         bfs(graph);
//     }

// }




// // DFS- Depth First Search**
// import java.util.*; // 261
// import java.util.ArrayList;

// public class Graphs {
//     static class Edge {
//         int src;
//         int dest;
//         int weight;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.weight = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // 0-vertex
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         // 1-vertex
//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         // 2-vertex
//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         // 3-vertex
//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         // 4-vertex
//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         // 5-vertex
//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));

//         // 6-vertex
//         graph[6].add(new Edge(6, 5, 1));

//     }

//     public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
//         // visit
//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (!vis[e.dest]) {
//                 dfs(graph, e.dest, vis);
//             }
//         }

//     }

//     public static void main(String args[]) {
//         /*
//          * 
//          *    1-----3
//          *  /       | \
//          *  0       | 5 ---- 6
//          *  \       | /
//          *   2------4
//          * 
//          */

//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         dfs(graph, 0, new boolean[V]);
//     }

// }



// // HasPath question
// import java.util.*; // 262
// import java.util.ArrayList;

// public class Graphs {
//     static class Edge {
//         int src;
//         int dest;
//         int weight;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.weight = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // 0-vertex
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         // 1-vertex
//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         // 2-vertex
//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         // 3-vertex
//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         // 4-vertex
//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         // 5-vertex
//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));

//         // 6-vertex
//         graph[6].add(new Edge(6, 5, 1));

//     }

//     // public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
//     // // visit
//     // System.out.print(curr + " ");
//     // vis[curr] = true;

//     // for (int i = 0; i < graph[curr].size(); i++) {
//     // Edge e = graph[curr].get(i);
//     // if (!vis[e.dest]) {
//     // dfs(graph, e.dest, vis);
//     // }
//     // }

//     // }

//     public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]) {
//         if (src == dest) {
//             return true;
//         }

//         vis[src] = true;

//         for (int i = 0; i < graph[src].size(); i++) {
//             Edge e = graph[src].get(i);
//             // e.dest = neighbour
//             if (!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) { // recursive call
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         /*
//          * 
//          *    1-----3
//          *  /       | \
//          *  0       | 5 ---- 6
//          *  \       | /
//          *   2------4
//          * 
//          */

//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         System.out.println(hasPath(graph, 0, 5, new boolean[V]));
//     }

// }


