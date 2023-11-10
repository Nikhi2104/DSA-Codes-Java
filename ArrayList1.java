// //import java.util.ArrayList;
// import java.util.*;

// public class ArrayList1 {
//   public static void main(String args[]) {
//     ArrayList<Integer> list = new ArrayList<>(); // ArrayList basics

//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);

//     //System.out.println(list);

//     // int element=list.get(4);
//     // System.out.println(element);

//     // list.set(2,10);
//     // System.out.println(list);

//     // list.remove(2);
//     // System.out.println(list);

//     System.out.println(list.contains(4));
//     System.out.println(list.contains(8));

//     // System.out.println(list.size());
//     // // to print ArrayList
//     // for (int i = 0; i < list.size(); i++) {
//     //   System.out.print(list.get(i) + " ");
//     // }

//   }
// }



// import java.util.ArrayList;
// import java.util.*;

// public class ArrayList1 {
//   public static void main(String args[]) {
//     ArrayList<Integer> list = new ArrayList<>(); // print reverse of a number // 136

//     list.add(1);
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);

//     // System.out.println(list);

//     for (int i = list.size() - 1; i >= 0; i--) {
//       System.out.print(list.get(i) + " ");
//     }
//     System.out.println();
//   }
// }




// import java.util.*;

// public class ArrayList1 {
//   public static void main(String args[]) {
//     ArrayList<Integer> list = new ArrayList<>(); // 137

//     list.add(2);
//     list.add(5);
//     list.add(6);
//     list.add(10);
//     list.add(8);

//     System.out.println(list);

//     int max = Integer.MIN_VALUE;
//     for (int i = 0; i < list.size(); i++) { // to find largest element
//       // if(max<list.get(i)){
//       // max=list.get(i);
//       // }
//       max = Math.max(max, list.get(i));
//     }

//     System.out.println("Largest element= " + max);
//   }
// }



// import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;

// public class ArrayList1 {
//   public static void swap(ArrayList<Integer> list, int index1, int index2) { // 138
//     int temp = list.get(index1);
//     list.set(index1, list.get(index2));
//     list.set(index2, temp);

//   }

//   public static void main(String args[]) {
//     ArrayList<Integer> list = new ArrayList<>(); // swap numbers

//     list.add(2);
//     list.add(5);
//     list.add(6);
//     list.add(10);
//     list.add(8);

//     System.out.println(list);

//     int index1=2;
//     int index2=4;

//     swap(list,index1,index2);
//     System.out.println(list);

//     // Collections.sort(list); // sorting in ascending order
//     // System.out.println(list);
//     // Collections.sort(list, Collections.reverseOrder()); // comparator is used here // descending order
//     // System.out.println(list);

//   }
// }







