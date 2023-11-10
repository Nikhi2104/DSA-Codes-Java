// import java.util.*;

// public class bit_manipulation {

//    public static void isOddeven(int n) {
//       int bitmask = 1;
//       if ((bitmask & n) == 0) {
//          System.out.println("even number");
//       } else {
//          System.out.println("odd number");
//       }
//    }

//    // bit manipulation problem
//    public static void main(String args[]) {
//       isOddeven(4); // 95
//       isOddeven(5);
//       isOddeven(15);

//    }
// }



// import java.util.*;

// public  class bit_manipulation{
   
//     public static int getIthbit(int n,int i){
//     int bitmask=1<<i;
//     if((n&bitmask)==0){
//        return 0;
//     }
//     else{
//         return 1;
//     }                                                 // get Ith bit
//     }
//                                                           // 96
// public static void main(String args[]){
//   System.out.println(getIthbit(5,1));
// } 

// }


// import java.util.*;

// public class bit_manipulation {

//    public static int setIthbit(int n, int i) {
//       int bitmask = 1 << i;
//       return n | bitmask; // set Ith bit
//    }

//    // 97
//    public static void main(String args[]) {
//       System.out.println(setIthbit(5, 2));
//    }

// }




// import java.util.*;

// public class bit_manipulation {

//    public static int setIthbit(int n, int i) {
//       int bitmask = 1 << i;
//       return n | bitmask; // set Ith bit
//    }

//    public static int clearIthbit(int n, int i) {
//       int bitmask = ~(1 << i);
//       return n & bitmask; // clear Ith bit
//    }

//    public static int updateIthbit(int n, int i, int newbit) {
//       if (newbit == 0) {
//          return clearIthbit(n, i); // update Ith bit
//       } else {
//          return setIthbit(n, i);
//       }

//       // // or
//       // n=clearIthbit(n,i);
//       // int bitmask=newbit<<i;
//       // return n|bitmask;
//       // update Ith bit 2nd type  
//    }

//    public static int clearIBits(int n, int i) {
//       int bitmask = (~0) << i;
//       return n & bitmask; // clear last 'i' bits
//    }

//    public static int clearinRangebits(int n, int i, int j) {
//       int a = ((~0) << (j + 1));
//       int b = (1 << i) - 1; // clear range of bits
//       int bitmask = a | b;
//       return n & bitmask;
//    }

//    public static boolean ispowerofTwo(int n) {
//       return (n & (n - 1)) == 0; // to check if a number is a power of two or not
//    }

//    public static int countsetBits(int n) {
//       int count = 0;
//       while (n > 0) {
//          if ((n & 1) != 0) {
//             count++; // countsetbits problem important**
//          }
//          n = n >> 1;
//       }
//       return count;
//    }

//    public static void main(String args[]) {
//       // System.out.println(clearIthbit(10, 1));
//       // System.out.println(clearinRangebits(10,2,4)); // 98
//       // System.out.println(ispowerofTwo(16));
//       System.out.println(countsetBits(15));

//    }

// }





// import java.util.*;

// public class bit_manipulation {

//    public static int fastexpo(int a, int n) {
//       int ans = 1;

//       while (n > 0) {
//          if ((n & 1) != 0) {
//             ans = ans * a; // fast exponentiation problem*
//          }
//          a = a * a;
//          n = n >> 1;
//       }
//       return ans;
//    }

//    public static void main(String args[]) { // 99
//       System.out.println(fastexpo(3, 4));
//    }

// }


