public class N_Knights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println("Number of ways: " + knights(board, 0, 0, n));
    }
    private static int knights(boolean[][] board, int row, int col, int knights){
        if(knights == 0){
            display(board);
            System.out.println();
            return 1;
        }
        if(row == board.length) return 0;
        int count = 0;
        if(col == board.length){
            count += knights(board, row + 1, 0, knights);
            return count;
        }
        if(isSafe(board, row, col)){
            board[row][col] = true;
            count += knights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        count += knights(board, row, col + 1, knights);
        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col){
        if(isValid(board, row, col)){
            if(board[row][col]) return false;
        }
        if(isValid(board, row - 1, col - 2)){
            if(board[row - 1][col - 2]) return false;
        }
        if(isValid(board, row - 2, col + 1)){
            if(board[row - 2][col + 1]) return false;
        }
        if(isValid(board, row - 1, col + 2)){
            if(board[row - 1][col + 2]) return false;
        }
        if(isValid(board,row - 2 , col + 1)){
            if(board[row - 2][col + 1]) return false;
        }
        return true;
    }
    private static boolean isValid(boolean[][] board, int row, int col){
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }
    private static void display(boolean[][] board){
        for(boolean[] list : board){
            for(boolean value : list){
                System.out.print(value ? "K " : "X ");
            }
            System.out.println();
        }
    }
}
