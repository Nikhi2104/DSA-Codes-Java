// import java.util.ArrayList;

// public class arraylistpq {

//    public static boolean isMonotone(ArrayList<Integer> list) {
//       boolean isIncr = true; // monotonic arraylists problem
//       boolean isDecr = true;
//       for (int i = 0; i < list.size() - 1; i++) {
//          if (list.get(i) > list.get(i + 1)) {
//             isIncr = false;
//          }
//          if (list.get(i) < list.get(i + 1)) { // 143
//             isDecr = false;
//          }

//       }
//       return (isIncr || isDecr);
//    }

//    public static void main(String args[]) {
//       ArrayList<Integer> list = new ArrayList<>();

//       list.add(1);
//       list.add(2);
//       list.add(2);
//       list.add(4);

//       System.out.println(list);
//       System.out.println(isMonotone(list));
//    }

// }






// import java.util.*;

// import java.util.Collections;

// public class arraylistpq {

//    public static ArrayList<Integer> findLonely(ArrayList<Integer> list) { // 144
//       Collections.sort(list);
//       ArrayList<Integer> list2 = new ArrayList<>();

//       for (int i = 1; i < list.size() - 1; i++) {
//          if ((list.get(i - 1) + 1 < list.get(i)) && list.get(i) + 1 < list.get(i + 1)) {

//             list2.add(list.get(i));

//          }
//       }

//       if (list.size() == 1) {
//          list2.add(list.get(0));  
//       }

//       if (list.size() > 1) {
//          if (list.get(0) + 1 < list.get(1)) {

//             list2.add(list.get(0));

//          }

//          if (list.get(list.size() - 2) + 1 < list.get(list.size() - 1)) { 

//             list2.add(list.get(list.size() - 1));

//          }

//       }

//       return list2;
//    }

//    public static void main(String args[]) {
//       ArrayList<Integer> list = new ArrayList<>();
//       list.add(10);
//       list.add(6);
//       list.add(5);
//       list.add(8);

//       System.out.println(list);

//       System.out.println(findLonely(list));

//    }
// }




// import java.util.*;
// import java.util.ArrayList; // 145

// class arraylistpq {

//    public static int mostFrequent(ArrayList<Integer> list, int key) { // most frequent number following key
//       int result[] = new int[1000];

//       for (int i = 0; i < list.size() - 1; i++) {
//          if (list.get(i) == key) {
//             result[list.get(i + 1) - 1]++; // doubt
//          }
//       }

//       int max = Integer.MIN_VALUE;
//       int ans = 0;

//       for (int i = 0; i < 1000; i++) {
//          if (result[i] > max) {
//             max = result[i];
//             ans = i + 1;
//          }
//       }

//       return ans;

//    }

//    public static void main(String args[]) {
//       ArrayList<Integer> list = new ArrayList<>();

//       list.add(1);
//       list.add(100);
//       list.add(200);
//       list.add(1);
//       list.add(100);

//       System.out.println(mostFrequent(list, 1));

//    }
// }






// import java.util.*;
// import java.util.ArrayList;
// public class arraylistpq{

// public static ArrayList<Integer> beautifulArray(int n) {
//       ArrayList<Integer> ans = new ArrayList<>();
//       ans.add(1);

//      for(int i=2; i<=n; i++){
//       ArrayList<Integer> temp = new ArrayList<>();                       // incorrect code

//      for(Integer e: ans){
//        if(2*e<=n);
//        temp.add(e*2);  // even                                         // 146
//      }

//      for(Integer e:ans){
//       if(2*e-1<=n)
//        temp.add(e*2-1);   // odd 
//      }

//        ans=temp;

//     }

//     return ans;
     
// }

// public static void main(String args[]){
//    int n=5;
//    System.out.println(beautifulArray(n));
//  }

// }






// import java.util.*;
// import java.util.ArrayList; // 147

// public class arraylistpq {

//    public static ArrayList<Integer> beautifulArray(int n) { // beautiful array problem
//       ArrayList<Integer> res = new ArrayList<>();
//       divideConquer(1, 1, res, n);
//       return res;
//    }

//    public static void divideConquer(int start, int increment, ArrayList<Integer> res, int n) {

//       if (start + increment > n) {
//          res.add(start);
//          return;
//       }

//       divideConquer(start, 2 * increment, res, n); // recursive call
//       divideConquer(start + increment, 2 * increment, res, n); // recursive call

//    }

//    public static void main(String args[]) {
//       int n = 5;
//       System.out.println(beautifulArray(n));
//    }

// }















