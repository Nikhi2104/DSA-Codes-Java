// import java.util.*;

// public class Arraymatricespq {

//     public static void Search(int matrix[][], int key) {
//         int count = 0;
//         int n = matrix.length;
//         int m = matrix[0].length;

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == key) {
//                     count++;
//                 } // // occurence of an element in matrix
//             } // 83
//         }
//         System.out.println(count);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int matrix[][] = { { 4, 7, 8 },
//                 { 8, 8, 7 } };

//         int key = sc.nextInt();
//         Search(matrix, key);
//     }

// }


// import java.util.*;

// public class Arraymatricespq {

//     public static void getrowSum(int matrix[][]) {
//         int sum = 0;
//         int n = matrix.length;
//         int m = matrix[0].length;

//         for (int j = 0; j < m; j++) { // rowSum problem
//             sum += matrix[1][j]; // optimised approach
//         }

//         System.out.println("rowSum is : " + sum); // TC=O(n)

//     }

//     public static void main(String args[]) { // 84
//         int matrix[][] = { { 1, 4, 9 },
//                 { 11, 4, 3 },
//                 { 2, 2, 3 } };
//         getrowSum(matrix);

//     }

// }



import java.util.*;

public class Arraymatricespq {

    public static void transpose_matrix(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int tp_matrix[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { // traversing the given matrix
                tp_matrix[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) { // transpose of the given matrix
                System.out.print(tp_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // transpose of a matrix problem

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 }, // 85
                { 4, 5, 6 },
                { 7, 8, 9 } };
        transpose_matrix(matrix);

    }
}

