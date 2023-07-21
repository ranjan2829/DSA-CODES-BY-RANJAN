public class sudoku {
    public static void main(String[] args) {

    }
    static boolean solve(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyleft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyleft=false;
                    break;
                }

            }
            if(emptyleft==false){
                break;

            }
        }
        if(emptyleft==true){
            return true;
            //solved
        }
        for(int number=1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col]=number;
            }
            if(solve(board)){
                return true;
            }
            else{
                board[row][col]=0;
            }
        }
        return false;
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
