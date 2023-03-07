public class EightQueens {
    private int queenCount;
    public String[][] board;
    public int startingColumn;


    public EightQueens (int d){
        queenCount = d;
        board = new String[d][d];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                board[r][c] = "";
            }
        }
        startingColumn = 0;
    }

    public void calculate(){

    }

    public boolean checkSpot(int r, int c){
        if (board[r][c].equalsIgnoreCase("X") || board[r][c].equalsIgnoreCase("O")){
            return false;
        }
        return true;
    }
    public void setQueen(){
        for (int r = 0; r < queenCount; r++) {
            for (int c = 0; c < queenCount; c++) {
                if (checkSpot(r, c)){
                    board[r][c] = "O";
                    setRow(r);
                    setColumn(c);
                    setDiagonal(r,c);
                }
            }
        }
    }


    public void setRow(int r){
        for (int c = 0; c < board[r].length; c++) {
            if (checkSpot(r,c)){
                board[r][c] = "X";
            }
        }
    }
    public void setColumn(int c){
        for (int r = 0; r < board.length; r++) {
            if (checkSpot(r,c)){
                board[r][c] = "X";
            }
        }
    }
    public void setDiagonal(int r, int c){
        for (int ul = r; ul >= 0 ; ul--) {
            if (checkSpot(r-ul,c-ul)){
                board[r][c] = "X";
                System.out.println("upleft");
            }
        }
        for (int i = r; i >= 0 ; i--) {
            for (int j = c; j < board[0].length; j++) {
                if (checkSpot(i,j)){
                    board[r][c] = "X";
                    System.out.println("upright");
                }
            }
        }
        for (int i = r; i < board.length; i++) {
            for (int j = c; j < board[0].length; j++) {
                if (checkSpot(i,j)){
                    board[r][c] = "X";
                    System.out.println("downright");
                }
            }
        }
        for (int i = r; i < board.length; i++) {
            for (int j = c; j >= 0; j--) {
                if (checkSpot(i,j)){
                    board[r][c] = "X";
                    System.out.println("downleft");
                }
            }
        }
    }
}
