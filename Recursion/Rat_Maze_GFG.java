import java.util.*;
public class Rat_Maze_GFG {
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> l = new ArrayList<>();
        if(m[0][0] == 0){
            return l;
        }
        int[][] check = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                check[i][j] = 0;
            }
        }
        int[] dirrow = {1, 0, 0, -1};
        int[] dircol = {0, -1, 1, 0};
        // helper(l, m, "", 0, 0, check);
        helper(l, m, "", 0, 0, check, dirrow, dircol);
        return l;
    }

    // Using single for loop
    public static void helper(ArrayList<String> l, int[][] arr, String s, int row, int col, int[][] check, int[] dirrow, int[] dircol){
        if(row == arr.length - 1 && col == arr.length - 1){
            l.add(s);
            return;
        }
        String direction = "DLRU";
        for(int i = 0; i < 4; i++){
            int newRow = row + dirrow[i];
            int newCol = col + dircol[i];
            if(newRow < arr.length && newCol < arr.length && newRow >= 0 && newCol >= 0 && check[newRow][newCol] == 0 && arr[newRow][newCol] == 1){
                check[row][col] = 1;
                helper(l, arr, s + direction.charAt(i), newRow, newCol, check, dirrow, dircol);
                check[row][col] = 0;
            }
            
        }
        
    }

    // Using multiple if conditions
    // public static void helper(ArrayList<String> l, int[][] arr, String s, int row, int col, int[][] check){
    //     if(row == arr.length - 1 && col == arr.length - 1){
    //         l.add(s);
    //         return;
    //     }
    //     //Down
    //     if(row + 1 < arr.length && check[row+1][col] == 0 && arr[row+1][col] == 1){
    //         check[row][col] = 1;
    //         helper(l, arr, s + "D", row + 1, col, check);
    //         check[row][col] = 0;
    //     }
    //     // Left
    //     if(col - 1 >= 0 && check[row][col-1] == 0 && arr[row][col-1] == 1){
    //         check[row][col] = 1;
    //         helper(l, arr, s + "L", row, col-1, check);
    //         check[row][col] = 0;
    //     }
    //     // Right
    //     if(col + 1 < arr.length && check[row][col+1] == 0 && arr[row][col+1] == 1){
    //         check[row][col] = 1;
    //         helper(l, arr, s + "R", row, col+1, check);
    //         check[row][col] = 0;
    //     }
    //     //Up
    //     if(row - 1 >= 0 && check[row-1][col] == 0 && arr[row-1][col] == 1){
    //         check[row][col] = 1;
    //         helper(l, arr, s + "U", row - 1, col, check);
    //         check[row][col] = 0;
    //     }
        
    // }
    public static void main(String[] args) {
        int[][] a =  {{1, 0, 0, 0},{1, 1, 0, 1},{1, 1, 0, 0},{0, 1, 1, 1}};
        int n = 4;
        ArrayList<String> res = findPath(a, n);
        if (res.size() > 0) {
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        } else {
            System.out.println(-1);
        }
    }
}