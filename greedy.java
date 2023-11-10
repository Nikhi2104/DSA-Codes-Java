// import java.util.*;
// import java.util.ArrayList; // 192

// public class greedy {
//    public static void main(String args[]) { // Activity selection problem
//       int start[] = { 1, 3, 0, 5, 8, 5 };
//       int end[] = { 2, 4, 6, 7, 9, 9 }; // in this case the end time is already sorted

//       // sorting
//       int activities[][] = new int[start.length][3]; // TC = O(n)
//       for (int i = 0; i < start.length; i++) {
//          activities[i][0] = i;
//          activities[i][1] = start[i];
//          activities[i][2] = end[i];
//       }

//       // lambda function -> shortform
//       Arrays.sort(activities, Comparator.comparingDouble(o -> o[2])); // end time sorted

//       // end time basis sorted
//       int maxAct = 0;
//       ArrayList<Integer> ans = new ArrayList<>(); // used to store index

//       // 1st activity
//       maxAct = 1;
//       ans.add(0);
//       int lastEnd = end[0];
//       for (int i = 1; i < end.length; i++) {
//          if (start[i] >= lastEnd) {
//             // activity select
//             maxAct++;
//             ans.add(i);
//             lastEnd = end[i];
//          }
//       }

//       System.out.println("max activities = " + maxAct);

//       for (int i = 0; i < ans.size(); i++) {
//          System.out.print("A" + ans.get(i) + " ");
//       }

//       System.out.println();

//    }
// }






// import java.util.*; // 193

// public class greedy {
//    public static void main(String args[]) { // Fractional Knapsack problem**** - each weight to add only once
//       int val[] = { 60, 100, 120 };
//       int weight[] = { 10, 20, 30 };
//       int W = 50; // maximum weight

//       double ratio[][] = new double[val.length][2]; // 0th col = idx , 1st col = ratio

//       for (int i = 0; i < val.length; i++) {    // i < val.length || i < weight.length
//          ratio[i][0] = i;
//          ratio[i][1] = val[i] / (double) weight[i];
//       }

//       // ascending order
//       Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // sorting

//       int capacity = W;
//       int finalVal = 0;
//       for (int i = ratio.length - 1; i >= 0; i--) { // running the loop in reverse order to sort in descending order
//          int idx = (int) ratio[i][0];

//          if (capacity >= weight[idx]) { // include full item
//             finalVal += val[idx];
//             capacity -= weight[idx];
//          } else {
//             finalVal += (ratio[i][1] * capacity); // include fractional item
//             capacity = 0;
//             break;
//          }
//       }

//       System.out.println("final value = " + finalVal);

//    }

// }





// import java.util.*; // 194

// public class greedy {
//    public static void main(String args[]) { // min absolute difference pairs
//       int A[] = { 4, 1, 8, 7 };
//       int B[] = { 2, 3, 6, 5 };

//       Arrays.sort(A);
//       Arrays.sort(B);

//       int minDiff = 0;

//       for (int i = 0; i < A.length; i++) {
//          minDiff += Math.abs(A[i] - B[i]);
//       }

//       System.out.println("min absolute diff of pairs = " + minDiff);

//    }

// }




// import java.util.*;

// public class greedy { // max length chain of pairs
//    public static void main(String args[]) {
//       int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } }; // TC =O(nlogn)

//       Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // doubt as to why to sort**

//       int chainLen = 1;
//       int chainEnd = pairs[0][1]; // last selected pair end or // chain end

//       for (int i = 1; i < pairs.length; i++) {
//          if (pairs[i][0] > chainEnd) {
//             chainLen++;
//             chainEnd = pairs[i][1];
//          }
//       }
//       System.out.println("Max length of chain = " + chainLen); // 195
//    }

// }




// import java.util.*;
// import java.util.ArrayList; // 196

// public class greedy {
//    public static void main(String args[]) { // Indian coins problem
//       Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

//       Arrays.sort(coins, Comparator.reverseOrder()); // descending order sorting

//       int countofCoins = 0;
//       int amount = 690;
//       ArrayList<Integer> ans = new ArrayList<>();

//       for (int i = 0; i < coins.length; i++) {
//          if (coins[i] <= amount) {
//             while (coins[i] <= amount) {
//                countofCoins++;
//                ans.add(coins[i]);
//                amount -= coins[i];
//             }
//          }
//       }

//       System.out.println("total (min) coins used = " + countofCoins);

//       for (int i = 0; i < ans.size(); i++) {
//          System.out.print(ans.get(i) + " "); // printing arraylist elements
//       }
//       System.out.println();

//    }

// }




// import java.util.*; // 197

// public class greedy {
//    public static class Job { // job sequencing problem
//       int deadline;
//       int profit;
//       int id;

//       Job(int i, int d, int p) {
//          id = i;
//          deadline = d;
//          profit = p;
//       }
//    }

//    public static void main(String args[]) {

//       int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

//       ArrayList<Job> jobs = new ArrayList<>();

//       for (int i = 0; i < jobsInfo.length; i++) {
//          jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1])); // not clear
//       }

//       Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit); // objects sorting in descending order since
//                                                                          // (obj2-obj1)
//       // descending order of profit

//       ArrayList<Integer> seq = new ArrayList<>();

//       int time = 0;
//       for (int i = 0; i < jobs.size(); i++) {
//          Job curr = jobs.get(i);
//          if (curr.deadline > time) {
//             seq.add(curr.id);
//             time++;
//          }
//       }

//       // print seq
//       System.out.println("max jobs = " + seq.size());
//       for (int i = 0; i < seq.size(); i++) {
//          System.out.print(seq.get(i) + " ");
//       }
//       System.out.println();

//    }
// }





// import java.util.*; // Chocola problem****

// public class greedy {
//    public static void main(String args[]) { // 198
//       int n = 4, m = 6;
//       Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
//       Integer costHor[] = { 4, 1, 2 }; // n-1

//       Arrays.sort(costVer, Collections.reverseOrder()); // Sorting in descending order
//       Arrays.sort(costHor, Collections.reverseOrder()); // Sorting in descending order

//       int h = 0, v = 0; // horizontal and vertical pointers
//       int hp = 1, vp = 1; // horizontal and vertical pieces
//       int cost = 0;

//       while (h < costHor.length && v < costVer.length) { // just assume h=i and v=j for your convenience
//          if (costVer[v] <= costHor[h]) { // horizontal cut
//             cost += (costHor[h] * vp);
//             hp++;
//             h++;
//          } else {
//             cost += (costVer[v] * hp); // vertical cut
//             vp++;
//             v++;
//          }
//       }

//       while (h < costHor.length) { // remaining cuts
//          cost += (costHor[h] * vp);
//          hp++;
//          h++;
//       }

//       while (v < costVer.length) { // remaining cuts
//          cost += (costVer[v] * hp);
//          vp++;
//          v++;
//       }

//       System.out.println("Min cost of cuts = " + cost);

//    }

// }











