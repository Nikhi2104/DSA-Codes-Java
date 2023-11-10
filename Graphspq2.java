// // Part-2
// // 1 - Mother Vertex
// import java.util.*;
// import java.util.ArrayList;

// public class Graphspq2 {
//     static void addEdge(int u, int v,
//             ArrayList<ArrayList<Integer>> adj) {
//         adj.get(u).add(v);
//     }

//     static void DFSUtil(ArrayList<ArrayList<Integer>> g, int v,
//             boolean vis[]) {
//         vis[v] = true;

//         for (int x : g.get(v)) {
//             if (!vis[x]) {
//                 DFSUtil(g, x, vis);
//             }
//         }
//     }

//     static int motherVertex(ArrayList<ArrayList<Integer>> g, int V) {
//         boolean vis[] = new boolean[V];
//         int v = -1;

//         for (int i = 0; i < V; i++) {
//             if (!vis[i]) {
//                 DFSUtil(g, i, vis);
//                 v = i;
//             }
//         }

//         boolean check[] = new boolean[V];
//         DFSUtil(g, v, check);

//         for (boolean val : check) {
//             if (!val) {
//                 return -1;
//             }
//         }
//         return v;

//     }

//     public static void main(String args[]) {
//         int V = 5;
//         int E = 5;

//         ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

//         for (int i = 0; i < V; i++) {
//             adj.add(new ArrayList<Integer>());
//         }

//         addEdge(0, 2, adj);
//         addEdge(0, 3, adj);
//         addEdge(1, 0, adj);
//         addEdge(2, 1, adj);
//         addEdge(3, 4, adj);
//         // addEdge(5, 6, adj);
//         // addEdge(5, 2, adj);
//         // addEdge(6, 0, adj);

//         System.out.println("The mother vertex is : " + motherVertex(adj, V));

//     }

// }


// // 2- Union-Find
// import java.util.*;

// public class Graphspq2 { // Not clear

//     int V, E;
//     Edge edge[];

//     class Edge {
//         int src, dest;
//     };

//     Graphspq2(int v, int e) {    // Graphspq2 = Solution
//         V = v;
//         E = e;
//         edge = new Edge[E];

//         for (int i = 0; i < e; i++) {
//             edge[i] = new Edge();
//         }
//     }

//     int find(int parent[], int i) {
//         if (parent[i] == i) 
//             return i;

//         return find(parent, parent[i]);
//     }

//     void Union(int parent[], int x, int y) {
//         parent[x] = y;
//     }

//     int isCycle(Graphspq2 graph) {
//         int parent[] = new int[graph.V];

//         for (int i = 0; i < graph.V; i++)
//             parent[i] = i;

//         for (int i = 0; i < graph.E; i++) {
//             int x = graph.find(parent, graph.edge[i].src);
//             int y = graph.find(parent, graph.edge[i].dest);

//             if (x == y)
//                 return 1;

//             graph.Union(parent, x, y);

//         }
//         return 0;

//     }

//     public static void main(String args[]) {
//         int V = 3, E = 3;
//         Graphspq2 graph = new Graphspq2(V, E);
//         graph.edge[0].src = 0;
//         graph.edge[0].dest = 1;
//         graph.edge[1].src = 1;
//         graph.edge[1].dest = 2;
//         graph.edge[2].src = 0;
//         graph.edge[2].dest = 2;

//         if (graph.isCycle(graph) == 1) {
//             System.out.println("Graph contains cycle");
//         } else {
//             System.out.println("Graph doesn't contain cycle");
//         }
//     }

// }




// // 3 - Find whether it is possible to finish all tasks or not
// import java.lang.reflect.Array;
// import java.util.*;
// import java.util.ArrayList;

// public class Graphspq2 {
//     static class pair {
//         int first, second;

//         pair(int first, int second) {
//             this.first = first;
//             this.second = second;
//         }
//     }

//     static ArrayList<ArrayList<Integer>> make_graph(int numTasks, Vector<pair> prerequisites) {
//         ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(numTasks);

//         for (int i = 0; i < numTasks; i++) {
//             graph.add(new ArrayList<Integer>());
//         }

//         for (pair pre : prerequisites) {
//             graph.get(pre.second).add(pre.first);
//         }

//         return graph;

//     }

//     static int[] compute_indegree(ArrayList<ArrayList<Integer>> graph) {
//         int degrees[] = new int[graph.size()];

//         for (ArrayList<Integer> neighbors : graph)
//             for (int neigh : neighbors)
//                 degrees[neigh]++;

//         return degrees;

//     }

//     static boolean canFinish(int numTasks, Vector<pair> prerequisites) {
//         ArrayList<ArrayList<Integer>> graph = make_graph(numTasks, prerequisites);
//         int degrees[] = compute_indegree(graph);

//         for (int i = 0; i < numTasks; i++) {

//             int j = 0;
//             for (; j < numTasks; j++)
//                 if (degrees[j] == 0)
//                     break;

//             if (j == numTasks)
//                 return false;
//             degrees[j] = -1;
//             for (int neigh : graph.get(j)) {
//                 degrees[neigh]--;
//             }
//         }
//         return true;

//     }

//     public static void main(String args[]) {
//         int numTasks = 4;
//         Vector<pair> prerequisites = new Vector<pair>();

//         prerequisites.add(new pair(1, 0));
//         prerequisites.add(new pair(2, 1));
//         prerequisites.add(new pair(3, 2));

//         if (canFinish(numTasks, prerequisites)) {
//             System.out.println("Possible to finish all tasks");
//         } else {
//             System.out.println("Impossible to finish all the tasks");
//         }

//     }

// }





// 4 - Alien Dictionary
import java.util.*;
import java.util.LinkedList;

public class Graphspq2 {

    public String alienOrder(String words[]) {
        Map<Character, Set<Character>> map = new HashMap<>();
        Map<Character, Integer> degree = new HashMap<>();
        String result = "";
        if (words == null || words.length == 0) {
            return result;
        }
 
        for (String s : words) {
            for (char c : s.toCharArray()) {
                degree.put(c, 0);
            }
        }
        
        for (int i = 0; i < words.length-1; i++) {
            String curr = words[i];
            String next = words[i + 1];
            int min = Math.min(curr.length(), next.length());
            for (int j = 0; j < min; j++) {
                char c1 = curr.charAt(i);
                char c2 = next.charAt(j);
                if (c1 != c2) {
                    Set<Character> set = map.getOrDefault(c1, new HashSet<>());
                    set.add(c2);
                    map.put(c1, set);
                    degree.put(c2, degree.get(c2) + 1); //update c2, c1 < c2
                }
                break;
            }

        }

        LinkedList<Character> q  = new LinkedList<>();
        for(char c: degree.keySet()) {
            if(degree.get(c) == 0) {
                q.add(c);
            }
        }

        while(!q.isEmpty()) {
            char c = q.poll();
            result += c;
            if(map.containsKey(c)) {
                for(char next : map.get(c)){
                    degree.put(next, degree.get(next) - 1);
                if(degree.get(next) == 0) {
                    q.offer(next);
                }
             }  
           }

        }
        return result.length() == degree.size() ? result : "";
        
    }

}






