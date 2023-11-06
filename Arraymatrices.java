// // 2D ARRAYS

// import java.util.*;

// public class Arraymatrices {

//     public static boolean Search(int matrix[][], int key) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     System.out.println("key found at: (" + i + "," + j + ")");
//                     return true;
//                 } // checking for key index
//             }
//         } // 77
//         System.out.println("key not found");
//         return false;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int matrix[][] = new int[3][4];
//         int n = matrix.length; // row length
//         int m = matrix[0].length; // column length

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt(); // input
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             } // output
//             System.out.println();
//         }

//         int key = sc.nextInt();
//         Search(matrix, key);
//     }

// }




// import java.util.*; // To find the largest and smallest element in the matrix 

// public class Arraymatrices {
//  public static void getlargeandsmall(int matrix[][]){
//    int largest=Integer.MIN_VALUE;
//    int smallest=Integer.MAX_VALUE;

//    for(int i=0;i<matrix.length;i++){
//     for(int j=0;j<matrix[0].length;j++){
//         if(matrix[i][j]>largest){
//             largest=matrix[i][j];
//         }                        
//         if(matrix[i][j]<smallest){
//             smallest=matrix[i][j];
//         }                                                                        // hw problem
//     }
    
//   }
  
//  System.out.println("largest element in the matrix is: "+largest);
//  System.out.println("smallest element in the matrix is: "+smallest);
//                                                                                  //  78
// }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int matrix[][] = new int[3][3];
//         int n = matrix.length; // 3
//         int m = matrix[0].length;  // 3

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt(); // input
//             }
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             } // output
//             System.out.println();
//         }

//         getlargeandsmall(matrix);

//     }

// }




// import java.util.*;

// public class Arraymatrices {

//     public static void printspiral(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length - 1;
//         int endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {

//             // top
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }
//             // right
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " "); // spiral matrix problem // important problem asked in many
//                                                            // companies
//             }
//             // bottom
//             for (int j = endCol - 1; j >= startCol; j--) {
//                 if (startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             } // 79
//             // left
//             for (int i = endRow - 1; i >= startRow + 1; i--) {
//                 if (startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }

//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;

//         }

//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };

//         printspiral(matrix);

//     }

// }



// import java.util.*;

// public class Arraymatrices {

//     public static int diagonalmatrix(int matrix[][]) {
//         int sum = 0;
//         // // approach 1
//         // for(int i=0;i<matrix.length;i++){
//         // for(int j=0;j<matrix[0].length;j++){
//         // if(i==j){
//         // sum+=matrix[i][j]; // TC=O(n2)
//         // }
//         // else if(i+j==matrix.length-1){
//         // sum+=matrix[i][j];
//         // }
//         // }
//         // }
//         // return sum;
//         // diagonal matrix problem

//         // approach 2
//         for (int i = 0; i < matrix.length; i++) {
//             // pd
//             sum += matrix[i][i];
//             // sd // TC=O(n)
//             if (i != matrix.length - i - 1) {
//                 sum += matrix[i][matrix.length - i - 1];
//             }
//         }
//         return sum;

//     }

//     public static void main(String args[]) { // 80
//         int matrix[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };
//         System.out.println(diagonalmatrix(matrix)); 

//     }

// }



// import java.util.*;

// public class Arraymatrices {
//     public static boolean sortedmatrix(int matrix[][], int key) {
//         int row = 0;
//         int col = matrix[0].length - 1;
//         while (row < matrix.length && col >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("key found at: (" + row + "," + col + ")");
//                 return true;
//             } else if (key < matrix[row][col]) {
//                 col--;
//             } else {
//                 row++;
//             }
//         }
//         System.out.println("key not found!");
//         return false;
//     }
//     // search in sorted matrix problem 1st type

//     public static void main(String args[]) { // 81
//         int matrix[][] = { { 10, 20, 30, 40 },
//                 { 15, 25, 35, 45 },
//                 { 27, 29, 37, 48 },
//                 { 32, 33, 39, 50 } };
//         int key = 40;

//         sortedmatrix(matrix, key);

//     }

// }





// import java.util.*;

// public class Arraymatrices {
//     public static boolean sortedmatrix(int matrix[][], int key) {
//         int row = matrix.length - 1;
//         int col = 0;
//         while (col < matrix[0].length && row >= 0) {
//             if (matrix[row][col] == key) {
//                 System.out.println("key found at: (" + row + "," + col + ")");
//                 return true;
//             } else if (key < matrix[row][col]) {
//                 row--;
//             } else {
//                 col++;
//             }
//         }
//         System.out.println("key not found!");
//         return false;
//     } // hw
//       // search in sorted matrix problem 2nd type (either of the types can be used to
//       // solve the problem)

//     public static void main(String args[]) {
//         int matrix[][] = { { 10, 20, 30, 40 },
//                 { 15, 25, 35, 45 },
//                 { 27, 29, 37, 48 },
//                 { 32, 33, 39, 50 } }; // 82
//         int key = 32;

//         sortedmatrix(matrix, key);

//     }

// }
