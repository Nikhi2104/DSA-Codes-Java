// // PART-4 - 2 problems
// import java.util.*; //Bellman Ford Algorithm                                  
// import java.util.ArrayList; // 271

// public class Graphs4 {
//     static class Edge {
//         int src;
//         int dest;
//         int weight; // weight is mandatory here

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.weight = w;
//         }
//     }

//     public static void createGraph(ArrayList<Edge> graph) {
//         graph.add(new Edge(0, 1, 2));
//         graph.add(new Edge(0, 2, 4));

//         graph.add(new Edge(1, 2, -4));

//         graph.add(new Edge(2, 3, 2));

//         graph.add(new Edge(3, 4, 4));

//         graph.add(new Edge(4, 1, -1));

//     }

//     public static void bellmanFord(ArrayList<Edge> graph, int src, int V) {
//         int dist[] = new int[V];
//         for (int i = 0; i < dist.length; i++) {
//             if (i != src) {
//                 dist[i] = Integer.MAX_VALUE; // + infinity
//             }
//         }

//         // Algo
//         for (int i = 0; i < V - 1; i++) {
//             // edges - O(E)
//             for (int j = 0; j < graph.size(); j++) {
//                 Edge e = graph.get(j);
//                 // u, v, weight
//                 int u = e.src;
//                 int v = e.dest;
//                 int weight = e.weight;
//                 // relaxation
//                 if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) {
//                     dist[v] = dist[u] + weight;
//                 }

//             }

//         }

//         // print
//         for (int i = 0; i < dist.length; i++) {
//             System.out.print(dist[i] + " ");
//         }

//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int V = 5;
//         ArrayList<Edge> graph = new ArrayList<>();
//         createGraph(graph);
//         bellmanFord(graph, 0, V);

//     }

// }

// // Prim's Algorithm implementing MST-Minimum Spanning Tree
// import java.util.*;
// import java.util.ArrayList; // 272

// public class Graphs4 {
//     static class Edge {
//         int src;
//         int dest;
//         int weight; // weight is mandatory here

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

//         graph[0].add(new Edge(0, 1, 10));
//         graph[0].add(new Edge(0, 2, 15));
//         graph[0].add(new Edge(0, 3, 30));

//         graph[1].add(new Edge(1, 0, 10));
//         graph[1].add(new Edge(1, 3, 40));

//         graph[2].add(new Edge(2, 0, 15));
//         graph[2].add(new Edge(2, 3, 50));

//         graph[3].add(new Edge(3, 1, 40));
//         graph[3].add(new Edge(3, 2, 50));
//     }

//     static class Pair implements Comparable<Pair> {
//         int v; // vertex
//         int cost; // cost

//         public Pair(int v, int c) {
//             this.v = v;
//             this.cost = c;
//         }

//         @Override
//         public int compareTo(Pair p2) {
//             return this.cost - p2.cost; // ascending order
//         }
//     }

//     public static void prims(ArrayList<Edge> graph[]) {
//         boolean vis[] = new boolean[graph.length];

//         PriorityQueue<Pair> pq = new PriorityQueue<>();
//         pq.add(new Pair(0, 0));
//         int finalCost = 0; // MST Cost/total min weight

//         while (!pq.isEmpty()) {
//             Pair curr = pq.remove();
//             if (!vis[curr.v]) {   // curr.v = current vertex
//                 vis[curr.v] = true;
//                 finalCost += curr.cost;

//                 for (int i = 0; i < graph[curr.v].size(); i++) {
//                     Edge e = graph[curr.v].get(i);
//                     pq.add(new Pair(e.dest, e.weight));
//                 }

//             }

//         }

//         System.out.println("final/min cost of MST: " + finalCost);

//     }

//     public static void main(String args[]) {
//         int V = 5;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         prims(graph);

//     }

// }












