// import java.util.*;

// public class Arraylist2 {
//    public static void main(String args[]) {
//       ArrayList<ArrayList<Integer>> mainList = new ArrayList<>(); // multidimensional arraylists

//       ArrayList<Integer> list1 = new ArrayList<Integer>();    // 139
//       list1.add(1);
//       list1.add(2);
//       mainList.add(list1);

//       ArrayList<Integer> list2 = new ArrayList<Integer>();
//       list2.add(3);
//       list2.add(4);
//       mainList.add(list2);

//       // nested loops
//       for (int i = 0; i < mainList.size(); i++) {
//          ArrayList<Integer> currList = mainList.get(i);
//          for (int j = 0; j < currList.size(); j++) {
//             System.out.print(currList.get(j) + " ");
//          }
//          System.out.println();
//       }
//       System.out.println(mainList);
//    }
// }





// import java.util.*;

// public class Arraylist2 {

   // public static int storeWater(ArrayList<Integer> height) { // brute force approach // TC=O(n2)
   //    int maxWater = 0;
   //    for (int i = 0; i < height.size(); i++) {
   //       for (int j = i + 1; j < height.size(); j++) {
   //          int ht = Math.min(height.get(i), height.get(j)); // 140
   //          int width = j - i;
   //          int currWater = ht * width;
   //          maxWater = Math.max(maxWater, currWater);
   //       }
   //    }
   //    return maxWater;

   // }

//    public static int storeWater(ArrayList<Integer> height) {
//       int maxWater = 0;
//       int lp = 0;
//       int rp = height.size() - 1;

//       while (lp < rp) {
//          // calculate water area
//          int ht = Math.min(height.get(lp), height.get(rp)); // 2 pointer approach 
//          // TC=O(n)
//          int width = rp - lp;
//          int currWater = ht * width;
//          maxWater = Math.max(maxWater, currWater); // 140

//          // update ptr
//          if (height.get(lp) < height.get(rp)) {
//             lp++;
//          } else {
//             rp--;
//          }
//       }
//       return maxWater;
//    }

//    public static void main(String args[]) {
//       ArrayList<Integer> height = new ArrayList<>();

//       // 1,8,6,2,5,4,8,3,7

//       height.add(1);
//       height.add(8);
//       height.add(6);
//       height.add(2);
//       height.add(5);
//       height.add(4);
//       height.add(8);
//       height.add(3);
//       height.add(7);

//       System.out.print(storeWater(height));
//    }

// }





// import java.util.*;

// public class Arraylist2 {
   // public static boolean pairSum1(ArrayList<Integer> list, int target) { // 141

   //    for (int i = 0; i < list.size(); i++) {
   //       for (int j = i + 1; j < list.size(); j++) {
   //          if (list.get(i) + list.get(j) == target) { // brute force approach // TC=O(n2)
   //             return true;
   //          }
   //       }
   //    }
   //    return false;
   // }

//    public static boolean pairSum1(ArrayList<Integer> list, int target) {
//       int lp = 0;
//       int rp = list.size() - 1;

//       while (lp != rp) {
//          // case 1
//          if (list.get(lp) + list.get(rp) == target) {
//             return true;
//          }
//          // case 2
//          if (list.get(lp) + list.get(rp) < target) { // 2 ptr approach // TC=O(n)
//             lp++;
//          } else {
//             // case 3
//             rp--;
//          }

//       }
//       return false;

//    }

//    public static void main(String args[]) {
//       ArrayList<Integer> list = new ArrayList<>();
//       // 1,2,3,4,5,6

//       list.add(1);
//       list.add(2);
//       list.add(3);
//       list.add(4);
//       list.add(5);
//       list.add(6);

//       System.out.println(pairSum1(list, 5));

//    }
// }




// import java.util.*;
// import java.util.ArrayList;
// public class Arraylist2{
 
//    public static boolean pairSum2(ArrayList<Integer> list, int target) {
//       int bp = -1; // 142
//       int n = list.size();
//       for (int i = 0; i < n; i++) {
//          if (list.get(i) > list.get(i + 1)) { // breaking point
//             bp = i;
//             break;
//          }
//       }

//       int lp = bp + 1; // smallest
//       int rp = bp; // largest

//       while (lp != rp) {
//          // case 1
//          if (list.get(lp) + list.get(rp) == target) {
//             return true;
//          }
//       }

//       return false;

//    }


//  public static void main(String args[]){
//     ArrayList<Integer>list= new ArrayList<>();
//     // 11,15,6,8,9,10 - sorted and rotated
//     list.add(11);
//     list.add(15);
//     list.add(6);
//     list.add(8);
//     list.add(9);
//     list.add(10);

//     System.out.println(pairSum2(list, 16));

//  }

// }







