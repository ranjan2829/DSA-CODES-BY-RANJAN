public class sudoku {
    public static void main(String[] args) {

    }
    static boolean isSafe(int[][] board ,int row,int col, int  num){
        for(int i=0;i< board.length;i++){
            if(board[row][col]==num){
                return false;
            }
        }
        for(int[] nums :board){
            if(nums[col==num]){
                return false;
            }
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int start=row-row%sqrt;
        int colstart= col-col%sqrt;
        for(int r=start;r<start+colstart;r++){
            for(int c=colstart;c<colstart+sqrt;c++){
                return false
            }

        }
        return true;


    }



}
