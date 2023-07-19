public class NQueens {
    public static void main(String[] args) {

    }
    static int queens(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            return 1;
        }
        int count=0;
        for(int col=0;col< board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;

            }
        }
    }
    private static boolean isSafe(boolean[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        int maxleft=Math.min(row,col);
        for(int i=1;i<maxleft;i++){
            if(board[row-1][col-1]){
                return false;
            }

        }

    }
    private static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element : row){
                if(element){
                    System.out.println("Q");
                }
                else {


                    System.out.println("X");
                }
            }
            System.out.println();
        }
    }

}
