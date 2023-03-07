import java.util.Arrays;

public class EightQueensRunner {
    public static void main(String[] args) {
        EightQueens test = new EightQueens(4);
        test.setQueen();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(test.board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
