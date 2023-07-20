public class Nknights {
    public static void main(String[] args) {

    }
    static void knights(boolean[][] board,int row,int col, int knights){
        if(knights==0){
            display(board);
        }
        if(row==board.length-1 && col== board.length){
            return;
        }
        if(col== board.length){
            knights(board,row+1,0,knights);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col]=true;
            knights(board,row,col+1,knights-);
            board[row][col]=false;

        }
        knights(board,row,col+1,knights);
    }
    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    private static boolean isSafe(boolean[][] board,int row,int col){

    }
}
