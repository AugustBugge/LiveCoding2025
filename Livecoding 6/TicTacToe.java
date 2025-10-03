import java.util.*;

public class TicTacToe {
    char[][] board = new char[3][3];
    Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        TicTacTest t = new TicTacTest();
        t.fillBoard();
        t.gameplayLoop();
    }
    
    public void gameplayLoop() {
        
    }
    
    public void fillBoard() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                board[x][y] = ' ';
            }
        }
    }
    
    public void printBoard() {
        System.out.println(" " + board[0][0] + "|" + board[0][1] + "|"  + board[0][2]);
        System.out.println(" -+-+-");
        System.out.println(" " + board[1][0] + "|" + board[1][1] + "|"  + board[1][2]);
        System.out.println(" -+-+-");
        System.out.println(" " + board[2][0] + "|" + board[2][1] + "|"  + board[2][2]);
    }
    
    public boolean didWin() {
        if ((board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) 
         || (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2])
         || (board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2])
         || (board[0][0] != ' ' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) 
         || (board[0][1] != ' ' && board[0][1] == board[1][1] && board[1][1] == board[2][1])
         || (board[0][2] != ' ' && board[0][2] == board[1][2] && board[1][2] == board[2][2])
         || (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
         || (board[2][0] != ' ' && board[2][0] == board[1][1] && board[1][1] == board[0][2])) {
            return true;
        }
        return false;
    }
}
