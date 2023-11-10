// public class Backtracking {
//   public static void changeArr(int arr[], int i, int val) { // change array problem
//     if (i == arr.length) { // 127
//       printArr(arr);
//       return;
//     }

//     arr[i] = val;
//     changeArr(arr, i + 1, val + 1);
//     arr[i] = arr[i] - 2;

//   }

//   public static void printArr(int arr[]) {
//     for (int i = 0; i < arr.length; i++) {
//       System.out.print(arr[i] + " ");
//     }
//     System.out.println();
//   }

//   public static void main(String args[]) {
//     int arr[] = new int[5];
//     changeArr(arr, 0, 1);
//     printArr(arr);

//   }

// }





// public class Backtracking {
//   public static void findSubsets(String str, int i, String ans) { // find subsets problem
//     // base case
//     if (i == str.length()) {
//       if (ans.length() == 0) {
//         System.out.println("null");
//       } else {
//         System.out.println(ans);
//       }
//       return;
//     }
//     // for yes choice
//     findSubsets(str, i + 1, ans + str.charAt(i));
//     // for no choice
//     findSubsets(str, i + 1, ans);

//   }

//   public static void main(String args[]) {
//     String str = "abc"; // 128
//     findSubsets(str, 0, "");

//   }

// }




// public class Backtracking {
//   public static void findPermutation(String str, String ans) { // find permutation problem
//     // base case
//     if (str.length() == 0) {
//       System.out.println(ans);
//       return;
//     }
//     // recursion call
//     for (int i = 0; i < str.length(); i++) {
//       char curr = str.charAt(i);
//       String newstr = str.substring(0, i) + str.substring(i + 1); // to eliminate choosen character
//       findPermutation(newstr, ans + curr);
//     }

//   }

//   public static void main(String args[]) {
//     String str = "abc"; // 129
//     findPermutation(str, "");

//   }

// }





// // N-Queens problem**
// public class Backtracking {

//   public static boolean isSafe(char board[][], int row, int col) { // nQueens problem-all ways
//     // vertical up
//     for (int i = row - 1; i >= 0; i--) { // 130
//       if (board[i][col] == 'Q') {
//         return false;
//       }
//     }

//     // diagonal left up
//     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }

//     // diagonal right up
//     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }
//     return true;

//   }

//   public static void nQueens(char board[][], int row) {
//     // base
//     if (row == board.length) {
//       printBoard(board);
//     }
//     // column loop
//     for (int j = 0; j < board.length; j++) {
//       if (isSafe(board, row, j)) {
//         board[row][j] = 'Q';

//         nQueens(board, row + 1); // recursion function call
//         board[row][j] = 'X'; // backtracking step

//       }
//     }

//   }

//   public static void printBoard(char board[][]) {
//     System.out.println("-----chess board-----");
//     for (int i = 0; i < board.length; i++) {
//       for (int j = 0; j < board.length; j++) {
//         System.out.print(board[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   public static void main(String args[]) {
//     int n = 4;
//     char board[][] = new char[n][n];
//     // initialize
//     for (int i = 0; i < n; i++) {
//       for (int j = 0; j < n; j++) {
//         board[i][j] = 'X';
//       }
//     }
//     nQueens(board, 0);

//   }

// }




// // N-Queens problem**
// public class Backtracking {

//   public static boolean isSafe(char board[][], int row, int col) { // nQueens problem-count ways
//     // vertical up
//     for (int i = row - 1; i >= 0; i--) { // 130
//       if (board[i][col] == 'Q') {
//         return false;
//       }
//     }

//     // diagonal left up
//     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }

//     // diagonal right up
//     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }
//     return true;

//   }

//   public static void nQueens(char board[][], int row) {
//     // base
//     if (row == board.length) {
//       count++;
//       return;
//     }
//     // column loop
//     for (int j = 0; j < board.length; j++) {
//       if (isSafe(board, row, j)) {
//         board[row][j] = 'Q';

//         nQueens(board, row + 1); // function call
//         board[row][j] = 'X'; // backtracking step

//       }
//     }

//   }

//   // public static void printBoard(char board[][]) {
//   //   System.out.println("-----chess board-----");
//   //   for (int i = 0; i < board.length; i++) {
//   //     for (int j = 0; j < board.length; j++) {
//   //       System.out.print(board[i][j] + " ");
//   //     }
//   //     System.out.println();
//   //   }
//   // }

//   static int count = 0;

//   public static void main(String args[]) {
//     int n = 5;
//     char board[][] = new char[n][n];
//     // initialize
//     for (int i = 0; i < n; i++) {
//       for (int j = 0; j < n; j++) {
//         board[i][j] = 'X';
//       }
//     }
//     nQueens(board, 0);
//     System.out.println("Total ways to solve nQueens problem= " + count);
//   }

// }



   



// // N-Queens problem**
// public class Backtracking {

//   public static boolean isSafe(char board[][], int row, int col) { // nQueens problem-one solution
//     // vertical up
//     for (int i = row - 1; i >= 0; i--) { // 130
//       if (board[i][col] == 'Q') {
//         return false;
//       }
//     }

//     // diagonal left up
//     for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }

//     // diagonal right up
//     for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//       if (board[i][j] == 'Q') {
//         return false;
//       }
//     }
//     return true;

//   }

//   public static boolean nQueens(char board[][], int row) {
//     // base
//     if (row == board.length) {
//       count++;
//       return true;
//     }
//     // column loop
//     for (int j = 0; j < board.length; j++) {
//       if (isSafe(board, row, j)) {
//         board[row][j] = 'Q';

//         if (nQueens(board, row + 1)) { // function call
//           return true;
//         }
//         board[row][j] = 'X'; // backtracking step

//       }
//     }
//     return false;
//   }

//   public static void printBoard(char board[][]) {
//     System.out.println("-----chess board-----");
//     for (int i = 0; i < board.length; i++) {
//       for (int j = 0; j < board.length; j++) {
//         System.out.print(board[i][j] + " ");
//       }
//       System.out.println();
//     }
//   }

//   static int count = 0;

//   public static void main(String args[]) {
//     int n = 4;
//     char board[][] = new char[n][n];
//     // initialize
//     for (int i = 0; i < n; i++) {
//       for (int j = 0; j < n; j++) {
//         board[i][j] = 'X';
//       }
//     }
//     if (nQueens(board, 0)) {
//       System.out.println("Solution is possible");
//       printBoard(board);
//     } else {
//       System.out.println("Solution is not possible");
//     }
//   }

// }




// // Grid way problem
// public class Backtracking {
//   public static int gridWays(int i, int j, int row, int col) {
//     if (i == row - 1 && j == col - 1) { // codn for last cell
//       return 1;
//     } else if (i == row || j == col) { // boundary cross codn
//       return 0;
//     }

//     int w1 = gridWays(i, j + 1, row, col); // for right turn
//     int w2 = gridWays(i + 1, j, row, col); // for down turn

//     return w1 + w2;
//   }

//   public static void main(String args[]) { // 131
//     int row = 3, col = 3;
//     System.out.println(gridWays(0, 0, row, col));
//   }
// }



// // Grid way problem(optimized)

// public class Backtracking {

//   public static int fact(int n) { // using factorial equation directly // ((n-1+m-1)!) / ((n-1)! * (m-1)!)
//     if (n == 0) {
//       return 1; // incomplete code
//     }

//   }


//  public static int gridWays(int n, int m) {
//    int i = 0, j = 0;
//    if (i == n - 1 && j == m - 1) { // codn for last cell
//      return 1;
//    } else if (i == n || j == m) { // boundary cross codn
//      return 0;
//    }
//    fact(n);

//  }

// public static void main(String args[]) { // 131
//   int n = 3, m = 3;
//   System.out.println(gridWays(n, m));
// }

// }





// Sudoku solver
public class Backtracking {

  public static boolean isSafe(int sudoku[][], int row, int col, int digit) { // 132
    // column
    for (int i = 0; i <= 8; i++) {
      if (sudoku[i][col] == digit) {
        return false;
      }
    }

    // row
    for (int j = 0; j <= 8; j++) {
      if (sudoku[row][j] == digit) {
        return false;
      }
    }

    // grid
    int sr = (row / 3) * 3;
    int sc = (col / 3) * 3;
    // 3*3 grid
    for (int i = sr; i < sr + 3; i++) {
      for (int j = sc; j < sc + 3; j++) {
        if (sudoku[i][col] == digit) {
          return false;
        }
      }
    }
    
    return true;
  }

  public static boolean sudokuSolver(int sudoku[][], int row, int col) {
    // basecase
    if (row == 9) {     // or col == 9
      return true;
    }

    // Recursion
    int nextRow = row, nextCol = col + 1; // or int nextCol = col, nextRow = row+1
    if (col + 1 == 9) { // or row + 1 == 9
      nextRow = row + 1; // or nextCol = col + 1
      nextCol = 0; // or nextRow = 0
    }

    if (sudoku[row][col] != 0) {
      return sudokuSolver(sudoku, nextRow, nextCol);
    }

    for (int digit = 1; digit <= 9; digit++) {
      if (isSafe(sudoku, row, col, digit)) {
        sudoku[row][col] = digit;

        if (sudokuSolver(sudoku, nextRow, nextCol)) { // soln exists
          return true;
        }
        sudoku[row][col] = 0;
      }

    }
    return false;

  }

  public static void printSudoku(int sudoku[][]) {
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        System.out.print(sudoku[i][j] + "  ");
      }
      System.out.println();
    }
  }

  public static void main(String args[]) {
    int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
        { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
        { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
        { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
        { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
        { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
        { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
        { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
        { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

    if(sudokuSolver(sudoku, 0, 0)) {
      System.out.println("Solution exists");
      printSudoku(sudoku);
    } else {
      System.out.println("Solution doesn't exists");
    }

  }

}






